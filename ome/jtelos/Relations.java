
package jtelos;


/**
 * This interface describes the Telos data model as a set of typed
 * binary relations. It is not part of the jtelos API proper, in that
 * it does not constrain the implementation of the API in any
 * way. Nothing in the API refers (syntactically) to the global
 * constants below. Nor should it. Instead they can be used to
 * implement the API over a relational persistence mechanism
 * (e.g. JDBC-compliant DBMS's or OODBMS's).
 *
 * <p>These relations represent classification (<code>IN</code>),
 * generalization (<code>ISA</code>) and aggregation
 * (<code>ATTR</code>, <code>FROM</code>, and <code>TO</code>). 
 * 
 * <p>Ideally, in a relational persistence implemenation, all of these
 * relations should also have searchable inverse relations available.
 * But this may not be the case. For instance given a token, we may
 * not be able to query the implementation about what attributes take
 * this token as a target (this would invert the <code>TO</code>
 * relation in Telos).
 *
 * <p>This class is used as an inherited interface so that the
 * relation id's are available statically in implemenations.
 **/
public interface Relations {

  /**
   * The sources of this relation are <em>descendents</em> and the
   * targets are <em>ancestors</em>. e.g. tokens and simple classes,
   * metaclasses, etc. The targets are their corresponding
   * <em>ancestors</em>: metaclasses of simple classes, and simple
   * classes of tokens, metametaclasses for metaclasses, etc.
   *
   * <p>Also the sources can be attributes. So attributes are
   * <code>IN</code> other attributes which are their categories.
   *
   * <p>The <code>ancestors()</code> method in the interface
   * <code>Individual</code> and the <code>categories()</code> method
   * in the <code>Attribute</code> interface correspond to this
   * relation.
   *
   * @see Individual#directAncestors()
   * @see Attribute#categories()
   **/
  public static final int IN = 0;


  /**
   * This is the inverse of <code>IN</code>, so the sources of this
   * relation are <em>ancestors</em> and the targets are
   * <em>descendents</em>. e.g. Simple classes are <code>IN</code>
   * metaclasses, and tokens are <code>IN</code> simple
   * classes. Metaclasses are descendents of metametaclasses. Also
   * Attributes are <em>descendents</em> of other attributes.
   *
   * <p>The <code>instances()</code> method in the interfaces
   * <code>Individual</code> and <code>Attribute</code> correspond to
   * this relation. This method is not a required part of this API for
   * <code>Attribute</code> but may be present in some
   * implementations.
   *
   * @see Individual#instances()
   * @see Attribute
   **/
  public static final int IN_INV = 1;

  /**
   * The sources of this relation are parents (for instance
   * superclasses of simpleclasses) and the targets are children: (for
   * instance subclasses of simpleclasses). This relation also
   * includes attributes as sources and targets. Here the targets
   * would be <em>narrowed</em> attributes. Do not use this relation
   * at the token level. <b>Neither tokens nor attributes targetting
   * tokens can inherit from or narrow each other.</b>
   *
   * <p>The <code>directParents()</code> method in the interface
   * <code>Individual</code> and the <code>directlyNarrows()</code>
   * method in the <code>Attribute</code> interface correspond to this
   * relation.
   *
   * @see Individual#directParents()
   * @see Attribute#directlyNarrows()
   **/
  public static final int ISA = 2;

  /**
   * This is the inverse of <code>ISA</code>so the sources of this
   * relation are children (for instance superclasses of simple
   * classes) and the targets are parents: (for instance subclasses of
   * simple classes). This relation <i>also</i> includes attributes as
   * sources and tagets. The targets are the <em>widened</em>
   * attributes. Do not use this relation at the
   * token-level. <b>Neither tokens nor attributes taking tokens as
   * their target can inherit from each other.</b>
   *
   * <p>The <code>directChildren()</code> method in the interface
   * <code>Individual</code> and the <code>directlyNarrowedBy()</code>
   * method in the <code>Attribute</code> interface correspond to this
   * relation.
   *
   * @see Individual#directChildren()
   * @see Attribute#directlyNarrowedBy()
   **/
  public static final int ISA_INV = 3;

  /**
   * This is the inverse of <code>FROM</code> so the sources are
   * Individuals and the targets are attributes. It's inverse is
   * <code>From</code>.
   *
   * <p>The <code>directAttrs()</code> method in the
   * <code>Individual</code> interface corresponds to this relation.
   *
   * @see Levels
   * @see Individual#directAttrs()
   **/
  public static final int ATTR = 4;

  /**
   *  This is the inverse of <code>ATTR</code>, so the sources are
   * attributes and the targets are individuals.
   *
   * <p>The <code>declarer()</code> method in the
   * <code>Attribute</code> interface corresponds to this relation.
   *
   * @see Levels
   * @see Attribute#declarer()
   **/
  public static final int FROM = 5;

  /** 
   * The sources of this relation are attributes and the targets are
   * individuals or primitive literals.
   * 
   * <p>The <code>target()</code> method in the <code>Attribute</code>
   * interface corresponds to this relation.
   * 
   * @see Attribute#target()
   **/
  public static final int TO = 6;

  /** 
   * This is the inverse of <code>TO</code>. The sources of this
   * inverse relation are: the targets (destinations) of attributes
   * and the targets of the <code>TO</code> relation are the
   * attributes declaring these destinations.
   *
   * <p>The <code>referencedBy()</code> method in the
   * <code>Individual</code> interface corresponds to this relation.
   *
   * @see #TO
   * @see Individual#referencedBy()
   **/
  public static final int TO_INV = 7;

}