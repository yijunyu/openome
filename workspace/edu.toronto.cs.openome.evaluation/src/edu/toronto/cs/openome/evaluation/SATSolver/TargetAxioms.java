package edu.toronto.cs.openome.evaluation.SATSolver;

import org.sat4j.core.VecInt;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

public class TargetAxioms extends IntentionAxioms {

	public TargetAxioms(Intention t, DualHashMap<Integer, Intention> dhm) {
		super(t, dhm);
	}

	@Override
	public void createAllClauses() {
		findIndexes();
		
		VecInt vi = new VecInt();
		EvaluationLabel label = target.getQualitativeReasoningCombinedLabel();
		if (label == EvaluationLabel.SATISFIED)
			vi.push(tIndex);
		if (label == EvaluationLabel.WEAKLY_SATISFIED)
			vi.push(tIndex+1);
		if (label == EvaluationLabel.UNKNOWN)
			vi.push(tIndex+2);
		if (label == EvaluationLabel.CONFLICT)
			vi.push(tIndex+3);
		if (label == EvaluationLabel.WEAKLY_DENIED)
			vi.push(tIndex+4);
		if (label == EvaluationLabel.DENIED)
			vi.push(tIndex+5);
		
		vi.push(0);
		
		clauses.add(vi);		

	}

}
