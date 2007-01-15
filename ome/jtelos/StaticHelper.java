
package jtelos;


import java.util.Vector;

import jtelos.util.AttributeVector;
import jtelos.util.RuntimeEncapsulatorException;
import jtelos.util.SortTelosObjectVector;
public class StaticHelper implements Levels {


  private StaticHelper() {}  

  private static void addDirectAncestorsWithInverses(Individual instance, 
						     Individual[] ancestors)
	{ instance.addDirectAncestorsWithInverses(ancestors); }

  //===========================================================================
  // PRIVATE ASK HELPER METHODS
  //===========================================================================

  private static void addDirectAncestorWithInverse(Individual instance, 
						   Individual ancestor)
	{ instance.addDirectAncestorsWithInverses(new Individual[]{ancestor}); }

  private static void addDirectParentsWithInverses(Individual child, 
						   Individual[] parents)
	{ child.addDirectParentsWithInverses(parents); }

  private static void addDirectParentWithInverse(Individual child, 
						 Individual parent)
	{ child.addDirectParentsWithInverses(new Individual[]{parent}); }

  private static void addIfNotNarrowedOrContained(Attribute newAttr,
												 AttributeVector v) {
	//p("StatiHelper.addIfNotNarrowedOrContained("+newAttr.telosName()+",Vector)");
	if((newAttr.target() instanceof PrimitiveLiteral) ||
	   (((Individual)newAttr.target()).level() == TOKEN_LEVEL)) {
	  // Attributes target tokens or literals can't be inherited.
	  //p("   target is token or literal.");
	  return;
	}
	if (v.size() == 0) v.addElement(newAttr);
	if (v.contains(newAttr)) return;
	boolean add = true;
	for(int i=0;i<v.size();i++) {
	  Attribute currAttr = (Attribute) v.elementAt(i);
	  if (newAttr.label().equals(currAttr.label()) &&
	  stringArrayEquals(newAttr.catLabels(),currAttr.catLabels())) {
		if (specializesOrEquals((Individual) newAttr.target(),
								(Individual) currAttr.target())) {
	  // Replace the narrowed attribute in the list with the
	  // narrower one (ie. newAttr).
		  v.setElementAt(newAttr,i);
		} else {
 	  // The newAttr is narrowed by an attribute already in the list.
	  // So just return.
	}
	return;
	  }
	}
	// newAttr doesn't target a primitive or token and its catlabels
	// and label don't match anything in the list. So add it.
	v.addElement(newAttr);
	return;
  }  

  /** Appends the array of attributes in the second argument to the
   * array of attributes in the first argument and returns the
   * result.
   **/
  public static Attribute[] append(Attribute[] target, 
			     Attribute[] appendees) {
	Attribute[] result = new Attribute[target.length +
				      appendees.length];
	System.arraycopy(target,0,result,0,target.length);
	System.arraycopy(appendees,0,result,target.length,appendees.length);
	return result;
  }  

  /** Appends the second argument attribute to the array of
   * attributes in the first argument and returns the result.
   **/
  public static Attribute[] append(Attribute[] target, 
			     Attribute appendee) {
	Attribute[] result = new Attribute[target.length+1];
	System.arraycopy(target,0,result,0,target.length);
	result[target.length] = appendee;
	  return result;
  }  

  /** Appends the array of individuals in the second argument to the
   * array of individuals in the first argument and returns the
   * result.
   **/
  public static Individual[] append(Individual[] target, 
			      Individual[] appendees) {
	Individual[] result = new Individual[target.length +
					appendees.length];
	System.arraycopy(target,0,result,0,target.length);
	System.arraycopy(appendees,0,result,target.length,appendees.length);
	return result;
  }  

  //===========================================================================
  // PUBLIC TELL HELPER METHODS
  //===========================================================================


  /** Appends the second argument individual to the array of
   * individuals in the first argument and returns the result.
   **/
  public static Individual[] append(Individual[] target, 
			      Individual appendee) {
	Individual[] result = new Individual[target.length+1];
	System.arraycopy(target,0,result,0,target.length);
	result[target.length] = appendee;
	return result;
  }  

