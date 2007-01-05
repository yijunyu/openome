
package jtelos;


/** This interface represents individuals in Telos. These include
 * omegaclasses and non-omegaclasses. It includes the three primtive
 * <em>types</em> but not primitive literals. It also does not include
 * any attribute or attribute class.  Primitive types include Telos
 * <code>String</code>, <code>Integer</code> and <code>Real</code>
 * types. Non-primitve individuals include tokens, simple classes,
 * metaclasses, metametaclasses, etc. and omegaclasses.
 *
 * <p>The three primitive types for each KB are available through the
 * following methods in the interface <code>KB</code>:
 *
 * <p><ul>
 * <li><code>STRING_TYPE()</code> (returning <code>String</code> in Telos)
 * <li><code>INTEGER_TYPE()</code> (returning <code>Integer</code> in Telos)
 * <li><code>REAL_TYPE()</code> (returning <code>Real</code> in Telos)
 * </ul>
 *
 * <p>Individuals also include five builtins for each level of Telos
 * instantiation:
 *
 * <p><ul>
 * <li><code>M3CLASS()</code> (returning <code>M3Class</code> in Telos)
 * <li><code>M2CLASS()</code> (returning <code>M2Class</code> in Telos)
 * <li><code>METACLASS()</code> (returning <code>M1Class</code> in Telos)
 * <li><code>SIMPLE_CLASS()</code> (returning <code>SimpleClass</code> in Telos)
 * <li><code>TOKEN()</code> (returning <code>Token</code> in Telos)
 * </UL>
 *
 * <P>In this API omegaclasses are also individuals. They are
 * available through methods in <code>KB</code> as well. See the
 * <code>Omegaclass</code> interface for their descriptions.
 *
 * <p>Below is a generic Telos individual represented with
 * relationships to other individuals and attributes. These are
 * relationships are described in the unimplemented Java interface
 * <code>Relations</code>. Below this diagram are specific diagrams
 * showing the semantics of various Telos individuals.
 * 
 * <p><center><p><img src=Individual.gif></center>
 *
 * <h2>Tokens</h2>
 *
 * Tokens represent the bottom level of instatntion hierarchy in
 * Telos. Invoking the <code>level()</code> method on them returns the
 * constant <code>TOKEN_LEVEL</code> in the <code>Levels</code>
 * interface. Tokens are (Telos) instances of simple classes. They
 * declare attributes that take any Telos individual (at any level of
 * instantiation) or primtive literal as a target . They also have
 * <em>no inheritance characteristics</em>. This means no token
 * extends (subclasses) another token. So they cannot inherit
 * attributes. In this API we refer to "<code>TOKEN</code>" as the
 * unique simple class builtin for each KB of which all tokens are
 * direct Telos instances (by default). It is available by invoking
 * the <code>TOKEN()</code> method in the interface <code>KB</code>.
 *
 * <h2>Simple Classes</h2>
 *
 * <p>Simple classes are (Telos) instances of metaclasses. Invoking
 * the <code>level()</code> method on them returns the constant
 * <code>SIMPLE_CLASS_LEVEL</code> in the <code>Levels</code>
 * interface. They also have Telos instances which are tokens. They
 * declare attributes taking any Telos individual (at any level of
 * Telos instantiation) or primitive literal as a target. They can
 * inherit them from other simple classes. <code>TOKEN</code> is the
 * builtin simple class, of which all other simple classes are Telos
 * subclasses and all tokens are Telos
 * instances. <code>SIMPLE_CLASS</code> is the unique builtin
 * metaclass for each KB, of which all simple classes are direct Telos
 * instances (by default). The latter is accessed by the method
 * <code>SIMPLE_CLASS()</code> in the interface <code>KB</code>.
 *
 * <h2>Metaclasses</h2>
 *
 * <p>Metaclasses are instantiated by simple classes. Invoking the
 * <code>level()</code> method on them returns the constant
 * <code>METACLASS_LEVEL</code> in the <code>Levels</code>
 * interface. They declare attributes taking any Telos individual (at
 * any level of Telos instantiation) or primitive literal as a target.
 * They are also instances of Metameatclasses which are represented by
 * <code>Individuals</code>'s with <code>level()</code> equal to
 * <code>M2CLASS_LEVEL</code>. <code>SIMPLE_CLASS</code> is the
 * supreme builtin metaclass, from which all other metaclasses inherit
 * (Telos inheritance) and of which all simple classes are Telos
 * instances. <code>METACLASS</code> is the supreme builtin M2class,
 * of which all metaclasses are direct Telos instances (by default).
 * 
 * <p>This interface also describes several methods for adding or
 * setting data values in an Telos individual. The <code>set</code>
 * methods assign values to the individual's properties. The
 * <code>add</code> methods add data values to the current set of
 * values. 
 *
 * @see PrimitiveLiteral
 * @see KB#STRING_TYPE()
 * @see KB#INTEGER_TYPE()
 * @see KB#REAL_TYPE()
 * @see KB#M3CLASS()
 * @see KB#M2CLASS()
 * @see KB#METACLASS()
 * @see KB#SIMPLE_CLASS()
 * @see KB#TOKEN()
 * @see Levels
 **/
