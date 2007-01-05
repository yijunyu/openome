
package jtelos;


/** This interface is never used. It provides an overview of this
 * package for JavaDoc.
 *
 * <h2>Introduction</h2>
 * 
 * <p>The package <code>jtelos</code> is an Application
 * Programming Interface (API) meant to describe the Telos data model
 * in Java -- especially with regard to the <code>ASK</code> operation
 * in the Telos language. Here telos objects (primitive and
 * non-primitive individuals and attributes) are represented as Java
 * interfaces. Builtin Telos objects (omegaclasses, primitive types
 * and other builtin individuals for each level of Telos
 * instantiation) are available through an interface <code>KB</code>
 * which has a method that returns one of these builtins. Certain
 * detailed aspects of the Telos data model are not included. For
 * instance, the atomic propositions upon which Telos is based are not
 * mentioned here (although the omegaclass <code>Proposition</code> is
 * implemented). The data model described most closely resembles that
 * of the C++ implementation of a Telos compiler/repository built by
 * Martin Stanley and Iannis Tourlakis and others at University of
 * Toronto. Thus the temporal and constraint aspects of the language
 * are also omitted. What remains is the semantic aspects:
 * classification/instantiation, generalization/specialization and
 * attribution (often called aggregation).
 *
 * <p>In this API Java inheritance does not correspond to inheritance
 * in Telos. Both inheritance and instantiation in Java are orthogonal
 * to inheritance and instantiation in Telos. Because of this, the API
 * JavaDoc will try and distinguish the two types of instantiation
 * everywhere. Non-primitive individuals (Telos tokens, simple
 * classes, metaclasses, metametaclasses, etc.  and omegaclasses)
 * declare attributes.  The primitive types do not, although, since
 * they are considered simple classes, they can be subclassed (in
 * Telos) so their children declare attributes. Attributes take
 * individuals (primitive or non-primitive) or primitive literals as
 * their targets. For instance, consider the following declaration in
 * the Telos language:
 *
 *<pre>   Token MyToken 
 *       IN MySimpleClass
 *       WITH
 *           myAttributeValue : "Scott's token"
 *   END</pre>
 *
 * In the above declaration the token <code>MyToken</code> declares an
 * attribute with the label <code>myAttributeValue</code> which takes
 * the string literal <code>"Scott's token"</code> as its target. The
 * token is also a Telos instance of the simple class
 * <code>MySimpleClass</code>.
 *
 * <h2>Individuals</h2>
 *
 * Most of the non-primitive Telos individuals defined in this API are
 * represented by the <a href="jtelos.Individual.html#_top_">
 * <code>Individual</code></a>. User-declared Telos individuals must
 * implement this interface. Discussions of the omegaclasses,
 * primitive types and other builtin individuals occur below.
 *
 * <h2>Attributes</h2>
 *
 * These are the Telos attributes which are declared by the
 * non-primitive individuals. True to the Telos language definition,
 * these are <em>first class objects</em>. The interface <a
 * href="jtelos.Attribute.html#_top_"><code>Attribute</code></a>
 * represents these in this API. Attributes each have a single target
 * which is either an individual or primitive literal. The level of
 * Telos instantiation of the declaring individual does not limit in
 * any way the level of instantiation of the target. An attribute in a
 * Token can point to an omegaclass and an attribute in an M3class can
 * point to a token.
 *
 *<pre>   SimpleClass MySimpleClass
 *       WITH
 *           attribute
 *               myAttribute : String;
 *               myAttributeValue : "My String"
 *   END</pre>
 *
 * Here the attribute <code>myAttributeValue</code> has the string
 * literal <code>"My String"</code> as its target. In addition there
 * is an attribute <code>myAttribute</code> which takes the string
 * <em>type</code> as its target.
 *
 * <h2>Implementing Arbitrary Levels of Telos Instantiation in Java</h2>
 *
 * <p>The Java interfaces <code>Individual</code> and
 * <code>Attribute</code> have a method <code>level()</code> that
 * returns one of the following values. They indicate the level of
 * instantiation. More levels between <code>OMEGACLASS_LEVEL</code>
 * and <code>M4CLASS_LEVEL</code> could be implemented if needed:
 *
 * <p><ul>
 * <li><a href="jtelos.Levels.html#TOKEN_LEVEL">
 * <code>TOKEN_LEVEL</code></a>
 * <li><a href="jtelos.Levels.html#SIMPLE_CLASS_LEVEL">
 * <code>SIMPLE_CLASS_LEVEL</code></a>
 * <li><a href="jtelos.Levels.html#METACLASS_LEVEL">
 * <code>METACLASS_LEVEL</code></a>
 * <li><a href="jtelos.Levels.html#M2CLASS_LEVEL">
 * <code>M2CLASS_LEVEL</code></a>
 * <li><a href="jtelos.Levels.html#M3CLASS_LEVEL">
 * <code>M3CLASS_LEVEL</code></a>
 * <li><a href="jtelos.Levels.html#M4CLASS_LEVEL">
 * <code>M4CLASS_LEVEL</code></a>
 * <li><a href="jtelos.Levels.html#M5CLASS_LEVEL">
 * <code>M5CLASS_LEVEL</code></a> (not currently supported in this API)
 * <li><a href="jtelos.Levels.html#M6CLASS_LEVEL">
 * <code>M6CLASS_LEVEL</code></a> (not currently supported in this API)
 * <li><a href="jtelos.Levels.html#M7CLASS_LEVEL">
 * <code>M7CLASS_LEVEL</code></a> (not currently supported in this API)
 * <li><a href="jtelos.Levels.html#M8CLASS_LEVEL">
 * <code>M8CLASS_LEVEL</code></a> (not currently supported in this API)
 * <li><a href="jtelos.Levels.html#OMEGACLASS_LEVEL">
 * <code>OMEGACLASS_LEVEL</code></a>
 * </ul>
 *
 * <p>These are static final <code>int</code>'s taken from an
 * interface <a
 * href="jtelos.Levels.html#_top_"><code>Levels</code></a>. (Note
 * that we do not assign any ordering to the <code>int</code>'s
 * themselves. <b>Do not use comparison operators on them.</b>)
 *
 * <h2>Non-Omegaclass Builtin Individuals</h2>
 * 
 * <P>In the Telos language, for each level of instantiation above
 * <code>TOKEN_LEVEL</code>, there needs to be an individual which is
 * the ancestor of all individuals at the next lower level. Also there
 * needs to be an individual that does not inherit from any parent
 * (ie. Telos inheritance). This latter individual can be used as a
 * default parent when an individual is declared with no parent. Thus
 * every individual at that level of Telos instantiation will inherit
 * from either that <em>supreme</em> individual for that level, or one
 * of that individual's children. For instance, every token is an
 * instance of the simple class <code>TOKEN</code> which is a builtin
 * in the Telos language. Thus all simple classes inherit from
 * <code>TOKEN</code> or one of its children. Here are all of the
 * non-omegaclass builtin individuals and their levels of Telos
 * instantiation. They are returned by the following methods in the
 * interface <code>KB</code>:
 *
 * <p><ul>
 * <li><a href="jtelos.KB.html#M3CLASS()">
 * <code>M3CLASS()</code></a> (the M4class of which all M3classes are 
 * Telos instances -- it is called <code>M3Class</code> in the Telos language)
 *
 * <li><a href="jtelos.KB.html#M2CLASS()">
 * <code>M2CLASS()</code></a> (the M3class of which all M2classes are
 * Telos instances, and the default parent for M3classes -- it is
 * called <code>M2Class</code> in the Telos language)
 *
 * <li><a href="jtelos.KB.html#METACLASS()">
 * <code>METACLASS()</code></a> (the M2class of which all metaclasses
 * are Telos instances, and the default parent for M2classes -- it is
 * called <code>M1Class</code> in the Telos language)
 *
 * <li><a href="jtelos.KB.html#SIMPLE_CLASS()">
 * <code>SIMPLE_CLASS()</code></a> (the metaclass of which all simple
 * classes are Telos instances, and the default parent for metaclasses
 * -- it is called <code>SClass</code> in the Telos language)
 *
 * <li><a href="jtelos.KB.html#TOKEN()">
 * <code>TOKEN()</code></a> (the simple class of which all tokens are
 * Telos instances, and the default parent for simple classes -- it is
 * called <code>Token</code> in the Telos language) 
 * </ul>
 *
 * <h2>Omegaclasses</h2>
 *
 * There is also a "top" level of Telos instantiation, the
 * omegaclasses which generally have the property of being an
 * instances of themselves. Here are the methods in <code>KB</code>
 * that return them:
 *
 * <p><ul>
 *
 * <li><a href="jtelos.KB.html#PROPOSITION()">
 * <code>PROPOSITION()</code></a>
 * which has all propositions as Telos instances, including itself,
 *
 * <li><a href="jtelos.KB.html#CLASS()">
 * <code>CLASS()</code></a> which has all classes as Telos instances,
 * including itself
 *
 * <li><a href="jtelos.KB.html#INDIVIDUAL()">
 * <code>INDIVIDUAL()</code></a>
 * which has all individuals as Telos instances, including itself,
 *
 * <li><a href="jtelos.KB.html#INDIVIDUAL_CLASS()">
 * <code>INDIVIDUAL_CLASS()</code></a>
 * which has all individual classes as instances, including itself, 
 * and
 *
 * <li><a href="jtelos.KB.html#OMEGACLASS()">
 * <code>OMEGACLASS()</code></a> which has all omegaclasses as Telos
 * instances, including itself.
 *
 * </ul>
 *
 * <h2>Attribute classes</h2>
 *
 * <p>There are also attribute classes which are attributes that take
 * omegaclasses as their target. Here are the methods in the interface
 * <code>KB</code> that return each of them:
 *
 * <p><ul>
 * <li><a href="jtelos.KB#ATTRIBUTE_CLASS()">
 * <code>ATTRIBUTE_CLASS()</code></a>
 * <li><a href="jtelos.KB#ATTRIBUTE()">
 * <code>ATTRIBUTE()</code></a>
 * <li><a href="jtelos.KB#SINGLE()">
 * <code>SINGLE()</code></a>
 * </ul>
 *
 * <h2>Representing the Telos Data Model using Relations</h2>
 *
 * <p>There is another interface defining static final
 * <code>int</code>'s. <a
 * href="jtelos.Relations.html"><code>Relations</code></a>
 * attempts to describe the Telos data model as a set of typed binary
 * relations. These relations can be used to implement the API over a
 * relational persistence mechanism (e.g. JDBC-compliant DBMS's or
 * OODBMS's).
 *
 * <p>These relations represent classification (<a
 * href="jtelos.Relations.html#IN"><code>IN</code></a>),
 * generalization (<a
 * href="jtelos.Relations.html#ISA"><code>ISA</code></a>) and
 * aggregation (<a
 * href="jtelos.Relations.html#ATTR"><code>ATTR</code></a>, <a
 * href="jtelos.Relations.html#FROM"><code>FROM</code></a>, and
 * <a href="jtelos.Relations.html#TO"><code>TO</code></a>). Also
 * there are inverses of <a
 * href="jtelos.Relations.html#IN_INV"><code>IN_INV</code></a>,
 * <a
 * href="jtelos.Relations.html#ISA_INV"><code>ISA_INV</code></a>
 * and <a
 * href="jtelos.Relations.html#TO_INV"><code>TO_INV</code></a>.
 * <code>ATTR</code> and <code>FROM</code> are inverses of each
 * other. There are <b>E-R diagrams</b> throughout the JavaDoc of this
 * package that illustrate how these relations can be used in the
 * Telos data model.
 *
 * <h2>Primitive Types and Literals</code>
 *
 * <p>There are three kinds of primitives in the Telos language:
 * <code>Integer</code>, <code>Real</code> and <code>String</code>.
 * At the simple class level there are three builtin primitive
 * <em>types</em> in Telos. These are returned in the API by three
 * methods in the interface <code>KB</code>:
 * 
 * <p><ul>
 * <li><a href="jtelos.KB#STRING_TYPE()">
 * <code>STRING_TYPE()</code></a>,
 * <li><a href="jtelos.KB#INTEGER_TYPE()">
 * <code>INTEGER_TYPE()</code></a> and
 * <li><a href="jtelos.KB#REAL_TYPE()">
 * <code>REAL_TYPE()</code></a>.
 * </ul>
 *
 * These are Java classes that represent <code>KBSingleton</code>'s
 * (Telos individuals that have only one Java instance in a KB). They
 * are also the types of which integer and string literals are
 * (loosely speaking) Telos "instances". These literals are Java
 * instances of the Java classes:
 *
 * <p><ul>
 * <li><a href="jtelos.TelosString.html#_top_">
 * <code>TelosString</code></a> (e.g. <code>"My string"</code>),
 * <li><a href="jtelos.TelosInteger.html#_top_">
 * <code>TelosInteger</code></a> (e.g. <code>5</code>) and
 * <li><a href="jtelos.Real.html#_top_">
 * <code>Real</code></a> (e.g. <code>0.5</code>).
 * </ul>
 *
 * <p>Primitive literals are not considered individuals in Telos. Thus
 * they do not declare attributes. 
 * 
 * <p>But note also that a user may define individuals like:
 *
 *<pre>   Token MyString
 *       IN String
 *       WITH
 *           attribute
 *               myAttrVal: "My String literal"
 *   END</pre>
 *
 *<pre>   Token MyInteger
 *       IN Integer
 *       WITH
 *           attribute
 *               myAttrVal: 5
 *   END</pre>
 *
 *<pre>   Token MyReal
 *       IN Real
 *       WITH
 *           attribute
 *               myAttrVal: 0.5
 *   END</pre>
 *
 * These are <em>also</em> valid Telos instances of the three
 * respective primitive types.
 *
 * <p>It should also be mentioned that the primtive types are
 * considered simple classes in Telos and can thus be extended. The
 * builtin primitive types declare no attributes, but since all
 * individuals are instances of builtins that declare the attribute
 * classes <code>ATTRIBUTE</code> and <code>SINGLE</code> the Telos
 * subclasses of primitive types can declare attributes in these
 * categories.
 *
 * <h2>Telos Naming in Java</h2>
 * 
 * <p>Naming Telos individuals and attributes in this Java package
 * (and packages that implement the interfaces/abstract classes here)
 * occurs in two ways:
 *
 * <p>Non-primitive individuals (tokens, simple classes, metaclasses,
 * M2classes, M3classes and so on) have names as they would appear in
 * an input file to the C++ implementation of the Telos
 * compiler/repository. For instance:
 *
 *<pre>   Token MyToken 
 *       IN MySimpleClass
 *       WITH
 *           myAttributeValue : "Scott's token"
 *   END</pre>
 *
 * would have the label (name) <code>MyToken</code> in the C++
 * implementation. Here "label" is meant in the same sense as in Telos
 * propositions. In this Java package, this name is returned as a Java
 * string by the method <code>telosName()</code>. This method is
 * inherited (in Java) by all the individuals (primitive or not) and
 * all the attributes as well. 
 *
 * <p>For attributes and attribute classes, the name is composed of:
 * 
 * <p><ol><li>The Telos name of the attribute's declarer, followed by
 * <li>a ".", followed by
 * <li>the labels of its categories (each separated by a 
 * comma), followed by
 * <li>a ".", followed by
 * <li>the label of the attribute itself, followed by
 * <li>a ":", followed by
 * <li>The Telos name of the attribute's target.
 * </ol>
 *
 * <p>For instance, examine the following declarations:
 *
 * <p><pre>   SimpleClass MySimpleClass
 *       WITH
 *           myAttrCat1, myAttrCat2
 *               myAttribute : MySimpleClass
 *   END</pre>
 *
 * <p>The attribute <code>myAttribute</code> can be uniquely
 * identified in a KB by the string:
 *
 * <p><code>"MySimpleClass.myAttrCat1,myAttrCat2.myAttribute:MySimpleClass"</code>
 *
 * <h2>Implementing This API</code>
 *
 * <p>In the interfaces <code>Individual</code>,
 * <code>Attribute</code> and the abstract class <code>KB</code> must
 * be implemented. This is where the most serious effort lies, and
 * this usually determines the implementation of the above abstract
 * classes.
 **/
public interface README {}