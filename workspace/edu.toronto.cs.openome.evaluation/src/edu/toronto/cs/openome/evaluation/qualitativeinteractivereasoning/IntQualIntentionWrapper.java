package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.ListIterator;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.IntentionImpl;

public class IntQualIntentionWrapper {
	
	private EvaluationLabel initialEvaluationLabel;
	private Intention intnt;
	private LabelBag lb;
	private boolean toResolve;
	
	public IntQualIntentionWrapper() {
		intnt = null;
		initialEvaluationLabel = EvaluationLabel.NONE;
		lb = new LabelBag();
		toResolve = false;
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
	
	public void resolved() {
		toResolve = false;
	}
	
	public void toResolve() {
		toResolve = true;
	}
	
	public boolean needResolve()  {
		return toResolve;
	}
	
	public void addtoLabelBag(Intention i, EvaluationLabel l) {
		lb.addToBag(i, l);
		
		toResolve = true;
	}
	
	public void printLabelBag() {
		lb.printBag();
	}
	
	public int bagSize() {
		return lb.size();
	}
	
	public ListIterator<Object> bagListIterator() {	
		return lb.listIterator();
	}
	
	public Object[] getFirstFromBag() {
		return (Object[]) lb.getFirst();
	} 

}
