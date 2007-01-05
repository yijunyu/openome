
/* ModelElement
 *
 * Created May 1999 by Joseph Makuch
 *
 * copyright.
 *
 */

package edu.toronto.cs.ome.model;

import edu.toronto.cs.ome.view.ViewElement;

/** This interface defines the functionality that should be implemented
  * for each object element in our model. ModelElements are objects that 
  * provide access to the elements in the kb. Each ModelElement has an 
  * analogous, unique object within its kb. Currently the ModelElement
  * interface just extends the <code>OMEElement</code> and <code>ModelObject
  * </code> interfaces.
  *
  * @see OMEElement
  * @see OMEObject
  * @see ModelObject
  * @see ViewElement
  */
public interface ModelElement extends OMEElement, ModelObject {
    
}



