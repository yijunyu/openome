/* TelosElement
 * 
 * Created October 1998 by Joseph Makuch.
 *
 * copyright.
 */
package edu.toronto.cs.ome.model;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import jtelos.Attribute;
import jtelos.Individual;
import jtelos.KB;
import jtelos.Levels;
import jtelos.Proposition;
import jtelos.PropositionOrPrimitive;
import jtelos.TelosException;
import util.D;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.telos.TelosParserKB;
import edu.toronto.cs.telos.TelosReal;
import edu.toronto.cs.telos.TelosString;
/** Contains the information neccessary to construct and maintain a Telos Element. 
 *  Each element in a model needs to be represented as a <code> Telos
 *  element</code>, in order to be stored in the Knowledge Base and this class 
 *  defines the structure and methods needed to maintain such a Telos element.
 */
public class TelosElement extends TelosObject implements ModelElement {

    private Collection children;

/**
 * Contains the information neccessary to maintains the "children" of an *  expandeable Telos Element.
 */

    public class TelosElementChildCollection extends PessimisticCollection {

	/**
	 * 
	 * @uml.property name="te"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	TelosElement te;

	
      /** Creates a new TelosElementChildCollection.
       *
       * @param te The Telos element which the child collection will belong to
       */	
	public TelosElementChildCollection(TelosElement te) {
	    this.te=te;
	}


      /** Adds a child to the child collection.
       *
       * @param o the child to be added
       *
       * @return <code>true</code> iff the link was successfully added
       *
       * @see TelosElement#remove
       */	
	public boolean add(Object o) {
	    TelosElement nte = (TelosElement)o;
	    try {
	    	te.kb.newAttribute(te.getIndividual(), CHILDREN,
		        NOLABEL, nte.getIndividual());
	    } catch (TelosException e){
		D.o("Add children exception!!");
		return false;
	    }
	    return true;
	}

      /** Returns an <code>Iterator</code> of the children. */ 	
	public Iterator iterator() {
	    try {
		Attribute children[] =
			te.getIndividual().directAttributes(CHILDREN,NOLABEL);
		Vector ll=new Vector(10,10);
		for (int c=0; c<children.length; c++) {
			if (children[c]==null || children[c].to()==null)
				;
			else
				ll.add(model.getElement((TelosParserIndividual)(children[c].to())));
		}
		return ll.iterator();
	    } catch (TelosException te) {
		return null;
	    }
	}


      /** Removes a child from the child collection. Returns true if we succeed
       * and false if we fail.
       */	
	public boolean remove(Object o) {
	    TelosElement ote = (TelosElement)o;
	    // we assume that there is only one attribute to remove.
	    Attribute children[] = 
		    te.getIndividual().directAttributes(CHILDREN,NOLABEL);
	    Attribute att = null;
	    for(int c=0; c<children.length; c++) {
		if (children[c].to() == ote.getIndividual()) {
		    att = children[c];
		}
	    }
	    if(att != null) {
		te.getIndividual().removeDirectAttr(att);
		return true;
	    } else {
		return false;
	    }
	}

	/** Returns whether this object is contained in the child collection.
	 *  Currently we are doing a lazy-fix by obtaining an iterator and
	 *  checking if the object is in the iterator. The correct way would
	 *  be to check the KB directly. Hopefully the correct way would be
	 *  implemented soon.
	 */
	public boolean contains(Object o) {
	    Iterator i = iterator();
	    while (i.hasNext()) {
		if (i.next() == o) {
		    return true;
		}	    
	    }
	    return false;
	}
    }


    /** Sets the name of this Telos element. 
     *
     *  @param newname the new name to be assigned to this Telos element 
     */
    /*
    public void setName(String newname) throws Exception {
	// remove the current name
	Attribute name[] = individual.directAttributes(NAMECAT,NOLABEL);
	if(name.length!=0)
	    individual.removeDirectAttr(name[FIRST]);
	// set the new name.
	// if this were to fail, then what makes us think that we'll be able
	// to replace the original attribute. We hope it never happens.

	// Because jtelos is daft.
	String safenewname = newname.replace('\"','\'');
	
	kb.newAttribute(individual,NAMECAT,NOLABEL,new TelosString(safenewname));
    } die die die die die */
    

