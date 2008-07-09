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
	private IParser actorName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_5005Parser() {
		if (actorName_5005Parser == null) {
			actorName_5005Parser = createActorName_5005Parser();
		}
		return actorName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActorName_5005Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser agentName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getAgentName_5010Parser() {
		if (agentName_5010Parser == null) {
			agentName_5010Parser = createAgentName_5010Parser();
		}
		return agentName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAgentName_5010Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser positionName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getPositionName_5015Parser() {
		if (positionName_5015Parser == null) {
			positionName_5015Parser = createPositionName_5015Parser();
		}
		return positionName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPositionName_5015Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5020Parser() {
		if (roleName_5020Parser == null) {
			roleName_5020Parser = createRoleName_5020Parser();
		}
		return roleName_5020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleName_5020Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_5021Parser() {
		if (goalName_5021Parser == null) {
			goalName_5021Parser = createGoalName_5021Parser();
		}
		return goalName_5021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_5021Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_5022Parser() {
		if (softgoalName_5022Parser == null) {
			softgoalName_5022Parser = createSoftgoalName_5022Parser();
		}
		return softgoalName_5022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_5022Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5023Parser() {
		if (taskName_5023Parser == null) {
			taskName_5023Parser = createTaskName_5023Parser();
		}
		return taskName_5023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_5023Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_5024Parser() {
		if (resourceName_5024Parser == null) {
			resourceName_5024Parser = createResourceName_5024Parser();
		}
		return resourceName_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_5024Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_5001Parser() {
		if (goalName_5001Parser == null) {
			goalName_5001Parser = createGoalName_5001Parser();
		}
		return goalName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_5001Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_5002Parser() {
		if (softgoalName_5002Parser == null) {
			softgoalName_5002Parser = createSoftgoalName_5002Parser();
		}
		return softgoalName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_5002Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_5003Parser() {
		if (resourceName_5003Parser == null) {
			resourceName_5003Parser = createResourceName_5003Parser();
		}
		return resourceName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_5003Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5004Parser() {
		if (taskName_5004Parser == null) {
			taskName_5004Parser = createTaskName_5004Parser();
		}
		return taskName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_5004Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_5006Parser() {
		if (goalName_5006Parser == null) {
			goalName_5006Parser = createGoalName_5006Parser();
		}
		return goalName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_5006Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_5007Parser() {
		if (softgoalName_5007Parser == null) {
			softgoalName_5007Parser = createSoftgoalName_5007Parser();
		}
		return softgoalName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_5007Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_5008Parser() {
		if (resourceName_5008Parser == null) {
			resourceName_5008Parser = createResourceName_5008Parser();
		}
		return resourceName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_5008Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5009Parser() {
		if (taskName_5009Parser == null) {
			taskName_5009Parser = createTaskName_5009Parser();
		}
		return taskName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_5009Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_5011Parser() {
		if (goalName_5011Parser == null) {
			goalName_5011Parser = createGoalName_5011Parser();
		}
		return goalName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_5011Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_5012Parser() {
		if (softgoalName_5012Parser == null) {
			softgoalName_5012Parser = createSoftgoalName_5012Parser();
		}
		return softgoalName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_5012Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_5013Parser() {
		if (resourceName_5013Parser == null) {
			resourceName_5013Parser = createResourceName_5013Parser();
		}
		return resourceName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_5013Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5014Parser() {
		if (taskName_5014Parser == null) {
			taskName_5014Parser = createTaskName_5014Parser();
		}
		return taskName_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_5014Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_5016Parser() {
		if (goalName_5016Parser == null) {
			goalName_5016Parser = createGoalName_5016Parser();
		}
		return goalName_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGoalName_5016Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_5017Parser() {
		if (softgoalName_5017Parser == null) {
			softgoalName_5017Parser = createSoftgoalName_5017Parser();
		}
		return softgoalName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftgoalName_5017Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_5018Parser() {
		if (resourceName_5018Parser == null) {
			resourceName_5018Parser = createResourceName_5018Parser();
		}
		return resourceName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createResourceName_5018Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
		edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5019Parser() {
		if (taskName_5019Parser == null) {
			taskName_5019Parser = createTaskName_5019Parser();
		}
		return taskName_5019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_5019Parser() {
		EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention_Name(), };
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
			return getActorName_5005Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID:
			return getAgentName_5010Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID:
			return getPositionName_5015Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_5020Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
			return getGoalName_5021Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
			return getSoftgoalName_5022Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
			return getTaskName_5023Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return getResourceName_5024Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
			return getGoalName_5001Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
			return getSoftgoalName_5002Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
			return getResourceName_5003Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID:
			return getTaskName_5004Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID:
			return getGoalName_5006Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID:
			return getSoftgoalName_5007Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID:
			return getResourceName_5008Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID:
			return getTaskName_5009Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID:
			return getGoalName_5011Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID:
			return getSoftgoalName_5012Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID:
			return getResourceName_5013Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID:
			return getTaskName_5014Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID:
			return getGoalName_5016Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID:
			return getSoftgoalName_5017Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID:
			return getResourceName_5018Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID:
			return getTaskName_5019Parser();
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
