/*
 * Created on Jan 27, 2005
 */
package edu.toronto.cs.q7.codegen;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.toronto.cs.goalmodel.ContributionType;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.contribution;
import edu.toronto.cs.goalmodel.goal;
import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.Effect;
/**
 * @author Yijun Yu
 */
public class GoalModelCodeGenerator extends TelosCodeGenerator {

	class Element {
		String name;

		int id;

		String decompositions;

		boolean isSoftGoal;

		boolean isOperationalization;

		Element(int _id, String _name, String _decompositions) {
			id = _id;
			name = _name;
			decompositions = _decompositions;
		}

		void setSoftGoal() {
			isSoftGoal = true;
		}
		void setOperationalizedSoftGoal() {
			isOperationalization = true;
		}
	}

	class Link {
		int id;

		String op;

		Element from;

		Element to;

		Link(int _id, String _op, Element _from, Element _to) {
			id = _id;
			op = _op;
			from = _from;
			to = _to;
		}
		boolean isEqual() {
			return op.equalsIgnoreCase("Equal");
		}
		boolean isOrDecomposition() {
			return op.equalsIgnoreCase("Or") || isEqual();
		}
		boolean isDecomposition() {
			return op.equalsIgnoreCase("Or") || op.equalsIgnoreCase("And") || isEqual() ;
		}
	}

