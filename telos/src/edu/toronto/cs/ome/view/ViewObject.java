/* ViewObject 
 * Created Feb. 1999 by Joseph Makuch.
 *
 * copyright.
 */
package edu.toronto.cs.ome.view;

import edu.toronto.cs.ome.model.ModelObject;
import edu.toronto.cs.ome.model.OMEObject;

/**
 * This interface describes the methods that need to be implemented, when * an object is to be represented in a view. These methods perform such * operations as setting and getting the hidden status, iconified status and * location of the object in the view.
 */

public interface ViewObject extends OMEObject {

	/**
	 * Returns whether this object is hidden.
	 * 
	 * @uml.property name="hidden"
	 */
	public boolean isHidden();

	/**
	 * Sets whether this object is hidden. 
	 * 
	 * @param hide the boolean value that indicates whether this object should be
	 * hidden or not.
	 * 
	 * @uml.property name="hidden"
	 */
	public void setHidden(boolean hide);


    /** Sets whether this view element is to be iconified or not. 
      *
      * @param icon the ViewObject that is our iconification.  Passing null
      *	de-iconifies the object.
      */
    abstract public void setIconified(ViewObject icon);

    /** Returns whether this view element is iconified or not.
      *  An element is iconified if
      *  <li> the element itself is iconified
      *  <li> the element's parent is iconified
      *  <li> or, the element's parent is not expanded.
      */
    abstract public boolean isIconified();

    /** Returns the icon associated with this <code>ViewObject</code>, if one
      * exists and null otherwise. 
      */
    public ViewObject getIcon();

    /** Returns the model-side object which this <code>ViewObject</code>
      * represents. 
      */
    public ModelObject getModelObject();

    /** Returns the View.Location of this object. */
    public View.Location getLocation();

	/**
	 * Returns whether this object is selected or not.
	 * 
	 * @uml.property name="selected"
	 */
	public boolean isSelected();

	/**
	 * Sets whether this object is selected. 
	 * 
	 * @param select the boolean value that indicates whether this
	 * <code>ViewObject</code> should be selected or not.
	 * 
	 * @uml.property name="selected"
	 */
	public void setSelected(boolean select);

	/**
	 * Sets whether this object is highlighted
	 * 
	 * @uml.property name="highlighted"
	 */
	public void setHighlighted(boolean highlight);

	/**
	 * Returns true iff this object is currently highlighted
	 * 
	 * @uml.property name="highlighted"
	 */
	public boolean isHighlighted();

   public void toggleIntention();
   public void toggleLabel();
}
