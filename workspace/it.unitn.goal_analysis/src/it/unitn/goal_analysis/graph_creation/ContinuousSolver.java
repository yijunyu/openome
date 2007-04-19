package it.unitn.goal_analysis.graph_creation; 

abstract class ContinuousSolver extends Solver {
    private float weight;

    ContinuousSolver(boolean param, float wgt) {
	super(param);
	weight = wgt;
    }

    String getParameter() {
	return (super.getParameter() +
		(needsWeight() ? ("[" + getWeight() + "]") : ""));
    }

	/**
	 * 
	 * @uml.property name="weight"
	 */
	float getWeight() {
		return weight;
	}

    boolean needsWeight() {
	return false;
    }

    ContinuousSolver cloneWithWeight(float wgt)
	throws CloneNotSupportedException {
	throw new CloneNotSupportedException
	    ("\nTrying to clone " + this.getClass().getName() +
	     " with weight " + wgt + "\nThis is not the standard clone!\n");
    }
    
}
