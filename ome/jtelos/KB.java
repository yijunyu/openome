
package jtelos;



/**  This interface models a Telos KB. A KB is a set of individuals
 * and attributes loaded and available for conducting
 * transactions. Several KB's can be active at a time in a jtelos
 * repository (a Java application using this API). They may even use
 * different implementations of this API.
 *
 * <p>This interface defines a set of methods which return the
 * builtins for Telos. They are implemented by Java classes that
 * implement the interface <code>jtelos.util.KBSingleton</code>.
 *
 * @see BuiltIn
 * @see jtelos.util.KBSingleton
 **/
public interface KB extends Levels { 



  /** Returns the unique Java instance of the attribute class
   * <code>ATTRIBUTE</code> for this KB. This corresponds to the
   * attribute class
   * <code>Individual.attributeclass.attribute:Proposition</code> in
   * Telos (according to the naming convention for attributes used in
   * this API). It is declared by the omegaclass
   * <code>Individual</code> and takes the omegaclass
   * <code>Proposition</code> as its target. Its category is the
   * attribute class returned by <code>ATTRIBUTE_CLASS()</code>.
   *
   * @see #INDIVIDUAL()
   * @see #PROPOSITION()
   * @see #ATTRIBUTE_CLASS()
   **/
  public AttributeClass ATTRIBUTE();  

  /** 
   * Produces the attribute in the KB matching the name, or throws an
   * exception if it isn't there. For naming conventions for
   * attributes, see the <code>telosName()</code> method in
   * <code>NamedObject</code>.
   *
   * @see NamedObject#telosName()
   *
   * @exception AttributeNotInKBException when there is no attribute
   * in the KB whose name matches the <code>telosName</code> paremeter.
   **/
  public Attribute attribute(String telosName);  

  /** Returns the concrete Java instance of the attribute class
   * <code>ATTRIBUTE_CLASS</code> for this KB. This correpsonds to
   * <code>Individual.attributeclass.attributeclass:Class</code> in
   * Telos (according to the naming convention for attributes used in
   * this API). It is declared by the omegaclass
   * <code>Individual</code> and takes the omegaclass
   * <code>Class</code> as its target. This attribute class has all
   * attribute classes as Telos instances. It has three other Telos
   * instances returned by the following methods in <code>KB</code>:
   * <code>ATTRIBUTE()</code> and <code>SINGLE()</code>.
   * These are delineated below.
   *
   *
   * @see #INDIVIDUAL()
   * @see #CLASS()
   * @see #ATTRIBUTE()
   * @see #SINGLE()
   **/
  public AttributeClass ATTRIBUTE_CLASS();  

  public Attribute[] attributes();  

  public TelosObject[] builtIns();  

  /** Returns the unique Java instance of the omegaclass
   * <code>CLASS</code> for this KB. This corresponds to
   * <code>Class</code> in the Telos language.
   **/
  public Omegaclass CLASS();  

  /**
   * Returns true if the KB contains only builtins.
   **/
  public boolean containsOnlyBuiltIns();  

  public void deletePersistence();  

  /** Returns the unique Java instance of the omegaclass
   * <code>INDIVIDUAL</code> for this KB. This corresponds to
   * <code>Individual</code> in the Telos language -- not to be
   * confused with the Java interface <code>Individual</code> in this
   * API -- which has many instances per KB.
   **/
  public Omegaclass INDIVIDUAL();  

  /** 
   * Produces the individual in the KB matching the name and level (as
   * in the <code>Levels</code> interface), or throws an exception if
   * it isn't there.
   *
   * @see Levels
   * 
   * @exception IndividualNotInKBException when there is no individual
   * in the KB whose name matches the <code>telosName</code> paremeter.
   **/
  public Individual individual(String telosName);  

  /** Returns the unique Java instance of the omegaclass
   * <code>INDIVIDUAL_CLASS</code> for this KB. This corresponds to
   * <code>IndividualClass</code> in the Telos language.
   **/
  public Omegaclass INDIVIDUAL_CLASS();  

