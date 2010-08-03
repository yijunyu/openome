package customsrc;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdateCommand;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;
import edu.toronto.cs.openome_model.impl.GoalImpl;
import edu.toronto.cs.openome_model.impl.ResourceImpl;
import edu.toronto.cs.openome_model.impl.SoftgoalImpl;
import edu.toronto.cs.openome_model.impl.TaskImpl;

public class SetActorTypeAction extends AbstractActionHandler {
	
	protected String ID = ""; //$NON-NLS-1$
	protected EvaluationLabel evalField = null;
	protected String evalLabel = "";
	protected String commandName = "";
	
	// What we wish to change into
	protected String changeTo = "";

	protected SetActorTypeAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		// TODO Auto-generated constructor stub
	}
	
	public String getID() {
		return ID;
	}
	
	public void setChangeTo(String change) {
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
			Object actor = actors[i];
			// determine what type of actor it is, then cast it appropriately 
			// and apply the appropriate label to it
			
			GraphicalEditPart part = (GraphicalEditPart) selection.getFirstElement();			
			IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
			DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
			
			doTypeSwitch(actor, dcs, progressMonitor);
		}
	}
	
	private void doTypeSwitch(Object originalEditPart, DiagramCommandStack dcs,	IProgressMonitor progressMonitor) {
		GraphicalEditPart part = (GraphicalEditPart)originalEditPart;	
		GraphicalEditPart container = (GraphicalEditPart)part.getParent();
		
		View originalView = part.getNotationView();
		EObject originalImpl = originalView.getElement();
		
		TransactionalEditingDomain domain = part.getEditingDomain();
		
		// The new container's type
		IElementType type = null;
		
		// Since types are generated, this function needs to be carefully maintained,
		// in order to avoid using old types that result in NullPointer exceptions.
		
		if(changeTo.equals("Actor")) {
			type = Openome_modelElementTypes.Actor_2001;
		} else if(changeTo.equals("Agent")) {
			type = Openome_modelElementTypes.Agent_2002;
		} else if(changeTo.equals("Position")) {
			type = Openome_modelElementTypes.Position_2003;
		} else if(changeTo.equals("Role")) {
			type = Openome_modelElementTypes.Role_2004;
		}
		
		// Create a new container
		
		CreateElementCommand commandElement = new CreateElementCommand(
			new CreateElementRequest(domain, originalImpl.eContainer(), type)
		);
		
		if(commandElement.canExecute()) {
			dcs.execute(new ICommandProxy(commandElement));
			dcs.flush();
		} else {
			System.err.println("commandElement problem!");
		}
		
		// Copy the old container's meta data
		
		EObject element = commandElement.getNewElement();
		
		TransferMetaCommand commandMeta = new TransferMetaCommand(domain, element, originalImpl);
		
		if(commandMeta.canExecute()) {
			dcs.execute(new ICommandProxy(commandMeta));
			dcs.flush();
		} else {
			System.err.println("commandMeta problem!");
		}
		
		// Create a view for the new container
		
		ViewDescriptor viewDescriptor = new ViewDescriptor(
			new EObjectAdapter(element),
			Node.class,
			((IHintedType)type).getSemanticHint(), true,
			container.getDiagramPreferencesHint()
		);
		
		Command commandView = container.getCommand(
			new CreateViewRequest(viewDescriptor)
		);
		
		if(commandView.canExecute()) {
			dcs.execute(commandView);
			dcs.flush();
		} else {
			System.err.println("commandView problem!");
		}	
		
		// Keep the old container's canvas position	
		
		View view = (View)viewDescriptor.getAdapter(View.class);
		
		IFigure fig = part.getContentPane();
		Rectangle coords = fig.getBounds();
		
		SetBoundsCommand commandPosition = new SetBoundsCommand(
			domain,
			"",
			new EObjectAdapter(view),
			new Point(coords.x, coords.y)
		);
		
		if(commandPosition.canExecute()) {
			dcs.execute(new ICommandProxy(commandPosition));
			dcs.flush();
		} else {
			System.err.println("commandPosition problem!");
		}
		
		// Process contained intentions
		
		List<GraphicalEditPart> parts = new LinkedList<GraphicalEditPart>();
		collectIntentions(part, parts);
		
		for(GraphicalEditPart g : parts) {
			View iView = g.getNotationView();
			EObject iElement = iView.getElement();
			
			// Change the element's type to the one appropriate
			// to the container it now sits in.
			
			// Since types are generated, this function needs to be carefully maintained,
			// in order to avoid using old types that result in NullPointer exceptions.
			
			IElementType iType = null;
			
			if(iElement instanceof GoalImpl) {
				if(type == Openome_modelElementTypes.Actor_2001) {
					iType = Openome_modelElementTypes.Goal_3001;
				} else if(type == Openome_modelElementTypes.Agent_2002) {
					iType = Openome_modelElementTypes.Goal_3005;
				} else if(type == Openome_modelElementTypes.Position_2003) {
					iType = Openome_modelElementTypes.Goal_3009;
				} else if(type == Openome_modelElementTypes.Role_2004) {
					iType = Openome_modelElementTypes.Goal_3013;
				}
			} else if(iElement instanceof SoftgoalImpl) {
				if(type == Openome_modelElementTypes.Actor_2001) {
					iType = Openome_modelElementTypes.Softgoal_3002;
				} else if(type == Openome_modelElementTypes.Agent_2002) {
					iType = Openome_modelElementTypes.Softgoal_3006;
				} else if(type == Openome_modelElementTypes.Position_2003) {
					iType = Openome_modelElementTypes.Softgoal_3010;
				} else if(type == Openome_modelElementTypes.Role_2004) {
					iType = Openome_modelElementTypes.Softgoal_3014;
				}
			} else if(iElement instanceof TaskImpl) {
				if(type == Openome_modelElementTypes.Actor_2001) {
					iType = Openome_modelElementTypes.Task_3004;
				} else if(type == Openome_modelElementTypes.Agent_2002) {
					iType = Openome_modelElementTypes.Task_3008;
				} else if(type == Openome_modelElementTypes.Position_2003) {
					iType = Openome_modelElementTypes.Task_3012;
				} else if(type == Openome_modelElementTypes.Role_2004) {
					iType = Openome_modelElementTypes.Task_3016;
				}
			} else if(iElement instanceof ResourceImpl) {
				if(type == Openome_modelElementTypes.Actor_2001) {
					iType = Openome_modelElementTypes.Resource_3003;
				} else if(type == Openome_modelElementTypes.Agent_2002) {
					iType = Openome_modelElementTypes.Resource_3007;
				} else if(type == Openome_modelElementTypes.Position_2003) {
					iType = Openome_modelElementTypes.Resource_3011;
				} else if(type == Openome_modelElementTypes.Role_2004) {
					iType = Openome_modelElementTypes.Resource_3015;
				}
			}
			
			ReplaceElement.replace(g, getNewContainer(container, view), iType, dcs);
		}
		
		// Delete the old container
		
		DestroyElementCommand commandDelete = new DestroyElementCommand(
			new DestroyElementRequest(domain, originalImpl, false)
		);
		
		if(commandDelete.canExecute()) {
			dcs.execute(new ICommandProxy(commandDelete));
			dcs.flush();
		} else {
			System.err.println("commandDelete problem!");
		}
		
		// Delete the old container's view
		
		DeleteCommand commandDeleteView = new DeleteCommand(domain, originalView);
		
		if(commandDeleteView.canExecute()) {
			dcs.execute(new ICommandProxy(commandDeleteView));
			dcs.flush();
		} else {
			System.err.println("commandDeleteView problem!");
		}

		// refresh diagram to reflect changes
		refresh();
	}
	
	/*
	 * Command to copy a container's children and name to another one.
	 */
	private class TransferMetaCommand extends AbstractTransactionalCommand
	{
		private Container dst;
		private Container src;
		
		public TransferMetaCommand(TransactionalEditingDomain domain, EObject newElement, EObject oldElement)
		{
	        super(domain, "", null);
	        
	        this.dst = (Container)newElement;
	        this.src = (Container)oldElement;
		}
		
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
		    throws ExecutionException
		{  	
			dst.setName(src.getName());
			
			dst.getIntentions().addAll(src.getIntentions());
			
			return CommandResult.newOKCommandResult();
		}
	}
	
	/*
	 * Collect a container's intentions' GraphicalEditParts.
	 */
	private void collectIntentions(GraphicalEditPart part, List<GraphicalEditPart> parts)
	{
		for(Object o : part.getChildren()) {
			GraphicalEditPart g = (GraphicalEditPart)o;
			
			if(o instanceof AbstractBorderedShapeEditPart) {
				parts.add(g);
			} else {
				collectIntentions(g, parts);
			}
		}
	}
	
	/*
	 * Get the new container's GraphicalEditPart.
	 */
	private GraphicalEditPart getNewContainer(GraphicalEditPart p, View v)
	{
		for(Object o : p.getChildren()) {
			if(v == p.getNotationView()) {
				if(o instanceof ActorActorCompartmentEditPart
					|| o instanceof AgentAgentCompartmentEditPart
					|| o instanceof RoleRoleCompartmentEditPart
					|| o instanceof PositionPositionCompartmentEditPart) {
					return (GraphicalEditPart)o;
				}
			} else {
				GraphicalEditPart g = getNewContainer((GraphicalEditPart)o, v);
				
				if(g != null) {
					return g;
				}
			}
		}
		
		return null;
	}

	public void refresh() {
		Openome_modelDiagramUpdateCommand up = new Openome_modelDiagramUpdateCommand();
		
		try {
			up.execute(null);
		} catch(ExecutionException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}
