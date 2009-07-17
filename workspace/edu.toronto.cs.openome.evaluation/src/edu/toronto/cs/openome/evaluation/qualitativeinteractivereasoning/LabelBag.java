package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.Vector;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

public class LabelBag {
	private Vector<Object> bag;
	
	public LabelBag() {
		bag = new Vector<Object>();
	}

	public void addToBag(Intention i, EvaluationLabel l) {
		Object [] anArray = new Object[2];
		
		anArray[0] = i;
		anArray[1] = l;
		
		bag.add(anArray);		
	}
}
