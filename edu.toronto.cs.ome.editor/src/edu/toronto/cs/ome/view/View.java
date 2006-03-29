/* Revised by Zhifeng Liu Jul-Aug 2004
  Please refer to the added comments for detail
*/
/* View
 * 
 * Created August 1998 by Joseph Makuch.
 *
 * copyright.
 */

package edu.toronto.cs.ome.view;

import java.awt.Image;
import java.awt.Point;
import java.util.Collection;

import javax.swing.JDialog;

import edu.toronto.cs.ome.controller.PluginMethod;
import edu.toronto.cs.ome.model.ModelElement;
import edu.toronto.cs.ome.model.ModelLink;
import edu.toronto.cs.ome.model.ModelObject;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.model.ViewSerializer;
import edu.toronto.cs.undo.Undo;
import edu.toronto.cs.ome.model.TelosModel;
/**
 * This interface describes the methods that characterize a graphical state  * of a model. These characteristics include the positions,expandednesses,  * visibilities, and selections of the various objects in the model.  * <P>IMPORTANT: A view provides access for users to inspect <I>as well as </I> * modify a model. *  * At present the only implementing view is GraphicView.  But future views * could include ListView, TreeView etc.
 */

public interface View {        
    
	public Undo getUndo();
	/** This is to handle the general concept of WHERE in a view a particular
     *  object may live. */
    public interface Location {
    }
    
    /** A particular kind of location that has a point in 2D space associated
     *  with it.  Particularly useful for generating other GraphicLocations
     *  (such as a midpoint).
     */
    public class GraphicLocation implements Location {
	
	Point p = null;
	
	/** Returns the Point associated with this location. */
	public Point getPoint() {
	    return p;
	}

	/** Sets the Point associated with this location.
	  * 
	  * @param p the point to be assocaiated with this location
	  */
	public void setPoint(Point p) {
	    this.p = p;
	}
    }
    
    /** Returns a Location that is reasonable for a the placement of a new
      * element.
      *
      * @param  newobject the object whose default location we want.
      */
    public Location getDefaultLocation(ModelObject newobject);

/**
 * Sets the name of this view.
 * 
 * @uml.property name="name"
 */
/*package*/void setName(String n);

/**
 * Returns the name of this view. Views of a model should have unique 
 * names.
 * 
 * @uml.property name="name"
 */
/*package*/String getName();
    

    
    /** Returns the model for this view. */
    public OMEModel getModel();

// /** Returns the type of this view. These types are enumerated in Views. */
// public int getType();

/**
 * Set the GUI side of this View.
 * 
 * @uml.property name="iD"
 */
/*package*/int getID();

/**
 * Sets the unique identifier (within this model) for this view. 
 * 
 * @param id the identifier to be set for this view.
 * 
 * @uml.property name="iD"
 */
/*package*/void setID(int id);

    
    /** Returns the ViewElements within this view. */
    public Collection getAllElements();
    

    /** Returns the ViewLinks within this view. */
    public Collection getAllLinks();
    

    /** Returns the ViewObjects that are highlighted*/
    public Collection getHighlightedObjects();
    
    /** Returns the selected elements. */
    public Collection getSelectedElements();
    

    /** Returns the selected links. */
    public Collection getSelectedLinks();
    

    /** Returns the expanded elements. */
    public Collection getExpandedElements();
    

    /** Returns the expandable elements. */
    //public Collection getExpandableElements();
    

    /** Returns the visible elements. This
     *  will omit elements that are hidden as well as elements that are not
     *  within the visible area of the view, eg: the visible rectangle for
     *  graph-views, or the number of lines in a tree-list view. 
     */
    public Collection getVisibleElements();
    

    /** Returns visible links. This
     *  will omit links that are hidden as well as links that are not
     *  within the visible area of the view, eg: the visible rectangle for
     *  graph-views, or the number of lines in a tree-list view. 
     */
    public Collection getVisibleLinks();   

    /** Returns the image that is associated with the given object (for this
     *  View).
     */
    public Image getImage(Object type);
    
    /** Prompt the user to rename the given ViewObject in a View specific way.
      *  These could certainly be done in a more general way.
      *
      * @param o the <code>ViewObject</code> we wish to rename.
      */
    public void promptRename(ViewObject o);

    /** Prompt the user to resize the given ViewObject in a View specific way.
      *  These could certainly be done in a more general way.
      *
      * @param o the <code>ViewObject</code> we wish to resize.
      */

    public void promptStraighten(ViewObject o);

