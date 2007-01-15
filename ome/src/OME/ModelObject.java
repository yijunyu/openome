
/* ModelObject
 * 
 * Created May 1999 by Joseph Makuch
 *
 * copyright.
 */

package OME;

import java.util.Iterator;

/** ModelObjects provide access to some of the objects in the kb. ModelLinks
 * to the links in the kb, ModelElements to the elements. This interface
 * defines an intersection of some of their functionality. 
 *
 * This class also provides us with the ability to speak of links and elements
 * in a general way.
 *
 * Each ModelObject has an analogous, unique object within its kb. 
 * @see OMEObject
 * @see ModelElement
 * @see ModelLink
 * @see ViewObject
 */
public interface ModelObject extends OMEObject {

    /** Returns the attribute with the given name. The attribute can then be
      * manipulated through the OMEAttribute interface. 
      *
      * @param name the name of the attribute we want.
      */
    public ModelAttribute getAttribute(String name);

    /** Returns an iterator over the objects attributes. */
    public Iterator getAttributes();

    /** Clear the model attributes for this object. (added in Jun, 2003) */
    public void clearModelAttr();


    /** Returns the value attribute with the given name. The attribute can
      * then be manipulated through the OMEValueAttribute interface. 
      *
      * @param name the name of the value attribute we want.
      */
    public ModelValueAttribute getValueAttribute(String name);
    
    /** Updates the label of value attribute from "name" to "newname" . The attribute can
      * then be manipulated through the OMEValueAttribute interface. 
      *
      * @param name the oldname of the value attribute we want to change.
      * @param newname the newname of the value attribute we want to change.
      */
    public ModelValueAttribute updateValueAttribute(String name, String
	    newname);

    /** Returns an iterator over the objects value attributes. */
    public Iterator getValueAttributes();


    /** Returns a Collection of the links connected to this object. */
    //public Collection getLinks();
}