  /** Appends the array in the second argument to the array in the
   * first argument and returns the result.
   **/
  public static OmegaclassOrAttributeClass[] 
			  append(OmegaclassOrAttributeClass[] target, 
				 OmegaclassOrAttributeClass[] appendees) {
	OmegaclassOrAttributeClass[] result = 
	  new OmegaclassOrAttributeClass[target.length + appendees.length];
	System.arraycopy(target,0,result,0,target.length);
	System.arraycopy(appendees,0,result,target.length,appendees.length);
	return result;
  }  

  /** If the boolean is false, throws a <code>RuntimeException</code>
   * with the message as its message. Otherwise does nothing.
   **/
  public static void asserting(boolean b, String message) {
	if(b) throw new RuntimeException(message);
  }  

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface.
   *
   * @see jtelos.Individual#attrs(java.lang.String,java.lang.String)
   **/
  public static Attribute[] attrs(String[] catLabels,
				  String attrLabel,
				  Individual indiv) {
	Attribute[] result = null;
	try {
	  result = indiv.directAttrs(catLabels,attrLabel);
	} catch (AttributeNotFoundException e) {
	  try {
		result = indiv.inheritedAttrs(catLabels,attrLabel);
	  } catch (AttributeNotFoundException e2) {
		throw new AttributeNotFoundException(catLabels,
											 attrLabel,
											 indiv.telosName());
	  }
	}
	return result;
  }  

  /** 
   * Implements a static equivalent to the method <code>attrs()</code>
   * in the <code>Individual</code> interface.
   *
   * @see jtelos.Individual#attrs()
   **/
  public static Attribute[] attrs(Individual indiv) {
	Attribute[] directAttrs = indiv.directAttrs();
	Attribute[] inheritedAttrs = indiv.inheritedAttrs();
	Attribute[] result =
	  new Attribute[directAttrs.length+inheritedAttrs.length];
	System.arraycopy(directAttrs,0,result,0,directAttrs.length);
	System.arraycopy(inheritedAttrs,0,result,directAttrs.length,
		     inheritedAttrs.length);
	return result;
  }  

  /** Returns an array containing the builtin objects for a kb. They
   * correspond to invoking the following methods in the interface
   * <code>KB</code> in order:
   *
   * <p><ul>
   * <li><code>M3CLASS()</code>,
   * <li><code>M2CLASS()</code>,
   * <li><code>METACLASS()</code>,
   * <li><code>SIMPLE_CLASS()</code>,
   * <li><code>TOKEN()</code>,
   * <li><code>STRING_TYPE()</code>,
   * <li><code>INTEGER_TYPE()</code>,
   * <li><code>REAL_TYPE()</code>,
   * <li><code>PROPOSITION()</code>,
   * <li><code>INDIVIDUAL()</code>,
   * <li><code>INDIVIDUAL_CLASS()</code>,
   * <li><code>CLASS()</code>,
   * <li><code>OMEGACLASS()</code>,
   * <li><code>ATTRIBUTE_CLASS()</code>,
   * <li><code>ATTRIBUTE()</code>,
   * <li><code>SINGLE()</code> and
   * </ul>
   **/
  public static TelosObject[] builtIns(KB kb) {
	TelosObject[] result = new TelosObject[16];
	result[0] = kb.M3CLASS();
	result[1] = kb.M2CLASS();
	result[2] = kb.METACLASS();
	result[3] = kb.SIMPLE_CLASS();
	result[4] = kb.TOKEN();

	result[5] = kb.STRING_TYPE();
	result[6] = kb.INTEGER_TYPE();
	result[7] = kb.REAL_TYPE();

	result[8] = kb.PROPOSITION();
	result[9] = kb.INDIVIDUAL();
	result[10] = kb.INDIVIDUAL_CLASS();
	result[11] = kb.CLASS();
	result[12] = kb.OMEGACLASS();

	result[13] = kb.ATTRIBUTE_CLASS();
	result[14] = kb.ATTRIBUTE();
	result[15] = kb.SINGLE();
	
	return result;
  }  

