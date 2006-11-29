package it.unitn.goal_analysis.graph_creation; 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.MissingResourceException;

/**
 * This class describes a relation type, namely, a continuous relation type; 
 * it inherits from the RelType class and delegates the solution for a 
 * relation to the Solver class. It actually contains two such solvers 
 * because we have decided to split the propagation for the S and the D 
 * labels
 */



public class ContinuousRelType extends RelType {

	/**
	 * 
	 * @uml.property name="satSolver"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private final Solver satSolver; // solver for the sat. side of propagation

	/**
	 * 
	 * @uml.property name="denSolver"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private final Solver denSolver; // solver for the den. side of propagation

    private final String myName; 
    // keep track of the (static) objects created
    private static LinkedList relTypePool = new LinkedList();
    // !!!
    static public final String magicToken = "%";

	/**
	 * 
	 * @uml.property name="aND"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	// static objects!!
	static final ContinuousRelType AND = new ContinuousRelType(
		new ContinuousCalcProductSolver(false),
		new ContinuousCalcSumSolver(true),
		"AND");

	/**
	 * 
	 * @uml.property name="oR"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final ContinuousRelType OR = new ContinuousRelType(
		new ContinuousCalcSumSolver(false),
		new ContinuousCalcProductSolver(true),
		"OR");

	/**
	 * 
	 * @uml.property name="pLUS"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final ContinuousRelType PLUS = new ContinuousRelType(
		new ContinuousCalcCTrivSolver(false),
		new ContinuousCalcPTrivSolver(true),
		"+");

	/**
	 * 
	 * @uml.property name="mINUS"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final ContinuousRelType MINUS = new ContinuousRelType(
		new ContinuousCalcPTrivSolver(false),
		new ContinuousCalcCTrivSolver(false),
		"-");

	/**
	 * 
	 * @uml.property name="sTAR"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final ContinuousRelType STAR = new ContinuousRelType(
		new ContinuousCalcPTrivSolver(false),
		new ContinuousCalcCTrivSolver(true),
		"*");

	/**
	 * 
	 * @uml.property name="sLASH"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final ContinuousRelType SLASH = new ContinuousRelType(
		new ContinuousCalcCTrivSolver(true),
		new ContinuousCalcPTrivSolver(true),
		"/");

    private ContinuousRelType(Solver aSatSolver,
			      Solver aDenSolver, String aName) {
	satSolver = aSatSolver;
	denSolver = aDenSolver;
	myName    = aName;
	relTypePool.add(this);
    }
    
    static private float parseName(String aName)
	throws MissingResourceException {
	int pos = aName.indexOf(magicToken);
	if (pos == -1) return 1.0f;
	float par = Float.parseFloat(aName.substring(pos+1));
	if (par < 0.0 || par > 1.0)
	    throw new MissingResourceException
		("Relation type parameter not in [0.0,1.0]",
		 getClassName(), aName.substring(pos+1));
	return par;
    }

    private static String getClassName() {
	return relTypePool.getFirst().getClass().getName();
    }

    String getName() {
	return myName;
    }

    // due solver, due metodi

    Label solveForS(Node parentNode, LinkedList childNodes) {
	return satSolver.solve(parentNode, childNodes);
    }

    Label solveForD(Node parentNode, LinkedList childNodes) {
	return denSolver.solve(parentNode, childNodes);
    }

    static final RelType findRelType(String name)
	throws MissingResourceException {
	for (Iterator relTypeIt = relTypePool.iterator(); 
	     relTypeIt.hasNext();) {
	    RelType aRelType = (RelType)relTypeIt.next();
	    if (aRelType.getName().compareTo(name) == 0) 
		return aRelType;
	}
	// non ancora trovato?
	int pos = name.indexOf(magicToken);
	if (pos > 0) {
	    float weight = parseName(name);
	    ContinuousRelType aRelType =
		(ContinuousRelType)findRelType(name.substring(0,pos));
	    ContinuousSolver newSat = (ContinuousSolver)(aRelType.satSolver);
	    ContinuousSolver newDen = (ContinuousSolver)(aRelType.denSolver);
	    if (! (newSat.needsWeight() || newDen.needsWeight()))
		return aRelType; // stardobo!
	    try {
		if (newSat.needsWeight())
		    newSat = newSat.cloneWithWeight(weight);
		if (newDen.needsWeight())
		    newDen = newDen.cloneWithWeight(weight);
	    } catch(CloneNotSupportedException e) {
		System.out.println
		    ("Trying to clone a continuous solver without"
		     + "a reason: " + e.toString() + "\n");
		return aRelType;
	    }
	    return new ContinuousRelType(newSat, newDen, name);
	}
	// allora basta!
	throw new MissingResourceException
	    ("cannot resolve " + name + " into relation type", getClassName(), name);
    } 


    public static void main(String[] args) {
	findRelType("OR%0.7");
	findRelType("+%0.7");
	System.out.println("Available " + getClassName());
	for (Iterator relTypeIt = relTypePool.iterator(); 
	     relTypeIt.hasNext();) {
	    ContinuousRelType aRelType = (ContinuousRelType)relTypeIt.next();
	    String s1 = aRelType.satSolver.getClass().getName();
	    String s2 = aRelType.denSolver.getClass().getName();
	    int x1 = s1.lastIndexOf(".") + 1;
	    int x2 = s2.lastIndexOf(".") + 1;
	    System.out.println("("  
			       + s1.substring(x1)
			       + aRelType.satSolver.getParameter()
			       + " - "
			       + s2.substring(x2)
			       + aRelType.denSolver.getParameter()
			       + ") "
			       + aRelType.getName());
	}
    }

}
