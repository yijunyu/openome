package edu.toronto.cs.openome.evaluation.SATSolver;

import org.sat4j.core.VecInt;

import edu.toronto.cs.openome_model.Intention;

public class ConstraintAxioms extends IntentionAxioms {

	public ConstraintAxioms(Intention t, DualHashMap<Integer, Intention> dhm) {
		super(t, dhm);
	}

	@Override
	public void createAllClauses() {
		findIndexes();
		
		//PS(e) -> (not U(e) and not C(e) and not PD(e))
		VecInt vi = new VecInt();
		vi.push((tIndex + 2)*-1);
		vi.push((tIndex + 3)*-1);
		vi.push((tIndex + 4)*-1);
		clauses.addAll(addAndImplication(tIndex + 1, vi));
		
		//PD(e) -> (not U(e) and not C(e) and not PS(e))
		vi = new VecInt();
		vi.push((tIndex + 1)*-1);
		vi.push((tIndex + 2)*-1);
		vi.push((tIndex + 3)*-1);
		clauses.addAll(addAndImplication(tIndex + 4, vi));
		
		//U(e) -> (not C(e) and not PS(e) and not PD(e))
		vi = new VecInt();
		vi.push((tIndex + 1)*-1);
		vi.push((tIndex + 3)*-1);
		vi.push((tIndex + 4)*-1);
		clauses.addAll(addAndImplication(tIndex + 2, vi));
		
		//C(e) -> (not U(e) and not PS(e) and not PD(e))
		vi = new VecInt();
		vi.push((tIndex + 1)*-1);
		vi.push((tIndex + 2)*-1);
		vi.push((tIndex + 4)*-1);
		clauses.addAll(addAndImplication(tIndex + 3, vi));

	}

}
