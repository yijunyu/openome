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
public class GoalItemSemanticEditPolicy
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
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.DependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3003 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.AndDecompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3004 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.OrDecompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Contribution_3005 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.ContributionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.DependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3003 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.AndDecompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3004 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.OrDecompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Contribution_3005 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.ContributionCreateCommand(
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
		case edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.ContributionReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
