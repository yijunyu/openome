package edu.toronto.cs.ome.controller;

import java.awt.Image;
import java.util.Collection;

import javax.swing.JOptionPane;

import edu.toronto.cs.ome.model.OMEFramework;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewContext;
import edu.toronto.cs.ome.view.ViewObject;
import edu.toronto.cs.util.D;

/**
 * This class is a <code>PluginMethod</code> that is used to create an element
 * whose type is specified at construction time. This PluginMethod can be 
 * placed on a menu, toolbar or popupmenu.
 */

public class CreateElementMethod extends AbstractPluginMethod {
    private Object type;
    private String typename;

	/**
	 * 
	 * @uml.property name="nextp"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private PluginParameter nextp; // The parameter we want next.

	/**
	 * 
	 * @uml.property name="creationLocation"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private View.Location creationLocation;

	/**
	 * 
	 * @uml.property name="fw"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private OMEFramework fw;

    private int params_received =0;

    /** Constructs a <code>CreateElementMethod</code> which can be used to
      * create elements with the specified type, typename and view.
      *
      *	@param type the type of the object to be created
      * @param typename the name to be associated with the created object
      * @param view the view where this object will be created. Unfortunately
      * in the present architecture, changes are made to the view which are
      * then reflected in the model, instead of the reverse (where changes are
      * made made to the model which are reflected in the view).
      */
    public CreateElementMethod(Object type, String typename, View view) {
	this.type = type;
	this.typename = typename;
	this.view = view;
	fw = view.getModel().getFramework();

	nextp = firstParameter();
    }

    /** Returns the image associated with the object this method will create.
      *
      * @see PluginMethod#getImage() getImage()
      */
    public Image getImage() {
	Image i = view.getImage(type);
	return i;
    }

    /** Returns the type of the object, this method will create
      *
      * @see PluginMethod#getName() getName()
      */      
    public String getName() {
	return typename;
    }

    /** Get the next parameter to be used when this method is invoked.
      *
      * @see PluginMethod#nextParameter() nextParameter()
      */
    public PluginParameter nextParameter() {
	return nextp;
    }

    /** Passes the next parameter to be used when this method is invoked.
      *
      * @see PluginMethod#passParameter(Collection c) passParameter(Collection
      * c)
      */
    public void passParameter(Collection c) {	
	params_received++;
	
	if (!c.iterator().hasNext()) {
	    // There is nothing there.  We weren't expecting that.
	
	} else if (params_received == 2) {
	    // We have received the location.
	    creationLocation = (View.Location)c.iterator().next();
	    // And we have all the parameters we need.
	    nextp = null;
	
	} else if (params_received == 1) {
	    // We have received the context.
	    ViewContext context = (ViewContext)c.iterator().next();
	    if (context.associatedLocation() != null) {
		creationLocation = context.associatedLocation();
		nextp = null;
	    } else {
		// This context was of no use.
		nextp = secondParameter();
	    }
	    
	} else {
	    // We should never get here.
	    D.a("Invalid state in Create Element method.");
	}
    }
    
    /** Execute this method. This is analogous to the actionPerformed method in
      * ActionListener's.
      *
      * @see PluginMethod#invoke() invoke()
      */
    public void invoke() {
	if (creationLocation == null) {
	    //Somethings wrong, give up.
	} else {
	    // try/catch model errors?
	    try {
		ViewObject o = view.createElement(type, creationLocation); 
		view.promptRename(o);
	    } catch (Exception e) {
		// We have probably tried to create an element within the
		// bounds of another, and the KB won't allow this (bad types).
		// We should make some specialized exceptions at some point.
		D.o("Semantic Error creating element.");
		JOptionPane.showMessageDialog(null,
			"Unable to create " + fw.getName(type) +
			" at this location.",
			"Semantic Error",
			JOptionPane.ERROR_MESSAGE);
		resetMethod();
	    }

	    // And clean up.
	    resetMethod();
	}
    }

    /** Cancel this method. Do neccessary clean-up and exit method gracefully.
      *
      *	@see PluginMethod#cancelled() cancelled()
      */
    public void cancelled() {
	resetMethod();
    }

    /** This cleans-up the method, preparing it to be used a new. */
    private void resetMethod() {
	nextp = firstParameter();
	creationLocation = null;
	params_received = 0;
    }
    
    /** The first paramter we look for, we will see if the Context can
     *  give us the information we need.*/
    private PluginParameter firstParameter() {
	return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		null, PluginParameter.OMEContextType);
    }

    /** The second paramter we look for, we use this if the Context was
     *  of no use.*/
    private PluginParameter secondParameter() {
	// The first (and only) thing we are going to want to know is
	// where to put the new element.
	return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		"Please select where the new " + typename +
		" should be created.", PluginParameter.LocationType);
    }
}
