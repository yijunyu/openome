package edu.toronto.cs.openome_model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TaskItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
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
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4001 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.DependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_4002 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.AndDecompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_4003 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.OrDecompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_4005 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.HelpContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_4006 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.HurtContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_4007 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.MakeContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_4008 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.BreakContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_4009 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.SomePlusContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_4010 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.SomeMinusContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4001 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.DependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_4002 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.AndDecompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_4003 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.OrDecompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_4005 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.HelpContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_4006 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.HurtContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_4007 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.MakeContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_4008 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.BreakContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_4009 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.SomePlusContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_4010 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.SomeMinusContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.DependencyReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.AndDecompositionReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.OrDecompositionReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.HelpContributionReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.HurtContributionReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.MakeContributionReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.BreakContributionReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.SomePlusContributionReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.SomeMinusContributionReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
