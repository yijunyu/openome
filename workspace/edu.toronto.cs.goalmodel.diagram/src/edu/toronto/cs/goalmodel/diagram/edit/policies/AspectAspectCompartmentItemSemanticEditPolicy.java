package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal6CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource6CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal6CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task6CreateCommand;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

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
			return getGEFWrapper(new Goal6CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Softgoal6CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2019 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Resource6CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2020 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Task6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
