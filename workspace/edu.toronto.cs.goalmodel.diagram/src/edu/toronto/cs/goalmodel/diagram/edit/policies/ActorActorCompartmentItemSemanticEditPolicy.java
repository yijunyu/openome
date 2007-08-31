package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal2CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource2CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal2CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task2CreateCommand;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

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
			return getGEFWrapper(new Goal2CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Softgoal2CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Resource2CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Task2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
