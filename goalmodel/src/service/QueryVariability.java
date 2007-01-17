package service;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import parser.GoalModelReader;
import service.IConfigurator;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.LabelType;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.goal;

public class QueryVariability implements IConfigurator {

	public GoalmodelPackage e = null;
	public GoalmodelFactory f = null;
	public Resource resource;

	public QueryVariability() {
		e = GoalmodelPackage.eINSTANCE;
		f = e.getGoalmodelFactory();		
	}
	public QueryVariability(Resource r) {		
		e = GoalmodelPackage.eINSTANCE;
		f = e.getGoalmodelFactory();
		setModel(r);		
	}
	private void setModel(Resource r) {
		resource = r;
	}
	Vector<goal> FS_goals = new Vector<goal>();
	Vector<goal> FD_goals = new Vector<goal>();
	Vector<goal> PS_goals = new Vector<goal>();
	Vector<goal> PD_goals = new Vector<goal>();
	Vector<goal> CF_goals = new Vector<goal>();
	Vector<goal> UN_goals = new Vector<goal>();
	Vector<goal> VAR_goals = new Vector<goal>();
	Hashtable<goal, HashSet<goal>> configurations 
		= new Hashtable<goal, HashSet<goal> >();  
	
	int numClauses = 0;
	Hashtable<goal, Integer> goal_ids = new Hashtable<goal, Integer>();
	Vector<goal> goals = new Vector<goal>();

	private void collect_goals() {
		for (Iterator i = resource.getResourceSet().getAllContents();
	       i.hasNext(); ) {
	    	Object o = i.next();
	    	if (o instanceof goal) {
	    		goal p = (goal) o;
	    		collect_goals(p);
	    	} else if (o instanceof actor) {
	    		actor a = (actor) o;
    			EList l = a.getGoals();
	    		for (int j =0; j < l.size(); j++) {
	    			goal root = (goal) l.get(j);
	    			collect_goals(root);
	    		}	    		
	    	}	    	
		}
	}

	private void init() {
		goals = new Vector<goal>();
		goal_ids = new Hashtable<goal, Integer>();
		FS_goals = new Vector<goal>();
		FD_goals = new Vector<goal>();
		PS_goals = new Vector<goal>();
		PD_goals = new Vector<goal>();
		CF_goals = new Vector<goal>();
		UN_goals = new Vector<goal>();
		collect_goals();
		configuring_variability_goals();
	}
	
	private void report() {
		for (Enumeration<goal> e = configurations.keys(); e.hasMoreElements(); )
		{
			goal g = e.nextElement();
			HashSet<goal> config = configurations.get(g);
			if (config.size()>0) {
				System.out.println(g.getName() + ":");
				for (goal c: config) {
					System.out.print(" " + c.getName());
				}
				System.out.println();
			}
		}
	}

	private void configuring_variability_goals() {
		VAR_goals = new Vector<goal>();
		configurations = new Hashtable<goal, HashSet<goal> >();  
		for (goal g: goals) {
			if (is_or(g) && !is_runtime_or(g)) {
				VAR_goals.add(g);
				EList subgoals = g.getGoal();
				HashSet<goal> config = new HashSet<goal>();
				for (int i=0; i<subgoals.size(); i++) {
					goal s = (goal) subgoals.get(i);
					if (FS_goals.contains(s)
						|| PS_goals.contains(s)) {
						config.add(s);
					}
				}
				configurations.put(g, config);
			}
		}
	}
	
	private void collect_goals(goal root) {
		add_a_goal(root); 
		EList subgoals = root.getGoal();
		for (int j=0; j < subgoals.size(); j++) {
			goal s = (goal) subgoals.get(j);
			collect_goals(s);
		}
	}

	private void add_a_goal(goal root) {
		goal_ids.put(root, goals.size());
		goals.add(root);
		if (root.getLabel() == LabelType.SATISFIED_LITERAL) {
			FS_goals.add(root);
		} else if (root.getLabel() == LabelType.DENIED_LITERAL) {
			FD_goals.add(root);
		} else if (root.getLabel() == LabelType.PARTIALLY_SATISFIED_LITERAL) {
			PS_goals.add(root);
		} else if (root.getLabel() == LabelType.PARTIALLY_DENIED_LITERAL) {
			PD_goals.add(root);
		} else if (root.getLabel() == LabelType.CONFLICT_LITERAL) {
			CF_goals.add(root);
		} else {
			UN_goals.add(root);
		}
	}
	private boolean is_or(goal to) {
		return to.getType() == DecompositionType.OR_LITERAL;
	}
	private boolean is_runtime_or(goal to) {
		if (to.getType() != DecompositionType.OR_LITERAL) return false;
		if (System.getProperty("ome.reasoning.topdown.runtime_or")==null)
			return false;
		boolean isRuntimeOR = true;
		EList list = to.getGoal();
		for (int j = 0; j < list.size(); j++) {
			goal from = (goal) list.get(j);
			EList contributions = from.getRule();
			if (contributions.size() > 0) {
				isRuntimeOR = false;
				break;
			}
		}
		return isRuntimeOR;
	}
	private static void main(String[] args) {
		QueryVariability q = new QueryVariability();
		System.out.println(
			q.query("test/componenx_istar.sat.goalmodel", 
			    	"Apply Process To Customer"));
	}
	/**
	 * @param model -- the name of the goal model
	 *    Because the web service is stateless, it is necessary to have the name of the web service
	 *    each time when it is invoked.
	 * @param name -- the name of an OR-goal
	 * @return -- the alternative subgoal selected to fulfil the OR-goal
	 */
	public String query(String model, String name) {
		setModel(model);
		return answer(name);
	}
	private void setModel(String name) {
		GoalModelReader rdr = new GoalModelReader();
		Resource r = rdr.read(name);
		setModel(r);
		init();
		report();
		System.out.println("--------------");
	}

	private String answer(String name) {
		for (Enumeration<goal> e = configurations.keys(); e.hasMoreElements(); )
		{
			goal g = e.nextElement();
			if (!g.getName().equalsIgnoreCase(name))
				continue;
			HashSet<goal> config = configurations.get(g);
			if (config.size()>0) {
				for (goal c: config) {
					return c.getName();
				}
			}
		}
//		return "not found";
		return "size=" + configurations.size();
	}
}
