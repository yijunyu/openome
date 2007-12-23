package edu.toronto.cs.goalmodel.diagram.edit.policies;

import edu.toronto.cs.goalmodel.GoalmodelPackage;

import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal2CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource2CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal2CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task2CreateCommand;

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

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
			return getMSLWrapper(new Goal2CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Softgoal2CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Resource2CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Task2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
