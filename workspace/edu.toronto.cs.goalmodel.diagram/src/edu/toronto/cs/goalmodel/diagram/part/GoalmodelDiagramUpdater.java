package edu.toronto.cs.goalmodel.diagram.part;

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

import edu.toronto.cs.goalmodel.Actor;
import edu.toronto.cs.goalmodel.Agent;
import edu.toronto.cs.goalmodel.AndDecomposition;
import edu.toronto.cs.goalmodel.Aspect;
import edu.toronto.cs.goalmodel.BreakContribution;
import edu.toronto.cs.goalmodel.Container;
import edu.toronto.cs.goalmodel.Dependency;
import edu.toronto.cs.goalmodel.Goal;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.HelpContribution;
import edu.toronto.cs.goalmodel.HurtContribution;
import edu.toronto.cs.goalmodel.Intention;
import edu.toronto.cs.goalmodel.MakeContribution;
import edu.toronto.cs.goalmodel.Model;
import edu.toronto.cs.goalmodel.OrDecomposition;
import edu.toronto.cs.goalmodel.Position;
import edu.toronto.cs.goalmodel.Resource;
import edu.toronto.cs.goalmodel.Role;
import edu.toronto.cs.goalmodel.Softgoal;
import edu.toronto.cs.goalmodel.Task;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AndDecompositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectAspectCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.BreakContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DependencyEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.HelpContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.HurtContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.MakeContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ModelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.OrDecompositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleRoleCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskEditPart;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

/**
 * @generated
 */
