package edu.toronto.cs.openome_model.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Openome_modelViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(diagramKind)
				&& edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getDiagramVisualID(semanticElement) != -1) {
			return edu.toronto.cs.openome_model.diagram.view.factories.ModelViewFactory.class;
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
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
								.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
						.equals(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
								.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabelEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel2EditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case edu.toronto.cs.openome_model.diagram.edit.parts.ContributionIstar_contribution_typeEditPart.VISUAL_ID:
					if (edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ActorViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ActorNameViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.AgentViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.AgentNameViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.PositionViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.PositionNameViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.RoleViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.RoleNameViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.GoalViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.GoalNameViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.SoftgoalViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.SoftgoalNameViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.TaskViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.TaskNameViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ResourceViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ResourceNameViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Goal2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.GoalName2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Softgoal2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.SoftgoalName2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Resource2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ResourceName2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Task2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.TaskName2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Goal3ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.GoalName3ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Softgoal3ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.SoftgoalName3ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Resource3ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ResourceName3ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Task3ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.TaskName3ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Goal4ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.GoalName4ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Softgoal4ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.SoftgoalName4ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Resource4ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ResourceName4ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Task4ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.TaskName4ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Goal5ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.GoalName5ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Softgoal5ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.SoftgoalName5ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Resource5ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ResourceName5ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Task5ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.TaskName5ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ActorActorCompartmentViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.AgentAgentCompartmentViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.PositionPositionCompartmentViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.RoleRoleCompartmentViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabelEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.WrapLabelViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.WrapLabel2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ContributionIstar_contribution_typeEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ContributionIstar_contribution_typeViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.DependencyViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.Dependency2ViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.AndDecompositionViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.OrDecompositionViewFactory.class;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return edu.toronto.cs.openome_model.diagram.view.factories.ContributionViewFactory.class;
		}
		return null;
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
}
