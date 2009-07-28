package edu.toronto.cs.openome_model.diagram.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.AWTClipboardHelper;
import org.eclipse.gmf.runtime.diagram.ui.render.internal.commands.CopyImageCommand;
import org.eclipse.gmf.runtime.diagram.ui.render.internal.providers.ImageSupportGlobalActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.requests.PasteViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.ui.properties.actions.PropertyPageViewAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.edit.commands.GoalCreateCommand;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;
import edu.toronto.cs.openome_model.impl.ActorImpl;
import edu.toronto.cs.openome_model.impl.AgentImpl;
import edu.toronto.cs.openome_model.impl.ContainerImpl;
import edu.toronto.cs.openome_model.impl.GoalImpl;
import edu.toronto.cs.openome_model.impl.IntentionImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.PositionImpl;
import edu.toronto.cs.openome_model.impl.ResourceImpl;
import edu.toronto.cs.openome_model.impl.RoleImpl;
import edu.toronto.cs.openome_model.impl.SoftgoalImpl;
import edu.toronto.cs.openome_model.impl.TaskImpl;

public class Openome_modelImageSupportGlobalActionHandler extends ImageSupportGlobalActionHandler {
	
	protected static List<EditPart> editPartClipboard = new ArrayList<EditPart>();
	
	/**
	 * Constructor
	 */
	public Openome_modelImageSupportGlobalActionHandler(){
		super();
	}
	
	/**
	 * Modified version of canCopy that allows copying of an Actor
	 */
	protected boolean canCopy(IGlobalActionContext cntxt){	
		// allows copying of a compartment
		for(Object o : ((IStructuredSelection) cntxt.getSelection()).toArray()){
			if (o instanceof ShapeCompartmentEditPart){
				return true;
			}
		}	
		return super.canCopy(cntxt);
		
	}
	
