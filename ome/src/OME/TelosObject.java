

/* TelosObject 
 * Created Feb. 1999 by Joseph Makuch.
 *
 * copyright.
 */

package OME;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import jtelos.Attribute;
import jtelos.Individual;
import jtelos.KB;
import jtelos.Proposition;
import jtelos.PropositionOrPrimitive;
import jtelos.TelosException;
import jtelos.TelosString;


/** Parent class of Telos Links and Elements. So we can refer to a TelosObject
 *  without distinguishing between links and elements. We are now sharing a
 *  certain amount of implementation.
 *
 * Package visible.
 */
abstract class TelosObject implements ModelObject, TelosFunctionality {
    protected ModelAttribute modelattributes[];
    protected ModelValueAttribute modelvalueattributes[];
    protected KB kb;
    protected TelosModel model;
    protected TelosFramework framework;
    protected Proposition type;
    protected Individual individual;
    /*packg*/ Collection links;
    protected int id;
    
    static final int MAXATTNUM = 10;

    /** Contains the information neccessary to maintains the "links" of this 
     *  Telos Link. 
     */  
    public class TelosObjectLinkCollection extends PessimisticCollection {
	
	//TelosObject to;
	
      /** Creates a new TelosObjectLinkCollection.
       *  @param to The Telos object which the link collection will belong to
       */	
	public TelosObjectLinkCollection() {
	    //this.to=to;	    
	}
	

      /** Adds a Telos link to the link collection.
       *  @param o the telos link to be added
       *  @return <code>true</code> if the link was successfully added
       *  @see TelosLink#remove
       */	
	public boolean add(Object o) {
	    TelosLink tl = (TelosLink)o;
	    try {
		//this.tl.
		kb.newAttribute(/*this.tl.*/getIndividual(), LINKS, 
			    NOLABEL, tl.getIndividual());
	    } catch (TelosException e) {
		return false;
	    }
	    return true;
	}


      /** Returns an Iterator for this Collection. 
       */ 	
	public Iterator iterator() {
	    Attribute links[] = 
		    /*this.tl.*/getIndividual().directAttributes(LINKS,NOLABEL);	    
	    LinkedList ll = new LinkedList();
	    for (int c=0;c<links.length; c++) {
		ll.add(model.getLink((Proposition)links[c].to()));		
	    }
	    return ll.iterator();
	}
	

      /** Removes a link from the link collection. Note we currently do not delete 
       *  the link. It does not even tell the link that it no longer points to us.
       *  @param o The link to be removed
       *  @see TelosLink#add
       */	
	public boolean remove(Object o) {
	    TelosLink tl = (TelosLink)o;
	    Attribute links[] =
		    /*this.tl.*/getIndividual().directAttributes(LINKS,NOLABEL);
	    Attribute att = null;
	    for(int count=0; count< links.length; count++) {
		if (links[count].to() == tl.getIndividual()) {
		    att = links[count];
		}
	    }
	    if (att != null) {
		/*this.tl.*/getIndividual().removeDirectAttr(att);	    
		return true;
	    } else {
		return false;
	    }
	}	
    }

    // Experimenting with arbitrary value attribute support.
    class TelosValueAttribute implements ModelValueAttribute {
	private Attribute attribute;
	String name;
	String [] cats;
	String label;
	String value;
	
	/** Sets up an attribute, which might not exist yet. */
	TelosValueAttribute(String name, String label) {
	    D.o("Setting label " + label);
	    this.name = name;
	    String [] cats = { name };
	    this.cats = cats;
	    this.label = label;
	    
	    // set attribute if we already exist.
	    this.attribute = null;
	    
	    Proposition atts[] =
		individual.directAttributes(cats, label);
	    if (atts.length != 0) {
		// There can be only one! (Highlander) :) (might not be true
		// forever...)
		this.attribute = (Attribute)atts[0];		
	    }
	    
	}

	/** The Telos Category of the attribute. */
	public String getName() {
	    return name;
	}
	
