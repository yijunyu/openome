/* ViewLink
 * 
 * Created August 1998 by Joseph Makuch.
 *
 * copyright.
 */

package edu.toronto.cs.ome.view;

import edu.toronto.cs.ome.model.OMELink;
import edu.toronto.cs.ome.model.OMEObject;


/** This interface describes the methods that need to be implemented, when
  * a link is to be represented in a view. 
  */
public interface ViewLink extends OMELink, ViewObject {
	
    /** Set the source for this link.   Parameter should be a ViewObject from
      *  the same view.
      *
      * @param o the source we are setting for this <code>OMELink</code>.
      */
    public void setFrom(OMEObject o) throws Exception;

    /** Set the destination for this link. Parameter should be a ViewObject
      * from the same view.
      *
      * @param o the destination we are setting for this <code>OMELink</code>.
      */
    public void setTo(OMEObject o) throws Exception;    
     
}
