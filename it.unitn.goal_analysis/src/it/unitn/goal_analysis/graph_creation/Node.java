/** 
 * Node class  
 * @author Eleonora Nicchiarelli, 6 Dec 2001
 * @version 0.1
 */

package it.unitn.goal_analysis.graph_creation; 
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.LinkedList;



public class Node implements Cloneable {

	/**
	 * 
	 * @uml.property name="satLabel"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private Label satLabel; // node label for the satisfaction

	/**
	 * 
	 * @uml.property name="denLabel"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private Label denLabel; // node label for the negation

	/**
	 * 
	 * @uml.property name="oldSatLabel"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private Label oldSatLabel; // doubled values for safe propagation

	/**
	 * 
	 * @uml.property name="oldDenLabel"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private Label oldDenLabel; // doubled values for safe propagation

	String name; // Yijun: short hand for the node
	
    private LinkedList parenthood;  // list of  rels. where this node is parent
    private LinkedList childhood;   // list of rels. where this node is child 

    /** 
     * Constructor. Takes discrete or continuous parameters
     */
    public Node(Label aSatLabel, Label aDenLabel, String _name) {
	initSatLabel(aSatLabel);
	initDenLabel(aDenLabel);
	name = _name;
	parenthood = new LinkedList();
	childhood  = new LinkedList();	
    };


    protected Object clone() 
	throws CloneNotSupportedException {
	// addNode(new Node(getLabel(satLabel), getLabel(denLabel)));
	// this only creates a node with empty parenthood & childhood 
	Node newNode = new Node((Label)satLabel.getClone(),(Label)denLabel.getClone(), name);
	for (Iterator relationIt = getParenthood().iterator(); 
	     relationIt.hasNext();)
	    newNode.parenthood.add(((Relation)relationIt.next()).getClone());
	for (Iterator relationIt = getChildhood().iterator(); 
	     relationIt.hasNext();)
	    newNode.childhood.add(((Relation)relationIt.next()).getClone());
	return newNode;
    }

    /**
     * Returns true if any of the new labels (sat or den) has changed 
     * with respect to the old one, false otherwise
     */

    boolean hasChanged() {
	if (getSatLabel().isEqualTo(getOldSatLabel()) &&
	    getDenLabel().isEqualTo(getOldDenLabel()))
	    return false;
	else
	    return true;
    }

    /**
     * Syncs old labels with new labels 
     */

    void syncLabels() {
	syncSatLabel();
	syncDenLabel();
    }

	/**
	 * Reads the S label for this node (the current, that is, new S label) 
	 * @return a thing containing the S label for this node
	 * 
	 * @uml.property name="satLabel"
	 */
	public Label getSatLabel() {
		return satLabel;
	}

	/**
	 * Reads the old S label for this node (not the current label) 
	 * @return a thing containing the OLD S label for this node
	 * 
	 * @uml.property name="oldSatLabel"
	 */
	Label getOldSatLabel() {
		return oldSatLabel;
	}

	/**
	 * Reads the D label for this node (the current, that is, new D label) 
	 * @return a thing containing the D label for this node
	 * 
	 * @uml.property name="denLabel"
	 */
	public Label getDenLabel() {
		return denLabel;
	}

	/**
	 * Reads the old D label for this node (not the current label) 
	 * @return a thing containing the OLD D label for this node
	 * 
	 * @uml.property name="oldDenLabel"
	 */
	Label getOldDenLabel() {
		return oldDenLabel;
	}

    

    /**
     * Checks that two labels are compatible, e.g. that they are both
     * discrete or both continuous (checking that they are instances
     * of the same class). It is called in the set() methods for this 
     * class
     */
    private void checkLabelConsistency(Label newLabel, Label oldLabel)
	throws InvalidParameterException { 
	if (oldLabel == null) return;
	if (newLabel.getClass() != oldLabel.getClass())
	    throw new InvalidParameterException
		("Passed label type" + newLabel.getClass().getName()
		 + " does not match current label type"
		 + oldLabel.getClass().getName());
    }

	/**
	 * checks for label consistency (that is, that the labels are of the same
	 * type, or instances of the same class); then, writes the current
	 * label into the old one, and sets the current as the one being
	 * passed as parameter  
	 * @param aLabel a thing representing the label to be written
	 * 
	 * @uml.property name="satLabel"
	 */
	void setSatLabel(Label aLabel) {
		checkLabelConsistency(aLabel, getSatLabel());
		// stores the current label in the old label field
		oldSatLabel = satLabel;
		// writes in the current label the passed one
		satLabel = aLabel;
	}



    /**
     * by calling twice the set method, writes both in the old and in the 
     * current label the same value (a sort of initial sync)
     */
    private void initSatLabel(Label aLabel) { 
	setSatLabel(aLabel);
	setSatLabel(aLabel);
    }

    /**
     * writes in both the old and the current field the current value 
     * of the label  
     */
    private void syncSatLabel() {
	setSatLabel(getSatLabel());
    }

	/**
	 * checks for label consistency (that is, that the labels are of the same
	 * type, or instances of the same class); then, writes the current
	 * label into the old one, and sets the current as the one being
	 * passed as parameter  
	 * @param aLabel a thing representing the label to be written
	 * 
	 * @uml.property name="denLabel"
	 */
	void setDenLabel(Label aLabel) {
		checkLabelConsistency(aLabel, getDenLabel());
		// stores the current label in the old label field
		oldDenLabel = denLabel;
		// writes in the current label the passed one
		denLabel = aLabel;
	}


    /**
     * by calling twice the set method, writes both in the old and in the 
     * current label the same value (a sort of initial sync)
     */
    private void initDenLabel(Label aLabel) { 
	setDenLabel(aLabel);
	setDenLabel(aLabel);
    }

    /**
     * writes in both the old and the current field the current value 
     * of the label  
     */
    private void syncDenLabel() {
	setDenLabel(getDenLabel());
    }


	
    // adds a relation where this node is parent 
    void addToParenthood(Relation aRelation) {
	parenthood.add(aRelation);
    }

    // removes a relation where this node is parent
    boolean removeFromParenthood(Relation aRelation) {
	return parenthood.remove(aRelation);
    }

    // adds a relation where this node is a child
    void addToChildhood(Relation aRelation) {
	childhood.add(aRelation);
    }

    // removes a relation where this node is a child
    boolean removeFromChildhood(Relation aRelation) {
	return childhood.remove(aRelation);
    }

	/**
	 * 
	 * @uml.property name="parenthood"
	 */
	LinkedList getParenthood() {
		return parenthood;
	}

	/**
	 * 
	 * @uml.property name="childhood"
	 */
	LinkedList getChildhood() {
		return childhood;
	}

    Iterator getFirstInParenthood() {
	return parenthood.iterator();
    }

    Iterator getFirstInChildhood() {
	return childhood.iterator();
    }


    /*    public static void main(String[] args) {
	  }
    */
	}
///:~
