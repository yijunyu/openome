package service;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import parser.GoalModelReader;
import edu.toronto.cs.openome_model.*;

public class QueryVariability implements IConfigurator {

	public openome_modelPackage e = null;
	public openome_modelFactory f = null;
	public Resource resource;

	public QueryVariability() {
		e = openome_modelPackage.eINSTANCE;
		f = e.getopenome_modelFactory();		
	}
	public QueryVariability(Resource r) {		
		e = openome_modelPackage.eINSTANCE;
		f = e.getopenome_modelFactory();
		setModel(r);		
	}
	private void setModel(Resource r) {
		resource = r;
	}
	Vector<Intention> FS_goals = new Vector<Intention>();
	Vector<Intention> FD_goals = new Vector<Intention>();
	Vector<Intention> PS_goals = new Vector<Intention>();
	Vector<Intention> PD_goals = new Vector<Intention>();
	Vector<Intention> CF_goals = new Vector<Intention>();
	Vector<Intention> UN_goals = new Vector<Intention>();
	Vector<Intention> VAR_goals = new Vector<Intention>();
	Hashtable<Intention, HashSet<Intention>> configurations 
		= new Hashtable<Intention, HashSet<Intention> >();  
	
	int numClauses = 0;
	Hashtable<Intention, Integer> goal_ids = new Hashtable<Intention, Integer>();
	Vector<Intention> Intentions = new Vector<Intention>();

	private void collect_goals() {
		for (Iterator i = resource.getResourceSet().getAllContents();
	       i.hasNext(); ) {
	    	Object o = i.next();
	    	if (o instanceof Intention) {
	    		Intention p = (Intention) o;
	    		collect_goals(p);
	    	} else if (o instanceof Container) {
	    		Container a = (Container) o;
    			EList l = a.getIntentions();
	    		for (int j =0; j < l.size(); j++) {
	    			Intention root = (Intention) l.get(j);
	    			collect_goals(root);
	    		}	    		
	    	}	    	
		}
	}

	public void init() {
		Intentions = new Vector<Intention>();
		goal_ids = new Hashtable<Intention, Integer>();
		FS_goals = new Vector<Intention>();
		FD_goals = new Vector<Intention>();
		PS_goals = new Vector<Intention>();
		PD_goals = new Vector<Intention>();
		CF_goals = new Vector<Intention>();
		UN_goals = new Vector<Intention>();
		collect_goals();
		configuring_variability_goals();
	}
	
//	private void report() {
//		for (Enumeration<Intention> e = configurations.keys(); e.hasMoreElements(); )
//		{
//			Intention g = e.nextElement();
//			HashSet<Intention> config = configurations.get(g);
//			if (config.size()>0) {
//				System.out.println(g.getName() + ":");
//				for (Intention c: config) {
//					System.out.print(" " + c.getName());
//				}
//				System.out.println();
//			}
//		}
//	}

	private void configuring_variability_goals() {
		VAR_goals = new Vector<Intention>();
		configurations = new Hashtable<Intention, HashSet<Intention> >();  
		for (Intention g: Intentions) {
			if (is_or(g) && !is_runtime_or(g)) {
				VAR_goals.add(g);
				EList subgoals = g.getDecompositions();
				HashSet<Intention> config = new HashSet<Intention>();
				for (int i=0; i<subgoals.size(); i++) {
					Intention s = ((Decomposition) subgoals.get(i)).getTarget();
					if (FS_goals.contains(s)
						|| PS_goals.contains(s)) {
						config.add(s);
					}
				}
				configurations.put(g, config);
			}
		}
	}
	
	private void collect_goals(Intention root) {
		add_a_goal(root); 
		EList subgoals = root.getDecompositions();
		for (int j=0; j < subgoals.size(); j++) {
			Intention s = ((Decomposition) subgoals.get(j)).getTarget();
			collect_goals(s);
		}
	}

	private void add_a_goal(Intention root) {
		goal_ids.put(root, Intentions.size());
		Intentions.add(root);
		if (root.getLabel() instanceof SatisfiedLabel ) {
			FS_goals.add(root);
		} else if (root.getLabel() instanceof DeniedLabel) {
			FD_goals.add(root);
		} else if (root.getLabel() instanceof PartiallySatisfiedLabel) {
			PS_goals.add(root);
		} else if (root.getLabel() instanceof PartiallyDeniedLabel) {
			PD_goals.add(root);
		} else if (root.getLabel() instanceof ConflictLabel) {
			CF_goals.add(root);
		} else {
			UN_goals.add(root);
		}
	}
	private boolean is_or(Intention to) {
		return to instanceof OrDecomposition;
	}
	private boolean is_runtime_or(Intention to) {
		if (!is_or(to)) return false;
		if (System.getProperty("ome.reasoning.topdown.runtime_or")==null)
			return false;
		boolean isRuntimeOR = true;
		EList list = to.getDecompositions();
		for (int j = 0; j < list.size(); j++) {
			Intention from = ((Decomposition) list.get(j)).getTarget();
			EList contributions = from.getRule();
			if (contributions.size() > 0) {
				isRuntimeOR = false;
				break;
			}
		}
		return isRuntimeOR;
	}
	public static void main(String[] args) {
		QueryVariability q = new QueryVariability();
		q.setModel("test/componenx_istar.sat.openome_model");
//		q.report();
		System.out.println(q.query("Apply Process To Customer"));
	}
	/**
	 * 
	 * @param name -- the name of an OR-Intention
	 * @return -- the alternative subgoal selected to fulfil the OR-Intention
	 */
	public String query(String name) {
		return answer(name);
	}
	public void setModel(String name) {
		GoalModelReader rdr = new GoalModelReader();
		Resource r = rdr.read(name);
		setModel(r);
		init();
	}

	private String answer(String name) {
		for (Enumeration<Intention> e = configurations.keys(); e.hasMoreElements(); )
		{
			Intention g = e.nextElement();
			if (!g.getName().equalsIgnoreCase(name))
				continue;
			HashSet<Intention> config = configurations.get(g);
			if (config.size()>0) {
				for (Intention c: config) {
					return c.getName();
				}
			}
		}
		return "not found";
	}
}
