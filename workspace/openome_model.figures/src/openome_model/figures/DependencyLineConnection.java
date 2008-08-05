package openome_model.figures;

import java.util.ArrayList;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

public class DependencyLineConnection extends PolylineConnectionEx {
	
    private static final int stepLine = 6;
    
    // the maximum number of added bendpoints allowed
    private static final int MAX_NUM_BENDPOINTS = 2;
    
    /**The size of the 'D' decoration that will be located at the midpoint */
    private static int sizeOfD = 10;
    
    /** Whether the connection is always straight or not */
    private boolean isAlwaysStraight = false;
    
    // Options for how the 'D' should look
    // only one (1) should be turned on at once
    private boolean fill_D_WithBlack = true;
    private boolean fill_D_WithWhite = false;
    private boolean fill_D_WithTransparent = false;
	
    /** The width of the link/connector */
    private int lineWidth = 2;
    
	protected void outlineShape(Graphics g) {
		
		// draw the normal connecting link/connector first
		super.outlineShape(g);

		// ensures that the link/connectors have smooth curvature,
		// even if the view settings say otherwise
		this.setSmoothness(SMOOTH_NORMAL);
		
		/////////////////////////////////////
		// get rid of a point if we go over the limit
		// the -2 is for the two end points, which we shouldn't count
		// in the number of bendpoints we have..
		// we'll see if we really need this in the future or not
		
//		if (this.getPoints().size() -2 > MAX_NUM_BENDPOINTS) {
//			this.getPoints().removePoint(1);
//		}
		/////////////////////////////////////
		
		// set the line width
		this.setLineWidth(lineWidth);
		
		// ensure that there are no decorations on the ends
		this.setSourceDecoration(null);
		this.setTargetDecoration(null);
		
		// ensure that the line stays straight, without any curves or bends
		if (isAlwaysStraight) {
			straightenLine();
		}
		
		// determine the points of the two ends - the source and target
		Point sourcePoint = this.getPoints().getFirstPoint();
		Point targetPoint = this.getPoints().getLastPoint();
		
		// calculate the angle between the two points
		int angle = (int)(calcAngle(targetPoint,sourcePoint));
		angle = angle - 90;
		angle = angle * -1;
		double lineAngle = angle+90;
		
		// next, get the midpoint of the link/connection
		PointList pl = this.getPolygonPoints();
		Point midPoint = pl.getMidpoint();

		// ===============================================
		// PLAN A: load and draw an image at the midpoint
		// ===============================================
		
		//Image i = new Image(null, "/Users/db/Pictures/db/revolution-db2.bmp");
		//g.drawImage(i, midPoint);
		
		// -------------------
		// rotate accordingly..
		// -------------------
		
		// attempt to rotate.. this causes a very strange yet serious 
		// crash at the moment.. it's not a regular Java exception.. 
		// it's a bug that's currently being tracked by Eclipse right now. 
				
		//g.rotate(45);
	
		
		// ===========================================
		// PLAN B: draw the D using an arc and a line
		// ===========================================
		
		// ------------
		// draw the arc
		// ------------
		
		g.drawArc(midPoint.x-sizeOfD, midPoint.y-sizeOfD, sizeOfD*2, sizeOfD*2, angle, 180);
		
		// --------------
		// draw the line
		// --------------
		
		// convert the rotation angle from degrees to radians
		double line_Angle_Radians = this.degrees2Radians(lineAngle);

		Point linePoint_One = new Point((int)(midPoint.x+(Math.sin(line_Angle_Radians)*sizeOfD)), 
										(int)(midPoint.y+(Math.cos(line_Angle_Radians)*sizeOfD)));
		
		Point linePoint_Two = new Point((int)(midPoint.x-(Math.sin(line_Angle_Radians)*sizeOfD)), 
										(int)(midPoint.y-(Math.cos(line_Angle_Radians)*sizeOfD)));
		
		
		if (fill_D_WithBlack) {
			
			// fill it in completely black
			completeFill(g, midPoint, sizeOfD, angle, line_Angle_Radians, 180);
			
		} else if (fill_D_WithWhite) {
			
			// fill in the arc (with white) so that you don't see the link/connector line
			g.fillArc(midPoint.x-sizeOfD, midPoint.y-sizeOfD, sizeOfD*2, sizeOfD*2, angle, 180);
			
			// render the line
			g.drawLine(linePoint_One, linePoint_Two);
			
		} else if (fill_D_WithTransparent) {
			
			// render the line
			g.drawLine(linePoint_One, linePoint_Two);
			
		}
	}
	
