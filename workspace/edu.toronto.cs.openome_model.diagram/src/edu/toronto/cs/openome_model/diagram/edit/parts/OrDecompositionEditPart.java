package edu.toronto.cs.openome_model.diagram.edit.parts;

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
			
			// determine if the link/connector is pointing to the same
			// container on both ends (in the case when the actor/container)
			// is collapsed
			ConnectionAnchor sourceAnchor = this.getSourceAnchor();
			ConnectionAnchor targetAnchor = this.getTargetAnchor();
			
			// if both ends are indeed pointing to same container, don't
			// draw the line/connector, and hide the decoration
			if ((sourceAnchor.equals(targetAnchor))) {
				this.getTargetDecoration().setVisible(false);
			} else {
				// else, draw the line/connector and the decoration
				super.outlineShape(g);
				this.getTargetDecoration().setVisible(true);
			}
			
		}

	}

}
