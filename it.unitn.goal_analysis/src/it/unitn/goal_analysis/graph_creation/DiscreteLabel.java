package it.unitn.goal_analysis.graph_creation; 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.MissingResourceException;

/**
 * This class implements a label for a node that can take only discrete 
 * values; it extends the base class Label [or is it an interface? and 
 * what does it specify? ]
 */


class DiscreteLabel extends Label {
    private final int myValue;      // for easy comparisons between labels
    private final String myName;    // name of the label, for its displaying
    // keep track of the (static) objects created
    private static LinkedList labelPool = new LinkedList();

	/**
	 * 
	 * @uml.property name="nO"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	// static objects ...
	static final DiscreteLabel NO = new DiscreteLabel("NO");

	/**
	 * 
	 * @uml.property name="pARTIAL"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteLabel PARTIAL = new DiscreteLabel("PARTIAL");

	/**
	 * 
	 * @uml.property name="tOTAL"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final DiscreteLabel TOTAL = new DiscreteLabel("TOTAL");

    /* This constructor takes a string that represents the label as 
     * seen by the client
     * impossible to create two labels with the same numeric value... 
     * of course it is still possible to create two labels with different
     * numeric value but identical name, resulting in a complete 
     * mess in the results. What should be the access modifier 
     * for this constructor?    
     */
    private DiscreteLabel(String name) {  
	myValue = labelPool.size();
	myName = name;
	labelPool.add(this);
    }
   
    /* Access method for the name, it should return a const....
     * @return the name as a string
     */
    public String getName() {
	return myName;
    }

    /**
     * Access method for the value, hides retrieval
     * @return the value as an int
     */
    private int getValue() {
	return myValue;
    }

    /* Comparison method
     */
    
    public int compareTo(Object aLabel) {
	DiscreteLabel tempLabel = (DiscreteLabel) aLabel; // ????
	// now use the comparison between integers
	if (tempLabel.getValue() < this.getValue())
	    return 1;
	else if (tempLabel.getValue() > this.getValue()) 
	    return -1;
	else return 0;
    }
    
    static Label findLabel(String name) 
	throws MissingResourceException {
	if (name.compareTo("MINIMUM") == 0)
	    name = "NO";
	for (Iterator labelIt = labelPool.iterator(); 
	     labelIt.hasNext();) {
	    DiscreteLabel aLabel = (DiscreteLabel)labelIt.next();
	    if (aLabel.getName().compareTo(name) == 0) 
		return aLabel;
	}
	throw new MissingResourceException
	    ("cannot resolve string into label",
	     labelPool.getFirst().getClass().getName(), name); // DIIIRTY trick
    }

    public static void main(String[] args) {
	System.out.println("Available discrete labels:");
	for (Iterator labelIt = labelPool.iterator(); 
	     labelIt.hasNext();) {
	    DiscreteLabel aLabel = (DiscreteLabel)labelIt.next();	    
	    System.out.println("(" 
			       + aLabel.getValue()
			       + ") "
			       + aLabel.getName());
	}
    }

}
