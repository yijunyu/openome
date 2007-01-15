
package jtelos.example;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Hashtable;

import jtelos.Attribute;
import jtelos.AttributeClass;
import jtelos.AttributeNotInKBException;
import jtelos.ChildrenExistException;
import jtelos.ImmutableBuiltInException;
import jtelos.Individual;
import jtelos.IndividualNotInKBException;
import jtelos.IndividualOrLiteral;
import jtelos.InstancesExistException;
import jtelos.KB;
import jtelos.Modes;
import jtelos.Omegaclass;
import jtelos.ReferencedByAttributeException;
import jtelos.Repository;
import jtelos.StaticHelper;
import jtelos.TelosMethodNotImplementedException;
import jtelos.TelosObject;
import jtelos.apps.Parser;

/**
 * This class implements the <code>KB</code> interface 
 *
 * @see jtelos.KB
 **/
public class exKB implements KB { 

  //===========================================================================
  // PRIVATE FIELDS
  //===========================================================================

  protected String name;
  protected Repository repository;
  
  protected Hashtable individuals = new Hashtable();
  protected Hashtable attributes = new Hashtable();

  protected TelosObject[] builtIns;

  protected Individual M3CLASS;
  protected Individual M2CLASS; 
  protected Individual METACLASS;
  protected Individual SIMPLE_CLASS;
  protected Individual TOKEN;

  protected Individual STRING_TYPE;
  protected Individual INTEGER_TYPE;
  protected Individual REAL_TYPE;

  protected Omegaclass PROPOSITION;
  protected Omegaclass CLASS;
  protected Omegaclass INDIVIDUAL;
  protected Omegaclass INDIVIDUAL_CLASS;
  protected Omegaclass OMEGACLASS;

  // Note the lines below require that the lines above execute
  // first, since the exAttribute constructor takes some of these
  // builtins as arguments (so they have to initialize).
  protected AttributeClass ATTRIBUTE_CLASS;
  protected AttributeClass ATTRIBUTE;
  protected AttributeClass SINGLE;



  protected exKB() {}  

  protected exKB(String name, Repository repository) {
	this.name = name;
	this.repository = repository;
	initializeBuiltIns();
	try {
	  File file = new File(fileName());
	  if(file.exists() && file.length()>0) {
	restore();
	p(true,"Reloading exKB: '"+name + "' which is already populated."); 
	  }
	} catch (Throwable e) { StaticHelper.wrap(e,"exKB constructor"); }
  }  

  //===========================================================================
  // PUBLIC CONSTRUCTOR
  //===========================================================================

  protected void addDirectAttrClasses(Individual declarer) {
	((exIndividual)declarer).directAttrs_val =
	  StaticHelper.append(((exIndividual)declarer).directAttrs_val,
	     new Attribute[]{ATTRIBUTE(),SINGLE()}); 
  }  

  /**
   * Returns the unique Java instance of the attribute class
   * <code>ATTRIBUTE</code> for this KB.
   **/
  public AttributeClass ATTRIBUTE() { return ATTRIBUTE; }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#attribute(java.lang.String)
   **/
  public Attribute attribute(String telosName) {
	Attribute result = (Attribute) attributes.get(telosName);
	if (result == null)
	  throw new AttributeNotInKBException(telosName,name());
	else return result;
  }  

  /** Returns the concrete Java instance of the abstract singleton
   * Java class <code>ATTRIBUTE_CLASS</code> for this KB.
   **/
  public AttributeClass ATTRIBUTE_CLASS() { return ATTRIBUTE_CLASS; }  

  public Attribute[] attributes() {
	Attribute[] result = new Attribute[attributes.size()];
	Enumeration en = attributes.elements();
	for(int i=0;i<result.length;i++) result[i] = (Attribute) en.nextElement();
	return result;
  }  

  public TelosObject[] builtIns() { return builtIns; }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#CLASS()
   **/
  public Omegaclass CLASS() { return CLASS; }  

  public boolean containsOnlyBuiltIns() 
	{ return individuals().length + attributes.size() == 16; }

  public void deletePersistence() {
	try {
	  File file = new File(fileName());
	  if(file.exists()) {
	file.delete();
	p(true,"Delete persistent image of KB: '"+name() + "'."); 
	  }
	} catch (Throwable e) { 
	  StaticHelper.wrap(e,"exKB.deletePersistence invoked on: "+name()); 
	}
  }  

