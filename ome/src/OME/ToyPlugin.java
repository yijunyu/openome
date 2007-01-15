package OME;
/** This is a toy example of plugin for learning purposes. */

import java.awt.Image;
import java.util.Collection;
import java.util.LinkedList;

public class ToyPlugin implements OMEPlugin {

    OMEModel model;

    LinkedList popupmethods;

    public ToyPlugin(OMEModel model) {
	this.model = model;
	popupmethods = new LinkedList();
	popupmethods.add(new ToyMethod());
    }

    public static boolean isCompatibleWith(OMEModel model) {
	return true;
    }
 
    public Collection getMethods(View v) {
	return null;
    }

    public Collection getToolbarMethods(View v) {
	return null;
    }

    public Collection getMenubarMethods(View v) {
	return null;
    }

    public Collection getPopupMethods(View v) {
	return popupmethods;
    }

    //
    // Methods for this Plugin
    //
    
    private class ToyMethod implements PluginMethod {
	
	public void invoke() {
	    D.o("Hello World, I'm the ToyPlugin's first method!");
	}

	public String getName() {
	    return "Toy Method";
	}

	public Image getImage() {
	    return null;
	}

	public Collection getSubmenu(ViewContext ovc) {
	    return null;
	}

	public Collection getSubmenu() {
	    return null;
	}

	public PluginParameter nextParameter() {
	    return null;
	}

	public void passParameter(Collection param) {
	}

	public void cancelled() {
	}

	public boolean isEnabled(ViewContext con) {
	    ViewObject vo = con.associatedObject();

	    if (vo instanceof ViewLink) {
		return true;
	    }
	    
	    return false;
	}
	
    }
    
}
