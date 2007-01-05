
package jtelos;


/** This exception is thrown when a Telos operation is attempted on an
 * individual, but because the individual has children, the operation
 * is illegal and thus aborted. This can occurs in the
 * <code>removeIndividual(Individual)</code> method in the interface
 * <code>KB</code>.
 *
 * <p>Note that since it is a <code>RuntimeException</code> it doesn't
 * require a <code>throws</code> clause in methods that throw it, nor
 * <code>try/catch</code> statements around invocations of those
 * methods. Nonetheless, it should be handled.
 *
 * @see KB#removeIndividual(jtelos.Individual)
 * @see Individual
 **/
public class ChildrenExistException extends RuntimeException {
  


  /** Thrown when an attempted operation is illegal because a Telos
   * individual has children.
   *
   * @param telosName the name of the individual that has children
   * @param message an optional message (could be "").
   **/
  public ChildrenExistException(String telosName,
			        String message) { 
	super("Cannot remove individual " + telosName + 
	  " since it has children in this KB. "+ message);
  }  

}