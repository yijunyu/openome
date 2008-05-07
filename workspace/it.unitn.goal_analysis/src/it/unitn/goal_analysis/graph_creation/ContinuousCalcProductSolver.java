package it.unitn.goal_analysis.graph_creation; 
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The ContinuousCalcProductSolver class calculates the minimum of the labels
 * of its children
 */

final class ContinuousCalcProductSolver extends ContinuousSolver {
    ContinuousCalcProductSolver(boolean param) {
	super(param, 1.0f);
    }

    Label solve(Node parentNode, LinkedList childNodes) {
	// returns ????
	ContinuousLabel productLabel = ContinuousLabel.TOTAL; 
	for (Iterator nodeIt = childNodes.iterator(); nodeIt.hasNext();) {
	    Label tempLabel = getOldLabel((Node)nodeIt.next());
	    productLabel = productLabel.product((ContinuousLabel)tempLabel);
	}
	return productLabel;
    }
    
}
