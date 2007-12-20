package edu.toronto.cs.goalmodel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import edu.toronto.cs.goalmodel.GoalmodelPackage;

import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DependencyLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalName6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceName6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalName6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskName6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskNameEditPart;

import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

/**
 * @generated
 */
public class GoalmodelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser goalGoalName_4001Parser;

	/**
	 * @generated
	 */
	private IParser getGoalGoalName_4001Parser() {
		if (goalGoalName_4001Parser == null) {
			goalGoalName_4001Parser = createGoalGoalName_4001Parser();
		}
		return goalGoalName_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalGoalName_4001Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalSoftgoalName_4002Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalSoftgoalName_4002Parser() {
		if (softgoalSoftgoalName_4002Parser == null) {
			softgoalSoftgoalName_4002Parser = createSoftgoalSoftgoalName_4002Parser();
		}
		return softgoalSoftgoalName_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalSoftgoalName_4002Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceResourceName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getResourceResourceName_4003Parser() {
		if (resourceResourceName_4003Parser == null) {
			resourceResourceName_4003Parser = createResourceResourceName_4003Parser();
		}
		return resourceResourceName_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceResourceName_4003Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskTaskName_4004Parser;

	/**
	 * @generated
	 */
	private IParser getTaskTaskName_4004Parser() {
		if (taskTaskName_4004Parser == null) {
			taskTaskName_4004Parser = createTaskTaskName_4004Parser();
		}
		return taskTaskName_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskTaskName_4004Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalGoalName_4006Parser;

	/**
	 * @generated
	 */
	private IParser getGoalGoalName_4006Parser() {
		if (goalGoalName_4006Parser == null) {
			goalGoalName_4006Parser = createGoalGoalName_4006Parser();
		}
		return goalGoalName_4006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalGoalName_4006Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalSoftgoalName_4007Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalSoftgoalName_4007Parser() {
		if (softgoalSoftgoalName_4007Parser == null) {
			softgoalSoftgoalName_4007Parser = createSoftgoalSoftgoalName_4007Parser();
		}
		return softgoalSoftgoalName_4007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalSoftgoalName_4007Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceResourceName_4008Parser;

	/**
	 * @generated
	 */
	private IParser getResourceResourceName_4008Parser() {
		if (resourceResourceName_4008Parser == null) {
			resourceResourceName_4008Parser = createResourceResourceName_4008Parser();
		}
		return resourceResourceName_4008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceResourceName_4008Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskTaskName_4009Parser;

	/**
	 * @generated
	 */
	private IParser getTaskTaskName_4009Parser() {
		if (taskTaskName_4009Parser == null) {
			taskTaskName_4009Parser = createTaskTaskName_4009Parser();
		}
		return taskTaskName_4009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskTaskName_4009Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalGoalName_4011Parser;

	/**
	 * @generated
	 */
	private IParser getGoalGoalName_4011Parser() {
		if (goalGoalName_4011Parser == null) {
			goalGoalName_4011Parser = createGoalGoalName_4011Parser();
		}
		return goalGoalName_4011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalGoalName_4011Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalSoftgoalName_4012Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalSoftgoalName_4012Parser() {
		if (softgoalSoftgoalName_4012Parser == null) {
			softgoalSoftgoalName_4012Parser = createSoftgoalSoftgoalName_4012Parser();
		}
		return softgoalSoftgoalName_4012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalSoftgoalName_4012Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceResourceName_4013Parser;

	/**
	 * @generated
	 */
	private IParser getResourceResourceName_4013Parser() {
		if (resourceResourceName_4013Parser == null) {
			resourceResourceName_4013Parser = createResourceResourceName_4013Parser();
		}
		return resourceResourceName_4013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceResourceName_4013Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskTaskName_4014Parser;

	/**
	 * @generated
	 */
	private IParser getTaskTaskName_4014Parser() {
		if (taskTaskName_4014Parser == null) {
			taskTaskName_4014Parser = createTaskTaskName_4014Parser();
		}
		return taskTaskName_4014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskTaskName_4014Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalGoalName_4016Parser;

	/**
	 * @generated
	 */
	private IParser getGoalGoalName_4016Parser() {
		if (goalGoalName_4016Parser == null) {
			goalGoalName_4016Parser = createGoalGoalName_4016Parser();
		}
		return goalGoalName_4016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalGoalName_4016Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalSoftgoalName_4017Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalSoftgoalName_4017Parser() {
		if (softgoalSoftgoalName_4017Parser == null) {
			softgoalSoftgoalName_4017Parser = createSoftgoalSoftgoalName_4017Parser();
		}
		return softgoalSoftgoalName_4017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalSoftgoalName_4017Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceResourceName_4018Parser;

	/**
	 * @generated
	 */
	private IParser getResourceResourceName_4018Parser() {
		if (resourceResourceName_4018Parser == null) {
			resourceResourceName_4018Parser = createResourceResourceName_4018Parser();
		}
		return resourceResourceName_4018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceResourceName_4018Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskTaskName_4019Parser;

	/**
	 * @generated
	 */
	private IParser getTaskTaskName_4019Parser() {
		if (taskTaskName_4019Parser == null) {
			taskTaskName_4019Parser = createTaskTaskName_4019Parser();
		}
		return taskTaskName_4019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskTaskName_4019Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalGoalName_4021Parser;

	/**
	 * @generated
	 */
	private IParser getGoalGoalName_4021Parser() {
		if (goalGoalName_4021Parser == null) {
			goalGoalName_4021Parser = createGoalGoalName_4021Parser();
		}
		return goalGoalName_4021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalGoalName_4021Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalSoftgoalName_4022Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalSoftgoalName_4022Parser() {
		if (softgoalSoftgoalName_4022Parser == null) {
			softgoalSoftgoalName_4022Parser = createSoftgoalSoftgoalName_4022Parser();
		}
		return softgoalSoftgoalName_4022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalSoftgoalName_4022Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceResourceName_4023Parser;

	/**
	 * @generated
	 */
	private IParser getResourceResourceName_4023Parser() {
		if (resourceResourceName_4023Parser == null) {
			resourceResourceName_4023Parser = createResourceResourceName_4023Parser();
		}
		return resourceResourceName_4023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceResourceName_4023Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskTaskName_4024Parser;

	/**
	 * @generated
	 */
	private IParser getTaskTaskName_4024Parser() {
		if (taskTaskName_4024Parser == null) {
			taskTaskName_4024Parser = createTaskTaskName_4024Parser();
		}
		return taskTaskName_4024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskTaskName_4024Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser actorActorName_4005Parser;

	/**
	 * @generated
	 */
	private IParser getActorActorName_4005Parser() {
		if (actorActorName_4005Parser == null) {
			actorActorName_4005Parser = createActorActorName_4005Parser();
		}
		return actorActorName_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActorActorName_4005Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getContainer_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser agentAgentName_4010Parser;

	/**
	 * @generated
	 */
	private IParser getAgentAgentName_4010Parser() {
		if (agentAgentName_4010Parser == null) {
			agentAgentName_4010Parser = createAgentAgentName_4010Parser();
		}
		return agentAgentName_4010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAgentAgentName_4010Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getContainer_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser positionPositionName_4015Parser;

	/**
	 * @generated
	 */
	private IParser getPositionPositionName_4015Parser() {
		if (positionPositionName_4015Parser == null) {
			positionPositionName_4015Parser = createPositionPositionName_4015Parser();
		}
		return positionPositionName_4015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPositionPositionName_4015Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getContainer_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleRoleName_4020Parser;

	/**
	 * @generated
	 */
	private IParser getRoleRoleName_4020Parser() {
		if (roleRoleName_4020Parser == null) {
			roleRoleName_4020Parser = createRoleRoleName_4020Parser();
		}
		return roleRoleName_4020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleRoleName_4020Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getContainer_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser aspectAspectName_4025Parser;

	/**
	 * @generated
	 */
	private IParser getAspectAspectName_4025Parser() {
		if (aspectAspectName_4025Parser == null) {
			aspectAspectName_4025Parser = createAspectAspectName_4025Parser();
		}
		return aspectAspectName_4025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAspectAspectName_4025Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getContainer_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalGoalName_4026Parser;

	/**
	 * @generated
	 */
	private IParser getGoalGoalName_4026Parser() {
		if (goalGoalName_4026Parser == null) {
			goalGoalName_4026Parser = createGoalGoalName_4026Parser();
		}
		return goalGoalName_4026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalGoalName_4026Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalSoftgoalName_4027Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalSoftgoalName_4027Parser() {
		if (softgoalSoftgoalName_4027Parser == null) {
			softgoalSoftgoalName_4027Parser = createSoftgoalSoftgoalName_4027Parser();
		}
		return softgoalSoftgoalName_4027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalSoftgoalName_4027Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskTaskName_4028Parser;

	/**
	 * @generated
	 */
	private IParser getTaskTaskName_4028Parser() {
		if (taskTaskName_4028Parser == null) {
			taskTaskName_4028Parser = createTaskTaskName_4028Parser();
		}
		return taskTaskName_4028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskTaskName_4028Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceResourceName_4029Parser;

	/**
	 * @generated
	 */
	private IParser getResourceResourceName_4029Parser() {
		if (resourceResourceName_4029Parser == null) {
			resourceResourceName_4029Parser = createResourceResourceName_4029Parser();
		}
		return resourceResourceName_4029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceResourceName_4029Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getIntention_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyDependencyLabel_4030Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyDependencyLabel_4030Parser() {
		if (dependencyDependencyLabel_4030Parser == null) {
			dependencyDependencyLabel_4030Parser = createDependencyDependencyLabel_4030Parser();
		}
		return dependencyDependencyLabel_4030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyDependencyLabel_4030Parser() {
		GoalmodelStructuralFeatureParser parser = new GoalmodelStructuralFeatureParser(
				GoalmodelPackage.eINSTANCE.getDependency_Label());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GoalNameEditPart.VISUAL_ID:
			return getGoalGoalName_4001Parser();
		case SoftgoalNameEditPart.VISUAL_ID:
			return getSoftgoalSoftgoalName_4002Parser();
		case ResourceNameEditPart.VISUAL_ID:
			return getResourceResourceName_4003Parser();
		case TaskNameEditPart.VISUAL_ID:
			return getTaskTaskName_4004Parser();
		case GoalName2EditPart.VISUAL_ID:
			return getGoalGoalName_4006Parser();
		case SoftgoalName2EditPart.VISUAL_ID:
			return getSoftgoalSoftgoalName_4007Parser();
		case ResourceName2EditPart.VISUAL_ID:
			return getResourceResourceName_4008Parser();
		case TaskName2EditPart.VISUAL_ID:
			return getTaskTaskName_4009Parser();
		case GoalName3EditPart.VISUAL_ID:
			return getGoalGoalName_4011Parser();
		case SoftgoalName3EditPart.VISUAL_ID:
			return getSoftgoalSoftgoalName_4012Parser();
		case ResourceName3EditPart.VISUAL_ID:
			return getResourceResourceName_4013Parser();
		case TaskName3EditPart.VISUAL_ID:
			return getTaskTaskName_4014Parser();
		case GoalName4EditPart.VISUAL_ID:
			return getGoalGoalName_4016Parser();
		case SoftgoalName4EditPart.VISUAL_ID:
			return getSoftgoalSoftgoalName_4017Parser();
		case ResourceName4EditPart.VISUAL_ID:
			return getResourceResourceName_4018Parser();
		case TaskName4EditPart.VISUAL_ID:
			return getTaskTaskName_4019Parser();
		case GoalName5EditPart.VISUAL_ID:
			return getGoalGoalName_4021Parser();
		case SoftgoalName5EditPart.VISUAL_ID:
			return getSoftgoalSoftgoalName_4022Parser();
		case ResourceName5EditPart.VISUAL_ID:
			return getResourceResourceName_4023Parser();
		case TaskName5EditPart.VISUAL_ID:
			return getTaskTaskName_4024Parser();
		case ActorNameEditPart.VISUAL_ID:
			return getActorActorName_4005Parser();
		case AgentNameEditPart.VISUAL_ID:
			return getAgentAgentName_4010Parser();
		case PositionNameEditPart.VISUAL_ID:
			return getPositionPositionName_4015Parser();
		case RoleNameEditPart.VISUAL_ID:
			return getRoleRoleName_4020Parser();
		case AspectNameEditPart.VISUAL_ID:
			return getAspectAspectName_4025Parser();
		case GoalName6EditPart.VISUAL_ID:
			return getGoalGoalName_4026Parser();
		case SoftgoalName6EditPart.VISUAL_ID:
			return getSoftgoalSoftgoalName_4027Parser();
		case TaskName6EditPart.VISUAL_ID:
			return getTaskTaskName_4028Parser();
		case ResourceName6EditPart.VISUAL_ID:
			return getResourceResourceName_4029Parser();
		case DependencyLabelEditPart.VISUAL_ID:
			return getDependencyDependencyLabel_4030Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GoalmodelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GoalmodelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GoalmodelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}
}
