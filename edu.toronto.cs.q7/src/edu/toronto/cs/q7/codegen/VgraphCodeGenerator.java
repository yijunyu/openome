/*
 * Created on Jan 27, 2005
 */
package edu.toronto.cs.q7.codegen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.Effect;
/**
 * @author Yijun Yu
 */
public class VgraphCodeGenerator extends TelosCodeGenerator {

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

		public String toString() {
			String s;
			s = "Token Element_" + id + "\n     IN "
					+ (isSoftGoal ? (isOperationalization? "NFROperationalization": "NFRSoftgoal") : "Goal")
					+ "\n     WITH \n         attribute, name\n        : \""
					+ name + "\"\n" + decompositions + "END\n";
			return s;
		}
		public void serialize() {
			serialize_the_token(id, false);
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

		public String toString() {
			String s;
			s = "Token Link_" + id + "\n" + "    IN "  
				+ (isDecomposition()? op + "Contribution": "NFR" + op + "Correlation") 
					+ "\n"
					+ "    WITH\n" + "       attribute, name\n          : \""
					+ op + "\"\n"
					+ "       attribute, to\n              : Element_"
					+ from.id + "\n"
					+ "       attribute, from\n              : Element_"
					+ to.id + "\nEND\n";
			return s;
		}
		
		public void serialize() {
			serialize_the_token(id, true);
		}
	}

	private ArrayList advices;

	Hashtable elements = new Hashtable();

	Hashtable links = new Hashtable();

	ArrayList serialized_tokens = new ArrayList();

	Hashtable goals = new Hashtable();

	private PrintStream out = System.out;

	/**
	 * @param a:
	 *            advices
	 */
	public VgraphCodeGenerator(ArrayList a) {
		super(a);
	}

	private String serialized_view = "";

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
		serialized_view += "Token SerializedView_0\n"
				+ "    IN SerializedView\n" + "    WITH\n";
		for (Iterator i = advices.iterator(); i.hasNext();) {
			Advice a = (Advice) i.next();
			generateGoalModel(null, a);
		}
		String TELOS_CLASS_MODEL = "";
		TELOS_CLASS_MODEL += get_file_contents("projects/telos/vgraph.tel");
		for (Iterator i = serialized_tokens.iterator(); i.hasNext();) {
			String s = (String) i.next();
			out.println(s);
		}
		for (Enumeration i = links.keys(); i.hasMoreElements();) {
			Link s = (Link) links.get(i.nextElement());
			out.println(s.toString());
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
		for (Enumeration i = elements.keys(); i.hasMoreElements();) {
			String s;
			Element g = (Element) elements.get(i.nextElement());
			s = g.toString();
			out.println(s);
		}
		out.print(serialized_view + "END\n");
		out.print(TELOS_CLASS_MODEL);
		System.out.println("There are " + links.size() + " links.");
		System.out.println("There are " + goals.size() + " goals.");
		System.out.println("There are " + advices.size() + " advices.");
	}

	/**
	 * @param file
	 * @return the content of the file
	 */
	private String get_file_contents(String file) {
		String string = "";
		try {
			FileReader i = new FileReader(new File(file));
			try {
				char ibuf[] = new char[100000];
				i.read(ibuf);
				string = new String(ibuf).trim();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return string;
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
		serialize_the_token(id, false);
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
					serialize_the_token(m, false);
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
		serialize_the_token(linkid, true);
		pg.decompositions += "        attribute, links\n             : Link_"
				+ linkid + "\n";
		elements.put(parent, pg);
		g.decompositions += "        attribute, links\n             : Link_"
				+ linkid + "\n";
		elements.put(a, g);
	}

	/**
	 * @param linkid
	 */
	private void serialize_the_token(int id, boolean isLink) {
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
						+ "          attribute, expanded\n            : 0\n"
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
		return "projects/telos/vgraph.tel";
	}
}