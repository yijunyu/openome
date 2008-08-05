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
public class IsPartOfAssociationEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3016;

	/**
	 * @generated
	 */
	public IsPartOfAssociationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.IsPartOfAssociationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart) {
			((edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureIsPartOfAssociation());
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
		return new IsPartOfAssociationFigure();
	}

	/**
	 * @generated
	 */
	public IsPartOfAssociationFigure getPrimaryShape() {
		return (IsPartOfAssociationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class IsPartOfAssociationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureIsPartOfAssociation;

		/**
		 * @generated
		 */
		public IsPartOfAssociationFigure() {
			this.setLineWidth(2);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureIsPartOfAssociation = new WrappingLabel();
			fFigureIsPartOfAssociation.setText("Is part of");

			this.add(fFigureIsPartOfAssociation);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			openome_model.figures.ContributionDecoration df = new openome_model.figures.ContributionDecoration();

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureIsPartOfAssociation() {
			return fFigureIsPartOfAssociation;
		}

	}

}
