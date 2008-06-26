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
public class DependencyEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 */
	public DependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.DependencyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.DependencyLabelEditPart) {
			((edu.toronto.cs.openome_model.diagram.edit.parts.DependencyLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDependencyLabelFigure());
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
		return new DependencyFigure();
	}

	/**
	 * @generated
	 */
	public DependencyFigure getPrimaryShape() {
		return (DependencyFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class DependencyFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrapLabel fFigureDependencyLabelFigure;

		/**
		 * @generated
		 */
		public DependencyFigure() {
			this.setLineWidth(2);

			createContents();
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDependencyLabelFigure = new WrapLabel();
			fFigureDependencyLabelFigure.setText("<...>");

			this.add(fFigureDependencyLabelFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			openome_model.figures.DepDecoration df = new openome_model.figures.DepDecoration();

			return df;
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			openome_model.figures.Dep2Decoration df = new openome_model.figures.Dep2Decoration();

			return df;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureDependencyLabelFigure() {
			this.setSmoothness(SMOOTH_NORMAL);
			return fFigureDependencyLabelFigure;
		}

	}

}
