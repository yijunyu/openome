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
	private IParser helpContributionContributionType_4032Parser;

	/**
	 * @generated
	 */
	private IParser getHelpContributionContributionType_4032Parser() {
		if (helpContributionContributionType_4032Parser == null) {
			helpContributionContributionType_4032Parser = createHelpContributionContributionType_4032Parser();
		}
		return helpContributionContributionType_4032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHelpContributionContributionType_4032Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getHelpContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser hurtContributionContributionType_4033Parser;

	/**
	 * @generated
	 */
	private IParser getHurtContributionContributionType_4033Parser() {
		if (hurtContributionContributionType_4033Parser == null) {
			hurtContributionContributionType_4033Parser = createHurtContributionContributionType_4033Parser();
		}
		return hurtContributionContributionType_4033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHurtContributionContributionType_4033Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getHurtContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser makeContributionContributionType_4034Parser;

	/**
	 * @generated
	 */
	private IParser getMakeContributionContributionType_4034Parser() {
		if (makeContributionContributionType_4034Parser == null) {
			makeContributionContributionType_4034Parser = createMakeContributionContributionType_4034Parser();
		}
		return makeContributionContributionType_4034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMakeContributionContributionType_4034Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getMakeContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser breakContributionContributionType_4035Parser;

	/**
	 * @generated
	 */
	private IParser getBreakContributionContributionType_4035Parser() {
		if (breakContributionContributionType_4035Parser == null) {
			breakContributionContributionType_4035Parser = createBreakContributionContributionType_4035Parser();
		}
		return breakContributionContributionType_4035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBreakContributionContributionType_4035Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getBreakContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser somePlusContributionContributionType_4036Parser;

	/**
	 * @generated
	 */
	private IParser getSomePlusContributionContributionType_4036Parser() {
		if (somePlusContributionContributionType_4036Parser == null) {
			somePlusContributionContributionType_4036Parser = createSomePlusContributionContributionType_4036Parser();
		}
		return somePlusContributionContributionType_4036Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSomePlusContributionContributionType_4036Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSomePlusContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser someMinusContributionContributionType_4037Parser;

	/**
	 * @generated
	 */
	private IParser getSomeMinusContributionContributionType_4037Parser() {
		if (someMinusContributionContributionType_4037Parser == null) {
			someMinusContributionContributionType_4037Parser = createSomeMinusContributionContributionType_4037Parser();
		}
		return someMinusContributionContributionType_4037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSomeMinusContributionContributionType_4037Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSomeMinusContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser unknownContributionContributionType_4038Parser;

	/**
	 * @generated
	 */
	private IParser getUnknownContributionContributionType_4038Parser() {
		if (unknownContributionContributionType_4038Parser == null) {
			unknownContributionContributionType_4038Parser = createUnknownContributionContributionType_4038Parser();
		}
		return unknownContributionContributionType_4038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUnknownContributionContributionType_4038Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getUnknownContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser andContributionContributionType_4039Parser;

	/**
	 * @generated
	 */
	private IParser getAndContributionContributionType_4039Parser() {
		if (andContributionContributionType_4039Parser == null) {
			andContributionContributionType_4039Parser = createAndContributionContributionType_4039Parser();
		}
		return andContributionContributionType_4039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAndContributionContributionType_4039Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getAndContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser orContributionContributionType_4040Parser;

	/**
	 * @generated
	 */
	private IParser getOrContributionContributionType_4040Parser() {
		if (orContributionContributionType_4040Parser == null) {
			orContributionContributionType_4040Parser = createOrContributionContributionType_4040Parser();
		}
		return orContributionContributionType_4040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOrContributionContributionType_4040Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOrContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser isAAssociationLabel_4041Parser;

	/**
	 * @generated
	 */
	private IParser getIsAAssociationLabel_4041Parser() {
		if (isAAssociationLabel_4041Parser == null) {
			isAAssociationLabel_4041Parser = createIsAAssociationLabel_4041Parser();
		}
		return isAAssociationLabel_4041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIsAAssociationLabel_4041Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIsAAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser coversAssociationLabel_4042Parser;

	/**
	 * @generated
	 */
	private IParser getCoversAssociationLabel_4042Parser() {
		if (coversAssociationLabel_4042Parser == null) {
			coversAssociationLabel_4042Parser = createCoversAssociationLabel_4042Parser();
		}
		return coversAssociationLabel_4042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCoversAssociationLabel_4042Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getCoversAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser occupiesAssociationLabel_4043Parser;

	/**
	 * @generated
	 */
	private IParser getOccupiesAssociationLabel_4043Parser() {
		if (occupiesAssociationLabel_4043Parser == null) {
			occupiesAssociationLabel_4043Parser = createOccupiesAssociationLabel_4043Parser();
		}
		return occupiesAssociationLabel_4043Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOccupiesAssociationLabel_4043Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOccupiesAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser isPartOfAssociationLabel_4044Parser;

	/**
	 * @generated
	 */
	private IParser getIsPartOfAssociationLabel_4044Parser() {
		if (isPartOfAssociationLabel_4044Parser == null) {
			isPartOfAssociationLabel_4044Parser = createIsPartOfAssociationLabel_4044Parser();
		}
		return isPartOfAssociationLabel_4044Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIsPartOfAssociationLabel_4044Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIsPartOfAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser playsAssociationLabel_4045Parser;

	/**
	 * @generated
	 */
	private IParser getPlaysAssociationLabel_4045Parser() {
		if (playsAssociationLabel_4045Parser == null) {
			playsAssociationLabel_4045Parser = createPlaysAssociationLabel_4045Parser();
		}
		return playsAssociationLabel_4045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPlaysAssociationLabel_4045Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getPlaysAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iNSAssociationLabel_4046Parser;

	/**
	 * @generated
	 */
	private IParser getINSAssociationLabel_4046Parser() {
		if (iNSAssociationLabel_4046Parser == null) {
			iNSAssociationLabel_4046Parser = createINSAssociationLabel_4046Parser();
		}
		return iNSAssociationLabel_4046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createINSAssociationLabel_4046Parser() {
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
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
			return getTaskName_4028Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return getResourceName_4029Parser();
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
			return getHelpContributionContributionType_4032Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionContributionTypeEditPart.VISUAL_ID:
			return getHurtContributionContributionType_4033Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart.VISUAL_ID:
			return getMakeContributionContributionType_4034Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionContributionTypeEditPart.VISUAL_ID:
			return getBreakContributionContributionType_4035Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomePlusContributionContributionType_4036Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomeMinusContributionContributionType_4037Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionContributionTypeEditPart.VISUAL_ID:
			return getUnknownContributionContributionType_4038Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionContributionTypeEditPart.VISUAL_ID:
			return getAndContributionContributionType_4039Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionContributionTypeEditPart.VISUAL_ID:
			return getOrContributionContributionType_4040Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationLabelEditPart.VISUAL_ID:
			return getIsAAssociationLabel_4041Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationLabelEditPart.VISUAL_ID:
			return getCoversAssociationLabel_4042Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationLabelEditPart.VISUAL_ID:
			return getOccupiesAssociationLabel_4043Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart.VISUAL_ID:
			return getIsPartOfAssociationLabel_4044Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationLabelEditPart.VISUAL_ID:
			return getPlaysAssociationLabel_4045Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationLabelEditPart.VISUAL_ID:
			return getINSAssociationLabel_4046Parser();
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
