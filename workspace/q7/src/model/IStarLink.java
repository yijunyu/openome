/*
 * Created on Feb 22, 2005
 */
package model;

import util.Computing;

/**
 * @author Yijun Yu
 */
public class IStarLink {
	public int id;
	public String op;
	public IStarElement from;
	public IStarElement to;
	public IStarLink(String _op, IStarElement _from, IStarElement _to) {
		op = _op;
		from = _from;
		to = _to;
	}
	public boolean isEqual() {
		return op.equalsIgnoreCase("Equal");
	}
	public boolean isOrDecomposition() {
		return op.equalsIgnoreCase("Or") || isEqual();
	}
	public boolean isDecomposition() {
		return op.equalsIgnoreCase("Or") || op.equalsIgnoreCase("And") ||
			isEqual() ;
	}
	public boolean isAndDecomposition() {
		return op.equalsIgnoreCase("And");
	}
	String op2string(String op) {
		if (op.equalsIgnoreCase("And"))
			return "DecompositionLink";
		if (op.equalsIgnoreCase("Or"))
			return "MeansEndsLink";			
		if (op.startsWith("Dep"))
			return "DependencyLink";
		if (op.length() > 4 && (op.startsWith("Help") || op.startsWith("Hurt"))) 
			return op.substring(0, 4) + "Contribution";
		return op + "Contribution";
	}
	String op2name(String op) {
		if (Computing.propertyHolds("q7.model.IStarLink.op2name.ignore-label")) {
			if (op.equalsIgnoreCase("And"))
				return "";
			if (op.equalsIgnoreCase("Or"))
				return "";
		}			
		if (op.equalsIgnoreCase("Help"))
			return "+";
		if (op.equalsIgnoreCase("Hurt"))
			return "-";
		if (op.equalsIgnoreCase("Make"))
			return "++";
		if (op.equalsIgnoreCase("Break"))
			return "--";
		if (op.equalsIgnoreCase("Dep"))
			return "";			
		return op;
	}	
	public String toString() {
		String s;
		s = "Token Link_" + id + "\n" + "    IN IStar"  
			+ op2string(op) 
				+ "\n"
				+ "    WITH\n" + "       attribute, name\n          : \""
				+ op2name(op) + "\"\n"
				+ "       attribute, to\n              : Element_"
				+ from.id + "\n"
				+ "       attribute, from\n              : Element_"
				+ to.id + "\nEND\n";
		return s;
	}
	double degree;
	public double getDegree() {
		return degree;
	}
	public void setDegree(double d) {
		degree = d;
	}
}