  /** Computes the categories of the attribute <code>instance</code>
   * by examining all of its declarer's direct ancestors' attributes
   * (declared or inherited) and comparing their labels with
   * <code>instance</code>'s category labels. When there is a match,
   * it adds the category to the result. Since we examine all
   * attributes (inherited and declared) of the direct ancestors, we
   * don't have to examine the indirect ancestors' (ie. the parents of
   * the direct ancestors') attributes.
   **/
  public static Attribute[] categories(Attribute instance) {
	AttributeVector v = new AttributeVector();
	Individual[] directAncestors = instance.declarer().directAncestors();
	for(int i=0;i<directAncestors.length;i++) {
	  Attribute[] attrs = directAncestors[i].attrs();
	  for (int j=0;j<attrs.length;j++) {
		String[] catLabels = instance.catLabels();
		for(int k=0;k<catLabels.length;k++) {
		  if (attrs[j].label().equals(catLabels[k]))
			v.addElement(attrs[j]);
		}
	  }
	}
	return v.toArray();
  }  

  private static Attribute[]
	catLabelAndLabelSearch(String[] catLabels, 
	                   String label,
			   Attribute[] targets) {
	  if(label == null)
	return catLabelSearch(catLabels,targets);
	  AttributeVector v = new AttributeVector();
	  for(int i=0;i<targets.length;i++)
	if (stringArrayEquals(targets[i].catLabels(),catLabels) &&
	  targets[i].label().equals(label))
	  v.addElement(targets[i]);
	return v.toArray();
  }  

  /**
	private static void addReference(Individual target, 
  				   Attribute attribute ) {
	  try {
	  target.addReferences(new Attribute[]{attribute}); 
	} catch (TelosMethodNotImplementedException e) {
	  // Some implementations use the attribute constructor to add
	  // references.
	}
  }
  **/

  private static Attribute[] catLabelSearch(String[] catLabels, 
					    Attribute[] targets) {
	AttributeVector v = new AttributeVector();
	for(int i=0;i<targets.length;i++)
	  if (stringArrayEquals(targets[i].catLabels(),catLabels))
	v.addElement(targets[i]);
	return v.toArray();
  }  

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface. It searches linearly through the direct attributes for
   * matching category labels and attribute label, but it requires no
   * extra fields.
   *
   * @see jtelos.Individual#directAttrs(java.lang.String[],java.lang.String)
   **/
  public static Attribute[] directAttrs(String[] catLabels,
					String label,
					Individual indiv) {
	Attribute[] result = null;
	result = catLabelAndLabelSearch(catLabels,
									label,
									indiv.directAttrs());
	if (result.length == 0)
	  throw new AttributeNotFoundException(catLabels,
										   label,
										   indiv.telosName());
	return result;
  }  

  /**
   * Implements equivalent instance method of the interface
   * <code>Individual</code>. Note that this excludes the attribute
   * classes since they are not individuals. <em>But they are children
   * of some omegaclasses.</em> So <code>directOmegaChildren()</code>
   * in the interface <code>Omegaclass</code> should be invoked
   * instead. To enforce this, some implementations of this API may
   * choose to override this method to throw a
   * <code>TelosMethodNotImplementedException</code>.
   *
   * @see jtelos.Individual#directChildren
   * @see jtelos.util.TelosMethodNotImplementedException
   **/
  public static Individual[] directChildren(Omegaclass parent) {
	Individual[] result;
	Vector v = new Vector();
	OmegaclassOrAttributeClass[] omegaChildren =
	  parent.directOmegaChildren();
	for(int i=0;i<omegaChildren.length;i++)
	  if (omegaChildren[i] instanceof Individual)
	v.addElement(omegaChildren[i]);
	result = new Individual[v.size()];
	for(int i=0;i<v.size();i++) result[i] = (Individual) v.elementAt(i);
	return result;
  }  