  /**
   * The individuals contained in this KB.
   **/
  public Individual[] individuals();  

  /** The builtin simple class primitive type for Telos
   * Integers. Proper Telos instances of this individual can be
   * tokens, or more commonly "pseudo-instances" take the form of
   * integer literals. These are represented by Java instances of the
   * concrete Java class <code>TelosInteger</code>.
   *
   * @see TelosInteger
   **/
  public Individual INTEGER_TYPE();  

  /** During the initialization of the KB, there may be points where
   * the builtins have not been populated yet. This method returns
   * true when this is the case.
   **/
  public boolean isEmpty();  

  /** Loads a telos file (in text format, not s-expression format)
   * into the KB. Another parser should be written than
   * <code>jtelos.apps.Parser</code> which can parse s-expressions.
   **/
  public void load(String fileName);  

  /**
   * The builtin M3class (metametametaclass) of which all M2classes
   * are Telos instances and which is the default parent of
   * M3classes. Returns the unique Java instance for this KB.
   **/
  public Individual M2CLASS();  

  /**
   * The builtin M4class (metametametametaclass) of which all
   * M3classes are Telos instances. It is not the default parent of
   * M4classes since these cannot be declared by users
   * currently. Returns the unique Java instance for this KB.
   **/
  public Individual M3CLASS();  

  /**
   * The builtin M2class (metametaclass) of which all metaclasses are
   * Telos instances and which is the default parent of
   * M2classes. Returns the unique Java instance for this KB.
   **/
  public Individual METACLASS();  

  public int mode();  

  //==========================================================================
  // PUBLIC ASK METHODS
  //==========================================================================

  /** The name of the KB. **/
  public String name();  

  /** This is the main constructor for non-builtin attributes in a
   * KB. It funcitons similarly to
   * <code>newIndividual(String,int)</code> in that it performs a
   * lookup on the attribute's name. If it finds a match (ie. the
   * attribute is already constructed) it returns the oid for that
   * attribute. Otherwise it calls the real attribute constructor for
   * this implementation (which is usually only package-visible). (The
   * name of the attribute is constructed out of the arguments passed
   * to this method according to the attribute naming convention
   * outlined in <code>NamedObject</code>'s documentation.)
   * 
   * <p>As a side effect, this method sets the "declarer" value for
   * this attribute and adds the attribute to the "direct attributes"
   * list of that individual (the attributes directly declared by that
   * individual). Similarly it sets the "target" value of the
   * attribute and adds this attribute to the "referenced by" list of
   * that target (if it is an individual and not a literal).
   *
   * <p>The attribute will appear in the attribute array returned by
   * the <code>directAttrs()</code> method of its declarer and will
   * appear in the attribute array returned by the
   * <code>referencedBy()</code> method of its target (if it is an
   * individual and not a literal).
   *
   * @see jtelos.Individual#directAttrs()
   * @see jtelos.Individual#referencedBy()
   **/
  public Attribute newAttribute(Individual declarer,
				String[] catLabels,
				String label,
				IndividualOrLiteral target);

  //==========================================================================
  // PUBLIC TELL METHODS
  //==========================================================================

  /** This is the main constructor for non-builtin individuals in a
   * KB. It funcitons similarly to
   * <code>newAttribute(Individual,String[],String,IndividualOrLiteral)</code>
   * in that it performs a lookup on the individual's name. If it
   * finds a match (ie. an individual with that name is already
   * constructed) it returns the oid for that individual. Otherwise it
   * calls the real "individual constructor" for this implementation
   * (which is usually only package-visible).
   **/
  public Individual newIndividual(String telosName, int level);  

  /** Returns the unique Java instance of the omegaclass
   * <code>OMEGACLASS</code> for this KB. This corresponds to
   * <code>OmegaClass</code> in the Telos language -- not to be
   * confused with the Java interface <code>Omegaclass</code> in this
   * API which has several instances per KB (delineated here).
   **/
  public Omegaclass OMEGACLASS();  

