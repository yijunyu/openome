package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Vector;

import org.sat4j.core.VecInt;
import org.sat4j.specs.IteratorInt;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;

public class DecompositionLinkAxioms extends LinkAxioms {
	

	public DecompositionLinkAxioms(Vector<Intention> sources, Intention targ,
			Vector<Link> l, DualHashMap<Integer, Intention> dhm) {
		super(sources, targ, l, dhm);
		
	}
	
	
	
	public void createForwardClauses() {
		System.out.println("Creating Forward Clauses for Decomposition");
		findIndexes();
		
		//Forward:
		//(For all i  and S(ei)) -> S(e)
		forwardClauses.addAll(addAndImplication(sourceIndexes, tIndex));
		
		//(For all i and PS(ei)) -> PS(e)
		VecInt sourceIndexes2 = incrementAll(sourceIndexes);
		forwardClauses.addAll(addAndImplication(sourceIndexes2, tIndex + 1));
		
		//((for all i or U(ei)) and (for all k not i PS(ek)) -> U(e)
		int [] ar = {1};
		forwardClauses.addAll(allButImplicationForward(2, 1, ar, 1));
		
		//((for all i or C(ei)) and (for all k not i not PD(ek)) -> C(e)
		int [] ar2 = {4};
		forwardClauses.addAll(allButImplicationForward(3, 1, ar2, -1));
		
		//(for all i or PD(ei) -> PD(e)
		IteratorInt it = sourceIndexes.iterator();
		while (it.hasNext()) {
			forwardClauses.addAll(addAndImplication(it.next()+ 4, tIndex + 4));
		}
		
		//(for all i or D(ei) -> D(e)
		it = sourceIndexes.iterator();
		while (it.hasNext()) {
			forwardClauses.addAll(addAndImplication(it.next()+ 5, tIndex + 5));
		}
	}
	
	
	
	public void createBackwardClauses() {
		System.out.println("Creating Backward Clauses for Decomposition");
		findIndexes();
		
		/*Backward
		* S(a) -> S(b)
		* PS(a) -> PS(b)
		* U(a) -> U(b)	 
		* C(a) -> C(b)
		* PD(a) -> PD(b)	 
		* D(a) -> D(b)
		*/
		//Backward:
		//S(e) -> (For all i  and S(ei))
		backwardClauses.addAll(addAndImplication(tIndex, sourceIndexes));
		
		//(For all i and PS(ei)) -> PS(e)
		VecInt sourceIndexes2 = incrementAll(sourceIndexes);
		backwardClauses.addAll(addAndImplication(tIndex + 1, sourceIndexes2));
		
		//U(e) -> ((for all i or U(ei)) and (for all k not i PS(ek))
		int [] ar = {3,4};
		backwardClauses.addAll(allButImplicationBackward(2, 1, ar, -1));
		/*
		//((for all i or C(ei)) and (for all k not i not PD(ek)) -> C(e)
		int [] ar2 = {4};
		forwardClauses.addAll(allButImplicationForward(3, 1, ar2, -1));
		
		//(for all i or PD(ei) -> PD(e)
		IteratorInt it = sourceIndexes.iterator();
		while (it.hasNext()) {
			forwardClauses.addAll(addAndImplication(it.next()+ 4, tIndex + 4));
		}
		
		//(for all i or D(ei) -> D(e)
		it = sourceIndexes.iterator();
		while (it.hasNext()) {
			forwardClauses.addAll(addAndImplication(it.next()+ 5, tIndex + 5));
		}*/
	}
	

}
