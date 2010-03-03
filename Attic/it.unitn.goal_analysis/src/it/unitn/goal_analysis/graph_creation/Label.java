package it.unitn.goal_analysis.graph_creation; 

/** 
 * Interface for the label of a node 
 * @author Eleonora Nicchiarelli, 21 Jan 2002
 * @version 0.1
 */

public abstract class Label implements Comparable {
    public abstract String getName(); // returns the label as a string	
    abstract public int compareTo(Object aLabel);
    //abstract protected Object clone();

    // override of the tremendous compareTo()
    boolean isLessThan(Object aLabel) {
	if (this.compareTo(aLabel) == -1) // <this> is smaller
	    return true;
	else return false;
    } 

    boolean isGreaterThan(Object aLabel) {
	if (this.compareTo(aLabel) == 1) // <this> is greater
	    return true;
	else return false;
    } 

    boolean isEqualTo(Object aLabel) {
	if (this.compareTo(aLabel) == 0) // <this> is equal
	    return true;
	else return false;
    } 
	/**
	 * Method getClone.
	 */
	public Object getClone() throws CloneNotSupportedException {
		return clone();
	}

}
