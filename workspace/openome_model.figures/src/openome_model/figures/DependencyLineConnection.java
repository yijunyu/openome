package openome_model.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

public class DependencyLineConnection extends PolylineConnectionEx {
	
    private static final int stepLine = 6;
    private static final int stepLineMin = 4;
    
    // the size of the 'D' decoration
    // that will be located at the midpoint
    private static int sizeOfD = 10;
    
    /** Whether the connection is always straight or not */
    private boolean isAlwaysStraight = false;
    
    // Options for how the 'D' should look
    // only one (1) should be turned on
    private boolean fillArcWithBlack = true;
    private boolean fillArcWithWhite = false;
    private boolean fillArcWithTransparent = false;
	
	protected void outlineShape(Graphics g) {
		
		// ensure that there are no decorations on the ends
		this.setSourceDecoration(null);
		this.setTargetDecoration(null);
		
		// draw the normal connecting link/connector first
		super.outlineShape(g);
		
		// ensure that the line stays straight, without any curves or bends
		if (isAlwaysStraight) {
			straightenLine();
		}
		
		// determine the points of the two ends - the source and target
		Point sourcePoint = this.getPoints().getFirstPoint();
		Point targetPoint = this.getPoints().getLastPoint();
		
		int angle = (int)(calcAngle(targetPoint,sourcePoint));
		angle = angle - 90;
		angle = angle * -1;
		double lineAngle = angle+90;
		
		// next, get the midpoint of the link/connection
		PointList pl = this.getPoints();
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
		
		
		if (fillArcWithBlack) {
			
			// fill it in completely black
			completeFill(g, midPoint, sizeOfD, angle, line_Angle_Radians, 180);
			
		} else if (fillArcWithWhite) {
			
			// fill in the arc (with white) so that you don't see the link/connector line
			g.fillArc(midPoint.x-sizeOfD, midPoint.y-sizeOfD, sizeOfD*2, sizeOfD*2, angle, 180);
			
			// render the line
			g.drawLine(linePoint_One, linePoint_Two);
			
		} else if (fillArcWithTransparent) {
			
			// render the line
			g.drawLine(linePoint_One, linePoint_Two);
			
		}
	}
	
	/**
	 * Straigten the connector so that there are no bends or curves
	 */
	public void straightenLine() {
		if (this.getPoints().size() > 2) {
			this.removePoint(1);			
		}
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
