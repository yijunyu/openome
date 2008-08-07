package openome_model.figures;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.handles.ResizeHandle;
import org.eclipse.gef.tools.ResizeTracker;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;


/**
 * A subclass of {@link ResizableShapeEditPolicy} that allows only constrained
 * resizing (with regard to the aspect ratio). This class was originally written
 * for another GMF RCP called PART-E: http://sourceforge.net/projects/parte/
 * 
 * @author Elmar Weber
 * 
 */
public class ConstrainedResizeShapeEditPolicy extends ResizableShapeEditPolicy {
	private final GraphicalEditPart editPart;

	/**
	 * Constructs a new {@link ConstrainedResizeShapeEditPolicy} for the
	 * specified {@link GraphicalEditPart}.
	 * 
	 * @param editPart
	 *            the {@link GraphicalEditPart} this
	 *            {@link ConstrainedResizeShapeEditPolicy} is for.
	 */
	public ConstrainedResizeShapeEditPolicy(GraphicalEditPart editPart) {
		this.editPart = editPart;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected List createSelectionHandles() {
		List list = super.createSelectionHandles();

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object o = (Object) iterator.next();

			if (o instanceof ResizeHandle) {
				iterator.remove();
			}
		}

		list.add(createHandle(PositionConstants.NORTH_WEST));
		list.add(createHandle(PositionConstants.NORTH_EAST));
		list.add(createHandle(PositionConstants.SOUTH_WEST));
		list.add(createHandle(PositionConstants.SOUTH_EAST));

		return list;
	}

	private ResizeHandle createHandle(final int direction) {
		return new ResizeHandle(this.editPart, direction) {
			@Override
			protected DragTracker createDragTracker() {
				return new ResizeTracker(getOwner(), direction) {
					@Override
					public void mouseDrag(MouseEvent me, EditPartViewer viewer) {
						me.stateMask |= SWT.SHIFT;
						super.mouseDrag(me, viewer);
					}
				};
			}
		};
	}
}