package edu.toronto.cs.openome_model.diagram.navigator;

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

/**
 * @generated
 */
public class Openome_modelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
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
		if (element instanceof edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem
				&& !isOwnView(((edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup) {
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup group = (edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup) element;
			return edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem) {
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem navigatorItem = (edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem) element;
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
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///edu/toronto/cs/openome_model.ecore?Model", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Model_79); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Actor", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Agent", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Position", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Role", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.AspectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Aspect", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Aspect_1005); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Goal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1006); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Softgoal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1007); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Task", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1008); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/openome_model.ecore?Resource", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1009); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Goal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Softgoal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Resource", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Task", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Goal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Softgoal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Resource", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Task", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Goal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Softgoal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Resource", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Task", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Goal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Softgoal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Resource", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Task", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Goal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2017); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Softgoal", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2018); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Resource", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2019); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/openome_model.ecore?Task", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2020); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/openome_model.ecore?Dependency", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/openome_model.ecore?AndDecomposition", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/openome_model.ecore?OrDecomposition", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/openome_model.ecore?MakeContribution", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3004); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/openome_model.ecore?HelpContribution", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3005); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/openome_model.ecore?HurtContribution", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3006); //$NON-NLS-1$
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/openome_model.ecore?BreakContribution", edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.isKnownElementType(elementType)) {
			image = edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
					.getImage(elementType);
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
		if (element instanceof edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup) {
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup group = (edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem) {
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem navigatorItem = (edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem) element;
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
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_79Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_1001Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return getAgent_1002Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return getPosition_1003Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_1004Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AspectEditPart.VISUAL_ID:
			return getAspect_1005Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_1006Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_1007Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return getTask_1008Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_1009Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getGoal_2001Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2002Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_2003Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return getTask_2004Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return getGoal_2005Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2006Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return getResource_2007Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return getTask_2008Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return getGoal_2009Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2010Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return getResource_2011Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return getTask_2012Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return getGoal_2013Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2014Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return getResource_2015Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return getTask_2016Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal6EditPart.VISUAL_ID:
			return getGoal_2017Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal6EditPart.VISUAL_ID:
			return getSoftgoal_2018Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource6EditPart.VISUAL_ID:
			return getResource_2019Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task6EditPart.VISUAL_ID:
			return getTask_2020Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_3001Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_3002Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_3003Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			return getMakeContribution_3004Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			return getHelpContribution_3005Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			return getHurtContribution_3006Text(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			return getBreakContribution_3007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModel_79Text(View view) {
		edu.toronto.cs.openome_model.Model domainModelElement = (edu.toronto.cs.openome_model.Model) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"No domain element for view with visualID = " + 79); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_1001Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAgent_1002Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPosition_1003Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRole_1004Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAspect_1005Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Aspect_1005,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AspectNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_1006Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1006,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_1007Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1007,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_1008Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1008,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_1009Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1009,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2001Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2002Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2003Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2004Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2005Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2006Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2007Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2008Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2009Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2010Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2011Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2012Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2013Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2014Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2015Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2016Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGoal_2017Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2017,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2018Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2018,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getResource_2019Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2019,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTask_2020Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2020,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName6EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDependency_3001Text(View view) {
		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 4030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAndDecomposition_3002Text(View view) {

		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabelEditPart.VISUAL_ID));
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

		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel2EditPart.VISUAL_ID));
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

		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3004,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel3EditPart.VISUAL_ID));
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

		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3005,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel4EditPart.VISUAL_ID));
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

		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3006,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel5EditPart.VISUAL_ID));
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

		IAdaptable hintAdapter = new edu.toronto.cs.openome_model.diagram.providers.Openome_modelParserProvider.HintAdapter(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007,
				(view.getElement() != null ? view.getElement() : view),
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel6EditPart.VISUAL_ID));
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
		return edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getModelID(view));
	}

}