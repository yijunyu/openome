package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Collection;
import java.util.Vector;

import org.sat4j.core.VecInt;
import org.sat4j.specs.IteratorInt;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;

public class ContributionLinkAxioms extends LinkAxioms {
	

	public ContributionLinkAxioms(Vector<Intention> sources, Intention targ,
			Vector<Link> l, DualHashMap<Integer, Intention> dhm) {
		super(sources, targ, l, dhm);
		
	}
	
	
	
	public void createForwardClauses() {
		//System.out.println("Creating Forward Clauses for Contribution");
		findIndexes();
		//System.out.println("found indexes");
		
		//if (intentionMap != null) {
		//	intentionMap.print();
		//}
		//else {
		//	System.out.println("map is null");
		//}
		//System.out.println(sourceIndexes.toString());
		
		int sIndex = sourceIndexes.last();

		//U(e1) -> U(e)
		forwardClauses.addAll(addAndImplication(sIndex + 2, tIndex + 2));
		
		//C(e1) -> C(e)
		forwardClauses.addAll(addAndImplication(sIndex + 3, tIndex + 3));
		
		//for (String str : getForwardClauses()) {
		//	System.out.println(str);
		//}
	}
	
	public void createBackwardClauses() {
		System.out.println("Creating Backward Clauses for Contribution");
		findIndexes();
		
		int sIndex = sourceIndexes.last();

		//U(e1) -> U(e)
		backwardClauses.addAll(addAndImplication(tIndex + 2, sIndex + 2));
		
		//C(e1) -> C(e)
		backwardClauses.addAll(addAndImplication(tIndex + 3, sIndex + 3));
		
	}

}
