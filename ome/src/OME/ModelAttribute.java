/* 
 * OMEAttribute.java.
 * 
 * created by Joseph Makuch, July 1999.
 *
 */

package OME;

import java.util.Iterator;

import jtelos.Attribute;


/** ModelAttributes represent reference-type attributes on ModelObjects. An
  * attribute maps a name to a target (separate distinct object) within the kb.
  * Multiple attributes may point to the same such target. This can be
  * contrasted with the notion of a value attribute wherein each attribute will
  * have a separate target. */
public interface ModelAttribute {
    
    /** Returns a name for the Attribute which can be used to find it later. */
    public String getName();
    
    /** Sets the target of this attribute to the specified target.
      * 
      * @param target which the target of this attribute is set to.
      */
    public void setTarget(Object target);
    
    /** Returns the target of this attribute, returning null if there is no
      * target. 
      */
    public Object getTarget();

    /** Removes any target from the attribute. */
    public void clearTarget();
    
    /** Attempts to construct a list of possible targets. Returns an empty
      * iterator if such a construction is not feasible. 
      */
    public Iterator getPossibleTargets();
    public Attribute getAttribute();
}
