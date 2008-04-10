/*
 * Created on Jan 27, 2005
 * To generate i* diagram from the parsed Q7 input
 * 
 * TODO use When information to generate the "claim" softgoal 
 */
package codegen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

import model.Advice;
import model.Effect;
import model.Entity;
import model.IStarElement;
import model.IStarLink;
import model.Pointcut;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.*;

import util.Computing;
import util.SortArrayList;
/**
 * @author Yijun Yu
 */
public class GoalModel extends IStar {
	Hashtable<String, IStarElement> agents = null;
	private String serialized_view = "";

	openome_modelPackage e = openome_modelPackage.eINSTANCE;
	openome_modelFactory f = e.getopenome_modelFactory();
	Resource resource;
	Model m;
	IStarElement thegoal = null;
	int cnt = 0;
	String [] types = {"Do", "May", "Agent", "Role", "Position", "Actor", "Aspect"};
//	boolean NEED_EXPAND = Computing.propertyHolds("q7.codegen.expand_actors");
	boolean NEED_EXPAND = true;
	
	
	/**
	 * @param a -- advices
	 */
	public GoalModel(ArrayList<Advice> a) {
		super(a);
		agents = new Hashtable<String, IStarElement>(); // name -> IStarElement
	}

	protected void preprocessAllInheritance(Advice parent, Advice a) {
		if (a == null) return;		
		preprocess_abbreviations(parent, a);
		if (a.how!=null && a.how.advices!=null)
		for (Iterator i = a.how.advices.iterator(); i.hasNext();) {
			Advice ad = (Advice) i.next();
			preprocessAllInheritance(a, ad);
		}		
    }
	/**
	 * Recursively generating the subgoals
	 * @param a:
	 *            Advice
	 */
	protected void generateGoalModel(Advice parent, Advice a) {
		if (a == null)
			return;
		generateWhen(a);
		generateWho(a);
		IStarElement g = (IStarElement) generateWhy(parent, a);
		generateWhere(g, parent, a);
		generateHow(a);
		generateHowmuch(g, a);
	}
	/**
	 * Recursively generating the subgoals
	 * 
	 * @param a:
	 *            Advice
	 */
	protected void generateGoalModelForElements(Advice parent, Advice a) {
		if (a == null)
			return;
		generateWhoForElement(a);
		IStarElement g = (IStarElement) generateWhyForElement(parent, a);
		generateWhenForElement(g, a);
		generateWhereForElement(a);
		generateHowForElement(a);
		generateHowmuchForElement(g, a);
	}
	

	/**
	 * @param a
	 */
	private void generateHowmuchForElement(IStarElement g, Advice a) {
		if (a.how_much == null || a.how_much.size()<= 0) return;
		for (int i = 0; i < a.how_much.size(); i++) {
			Effect e = (Effect) a.how_much.get(i);
			if (e.e.alias!=null)
				e.e.why = (String) Entity.aliases.get(e.e.alias);
			String op = e.op;
			boolean isAspect = (e.e.who==null);
			IStarElement agent = create_agent_for_new_who(a, e);
			IStarElement g1 = add_goal(e.e.who, 
					e.e.why == null? a.e.why: e.e.why, 
							e.e.why==null? a.e.what : e.e.what);
			if (!op.equals("~")) {
				g1.setSoftGoal();
			}
			if (agent!=null) {
				agent.isAspect = isAspect;
				g1.parent = agent;
				agent.children.add(g1);
			}
			if (g.parent!=g1.parent 
					&& (g.parent!=null && g.parent.isAspect 
					|| g1.parent!=null && g1.parent.isAspect)) {
			} else if (g.parent!=null && g.parent!=g1.parent) {
				IStarElement g2 = add_goal("", e.e.why ==null? a.e.why: e.e.why, e.e.why==null? a.e.what : e.e.what);
				g2.parent = null;
				g2.isSoftGoal = g1.isSoftGoal;
				if (!op.equals("~")) { 
					IStarElement g3 = add_goal(Computing.strip_type_prefixes(types, g.parent.name), e.e.why, e.e.what);
					g3.parent = g.parent;
					g3.parent.children.add(g3);
					g3.isSoftGoal = g1.isSoftGoal;
				}
			}
		}
	}

	/**
	 * @param who, why, what
	 * @return
	 */
	private IStarElement add_goal(String who, String why, String what) {
		String rest = Computing.unique_goal_name(who, why, what);
		Advice ad = goals.get(rest);
		if (ad == null) {
			ad = new Advice("", who, why, what, null, null, null, null, null, null);
			int m = elements.size();
			ad.setID(m);
			IStarElement g1 = new IStarElement(m, rest, "");
			elements.put(ad, g1);
			g1.isAgent = false;
			goals.put(rest, ad);
			serialize_the_token(m, false, false);
			return g1;
		} else {
			return elements.get(ad);
		}
	}

	/**
	 * @param a
	 */
	private void generateHowForElement(Advice a) {
		if (a.how != null) {
			for (Iterator i = a.how.advices.iterator(); i.hasNext();) {
				Advice ad = (Advice) i.next();
				generateGoalModelForElements(a, ad);
			}
		}
	}

	/**
	 * @param a
	 */
	private void generateWhereForElement(Advice a) {
	}