	public String getLabel() {
	    return label;
	}
	
	/** Changes the target of our telos attribute to the passed target. Our
	 * targets will be telos Individuals. */
	public void setValue(String value) {
	    // we should do error checking on this, and restore if it fails.
	    D.o("Setting value " + value);
	    if(attribute != null) {
		individual.removeDirectAttr(attribute);
	    }
//	    attribute = kb.newAttribute(getIndividual(), cats, NOLABEL,
//		    new TelosString(value));
	    try {attribute = kb.newAttribute(getIndividual(), cats, label, 
		    new TelosString(value));
	    } catch (Exception e) {
		D.o(e);
	    }
	    
	    D.a(attribute);
	    this.value = value;
	}
	
	/** Returns our target. May be null if attribute is not set. */
	public String getValue() {
	    D.o("Getting value "+value);
	    if (value != null) {
		return value;
//		return ((attribute.label()));
	    } else {
		return null;
	    }
	}
	
	
	/** Removes the target from the attribute. */
	public void clearValue() {
	    if (attribute != null) {
		individual.removeDirectAttr(attribute);
		attribute = null;
	    }
	}
    }
    

    /** We represent ModelAttributes as Telos Categories in the type of the
     * individual. Thus we can have null attributes. We cannot add arbitrary
     * attributes, however. */
    class TelosAttribute implements ModelAttribute {
	private Attribute attribute;
	String name;
	String [] cats;

	/** Creates a TelosAttribute from an existing Telos Attribute. */
	TelosAttribute(Attribute attribute) {
	    D.a(attribute);
	    this.attribute = attribute;	    
	    // bloody doubled 'attributes screws this up...
	    this.cats = attribute.categories();
	    this.name = attribute.label();
	} 

	/** Sets up an attribute, which might not exist yet. */
	TelosAttribute(String name) {
	    this.name = name;
	    String [] cats = { name };
	    this.cats = cats;
	    
	    // set attribute if we already exist.
	    this.attribute = null;
	    Proposition atts[] =
		individual.directAttributes(cats, NOLABEL);
	    if (atts.length != 0) {
		// There can be only one! (Highlander) :) (might not be true
		// forever...)
		this.attribute = (Attribute)atts[0];	
	    }
	}
	
	public Attribute getAttribute() {
	    return attribute;
        }
	/** The Telos Category of the attribute. */
	public String getName() {
	    return name;
	}
	
	/** Changes the target of our telos attribute to the passed target. Our
	 * targets will be telos Individuals. */
	public void setTarget(Object target) {
	    // we should do error checking on this, and restore if it fails.
	    
	    if(attribute != null) {
		individual.removeDirectAttr(attribute);
	    }
	    attribute = kb.newAttribute(getIndividual(), cats, NOLABEL,
		    (PropositionOrPrimitive)target);
	    D.a(attribute);
	    
	}
	
	/** Returns our target. May be null if attribute is not set. */
	public Object getTarget() {
	    if (attribute != null) {
		return attribute.to();
	    } else {
		return null;
	    }
	}
	
	
	/** Removes the target from the attribute. */
	public void clearTarget() {
	    if (attribute != null) {
		individual.removeDirectAttr(attribute);
		attribute = null;
	    }
	}
	
	
	/** Attempts to construct a list of possible targets.  */
	public Iterator getPossibleTargets() {
	    Proposition parentatt[] =
		type.attributes(OME_ATTSCAT, name);
	    if (parentatt.length != 0) {
		Proposition targets[] =
		    ((Proposition)parentatt[0].to()).allInstances();
		return Arrays.asList(targets).iterator();
	    }
		
	    List list = new LinkedList();
	    return list.iterator();
	}
    }
    
