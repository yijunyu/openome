package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Vector;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;

public class MeansEndsLinkAxioms extends LinkAxioms {

	public MeansEndsLinkAxioms(Vector<Intention> sources, Intention targ,
			Vector<Link> l, DualHashMap<Integer, Intention> dhm) {
		super(sources, targ, l, dhm);
		// TODO Auto-generated constructor stub
	}
	
	public void createForwardClauses() {
		System.out.println("Creating Forward Clauses for Dependency");
		Integer intTIndex = (Integer) intentionMap.getInverse(target);
		int tIndex = intTIndex.intValue();
		
		Integer intSIndex = (Integer) intentionMap.getInverse(sourceInts.lastElement());
		int sIndex = intSIndex.intValue();
		
		//Forward:
		//S(b) -> S(a)
		//!S(b) or S(a)
		//PS(b) -> PS(a)
		//!PS(b) or PS(a)
		//U(b) -> U(a)	 
		//!U(b) or U(a)
		//C(b) -> C(a)
		//!C(b) or C(a)
		//PD(b) -> PD(a)	
		//!PD(b) or PD(a)
		//D(b) -> D(a)
		//!D(b) or D(a)
		//for (int i = 0; i < 6; i++) {
		//	forwardClauses.add(addImplication(sIndex + i, tIndex + i));
		//}
		
	}
	
	public void createBackwardClauses() {
		System.out.println("Creating Backward Clauses for Dependency");
		Integer intTIndex = (Integer) intentionMap.getInverse(target);
		int tIndex = intTIndex.intValue();
		
		Integer intSIndex = (Integer) intentionMap.getInverse(sourceInts.lastElement());
		int sIndex = intSIndex.intValue();
		
		/*Backward
		* S(a) -> S(b)
		* PS(a) -> PS(b)
		* U(a) -> U(b)	 
		* C(a) -> C(b)
		* PD(a) -> PD(b)	 
		* D(a) -> D(b)
		*/
		//for (int i = 0; i < 6; i++) {
		//	backwardClauses.add(addImplication(tIndex + i, sIndex + i));
		//}
	}

}
