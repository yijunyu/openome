package edu.toronto.cs.openome_model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class HurtContributionEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

	/**
	 * @generated
	 */
	public HurtContributionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.HurtContributionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel5EditPart) {
			((edu.toronto.cs.openome_model.diagram.edit.parts.WrapLabel5EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureHurtLabel());
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
		return new HurtContributionFigure();
	}

	/**
	 * @generated
	 */
	public HurtContributionFigure getPrimaryShape() {
		return (HurtContributionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HurtContributionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrapLabel fFigureHurtLabel;

		/**
		 * @generated
		 */
		public HurtContributionFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASHDOTDOT);

			this.setFont(THIS_FONT);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureHurtLabel = new WrapLabel();
			fFigureHurtLabel.setText("-");

			this.add(fFigureHurtLabel);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			openome_model.figures.HurtDecoration df = new openome_model.figures.HurtDecoration();

			return df;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureHurtLabel() {
			return fFigureHurtLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font THIS_FONT = new Font(Display.getCurrent(), "Courier New",
			9, SWT.NORMAL);

}