public interface Individual extends TelosObject, IndividualOrLiteral {



  //==========================================================================
  // PUBLIC TELL METHODS
  //==========================================================================

  /** Adds to the list of "direct ancestors" of this individual and
   * adds this individual to the "instances" list of each of the (new)
   * direct ancestors. The ancestors can be retrieved by invoking the
   * <code>directAncestors()</code> method this interface on this
   * individual. The instances of any individual can be retrieved by
   * invoking the <code>instances()</code> method of this interface on
   * that individual.
   *
   * @see jtelos.Individual#directAncestors()
   * @see jtelos.Individual#instances()
   **/
  public void 
  addDirectAncestorsWithInverses(Individual[] newDirectAncestors);  

  /** Adds to the list of "direct parents" of this individual and adds
   * this individual to the "directChildren</code> list of each of the
   * new parents. The direct parents of an individual can be retrieved
   * by invoking the <code>directParents()</code> method of this
   * interface. The direct children of any individual can be retrieved
   * by invoking the <code>instances()</code> method of this interface
   * on that individual.
   *
   * Adds to the values of the direct children of this individual. These
   * can be retrieved by invoking the <code>directChildren()</code>
   * method of the superinterface <code>Individual</code>.
   *
   * @see jtelos.Individual#directParents()
   * @see jtelos.Individual#directChildren()
   **/
  public void 
  addDirectParentsWithInverses(Individual[] newDirectParents);  

  /** All the attributes declared or inherited by this individual.
   * This should be the disjoint union of the arrays returned by
   * <code>directAttrs()</code> and <code>inheritedAttrs()</code>.
   *
   * @see #directAttrs()
   * @see #inheritedAttrs()
   **/
  public Attribute[] attrs();  

  /** 
   * The attributes in the categories named in the first
   * parameter, whose label also matches the second parameter. These
   * may be directly declared by this individual, <em>or</em> they may
   * be inherited. Note that:
   *
   * <p><ol>
   * <li>the non-primitive individual declaring an attribute,
   * <li>the labels of the attribute's categories, and 
   * <li>the label of the attribute
   * </ol>
   *
   * <p>are <em>not</em> sufficient to distinguish a unique attribute.
   * These may be the same for two attributes, as long as they have
   * distinct <em>targets</em>. Taken together all four factors
   * distinguish a unique attribute in a KB.
   *
   *
   * <p>When the Java value <code>null</code> is passed as a
   * <code>label</code> argument, the method behaves differently: Then
   * the method returns <em>all</em> the attributes in the categories
   * whose labels match the <code>catLabels</code> parameter, ignoring
   * their <code>label()</code> values. These may be directly declared
   * by this individual, <em>or</em> they may be inherited.
   *
   * <p>For instance, take the following simple classes:
   *
   * <p><pre>   SimpleClass MySimpleClass
   *        WITH
   *            myAttributeCategory
   *                myAttribute : String
   *   END</pre>
   * <pre>   SimpleClass MySimpleClass2
   *       ISA MySimpleClass
   *       WITH
   *           myAttributeCategory
   *               myAttribute2 : Integer
   *   END</pre>
   *
   * <p>Say we invoke
   * <code>attrs(String[]{"myAttributeCategory"},null)</code> on the
   * Java object representing <code>MySimpleClass2</code>. The method
   * should return an array containing <code>myAttribute2</code>
   * (which is declared by the simple class) and
   * <code>myAttribute</code> (which is inherited).
   *
   * @exception AttributeNotFoundException when there is no attribute
   * whose categories match <em>all</em> of the category labels in
   * <code>catLabels[]</code> and whose label matches
   * <code>attrLabel</code> (if it is not null). If
   * <code>attrLabel</code> is null, an
   * <code>AttributeNotFoundException</code> is thrown when there is
   * no directly declared <em>or</em> inherited attribute whose
   * categories match all of the category labels in
   * <code>catLabels[]</code>.
   **/
  public Attribute[] attrs(String[] catLabels, String attrLabel);  

  /** The individuals of which this individual is an explicit Telos
   * instance. This will always include the KB instance of a builtin:
   * <code>TOKEN</code> for tokens, <code>SIMPLE_CLASS</code> for
   * simple classes, <code>METACLASS</code> for metaclasses,
   * <code>M2CLASS</code> for M2classes, and <code>M3CLASS</code> for
   * M3classes. This method corresponds to the relation
   * <code>IN</code>. This method is also the inverse of the method
   * <code>instances()</code> in this interface.
   *
   * <p>This does not return individuals that are parents of the
   * direct ancestors. An additional method could be written for this
   * that returns the direct ancestors and the transitive closure over
   * their parents. It could be called <code>allAncestors</code>, as
   * is done in the subinterface called
   * <code>ExtendedIndividual</code>.
   *
   * @see Relations#IN
   * @see #instances()
   * @see ExtendedIndividual#allAncestors()
   **/
  public Individual[] directAncestors();  

