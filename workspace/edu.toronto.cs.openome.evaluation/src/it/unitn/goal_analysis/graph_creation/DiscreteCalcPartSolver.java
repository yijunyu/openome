package it.unitn.goal_analysis.graph_creation; 
import java.util.LinkedList;

/**
 */

final class DiscreteCalcPartSolver extends Solver {
    DiscreteCalcPartSolver(boolean param) {
	super(param);
    }

    // No more duplicated methods. Besides, 
    // in these cases the list of children nodes is composed of 
    // only one element, therefore we check that this condition is
    // true, and if not we throw an exception. 

    Label solve(Node parentNode, LinkedList childNodes) {
	// check that the children list is really made up of one
	// single element: a method in Solver throws the appropriate (?)
	// exception
	mustHaveExactlyOneChild(childNodes);
	Label aLabel = getOldLabel((Node)childNodes.getFirst());
	// now we know that we have exactly one child 
	// we can't make a switch so ...
	if (aLabel == DiscreteLabel.TOTAL)
	    return DiscreteLabel.PARTIAL;
	else return aLabel;
    }

}
