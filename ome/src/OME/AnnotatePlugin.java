package OME;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

/** The Annotate plugin.  Basically all we do is provide access to the
 *  annotation objects.
 *
 *  A nice idea might be hide/unhide all annotation objects method
 */

public class AnnotatePlugin implements OMEPlugin {

    OMEModel model;
    
    public AnnotatePlugin(OMEModel m) {
	model =m;
    }

    public Collection getMethods(View v) {
	return null;
    }

    /** Tests for presence of basic annotate type */
    static public boolean isCompatibleWith(OMEModel model) {
	return (model.getFramework().getType("Annotation") != null);
    }

    public Collection getToolbarMethods(View view) {
	Vector v = new Vector(1);

	MenuMethod am = new MenuMethod("Create Annotation");
	am.setSubmenu(getAnnotationCreationMethods(view));

	v.add(am);
	return v;
    }

    public Collection getMenubarMethods (View view) {
	return null;
    }

    public Collection getPopupMethods(View view) {
	LinkedList ll = new LinkedList();
	
	MenuMethod am = new MenuMethod("Create Annotation");
	am.setSubmenu(getAnnotationCreationMethods(view));
	ll.add(new PopupMenuSeparatorMethod(view));
	ll.add(am);

	return ll;
    }


    private Collection getAnnotationCreationMethods(View view) {
	Vector v = new Vector(2);
	String aname = "Annotation";
	String alname = "Annotates";
	Object atype = model.getFramework().getType(aname);
	Object altype = model.getFramework().getType(alname);

	v.add(new CreateElementMethod(atype,aname,view));
	v.add(new CreateLinkMethod(altype,alname,view));
	return v;
    }
}
