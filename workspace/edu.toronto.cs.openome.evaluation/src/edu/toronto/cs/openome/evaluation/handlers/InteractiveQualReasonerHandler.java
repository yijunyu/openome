package edu.toronto.cs.openome.evaluation.handlers;

//Imports of eclipse stuff
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.openome.evaluation.gui.AlternateDialog;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.Alternative;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.InteractiveQualReasoner;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoning;
import edu.toronto.cs.openome.evaluation.views.AlternativesView;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;



/**
 * @author jenhork
 * This class is used to handle the evaluation menu function.  This one handles the interactive qualitative reasoning menu.
 */
public class InteractiveQualReasonerHandler extends ReasonerHandler {

	public InteractiveQualReasonerHandler() {
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
	
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
		
		AlternateDialog ad = new AlternateDialog(ar[0]);
	
		// Open a dialog box for alternative name and description
		ad.open();
		
		// User pressed cancel
		if (ad.getReturnCode() == Window.CANCEL){
			return null;
		}
	
		// Get the Alternates View 
		AlternativesView av = 
			(AlternativesView)	PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("edu.toronto.cs.openome.evaluation.views.AlternativesView");
			
		// New alternative given the name and description from the dialog box
		Alternative alt = new Alternative (ad.getName(), ad.getDescription());
		
		ModelImpl mi = getModelImpl();
		CommandStack cs = getCommandStack();
		
		DiagramCommandStack dcs = getDiagramCommandStack();
		
		Reasoning reasoning = new Reasoning(new InteractiveQualReasoner(mi, cs, dcs));
		
		reasoning.reason();

		// Get a list of all intentions currently in the model
		EList<Intention> a = mi.getAllIntentions();
		
		// Save the intentions in the alternative
		alt.setIntentions(a);
		
		// Populate the Alternate View with the alternative
		av.addAlternative(alt);
		
		
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

}
