
package jtelos;


/** This interface represents all the objects in the Telos data model
 * other than KB's and primitive literals. These include individuals
 * (tokens, simple classes, metaclasses, metametaclasses, etc. and
 * omegaclasses. They also include attributes and attribute classes.
 *
 * <p>Each Telos object is represented by one or more Java
 * instances. If the Java implementation of Telos allows more than one
 * Java instance for each Telos object, it must guarantee that each
 * instance must share the same state. This is often the case with
 * Java implementations of Telos that instantiate Telos objects (in
 * Java) "on the fly" and garbage collect them as needed. Other
 * implementations use pseudoconstructors that do a lookup in an
 * object registry before creating a new Java instance. This
 * guarantees a single Java object for each Telos object in a running KB.
 *
 * @see Individual
 * @see Attribute
 * @see PrimitiveType
 * @see KB
 **/
public interface TelosObject extends Relations, NamedObject, Levels {



  /** 
   * The KB in which this Telos object resides. There may be several
   * KB's available in Telos repositories, so Telos objects with the
   * same name may exist with different state in each KB (each of them
   * is a <em>different</em> Telos object sharing the same unique
   * identifier <em>within the KB</em>). This requires a separate Java
   * object to represent it in each KB.
   *
   * <p>In some Java implementations of Telos there may even be more
   * than one Java "copy" of a Telos object in a single KB (but this
   * depends on the particualar design semantics of Java instances in
   * the implementation).
   *
   * <p>In any case, each of the Java instances representing a Telos
   * object will return the Telos object's unique KB using this
   * method.
   **/
  public KB kb();  

}