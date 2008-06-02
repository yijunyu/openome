package it.unitn.goal_analysis.graph_creation; 
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The DiscreteCalcMinSolver class calculates the minimum of the labels
 * of its children
 */

final class DiscreteCalcMinSolver extends Solver {
    DiscreteCalcMinSolver(boolean param) {
	super(param);
    }

    Label solve(Node parentNode, LinkedList childNodes) {
	// returns the minimum of the labels of the children
	Label minLabel = DiscreteLabel.TOTAL; // start from max label 
	for (Iterator nodeIt = childNodes.iterator(); nodeIt.hasNext();) {
	    Label tmpLabel = getOldLabel((Node)nodeIt.next());
	    if (minLabel.isGreaterThan(tmpLabel)) {
		minLabel = tmpLabel; // 
	    }
	}
	return minLabel;
    }

}
