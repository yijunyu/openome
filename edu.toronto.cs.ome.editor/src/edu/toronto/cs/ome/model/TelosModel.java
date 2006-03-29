/* Revised by Zhifeng Liu Jul-Aug 2004
 Please refer to the added comments for detail
 */

/* TelosModel
 *  Created August 1998 by Joseph Makuch. 
 *
 * Copyright John Mylopolous, and Eric Yu.
 * 
 */
package edu.toronto.cs.ome.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import jtelos.Individual;
import jtelos.KB;
import jtelos.Proposition;
import edu.toronto.cs.ome.controller.ModelManager;
import edu.toronto.cs.ome.view.GraphicView;
import edu.toronto.cs.ome.view.GraphicViewElement;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewManager;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.telos.TelosParserKB;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;

/**
 * The OME Model, represented in Telos. We store the serializeable portions of
 * the model here. This is distict from the view which stores the locations of
 * objects here. Here we store the objects, their properties, names, links, etc.
 * There may be multiple models, possibly on the same or different kbs. Each
 * OMEModel represents one model. An OME model consists of named and typed
 * elements, and typed, annotated links. Conceptually the annotation of links is
 * different from the names of elements in that the element's name should be
 * unique within some context.
 */

public class TelosModel extends OMEModel implements TelosFunctionality {

	/**
	 * 
	 * @uml.property name="framework"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private TelosFramework framework;

	private KB kb;

	/**
	 * 
	 * @uml.property name="mm"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private ModelManager mm;

	/**
	 * 
	 * @uml.property name="viewmanager"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public ViewManager viewmanager;

	private Collection elements;

	private Collection links;

	private boolean dirty;

	private int elementcount = 0;

	private int linkcount = 0;

	private Map props2objects;

	/**
	 * Initializes a new Telos model in the kb and within the framework
	 * provided. Obviously the framework should only use the passed kbm.
	 * 
	 * @param kb
	 *            the knowledge base in which this Telos Model would be stored
	 * @param framework
	 *            the framework on which this model is based on (not been used
	 *            in the Telos Model ?)
	 * @param mm
	 *            the model manager which controls the various models (not been
	 *            used in the Telos model ?)
	 */
	public TelosModel(KB kb, TelosFramework framework, ModelManager mm) {
		//D.o("Creating TelosModel");
		// refine this!
		this.kb = kb;
		this.mm = mm;
		this.framework = framework;

		props2objects = new HashMap();
		int n = getViewNumbers(kb);
		elements = new HashSet();
		links = new HashSet();
		dirty = true;
		viewmanager = new ViewManager(this, n);
		//D.o("TelosModel created");
	}

	public int getViewNumbers(KB kb) {
		int i = 0;

		try {
			while (kb.individual("SerializedView_" + i) != null)
				i++;
		} catch (Exception e) {
			//D.o(e);
		}

		i--;
		return i;
	}

	/**
	 * Returns the OMEPlugin's that consider themselves compatible with this
	 * model.
	 */
	public Collection getPlugins() {
		return mm.getPlugins(this);
	}

	/**
	 * Creates a new element within the model which can then be manipulated
	 * through the OMEElement interface.
	 */
	public ModelElement createElement(Object type) throws Exception {
		TelosElement te = null;
		try {
			te = new TelosElement(kb, framework, this, elementcount+1, type);
			elements.add(te);
			elementcount++;
			props2objects.put(te.getIndividual().telosName(), te);
		} catch (Exception e) {
			D.o(e);
			throw e;
		}
		return te;
	}

	/**
	 * Creates a new link within the model which can then be manipulated through
	 * the OMELink interface.
	 */
	public ModelLink createLink(Object type) throws Exception {
		try {
			TelosLink tl = new TelosLink(kb, framework, this, linkcount++, type);
			links.add(tl);
			props2objects.put(tl.getIndividual().telosName(), tl);
			return tl;
		} catch (Exception e) {
			D.o("Link Creation Exception: " + e);
			throw e;
		}
		//return null;
	}

	/**
	 * Deletes the element from this Telos model.
	 * 
	 * @param element
	 *            the element to be deleted
	 */
	public void deleteElement(ModelElement element) {

		deleteObject(element);

	}

	/**
	 * Deletes the link from this Telos model.
	 * 
	 * @param link
	 *            the link to be deleted
	 */
	public void deleteLink(ModelLink link) {

		deleteObject(link);

	}

