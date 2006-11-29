package it.unitn.goal_analysis.graph_creation; 
import java.util.MissingResourceException;

/**
 * This class implements a label for a node that can take continuous 
 * values; it extends the base class Label [or is it an interface? and 
 * what does it specify? ]
 */


class ContinuousLabel extends Label implements Cloneable {
    private final float myValue;      // for easy comparisons between labels
    private final String myName;    // name of the label, for its displaying

	/**
	 * 
	 * @uml.property name="nO"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	// static objects ...
	static final ContinuousLabel NO = new ContinuousLabel(0.0f);

	/**
	 * 
	 * @uml.property name="pARTIAL"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final ContinuousLabel PARTIAL = new ContinuousLabel(0.5f);

	/**
	 * 
	 * @uml.property name="tOTAL"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	static final ContinuousLabel TOTAL = new ContinuousLabel(1.0f);

    /* This constructor takes a string that represents the label as 
     * seen by the client
     * impossible to create two labels with the same numeric value... 
     * of course it is still possible to create two labels with different
     * numeric value but identical name, resulting in a complete 
     * mess in the results. What should be the access modifier 
     * for this constructor?    
     */
    private ContinuousLabel(float aValue) {  
	myValue = aValue;
	myName = String.valueOf(myValue);
    }

    protected Object clone() 
	throws CloneNotSupportedException {    
	return this;
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
    private float getValue() {
	return myValue;
    }

    /* Comparison method
     */
    
    public int compareTo(Object aLabel) {
	ContinuousLabel tempLabel = (ContinuousLabel) aLabel; // ????
	// now use the comparison between floats
	float diff = tempLabel.getValue() - this.getValue(); 
	if (Math.abs(diff) < Float.MIN_VALUE)
	    return 0;
	else if (diff > 0.0) 
	    return -1;
	else return 1;
    }
    
    static Label findLabel(String name) 
	throws MissingResourceException {
	if (name.compareTo("MINIMUM") == 0) return NO;
	if (name.compareTo("NO")      == 0) return NO;
	if (name.compareTo("PARTIAL") == 0) return PARTIAL;
	if (name.compareTo("TOTAL")   == 0) return TOTAL;
	if (name.compareTo("0.0")     == 0) return NO;
	if (name.compareTo("1.0")     == 0) return TOTAL;
	if (name.compareTo("0.5")     == 0) return PARTIAL;

	float value = Float.parseFloat(name);
	if (value < 0.0 || value > 1.0 )
	    throw new MissingResourceException("Label not in [0,1]", 
					       " ContinuousLabel ",
					       name);
	return new ContinuousLabel(value); 
    }
 
    ContinuousLabel sum (final ContinuousLabel aLabel) {
	float p1 = this.getValue();
	float p2 = aLabel.getValue();
	return ((ContinuousLabel)findLabel("" + (p1 + p2 - p1 * p2))); 
    }


    ContinuousLabel product (final ContinuousLabel aLabel) {
	float p1 = this.getValue();
	float p2 = aLabel.getValue();
	return ((ContinuousLabel)findLabel("" + (p1 * p2))); 
    }


    ContinuousLabel product (final float aWeight) {
	float p1 = this.getValue();
	return ((ContinuousLabel)findLabel("" + (p1 * aWeight))); 
    }


    
}
