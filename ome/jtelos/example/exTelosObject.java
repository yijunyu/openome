
package jtelos.example;


import jtelos.AttributeClass;
import jtelos.Individual;
import jtelos.KB;
import jtelos.Omegaclass;
import jtelos.TelosObject;

public abstract class exTelosObject implements TelosObject {

  //===========================================================================
  // PRIVATE INSTANCE FIELDS
  //===========================================================================

  private String telosName_val;
  private KB kb_val;



  //===========================================================================
  // PROTECTED CONSTRUCTORS
  //===========================================================================

  protected exTelosObject(String telosName, KB kb) {
	telosName_val = telosName;
	kb_val = kb;
  }  

  /**
   * Used by subclass constructors.
   **/
  protected exTelosObject(KB kb) { kb_val = kb; }  

  AttributeClass ATTRIBUTE() { return kb().ATTRIBUTE(); }  

  AttributeClass ATTRIBUTE_CLASS() { return kb().ATTRIBUTE_CLASS(); }  

  Omegaclass CLASS() { return kb().CLASS(); }  

  Omegaclass INDIVIDUAL() { return kb().INDIVIDUAL(); }  

  Omegaclass INDIVIDUAL_CLASS() { return kb().INDIVIDUAL_CLASS(); }  

  Individual INTEGER_TYPE() { return kb().INTEGER_TYPE(); }  

  /** 
   * Implements equivalent method in <code>TelosObject</code>. 
   *
   * @see jtelos.TelosObject#kb()
   **/
  public KB kb() { return kb_val; }  

  Individual M2CLASS() { return kb().M2CLASS(); }  

  Individual M3CLASS() { return kb().M3CLASS(); }  

  Individual METACLASS() { return kb().METACLASS(); }  

  Omegaclass OMEGACLASS() { return kb().OMEGACLASS(); }  

  //===========================================================================
  // PROTECTED HELPER METHOD
  //===========================================================================

  protected static void  p(String s) { System.err.println(s); }  

  protected static void  p(boolean debug, String s) { if(debug) System.err.println(s); }  

  Omegaclass PROPOSITION() { return kb().PROPOSITION(); }  

  Individual REAL_TYPE() { return kb().REAL_TYPE(); }  

  Individual SIMPLE_CLASS() { return kb().SIMPLE_CLASS(); }  

  AttributeClass SINGLE() { return kb().SINGLE(); }  

  Individual STRING_TYPE() { return kb().STRING_TYPE(); }  

  /** 
   * Implements equivalent method in <code>TelosObject</code>. 
   *
   * @see jtelos.NamedObject#telosName()
   **/
  public String telosName() { return telosName_val; }  

  //===========================================================================
  // PACKAGE-VISIBLE INSTANCE METHODS
  //===========================================================================

  Individual TOKEN() { return kb().TOKEN(); }  

  //===========================================================================
  // PUBLIC ASK METHODS
  //===========================================================================

  public String toString() { return telosName(); }  

}