package edu.toronto.cs.goalmodel.diagram.edit.policies;

import edu.toronto.cs.goalmodel.GoalmodelPackage;

import edu.toronto.cs.goalmodel.diagram.edit.commands.GoalCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.ResourceCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.SoftgoalCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.TaskCreateCommand;

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActorActorCompartmentItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GoalmodelElementTypes.Goal_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new GoalCreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new SoftgoalCreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new ResourceCreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new TaskCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
