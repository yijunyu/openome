package openome_model.figures;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class ActorAnchor extends AbstractConnectionAnchor {

/**
 * @see org.eclipse.draw2d.AbstractConnectionAnchor#AbstractConnectionAnchor()
 */
public ActorAnchor() { }

/**
 * @see org.eclipse.draw2d.AbstractConnectionAnchor#AbstractConnectionAnchor(IFigure)
 */
public ActorAnchor(IFigure owner) {
	super(owner);
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
	
	double dx = (ref.preciseX() > 0) ? 0.5d : -0.5d;
	double dy = (ref.preciseY() > 0) ? 0.5d : -0.5d;
	  
	// ref.x, ref.y, r.width, r.height != 0 => safe to proceed
	  
	double k = (ref.preciseY() * r.preciseWidth()) / (ref.preciseX() * r.preciseHeight());
	k = k * k;
	//////////////////////////////////////////////////////////////////////
	
	/*
	 * The way the Actor anchor works is:
	 * we know that the 'entire' actor figure contains
	 * the actor figure, and the actor bubble, so first, we find the centre
	 * point of the actor FIGURE, then, we use the ellipse anchor code to simply
	 * translate outwards from the that centre point. 
	 * 
	 * So in the end, the outline of the anchors
	 * is the same thing as the ellipe anchor, but the smaller and
	 * the centre point is located at the centre of the actor figure 
	 */
	
	// we will keep the x and y translation equally proportional, ie, even
	// if the 'entire' actor figure (figure + bubble) is resized to a non-perfect
	// square, the anchor outline will remain a perfect circle. To do this,
	// we calculate the min of the 'entire' figure's width of height, and
	// we use whichever one is smaller
	
	double minOfWidthAndHeight = Math.min(r.preciseWidth(), r.preciseHeight());
	double translateX = (minOfWidthAndHeight  * dx / Math.sqrt(1 + k));
	double translateY = (minOfWidthAndHeight * dy / Math.sqrt(1 + 1 / k));

	
	// this is approximately how tall (in pixels) the name of the actor
	// takes up.. we want this to be a constant number so that we can
	// just shift it down by that amount
	int heightOfActorName = 11;
	
	// when we draw the ellipse (or rather, perfect circle), this is the amount
	// to shrink it by
	double shrinkAmount = 3.55;

	// From the top left corner of the figure, we're going to shift right, and down,
	// by a certain amount, so that we can pinpoint the centre of the actor figure

	int shiftRightAmount = ((int)(r.preciseWidth()/6.8));
	int shiftDownAmount = ((int)(r.preciseHeight()/6.6));
	
	//shiftDownAmount = shiftDownAmount + heightOfActorName; // to compensate for the name of the actor

	// this is the centre point of the actor figure!
	Point centreOfActor = r.getTopLeft().translate(shiftRightAmount, shiftDownAmount);
	
	// now that we've located the centre point of the actor,
	// we will translate outwards from that point, to form a circle.
	// how much we translate by is defined by the variable 'shrinkAmount'
	int xTranslateFromActor = (int)(translateX / shrinkAmount);
	int yTranslateFromActor = (int)(translateY / shrinkAmount);
		
	return centreOfActor.translate(xTranslateFromActor, yTranslateFromActor);
	
}
}
