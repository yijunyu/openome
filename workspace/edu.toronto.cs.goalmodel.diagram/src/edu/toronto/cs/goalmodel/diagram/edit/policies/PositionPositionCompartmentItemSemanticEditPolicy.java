package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal4CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource4CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal4CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task4CreateCommand;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

/**
 * @generated
 */
public class PositionPositionCompartmentItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GoalmodelElementTypes.Goal_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Goal4CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Softgoal4CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Resource4CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Task4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
