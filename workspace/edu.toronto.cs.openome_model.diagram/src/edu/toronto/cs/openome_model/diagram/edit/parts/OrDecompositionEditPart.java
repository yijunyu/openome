package edu.toronto.cs.openome_model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
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
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.WrappingLabel3EditPart) {
			((edu.toronto.cs.openome_model.diagram.edit.parts.WrappingLabel3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureOrLabel());
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
		private WrappingLabel fFigureOrLabel;

		/**
		 * @generated
		 */
		public OrDecompositionFigure() {
			this.setLineWidth(2);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureOrLabel = new WrappingLabel();
			fFigureOrLabel.setText("OR");

			this.add(fFigureOrLabel);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			openome_model.figures.OrDecoration df = new openome_model.figures.OrDecoration();

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOrLabel() {
			return fFigureOrLabel;
		}

	}

}
