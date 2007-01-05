package edu.toronto.cs.ome.controller;

import edu.toronto.cs.ome.model.OMEElement;
import edu.toronto.cs.ome.model.OMELink;
import edu.toronto.cs.ome.model.OMEObject;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewContext;
import edu.toronto.cs.util.D;

/** This class serves as a means of conveying information from the user to
  * a <code>PluginMethod</code> before the latter is invoked. PluginParameters 
  * are specifically used to convey the cardinality (how many pieces of 
  * information are being requested), the type (the type of information been
  * requested), and a helpful message that can be displayed to convey some
  * message to the user.
  *
  * <P>With the current implementation, the only cardinality being supported
  * is CARDINALITY_ONE.
  */
public class PluginParameter {

    public static final int CARDINALITY_ONE = 1;
    public static final int CARDINALITY_ZERO_OR_MORE = 0;
    public static final int CARDINALITY_ONE_OR_MORE = 555;
    public static final int CARDINALITY_TWO_OR_MORE = 6669;
    
    // Parameter types we support:
    /** We support OMEObjects as plugin parameters.*/    
    public final static Class OMEObjectType= OMEObject.class;
    
    /** We support OMEElements as plugin parameters.*/
    public final static Class OMEElementType= OMEElement.class;
    
    /** We support OMELink as plugin parameters.*/
    public final static Class OMELinkType = OMELink.class;
    
    /** We support Locations as plugin parameters.*/
    public final static Class LocationType= View.Location.class;

    /** We support Strings as plugin parameters.*/
    public final static Class StringType= String.class;
    
    /** We support Integers as plugin parameters.*/
    public final static Class IntegerType= Integer.class;
    
    /** We support ViewContexts as plugin parameters. */
    public final static Class OMEContextType= ViewContext.class;
    
    private int cardinality;
    private String message;
    private Class type;
    
    // Constuctors    
    /** Creates a Plugin Parameter with cardinality CARDINALITY_ONE, of type 
      * String, and with no message.
      */
    public PluginParameter() {
	cardinality = CARDINALITY_ONE;
	message = null;
	try {
	    type = Class.forName("java.lang.String");
	} catch (Exception e) {
	    D.a(e);
	}
    }

    
    /** Creates a PluginParameter with the specified cardinality, type and
      * message
      * 
      * @param cardinality the number of pieces of information requested.
      * <I>Note:</I>  The current implementation of OME3 only supports
      * CARDINALITY_ONE.
      * @param message a helpful message that can be displayed for the user
      * to indicate what value is desired.
      * @param type the type of information requested.
      */
    public PluginParameter(int cardinality, String message, Class type) {
	this.cardinality = cardinality;
	this.message = message;
	this.type = type;
    }

	/**
	 * Set the cardinality. Use the static cardinality values listed above
	 * (CARDINALITY_ONE, CARDINALITY_ZERO_OR_MORE etc.) Do not specify 
	 * specific integer values like 7,8 etc.
	 * 
	 * <P><I>Note:</I>  The current implementation of OME3 only supports 
	 * CARDINALITY_ONE.
	 * 
	 * @param cardinality the number of pieces of information requested.
	 * 
	 * @uml.property name="cardinality"
	 */
	public void setCardinality(int cardinality) {
		this.cardinality = cardinality;
	}

	/**
	 * Returns the cardinality.
	 * 
	 * @uml.property name="cardinality"
	 */
	public int getCardinality() {
		return cardinality;
	}

	/**
	 * Sets a helpful message that can be displayed for the user
	 * to indicate what value is desired. 
	 * 
	 * @param message the message to be displayed.
	 * 
	 * @uml.property name="message"
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Returns said helpful message.
	 * 
	 * @uml.property name="message"
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the type of parameter expected.
	 * The list of parameter types support can be found in
	 * <code>AbstractPluginMethod</code>. Hopefully these types will be moved
	 * here eventually.
	 * 
	 * @see AbstractPluginMethod
	 * 
	 * @param type the type of information in this PluginParameter.
	 * 
	 * @uml.property name="type"
	 */
	public void setType(Class type) {
		this.type = type;
	}

	/**
	 * Returns the type of parameter expected.
	 * 
	 * @uml.property name="type"
	 */
	public Class getType() {
		return type;
	}

    
}
