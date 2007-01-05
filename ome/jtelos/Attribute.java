
package jtelos;


/**   This interface represents Telos attributes. These are <em>first
 * class objects</em> in Telos. They are declared by any non-primitive
 * individuals (tokens, simple classes, metaclasses, metametaclasses,
 * etc. and the omegaclass <code>INDIVIDUAL</code>). (In this API, the
 * Telos omegaclass "<code>Individual</code>" is represented by
 * <code>INDIVIDUAL</code>, which is the Java object returned by the
 * <code>INDIVIDUAL()</code> Java instance method in the interface
 * <code>KB</code>). They can also be inherited (in Telos) by
 * non-primitive individuals (other than tokens). When primitive types
 * are subclassed (in Telos), their simple subclasses can also declare
 * attributes even if their parents don't.
 *
 * <p>Also each attribute has a target, which is the individual or
 * primitive literal that the attribute "points to". The level of
 * instantiation of an attribute's target is independent of the level
 * of instantiation of its declarer. A token can declare an attribute
 * that takes an M4class (a Metametametametaclass) as its
 * target. Similarly, a Meclass can declare an attribute that points
 * to the Telos Integer literal '5'.
 * 
 * <p>Each Attribute has a level of (Telos) instanciation just as each
 * individual does. Attributes are Telos instances of other
 * attributes. The level of instantiation of an attribute is <em>not
 * indicated by the level of its declaring individual</em>. Instead it
 * is indicated by the level of the target. For instance, if the the
 * target is a token or primitive literal, the attribute cannot be
 * instantiated further. An attribute's ancestors are called its
 * <em>categories</em>. The word "category" is a relative term (like
 * "instance"): one attribute (at some level of instantiation) is the
 * category to another (at the immediately lower level of
 * instantiation). Similarly the second attribute is the Telos
 * instance of the first.
 *
 * <p>Say individual <code>A</code> declares an attribute and individual
 * <code>B</code> is a Telos instance of A. It may declare an
 * attribute whoses category is A's attribute. Similarly B's
 * attribute's target will be an instance of A's attribute's
 * target. If a simple class declares an attribute, its tokens may
 * have attributes that are instances of it. Thus relative to the some
 * of the attributes in the token, the attribute in the simple class
 * is the <em>category</em>. This instantiation relationship consists
 * of the relations <code>IN</code> and <code>IN_INV</code>.
 *
 * <p><b>In this API, attributes are constructed by a method in the
 * <code>KB</code> interface, not by a public constructor</b>. The
 * method is called
 * <code>newAttribute(Individual,String[],String,IndividualOrLiteral)</code>. The
 * documentation for it details how its semantics vary from a normal
 * constuctor. It also functions to add the new attribute to its
 * declarer's "direct attributes" list and to its' target's
 * "referenced by" list.
 *
 * <p>There are four builtin <em>attribute classes</em> in this API
 * (and in Telos). Attribute classes have omegaclasses as their
 * target. The builtin attribute classes are all declared by the
 * builtin omegaclass <code>Individual</code> in the Telos
 * language. In this API, the Telos omegaclass <code>Individual</code>
 * is represented by the Java object <code>INDIVIDUAL</code>. It is
 * capitalized since there is also a Java class
 * <code>Individual</code> in this API. There is a unique Java
 * instance for <code>INDIVIDUAL</code> for each Telos KB in the
 * repository. The attribute's it declares are
 * <code>attributeclass</code>, <code>attribute</code>,
 * <code>single</code> in the Telos language. These are represented by
 * the Java classes <code>ATTRIBUTE_CLASS</code>,
 * <code>ATTRIBUTE</code> and <code>SINGLE</code> respectively. These
 * also hold unique Java instances for each Telos KB. Any individual
 * in Telos can declare any of its attributes in
 * <code>attribute</code> or <code>single</code> as their categories.
 *
 * <p><center><img src=Attribute.gif></center>
 *
 * @see Individual
 * @see IndividualOrLiteral
 * @see KB#INDIVIDUAL()
 * @see KB#ATTRIBUTE_CLASS()
 * @see KB#ATTRIBUTE()
 * @see KB#SINGLE()
 * @see Relations
 **/
public interface Attribute extends TelosObject {



  /** 
   * This returns an array of attributes of which this attribute a
   * Telos instance. Thus they are <em>categories</em> of this
   * attribute This method corresponds to the relation
   * <code>IN</code>.
   *
   * <p>When a KB implementation runs in <code>Persistent</code> mode,
   * this method may be calculated dynamically from the Telos object
   * graph. A static method <code>categories(Attribute)</code> is
   * supplied in <code>StaticHelper</code> to perform this
   * calculation. When a KB implementation runs in <code>Cache</code>
   * mode, the result is simply supplied by the external KB.
   *
   * @see Relations#IN
   * @see StaticHelper#categories(jtelos.Attribute)
   **/
  public Attribute[] categories();  

