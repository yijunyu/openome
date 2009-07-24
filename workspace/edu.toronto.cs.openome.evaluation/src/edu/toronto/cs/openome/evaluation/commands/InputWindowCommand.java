package edu.toronto.cs.openome.evaluation.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.dialogs.SelectionDialog;

import edu.toronto.cs.openome.evaluation.gui.EvaluationDialog;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.InputWindow.MyLabelProvider;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;

public class InputWindowCommand implements Command {

	Shell shell;
	
	public InputWindowCommand(Shell s) {
		shell = s;
		// TODO Auto-generated constructor stub
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
	public Command chain(Command command) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Executing InputWindowCommand");
		
		//InputDialog d = new InputDialog(shell, "a", "b", "c", null);
		
		//EvaluationDialog d = new EvaluationDialog(shell);
		//SelectionDialog d = new SelectionDialog(shell);
		
		EvaluationDialog ld = new EvaluationDialog(shell);
		
		List list = new ArrayList();
		
		list.add(Openome_modelElementTypes.Goal_1005);
		list.add(Openome_modelElementTypes.Dependency_3001);
		list.add(Openome_modelElementTypes.BreakContribution_3007);
		
		ld.setAddCancelButton(true);  
		ld.setContentProvider(new ArrayContentProvider());
		ld.setLabelProvider(new MyLabelProvider());
		 
		ld.setInput(list.toArray());
		
		ld.setInitialSelections(list.toArray());
		  
		ld.setTitle("Select # of Nobel Prize Nominations :");

		
		ld.open();
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