    /** Returns the value attribute with the given name.
     */
    public ModelValueAttribute getValueAttribute(String name) {	
	if (!name.equals(null)) {
	    D.o("name is " + name);
	    Iterator v = getValueAttributes();
	    while (v.hasNext()) {
		ModelValueAttribute oa = (ModelValueAttribute)v.next();
		if ((oa != null) && (oa.getLabel().equals(name))&&( 
			    !oa.getLabel().equals(null))) {
		    D.o("Attribute name is " + oa.getName());
		    return oa;
		}
	    }

	    Proposition parentatt[] =
		type.attributes(OME_VALUE_ATTSCAT, MATCH_ALL);

	    ModelValueAttribute oa =
		new TelosValueAttribute(parentatt[0].label(), name);
	
	    return oa;
	    
	} else {
	    
	    return null;
	}
	    
    }

    public ModelValueAttribute updateValueAttribute(String name, String
	    newname) {	
	if (name.equals(newname)) return null;
	D.o("updating " + name +" to " + newname);
	try {
	    Iterator v = getValueAttributes();
	    while (v.hasNext()) {
		ModelValueAttribute oa = (ModelValueAttribute)v.next();
		if (oa!=null) {
		    D.o("Attribute name is " + oa.getLabel());
		    if(oa.getLabel().equals(name)) {
			D.o("Attribute " + name +" is cleared.");
			oa.clearValue();
		    }
		}
	    }
	} catch (Exception e) {
	    D.o(e);
	}
	
	try {
	    Iterator v = getValueAttributes();
	    while (v.hasNext()) {
		ModelValueAttribute oa = (ModelValueAttribute)v.next();
		if ((oa!=null)&&(oa.getLabel().equals(newname))) {
		    return oa;
		} 
	    }
	} catch (Exception e) {
	    D.o(e);
	}

	Proposition parentatt[] =
	    type.attributes(OME_VALUE_ATTSCAT, MATCH_ALL);

	ModelValueAttribute oa =
	    new TelosValueAttribute(parentatt[0].label(), newname);
	
	return oa;
    }

    /** Returns an iterator over the objects value attributes.
     */
    public Iterator getValueAttributes() {	 

	modelvalueattributes = null;
	if (modelvalueattributes == null) {
	    Attribute objectatt[] =
		getIndividual().directAttributes(OME_VALUE_ATTSCAT,MATCH_ALL);
	    modelvalueattributes = new ModelValueAttribute[objectatt.length];	
	    if (objectatt.length != 0) {
		for (int i=0;i<objectatt.length;i++) {
		    String [] cats = objectatt[i].categories();
		    String  telosName = objectatt[i].telosName();
		    String  realLabel =
			telosName.substring(telosName.lastIndexOf(".")+1,
					    telosName.indexOf(":"));
		    String  value =
			telosName.substring(telosName.indexOf("\"")+1,
					    telosName.lastIndexOf("\""));

		    if(!realLabel.equals("")) {
			modelvalueattributes[i] = 
			    new TelosValueAttribute(cats[cats.length-1],realLabel);
			D.o("Loaded value is " + value);
			modelvalueattributes[i].setValue(value);
			D.o("Cat is "
				+modelvalueattributes[i].getName()
				+ " Label is " +
				modelvalueattributes[i].getLabel()
				+ " Value1 is "
				+modelvalueattributes[i].getValue());
		    }
		}
	    }

	    if (modelvalueattributes == null) {
		Proposition parentatt[] =
		    type.attributes(OME_VALUE_ATTSCAT, MATCH_ALL);
		modelvalueattributes = new ModelValueAttribute[parentatt.length];
		D.o("Length is " + parentatt.length );
		if (parentatt.length != 0) {
		    for (int i=0;i<parentatt.length;i++) {
			modelvalueattributes[i] = 
//			    new TelosValueAttribute(parentatt[i].label());
			    new TelosValueAttribute(parentatt[i].label(), NOLABEL);		
		    }
		}
	    }
	}
	return Arrays.asList(modelvalueattributes).iterator();
    }
    
    //Jun, 2003
    public void clearModelAttr() {
	modelattributes = null;
    }


