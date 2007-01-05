
package jtelos;


/** This is a wrapper Java class that allows String values to be telos
 * objects. It is somewhat like <code>java.lang.String</code>, but
 * Java instances of <code>TelosString</code> are string literals that
 * are also contained in a Telos KB. That is not the case for a
 * vanilla Java instance of <code>String</code>.
 *
 * <p>In a loose sense, string literals that are Java instances of
 * this Java class are also Telos "instances" of the string
 * <em>type</em>. This is represented by the individual returned by
 * the <code>STRING_TYPE()</code> in the interface <code>KB</code>. In
 * Telos, this is written as <code>String</code> which is not to be
 * confused with the Java class of the same name.
 *
 * <p>The only abstract method that needs to be implemented is
 * <code>kb()</code> since these depend directly on the implementation
 * of the <code>KB</code> Java interface.
 * 
 * @see KB#STRING_TYPE()
 * @see TelosInteger
 * @see java.lang.String
 * @see KB
 * @see TelosObject#kb()
 **/
public class TelosString extends PrimitiveLiteral {

  private String value;



  /** Wraps the parameter. **/
  public TelosString(String value) { this.value = value; }  

  /** Compares the <code>stringValue()</code> of the objects, not the
   * objects' oid's. It is similar to the Java class
   * <code>String</code>'s <code>equals(Object)</code> method.
   **/
  public boolean equals(Object obj) {
	return (obj.getClass().equals(getClass()) &&
			((TelosString)obj).stringValue().equals(stringValue()));
  }  

  /** Returns the value of this string, without quotation marks.
   *
   * <p>For instance, if the constructor invocation for this object
   * was <code>new TelosString("Hello world!")</code>. This method
   * would return a Java string <code>Hello world!</code>.
   * <code>telosNAme()</code> returns the same string, <em>with</em>
   * quotation marks.
   * 
   * @see #stringValue()
   **/
  public String stringValue() { return value; }  

  /** Returns the value of this string, in quotation marks.
   *
   * <p>For instance, if the constructor invocation for this object
   * was <code>new TelosString("Hello world!")</code>. This method
   * would return a Java string <code>"Hello world!"</code>
   * <em>including the quotation marks in the
   * string</em>. <code>stringValue()</code> returns the same string,
   * but without the quotation marks.
   * 
   * @see #stringValue()
   **/
  public String telosName() { return "\""+ value + "\""; }  

}