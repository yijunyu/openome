
package jtelos.example;


import jtelos.*;

import java.util.Vector;

public class exIndividual extends exTelosObject implements Individual {

  //===========================================================================
  // PRIVATE ASK FIELDS
  //===========================================================================

  private int level_val;
  private Individual[] directAncestors_val = new Individual[0];
  private Individual[] directParents_val = new Individual[0];

  //===========================================================================
  // PACKAGE-VISIBLE ASK FIELDS
  //===========================================================================

  Individual[] instances_val = new Individual[0];
  Attribute[] directAttrs_val = new Attribute[0];
  Attribute[] referencedBy_val = new Attribute[0];
  protected Individual[] directChildren_val = new Individual[0];

  //===========================================================================
  // PRIVATE TELL FIELDS
  //===========================================================================

  private boolean isDeclared_val;

  



  // Called by exKB.
  protected exIndividual(String telosName, int level, KB kb) {
	super(telosName,kb);
	setLevel(level);
	setDeclared(true);
  }  

  // Used by builtins & possilby undeclared individuals
  protected exIndividual(String telosName,KB kb) {
	super(telosName,kb);
  }  

  //===========================================================================
  // PUBLIC TELL METHODS
  //===========================================================================

  public void 
	addDirectAncestorsWithInverses(Individual[] newDirectAncestors) {
	  directAncestors_val = append(directAncestors_val,newDirectAncestors);
	  for(int i=0;i<newDirectAncestors.length;i++)
	((exIndividual)newDirectAncestors[i]).instances_val = 
	  append(((exIndividual)newDirectAncestors[i]).instances_val,
		 new Individual[]{this});
  }  

  /**
   * Implements the equivalent method in the interface
   * <code>Individual</code>.
   *
   * @see jtelos.Individual#addDirectParentsWithInverses(jtelos.Individual[])
   **/
  public void addDirectParentsWithInverses(Individual[] newDirectParents) {
	directParents_val = append(directParents_val,newDirectParents);
	for(int i=0;i<newDirectParents.length;i++)
	  ((exIndividual)newDirectParents[i]).directChildren_val = 
	append(((exIndividual)newDirectParents[i]).directChildren_val,
	       new Individual[]{this});
  }  

  private Attribute[] append(Attribute[] target, Attribute[] appendees)
	{ return StaticHelper.append(target,appendees); }

  //===========================================================================
  // PRIVATE TELL HELPER METHODS
  //===========================================================================

  private static Individual[] append(Individual[] target,
				     Individual[] appendees)
	{ return StaticHelper.append(target,appendees); }

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface. 
   *
   * @see jtelos.Individual#attrs()
   **/
  public Attribute[] attrs() { return StaticHelper.attrs(this); }  

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface. 
   *
   * @see jtelos.Individual#attrs(java.lang.String[])
   *
   * @exception AttributeNotFoundException when there is no directly
   * declared <em>or</em> inherited attribute whose categories match
   * <em>all</em> of the category labels in <code>catLabels[]</code>.
   **/
  /**
  public Attribute[] attrs(String[] catLabels) 
	{ return StaticHelper.attrs(catLabels,this); }
	**/

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface. It searches linearly through the direct attributes for
   * matching category labels, but it requires no extra fields.
   *
   * @see jtelos.Individual#directAttrs(java.lang.String[])
   *
   * @exception AttributeNotFoundException when there is no directly
   * declared attribute whose categories match <em>all</em> of the
   * category labels in <code>catLabels[]</code>.
   **/
  /**
  public Attribute[] directAttrs(String[] catLabels) 
	{ return StaticHelper.directAttrs(catLabels,this); }
	**/

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface. It searches linearly through the inherited attributes
   * for matching category labels, but it requires no extra fields.
   *
   * @see jtelos.Individual#inheritedAttrs(java.lang.String[])
   *
   * @exception AttributeNotFoundException when there is no inherited
   * attribute whose categories match <em>all</em> of the category
   * labels in <code>catLabels[]</code>.
   **/
  /**
  public Attribute[] inheritedAttrs(String[] catLabels) 
	{ return StaticHelper.inheritedAttrs(catLabels,this); }
	**/

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface.
   *
   * @see jtelos.Individual#attrs(java.lang.String,java.lang.String)
   *
   * @exception AttributeNotFoundException when there is no attribute
   * whose categories match <em>all</em> of the category labels in
   * <code>catLabels[]</code> and whose label matches
   * <code>attrLabel</code>.
   **/
  public Attribute[] attrs(String[] catLabels, String attrLabel)
	{ return StaticHelper.attrs(catLabels,attrLabel,this); }

  /** 
   * Implements equivalent method in <code>Individual</code>. 
   *
   * @see jtelos.Individual#directAncestors()
   **/
  public Individual[] directAncestors() { return directAncestors_val; }  

  /** 
   * Implements equivalent method in <code>Individual</code>.
   *
   * @see jtelos.Individual#directAttrs()
   **/
  public Attribute[] directAttrs() { return directAttrs_val; }  

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface. It searches linearly through the direct attributes for
   * matching category labels and attribute label, but it requires no
   * extra fields.
   *
   * @see jtelos.Individual#directAttrs(java.lang.String[],java.lang.String)
   *
   * @exception AttributeNotFoundException when there is no directly
   * declared attribute whose categories match <em>all</em> of the
   * category labels in <code>catLabels[]</code> and whose label matches
   * <code>attrLabel</code>.
   **/
  public Attribute[] directAttrs(String[] catLabels,String label) 
	{ return StaticHelper.directAttrs(catLabels,label,this); }

