/*
 * Created on Jan 27, 2005
 */
package edu.toronto.cs.q7.codegen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.Effect;
import edu.toronto.cs.q7.model.Pointcut;

/**
 * @author Yijun Yu
 */
public class CodeGenerator {

	private ArrayList advices;

	private PrintStream out = System.out;
	/**
	 * @param a:
	 *            advices
	 */
	public CodeGenerator(ArrayList a) {
		advices = a;
	}

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
		indent_level = 0;
		for (Iterator i = advices.iterator(); i.hasNext();) {
			Advice a = (Advice) i.next();
			if (a.comment!=null && ! a.comment.equals("null")) {
				 out.println(a.comment);
			}
			generateGoalModel(a);
		}
	}

	/**
	 * Recursively generating the subgoals
	 * @param a:
	 *            Advice
	 */
	protected void generateGoalModel(Advice a) {
		if (a==null) return;
		indent();
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
	 */
	private void generateHowmuch(Advice a) {
		if (a.label!=null)
			out.print("@" + a.label + "@");
		if (a.how_much != null) {
			int n = a.how_much.size();
			for (int i=n-1; i>=0; i--) {
				Effect e = (Effect)a.how_much.get(i);
				if (i<n-1)
					out.print(", ");
				else {
					if (e.e.why == null)
						out.print(" ==> ");
					else 
						out.print(" => ");
				}
				out.print(e);
			}
		}
		out.println();
	}

	/**
	 * @param a
	 */
	private void generateWhere(Advice a) {
		if (a.where == null) return;
		out.print(" <= "); 
		int n = a.where.size();
		for (int i=n-1; i>=0; i--) {
			if (i<n-1)
				out.print(", ");
			out.print((Pointcut)a.where.get(i));
		}
	}

	/**
	 * @param a
	 */
	private void generateWho(Advice a) {
		if (a.e.who != null)
			out.print("<" + a.e.who.trim() + ">::");
	}

	/**
	 * @param a
	 */
	private void generateWhen(Advice a) {
		if (a.when != null)
			out.print("(" + a.op + a.when + ") => ");
	}

	private String style = System.getProperty("indent_style");
	private final boolean DEFAULT_BRACE_STYLE_NO_NEW_LINE = 
		 (style == null)? true: style.equalsIgnoreCase("new_line");  
	/**
	 * @param a
	 */
	private void generateHow(Advice a) {
		if (a.how != null) {
			if (DEFAULT_BRACE_STYLE_NO_NEW_LINE) {
				out.print(" ");
			} else { 
				out.println(); indent();
			}
			out.print("{");
			if (a.how.rule != null) out.print(" " + a.how.rule);
			if (a.how.enrich!=null) out.print(" " + a.how.enrich);
			out.println(); 
			indent_level ++;
			for (Iterator i = a.how.advices.iterator(); i.hasNext();) {
				Advice ad = (Advice) i.next();
				generateGoalModel(ad);
			}
			indent_level --; indent(); out.print("}"); 
		} 			
	}

	private final String IDENT = "  ";
	/**
	 * @param a
	 */
	private void generateWhat(Advice a) {
		if (a.e.what != null)
			out.print(" [" + a.e.what + "]");
	}

	/**
	 * @param a
	 */
	private void generateWhy(Advice a) {
		out.print(a.e.why.trim());
	}

	/**
	 * 
	 */
	private void indent() {
		for (int i=0; i<indent_level; i++)
			out.print(IDENT);
	}
}