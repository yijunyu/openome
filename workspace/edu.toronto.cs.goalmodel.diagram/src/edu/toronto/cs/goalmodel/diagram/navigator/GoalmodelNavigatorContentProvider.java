package edu.toronto.cs.goalmodel.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AndDecompositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectAspectCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.BreakContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.DependencyEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.HelpContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.HurtContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.MakeContributionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ModelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.OrDecompositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleRoleCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskEditPart;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

/**
 * @generated
 */
public class GoalmodelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	public void dispose() {
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) GMFEditingDomainFactory.INSTANCE
					.createEditingDomain();
			editingDomain.setResourceToReadOnlyMap(new HashMap() {
				public Object get(Object key) {
					if (!containsKey(key)) {
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
			ResourceSet resourceSet = editingDomain.getResourceSet();

			org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI
					.createPlatformResourceURI(file.getFullPath().toString(),
							true);
			Resource resource = resourceSet.getResource(fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(), ModelEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof GoalmodelNavigatorGroup) {
			GoalmodelNavigatorGroup group = (GoalmodelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof GoalmodelNavigatorItem) {
			GoalmodelNavigatorItem navigatorItem = (GoalmodelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {

		case ModelEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup links = new GoalmodelNavigatorGroup(
					"links", "icons/linksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(ActorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(AgentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(PositionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(RoleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(AspectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ActorEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(ActorActorCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ActorActorCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ActorActorCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ActorActorCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AgentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(AgentAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(AgentAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(AgentAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(AgentAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PositionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(PositionPositionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(PositionPositionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(PositionPositionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(PositionPositionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RoleEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(RoleRoleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(RoleRoleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(RoleRoleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(RoleRoleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AspectEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(AspectAspectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(AspectAspectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(AspectAspectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(AspectAspectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Goal6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Softgoal6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Task6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Resource6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GoalEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SoftgoalEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ResourceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TaskEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Goal2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Softgoal2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Resource2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Task2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Goal3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Softgoal3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Resource3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Task3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Goal4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Softgoal4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Resource4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Task4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Goal5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Softgoal5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Resource5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Task5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup outgoinglinks = new GoalmodelNavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup incominglinks = new GoalmodelNavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), GoalmodelVisualIDRegistry
							.getType(BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DependencyEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup source = new GoalmodelNavigatorGroup(
					"source", "icons/linkSourceNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup target = new GoalmodelNavigatorGroup(
					"target", "icons/linkTargetNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(Goal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case AndDecompositionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup source = new GoalmodelNavigatorGroup(
					"source", "icons/linkSourceNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup target = new GoalmodelNavigatorGroup(
					"target", "icons/linkTargetNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(Goal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case OrDecompositionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup source = new GoalmodelNavigatorGroup(
					"source", "icons/linkSourceNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup target = new GoalmodelNavigatorGroup(
					"target", "icons/linkTargetNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(Goal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case MakeContributionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup source = new GoalmodelNavigatorGroup(
					"source", "icons/linkSourceNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup target = new GoalmodelNavigatorGroup(
					"target", "icons/linkTargetNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(Goal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case HelpContributionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup source = new GoalmodelNavigatorGroup(
					"source", "icons/linkSourceNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup target = new GoalmodelNavigatorGroup(
					"target", "icons/linkTargetNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(Goal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case HurtContributionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup source = new GoalmodelNavigatorGroup(
					"source", "icons/linkSourceNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup target = new GoalmodelNavigatorGroup(
					"target", "icons/linkTargetNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(Goal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case BreakContributionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GoalmodelNavigatorGroup source = new GoalmodelNavigatorGroup(
					"source", "icons/linkSourceNavigatorGroup.gif",
					parentElement);
			GoalmodelNavigatorGroup target = new GoalmodelNavigatorGroup(
					"target", "icons/linkTargetNavigatorGroup.gif",
					parentElement);
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GoalmodelVisualIDRegistry
					.getType(Goal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry
							.getType(Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					GoalmodelVisualIDRegistry.getType(Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ModelEditPart.MODEL_ID.equals(GoalmodelVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new GoalmodelNavigatorItem((View) it.next(), parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof GoalmodelAbstractNavigatorItem) {
			GoalmodelAbstractNavigatorItem abstractNavigatorItem = (GoalmodelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