	/**
	 * @param a:
	 *            advices
	 */
	public GoalModelCodeGenerator(ArrayList a) {
		super(a);
	}
	GoalmodelPackage e = GoalmodelPackage.eINSTANCE;
	GoalmodelFactory f = e.getGoalmodelFactory();
	Resource resource;
	public void generateGoalModel(String out_file) {
		if (advices == null) {
			System.out.println("No model parsed?");
			return;
		}
		try {
		ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    		Resource.Factory.Registry.DEFAULT_EXTENSION, 
	    		new XMIResourceFactoryImpl());
	    // Get the URI of the model file.
	    URI fileURI = URI.createURI("file:///" + out_file);
	    // Create a resource for this file.
	    resource = resourceSet.createResource(fileURI);
		for (Iterator i = advices.iterator(); i.hasNext();) {
			Advice a = (Advice) i.next();
			generateGoalModel(null, a);
		}
		// all subgoals of softgoals are softgoals
		boolean change = true;
		do {
			change = false;
			for (Enumeration i = links.keys(); i.hasMoreElements();) {
				Link s = (Link) links.get(i.nextElement());
				if (s.isOrDecomposition()) {
					if (s.from.isSoftGoal && !s.to.isSoftGoal || s.to.isSoftGoal && !s.from.isSoftGoal) {
						s.from.setSoftGoal(); s.to.setSoftGoal();
						if (s.isEqual()) {
							s.to.setOperationalizedSoftGoal();
						}
						s.from.isOperationalization = false;
						change = true;
					}
				}
			}
		} while (change);
		HashMap hm = new HashMap();
		for (Enumeration i = elements.keys(); i.hasMoreElements();) {
			Element g = (Element) elements.get(i.nextElement());
			goal x = f.creategoal();
			x.setName(g.name);
			boolean isLeaf = true;
			for (Enumeration j = links.keys(); j.hasMoreElements();) {
				Link s = (Link) links.get(j.nextElement());
				if (g.id == s.from.id && (s.op.equals("And") || s.op.equals("Or"))) {
					if (s.op.equals("And"))
						x.setType(DecompositionType.get(DecompositionType.AND));
					else
						x.setType(DecompositionType.get(DecompositionType.OR));
					isLeaf = false;
					break;
				}
			}			
			if (isLeaf)
				x.setType(DecompositionType.get(DecompositionType.LEAF));
			hm.put(new Integer(g.id), x);
			resource.getContents().add(x);
		}
		for (Enumeration i = links.keys(); i.hasMoreElements();) {
			Link s = (Link) links.get(i.nextElement());
			goal x = (goal) hm.get(new Integer(s.from.id));
			goal y = (goal) hm.get(new Integer(s.to.id));
			if (s.op.equals("And") || s.op.equals("Or")) {
				x.getGoal().add(y);
				if (s.op.equals("And")) {
					x.setType(DecompositionType.AND_LITERAL);
				} else {
					x.setType(DecompositionType.OR_LITERAL);					
				}
			} else {
				contribution c = f.createcontribution();
				resource.getContents().add(c);
				y.getRule().add(c);
				if (s.op.equals("Help")) 
					c.setType(ContributionType.get(ContributionType.HELP));
				else if (s.op.equals("Make")) c.setType(ContributionType.get(ContributionType.MAKE)); 
				else if (s.op.equals("Hurt")) c.setType(ContributionType.get(ContributionType.HURT));  
				else if (s.op.equals("Break")) c.setType(ContributionType.get(ContributionType.BREAK));				
				c.setTarget(x);
			}				
		}
		} catch (Exception e) { 
		 e.printStackTrace();
		}
		  try
		  {
		    resource.save(Collections.EMPTY_MAP);
		  }
		  catch (Exception e) {
			  e.printStackTrace();
		  }
		
	}

	/**
	 * Recursively generating the subgoals
	 * 
	 * @param a:
	 *            Advice
	 */
	protected void generateGoalModel(Advice parent, Advice a) {
		if (a == null)
			return;
		generateWhen(a);
		generateWho(a);
		generateWhy(parent, a);
		generateWhere(a);
		generateHow(a);
		generateHowmuch(a);
	}

	/**
	 * @param a
	 */
	private void generateHowmuch(Advice a) {
	}

	/**
	 * @param a
	 */
	private void generateWhere(Advice a) {
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
		int id = elements.size();
		String name = strip_quote(a.e.why);
		if (a.e.what != null) {
			name += " [" + strip_quote(a.e.what) + "]";
		}
		Element g = new Element(id, name, "");
		Advice x = (Advice) goals.get(name);
		if (x!=null) {
			add_link(x, a, g, "=");			
		}
		a.setID(id);
		elements.put(a, g);
		goals.put(name, a);
		if (parent != null) {
			add_link(parent, a, g, parent.how.rule);
		}
		if (a.how_much != null && a.how_much.size() > 0) { // assume how_much =
														   // "+ ...."
			for (int i = 0; i < a.how_much.size(); i++) {
				Effect e = (Effect) a.how_much.get(i);
				String op = e.op;
				String rest = get_goal_name(e);
				Advice ad = (Advice) goals.get(rest);
				if (ad == null) {
					ad = new Advice("", "", "", rest, null, null, null, null, null, null);
					int m = elements.size();
					ad.setID(m);
					Element g1 = new Element(m, rest, "");
					elements.put(ad, g1);
					g1.setSoftGoal();
					goals.put(rest, ad);
				}
				add_link(ad, a, g, op);
			}
		}
		return g;
	}

	/**
	 * @param parent
	 * @param a
	 * @param g
	 */
	private void add_link(Advice parent, Advice a, Element g, String rule) {
		Element pg = (Element) elements.get(parent);
		if (pg == null)
			return;
		int linkid = links.size();
		String op = "";
		if (rule.equalsIgnoreCase("&"))
			op = "And";
		else if (rule.equalsIgnoreCase("|"))
			op = "Or";
		else if (rule.equalsIgnoreCase("+"))
			op = "Help";
		else if (rule.equalsIgnoreCase("++"))
			op = "Make";
		else if (rule.equalsIgnoreCase("-"))
			op = "Hurt";
		else if (rule.equalsIgnoreCase("--"))
			op = "Break";
		else if (rule.equalsIgnoreCase("="))
			op = "Equal";
		else
			op = "Unknown";
		links.put(new Integer(linkid), new Link(linkid, op, pg, g));
		pg.decompositions += "        attribute, links\n             : Link_"
				+ linkid + "\n";
		elements.put(parent, pg);
		g.decompositions += "        attribute, links\n             : Link_"
				+ linkid + "\n";
		elements.put(a, g);
	}

	protected String getMetaModel() {
		return null;
	}
}