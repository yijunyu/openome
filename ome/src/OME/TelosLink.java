/* TelosLink.
 *
 * Created October 1998 by Joseph Makuch
 *
 * copyright
 */

package OME;

import java.util.Collection;

import jtelos.Attribute;
import jtelos.Individual;
import jtelos.KB;
import jtelos.Levels;
import jtelos.Proposition;
import jtelos.PropositionOrPrimitive;
import jtelos.TelosException;
import jtelos.TelosString;


/** TelosLink is a Telos implementation of OMELink. It is an interface to
 * links within the Telos KB. Synchronization to the KB will ultimately be
 * handled through here, as well.
 */
class TelosLink extends TelosObject implements ModelLink {
    
    

    /** Returns the model in which this Telos link is in.*/
    public OMEModel getModel() {
	return model;
    }


    /** Returns this Telos link's type. We are currently forcing that our links and
     * elements be simpleclasses, and that they be singly instantiated. */
    public Object getType() {
	// we cache the type.
	return type;
    }
    

    /** Set this Telos link's type. The Object that is passed to setType for
     *  Teloslink should be an Individual.
     *
     *  @param newtype the new type that should be assigned to this Telos link
     */
    public void setType(Object newtype) throws Exception {
	Proposition newtypes[] = {(Proposition)newtype};
	Proposition oldtype[] = {type};
	
	if (newtype != type) {
	    // we set our ancestor:
	    D.o("Changing type");
	    D.o("from "+framework.getName(type)+" to "
			    + framework.getName(newtype));

	    // get all the attributes first...
	    // see TelosElement.setType for same complaint about JTelos.
	    // we must save the attributes in order to remove the current
	    // type. We cannot add the new type then remove the old, because
	    // addDirectAncestors() cannot add ancestors unless there are
	    // currently none. We consider this a misfeature of JTelos.
	    Attribute[] oldatts = individual.directAttributes();
	    int attr_count= oldatts.length;
	    int count;
	    String categories[][] = new String[attr_count][];
	    String labels[] = new String[attr_count];
	    PropositionOrPrimitive targets[] = 
				new PropositionOrPrimitive[attr_count];
	    for (count=0;count<attr_count;count++) {
		// save the relevant info
		categories[count]=oldatts[count].categories();
		labels[count]=oldatts[count].label();
		targets[count]=oldatts[count].to();		
		// get rid of the attribute.
		individual.removeDirectAttr(oldatts[count]);
	    }	    	    
	    
	    // change the type.
	    individual.removeDirectAncestor(type);
	    try {
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
	    }    
	    // we remove our previous instantiation. We *must* have one.
	    this.type=(Proposition)newtype;
	}
    }
 

    /** Returns a collection of OMELinks which correspond to the links of this
     *  Telos link. Any and all of the link's links are returned. */
    public Collection getLinks() {
	return links;
    }

    /** Adds the given OMELink to the collection of links attached to this
     *  Telos Link.
     */
    public void addLink(OMELink l) {
	links.add(l);
    }
   
    
    /** Returns the unique (within its view) integer ID of this Telos link. 
     *  The annotation/name of a link is optional, so this serves to identify 
     *  the link when iterating. */
    public int getID() {
	return id;
    }
    

    /** Set the id for this Telos link. 
     *
     *  @param id the integer id to be assigned to this Telos link
     */
    public void setID(int id) {
	this.id=id;
	D.o("TelosLink.setID called erroniously!");
    }
    

    /** Returns the destination of this Telos link. If this link has no
     * destination set, it returns null.*/
    public OMEObject getTo() {
	//D.o("link "+id+" getting To: ");
	
	Attribute atts_to[] = individual.directAttributes(TOCAT,TO);
	if (atts_to.length > 0) {
	    Proposition p = (Proposition)atts_to[FIRST].to();
	    return model.getObject(p);
	}
	return null;
    }


    /** Set the destination for this Telos link.
     *
     *  @param e the destination object to be assigned to this Telos link
     */
    public void setTo(OMEObject e) throws Exception {
	D.a(e);
	// remove any pre-extant field, then add.	
	D.o("TelosLink: setting To");
	Attribute to[] = individual.directAttributes(TOCAT, TO);
	Individual target=null;
	if(to.length != 0) {
	    //other side...
	    //save our old target:
	    target = (Individual)(to[FIRST].to());
	    // remove our old to attribute
	    individual.removeDirectAttr(to[FIRST]);	    
	}
	
	try {
	    Proposition p = 
		   	kb.newAttribute(individual,TOCAT,TO,((TelosObject)e).getIndividual());
	    //e.getLinks().add(this);
	    D.a(getIndividual());
	    e.addLink(this);
	    D.o("TelosLink "+id+" TO set to Telos..." +
		    model.getObject((Proposition)p.to()).getID());	
	} catch (TelosException te) {
	    // We were unable to add the new attribute.  Best set things back
	    // the way they were...
	    if (to.length > 0) {
		kb.newAttribute(individual,TOCAT,TO,target);
	    }
	    
	    throw te;
	}
    }
    

