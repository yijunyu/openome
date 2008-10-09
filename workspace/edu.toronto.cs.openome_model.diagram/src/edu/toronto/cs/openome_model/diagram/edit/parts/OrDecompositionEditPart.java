package edu.toronto.cs.openome_model.diagram.edit.parts;

import openome_model.figures.GoalAnchor;
import openome_model.figures.ResourceAnchor;
import openome_model.figures.SoftgoalAnchor;
import openome_model.figures.TaskAnchor;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OrDecompositionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3003;

	/**
	 * @generated
	 */
	public OrDecompositionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.OrDecompositionItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new OrDecompositionFigure();
	}

	/**
	 * @generated
	 */
	public OrDecompositionFigure getPrimaryShape() {
		return (OrDecompositionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class OrDecompositionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public OrDecompositionFigure() {
			this.setLineWidth(2);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			openome_model.figures.OrDecoration df = new openome_model.figures.OrDecoration();

			return df;
		}
		
		/**
		 * @generated NOT
		 */
		public void outlineShape(Graphics g) {
			
			// determine whether or not we should draw the line (and decoration) or not..
			// in the case where the dependency link connects 2 elements within the same
			// container and the container is collapsed, we DO NOT draw the link
			
			ConnectionAnchor sourceAnchor = this.getSourceAnchor();
			ConnectionAnchor targetAnchor = this.getTargetAnchor();
			
			boolean goalAnchorInSameContainerAsTargetAnchor = ((sourceAnchor instanceof GoalAnchor)
					&& ((GoalAnchor)sourceAnchor).collapsedInSameContainerAs(targetAnchor));
			
			boolean softGoalAnchorInSameContainerAsTargetAnchor = ((sourceAnchor instanceof SoftgoalAnchor)
					&& ((SoftgoalAnchor)sourceAnchor).collapsedInSameContainerAs(targetAnchor));
			
			boolean TaskAnchorInSameContainerAsTargetAnchor = ((sourceAnchor instanceof TaskAnchor)
					&& ((TaskAnchor)sourceAnchor).collapsedInSameContainerAs(targetAnchor));
			
			boolean ResourceAnchorInSameContainerAsTargetAnchor = ((sourceAnchor instanceof ResourceAnchor)
					&& ((ResourceAnchor)sourceAnchor).collapsedInSameContainerAs(targetAnchor));
			
			
			
			if (goalAnchorInSameContainerAsTargetAnchor || softGoalAnchorInSameContainerAsTargetAnchor
					|| TaskAnchorInSameContainerAsTargetAnchor || ResourceAnchorInSameContainerAsTargetAnchor) {
				// if any of the checks were triggered (true), then that means that this link/connector
				// is connecting (any) 2 intentions within the same container, and the container
				// is collapsed.. so don't do anything (ie, dont' draw the link/connector)
			
				this.setVisible(false);
				this.getTargetDecoration().setVisible(false);
			} else {
				// else, draw the line/connector and the decoration
				super.outlineShape(g);
				this.setVisible(true);
				this.getTargetDecoration().setVisible(true);
			}
			
		}

	}

}
