/**
 * 
 */
package edu.toronto.cs.openome.evaluation.reasoning;

import org.eclipse.emf.common.command.CommandStack;

import edu.toronto.cs.openome.evaluation.commands.SetQualitativeEvaluationLabelCommand;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;

/**
 * @author jenhork
 *
 */
public class Reasoner {
	protected ModelImpl model;
	protected CommandStack cs;
	
	public Reasoner() {
		model = null;
		cs = null;
	}
	
	public Reasoner(ModelImpl mod, CommandStack com) {
		model = mod;
		cs = com;	
	}
		
	public void reason() {
		//This one does nothing, should be overridden
	}
	
	public void setQualCombinedLabel(Intention i, EvaluationLabel l) {
		SetQualitativeEvaluationLabelCommand setLabel = new SetQualitativeEvaluationLabelCommand(i, l);
		
		cs.execute(setLabel);
	}
	
}
