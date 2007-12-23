package edu.toronto.cs.goalmodel.diagram.part;

import edu.toronto.cs.goalmodel.Actor;
import edu.toronto.cs.goalmodel.Agent;
import edu.toronto.cs.goalmodel.AndDecomposition;
import edu.toronto.cs.goalmodel.Aspect;
import edu.toronto.cs.goalmodel.BreakContribution;
import edu.toronto.cs.goalmodel.Dependency;
import edu.toronto.cs.goalmodel.Goal;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.HelpContribution;
import edu.toronto.cs.goalmodel.HurtContribution;
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

import edu.toronto.cs.goalmodel.diagram.expressions.GoalmodelAbstractExpression;
import edu.toronto.cs.goalmodel.diagram.expressions.GoalmodelOCLFactory;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class GoalmodelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = GoalmodelDiagramEditorPlugin
			.getInstance().getBundle().getSymbolicName()
			+ "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelEditPart.MODEL_ID.equals(view.getType())) {
				return ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GoalmodelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	private static int getDiagramVisualID(EObject domainElement,
			EClass domainElementMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				domainElementMetaclass)
				&& isDiagramModel_79((Model) domainElement)) {
			return ModelEditPart.VISUAL_ID;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement,
				domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView,
			EObject domainElement, EClass domainElementMetaclass,
			String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint)
				: -1;
		switch (containerVisualID) {
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return ActorNameEditPart.VISUAL_ID;
			}
			if (ActorActorCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return ActorActorCompartmentEditPart.VISUAL_ID;
			}
			return getUnrecognizedActor_1001ChildNodeID(domainElement,
					semanticHint);
		case AgentEditPart.VISUAL_ID:
			if (AgentNameEditPart.VISUAL_ID == nodeVisualID) {
				return AgentNameEditPart.VISUAL_ID;
			}
			if (AgentAgentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return AgentAgentCompartmentEditPart.VISUAL_ID;
			}
			return getUnrecognizedAgent_1002ChildNodeID(domainElement,
					semanticHint);
		case PositionEditPart.VISUAL_ID:
			if (PositionNameEditPart.VISUAL_ID == nodeVisualID) {
				return PositionNameEditPart.VISUAL_ID;
			}
			if (PositionPositionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return PositionPositionCompartmentEditPart.VISUAL_ID;
			}
			return getUnrecognizedPosition_1003ChildNodeID(domainElement,
					semanticHint);
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return RoleNameEditPart.VISUAL_ID;
			}
			if (RoleRoleCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return RoleRoleCompartmentEditPart.VISUAL_ID;
			}
			return getUnrecognizedRole_1004ChildNodeID(domainElement,
					semanticHint);
		case AspectEditPart.VISUAL_ID:
			if (AspectNameEditPart.VISUAL_ID == nodeVisualID) {
				return AspectNameEditPart.VISUAL_ID;
			}
			if (AspectAspectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return AspectAspectCompartmentEditPart.VISUAL_ID;
			}
			return getUnrecognizedAspect_1005ChildNodeID(domainElement,
					semanticHint);
		case Goal6EditPart.VISUAL_ID:
			if (GoalName6EditPart.VISUAL_ID == nodeVisualID) {
				return GoalName6EditPart.VISUAL_ID;
			}
			return getUnrecognizedGoal_1006ChildNodeID(domainElement,
					semanticHint);
		case Softgoal6EditPart.VISUAL_ID:
			if (SoftgoalName6EditPart.VISUAL_ID == nodeVisualID) {
				return SoftgoalName6EditPart.VISUAL_ID;
			}
			return getUnrecognizedSoftgoal_1007ChildNodeID(domainElement,
					semanticHint);
		case Task6EditPart.VISUAL_ID:
			if (TaskName6EditPart.VISUAL_ID == nodeVisualID) {
				return TaskName6EditPart.VISUAL_ID;
			}
			return getUnrecognizedTask_1008ChildNodeID(domainElement,
					semanticHint);
		case Resource6EditPart.VISUAL_ID:
			if (ResourceName6EditPart.VISUAL_ID == nodeVisualID) {
				return ResourceName6EditPart.VISUAL_ID;
			}
			return getUnrecognizedResource_1009ChildNodeID(domainElement,
					semanticHint);
		case GoalEditPart.VISUAL_ID:
			if (GoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return GoalNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedGoal_2001ChildNodeID(domainElement,
					semanticHint);
		case SoftgoalEditPart.VISUAL_ID:
			if (SoftgoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return SoftgoalNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedSoftgoal_2002ChildNodeID(domainElement,
					semanticHint);
		case ResourceEditPart.VISUAL_ID:
			if (ResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return ResourceNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedResource_2003ChildNodeID(domainElement,
					semanticHint);
		case TaskEditPart.VISUAL_ID:
			if (TaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return TaskNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedTask_2004ChildNodeID(domainElement,
					semanticHint);
		case Goal2EditPart.VISUAL_ID:
			if (GoalName2EditPart.VISUAL_ID == nodeVisualID) {
				return GoalName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedGoal_2005ChildNodeID(domainElement,
					semanticHint);
		case Softgoal2EditPart.VISUAL_ID:
			if (SoftgoalName2EditPart.VISUAL_ID == nodeVisualID) {
				return SoftgoalName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedSoftgoal_2006ChildNodeID(domainElement,
					semanticHint);
		case Resource2EditPart.VISUAL_ID:
			if (ResourceName2EditPart.VISUAL_ID == nodeVisualID) {
				return ResourceName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedResource_2007ChildNodeID(domainElement,
					semanticHint);
		case Task2EditPart.VISUAL_ID:
			if (TaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return TaskName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedTask_2008ChildNodeID(domainElement,
					semanticHint);
		case Goal3EditPart.VISUAL_ID:
			if (GoalName3EditPart.VISUAL_ID == nodeVisualID) {
				return GoalName3EditPart.VISUAL_ID;
			}
			return getUnrecognizedGoal_2009ChildNodeID(domainElement,
					semanticHint);
		case Softgoal3EditPart.VISUAL_ID:
			if (SoftgoalName3EditPart.VISUAL_ID == nodeVisualID) {
				return SoftgoalName3EditPart.VISUAL_ID;
			}
			return getUnrecognizedSoftgoal_2010ChildNodeID(domainElement,
					semanticHint);
		case Resource3EditPart.VISUAL_ID:
			if (ResourceName3EditPart.VISUAL_ID == nodeVisualID) {
				return ResourceName3EditPart.VISUAL_ID;
			}
			return getUnrecognizedResource_2011ChildNodeID(domainElement,
					semanticHint);
		case Task3EditPart.VISUAL_ID:
			if (TaskName3EditPart.VISUAL_ID == nodeVisualID) {
				return TaskName3EditPart.VISUAL_ID;
			}
			return getUnrecognizedTask_2012ChildNodeID(domainElement,
					semanticHint);
		case Goal4EditPart.VISUAL_ID:
			if (GoalName4EditPart.VISUAL_ID == nodeVisualID) {
				return GoalName4EditPart.VISUAL_ID;
			}
			return getUnrecognizedGoal_2013ChildNodeID(domainElement,
					semanticHint);
		case Softgoal4EditPart.VISUAL_ID:
			if (SoftgoalName4EditPart.VISUAL_ID == nodeVisualID) {
				return SoftgoalName4EditPart.VISUAL_ID;
			}
			return getUnrecognizedSoftgoal_2014ChildNodeID(domainElement,
					semanticHint);
		case Resource4EditPart.VISUAL_ID:
			if (ResourceName4EditPart.VISUAL_ID == nodeVisualID) {
				return ResourceName4EditPart.VISUAL_ID;
			}
			return getUnrecognizedResource_2015ChildNodeID(domainElement,
					semanticHint);
		case Task4EditPart.VISUAL_ID:
			if (TaskName4EditPart.VISUAL_ID == nodeVisualID) {
				return TaskName4EditPart.VISUAL_ID;
			}
			return getUnrecognizedTask_2016ChildNodeID(domainElement,
					semanticHint);
		case Goal5EditPart.VISUAL_ID:
			if (GoalName5EditPart.VISUAL_ID == nodeVisualID) {
				return GoalName5EditPart.VISUAL_ID;
			}
			return getUnrecognizedGoal_2017ChildNodeID(domainElement,
					semanticHint);
		case Softgoal5EditPart.VISUAL_ID:
			if (SoftgoalName5EditPart.VISUAL_ID == nodeVisualID) {
				return SoftgoalName5EditPart.VISUAL_ID;
			}
			return getUnrecognizedSoftgoal_2018ChildNodeID(domainElement,
					semanticHint);
		case Resource5EditPart.VISUAL_ID:
			if (ResourceName5EditPart.VISUAL_ID == nodeVisualID) {
				return ResourceName5EditPart.VISUAL_ID;
			}
			return getUnrecognizedResource_2019ChildNodeID(domainElement,
					semanticHint);
		case Task5EditPart.VISUAL_ID:
			if (TaskName5EditPart.VISUAL_ID == nodeVisualID) {
				return TaskName5EditPart.VISUAL_ID;
			}
			return getUnrecognizedTask_2020ChildNodeID(domainElement,
					semanticHint);
		case ActorActorCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || GoalEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeGoal_2001((Goal) domainElement))) {
				return GoalEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || SoftgoalEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeSoftgoal_2002((Softgoal) domainElement))) {
				return SoftgoalEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ResourceEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeResource_2003((Resource) domainElement))) {
				return ResourceEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || TaskEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeTask_2004((Task) domainElement))) {
				return TaskEditPart.VISUAL_ID;
			}
			return getUnrecognizedActorActorCompartment_5001ChildNodeID(
					domainElement, semanticHint);
		case AgentAgentCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || Goal2EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeGoal_2005((Goal) domainElement))) {
				return Goal2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Softgoal2EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeSoftgoal_2006((Softgoal) domainElement))) {
				return Softgoal2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Resource2EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeResource_2007((Resource) domainElement))) {
				return Resource2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Task2EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeTask_2008((Task) domainElement))) {
				return Task2EditPart.VISUAL_ID;
			}
			return getUnrecognizedAgentAgentCompartment_5002ChildNodeID(
					domainElement, semanticHint);
		case PositionPositionCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || Goal3EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeGoal_2009((Goal) domainElement))) {
				return Goal3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Softgoal3EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeSoftgoal_2010((Softgoal) domainElement))) {
				return Softgoal3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Resource3EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeResource_2011((Resource) domainElement))) {
				return Resource3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Task3EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeTask_2012((Task) domainElement))) {
				return Task3EditPart.VISUAL_ID;
			}
			return getUnrecognizedPositionPositionCompartment_5003ChildNodeID(
					domainElement, semanticHint);
		case RoleRoleCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || Goal4EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeGoal_2013((Goal) domainElement))) {
				return Goal4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Softgoal4EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeSoftgoal_2014((Softgoal) domainElement))) {
				return Softgoal4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Resource4EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeResource_2015((Resource) domainElement))) {
				return Resource4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Task4EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeTask_2016((Task) domainElement))) {
				return Task4EditPart.VISUAL_ID;
			}
			return getUnrecognizedRoleRoleCompartment_5004ChildNodeID(
					domainElement, semanticHint);
		case AspectAspectCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || Goal5EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeGoal_2017((Goal) domainElement))) {
				return Goal5EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Softgoal5EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeSoftgoal_2018((Softgoal) domainElement))) {
				return Softgoal5EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Resource5EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeResource_2019((Resource) domainElement))) {
				return Resource5EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Task5EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeTask_2020((Task) domainElement))) {
				return Task5EditPart.VISUAL_ID;
			}
			return getUnrecognizedAspectAspectCompartment_5005ChildNodeID(
					domainElement, semanticHint);
		case ModelEditPart.VISUAL_ID:
			if ((semanticHint == null || ActorEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getActor().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeActor_1001((Actor) domainElement))) {
				return ActorEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AgentEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getAgent().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeAgent_1002((Agent) domainElement))) {
				return AgentEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PositionEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getPosition().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodePosition_1003((Position) domainElement))) {
				return PositionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RoleEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getRole().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeRole_1004((Role) domainElement))) {
				return RoleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AspectEditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getAspect().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeAspect_1005((Aspect) domainElement))) {
				return AspectEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Goal6EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeGoal_1006((Goal) domainElement))) {
				return Goal6EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Softgoal6EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeSoftgoal_1007((Softgoal) domainElement))) {
				return Softgoal6EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Task6EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeTask_1008((Task) domainElement))) {
				return Task6EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Resource6EditPart.VISUAL_ID == nodeVisualID)
					&& GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeResource_1009((Resource) domainElement))) {
				return Resource6EditPart.VISUAL_ID;
			}
			return getUnrecognizedModel_79ChildNodeID(domainElement,
					semanticHint);
		case DependencyEditPart.VISUAL_ID:
			if (DependencyLabelEditPart.VISUAL_ID == nodeVisualID) {
				return DependencyLabelEditPart.VISUAL_ID;
			}
			return getUnrecognizedDependency_3001LinkLabelID(semanticHint);
		case AndDecompositionEditPart.VISUAL_ID:
			if (DiagramAndLabelEditPart.VISUAL_ID == nodeVisualID) {
				return DiagramAndLabelEditPart.VISUAL_ID;
			}
			return getUnrecognizedAndDecomposition_3002LinkLabelID(semanticHint);
		case OrDecompositionEditPart.VISUAL_ID:
			if (DiagramOrLabelEditPart.VISUAL_ID == nodeVisualID) {
				return DiagramOrLabelEditPart.VISUAL_ID;
			}
			return getUnrecognizedOrDecomposition_3003LinkLabelID(semanticHint);
		case MakeContributionEditPart.VISUAL_ID:
			if (DiagramMakeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return DiagramMakeLabelEditPart.VISUAL_ID;
			}
			return getUnrecognizedMakeContribution_3004LinkLabelID(semanticHint);
		case HelpContributionEditPart.VISUAL_ID:
			if (DiagramHelpLabelEditPart.VISUAL_ID == nodeVisualID) {
				return DiagramHelpLabelEditPart.VISUAL_ID;
			}
			return getUnrecognizedHelpContribution_3005LinkLabelID(semanticHint);
		case HurtContributionEditPart.VISUAL_ID:
			if (DiagramHurtLabelEditPart.VISUAL_ID == nodeVisualID) {
				return DiagramHurtLabelEditPart.VISUAL_ID;
			}
			return getUnrecognizedHurtContribution_3006LinkLabelID(semanticHint);
		case BreakContributionEditPart.VISUAL_ID:
			if (DiagramBreakLabelEditPart.VISUAL_ID == nodeVisualID) {
				return DiagramBreakLabelEditPart.VISUAL_ID;
			}
			return getUnrecognizedBreakContribution_3007LinkLabelID(semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement,
			EClass domainElementMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getDependency().isSuperTypeOf(
				domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassDependency_3001((Dependency) domainElement))) {
			return DependencyEditPart.VISUAL_ID;
		} else if (GoalmodelPackage.eINSTANCE.getAndDecomposition()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassAndDecomposition_3002((AndDecomposition) domainElement))) {
			return AndDecompositionEditPart.VISUAL_ID;
		} else if (GoalmodelPackage.eINSTANCE.getOrDecomposition()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassOrDecomposition_3003((OrDecomposition) domainElement))) {
			return OrDecompositionEditPart.VISUAL_ID;
		} else if (GoalmodelPackage.eINSTANCE.getMakeContribution()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassMakeContribution_3004((MakeContribution) domainElement))) {
			return MakeContributionEditPart.VISUAL_ID;
		} else if (GoalmodelPackage.eINSTANCE.getHelpContribution()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassHelpContribution_3005((HelpContribution) domainElement))) {
			return HelpContributionEditPart.VISUAL_ID;
		} else if (GoalmodelPackage.eINSTANCE.getHurtContribution()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassHurtContribution_3006((HurtContribution) domainElement))) {
			return HurtContributionEditPart.VISUAL_ID;
		} else if (GoalmodelPackage.eINSTANCE.getBreakContribution()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassBreakContribution_3007((BreakContribution) domainElement))) {
			return BreakContributionEditPart.VISUAL_ID;
		} else {
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isDiagramModel_79(Model element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeActor_1001(Actor element) {
		return Actor_1001.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAgent_1002(Agent element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePosition_1003(Position element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeRole_1004(Role element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAspect_1005(Aspect element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeGoal_1006(Goal element) {
		return Goal_1006.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeSoftgoal_1007(Softgoal element) {
		return Softgoal_1007.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeTask_1008(Task element) {
		return Task_1008.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeResource_1009(Resource element) {
		return Resource_1009.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeGoal_2001(Goal element) {
		return Goal_2001.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeSoftgoal_2002(Softgoal element) {
		return Softgoal_2002.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeResource_2003(Resource element) {
		return Resource_2003.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeTask_2004(Task element) {
		return Task_2004.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeGoal_2005(Goal element) {
		return Goal_2005.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeSoftgoal_2006(Softgoal element) {
		return Softgoal_2006.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeResource_2007(Resource element) {
		return Resource_2007.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeTask_2008(Task element) {
		return Task_2008.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeGoal_2009(Goal element) {
		return Goal_2009.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeSoftgoal_2010(Softgoal element) {
		return Softgoal_2010.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeResource_2011(Resource element) {
		return Resource_2011.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeTask_2012(Task element) {
		return Task_2012.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeGoal_2013(Goal element) {
		return Goal_2013.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeSoftgoal_2014(Softgoal element) {
		return Softgoal_2014.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeResource_2015(Resource element) {
		return Resource_2015.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeTask_2016(Task element) {
		return Task_2016.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeGoal_2017(Goal element) {
		return Goal_2017.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeSoftgoal_2018(Softgoal element) {
		return Softgoal_2018.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeResource_2019(Resource element) {
		return Resource_2019.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeTask_2020(Task element) {
		return Task_2020.matches(element);
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedActor_1001ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAgent_1002ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPosition_1003ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRole_1004ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAspect_1005ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedGoal_1006ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedSoftgoal_1007ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedTask_1008ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedResource_1009ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedGoal_2001ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedSoftgoal_2002ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedResource_2003ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedTask_2004ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedGoal_2005ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedSoftgoal_2006ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedResource_2007ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedTask_2008ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedGoal_2009ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedSoftgoal_2010ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedResource_2011ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedTask_2012ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedGoal_2013ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedSoftgoal_2014ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedResource_2015ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedTask_2016ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedGoal_2017ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedSoftgoal_2018ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedResource_2019ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedTask_2020ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedActorActorCompartment_5001ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAgentAgentCompartment_5002ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPositionPositionCompartment_5003ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRoleRoleCompartment_5004ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAspectAspectCompartment_5005ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedModel_79ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDependency_3001LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAndDecomposition_3002LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOrDecomposition_3003LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedMakeContribution_3004LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedHelpContribution_3005LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedHurtContribution_3006LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedBreakContribution_3007LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassDependency_3001(Dependency element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassAndDecomposition_3002(
			AndDecomposition element) {
		return AndDecomposition_3002.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassOrDecomposition_3003(
			OrDecomposition element) {
		return OrDecomposition_3003.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassMakeContribution_3004(
			MakeContribution element) {
		return MakeContribution_3004.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassHelpContribution_3005(
			HelpContribution element) {
		return HelpContribution_3005.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassHurtContribution_3006(
			HurtContribution element) {
		return HurtContribution_3006.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassBreakContribution_3007(
			BreakContribution element) {
		return BreakContribution_3007.matches(element);
	}

	/**
	 * @generated
	 */
	private static final Matcher Goal_2001 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getGoal()));

	/**
	 * @generated
	 */
	private static final Matcher Softgoal_2002 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Softgoal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getSoftgoal()));

	/**
	 * @generated
	 */
	private static final Matcher Resource_2003 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Resource)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getResource()));

	/**
	 * @generated
	 */
	private static final Matcher Task_2004 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getTask()));

	/**
	 * @generated
	 */
	private static final Matcher Goal_2005 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getGoal()));

	/**
	 * @generated
	 */
	private static final Matcher Softgoal_2006 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Softgoal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getSoftgoal()));

	/**
	 * @generated
	 */
	private static final Matcher Resource_2007 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Resource)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getResource()));

	/**
	 * @generated
	 */
	private static final Matcher Task_2008 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getTask()));

	/**
	 * @generated
	 */
	private static final Matcher Goal_2009 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getGoal()));

	/**
	 * @generated
	 */
	private static final Matcher Softgoal_2010 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Softgoal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getSoftgoal()));

	/**
	 * @generated
	 */
	private static final Matcher Resource_2011 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Resource)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getResource()));

	/**
	 * @generated
	 */
	private static final Matcher Task_2012 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getTask()));

	/**
	 * @generated
	 */
	private static final Matcher Goal_2013 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getGoal()));

	/**
	 * @generated
	 */
	private static final Matcher Softgoal_2014 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Softgoal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getSoftgoal()));

	/**
	 * @generated
	 */
	private static final Matcher Resource_2015 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Resource)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getResource()));

	/**
	 * @generated
	 */
	private static final Matcher Task_2016 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getTask()));

	/**
	 * @generated
	 */
	private static final Matcher Goal_2017 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getGoal()));

	/**
	 * @generated
	 */
	private static final Matcher Softgoal_2018 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Softgoal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getSoftgoal()));

	/**
	 * @generated
	 */
	private static final Matcher Resource_2019 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Resource)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getResource()));

	/**
	 * @generated
	 */
	private static final Matcher Task_2020 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getTask()));

	/**
	 * @generated
	 */
	private static final Matcher Actor_1001 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Actor)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getActor()));

	/**
	 * @generated
	 */
	private static final Matcher Goal_1006 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getGoal()));

	/**
	 * @generated
	 */
	private static final Matcher Softgoal_1007 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Softgoal)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getSoftgoal()));

	/**
	 * @generated
	 */
	private static final Matcher Task_1008 = new Matcher(GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getTask()));

	/**
	 * @generated
	 */
	private static final Matcher Resource_1009 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(Resource)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getResource()));

	/**
	 * @generated
	 */
	private static final Matcher AndDecomposition_3002 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(AndDecomposition)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getAndDecomposition()));

	/**
	 * @generated
	 */
	private static final Matcher OrDecomposition_3003 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(OrDecomposition)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getOrDecomposition()));

	/**
	 * @generated
	 */
	private static final Matcher MakeContribution_3004 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(MakeContribution)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getMakeContribution()));

	/**
	 * @generated
	 */
	private static final Matcher HelpContribution_3005 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(HelpContribution)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getHelpContribution()));

	/**
	 * @generated
	 */
	private static final Matcher HurtContribution_3006 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(HurtContribution)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getHurtContribution()));

	/**
	 * @generated
	 */
	private static final Matcher BreakContribution_3007 = new Matcher(
			GoalmodelOCLFactory.getExpression("oclIsKindOf(BreakContribution)", //$NON-NLS-1$
					GoalmodelPackage.eINSTANCE.getBreakContribution()));

	/**
	 * @generated	
	 */
	static class Matcher {

		/**
		 * @generated	
		 */
		private GoalmodelAbstractExpression condition;

		/**
		 * @generated	
		 */
		Matcher(GoalmodelAbstractExpression conditionExpression) {
			this.condition = conditionExpression;
		}

		/**
		 * @generated	
		 */
		boolean matches(EObject object) {
			Object result = condition.evaluate(object);
			return result instanceof Boolean
					&& ((Boolean) result).booleanValue();
		}
	}// Matcher
}
