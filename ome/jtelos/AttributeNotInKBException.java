
package jtelos;


/**
 * Thrown when a search is performed for an attribute using its full
 * Telos name (as defined in this API) as a search key. It is thrown
 * by the <code>attribute(String)</code> method in the interface
 * <code>KB</code>. For naming conventions see the
 * <code>telosName()</code> method in the interface
 * <code>NamedObject</code>.
 *
 * <p>Note that since it is a <code>RuntimeException</code> it doesn't
 * require a <code>throws</code> clause in methods that throw it, nor
 * <code>try/catch</code> statements around invocations of those
 * methods. Nonetheless, it should be handled.
 *
 * @see Attribute
 * @see NamedObject
 **/
public class AttributeNotInKBException extends RuntimeException {



  /**
   * Thrown when there are no attribute matching the
   * <code>telosName</code> parameter in the KB.  Returns message:
   *
   * <p>"Couldn't find attribute with name:
   * &lt<code>telosName</code>&gt in &lt<code>kbName</code>&gt".
   **/
  public AttributeNotInKBException(String telosName,String kbName) { 
	super("Couldn't find attribute with name: "+telosName+ "\n   in KB: "+ kbName);
  }  

}