	public IStarElement create_agent_for_new_who(Advice parent, Effect e) {
		IStarElement agent = null;
		if (e.e.who!=null && e.e.who.indexOf("Aspect ")>=0)
			e.e.who = null;
		if (e.e.who!=null && 
			(parent==null || parent.e.who==null || 
				!e.e.who.equalsIgnoreCase(parent.e.who))) {
			agent = add_agent(e.e.who);
		}				
		return agent;
	}	/**
	 * Create an agent for any new context. If the context is the same as its parent,
	 * then the routine has a side effect: update a.who with parents' who if a.who = null
	 */
	public IStarElement create_agent_for_new_who_inherit(Advice parent, Advice a) {
		IStarElement agent = null;
		if (parent!=null && parent.e.who!=null 
				&& (a.e.who == null 
				|| parent.e.who.equalsIgnoreCase(a.e.who))) 
			// inheriting the context
		{
			String pcontext = agent_context(parent.e.who);
			a.e.who = parent.e.who;
			agent = agents.get(pcontext);
		} else if (a.e.who!=null && (parent==null || parent.e.who==null || !a.e.who.equalsIgnoreCase(parent.e.who))) {
			agent = add_agent(a.e.who);
		}				
		return agent;
	}
	/**
	 * @param who
	 * @return
	 */
	private IStarElement add_agent(String who) {
		IStarElement agent = null;
		String context = agent_context(who);
		agent = agents.get(context);
		if (agent==null) {
			int id = elements.size();
			agent = new IStarElement(id, context, "");
			agent.isAgent = true;
			Advice x = new Advice(null, null, null, null, null, null, null, null, null, null); 
			elements.put(x, agent);
			agents.put(context, agent);
			serialize_the_token(id, false, true);
		}
		return agent;
	}

	/**
	 * @param parent
	 * @param a
	 */
	private Object generateWhyForElement(Advice parent, Advice a) {
		if (a.e.who!=null && a.e.who.indexOf("Aspect ")>=0)
			a.e.who = null;
		if (a.e.alias!=null)
			a.e.why = (String) Entity.aliases.get(a.e.alias);
		boolean is_new_who = 
			parent!=null && a!=null && a.e.who!=null && parent.e.who!=null && !parent.e.who.equalsIgnoreCase(a.e.who);
		IStarElement agent = create_agent_for_new_who_inherit(parent, a);
		IStarElement g = add_goal(a.e.who, a.e.why, a.e.what);
		if (a.label!=null)
			g.setLabel(a.label);
		if (agent!=null) {
			g.parent = agent;
			agent.children.add(g);
			if (a.e.who!=null && a.e.who.indexOf("Aspect ")>=0) 
				agent.isAspect = true;
		}
		if (parent!=null && is_new_who) {
			IStarElement pg = add_goal(parent.e.who, parent.e.why, parent.e.what);
			IStarElement g2 = add_goal("", a.e.why, a.e.what);
			g2.parent = null;
			IStarElement g3 = add_goal(pg.parent.name, a.e.why, a.e.what);
			g3.parent = pg.parent;
			g3.parent.children.add(g3);					
		}
		return g;
	}

	/**
	 * @param a
	 */
	private void generateWhoForElement(Advice a) {
	}

	/**
	 * @param a
	 */
	private void generateWhenForElement(IStarElement g, Advice a) {
		if (a.when!=null) {
			IStarElement g1 = add_goal(null, "Claim: " + a.when, null); // the claim
			add_link(g, g1, a.op);
		}
	}

	public void generateGoalModel(String out_file) {
		if (advices == null) {
			System.out.println("No model parsed?");
			return;
		}
		preprocess();		
		create_elements_and_links(out_file);		
		mark_prefixed_subgoals();
		mark_parent_goal_of_softgoal_as_softgoal();
		mark_subgoal_of_softgoal_as_softgoal();
		if (Computing.propertyHolds("q7.codegen.istar.create_aspects"))
			create_aspect();
		if (Computing.propertyHolds("q7.codegen.istar.marking_istar_tasks")) {
			mark_leaf_or_ANDdecomposed_goal_as_task();
			mark_subgoal_of_task_as_task();
		}
		if (Computing.propertyHolds("q7.codegen.istar.create_new_goal_with_same_name")) {
			duplicate_high_fan_in_goals();
		}
		if (Computing.propertyHolds("q7.codegen.creating_dependencies"))
			create_dependencies();
		output_to_xmi(out_file);	
	}

