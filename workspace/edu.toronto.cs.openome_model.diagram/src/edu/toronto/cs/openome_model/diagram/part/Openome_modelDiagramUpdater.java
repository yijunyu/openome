package edu.toronto.cs.openome_model.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Openome_modelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID:
			return getActorActorCompartment_7001SemanticChildren(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID:
			return getAgentAgentCompartment_7002SemanticChildren(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID:
			return getPositionPositionCompartment_7003SemanticChildren(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID:
			return getRoleRoleCompartment_7004SemanticChildren(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActorActorCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Actor modelElement = (edu.toronto.cs.openome_model.Actor) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgentAgentCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Agent modelElement = (edu.toronto.cs.openome_model.Agent) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPositionPositionCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Position modelElement = (edu.toronto.cs.openome_model.Position) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleRoleCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Role modelElement = (edu.toronto.cs.openome_model.Role) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Model modelElement = (edu.toronto.cs.openome_model.Model) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getContainers().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Container childElement = (edu.toronto.cs.openome_model.Container) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return getAgent_2002ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return getPosition_2003ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2004ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2005ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2006ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return getTask_2007ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2008ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3002ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_3003ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return getTask_3004ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return getGoal_3005ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_3006ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return getResource_3007ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return getTask_3008ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return getGoal_3009ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_3010ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return getResource_3011ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return getTask_3012ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return getGoal_3013ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_3014ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return getResource_3015ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return getTask_3016ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_4001ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID:
			return getDependency_4002ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_4003ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_4004ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getContribution_4005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return getAgent_2002IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return getPosition_2003IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2004IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2005IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2006IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return getTask_2007IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2008IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3002IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_3003IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return getTask_3004IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return getGoal_3005IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_3006IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return getResource_3007IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return getTask_3008IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return getGoal_3009IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_3010IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return getResource_3011IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return getTask_3012IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return getGoal_3013IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_3014IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return getResource_3015IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return getTask_3016IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_4001IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID:
			return getDependency_4002IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_4003IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_4004IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getContribution_4005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return getAgent_2002OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return getPosition_2003OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2004OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2005OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2006OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return getTask_2007OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2008OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3002OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_3003OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return getTask_3004OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return getGoal_3005OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_3006OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return getResource_3007OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return getTask_3008OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return getGoal_3009OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_3010OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return getResource_3011OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return getTask_3012OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return getGoal_3013OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_3014OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return getResource_3015OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return getTask_3016OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_4001OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID:
			return getDependency_4002OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_4003OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_4004OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getContribution_4005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getModel_1000ContainedLinks(View view) {
		edu.toronto.cs.openome_model.Model modelElement = (edu.toronto.cs.openome_model.Model) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Dependency_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPosition_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_3012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getContribution_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_2001IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Actor modelElement = (edu.toronto.cs.openome_model.Actor) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2002IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Agent modelElement = (edu.toronto.cs.openome_model.Agent) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPosition_2003IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Position modelElement = (edu.toronto.cs.openome_model.Position) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2004IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Role modelElement = (edu.toronto.cs.openome_model.Role) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2005IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2006IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2007IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2008IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3001IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3002IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3003IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_3004IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3005IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3006IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3007IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_3008IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3009IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3010IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3011IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_3012IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3013IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3014IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3015IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_3016IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_4004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getContribution_4005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_2001OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Actor modelElement = (edu.toronto.cs.openome_model.Actor) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2002OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Agent modelElement = (edu.toronto.cs.openome_model.Agent) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPosition_2003OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Position modelElement = (edu.toronto.cs.openome_model.Position) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2004OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Role modelElement = (edu.toronto.cs.openome_model.Role) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2005OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2006OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2007OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2008OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3001OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3002OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3003OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_3004OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3005OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3006OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3007OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_3008OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3009OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3010OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3011OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_3012OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_3013OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_3014OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3015OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_3016OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_4004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getContribution_4005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Dependency_4001(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link
					.getDependencyFrom();
			edu.toronto.cs.openome_model.Intention src = link.getDependencyTo();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4001,
							edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Dependency_4002(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getActorDependencyFrom();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof edu.toronto.cs.openome_model.Container) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = (edu.toronto.cs.openome_model.Container) theTarget;
			edu.toronto.cs.openome_model.Container src = link
					.getActorDependencyTo();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4002,
							edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_AndDecomposition_4003(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.AndDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.AndDecomposition link = (edu.toronto.cs.openome_model.AndDecomposition) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_4003,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OrDecomposition_4004(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.OrDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.OrDecomposition link = (edu.toronto.cs.openome_model.OrDecomposition) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_4004,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Contribution_4005(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.Contribution) {
				continue;
			}
			edu.toronto.cs.openome_model.Contribution link = (edu.toronto.cs.openome_model.Contribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Contribution_4005,
							edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Dependency_4001(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
					.getDependency_DependencyFrom()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getDependencyTo();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4001,
							edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Dependency_4002(
			edu.toronto.cs.openome_model.Container target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
					.getDependency_ActorDependencyFrom()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container src = link
					.getActorDependencyTo();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4002,
							edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_AndDecomposition_4003(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
					.getDecomposition_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.AndDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.AndDecomposition link = (edu.toronto.cs.openome_model.AndDecomposition) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_4003,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OrDecomposition_4004(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
					.getDecomposition_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.OrDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.OrDecomposition link = (edu.toronto.cs.openome_model.OrDecomposition) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_4004,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Contribution_4005(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.Contribution) {
				continue;
			}
			edu.toronto.cs.openome_model.Contribution link = (edu.toronto.cs.openome_model.Contribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Contribution_4005,
							edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Dependency_4001(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link
					.getDependencyFrom();
			edu.toronto.cs.openome_model.Intention src = link.getDependencyTo();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4001,
							edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Dependency_4002(
			edu.toronto.cs.openome_model.Container source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getActorDependencyFrom();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof edu.toronto.cs.openome_model.Container) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = (edu.toronto.cs.openome_model.Container) theTarget;
			edu.toronto.cs.openome_model.Container src = link
					.getActorDependencyTo();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4002,
							edu.toronto.cs.openome_model.diagram.edit.parts.Dependency2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_AndDecomposition_4003(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.AndDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.AndDecomposition link = (edu.toronto.cs.openome_model.AndDecomposition) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_4003,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OrDecomposition_4004(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.OrDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.OrDecomposition link = (edu.toronto.cs.openome_model.OrDecomposition) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_4004,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Contribution_4005(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.Contribution) {
				continue;
			}
			edu.toronto.cs.openome_model.Contribution link = (edu.toronto.cs.openome_model.Contribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Contribution_4005,
							edu.toronto.cs.openome_model.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

}
