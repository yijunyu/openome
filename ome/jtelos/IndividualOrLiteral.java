
package jtelos;


/**
 * This interface represents Telos individuals or primitive
 * literals. It is necessary since Attributes may have either of these
 * types as their target. This is represented in Java by the method
 * <code>target()</code> in the interface <code>Attribute</code>.
 * 
 * @see Individual
 * @see PrimitiveLiteral
 * @see Attribute#target()
 **/
public interface IndividualOrLiteral extends NamedObject {}