  /** Returns the attributes that are directly narrowed by this
   * attribute.  Corresponds to the instance method
   * <code>directlyNarrowedBy()</code> in the interface
   * <code>Attribute</code>.
   * 
   * @see Attribute#directlyNarrowedBy() 
   **/
  public static Attribute[] directlyNarrowedBy(Attribute parent) {
	if (parent.target() instanceof PrimitiveLiteral ||
	((Individual)parent.target()).level() == TOKEN_LEVEL)
	  return new Attribute[0];
	return 
	getDirectlyNarrowedByHelper(parent,parent.declarer().directChildren());
  }  

  /** Returns the attributes that directly narrow this attribute.
   * Corresponds to the instance method <code>directlyNarrows()</code>
   * in the interface <code>Attribute</code>.
   * 
   * @see Attribute#directlyNarrows()
   **/
  public static Attribute[] directlyNarrows(Attribute child) {
	if (child.target() instanceof PrimitiveLiteral ||
	((Individual)child.target()).level() == TOKEN_LEVEL)
	  return new Attribute[0];
	AttributeVector v = new AttributeVector();
	Individual[] directParents = child.declarer().directParents();
	for (int i=0;i<directParents.length;i++) {
	  try {
		Attribute[] currAttrs =
		  directParents[i].attrs(child.catLabels(),child.label());
		for(int j=0;j<currAttrs.length;j++)
		  v.addElement(currAttrs[j]);
	  } catch (AttributeNotFoundException e) {} // Do nuthin!
	}
	return v.toArray();
  }  

  // This method does not yet prevent duplicates.
  // 
  // Add a addElements(Attribute[]) method to AttributeVector and this
  // can be sped up and simplified (using System.arraycopy in that
  // method)
  private static Attribute[] 
	getDirectlyNarrowedByHelper(Attribute parent, Individual[] children) {
	Vector v = new Vector();
	Attribute[] currAttrs = null;
	int count = 0;
	for(int i=0;i<children.length;i++) {
	  try {currAttrs = children[i].directAttrs(parent.catLabels(),
					       parent.label());}
	  catch (AttributeNotFoundException e) {
	currAttrs = getDirectlyNarrowedByHelper(parent,
			children[i].directChildren());
	  }
	  if(currAttrs != null && currAttrs.length > 0) {
	count += currAttrs.length;
	v.addElement(currAttrs);
	  }
	}
	Attribute[] result = new Attribute[count];
	count = 0;
	for(int i=0;i<v.size();i++) {
	  currAttrs = (Attribute[]) v.elementAt(i);
	  System.arraycopy(currAttrs,0,result,count,currAttrs.length);
	  count += currAttrs.length;
	}
	return result;
  }  

  /** 
   * Implements equivalent method in the <code>Individual</code>
   * interface. It searches linearly through the inherited attributes
   * for matching category labels and attribute label, but it requires
   * no extra fields.
   *
   * @see jtelos.Individual#inheritedAttrs(java.lang.String[],java.lang.String)
   **/
  public static Attribute[] inheritedAttrs(String[] catLabels,
										   String label,
										   Individual indiv) {
	Attribute[] result = null;
	result = catLabelAndLabelSearch(catLabels,
									label,
									indiv.inheritedAttrs());
	if (result.length == 0)
	  throw new AttributeNotFoundException(catLabels,
										   label,
										   indiv.telosName());
	return result;
  }  

