
package jtelos.example;


import jtelos.util.Singleton;
import jtelos.*;

import java.util.Vector;

/** 
 * The following abstract subclasses need to be implemented in any
 * implementation of the API. They have unique instances for each KB:
 *
 * <p><ul>
 * <li><code>PROPOSITION</code> which has all propositions as Telos
 * instances, including itself,
 * <li><code>CLASS</code> which has all classes as Telos instances,
 * including itself
 * <li><code>INDIVIDUAL</code> which has all individuals as Telos
 * instances, including itself,
 * <li><code>INDIVIDUAL_CLASS</code> which has all individual classes
 * as instances, including itself, and
 * <li><code>OMEGACLASS</code> which has all omegaclasses as Telos
 * instances, including itself.
 * </ul>
 *
 * <p>The reason they must be implemented is that any user-defined
 * individuals in can reference them. This means that a user-defined
 * individual can declare an attribute that has one of the above
 * omegaclasses as its target. Because of this, the KB implementation
 * must keep track of these references.
 * 
 * <p>Four other concrete subclasses are hardcoded in the API which
 * cannot be referenced in this way:
 *
 * <ul><li><code>ATTRIBUTE_CLASS</code> which has all attribute
 * classes as Telos instances, and 
 *
 * <li><code>ATTRIBUTE</code> which has all attributes as Telos
 * instances. This is one of the three attribute classes defined by
 * <code>INDIVIDUAL</code> (which also defines
 * <code>ATTRIBUTE_CLASS</code>. The other is <code>SINGLE</code>.
 * These cannot be referenced by attribute objects either</ul>
 *
 * <p>A concrete Java subclass must implement the interface
 * <code>KBSingleton</code> by implementing the static method that
 * returns the unique Java instance of this class <em>with respect to
 * each KB</em>. In this API, an instance method in <code>KB</code>
 * corresponding to each of the abstract subclasses of
 * <code>Omegaclass</code> fulfills this role.
 *
 * <p>The abstract instance method that needs to be implemented is
 * <code>referencedBy()</code>, since it depend directly on the
 * implementation of the <code>KB</code> Java interface.
 *
 * @see PROPOSITION
 * @see CLASS
 * @see INDIVIDUAL
 * @see INDIVIDUAL_CLASS
 * @see OMEGACLASS
 * @see ATTRIBUTE_OMEGACLASS
 * @see ATTRIBUTE
 * @see SINGLE
 * @see jtelos.KB
 * @see jtelos.util.KBSingleton
 * @see jtelos.TelosObject#kb()
 **/
public class exOmegaclass extends exIndividual
implements Omegaclass {

  private OmegaclassOrAttributeClass[] directOmegaChildren_val =
	new OmegaclassOrAttributeClass[0];



  //===========================================================================
  // PRIVATE CONSTRUCTOR
  //===========================================================================

  protected exOmegaclass(String telosName, KB kb)
	{ super(telosName,OMEGACLASS_LEVEL,kb); }

  //===========================================================================
  // PUBLIC TELL METHODS
  //===========================================================================

  /** Implements corresponding method in the interface
   * <code>Omegaclass</code>. This method should only be invoked
   * during the initialization of a KB. It should never be invoked by users.
   **/
  public void addDirectOmegaChildren(OmegaclassOrAttributeClass[] newChildren) {
	directOmegaChildren_val = 
	  StaticHelper.append(directOmegaChildren_val,newChildren);
  }  

  /**
   * Implements equivalent method of the interface
   * <code>Individual</code>. Note that this excludes the attribute
   * classes since they are not individuals. <em>But they are children
   * of some omegaclasses.</em> So <code>directOmegaChildren()</code>
   * should be invoked instead. To enforce this, some implementations
   * of this API may choose to override this method to throw a
   * <code>TelosMethodNotImplementedException</code>.
   *
   * @see jtelos.Individual#directChildren
   * @see jtelos.util.TelosMethodNotImplementedException
   **/
  public Individual[] directChildren() {
	if(directChildren_val == null)
	  directChildren_val = StaticHelper.directChildren(this);
	return directChildren_val;
  }  

  /**
   * Returns the immediate children of this omegaclass. This method
   * corresponds to the relation <code>ISA_INV</code>.
   *
   * @see jtelos.Relations#ISA_INV
   **/
  public OmegaclassOrAttributeClass[] directOmegaChildren() {
	return directOmegaChildren_val;
  }  

  /**
   * Does nothing. Implements corresponding method in the interface
   * <code>Individual</code>.
   *
   * @see jtelos.Individual#removeDirectAncestorWithInverse(jtelos.Individual)
   **/
  public void removeDirectAncestorWithInverse(Individual indiv) {}  

  /**
   * Does nothing. Implements corresponding method in the interface
   * <code>Individual</code>.
   *
   * @see jtelos.Individual#removeDirectAttr(jtelos.Attribute)
   **/
  public void removeDirectAttr(Attribute attr) {}  

  /**
   * Does nothing. Implements corresponding method in the interface
   * <code>Individual</code>.
   *
   * @see jtelos.Individual#removeDirectParentWithInverse(jtelos.Individual)
   **/
  public void removeDirectParentWithInverse(Individual indiv) {}  

}