package customsrc;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart;

public class SetActorTypeAction extends AbstractActionHandler {
	
	protected String ID = ""; //$NON-NLS-1$
	protected EvaluationLabel evalField = null;
	protected String evalLabel = "";
	protected String commandName = "";
	
	/*What we wish to change into*/
	protected String changeTo = "";

	protected SetActorTypeAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		// TODO Auto-generated constructor stub
	}
	
	public String getID() {
		return ID;
	}
	
	public void setChangeTo(String change){
		changeTo = change;
	}

	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		IStructuredSelection selection = getStructuredSelection();
		
		if (selection == null || (selection.isEmpty())) {
			return;
		}
		
		Object[] actors = selection.toArray();
		int selectionSize = actors.length;
		
		for (int i = 0; i < selectionSize; i++) {
			final EObject object = ((IGraphicalEditPart)actors[i]).getNotationView().getElement();
			Object actor = actors[i];
			// determine what type of actor it is, then cast it appropriately 
			// and apply the appropriate label to it

			// GOALS
			
			if (actor instanceof ActorEditPart) {
//				GoalEditPart part = (GoalEditPart) selection.getFirstElement();
//				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
//				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
//				
//				applyEvalLabel(selection, object, progressMonitor, dcs);
				
				System.out.println("Change from Actor to " + changeTo);
				
			} else if (actor instanceof AgentEditPart) {
				System.out.println("Change from Agent to " + changeTo);
				
			} else if (actor instanceof RoleEditPart) {
				System.out.println("Change from Role to " + changeTo);
				
			} else if (actor instanceof PositionEditPart) {
				System.out.println("Change from Position to " + changeTo);
				
			} else if (actor instanceof ActorActorCompartmentEditPart) {
				System.out.println("Change from ActorActorCompartment to " + changeTo);
				
			} else if (actor instanceof AgentAgentCompartmentEditPart) {
				System.out.println("Change from AgentAgentCompartment to " + changeTo);
				
			} else if (actor instanceof RoleRoleCompartmentEditPart) {
				System.out.println("Change from RoleRoleCompartment to " + changeTo);
				
			} else if (actor instanceof PositionPositionCompartmentEditPart) {
				System.out.println("Change from PositionPositionCompartment to " + changeTo);
				
			}  else {
				System.out.println("Cannot recognize EditPart: " + actor);
			}
			
			
		}
	}
	
	public void applyEvalLabel(IStructuredSelection selection, final EObject object, IProgressMonitor progressMonitor, DiagramCommandStack dcs) {
		
		MyCommand applyLabel = new MyCommand(object) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				if (object instanceof Intention) {
					((Intention) object).setQualitativeReasoningCombinedLabel(evalField);
				}
				return CommandResult.newOKCommandResult();
			}};
		
		ICommandProxy command = new ICommandProxy(applyLabel);
		dcs.execute(command, progressMonitor);
		

	}
	
	public void refresh() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	private abstract class MyCommand extends AbstractTransactionalCommand {
		public MyCommand(EObject elt) {
			super((TransactionalEditingDomain) AdapterFactoryEditingDomain.
					getEditingDomainFor(elt),
					evalLabel,
					getWorkspaceFiles(elt));
		}
	}

}
