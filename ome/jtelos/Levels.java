
package jtelos;

/** This interface contains static final <code>int</code>'s that
 * represent different levels of instantiation on Telos. It also
 * represents the differences between primitive literals and primitive
 * types as mock "levels of Telos instantiation".
 *
 * <center><p><img src=Levels.gif></center>
 **/
public interface Levels {

  /** This level is supported and contains omegaclasses and attribute
   * classes.
   *
   * @see Omegaclass
   * @see AttributeClass 
   ***/
  static final int OMEGACLASS_LEVEL = 100;

  /** This level is supported and contains all the tokens. **/
  static final int TOKEN_LEVEL = 0;

  /** This level is supported and contains the simple classes. **/
  static final int SIMPLE_CLASS_LEVEL = 1;

  /** This level is supported and contains the metaclasses. **/
  static final int METACLASS_LEVEL = 2;

  /** This level is supported and contains the M2classes. **/
  static final int M2CLASS_LEVEL = 3;

  /** This level is supported and contains the M3classes. **/
  static final int M3CLASS_LEVEL = 4;

  /** This level is supported and contains M4classes. **/
  static final int M4CLASS_LEVEL = 5;

  /** This level is not currently supported. **/
  static final int M5CLASS_LEVEL = 6;

  /** This level is not currently supported. **/
  static final int M6CLASS_LEVEL = 7;

  /** This level is not currently supported. **/
  static final int M7CLASS_LEVEL = 8;

  /** This level is not currently supported. **/
  static final int M8CLASS_LEVEL = 9;

}