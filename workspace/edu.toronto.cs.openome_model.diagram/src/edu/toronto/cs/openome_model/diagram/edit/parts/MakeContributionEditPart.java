package edu.toronto.cs.openome_model.diagram.edit.parts;

import java.util.List;

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
public class MakeContributionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

	/**
	 * @generated
	 */
	public MakeContributionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.MakeContributionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart) {
			((edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMakeContributionLabel());
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
		return new MakeContributionFigure();
	}

	/**
	 * @generated
	 */
	public MakeContributionFigure getPrimaryShape() {
		return (MakeContributionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class MakeContributionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMakeContributionLabel;

		/**
		 * @generated
		 */
		public MakeContributionFigure() {
			this.setLineWidth(2);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMakeContributionLabel = new WrappingLabel();
			fFigureMakeContributionLabel.setText("++");

			this.add(fFigureMakeContributionLabel);

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
		public WrappingLabel getFigureMakeContributionLabel() {
			return fFigureMakeContributionLabel;
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
				
				// search for the contribution text (wrapping label), and hide it 
				List listOfChildren = this.getChildren();
				for (int i = 0; i < listOfChildren.size(); i++) {
					Object currentChild = listOfChildren.get(i); 
					if (currentChild instanceof WrappingLabel) {
						((WrappingLabel)currentChild).setVisible(false);
					}
				}
				
			} else {
				// else, draw the line/connector and the decoration
				super.outlineShape(g);
				this.getTargetDecoration().setVisible(true);
				
				// search for the contribution text (wrapping label), and make it visible 
				List listOfChildren = this.getChildren();
				for (int i = 0; i < listOfChildren.size(); i++) {
					Object currentChild = listOfChildren.get(i); 
					if (currentChild instanceof WrappingLabel) {
						((WrappingLabel)currentChild).setVisible(true);
					}
				}	
			}
		}
	}
}
