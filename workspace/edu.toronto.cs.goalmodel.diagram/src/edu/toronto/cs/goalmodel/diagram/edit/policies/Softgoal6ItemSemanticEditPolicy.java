package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Intention;
import edu.toronto.cs.goalmodel.Model;

import edu.toronto.cs.goalmodel.diagram.edit.commands.AndDecompositionTypeLinkCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.BreakContributionTypeLinkCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.DependencyTypeLinkCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.HelpContributionTypeLinkCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.HurtContributionTypeLinkCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.MakeContributionTypeLinkCreateCommand;
import edu.toronto.cs.goalmodel.diagram.edit.commands.OrDecompositionTypeLinkCreateCommand;

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

import org.eclipse.gef.commands.UnexecutableCommand;

/**
 * @generated
 */
public class Softgoal6ItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GoalmodelElementTypes.Dependency_3001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingDependency3001Command(req)
					: getCreateCompleteIncomingDependency3001Command(req);
		}
		if (GoalmodelElementTypes.AndDecomposition_3002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingAndDecomposition3002Command(req)
					: getCreateCompleteIncomingAndDecomposition3002Command(req);
		}
		if (GoalmodelElementTypes.OrDecomposition_3003 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingOrDecomposition3003Command(req)
					: getCreateCompleteIncomingOrDecomposition3003Command(req);
		}
		if (GoalmodelElementTypes.MakeContribution_3004 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingMakeContribution3004Command(req)
					: getCreateCompleteIncomingMakeContribution3004Command(req);
		}
		if (GoalmodelElementTypes.HelpContribution_3005 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingHelpContribution3005Command(req)
					: getCreateCompleteIncomingHelpContribution3005Command(req);
		}
		if (GoalmodelElementTypes.HurtContribution_3006 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingHurtContribution3006Command(req)
					: getCreateCompleteIncomingHurtContribution3006Command(req);
		}
		if (GoalmodelElementTypes.BreakContribution_3007 == req
				.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingBreakContribution3007Command(req)
					: getCreateCompleteIncomingBreakContribution3007Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingDependency3001Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| (targetEObject != null && false == targetEObject instanceof Intention)) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateDependency_3001(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependency3001Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| false == targetEObject instanceof Intention) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateDependency_3001(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(GoalmodelPackage.eINSTANCE
					.getModel_Dependencies());
		}
		return getMSLWrapper(new DependencyTypeLinkCreateCommand(req,
				container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingAndDecomposition3002Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| (targetEObject != null && false == targetEObject instanceof Intention)) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateAndDecomposition_3002(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingAndDecomposition3002Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| false == targetEObject instanceof Intention) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateAndDecomposition_3002(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(GoalmodelPackage.eINSTANCE
					.getModel_Decompositions());
		}
		return getMSLWrapper(new AndDecompositionTypeLinkCreateCommand(req,
				container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingOrDecomposition3003Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| (targetEObject != null && false == targetEObject instanceof Intention)) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateOrDecomposition_3003(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingOrDecomposition3003Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| false == targetEObject instanceof Intention) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateOrDecomposition_3003(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(GoalmodelPackage.eINSTANCE
					.getModel_Decompositions());
		}
		return getMSLWrapper(new OrDecompositionTypeLinkCreateCommand(req,
				container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingMakeContribution3004Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| (targetEObject != null && false == targetEObject instanceof Intention)) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateMakeContribution_3004(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingMakeContribution3004Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| false == targetEObject instanceof Intention) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateMakeContribution_3004(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(GoalmodelPackage.eINSTANCE
					.getModel_Contributions());
		}
		return getMSLWrapper(new MakeContributionTypeLinkCreateCommand(req,
				container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingHelpContribution3005Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| (targetEObject != null && false == targetEObject instanceof Intention)) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateHelpContribution_3005(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingHelpContribution3005Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| false == targetEObject instanceof Intention) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateHelpContribution_3005(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(GoalmodelPackage.eINSTANCE
					.getModel_Contributions());
		}
		return getMSLWrapper(new HelpContributionTypeLinkCreateCommand(req,
				container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingHurtContribution3006Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| (targetEObject != null && false == targetEObject instanceof Intention)) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateHurtContribution_3006(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingHurtContribution3006Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| false == targetEObject instanceof Intention) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateHurtContribution_3006(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(GoalmodelPackage.eINSTANCE
					.getModel_Contributions());
		}
		return getMSLWrapper(new HurtContributionTypeLinkCreateCommand(req,
				container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingBreakContribution3007Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| (targetEObject != null && false == targetEObject instanceof Intention)) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateBreakContribution_3007(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingBreakContribution3007Command(
			CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Intention
				|| false == targetEObject instanceof Intention) {
			return UnexecutableCommand.INSTANCE;
		}
		Intention source = (Intention) sourceEObject;
		Intention target = (Intention) targetEObject;

		Model container = (Model) getRelationshipContainer(source,
				GoalmodelPackage.eINSTANCE.getModel(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateBreakContribution_3007(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(GoalmodelPackage.eINSTANCE
					.getModel_Contributions());
		}
		return getMSLWrapper(new BreakContributionTypeLinkCreateCommand(req,
				container, source, target));
	}
}
