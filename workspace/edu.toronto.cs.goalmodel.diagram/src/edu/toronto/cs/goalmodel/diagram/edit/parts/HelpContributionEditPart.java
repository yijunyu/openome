package edu.toronto.cs.goalmodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;

import edu.toronto.cs.goalmodel.diagram.edit.policies.HelpContributionItemSemanticEditPolicy;
import goalmodel.figures.HelpDecoration;

/**
 * @generated
 */
public class HelpContributionEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

	/**
	 * @generated
	 */
	public HelpContributionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HelpContributionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrapLabel4EditPart) {
			((WrapLabel4EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureHelpLabel());
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
		return new HelpContributionFigure();
	}

	/**
	 * @generated
	 */
	public HelpContributionFigure getPrimaryShape() {
		return (HelpContributionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HelpContributionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrapLabel fFigureHelpLabel;

		/**
		 * @generated
		 */
		public HelpContributionFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASHDOTDOT);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureHelpLabel = new WrapLabel();
			fFigureHelpLabel.setText("+");

			this.add(fFigureHelpLabel);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			HelpDecoration df = new HelpDecoration();

			return df;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureHelpLabel() {
			return fFigureHelpLabel;
		}

	}

}
