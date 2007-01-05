
package jtelos;


/**
 * Thrown when a search is performed for an individual using its Telos
 * name as a search key. It is thrown by the
 * <code>individual(String)</code> method in the interface
 * <code>KB</code>.
 *
 * <p>Note that since it is a <code>RuntimeException</code> it doesn't
 * require a <code>throws</code> clause in methods that throw it, nor
 * <code>try/catch</code> statements around invocations of those
 * methods. Nonetheless, it should be handled.
 *
 * @see NamedObject
 * @see Individual
 **/
public class IndividualNotInKBException extends RuntimeException {



  /**
   * Thrown when there are no individual matching the
   * <code>telosName</code> in the KB.  Returns message:
   *
   * <p>"Couldn't find individual with name:
   * &lt<code>telosName</code>&gt in &lt<code>kbName</code>&gt".
   **/
  public IndividualNotInKBException(String telosName,String kbName) { 
	super("Couldn't find individual with name: "+telosName+ " in KB: "+ 
	  kbName);
  }  

}