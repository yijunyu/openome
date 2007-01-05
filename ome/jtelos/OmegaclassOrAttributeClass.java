
package jtelos;


/**
 * This interface represents omegaclasses or attribute classes in
 * Telos. It is necessary since the children of some omegaclasses can
 * be either of these types. This is represented in Java by the method
 * <code>directOmegaChildren()</code> in the abstract class
 * <code>Omegaclass</code>.
 * 
 * @see Omegaclass
 * @see AttributeClass
 * @see Omegaclass#directOmegaChildren()
 **/
public interface OmegaclassOrAttributeClass {}