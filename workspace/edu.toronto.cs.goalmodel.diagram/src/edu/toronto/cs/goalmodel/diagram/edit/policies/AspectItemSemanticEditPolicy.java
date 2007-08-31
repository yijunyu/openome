package edu.toronto.cs.goalmodel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectAspectCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Goal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Resource6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Softgoal6EditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.Task6EditPart;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

/**
 * @generated
 */
public class AspectItemSemanticEditPolicy extends
		GoalmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (GoalmodelVisualIDRegistry.getVisualID(node)) {
			case AspectAspectCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (GoalmodelVisualIDRegistry.getVisualID(cnode)) {
					case Goal6EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case Softgoal6EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case Resource6EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case Task6EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
	}

}