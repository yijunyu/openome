package edu.toronto.cs.goalmodel.diagram.edit.policies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AndDecompositionEditPart;
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
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource2EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource3EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource4EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource5EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleEditPart;
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
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelDiagramUpdater;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelLinkDescriptor;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelNodeDescriptor;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

/**
 * @generated
 */
public class ModelCanonicalEditPolicy extends CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = GoalmodelDiagramUpdater.getModel_79SemanticChildren(
				viewObject).iterator(); it.hasNext();) {
			result.add(((GoalmodelNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = GoalmodelVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ActorEditPart.VISUAL_ID:
		case AgentEditPart.VISUAL_ID:
		case PositionEditPart.VISUAL_ID:
		case RoleEditPart.VISUAL_ID:
		case AspectEditPart.VISUAL_ID:
		case GoalEditPart.VISUAL_ID:
		case SoftgoalEditPart.VISUAL_ID:
		case TaskEditPart.VISUAL_ID:
		case ResourceEditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement())
					|| visualID != GoalmodelVisualIDRegistry.getNodeVisualID(
							(View) getHost().getModel(), view.getElement());
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(GoalmodelPackage.eINSTANCE
					.getModel_Containers());
			myFeaturesToSynchronize.add(GoalmodelPackage.eINSTANCE
					.getModel_Intentions());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector,
			Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		Map domain2NotationMap = new HashMap();
		Collection linkDescriptors = collectAllLinks(getDiagram(),
				domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			int diagramLinkVisualID = GoalmodelVisualIDRegistry
					.getVisualID(nextDiagramLink);
			for (Iterator LinkDescriptorsIterator = linkDescriptors.iterator(); LinkDescriptorsIterator
					.hasNext();) {
				GoalmodelLinkDescriptor nextLinkDescriptor = (GoalmodelLinkDescriptor) LinkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					LinkDescriptorsIterator.remove();
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection collectAllLinks(View view, Map domain2NotationMap) {
		if (!ModelEditPart.MODEL_ID.equals(GoalmodelVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		switch (GoalmodelVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getModel_79ContainedLinks(view));
			break;
		}
		case ActorEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getActor_1001ContainedLinks(view));
			break;
		}
		case AgentEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getAgent_1002ContainedLinks(view));
			break;
		}
		case PositionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getPosition_1003ContainedLinks(view));
			break;
		}
		case RoleEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getRole_1004ContainedLinks(view));
			break;
		}
		case AspectEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getAspect_1005ContainedLinks(view));
			break;
		}
		case GoalEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getGoal_1006ContainedLinks(view));
			break;
		}
		case SoftgoalEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getSoftgoal_1007ContainedLinks(view));
			break;
		}
		case TaskEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getTask_1008ContainedLinks(view));
			break;
		}
		case ResourceEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getResource_1009ContainedLinks(view));
			break;
		}
		case Goal2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getGoal_2001ContainedLinks(view));
			break;
		}
		case Softgoal2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getSoftgoal_2002ContainedLinks(view));
			break;
		}
		case Resource2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getResource_2003ContainedLinks(view));
			break;
		}
		case Task2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getTask_2004ContainedLinks(view));
			break;
		}
		case Goal3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getGoal_2005ContainedLinks(view));
			break;
		}
		case Softgoal3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getSoftgoal_2006ContainedLinks(view));
			break;
		}
		case Resource3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getResource_2007ContainedLinks(view));
			break;
		}
		case Task3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getTask_2008ContainedLinks(view));
			break;
		}
		case Goal4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getGoal_2009ContainedLinks(view));
			break;
		}
		case Softgoal4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getSoftgoal_2010ContainedLinks(view));
			break;
		}
		case Resource4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getResource_2011ContainedLinks(view));
			break;
		}
		case Task4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getTask_2012ContainedLinks(view));
			break;
		}
		case Goal5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getGoal_2013ContainedLinks(view));
			break;
		}
		case Softgoal5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getSoftgoal_2014ContainedLinks(view));
			break;
		}
		case Resource5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getResource_2015ContainedLinks(view));
			break;
		}
		case Task5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getTask_2016ContainedLinks(view));
			break;
		}
		case Goal6EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getGoal_2017ContainedLinks(view));
			break;
		}
		case Softgoal6EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getSoftgoal_2018ContainedLinks(view));
			break;
		}
		case Resource6EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getResource_2019ContainedLinks(view));
			break;
		}
		case Task6EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getTask_2020ContainedLinks(view));
			break;
		}
		case DependencyEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getDependency_3001ContainedLinks(view));
			break;
		}
		case AndDecompositionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getAndDecomposition_3002ContainedLinks(view));
			break;
		}
		case OrDecompositionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getOrDecomposition_3003ContainedLinks(view));
			break;
		}
		case MakeContributionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getMakeContribution_3004ContainedLinks(view));
			break;
		}
		case HelpContributionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getHelpContribution_3005ContainedLinks(view));
			break;
		}
		case HurtContributionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getHurtContribution_3006ContainedLinks(view));
			break;
		}
		case BreakContributionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(GoalmodelDiagramUpdater
					.getBreakContribution_3007ContainedLinks(view));
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors,
			Map domain2NotationMap) {
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
				.hasNext();) {
			final GoalmodelLinkDescriptor nextLinkDescriptor = (GoalmodelLinkDescriptor) linkDescriptorsIterator
					.next();
			EditPart sourceEditPart = getEditPart(nextLinkDescriptor
					.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(nextLinkDescriptor
					.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(), null,
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Map domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}
}
