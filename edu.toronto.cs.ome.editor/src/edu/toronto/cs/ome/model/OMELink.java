
/* OMELink
 * 
 * Created August 1998 by Joseph Makuch.
 *
 * copyright.
 */

package edu.toronto.cs.ome.model;

/**
 * This interface extend the <code>OMEObject</code> interface to include the  * characteristics specific to links. These characteristics specifically include * the following * <li> links must have <I>to</I> (destination) and a <I>from</I> (source).
 */

public interface OMELink extends OMEObject {

	/**
	 * Returns the destination of this OME link.
	 * 
	 * @uml.property name="to"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public OMEObject getTo();

	/**
	 * Set the destination for this OME link. 
	 * 
	 * @param o the destination we are setting for this <code>OMELink</code>.
	 * 
	 * @uml.property name="to"
	 */
	public void setTo(OMEObject o) throws Exception;

	/**
	 * Returns the source of this OME link.
	 * 
	 * @uml.property name="from"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public OMEObject getFrom();

	/**
	 * Set the source for this OME link. 
	 * 
	 * @param o the source we are setting for this <code>OMELink</code>.
	 * 
	 * @uml.property name="from"
	 */
	public void setFrom(OMEObject o) throws Exception;

}
