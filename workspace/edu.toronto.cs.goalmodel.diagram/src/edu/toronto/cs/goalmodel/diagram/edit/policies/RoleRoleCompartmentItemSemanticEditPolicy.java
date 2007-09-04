package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal5CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource5CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal5CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task5CreateCommand;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

/**
 * @generated
 */
public class RoleRoleCompartmentItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GoalmodelElementTypes.Goal_2013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Goal5CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Softgoal5CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Resource5CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2016 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Task5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
