
package jtelos;


/** This is an object-oriented wrapper Java class that allows floating
 * point values to be Telos <code>Real</code> objects. It is somewhat
 * like <code>java.lang.Float</code>, but Java instances of
 * <code>Real</code> are real (floating point) literals that are also
 * contained in a Telos KB. That is not the case for a vanilla Java
 * instance of <code>Float</code>, or the <code>float</code> Java
 * primitive type.
 *
 * <p>In a loose sense, real literals that are Java instances of this
 * Java class are also Telos "instances" of the "real"
 * <em>type</em>. This is represented by the individual returned by
 * <code>REAL_TYPE()</code> in the interface <code>KB</code>. In Telos
 * this is written as <code>Real</code> <em>(not to be confused with
 * this Java class!)</em>.
 *
 * <p>The only abstract method that needs to be implemented is
 * <code>kb()</code> since these depend directly on the implementation
 * of the <code>KB</code> Java interface.
 * 
 * @see KB#REAL_TYPE()
 * @see TelosString
 * @see TelosInteger
 * @see java.lang.Float
 * @see KB
 * @see TelosObject#kb()
 **/
public class Real extends PrimitiveLiteral {

  private float value;



  /** Wraps the parameter. **/
  public Real(float value) { this.value = value; }  

  /** Wraps the parameter, converting it to an <code>float</code>. **/
  public Real(Float value) { this.value = value.floatValue(); }  

  /** Wraps the parameter, converting it to an <code>float</code>. **/
  public Real(String string) { 
	this.value = (new Float(string)).floatValue(); 
  }  

  /** Compares the <code>floatValue()</code> of the objects, not the
   * objects' oid's.
   **/
  public boolean equals(Object obj) {
	return (obj.getClass().equals(getClass()) &&
			((Real)obj).floatValue() == floatValue());
  }  

  /** Returns the <code>float</code> value of the real. **/
  public float floatValue() { return value; }  

  /** Returns the Java string representation of the real. **/
  public String telosName() { return new Float(value).toString(); }  

}