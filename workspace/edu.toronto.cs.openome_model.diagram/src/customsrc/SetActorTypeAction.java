package customsrc;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;

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
			Object actor = actors[i];
			// determine what type of actor it is, then cast it appropriately 
			// and apply the appropriate label to it
			
			GraphicalEditPart part = (GraphicalEditPart) selection.getFirstElement();			
			IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
			DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
			
			List<Point> childCoords = new LinkedList<Point>();
			findChildCoords(part, childCoords);
			
			IFigure fig = part.getContentPane();
			Rectangle coords = fig.getBounds();
			
			doTypeSwitch(actor, dcs, progressMonitor, coords, childCoords);
		}
	}
	
	/*
	 * Finds intentions inside an actor, and saves their coordinates in a list.
	 */
	private void findChildCoords(GraphicalEditPart part, List<Point> childCoords)
	{
		for(Object o : part.getChildren()) {
			// if this is an intention, then save its figure's coordinates
			if(o instanceof AbstractBorderedShapeEditPart) {
				GraphicalEditPart g = (GraphicalEditPart)o;
				IFigure fig = g.getContentPane();
				Rectangle coords = fig.getBounds();
				
				childCoords.add(new Point(coords.x, coords.y));
			
			// not an intention, so look deeper
			} else {
				findChildCoords((GraphicalEditPart)o, childCoords);
			}
		}
	}
	
	private void doTypeSwitch(Object originalEditPart, DiagramCommandStack dcs,	IProgressMonitor progressMonitor, Rectangle coords, List<Point> childCoords) {
		IGraphicalEditPart gEditPart = (IGraphicalEditPart)originalEditPart;
		
		final EObject originalImpl = gEditPart.getNotationView().getElement();
		TransactionalEditingDomain domain = gEditPart.getEditingDomain();
		RootEditPart root = gEditPart.getRoot();
		
		//Create new element (automatically sync info as well)
		CreateElementCommand create = selectCreateActorCommand(originalImpl, domain);
		dcs.execute(new ICommandProxy(create));

		//Delete old element
		DestroyElementCommand destroy = new DestroyElementCommand(new DestroyElementRequest(domain, originalImpl, false));
		dcs.execute(new ICommandProxy(destroy));
		
		// Place the new container in the old one's spot
		
		EObject newObject = create.getCreateRequest().getNewElement();
		IGraphicalEditPart rootContents = (IGraphicalEditPart)root.getContents();
		
		GraphicalEditPart containerPart = null;
		
		for(Object o : rootContents.getChildren()) {
			View v = ((IGraphicalEditPart)o).getNotationView();
			EObject viewObject = v.getElement();
			
			// this is the new element
			if(viewObject == newObject) {
				SetBoundsCommand s = new SetBoundsCommand(domain, "", new EObjectAdapter(v), new Point(coords.x, coords.y));
				dcs.execute(new ICommandProxy(s));
				
				containerPart = (GraphicalEditPart)o;
			}
		}
		
		// Place container's children in their old spots
		
		if(containerPart == null) {
			// problem
		} else {
			for(Object i : ((Container)newObject).getIntentions()) {		
				View v = getIntentionView(containerPart, (EObject)i);
				
				if(v == null) {
					// problem
				} else {				
					Point p = childCoords.remove(0);
					
					SetBoundsCommand s = new SetBoundsCommand(domain, "", new EObjectAdapter(v), p);
					dcs.execute(new ICommandProxy(s));
				}
			}
		}
	}
	
	/*
	 * Gets the EObject's view.
	 */
	private View getIntentionView(GraphicalEditPart part, EObject e)
	{
		View v = part.getNotationView();
		
		if(v.getElement() == e) {
			return v;
		} 
		
		for(Object o : part.getChildren()) {
			v = getIntentionView((GraphicalEditPart)o, e);
			
			if(v != null) {
				return v;
			}
		}
			
		return null;
	}

	private CreateElementCommand selectCreateActorCommand(
			EObject originalImpl, TransactionalEditingDomain domain) {
		CreateElementRequest req = null;
		
		if (changeTo.equals("Actor")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Actor_2001);
		}
		else if (changeTo.equals("Agent")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Agent_2002);
		}
		else if (changeTo.equals("Position")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Position_2003);
		}
		else if (changeTo.equals("Role")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Role_2004);
		}
		return new CreateNewActorTypeCommand(req, originalImpl);
	}
	
	private static class CreateNewActorTypeCommand extends CreateElementCommand {
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

		public CreateNewActorTypeCommand(CreateElementRequest request, EObject original) {
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
	        ((Container) newElement).setName(((Container) oldElement).getName());
	        
	        // Now we should also copy children 
	        ((Container) newElement).getIntentions().addAll(((Container) oldElement).getIntentions());
	        
	        // Put the newly created element in the request so that the
	        // 'after' commands have access to it.
	        getCreateRequest().setNewElement(newElement);
	        
			return (configureStatus == null) ? 
	        		CommandResult.newOKCommandResult(newElement) : 
	        		new CommandResult(configureStatus, newElement);
			
		}
	}

	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
