package edu.toronto.cs.goalmodel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AndDecompositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectAspectCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.BreakContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DependencyEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DependencyLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramAndLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramBreakLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramHelpLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramHurtLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramMakeLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramOrLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.HelpContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.HurtContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.MakeContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ModelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.OrDecompositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleRoleCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskNameEditPart;

import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

import edu.toronto.cs.goalmodel.diagram.view.factories.ActorActorCompartmentViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ActorNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ActorViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.AgentAgentCompartmentViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.AgentNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.AgentViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.AndDecompositionViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.AspectAspectCompartmentViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.AspectNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.AspectViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.BreakContributionViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.DependencyLabelViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.DependencyViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.DiagramAndLabelViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.DiagramBreakLabelViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.DiagramHelpLabelViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.DiagramHurtLabelViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.DiagramMakeLabelViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.DiagramOrLabelViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Goal2ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Goal3ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Goal4ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Goal5ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Goal6ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.GoalName2ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.GoalName3ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.GoalName4ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.GoalName5ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.GoalName6ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.GoalNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.GoalViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.HelpContributionViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.HurtContributionViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.MakeContributionViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ModelViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.OrDecompositionViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.PositionNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.PositionPositionCompartmentViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.PositionViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Resource2ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Resource3ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Resource4ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Resource5ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Resource6ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ResourceName2ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ResourceName3ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ResourceName4ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ResourceName5ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ResourceName6ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ResourceNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.ResourceViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.RoleNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.RoleRoleCompartmentViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.RoleViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Softgoal2ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Softgoal3ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Softgoal4ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Softgoal5ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Softgoal6ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.SoftgoalName2ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.SoftgoalName3ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.SoftgoalName4ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.SoftgoalName5ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.SoftgoalName6ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.SoftgoalNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.SoftgoalViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Task2ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Task3ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Task4ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Task5ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.Task6ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.TaskName2ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.TaskName3ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.TaskName4ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.TaskName5ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.TaskName6ViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.TaskNameViewFactory;
import edu.toronto.cs.goalmodel.diagram.view.factories.TaskViewFactory;

/**
 * @generated
 */
