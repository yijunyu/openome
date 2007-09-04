package edu.toronto.cs.goalmodel.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import edu.toronto.cs.goalmodel.Model;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentNameEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AndDecompositionEditPart;
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
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelDiagramEditorPlugin;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;
import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelParserProvider;

/**
 * @generated
 */
public class GoalmodelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GoalmodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GoalmodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GoalmodelNavigatorItem
				&& !isOwnView(((GoalmodelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GoalmodelNavigatorGroup) {
			GoalmodelNavigatorGroup group = (GoalmodelNavigatorGroup) element;
			return GoalmodelDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GoalmodelNavigatorItem) {
			GoalmodelNavigatorItem navigatorItem = (GoalmodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///edu/toronto/cs/goalmodel.ecore?Model", GoalmodelElementTypes.Model_79); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Actor", GoalmodelElementTypes.Actor_1001); //$NON-NLS-1$
		case AgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Agent", GoalmodelElementTypes.Agent_1002); //$NON-NLS-1$
		case PositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Position", GoalmodelElementTypes.Position_1003); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Role", GoalmodelElementTypes.Role_1004); //$NON-NLS-1$
		case AspectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Aspect", GoalmodelElementTypes.Aspect_1005); //$NON-NLS-1$
		case GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Goal", GoalmodelElementTypes.Goal_1006); //$NON-NLS-1$
		case SoftgoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Softgoal", GoalmodelElementTypes.Softgoal_1007); //$NON-NLS-1$
		case TaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Task", GoalmodelElementTypes.Task_1008); //$NON-NLS-1$
		case ResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Resource", GoalmodelElementTypes.Resource_1009); //$NON-NLS-1$
		case Goal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal", GoalmodelElementTypes.Goal_2001); //$NON-NLS-1$
		case Softgoal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal", GoalmodelElementTypes.Softgoal_2002); //$NON-NLS-1$
		case Resource2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource", GoalmodelElementTypes.Resource_2003); //$NON-NLS-1$
		case Task2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task", GoalmodelElementTypes.Task_2004); //$NON-NLS-1$
		case Goal3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal", GoalmodelElementTypes.Goal_2005); //$NON-NLS-1$
		case Softgoal3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal", GoalmodelElementTypes.Softgoal_2006); //$NON-NLS-1$
		case Resource3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource", GoalmodelElementTypes.Resource_2007); //$NON-NLS-1$
		case Task3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task", GoalmodelElementTypes.Task_2008); //$NON-NLS-1$
		case Goal4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal", GoalmodelElementTypes.Goal_2009); //$NON-NLS-1$
		case Softgoal4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal", GoalmodelElementTypes.Softgoal_2010); //$NON-NLS-1$
		case Resource4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource", GoalmodelElementTypes.Resource_2011); //$NON-NLS-1$
		case Task4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task", GoalmodelElementTypes.Task_2012); //$NON-NLS-1$
		case Goal5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal", GoalmodelElementTypes.Goal_2013); //$NON-NLS-1$
		case Softgoal5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal", GoalmodelElementTypes.Softgoal_2014); //$NON-NLS-1$
		case Resource5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource", GoalmodelElementTypes.Resource_2015); //$NON-NLS-1$
		case Task5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task", GoalmodelElementTypes.Task_2016); //$NON-NLS-1$
		case Goal6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal", GoalmodelElementTypes.Goal_2017); //$NON-NLS-1$
		case Softgoal6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal", GoalmodelElementTypes.Softgoal_2018); //$NON-NLS-1$
		case Resource6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource", GoalmodelElementTypes.Resource_2019); //$NON-NLS-1$
		case Task6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task", GoalmodelElementTypes.Task_2020); //$NON-NLS-1$
		case DependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?Dependency", GoalmodelElementTypes.Dependency_3001); //$NON-NLS-1$
		case AndDecompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?AndDecomposition", GoalmodelElementTypes.AndDecomposition_3002); //$NON-NLS-1$
		case OrDecompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?OrDecomposition", GoalmodelElementTypes.OrDecomposition_3003); //$NON-NLS-1$
		case MakeContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?MakeContribution", GoalmodelElementTypes.MakeContribution_3004); //$NON-NLS-1$
		case HelpContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?HelpContribution", GoalmodelElementTypes.HelpContribution_3005); //$NON-NLS-1$
		case HurtContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?HurtContribution", GoalmodelElementTypes.HurtContribution_3006); //$NON-NLS-1$
		case BreakContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?BreakContribution", GoalmodelElementTypes.BreakContribution_3007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GoalmodelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GoalmodelElementTypes.isKnownElementType(elementType)) {
			image = GoalmodelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GoalmodelNavigatorGroup) {
			GoalmodelNavigatorGroup group = (GoalmodelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GoalmodelNavigatorItem) {
			GoalmodelNavigatorItem navigatorItem = (GoalmodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_79Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_1001Text(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_1002Text(view);
		case PositionEditPart.VISUAL_ID:
			return getPosition_1003Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_1004Text(view);
		case AspectEditPart.VISUAL_ID:
			return getAspect_1005Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_1006Text(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_1007Text(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_1008Text(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_1009Text(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_2001Text(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2002Text(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_2003Text(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_2004Text(view);
		case Goal3EditPart.VISUAL_ID:
			return getGoal_2005Text(view);
		case Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2006Text(view);
		case Resource3EditPart.VISUAL_ID:
			return getResource_2007Text(view);
		case Task3EditPart.VISUAL_ID:
			return getTask_2008Text(view);
		case Goal4EditPart.VISUAL_ID:
			return getGoal_2009Text(view);
		case Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2010Text(view);
		case Resource4EditPart.VISUAL_ID:
			return getResource_2011Text(view);
		case Task4EditPart.VISUAL_ID:
			return getTask_2012Text(view);
		case Goal5EditPart.VISUAL_ID:
			return getGoal_2013Text(view);
		case Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2014Text(view);
		case Resource5EditPart.VISUAL_ID:
			return getResource_2015Text(view);
		case Task5EditPart.VISUAL_ID:
			return getTask_2016Text(view);
		case Goal6EditPart.VISUAL_ID:
			return getGoal_2017Text(view);
		case Softgoal6EditPart.VISUAL_ID:
			return getSoftgoal_2018Text(view);
		case Resource6EditPart.VISUAL_ID:
			return getResource_2019Text(view);
		case Task6EditPart.VISUAL_ID:
			return getTask_2020Text(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_3001Text(view);
		case AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_3002Text(view);
		case OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_3003Text(view);
		case MakeContributionEditPart.VISUAL_ID:
			return getMakeContribution_3004Text(view);
		case HelpContributionEditPart.VISUAL_ID:
			return getHelpContribution_3005Text(view);
		case HurtContributionEditPart.VISUAL_ID:
			return getHurtContribution_3006Text(view);
		case BreakContributionEditPart.VISUAL_ID:
			return getBreakContribution_3007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModel_79Text(View view) {
		Model domainModelElement = (Model) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 79); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_1001Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Actor_1001,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(ActorNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAgent_1002Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Agent_1002,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(AgentNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPosition_1003Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Position_1003,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(PositionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRole_1004Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Role_1004,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(RoleNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAspect_1005Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Aspect_1005,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(AspectNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_1006Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Goal_1006,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(GoalNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_1007Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Softgoal_1007,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(SoftgoalNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_1008Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Task_1008,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(TaskNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_1009Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Resource_1009,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(ResourceNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2001Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Goal_2001,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(GoalName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2002Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Softgoal_2002,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(SoftgoalName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2003Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Resource_2003,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(ResourceName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2004Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Task_2004,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(TaskName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2005Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Goal_2005,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(GoalName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2006Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Softgoal_2006,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(SoftgoalName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2007Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Resource_2007,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(ResourceName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2008Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Task_2008,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(TaskName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2009Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Goal_2009,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(GoalName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2010Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Softgoal_2010,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(SoftgoalName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2011Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Resource_2011,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(ResourceName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2012Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Task_2012,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(TaskName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2013Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Goal_2013,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(GoalName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2014Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Softgoal_2014,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(SoftgoalName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2015Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Resource_2015,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(ResourceName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2016Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Task_2016,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(TaskName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2017Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Goal_2017,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(GoalName6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2018Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Softgoal_2018,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(SoftgoalName6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2019Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Resource_2019,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(ResourceName6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2020Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Task_2020,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(TaskName6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDependency_3001Text(View view) {
		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.Dependency_3001,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry
						.getType(DependencyLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAndDecomposition_3002Text(View view) {

		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.AndDecomposition_3002,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(WrapLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOrDecomposition_3003Text(View view) {

		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.OrDecomposition_3003,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(WrapLabel2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMakeContribution_3004Text(View view) {

		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.MakeContribution_3004,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(WrapLabel3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getHelpContribution_3005Text(View view) {

		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.HelpContribution_3005,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(WrapLabel4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getHurtContribution_3006Text(View view) {

		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.HurtContribution_3006,
				(view.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(WrapLabel5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getBreakContribution_3007Text(View view) {

		IAdaptable hintAdapter = new GoalmodelParserProvider.HintAdapter(
				GoalmodelElementTypes.BreakContribution_3007, (view
						.getElement() != null ? view.getElement() : view),
				GoalmodelVisualIDRegistry.getType(WrapLabel6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ModelEditPart.MODEL_ID.equals(GoalmodelVisualIDRegistry
				.getModelID(view));
	}

}