  /** 
   * Implements equivalent method in <code>Individual</code>. 
   *
   * @see jtelos.Individual#directChildren()
   **/
  public Individual[] directChildren() { return directChildren_val; }  

  /** 
   * Implements equivalent method in <code>Individual</code>. 
   *
   * @see jtelos.Individual#directParents()
   **/
  public Individual[] directParents() { return directParents_val; }  

  /** 
   * Implements equivalent method in <code>Individual</code>. 
   *
   * @see jtelos.Individual#inheritedAttrs()
   **/
  public Attribute[] inheritedAttrs() {
	return StaticHelper.inheritedAttrs(this);
  }  

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface. It searches linearly through the inherited attributes
   * for matching category labels and attribute label, but it requires
   * no extra fields.
   *
   * @see jtelos.Individual#inheritedAttrs(java.lang.String[],java.lang.String)
   * 
   * @exception AttributeNotFoundException when there is no inherited
   * attribute whose categories match <em>all</em> of the category
   * labels in <code>catLabels[]</code> and whose label matches
   * <code>attrLabel</code>.
   **/
  public Attribute[] inheritedAttrs(String[] catLabels,String label)
	{ return StaticHelper.inheritedAttrs(catLabels,label,this); }

  /** 
   * Implements equivalent method in <code>Individual</code>. 
   *
   * @see jtelos.Individual#instances()
   **/
  public Individual[] instances() { return instances_val; }  

  public boolean isDeclared() { return isDeclared_val; }  

  //===========================================================================
  // PUBLIC ASK METHODS
  //===========================================================================

  /** 
   * Implements equivalent method in <code>Individual</code>. 
   *
   * @see jtelos.Individual#level()
   **/
  public int level() { return level_val; }  

  // This is a "partial constructor" to be called when an incomplete
  // Java object is to be created for an individual. It is incomplete
  // in the sense that we do not know what the level of Telos
  // instantiation is for the individual. This constructor is invoked
  // by the <code>apIndividual(String)</code> constructor. Calls
  // superclass constructor.
  protected static exIndividual possiblyUndeclaredNew(String telosName, KB kb) {
	exIndividual result = new exIndividual(telosName,kb);
	result.setDeclared(false);
	return result;
  }  

  /** 
   * Implements equivalent method in <code>Individual</code>. Returns
   * the value of the cache field <code>referencedBy_val</code>.
   *
   * @see jtelos.Individual#referencedBy()
   **/
  public Attribute[] referencedBy() { return referencedBy_val; }  

  public void removeDirectAncestors(Individual removee) {
	if(StaticHelper.isBuiltIn(this))
	  throw new ImmutableBuiltInException(telosName(),"");
	if(StaticHelper.isBuiltIn(removee))
	  throw new ImmutableBuiltInException(removee.telosName(),"");
	if(instances().length > 0)
	  throw new InstancesExistException(telosName(),"");
	directAncestors_val = 
	  StaticHelper.removeIndividual(directAncestors_val,
				    removee,
				    "direct ancestors",
				    this);
	((exIndividual)removee).instances_val = 
	  StaticHelper.removeIndividual(((exIndividual)removee).instances_val,
				    this,
				    "instances",
				    removee);
  }  

  //===========================================================================
  // PUBLIC UNTELL METHODS
  //===========================================================================

  public void removeDirectAncestorWithInverse(Individual indiv) {
	throw new TelosMethodNotImplementedException("jtelos.example.exIndividual",
				"removeDirectAncestorWithInverse(Individual)");
  }  

  public void removeDirectAttr(Attribute removee) {
	if(StaticHelper.isBuiltIn(this))
	  throw new ImmutableBuiltInException(telosName(),"");
	if(removee == ATTRIBUTE())
	  throw new ImmutableBuiltInException(removee.telosName(),"");
	if(instances().length > 0)
	  throw new InstancesExistException(telosName(),"");
	boolean found = false;
	Vector v = new Vector();
	for(int i=0;i<directAttrs_val.length;i++) {
	  if(directAttrs_val[i] != removee) v.addElement(directAttrs_val[i]);
	  else found = true;
	}
	if(!found) throw new AttributeNotFoundException(removee.telosName(),
						    "direct attributes",
						    telosName());
	directAttrs_val = new Attribute[v.size()];
	for(int i=0;i<v.size();i++) 
	  directAttrs_val[i] = (Attribute) v.elementAt(i);
  }  

  public void removeDirectParents(Individual removee) {
	if(StaticHelper.isBuiltIn(this))
	  throw new ImmutableBuiltInException(telosName(),"");
	if(StaticHelper.isBuiltIn(removee))
	  throw new ImmutableBuiltInException(removee.telosName(),"");
	directParents_val = 
	  StaticHelper.removeIndividual(directParents_val,
				    removee,
				    "direct parents",
				    this);
	((exIndividual)removee).directChildren_val = 
	  StaticHelper.removeIndividual(((exIndividual)removee).directChildren_val,
				    this,
				    "direct children",
				    removee);
  }  

  public void removeDirectParentWithInverse(Individual indiv) {
	throw new TelosMethodNotImplementedException("jtelos.example.exIndividual",
				"removeDirectParentWithInverse(Individual)");
  }  

  public void setDeclared(boolean isDeclared) { isDeclared_val = isDeclared; }  

  /**
   * Implements the equivalent method in the interface
   * <code>Individual</code>.
   *
   * @see jtelos.Individual#setLevel(int level)
   **/
  public void setLevel(int level) {
	level_val = level;

	// Shouldn't we set the default parent too?

	StaticHelper.setBuiltInAncestor(level,this);
  }  

}