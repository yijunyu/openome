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
	private IParser actorName_4006Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_4006Parser() {
		if (actorName_4006Parser == null) {
			actorName_4006Parser = createActorName_4006Parser();
		}
		return actorName_4006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActorName_4006Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser agentName_4012Parser;

	/**
	 * @generated
	 */
	private IParser getAgentName_4012Parser() {
		if (agentName_4012Parser == null) {
			agentName_4012Parser = createAgentName_4012Parser();
		}
		return agentName_4012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAgentName_4012Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser positionName_4018Parser;

	/**
	 * @generated
	 */
	private IParser getPositionName_4018Parser() {
		if (positionName_4018Parser == null) {
			positionName_4018Parser = createPositionName_4018Parser();
		}
		return positionName_4018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPositionName_4018Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_4024Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_4024Parser() {
		if (roleName_4024Parser == null) {
			roleName_4024Parser = createRoleName_4024Parser();
		}
		return roleName_4024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleName_4024Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4025Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4025Parser() {
		if (goalName_4025Parser == null) {
			goalName_4025Parser = createGoalName_4025Parser();
		}
		return goalName_4025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4025Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4026Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4026Parser() {
		if (goalQualitativeReasoningCombinedLabel_4026Parser == null) {
			goalQualitativeReasoningCombinedLabel_4026Parser = createGoalQualitativeReasoningCombinedLabel_4026Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4026Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
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
	private IParser softgoalQualitativeReasoningCombinedLabel_4028Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4028Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4028Parser == null) {
			softgoalQualitativeReasoningCombinedLabel_4028Parser = createSoftgoalQualitativeReasoningCombinedLabel_4028Parser();
		}
		return softgoalQualitativeReasoningCombinedLabel_4028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalQualitativeReasoningCombinedLabel_4028Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4029Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4029Parser() {
		if (taskName_4029Parser == null) {
			taskName_4029Parser = createTaskName_4029Parser();
		}
		return taskName_4029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4029Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4030Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4030Parser() {
		if (taskQualitativeReasoningCombinedLabel_4030Parser == null) {
			taskQualitativeReasoningCombinedLabel_4030Parser = createTaskQualitativeReasoningCombinedLabel_4030Parser();
		}
		return taskQualitativeReasoningCombinedLabel_4030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskQualitativeReasoningCombinedLabel_4030Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4031Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4031Parser() {
		if (resourceName_4031Parser == null) {
			resourceName_4031Parser = createResourceName_4031Parser();
		}
		return resourceName_4031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4031Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4032Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4032Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4032Parser == null) {
			resourceQualitativeReasoningCombinedLabel_4032Parser = createResourceQualitativeReasoningCombinedLabel_4032Parser();
		}
		return resourceQualitativeReasoningCombinedLabel_4032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceQualitativeReasoningCombinedLabel_4032Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
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
	private IParser goalQualitativeReasoningCombinedLabel_4002Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4002Parser() {
		if (goalQualitativeReasoningCombinedLabel_4002Parser == null) {
			goalQualitativeReasoningCombinedLabel_4002Parser = createGoalQualitativeReasoningCombinedLabel_4002Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4002Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4003Parser() {
		if (softgoalName_4003Parser == null) {
			softgoalName_4003Parser = createSoftgoalName_4003Parser();
		}
		return softgoalName_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4003Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4004Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4004Parser() {
		if (resourceName_4004Parser == null) {
			resourceName_4004Parser = createResourceName_4004Parser();
		}
		return resourceName_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4004Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4005Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4005Parser() {
		if (taskName_4005Parser == null) {
			taskName_4005Parser = createTaskName_4005Parser();
		}
		return taskName_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4005Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4007Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4007Parser() {
		if (goalName_4007Parser == null) {
			goalName_4007Parser = createGoalName_4007Parser();
		}
		return goalName_4007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4007Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4008Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4008Parser() {
		if (goalQualitativeReasoningCombinedLabel_4008Parser == null) {
			goalQualitativeReasoningCombinedLabel_4008Parser = createGoalQualitativeReasoningCombinedLabel_4008Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4008Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4009Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4009Parser() {
		if (softgoalName_4009Parser == null) {
			softgoalName_4009Parser = createSoftgoalName_4009Parser();
		}
		return softgoalName_4009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4009Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4010Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4010Parser() {
		if (resourceName_4010Parser == null) {
			resourceName_4010Parser = createResourceName_4010Parser();
		}
		return resourceName_4010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4010Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4011Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4011Parser() {
		if (taskName_4011Parser == null) {
			taskName_4011Parser = createTaskName_4011Parser();
		}
		return taskName_4011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4011Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4013Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4013Parser() {
		if (goalName_4013Parser == null) {
			goalName_4013Parser = createGoalName_4013Parser();
		}
		return goalName_4013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4013Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4014Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4014Parser() {
		if (goalQualitativeReasoningCombinedLabel_4014Parser == null) {
			goalQualitativeReasoningCombinedLabel_4014Parser = createGoalQualitativeReasoningCombinedLabel_4014Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4014Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4015Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4015Parser() {
		if (softgoalName_4015Parser == null) {
			softgoalName_4015Parser = createSoftgoalName_4015Parser();
		}
		return softgoalName_4015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4015Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4016Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4016Parser() {
		if (resourceName_4016Parser == null) {
			resourceName_4016Parser = createResourceName_4016Parser();
		}
		return resourceName_4016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4016Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4017Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4017Parser() {
		if (taskName_4017Parser == null) {
			taskName_4017Parser = createTaskName_4017Parser();
		}
		return taskName_4017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4017Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4019Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4019Parser() {
		if (goalName_4019Parser == null) {
			goalName_4019Parser = createGoalName_4019Parser();
		}
		return goalName_4019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4019Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4020Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4020Parser() {
		if (goalQualitativeReasoningCombinedLabel_4020Parser == null) {
			goalQualitativeReasoningCombinedLabel_4020Parser = createGoalQualitativeReasoningCombinedLabel_4020Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4020Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4021Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4021Parser() {
		if (softgoalName_4021Parser == null) {
			softgoalName_4021Parser = createSoftgoalName_4021Parser();
		}
		return softgoalName_4021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4021Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4022Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4022Parser() {
		if (resourceName_4022Parser == null) {
			resourceName_4022Parser = createResourceName_4022Parser();
		}
		return resourceName_4022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4022Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4023Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4023Parser() {
		if (taskName_4023Parser == null) {
			taskName_4023Parser = createTaskName_4023Parser();
		}
		return taskName_4023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4023Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser helpContributionContributionType_4035Parser;

	/**
	 * @generated
	 */
	private IParser getHelpContributionContributionType_4035Parser() {
		if (helpContributionContributionType_4035Parser == null) {
			helpContributionContributionType_4035Parser = createHelpContributionContributionType_4035Parser();
		}
		return helpContributionContributionType_4035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHelpContributionContributionType_4035Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getHelpContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser hurtContributionContributionType_4036Parser;

	/**
	 * @generated
	 */
	private IParser getHurtContributionContributionType_4036Parser() {
		if (hurtContributionContributionType_4036Parser == null) {
			hurtContributionContributionType_4036Parser = createHurtContributionContributionType_4036Parser();
		}
		return hurtContributionContributionType_4036Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHurtContributionContributionType_4036Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getHurtContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser makeContributionContributionType_4037Parser;

	/**
	 * @generated
	 */
	private IParser getMakeContributionContributionType_4037Parser() {
		if (makeContributionContributionType_4037Parser == null) {
			makeContributionContributionType_4037Parser = createMakeContributionContributionType_4037Parser();
		}
		return makeContributionContributionType_4037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMakeContributionContributionType_4037Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getMakeContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser breakContributionContributionType_4038Parser;

	/**
	 * @generated
	 */
	private IParser getBreakContributionContributionType_4038Parser() {
		if (breakContributionContributionType_4038Parser == null) {
			breakContributionContributionType_4038Parser = createBreakContributionContributionType_4038Parser();
		}
		return breakContributionContributionType_4038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBreakContributionContributionType_4038Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getBreakContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser somePlusContributionContributionType_4039Parser;

	/**
	 * @generated
	 */
	private IParser getSomePlusContributionContributionType_4039Parser() {
		if (somePlusContributionContributionType_4039Parser == null) {
			somePlusContributionContributionType_4039Parser = createSomePlusContributionContributionType_4039Parser();
		}
		return somePlusContributionContributionType_4039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSomePlusContributionContributionType_4039Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSomePlusContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser someMinusContributionContributionType_4040Parser;

	/**
	 * @generated
	 */
	private IParser getSomeMinusContributionContributionType_4040Parser() {
		if (someMinusContributionContributionType_4040Parser == null) {
			someMinusContributionContributionType_4040Parser = createSomeMinusContributionContributionType_4040Parser();
		}
		return someMinusContributionContributionType_4040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSomeMinusContributionContributionType_4040Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSomeMinusContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser unknownContributionContributionType_4041Parser;

	/**
	 * @generated
	 */
	private IParser getUnknownContributionContributionType_4041Parser() {
		if (unknownContributionContributionType_4041Parser == null) {
			unknownContributionContributionType_4041Parser = createUnknownContributionContributionType_4041Parser();
		}
		return unknownContributionContributionType_4041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUnknownContributionContributionType_4041Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getUnknownContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser andContributionContributionType_4042Parser;

	/**
	 * @generated
	 */
	private IParser getAndContributionContributionType_4042Parser() {
		if (andContributionContributionType_4042Parser == null) {
			andContributionContributionType_4042Parser = createAndContributionContributionType_4042Parser();
		}
		return andContributionContributionType_4042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAndContributionContributionType_4042Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getAndContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser orContributionContributionType_4043Parser;

	/**
	 * @generated
	 */
	private IParser getOrContributionContributionType_4043Parser() {
		if (orContributionContributionType_4043Parser == null) {
			orContributionContributionType_4043Parser = createOrContributionContributionType_4043Parser();
		}
		return orContributionContributionType_4043Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOrContributionContributionType_4043Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOrContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser isAAssociationLabel_4044Parser;

	/**
	 * @generated
	 */
	private IParser getIsAAssociationLabel_4044Parser() {
		if (isAAssociationLabel_4044Parser == null) {
			isAAssociationLabel_4044Parser = createIsAAssociationLabel_4044Parser();
		}
		return isAAssociationLabel_4044Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIsAAssociationLabel_4044Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIsAAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser coversAssociationLabel_4045Parser;

	/**
	 * @generated
	 */
	private IParser getCoversAssociationLabel_4045Parser() {
		if (coversAssociationLabel_4045Parser == null) {
			coversAssociationLabel_4045Parser = createCoversAssociationLabel_4045Parser();
		}
		return coversAssociationLabel_4045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCoversAssociationLabel_4045Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getCoversAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser occupiesAssociationLabel_4046Parser;

	/**
	 * @generated
	 */
	private IParser getOccupiesAssociationLabel_4046Parser() {
		if (occupiesAssociationLabel_4046Parser == null) {
			occupiesAssociationLabel_4046Parser = createOccupiesAssociationLabel_4046Parser();
		}
		return occupiesAssociationLabel_4046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOccupiesAssociationLabel_4046Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOccupiesAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser isPartOfAssociationLabel_4047Parser;

	/**
	 * @generated
	 */
	private IParser getIsPartOfAssociationLabel_4047Parser() {
		if (isPartOfAssociationLabel_4047Parser == null) {
			isPartOfAssociationLabel_4047Parser = createIsPartOfAssociationLabel_4047Parser();
		}
		return isPartOfAssociationLabel_4047Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIsPartOfAssociationLabel_4047Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIsPartOfAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser playsAssociationLabel_4048Parser;

	/**
	 * @generated
	 */
	private IParser getPlaysAssociationLabel_4048Parser() {
		if (playsAssociationLabel_4048Parser == null) {
			playsAssociationLabel_4048Parser = createPlaysAssociationLabel_4048Parser();
		}
		return playsAssociationLabel_4048Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPlaysAssociationLabel_4048Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getPlaysAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iNSAssociationLabel_4049Parser;

	/**
	 * @generated
	 */
	private IParser getINSAssociationLabel_4049Parser() {
		if (iNSAssociationLabel_4049Parser == null) {
			iNSAssociationLabel_4049Parser = createINSAssociationLabel_4049Parser();
		}
		return iNSAssociationLabel_4049Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createINSAssociationLabel_4049Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getINSAssociation_Label(), };
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
			return getActorName_4006Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID:
			return getAgentName_4012Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID:
			return getPositionName_4018Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_4024Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
			return getGoalName_4025Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningComEditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4026Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
			return getSoftgoalName_4027Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningComEditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4028Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
			return getTaskName_4029Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningComEditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4030Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return getResourceName_4031Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningComEditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4032Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
			return getGoalName_4001Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4002Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
			return getSoftgoalName_4003Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
			return getResourceName_4004Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID:
			return getTaskName_4005Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID:
			return getGoalName_4007Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4008Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID:
			return getSoftgoalName_4009Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID:
			return getResourceName_4010Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID:
			return getTaskName_4011Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID:
			return getGoalName_4013Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4014Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID:
			return getSoftgoalName_4015Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID:
			return getResourceName_4016Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID:
			return getTaskName_4017Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID:
			return getGoalName_4019Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4020Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID:
			return getSoftgoalName_4021Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID:
			return getResourceName_4022Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID:
			return getTaskName_4023Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionContributionTypeEditPart.VISUAL_ID:
			return getHelpContributionContributionType_4035Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionContributionTypeEditPart.VISUAL_ID:
			return getHurtContributionContributionType_4036Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart.VISUAL_ID:
			return getMakeContributionContributionType_4037Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionContributionTypeEditPart.VISUAL_ID:
			return getBreakContributionContributionType_4038Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomePlusContributionContributionType_4039Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomeMinusContributionContributionType_4040Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionContributionTypeEditPart.VISUAL_ID:
			return getUnknownContributionContributionType_4041Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionContributionTypeEditPart.VISUAL_ID:
			return getAndContributionContributionType_4042Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionContributionTypeEditPart.VISUAL_ID:
			return getOrContributionContributionType_4043Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationLabelEditPart.VISUAL_ID:
			return getIsAAssociationLabel_4044Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationLabelEditPart.VISUAL_ID:
			return getCoversAssociationLabel_4045Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationLabelEditPart.VISUAL_ID:
			return getOccupiesAssociationLabel_4046Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart.VISUAL_ID:
			return getIsPartOfAssociationLabel_4047Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationLabelEditPart.VISUAL_ID:
			return getPlaysAssociationLabel_4048Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationLabelEditPart.VISUAL_ID:
			return getINSAssociationLabel_4049Parser();
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
