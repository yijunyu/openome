package edu.toronto.cs.openome.evaluation.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.ElementTypeLabelProvider;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.dialogs.SelectionDialog;

import edu.toronto.cs.openome.evaluation.gui.EvalLabelElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.gui.EvaluationDialog;
import edu.toronto.cs.openome.evaluation.gui.LabelBagElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;

public class BackwardHJWindowCommand extends HJWindowCommand {
	
	public BackwardHJWindowCommand(Shell s, IntQualIntentionWrapper w) {
		super(s, w);
	}

	public boolean canExecute() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	public Command chain(Command command) {
		// TODO Auto-generated method stub
		return null;
	}
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("restriction")
	public void execute() {
		//InputDialog d = new InputDialog(shell, "a", "b", "c", null);
		
		//EvaluationDialog d = new EvaluationDialog(shell);
		//SelectionDialog d = new SelectionDialog(shell);
		
		EvaluationDialog ld = new EvaluationDialog(shell);
		
		List<EvaluationLabel> labellist = new ArrayList<EvaluationLabel>();
		
//		list.add(Openome_modelElementTypes.Goal_1005);
//		list.add(Openome_modelElementTypes.Dependency_3001);
//		list.add(Openome_modelElementTypes.BreakContribution_3007);
		
		labellist.add(EvaluationLabel.SATISFIED);
		labellist.add(EvaluationLabel.WEAKLY_SATISFIED);
		labellist.add(EvaluationLabel.CONFLICT);
		labellist.add(EvaluationLabel.UNKNOWN);
		labellist.add(EvaluationLabel.WEAKLY_DENIED);
		labellist.add(EvaluationLabel.DENIED);
	
				
		//ld.setAddCancelButton(true);  
		ld.setEvalLabelContentProvider(new ArrayContentProvider());
		ld.setLabelBagContentProvider(new ArrayContentProvider());
		
		ld.setEvalLabelLabelProvider(new EvalLabelElementTypeLabelProvider());
		ld.setLabelBagLabelProvider(new LabelBagElementTypeLabelProvider());

	
		ld.setEvalLabelInput(labellist);
		
		ld.setLabelBagInput(wrapper.bagToArray());
		
		
		String mess = wrapper.getIntention().getName();
		if (wrapper.getIntention().getContainer() != null)
			mess += " in " + wrapper.getIntention().getContainer().getName();
	
		ld.setTitle("Sofgoal Resolution for " + mess);
		ld.setMessage(mess + " has recieved the following labels.  Please select a resulting label.");

		ld.open();
		
		if (ld.getReturnCode() == Window.CANCEL) {
			result = EvaluationLabel.NONE;
			//System.out.println("cancelled");
			cancelled = true;
			return;
		}
		
		for (Object ob: ld.getResult()) {
			//System.out.println("Dialog Result: " + ob.toString());
			result = EvaluationLabel.getByName(ob.toString());
			//System.out.println("Dialog Result: " + result.getName());
		}
	}

	public Collection<?> getAffectedObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLabel() {
		// TODO Auto-generated method stub
		return "a label";
	}

	public Collection<?> getResult() {
		// TODO Auto-generated method stub
		return null;
	}

	public void redo() {
		// TODO Auto-generated method stub

	}

	public void undo() {
		// TODO Auto-generated method stub

	}
	
	public EvaluationLabel getEvalResult() {
		return result;
	}
	
	public boolean cancelled() {
		return cancelled;
	}

}