  /**  These are the labels of the categories that this attribute
   * instantiates. This attribute may be in several categories sharing
   * the same label. So the number of labels will always be less than
   * or equal to the number of categories for this attribute. The
   * <code>categories()</code> method in this interface returns an
   * array of the actual categories.
   *
   * @see #categories()
   **/
  public String[] catLabels();  

  //==========================================================================
  // PUBLIC TELL METHODS
  //==========================================================================

  /** The individual declaring this attribute (its "source). This
   * could be a a token, a simple class, metaclass, metametaclass,
   * etc. or omegaclass. The declarer cannot be a Telos primitive type
   * (e.g. <code>String</code>, <code>Integer</code> or
   * </code>Real</code> in the Telos language) since they have no
   * attributes. It corresponds to the relation <code>FROM</code>.
   *
   * @see Relations#FROM
   **/
  public Individual declarer();  

  /** This returns an array of attributes which directly narrow this
   * attribute. So this attribute is a parent of those children. This
   * attribute's target will be a parent (a Telos superclass) of
   * <em>each</em> of the narrowing attributes' targets. This method
   * corresponds to the relation <code>ISA_INV</code>. If this
   * attribute's target is a token, this method will return an empty
   * array since attributes targetting tokens do not display
   * inheritance characteristics.
   * 
   * <p>When a KB implementation runs in <code>Persistent</code> mode,
   * this method may be calculated dynamically from the Telos object
   * graph. A static method <code>directlyNarrowedBy(Attribute)</code> is
   * supplied in <code>StaticHelper</code> to perform this
   * calculation. When a KB implementation runs in <code>Cache</code>
   * mode, the result is simply supplied by the external KB.
   *
   * <p>Note that certain implementations of this API may also define
   * <code>allNarrowedBy()</code> which calculates the transitive
   * closure over <code>ISA_INV</code>.
   *
   * @see Relations#ISA_INV
   **/
  public Attribute[] directlyNarrowedBy();  

  /** This returns an array of attributes which this attribute
   * narrows. So this attribute is a child of these parents. This
   * attribute's target will be a child (a Telos subclass) of
   * <em>all</em> of the narrowed attributes' targets. This method
   * corresponds to the relation <code>ISA</code>. If this attribute's
   * target is a token, this method will always return an empty array
   * since attributes at the token level of instantiation do not
   * display inheritance characteristics.
   * 
   * <p>When a KB implementation runs in <code>Persistent</code> mode,
   * this method may be calculated dynamically from the Telos object
   * graph. A static method <code>directlyNarrows(Attribute)</code> is
   * supplied in <code>StaticHelper</code> to perform this
   * calculation. When a KB implementation runs in <code>Cache</code>
   * mode, the result is simply supplied by the external KB.
   *
   * <p>Note that certain implementations of this API may also provide
   * <code>allNarrows()</code> which calculates the transitive closure
   * over <code>ISA</code> for this attribute.
   *
   * @see Relations#ISA
   **/
  public Attribute[] directlyNarrows();  

  /** The attributes that instantiate this attribute. This corresponds
   * to the <code>IN_INV</code> relation. This attribute is thus one
   * of their <em>categories</em>.
   *
   * <p>When a KB implementation runs in <code>Persistent</code> mode,
   * this method may be calculated dynamically from the Telos object
   * graph. A static method <code>instances(Attribute)</code> is
   * supplied in <code>StaticHelper</code> to perform this
   * calculation. When a KB implementation runs in <code>Cache</code>
   * mode, the result is simply supplied by the external KB.
   *
   * @see Relations#IN_INV
   * @see StaticHelper#instances(jtelos.Attribute)
   **/
  Attribute[] instances();  

  /** This is a shorter name than <code>telosName()</code>. The
   * <code>telosName()</code> of an attribute includes, as a prefix,
   * the name of the declaring individual (metametametaclass,
   * metametaclass, metaclass, simple class or token), the category
   * labels and the target. The string returned by
   * <code>label()</code>, by contrast, does not include this prefix.
   *
   * @see NamedObject#telosName()
   **/
  public String label();  

  /** This returns a single Telos individual (primitive or
   * nonprimitive) or a primitive literal. If it is an individual it
   * must be an instance of the targets of <em>all</em> this
   * attribute's categories. If this attribute narrows other
   * attributes, this target must be a <em>child</em> (a Telos
   * subclass) of <em>all</em> the narrowed attribute's targets. This
   * method corresponds to the relation <code>TO</code>.
   *
   * @see Relations#TO 
   **/
  public IndividualOrLiteral target();  

}