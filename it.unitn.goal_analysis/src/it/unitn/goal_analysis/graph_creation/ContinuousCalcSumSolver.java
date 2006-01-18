package it.unitn.goal_analysis.graph_creation; 
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The ContinuousCalcSumSolver class returns the max label of the children
 */

final class ContinuousCalcSumSolver extends ContinuousSolver {
    ContinuousCalcSumSolver(boolean param) {
	super(param, 1.0f);
    }

    Label solve(Node parentNode, LinkedList childNodes) {
	// returns
	ContinuousLabel sumLabel = ContinuousLabel.NO; // start from min label 
	for (Iterator nodeIt = childNodes.iterator(); nodeIt.hasNext();) {
	    Label tempLabel = getOldLabel((Node)nodeIt.next());
	    sumLabel = sumLabel.sum((ContinuousLabel)tempLabel);
	}
	return sumLabel;
    }

}
