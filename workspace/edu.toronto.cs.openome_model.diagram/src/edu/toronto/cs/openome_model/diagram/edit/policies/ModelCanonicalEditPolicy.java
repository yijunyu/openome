package edu.toronto.cs.openome_model.diagram.edit.policies;

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
		for (Iterator it = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
				.getModel_79SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result
					.add(((edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor) it
							.next()).getModelElement());
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
		int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view);
		switch (visualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.AspectEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement())
					|| visualID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getNodeVisualID((View) getHost().getModel(), view
									.getElement());
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
			myFeaturesToSynchronize
					.add(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getModel_Containers());
			myFeaturesToSynchronize
					.add(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
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
			int diagramLinkVisualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(nextDiagramLink);
			for (Iterator LinkDescriptorsIterator = linkDescriptors.iterator(); LinkDescriptorsIterator
					.hasNext();) {
				edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor nextLinkDescriptor = (edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor) LinkDescriptorsIterator
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
		if (!edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getModel_79ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getActor_1001ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getAgent_1002ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getPosition_1003ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getRole_1004ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.AspectEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getAspect_1005ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getGoal_1006ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getSoftgoal_1007ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getTask_1008ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getResource_1009ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getGoal_2001ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getSoftgoal_2002ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getResource_2003ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getTask_2004ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getGoal_2005ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getSoftgoal_2006ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getResource_2007ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getTask_2008ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getGoal_2009ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getSoftgoal_2010ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getResource_2011ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getTask_2012ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getGoal_2013ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getSoftgoal_2014ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getResource_2015ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getTask_2016ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal6EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getGoal_2017ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal6EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getSoftgoal_2018ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource6EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getResource_2019ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task6EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getTask_2020ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getDependency_3001ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getAndDecomposition_3002ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getOrDecomposition_3003ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getMakeContribution_3004ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getHelpContribution_3005ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
							.getHurtContribution_3006ContainedLinks(view));
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
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
			final edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor nextLinkDescriptor = (edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor) linkDescriptorsIterator
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