    /** Returns the model which this Telos element is in.*/
    public OMEModel getModel() {
	return model;
    }
    

    /** Returns this Telos element's type. The type can be used to find additional
     * properties about the element within various contexts, eg, it's graphic,
     */
    public Object getType() {
	return type;
    }
    

    /** Set this Telos element's type. The Object that is passed to setType for
     *  TelosElement should be an Individual.
     *
     *  @param newtype the new type to be assigned to this Telos element
     */
    public void setType(Object newtype) throws Exception {
	Proposition newtypes[] = {(Proposition)newtype};
	Proposition oldtype[] = {type};
	
	if (newtype != type) {
	    // we set our ancestor:
	    //D.o("Changing type from "+framework.getName(type)+" to "		    + framework.getName(newtype));

	    // we must save the attributes in order to remove the current
	    // type. We cannot add the new type then remove the old, because
	    // addDirectAncestors() cannot add ancestors unless there are
	    // currently none. We consider this a misfeature of JTelos.
	    Attribute[] oldatts = individual.directAttributes();
	    int attr_count= oldatts.length;
	    int count;
	    String categories[][] = new String[attr_count][];
	    String labels[] = new String[attr_count];
	    PropositionOrPrimitive targets[] = new PropositionOrPrimitive[attr_count];
	    for (count=0;count<attr_count;count++) {
		// we don't deal with failures here. they imply previously
		// extant corruption.
		// save the relervant info
		categories[count]=oldatts[count].categories();
		labels[count]=oldatts[count].label();
		targets[count]=oldatts[count].to();		
		// get rid of the attribute. 
		individual.removeDirectAttr(oldatts[count]);
	    }	    	    
	    
	    // change the type.
	    individual.removeDirectAncestor(type);
	    
	    try {
		// user can make this fail more easily, so we should try to
		// handle it more gracefully.
		individual.addDirectAncestors(newtypes);
	    } catch (Exception e) {
		individual.addDirectAncestors(oldtype);
		newtype=type;
		throw e;
	    } finally {
		// replace the attributes |(
		for(count=0;count<attr_count;count++) {
		    try {
			kb.newAttribute(individual, categories[count],
				labels[count], targets[count]);
		    } catch (Exception e) { 
			// print out the incompatibilities but otherwise ignore
			// them. Off to the floor with you all...
			D.o(e.toString()); 
		    }
		}
	    
		// we remove our previous instantiation. We *must* have one.
		this.type=(Proposition)newtype;
	    }
	}
    }
    
    
    /** Returns the unique (within the context) integer id of this Telos element.
     * Since the name of an element is not guaranteed to be unique, we use 
     * this for serialization. 
     */
    public int getID() {
	return id; 
    }
    

    /** Sets this Telos Element's integer ID. This is currently not in use. 
     *
     *  @param id the id to be assigned to this Telos element
     */
    public void setID(int id) {
	// our id is mangled into our telosname, so cannot be changed.
	//this.id=id;
    }
    

    /** Returns parent of this Telos element if parent exists, and null
     *  otherwise  
     */
    public OMEElement getParent() {  
	// directAttributes only throws *real* runtime exceptions.
	Attribute att[] = individual.directAttributes(PARENTCAT, NOLABEL);
	Proposition p;
	if (att.length != 0) {
	    p = (Proposition)att[FIRST].to();
	    return model.getElement(p);
	}

	return null;
    }
    

