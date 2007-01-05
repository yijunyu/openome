
package jtelos.util;

import jtelos.TelosObject;

/** This interface represents a <i>variant</i> of the design pattern
 * Singleton. In GOF's <i><b>Design Patterns</i></b>, Singleton's
 * intent is defined as follows: "Ensure a class only has one instance
 * and provide a global point of access to it." Elsewhere GOF says:
 * Singleton "defines an <code>Instance</code> operation that lets
 * clients access its unique instance."
 *
 * <p>In this variant we still want unique instances of certain
 * semantic identities, but these identities do not correspond
 * "1-to-1" to classes. Here we want to call the
 * <code>instance()</code> operation (a static method), knowing that
 * it will either create the object or return a previously created
 * unique instance.
 *
 * <p>Because of the semantics of this interface, classes implementing
 * it should not have their "vanilla" constructors invoked. This can
 * cause multiple oid's to stand for the same semantic
 * identity. Sometimes this is not necessary. When ther are only a few
 * objects to create, it can be handled by a Factory Method.
 *
 * <p>But when there are many objects that could be created and we
 * cannot hard-code all of the possibilities statically, we must
 * depend on constructors. Ideally constructors should be able to be
 * made <code>protected</code> but if we want to invoke a constructor
 * by reflection, this will interfer. In some cases a client wants to
 * invoke a constructor and pass the semantic information as an
 * argument. Instead of invoking constructors directly the constructor
 * should only invoked by a Factory Method. For creating
 * <i>MirrorToken</i>'s we use <code>New(String,Object[])</code> or
 * <code>NewKey(Object[])</code> or their derivatives.
 *
 * <p>Another item that may be useful is the name of the Java class
 * implementing this interface. <code>thisClass()</code> is used in
 * various MIRROR Java classes to provide the name of the implementing
 * Java class. In the case of <code>MirrorToken</code>'s, this can be
 * concatenated with semantic information about the token to produce a
 * unique key for <code>telosName</code>. But because not every
 * <code>KeyedSingleton</code> would use this, it is not part of the
 * interface.
 *
 * <p>The reason we call this a design pattern and not simply a lookup
 * table (which it also is), is that we always access the unique
 * instances where we might also simply call a constructor. This is
 * what is done in the Singleton pattern.
 *
 * @see mirror.schema.MirrorToken
 **/
public interface KeyedSingleton {


  /** Returns a previously created instance of the class implementing
   * this interface, where the instance has a matching key or it
   * returns null otherwise. This is usually fully implemented by a
   * static equivalent.
   *
   * <p>This method should also be implemented statically (to make it
   * similar to GOF's <code>Instance</code> operation). In Java the
   * name should be <code>instance_STATIC(String)</code>.
   **/
  public TelosObject instance(String telosName);  

  /** Since we are only applying this design pattern to Telos objects,
   * it seems fit to use a unique name that already exists. But in
   * this interface, we add the stipulation that it return the unique
   * <i>semantic</i> key for this object. This means that it functions
   * as a lookup key, <i>and</i> the uniqueness it establishes comes
   * from the semantic information that it supplies. 
   *
   * <p>So here we are specifying how the Telos name is to be
   * constructed: Semantic information about the object (say a full
   * path name for a file) would only establish uniqueness
   * <i>within</i> the scope of the simple class.  To derive a
   * globally unique key, we concatenate concatenate the fully
   * qualified Java class (e.g. <code>mirror.sys.File</code> with the
   * semantic information (e.g. the path of a file).
   **/
  public String telosName();  

}