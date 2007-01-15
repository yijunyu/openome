/* ViewElement
 * 
 * Created August 1998 by Joseph Makuch.
 *
 * copyright.
 */

package OME;

import java.awt.Point;


/** This interface describes the methods that need to be implemented, when
  * an element is to be represented in a view. These methods perform such
  * operations as contracting or expanding an elements. An element in OME can 
  * be expanded and contracted (to show or hide their children respectively).
  */
public interface ViewElement extends OMEElement, ViewObject {
	
    /** Expands the element.  Throws exception if element is not expandable. */
    public void expand() throws Exception;

    /** Contracts the element. */
    public void contract() throws Exception;

    /** Returns true iff the element is expanded in the view. */
    public boolean isExpanded();

     
    public boolean isHidden();

    /** Moves the element to a given point in the view.  (Only makes sense in a
     * Graphic View). */
    public void moveTo(Point p);

    /** Moves the element to a position in the view relative to its current
     * position.  (Only makes sense in a Graphic View)*/
    public void move(int dx, int dy);

}