public class GoalmodelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {
		case ActorActorCompartmentEditPart.VISUAL_ID:
			return getActorActorCompartment_5001SemanticChildren(view);
		case AgentAgentCompartmentEditPart.VISUAL_ID:
			return getAgentAgentCompartment_5002SemanticChildren(view);
		case PositionPositionCompartmentEditPart.VISUAL_ID:
			return getPositionPositionCompartment_5003SemanticChildren(view);
		case RoleRoleCompartmentEditPart.VISUAL_ID:
			return getRoleRoleCompartment_5004SemanticChildren(view);
		case AspectAspectCompartmentEditPart.VISUAL_ID:
			return getAspectAspectCompartment_5005SemanticChildren(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActorActorCompartment_5001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Actor modelElement = (Actor) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			Intention childElement = (Intention) it.next();
			int visualID = GoalmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal2EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal2EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource2EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task2EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgentAgentCompartment_5002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Agent modelElement = (Agent) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			Intention childElement = (Intention) it.next();
			int visualID = GoalmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal3EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal3EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource3EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task3EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPositionPositionCompartment_5003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Position modelElement = (Position) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			Intention childElement = (Intention) it.next();
			int visualID = GoalmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal4EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal4EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource4EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task4EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleRoleCompartment_5004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Role modelElement = (Role) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			Intention childElement = (Intention) it.next();
			int visualID = GoalmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal5EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal5EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource5EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task5EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAspectAspectCompartment_5005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Aspect modelElement = (Aspect) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			Intention childElement = (Intention) it.next();
			int visualID = GoalmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal6EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal6EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource6EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task6EditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getModel_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Model modelElement = (Model) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getContainers().iterator(); it
				.hasNext();) {
			Container childElement = (Container) it.next();
			int visualID = GoalmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AgentEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PositionEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AspectEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			Intention childElement = (Intention) it.next();
			int visualID = GoalmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GoalEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SoftgoalEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TaskEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ResourceEditPart.VISUAL_ID) {
				result.add(new GoalmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_79ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_1001ContainedLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_1002ContainedLinks(view);
		case PositionEditPart.VISUAL_ID:
			return getPosition_1003ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_1004ContainedLinks(view);
		case AspectEditPart.VISUAL_ID:
			return getAspect_1005ContainedLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_1006ContainedLinks(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_1007ContainedLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_1008ContainedLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_1009ContainedLinks(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_2001ContainedLinks(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2002ContainedLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_2003ContainedLinks(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_2004ContainedLinks(view);
		case Goal3EditPart.VISUAL_ID:
			return getGoal_2005ContainedLinks(view);
		case Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2006ContainedLinks(view);
		case Resource3EditPart.VISUAL_ID:
			return getResource_2007ContainedLinks(view);
		case Task3EditPart.VISUAL_ID:
			return getTask_2008ContainedLinks(view);
		case Goal4EditPart.VISUAL_ID:
			return getGoal_2009ContainedLinks(view);
		case Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2010ContainedLinks(view);
		case Resource4EditPart.VISUAL_ID:
			return getResource_2011ContainedLinks(view);
		case Task4EditPart.VISUAL_ID:
			return getTask_2012ContainedLinks(view);
		case Goal5EditPart.VISUAL_ID:
			return getGoal_2013ContainedLinks(view);
		case Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2014ContainedLinks(view);
		case Resource5EditPart.VISUAL_ID:
			return getResource_2015ContainedLinks(view);
		case Task5EditPart.VISUAL_ID:
			return getTask_2016ContainedLinks(view);
		case Goal6EditPart.VISUAL_ID:
			return getGoal_2017ContainedLinks(view);
		case Softgoal6EditPart.VISUAL_ID:
			return getSoftgoal_2018ContainedLinks(view);
		case Resource6EditPart.VISUAL_ID:
			return getResource_2019ContainedLinks(view);
		case Task6EditPart.VISUAL_ID:
			return getTask_2020ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_3001ContainedLinks(view);
		case AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_3002ContainedLinks(view);
		case OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_3003ContainedLinks(view);
		case MakeContributionEditPart.VISUAL_ID:
			return getMakeContribution_3004ContainedLinks(view);
		case HelpContributionEditPart.VISUAL_ID:
			return getHelpContribution_3005ContainedLinks(view);
		case HurtContributionEditPart.VISUAL_ID:
			return getHurtContribution_3006ContainedLinks(view);
		case BreakContributionEditPart.VISUAL_ID:
			return getBreakContribution_3007ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_1001IncomingLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_1002IncomingLinks(view);
		case PositionEditPart.VISUAL_ID:
			return getPosition_1003IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_1004IncomingLinks(view);
		case AspectEditPart.VISUAL_ID:
			return getAspect_1005IncomingLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_1006IncomingLinks(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_1007IncomingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_1008IncomingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_1009IncomingLinks(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_2001IncomingLinks(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2002IncomingLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_2003IncomingLinks(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_2004IncomingLinks(view);
		case Goal3EditPart.VISUAL_ID:
			return getGoal_2005IncomingLinks(view);
		case Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2006IncomingLinks(view);
		case Resource3EditPart.VISUAL_ID:
			return getResource_2007IncomingLinks(view);
		case Task3EditPart.VISUAL_ID:
			return getTask_2008IncomingLinks(view);
		case Goal4EditPart.VISUAL_ID:
			return getGoal_2009IncomingLinks(view);
		case Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2010IncomingLinks(view);
		case Resource4EditPart.VISUAL_ID:
			return getResource_2011IncomingLinks(view);
		case Task4EditPart.VISUAL_ID:
			return getTask_2012IncomingLinks(view);
		case Goal5EditPart.VISUAL_ID:
			return getGoal_2013IncomingLinks(view);
		case Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2014IncomingLinks(view);
		case Resource5EditPart.VISUAL_ID:
			return getResource_2015IncomingLinks(view);
		case Task5EditPart.VISUAL_ID:
			return getTask_2016IncomingLinks(view);
		case Goal6EditPart.VISUAL_ID:
			return getGoal_2017IncomingLinks(view);
		case Softgoal6EditPart.VISUAL_ID:
			return getSoftgoal_2018IncomingLinks(view);
		case Resource6EditPart.VISUAL_ID:
			return getResource_2019IncomingLinks(view);
		case Task6EditPart.VISUAL_ID:
			return getTask_2020IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_3001IncomingLinks(view);
		case AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_3002IncomingLinks(view);
		case OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_3003IncomingLinks(view);
		case MakeContributionEditPart.VISUAL_ID:
			return getMakeContribution_3004IncomingLinks(view);
		case HelpContributionEditPart.VISUAL_ID:
			return getHelpContribution_3005IncomingLinks(view);
		case HurtContributionEditPart.VISUAL_ID:
			return getHurtContribution_3006IncomingLinks(view);
		case BreakContributionEditPart.VISUAL_ID:
			return getBreakContribution_3007IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_1001OutgoingLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_1002OutgoingLinks(view);
		case PositionEditPart.VISUAL_ID:
			return getPosition_1003OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_1004OutgoingLinks(view);
		case AspectEditPart.VISUAL_ID:
			return getAspect_1005OutgoingLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_1006OutgoingLinks(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_1007OutgoingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_1008OutgoingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_1009OutgoingLinks(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_2001OutgoingLinks(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2002OutgoingLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_2003OutgoingLinks(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_2004OutgoingLinks(view);
		case Goal3EditPart.VISUAL_ID:
			return getGoal_2005OutgoingLinks(view);
		case Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2006OutgoingLinks(view);
		case Resource3EditPart.VISUAL_ID:
			return getResource_2007OutgoingLinks(view);
		case Task3EditPart.VISUAL_ID:
			return getTask_2008OutgoingLinks(view);
		case Goal4EditPart.VISUAL_ID:
			return getGoal_2009OutgoingLinks(view);
		case Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2010OutgoingLinks(view);
		case Resource4EditPart.VISUAL_ID:
			return getResource_2011OutgoingLinks(view);
		case Task4EditPart.VISUAL_ID:
			return getTask_2012OutgoingLinks(view);
		case Goal5EditPart.VISUAL_ID:
			return getGoal_2013OutgoingLinks(view);
		case Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2014OutgoingLinks(view);
		case Resource5EditPart.VISUAL_ID:
			return getResource_2015OutgoingLinks(view);
		case Task5EditPart.VISUAL_ID:
			return getTask_2016OutgoingLinks(view);
		case Goal6EditPart.VISUAL_ID:
			return getGoal_2017OutgoingLinks(view);
		case Softgoal6EditPart.VISUAL_ID:
			return getSoftgoal_2018OutgoingLinks(view);
		case Resource6EditPart.VISUAL_ID:
			return getResource_2019OutgoingLinks(view);
		case Task6EditPart.VISUAL_ID:
			return getTask_2020OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_3001OutgoingLinks(view);
		case AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_3002OutgoingLinks(view);
		case OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_3003OutgoingLinks(view);
		case MakeContributionEditPart.VISUAL_ID:
			return getMakeContribution_3004OutgoingLinks(view);
		case HelpContributionEditPart.VISUAL_ID:
			return getHelpContribution_3005OutgoingLinks(view);
		case HurtContributionEditPart.VISUAL_ID:
			return getHurtContribution_3006OutgoingLinks(view);
		case BreakContributionEditPart.VISUAL_ID:
			return getBreakContribution_3007OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getModel_79ContainedLinks(View view) {
		Model modelElement = (Model) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAgent_1002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPosition_1003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_1004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAspect_1005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_1006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_1007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_1008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_1009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004ContainedLinks(View view) {
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
	public static List getResource_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2020ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMakeContribution_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHelpContribution_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHurtContribution_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBreakContribution_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAgent_1002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPosition_1003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_1004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAspect_1005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_1006IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_1007IncomingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_1008IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_1009IncomingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2001IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2002IncomingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2003IncomingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2005IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2006IncomingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2007IncomingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2008IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2009IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2010IncomingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2011IncomingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2012IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2013IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2014IncomingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2015IncomingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2016IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2017IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2018IncomingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2019IncomingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2020IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMakeContribution_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHelpContribution_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHurtContribution_3006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBreakContribution_3007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAgent_1002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPosition_1003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_1004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAspect_1005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_1006OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_1007OutgoingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_1008OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_1009OutgoingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2001OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2002OutgoingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2003OutgoingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2005OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2006OutgoingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2007OutgoingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2008OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2009OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2010OutgoingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2011OutgoingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2012OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2013OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2014OutgoingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2015OutgoingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2016OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2017OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2018OutgoingLinks(View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2019OutgoingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2020OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMakeContribution_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHelpContribution_3005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHurtContribution_3006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBreakContribution_3007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Dependency_3001(
			Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getDependencyFrom();
			Intention src = link.getDependencyTo();
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.Dependency_3001,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_AndDecomposition_3002(
			Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof AndDecomposition) {
				continue;
			}
			AndDecomposition link = (AndDecomposition) linkObject;
			if (AndDecompositionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.AndDecomposition_3002,
					AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OrDecomposition_3003(
			Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof OrDecomposition) {
				continue;
			}
			OrDecomposition link = (OrDecomposition) linkObject;
			if (OrDecompositionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.OrDecomposition_3003,
					OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_MakeContribution_3004(
			Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof MakeContribution) {
				continue;
			}
			MakeContribution link = (MakeContribution) linkObject;
			if (MakeContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.MakeContribution_3004,
					MakeContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_HelpContribution_3005(
			Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof HelpContribution) {
				continue;
			}
			HelpContribution link = (HelpContribution) linkObject;
			if (HelpContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.HelpContribution_3005,
					HelpContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_HurtContribution_3006(
			Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof HurtContribution) {
				continue;
			}
			HurtContribution link = (HurtContribution) linkObject;
			if (HurtContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.HurtContribution_3006,
					HurtContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_BreakContribution_3007(
			Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof BreakContribution) {
				continue;
			}
			BreakContribution link = (BreakContribution) linkObject;
			if (BreakContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.BreakContribution_3007,
					BreakContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Dependency_3001(
			Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GoalmodelPackage.eINSTANCE
					.getDependency_DependencyFrom()
					|| false == setting.getEObject() instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) setting.getEObject();
			if (DependencyEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention src = link.getDependencyTo();
			result.add(new GoalmodelLinkDescriptor(src, target, link,
					GoalmodelElementTypes.Dependency_3001,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_AndDecomposition_3002(
			Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GoalmodelPackage.eINSTANCE
					.getDecomposition_Target()
					|| false == setting.getEObject() instanceof AndDecomposition) {
				continue;
			}
			AndDecomposition link = (AndDecomposition) setting.getEObject();
			if (AndDecompositionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, target, link,
					GoalmodelElementTypes.AndDecomposition_3002,
					AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OrDecomposition_3003(
			Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GoalmodelPackage.eINSTANCE
					.getDecomposition_Target()
					|| false == setting.getEObject() instanceof OrDecomposition) {
				continue;
			}
			OrDecomposition link = (OrDecomposition) setting.getEObject();
			if (OrDecompositionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, target, link,
					GoalmodelElementTypes.OrDecomposition_3003,
					OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_MakeContribution_3004(
			Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GoalmodelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof MakeContribution) {
				continue;
			}
			MakeContribution link = (MakeContribution) setting.getEObject();
			if (MakeContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, target, link,
					GoalmodelElementTypes.MakeContribution_3004,
					MakeContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_HelpContribution_3005(
			Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GoalmodelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof HelpContribution) {
				continue;
			}
			HelpContribution link = (HelpContribution) setting.getEObject();
			if (HelpContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, target, link,
					GoalmodelElementTypes.HelpContribution_3005,
					HelpContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_HurtContribution_3006(
			Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GoalmodelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof HurtContribution) {
				continue;
			}
			HurtContribution link = (HurtContribution) setting.getEObject();
			if (HurtContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, target, link,
					GoalmodelElementTypes.HurtContribution_3006,
					HurtContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BreakContribution_3007(
			Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GoalmodelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof BreakContribution) {
				continue;
			}
			BreakContribution link = (BreakContribution) setting.getEObject();
			if (BreakContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention src = link.getSource();
			result.add(new GoalmodelLinkDescriptor(src, target, link,
					GoalmodelElementTypes.BreakContribution_3007,
					BreakContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Dependency_3001(
			Intention source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getDependencyFrom();
			Intention src = link.getDependencyTo();
			if (src != source) {
				continue;
			}
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.Dependency_3001,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_AndDecomposition_3002(
			Intention source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof AndDecomposition) {
				continue;
			}
			AndDecomposition link = (AndDecomposition) linkObject;
			if (AndDecompositionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.AndDecomposition_3002,
					AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OrDecomposition_3003(
			Intention source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof OrDecomposition) {
				continue;
			}
			OrDecomposition link = (OrDecomposition) linkObject;
			if (OrDecompositionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.OrDecomposition_3003,
					OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_MakeContribution_3004(
			Intention source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof MakeContribution) {
				continue;
			}
			MakeContribution link = (MakeContribution) linkObject;
			if (MakeContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.MakeContribution_3004,
					MakeContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_HelpContribution_3005(
			Intention source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof HelpContribution) {
				continue;
			}
			HelpContribution link = (HelpContribution) linkObject;
			if (HelpContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.HelpContribution_3005,
					HelpContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_HurtContribution_3006(
			Intention source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof HurtContribution) {
				continue;
			}
			HurtContribution link = (HurtContribution) linkObject;
			if (HurtContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.HurtContribution_3006,
					HurtContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BreakContribution_3007(
			Intention source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof BreakContribution) {
				continue;
			}
			BreakContribution link = (BreakContribution) linkObject;
			if (BreakContributionEditPart.VISUAL_ID != GoalmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Intention dst = link.getTarget();
			Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GoalmodelLinkDescriptor(src, dst, link,
					GoalmodelElementTypes.BreakContribution_3007,
					BreakContributionEditPart.VISUAL_ID));
		}
		return result;
	}

}
