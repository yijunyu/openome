/* OMEModel
 *  Created August 1998 by Joseph Makuch. 
 *
 * Copyright John Mylopolous, and Eric Yu.
 * 
 */

package OME;

import java.util.Collection;


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
    abstract Collection getPlugins();

    
    /** Creates a new element within the model which can then be manipulated 
      * through the <code>OMEElement</code> interface.
      *
      * @param type the type of <code>OMElement</code> we wish to create. 
      */
    abstract ModelElement createElement(Object type) throws Exception;
    

    /** Creates a new link within the model which can then be manipulated
     *  through the OMELink interface. 
     *
     * @param type the type of <code>OMELink</code> we wish to create.
     */
    abstract ModelLink createLink(Object type) throws Exception;
    

    /** Deletes the specified element from the model. 
      *
      * @param element the <code>ModelElement</code> we wish to delete.
      */
    abstract void deleteElement(ModelElement element);
    

    /** Deletes the link from the model.
      *
      * @param link the <code>ModelLink</code> we wish to delete
      */
    abstract void deleteLink(ModelLink link);
     

    /** Returns the elements in this model. */
    abstract public Collection getElements();
    

    /** Returns the links in this model. */
    abstract public Collection getLinks();
    

    /** Returns whether the model has been changed since its last serialization. */
    abstract boolean isDirty();        


    /** Returns the model's ModelManager. */
    abstract ModelManager getModelManager();


    /** Returns the model's ViewManager. */
    abstract ViewManager getViewManager();


    /** Generates elements, links, etc from the current kb. */
    abstract void load() throws Exception;

    /** Saves the model (and its views) to the given file name. 
      *
      * @param pathname the pathname to which this model should be saved.
      */
    abstract void save(String pathname) throws Exception;

    abstract void saveassml(String pathname) throws Exception;//cai

    abstract void saveasxml(String pathname) throws Exception;//cai,7.10,2001

}
