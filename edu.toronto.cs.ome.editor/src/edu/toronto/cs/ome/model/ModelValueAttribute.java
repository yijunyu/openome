/* 
 * OMEAttribute.java.
 * 
 * created by Joseph Makuch, July 1999.
 *
 */

package edu.toronto.cs.ome.model;

/**
 * ModelValueAttributes represent value-type attributes on ModelObjects. An
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