package edu.toronto.cs.ome.controller;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JMenu;
import javax.swing.JPopupMenu;

/* JMenuPlus - Provided by Sun Microsystems to clear bug in original JMenu. */
 
/** 
  * This class is an extension of the JMenu class, which eliminates a bug in 
  * the original JMenu which caused the menu to be opened slightly off-screen, 
  * if activated too close to the edge of the screen.
  *
  * @see <a href = "http://www.java.sun.com/products/jdk/1.2/docs/api/javax/swing/JMenu.html">JMenu</a>
  */
public class JMenuPlus extends JMenu {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
      * Creates a JMenuPlus without a title.
      */
    public JMenuPlus() {
         super();
    }
    
    
    /**
      * Creates a JMenuPlus with the specified title.
      *
      * @param title the title of the menu
      */
    public JMenuPlus(String title) {
         super(title);
    }
    
    
    /**
      * Creates a JMenuPlus with the specified title, and specified as a
      * tear-off menu or not.
      *
      * @param title the title of the menu
      * @param tearoff a boolean value representing whether the menu is a
      * tear-off menu or not.
      */
    public JMenuPlus(String title, boolean tearoff) {
         super(title, tearoff);
    }
    
    
    /**
      * Sets whether the popupmenu is visible or not.
      *
      * @param b a boolean value which decides whether the PopupMenu should
      * be visible or not.
      */   
    public void setPopupMenuVisible(boolean b) {
	boolean isVisible = isPopupMenuVisible();
        if (b != isVisible) {
	    // Set location of popupMenu (pulldown or pullright)
            // Perhaps this should be dictated by L&F
	    if ((b==true) && isShowing()) {
               Point p = getPopupMenuOrigin();
               getPopupMenu().show(this, p.x, p.y);
            } else {
               getPopupMenu().setVisible(false);
            }
         } 
      }
    
    
    /**
      * Performs a intelligent determination of the placement of the popup
      * menu. If the popmenu is activated too close to the edge of the screen,
      * the placement of the popup menu is adjusted in order to make sure the
      * popup menu is completely displayed on screen.
      * 
      * @return a <code>Point</code> in the coordinate space of the menu 
      * instance which should be used as the origin of the JMenu's popup menu.
      */
    protected Point getPopupMenuOrigin() {
	int x = 0;
	int y = 0;
	JPopupMenu pm = getPopupMenu();
	// Figure out the sizes needed to caclulate the menu position
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	Dimension s = getSize();
	Dimension pmSize = pm.getSize();
	// For the first time the menu is popped up, 
	// the size has not yet been initiated.
	if (pmSize.width==0) {
	    pmSize = pm.getPreferredSize();
	}
	Point position = getLocationOnScreen();

	Container parent = getParent();
	if (parent instanceof JPopupMenu) {
	    // We are a submenu (pull-right)
	    // First determine x
	    if (position.x+s.width + pmSize.width < screenSize.width) {
		x = s.width; // Prefer placement to the right
	    } else {
		x = 0-pmSize.width; // Otherwise place to the left
	    }
	    // Then determine y
	    if (position.y+pmSize.height < screenSize.height) {
		y = 0; // Prefer dropping down
	    } else {
		y = s.height-pmSize.height; // Otherwise drop 'up'
	    }
	} else {
	    // We are a toplevel menu (pull-down)
	    // First determine x
	    if (position.x+pmSize.width < screenSize.width) {
		x = 0; // Prefer extending to right 
	    } else {
		x = s.width-pmSize.width; // Otherwise extend to left
	    }
	    // Then determine y
	    if (position.y+s.height+pmSize.height < screenSize.height) {
		y = s.height; // Prefer dropping down
	    } else {
		y = 0-pmSize.height; // Otherwise drop 'up'
	    }   
	}
	return new Point(x,y);
    }
}