	/**
	 * Provides the commmand
	 * We shall modify it a bit to modify behaviour of paste
	 */
	public ICommand getCommand(IGlobalActionContext cntxt) {
		/* Check if the active part is a IDiagramWorkbenchPart */
		IWorkbenchPart part = cntxt.getActivePart();
		if (!(part instanceof IDiagramWorkbenchPart)) {
			return null;
		}

		/* Get the model operation context */
		IDiagramWorkbenchPart diagramPart = (IDiagramWorkbenchPart) part;

		/* Create a command */
		ICommand command = null;

		/* Check the action id */
		String actionId = cntxt.getActionId();
		if (actionId.equals(GlobalActionId.DELETE)) {
			//visibility problem
			super.getCommand(cntxt);
			
		} else if (actionId.equals(GlobalActionId.COPY)) {
			command = getCopyCommand(cntxt, diagramPart, false);
			
			//Fill our own clipboard
			editPartClipboard.clear();
			/* Get the selected edit parts */
			Object[] objects = ((IStructuredSelection) cntxt.getSelection())
				.toArray();
			
			for (Object o : objects){
				editPartClipboard.add((EditPart) o);
			}
			
			
		} else if (actionId.equals(GlobalActionId.CUT)) {
			command = getCutCommand(cntxt, diagramPart);
			
		} else if (actionId.equals(GlobalActionId.OPEN)) {
			// Open command: use the previously cached command.
			// visibility problem
			super.getCommand(cntxt);
		} else if (actionId.equals(GlobalActionId.PASTE)) {

			PasteViewRequest pasteReq = createPasteViewRequest();

			/* Get the selected edit parts */
			Object[] objects = ((IStructuredSelection) cntxt.getSelection())
				.toArray();
			
			if (objects.length == 1) {
				
				Command paste;
				
				/* Send the request to the currently selected part, however if the selection is a container
				 * then we must redirect the request to its compartment
				 * 
				 *  This enables us to just select a container and click paste on it
				 */
				EditPart ep = (EditPart) objects[0];
				if ( objects[0] instanceof ActorEditPart){
					ep = ((ActorEditPart) objects[0]).getChildBySemanticHint(Integer
							.toString(ActorActorCompartmentEditPart.VISUAL_ID));
					paste = ep.getCommand(pasteReq);
				} else if ( objects[0] instanceof AgentEditPart){
					ep = ((AgentEditPart) objects[0]).getChildBySemanticHint(Integer
							.toString(AgentAgentCompartmentEditPart.VISUAL_ID));
					paste = ep.getCommand(pasteReq);
				} else if ( objects[0] instanceof RoleEditPart){
					ep = ((RoleEditPart) objects[0]).getChildBySemanticHint(Integer
							.toString(RoleRoleCompartmentEditPart.VISUAL_ID));
					paste = ep.getCommand(pasteReq);
				} else if ( objects[0] instanceof PositionEditPart){
					ep = ((PositionEditPart) objects[0]).getChildBySemanticHint(Integer
							.toString(PositionPositionCompartmentEditPart.VISUAL_ID));
					paste = ep.getCommand(pasteReq);
				} else{
					paste = ((EditPart) objects[0]).getCommand(pasteReq);
				}
				
				if (paste != null) {
					/* Set the command */
					CommandStack cs = diagramPart.getDiagramEditDomain()
						.getDiagramCommandStack();
					
					TransactionalEditingDomain copyFromDomain = ((IGraphicalEditPart)editPartClipboard.get(0)).getEditingDomain();
					TransactionalEditingDomain pasteToDomain = ((IGraphicalEditPart) ep).getEditingDomain();

					if (copyFromDomain.equals(pasteToDomain)){
						/*This means we are pasting within the same diagram
						 * This means it's safe to simply duplicate
						 */
						
						//Adds to the model (the oom file)
						DuplicateAnythingCommand duplicateCommand = (DuplicateAnythingCommand) getTrueDuplicateCommand(ep);
						ICommandProxy duplicate = new ICommandProxy(duplicateCommand);
						cs.execute(duplicate);
						
						// Assign new container to the duplicated element
						for (EditPart e : editPartClipboard){
							final EObject o = ((IGraphicalEditPart) e).getNotationView().getElement();
							EObject duplicated = (EObject) duplicateCommand.getAllDuplicatedObjects().get(o);
							if (duplicated instanceof IntentionImpl){
								setContainer((IntentionImpl) duplicated, ep, cs);
							}
						}
					}
					else {
						// This means we are pasting across two distinct diagrams
						
						// So since we cannot duplicate, we should add to the destination diagram
						EObject container = ((IGraphicalEditPart) ep).getNotationView().getElement();
						List<CreateElementCommand> commandList = getCreateCommandList(pasteToDomain, container);
						
						// "Duplicate" all the selected elements
						for (CreateElementCommand c : commandList){
							ICommandProxy create = new ICommandProxy(c);
							cs.execute(create);
						}
					}
					
					
					
					//Adds to the diagram
					//cs.execute(paste); // we don't want to have double paste
					diagramPart.getDiagramEditPart().getFigure().invalidate();
					diagramPart.getDiagramEditPart().getFigure().validate();
					selectAddedObject(diagramPart.getDiagramGraphicalViewer(),
						DiagramCommandStack.getReturnValues(paste));
					return null;
				}
			}
		} else if (actionId.equals(GlobalActionId.SAVE)) {
			part.getSite().getPage().saveEditor((IEditorPart) diagramPart,
				false);
		} else if (actionId.equals(GlobalActionId.PROPERTIES)) {
			new PropertyPageViewAction().run();
		}

		return command;
	}
	
	/**
	 * Returns a list of CreateElementCommand that can create every element in the clipboard
	 * @param domain
	 * @param container
	 * @return
	 */
	private List<CreateElementCommand> getCreateCommandList(TransactionalEditingDomain domain, EObject container) {
		List<CreateElementCommand> commandList = new ArrayList<CreateElementCommand>();
		for (EditPart ep: editPartClipboard){
			final EObject o = ((IGraphicalEditPart) ep).getNotationView().getElement();
			commandList.add(getCreateCommand(domain, o, container));
		}
		return commandList;
		
	}

