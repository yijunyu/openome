package edu.toronto.cs.ome.controller;

import java.awt.Image;
import java.util.Collection;
import java.util.Iterator;

import util.D;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewContext;
import edu.toronto.cs.ome.view.ViewObject;

/**
 * This class is a <code>PluginMethod</code> that is used to create an link
 * whose type is specified at construction time. This PluginMethod can be placed
 * on a menu, toolbar or popupmenu.
 */

public class CreateLinkMethod extends AbstractPluginMethod {
	protected Object type;

	protected String typename;

	/**
	 * 
	 * @uml.property name="nextp"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private PluginParameter nextp; // The parameter we want next.

	Collection sources;

	/**
	 * 
	 * @uml.property name="dest"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	ViewObject dest;


	private boolean expectingcontext;

	protected Image image;

	/**
	 * Constructs a <code>CreateLinkMethod</code> which can be used to create
	 * links with the specified type and typename in the specified view.
	 * 
	 * @param type
	 *            the type of the object to be created
	 * @param typename
	 *            the name to be associated with the created object
	 * @param view
	 *            the view where this object will be created. Unfortunately in
	 *            the present architecture, changes are made to the view which
	 *            are then reflected in the model, instead of the reverse (where
	 *            changes are made made to the model which are reflected in the
	 *            view).
	 */
	public CreateLinkMethod(Object type, String typename, View view) {
		D.a(type);
		this.type = type;
		this.typename = typename;
		this.view = view;

		resetMethod();
		/*
		 * nextp = contextParameter(); expectingcontext = true;
		 */
		// Render our image now, once.
		// Draw a line through the link head, to make it look like a link.
		Image im = view.getImage(type);
		image = view.getImageTable().drawHLine(im);
	}

	/**
	 * Creates a <code>CreateLinkMethod</code> which can be used to create
	 * links in the specified view.
	 * 
	 * ASIDE-NOTE: I am doubtful if this method is been used and whether it is
	 * really useful. It might be worthwhile to check this out.
	 *  
	 */
	public CreateLinkMethod(View view) {
		this.view = view;
		resetMethod();
	}

	/**
	 * Returns the image associated with the object this method will create.
	 * 
	 * @see PluginMethod#getImage() getImage()
	 * 
	 * @uml.property name="image"
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * Returns the type of the object, this method will create
	 * 
	 * @see PluginMethod#getName() getName()
	 */
	public String getName() {
		return typename;
	}

	/**
	 * Get the next parameter to be used when this method is invoked.
	 * 
	 * @see PluginMethod#nextParameter() nextParameter()
	 */
	public PluginParameter nextParameter() {
		return nextp;
	}

	/**
	 * Passes the next parameter to be used when this method is invoked.
	 * 
	 * @see PluginMethod#passParameter(Collection c) passParameter(Collection c)
	 */
	public void passParameter(Collection c) {
		if (!c.iterator().hasNext()) {
			// There is nothing there. We weren't expecting that.
		} else if (expectingcontext) {
			ViewContext con = (ViewContext) c.iterator().next();
			ViewObject o = con.associatedObject();
			Collection selected = con.selectedObjects();
			if (o != null && selected.iterator().hasNext()) {
				dest = o;
				sources = selected;
				nextp = null;
			} else {
				nextp = sourceParameter();
			}
			expectingcontext = false;

		} else if (sources == null) {

			// We have received the source object.
			// source = (ViewObject)c.iterator().next();
			sources = c;

			// And we now want the destination object.
			nextp = destinationParameter();

		} else {

			// We have received the destination object.
			dest = (ViewObject) c.iterator().next();

			// And we are done getting parameters
			nextp = null;
		}
	}

	/**
	 * Execute this method. This is analogous to the actionPerformed method in
	 * ActionListener's.
	 * 
	 * @see PluginMethod#invoke() invoke()
	 */
	public void invoke() {
		System.out.println("CreateLink");
		if (sources == null || dest == null) {
			//Somethings wrong, give up.
		} else {
			// try/catch model errors?
			Iterator i = sources.iterator();
			while (i.hasNext()) {
				ViewObject vo = (ViewObject) i.next();
				if (vo != dest) {
					if (type==null)
						D.o("controller.CreateLinkMethod error: type == null");
					view.createLink(type, vo.getModelObject(), dest
							.getModelObject());
				} else {
					//throw up a helpful `don't connect to self` message
					System.out.println("`don't connect to self`");
				}
			}

		}
		// And clean up.
		resetMethod();
	}

	/**
	 * Cancel this method. Do neccessary clean-up and exit method gracefully.
	 * 
	 * @see PluginMethod#cancelled() cancelled()
	 */
	public void cancelled() {
		resetMethod();
	}

	/** This cleans-up the method, preparing it to be used a new. */
	protected void resetMethod() {
		nextp = contextParameter();
		expectingcontext = true;
		sources = null;
		dest = null;
	}

	/**
	 *  
	 */
	private PluginParameter contextParameter() {
		return new PluginParameter(PluginParameter.CARDINALITY_ONE, null,
				PluginParameter.OMEContextType);
	}

	/**
	 *  
	 */
	private PluginParameter sourceParameter() {
		// We want a ViewObject for one end of the link.
		return new PluginParameter(PluginParameter.CARDINALITY_ONE,
				"Select the SOURCE for the new " + typename + ".",
				PluginParameter.OMEObjectType);
	}

	/**
	 *  
	 */
	private PluginParameter destinationParameter() {
		// We want a ViewObject for the other end of the link.
		return new PluginParameter(PluginParameter.CARDINALITY_ONE,
				"Select the DESTINATION for the new " + typename + ".",
				PluginParameter.OMEObjectType);
	}
}