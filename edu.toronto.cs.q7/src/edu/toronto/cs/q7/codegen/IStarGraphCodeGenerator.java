/*
 * Created on Jan 27, 2005
 * To generate i* diagram from the parsed Q7 input
 * 
 * TODO use When information to generate the "claim" softgoal 
 */
package edu.toronto.cs.q7.codegen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.Effect;
import edu.toronto.cs.q7.model.Entity;
import edu.toronto.cs.q7.model.IStarElement;
import edu.toronto.cs.q7.model.IStarLink;
import edu.toronto.cs.q7.model.Pointcut;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;
import edu.toronto.cs.util.SortArrayList;
/**
 * @author Yijun Yu
 */
public class IStarGraphCodeGenerator extends TelosCodeGenerator {
	/**
	 * @param a -- advices
	 */
	public IStarGraphCodeGenerator(ArrayList a) {
		super(a);
	}

	Hashtable agents = new Hashtable(); // name -> IStarElement
	
	private String serialized_view = "";
	public static URL u;
	/**
	 * @param file
	 * @return the content of the file
	 */
	private static String get_file_contents() {
		String string = "";
		try {
			BufferedReader br = null;
			String m = System.getProperty("java.library.path");
			if (m!=null) {
				FileReader fr = new FileReader(m+File.separator + "istar.tel");
				br = new BufferedReader(fr);
			} else {
				if (u==null)
					 u = IStarGraphCodeGenerator.class.getResource("/edu/toronto/cs/q7/metamodel/istar.tel");
				InputStream i = null;
				try {
					i = u.openStream();
					br = new BufferedReader(new InputStreamReader(i));
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
			try {
				String s = null;
				do {
					if (s!=null)
						string += "\n";
					s = br.readLine();
					if (s!=null)
						string += s;
				} while (s!=null);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return string;
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
	
	String [] types = {"Do", "May", "Agent", "Role", "Position", "Actor", "Aspect"};
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
		Advice ad = (Advice) goals.get(rest);
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
			return (IStarElement) elements.get(ad);
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

	IStarElement create_agent_for_new_who(Advice parent, Effect e) {
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
	IStarElement create_agent_for_new_who_inherit(Advice parent, Advice a) {
		IStarElement agent = null;
		if (parent!=null && parent.e.who!=null 
				&& (a.e.who == null 
				|| parent.e.who.equalsIgnoreCase(a.e.who))) 
			// inheriting the context
		{
			String pcontext = agent_context(parent.e.who);
			a.e.who = parent.e.who;
			agent = (IStarElement) agents.get(pcontext);
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
		agent = (IStarElement) agents.get(context);
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
		output_serialized_views_and_objects();
	}

	private void mark_prefixed_subgoals() {
		for (Enumeration i = goals.keys(); i.hasMoreElements();) {
			String k = (String) i.nextElement();
		    Advice a = (Advice) goals.get(k);
		    if (a!=null) {
		    	IStarElement g = (IStarElement) elements.get(a);
			    if (g!=null) {
			    	if (g.name.indexOf("May ")>=0) {
			    		g.setSoftGoal();
			    	}
			    }
		    }
		}
	}

	/**
	 * If a goal has more than one parents, then it will be duplicated
	 */
	private void duplicate_high_fan_in_goals() {
		for (Enumeration i = goals.keys(); i.hasMoreElements();) {
			String k = (String) i.nextElement();
		    Advice a = (Advice) goals.get(k);
		    if (a!=null) {
		    	IStarElement g = (IStarElement) elements.get(a);
			    if (g!=null && ! g.isSoftGoal) {
			    	Vector l = new Vector(); // links
					for (Enumeration j = links.keys(); j.hasMoreElements();) {
						IStarLink s = (IStarLink) links.get(j.nextElement());
						if (s.to.id == g.id && s.isDecomposition()) {
							l.add(s);
						}
					}
					if (l.size()>1) {
						Enumeration j = l.elements();
						j.nextElement(); // skip the first link
						int cnt = 1;
						while (j.hasMoreElements()) {
//							D.o("found a high fan in goal");
							IStarLink s = (IStarLink) j.nextElement();
							Advice ad = (Advice) goals.get(s.to.name);
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

	int cnt = 0;
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
	 * To create the dependency elements to connect two agents A, B
	 * based on the strategic dependency patterns:
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
			IStarLink l = (IStarLink) links.get(i.nextElement());
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
			out = new PrintStream(new FileOutputStream(new File(out_file)));
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
	 * 
	 */
	private void output_serialized_views_and_objects() {
		assign_link_labels();		
		// now output the serialized objects and serialized view
		for (Iterator i = serialized_tokens.iterator(); i.hasNext();) {
			String s = (String) i.next();
			out.println(s);
		}		
		for (Enumeration i = links.keys(); i.hasMoreElements();) {
			IStarLink s = (IStarLink) links.get(i.nextElement());			
			out.println(s.toString());
		}
		SortArrayList sorted_keys = new SortArrayList();
		for (Enumeration i = elements.elements(); i.hasMoreElements(); ) {
			IStarElement p = (IStarElement) i.nextElement();
			sorted_keys.add(p);
		}
		for (int i=0; i<sorted_keys.size(); i++) {
			IStarElement e = (IStarElement) sorted_keys.get(i);
			if (e.id>0)
				out.println(e.toString());
		}
		out.print(serialized_view + "END\n");
		String TELOS_CLASS_MODEL = get_file_contents();
		out.print(TELOS_CLASS_MODEL);
	}

	/**
	 * 
	 */
	private void assign_link_labels() {
		// assign_link_labels
		int id = serialized_tokens.size();
		for (Enumeration i = links.keys(); i.hasMoreElements();) {
			IStarLink l = (IStarLink) links.get(i.nextElement());
			serialize_the_token(id, true, false);
			l.from.decompositions += "        attribute, links\n             : Link_"
				+ id + "\n";
			l.to.decompositions += "        attribute, links\n             : Link_"
				+ id + "\n";
			l.id = id;
			id++;
		}
	}

	/**
	 * all parent goals of softgoals are softgoals
	 */
	protected void mark_parent_goal_of_softgoal_as_softgoal() {
		boolean change = true;
		do {
			change = false;
			for (Enumeration i = links.keys(); i.hasMoreElements();) {
				IStarLink s = (IStarLink) links.get(i.nextElement());
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
		 for (Enumeration i = goals.keys(); i.hasMoreElements();) {
 			String k = (String) i.nextElement();
		    Advice a = (Advice) goals.get(k);
		    if (a!=null) {
		    	IStarElement g = (IStarElement) elements.get(a);
			    if (g!=null && g.isSoftGoal) {
			    	boolean root = true;
					for (Enumeration j = links.keys(); j.hasMoreElements();) {
						IStarLink s = (IStarLink) links.get(j.nextElement());
						if (s.to.id == g.id && s.isDecomposition()) {
							root = false;
							break;
						}
					}
					if (root) { // create a new aspect
						if (g.parent==null) {
							String name = Computing.strip_type_prefixes(types, g.name);
							IStarElement asp = (IStarElement) agents.get(agent_context(Computing.prepend("Aspect ", name)));
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
				IStarLink s = (IStarLink) links.get(i.nextElement());
				if (s.isDecomposition()) { // merge subgoal into its parent goal's context (agent/aspect) 
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
     * leaf goals are operationalized into tasks
	 */
	private void mark_leaf_or_ANDdecomposed_goal_as_task() {
		for (Enumeration i = goals.keys(); i.hasMoreElements();) {
			String k = (String) i.nextElement();
		    Advice a = (Advice) goals.get(k);
		    if (a!=null) {
		    	IStarElement g = (IStarElement) elements.get(a);
			    if (g!=null && !g.isSoftGoal && !g.isAgent && !g.isAspect) {
			    	boolean leaf = true;
			    	boolean and_decomposed = true;
					for (Enumeration j = links.keys(); j.hasMoreElements();) {
						IStarLink s = (IStarLink) links.get(j.nextElement());
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
			for (Enumeration i = goals.keys(); i.hasMoreElements();) {
				String k = (String) i.nextElement();
			    Advice a = (Advice) goals.get(k);
			    if (a!=null) {
			    	IStarElement g = (IStarElement) elements.get(a);
				    if (g!=null) {
						for (Enumeration j = links.keys(); j.hasMoreElements();) {
							IStarLink s = (IStarLink) links.get(j.nextElement());
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
			for (Enumeration i = goals.keys(); i.hasMoreElements();) {
				String k = (String) i.nextElement();
			    Advice a = (Advice) goals.get(k);
			    if (a!=null) {
			    	IStarElement g = (IStarElement) elements.get(a);
				    if (g!=null) {
						for (Enumeration j = links.keys(); j.hasMoreElements();) {
							IStarLink s = (IStarLink) links.get(j.nextElement());
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
						if (Computing.propertyHolds("q7.codegen.istar.create_aspects")) {
							add_link(g3, g2, "~");
							add_link(g2, g1, "~");
						}
					}
				} else {
					add_link(g1, ag, op);							
				}
			}
		}
	}

	/**
	 * @param sg -- the advice goal
	 * @param pa -- the current advice
	 * @param a -- the pointcut advice
	 */
	private void generateWhere(IStarElement sg, Advice pa, Advice a) {
		if (a.where == null || a.where.size()==0) return;
		if (sg == null) return;
		for (Enumeration e = goals.keys(); e.hasMoreElements(); ) {
			String k = (String) e.nextElement();
			if (k!=null) {
				Advice ad = (Advice) goals.get(k);
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
						IStarElement hg = (IStarElement) elements.get(ad);
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

	
	IStarElement thegoal = null;
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
		Advice ad = (Advice) goals.get(name);
		if (ad==null) {
			return null;
		}
		return (IStarElement) elements.get(ad);
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
	boolean NEED_EXPAND = Computing.propertyHolds("q7.codegen.expand_actors");
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