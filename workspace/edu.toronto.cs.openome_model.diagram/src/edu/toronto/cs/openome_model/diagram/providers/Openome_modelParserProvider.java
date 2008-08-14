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
	private IParser goalQualitativeReasoningCombinedLabel_4022Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4022Parser() {
		if (goalQualitativeReasoningCombinedLabel_4022Parser == null) {
			goalQualitativeReasoningCombinedLabel_4022Parser = createGoalQualitativeReasoningCombinedLabel_4022Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4022Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4023Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4023Parser() {
		if (softgoalName_4023Parser == null) {
			softgoalName_4023Parser = createSoftgoalName_4023Parser();
		}
		return softgoalName_4023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4023Parser() {
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
	private IParser resourceName_4025Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4025Parser() {
		if (resourceName_4025Parser == null) {
			resourceName_4025Parser = createResourceName_4025Parser();
		}
		return resourceName_4025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4025Parser() {
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
	private IParser helpContributionContributionType_4028Parser;

	/**
	 * @generated
	 */
	private IParser getHelpContributionContributionType_4028Parser() {
		if (helpContributionContributionType_4028Parser == null) {
			helpContributionContributionType_4028Parser = createHelpContributionContributionType_4028Parser();
		}
		return helpContributionContributionType_4028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHelpContributionContributionType_4028Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getHelpContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser hurtContributionContributionType_4029Parser;

	/**
	 * @generated
	 */
	private IParser getHurtContributionContributionType_4029Parser() {
		if (hurtContributionContributionType_4029Parser == null) {
			hurtContributionContributionType_4029Parser = createHurtContributionContributionType_4029Parser();
		}
		return hurtContributionContributionType_4029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHurtContributionContributionType_4029Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getHurtContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser makeContributionContributionType_4030Parser;

	/**
	 * @generated
	 */
	private IParser getMakeContributionContributionType_4030Parser() {
		if (makeContributionContributionType_4030Parser == null) {
			makeContributionContributionType_4030Parser = createMakeContributionContributionType_4030Parser();
		}
		return makeContributionContributionType_4030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMakeContributionContributionType_4030Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getMakeContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser breakContributionContributionType_4031Parser;

	/**
	 * @generated
	 */
	private IParser getBreakContributionContributionType_4031Parser() {
		if (breakContributionContributionType_4031Parser == null) {
			breakContributionContributionType_4031Parser = createBreakContributionContributionType_4031Parser();
		}
		return breakContributionContributionType_4031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBreakContributionContributionType_4031Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getBreakContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser somePlusContributionContributionType_4032Parser;

	/**
	 * @generated
	 */
	private IParser getSomePlusContributionContributionType_4032Parser() {
		if (somePlusContributionContributionType_4032Parser == null) {
			somePlusContributionContributionType_4032Parser = createSomePlusContributionContributionType_4032Parser();
		}
		return somePlusContributionContributionType_4032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSomePlusContributionContributionType_4032Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSomePlusContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser someMinusContributionContributionType_4033Parser;

	/**
	 * @generated
	 */
	private IParser getSomeMinusContributionContributionType_4033Parser() {
		if (someMinusContributionContributionType_4033Parser == null) {
			someMinusContributionContributionType_4033Parser = createSomeMinusContributionContributionType_4033Parser();
		}
		return someMinusContributionContributionType_4033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSomeMinusContributionContributionType_4033Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSomeMinusContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser unknownContributionContributionType_4034Parser;

	/**
	 * @generated
	 */
	private IParser getUnknownContributionContributionType_4034Parser() {
		if (unknownContributionContributionType_4034Parser == null) {
			unknownContributionContributionType_4034Parser = createUnknownContributionContributionType_4034Parser();
		}
		return unknownContributionContributionType_4034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUnknownContributionContributionType_4034Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getUnknownContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser andContributionContributionType_4035Parser;

	/**
	 * @generated
	 */
	private IParser getAndContributionContributionType_4035Parser() {
		if (andContributionContributionType_4035Parser == null) {
			andContributionContributionType_4035Parser = createAndContributionContributionType_4035Parser();
		}
		return andContributionContributionType_4035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAndContributionContributionType_4035Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getAndContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser orContributionContributionType_4036Parser;

	/**
	 * @generated
	 */
	private IParser getOrContributionContributionType_4036Parser() {
		if (orContributionContributionType_4036Parser == null) {
			orContributionContributionType_4036Parser = createOrContributionContributionType_4036Parser();
		}
		return orContributionContributionType_4036Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOrContributionContributionType_4036Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOrContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser isAAssociationLabel_4037Parser;

	/**
	 * @generated
	 */
	private IParser getIsAAssociationLabel_4037Parser() {
		if (isAAssociationLabel_4037Parser == null) {
			isAAssociationLabel_4037Parser = createIsAAssociationLabel_4037Parser();
		}
		return isAAssociationLabel_4037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIsAAssociationLabel_4037Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIsAAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser coversAssociationLabel_4038Parser;

	/**
	 * @generated
	 */
	private IParser getCoversAssociationLabel_4038Parser() {
		if (coversAssociationLabel_4038Parser == null) {
			coversAssociationLabel_4038Parser = createCoversAssociationLabel_4038Parser();
		}
		return coversAssociationLabel_4038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCoversAssociationLabel_4038Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getCoversAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser occupiesAssociationLabel_4039Parser;

	/**
	 * @generated
	 */
	private IParser getOccupiesAssociationLabel_4039Parser() {
		if (occupiesAssociationLabel_4039Parser == null) {
			occupiesAssociationLabel_4039Parser = createOccupiesAssociationLabel_4039Parser();
		}
		return occupiesAssociationLabel_4039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOccupiesAssociationLabel_4039Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOccupiesAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser isPartOfAssociationLabel_4040Parser;

	/**
	 * @generated
	 */
	private IParser getIsPartOfAssociationLabel_4040Parser() {
		if (isPartOfAssociationLabel_4040Parser == null) {
			isPartOfAssociationLabel_4040Parser = createIsPartOfAssociationLabel_4040Parser();
		}
		return isPartOfAssociationLabel_4040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIsPartOfAssociationLabel_4040Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIsPartOfAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser playsAssociationLabel_4041Parser;

	/**
	 * @generated
	 */
	private IParser getPlaysAssociationLabel_4041Parser() {
		if (playsAssociationLabel_4041Parser == null) {
			playsAssociationLabel_4041Parser = createPlaysAssociationLabel_4041Parser();
		}
		return playsAssociationLabel_4041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPlaysAssociationLabel_4041Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getPlaysAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iNSAssociationLabel_4042Parser;

	/**
	 * @generated
	 */
	private IParser getINSAssociationLabel_4042Parser() {
		if (iNSAssociationLabel_4042Parser == null) {
			iNSAssociationLabel_4042Parser = createINSAssociationLabel_4042Parser();
		}
		return iNSAssociationLabel_4042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createINSAssociationLabel_4042Parser() {
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
			return getActorName_4005Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID:
			return getAgentName_4010Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID:
			return getPositionName_4015Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_4020Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
			return getGoalName_4021Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningComEditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4022Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
			return getSoftgoalName_4023Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
			return getTaskName_4024Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return getResourceName_4025Parser();
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
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionContributionTypeEditPart.VISUAL_ID:
			return getHelpContributionContributionType_4028Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionContributionTypeEditPart.VISUAL_ID:
			return getHurtContributionContributionType_4029Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart.VISUAL_ID:
			return getMakeContributionContributionType_4030Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionContributionTypeEditPart.VISUAL_ID:
			return getBreakContributionContributionType_4031Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomePlusContributionContributionType_4032Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomeMinusContributionContributionType_4033Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionContributionTypeEditPart.VISUAL_ID:
			return getUnknownContributionContributionType_4034Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionContributionTypeEditPart.VISUAL_ID:
			return getAndContributionContributionType_4035Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionContributionTypeEditPart.VISUAL_ID:
			return getOrContributionContributionType_4036Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationLabelEditPart.VISUAL_ID:
			return getIsAAssociationLabel_4037Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationLabelEditPart.VISUAL_ID:
			return getCoversAssociationLabel_4038Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationLabelEditPart.VISUAL_ID:
			return getOccupiesAssociationLabel_4039Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart.VISUAL_ID:
			return getIsPartOfAssociationLabel_4040Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationLabelEditPart.VISUAL_ID:
			return getPlaysAssociationLabel_4041Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationLabelEditPart.VISUAL_ID:
			return getINSAssociationLabel_4042Parser();
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
