package edu.toronto.cs.openome_model.diagram.edit.parts;

import openome_model.figures.ContainerSVGFigure;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ActorActorCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5001;

	/**
	 * @generated NOT
	 */
	int storedWidth = 450;

	/**
	 * @generated NOT
	 */
	int storedHeight = 450;

	/**
	 * @generated
	 */
	public ActorActorCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return edu.toronto.cs.openome_model.diagram.part.Messages.ActorActorCompartmentEditPart_title;
	}

	/**
	 * Refreshes the connections inside the shape compartment if the supplied
	 * event is for an element inserted or removed from the editpart.
	 * 
	 * @see #refreshConnections()
	 * @param event
	 *            a model server event.
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification event) {

		Object feature = event.getFeature();
		if (NotationPackage.eINSTANCE.getSize_Width().equals(feature)
				|| NotationPackage.eINSTANCE.getSize_Height().equals(feature)) {
			refreshConnections();
		} else if (NotationPackage.eINSTANCE.getDrawerStyle_Collapsed().equals(
				feature)) {
			boolean isCollapsed = ((Boolean) getStructuralFeatureValue(NotationPackage.eINSTANCE
					.getDrawerStyle_Collapsed())).booleanValue();

			// hide the intentions inside of the actor, as well as any
			// connections
			// that link to any intentions inside of the actor
			super.handleNotificationEvent(event);

			int collapsedWidth = ContainerSVGFigure.SIZE_OF_ACTOR_SYMBOL;
			int collapsedHeight = ContainerSVGFigure.SIZE_OF_ACTOR_SYMBOL;

			int xLocation = this.getFigure().getBounds().x;
			int yLocation = this.getFigure().getBounds().y;

			if (isCollapsed) {
				
				// store the original width and height of the figure
				// so we can use it in the future when restoring
				
				// the math.max is to store the width and height as 110 if the user
				// resizes the actor figure down to 100 pixels and then collapses..
				// when the user tries to expand the actor figure again, they won't
				// get the resize points if the figure is 100 pixels wide/tall
				storedWidth = Math.max(110, this.getFigure().getBounds().width);
				storedHeight = Math.max(110, this.getFigure().getBounds().height);


				Rectangle newBounds = new Rectangle(xLocation, yLocation,
						collapsedWidth, collapsedHeight);

				CompositeCommand compoudCommand = new CompositeCommand("collapse");

				ICommand changeThisBoundsCommand = new SetBoundsCommand(this
						.getEditingDomain(), "collapse", this.getParent(),
						newBounds);

				compoudCommand.add(changeThisBoundsCommand);

				// make it so
				try {
					compoudCommand.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					e.printStackTrace();
				}

			} else {

				// restore the width and height of the actor
				Rectangle newBounds = new Rectangle(xLocation, yLocation,
						storedWidth, storedHeight);

				CompositeCommand compoudCommand = new CompositeCommand(
						"collapse");

				ICommand changeThisBoundsCommand = new SetBoundsCommand(this
						.getEditingDomain(), "collapse", this.getParent(),
						newBounds);

				compoudCommand.add(changeThisBoundsCommand);

				// make it so
				try {
					compoudCommand.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					e.printStackTrace();
				}

			}
		} else {
			super.handleNotificationEvent(event);
			refreshConnections();
		}

		if (NotificationUtil.isElementAddedToSlot(event)
				|| NotificationUtil.isElementRemovedFromSlot(event)) {
			refreshConnections();
		}
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();

		// removes the annoying border line at the top of the compartment
		// this fix is for ticket #115
		result.setBorder(null);

		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.ActorActorCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.ActorActorCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

}
