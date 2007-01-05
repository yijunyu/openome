/*
 * Created on Jan 27, 2005
 */
package edu.toronto.cs.q7.codegen;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.Effect;
import edu.toronto.cs.util.Computing;

/**
 * @author Yijun Yu
 */
public abstract class TelosCodeGenerator {

	public ArrayList advices;
	protected Hashtable elements = new Hashtable();
	protected Hashtable links = new Hashtable();
	protected ArrayList serialized_tokens = new ArrayList();
	protected Hashtable goals = new Hashtable();
	protected PrintStream out = System.out;

	/**
	 * @param a:
	 *            advices
	 */
	public TelosCodeGenerator(ArrayList a) {
		advices = a;
	}

	abstract public void generateGoalModel(String out_file);


	/**
	 * @return
	 */
	protected abstract String getMetaModel();


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
	 * Remove the extra quotes for a string
	 * 
	 * @param s,
	 *            the input string
	 * @return
	 */
	static String strip_quote(String s) {
		if (s == null)
			return s;
		String str = "";
		for (int i=0; i<s.length(); i++)
			if (s.charAt(i) != '"')
				str += s.charAt(i);
		return str;
	}
	
	/**
	 * @param who
	 * @return
	 */
	protected static String agent_context(String who) {
		String context = strip_quote(who);
		if (context !=null 
				&& !context.startsWith("Aspect ")
				&& !context.startsWith("Actor ")
				&& !context.startsWith("Role ")
				&& !context.startsWith("Position ")
				&& !context.startsWith("Agent ")
				) {
			context = "Agent " + context;
		}
		return context;
	}	
	
	/**
	 * @param e
	 * @return
	 */
	protected static String get_goal_name(Effect e) {		
		return Computing.unique_goal_name(e.e.who, e.e.why, e.e.what);
	}	
	
	/**
	 * @param a
	 * @return the goal element
	 */
	protected abstract Object generateWhy(Advice parent, Advice a);
}