package edu.toronto.cs.openome_model.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Openome_modelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser actorName_4005Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_4005Parser() {
		if (actorName_4005Parser == null) {
			actorName_4005Parser = createActorName_4005Parser();
		}
		return actorName_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActorName_4005Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser agentName_4010Parser;

	/**
	 * @generated
	 */
	private IParser getAgentName_4010Parser() {
		if (agentName_4010Parser == null) {
			agentName_4010Parser = createAgentName_4010Parser();
		}
		return agentName_4010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAgentName_4010Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser positionName_4015Parser;

	/**
	 * @generated
	 */
	private IParser getPositionName_4015Parser() {
		if (positionName_4015Parser == null) {
			positionName_4015Parser = createPositionName_4015Parser();
		}
		return positionName_4015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPositionName_4015Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_4020Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_4020Parser() {
		if (roleName_4020Parser == null) {
			roleName_4020Parser = createRoleName_4020Parser();
		}
		return roleName_4020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleName_4020Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser aspectName_4025Parser;

	/**
	 * @generated
	 */
	private IParser getAspectName_4025Parser() {
		if (aspectName_4025Parser == null) {
			aspectName_4025Parser = createAspectName_4025Parser();
		}
		return aspectName_4025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAspectName_4025Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4026Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4026Parser() {
		if (goalName_4026Parser == null) {
			goalName_4026Parser = createGoalName_4026Parser();
		}
		return goalName_4026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4026Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4027Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4027Parser() {
		if (softgoalName_4027Parser == null) {
			softgoalName_4027Parser = createSoftgoalName_4027Parser();
		}
		return softgoalName_4027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4027Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4028Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4028Parser() {
		if (taskName_4028Parser == null) {
			taskName_4028Parser = createTaskName_4028Parser();
		}
		return taskName_4028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4028Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4029Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4029Parser() {
		if (resourceName_4029Parser == null) {
			resourceName_4029Parser = createResourceName_4029Parser();
		}
		return resourceName_4029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4029Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4001Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4001Parser() {
		if (goalName_4001Parser == null) {
			goalName_4001Parser = createGoalName_4001Parser();
		}
		return goalName_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4001Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4002Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4002Parser() {
		if (softgoalName_4002Parser == null) {
			softgoalName_4002Parser = createSoftgoalName_4002Parser();
		}
		return softgoalName_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4002Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4003Parser() {
		if (resourceName_4003Parser == null) {
			resourceName_4003Parser = createResourceName_4003Parser();
		}
		return resourceName_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4003Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4004Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4004Parser() {
		if (taskName_4004Parser == null) {
			taskName_4004Parser = createTaskName_4004Parser();
		}
		return taskName_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4004Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4006Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4006Parser() {
		if (goalName_4006Parser == null) {
			goalName_4006Parser = createGoalName_4006Parser();
		}
		return goalName_4006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4006Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4007Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4007Parser() {
		if (softgoalName_4007Parser == null) {
			softgoalName_4007Parser = createSoftgoalName_4007Parser();
		}
		return softgoalName_4007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4007Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4008Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4008Parser() {
		if (resourceName_4008Parser == null) {
			resourceName_4008Parser = createResourceName_4008Parser();
		}
		return resourceName_4008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4008Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4009Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4009Parser() {
		if (taskName_4009Parser == null) {
			taskName_4009Parser = createTaskName_4009Parser();
		}
		return taskName_4009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4009Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4011Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4011Parser() {
		if (goalName_4011Parser == null) {
			goalName_4011Parser = createGoalName_4011Parser();
		}
		return goalName_4011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4011Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4012Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4012Parser() {
		if (softgoalName_4012Parser == null) {
			softgoalName_4012Parser = createSoftgoalName_4012Parser();
		}
		return softgoalName_4012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4012Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4013Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4013Parser() {
		if (resourceName_4013Parser == null) {
			resourceName_4013Parser = createResourceName_4013Parser();
		}
		return resourceName_4013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4013Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4014Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4014Parser() {
		if (taskName_4014Parser == null) {
			taskName_4014Parser = createTaskName_4014Parser();
		}
		return taskName_4014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4014Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4016Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4016Parser() {
		if (goalName_4016Parser == null) {
			goalName_4016Parser = createGoalName_4016Parser();
		}
		return goalName_4016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4016Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4017Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4017Parser() {
		if (softgoalName_4017Parser == null) {
			softgoalName_4017Parser = createSoftgoalName_4017Parser();
		}
		return softgoalName_4017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4017Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4018Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4018Parser() {
		if (resourceName_4018Parser == null) {
			resourceName_4018Parser = createResourceName_4018Parser();
		}
		return resourceName_4018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4018Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4019Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4019Parser() {
		if (taskName_4019Parser == null) {
			taskName_4019Parser = createTaskName_4019Parser();
		}
		return taskName_4019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4019Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4021Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4021Parser() {
		if (goalName_4021Parser == null) {
			goalName_4021Parser = createGoalName_4021Parser();
		}
		return goalName_4021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4021Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4022Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4022Parser() {
		if (softgoalName_4022Parser == null) {
			softgoalName_4022Parser = createSoftgoalName_4022Parser();
		}
		return softgoalName_4022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4022Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4023Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4023Parser() {
		if (resourceName_4023Parser == null) {
			resourceName_4023Parser = createResourceName_4023Parser();
		}
		return resourceName_4023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4023Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4024Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4024Parser() {
		if (taskName_4024Parser == null) {
			taskName_4024Parser = createTaskName_4024Parser();
		}
		return taskName_4024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4024Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyLabel_4030Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyLabel_4030Parser() {
		if (dependencyLabel_4030Parser == null) {
			dependencyLabel_4030Parser = createDependencyLabel_4030Parser();
		}
		return dependencyLabel_4030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyLabel_4030Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getDependency_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart.VISUAL_ID:
			return getActorName_4005Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID:
			return getAgentName_4010Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID:
			return getPositionName_4015Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_4020Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AspectNameEditPart.VISUAL_ID:
			return getAspectName_4025Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
			return getGoalName_4026Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
			return getSoftgoalName_4027Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
			return getTaskName_4028Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return getResourceName_4029Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
			return getGoalName_4001Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
			return getSoftgoalName_4002Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
			return getResourceName_4003Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID:
			return getTaskName_4004Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID:
			return getGoalName_4006Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID:
			return getSoftgoalName_4007Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID:
			return getResourceName_4008Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID:
			return getTaskName_4009Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID:
			return getGoalName_4011Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID:
			return getSoftgoalName_4012Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID:
			return getResourceName_4013Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID:
			return getTaskName_4014Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID:
			return getGoalName_4016Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID:
			return getSoftgoalName_4017Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID:
			return getResourceName_4018Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID:
			return getTaskName_4019Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName6EditPart.VISUAL_ID:
			return getGoalName_4021Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName6EditPart.VISUAL_ID:
			return getSoftgoalName_4022Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName6EditPart.VISUAL_ID:
			return getResourceName_4023Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName6EditPart.VISUAL_ID:
			return getTaskName_4024Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyLabelEditPart.VISUAL_ID:
			return getDependencyLabel_4030Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
