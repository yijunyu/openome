package edu.toronto.cs.openome.evaluation.commands;

import java.util.Collection;
import org.eclipse.emf.common.command.Command;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

public class SetQualitativeEvaluationLabelCommand implements Command {
	private Intention intention;
	private EvaluationLabel label;
	
	public SetQualitativeEvaluationLabelCommand(Intention i, EvaluationLabel l) {
		intention = i;
		label = l;
	}

	@Override
	public boolean canExecute() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Command chain(Command arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute() {
		
		intention.setQualitativeReasoningCombinedLabel(label);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<?> getAffectedObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "a label";
	}

	@Override
	public Collection<?> getResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
