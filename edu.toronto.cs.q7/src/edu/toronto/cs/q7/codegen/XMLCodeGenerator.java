/*
 * Created on Jan 27, 2005
 */
package edu.toronto.cs.q7.codegen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.Effect;
import edu.toronto.cs.util.Computing;

/**
 * @author Yijun Yu
 */
public class XMLCodeGenerator {

	private ArrayList advices;

	private PrintStream out = System.out;
	/**
	 * @param a:
	 *            advices
	 */
	public XMLCodeGenerator(ArrayList a) {
		advices = a;
	}
	
	HashMap goals = new HashMap();
	HashMap softgoals = new HashMap();

	private int indent_level;
	/**
	 *  @indent_level: initialize to 0
	 */
	public void generateGoalModel(String out_file) {
		if (advices == null) {
			System.out.println("No model parsed?");
			return;
		}
		try {
			out = new PrintStream(new FileOutputStream(new File(out_file)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<model xmlns=\"http://www.cs.toronto.edu/~yijun/requirements\"  xmlns:req=\"http://www.cs.toronto.edu/~yijun/requirements\">");
		indent_level = 0;
		for (Iterator i = advices.iterator(); i.hasNext();) {
			Advice a = (Advice) i.next();
			if (a.comment!=null && ! a.comment.equals("null")) {
				 out.println(a.comment);
			}
			generateGoalModel(a);
		}
		out.println("</model>");
	}

	/**
	 * Recursively generating the subgoals
	 * @param a:
	 *            Advice
	 */
	protected void generateGoalModel(Advice a) {
		if (a==null) return;
		indent();
		if (is_soft(a)) { // softgoal
			out.print("<soft");
		} else
			out.print("<goal");
		generateWhen(a);		
		generateWho(a);		
		generateWhy(a);		
		generateWhat(a);		
		generateWhere(a);		
		generateHow(a);
		generateHowmuch(a);
	}

	/**
	 * @param a
	 * @return
	 */
	private boolean is_soft(Advice a) {
		if (!softgoals.containsKey(unique_goal_name_for_xml(a.e.who, 
				a.e.why, a.e.what))) {
		   return false;
		}
		return true;
	}

	/**
	 * @param a
	 */
	private void generateWhere(Advice a) {
		if (a.where == null) return;
//		out.print(" <= "); 
//		int n = a.where.size();
//		for (int i=n-1; i>=0; i--) {
//			if (i<n-1)
//				out.print(", ");
//			out.print((Pointcut)a.where.get(i));
//		}
	}

	/**
	 * @param a
	 */
	private void generateWho(Advice a) {
//		if (a.who != null)
//			out.print(" agent=\"" + a.who.trim() + "\"");
	}

	/**
	 * @param a
	 */
	private void generateWhen(Advice a) {
		if (a.when != null)
			out.print("(" + a.when + ") => ");
	}

	/**
	 * @param a
	 */
	private void generateHow(Advice a) {
		if (a.label!=null)
			out.print(translate(a.label));
		if (a.how != null && (a.how.advices!=null && a.how.advices.size()>0)) {
			out.print(">\n");
			indent_level ++;
			if (a.how.rule != null) {
				indent();
				out.print("<rule op=\"" + 
						translate(a.how.rule) + "\"/>");				
				out.println(); 
			}
			if (a.how.enrich!=null) out.print(" " + a.how.enrich);
			for (Iterator i = a.how.advices.iterator(); i.hasNext();) {
				Advice ad = (Advice) i.next();
				generateGoalModel(ad);
			}
			indent_level --;  
		} 
		if (a.how_much == null && 
				(a.how==null || a.how.advices==null || a.how.advices.size()==0)){
			out.print(" />\n");
		} else if (a.how_much == null){
			indent(); 
			if (is_soft(a)) 
				out.print("</soft>\n");
			else
				out.print("</goal>\n");			
		} else if (a.how == null && a.how_much != null){
			out.print(">\n");
		}
	}
	/**
	 * @param a
	 */
	private void generateHowmuch(Advice a) {
//		if (a.label!=null)
//			out.print("@" + a.label + "@");
		if (a.how_much != null) {
			indent_level ++;
			int n = a.how_much.size();
			for (int i=n-1; i>=0; i--) {
				Effect e = (Effect)a.how_much.get(i);
				indent();
				String name = unique_goal_name_for_xml(e.e.who, 
						e.e.why, e.e.what);
				String op = e.toOp();
				out.print("<rule op=\"" + translate(op)
						+ "\" to=" + attr_name(name));
				out.print(" />");
				if (!op.equals("~") && !softgoals.containsKey(name)) {
					softgoals.put(name, e);					
				}
				if (i>0)
					out.println();
			}
			indent_level --;
			out.println();
			indent(); 
			if (is_soft(a))
				out.println("</soft>");
			else
				out.println("</goal>");
		}
	}


	/**
	 * @param rule
	 * @return
	 */
	private String translate(String rule) {
		if (rule.equals("&")) return "AND";
		if (rule.equals("|")) return "OR";
		if (rule.equals("~")) return "DEPENDENCY";
		if (rule.equals("+")) return "HELP";
		if (rule.equals("-")) return "HURT";
		if (rule.equals("++")) return "MAKE";
		if (rule.equals("--")) return "BREAK";		
		if (rule.equals("FS")) return " sat=\"1.0\"";
		if (rule.equals("PS")) return " sat=\"0.5\"";
		if (rule.equals("PD")) return " den=\"0.5\"";
		if (rule.equals("FD")) return " den=\"1.0\"";
		if (rule.equals("UN")) return "";
		if (rule.equals("CF")) return " sat=\"1.0\" den=\"1.0\"";
		if (rule.startsWith("+") || rule.startsWith("-")) {
			return rule.substring(0,1); // ignore the quantitative labelled rules
		}
		if (rule.indexOf(",")>=0) {
				int i = rule.indexOf(",");
				String sat = rule.substring(0, i);
				String den = rule.substring(i+1);
				int j = den.indexOf(",");
				String perf = null;
				if (j>=0)  {
					perf = den.substring(0, j); 
					den = den.substring(j+1);
				}
				float s = Float.parseFloat(sat);
				float d = Float.parseFloat(den);
				float p = 0.0f;
				String pa = "";
				if (perf !=null) {
					p = Float.parseFloat(perf);
					pa = "perf=\""+ p +"\"";
				}
				// no need for accurate quantitative labels
//				return " sat=\"" + s + "\" den=\"" + d + "\"";
				String l = Computing.SDtoLabel(s, d);
				if (l.indexOf("Weakly")>=0 && l.indexOf("Satisfied")>=0)
					return pa + " value=\"0.5\""; 
				else if (l.indexOf("Weakly")>=0 && l.indexOf("Denied")>=0)
					return pa + " value=\"-0.5\""; 
				else if (l.indexOf("Weakly")<0 && l.indexOf("Satisfied")>=0)
					return pa + " value=\"1.0\""; 
				else if (l.indexOf("Weakly")<0 && l.indexOf("Denied")>=0)
					return pa + " value=\"-1.0\"";
				else
					return pa + "";
		}
		return rule;
	}

	private final String IDENT = " ";
	/**
	 * @param a
	 */
	private void generateWhat(Advice a) {
//		if (a.what != null)
//			out.print(" [" + a.what + "]");
	}

	/**
	 * @param who
	 * @param why
	 * @param what
	 * @return
	 */
	public static String unique_goal_name_for_xml(String who, String why, String what) {
		String [] types = {"Agent"}; // default
		if (who!=null && !who.equals("") && !who.equals("*")) 
			who = "&lt;" + Computing.quotation(Computing.strip_type_prefixes(types, who.trim())) + 
			   (why == null? "&gt;" : "&gt;::");
		else
			who = "";		
		if (what!=null && !what.equals("*"))
			what = " [" + what.trim() + "]";
		else
			what = "";		
		return who + (why!=null? (why.trim() + what) : "");
	}	
	
	public String attr_name(String n) {
		return ""+(n.startsWith("\"")? n : "\"" + n) + (n.endsWith("\"")? "" : "\"");
	}
	
	/**
	 * @param a
	 */
	private void generateWhy(Advice a) {
		String n = unique_goal_name_for_xml(a.e.who, a.e.why, a.e.what);
		String attr = " name=" + attr_name(n);
		out.print(attr);
	}

	/**
	 * 
	 */
	private void indent() {
		for (int i=0; i<=indent_level; i++)
			out.print(IDENT);
	}
}