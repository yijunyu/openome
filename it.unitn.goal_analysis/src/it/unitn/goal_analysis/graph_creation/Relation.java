/** 
 * Relation class  
 *
 * @author Eleonora Nicchiarelli, 7 Jan 2002
 * @version 0.1
 */

package it.unitn.goal_analysis.graph_creation; 
import java.util.Iterator;
import java.util.LinkedList;

public class Relation {

	/**
	 * 
	 * @uml.property name="myType"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private RelType myType; // if AND, OR, +, -...

	/**
	 * 
	 * @uml.property name="parent"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private Node parent; // parent node for this relation

    private LinkedList children;   // children nodes for this relation 

    /** 
     * 
     */     
    public Relation(RelType theType, Node theParent, LinkedList theChildren) { 
	myType = theType;
	parent = theParent;
	children = theChildren;
    };

    
    /**
     * uses a previously created LinkedList since we can't call a new()
     * inside a this()?  
     */
    Relation(RelType theType, Node theParent, Node theChild) { 
	this(theType, theParent, mkLinkedList(theChild));
    };

    /**
     * makes a LinkedList out of a single node
     */
    private static LinkedList mkLinkedList(Node aNode) {
	LinkedList aList = new LinkedList();
	aList.add(aNode);
	return aList;
    }


    protected Object clone() 
	throws CloneNotSupportedException {
	return this;
    }



    /**
     * calls the solveForS method for this relation type
     */
    Label solveForS() {
	return getType().solveForS(getParent(), getChildren());
    }



    /**
     * calls the solveForS method for this relation type
     */
    Label solveForD() {
	return getType().solveForD(getParent(), getChildren());
    }

    /**
     * 
     */
    String getName() {
	return getType().getName();
    }

    /**
     * 
     */
    private RelType getType() {
	return myType;
    }

	/**
	 * 
	 * @uml.property name="parent"
	 */
	// const!
	Node getParent() {
		return parent;
	}

	/**
	 * 
	 * @uml.property name="children"
	 */
	// const!
	LinkedList getChildren() {
		return children;
	}

    
    /**
     * 
     */
    void setParentNode(Node aNode) {
	parent = aNode;
    }

    /**
     * 
     */
    void setChildrenNodes(LinkedList theChildren) {
	children = theChildren;
    }

    /**
     * 
     */
    void addChildNode(Node aNode) {
	children.add(aNode);
    }

    /**
     * 
     */
    void addChildrenNodes(LinkedList additionalChildren) {
	children.addAll(additionalChildren);
    }

    /**
     * 
     */
    // sets the proper links with the nodes involved in this relation 
    // after the construction of the relation 
    public void informNodes() {
	// tells the parent it is the parent
	parent.addToParenthood(this);
	// tells the children they are the children
	for (Iterator nodeIt = children.iterator();
	     nodeIt.hasNext();) 
	    ((Node)nodeIt.next()).addToChildhood(this);
    }

    /*    public static void main(String[] args) {
	  }
    */
	/**
	 * Method getClone.
	 */
	public Object getClone() throws CloneNotSupportedException {
		return clone();
	}
}
///:~

    /**
     * 
     */