  /** Performs static version of the <code>inheritedAttrs()</code>
   * method in <code>Individual</code>. 
   *
   * <p>It finds the parents of that individual and searches for a
   * match between the argument individual's attributes and those in
   * each of the parents. When a match is found on the attribute's
   * label and category labels, the potentially inherited attribute
   * has been narrowed by a declared attribute which narrows its
   * target. Thus the potentially inherited attribute is excluded from
   * the list.
   *
   * <p>Similarly in the course of accumulating inherited attributes,
   * one inherited attribute may narrow another inherited attribute
   * that is already in the list. When this happens, the narrowing
   * attribute replaces the narrowed attribute in the list. If a
   * narrower attribute is added to the list before the wider
   * attribute, the wider attribute is simply excluded.
   *
   * <p>Note that this narrowing phenomenon can only happen when the
   * target of an attribute is a simple class, metaclass or higher. It
   * cannot happen when the target is a token or primitive literal,
   * <em>since attributes targetting tokens or literals are not
   * inherited.</em>
   *
   * @see jtelos.Individual#inheritedAttrs()
   **/
  public static Attribute[] inheritedAttrs(Individual indiv) {
	AttributeVector v = new AttributeVector();
	Individual[] directParents = indiv.directParents();
	for (int i=0;i<directParents.length;i++) {
	  Attribute[] currAttrs = directParents[i].attrs();
	  for (int j=0;j<currAttrs.length;j++) {
		try {
		  Attribute[] attrs =
			indiv.directAttrs(currAttrs[j].catLabels(),
							  currAttrs[j].label());
		} catch (AttributeNotFoundException e) {
		  addIfNotNarrowedOrContained(currAttrs[j],v);
		}
	  }
	}
	return v.toArray();
  }  

  /** Initializes the builtins in a kb (assuming they are all
   * available from invoking their respective methods in the interface
   * <code>KB</code>. The relationships between builtins are built up
   * by invoking the following methods, which are assumed to be
   * supported: <code>addDirectAncestorsWithInverses()</code> and
   * <code>addDirectParentsWithInverses()</code> in the interface
   * <code>Individual</code>. It also invokes
   * <code>addOmegaChildren()</code> in the interface
   * <code>Omegaclass</code>.
   *
   * @see Individual#addDirectAncestorsWithInverses()
   * @see Individual#addDirectParentsWithInverses()
   * @see Omegaclass#addDirectOmegaChildren()
   **/
  public static void initializeBuiltIns(KB kb) {

	Individual M3CLASS = (Individual) kb.M3CLASS();
	Individual M2CLASS = (Individual) kb.M2CLASS();
	Individual METACLASS = (Individual) kb.METACLASS();
	Individual SIMPLE_CLASS = (Individual) kb.SIMPLE_CLASS();
	Individual TOKEN = (Individual) kb.TOKEN();
	Individual STRING_TYPE = (Individual) kb.STRING_TYPE();
	Individual INTEGER_TYPE = (Individual) kb.INTEGER_TYPE();
	Individual REAL_TYPE = (Individual) kb.REAL_TYPE();
	Omegaclass INDIVIDUAL = (Omegaclass) kb.INDIVIDUAL();
	Omegaclass INDIVIDUAL_CLASS = 
	  (Omegaclass) kb.INDIVIDUAL_CLASS();
	Omegaclass CLASS = (Omegaclass) kb.CLASS();
	Omegaclass PROPOSITION = (Omegaclass) kb.PROPOSITION();
	Omegaclass OMEGACLASS = (Omegaclass) kb.OMEGACLASS();
	AttributeClass ATTRIBUTE_CLASS = kb.ATTRIBUTE_CLASS();
	AttributeClass ATTRIBUTE = kb.ATTRIBUTE();
	AttributeClass SINGLE = kb.SINGLE();

	// Add ancestors to omegaclasses, and vice-versa
	INDIVIDUAL.addDirectAncestorsWithInverses(
	  new Individual[]{INDIVIDUAL,PROPOSITION,INDIVIDUAL_CLASS});
	PROPOSITION.addDirectAncestorsWithInverses(
	  new Individual[]{PROPOSITION,INDIVIDUAL_CLASS});
	INDIVIDUAL_CLASS.addDirectAncestorsWithInverses(
	  new Individual[]{INDIVIDUAL,INDIVIDUAL_CLASS,PROPOSITION,CLASS});
	OMEGACLASS.addDirectAncestorsWithInverses(
	  new Individual[]{OMEGACLASS,INDIVIDUAL_CLASS,PROPOSITION,CLASS,
		       INDIVIDUAL});
	CLASS.addDirectAncestorsWithInverses(
	  new Individual[]{CLASS,PROPOSITION,INDIVIDUAL_CLASS});

	// Add parents to non-omegaclasses and vice-versa
	addDirectParentWithInverse(STRING_TYPE,TOKEN);
	addDirectParentWithInverse(INTEGER_TYPE,TOKEN);
	addDirectParentWithInverse(REAL_TYPE,TOKEN);

	CLASS.addDirectOmegaChildren(
	  new OmegaclassOrAttributeClass[]
		{ OMEGACLASS,INDIVIDUAL_CLASS,ATTRIBUTE_CLASS });
	PROPOSITION.addDirectOmegaChildren(
	  new OmegaclassOrAttributeClass[]
		{ INDIVIDUAL,CLASS,INDIVIDUAL_CLASS,OMEGACLASS,
	  ATTRIBUTE_CLASS,ATTRIBUTE });
	INDIVIDUAL.addDirectOmegaChildren(
	  new OmegaclassOrAttributeClass[]
		{ OMEGACLASS,INDIVIDUAL_CLASS });
	INDIVIDUAL_CLASS.addDirectOmegaChildren(
	  new OmegaclassOrAttributeClass[]{OMEGACLASS});
	// OMEGACLASS has no children.
  }  

