package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import edu.toronto.cs.goalmodel.diagram.edit.commands.AndDecompositionCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.AndDecompositionReorientCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.BreakContributionCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.BreakContributionReorientCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.DependencyCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.DependencyReorientCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.HelpContributionCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.HelpContributionReorientCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.HurtContributionCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.HurtContributionReorientCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.MakeContributionCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.MakeContributionReorientCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.OrDecompositionCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.OrDecompositionReorientCommand;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AndDecompositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.BreakContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DependencyEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.HelpContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.HurtContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.MakeContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.OrDecompositionEditPart;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

/**
 * @generated
 */
public class Softgoal6ItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GoalmodelElementTypes.Dependency_3001 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.AndDecomposition_3002 == req.getElementType()) {
			return getGEFWrapper(new AndDecompositionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.OrDecomposition_3003 == req.getElementType()) {
			return getGEFWrapper(new OrDecompositionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.MakeContribution_3004 == req.getElementType()) {
			return getGEFWrapper(new MakeContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.HelpContribution_3005 == req.getElementType()) {
			return getGEFWrapper(new HelpContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.HurtContribution_3006 == req.getElementType()) {
			return getGEFWrapper(new HurtContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.BreakContribution_3007 == req
				.getElementType()) {
			return getGEFWrapper(new BreakContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GoalmodelElementTypes.Dependency_3001 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.AndDecomposition_3002 == req.getElementType()) {
			return getGEFWrapper(new AndDecompositionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.OrDecomposition_3003 == req.getElementType()) {
			return getGEFWrapper(new OrDecompositionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.MakeContribution_3004 == req.getElementType()) {
			return getGEFWrapper(new MakeContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.HelpContribution_3005 == req.getElementType()) {
			return getGEFWrapper(new HelpContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.HurtContribution_3006 == req.getElementType()) {
			return getGEFWrapper(new HurtContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GoalmodelElementTypes.BreakContribution_3007 == req
				.getElementType()) {
			return getGEFWrapper(new BreakContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyReorientCommand(req));
		case AndDecompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new AndDecompositionReorientCommand(req));
		case OrDecompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new OrDecompositionReorientCommand(req));
		case MakeContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new MakeContributionReorientCommand(req));
		case HelpContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new HelpContributionReorientCommand(req));
		case HurtContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new HurtContributionReorientCommand(req));
		case BreakContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new BreakContributionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