	@SuppressWarnings("unchecked")
	private void output_to_xmi(String out_file) {
		ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    		Resource.Factory.Registry.DEFAULT_EXTENSION, 
	    		new XMIResourceFactoryImpl());
	    URI uri = fetchURI(out_file);		
	    // Create a resource for this file.
	    resource = resourceSet.createResource(uri);
		HashMap<Integer, EObject> hm = new HashMap<Integer, EObject>();
		m = f.createModel();
		m.setName(out_file);
		create_actor_elements(hm);
		create_goal_elements(hm);
		create_relationships(hm);
		try {
			resource.getContents().add(m);
		    resource.save(Collections.EMPTY_MAP);
		    resource.unload();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *  Get the URI of the file.
	 */
	public static URI fetchURI(String name) {
		File file = new File(name);
		URI uri = file.isFile() ? 
				URI.createFileURI(file.getAbsolutePath()): 
				URI.createURI(name);
		return uri;
	}

	
	public void propagate_actor_elements(HashMap hm) {
		boolean change = true;
		do {
			change = false;
			for (Enumeration i = links.keys(); i.hasMoreElements();) {
				IStarLink s = links.get(i.nextElement());
				if (! s.op.startsWith("Dep")) {
					Intention x = (Intention) hm.get(new Integer(s.from.id));
					Intention y = (Intention) hm.get(new Integer(s.to.id));
					if (x!=null && y!=null) {
						Container ax = x.getContainer();
						Container ay = y.getContainer();
						if (ay != null /* && ax == null */) { 
							// force the Actor to be the same
							x.setContainer(ay);
							System.out.println("" + ax + ay);
							change = true;
						}
					}
				}
			}
		} while (change);
	}

	@SuppressWarnings("unchecked")
	private void create_relationships(HashMap<Integer, EObject> hm) {
		// sorting is necessary to maintain the ordering
		// of the subgoals, though it is much less efficient
		SortArrayList sorted_keys = new SortArrayList();
		Hashtable<Integer, IStarElement> table = new Hashtable<Integer, IStarElement>();  
		for (Enumeration<IStarElement> i = elements.elements(); i.hasMoreElements(); ) {
			IStarElement p = i.nextElement();
			sorted_keys.add(p.id);
			table.put(p.id, p);
		}
		for (int i=0; i<sorted_keys.size(); i++) {
			IStarElement g1 = table.get((Integer) sorted_keys.get(i));
//			System.err.println(g1.id + " " + g1.name);
			for (int j=0; j<sorted_keys.size(); j++) {
				IStarElement g2 = table.get((Integer) sorted_keys.get(j));
				for (Enumeration k = links.keys(); k.hasMoreElements();) {
					IStarLink s = links.get(k.nextElement());
					if (g1.id == s.from.id && g2.id == s.to.id) { 
						Intention x = (Intention) hm.get(new Integer(s.from.id));
						Intention y = (Intention) hm.get(new Integer(s.to.id));
						if (s.op.equals("And") || s.op.equals("Or")) {
							Decomposition d;
							if (s.op.equals("And")) {
								d = f.createAndDecomposition();
								d.setSource(x);
								d.setTarget(y);
							} else {
								d = f.createOrDecomposition();
								d.setSource(x);
								d.setTarget(y);
								if (s.from.feature!=null && s.from.feature.equals("|")) {
									x.setExclusive(Boolean.TRUE);
								} else /* default */ {
									x.setExclusive(Boolean.FALSE);
								}
							}
							if (s.from.control!=null && s.from.control.equals(";")) {
								x.setSequential(Boolean.TRUE);
							} else if (s.from.control!=null && s.from.control.equals("||")) {
								x.setParallel(Boolean.TRUE);
							} else /* default */ {
								x.setSequential(Boolean.FALSE);
							}
							m.getDecompositions().add(d);
						} else if (! s.op.startsWith("Dep")){
							Contribution c;
							if (s.op.equals("Help")) 
								c = f.createHelpContribution();
							else if (s.op.equals("Make")) 
								c = f.createMakeContribution();
							else if (s.op.equals("Hurt")) 
								c = f.createHurtContribution();
							else if (s.op.equals("Break")) 
								c = f.createBreakContribution();
							else
								c = f.createContribution();
							c.setSource(y);
							c.setTarget(x);
							m.getContributions().add(c);
						} else {
							Dependency c = f.createDependency();
							c.setDependencyFrom(x);
							c.setDependencyTo(y);
							m.getDependencies().add(c);
						}
					}
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void create_actor_elements(HashMap<Integer, EObject> hm) {
		for (Enumeration<Advice> i = elements.keys(); i.hasMoreElements();) {
			IStarElement g = elements.get(i.nextElement());
			if ((g.isAgent || g.isAspect) && g.name!=null && !g.name.equals("")) {
				Container x;
				if (g.name.startsWith("Agent ")) 
				{	
					x = f.createAgent();
					x.setName(g.name.substring(6));
				} else if (g.name.startsWith("Role ")) {					
					x = f.createRole();
					x.setName(g.name.substring(5));
				} else if (g.name.startsWith("Position ")) {					
					x = f.createPosition();
					x.setName(g.name.substring(9));
				} else if (g.name.startsWith("Aspect ")) {					
					x = f.createAspect();
					x.setName(g.name.substring(7));
				} else {
					x = f.createActor();
					x.setName(Computing.strip_quote(g.name));
				}
				hm.put(new Integer(g.id), x);
				m.getContainers().add(x);
			}
		}
	}
	@SuppressWarnings("unchecked")
	private void create_goal_elements(HashMap<Integer, EObject> hm) {
		SortArrayList sorted_keys = new SortArrayList();
		Hashtable<Integer, IStarElement> table = new Hashtable<Integer, IStarElement>();  
		for (Enumeration<IStarElement> i = elements.elements(); i.hasMoreElements(); ) {
			IStarElement p = i.nextElement();
			sorted_keys.add(p.id);
			table.put(p.id, p);
		}		
		for (int i=0; i<sorted_keys.size(); i++) {
			IStarElement g = table.get((Integer) sorted_keys.get(i));
			if (!g.isAgent && !g.isAspect && 
					g.name!=null && !g.name.equals("")) {
				Intention x = f.createIntention();
				if (g.isSoftGoal)
					x = f.createSoftgoal();
				else if (g.isTask)
					x = f.createTask();
				else if (g.isOperationalization)
					x = f.createTask();
				else
					x = f.createGoal();
				if (g.getFeature().equals("|")) {
					x.setExclusive(true); // exclusive OR
				} else {
					x.setExclusive(false); // inclusive OR
				}
				if (g.getFeature().equals("/")) { // optional
					x.setSystem(false);
				} else {
					x.setSystem(true);
				}
				if (g.getControl().equals(";")) {
					x.setSequential(true);
				} else {
					x.setSequential(false);
				}
				if (g.getControl().equals("||")) {
					x.setParallel(true);
				} else {
					x.setParallel(false);
				}
				// see computing.sdtolabel
				TruthLabel lbl = f.createUnknownLabel();
				if (g.label!=null && g.label.equals("FS")
						|| g.s == 1 && g.d == 0) {
					lbl = f.createSatisfiedLabel();
				} else if(g.label!=null && g.label.equals("FD")
						|| g.s == 0 && g.d == 1){
					lbl = f.createDeniedLabel();		    			
				} else if(g.label!=null && g.label.equals("PS")
						|| g.s > g.d){
					lbl = f.createPartiallySatisfiedLabel();  			
				} else if(g.label!=null && g.label.equals("PD")
						|| g.s < g.d){
					lbl = f.createPartiallyDeniedLabel();		    			
				} else if(g.label!=null && g.label.equals("CF")
						|| g.s == g.d && g.s >= 0.5){
					lbl = f.createConflictLabel();
				} else if(g.label!=null && g.label.equals("UN")
						|| g.s == g.d && g.s < 0.5){
					lbl = f.createUnknownLabel();
				}
				x.setLabel(lbl);
				m.getIntentions().add(x);
				if (g.parent!=null) {
					Container a = (Container) hm.get(new Integer(g.parent.id));
					if (a!=null) {
						x.setContainer(a);
					}
				}
				if (g.name!=null && g.name.indexOf("::")>0)
					set_goal_name(x, g.name.substring(g.name.indexOf("::")+2));
				else
					set_goal_name(x, g.name);
				hm.put(new Integer(g.id), x);
			}
		}
	}

	/**
	 * set the Intention x with the name n
	 * @param x
	 * @param n
	 */
	@SuppressWarnings("unchecked")
	private void set_goal_name(Intention x, String n) {
		x.setName(Computing.strip_quote(n));
		// check whether n contains a Topic
		if (n.indexOf("[")>0 && n.indexOf("]")> n.indexOf("[")) {
			String m = n.substring(n.indexOf("[")).substring(1, n.indexOf("]") - n.indexOf("["));
			for (StringTokenizer st = new StringTokenizer(m, ",");
				 st.hasMoreTokens();) {
				String item = Computing.strip_quote(st.nextToken());
				Topic t = f.createTopic();
				StringTokenizer st2 = new StringTokenizer(item, " ");
				if (st2.countTokens()==1) {
					t.setType("String"); // default
					t.setName(st2.nextToken());
				} else if (st2.countTokens()==2) {
					t.setType(st2.nextToken());
					t.setName(st2.nextToken());					
				} else if (st2.countTokens()>2 ) {
					t.setType(st2.nextToken());
					t.setName(item.substring(item.indexOf(" ")+1));
				}
				if (t.getName().endsWith("*")) {
					// output
					x.getOutput().add(t);
				} else {
					// input
					x.getInput().add(t);
				}
			}
		}
	}

//	private void set_decomposition_types(HashMap<Integer, EObject> hm) {
//		// sorting is necessary to maintain the ordering
//		// of the subgoals
//		SortArrayList sorted_keys = new SortArrayList();
//		for (Enumeration<IStarElement> i = elements.elements(); i.hasMoreElements(); ) {
//			IStarElement p = i.nextElement();
//			sorted_keys.add(p);
//		}
//		for (int i=0; i<sorted_keys.size(); i++) {
//			IStarElement g = (IStarElement) sorted_keys.get(i);
//			if (!g.isAgent && !g.isAspect && 
//				g.name!=null && !g.name.equals("")) {
//				Intention x = (Intention) hm.get(new Integer(g.id));
//				boolean isLeaf = true;
//				for (Enumeration j = links.keys(); j.hasMoreElements();) {
//					IStarLink s = links.get(j.nextElement());
//					if (g.id == s.from.id && (s.op.equals("And") || s.op.equals("Or"))) {
////						if (s.op.equals("And"))
////							x.setType(DecompositionType.get(DecompositionType.AND));
////						else
////							x.setType(DecompositionType.get(DecompositionType.OR));
//						isLeaf = false;
//						break;
//					}
//				}			
//				if (g.feature!=null && g.feature.equals("/")) {
//					x.setSystem(Boolean.FALSE);
//				} else {
//					x.setSystem(Boolean.TRUE);
//				}
//				if (isLeaf)
//					x.setType(DecompositionType.get(DecompositionType.LEAF));
//			}
//		}
//	}

	private void mark_prefixed_subgoals() {
		for (Enumeration<String> i = goals.keys(); i.hasMoreElements();) {
			String k = i.nextElement();
		    Advice a = goals.get(k);
		    if (a!=null) {
		    	IStarElement g = elements.get(a);
			    if (g!=null) {
			    	if (g.name.indexOf("May ")>=0) {
			    		g.setSoftGoal();
			    	}
			    }
		    }
		}
	}

	/**
	 * If a Intention has more than one parents, then it will be duplicated
	 */
	private void duplicate_high_fan_in_goals() {
		for (Enumeration<String> i = goals.keys(); i.hasMoreElements();) {
			String k = i.nextElement();
		    Advice a = goals.get(k);
		    if (a!=null) {
		    	IStarElement g = elements.get(a);
			    if (g!=null && ! g.isSoftGoal) {
			    	Vector<IStarLink> l = new Vector<IStarLink>(); // links
					for (Enumeration j = links.keys(); j.hasMoreElements();) {
						IStarLink s = links.get(j.nextElement());
						if (s.to.id == g.id && s.isDecomposition()) {
							l.add(s);
						}
					}
					if (l.size()>1) {
						Enumeration<IStarLink> j = l.elements();
						j.nextElement(); // skip the first link
						int cnt = 1;
						while (j.hasMoreElements()) {
//							D.o("found a high fan in Intention");
							IStarLink s = j.nextElement();
							Advice ad = goals.get(s.to.name);
							IStarElement e = 
								add_goal(ad.e.who, ad.e.why + "#" + cnt, ad.e.what);
							s.to = e;
							cnt++;
						}						
					}
			    }
		    }
		}
	}


	/**
	 * replace .. with parent's name 
	 */
	private void preprocess() {
		for (Iterator i = advices.iterator(); i.hasNext();) {
			Advice a = (Advice) i.next();
			preprocessAllInheritance(null, a);
		}
	}

	/**
	 * Yijun Yu: Feb 27, 2005
	 * To create the Dependency elements to connect two agents A, B
	 * based on the strategic Dependency patterns:
	 * remove all self-dependencies 
	 */
	protected void create_dependencies() {
		remove_self_dependencies();
	}

	/**
	 * 
	 */
	private void remove_self_dependencies() {
		// remove cyclic dependencies
		for (Enumeration i = links.keys(); i.hasMoreElements();) {
			IStarLink l = links.get(i.nextElement());
			if (l.op.equals("Dep")) {
				IStarElement a = l.to;
				IStarElement b = l.from;
				if (a.isAgent && a == b.parent
					|| b.isAgent && b==a.parent) { 
					links.remove(b.name + "Dep" + a.name);
					continue;
				}
			}
		}
	}

	/**
	 * @param out_file
	 */
	protected void create_elements_and_links(String out_file) {
		try {
//			File file = new File(out_file);
//			URI uri = file.isFile() ? 
//					URI.createFileURI(file.getAbsolutePath()): 
//					URI.createURI(out_file);					
			out = new PrintStream(out_file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        // Mar 11, 2005 Yijun: to offset the elements id by one as Visio does not support a shape with
		// a zero id.
		elements.put(new Advice(null, null, null, null, null, null, null, null, null, null), 
				new IStarElement(0, null, null)); 
		serialized_view += "Token SerializedView_0\n"
				+ "    IN SerializedView\n" + "    WITH\n";
		// the first pass creates the elements only, to avoid duplications
		for (Iterator i = advices.iterator(); i.hasNext();) {
			Advice a = (Advice) i.next();
			generateGoalModelForElements(null, a);
		}
		// the second pass creates the links only, to make sure no extra links are created
		for (Iterator i = advices.iterator(); i.hasNext();) {
			Advice a = (Advice) i.next();
			generateGoalModel(null, a);
		}
	}

	/**
	 * all parent Intentions of softgoals are softgoals
	 */
	protected void mark_parent_goal_of_softgoal_as_softgoal() {
		boolean change = true;
		do {
			change = false;
			for (Enumeration i = links.keys(); i.hasMoreElements();) {
				IStarLink s = links.get(i.nextElement());
				if (s.isDecomposition()) {
					if (s.from.isSoftGoal && !s.to.isSoftGoal || s.to.isSoftGoal && !s.from.isSoftGoal) {
						s.from.setSoftGoal(); s.to.setSoftGoal();
						change = true;
					}
				}
			}
		} while (change);
	}

	/**
	 * 
	 */
	protected void create_aspect() {
		boolean change;
		// root softgoals will be used to create an aspect
		 for (Enumeration<String> i = goals.keys(); i.hasMoreElements();) {
 			String k = i.nextElement();
		    Advice a = goals.get(k);
		    if (a!=null) {
		    	IStarElement g = elements.get(a);
			    if (g!=null && g.isSoftGoal) {
			    	boolean root = true;
					for (Enumeration j = links.keys(); j.hasMoreElements();) {
						IStarLink s = links.get(j.nextElement());
						if (s.to.id == g.id && s.isDecomposition()) {
							root = false;
							break;
						}
					}
					if (root) { // create a new aspect
						if (g.parent==null) {
							String name = Computing.strip_type_prefixes(types, g.name);
							IStarElement asp = agents.get(agent_context(Computing.prepend("Aspect ", name)));
							if (asp == null) {
								String t = Computing.prepend("Aspect ", name);
								asp = add_agent(t);
								asp.isAspect = true;
								g.parent = asp;
								asp.children.add(g);
							}
						}
					}
			    }
		    }
		}		
		// ... and all its sub-softgoals will be moved into the aspect
		// 		as their context will be the same as their parents
		// all subgoals of softgoals are softgoals
		change = true;
		do {
			change = false;
			for (Enumeration i = links.keys(); i.hasMoreElements();) {
				IStarLink s = links.get(i.nextElement());
				if (s.isDecomposition()) { // merge subgoal into its parent Intention's context (agent/aspect) 
					if (s.from.parent!=null && (s.to.parent==null /*|| s.from.parent.id != s.to.parent.id */)) {
						if (s.to.parent!=null)
							s.to.parent.children.remove(s.to);
						s.to.parent = s.from.parent;
						s.from.parent.children.add(s.to);
						change = true;
					}
				}
				if (s.isOrDecomposition()) {
					if (s.from.isSoftGoal && !s.to.isSoftGoal || s.to.isSoftGoal && !s.from.isSoftGoal) {
						s.from.setSoftGoal(); s.to.setSoftGoal();
						change = true;
					}
				}
			}
		} while (change);
	}

	/**
     * leaf Intentions are operationalized into tasks
	 */
	private void mark_leaf_or_ANDdecomposed_goal_as_task() {
		for (Enumeration<String> i = goals.keys(); i.hasMoreElements();) {
			String k = i.nextElement();
		    Advice a = goals.get(k);
		    if (a!=null) {
		    	IStarElement g = elements.get(a);
			    if (g!=null && !g.isSoftGoal && !g.isAgent && !g.isAspect) {
			    	boolean leaf = true;
			    	boolean and_decomposed = true;
					for (Enumeration j = links.keys(); j.hasMoreElements();) {
						IStarLink s = links.get(j.nextElement());
						if (s.from.id == g.id && s.isDecomposition()) {
							leaf = false;
							if (s.isOrDecomposition()) {
								and_decomposed = false;
								break;
							}
							break;
						}
					}
					if (leaf)
						g.isOperationalization = true;
					if (and_decomposed)
						g.isTask = true;
			    }
		    }
		}
	}

	/**
	 * 
	 */
	protected void mark_subgoal_of_task_as_task() {
		boolean change;
		// subgoals of tasks are also tasks 
		do {
			change = false;
			for (Enumeration<String> i = goals.keys(); i.hasMoreElements();) {
				String k = i.nextElement();
			    Advice a = goals.get(k);
			    if (a!=null) {
			    	IStarElement g = elements.get(a);
				    if (g!=null) {
						for (Enumeration j = links.keys(); j.hasMoreElements();) {
							IStarLink s = links.get(j.nextElement());
							if (s.to.id == g.id && s.from.isOperationalization && !g.isOperationalization && s.isDecomposition()) {
								g.isOperationalization = true;
								change = true;
								break;
							}
						}
				    }
			    }
			}
		} while (change);
	}
	/**
	 * 
	 */
	protected void mark_subgoal_of_softgoal_as_softgoal() {
		boolean change;
		// subgoals of tasks are also tasks 
		do {
			change = false;
			for (Enumeration<String> i = goals.keys(); i.hasMoreElements();) {
				String k = i.nextElement();
			    Advice a = goals.get(k);
			    if (a!=null) {
			    	IStarElement g = elements.get(a);
				    if (g!=null) {
						for (Enumeration j = links.keys(); j.hasMoreElements();) {
							IStarLink s = links.get(j.nextElement());
							if (s.to.id == g.id && s.from.isSoftGoal && !g.isSoftGoal&& s.isDecomposition()) {
								g.isSoftGoal= true;
								change = true;
								break;
							}
						}
				    }
			    }
			}
		} while (change);
	}

	/**
	 * @param a
	 */
	private void generateHowmuch(IStarElement ag, Advice a) {
		if (a.how_much != null && a.how_much.size() > 0) {
			int n = a.how_much.size();
//			for (int i = n-1; i >=0 ; i--) {
			for (int i = 0; i < n ; i++) {
				Effect e = (Effect) a.how_much.get(i);
				if (e.e.alias!=null)
					e.e.why = (String) Entity.aliases.get(e.e.alias);
				String op = e.op;
				IStarElement g1 = get_goal(e.e.who, 
						e.e.why==null? a.e.why : e.e.why, 
								e.e.why==null? a.e.what: e.e.what);
				if (!op.equals("~")) {							
					g1.setSoftGoal();
				}
				if (ag.parent==g1.parent) {
					add_link(g1, ag, op);
				} else if (op.equals("~") && Computing.propertyHolds("q7.codegen.creating_dependencies")){
					if (ag.parent==null || g1.parent==null 
							|| ag.parent.name.indexOf("Aspect")>=0 
							|| g1.parent.name.indexOf("Aspect")>=0) {
						add_link(g1, ag, op);
					} else {
						IStarElement g2 = get_goal("",  e.e.why==null? a.e.why : e.e.why, e.e.why==null? 
								a.e.what: e.e.what);
						add_link(g1, g2, op);
						add_link(g2, ag, op);
					}
				} else if (ag.parent!=null && Computing.propertyHolds("q7.codegen.creating_dependencies")){
					IStarElement g2 = get_goal("", e.e.why==null? a.e.why : e.e.why, e.e.why==null? a.e.what: e.e.what);
					IStarElement g3 = get_goal(ag.parent.name,  e.e.why==null? a.e.why : e.e.why, e.e.why==null? a.e.what: e.e.what);
					if (op.startsWith("~") ) {
						add_link(ag, g3, op);
						add_link(g2, g3, op);
						add_link(g1, g2, op);
						g1.label = ag.label;
						g2.label = ag.label;
						g3.label = ag.label;
					} else {
						add_link(g3, ag, op);							
//						if (Computing.propertyHolds("q7.codegen.istar.create_aspects")) {
							add_link(g3, g2, "~");
							add_link(g2, g1, "~");
//						}
					}
				} else {
					add_link(g1, ag, op);							
				}
			}
		}
	}

	/**
	 * @param sg -- the advice Intention
	 * @param pa -- the current advice
	 * @param a -- the pointcut advice
	 */
	private void generateWhere(IStarElement sg, Advice pa, Advice a) {
		if (a.where == null || a.where.size()==0) return;
		if (sg == null) return;
		for (Enumeration<String> e = goals.keys(); e.hasMoreElements(); ) {
			String k = e.nextElement();
			if (k!=null) {
				Advice ad = goals.get(k);
				for (int i=0; i<a.where.size(); i++) {
					Pointcut p = (Pointcut) a.where.get(i);
					/* still quite simple */
					if (p!=null
						&& (ad.e.who!=null && (p.e.who.equals("*") || ad.e.who.equalsIgnoreCase(p.e.who))
								|| ad.e.who == null && p.e.who.equals("*"))
					    && ad.e.why!=null && (p.e.why.equals("*") || ad.e.why.equalsIgnoreCase(p.e.why))
						&& (ad.e.what!=null && (p.e.what.equals("*") || ad.e.what.equalsIgnoreCase(p.e.what))
							    || ad.e.what == null && p.e.what.equals("*")))
					{
						// weaving when matched: create link from hg to sg
						IStarElement hg = elements.get(ad);
						if (p.op.equals("&") || p.op.equals("|")) { 
							 // aspects can be functional
							sg.isSoftGoal = hg.isSoftGoal;
							add_link(hg, sg, p.op); 
						} else { // aspects are non-functional 
							sg.setSoftGoal();
							if (hg.parent!=null && hg.parent.name.indexOf("Aspect ")<0 
									&& Computing.propertyHolds("q7.codegen.creating_dependencies")) { 
								// crosscutting a component (agent), not an aspect
								IStarElement g2 = get_goal("", a.e.why, a.e.what);
								if (g2==null || g2 == sg) {
									g2 = add_goal("", a.e.why, a.e.what);
									g2.parent = null;
									g2.setSoftGoal();
								} 
								IStarElement g3 = get_goal(hg.parent.name, a.e.why, a.e.what);
								if (g3==null) {
									g3 = add_goal(hg.parent.name, a.e.why, a.e.what);
									g3.parent = hg.parent;
									hg.parent.children.add(g3);
								}								
								g3.setSoftGoal();
								add_link(g3, hg, p.op);
								if (g2!=sg) {
									add_link(g2, sg, "~");
									add_link(g3, g2, "~");									
								} else
									add_link(g3, sg, "~");
							} else {
								add_link(sg, hg, p.op);								
							}
						}
						break;
					}					
				}
			}
		}				
	}

	/**
	 * @param a
	 */
	private void generateWho(Advice a) {
	}

	/**
	 * @param a
	 */
	private void generateWhen(Advice a) {
	}

	/**
	 * @param a
	 */
	private void generateHow(Advice a) {
		if (a.how != null) {
			for (Iterator i = a.how.advices.iterator(); i.hasNext();) {
				Advice ad = (Advice) i.next();
				generateGoalModel(a, ad);
			}
		}
	}

	
	/**
	 * @param a
	 */
	protected Object generateWhy(Advice parent, Advice a) {
		if (a.e.who!=null && a.e.who.indexOf("Aspect ")>=0)
			a.e.who = null;
		String alias = a.e.alias;
		while (alias!=null && Entity.aliases.get(alias)!=null)
			alias = (String) Entity.aliases.get(alias);
		if (alias!=null)
			a.e.why = alias;
		IStarElement ag = get_goal(a.e.who, a.e.why, a.e.what);
		if (a.how !=null && a.how.enrich!=null) {
			if (a.how.enrich.equals("|") || a.how.enrich.equals("/"))
				ag.setFeature(a.how.enrich);
			if (a.how.enrich.equals(";") || a.how.enrich.equals("||"))
				ag.setControl(a.how.enrich);
		}
		if (parent!=null)
		{
			IStarElement pg = get_goal(parent.e.who, parent.e.why, parent.e.what);
			if (pg.parent == null || pg.parent == ag.parent /*|| ag.parent==null */) {
				add_link(pg, ag, parent.how.rule);
				if (pg.parent==null && ag.parent!=null) {
					pg.parent = ag.parent;
					ag.parent.children.add(pg);
				}
			} else if (Computing.propertyHolds("q7.codegen.creating_dependencies")) {
				IStarElement g3 = get_goal(pg.parent.name, a.e.why, a.e.what);
				add_link(pg, g3, parent.how.rule);
//				if (Computing.propertyHolds("q7.codegen.istar.create_aspects")) {
					IStarElement g2 = get_goal("", a.e.why, a.e.what);
					if (ag!=null && ag.name!=null && g2!=null && !ag.name.equals(g2.name))
						add_link(ag, g2, "~");
					if (g2!=null && g2.name!=null && g3!=null && !g2.name.equals(g3.name))
						add_link(g2, g3, "~"); 
//				}
			}
		}
		return ag;
	}

	/**
	 * @param parent
	 * @param a
	 */
	public void preprocess_abbreviations(Advice parent, Advice a) {
		// preprocess the abbreviations
		try {
			if (a.e.why!=null) {
				int i = a.e.why.indexOf("..");
				boolean modified = (i>=0);
				if (modified && Computing.propertyHolds("q7.codegen.expand_placeholder_into_parent_names")) {
					if (parent!=null && parent.e.why!=null) {
						String old_why = a.e.why;
						while (i>=0) {
							String p1 = a.e.why.substring(0, i);
							String p2 = a.e.why.substring(i+2);
							a.e.why = Computing.strip_quote(p1) + 
									  Computing.strip_quote(parent.e.why) + 
									  Computing.strip_quote(p2);
							i = a.e.why.indexOf("..");
						}
						a.e.update(old_why);
					} else if (a.e.alias!=null) {
						a.e.why = (String) Entity.aliases.get(a.e.alias);
					}
				} 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param who
	 * @param why
	 * @param what
	 * @return
	 */
	protected IStarElement get_goal(String who, String why, String what) {
		String name = Computing.unique_goal_name(who, why, what);
		Advice ad = goals.get(name);
		if (ad==null) {
			return null;
		}
		return elements.get(ad);
	}

	/**
	 * @param to
	 * @param from
	 * @param rule
	 */
	protected void add_link(IStarElement to, IStarElement from, String rule) {
		if (to == null || from==null)
			return;
		if (to.id == from.id)
			return;
		String op = "";
		if (rule.equalsIgnoreCase("&"))
			op = "And";
		else if (rule.equalsIgnoreCase("|"))
			op = "Or";
		else if (rule.equalsIgnoreCase("++"))
			op = "Make";
		else if (rule.equalsIgnoreCase("--"))
			op = "Break";
 	    else if (rule.equalsIgnoreCase("="))
 	    	op = "Equal";
		else if (rule.startsWith("~"))
			op = "Dep" + (rule.length()>1?" " + rule.substring(1):"");
		else if (rule.startsWith("+"))			
			op = "Help" + (rule.length()>1?" " + rule.substring(1):"");
		else if (rule.startsWith("-"))
			op = "Hurt" + (rule.length()>1?" " + rule.substring(1):"");
		else
			op = "Unknown";
		links.put(to.name + op + from.name, new IStarLink(op, to, from));
	}	

	/**
	 * @param linkid
	 */
	private void serialize_the_token(int id, boolean isLink, boolean isExpanded) {
		int n;
		n = serialized_tokens.size();
		serialized_tokens
				.add("Token SerializedViewObject_0_"
						+ n
						+ "\n"
						+ "     IN SerializedObject \n"
						+ "     WITH\n"
						+ "          attribute, ID\n            : "
						+ id
						+ "\n"
						+ "          attribute, objecttype\n            : "
						+ (isLink ? 0 : 1)
						+ "\n"
						+ "          attribute, type\n            : \"edu.toronto.cs.ome.OME.GraphicView$"
						+ (isLink ? "GVLRecord" : "GVERecord")
						+ "\"\n"
						+ "          attribute, x\n            : 0.0\n"
						+ "          attribute, y\n            : 0.0\n"
						+ "          attribute, control1x\n            : 10.0\n"
						+ "          attribute, control1y\n            : 10.0\n"
						+ "          attribute, control2x\n            : 100.0\n"
						+ "          attribute, control2y\n            : 100\n"
						+ "          attribute, start2x\n            : 20.0\n"
						+ "          attribute, start2y\n            : 20.0\n"
						+ "          attribute, end1x\n            : 80.0\n"
						+ "          attribute, end1y\n            : 80.0\n"
						+ "          attribute, expanded\n            : " 
						+ (isExpanded && NEED_EXPAND? "1": "0")  // do not expand the agents
						+ "\n"
						+ "          attribute, hidden\n            : 0\n"
						+ "          attribute, justification\n            : "
						+ (isLink ? 2 : 0) + "\n"
						+ "          attribute, highlight\n            : 0\n"
						+ "END\n");
		serialized_view += "        attribute,view_objects\n"
				+ "            : SerializedViewObject_0_" + n + "\n";
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.q7.TelosCodeGenerator#getMetaModel()
	 */
	protected String getMetaModel() {
		return "/edu/toronto/cs/q7/metamodel/istar.tel";
	}

}