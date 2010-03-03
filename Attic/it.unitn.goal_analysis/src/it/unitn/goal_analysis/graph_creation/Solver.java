package it.unitn.goal_analysis.graph_creation; 
import java.util.LinkedList;

// Make a simple abstract class or interface that doesn't force (since 
// it can't) the "singletonness" in its heirs...

abstract class Solver {
    private boolean parameter;

    Solver(boolean param) {
	parameter = param;
    }

    abstract Label solve(Node parentNode, LinkedList childNodes);

    void mustHaveExactlyOneChild(LinkedList childNodes) {
	if (childNodes.size() != 1)
	    throw new UnsupportedOperationException
		("children list of " + this.getClass().getName() 
		 + " does not contain exactly one element");
    }

	/**
	 * 
	 * @uml.property name="parameter"
	 */
	String getParameter() {
		return (parameter ? "(T)" : "(F)");
	}

    boolean getParameterValue() {
	return parameter;
    }

    /*
    Label getLabel(Node aNode) {
	if (parameter)
	    return aNode.getDenLabel();
	else 
	    return aNode.getSatLabel();
    }

    */

    Label getOldLabel(Node aNode) {
	if (parameter)
	    return aNode.getOldDenLabel();
	else 
	    return aNode.getOldSatLabel();
    }

}
    
