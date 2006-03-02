package edu.toronto.cs.ome.view;

import java.util.Collection;

/**
 * This class is convey certain information about the state of a particular 
 */


public class ViewContext {

	/**
	 * 
	 * @uml.property name="l"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private View.Location l;

	/**
	 * 
	 * @uml.property name="o"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private ViewObject o;

    private Collection c;

    /** Creates a ViewContext. 
      *
      * @param l the location of the mouse-click that caused the <PluginMethod>
      * to be called.
      * @param associatedobject an object in the view to be associated with 
      * this call to the PluginMethod.
      * @param selectedobjects the objects within the view that are selected 
      */
    ViewContext(View.Location l, ViewObject associatedobject, Collection
	    selectedobjects) {

	this.l = l;
	this.o = associatedobject;
	this.c = selectedobjects;
    }

    /** Returns the View.Location associated with the initiation of the call
     *  to the method (typically a mouse click).  This method returns null 
     *  if no Location can be associated with the event.
     */
    public View.Location associatedLocation() {
	return l;
    }

    /** Returns the ViewObject that is at the associatedLocation (if any). */
    public ViewObject associatedObject() {
	return o;
    }

    /** Returns a Collection of ViewObjects that were selected when the method
     *  was intiated.
     */
    public Collection selectedObjects() {
	return c;
    }
}