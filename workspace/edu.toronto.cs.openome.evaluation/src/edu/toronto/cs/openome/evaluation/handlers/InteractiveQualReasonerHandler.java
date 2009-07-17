package edu.toronto.cs.openome.evaluation.handlers;

//Imports of eclipse stuff
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.command.CommandStack;

//Imports of our stuff
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.InteractiveQualReasoner;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoning;
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
	
		ModelImpl mi = getModelImpl();
		CommandStack cs = getCommandStack();
		
		Reasoning reasoning = new Reasoning(new InteractiveQualReasoner(mi, cs));
		
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