  /** Computes the instances of the attribute <code>category</code> by
   * examining all of its declarer's instances' declared attributes'
   * categories and comparing these categories' labels with
   * <code>category</code>'s label. When there is a match, it adds the
   * category to the result.
   **/
  public static Attribute[] instances(Attribute category) {
	AttributeVector v = new AttributeVector();
	Individual[] instances = category.declarer().instances();
	String label = category.label();
	for(int i=0;i<instances.length;i++) {
	  Attribute[] directAttrs = instances[i].directAttrs();
	  for (int j=0;j<directAttrs.length;j++) {
	String[] catLabels = directAttrs[j].catLabels();
	for (int k=0;k<catLabels.length;k++)
	  if (catLabels[k].equals(label))
	    v.addElement(directAttrs[j]);
	  }
	}
	return v.toArray();
  }  

  /** Decides if a telos object (ie. an individual, or attribute) is
   * builtin.
   **/
  public static boolean isBuiltIn(TelosObject obj) {
	TelosObject[] builtIns = obj.kb().builtIns();
	for(int i=0;i<builtIns.length;i++) if(obj == builtIns[i]) return true;
	return false;
  }      

	public static boolean isCategoryOf(Attribute candidate, Attribute instance) {
		Attribute[] categories = instance.categories();
		for (int i = 0; i < categories.length; i++) if (candidate == categories[i]) return true;
		return false;
	}

	public static boolean isDirectAncestorOf(Individual candidate, Individual instance) {
		Individual[] directAncestors = instance.directAncestors();
		for (int i = 0; i < directAncestors.length; i++) 
			if (candidate == directAncestors[i]) return true;
		return false;
	}

public static boolean isPrimitive(IndividualOrLiteral indivOrLit) {
	if(!(indivOrLit instanceof Individual)) return true;
	else return
		((indivOrLit == ((Individual)indivOrLit).kb().STRING_TYPE()) ||
		 (indivOrLit == ((Individual)indivOrLit).kb().INTEGER_TYPE()) ||
		 (indivOrLit == ((Individual)indivOrLit).kb().REAL_TYPE()));
}

  /** Returns a string indicating the level of instantiation according
   * to the interface <code>Levels</code>.
   *
   * @see jtelos.Levels
   **/
  public static String levelString(int level) {
	switch (level) {
	  case OMEGACLASS_LEVEL : return "OmegaClass";
	  case M4CLASS_LEVEL : return "MetaMetaMetaMetaClass";
	  case M3CLASS_LEVEL : return "MetaMetaMetaClass";
	  case M2CLASS_LEVEL : return "MetaMetaClass";
	  case METACLASS_LEVEL : return "MetaClass";
	  case SIMPLE_CLASS_LEVEL : return "SimpleClass";
	  case TOKEN_LEVEL : return "Token";
	}
	throw new RuntimeException(
	  "TelosObject.levelString couldn't find level.");
  }  

  //===========================================================================
  // PRIVATE HELPER METHOD
  //===========================================================================

