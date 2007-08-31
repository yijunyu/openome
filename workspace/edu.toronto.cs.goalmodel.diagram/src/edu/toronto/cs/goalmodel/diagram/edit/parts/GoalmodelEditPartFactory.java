package edu.toronto.cs.goalmodel.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

/**
 * @generated
 */
public class GoalmodelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GoalmodelVisualIDRegistry.getVisualID(view)) {

			case ModelEditPart.VISUAL_ID:
				return new ModelEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case AgentEditPart.VISUAL_ID:
				return new AgentEditPart(view);

			case AgentNameEditPart.VISUAL_ID:
				return new AgentNameEditPart(view);

			case PositionEditPart.VISUAL_ID:
				return new PositionEditPart(view);

			case PositionNameEditPart.VISUAL_ID:
				return new PositionNameEditPart(view);

			case RoleEditPart.VISUAL_ID:
				return new RoleEditPart(view);

			case RoleNameEditPart.VISUAL_ID:
				return new RoleNameEditPart(view);

			case AspectEditPart.VISUAL_ID:
				return new AspectEditPart(view);

			case AspectNameEditPart.VISUAL_ID:
				return new AspectNameEditPart(view);

			case GoalEditPart.VISUAL_ID:
				return new GoalEditPart(view);

			case GoalNameEditPart.VISUAL_ID:
				return new GoalNameEditPart(view);

			case SoftgoalEditPart.VISUAL_ID:
				return new SoftgoalEditPart(view);

			case SoftgoalNameEditPart.VISUAL_ID:
				return new SoftgoalNameEditPart(view);

			case TaskEditPart.VISUAL_ID:
				return new TaskEditPart(view);

			case TaskNameEditPart.VISUAL_ID:
				return new TaskNameEditPart(view);

			case ResourceEditPart.VISUAL_ID:
				return new ResourceEditPart(view);

			case ResourceNameEditPart.VISUAL_ID:
				return new ResourceNameEditPart(view);

			case Goal2EditPart.VISUAL_ID:
				return new Goal2EditPart(view);

			case GoalName2EditPart.VISUAL_ID:
				return new GoalName2EditPart(view);

			case Softgoal2EditPart.VISUAL_ID:
				return new Softgoal2EditPart(view);

			case SoftgoalName2EditPart.VISUAL_ID:
				return new SoftgoalName2EditPart(view);

			case Resource2EditPart.VISUAL_ID:
				return new Resource2EditPart(view);

			case ResourceName2EditPart.VISUAL_ID:
				return new ResourceName2EditPart(view);

			case Task2EditPart.VISUAL_ID:
				return new Task2EditPart(view);

			case TaskName2EditPart.VISUAL_ID:
				return new TaskName2EditPart(view);

			case Goal3EditPart.VISUAL_ID:
				return new Goal3EditPart(view);

			case GoalName3EditPart.VISUAL_ID:
				return new GoalName3EditPart(view);

			case Softgoal3EditPart.VISUAL_ID:
				return new Softgoal3EditPart(view);

			case SoftgoalName3EditPart.VISUAL_ID:
				return new SoftgoalName3EditPart(view);

			case Resource3EditPart.VISUAL_ID:
				return new Resource3EditPart(view);

			case ResourceName3EditPart.VISUAL_ID:
				return new ResourceName3EditPart(view);

			case Task3EditPart.VISUAL_ID:
				return new Task3EditPart(view);

			case TaskName3EditPart.VISUAL_ID:
				return new TaskName3EditPart(view);

			case Goal4EditPart.VISUAL_ID:
				return new Goal4EditPart(view);

			case GoalName4EditPart.VISUAL_ID:
				return new GoalName4EditPart(view);

			case Softgoal4EditPart.VISUAL_ID:
				return new Softgoal4EditPart(view);

			case SoftgoalName4EditPart.VISUAL_ID:
				return new SoftgoalName4EditPart(view);

			case Resource4EditPart.VISUAL_ID:
				return new Resource4EditPart(view);

