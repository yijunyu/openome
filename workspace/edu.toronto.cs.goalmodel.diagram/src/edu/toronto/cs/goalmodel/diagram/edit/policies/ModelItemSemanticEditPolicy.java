package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import edu.toronto.cs.goalmodel.GoalmodelPackage;

import edu.toronto.cs.goalmodel.diagram.edit.commands.ActorCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.AgentCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.AspectCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal6CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.PositionCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource6CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.RoleCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal6CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task6CreateCommand;

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GoalmodelElementTypes.Actor_1001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Containers());
			}
			return getMSLWrapper(new ActorCreateCommand(req));
		}
		if (GoalmodelElementTypes.Agent_1002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Containers());
			}
			return getMSLWrapper(new AgentCreateCommand(req));
		}
		if (GoalmodelElementTypes.Position_1003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Containers());
			}
			return getMSLWrapper(new PositionCreateCommand(req));
		}
		if (GoalmodelElementTypes.Role_1004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Containers());
			}
			return getMSLWrapper(new RoleCreateCommand(req));
		}
		if (GoalmodelElementTypes.Aspect_1005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Containers());
			}
			return getMSLWrapper(new AspectCreateCommand(req));
		}
		if (GoalmodelElementTypes.Goal_1006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Intentions());
			}
			return getMSLWrapper(new Goal6CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_1007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Intentions());
			}
			return getMSLWrapper(new Softgoal6CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_1008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Intentions());
			}
			return getMSLWrapper(new Task6CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_1009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getModel_Intentions());
			}
			return getMSLWrapper(new Resource6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getMSLWrapper(new DuplicateAnythingCommand(editingDomain, req));
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