public class GoalmodelViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (ModelEditPart.MODEL_ID.equals(diagramKind)
				&& GoalmodelVisualIDRegistry
						.getDiagramVisualID(semanticElement) != -1) {
			return ModelViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null
				&& !GoalmodelElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = GoalmodelVisualIDRegistry.getNodeVisualID(containerView,
				semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
		case ActorEditPart.VISUAL_ID:
			return ActorViewFactory.class;
		case ActorNameEditPart.VISUAL_ID:
			return ActorNameViewFactory.class;
		case AgentEditPart.VISUAL_ID:
			return AgentViewFactory.class;
		case AgentNameEditPart.VISUAL_ID:
			return AgentNameViewFactory.class;
		case PositionEditPart.VISUAL_ID:
			return PositionViewFactory.class;
		case PositionNameEditPart.VISUAL_ID:
			return PositionNameViewFactory.class;
		case RoleEditPart.VISUAL_ID:
			return RoleViewFactory.class;
		case RoleNameEditPart.VISUAL_ID:
			return RoleNameViewFactory.class;
		case AspectEditPart.VISUAL_ID:
			return AspectViewFactory.class;
		case AspectNameEditPart.VISUAL_ID:
			return AspectNameViewFactory.class;
		case Goal6EditPart.VISUAL_ID:
			return Goal6ViewFactory.class;
		case GoalName6EditPart.VISUAL_ID:
			return GoalName6ViewFactory.class;
		case Softgoal6EditPart.VISUAL_ID:
			return Softgoal6ViewFactory.class;
		case SoftgoalName6EditPart.VISUAL_ID:
			return SoftgoalName6ViewFactory.class;
		case Task6EditPart.VISUAL_ID:
			return Task6ViewFactory.class;
		case TaskName6EditPart.VISUAL_ID:
			return TaskName6ViewFactory.class;
		case Resource6EditPart.VISUAL_ID:
			return Resource6ViewFactory.class;
		case ResourceName6EditPart.VISUAL_ID:
			return ResourceName6ViewFactory.class;
		case GoalEditPart.VISUAL_ID:
			return GoalViewFactory.class;
		case GoalNameEditPart.VISUAL_ID:
			return GoalNameViewFactory.class;
		case SoftgoalEditPart.VISUAL_ID:
			return SoftgoalViewFactory.class;
		case SoftgoalNameEditPart.VISUAL_ID:
			return SoftgoalNameViewFactory.class;
		case ResourceEditPart.VISUAL_ID:
			return ResourceViewFactory.class;
		case ResourceNameEditPart.VISUAL_ID:
			return ResourceNameViewFactory.class;
		case TaskEditPart.VISUAL_ID:
			return TaskViewFactory.class;
		case TaskNameEditPart.VISUAL_ID:
			return TaskNameViewFactory.class;
		case Goal2EditPart.VISUAL_ID:
			return Goal2ViewFactory.class;
		case GoalName2EditPart.VISUAL_ID:
			return GoalName2ViewFactory.class;
		case Softgoal2EditPart.VISUAL_ID:
			return Softgoal2ViewFactory.class;
		case SoftgoalName2EditPart.VISUAL_ID:
			return SoftgoalName2ViewFactory.class;
		case Resource2EditPart.VISUAL_ID:
			return Resource2ViewFactory.class;
		case ResourceName2EditPart.VISUAL_ID:
			return ResourceName2ViewFactory.class;
		case Task2EditPart.VISUAL_ID:
			return Task2ViewFactory.class;
		case TaskName2EditPart.VISUAL_ID:
			return TaskName2ViewFactory.class;
		case Goal3EditPart.VISUAL_ID:
			return Goal3ViewFactory.class;
		case GoalName3EditPart.VISUAL_ID:
			return GoalName3ViewFactory.class;
		case Softgoal3EditPart.VISUAL_ID:
			return Softgoal3ViewFactory.class;
		case SoftgoalName3EditPart.VISUAL_ID:
			return SoftgoalName3ViewFactory.class;
		case Resource3EditPart.VISUAL_ID:
			return Resource3ViewFactory.class;
		case ResourceName3EditPart.VISUAL_ID:
			return ResourceName3ViewFactory.class;
		case Task3EditPart.VISUAL_ID:
			return Task3ViewFactory.class;
		case TaskName3EditPart.VISUAL_ID:
			return TaskName3ViewFactory.class;
		case Goal4EditPart.VISUAL_ID:
			return Goal4ViewFactory.class;
		case GoalName4EditPart.VISUAL_ID:
			return GoalName4ViewFactory.class;
		case Softgoal4EditPart.VISUAL_ID:
			return Softgoal4ViewFactory.class;
		case SoftgoalName4EditPart.VISUAL_ID:
			return SoftgoalName4ViewFactory.class;
		case Resource4EditPart.VISUAL_ID:
			return Resource4ViewFactory.class;
		case ResourceName4EditPart.VISUAL_ID:
			return ResourceName4ViewFactory.class;
		case Task4EditPart.VISUAL_ID:
			return Task4ViewFactory.class;
		case TaskName4EditPart.VISUAL_ID:
			return TaskName4ViewFactory.class;
		case Goal5EditPart.VISUAL_ID:
			return Goal5ViewFactory.class;
		case GoalName5EditPart.VISUAL_ID:
			return GoalName5ViewFactory.class;
		case Softgoal5EditPart.VISUAL_ID:
			return Softgoal5ViewFactory.class;
		case SoftgoalName5EditPart.VISUAL_ID:
			return SoftgoalName5ViewFactory.class;
		case Resource5EditPart.VISUAL_ID:
			return Resource5ViewFactory.class;
		case ResourceName5EditPart.VISUAL_ID:
			return ResourceName5ViewFactory.class;
		case Task5EditPart.VISUAL_ID:
			return Task5ViewFactory.class;
		case TaskName5EditPart.VISUAL_ID:
			return TaskName5ViewFactory.class;
		case ActorActorCompartmentEditPart.VISUAL_ID:
			return ActorActorCompartmentViewFactory.class;
		case AgentAgentCompartmentEditPart.VISUAL_ID:
			return AgentAgentCompartmentViewFactory.class;
		case PositionPositionCompartmentEditPart.VISUAL_ID:
			return PositionPositionCompartmentViewFactory.class;
		case RoleRoleCompartmentEditPart.VISUAL_ID:
			return RoleRoleCompartmentViewFactory.class;
		case AspectAspectCompartmentEditPart.VISUAL_ID:
			return AspectAspectCompartmentViewFactory.class;
		case DependencyLabelEditPart.VISUAL_ID:
			return DependencyLabelViewFactory.class;
		case DiagramAndLabelEditPart.VISUAL_ID:
			return DiagramAndLabelViewFactory.class;
		case DiagramOrLabelEditPart.VISUAL_ID:
			return DiagramOrLabelViewFactory.class;
		case DiagramMakeLabelEditPart.VISUAL_ID:
			return DiagramMakeLabelViewFactory.class;
		case DiagramHelpLabelEditPart.VISUAL_ID:
			return DiagramHelpLabelViewFactory.class;
		case DiagramHurtLabelEditPart.VISUAL_ID:
			return DiagramHurtLabelViewFactory.class;
		case DiagramBreakLabelEditPart.VISUAL_ID:
			return DiagramBreakLabelViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null
				&& !GoalmodelElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		if (semanticType == null) {
			return null;
		}
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int linkVID = GoalmodelVisualIDRegistry.getLinkWithClassVisualID(
				semanticElement, semanticType);
		switch (linkVID) {
		case DependencyEditPart.VISUAL_ID:
			return DependencyViewFactory.class;
		case AndDecompositionEditPart.VISUAL_ID:
			return AndDecompositionViewFactory.class;
		case OrDecompositionEditPart.VISUAL_ID:
			return OrDecompositionViewFactory.class;
		case MakeContributionEditPart.VISUAL_ID:
			return MakeContributionViewFactory.class;
		case HelpContributionEditPart.VISUAL_ID:
			return HelpContributionViewFactory.class;
		case HurtContributionEditPart.VISUAL_ID:
			return HurtContributionViewFactory.class;
		case BreakContributionEditPart.VISUAL_ID:
			return BreakContributionViewFactory.class;
		}
		return getUnrecognizedConnectorViewClass(semanticAdapter,
				containerView, semanticHint);
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

	/**
	 * @generated
	 */
	private Class getUnrecognizedConnectorViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		// Handle unrecognized child node classes here
		return null;
	}

}