	/**
	 * Straighten the connector so that there are no bends or curves
	 */
	private void straightenLine() {

		// straighten the line by simply redefining a brand new routing
		// constraint, that contains only the source and target points
		
		Point sourcePoint = this.getPoints().getFirstPoint();
		Point targetPoint = this.getPoints().getLastPoint();
		
		ArrayList<AbsoluteBendpoint> list = new ArrayList<AbsoluteBendpoint>();
		
		list.add(new AbsoluteBendpoint(sourcePoint));
		list.add(new AbsoluteBendpoint(targetPoint));
		this.setRoutingConstraint(list);

	}
	
	/**
	 * Completely fill in the arc with black, by drawing several inner arcs
	 * @param g
	 * @param midPoint
	 * @param sizeOfD_input
	 * @param angle
	 * @param lineAngle
	 * @param length
	 */
	private void completeFill(Graphics g, Point midPoint, int sizeOfD_input, int angle, double lineAngle, int length) {
		int sizeOfD = sizeOfD_input;
		
		// draw several inner arcs, to fill in the entire arc with black
		for (; sizeOfD > 0; sizeOfD--) {
			g.drawArc(midPoint.x-sizeOfD, midPoint.y-sizeOfD, sizeOfD*2, sizeOfD*2, angle, 180);
		}
	}
	
	public Rectangle getBounds() {
		Rectangle rect = super.getBounds();
		rect.union(rect.x - 3 * stepLine, rect.y - 3 * stepLine);
		rect.union(rect.x + rect.width + 3 * stepLine, rect.y + rect.height + 3
				* stepLine);
		return rect;
	}
	
	/**
	 * Calculate the angle (in degrees) between two points.
	 * Reference: http://www.uk-dave.com/bytes/java/angle_between_points.html
	 * @param p the first point
	 * @param q the second point
	 * @return the angle (in degrees) between point p and point q
	 */
	public static double calcAngle(Point p, Point q)
    {
		
		float x1 = p.x;
		float y1 = p.y;
		float x2 = q.x;
		float y2 = q.y;
		
        float dx = x2-x1;
        float dy = y2-y1;
        double angle=0.0d;
 
        // Calculate angle
        if (dx == 0.0)
        {
            if (dy == 0.0)
                angle = 0.0;
            else if (dy > 0.0)
                angle = Math.PI / 2.0;
            else
                angle = Math.PI * 3.0 / 2.0;
        }
        else if (dy == 0.0)
        {
            if  (dx > 0.0)
                angle = 0.0;
            else
                angle = Math.PI;
        }
        else
        {
            if  (dx < 0.0)
                angle = Math.atan(dy/dx) + Math.PI;
            else if (dy < 0.0)
                angle = Math.atan(dy/dx) + (2*Math.PI);
            else
                angle = Math.atan(dy/dx);
        }
 
        // Convert to degrees
        angle = angle * 180 / Math.PI;
 
        // Return
        return angle;
    }
	
	/**
	 * Convert an angle from degrees to radians.
	 * @param degrees the angle in degrees
	 * @return the angle in radians
	 */
	public static double degrees2Radians (double degrees)
    {
      double radians = (Math.PI / 180) * degrees;
      return (radians);
    }  


	
}
