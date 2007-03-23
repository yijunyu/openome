package edu.toronto.cs.ome.plugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import edu.toronto.cs.ome.controller.OMEPlugin;
import edu.toronto.cs.ome.controller.ObjectMethod;
import edu.toronto.cs.ome.model.ModelValueAttribute;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewObject;

/**
 * The E-R Plugin.  Developed along with the "OME3 Power-User Manual"
 */


public class ERPlugin implements OMEPlugin {

	/**
	 * 
	 * @uml.property name="model"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	OMEModel model;

    
    public ERPlugin(OMEModel m) {
	model = m;
    }

    /** Tests for presence of basic ER type.*/
    static public boolean isCompatibleWith(OMEModel model) {
	return (model.getFramework().getType("Entity") != null);
    }
    
    /** Returns a collection  of our <code>Method</code>s that are to be
     *  placed on the OME toolbar. */
    public Collection getToolbarMethods(View view) {

	Collection c = new Vector();
	
	// A way to introduce new entities to the model.
//	Object entity_type = model.getFramework().getType("Entity");
//	PluginMethod entity_method = new CreateElementMethod(entity_type,
//		"Entity", view);
	
	/*Object rel_type = model.getFramework().getType("Relationship");
	PluginMethod rel_method = new CreateElementMethod(rel_type,
		"Relationship", view);
	*/
//	Object att_type = model.getFramework().getType("Attribute");
//	PluginMethod att_method = new CreateElementMethod(att_type,
//		"Attribute", view);
	
	
	return c;
    }

    /** Returns a collection  of our <code>Method</code>s that are to be
     *  placed on the OME menubar. 
     */
    public Collection getMenubarMethods (View v) {
	return null;
    }

    /** Returns a collection  of our <code>Method</code>s that are to be
     *  placed in the OME popup-menu (when the user clicks the right mouse
     *  button). 
     */
    public Collection getPopupMethods(View view) {
    	Vector ll = new Vector();
	ll.add(new showAttributeMethod(view));
	return ll;
    }

    private class showAttributeMethod extends ObjectMethod {

	public showAttributeMethod(View v) {
	    super(v);
	    name = "Show Attribute";
	    instruction = "Porperties of object";
	}

	protected boolean isSuitable(ViewObject vo) {
	    return true;
	}

	protected void operate(ViewObject vo) {
	    Object[][] data =
	    {   
		{"", ""},
		{"", ""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""}
	    };
	    
	    int i=0;
	    
	    Iterator mvas =  
		vo.getModelObject().getValueAttributes();
	    
	    while (mvas.hasNext()) {
		ModelValueAttribute oa = (ModelValueAttribute)mvas.next();
		if ((oa!=null)&& ((oa.getLabel()!=null)||(oa.getValue()!=null))) {
		    data[i][0] = oa.getLabel();
		    //D.o("label is " + data[i][0]);
		    data[i][1] = oa.getValue();
		    //D.o("value is " + data[i][1]);
		    i++;
		}
	    }
	    
	    String objectname = vo.getName();
	    AttributeDialog attributeDialog =
		new AttributeDialog(objectname, data, vo);
	    view.showDialog(attributeDialog);
	}
    }
	public void setView(View view) {
		model = view.getModel();
	}
}
