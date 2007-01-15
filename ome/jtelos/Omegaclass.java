
package jtelos;



/**  The following methods in the interface <code>KB</code> need to be
 * implemented in any implementation of the API. They return unique
 * Java instances of builtin omegaclassfor each KB:
 *
 * <p><ul>
 * <li><code>PROPOSITION()</code> (returning the
 * <code>Proposition</code> omegaclass in Telos) which has all
 * propositions as Telos instances, including itself,
 * <li><code>CLASS()</code> (returning the <code>Class</code>
 * omegaclass in Telos) which has all classes as Telos instances,
 * including itself
 * <li><code>INDIVIDUAL()</code> (returning the
 * <code>Individual</code> omegaclass in Telos) which has all
 * individuals as Telos instances, including itself,
 * <li><code>INDIVIDUAL_CLASS()</code> (returning the
 * <code>IndividualClass</code> omegaclass in Telos) which has all
 * individual classes as instances, including itself, and
 * <li><code>OMEGACLASS</code> (returning the <code>OmegaClass</code>
 * omegaclass in Telos) which has all omegaclasses as Telos instances,
 * including itself.</ul>
 *
 * <p>The reason these methods must be implemented is that any
 * user-defined individuals in a KB can reference them (ie. have them
 * as targets of user-defined attribute classes). Because of this, the
 * KB implementation must keep track of these references.
 * 
 * @see KB#PROPOSITION()
 * @see KB#CLASS()
 * @see KB#INDIVIDUAL()
 * @see KB#INDIVIDUAL_CLASS()
 * @see KB#OMEGACLASS()
 * @see jtelos.util.KBSingleton
 * @see TelosObject#kb()
 **/
public interface Omegaclass extends Individual, OmegaclassOrAttributeClass {



  //==========================================================================
  // PUBLIC TELL METHODS
  //==========================================================================

  /** Adds Omegaclasses and attribute classes to the "direct omega
   * children" list of this omegaclass. This method should only be
   * invoked during the initialization of a KB. It should never be
   * invoked by users. It is invoked by
   * <code>initializeBuiltIns(KB)</code> in the
   * <code>StaticHelper</code> class.
   *
   * @see StaticHelper#initializeBuiltIns(jtelos.KB)
   **/
  void addDirectOmegaChildren(OmegaclassOrAttributeClass[] directChildren);  

  //==========================================================================
  // PUBLIC ASK METHODS
  //==========================================================================

  /**
   * This overrides the semantics of the equivalent method of the
   * interface <code>Individual</code>. Note that this excludes the
   * attribute classes since they are not individuals. <em>But they
   * are children of some omegaclasses.</em> So
   * <code>directOmegaChildren()</code> should be invoked instead. To
   * enforce this, some implementations of this API may choose to
   * override this method to throw a
   * <code>TelosMethodNotImplementedException</code>.
   *
   * @see Individual#directChildren
   * @see jtelos.util.TelosMethodNotImplementedException
   **/
  public Individual[] directChildren();  

  /**
   * Returns the immediate children of this omegaclass. This method
   * corresponds to the relation <code>ISA_INV</code>.
   *
   * @see Relations#ISA_INV
   **/
  public OmegaclassOrAttributeClass[] directOmegaChildren();  

}