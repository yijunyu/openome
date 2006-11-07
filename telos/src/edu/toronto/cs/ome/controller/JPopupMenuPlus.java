package edu.toronto.cs.ome.controller;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;

/**
  * This class is an extension of the JPopupMenu class which eliminates a bug
  * in JPopuMenu which caused the popup menu to be displayed slightly
  * offscreen, if activated too close to the edge of the screen. 
  *
  * @see <a href =
  * "http://www.java.sun.com/products/jdk/1.2/docs/api/javax/swing/JPopupMenu.html">JPopupMenu</a>
  */
public class JPopupMenuPlus extends JPopupMenu {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** @serial This is a serializable field. */
    private MouseEvent me;
        
    /**
      * Creates a JPopupMenuPlus with the specified title upon the occurence
      * of the specified <code>MouseEvent</code>.
      *
      * @param me the MouseEvent that triggered the creation of the popup menu
      * @param title the title of the popup menu
      */
    public JPopupMenuPlus(MouseEvent me, String title) {
	super(title);
	this.me = me;
    }
    
    
    /**
      * Creates a JPopupMenuPlus upon the occurence of the specified 
      * <code>MouseEvent</code>.
      *
      * @param me the MouseEvent that triggered the creation of the popup menu
      */
    public JPopupMenuPlus(MouseEvent me) {
	super();
	this.me = me;
    }

    
    /**
      * Opens up the PopupMenu at the correct point.
      */  
    public void openup() {
	double componentpointx =
	    me.getComponent().getLocationOnScreen().getX();
	double componentpointy =
	    me.getComponent().getLocationOnScreen().getY();
	Point p = new Point(), origin;
	p.x = ((int)(me.getX() + componentpointx));
	p.y = ((int)(me.getY() + componentpointy));

	// determine where to put menu
	origin = getPopupMenuOrigin(p);

	//convert back to relative coordinates
	origin.x = ((int)(origin.x - componentpointx));
	origin.y = ((int)(origin.y - componentpointy));
	show(me.getComponent(),origin.x,origin.y);		
    }

    
    /**
      * Performs an intelligent determination of the placement of the popup 
      * menu. If the popmenu is activated too close to the edge of the screen, 
      * the placement of the popup menu is adjusted in order to make sure the 
      * popup menu is completely displayed on screen.
      *
      * @param p the present origin of the popup menu as determined by the
      * JPopupMenu class.
      * @return a <code>Point</code> in the coordinate space of the menu 
      * instance which should be used as the origin of the JPopupMenu's popup 
      * menu.
      */
    protected Point getPopupMenuOrigin(Point p) {
	int x = 0;
	int y = 0;
	
	// Figure out the sizes needed to caclulate the menu position
	Dimension screensize =Toolkit.getDefaultToolkit().getScreenSize();
	Dimension menusize = getPreferredSize();
	if (p.x + menusize.width < screensize.width) {
	    x = p.x; // Prefer placement to the right
	} else {
	    // Otherwise place to the left
	    x = screensize.width-menusize.width;
	    // put also a small offset
	    x = x - 2;
	}	   
   
	// Then the y:
	if (p.y + menusize.height < screensize.height) {
	      y = p.y; // Prefer dropping down
	} else {
	      y = screensize.height-menusize.height; // o.w. drop `up'
	      // put also a small offset
	      y = y-2;
	}
	return new Point(x,y);
    }
}
