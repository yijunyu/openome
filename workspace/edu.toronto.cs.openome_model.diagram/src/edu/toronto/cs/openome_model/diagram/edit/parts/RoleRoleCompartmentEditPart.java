package edu.toronto.cs.openome_model.diagram.edit.parts;

import java.util.List;

import openome_model.figures.ContainerSVGFigure;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
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
public class RoleRoleCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5004;
	
	/**
	 * The stored width of the role figure.
	 * This is used for restoring (expanding) the role
	 * figure when it's collapsed.
	 * @generated NOT
	 */
	int storedWidth = 450;

	/**
	 * The stored height of the role figure.
	 * This is used for restoring (expanding) the role
	 * figure when it's collapsed.
	 * @generated NOT
	 */
	int storedHeight = 450;

	/**
	 * @generated
	 */
	public RoleRoleCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return edu.toronto.cs.openome_model.diagram.part.Messages.RoleRoleCompartmentEditPart_title;
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


		// ensures that the scroll bars never show up
		this.getCompartmentFigure().getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
		this.getCompartmentFigure().getScrollPane().setHorizontalScrollBarVisibility(ScrollPane.NEVER);
		
		Object feature = event.getFeature();
		if (NotationPackage.eINSTANCE.getSize_Width().equals(feature)
				|| NotationPackage.eINSTANCE.getSize_Height().equals(feature)) {
			refreshConnections();
		} else if (NotationPackage.eINSTANCE.getDrawerStyle_Collapsed().equals(
				feature)) {
			boolean isCollapsed = ((Boolean) getStructuralFeatureValue(NotationPackage.eINSTANCE
					.getDrawerStyle_Collapsed())).booleanValue();

			// normally, we would call this method to hide the intentions
			// within the actor, but when you make the intentions not visible,
			// you also make the links/connects connected to the intention
			// not visible as well, which is what we don't want, so we'll
			// comment it out
			// super.handleNotificationEvent(event);
			
			int collapsedWidth = ContainerSVGFigure.SIZE_OF_ACTOR_SYMBOL;
			int collapsedHeight = ContainerSVGFigure.SIZE_OF_ACTOR_SYMBOL;

			int xLocation = this.getFigure().getBounds().x;
			int yLocation = this.getFigure().getBounds().y;

			if (isCollapsed) {
				
				// determine which type of intention it is, then redirect it's
				// anchor points to point to the actor instead
				List listOfChildren = this.getChildren();
				for (int i = 0; i < listOfChildren.size(); i++) {
					EditPart ep = (EditPart)(listOfChildren.get(i));
					
					// if it's a Goal intention:
					if (ep instanceof GoalEditPart) {
						((GoalEditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Goal2EditPart) {
						((Goal2EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Goal3EditPart) {
						((Goal3EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Goal4EditPart) {
						((Goal4EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Goal5EditPart) {
						((Goal5EditPart)(ep)).setIsCollapsed(true);
					}
					
					
					// if it's a Softgoal intention:
					if (ep instanceof SoftgoalEditPart) {
						((SoftgoalEditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Softgoal2EditPart) {
						((Softgoal2EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Softgoal3EditPart) {
						((Softgoal3EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Softgoal4EditPart) {
						((Softgoal4EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Softgoal5EditPart) {
						((Softgoal5EditPart)(ep)).setIsCollapsed(true);
					} 
					
					// if it's a Task intention:
					if (ep instanceof TaskEditPart) {
						((TaskEditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Task2EditPart) {
						((Task2EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Task3EditPart) {
						((Task3EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Task4EditPart) {
						((Task4EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Task5EditPart) {
						((Task5EditPart)(ep)).setIsCollapsed(true);
					} 
					
					// if it's a Resource intention
					if (ep instanceof ResourceEditPart) {
						((ResourceEditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Resource2EditPart) {
						((Resource2EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Resource3EditPart) {
						((Resource3EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Resource4EditPart) {
						((Resource4EditPart)(ep)).setIsCollapsed(true);
					} else if (ep instanceof Resource5EditPart) {
						((Resource5EditPart)(ep)).setIsCollapsed(true);
					} 
				}
				
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
				// if a diagram contains a collapsed actor, ensure that
				// we all of the contained intentions to be visible. Without
				// this call, the figure will expand but the intentions will not show
				super.handleNotificationEvent(event);
				
				// determine which type of intention it is, then redirect it's
				// anchor points from the actor symbol to point back at the intention			
				List listOfChildren = this.getChildren();
				for (int i = 0; i < listOfChildren.size(); i++) {
					EditPart ep = (EditPart)(listOfChildren.get(i));
					// if it's a Goal intention:
					if (ep instanceof GoalEditPart) {
						((GoalEditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Goal2EditPart) {
						((Goal2EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Goal3EditPart) {
						((Goal3EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Goal4EditPart) {
						((Goal4EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Goal5EditPart) {
						((Goal5EditPart)(ep)).setIsCollapsed(false);
					}
					
					
					// if it's a Softgoal intention:
					if (ep instanceof SoftgoalEditPart) {
						((SoftgoalEditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Softgoal2EditPart) {
						((Softgoal2EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Softgoal3EditPart) {
						((Softgoal3EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Softgoal4EditPart) {
						((Softgoal4EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Softgoal5EditPart) {
						((Softgoal5EditPart)(ep)).setIsCollapsed(false);
					} 
					
					// if it's a Task intention:
					if (ep instanceof TaskEditPart) {
						((TaskEditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Task2EditPart) {
						((Task2EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Task3EditPart) {
						((Task3EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Task4EditPart) {
						((Task4EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Task5EditPart) {
						((Task5EditPart)(ep)).setIsCollapsed(false);
					} 
					
					// if it's a Resource intention
					if (ep instanceof ResourceEditPart) {
						((ResourceEditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Resource2EditPart) {
						((Resource2EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Resource3EditPart) {
						((Resource3EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Resource4EditPart) {
						((Resource4EditPart)(ep)).setIsCollapsed(false);
					} else if (ep instanceof Resource5EditPart) {
						((Resource5EditPart)(ep)).setIsCollapsed(false);
					} 
				}
				
				
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
		
		// removes the scroll bars from the actor figure.. (ticket #114)
		// unfortunately, for some unknown reason, the vertical scrollbar is still visible
		result.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
		result.getScrollPane().setHorizontalScrollBarVisibility(ScrollPane.NEVER);
		
		result.setTitleVisibility(false);

		// removes the annoying border line at the top of the compartment
		// this fix is for ticket #115
		result.setBorder(null);

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
				new edu.toronto.cs.openome_model.diagram.edit.policies.RoleRoleCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.RoleRoleCompartmentCanonicalEditPolicy());
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
