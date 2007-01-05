
package jtelos;


/** This interface represents attribute classes in Telos. These are
 * the attributes that take omegaclasses as their target. There are
 * four builtin attribute classes in Telos. For each KB in a
 * repository there is only one Java object for each of these. The
 * unique object is available by the following instance methods in the
 * interface KB:
 *
 * <ul>
 *
 * <li><code>ATTRIBUTE_CLASS()</code> (returning the attribute class
 * <code>Individual.attributeclass.attributeclass:Class</code> in
 * Telos), which has all attribute classes as Telos instances. It has
 * three instances (making it their category):
 *
 * <li><code>ATTRIBUTE()</code> (returning the attribute class
 * <code>Individual.attributeclass.attribute:Proposition</code> in
 * Telos), and
 *
 * <li><code>SINGLE()</code> (returning the attribute class
 * <code>Individual.attributeclass.single:Proposition</code> in Telos)
 *
 * </ul>
 *
 * <p>In Telos, they are declared by <code>INDIVIDUAL</code> but also
 * appear in several other builtins returned by these methods in
 * <code>KB</code>:
 *
 * <ul>
 * <li><code>TOKEN()</code> (returning <code>Token</code> in Telos),
 * <li><code>SIMPLE_CLASS()</code> (returning <code>SClass</code> in Telos),
 * <li><code>METACLASS()</code> (returning <code>M1Class</code> in Telos),
 * <li><code>M2CLASS()</code> (returning <code>M2Class</code> in Telos),
 * <li><code>M3CLASS()</code> (returning <code>M3Class</code> in Telos),
 * </ul>
 *
 * @see KB#ATTRIBUTE_CLASS()
 * @see KB#ATTRIBUTE()
 * @see KB#SINGLE()
 * @see KB#INDIVIDUAL()
 * @see KB#M3CLASS()
 * @see KB#M2CLASS()
 * @see KB#METACLASS()
 * @see KB#SIMPLE_CLASS()
 * @see KB#TOKEN()
 **/
public interface AttributeClass extends OmegaclassOrAttributeClass, Attribute {}