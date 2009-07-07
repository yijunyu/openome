package edu.toronto.cs.openome_model.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.AWTClipboardHelper;
import org.eclipse.gmf.runtime.diagram.ui.render.internal.commands.CopyImageCommand;
import org.eclipse.gmf.runtime.diagram.ui.render.internal.providers.ImageSupportGlobalActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.requests.PasteViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.ui.properties.actions.PropertyPageViewAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

import edu.toronto.cs.openome_model.diagram.edit.commands.GoalCreateCommand;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;
import edu.toronto.cs.openome_model.impl.GoalImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class Openome_modelImageSupportGlobalActionHandler extends ImageSupportGlobalActionHandler {
	
	protected static List<EditPart> editPartClipboard = new ArrayList<EditPart>();
	
	/**
	 * Constructor
	 */
	public Openome_modelImageSupportGlobalActionHandler(){
		super();
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
				/* Send the request to the currently selected part */
				Command paste = ((EditPart) objects[0]).getCommand(pasteReq);
				if (paste != null) {
					/* Set the command */
					CommandStack cs = diagramPart.getDiagramEditDomain()
						.getDiagramCommandStack();
					
					//Adds to the model (the oom file)
					DuplicateAnythingCommand duplicateCommand = (DuplicateAnythingCommand) getTrueDuplicateCommand((EditPart) objects[0]);
					ICommandProxy duplicate = new ICommandProxy(duplicateCommand);
					cs.execute(duplicate);
					
					//Adds to the diagram
					cs.execute(paste);
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
	 * Duplicates a model element by creating a new element of the same type and fine tuning it
	 */
	public CreateElementCommand getDuplicateCommand(EditPart ep){
		System.out.println("EditPart: " + ep);
		final EObject object = ((IGraphicalEditPart) ep).getNotationView().getElement();
		return getDuplicateCommand(object, ((IGraphicalEditPart) ep).getEditingDomain());
	}
	
	/**
	 * Given a model object, create a command to create another object with the same properties
	 * @param object
	 * @return
	 */
	private CreateElementCommand getDuplicateCommand(EObject object, TransactionalEditingDomain domain){
		EObject container = null;
		if (object instanceof ModelImpl){
			container = object;
			//this will only copy the first intention to appear in the model
			object = ((ModelImpl) object).getIntentions().get(0);
		}
		
		if (object instanceof GoalImpl){
			System.out.println("object is a goal");
			CreateElementRequest createReq = new CreateElementRequest(container, Openome_modelElementTypes.Goal_1005);
			return new GoalCreateCommand(createReq);
		}
		System.out.println(object);
		return null;
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
	private DuplicateEObjectsCommand getTrueDuplicateCommand(EObject object, TransactionalEditingDomain domain){
		
		//of course it will be model, that's where we right click to paste!
//		if (object instanceof ModelImpl){
//			//this will only copy the first intention to appear in the model
//			// solution: get the object to be copied from the clipboard?
//			object = ((ModelImpl) object).getIntentions().get(0);
//		}
		
		List copyMe = new ArrayList();
		for (EditPart ep: editPartClipboard){
			final EObject o = ((IGraphicalEditPart) ep).getNotationView().getElement();
			copyMe.add(o);
		}
		
		return new DuplicateAnythingCommand(domain, new DuplicateElementsRequest(copyMe));
	}
	
	/**
	 * borrowed from ModelItemSemanticEditPolicy
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

	
}