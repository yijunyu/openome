package openome_model.figures;

import java.util.List;

import org.eclipse.draw2d.AbstractHintLayout;
import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class OpenOmeElementLayoutManager extends AbstractHintLayout
{
	/**
	 * Returns the minimum size required by the input container. This is the size of the 
	 * largest child of the container, as all other children fit into this size.
	 * 
	 * @see AbstractHintLayout#calculateMinimumSize(IFigure, int, int)
	 */
	protected Dimension calculateMinimumSize(IFigure figure, int wHint, int hHint) {
		if (wHint > -1)
			wHint = Math.max(0, wHint - figure.getInsets().getWidth());
		if (hHint > -1)
			hHint = Math.max(0, hHint - figure.getInsets().getHeight());
		Dimension d = new Dimension();
		List children = figure.getChildren();
		IFigure child;
		for (int i = 0; i < children.size(); i++) {
			child = (IFigure)children.get(i);
			if (!isObservingVisibility() || child.isVisible())
				d.union(child.getMinimumSize(wHint, hHint));
		}
		
		d.expand(figure.getInsets().getWidth(),
		         figure.getInsets().getHeight());
		d.union(getBorderPreferredSize(figure));
		layout(figure);
		return d;

	}

	/**
	 * Calculates and returns the preferred size of the given figure.  This is the union of 
	 * the preferred sizes of the widest and the tallest of all its children. 
	 * 
	 * @see AbstractLayout#calculatePreferredSize(IFigure, int, int)
	 */
	protected Dimension calculatePreferredSize(IFigure figure, int wHint, int hHint) {
		if (wHint > -1)
			wHint = Math.max(0, wHint - figure.getInsets().getWidth());
		if (hHint > -1)
			hHint = Math.max(0, hHint - figure.getInsets().getHeight());
		Dimension d = new Dimension();
		List children = figure.getChildren();
		IFigure child;
		for (int i = 0; i < children.size(); i++) {
			child = (IFigure)children.get(i);
			if (!isObservingVisibility() || child.isVisible())
				d.union(child.getPreferredSize(wHint, hHint));
		}
		
		d.expand(figure.getInsets().getWidth(),
		         figure.getInsets().getHeight());
		d.union(getBorderPreferredSize(figure));
		return d;
	}

	/**
	 * @see org.eclipse.draw2d.LayoutManager#layout(IFigure)
	 */
	public void layout(IFigure figure) {		
		
		Rectangle r = figure.getClientArea();
		List<IFigure> children = figure.getChildren();
		IFigure child;
		for (int i = 0; i < children.size(); i++) {
			child = (IFigure)children.get(i);
			
			// ensure that the wrapped text is center aligned when
			// they are pushed onto subsequent rows
			((WrappingLabel)child).setTextWrap(true);
			((WrappingLabel)child).setTextJustification(PositionConstants.CENTER);
			((WrappingLabel)child).setAlignment(PositionConstants.CENTER);
			
			// shrink the horizontal text bound by 20 units, so that
			// the text doesn't get a chance to 'bleed' onto the edge..
			// Instead, it gets word wrapped to a new row if it gets too
			// close to the edge
			child.setBounds(r.getCopy().shrink(20, 0));

			// adjust the height so that the text is vertically centered inside..
			// depending on how many rows the text has been wrapped to, adjust
			// the height by 6 units per row
			
			// edit: This was for Europa (Eclipse 3.3) and is no longer needed
			
			//adjustHeight((WrappingLabel)child);
			
		}
	}
	
	/**
	 * Adjust the height of the text so that it is vertically centered.
	 * @param child the wrap label that contains the text to adjust.
	 */
	private void adjustHeight(WrappingLabel child) {
		// deprecated function
		String textWrappedText = "";
		//String textWrappedText = ((WrappingLabel)child).getSubStringText();
		int numRows = numRowsInTextWrappedString(textWrappedText);
		int newXLocation = ((WrappingLabel)child).getLocation().x;
		int newYLocation = ((WrappingLabel)child).getLocation().y - ((numRows-1) * 6);
		
		Point p = new Point(newXLocation, newYLocation);
		((WrappingLabel)child).setLocation(p);
	}
	
	/**
	 * Count the number of rows in a string, by counting the number 
	 * of new line characters there are in the string.
	 * @param inputString the string the count the number of rows/new lines.
	 * @return the number of rows in the string.
	 */
	private int numRowsInTextWrappedString(String inputString) {
		String[] splitRows = inputString.split("\n");
		return splitRows.length;
	}
	
}