  public String fileName() { return name()+".tel"; }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#INDIVIDUAL()
   **/
  public Omegaclass INDIVIDUAL() { return INDIVIDUAL; }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#individual(java.lang.String)
   **/
  public Individual individual(String telosName) {
	Individual result = (Individual) individuals.get(telosName);
	if (result == null)
	  throw new IndividualNotInKBException(telosName,name());
	else return result;
  }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#INDIVIDUAL_CLASS()
   **/
  public Omegaclass INDIVIDUAL_CLASS() { return INDIVIDUAL_CLASS; }  

  public Individual[] individuals() {
	Individual[] result = new Individual[individuals.size()];
	Enumeration en = individuals.elements();
	for(int i=0;i<result.length;i++) result[i] = (Individual) en.nextElement();
	return result;
  }  

  private void initializeBuiltIns() {

	M3CLASS = new exIndividual("M3Class",M4CLASS_LEVEL,this);
	M2CLASS = new exIndividual("M2Class",M3CLASS_LEVEL,this);
	METACLASS = new exIndividual("MetaClass",M2CLASS_LEVEL,this);
	SIMPLE_CLASS = new exIndividual("SClass",METACLASS_LEVEL,this);
	TOKEN = new exIndividual("Token",SIMPLE_CLASS_LEVEL,this);
	
	STRING_TYPE = new exIndividual("String",SIMPLE_CLASS_LEVEL,this);
	INTEGER_TYPE = new exIndividual("Integer",SIMPLE_CLASS_LEVEL,this);
	REAL_TYPE = new exIndividual("Real",SIMPLE_CLASS_LEVEL,this);
	
	PROPOSITION = newOmegaclass("Proposition");
	CLASS = newOmegaclass("Class");
	INDIVIDUAL = newOmegaclass("Individual");
	INDIVIDUAL_CLASS = newOmegaclass("IndividualClass");
	OMEGACLASS = newOmegaclass("OmegaClass");

	ATTRIBUTE_CLASS = new exAttributeClassBuiltIn("attributeclass",CLASS());
	ATTRIBUTE = new exAttributeClassBuiltIn("attribute",PROPOSITION());
	SINGLE = new exAttributeClassBuiltIn("single",PROPOSITION());

	StaticHelper.initializeBuiltIns(this);

	// Add attribute classes to non-omegaclass builtins.  Does not
	// show them as the declarer (since Individual is the declarer).
	addDirectAttrClasses(TOKEN());
	addDirectAttrClasses(SIMPLE_CLASS());
	addDirectAttrClasses(METACLASS());
	addDirectAttrClasses(M2CLASS());
	addDirectAttrClasses(M3CLASS());

	builtIns = StaticHelper.builtIns(this);
	for(int i=0;i<builtIns.length;i++) {
	  //p(builtIns[i] == null,"builtIns["+i+"] == null");
	  if(builtIns[i] instanceof Individual)
	individuals.put(builtIns[i].telosName(),builtIns[i]);
	  else
	attributes.put(builtIns[i].telosName(),builtIns[i]);
	}
  }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#INTEGER_TYPE()
   **/
  public Individual INTEGER_TYPE() { return INTEGER_TYPE; }  

  public boolean isEmpty() { return false; }  

  public void load(String fileName) { 
	new Parser(fileName,this); 
	p("exKB '"+name()+"' loaded file: "+fileName);
  }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#M2CLASS()
   **/
  public Individual M2CLASS() { return M2CLASS; }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#M3CLASS()
   **/
  public Individual M3CLASS() { return M3CLASS; }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#METACLASS()
   **/
  public Individual METACLASS() { return METACLASS; }  

  public int mode() { return Modes.Persistent; }  

  /** The name of the KB. **/
  public String name() { return name; }  

  // Get KB from declarer
  public Attribute newAttribute(Individual declarer,
				String[] catLabels,
				String label,
				IndividualOrLiteral target) {
	 Attribute result = (Attribute) attributes.get(
	   StaticHelper.telosName(declarer,catLabels,label,target));
	 if (result != null) return result;
	 result = new exAttribute(declarer,catLabels,label,target);
	 attributes.put(result.telosName(),result);
	 return result;
  }  

  public Individual newIndividual(String telosName, int level) {
	 Individual result = (Individual) individuals.get(telosName);
	 if (result != null) {
	   if(!result.isDeclared()) {
		 result.setLevel(level);
		 result.setDeclared(true);
	   }
	   return result;
	 }
	 result = new exIndividual(telosName,level,this);
	 individuals.put(telosName,result);
	 return result;
  }  

  private Omegaclass newOmegaclass(String telosName) 
	{ return new exOmegaclass(telosName,this); }

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#OMEGACLASS()
   **/
  public Omegaclass OMEGACLASS() { return OMEGACLASS; }  