  /** The attributes directly declared by this individual. This
   * method corresponds to the relation <code>ATTR</code>. It is the
   * inverse of the method <code>declarer()</code> in the interface
   * <code>Attribute</code>.
   *
   * @see Relations#ATTR
   * @see Attribute#declarer()
   **/
  public Attribute[] directAttrs();  

  /**  This is similar to <code>attrs(String[],String)</code> but with
   * the restriction that the returned array only contains directly
   * declared attributes. Passing <code>null</code> as the
   * <code>attrLabel</code> parameter makes the method only match on
   * catLabels, ignoring label values of the returned attributes.
   *
   * @see #attrs(java.lang.String[],java.lang.String)
   *
   * @exception AttributeNotFoundException when there is no directly
   * declared attribute whose categories match <em>all</em> of the
   * category labels in <code>catLabels[]</code> and whose label
   * matches <code>attrLabel</code> (if it is not
   * <code>null</code>). If <code>attrLabel</code> is null, it throws
   * an <code>AttributeNotFoundException</code> if there is no match
   * on the category labels.
   **/
  public Attribute[] directAttrs(String[] catLabels, String attrLabel);  

  /** The individuals directly inheriting from this individual. This
   * corresponds to the relation <code>ISA_INV</code>. This
   * method is the inverse of the method <code>directParents</code>
   * in this interface.
   * 
   * <p>This does not return individuals that are children of the
   * direct children. An additional method could be written for this
   * that returns the direct ancestors and the transitive closure over
   * their children. It could be called <code>allChildren</code>, as
   * is done in the subinterface called
   * <code>ExtendedIndividual</code>.
   *
   * @see Relations#ISA_INV
   * @see #directParents()
   * @see ExtendedIndividual#allChildren()
   **/
  public Individual[] directChildren();  

  /** The individuals that this individual directly inherits from in
   * Telos. This corresponds to the relation <code>ISA</code>. This
   * method is the inverse of the method <code>directChildren</code>
   * in this interface.
   *
   * <p>This does not return individuals that are parents of the
   * direct parents. An additional method could be written for this
   * that returns the direct ancestors and the transitive closure over
   * their parents. It could be called <code>allParents</code>, as
   * is done in the subinterface called
   * <code>ExtendedIndividual</code>.
   *
   * @see Relations#ISA
   * @see #directChildren()
   * @see ExtendedIndividual#allParents()
   **/
  public Individual[] directParents();  

  /**
   * The attributes inherited by this individual. When this method is
   * invoked on a <code>Token</code> it must return an empty array
   * (tokens to not inherit). 
   *
   * <p>This method can be implemented quite simply, despite the fact
   * that its semantics are complicated. A static method
   * <code>inheritedAttrs(Individual)</code> in the Class
   * <code>StaticHelper</code> will take an individual as an argument
   * and return its inherited atteributes. See the discussion in that
   * class's documentation.
   *
   * @see StaticHelper#inheritedAttrs(jtelos.Individual)
   **/
  public Attribute[] inheritedAttrs();  

  /** This is similar to <code>attrs(String[],String)</code> but with
   * the restriction that the returned array only contains inherited
   * attributes. Passing <code>null</code> as the
   * <code>attrLabel</code> parameter makes the method only match on
   * catLabels, ignoring label values of the returned attributes. When
   * this method is invoked on a <code>Token</code> it must return an
   * empty array (tokens to not inherit).
   *
   * @see #attrs(java.lang.String[],java.lang.String)
   * 
   * @exception AttributeNotFoundException when there is no inherited
   * attribute whose categories match <em>all</em> of the category
   * labels in <code>catLabels[]</code> and whose label matches
   * <code>attrLabel</code>(if it is not
   * <code>null</code>). If <code>attrLabel</code> is null, it throws
   * an <code>AttributeNotFoundException</code> if there is no match
   * on the category labels.
   **/
  public Attribute[] inheritedAttrs(String[] catLabels, String attrLabel);  

  /** The individuals instantiating this individual. This corresponds
   * to the relation <code>IN_INV</code>. This method is the inverse
   * of the method <code>directAncestors</code> in this inteface.
   *
   * <p>There is no such thing as an indirect instance in Telos. For
   * example, if simple class <code>A</code> is an Telos instance of
   * metaclass <code>B</code> and simple class <code>C</code> is a
   * Telos subclass (child) of <code>A</code>, then <code>C</code> is
   * not an instance of </code>B</code> unless explicitly declared to
   * be so. Thus this method is not called
   * <code>directInstances</code>, and their can be no
   * <code>allInstances</code> method to extend this interface.
   *
   * @see Relations#IN_INV
   * @see #directAncestors()
   **/
  public Individual[] instances();  

