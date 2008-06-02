package it.unitn.goal_analysis.graph_creation; 
import java.util.LinkedList;

/**
 */

final class ContinuousCalcCTrivSolver extends ContinuousSolver {

    ContinuousCalcCTrivSolver(boolean param) {
	super(param, 1.0f);
    }

    ContinuousCalcCTrivSolver(boolean param, float wgt) {
	super(param, wgt);
    }

    boolean needsWeight() {
	return true;
    }

    ContinuousSolver cloneWithWeight(float wgt) {
	return new ContinuousCalcCTrivSolver(getParameterValue(), wgt);
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
	Label tmpLabel = getOldLabel((Node)childNodes.getFirst());
	return ((ContinuousLabel)tmpLabel).product(getWeight());
    }
}