			case ResourceName4EditPart.VISUAL_ID:
				return new ResourceName4EditPart(view);

			case Task4EditPart.VISUAL_ID:
				return new Task4EditPart(view);

			case TaskName4EditPart.VISUAL_ID:
				return new TaskName4EditPart(view);

			case Goal5EditPart.VISUAL_ID:
				return new Goal5EditPart(view);

			case GoalName5EditPart.VISUAL_ID:
				return new GoalName5EditPart(view);

			case Softgoal5EditPart.VISUAL_ID:
				return new Softgoal5EditPart(view);

			case SoftgoalName5EditPart.VISUAL_ID:
				return new SoftgoalName5EditPart(view);

			case Resource5EditPart.VISUAL_ID:
				return new Resource5EditPart(view);

			case ResourceName5EditPart.VISUAL_ID:
				return new ResourceName5EditPart(view);

			case Task5EditPart.VISUAL_ID:
				return new Task5EditPart(view);

			case TaskName5EditPart.VISUAL_ID:
				return new TaskName5EditPart(view);

			case Goal6EditPart.VISUAL_ID:
				return new Goal6EditPart(view);

			case GoalName6EditPart.VISUAL_ID:
				return new GoalName6EditPart(view);

			case Softgoal6EditPart.VISUAL_ID:
				return new Softgoal6EditPart(view);

			case SoftgoalName6EditPart.VISUAL_ID:
				return new SoftgoalName6EditPart(view);

			case Resource6EditPart.VISUAL_ID:
				return new Resource6EditPart(view);

			case ResourceName6EditPart.VISUAL_ID:
				return new ResourceName6EditPart(view);

			case Task6EditPart.VISUAL_ID:
				return new Task6EditPart(view);

			case TaskName6EditPart.VISUAL_ID:
				return new TaskName6EditPart(view);

			case ActorActorCompartmentEditPart.VISUAL_ID:
				return new ActorActorCompartmentEditPart(view);

			case AgentAgentCompartmentEditPart.VISUAL_ID:
				return new AgentAgentCompartmentEditPart(view);

			case PositionPositionCompartmentEditPart.VISUAL_ID:
				return new PositionPositionCompartmentEditPart(view);

			case RoleRoleCompartmentEditPart.VISUAL_ID:
				return new RoleRoleCompartmentEditPart(view);

			case AspectAspectCompartmentEditPart.VISUAL_ID:
				return new AspectAspectCompartmentEditPart(view);

			case DependencyEditPart.VISUAL_ID:
				return new DependencyEditPart(view);

			case DependencyLabelEditPart.VISUAL_ID:
				return new DependencyLabelEditPart(view);

			case AndDecompositionEditPart.VISUAL_ID:
				return new AndDecompositionEditPart(view);

			case WrapLabelEditPart.VISUAL_ID:
				return new WrapLabelEditPart(view);

			case OrDecompositionEditPart.VISUAL_ID:
				return new OrDecompositionEditPart(view);

			case WrapLabel2EditPart.VISUAL_ID:
				return new WrapLabel2EditPart(view);

			case MakeContributionEditPart.VISUAL_ID:
				return new MakeContributionEditPart(view);

			case WrapLabel3EditPart.VISUAL_ID:
				return new WrapLabel3EditPart(view);

			case HelpContributionEditPart.VISUAL_ID:
				return new HelpContributionEditPart(view);

			case WrapLabel4EditPart.VISUAL_ID:
				return new WrapLabel4EditPart(view);

			case HurtContributionEditPart.VISUAL_ID:
				return new HurtContributionEditPart(view);

			case WrapLabel5EditPart.VISUAL_ID:
				return new WrapLabel5EditPart(view);

			case BreakContributionEditPart.VISUAL_ID:
				return new BreakContributionEditPart(view);

			case WrapLabel6EditPart.VISUAL_ID:
				return new WrapLabel6EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrapLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrapLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapped()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}

	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
