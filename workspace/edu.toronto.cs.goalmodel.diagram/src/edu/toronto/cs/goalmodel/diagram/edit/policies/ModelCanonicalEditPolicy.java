package edu.toronto.cs.goalmodel.diagram.edit.policies;

import java.util.List;
import java.util.Collection;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.emf.ecore.EObject;
import edu.toronto.cs.goalmodel.Contribution;
import edu.toronto.cs.goalmodel.Decomposition;
import edu.toronto.cs.goalmodel.Dependency;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Model;

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

import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.EditPart;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;

import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ModelCanonicalEditPolicy extends CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Model) modelObject).getContainers().iterator(); values
				.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = GoalmodelVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			switch (nodeVID) {
			case ActorEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AgentEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case PositionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case RoleEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AspectEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		for (Iterator values = ((Model) modelObject).getIntentions().iterator(); values
				.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = GoalmodelVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			switch (nodeVID) {
			case Goal6EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Softgoal6EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Task6EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Resource6EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return view.isSetElement() && view.getElement() != null
				&& view.getElement().eIsProxy();
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
	private Collection myLinkDescriptors = new LinkedList();

	/**
	 * @generated
	 */
	private Map myEObject2ViewMap = new HashMap();

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		try {
			collectAllLinks(getDiagram());
			Collection existingLinks = new LinkedList(getDiagram().getEdges());
			for (Iterator diagramLinks = existingLinks.iterator(); diagramLinks
					.hasNext();) {
				Edge nextDiagramLink = (Edge) diagramLinks.next();
				EObject diagramLinkObject = nextDiagramLink.getElement();
				EObject diagramLinkSrc = nextDiagramLink.getSource()
						.getElement();
				EObject diagramLinkDst = nextDiagramLink.getTarget()
						.getElement();
				int diagramLinkVisualID = GoalmodelVisualIDRegistry
						.getVisualID(nextDiagramLink);
				for (Iterator modelLinkDescriptors = myLinkDescriptors
						.iterator(); modelLinkDescriptors.hasNext();) {
					LinkDescriptor nextLinkDescriptor = (LinkDescriptor) modelLinkDescriptors
							.next();
					if (diagramLinkObject == nextLinkDescriptor
							.getLinkElement()
							&& diagramLinkSrc == nextLinkDescriptor.getSource()
							&& diagramLinkDst == nextLinkDescriptor
									.getDestination()
							&& diagramLinkVisualID == nextLinkDescriptor
									.getVisualID()) {
						diagramLinks.remove();
						modelLinkDescriptors.remove();
					}
				}
			}
			deleteViews(existingLinks.iterator());
			return createConnections(myLinkDescriptors);
		} finally {
			myLinkDescriptors.clear();
			myEObject2ViewMap.clear();
		}
	}

	/**
	 * @generated
	 */
	private void collectAllLinks(View view) {
		EObject modelElement = view.getElement();
		int diagramElementVisualID = GoalmodelVisualIDRegistry
				.getVisualID(view);
		switch (diagramElementVisualID) {
		case ActorEditPart.VISUAL_ID:
		case AgentEditPart.VISUAL_ID:
		case PositionEditPart.VISUAL_ID:
		case RoleEditPart.VISUAL_ID:
		case AspectEditPart.VISUAL_ID:
		case Goal6EditPart.VISUAL_ID:
		case Softgoal6EditPart.VISUAL_ID:
		case Task6EditPart.VISUAL_ID:
		case Resource6EditPart.VISUAL_ID:
		case GoalEditPart.VISUAL_ID:
		case SoftgoalEditPart.VISUAL_ID:
		case ResourceEditPart.VISUAL_ID:
		case TaskEditPart.VISUAL_ID:
		case Goal2EditPart.VISUAL_ID:
		case Softgoal2EditPart.VISUAL_ID:
		case Resource2EditPart.VISUAL_ID:
		case Task2EditPart.VISUAL_ID:
		case Goal3EditPart.VISUAL_ID:
		case Softgoal3EditPart.VISUAL_ID:
		case Resource3EditPart.VISUAL_ID:
		case Task3EditPart.VISUAL_ID:
		case Goal4EditPart.VISUAL_ID:
		case Softgoal4EditPart.VISUAL_ID:
		case Resource4EditPart.VISUAL_ID:
		case Task4EditPart.VISUAL_ID:
		case Goal5EditPart.VISUAL_ID:
		case Softgoal5EditPart.VISUAL_ID:
		case Resource5EditPart.VISUAL_ID:
		case Task5EditPart.VISUAL_ID:
		case ModelEditPart.VISUAL_ID: {
			myEObject2ViewMap.put(modelElement, view);
			storeLinks(modelElement, getDiagram());
		}
		default: {
		}
			for (Iterator children = view.getChildren().iterator(); children
					.hasNext();) {
				View childView = (View) children.next();
				collectAllLinks(childView);
			}
		}
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors) {
		if (linkDescriptors.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
				.hasNext();) {
			final LinkDescriptor nextLinkDescriptor = (LinkDescriptor) linkDescriptorsIterator
					.next();
			EditPart sourceEditPart = getEditPartFor(nextLinkDescriptor
					.getSource());
			EditPart targetEditPart = getEditPartFor(nextLinkDescriptor
					.getDestination());
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
	private EditPart getEditPartFor(EObject modelElement) {
		View view = (View) myEObject2ViewMap.get(modelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}

	/**
	 *@generated
	 */
	private void storeLinks(EObject container, Diagram diagram) {
		EClass containerMetaclass = container.eClass();
		storeFeatureModelFacetLinks(container, containerMetaclass, diagram);
		storeTypeModelFacetLinks(container, containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks(EObject container,
			EClass containerMetaclass) {
		storeTypeModelFacetLinks_Dependency_3001(container, containerMetaclass);
		storeTypeModelFacetLinks_AndDecomposition_3002(container,
				containerMetaclass);
		storeTypeModelFacetLinks_OrDecomposition_3003(container,
				containerMetaclass);
		storeTypeModelFacetLinks_MakeContribution_3004(container,
				containerMetaclass);
		storeTypeModelFacetLinks_HelpContribution_3005(container,
				containerMetaclass);
		storeTypeModelFacetLinks_HurtContribution_3006(container,
				containerMetaclass);
		storeTypeModelFacetLinks_BreakContribution_3007(container,
				containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_Dependency_3001(EObject container,
			EClass containerMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((Model) container).getDependencies()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = GoalmodelVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (DependencyEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Dependency) nextValue)
							.getDependencyFrom();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Dependency) nextValue)
								.getDependencyTo();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_AndDecomposition_3002(
			EObject container, EClass containerMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((Model) container).getDecompositions()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = GoalmodelVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (AndDecompositionEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Decomposition) nextValue)
							.getTarget();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Decomposition) nextValue)
								.getSource();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_OrDecomposition_3003(
			EObject container, EClass containerMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((Model) container).getDecompositions()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = GoalmodelVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (OrDecompositionEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Decomposition) nextValue)
							.getTarget();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Decomposition) nextValue)
								.getSource();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_MakeContribution_3004(
			EObject container, EClass containerMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((Model) container).getContributions()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = GoalmodelVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (MakeContributionEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Contribution) nextValue)
							.getTarget();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Contribution) nextValue)
								.getSource();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_HelpContribution_3005(
			EObject container, EClass containerMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((Model) container).getContributions()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = GoalmodelVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (HelpContributionEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Contribution) nextValue)
							.getTarget();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Contribution) nextValue)
								.getSource();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_HurtContribution_3006(
			EObject container, EClass containerMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((Model) container).getContributions()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = GoalmodelVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (HurtContributionEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Contribution) nextValue)
							.getTarget();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Contribution) nextValue)
								.getSource();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_BreakContribution_3007(
			EObject container, EClass containerMetaclass) {
		if (GoalmodelPackage.eINSTANCE.getModel().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((Model) container).getContributions()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = GoalmodelVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (BreakContributionEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Contribution) nextValue)
							.getTarget();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Contribution) nextValue)
								.getSource();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 *@generated
	 */
	private void storeFeatureModelFacetLinks(EObject container,
			EClass containerMetaclass, Diagram diagram) {

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
	private class LinkDescriptor {

		/**
		 * @generated
		 */
		private EObject mySource;

		/**
		 * @generated
		 */
		private EObject myDestination;

		/**
		 * @generated
		 */
		private EObject myLinkElement;

		/**
		 * @generated
		 */
		private int myVisualID;

		/**
		 * @generated
		 */
		private IAdaptable mySemanticAdapter;

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination,
				EObject linkElement, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = linkElement;
			mySemanticAdapter = new EObjectAdapter(linkElement);
		}

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination,
				IElementType elementType, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = null;
			final IElementType elementTypeCopy = elementType;
			mySemanticAdapter = new IAdaptable() {
				public Object getAdapter(Class adapter) {
					if (IElementType.class.equals(adapter)) {
						return elementTypeCopy;
					}
					return null;
				}
			};
		}

		/**
		 * @generated
		 */
		private LinkDescriptor(EObject source, EObject destination, int linkVID) {
			mySource = source;
			myDestination = destination;
			myVisualID = linkVID;
		}

		/**
		 * @generated
		 */
		protected EObject getSource() {
			return mySource;
		}

		/**
		 * @generated
		 */
		protected EObject getDestination() {
			return myDestination;
		}

		/**
		 * @generated
		 */
		protected EObject getLinkElement() {
			return myLinkElement;
		}

		/**
		 * @generated
		 */
		protected int getVisualID() {
			return myVisualID;
		}

		/**
		 * @generated
		 */
		protected IAdaptable getSemanticAdapter() {
			return mySemanticAdapter;
		}
	}

}
