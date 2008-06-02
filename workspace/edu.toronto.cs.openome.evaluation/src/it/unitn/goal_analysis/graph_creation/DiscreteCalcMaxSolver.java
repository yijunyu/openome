package it.unitn.goal_analysis.graph_creation; 
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The DiscreteCalcMaxSolver class returns the max label of the children
 */

final class DiscreteCalcMaxSolver extends Solver {
    DiscreteCalcMaxSolver(boolean param) {
	super(param);
    }

    Label solve(Node parentNode, LinkedList childNodes) {
	// returns the maximum of the labels of the children
	Label maxLabel = DiscreteLabel.NO; // start from min label 
	for (Iterator nodeIt = childNodes.iterator(); nodeIt.hasNext();) {
	    Label tmpLabel = getOldLabel((Node)nodeIt.next());
	    if (maxLabel.isLessThan(tmpLabel)) {
		maxLabel = tmpLabel; // 
	    }
	}
	return maxLabel;
    }

}