    /** Changes or sets the parent of this Telos element. If this is attempted on an
     *  expandable element an error will be thrown. Both this method, and the
     *  parent's addchild must be called to add a child to a parent. 
     *
     *  @param ve the OME elment which will be assigned to be the
     *  parent of this Telos element
     */
    public void setParent(OMEElement oe) throws Exception {
	// remove current parent if extant: we are assuming, but not enforcing
	// that there is only one parent.
	Attribute parents[] = individual.directAttributes(PARENTCAT, NOLABEL);
	Individual target=null;
	
	if(parents.length != 0) {
	    // backup target in case of exception.
	    target = (Individual)parents[FIRST].to(); 
	    
	    individual.removeDirectAttr(parents[FIRST]);
	}

	if(oe==null) {
	    // the intention is to have no parent.  i.e. do nothing.
	    D.o("Removed parent of "+getName());
//	    kb.newAttribute(individual, PARENTCAT, NOLABEL, target);
	} else {
	    try {
		// set the parent. we could have been asked to add a totally bogus
		// parent, and thus we should replace our old one.
		 kb.newAttribute(individual, PARENTCAT, NOLABEL,
			((TelosElement)oe).getIndividual());
	    } catch (Exception e) {
		if (parents.length != 0) { // possibly restore old parent.
		    kb.newAttribute(individual, PARENTCAT, NOLABEL, target);
		}
		throw e;
	    }
	    D.o("Set parent of element " + id + " to element " + oe.getID() );
	}
    }
    

    /** Adds a child to an expandable element. If attempted on a
     *  non-expandable element, an error will be thrown. Both this method and
     *  the child's setparent method must be called to add a child to a parent. 
     *
     *  @param ve the OME element which will be assigned to be a child
     *  of this Telos element
     */
    public void addChild(OMEElement ve) throws Exception {
    	boolean s = children.add(ve); 
    	if (!s) {
		    throw new Exception("addChild failed to add element "+ve.getID()+
		    " "+ ve.getName());
		}
    }
    
    
    /** Removes a child from this (expandable) element.  If attempted on a
     * non-expandable element, or if the child is not in fact a child of the
     * parent, and exception is thrown.  A call must also be made to
     * child.setParent(null) to remove the child from its parent.
     */
    public void removeChild(OMEElement child) throws Exception {
	if (!children.remove(child)) {
	    throw new Exception("Failed to remove child from element "
		+getName());
  	}
    }
    

    /** Returns whether this Telos element is expandable or not. */
    public boolean isExpandable() { // only throws real runtime exceptions.
	return type.isChildOf(kb.individual(OME_GROWABLE_ELEMENT));
    }


    /** Changes whether this Telos element is expandable. If this is attempted on an
     *  element with children, or a parent, then an error will be thrown if the
     *  new state does not allow children or a parent respectively. 
     *
     *  @param e the boolean value to be assigned as expanadable-status of
     *  this Telos element
     */
    public void setExpandable(boolean e) throws Exception {
	throw new Exception("Onlie the framework can define something as" +
		"expandeable");
    }
    

    /** Returns a collection of OMELinks. Any and all of the elements links
     * are returned. 
     */
    public Collection getLinks() {
	return links;
    }

    /** Adds an OMELink to our collection of links.
     */
    public void addLink(OMELink l) {
    	links.add(l);
    }

	/**
	 * Returns a collection of OMEElements which correspond to children of
	 *  this Telos element. Any and all of the elements children are returned. 
	 *  This collection is writable.
	 * 
	 * @uml.property name="children"
	 */
	public Collection getChildren() {
		return children;
	}

    

    /* TelosElement specific stuff. */
    
    /** Create a new TelosElement. For example, when a user asks to make one. 
     *
     *  @param kb the Knowledge Base where this Telos element will be stored
     *  @param framework the framework on which the model is based on
     *  @param model the model in which this model element correpsonding to
     *  this Telos element is in
     *  @param id the unique (within context) id of this Telos element
     */
    public TelosElement(KB kb, TelosFramework framework, 
		    TelosModel model, int id, Object type) throws Exception {

	super();
	
	this.kb=kb;
	this.model=model;
	this.framework=framework;
	this.type = (Proposition)type;

	D.o("creating telos element:"+id);
	try {
	    // fill in javaside fields:
	    //type = (Proposition)framework.getDefaultType();
	    individual = kb.newIndividual("Element_"+id,Levels.TOKEN_LEVEL);
	    this.id=id;
	    //links = new TelosElementLinkCollection(this);
	    children = new TelosElementChildCollection(this);
	    // telos-side fields:
	    Proposition ancestors[] = {(Proposition)type};
	    individual.addDirectAncestors(ancestors);
	   
	    // sets the name for new element:	    
	    TelosString n = null;
	    Attribute defaultname [] = 
		    this.type.attributes(DEFAULT_NAME,NOLABEL);
	    if (defaultname.length > 0) {
		n = (TelosString)defaultname[FIRST].to();	
	    } else {
		n = new TelosString(model.getFramework().getName(type)+" "+id);	
	    }
	   kb.newAttribute(individual, NAMECAT, NOLABEL, n);
	   // no links to begin with.
	    // there will be more...	    	
	} catch (Exception e) {
	    //reverse our evil:
	    if (individual!=null) kb.removeAndDeleteProposition(individual);
	    throw e;
	}
//	D.o("Created TelosElement: "+id);
    }


