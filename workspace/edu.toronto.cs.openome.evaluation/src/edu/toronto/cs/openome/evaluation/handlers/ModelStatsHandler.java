/**
 * 
 */
package edu.toronto.cs.openome.evaluation.handlers;

import java.util.Vector;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.openome.evaluation.commands.SetQualitativeEvaluationLabelCommand;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.InteractiveQualReasoner;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoning;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;

/**
 * @author jenhork
 *
 */
public class ModelStatsHandler extends ReasonerHandler{
	
	ModelImpl model;
	CommandStack cs;

	public ModelStatsHandler() {
		super();
	}
	
	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		model = getModelImpl();
		cs = getCommandStack();
		
		getModelStats();
		
		return null;
				
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}
	
	private void getModelStats() {
		// how many intentions?
		boolean printme = true;
		
		String message = "";
		
		Vector<String> types = new Vector<String>();
		types.add("All");
		types.add("Softgoal");
		types.add("Task");
		types.add("Resource");
		types.add("Goal");
		
		//add counts for the rest of stuff, all actors and links
		
		for (String t : types) {
			int count = model.getNumIntentions(t);
			message += "Num " + t +"\t" + count + "\n";
			
		}
			
		if (printme) {
			System.out.println(message);
		}
		
		//This should be temporary, it would be better to have a nicer format pop-up with text 
		//is copyable.  You can't copy text from this pop-up now, which is annoying.
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		Shell shell = ar[0];
		showMessage(message, shell);
		
		
	}
	
	/**
	 * Shows a message in a dialog box with an OK button 
	 * @param message
	 */
	private void showMessage(String message, Shell shell) {		
		MessageDialog.openInformation(
			shell,
			"Interactive Qualitative Backward Reasoning",
			message);
	}
}
