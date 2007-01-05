
package jtelos.example;


import jtelos.*;

import jtelos.util.AttributeVector;

public class exAttributeClassBuiltIn extends exAttribute
implements AttributeClass {



  /**
   * Calls superclass constructor in <code>exAttribute</code>. Called by 
   *
   * @see exAttribute#exAttribute(jtelos.Individual,java.lang.String[],java.lang.String,jtelos.IndividualOrLiteral)
   **/
  public exAttributeClassBuiltIn(String label,
				  Omegaclass target) { 
	super(target.kb().INDIVIDUAL(),
	  new String[]{"attributeclass"},
	  label,
	  target); 
  }  

  /** Returns an array containing the individual returned by
   * <code>ATTRIBUTE_CLASS()</code> in the interface <code>KB</code>.
   *
   * @see jtelos.Attribute#categories()
   * @see jtelos.KB#ATTRIBUTE_CLASS()
   **/
  public Attribute[] categories() {return new Attribute[]{ATTRIBUTE_CLASS()};}  

  /** Returns an empty array. Implements the
   * corresponding method in the interface <code>Attribute</code>
   *
   * @see jtelos.Attribute#directlyNarrowedBy()
   **/
  public Attribute[] directlyNarrowedBy() { return new Attribute[]{}; }  

  /** Returns an empty array. Implements the corresponding method in
   * the interface <code>Attribute</code>
   *
   * @see jtelos.Attribute#directlyNarrows()
   **/
  public Attribute[] directlyNarrows() { return new Attribute[]{}; }  

  public Attribute[] instances() {
	if (this == ATTRIBUTE() || this == SINGLE()) {
	  AttributeVector v = new AttributeVector();
	  Individual[] builtins = 
	new Individual[] { 
	  M3CLASS(),
	  M2CLASS(), 
	  METACLASS(),
	  SIMPLE_CLASS(),
	  TOKEN()
	};
	  for(int l=0;l<builtins.length;l++) {
	Individual[] instances = builtins[l].instances();
	for(int i=0;i<instances.length;i++) {
	  Attribute[] directAttrs = instances[i].directAttrs();
	  for (int j=0;j<directAttrs.length;j++) {
	    String[] catLabels = directAttrs[j].catLabels();
	    for (int k=0;k<catLabels.length;k++)
	      if (catLabels[k].equals(label()))
		v.addElement(directAttrs[j]);
	  }
	}
	  }
	  return v.toArray();
	} else return new Attribute[] { ATTRIBUTE(), SINGLE() };
  }  

}