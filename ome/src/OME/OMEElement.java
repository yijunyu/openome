/* OMEElement
 * 
 * Created August 1998 by Joseph Makuch.
 *
 * copyright.
 */

package OME;

import java.util.Collection;


/** This interface extend the <code>OMEObject</code> interface to include the 
  * characteristics specific to elements. These characterictics specifically
  * include the following
  * <li> elements may have a parent
  * <li> elements may have children
  * <li> elements may be expandable
  */ 
public interface OMEElement extends OMEObject {
    
    /** Returns the element's parent. If it does not have a parent, null is
      *  returned 
      */
    public OMEElement getParent();
    

    /** Changes or sets the parent of the element. If this is attempted on an
      * expandable element an error will be thrown. Both this method, and the
      * parent's <code>addChild()</code> method must be called to add a child 
      * to a parent. 
      *
      * @param parent the <code>OMEElement</code> whom we set as the parent of
      * of this <code>OMEElement</code>.
      */
    public void setParent(OMEElement parent) throws Exception;
    

    /** Adds a child to an expandable element. If attempted on a
      * non-expandable element, an error will be thrown. Both this method and
      * the child's setparent method must be called to add a child to a parent. 
      *
      * @param child the <code>OMEElement</code> which we are adding to this
      * expandanble <code>OMEElement</code>.
      */
    public void addChild(OMEElement child) throws Exception;


    /** Removes a child from this (expandable) element.  If attempted on a
     * non-expandable element, or if the child is not in fact a child of the
     * parent, and exception is thrown.  A call must also be made to
     * child.setParent(null) to remove the child from its parent.
     */
    public void removeChild(OMEElement child) throws Exception;
    

    /** Returns whether element is expandable. 
      *
      * @return true if this <code>OMEElement</code> is expandable and false
      * otherwise.
      */
    public boolean isExpandable();


    /** Sets whether this element is expandable. If this is attempted on an
      * element with children, or with a parent, then an error will be thrown
      * if the new state does not allow children or a parent respectively. 
      *
      * e the boolean value denoting the new expandable status of this 
      * <code>OMEElement</code>
      */
    void setExpandable(boolean e) throws Exception;
    

    /** Returns a collection of OMEElements in the expandable bounds of this
      * <code>OMEElement</code>. This collection is writable. 
      */
    public Collection getChildren();

}



