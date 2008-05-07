
/* OMEObject 
 * Created Feb. 1999 by Joseph Makuch.
 *
 * copyright.
 */

package edu.toronto.cs.ome.model;
import java.util.Collection;

/**
 * This interface describes the fundamental methods that need to be implemented * by all model and view objects in OME. These classes (this one, along with  * <code>OMEElement</code> and <code>OMELink</code>) are useful in generalizing  * the features of Objects (be they ViewObject or ModelObjects), but ideally  * these should not be passed around.  Generally a user of these classes should  * know if they are working with model objects or view objects.
 */

public interface OMEObject {

	/**
	 * Returns the name or annotation of the object. This may return null.
	 * 
	 * @uml.property name="name"
	 */
	public String getName();

	/**
	 * Set the name or annotation of this object. 
	 * 
	 * @param newname the name to be set for this object.
	 * 
	 * @uml.property name="name"
	 */
	public void setName(String newname) throws Exception;

	/* While we are waiting for aribitrary value-attribute support (e.g. Type,
	 * Topic for NFR), we have an attribute called "comment" that allows us to
	 * associate extra information (in one big string) with objects that is
	 * not a part of its name.
	 *
	 * Tools can then process the string if they are so inclied.
	 */

	/**
	 * Returns the comment of the object. This may return null.
	 * 
	 * @uml.property name="comment"
	 */
	public String getComment();

	/**
	 * Set the comment for the object.
	 * 
	 * @uml.property name="comment"
	 */
	public void setComment(String newcomment);

   
    

    /** Returns which model this object is in.*/
    public OMEModel getModel();

	/**
	 * Returns this object's type.
	 * 
	 * @uml.property name="type"
	 */
	public Object getType();

	/**
	 * Set the type of this object. 
	 * 
	 * @param type the type which this object should be set to.
	 * 
	 * @uml.property name="type"
	 */
	public void setType(Object type) throws Exception;

	/**
	 * Returns the unique (within its view) integer ID of the object. The
	 *  annotation/name of a link is optional, so this serves to identify the
	 *  link when iterating. Multiple elements may share the same name with
	 *  varying semantics, so again the name does not serve as an adequate
	 *  identifier
	 * 
	 * @uml.property name="iD"
	 */
	int getID();

    

    /** Returns a collection of <code>OMELink</code>s for this <code>OMEObject</code>. 
      * This collection is writable, but one should really use the <code>addLink</code> 
      * method. 
      *
      * @see OMEObject#addLink(OMELink link) addLink()
      */
    public Collection getLinks();

    
    /** Adds an OMELink to the object's collection of links.
      * 
      * @param link the <code>OMELink</code> to be added.
      */
    void addLink(OMELink link);

	/**
	 * Set the id for this object. 
	 * 
	 * @param id the id which we should set for this <code>OMEObject</code>.
	 * 
	 * @uml.property name="iD"
	 */
	void setID(int id);

}


