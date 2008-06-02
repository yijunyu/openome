package it.unitn.goal_analysis.graph_creation; 
import java.util.LinkedList;

/**
 */



final class DiscreteCalcPTrivSolver extends Solver {
    DiscreteCalcPTrivSolver(boolean param) {
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
	return getOldLabel(parentNode);
    }
}
