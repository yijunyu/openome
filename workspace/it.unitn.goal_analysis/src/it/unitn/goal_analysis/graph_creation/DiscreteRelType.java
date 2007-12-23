package it.unitn.goal_analysis.graph_creation; 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.MissingResourceException;

/**
 * This class describes a relation type, namely, a discrete relation type; 
 * it inherits from the RelType class and delegates the solution for a 
 * relation to the Solver class. It actually contains two such solvers 
 * because we have decided to split the propagation for the S and the D 
 * labels
 */



class DiscreteRelType extends RelType {

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

	/**
	 * 
	 * @uml.property name="aND"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	// static objects!!
	static final DiscreteRelType AND = new DiscreteRelType(
		new DiscreteCalcMinSolver(false),
		new DiscreteCalcMaxSolver(true),
		"AND");

	/**
	 * 
	 * @uml.property name="oR"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType OR = new DiscreteRelType(
		new DiscreteCalcMaxSolver(false),
		new DiscreteCalcMinSolver(true),
		"OR");

	/**
	 * 
	 * @uml.property name="pLUS"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType PLUS = new DiscreteRelType(
		new DiscreteCalcPartSolver(false),
		new DiscreteCalcPTrivSolver(true),
		"+");

	/**
	 * 
	 * @uml.property name="pLUSPLUS"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType PLUSPLUS = new DiscreteRelType(
		new DiscreteCalcCTrivSolver(false),
		new DiscreteCalcPTrivSolver(true),
		"++");

	/**
	 * 
	 * @uml.property name="mINUS"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType MINUS = new DiscreteRelType(
		new DiscreteCalcPTrivSolver(false),
		new DiscreteCalcPartSolver(false),
		"-");

	/**
	 * 
	 * @uml.property name="mINUSMINUS"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType MINUSMINUS = new DiscreteRelType(
		new DiscreteCalcPTrivSolver(false),
		new DiscreteCalcCTrivSolver(false),
		"--");

	/**
	 * 
	 * @uml.property name="sTAR"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType STAR = new DiscreteRelType(
		new DiscreteCalcPTrivSolver(false),
		new DiscreteCalcPartSolver(true),
		"*");

	/**
	 * 
	 * @uml.property name="sTARSTAR"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType STARSTAR = new DiscreteRelType(
		new DiscreteCalcPTrivSolver(false),
		new DiscreteCalcCTrivSolver(true),
		"**");

	/**
	 * 
	 * @uml.property name="sLASH"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType SLASH = new DiscreteRelType(
		new DiscreteCalcPartSolver(true),
		new DiscreteCalcPTrivSolver(true),
		"/");

	/**
	 * 
	 * @uml.property name="sLASHSLASH"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteRelType SLASHSLASH = new DiscreteRelType(
		new DiscreteCalcCTrivSolver(true),
		new DiscreteCalcPTrivSolver(true),
		"//");

    private DiscreteRelType(Solver aSatSolver, 
			    Solver aDenSolver, String aName) {
	satSolver = aSatSolver;
	denSolver = aDenSolver;
	myName = aName;
	relTypePool.add(this);
    }

    String getName() {
	return myName;
    }

    private static String getClassName() {
	return relTypePool.getFirst().getClass().getName();
    }

    // due solver, due metodi

    Label solveForS(Node parentNode, LinkedList childNodes) {
	return satSolver.solve(parentNode, childNodes);
    }

    Label solveForD(Node parentNode, LinkedList childNodes) {
	return denSolver.solve(parentNode, childNodes);
    }



    static RelType findRelType(String name) 
    throws MissingResourceException {
	for (Iterator relTypeIt = relTypePool.iterator(); 
	     relTypeIt.hasNext();) {
	    RelType aRelType = (RelType)relTypeIt.next();
	    if (aRelType.getName().compareTo(name) == 0) 
		return aRelType;
	}
	throw new MissingResourceException
	    ("cannot resolve string into relation type", getClassName(), name);
    }



    public static void main(String[] args) {
	System.out.println("Available " + getClassName());
	for (Iterator relTypeIt = relTypePool.iterator(); 
	     relTypeIt.hasNext();) {
	    DiscreteRelType aRelType = (DiscreteRelType)relTypeIt.next();
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
