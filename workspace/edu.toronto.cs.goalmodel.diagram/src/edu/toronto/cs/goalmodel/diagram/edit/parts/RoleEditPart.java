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

import edu.toronto.cs.goalmodel.diagram.edit.policies.RoleItemSemanticEditPolicy;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;
import goalmodel.figures.RoleSVGFigure;

/**
 * @generated
 */
public class RoleEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1004;

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
	public RoleEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RoleItemSemanticEditPolicy());
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
		RoleFigure figure = new RoleFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RoleFigure getPrimaryShape() {
		return (RoleFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RoleNameEditPart) {
			((RoleNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureRoleNameFigure());
			return true;
		}
		if (childEditPart instanceof RoleRoleCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRoleBoundaryFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((RoleRoleCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof RoleRoleCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureRoleBoundaryFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((RoleRoleCompartmentEditPart) childEditPart)
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

		if (editPart instanceof RoleRoleCompartmentEditPart) {
			return getPrimaryShape().getFigureRoleBoundaryFigure();
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
				.getType(RoleNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class RoleFigure extends Ellipse {
		/**
		 * @generated
		 */
		public RoleFigure() {

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

			WrapLabel roleNameFigure0 = new WrapLabel();
			roleNameFigure0.setText("<...>");

			roleNameFigure0.setFont(RoleNameFigure_FONT);

			this.add(roleNameFigure0, BorderLayout.TOP);
			setFigureRoleNameFigure(roleNameFigure0);

			Ellipse roleBoundaryFigure0 = new Ellipse();
			roleBoundaryFigure0.setFill(true);
			roleBoundaryFigure0.setFillXOR(false);
			roleBoundaryFigure0.setOutline(true);
			roleBoundaryFigure0.setOutlineXOR(false);
			roleBoundaryFigure0.setLineWidth(3);
			roleBoundaryFigure0.setLineStyle(Graphics.LINE_DASHDOTDOT);
			roleBoundaryFigure0.setBackgroundColor(ROLEBOUNDARYFIGURE_BACK);

			this.add(roleBoundaryFigure0, BorderLayout.CENTER);
			setFigureRoleBoundaryFigure(roleBoundaryFigure0);
			roleBoundaryFigure0.setLayoutManager(new StackLayout());

			RoleSVGFigure roleSVGFigure1 = new RoleSVGFigure();

			roleBoundaryFigure0.add(roleSVGFigure1);

		}

		/**
		 * @generated
		 */
		private WrapLabel fRoleNameFigure;

		/**
		 * @generated
		 */
		public WrapLabel getFigureRoleNameFigure() {
			return fRoleNameFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureRoleNameFigure(WrapLabel fig) {
			fRoleNameFigure = fig;
		}

		/**
		 * @generated
		 */
		private Ellipse fRoleBoundaryFigure;

		/**
		 * @generated
		 */
		public Ellipse getFigureRoleBoundaryFigure() {
			return fRoleBoundaryFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureRoleBoundaryFigure(Ellipse fig) {
			fRoleBoundaryFigure = fig;
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
	static final Font RoleNameFigure_FONT = new Font(Display.getCurrent(),
			"Arial", 12, org.eclipse.swt.SWT.BOLD);

	/**
	 * @generated
	 */
	static final Color ROLEBOUNDARYFIGURE_BACK = new Color(null, 236, 236, 236);

}