	private static CreateElementCommand getCreateCommand(TransactionalEditingDomain domain, EObject o, EObject container) {
		CreateElementRequest req = null;
		if (o instanceof GoalImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Goal_2001);
		}
		else if (o instanceof TaskImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Task_1007);
		}
		else if (o instanceof SoftgoalImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Softgoal_1006);
		} 
		else if (o instanceof ResourceImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Resource_1008);
		}
		else if (o instanceof ActorImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Actor_1001);
		}
		else if (o instanceof AgentImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Agent_1002);
		}
		else if (o instanceof RoleImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Role_1004);
		}
		else if (o instanceof PositionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Position_1003);
		}
		
		return new CreateDuplicateElementCommand(req, o);
	}

	/**
	 * Changes the container of an intention
	 * @param duplicated
	 * @param object
	 * @param cs
	 */
	private void setContainer(IntentionImpl duplicated, Object object, CommandStack cs) {
		if (object instanceof ModelEditPart){
			final EObject model = ((IGraphicalEditPart) object).getNotationView().getElement();
			TransactionalEditingDomain domain = ((ModelEditPart) object).getEditingDomain();
			ChangeModelCommand command = new ChangeModelCommand(domain, duplicated, (ModelImpl) model);
			ICommandProxy change = new ICommandProxy(command);
			cs.execute(change);
		}
		else if (object instanceof ShapeCompartmentEditPart){
			final EObject compartmentImpl = ((IGraphicalEditPart) object).getNotationView().getElement();
			TransactionalEditingDomain domain = ((ShapeCompartmentEditPart) object).getEditingDomain();
			ChangeContainerCommand command = new ChangeContainerCommand( domain, duplicated, (ContainerImpl) compartmentImpl);
			ICommandProxy change = new ICommandProxy(command);
			cs.execute(change);
		}
		
	}

	/**
	 * Duplicates an element by a command
	 */
	public DuplicateEObjectsCommand getTrueDuplicateCommand(EditPart ep){
		final EObject object = ((IGraphicalEditPart) ep).getNotationView().getElement();
		return getTrueDuplicateCommand(object, ((IGraphicalEditPart) ep).getEditingDomain());
	}
	
	/**
	 * Given a model object, create a command to duplicate the object
	 * @param object
	 * @return
	 */
	private DuplicateEObjectsCommand getTrueDuplicateCommand(EObject object, TransactionalEditingDomain pasteToDomain){
		List copyMe = new ArrayList();
		TransactionalEditingDomain copyFromDomain = null;
		for (EditPart ep: editPartClipboard){
			final EObject o = ((IGraphicalEditPart) ep).getNotationView().getElement();
			copyFromDomain = ((IGraphicalEditPart) ep).getEditingDomain();
			copyMe.add(o);
		}
		
		return new DuplicateAnythingCommand(pasteToDomain, new DuplicateElementsRequest(copyMe));
	}
	
	/**
	 * borrowed from ModelItemSemanticEditPolicy
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {
		
		private DuplicateElementsRequest request;

		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
			
			request = req;
		}
		
		public DuplicateElementsRequest getRequest(){
			return request;
		}
		
		public HashMap getAllDuplicatedObjects(){
			return (HashMap) super.getAllDuplicatedObjectsMap();
		}

	}
	
	/**
	 * A Command to change the container of an intention
	 * @author johan
	 */
	private static class ChangeContainerCommand extends AbstractTransactionalCommand {
		
		private IntentionImpl intention;
		private ContainerImpl container;
		
		public ChangeContainerCommand(TransactionalEditingDomain domain, IntentionImpl i, ContainerImpl c){
			super(domain, "change container", new ArrayList());
			intention = i;
			container = c;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			// TODO Auto-generated method stub
			// Remove from old container
			if (intention.getContainer() != null){
				intention.getContainer().getIntentions().remove(intention);
			}
			
			// Adds to new container
			container.getIntentions().add(intention);
			return CommandResult.newOKCommandResult();
		}
		
	}
	
	/**
	 * A Command to change the model of an intention
	 * @author johan
	 */
	private static class ChangeModelCommand extends AbstractTransactionalCommand {
		
		private IntentionImpl intention;
		private ModelImpl model;
		
		public ChangeModelCommand(TransactionalEditingDomain domain, IntentionImpl i, ModelImpl m){
			super(domain, "change container", new ArrayList());
			intention = i;
			model = m;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			// TODO Auto-generated method stub
			intention.setModel(model);
			intention.getModel().getIntentions().add(intention);
			return CommandResult.newOKCommandResult();
		}
		
	}
	
	/**
	 * A Command to add a model element to a diagram, based on an existing element
	 * @author johan
	 */
	private static class CreateDuplicateElementCommand extends CreateElementCommand{
		
		/**
		 * The newly created element.
		 */
		private EObject newElement;
		
		/**
		 * The element the duplicate is based on
		 */
		private EObject oldElement;
		
		/**
		 * The element type to be created.
		 */
		private final IElementType elementType;

		public CreateDuplicateElementCommand(CreateElementRequest request, EObject original) {
			super(request);
			elementType = request.getElementType();
			oldElement = original;
		}
		
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
	            IAdaptable info)
	        throws ExecutionException {

	        // Do the default element creation
	        newElement = doDefaultElementCreation();
	        
	        if (!getDefaultElementCreationStatus().isOK()) {
	        	return new CommandResult(getDefaultElementCreationStatus());
	        }

	        // Configure the new element
	        ConfigureRequest configureRequest = createConfigureRequest();

	        ICommand configureCommand = elementType
	            .getEditCommand(configureRequest);
	        
	        IStatus configureStatus = null;
	        
	        if (configureCommand != null && configureCommand.canExecute()) {
	        	configureStatus = configureCommand.execute(monitor, info);
	        }
	        
	        //Copy the metadata
	        if (newElement instanceof IntentionImpl){
	        	((IntentionImpl) newElement).setName(((IntentionImpl) oldElement).getName());
	        	((IntentionImpl) newElement).setQualitativeReasoningCombinedLabel(((IntentionImpl) oldElement).getQualitativeReasoningCombinedLabel());
	        	((IntentionImpl) newElement).setQualitativeReasoningDenialLabel(((IntentionImpl) oldElement).getQualitativeReasoningDenialLabel());
	        	((IntentionImpl) newElement).setQualitativeReasoningSatisfiedLabel(((IntentionImpl) oldElement).getQualitativeReasoningSatisfiedLabel());
	        	((IntentionImpl) newElement).setQuantitativeReasoningCombinedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningCombinedLabel());
	        	((IntentionImpl) newElement).setQuantitativeReasoningDeniedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningDeniedLabel());
	        	((IntentionImpl) newElement).setQuantitativeReasoningSatisfiedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningSatisfiedLabel());
	        } 
	        else if (newElement instanceof ContainerImpl){
	        	((ContainerImpl) newElement).setName( ((ContainerImpl)oldElement).getName());
	        	
	        	//Create the intentions within this actor
				for(Intention intention : ((ContainerImpl)oldElement).getIntentions()){
					CreateElementCommand createChild = getCreateCommand(getCreateRequest().getEditingDomain(), intention, newElement);
					createChild.execute(monitor, info);
				}
	        }

	        // Put the newly created element in the request so that the
	        // 'after' commands have access to it.
	        getCreateRequest().setNewElement(newElement);

	        return (configureStatus == null) ? 
	        		CommandResult.newOKCommandResult(newElement) : 
	        		new CommandResult(configureStatus, newElement);
		}
		
	}

	
}