package edu.toronto.cs.openome.evaluation.handlers;

//Imports of eclipse stuff
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

//Imports of our stuff
import edu.toronto.cs.openome.evaluation.gui.AlternateDialog;
import edu.toronto.cs.openome.evaluation.gui.EvalLabelElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.gui.LabelBagElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.InteractiveQualReasoner;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoning;
import edu.toronto.cs.openome.evaluation.views.AlternativesView;
import edu.toronto.cs.openome_model.EvaluationLabel;
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
		
		//Open a dialog box for alternative name and description
		AlternateDialog ad = new AlternateDialog(ar[0]);
	
		ad.open();
		
		if (ad.getReturnCode() == Window.CANCEL){
			return null;
		}
		
		//Create a new alternate in the Alternates View
	
		AlternativesView av = 
			(AlternativesView)	PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("edu.toronto.cs.openome.evaluation.views.AlternativesView");
				
	
		av.addAlternative(ad.getName(), ad.getDescription());
		
		
		
		
		ModelImpl mi = getModelImpl();
		CommandStack cs = getCommandStack();
		
		DiagramCommandStack dcs = getDiagramCommandStack();
		
		Reasoning reasoning = new Reasoning(new InteractiveQualReasoner(mi, cs, dcs));
		
		reasoning.reason();
		
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
