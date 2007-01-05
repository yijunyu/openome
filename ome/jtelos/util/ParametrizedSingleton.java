
package jtelos.util;

/** Java classes implementing this interface must implement a
 * <code>public</code>, <code>static</code> method called
 * <code>instance</code> or <code>New</code>. It takes one or more
 * parameters. This method returns a Java object which is the unique
 * intance of the implementing class <em>with respect to a particular
 * context</code> which is indicated by the method's parameter. For
 * instance, a subinterface <code>KBSingleton</code> returns unique
 * Java instances of implementing classes with respect to a particular
 * KB. (That is each KB can only contain one Telos instance
 * represented by the (relatively) unique Java object. Thus the method
 * functions as a <b>"pseudoconstructor"</b>. There is no syntactic
 * way to enforce the implementation of this method in Java (static
 * methods can't be declared in Java interfaces). But the advantage is
 * that the class of the returned object can be the implementing
 * class, and the parameters can vary with each implementing class.
 *
 * @see KBSingleton
 **/
public interface ParametrizedSingleton {}