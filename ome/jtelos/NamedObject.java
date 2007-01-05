
package jtelos;


/**
 * This is a common superinterface for individuals, attributes and
 * primitive literals in Telos. The first two types are represented in
 * Java by the subinterface <code>TelosObject</code> and the latter
 * are represented in Java by the abstract class
 * <code>PrimitiveLiteral</code>.
 *
 * @see TelosObject
 * @see PrimitiveLiteral
 **/
public interface NamedObject {



  /**
   * The internal Telos name of the object. This is part of the object's 
   * declaration, whether this is done lexically (by an input file) or other 
   * means (say directly through the API itself). Some implementations may
   * also have an internal identifier (like jtelos' TelosID integer).
   *
   * <p>The string returned by this method indicates a unique
   * identifier for the object <em>within the context of a particular
   * KB</em>. Thus objects with the same name (and potentially
   * different definitions) may exist in different KB's.
   *
   * <p>For non-primitive individuals, this name is simply the one
   * that appears in the input file. For Telos String literals, it is
   * the content of the string, within double quotation marks. For
   * Telos Integer and Real literals, it is the string representation
   * of the number (not surrounded by quotation marks).
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
   **/
  public String telosName();  

  /**
   * Returns telosName();
   **/
  public String toString();  

}