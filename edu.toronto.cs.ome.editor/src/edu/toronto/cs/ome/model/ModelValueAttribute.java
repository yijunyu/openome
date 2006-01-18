/* 
 * OMEAttribute.java.
 * 
 * created by Joseph Makuch, July 1999.
 *
 */

package edu.toronto.cs.ome.model;

/**
 * ModelValueAttributes represent value-type attributes on ModelObjects. An * attribute maps a name to a target (separate distinct object) within the kb. * Multiple attributes may point to the same such target. This can be * contrasted with the notion of a value attribute wherein each attribute will * have a separate target.
 */

public interface ModelValueAttribute {
    
    /** Returns a name for the Attribute which can be used to find it later. */
    public String getName();
    
    /** Sets the value of this attribute.
      * 
      * @param target which the target of this attribute is set to.
      */

    public String getLabel();

	/**
	 * 
	 * @uml.property name="value"
	 */
	public void setValue(String value);

	/**
	 * Returns the value of this attribute.
	 * 
	 * @uml.property name="value"
	 */
	public String getValue();

	
	/** Removes the target from the attribute. */
    public void clearValue();

}