  private static void  p(String s) { System.err.println(s); }  

  private static void  p(boolean debug, String s) { if(debug) System.err.println(s); }  

  //===========================================================================
  // OTHER PUBLIC HELPER METHODS
  //===========================================================================

  /** Breaks a string representing a file path name into two
   * strings. The first is the directory path (excluding the
   * terminating separator) and the second is the file name.
   **/
  public static String[] pathBreaker(String path) {
	//p("StaticHelper.pathBreaker: "+path);
	String[] result = new String[2];
	int cutIndex = path.lastIndexOf(java.io.File.separator);
	result[0] = path.substring(0,cutIndex);
	result[1] = path.substring(cutIndex+1,path.length());
	return result;
  }  

  private static Individual[] removeBuiltIns(Individual[] individuals) {
	Vector v = new Vector();
	for(int i=0;i<individuals.length;i++) {
	  if(!isBuiltIn(individuals[i]))
	v.addElement(individuals[i]);
	}
	Individual[] result = new Individual[v.size()];
	for(int i=0;i<v.size();i++) 
	  result[i] = (Individual) v.elementAt(i);
	return result;
  }  

  public static Individual[] removeIndividual(Individual[] list, 
					       Individual removee,
					       String listName,
					       Individual owner) {
	boolean found = false;
	Vector v = new Vector();
	for(int i=0;i<list.length;i++) {
	  if(list[i] != removee) v.addElement(list[i]);
	  else found = true;
	}
	if(!found) throw new IndividualNotFoundException(removee.telosName(),
						     listName,
						     owner.telosName());
	Individual[] result = new Individual[v.size()];
	for(int i=0;i<v.size();i++) result[i] = (Individual) v.elementAt(i);
	return result;
  }  

  /**
   * Assists the <code>setLevel(int)</code> method in the interface
   * <code>Individual</code>. This method requires the side effect
   * that the builtin ancestor (TOKEN,SIMPLE_CLASS,METACLASS, etc.) of
   * an individual be added to the individual's ancestors and the
   * individual needs to be added to the builtin's instances.
   *
   * @see jtelos.Individual#setLevel(int level)
   **/
  public static void setBuiltInAncestor(int level, Individual indiv) {
	Individual ancestor = null;
	KB kb = indiv.kb();
	switch (level) {
	  case TOKEN_LEVEL : 
	ancestor = (Individual) kb.TOKEN(); break;
	  case SIMPLE_CLASS_LEVEL : 
	ancestor = (Individual) kb.SIMPLE_CLASS(); break;
	  case METACLASS_LEVEL : 
	ancestor = (Individual) kb.METACLASS(); break;
	  case M2CLASS_LEVEL : 
	ancestor = (Individual) kb.M2CLASS(); break;
	  case M3CLASS_LEVEL : 
	ancestor = (Individual) kb.M3CLASS(); break;
	  case M4CLASS_LEVEL : return;
	  case OMEGACLASS_LEVEL : return;
	  default :
		p("StaticHelper.setBuiltInAncestor("+
	  level+") couldn't identify level");
	}
	indiv.addDirectAncestorsWithInverses(new Individual[]{ancestor});
  }  

  public static Attribute[] sortAttributeArray(Attribute[] attributes) {
	SortTelosObjectVector v = new SortTelosObjectVector();
	for(int i=0;i<attributes.length;i++) 
	  v.addElement((TelosObject)attributes[i]);
	for(int i=0;i<attributes.length;i++) 
	  attributes[i] = (Attribute) v.elementAt(i);
	return attributes;
  }  

  public static Individual[] sortIndividualArray(Individual[] individuals) {
	SortTelosObjectVector v = new SortTelosObjectVector();
	for(int i=0;i<individuals.length;i++) 
	  v.addElement((TelosObject)individuals[i]);
	for(int i=0;i<individuals.length;i++) 
	  individuals[i] = (Individual) v.elementAt(i);
	return individuals;
  }  

