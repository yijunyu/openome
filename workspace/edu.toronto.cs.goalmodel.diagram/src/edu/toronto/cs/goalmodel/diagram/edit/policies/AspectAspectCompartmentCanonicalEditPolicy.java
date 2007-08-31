package edu.toronto.cs.goalmodel.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task6EditPart;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelDiagramUpdater;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelNodeDescriptor;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

/**
 * @generated
 */
public class AspectAspectCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

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
		for (Iterator it = GoalmodelDiagramUpdater
				.getAspectAspectCompartment_5005SemanticChildren(viewObject)
				.iterator(); it.hasNext();) {
			result.add(((GoalmodelNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = GoalmodelVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case Goal6EditPart.VISUAL_ID:
		case Softgoal6EditPart.VISUAL_ID:
		case Resource6EditPart.VISUAL_ID:
		case Task6EditPart.VISUAL_ID:
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
					.getContainer_Intentions());
		}
		return myFeaturesToSynchronize;
	}

}
