package edu.toronto.cs.goalmodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Model;
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
import edu.toronto.cs.goalmodel.diagram.edit.parts.WrapLabel2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.WrapLabel3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.WrapLabel4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.WrapLabel5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.WrapLabel6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.WrapLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.expressions.GoalmodelAbstractExpression;
import edu.toronto.cs.goalmodel.diagram.expressions.GoalmodelOCLFactory;

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
	private static final GoalmodelAbstractExpression Actor_1001_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Actor)", GoalmodelPackage.eINSTANCE
					.getActor());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Goal_1006_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", GoalmodelPackage.eINSTANCE
					.getGoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Softgoal_1007_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Softgoal)", GoalmodelPackage.eINSTANCE
					.getSoftgoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Task_1008_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", GoalmodelPackage.eINSTANCE
					.getTask());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Resource_1009_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Resource)", GoalmodelPackage.eINSTANCE
					.getResource());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Goal_2001_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", GoalmodelPackage.eINSTANCE
					.getGoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Softgoal_2002_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Softgoal)", GoalmodelPackage.eINSTANCE
					.getSoftgoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Resource_2003_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Resource)", GoalmodelPackage.eINSTANCE
					.getResource());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Task_2004_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", GoalmodelPackage.eINSTANCE
					.getTask());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Goal_2005_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", GoalmodelPackage.eINSTANCE
					.getGoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Softgoal_2006_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Softgoal)", GoalmodelPackage.eINSTANCE
					.getSoftgoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Resource_2007_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Resource)", GoalmodelPackage.eINSTANCE
					.getResource());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Task_2008_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", GoalmodelPackage.eINSTANCE
					.getTask());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Goal_2009_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", GoalmodelPackage.eINSTANCE
					.getGoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Softgoal_2010_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Softgoal)", GoalmodelPackage.eINSTANCE
					.getSoftgoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Resource_2011_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Resource)", GoalmodelPackage.eINSTANCE
					.getResource());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Task_2012_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", GoalmodelPackage.eINSTANCE
					.getTask());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Goal_2013_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", GoalmodelPackage.eINSTANCE
					.getGoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Softgoal_2014_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Softgoal)", GoalmodelPackage.eINSTANCE
					.getSoftgoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Resource_2015_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Resource)", GoalmodelPackage.eINSTANCE
					.getResource());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Task_2016_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", GoalmodelPackage.eINSTANCE
					.getTask());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Goal_2017_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Goal)", GoalmodelPackage.eINSTANCE
					.getGoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Softgoal_2018_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Softgoal)", GoalmodelPackage.eINSTANCE
					.getSoftgoal());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Resource_2019_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Resource)", GoalmodelPackage.eINSTANCE
					.getResource());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression Task_2020_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(Task)", GoalmodelPackage.eINSTANCE
					.getTask());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression AndDecomposition_3002_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(AndDecomposition)",
					GoalmodelPackage.eINSTANCE.getAndDecomposition());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression OrDecomposition_3003_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(OrDecomposition)",
					GoalmodelPackage.eINSTANCE.getOrDecomposition());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression MakeContribution_3004_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(MakeContribution)",
					GoalmodelPackage.eINSTANCE.getMakeContribution());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression HelpContribution_3005_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(HelpContribution)",
					GoalmodelPackage.eINSTANCE.getHelpContribution());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression HurtContribution_3006_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(HurtContribution)",
					GoalmodelPackage.eINSTANCE.getHurtContribution());

	/**
	 * @generated
	 */
	private static final GoalmodelAbstractExpression BreakContribution_3007_Constraint = GoalmodelOCLFactory
			.getExpression("oclIsKindOf(BreakContribution)",
					GoalmodelPackage.eINSTANCE.getBreakContribution());

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
		return edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry
				.getVisualID(view.getType());
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
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Model) domainElement)) {
			return ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null
				|| !ModelEditPart.MODEL_ID
						.equals(edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry
								.getModelID(containerView))) {
			return -1;
		}
		switch (edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry
				.getVisualID(containerView)) {
		case ActorActorCompartmentEditPart.VISUAL_ID:
			if (GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Goal_2001_Constraint, domainElement)) {
				return Goal2EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Softgoal_2002_Constraint, domainElement)) {
				return Softgoal2EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Resource_2003_Constraint, domainElement)) {
				return Resource2EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Task_2004_Constraint, domainElement)) {
				return Task2EditPart.VISUAL_ID;
			}
			break;
		case AgentAgentCompartmentEditPart.VISUAL_ID:
			if (GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Goal_2005_Constraint, domainElement)) {
				return Goal3EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Softgoal_2006_Constraint, domainElement)) {
				return Softgoal3EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Resource_2007_Constraint, domainElement)) {
				return Resource3EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Task_2008_Constraint, domainElement)) {
				return Task3EditPart.VISUAL_ID;
			}
			break;
		case PositionPositionCompartmentEditPart.VISUAL_ID:
			if (GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Goal_2009_Constraint, domainElement)) {
				return Goal4EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Softgoal_2010_Constraint, domainElement)) {
				return Softgoal4EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Resource_2011_Constraint, domainElement)) {
				return Resource4EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Task_2012_Constraint, domainElement)) {
				return Task4EditPart.VISUAL_ID;
			}
			break;
		case RoleRoleCompartmentEditPart.VISUAL_ID:
			if (GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Goal_2013_Constraint, domainElement)) {
				return Goal5EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Softgoal_2014_Constraint, domainElement)) {
				return Softgoal5EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Resource_2015_Constraint, domainElement)) {
				return Resource5EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Task_2016_Constraint, domainElement)) {
				return Task5EditPart.VISUAL_ID;
			}
			break;
		case AspectAspectCompartmentEditPart.VISUAL_ID:
			if (GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Goal_2017_Constraint, domainElement)) {
				return Goal6EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Softgoal_2018_Constraint, domainElement)) {
				return Softgoal6EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Resource_2019_Constraint, domainElement)) {
				return Resource6EditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Task_2020_Constraint, domainElement)) {
				return Task6EditPart.VISUAL_ID;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (GoalmodelPackage.eINSTANCE.getActor().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Actor_1001_Constraint, domainElement)) {
				return ActorEditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getAgent().isSuperTypeOf(
					domainElement.eClass())) {
				return AgentEditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getPosition().isSuperTypeOf(
					domainElement.eClass())) {
				return PositionEditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getAspect().isSuperTypeOf(
					domainElement.eClass())) {
				return AspectEditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Goal_1006_Constraint, domainElement)) {
				return GoalEditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Softgoal_1007_Constraint, domainElement)) {
				return SoftgoalEditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Task_1008_Constraint, domainElement)) {
				return TaskEditPart.VISUAL_ID;
			}
			if (GoalmodelPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())
					&& evaluate(Resource_1009_Constraint, domainElement)) {
				return ResourceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorActorCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgentEditPart.VISUAL_ID:
			if (AgentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgentAgentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PositionEditPart.VISUAL_ID:
			if (PositionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PositionPositionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleRoleCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AspectEditPart.VISUAL_ID:
			if (AspectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AspectAspectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalEditPart.VISUAL_ID:
			if (GoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftgoalEditPart.VISUAL_ID:
			if (SoftgoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskEditPart.VISUAL_ID:
			if (TaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResourceEditPart.VISUAL_ID:
			if (ResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Goal2EditPart.VISUAL_ID:
			if (GoalName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Softgoal2EditPart.VISUAL_ID:
			if (SoftgoalName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Resource2EditPart.VISUAL_ID:
			if (ResourceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Task2EditPart.VISUAL_ID:
			if (TaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Goal3EditPart.VISUAL_ID:
			if (GoalName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Softgoal3EditPart.VISUAL_ID:
			if (SoftgoalName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Resource3EditPart.VISUAL_ID:
			if (ResourceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Task3EditPart.VISUAL_ID:
			if (TaskName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Goal4EditPart.VISUAL_ID:
			if (GoalName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Softgoal4EditPart.VISUAL_ID:
			if (SoftgoalName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Resource4EditPart.VISUAL_ID:
			if (ResourceName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Task4EditPart.VISUAL_ID:
			if (TaskName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Goal5EditPart.VISUAL_ID:
			if (GoalName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Softgoal5EditPart.VISUAL_ID:
			if (SoftgoalName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Resource5EditPart.VISUAL_ID:
			if (ResourceName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Task5EditPart.VISUAL_ID:
			if (TaskName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Goal6EditPart.VISUAL_ID:
			if (GoalName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Softgoal6EditPart.VISUAL_ID:
			if (SoftgoalName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Resource6EditPart.VISUAL_ID:
			if (ResourceName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Task6EditPart.VISUAL_ID:
			if (TaskName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorActorCompartmentEditPart.VISUAL_ID:
			if (Goal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgentAgentCompartmentEditPart.VISUAL_ID:
			if (Goal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PositionPositionCompartmentEditPart.VISUAL_ID:
			if (Goal4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleRoleCompartmentEditPart.VISUAL_ID:
			if (Goal5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AspectAspectCompartmentEditPart.VISUAL_ID:
			if (Goal6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PositionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AspectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftgoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyEditPart.VISUAL_ID:
			if (DependencyLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndDecompositionEditPart.VISUAL_ID:
			if (WrapLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrDecompositionEditPart.VISUAL_ID:
			if (WrapLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MakeContributionEditPart.VISUAL_ID:
			if (WrapLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HelpContributionEditPart.VISUAL_ID:
			if (WrapLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HurtContributionEditPart.VISUAL_ID:
			if (WrapLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BreakContributionEditPart.VISUAL_ID:
			if (WrapLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GoalmodelPackage.eINSTANCE.getDependency().isSuperTypeOf(
				domainElement.eClass())) {
			return DependencyEditPart.VISUAL_ID;
		}
		if (GoalmodelPackage.eINSTANCE.getAndDecomposition().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(AndDecomposition_3002_Constraint, domainElement)) {
			return AndDecompositionEditPart.VISUAL_ID;
		}
		if (GoalmodelPackage.eINSTANCE.getOrDecomposition().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(OrDecomposition_3003_Constraint, domainElement)) {
			return OrDecompositionEditPart.VISUAL_ID;
		}
		if (GoalmodelPackage.eINSTANCE.getMakeContribution().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(MakeContribution_3004_Constraint, domainElement)) {
			return MakeContributionEditPart.VISUAL_ID;
		}
		if (GoalmodelPackage.eINSTANCE.getHelpContribution().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(HelpContribution_3005_Constraint, domainElement)) {
			return HelpContributionEditPart.VISUAL_ID;
		}
		if (GoalmodelPackage.eINSTANCE.getHurtContribution().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(HurtContribution_3006_Constraint, domainElement)) {
			return HurtContributionEditPart.VISUAL_ID;
		}
		if (GoalmodelPackage.eINSTANCE.getBreakContribution().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(BreakContribution_3007_Constraint, domainElement)) {
			return BreakContributionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Model element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean evaluate(GoalmodelAbstractExpression expression,
			Object element) {
		Object result = expression.evaluate(element);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
