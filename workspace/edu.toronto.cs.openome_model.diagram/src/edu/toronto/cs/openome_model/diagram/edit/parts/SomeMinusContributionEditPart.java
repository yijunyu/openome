package edu.toronto.cs.openome_model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SomeMinusContributionEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4010;

	/**
	 * @generated
	 */
	public SomeMinusContributionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.SomeMinusContributionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart) {
			((edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSomeMinusContributionLabel());
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
		return new SomeMinusContributionFigure();
	}

	/**
	 * @generated
	 */
	public SomeMinusContributionFigure getPrimaryShape() {
		return (SomeMinusContributionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SomeMinusContributionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrapLabel fFigureSomeMinusContributionLabel;

		/**
		 * @generated
		 */
		public SomeMinusContributionFigure() {
			this.setLineWidth(2);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSomeMinusContributionLabel = new WrapLabel();
			fFigureSomeMinusContributionLabel.setText("-");

			this.add(fFigureSomeMinusContributionLabel);

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
		public WrapLabel getFigureSomeMinusContributionLabel() {
			return fFigureSomeMinusContributionLabel;
		}

	}

}
