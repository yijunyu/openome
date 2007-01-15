/* TelosModel
 *  Created August 1998 by Joseph Makuch. 
 *
 * Copyright John Mylopolous, and Eric Yu.
 * 
 */
package OME;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import jtelos.Individual;
import jtelos.KB;
import jtelos.Proposition;


/** The OME Model, represented in Telos. We store the serializeable portions
 * of the model here. This is distict from the view which stores the locations
 * of objects here. Here we store the objects, their properties, names, links,
 * etc. There may be multiple models, possibly on the same or different kbs.
 * Each OMEModel represents one model.
 *   An OME model consists of named and typed elements, and typed, annotated
 * links. Conceptually the annotation of links is different from the names of
 * elements in that the element's name should be unique within some context.
 *
 */
class TelosModel extends OMEModel implements TelosFunctionality {
	
    private Individual elementtypes[];
    private Individual linktypes[];    
    private TelosFramework framework;
    private KB kb;
    private ModelManager mm;
    private ViewManager viewmanager;

    private Collection elements;
    private Collection links;
    private boolean dirty;
    private int elementcount=0;
    private int linkcount=0;
    
    private Map props2objects;
    //private Map props2objects;
    //private Map props2objects;
    
    /** Contains methods to add, delete and list elements
     *  from the collection of elements in the Telos Model. Currently
     *  the methods don't do anything.*/
    private class elementscollection extends PessimisticCollection {

	//elementscollection() {}
	
	/** Adds an element to the model (not implemented yet).
	 *
	 *  @param o the element to be added
	 *
	 *  @return true
	 */
	public boolean add(Object o) { return true; }


	/** Removes an element from the model (not implemented yet).
	 *
	 *  @param o the element to be removed
	 *
	 *  @return true
	 */
	public boolean remove(Object o) { return true; }
	

	/** I am not sure what this should be doing....Joe please comment this
	 *
	 *  @return null
	 */
	public Iterator iterator() { return null; }
    }
    

    /** Contains methods to add, delete and list links from the collection 
     *  of links in the Telos Model. Currently the methods don't do anything.
     */
    private class linkscollection extends PessimisticCollection {
	
	/** create a new links collection (not implemented yet) */
	linkscollection() {}


      /** Adds an element to the model (not implemented yet).
	 *
	 *  @param o the element to be added
	 *
	 *  @return true
	 */	
	public boolean add(Object o) {
	    return true;
	}


	/** Removes an element from the model (not implemented yet).
	 *
	 *  @param o the element to be removed
	 *
	 *  @return true
	 */	
	public boolean remove(Object o) {
	    return true;
	}


	/** I am not sure what this should be doing....Joe please comment this
	 *
	 *  @return null
	 */	
	public Iterator iterator() {
	    return null;
	}
    }
    
        
    /** Initializes a new Telos model in the kb and within the framework provided.       
     *  Obviously the framework should only use the passed kbm.
     *
     *  @param kb the knowledge base in which this Telos Model would be stored
     *  @param framework the framework on which this model is based on (not been
     *  used in the Telos Model ?)
     *  @param mm the model manager which controls the various models (not been
     *  used in the Telos model ?)     
     */
    public TelosModel(KB kb, TelosFramework framework, ModelManager mm, 
	    OME ome) {
	D.o("Creating TelosModel");
	// refine this!
	this.kb = kb;
	this.mm = mm;
	this.framework = framework;
	
	props2objects = new HashMap();
	//props2objects = new HashMap();
	//props2objects = new HashMap();	
	int n = getViewNumbers(kb);
	elements = new HashSet();
	links = new HashSet();
	dirty = true;
	viewmanager = new ViewManager(this, ome, n);
	D.o("TelosModel created");
    }

    /** Returns the number of views in kb */
    public int getViewNumbers(KB kb) {
	int i = 0;

	try{
	    while (kb.individual("SerializedView_"+i) != null)
		i++;
	} catch (Exception e) {
//	    D.o(e);
	}

	i--;
	return i ;
    }
    
