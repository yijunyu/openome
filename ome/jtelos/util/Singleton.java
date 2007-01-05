
package jtelos.util;

/** Java classes "implementing" this interface must implement a
 * method: <code>public static Object instance()</code>. Which returns
 * the single instance of the class. There is no syntactic way to
 * enforce this, so the return type can be specialized within whatever
 * local constraints are imposed (ie. it doesn't have to return
 * <code>Object</code>, but it shouldn't be a primitive either).
 **/
public interface Singleton { }