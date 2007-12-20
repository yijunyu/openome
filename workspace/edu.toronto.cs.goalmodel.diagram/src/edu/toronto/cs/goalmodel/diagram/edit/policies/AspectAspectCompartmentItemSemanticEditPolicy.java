package edu.toronto.cs.goalmodel.diagram.edit.policies;

import edu.toronto.cs.goalmodel.GoalmodelPackage;

import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal5CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource5CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal5CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task5CreateCommand;

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AspectAspectCompartmentItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GoalmodelElementTypes.Goal_2017 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Goal5CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Softgoal5CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2019 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Resource5CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2020 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Task5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