	/**
	 * Deletes the object from the Telos model.
	 * 
	 * @param mo
	 *            the object to be deleted.
	 */
	public void deleteObject(ModelObject mo) {
		if (mo==null) return;
		// D.o("Deleting object " + mo.getID() + ": " + mo.getName());
		// remove links to this object first.
		Iterator i = mo.getLinks().iterator();
		while (i.hasNext()) {
			ModelLink link = (ModelLink) i.next();
			//New commments Zhifeng Liu(Jul 21 2004):Replace deleteLink(link);
			// In this way, we avoid indirect reversion
			deleteObject(link);
		}
		if (mo instanceof ModelElement) {
			elements.remove(mo);
			// we delete our children
			Iterator children = ((ModelElement) mo).getChildren().iterator();
			while (children.hasNext()) {
				ModelObject child = (ModelObject) children.next();
				if (child == null) {
					continue;
				}
				deleteObject(child);
			}
		} else if (mo instanceof ModelLink) {
			TelosObject to, from;
			to = (TelosObject) ((TelosLink) mo).getTo();
			from = (TelosObject) ((TelosLink) mo).getFrom();
			if (to != null) {
				to.links.remove(mo);
			}
			if (from != null) {
				from.links.remove(mo);
			}
			links.remove(mo);
		}
		props2objects.remove(((TelosObject) mo).getIndividual().telosName());
		// alert the views:
		Iterator vi = viewmanager.getViews();
		while (vi.hasNext()) {
			View view = (View) vi.next();
			if (mo instanceof ModelLink) {
				view.dirtyLink((ModelLink) mo);
			} else {
				view.dirtyElement((ModelElement) mo);
			}
		}
		// Delete the object (!!!!!!!!)
		kb.removeAndDeleteProposition(((TelosObject) mo).getIndividual());
	}

	/**
	 * Returns the framework on which this Telos model is based on.
	 * 
	 * @uml.property name="framework"
	 */
	public OMEFramework getFramework() {
		return framework;
	}

	/**
	 * Returns the elements within this Telos model. This is not writeable
	 * 
	 * @uml.property name="elements"
	 */
	public Collection getElements() {
		return elements;
	}

	/**
	 * Returns the links within this Telos model. This is not writeable
	 * 
	 * @uml.property name="links"
	 */
	public Collection getLinks() {
		return links;
	}

	/** creates elements, links, etc, from the current kb. */
	public void load() throws Exception {
		long t1 = System.currentTimeMillis();
		int h = 0;
		//D.o("Telosmodel loading from kb");
		// for each instantiable type...
		Iterator ii = framework.getAllInstantiable();
		while (ii.hasNext()) {
			//Individual type = (Individual) ii.next();
			TelosParserIndividual type = (TelosParserIndividual) ii.next();
			type.telosKB = (TelosParserKB) kb;
			TelosParserIndividual eltype = (TelosParserIndividual) kb
					.individual(OME_ELEMENT);
			eltype.telosKB = (TelosParserKB) kb;
			TelosParserIndividual lntype = (TelosParserIndividual) kb
					.individual(OME_LINK);
			lntype.telosKB = (TelosParserKB) kb;
			// ... reconcile its instances:
			Proposition p[] = type.allInstances();
			//TelosParserIndividual p[]= type.allInstances();
			TelosElement te = null;
			TelosLink tl = null;
			for (int i = 0; i < p.length; i++) {
				// Only add this prop to the model if we haven't already
				// (multiple inheritance causes multiple instantiation).
				if (props2objects.containsKey(p[i].telosName())) {
					// update the proposition only
					if (type.isChildOf(eltype) && !type.isChildOf(lntype)) {
						te = (TelosElement) props2objects.get(p[i].telosName());
			    		ArrayList key = new ArrayList();
			    		key.add("attribute"); key.add("label");
			    		String s = (String) ((TelosParserIndividual)p[i]).attributes.get(key);
				    	TelosParserIndividual x = (TelosParserIndividual)(kb.individual(Computing.strip_quote(s)));
		    			if (x!=null) {
		    				te.setLabel(x);
		    			}
					} else if (!type.isChildOf(eltype) && type.isChildOf(lntype)) {
						tl = (TelosLink) props2objects.get(p[i].telosName());						
					}
					// and update the views.
					Iterator views = viewmanager.getViews();
					while (views.hasNext()) {
						View view = (View) views.next();
						if (type.isChildOf(eltype)) {
							getElements().add(te);
							te.individual = (Individual) p[i];
							view.dirtyElement(te);
						} else if (type.isChildOf(lntype)) {
							getLinks().add(tl);
							view.dirtyLink(tl);
						} else {
							D.a(false);
						}
					}					
				} else {
					if (type.isChildOf(eltype) && !type.isChildOf(lntype)) {
						int id = unmangleID(p[i].label());
						elementcount++;
						te = new TelosElement(kb, framework, this, id, p[i]);
						props2objects.put(p[i].telosName(), te);
					}
					if (!type.isChildOf(eltype) && type.isChildOf(lntype)) {
						int id = unmangleID(p[i].label());
						linkcount++;
						tl = new TelosLink(kb, framework, this, id, p[i]);
						if (tl.getFrom()!=null)
							tl.getFrom().addLink(tl);						
						if (tl.getTo()!=null)
							tl.getTo().addLink(tl);
						props2objects.put(p[i].telosName(), tl);
					}
					if (!type.isChildOf(eltype) && !type.isChildOf(lntype)) {
						D.a(false);
					}
					// and update the views.
					Iterator views = viewmanager.getViews();
					while (views.hasNext()) {
						View view = (View) views.next();
						if (type.isChildOf(eltype)) {
							view.dirtyElement(te);
							h++;
						} else if (type.isChildOf(lntype)) {
							view.dirtyLink(tl);
							h++;
						} else {
							D.a(false);
						}
					}
				}
			}
		}
		long t2 = System.currentTimeMillis() - t1;
		D.o("Telos model loaded from kb after " + t2/1000.0 + " seconds.");
	}

