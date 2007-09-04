package edu.toronto.cs.goalmodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;

import edu.toronto.cs.goalmodel.diagram.edit.policies.OrDecompositionItemSemanticEditPolicy;
import goalmodel.figures.OrDecoration;

/**
 * @generated
 */
public class OrDecompositionEditPart extends ConnectionNodeEditPart {

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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OrDecompositionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrapLabel2EditPart) {
			((WrapLabel2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureOrLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
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
		private WrapLabel fFigureOrLabel;

		/**
		 * @generated
		 */
		public OrDecompositionFigure() {
			this.setLineWidth(2);

			createContents();
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureOrLabel = new WrapLabel();
			fFigureOrLabel.setText("OR");

			this.add(fFigureOrLabel);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			OrDecoration df = new OrDecoration();

			return df;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureOrLabel() {
			return fFigureOrLabel;
		}

	}

}
