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

import edu.toronto.cs.goalmodel.diagram.edit.policies.ActorItemSemanticEditPolicy;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;
import goalmodel.figures.ActorSVGFigure;

/**
 * @generated
 */
public class ActorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1001;

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
	public ActorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActorItemSemanticEditPolicy());
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
		ActorFigure figure = new ActorFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ActorFigure getPrimaryShape() {
		return (ActorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActorNameEditPart) {
			((ActorNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureActorNameFigure());
			return true;
		}
		if (childEditPart instanceof ActorActorCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureActorBoundaryFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ActorActorCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof ActorActorCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureActorBoundaryFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ActorActorCompartmentEditPart) childEditPart)
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

		if (editPart instanceof ActorActorCompartmentEditPart) {
			return getPrimaryShape().getFigureActorBoundaryFigure();
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
				.getType(ActorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ActorFigure extends Ellipse {
		/**
		 * @generated
		 */
		public ActorFigure() {

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

			Ellipse actorBoundaryFigure0 = new Ellipse();
			actorBoundaryFigure0.setFill(true);
			actorBoundaryFigure0.setFillXOR(false);
			actorBoundaryFigure0.setOutline(true);
			actorBoundaryFigure0.setOutlineXOR(false);
			actorBoundaryFigure0.setLineWidth(3);
			actorBoundaryFigure0.setLineStyle(Graphics.LINE_DASHDOTDOT);
			actorBoundaryFigure0.setBackgroundColor(ACTORBOUNDARYFIGURE_BACK);

			this.add(actorBoundaryFigure0, BorderLayout.CENTER);
			setFigureActorBoundaryFigure(actorBoundaryFigure0);
			actorBoundaryFigure0.setLayoutManager(new StackLayout());

			ActorSVGFigure actorSVGFigure1 = new ActorSVGFigure();

			actorBoundaryFigure0.add(actorSVGFigure1);

			WrapLabel actorNameFigure0 = new WrapLabel();
			actorNameFigure0.setText("");

			actorNameFigure0.setFont(ActorNameFigure_FONT);

			this.add(actorNameFigure0, BorderLayout.TOP);
			setFigureActorNameFigure(actorNameFigure0);

		}

		/**
		 * @generated
		 */
		private Ellipse fActorBoundaryFigure;

		/**
		 * @generated
		 */
		public Ellipse getFigureActorBoundaryFigure() {
			return fActorBoundaryFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureActorBoundaryFigure(Ellipse fig) {
			fActorBoundaryFigure = fig;
		}

		/**
		 * @generated
		 */
		private WrapLabel fActorNameFigure;

		/**
		 * @generated
		 */
		public WrapLabel getFigureActorNameFigure() {
			return fActorNameFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureActorNameFigure(WrapLabel fig) {
			fActorNameFigure = fig;
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
	static final Color ACTORBOUNDARYFIGURE_BACK = new Color(null, 236, 236, 236);

	/**
	 * @generated
	 */
	static final Font ActorNameFigure_FONT = new Font(Display.getCurrent(),
			"Arial", 12, org.eclipse.swt.SWT.BOLD);

}