    public void setStraighten(boolean b);    
    public void promptResize(ViewObject o);
    public void promptAddQuan(TelosModel m, GraphicViewElement e);
    /** Selects the given object. 
      *
      * @param o the <code>ViewObject</code> we wish to select
      */
    public void selectObject(ViewObject o);

    /** Deselects the given object. 
      * 
      * @param the <code>ViewObject</code> we wish to deselect
      */
    public void deselectObject(ViewObject o);
    
    //added by Zhifeng Liu Aug 2004
    public void copyMethod( ) ;
    //added by Zhifeng Liu Aug 2004
    public void cutMethod( ) ;
    //added by Zhifeng Liu Aug 2004
    public void pasteMethod( ) ;
    
    //added by Zhifeng Liu Aug 2004
    public void copyElements( ) ;
    //added by Zhifeng Liu Aug 2004
    public void cutElements( ) ;
    //added by Zhifeng Liu Aug 2004
    public void pasteElements( ) ;
    
    //added by Zhifeng Liu Aug 2004
    public void copyLinks( ) ;
    //added by Zhifeng Liu Aug 2004
    public void cutLinks( ) ;
    //added by Zhifeng Liu Aug 2004
    public void pasteLinks( ) ;
    
    
    /** Adds an element to the view AND the model.
      *
      * @param type the type of object to be added.
      * @param location the location at which the object should be added.       
      */
    public ViewElement createElement(Object type, Location l) throws Exception;
    

    /** Deletes the element from the view AND the model, after first deleting
      *  all of it's links and children. 
      *
      * @param ve the <code>ViewElement</code> to be deleted.
      */
    public void deleteElement(ViewElement ve);

    
    /** Deletes the selected elements, as per deleteElement. */
    public void deleteSelectedElements();

    
    /** Creates a link in the view AND the model. 
      *
      *	@param type the type of link to be created.
      * @param from the <code>ModelObject</code> that is the source of the created link
      * @param to the <code>ModelObject</code> that is the destination of the created link
      */
    public ViewLink createLink(Object type, ModelObject from, 
	    ModelObject to);

    
    /** Deletes the link from the view AND the model. 
      *
      *	 @param vl the <code>ViewLink</code> to be deleted.
      */
    public void deleteLink(ViewLink vl);

    
    /** Deletes the selected links from the view AND the model. */
    public void deleteSelectedLinks();

    /** Deletes the given object from the view and the model. 
      *
      * @param vo the <code>ViewObject</code> to be deleted.
      */    
    public void deleteObject(ViewObject vo);


    /** Update (or create) the element with this model-element.
      * A dirty element is an element that has changed since the last
      * serialization (ie it has been newly created, modified or deleted)
      * and thus need to be redrawn.
      *
      * @param e the <code>ModelElement</code> that is to be marked as dirty.
      */
    void dirtyElement(ModelElement e);

    
    /** Update (or create) the link with this model-element
      * A dirty element is an element that has changed since the last
      * serialization (ie it has been newly created, modified or deleted)
      * and thus need to be redrawn.
      *
      * @param l the <code>ModelLink</code> that is to be marked as dirty.
      */
     /*package*/ void dirtyLink(ModelLink l);

    /** Returns the absolute path where view (and thus model) should be saved.*/
    public String getSavePathname();
    
    /** Save the important stuff to the serializer. 
      *
      * @param vs the <code>ViewSerializer where we wish to save to.
      */
    public void save(ViewSerializer vs);


    /** Recover said important stuff from the serializer. 
      *
      * @param vs the <code>ViewSerializer</code> where we wish to load from.
      */
    public void load(ViewSerializer vs);


    /** Announce to this view that it has become "dirty", and needs to be
     *  updated.  Typically this happens when the state of the model (or the 
     *  visibilities of the model) has changed. */
    public void updateView();

    
    /** Displays the given JDialog to the user. 
      *
      * @param jd the <code>JDialog</code> to be displayed.
      */
    public void showDialog(JDialog jd);

    
    // Views, or at least GraphicViews, can aid the plugin user by providing
    // smoe access to various image handling and processing features.  Here
    // are some methods that might help.

    /** Returns an ImageTable that can be used to scale, rotate, and scribble
     *  on images.
     */
    public ImageTable getImageTable();


    /** Closes this view. The view will take care of saving and then 
      * closing the frame.
      * 
      * @param method I believe this can any Plugin Method that may aid in 
      * saving the view (This comment should be updated!!!)
      */
    public void closeView(PluginMethod method);

	/**
	 * @return
	 */
	public boolean isShowIntention();

	/**
	 * @param vo
	 */
	public void setIntention(ViewObject vo);
    
}


