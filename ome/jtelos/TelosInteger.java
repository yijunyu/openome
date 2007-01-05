
package jtelos;


/** This is an object-oriented wrapper Java class that allows integer
 * values to be Telos objects. It is somewhat like
 * <code>java.lang.Integer</code>, but Java instances of
 * <code>TelosInteger</code> are integer literals that are also
 * contained in a Telos KB. That is not the case for a vanilla Java
 * instance of <code>Integer</code>, or the <code>int</code> Java
 * primitive type.
 *
 * <p>In a loose sense, integer literals that are Java instances of
 * this Java class are also Telos "instances" of the integer
 * <em>type</em>. This is represented by the individual returned by
 * the <code>INTEGER_TYPE()</code> method in the interface
 * <code>KB</code>. In Telos, this is written as <code>Integer</code>
 * which is not to be confused with the Java class of the same name.
 *
 * <p>The only abstract method that needs to be implemented is
 * <code>kb()</code> since these depend directly on the implementation
 * of the <code>KB</code> Java interface.
 * 
 * @see KB#INTEGER_TYPE()
 * @see TelosString
 * @see java.lang.Integer
 * @see KB
 * @see TelosObject#kb()
 **/
public class TelosInteger extends PrimitiveLiteral {

  private int value;



  /** Wraps the parameter. **/
  public TelosInteger(int value) { this.value = value; }  

  /** Wraps the parameter, converting it to an <code>int</code>. **/
  public TelosInteger(Integer value) { this.value = value.intValue(); }  

  /** Wraps the parameter, converting it to an <code>int</code>. **/
  public TelosInteger(String string) { 
	this.value = (new Integer(string)).intValue(); 
  }  

  /** Compares the <code>intValue()</code> of the objects, not the
   * objects' oid's.
   **/
  public boolean equals(Object obj) {
	return (obj.getClass().equals(getClass()) &&
			((TelosInteger)obj).intValue() == intValue());
  }  

  /** Returns the <code>int</code> value of the integer. **/
  public int intValue() { return value; }  

  /** Returns the Java string representation of the integer. **/
  public String telosName() {
	String result = new Integer(value).toString();
	  if(result.endsWith(".0")) return result.substring(0,result.length()-2);
	return result;
  }  

}