  /**
   * This method tells whether the Java object representing this
   * individual was constructed with data from a full declaration or
   * whether it was "partially constructed" (ie. without knowing what
   * model it belongs to or what level of Telos instantiation it has).
   * Partial construction is possible from the pseudoconstructor
   * <code>possilbyUndeclaredNew(String)</code> in the interface
   * <code>KB</code> in this interface. Once the declaration is
   * found, the level can be set with <code>setLevel(int)</code>.
   *
   * @see KB#possiblyUndeclaredNew(java.lang.String)
   * @see #setLevel(int)
   **/
  public boolean isDeclared();  

  //==========================================================================
  // PUBLIC ASK METHODS
  //==========================================================================

  /**
   * The level of Telos instantiation of this individual. The integer
   * corresponds to one of the values defined in the
   * <code>Levels</code> interface.
   *
   * @see Levels
   **/
  public int level();  

  /**
   * The attributes that reference this individual in the KB. There is
   * no equivalent lookup operation supported for primitive
   * literals. This corresponds to the <code>TO_INV</code> relation.
   *
   * @see Relations#TO_INV
   **/
  public Attribute[] referencedBy();  

  /** Removes an ancestor from this individual's "direct ancestors"
   * list and removes this individual from that ancestor's "instances"
   * list. Note it does not remove the ancestor from the KB.
   *
   * <p><b>Preconditions:</b> Neither this individual nor the removed
   * ancestor can be builtins. Also, this individual cannot have
   * instances.
   *
   * <p><b>Implementation details:</b> When the KB runs in
   * <code>Persistent</code> mode, categories are usually calculated
   * dynamically (their values are not cached). So when the ancestor
   * is removed, this may change the result returned, but not render
   * the KB inconsistent.
   **/
  public void removeDirectAncestorWithInverse(Individual ancestor);  

  //==========================================================================
  // PUBLIC UNTELL METHODS
  //==========================================================================

  /** This deletes the declared attribute. Note that since each
   * attribute is declared by only one individual, this also deletes
   * the attribute from the KB.
   *
   * <p><b>Preconditions</b>: Neither the attribute nor this
   * individual can be a builtin. There cannot be any instances <em>of
   * the removed attribute</em> in the KB. When the attribute is
   * removed, all instances of it would lose a category (potentially
   * their <em>only</em> category), which would make them illegal
   * attributes. So instances of this individual may exist, as long as
   * they do not hold instances of the removed attribute. Also there
   * cannot be any instances of the individual declaring the removed
   * attribute.
   *
   * <p><b>Implementation details</b>: If the KB is running in
   * <code>Persistent</code> mode, the <code>instances()</code>,
   * <code>categories()</code>, <code>directlyNarrows()</code> and
   * <code>directlyNarrowedBy()</code> methods of the interface
   * <code>Attribute</code> should be calculated dynamically
   * (ie. there values should not be cached), unless there is a
   * sophisticated change propagation system in place that propagates
   * change in the body of this method immeditaely. When an attribute
   * is removed, its categories will lose an instance and any
   * attributes that narrow it or are narrowed by it will lose an
   * attribute from the result of <code>directlyNarrows()</code> or
   * <code>directlyNarrowedBy()</code>.
   **/
  public void removeDirectAttr(Attribute attr);  

  /** Removes a parent from this individual's "direct direct" list and
   * removes this individual from that parent's "direct children"
   * list. Note it does not remove the parent from the KB. Note also,
   * that since <code>ISA</code> is a transitive relation and Telos
   * supports multiple inheritance, the removed parent may still be a
   * <em>indirect</em> parent of this individual. For instance, this
   * happens when an unremoved parent's parent is the removed direct
   * parent.
   *
   * <p><b>Implementation details:</b> When the KB runs in
   * <code>Persistent</code> mode, inherited attributes are usually
   * calculated dynamically (their values are not cached). So when the
   * parent is removed, this may change the result returned, but not
   * render the KB inconsistent.
   **/
  public void removeDirectParentWithInverse(Individual ancestor);  

  public void setDeclared(boolean isDeclared);  

  /**
   * This method is used in some implementations but needn't be
   * supported in all of them. In some implementations, the level of
   * Telos instantiation of an individual is not known when that
   * individual is instantiated <em>in Java</em>. The value assigned
   * by this method would be retrieved by the method
   * <code>level()</code> in the interface <code>Individual</code>.
   *
   * @see jtelos.Individual#level()
   **/
  public void setLevel(int level);  

}