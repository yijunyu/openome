
package jtelos;


/** Thrown when a search is performed for an individual, say in a list
 * of ancestors or parents, and it is not found in that list. 
 * 
 * <p>Note that since it is a <code>RuntimeException</code> it doesn't
 * require a <code>throws</code> clause in methods that throw it, nor
 * <code>try/catch</code> statements around invocations of those
 * methods. Nonetheless, it should be handled.
 *
 * @see Individual
 **/
public class IndividualNotFoundException extends RuntimeException {
  
  private static final String start = 
	"Couldn't find individual: ";



  /** Thrown when there are no individual found in the list.  Returns
   * message:
   *
   * <p>"Couldn't find individual: &lt<code>individualName</code>&gt
   * in &lt<code>listName</code>&gt list in
   * &lt<code>ownerName</code>&gt".
   **/
  public IndividualNotFoundException(String individualName, 
				     String listName,
				     String ownerName) { 
	super(start + individualName + " in " + listName + " in " + ownerName);
  }  

}