    /** Returns the source of this Telos link. This also updates the elements. */
    public OMEObject getFrom() {
	Attribute atts_from[] = individual.directAttributes(FROMCAT,FROM);
	if (atts_from.length > 0) {
	    Proposition p = (Proposition)atts_from[FIRST].to();
	    return model.getObject(p); 
	}
	return null;
    }
    

    /** Set the source for this Telos link. This also updates the elements. 
     *
     *  @param o the source to be assigned to this Telos element
     */
    public void setFrom(OMEObject o) throws Exception {
	// remove any pre-extant fields, then add a new one.
	Attribute from[] = individual.directAttributes(FROMCAT, FROM);
	Individual target = null;
	if(from.length!=0) {
	    target = (Individual)from[FIRST].to();
	    individual.removeDirectAttr(from[FIRST]);
	}
	
	try {
	    Proposition p = kb.newAttribute(individual,
		    FROMCAT, FROM, ((TelosObject)o).getIndividual());
	    //o.getLinks().add(this);
	    o.addLink(this);
	    D.o("TelosLink "+id+" FROM set to Telos..." +
		    model.getObject((Proposition)p.to()).getID());
	} catch (TelosException te) {
	    if (from.length > 0) {
		kb.newAttribute(individual, FROMCAT, FROM, target);
	    }

	    throw te;
	}
    }
    

    /* methods specific to TelosLink: */
    
    /**? Creates a new Telos Link.
     *
     *  @param kb the knowledge base where this link would be stored
     *  @param framework the Telos framework on which this model is based on
     *  @param model the Telos model in which this Telos link is in.
     *  @param id a unique ID (within a view) for this Telos link
     */
    public TelosLink(KB kb, TelosFramework framework, 
		    TelosModel model, int id, Object type) throws Exception {
	super();
	D.o("Creating TelosLink");
	this.kb=kb;
	this.framework=framework;
	this.model=model;
	this.id=id;
	this.type = (Proposition)type;

	try {
	    individual= kb.newIndividual("Link_"+id, Levels.TOKEN_LEVEL);
	    //links = new TelosLinkLinkCollection(this);
	    
	    //telos-side fields:
	    Proposition ancestors[] = {(Proposition)type};
	    individual.addDirectAncestors(ancestors);
	    // sets the name for new element:	    
	    TelosString n = null;
	    Attribute defaultname [] = 
		    this.type.attributes(DEFAULT_NAME,NOLABEL);
	    if (defaultname.length > 0) {
		n = (TelosString)defaultname[FIRST].to();	
	    } else {
		n = new TelosString("");
	    }
	    Attribute name = kb.newAttribute(individual, NAMECAT, NOLABEL, n);
	} catch (TelosException e) {
	    // reverse our telos-side actions.
	    if(individual!=null) {
		kb.removeAndDeleteProposition(individual);
	    }
	    throw e;
	}
	    
	D.o("Created TelosLink");
    }


    /** Creates a new Telos Link from an existing proposition which already
     *  represents a link.
     *
     *  @param kb the knowledge base where this link would be stored
     *  @param framework the Telos framework on which this model is based on. 
     *  @param model the Telos model in which this Telos link is in
     *  @param id a unique ID (within a view) for this Telos link
     *  @param proposition the proposition which represents this link
     */
    public TelosLink(KB kb, TelosFramework framework, 
		    TelosModel model, int id, Proposition p) throws Exception {
	super((Individual)p);
	D.o("Creating TelosLink from kb.");
	this.kb=kb;
	this.framework=framework;
	this.model=model;
	this.id=id;
	this.individual=(Individual)p;
	//links = new TelosLinkLinkCollection(this);

	// me must find our type:
	type=null;
	Proposition[] ancestors = p.directAncestors();
	for (int i=0; i<ancestors.length;i++) {
	    if(!ancestors[i].isBuiltin()) {
		type=ancestors[i];
	    }
	}
	if (type==null) {
	    throw new Exception("TelosLink failed during load: "+ 
		    "type not found");
	}
	
	D.o("Created TelosLink from kb");
    }
}