  /**
   * This method is used as a <em>partial constructor</em> for an
   * individual. Normally the level of instantiation and the model of
   * an individual are known at construction time. But sometimes this
   * is not the case. When parsing a Telos file, individuals can be
   * referenced by attributes before they are declared (in the order
   * of declarations in the file). To implement a single-pass parser,
   * one needs to partially construct the object and complete its
   * "construction" when its declaration is reached. This method and
   * three related methods in <code>Individual</code> (mentioned
   * below) needn't be defined in all implementations of this API.
   *
   * <p>When creating such an object, a lookup table for the KB
   * implemenentation should be consulted to see if the object
   * matching that name already exists in the KB. If if does, the old
   * object must be returned. If it isn't, a new object should be
   * (partially) created and an internal flag should be set in the
   * partially created individual stating that it is (so far)
   * undeclared. The <code>setDeclared(boolean)</code> method in
   * <code>Individual</code> is used for setting this flag. Then
   * at some point the list of newly created individuals can be
   * checked to see if a declaration has occurred for all of them. The
   * <code>isDeclared()</code> method in <code>Individual</code>
   * checks the flag. This way, a single-pass parser can be
   * implemented.
   *
   * <p>After the declaration is found, the <code>setLevel(int)</code> method in
   * <code>Individual</code> can be used to set the missing data
   * values. The <code>setDeclared(boolean)</code> method can then be
   * passed <code>true</code> to complete the "construction".
   *
   * @see Individual#setDeclared(boolean)
   * @see Individual#isDeclared()
   * @see Individual#setLevel(int)
   **/
  public Individual possiblyUndeclaredNew(String telosName);  

  /** Returns the unique Java instance of the omegaclass
   * <code>PROPOSITION</code> for this KB. This corresponds to
   * <code>Proposition</code> in the Telos language.
   **/
  public Omegaclass PROPOSITION();  

  /** The builtin simple class primitive type for Reals. Proper Telos
   * instances of this individual can be tokens, or more commonly
   * "pseudo-instances" take the form of real literals. These are
   * represented by Java instances of the concrete Java class
   * <code>Real</code>.
   *
   * @see Real
   **/
  public Individual REAL_TYPE();  

  public void removeIndividual(Individual indiv);  

  public Repository repository();  

  public void RETELL(String untellInput, String tellInput);  

  /**
   * Saves the KB to disk.
   **/
  public void save();  

  /**
   * The builtin metaclass of which all simple classes are Telos
   * instances and which is the default parent of metaclasses. Returns
   * the unique Java instance for this KB.
   **/
  public Individual SIMPLE_CLASS();  

  /** Returns the unique Java instance of the attribute class
   * <code>SINGLE</code> for this KB. This corresponds to the
   * attribute class
   * <code>Individual.attributeclass.single:Proposition</code> in
   * Telos (according to the naming convention for attributes used in
   * this API). It is declared by the omegaclass
   * <code>Individual</code> and takes the omegaclass
   * <code>Proposition</code> as its target. Its category is the
   * attribute class returned by <code>ATTRIBUTE_CLASS()</code>.
   *
   * @see #INDIVIDUAL()
   * @see #PROPOSITION()
   * @see #ATTRIBUTE_CLASS()
   **/
  public AttributeClass SINGLE();  

  /**
   * Returns the number of individuals in the KB (including builtins).
   **/
  public int size();  

  /** The builtin simple class primitive type for Telos
   * Strings. Proper Telos instances of this individual can be tokens,
   * or more commonly "pseudo-instances" take the form of string
   * literals. These are represented by Java instances of the concrete
   * Java class <code>TelosString</code>.
   *
   * @see TelosString
   **/
  public Individual STRING_TYPE();  

  public boolean supportsExtendedAttributes();  

  public boolean supportsExtendedIndividuals();  

  public void TELL(String tellInput);  

  /**
   * The builtin simple class of which all tokens are Telos instances
   * and which is the default parent of simple classes. Returns the
   * unique Java instance for this KB.
   **/
  public Individual TOKEN();  

  public void UNTELL(String untellInput);  

  /**
   * Note that this does not remove the persistent image.
   **/
  public void wipe();  

}