    /** Returns the attribute with the given name. The attribute can then be
     * manipulated through the ModelAttribute interface. At the instance (Token)
     * level the attribute will be in the category 'name' and have no label.*/
    public ModelAttribute getAttribute(String name) {	
	Iterator i = getAttributes();
	while (i.hasNext()) {
	    ModelAttribute oa = (ModelAttribute)i.next();
	    if (oa.getName().equals(name)) {
		return oa;
	    }
	}
	return null;
    }

    /** Returns an iterator over the objects attributes.  we only return atts
     * in ModelAttributes */
    public Iterator getAttributes() {	 
	if (modelattributes == null) {
	    Proposition parentatt[] =
		type.attributes(OME_ATTSCAT, MATCH_ALL);
	    modelattributes = new ModelAttribute[parentatt.length];
	    if (parentatt.length != 0) {
		for (int i=0;i<parentatt.length;i++) {
		    D.o("adding att: "+parentatt[i].label()+ " and its target: " + parentatt[i].to());
		    modelattributes[i] = new TelosAttribute(parentatt[i].label());
                    
		}
	    }
	}
	return Arrays.asList(modelattributes).iterator();
    }
    
    public Individual getIndividual() {
	return individual;
    }

    
    /** do some preparations. we should move the initialization for the
     * objects that we own into this constructor rather than those of the
     * subclasses (link, element) and for those objects that we cannot fully
     * initialize we might want to move the objects back to the subclasses.
     */
    TelosObject() {
	// we have to get the individual initialized through us, first,
	// before we can populate the modelattributes, and delete them etc...
	// temporary solution: I'm going with a lazy initialization in
	// getAttributes().
	// modelattributes = new ModelAttribute [0];
	links = new TelosObjectLinkCollection();
    }

    TelosObject(Individual individual) {
	links = new TelosObjectLinkCollection();
    }
    
    // Abstractions:

    /** Returns the name or annotation of the Telos object, (which could be null 
     *  if the name had not been set yet). 
     * 
     *  @see TelosObject#setName
     */
    public String getName() {
	TelosString name =
		(TelosString)
		    individual.directAttributes(NAMECAT,NOLABEL)[FIRST].to();
	return name.stringValue();
    }

    
    /** Sets the name of this Telos object. 
     *
     *  @param newname the new name to be assigned to this Telos object
     */
    public void setName(String newname) throws Exception {
	// remove the current name
	Attribute name[] = individual.directAttributes(NAMECAT,NOLABEL);
	if(name.length!=0)
	    individual.removeDirectAttr(name[FIRST]);
	// set the new name.
	// if this were to fail, then what makes us think that we'll be able
	// to replace the original attribute. We hope it never happens.

	// Because telos doesn't like double-quotes.
	String safenewname = newname.replace('\"','\'');
	
	kb.newAttribute(individual,NAMECAT,NOLABEL,new TelosString(safenewname));
    }
    
    /** Returns the comment of the object. This may return null. */
    public String getComment() {
	try {
	    TelosString comment =
		    (TelosString)
		    individual.directAttributes(COMMENT,NOLABEL)[FIRST].to();
	    return comment.stringValue();
	} catch (Exception e) {
	    return null;
	}
    }

    /** Set the comment for the object.  This method will barf on models
     *  based on a OME framework  that doesn't support comments. */
    public void setComment(String newcomment) {
	// remove the current comment
	Attribute comment[] = individual.directAttributes(COMMENT,NOLABEL);
	if(comment.length!=0)
	    individual.removeDirectAttr(comment[FIRST]);
	// set the new comment.
	// if this were to fail, then what makes us think that we'll be able
	// to replace the original attribute. We hope it never happens.

	// Because telos doesn't like double-quotes.
	String safenewcomment= newcomment.replace('\"','\'');
	
	kb.newAttribute(individual,COMMENT,NOLABEL,
		new TelosString(safenewcomment));
    }

}

