package edu.toronto.cs.goalmodel.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import edu.toronto.cs.goalmodel.diagram.edit.policies.PositionItemSemanticEditPolicy;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;
import goalmodel.figures.PositionSVGFigure;

/**
 * @generated
 */
public class PositionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1003;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PositionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PositionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		PositionFigure figure = new PositionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PositionFigure getPrimaryShape() {
		return (PositionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PositionNameEditPart) {
			((PositionNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigurePositionNameFigure());
			return true;
		}
		if (childEditPart instanceof PositionPositionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigurePositionBoundaryFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PositionPositionCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof PositionPositionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigurePositionBoundaryFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((PositionPositionCompartmentEditPart) childEditPart)
					.getFigure());
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
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		if (editPart instanceof PositionPositionCompartmentEditPart) {
			return getPrimaryShape().getFigurePositionBoundaryFigure();
		}
		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(40), getMapMode().DPtoLP(40));

		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(GoalmodelVisualIDRegistry
				.getType(PositionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PositionFigure extends Ellipse {
		/**
		 * @generated
		 */
		public PositionFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setFillXOR(false);
			this.setOutline(false);
			this.setOutlineXOR(false);
			this.setLineWidth(0);
			this.setLineStyle(Graphics.LINE_SOLID);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrapLabel positionNameFigure0 = new WrapLabel();
			positionNameFigure0.setText("<...>");

			positionNameFigure0.setFont(PositionNameFigure_FONT);

			this.add(positionNameFigure0, BorderLayout.TOP);
			setFigurePositionNameFigure(positionNameFigure0);

			Ellipse positionBoundaryFigure0 = new Ellipse();
			positionBoundaryFigure0.setFill(true);
			positionBoundaryFigure0.setFillXOR(false);
			positionBoundaryFigure0.setOutline(true);
			positionBoundaryFigure0.setOutlineXOR(false);
			positionBoundaryFigure0.setLineWidth(3);
			positionBoundaryFigure0.setLineStyle(Graphics.LINE_DASHDOTDOT);
			positionBoundaryFigure0
					.setBackgroundColor(POSITIONBOUNDARYFIGURE_BACK);

			this.add(positionBoundaryFigure0, BorderLayout.CENTER);
			setFigurePositionBoundaryFigure(positionBoundaryFigure0);
			positionBoundaryFigure0.setLayoutManager(new StackLayout());

			PositionSVGFigure positionSVGFigure1 = new PositionSVGFigure();

			positionBoundaryFigure0.add(positionSVGFigure1);

		}

		/**
		 * @generated
		 */
		private WrapLabel fPositionNameFigure;

		/**
		 * @generated
		 */
		public WrapLabel getFigurePositionNameFigure() {
			return fPositionNameFigure;
		}

		/**
		 * @generated
		 */
		private void setFigurePositionNameFigure(WrapLabel fig) {
			fPositionNameFigure = fig;
		}

		/**
		 * @generated
		 */
		private Ellipse fPositionBoundaryFigure;

		/**
		 * @generated
		 */
		public Ellipse getFigurePositionBoundaryFigure() {
			return fPositionBoundaryFigure;
		}

		/**
		 * @generated
		 */
		private void setFigurePositionBoundaryFigure(Ellipse fig) {
			fPositionBoundaryFigure = fig;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

	/**
	 * @generated
	 */
	static final Font PositionNameFigure_FONT = new Font(Display.getCurrent(),
			"Arial", 12, org.eclipse.swt.SWT.BOLD);

	/**
	 * @generated
	 */
	static final Color POSITIONBOUNDARYFIGURE_BACK = new Color(null, 236, 236,
			236);

}
