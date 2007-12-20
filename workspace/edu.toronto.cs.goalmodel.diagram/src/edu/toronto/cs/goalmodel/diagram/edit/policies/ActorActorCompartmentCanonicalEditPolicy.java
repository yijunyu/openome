package edu.toronto.cs.goalmodel.diagram.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import edu.toronto.cs.goalmodel.Container;

import edu.toronto.cs.goalmodel.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.SoftgoalEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.TaskEditPart;

import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class ActorActorCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Container) modelObject).getIntentions()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = GoalmodelVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			switch (nodeVID) {
			case GoalEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case SoftgoalEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case ResourceEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case TaskEditPart.VISUAL_ID: {
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

}
