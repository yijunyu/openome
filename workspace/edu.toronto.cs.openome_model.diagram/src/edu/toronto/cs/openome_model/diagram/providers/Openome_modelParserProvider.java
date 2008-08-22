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
	private IParser actorName_4009Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_4009Parser() {
		if (actorName_4009Parser == null) {
			actorName_4009Parser = createActorName_4009Parser();
		}
		return actorName_4009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActorName_4009Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser agentName_4018Parser;

	/**
	 * @generated
	 */
	private IParser getAgentName_4018Parser() {
		if (agentName_4018Parser == null) {
			agentName_4018Parser = createAgentName_4018Parser();
		}
		return agentName_4018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAgentName_4018Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser positionName_4027Parser;

	/**
	 * @generated
	 */
	private IParser getPositionName_4027Parser() {
		if (positionName_4027Parser == null) {
			positionName_4027Parser = createPositionName_4027Parser();
		}
		return positionName_4027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPositionName_4027Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_4036Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_4036Parser() {
		if (roleName_4036Parser == null) {
			roleName_4036Parser = createRoleName_4036Parser();
		}
		return roleName_4036Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleName_4036Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4037Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4037Parser() {
		if (goalName_4037Parser == null) {
			goalName_4037Parser = createGoalName_4037Parser();
		}
		return goalName_4037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4037Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4038Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4038Parser() {
		if (goalQualitativeReasoningCombinedLabel_4038Parser == null) {
			goalQualitativeReasoningCombinedLabel_4038Parser = createGoalQualitativeReasoningCombinedLabel_4038Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4038Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4039Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4039Parser() {
		if (softgoalName_4039Parser == null) {
			softgoalName_4039Parser = createSoftgoalName_4039Parser();
		}
		return softgoalName_4039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4039Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalQualitativeReasoningCombinedLabel_4040Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4040Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4040Parser == null) {
			softgoalQualitativeReasoningCombinedLabel_4040Parser = createSoftgoalQualitativeReasoningCombinedLabel_4040Parser();
		}
		return softgoalQualitativeReasoningCombinedLabel_4040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalQualitativeReasoningCombinedLabel_4040Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4041Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4041Parser() {
		if (taskName_4041Parser == null) {
			taskName_4041Parser = createTaskName_4041Parser();
		}
		return taskName_4041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4041Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4042Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4042Parser() {
		if (taskQualitativeReasoningCombinedLabel_4042Parser == null) {
			taskQualitativeReasoningCombinedLabel_4042Parser = createTaskQualitativeReasoningCombinedLabel_4042Parser();
		}
		return taskQualitativeReasoningCombinedLabel_4042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskQualitativeReasoningCombinedLabel_4042Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4043Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4043Parser() {
		if (resourceName_4043Parser == null) {
			resourceName_4043Parser = createResourceName_4043Parser();
		}
		return resourceName_4043Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4043Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4044Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4044Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4044Parser == null) {
			resourceQualitativeReasoningCombinedLabel_4044Parser = createResourceQualitativeReasoningCombinedLabel_4044Parser();
		}
		return resourceQualitativeReasoningCombinedLabel_4044Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceQualitativeReasoningCombinedLabel_4044Parser() {
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
	private IParser softgoalQualitativeReasoningCombinedLabel_4004Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4004Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4004Parser == null) {
			softgoalQualitativeReasoningCombinedLabel_4004Parser = createSoftgoalQualitativeReasoningCombinedLabel_4004Parser();
		}
		return softgoalQualitativeReasoningCombinedLabel_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalQualitativeReasoningCombinedLabel_4004Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4005Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4005Parser() {
		if (resourceName_4005Parser == null) {
			resourceName_4005Parser = createResourceName_4005Parser();
		}
		return resourceName_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4005Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4006Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4006Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4006Parser == null) {
			resourceQualitativeReasoningCombinedLabel_4006Parser = createResourceQualitativeReasoningCombinedLabel_4006Parser();
		}
		return resourceQualitativeReasoningCombinedLabel_4006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceQualitativeReasoningCombinedLabel_4006Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4007Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4007Parser() {
		if (taskName_4007Parser == null) {
			taskName_4007Parser = createTaskName_4007Parser();
		}
		return taskName_4007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4007Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4008Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4008Parser() {
		if (taskQualitativeReasoningCombinedLabel_4008Parser == null) {
			taskQualitativeReasoningCombinedLabel_4008Parser = createTaskQualitativeReasoningCombinedLabel_4008Parser();
		}
		return taskQualitativeReasoningCombinedLabel_4008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskQualitativeReasoningCombinedLabel_4008Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4010Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4010Parser() {
		if (goalName_4010Parser == null) {
			goalName_4010Parser = createGoalName_4010Parser();
		}
		return goalName_4010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4010Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4011Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4011Parser() {
		if (goalQualitativeReasoningCombinedLabel_4011Parser == null) {
			goalQualitativeReasoningCombinedLabel_4011Parser = createGoalQualitativeReasoningCombinedLabel_4011Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4011Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
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
	private IParser softgoalQualitativeReasoningCombinedLabel_4013Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4013Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4013Parser == null) {
			softgoalQualitativeReasoningCombinedLabel_4013Parser = createSoftgoalQualitativeReasoningCombinedLabel_4013Parser();
		}
		return softgoalQualitativeReasoningCombinedLabel_4013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalQualitativeReasoningCombinedLabel_4013Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4014Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4014Parser() {
		if (resourceName_4014Parser == null) {
			resourceName_4014Parser = createResourceName_4014Parser();
		}
		return resourceName_4014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4014Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4015Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4015Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4015Parser == null) {
			resourceQualitativeReasoningCombinedLabel_4015Parser = createResourceQualitativeReasoningCombinedLabel_4015Parser();
		}
		return resourceQualitativeReasoningCombinedLabel_4015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceQualitativeReasoningCombinedLabel_4015Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4016Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4016Parser() {
		if (taskName_4016Parser == null) {
			taskName_4016Parser = createTaskName_4016Parser();
		}
		return taskName_4016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4016Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4017Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4017Parser() {
		if (taskQualitativeReasoningCombinedLabel_4017Parser == null) {
			taskQualitativeReasoningCombinedLabel_4017Parser = createTaskQualitativeReasoningCombinedLabel_4017Parser();
		}
		return taskQualitativeReasoningCombinedLabel_4017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskQualitativeReasoningCombinedLabel_4017Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
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
	private IParser softgoalQualitativeReasoningCombinedLabel_4022Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4022Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4022Parser == null) {
			softgoalQualitativeReasoningCombinedLabel_4022Parser = createSoftgoalQualitativeReasoningCombinedLabel_4022Parser();
		}
		return softgoalQualitativeReasoningCombinedLabel_4022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalQualitativeReasoningCombinedLabel_4022Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
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
	private IParser resourceQualitativeReasoningCombinedLabel_4024Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4024Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4024Parser == null) {
			resourceQualitativeReasoningCombinedLabel_4024Parser = createResourceQualitativeReasoningCombinedLabel_4024Parser();
		}
		return resourceQualitativeReasoningCombinedLabel_4024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceQualitativeReasoningCombinedLabel_4024Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4025Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4025Parser() {
		if (taskName_4025Parser == null) {
			taskName_4025Parser = createTaskName_4025Parser();
		}
		return taskName_4025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4025Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4026Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4026Parser() {
		if (taskQualitativeReasoningCombinedLabel_4026Parser == null) {
			taskQualitativeReasoningCombinedLabel_4026Parser = createTaskQualitativeReasoningCombinedLabel_4026Parser();
		}
		return taskQualitativeReasoningCombinedLabel_4026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskQualitativeReasoningCombinedLabel_4026Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4028Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4028Parser() {
		if (goalName_4028Parser == null) {
			goalName_4028Parser = createGoalName_4028Parser();
		}
		return goalName_4028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_4028Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4029Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4029Parser() {
		if (goalQualitativeReasoningCombinedLabel_4029Parser == null) {
			goalQualitativeReasoningCombinedLabel_4029Parser = createGoalQualitativeReasoningCombinedLabel_4029Parser();
		}
		return goalQualitativeReasoningCombinedLabel_4029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalQualitativeReasoningCombinedLabel_4029Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4030Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4030Parser() {
		if (softgoalName_4030Parser == null) {
			softgoalName_4030Parser = createSoftgoalName_4030Parser();
		}
		return softgoalName_4030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_4030Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalQualitativeReasoningCombinedLabel_4031Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4031Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4031Parser == null) {
			softgoalQualitativeReasoningCombinedLabel_4031Parser = createSoftgoalQualitativeReasoningCombinedLabel_4031Parser();
		}
		return softgoalQualitativeReasoningCombinedLabel_4031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalQualitativeReasoningCombinedLabel_4031Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4032Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4032Parser() {
		if (resourceName_4032Parser == null) {
			resourceName_4032Parser = createResourceName_4032Parser();
		}
		return resourceName_4032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_4032Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4033Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4033Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4033Parser == null) {
			resourceQualitativeReasoningCombinedLabel_4033Parser = createResourceQualitativeReasoningCombinedLabel_4033Parser();
		}
		return resourceQualitativeReasoningCombinedLabel_4033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceQualitativeReasoningCombinedLabel_4033Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4034Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4034Parser() {
		if (taskName_4034Parser == null) {
			taskName_4034Parser = createTaskName_4034Parser();
		}
		return taskName_4034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_4034Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4035Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4035Parser() {
		if (taskQualitativeReasoningCombinedLabel_4035Parser == null) {
			taskQualitativeReasoningCombinedLabel_4035Parser = createTaskQualitativeReasoningCombinedLabel_4035Parser();
		}
		return taskQualitativeReasoningCombinedLabel_4035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskQualitativeReasoningCombinedLabel_4035Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_QualitativeReasoningCombinedLabel(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser helpContributionContributionType_4045Parser;

	/**
	 * @generated
	 */
	private IParser getHelpContributionContributionType_4045Parser() {
		if (helpContributionContributionType_4045Parser == null) {
			helpContributionContributionType_4045Parser = createHelpContributionContributionType_4045Parser();
		}
		return helpContributionContributionType_4045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHelpContributionContributionType_4045Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getHelpContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser hurtContributionContributionType_4046Parser;

	/**
	 * @generated
	 */
	private IParser getHurtContributionContributionType_4046Parser() {
		if (hurtContributionContributionType_4046Parser == null) {
			hurtContributionContributionType_4046Parser = createHurtContributionContributionType_4046Parser();
		}
		return hurtContributionContributionType_4046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHurtContributionContributionType_4046Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getHurtContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser makeContributionContributionType_4047Parser;

	/**
	 * @generated
	 */
	private IParser getMakeContributionContributionType_4047Parser() {
		if (makeContributionContributionType_4047Parser == null) {
			makeContributionContributionType_4047Parser = createMakeContributionContributionType_4047Parser();
		}
		return makeContributionContributionType_4047Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMakeContributionContributionType_4047Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getMakeContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser breakContributionContributionType_4048Parser;

	/**
	 * @generated
	 */
	private IParser getBreakContributionContributionType_4048Parser() {
		if (breakContributionContributionType_4048Parser == null) {
			breakContributionContributionType_4048Parser = createBreakContributionContributionType_4048Parser();
		}
		return breakContributionContributionType_4048Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBreakContributionContributionType_4048Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getBreakContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser somePlusContributionContributionType_4049Parser;

	/**
	 * @generated
	 */
	private IParser getSomePlusContributionContributionType_4049Parser() {
		if (somePlusContributionContributionType_4049Parser == null) {
			somePlusContributionContributionType_4049Parser = createSomePlusContributionContributionType_4049Parser();
		}
		return somePlusContributionContributionType_4049Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSomePlusContributionContributionType_4049Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSomePlusContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser someMinusContributionContributionType_4050Parser;

	/**
	 * @generated
	 */
	private IParser getSomeMinusContributionContributionType_4050Parser() {
		if (someMinusContributionContributionType_4050Parser == null) {
			someMinusContributionContributionType_4050Parser = createSomeMinusContributionContributionType_4050Parser();
		}
		return someMinusContributionContributionType_4050Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSomeMinusContributionContributionType_4050Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSomeMinusContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser unknownContributionContributionType_4051Parser;

	/**
	 * @generated
	 */
	private IParser getUnknownContributionContributionType_4051Parser() {
		if (unknownContributionContributionType_4051Parser == null) {
			unknownContributionContributionType_4051Parser = createUnknownContributionContributionType_4051Parser();
		}
		return unknownContributionContributionType_4051Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUnknownContributionContributionType_4051Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getUnknownContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser andContributionContributionType_4052Parser;

	/**
	 * @generated
	 */
	private IParser getAndContributionContributionType_4052Parser() {
		if (andContributionContributionType_4052Parser == null) {
			andContributionContributionType_4052Parser = createAndContributionContributionType_4052Parser();
		}
		return andContributionContributionType_4052Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAndContributionContributionType_4052Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getAndContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser orContributionContributionType_4053Parser;

	/**
	 * @generated
	 */
	private IParser getOrContributionContributionType_4053Parser() {
		if (orContributionContributionType_4053Parser == null) {
			orContributionContributionType_4053Parser = createOrContributionContributionType_4053Parser();
		}
		return orContributionContributionType_4053Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOrContributionContributionType_4053Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOrContribution_ContributionType(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser isAAssociationLabel_4054Parser;

	/**
	 * @generated
	 */
	private IParser getIsAAssociationLabel_4054Parser() {
		if (isAAssociationLabel_4054Parser == null) {
			isAAssociationLabel_4054Parser = createIsAAssociationLabel_4054Parser();
		}
		return isAAssociationLabel_4054Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIsAAssociationLabel_4054Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIsAAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser coversAssociationLabel_4055Parser;

	/**
	 * @generated
	 */
	private IParser getCoversAssociationLabel_4055Parser() {
		if (coversAssociationLabel_4055Parser == null) {
			coversAssociationLabel_4055Parser = createCoversAssociationLabel_4055Parser();
		}
		return coversAssociationLabel_4055Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCoversAssociationLabel_4055Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getCoversAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser occupiesAssociationLabel_4056Parser;

	/**
	 * @generated
	 */
	private IParser getOccupiesAssociationLabel_4056Parser() {
		if (occupiesAssociationLabel_4056Parser == null) {
			occupiesAssociationLabel_4056Parser = createOccupiesAssociationLabel_4056Parser();
		}
		return occupiesAssociationLabel_4056Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOccupiesAssociationLabel_4056Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOccupiesAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser isPartOfAssociationLabel_4057Parser;

	/**
	 * @generated
	 */
	private IParser getIsPartOfAssociationLabel_4057Parser() {
		if (isPartOfAssociationLabel_4057Parser == null) {
			isPartOfAssociationLabel_4057Parser = createIsPartOfAssociationLabel_4057Parser();
		}
		return isPartOfAssociationLabel_4057Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIsPartOfAssociationLabel_4057Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIsPartOfAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser playsAssociationLabel_4058Parser;

	/**
	 * @generated
	 */
	private IParser getPlaysAssociationLabel_4058Parser() {
		if (playsAssociationLabel_4058Parser == null) {
			playsAssociationLabel_4058Parser = createPlaysAssociationLabel_4058Parser();
		}
		return playsAssociationLabel_4058Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPlaysAssociationLabel_4058Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getPlaysAssociation_Label(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iNSAssociationLabel_4059Parser;

	/**
	 * @generated
	 */
	private IParser getINSAssociationLabel_4059Parser() {
		if (iNSAssociationLabel_4059Parser == null) {
			iNSAssociationLabel_4059Parser = createINSAssociationLabel_4059Parser();
		}
		return iNSAssociationLabel_4059Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createINSAssociationLabel_4059Parser() {
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
			return getActorName_4009Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID:
			return getAgentName_4018Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID:
			return getPositionName_4027Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_4036Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
			return getGoalName_4037Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningComEditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4038Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
			return getSoftgoalName_4039Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningComEditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4040Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
			return getTaskName_4041Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningComEditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4042Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return getResourceName_4043Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningComEditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4044Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
			return getGoalName_4001Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4002Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
			return getSoftgoalName_4003Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4004Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
			return getResourceName_4005Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4006Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID:
			return getTaskName_4007Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4008Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID:
			return getGoalName_4010Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4011Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID:
			return getSoftgoalName_4012Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4013Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID:
			return getResourceName_4014Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4015Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID:
			return getTaskName_4016Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4017Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID:
			return getGoalName_4019Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4020Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID:
			return getSoftgoalName_4021Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4022Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID:
			return getResourceName_4023Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4024Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID:
			return getTaskName_4025Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4026Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID:
			return getGoalName_4028Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4029Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID:
			return getSoftgoalName_4030Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4031Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID:
			return getResourceName_4032Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4033Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID:
			return getTaskName_4034Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4035Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionContributionTypeEditPart.VISUAL_ID:
			return getHelpContributionContributionType_4045Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionContributionTypeEditPart.VISUAL_ID:
			return getHurtContributionContributionType_4046Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart.VISUAL_ID:
			return getMakeContributionContributionType_4047Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionContributionTypeEditPart.VISUAL_ID:
			return getBreakContributionContributionType_4048Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomePlusContributionContributionType_4049Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomeMinusContributionContributionType_4050Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionContributionTypeEditPart.VISUAL_ID:
			return getUnknownContributionContributionType_4051Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionContributionTypeEditPart.VISUAL_ID:
			return getAndContributionContributionType_4052Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionContributionTypeEditPart.VISUAL_ID:
			return getOrContributionContributionType_4053Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationLabelEditPart.VISUAL_ID:
			return getIsAAssociationLabel_4054Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationLabelEditPart.VISUAL_ID:
			return getCoversAssociationLabel_4055Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationLabelEditPart.VISUAL_ID:
			return getOccupiesAssociationLabel_4056Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart.VISUAL_ID:
			return getIsPartOfAssociationLabel_4057Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationLabelEditPart.VISUAL_ID:
			return getPlaysAssociationLabel_4058Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationLabelEditPart.VISUAL_ID:
			return getINSAssociationLabel_4059Parser();
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
