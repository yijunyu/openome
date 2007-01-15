
package jtelos.example;


import jtelos.Attribute;
import jtelos.Individual;
import jtelos.IndividualOrLiteral;
import jtelos.StaticHelper;

public class exAttribute extends exTelosObject implements Attribute {

  //===========================================================================
  // PRIVATE INSTANCE FIELDS
  //===========================================================================

  private String label;
  private String[] catLabels;
  private Individual declarer_val;
  private IndividualOrLiteral target_val;
  


  //===========================================================================
  // PROTECTED CONSTRUCTOR
  //===========================================================================

  /** Calls superclass constructor in <code>TelosObject</code>. Only
   * called by subclass constructor in
   * <code>exAttributeClassBuiltIn</code>, or
   * <code>New(Individual,String[],String,IndividualOrLiteral)</code>
   * in <code>exKB</code>.
   *
   * @see exTelosObject#exTelosObject(java.lang.String,jtelos.KB)
   * @see exAttributeClassBuiltIn#exAttributeClassBuiltIn(java.lang.String,jtelos.Omegaclass)
   * @see exKB#newAttribute(jtelos.Individual,java.lang.String[],java.lang.String,jtelos.IndividualOrLiteral)
   **/
  protected exAttribute(Individual declarer,
		       String[] catLabels,
		       String label,
		       IndividualOrLiteral target) {
	super(StaticHelper.telosName(declarer,catLabels,label,target),
	  declarer.kb());
	declarer_val = declarer;
	((exIndividual)declarer).directAttrs_val = 
	  append(((exIndividual)declarer).directAttrs_val,this);
	this.catLabels = catLabels;
	this.label = label;
	target_val = target;
	if(target instanceof Individual)
	  ((exIndividual)target).referencedBy_val = 
	append(((exIndividual)target).referencedBy_val,this);
  }  

  //===========================================================================
  // PRIVATE HELPER METHOD
  //===========================================================================

  private Attribute[] append(Attribute[] target, Attribute appendee)
	{ return StaticHelper.append(target,appendee); }

  /** 
   * Implements equivalent method in the <code>Attribute</code>
   * interface.
   *
   * @see jtelos.Attribute#categories()
   **/
  public Attribute[] categories() { return StaticHelper.categories(this); }  

  /** 
   * Implements equivalent method in the <code>Attribute</code>
   * interface. 
   *
   * @see jtelos.Attribute#catLabels()
   **/
  public String[] catLabels() { return catLabels; }  

  //===========================================================================
  // PUBLIC ASK METHODS
  //===========================================================================

  /** 
   * Implements equivalent method in the <code>Attribute</code>
   * interface.
   *
   * @see jtelos.Attribute#declarer()
   **/
  public Individual declarer() { return declarer_val; }  

  /** 
   * Implements equivalent method in the <code>Attribute</code>
   * interface.
   *
   * @see jtelos.Attribute#directlyNarrowedBy()
   **/
  public Attribute[] directlyNarrowedBy() {
	return StaticHelper.directlyNarrowedBy(this);
  }  

  /** 
   * Implements equivalent method in the <code>Attribute</code>
   * interface.
   *
   * @see jtelos.Attribute#directlyNarrows()
   **/
  public Attribute[] directlyNarrows() {
	return StaticHelper.directlyNarrows(this);
  }  

  /** 
   * Implements equivalent method in the <code>Attribute</code>
   * interface.
   *
   * @see jtelos.Attribute#instances()
   **/
  public Attribute[] instances() { return StaticHelper.instances(this); }  

  /** 
   * Implements equivalent method in the <code>Attribute</code>
   * interface. 
   *
   * @see jtelos.Attribute#label()
   **/
  public String label() { return label; }  

  /** 
   * Implements equivalent method in the <code>Attribute</code>
   * interface. 
   *
   * @see jtelos.Attribute#target()
   **/
  public IndividualOrLiteral target() { return target_val; }  

}