    /** Returns the OMEPlugin's that consider themselves compatible with this
     * model. */
    public Collection getPlugins() {
	return mm.getPlugins(this);
    }
    
    
    /** Creates a new element within the model which can then be manipulated 
     *  through the OMEElement interface. 
     */
    public ModelElement createElement(Object type) throws Exception {
	TelosElement te=null;
	try {
	    te = new TelosElement(kb, framework, this,
		    elementcount++, type);
	    elements.add(te);
	    props2objects.put(te.getIndividual(), te);
	} catch (Exception e) {
	    D.o(e);
	    throw e;
	}
	return te;
    }
    

    /** Creates a new link within the model which can then be manipulated
     * through the OMELink interface. 
     */
    public ModelLink createLink(Object type) throws Exception {
	try {
	    TelosLink tl = new TelosLink(kb, framework, this, linkcount++, type);
	    links.add(tl);
	    props2objects.put(tl.getIndividual(),tl);
	    return tl;
	} catch (Exception e) {
	    D.o("Link Creation Exception: "+e);
	    throw e;
	}
	//return null;
    }
    

    /** Deletes the element from this Telos model.
     *
     *  @param element the element to be deleted     
     */
    public void deleteElement(ModelElement element) {
	deleteObject(element);
    }

    /** Deletes the link from this Telos model.
     *
     *  @param link the link to be deleted    
     */
    public void deleteLink(ModelLink link) {	
	deleteObject(link);
    }

    /** Deletes the object from the Telos model. 
     *  @param mo the object to be deleted.
     */
    public void deleteObject(ModelObject mo) {
	D.o("Deleting object "+mo.getID()+": "+ mo.getName());
	
	// remove links to this object first.
	Iterator i = mo.getLinks().iterator();
	while (i.hasNext()) {
	    ModelLink link = (ModelLink)i.next();
	    deleteLink(link);
	}
	
	if (mo instanceof ModelElement) {
	    elements.remove(mo);
	    // we delete our children
	    Iterator children = ((ModelElement)mo).getChildren().iterator();
	    while (children.hasNext()) {
		ModelObject child = (ModelObject)children.next();
		deleteObject(child);
	    }
	} else if (mo instanceof ModelLink) { 
	    TelosObject to, from; 
	    to = (TelosObject)((TelosLink)mo).getTo();
	    from = (TelosObject)((TelosLink)mo).getFrom();
	    if (to != null) {
		to.links.remove(mo);
	    }
	    if (from != null) {
		from.links.remove(mo);
	    }
	    
	    links.remove(mo);
	}

	props2objects.remove(((TelosObject)mo).getIndividual());
	// alert the views:
	Iterator vi = viewmanager.getViews();
	while (vi.hasNext()) {
	    View view = (View)vi.next();
	    if (mo instanceof ModelLink) {
		view.dirtyLink((ModelLink)mo);
	    } else {
		view.dirtyElement((ModelElement)mo); 
	    }
	}

	// Delete the object (!!!!!!!!)
	kb.removeAndDeleteProposition(((TelosObject)mo).getIndividual());
	
    }
	      

    /** Returns the framework on which this Telos model is based on. */
    public OMEFramework getFramework() {
	return framework;
    }


    /** Returns the elements within this Telos model. This is not writeable */
    public Collection getElements() {
	return elements;
    }
    

    /** Returns the links within this Telos model. This is not writeable*/
    public Collection getLinks() {
	return links;
    }


