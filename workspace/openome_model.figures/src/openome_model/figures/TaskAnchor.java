package openome_model.figures;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Similar to a {@link org.eclipse.draw2d.ChopboxAnchor}, except this anchor is located on
 * the ellipse defined by the owners bounding box.
 * @author Alex Selkov
 * Created 31.08.2002 23:11:43
 */
public class TaskAnchor extends AbstractConnectionAnchor {

/**
 * @see org.eclipse.draw2d.AbstractConnectionAnchor#AbstractConnectionAnchor()
 */
public TaskAnchor() { }

private IFigure taskAnchorOwner;

/**
 * @see org.eclipse.draw2d.AbstractConnectionAnchor#AbstractConnectionAnchor(IFigure)
 */
public TaskAnchor(IFigure owner) {
	super(owner);
	taskAnchorOwner = owner;
}

/**
 * Returns a point on the ellipse (defined by the owner's bounding box) where the
 * connection should be anchored.
 * @see org.eclipse.draw2d.ConnectionAnchor#getLocation(Point)
 */
public Point getLocation(Point reference) {
	Rectangle r = Rectangle.SINGLETON;
	r.setBounds(getOwner().getBounds());
	r.translate(-1, -1);
	r.resize(1, 1);
	getOwner().translateToAbsolute(r);
	
	Point ref = r.getCenter().negate().translate(reference);
	
	if (ref.x == 0)
		return new Point(reference.x, (ref.y > 0) ? r.bottom() : r.y);
	if (ref.y == 0)
		return new Point((ref.x > 0) ? r.right() : r.x, reference.y);
	
	float dx = (ref.x > 0) ? 0.5f : -0.5f;
	float dy = (ref.y > 0) ? 0.5f : -0.5f;
	  
	// ref.x, ref.y, r.width, r.height != 0 => safe to proceed
	  
	float k = (float)(ref.y * r.width) / (ref.x * r.height);
	k = k * k;
	
	//////////////////////////////////////////////////////////////////////
	int translateX = (int)(r.width  * dx / Math.sqrt(1 + k));
	int translateY = (int)(r.height * dy / Math.sqrt(1 + 1 / k));
	
	
	int rWidth = r.width;
	int rHeight = r.height;
	
	double rt_x = ((double)translateX)/((double)rWidth);
	double rt_y = ((double)translateY)/((double)rHeight);

	/*
	 * Suppose the Task SVG image looks like this, where
	 * points A, B, C, D are labeled as such:
	 * 
	 *      A_________________________B
	 *      /                         \
	 *     /                           \
	 *   C/                             \D
	 *    \                             /
	 *     \                           /
	 *     E\_________________________/F
	 *   
	 */
	
		
	//System.out.println("translate: " + translateX + " " + translateY);
	//System.out.println("r: " + rWidth + " " + rHeight);
	//System.out.println("rt: " + rt_x + " " + rt_y);
	
	// The relative x positions of each point.
	// It is relative in the sense that these numbers
	// are true and apply properly no matter the size of the figure
	// so these hard coded numbers will still work even if the
	// figure was resized.
	
	//These harcoded numbers correspond to the SVG figure only
	double xPositionOfA = -0.30;
	double xPositionOfB = 0.28;
	double xPositionOfC = -0.5;
	double xPositionOfD = 0.5;
	
	// determine how far in we are on the corner areas.
	// the more 'in' we are, as in, the more closer we are to the left and right
	// edges of the figure, the *linearly* more we will be shifting up or down
	double rightXDiff = (rt_x - xPositionOfB) / (xPositionOfD - xPositionOfB);
	double leftXDiff =  (rt_x - xPositionOfA) / (xPositionOfA - xPositionOfC);
	
	// when we height shift the anchor point from a regular rectangle/square
	// this number is basically how 'steep' the height shift slope should be
	double heightShiftFactor = 1.6;
	
	// if we height shift too far, the anchor point is totally
	// screwed up.. this can happen because the svg figure we're using
	// has white space padding around the image, so if we height shift
	// too far, then we'll just return the anchor placement to be
	// at points C or D
	double rightHeightShiftThreshhold = 0.46;
	double leftHeightShiftThreshhold = -0.44;
	
	// points C and D. Point D needed a little adjustment
	// because that's the way the SVG image was drawn
	Point pointC = r.getLeft();
	Point pointD = r.getRight().translate(-r.width/60, 0);
	
	// a default rectangle/square anchor, that we'll be using for the
	// top and bottom parts, the left (C) and right (D) points,
	// and we'll be using it's points and shifting them up or down,
	// when we are on the corner areas
	ChopboxAnchor cbAnchor = new ChopboxAnchor(taskAnchorOwner);
	
	if ((rt_y < 0) && ((rt_x > xPositionOfA) && (rt_x < xPositionOfB))) {
		// top (points A - B)
		return cbAnchor.getLocation(reference);
	} else if ((rt_y > 0) && ((rt_x > xPositionOfA) && (rt_x < xPositionOfB))) {
		// bottom (points E - F)
		return cbAnchor.getLocation(reference);
	} else if ((rt_y > 0) && (rt_x > xPositionOfB) && (rt_x < xPositionOfD)) {
		// bottom right (points F - D)
		
		double heightShiftAmount = (rightXDiff * heightShiftFactor);
		
		// if we height shift too far, we'll simply just say 
		// the anchor should be at point D
		if (heightShiftAmount > rightHeightShiftThreshhold) {
			return pointD;
		}
		int heightShift = (int)(rightXDiff * heightShiftFactor * r.height);
		return cbAnchor.getLocation(reference).translate(0, -heightShift);
	} else if ((rt_y > 0) && (rt_x < xPositionOfA) && (rt_x > xPositionOfC)) {
		// bottom left (points C - E)
		
		double heightShiftAmount = (leftXDiff * heightShiftFactor);
		
		// if we height shift too far, we'll simply just say 
		// the anchor should be at point C
		if (heightShiftAmount < leftHeightShiftThreshhold) {
			return pointC;
		}
		
		int heightShift = (int)(leftXDiff * heightShiftFactor * r.height);
		return cbAnchor.getLocation(reference).translate(0, heightShift);
	} else if ((rt_y < 0) && (rt_x > xPositionOfB) && (rt_x < xPositionOfD)) {
		// top right (points B - D)

		double heightShiftAmount = (rightXDiff * heightShiftFactor);
		
		// if we height shift too far, we'll simply just say 
		// the anchor should be at point D
		if (heightShiftAmount > rightHeightShiftThreshhold) {
			return pointD;
		}
		
		int heightShift = (int)(rightXDiff * heightShiftFactor * r.height);
		return cbAnchor.getLocation(reference).translate(0, heightShift);
	} else if ((rt_y < 0) && (rt_x < xPositionOfA) && (rt_x > xPositionOfC)) {
		// top left (points C - A)

		double heightShiftAmount = (leftXDiff * heightShiftFactor);

		// if we height shift too far, we'll simply just say 
		// the anchor should be at point C
		if (heightShiftAmount < leftHeightShiftThreshhold) {
			return pointC;
		}
		
		int heightShift = (int)(leftXDiff * heightShiftFactor * r.height);
		return cbAnchor.getLocation(reference).translate(0, -heightShift);
	} else {
		return cbAnchor.getLocation(reference);
	}
	
	/////////////////////////////////////////////////////////////
	  
}
}
