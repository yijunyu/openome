package edu.toronto.cs.openome.evaluation.reasoning;

import edu.toronto.cs.openome_model.Model;

public class InteractiveQualReasoner implements Reasoner {

	private Model model;
	
	@Override
	public void reason(Model m) {
		model = m;

	}

}