    /** Create a TelosElement from an existing proposition which already
     *  represents the element. This is useful when restoring from a kb.
     *
     *  @param kb the Knowledge Base where this Telos element will be stored
     *  @param framework the framework on which the model is based on
     *  @param model the model in which this model element correpsonding to
     *  this Telos element is in
     *  @param id the unique (within context) id of this Telos element
     *  @param p the proposition which represents this element
     */     
    public TelosElement(KB kb, TelosFramework framework, 
		TelosModel model, int id, Proposition p) throws Exception {
	super((TelosParserIndividual)p);
	
	//D.o("Creating teloselement from kb");
	this.kb = kb;
	this.model = model;
	this.framework = framework;
	this.individual=(Individual)p;
	this.id=id;
	//links = new TelosElementLinkCollection(this);
	children = new TelosElementChildCollection(this);
	
	// we must find our type.
	type=null;
	((TelosParserIndividual)p).telosKB=(TelosParserKB) kb;
	Proposition[] ancestors = p.directAncestors();
	for (int i=0; i<ancestors.length;i++) {
	    if(!ancestors[i].isBuiltin()) {
		type=ancestors[i];
	    }
	}
	if (type==null) {
	    throw new Exception("TelosElement creation failed during load: no"
		    + " type");
	}
	
	// we leave the rest alone.
	
	//D.o("Created teloselement from kb");
    }

    protected TelosParserIndividual label;
	float sat = 0;
	float den = 0;
	float perf = 0;
	public float getSat() {		
		Proposition s[] = getIndividual().attributes(SATCAT, NOLABEL);
		if (s.length != 0) {			
			sat = ((TelosReal) s[0].to()).floatValue();
		}
		return sat;
	}
	public float getDen() {
		Proposition d[] = getIndividual().attributes(DENCAT, NOLABEL);
		if (d.length != 0) {			
			den = ((TelosReal) d[0].to()).floatValue();
		}
		return den;
	}
	public void setSat(float s) {
		sat = s;
		Attribute sat[] = individual.directAttributes(SATCAT,NOLABEL);
		if(sat.length!=0)
		    individual.removeDirectAttr(sat[FIRST]);
		kb.newAttribute(individual,SATCAT,NOLABEL,new TelosReal(s));		
	}
	public void setDen(float d) {
		den = d;
		Attribute sat[] = individual.directAttributes(DENCAT,NOLABEL);
		if(sat.length!=0)
		    individual.removeDirectAttr(sat[FIRST]);
		kb.newAttribute(individual,DENCAT,NOLABEL,new TelosReal(d));		
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.model.ModelObject#getLabel()
	 */
	public TelosParserIndividual getLabel() {
		return label;
	}


	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.model.ModelObject#setLabel(java.lang.String)
	 */
	public void setLabel(TelosParserIndividual newname) {
		if (newname != label) {
			this.label = newname;
		}
	}

	public float getPerf() {
		Proposition d[] = getIndividual().attributes(PERFCAT, NOLABEL);
		if (d.length != 0) {			
			perf = ((TelosReal) d[0].to()).floatValue();
		}
		return perf;
	}
	public void setPerf(float p) {
		perf = p;
		Attribute perfs[] = individual.directAttributes(PERFCAT,NOLABEL);
		if(perfs.length!=0)
		    individual.removeDirectAttr(perfs[FIRST]);
		kb.newAttribute(individual,PERFCAT,NOLABEL,new TelosReal(p));		
	}
}



