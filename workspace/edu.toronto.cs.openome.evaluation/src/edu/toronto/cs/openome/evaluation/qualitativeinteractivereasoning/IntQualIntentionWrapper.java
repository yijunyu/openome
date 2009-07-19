package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.IntentionImpl;

public class IntQualIntentionWrapper {
	
	protected EvaluationLabel initialEvaluationLabel;
	protected Intention intnt;
	public LabelBag lb;
	
	public IntQualIntentionWrapper() {
		intnt = null;
		initialEvaluationLabel = EvaluationLabel.NONE;
		lb = new LabelBag();
	}
	
	public IntQualIntentionWrapper(Intention i) {
		intnt = i;		
		initialEvaluationLabel = EvaluationLabel.NONE;
		lb = new LabelBag();
	}
	
	public void setInitialEvaluationLabel(EvaluationLabel l) {
		initialEvaluationLabel = l;
	}
	
	public EvaluationLabel getInitialEvaluationLable() {
		return initialEvaluationLabel;
	}
	
	public Intention getIntention() {
		return intnt;
	}
	
	public void setIntention(Intention i) {
		intnt = i;
	}
	

}