	/** Saves this model and all its views. */
	public void save(File f) throws Exception {
		mm.saveModelTo(this, f);
		if (System.getProperty("protege")!=null)
			mm.saveModelToProtege(this);
	}

	//cai,2.1.2001
	public void saveassml(File f) throws Exception {
		mm.saveModelToSml(this, f);
	}

	//Layout--Xiao Xue Deng
	public void layout(File f) throws Exception {
		mm.layOut(this, f);
	}
	public void setSATDEN(GraphicViewElement e, float s, float d) {
		mm.setSD(this,e,s,d);
	}
	/**
	 * Returns the int value stored in string <code>s</code>. This is the
	 * equivalent of the funtion "atoi" in C/C++
	 * 
	 * @param s
	 *            the string whose integer value we want
	 * 
	 * @return the integer value stored in the string <code>s</code>
	 */
	private int unmangleID(String s) {
		StringTokenizer st = new StringTokenizer(s, "_");
		if (st.nextToken().equals("Element")) { // element
		} else { // link.
		}
		int rval = Integer.valueOf(st.nextToken()).intValue();
		//D.o("Unmangling to: "+rval);
		return rval;

	}

	/**
	 * Returns the (boolean) value of <code>dirty</code>. An entity is dirty
	 * if it has changed since the last paint and thus needs to be repainted.
	 * 
	 * @uml.property name="dirty"
	 */
	public boolean isDirty() {
		return dirty;
	}

	/**
	 * Returns the OMEElement which a proposition represents.
	 * 
	 * @param p
	 *            the proposition which represents the OMEElement we want
	 * 
	 * @return the OMEElement which proposition <code>p</code> represents
	 */
	public OMEElement getElement(Proposition p) {
		if (p==null)
			return null;
		else
			return (OMEElement) props2objects.get(p.telosName());
	}

	/**
	 * Returns the OMELink which a proposition represents.
	 * 
	 * @param p
	 *            the proposition which represents the OMELink we want
	 * 
	 * @return the OMELink which proposition <code>p</code> represents
	 */
	public OMELink getLink(Proposition p) {
		if (p==null) return null;
		return (OMELink) props2objects.get(p.telosName());
	}

	/**
	 * Returns the OMEObject which a proposition represents. This is currently a
	 * temporary implementation which needs to be changed once "props2objects"
	 * has been implemented.
	 * 
	 * @param p
	 *            the proposition which represents the OMEObject we want
	 * 
	 * @return the OMEObject which proposition <code>p</code> represents
	 */
	public OMEObject getObject(Proposition p) {
		if (p==null) return null;
		OMEObject o = (OMEObject) props2objects.get(p.telosName());
		return o;
	}

	/** Returns this Telos Model's ModelManager. */
	public ModelManager getModelManager() {
		return mm;
	}

	/** Returns this Telos Model's viewmanager. */
	public ViewManager getViewManager() {
		return viewmanager;
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.model.OMEModel#saveasvdx(java.io.File)
	 */
	public void saveasvdx(File f) throws Exception {
		mm.saveModelToVdx(this, f);
	}
	public void saveasdot(File f) {
		Iterator vi = viewmanager.getViews();
		while (vi.hasNext()) {
			GraphicView view = (GraphicView) vi.next();
			mm.saveModelToDot(this, view, f);
		}
	}

	public void saveasxml(File f) {
		mm.saveModelToXML(this, f);
	}	
	public void saveasq7(File f) {
		try {
			mm.saveModelToQ7(this, f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public void saveasdat(File f) {
		try {
			mm.saveModelToDat(this, f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveasxmi(File f) {
		try {
			mm.saveModelToXMI(this, f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}

