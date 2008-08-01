package edu.toronto.cs.openome_model.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AgentItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
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
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(node)) {
			case edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(cnode)) {
					case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.IsAAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.CoversAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.OccupiesAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.IsPartOfAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.PlaysAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.INSAssociationCreateCommand(
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
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.IsAAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.CoversAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.OccupiesAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.IsPartOfAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.PlaysAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.INSAssociationCreateCommand(
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
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.IsAAssociationReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.CoversAssociationReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.OccupiesAssociationReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.IsPartOfAssociationReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.PlaysAssociationReorientCommand(
					req));
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.INSAssociationReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
