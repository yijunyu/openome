package edu.toronto.cs.goalmodel.diagram.navigator;

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
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramAndLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramBreakLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramHelpLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramHurtLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramMakeLabelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DiagramOrLabelEditPart;
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

import edu.toronto.cs.goalmodel.diagram.part.GoalmodelDiagramEditorPlugin;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

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
public class GoalmodelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GoalmodelDiagramEditorPlugin.getInstance().getImageRegistry().put(
				"Navigator?InvalidElement",
				ImageDescriptor.getMissingImageDescriptor());
		GoalmodelDiagramEditorPlugin.getInstance().getImageRegistry().put(
				"Navigator?UnknownElement",
				ImageDescriptor.getMissingImageDescriptor());
		GoalmodelDiagramEditorPlugin.getInstance().getImageRegistry().put(
				"Navigator?ImageNotFound",
				ImageDescriptor.getMissingImageDescriptor());
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
		case ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Actor",
					GoalmodelElementTypes.Actor_1001);
		case AgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Agent",
					GoalmodelElementTypes.Agent_1002);
		case PositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Position",
					GoalmodelElementTypes.Position_1003);
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Role",
					GoalmodelElementTypes.Role_1004);
		case AspectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Aspect",
					GoalmodelElementTypes.Aspect_1005);
		case Goal6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Goal",
					GoalmodelElementTypes.Goal_1006);
		case Softgoal6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Softgoal",
					GoalmodelElementTypes.Softgoal_1007);
		case Task6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Task",
					GoalmodelElementTypes.Task_1008);
		case Resource6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///edu/toronto/cs/goalmodel.ecore?Resource",
					GoalmodelElementTypes.Resource_1009);
		case GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal",
					GoalmodelElementTypes.Goal_2001);
		case SoftgoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal",
					GoalmodelElementTypes.Softgoal_2002);
		case ResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource",
					GoalmodelElementTypes.Resource_2003);
		case TaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task",
					GoalmodelElementTypes.Task_2004);
		case Goal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal",
					GoalmodelElementTypes.Goal_2005);
		case Softgoal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal",
					GoalmodelElementTypes.Softgoal_2006);
		case Resource2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource",
					GoalmodelElementTypes.Resource_2007);
		case Task2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task",
					GoalmodelElementTypes.Task_2008);
		case Goal3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal",
					GoalmodelElementTypes.Goal_2009);
		case Softgoal3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal",
					GoalmodelElementTypes.Softgoal_2010);
		case Resource3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource",
					GoalmodelElementTypes.Resource_2011);
		case Task3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task",
					GoalmodelElementTypes.Task_2012);
		case Goal4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal",
					GoalmodelElementTypes.Goal_2013);
		case Softgoal4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal",
					GoalmodelElementTypes.Softgoal_2014);
		case Resource4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource",
					GoalmodelElementTypes.Resource_2015);
		case Task4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task",
					GoalmodelElementTypes.Task_2016);
		case Goal5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Goal",
					GoalmodelElementTypes.Goal_2017);
		case Softgoal5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Softgoal",
					GoalmodelElementTypes.Softgoal_2018);
		case Resource5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Resource",
					GoalmodelElementTypes.Resource_2019);
		case Task5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///edu/toronto/cs/goalmodel.ecore?Task",
					GoalmodelElementTypes.Task_2020);
		case ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///edu/toronto/cs/goalmodel.ecore?Model",
					GoalmodelElementTypes.Model_79);
		case DependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?Dependency",
					GoalmodelElementTypes.Dependency_3001);
		case AndDecompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?AndDecomposition",
					GoalmodelElementTypes.AndDecomposition_3002);
		case OrDecompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?OrDecomposition",
					GoalmodelElementTypes.OrDecomposition_3003);
		case MakeContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?MakeContribution",
					GoalmodelElementTypes.MakeContribution_3004);
		case HelpContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?HelpContribution",
					GoalmodelElementTypes.HelpContribution_3005);
		case HurtContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?HurtContribution",
					GoalmodelElementTypes.HurtContribution_3006);
		case BreakContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///edu/toronto/cs/goalmodel.ecore?BreakContribution",
					GoalmodelElementTypes.BreakContribution_3007);
		default:
			return getImage("Navigator?UnknownElement", null);
		}
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
			image = imageRegistry.get("Navigator?ImageNotFound");
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
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {
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
		case Goal6EditPart.VISUAL_ID:
			return getGoal_1006Text(view);
		case Softgoal6EditPart.VISUAL_ID:
			return getSoftgoal_1007Text(view);
		case Task6EditPart.VISUAL_ID:
			return getTask_1008Text(view);
		case Resource6EditPart.VISUAL_ID:
			return getResource_1009Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001Text(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2002Text(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2003Text(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2004Text(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_2005Text(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2006Text(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_2007Text(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_2008Text(view);
		case Goal3EditPart.VISUAL_ID:
			return getGoal_2009Text(view);
		case Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2010Text(view);
		case Resource3EditPart.VISUAL_ID:
			return getResource_2011Text(view);
		case Task3EditPart.VISUAL_ID:
			return getTask_2012Text(view);
		case Goal4EditPart.VISUAL_ID:
			return getGoal_2013Text(view);
		case Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2014Text(view);
		case Resource4EditPart.VISUAL_ID:
			return getResource_2015Text(view);
		case Task4EditPart.VISUAL_ID:
			return getTask_2016Text(view);
		case Goal5EditPart.VISUAL_ID:
			return getGoal_2017Text(view);
		case Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2018Text(view);
		case Resource5EditPart.VISUAL_ID:
			return getResource_2019Text(view);
		case Task5EditPart.VISUAL_ID:
			return getTask_2020Text(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_79Text(view);
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
		default:
			return getUnknownElementText(view);
		}
	}

	/**
	 * @generated
	 */
	private String getActor_1001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(ActorNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Actor_1001;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getAgent_1002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(AgentNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Agent_1002;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4010);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPosition_1003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(PositionNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Position_1003;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4015);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getRole_1004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(RoleNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Role_1004;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4020);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getAspect_1005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(AspectNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Aspect_1005;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4025);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_1006Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(GoalName6EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Goal_1006;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4026);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_1007Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(SoftgoalName6EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Softgoal_1007;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4027);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getTask_1008Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(TaskName6EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Task_1008;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4028);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResource_1009Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(ResourceName6EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Resource_1009;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4029);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(GoalNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Goal_2001;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(SoftgoalNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Softgoal_2002;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResource_2003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(ResourceNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Resource_2003;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(TaskNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Task_2004;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(GoalName2EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Goal_2005;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2006Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(SoftgoalName2EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Softgoal_2006;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResource_2007Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(ResourceName2EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Resource_2007;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2008Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(TaskName2EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Task_2008;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2009Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(GoalName3EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Goal_2009;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2010Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(SoftgoalName3EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Softgoal_2010;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4012);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResource_2011Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(ResourceName3EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Resource_2011;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4013);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2012Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(TaskName3EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Task_2012;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4014);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2013Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(GoalName4EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Goal_2013;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4016);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2014Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(SoftgoalName4EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Softgoal_2014;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4017);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResource_2015Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(ResourceName4EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Resource_2015;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4018);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2016Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(TaskName4EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Task_2016;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4019);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2017Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(GoalName5EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Goal_2017;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4021);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2018Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(SoftgoalName5EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Softgoal_2018;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4022);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResource_2019Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(ResourceName5EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Resource_2019;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4023);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2020Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(TaskName5EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Task_2020;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4024);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getModel_79Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Model) domainModelElement).getName();
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 79);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDependency_3001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(DependencyLabelEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.Dependency_3001;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4030);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getAndDecomposition_3002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(DiagramAndLabelEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.AndDecomposition_3002;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4031);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOrDecomposition_3003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(DiagramOrLabelEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.OrDecomposition_3003;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4032);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getMakeContribution_3004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(DiagramMakeLabelEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.MakeContribution_3004;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4033);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getHelpContribution_3005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(DiagramHelpLabelEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.HelpContribution_3005;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4034);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getHurtContribution_3006Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(DiagramHurtLabelEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.HurtContribution_3006;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4035);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getBreakContribution_3007Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return GoalmodelVisualIDRegistry
									.getType(DiagramBreakLabelEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return GoalmodelElementTypes.BreakContribution_3007;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GoalmodelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4036);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">";
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
