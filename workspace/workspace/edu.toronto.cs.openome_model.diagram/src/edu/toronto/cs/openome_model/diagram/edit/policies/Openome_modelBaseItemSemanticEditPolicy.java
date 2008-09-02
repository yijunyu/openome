package edu.toronto.cs.openome_model.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IEditHelperContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Openome_modelBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Object editHelperContext = completedRequest.getEditHelperContext();
		if (editHelperContext instanceof View
				|| (editHelperContext instanceof IEditHelperContext && ((IEditHelperContext) editHelperContext)
						.getEObject() instanceof View)) {
			// no semantic commands are provided for pure design elements
			return null;
		}
		if (editHelperContext == null) {
			editHelperContext = ViewUtil
					.resolveSemanticElement((View) getHost().getModel());
		}
		IElementType elementType = ElementTypeRegistry.getInstance()
				.getElementType(editHelperContext);
		if (elementType == ElementTypeRegistry.getInstance().getType(
				"org.eclipse.gmf.runtime.emf.type.core.default")) { //$NON-NLS-1$ 
			elementType = null;
		}
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		if (semanticCommand != null) {
			ICommand command = semanticCommand instanceof ICommandProxy ? ((ICommandProxy) semanticCommand)
					.getICommand()
					: new CommandProxy(semanticCommand);
			completedRequest
					.setParameter(
							edu.toronto.cs.openome_model.diagram.edit.helpers.Openome_modelBaseEditHelper.EDIT_POLICY_COMMAND,
							command);
		}
		if (elementType != null) {
			ICommand command = elementType.getEditCommand(completedRequest);
			if (command != null) {
				if (!(command instanceof CompositeTransactionalCommand)) {
					TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
							.getEditingDomain();
					command = new CompositeTransactionalCommand(editingDomain,
							command.getLabel()).compose(command);
				}
				semanticCommand = new ICommandProxy(command);
			}
		}
		boolean shouldProceed = true;
		if (completedRequest instanceof DestroyRequest) {
			shouldProceed = shouldProceed((DestroyRequest) completedRequest);
		}
		if (shouldProceed) {
			if (completedRequest instanceof DestroyRequest) {
				TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
						.getEditingDomain();
				Command deleteViewCommand = new ICommandProxy(
						new DeleteCommand(editingDomain, (View) getHost()
								.getModel()));
				semanticCommand = semanticCommand == null ? deleteViewCommand
						: semanticCommand.chain(deleteViewCommand);
			}
			return semanticCommand;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * @deprecated use getGEFWrapper() instead
	 * @generated
	 */
	protected final Command getMSLWrapper(ICommand cmd) {
		// XXX deprecated: use getGEFWrapper() instead
		return getGEFWrapper(cmd);
	}

	/**
	 * @generated
	 */
	protected EObject getSemanticElement() {
		return ViewUtil.resolveSemanticElement((View) getHost().getModel());
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Creates command to destroy the link.
	 * 
	 * @generated
	 */
	protected Command getDestroyElementCommand(View view) {
		EditPart editPart = (EditPart) getHost().getViewer()
				.getEditPartRegistry().get(view);
		DestroyElementRequest request = new DestroyElementRequest(
				getEditingDomain(), false);
		return editPart.getCommand(new EditCommandRequestWrapper(request,
				Collections.EMPTY_MAP));
	}

	/**
	 * Creates commands to destroy all host incoming and outgoing links.
	 * 
	 * @generated
	 */
	protected CompoundCommand getDestroyEdgesCommand() {
		CompoundCommand cmd = new CompoundCommand();
		View view = (View) getHost().getModel();
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		return cmd;
	}

	/**
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(CompoundCommand command) {
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return;
		}
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			command.add(getDestroyElementCommand(nextView));
		}
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		public static boolean canCreateDependency_3001(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Dependable source,
				edu.toronto.cs.openome_model.Dependable target) {
			return canExistDependency_3001(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAndDecomposition_3002(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistAndDecomposition_3002(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateOrDecomposition_3003(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistOrDecomposition_3003(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateHelpContribution_3004(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistHelpContribution_3004(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateHurtContribution_3005(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistHurtContribution_3005(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateMakeContribution_3006(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistMakeContribution_3006(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBreakContribution_3007(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistBreakContribution_3007(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSomePlusContribution_3008(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistSomePlusContribution_3008(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSomeMinusContribution_3009(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistSomeMinusContribution_3009(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateUnknownContribution_3010(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistUnknownContribution_3010(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAndContribution_3011(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistAndContribution_3011(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateOrContribution_3012(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistOrContribution_3012(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIsAAssociation_3013(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistIsAAssociation_3013(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCoversAssociation_3014(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistCoversAssociation_3014(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateOccupiesAssociation_3015(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistOccupiesAssociation_3015(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIsPartOfAssociation_3016(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistIsPartOfAssociation_3016(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePlaysAssociation_3017(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistPlaysAssociation_3017(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateINSAssociation_3018(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistINSAssociation_3018(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistDependency_3001(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Dependable source,
				edu.toronto.cs.openome_model.Dependable target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAndDecomposition_3002(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistOrDecomposition_3003(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistHelpContribution_3004(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistHurtContribution_3005(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistMakeContribution_3006(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBreakContribution_3007(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSomePlusContribution_3008(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSomeMinusContribution_3009(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistUnknownContribution_3010(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAndContribution_3011(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistOrContribution_3012(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIsAAssociation_3013(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCoversAssociation_3014(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistOccupiesAssociation_3015(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIsPartOfAssociation_3016(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistPlaysAssociation_3017(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistINSAssociation_3018(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {

			return true;
		}
	}

}
