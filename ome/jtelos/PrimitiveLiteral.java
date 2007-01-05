
package jtelos;


/** Java subclasses of this class include:
 * 
 * <p><ul>
 * <li><code>TelosString</code>,
 * <li><code>TelosInteger</code> and
 * <li><code>Real</code>.
 * </ul>
 *
 * These are the Java classes of which string, integer and floating
 * point literals are Java instances. They are also, loosely speaking,
 * Telos "instances" of the primtive <em>types</em> that are returned
 * by the following methods in <code>KB</code>:
 *
 * <p><ul>
 * <li><code>STRING_TYPE()</code> (returing <code>String</code> in Telos),
 * <li><code>INTEGER_TYPE()</code> (returing <code>Integer</code> in Telos), and
 * <li><code>REAL_TYPE()</code> (returning <code>Real</code> in Telos).
 * </ul>
 *
 * <p>Individual primitive literals <em>are not</em> associated with
 * KB's. So in order to answer questions such as, "what attributes
 * take this primitive literal as their target", tokens must be used
 * instead of literals so that their <code>referencedBy()</code>
 * method can be invoked. This performs an inverse lookup is done to
 * find the attributes taking the token as its target. Such tokens
 * would need an attribute holding the primitive literal being
 * represented:
 *
 * <pre>Token Success (* CoopWARE design *)
 *     IN TerminationStatus
 *     WITH
 *         name : "Success"
 * END</pre>
 *
 * "declares" the string literal <code>"Success"</code> in the
 * attribute with the label <code>name</code>. This declaration occurs
 * within the input file <code>CoopWARE</code>.
 * 
 * @see TelosInteger
 * @see TelosString
 * @see Real
 * @see KB#STRING_TYPE()
 * @see KB#INTEGER_TYPE()
 * @see KB#REAL_TYPE()
 * @see TelosObject#kb()
 **/
public abstract class PrimitiveLiteral implements IndividualOrLiteral {



  /** This constructor is only invoked by concrete Java subclasses.
   **/
  PrimitiveLiteral() {}  

  /** Returns the string that can be used as a target in a Telos
   * attribute declaration.
   **/
  public abstract String telosName();  

  /**
   * Returns telosName();
   **/
  public String toString() { return telosName(); }  

}