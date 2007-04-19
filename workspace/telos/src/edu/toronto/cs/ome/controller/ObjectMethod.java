package edu.toronto.cs.ome.controller;

import java.util.Collection;

import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewContext;
import edu.toronto.cs.ome.view.ViewObject;

/**
 * Many PluginMethods operate on ViewObjects.  They look for a ViewObject
 *  from the context, and if they can't find one there, they will seek one 
 *  from the user as a parameter.  This class encapsulates that behaviour to
 *  save the plugin implementor from repeating the same code again and again.
 */

/*
 *  This class is a little messy, since it was extended to support methods
 *  that require an arbitrary number of objects as input, without breaking
 *  subclasses that were built prior to this extension (when it only dealt
 *  with one object).
 */
public abstract class ObjectMethod extends AbstractPluginMethod {

	/**
	 * 
	 * @uml.property name="viewobjects"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 */
	//private ViewObject vo = null;	    // What this method operates on.
	private ViewObject viewobjects[];

    private int objects_collected;

    // String members name and instruction.  Set these in the subclass'
    // constructor.
    //
    // name	    - the name of the method.
    // instruction  - presented to the user when asked to provide an object
    //                paramter, instruction[i] presented when collecting the
    //                ith object.
    protected String name = null;
    protected String instruction = null;    // Used by one object methods.
    protected String[] instructions = null;

    // These values are used so we know what state the method is in.
    private boolean gotContextP = false;
    //private boolean gotObjectP = false;

    /** When no n is supplied, the default is 1.*/
    public ObjectMethod(View view) {
	this.view = view;
	viewobjects = new ViewObject[1];
	instructions = new String[1];
    }

    /** The input n determines how many objects are needed by this Method. */
    public ObjectMethod(View view, int n) {
	this.view = view;
	viewobjects = new ViewObject[n];
	instructions = new String[n];
    }

    /** We try to get the object from the context first, if possible,
     *  otherwise we ask for an object as a paramter.  NOTE:  objects that are
     *  selected by the context are ignored. */
    final public PluginParameter nextParameter() {
	if (!gotContextP) {
	    return contextParameter();
	} else if (objects_collected != numObjects()) {
	    return objectParameter();
	} else {
	    // All objects have been collected.
	    return null;
	}
    }
    /*
    public PluginParameter nextParameter() {
	if (vo != null || (gotContextP&&gotObjectP)) {
	    return null;
	} else if (!gotContextP) {
	    return contextParameter();
	} else if (!gotObjectP) {
	    return objectParameter();
	}
	// This case is an invalid state.
	D.a(false);
	return null;
    }
    */

    /** Accept the parameter we just asked for.  Change our state
     * appropriately.
     */
    final public void passParameter(Collection c) {
	ViewObject vo;
	if (!gotContextP) {
	    ViewContext con = (ViewContext)c.iterator().next();
	    gotContextP = true;
	    vo = con.associatedObject();
	    if (vo==null) {
		// We didn't get anything here, but next time we will ask for
		// an object directly.
		return;
	    }
	} else {    // Object parameter.
	    vo = (ViewObject)c.iterator().next();
	}
	if (isSuitable(vo, objects_collected, viewobjects)) {
	    viewobjects[objects_collected] = vo;
	    objects_collected++;
	}
	// Otherwise, it was no good.  Please try again.
    }
    
    /*
    public void passParameter(Collection c) {
	if (!gotContextP) {
	    ViewContext con = (ViewContext)c.iterator().next();
	    vo=con.associatedObject();
	    if (vo!=null) {
		if (!isSuitable(vo)) {
		    vo = null;
		}
	    }
	    gotContextP = true;
	} else if (!gotObjectP) {
	    vo = (ViewObject)c.iterator().next();
	    if (isSuitable(vo)) {
		gotObjectP = true;
	    } else {
		vo = null;
	    }
	} else {
	    // We weren't expecting a paramter.  This is an error condition.
	    D.a(false);
	}
    }*/

    /** If the method is cancelled, we must return to the starting state. */
    final public void cancelled() {
	resetState();
	resetMethod();
    }

    /** Override this method to perform any clean up that shoudl take place
     *  after an invocation of cancellation of the method. */
    protected void resetMethod() {}

    /** Sets the state of this method to the starting state. */
    private void resetState() {
	gotContextP = false;
	objects_collected = 0;
    }


    /** Invoke performs the operation on the method, and then resets the state
     *  of the method. */
    final public void invoke() {
	if (objects_collected == numObjects()) {
	    if (numObjects()==1) {
		operate(viewobjects[0]);
	    } else {
		operate(viewobjects);
	    }
	}
	resetState();

    }  

    /** Override this method to perform a suitability test on the object.
     *  For example, if you only want a link of a certain type, check to
     *  see if that's what you`ve got.
     *  vo is guaranteed not be null.
     *
     *  This method is only called for one-object methods.
     */
    protected boolean isSuitable(ViewObject vo) {
	return true;
    }

    /** Override this method to perform a suitability test on the nth object
     *  (COUNTING FROM ZERO).
     *  The array of ViewObjects collected before this one is also supplied,
     *  but is only guaranteed to be initialized up to index n-1.
     *  Leave this method if this is a one-object method, and use the one
     *  above.
     */
    protected boolean isSuitable(ViewObject vo, int n, ViewObject[] collected) {
	// This is just a default implementation intended to not break Methods
	// that were defined when this class only worked on one object.
	if (n==0) return isSuitable(vo);
	return true;
    }
    

    /** For objects using 1 object...
     *  Override this method to perform the desired operation on the object.
     *  vo is guaranteed not be null.
     */
    protected void operate(ViewObject vo) {}

    /** For objects using more than 1 object...
     *  Override this method to perfrom the desired operation on the given
     *  objects.  Each entry in viewobjects is guaranteed to be non-null, and
     *  the order they are in the array is the order in which they were
     *  collected.
     */
    protected void operate(ViewObject[] viewobjects) {}

	/**
	 * Set the name for this method in subclass' constructor.
	 * 
	 * @uml.property name="name"
	 */
	final public String getName() {
		return name;
	}


    /** This method is only enabled if the view has an object associated with
     *  it.
     */
    final public boolean isEnabled(ViewContext con) {
	ViewObject vo = con.associatedObject(); 
	if (vo!=null) {
	    return isSuitable(vo, 0, viewobjects);
	}
	return false;
    }

    public String getAcceleratorStr() {
    	return "";
    }

    /** The number of objects this method uses. */
    private int numObjects() {
	return viewobjects.length;
    }

	/**
	 * Gets the instruction for the next paramter we are collecting
	 * 
	 * @uml.property name="instruction"
	 */
	private String getInstruction() {
		if (numObjects() == 1) {
			return instruction;
		} else {
			return instructions[objects_collected];
		}
	}

    
    private PluginParameter objectParameter() {
	return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		getInstruction(), PluginParameter.OMEObjectType);
    }

    private PluginParameter contextParameter() {
	return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		null, PluginParameter.OMEContextType);
    }
}
