package edu.toronto.cs.openome_model.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Containers());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.ActorCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Containers());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.AgentCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Containers());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.PositionCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Containers());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.RoleCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Aspect_1005 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Containers());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.AspectCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1006 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.GoalCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1007 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.SoftgoalCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1008 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.TaskCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1009 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getModel_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.ResourceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}