    /** creates elements, links, etc, from the current kb. */ 
    public void load() throws Exception {
	D.o("Telosmodel loading from kb");
	// for each instantiable type...
	Iterator ii = framework.getAllInstantiable();
	while(ii.hasNext()) {
	    Proposition type = (Proposition)ii.next();
	    D.o("in telosmodel type: " + type);
	    D.o("reconciling "+framework.getName(type));
	    Proposition eltype = kb.individual(OME_ELEMENT);
	    Proposition lntype = kb.individual(OME_LINK);
	    // ... reconcile its instances:
	    Proposition p[]=type.allInstances();
	    TelosElement te=null;
	    TelosLink tl=null;
	    for (int i=0; i<p.length;i++) {
		D.o("instance:\n "+JTelosUtil.telosDeclaration(p[i]));
		
		// Only add this prop to the model if we haven't already
		// (multiple inheritance causes multiple instantiation).
		if (!props2objects.containsKey(p[i])) {
		    
		    if (type.isChildOf(eltype)) {
			int id = unmangleID(p[i].label());
			
			elementcount = Math.max(id, elementcount)+1;
			te = new TelosElement(kb, framework, this, id, p[i]);		    
			props2objects.put(p[i],te);
		    } else if (type.isChildOf(lntype)) {
			int id = unmangleID(p[i].label());
			linkcount = Math.max(id,linkcount)+1;
			tl = new TelosLink(kb, framework, this, id, p[i]);
			props2objects.put(p[i],tl);	
		    } else {
			D.a(false);
		    }
		    
		    // and update the views.
		    Iterator views = viewmanager.getViews();
		    while(views.hasNext()) {
			View view = (View)views.next();
		  	if (type.isChildOf(eltype)) {
			    view.dirtyElement(te);
			} else if(type.isChildOf(lntype)) {
			    view.dirtyLink(tl);
			} else {
			    D.a(false);
			}
		    }
		}
	    }
	}
	D.o("Telos model loaded from kb.");
    }

    /** Saves this model and all its views. */
    public void save(String completepath) throws Exception {
	mm.saveModelTo(this,completepath);
    }
//cai,2.1.2001
    public void saveassml(String completepath) throws Exception {
	mm.saveModelToSml(this,completepath);
    }
//cai,7.10.2001
    public void saveasxml(String completepath) throws Exception {
	mm.saveModelToXml(this,completepath);
    }



    /** Returns the int value stored in string <code>s</code>. This is the
     * equivalent of the funtion "atoi" in C/C++
     *
     *  @param s the string whose integer value we want
     *
     *  @return the integer value stored in the string <code>s</code>     
     */
    private int unmangleID(String s) {
	StringTokenizer st = new StringTokenizer(s, "_");
	if(st.nextToken().equals("Element")) { // element	    
	} else { // link.
	}
	int rval = Integer.valueOf(st.nextToken()).intValue();
	D.o("Unmangling to: "+rval);
	return rval;
	
    }
    

    /** Returns the (boolean) value of <code>dirty</code>. An entity is dirty
     *  if it has changed since the last paint and thus needs to be repainted.
     */
    public boolean isDirty() {
	return dirty;
    }
    

    /** Returns the OMEElement which a proposition represents.
     *
     *  @param p the proposition which represents the OMEElement we want
     *
     *  @return the OMEElement which proposition <code>p</code> represents
     */
    public OMEElement getElement(Proposition p) {
	return (OMEElement)props2objects.get(p);
    }
    

    /** Returns the OMELink which a proposition represents.
     *
     *  @param p the proposition which represents the OMELink we want
     * 
     *  @return the OMELink which proposition <code>p</code> represents
     */
    public OMELink getLink(Proposition p) {
	return (OMELink)props2objects.get(p);
    }
    

    /** Returns the OMEObject which a proposition represents. This is currently
     *  a temporary implementation which needs to be changed once "props2objects"
     *  has been implemented.
     *
     *  @param p the proposition which represents the OMEObject we want
     *
     *  @return the OMEObject which proposition <code>p</code> represents
     */
    public OMEObject getObject(Proposition p) {
	OMEObject o;
	if ((o=(OMEObject)props2objects.get(p)) != null) {
	    return o;
	} else {
	    return (OMEObject)props2objects.get(p);
	}
    }
    

    /** Returns this Telos Model's ModelManager. */
    public ModelManager getModelManager() {
	return mm;
    }


    /** Returns this Telos Model's viewmanager. */
    public ViewManager getViewManager() {
	return viewmanager;
    }

}




