package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal3CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource3CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal3CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task3CreateCommand;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

/**
 * @generated
 */
public class AgentAgentCompartmentItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GoalmodelElementTypes.Goal_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Goal3CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Softgoal3CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Resource3CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getGEFWrapper(new Task3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
