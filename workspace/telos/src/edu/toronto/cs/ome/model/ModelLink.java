
/* OMELink
 * Created May 1999 by Joseph Makuch.
 *
 * copyright.
 *
 *
 */

package edu.toronto.cs.ome.model;

import edu.toronto.cs.ome.view.ViewLink;

/** This interface defines the functionality that should be implemented
  * for each object link in our model. ModelLinks are objects that 
  * provide access to the links in the kb. Each ModelLink has an 
  * analogous, unique object within its kb. Currently the <code>ModelLink
  * </code> interface just extends the <code>OMELink</code> and <code>
  * ModelObject</code> interfaces.
  *
  * @see OMELink
  * @see OMEObject
  * @see ModelObject
  * @see ViewLink
  */
public interface ModelLink extends OMELink, ModelObject {
    
}
