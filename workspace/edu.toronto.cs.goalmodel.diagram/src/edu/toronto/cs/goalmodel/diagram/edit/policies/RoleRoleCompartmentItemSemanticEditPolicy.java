package edu.toronto.cs.goalmodel.diagram.edit.policies;

import edu.toronto.cs.goalmodel.GoalmodelPackage;

import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal4CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource4CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal4CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task4CreateCommand;

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

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
			return getMSLWrapper(new Goal4CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Softgoal4CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Resource4CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2016 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Task4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