  public static boolean specializesOrEquals(Individual first,
											 Individual second) {
	// This comparison assumes identity by oid
	if (first == second) return true;
	Individual[] directChildren = second.directChildren();
	for(int i=0;i<directChildren.length;i++)
	  if (specializesOrEquals(first,directChildren[i]))
		return true;
	return false;
  }  

  public static boolean stringArrayEquals(String[] first,
										   String[] second) {
	if(first.length != second.length) return false;
	for(int i=0;i<first.length;i++) 
	  if(!first[i].equals(second[i])) return false;
	return true;
  }  

  /** This is used to turn arrays of strings into a single string in
   * order to "pretty print" them. It inserts a comma, without a
   * space, between the strings in the argument array. It performs the
   * inverse operation as <code>stringToStringArray(String)</code>.
   *
   * @see #stringToStringArray(java.lang.String)
   **/
  public static String stringArrayToString(String[] catLabels) {
	String result = catLabels[0];
	for(int i=1;i<catLabels.length;i++) result +=","+catLabels[i];
	return result;
  }  

  /** This method converts a string (an <code>java.lang.String</code>
   * object) containing commas to an array of strings which are the
   * strings between the commas in the argument. It is used to turn a
   * single string containing category labels to an array of category
   * labels. It performs the inverse operation as
   * <code>stringToStringArray(String[])</code>.
   *
   * @see #stringArrayToString(java.lang.String[])
   **/
  public static String[] stringToStringArray(String s) {
	Vector v = new Vector();
	int start = 0;
	int ind = s.indexOf(",",0);
	while (ind != -1) {
	  v.addElement(s.substring(start,ind));
	  start = ind+1;
	  ind = s.indexOf(",",start);
	}
	v.addElement(s.substring(start,s.length()));
	String[] result = new String[v.size()];
	for(int i=0;i<v.size();i++)
	  result[i] = (String) v.elementAt(i);
	return result;
  }  

  /** This static method returns a string which contains a Telos
   * declaration for the individual (in the Telos language). This
   * method is used by <code>jtelos.example.exKB</code> to serialize
   * (store) the contents of the KB on disk.
   **/
  public static String telosDeclaration(Individual individual) {
	 String result = levelString(individual.level()) + " " +
	   individual.telosName();
	 Individual[] directAncestors = 
	   removeBuiltIns(individual.directAncestors());
	 if(directAncestors.length >0) result += "\n    IN "+directAncestors[0];
	 for(int i=1;i<directAncestors.length;i++)
	   result += ", "+directAncestors[i];
	 Individual[] directParents = individual.directParents();
	 if(directParents.length >0) result += "\n    ISA "+directParents[0];
	 for(int i=1;i<directParents.length;i++)
	   result += ", "+directParents[i];
	 Attribute[] directAttrs = individual.directAttrs();
	 if(directAttrs.length >0) result += "\n    WITH";
	 for(int i=0;i<directAttrs.length;i++) {
	   String[] catLabels = directAttrs[i].catLabels();
	   result += "\n        "+catLabels[0];
	   for(int j=1;j<catLabels.length;j++) result += ", "+catLabels[j];
	   if (directAttrs[i].label().equals("\"\""))
		  result += "\n           ";
	   else result += "\n            " + directAttrs[i].label();
	   result += " : "+directAttrs[i].target().telosName();
	 }
	 return result += "\nEND";
  }  

  /** Returns the <code>telosName</code> of an attribute (as defined
   * in this API) given its declarer, category labels, label and
   * target. It should return the same result as invoking the
   * <code>telosName()</code> method on the corresponding attribute.
   *
   * @see NamedObject#telosName()
   **/
  public static String telosName(Individual declarer,
				 String[] catLabels,
				 String label,
				 IndividualOrLiteral target) {
	return declarer.telosName()+"."+
	   stringArrayToString(catLabels)+"."+label+":"+target.telosName();
  }  

  /**
   * Returns a RuntimeEncapsulatorException that wraps the arguments.
   **/
  public static RuntimeEncapsulatorException wrap(Throwable e,
												  String message) {
	return new RuntimeEncapsulatorException(e,message + " caught Throwable.");
  }  

}