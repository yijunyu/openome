package edu.toronto.cs.goalmodel.diagram.edit.policies;

import edu.toronto.cs.goalmodel.GoalmodelPackage;

import edu.toronto.cs.goalmodel.diagram.edit.commands.Goal3CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Resource3CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Softgoal3CreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.Task3CreateCommand;

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

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
			return getMSLWrapper(new Goal3CreateCommand(req));
		}
		if (GoalmodelElementTypes.Softgoal_2010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Softgoal3CreateCommand(req));
		}
		if (GoalmodelElementTypes.Resource_2011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Resource3CreateCommand(req));
		}
		if (GoalmodelElementTypes.Task_2012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GoalmodelPackage.eINSTANCE
						.getContainer_Intentions());
			}
			return getMSLWrapper(new Task3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
