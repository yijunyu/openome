
package jtelos;


/** This is a proposal for adding methods beyond the basic ones in the
 * interface <code>Individual</code>.
 **/
public interface ExtendedIndividual extends Individual {



  /** Returns the direct ancestors of this individual and the
   * transitive closure of their Telos parents (ie. their
   * superclasses). So this corresponds to the relation
   * <code>IN</code> composed with the transitive closure over
   * <code>ISA</code>. It does <em>not</em> correspond to the
   * transitive closure over <code>IN</code>. Thus all individuals
   * returned will be at the same level of instantiation. This expands
   * on the method <code>directAncestors()</code> in the interface
   * <code>Individual</code>.
   *
   * @see Individual#directAncestors()
   **/
  Individual[] allAncestors();  

  /** Returns the direct Telos children (subclasses) of this
   * individual and the transitive closure of their children.  This
   * expands on the method <code>directChildren()</code> in the
   * interface <code>Individual</code>.
   *
   * @see Individual#directChildren()
   **/
  Individual[] allChildren();  

  /** Returns the direct Telos parents (superclasses) of this
   * individual and the transitive closure of their parents.  This
   * expands on the method <code>directParents()</code> in the
   * interface <code>Individual</code>.
   *
   * @see Individual#directParents()
   **/
  Individual[] allParents();  

  /**
   * Returns true if this individual is an Telos ancestor of the parameter.
   **/
  boolean isAncestorOf(Individual candidate);  

  /** Returns true if this individual is an Telos child (subclass) of
   * the parameter.
   **/
  boolean isChildOf(Individual candidate);  

  /**
   * Returns true if this individual is an Telos instance of the parameter.
   **/
  boolean isInstanceOf(Individual candidate);  

  /** Returns true if this individual is an Telos parent (superclass) of
   * the parameter.
   **/
  boolean isParentOf(Individual candidate);  

}