  protected void  p(String s) { System.err.println(s); }  

  protected void  p(boolean debug, String s) { if(debug) p(s); }  

  public Individual possiblyUndeclaredNew(String telosName) {
	Individual result = (Individual) individuals.get(telosName);
	if (result != null) return result;
	result = exIndividual.possiblyUndeclaredNew(telosName,this);
	individuals.put(telosName,result);
	return result;
  }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#PROPOSITION()
   **/
  public Omegaclass PROPOSITION() { return PROPOSITION; }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#REAL_TYPE()
   **/
  public Individual REAL_TYPE() { return REAL_TYPE; }  

  //===========================================================================
  // PACKAGE-VISIBLE HELPER METHODS
  //===========================================================================

  private static Individual[] removeIndividual(Individual[] list, 
					       Individual removee,
					       String listName,
					       Individual owner) {
	return StaticHelper.removeIndividual(list,removee,listName,owner);
  }  

  public void removeIndividual(Individual indiv) {
	if(StaticHelper.isBuiltIn(indiv))
	  throw new ImmutableBuiltInException(indiv.telosName(),"");
	if(indiv.referencedBy().length > 0)
	  throw new ReferencedByAttributeException(indiv.telosName(),"");
	if(indiv.instances().length > 0)
	  throw new InstancesExistException(indiv.telosName(),"");
	if(indiv.directChildren().length > 0)
	  throw new ChildrenExistException(indiv.telosName(),"");
	Individual[] directAncestors = indiv.directAncestors();
	for(int i=0;i<directAncestors.length;i++) 
	  ((exIndividual)directAncestors[i]).instances_val =
	removeIndividual(((exIndividual)directAncestors[i]).instances_val,
			 indiv,
			 "instances",
			 directAncestors[i]);
	Individual[] directParents = indiv.directParents();
	for(int i=0;i<directParents.length;i++)
	  ((exIndividual)directParents[i]).directChildren_val =
	removeIndividual(((exIndividual)directParents[i]).directChildren_val,
			 indiv,
			 "direct children",
			 directParents[i]);
	Attribute[] directAttrs = indiv.directAttrs();
	for(int i=0;i<directAttrs.length;i++) 
	  indiv.removeDirectAttr(directAttrs[i]);
	individuals.remove(indiv.telosName());
  }  

  //===========================================================================
  // PUBLIC METHODS
  //===========================================================================

  public Repository repository() { return repository; }  

  protected void restore() {
	new Parser(fileName(),this);
  }  

  public void RETELL(String untellInput, String retellInput) {
	throw new TelosMethodNotImplementedException("jtelos.example.exKB",
						 "RETELL(String,String)");
  }  

  public void save() {
	try {
	  BufferedWriter writer = new BufferedWriter(new FileWriter(fileName()));
	  Individual[] individuals = individuals();
	  for(int i=0;i<individuals.length;i++) {
	if(!StaticHelper.isBuiltIn(individuals[i]))
	  writer.write(StaticHelper.telosDeclaration(individuals[i])+"\n\n");
	  }
	  writer.flush();
	  writer.close();
	  p(true,"exKB '"+name()+"' has been saved to "+fileName());
	} catch (Throwable e) { StaticHelper.wrap(e,"exKB.save()"); }
  }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#SIMPLE_CLASS()
   **/
  public Individual SIMPLE_CLASS() { return SIMPLE_CLASS; }  

  /**
   * Returns the unique Java instance of the attribute class
   * <code>SINGLE</code> for this KB.
   **/
  public AttributeClass SINGLE() { return SINGLE; }  

  public int size() { return individuals.size(); }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#STRING_TYPE()
   **/
  public Individual STRING_TYPE() { return STRING_TYPE; }  

  public boolean supportsExtendedAttributes() { return true; }  

  public boolean supportsExtendedIndividuals() { return false; }  

  public void TELL(String tellInput) {
	throw new TelosMethodNotImplementedException("jtelos.example.exKB",
						 "TELL(String)");
  }  

  /**
   * Implements the equivalent method in the interface
   * <code>KB</code>.
   * 
   * @see KB#TOKEN()
   **/
  public Individual TOKEN() { return TOKEN; }  

  public void UNTELL(String untellInput) {
	throw new TelosMethodNotImplementedException("jtelos.example.exKB",
						 "UNTELL(String)");
  }  

  public void wipe() {
	p("Wiping KB '"+name()+"'");
	individuals = new Hashtable();
	attributes = new Hashtable();
	initializeBuiltIns();
  }  

}