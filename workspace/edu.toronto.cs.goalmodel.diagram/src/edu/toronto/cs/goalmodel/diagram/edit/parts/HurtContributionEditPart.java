package edu.toronto.cs.goalmodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import edu.toronto.cs.goalmodel.diagram.edit.policies.HurtContributionItemSemanticEditPolicy;
import goalmodel.figures.HurtDecoration;

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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HurtContributionItemSemanticEditPolicy());
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
	public class HurtContributionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public HurtContributionFigure() {
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASHDOTDOT);

			this.setFont(HurtContributionFigure_FONT);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			HurtDecoration df = new HurtDecoration();

			return df;
		}

	}

	/**
	 * @generated
	 */
	static final Font HurtContributionFigure_FONT = new Font(Display
			.getCurrent(), "Courier New", 9, org.eclipse.swt.SWT.NORMAL);

}
