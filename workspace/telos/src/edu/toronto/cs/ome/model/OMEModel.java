/* OMEModel
 *  Created August 1998 by Joseph Makuch. 
 *
 * Copyright John Mylopolous, and Eric Yu.
 * 
 */

package edu.toronto.cs.ome.model;

import java.io.File;
import java.util.Collection;

import edu.toronto.cs.ome.controller.ModelManager;
import edu.toronto.cs.ome.view.ViewManager;


 /** This interface describes the methods that need to be implemented by any model
   * in OME. An OME model consists of named and typed elements, and typed, annotated
   * links. Conceptually the annotation of links is different from the names of
   * elements in that the element's name should be unique within some context.
   * Additional attributes should be residing in the telos-side of things.
   * <P>A collection of views will bound to a model.
   */
public abstract class OMEModel {  

  
    /** Returns the framework that this model supports. This seems confusing 
      * as I believe a model may support more than one framework????
      */
    abstract public OMEFramework getFramework();

    
    /** Returns the OMEPlugin's that consider themselves compatible with this
      * model. 
      */
    public abstract Collection getPlugins();

    
    /** Creates a new element within the model which can then be manipulated 
      * through the <code>OMEElement</code> interface.
      *
      * @param type the type of <code>OMElement</code> we wish to create. 
      */
    public abstract ModelElement createElement(Object type) throws Exception;
    

    /** Creates a new link within the model which can then be manipulated
     *  through the OMELink interface. 
     *
     * @param type the type of <code>OMELink</code> we wish to create.
     */
    public abstract ModelLink createLink(Object type) throws Exception;
    

    /** Deletes the specified element from the model. 
      *
      * @param element the <code>ModelElement</code> we wish to delete.
      */
    public abstract void deleteElement(ModelElement element);
    

    /** Deletes the link from the model.
      *
      * @param link the <code>ModelLink</code> we wish to delete
      */
    public abstract void deleteLink(ModelLink link);
     

    /** Returns the elements in this model. */
    abstract public Collection getElements();
    

    /** Returns the links in this model. */
    abstract public Collection getLinks();
    

    /** Returns whether the model has been changed since its last serialization. */
    abstract boolean isDirty();        


    /** Returns the model's ModelManager. */
    public abstract ModelManager getModelManager();


    /** Returns the model's ViewManager. */
    public abstract ViewManager getViewManager();


    /** Generates elements, links, etc from the current kb. */
    public abstract void load() throws Exception;

    /** Saves the model (and its views) to the given file name. 
      *
      * @param pathname the pathname to which this model should be saved.
      */
    public abstract void save(File f) throws Exception;

    public abstract void saveassml(File f) throws Exception;//cai

	/**
	 * @param f
	 */
	public abstract void saveasvdx(File f) throws Exception; // Xiao X. Deng

}
