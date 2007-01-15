package OME;
/* This is a plugin to be used with the "Example Framework" (example1.tel).
  * The example framework and this plugin are discuessed in the OME Power-user
  * Tutorial.
  *
  * This plugin demonstrates how we can use plugins to perform model analysis,
  * and provide "shortcuts" or "macros" to users.
  *
  * During this plugin, we are interested in a particular construct that can
  * occur in the model.  In particular, we are looking for objects of type
  * ChildA connected to objects of type ChildB via a "Connect" link, within
  * the bounds of an expandable element.
  *
  * We will create three methods for this plugin.  These three methods will
  * utilize the three different areas of the GUI, and demonstrate the intended
  * use for each area.
  *
  * Popup-Menu:  The popup-menu is "context sensitive".  We will create a method
  * on the Popup-Menu that will check one particular Expandable element, to
  * ensure that all ChildA elements within its bounds are connected to a
  * ChildB, and that all ChildB elements have a ChildA connecting to it.
  *
  * Menubar:  We will attach a method to the Menubar that performs an analysis
  * similar to the one above, except that this analysis is performed on ALL
  * expandable methods.
  *
  * Toolbar:  Since we are interested the particular formation of a ChildA
  * connected to a ChildB, we will create a method that creates this formation
  * all at once.
  *
  * We haven't attached any real semantic meaning to these contstructs or
  * analysis.  The intention is only to show the type of analysis that can be
  * accomplished.
  */

import java.awt.Image;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExamplePlugin implements OMEPlugin {
    // All plugins must implement OMEPlugin.

    OMEModel model;	// Each plugin is assoicated with one model.
 
    /* This routine determines whether this plugin will be loaded.  We only
     * want this plugin loaded when the user is using the "Example Framework".
     *
     * All plugins must provide this routine, with this EXACT signature.
     */
    static public boolean isCompatibleWith(OMEModel m) {
	return (m.getFramework().getType("Child A") != null);
//	return true;
	// What we have done here is used the OMEModel to get the
	// OMEFramework, and then used that to look for a type with the name
	// "Child A".
	//
	// At this point, making a decision based on the types in the
	// framework is all we can do.
    }

    /* The constructor.  Usually all you want to do is keep a reference to
     * your model. */
    public ExamplePlugin (OMEModel m) {
	model = m;
    }

    /* This is how we provide the tool with the methods that we want to be on
     * the Menubar. The methods themselves are defined later.  (You should
     * probably see how the methods are made first, then look here to see how
     * we pass them to the tool). */
    public Collection getMenubarMethods(View v) {

	MenuMethod ABoptions = new MenuMethod("AB Options");
	ABoptions.addItem(new Blah2(v));
	
	return Collections.singleton(ABoptions); 
    
    }

    /* This is how we provide the tool with the methods that we want to be on
     * the Toolbar. */
    public Collection getToolbarMethods(View v) {
	LinkedList ll = new LinkedList();  // This is our colleciton.
	ll.add(new ABMacroMethod(v));
	ll.add(new Blah(v));
	return ll;
	//return null;
    }
    
    /* This is how we provide the tool with the methods that we want to be on
     * the PopupMenu(for the right mouse button). */
    public Collection getPopupMethods(View v) {
	LinkedList ll = new LinkedList();  // This is our colleciton.
	ll.add(new ABMacroMethod(v));
	ll.add(new Blah(v));
	return ll;
    }


    // Methods
    //
    // Each method is a class that implements the PluginMethod interface.

    /* This method will provide the user with a "macro" for producing a
     * connected ChildA and ChildB all at once.  (We'll call this an "A-B
     * Formation").
     */
    private class ABMacroMethod implements PluginMethod {
	View view;			    // Remember our View
	View.Location where;		    // Where we will put the objects.

	/* Constructor.  Set up the internal state for a method that has not
	 * be activated in any way. */
	public ABMacroMethod(View v) {
	    view = v;
	    where = null;
	}

	/* The method needs a name that will identify it to the user. */
	public String getName() {
	    return "A-B Formation";
	}

	/* Methods may choose to have an image associated with them.
	 * Generally speaking, a method that is going to appear on the Toolbar
	 * (like this one) really SHOULD have an image. */
	public Image getImage() {
	    ImageIcon ic = new ImageIcon("images/link-el-link.gif");
	    return ic.getImage();
	    // Don't worry about scaling the image, the tool will do that for
	    // you.
	}

	/* This method wants one parameter, a location */
	public PluginParameter nextParameter() {
	    if (where==null) {
		// We haven't received the location yet.
		return new PluginParameter(PluginParameter.CARDINALITY_ONE,
			"Select where the A-B Formation should be", 
			PluginParameter.LocationType);
		// Above we have described the parameter we want using a
		// PluginParameter.  The first argument to the constructor
		// should always be PluginParamter.CARDINALITY_ONE (which
		// means only paramter will be collected), the next argument
		// is the instruction to be presented to the user, the third
		// is the type of the paramter we want.  Here we want a
		// location.
	    } else {
		// We already have the location, so we don't need any other
		// parameters.
		return null;
	    }
	}

	/* This method is how we get the paramter we asked for.  The parameter
	 * is passed in a Collection.  This is in anticipation of a time when
	 * you may be able to receive more than one parameter at a time. */
	public void passParameter(Collection c) {
	    Object o = c.iterator().next();
	    if (o == null) {
		// This should never happen.  We will use an assert from our
		// handy debugging class D.
		D.a("Received null parameter");
	    } else if (!(o instanceof View.Location)) {
		// We got the wrong type of parameter, again, this should
		// never happen.
		D.a("Received wrong parameter type.");
	    }
	    // It is safe to cast now.
	    where = (View.Location)o; 
	}

	/* If everything goes well, the method will be invoked after we have
	 * received our paramter.  Invoke is where the method does the task
	 * that it is meant to do.  Here, create the A-B Formation.*/
	public void invoke() {
	    ViewElement childA = null;
	    ViewElement childB = null;
	    ViewLink connect;
	    // The framework can be accessed via the view
	    OMEFramework fw = model.getFramework();	

	    // We need to know the types of the objects we are going to
	    // create.
	    Object childA_type = fw.getType("Child A");
	    Object childB_type = fw.getType("Child B");
	    Object connect_type = fw.getType("Connect");
	    
	    // Now we know where everything goes, we can make the objects.
	    // When adding or removing things from the model, we just need to
	    // add or remove them from the VIEW, and the view will make the
	    // appropriate changes to the model.
	    try {
		childA = view.createElement(childA_type, where);
		childB = view.createElement(childB_type, where);
	    } catch (Exception e) {
		// Sometimes element creation will fail.  Usually this happens
		// due to contraints of the framework.  For example, if the
		// user was using a mixed framework (two or more frameworks at
		// the same time), and tried to chose a location with in the
		// bounds of an expandable element that is strongly
		// contrained, this above operation would fail.

		// We will create a dialogue telling the user we failed.
		// This demonstrates that we can create arbitrarily complex
		// diaglogues to interact with the user.
		D.o("Semantic Error creating elements.");
		JOptionPane.showMessageDialog(null,
			"Unable to create " + fw.getName(childA_type) +
			" or " + fw.getName(childB_type) +
			" at this location.",
			"Semantic Error",
			JOptionPane.ERROR_MESSAGE);
	    }

	    // We have created the elements in the same place (this was
	    // imporant since we want both of them to be within the bounds of
	    // the same actor, if that where the user chose.  But we don't
	    // really want thme to sit right on top of the other (assuming our
	    // view is a graphical view), so we should move the ChildB 90
	    // pixels down.
//cai       view.promptRename(childA);
	    childB.move(0,90);

	    // If we get here, the elements were created, so we should create
	    // the link between them.
	    try {
		// Notice that the createLink method wans the MODEL objects
		// which are to be the source and the destination.
		connect = view.createLink(connect_type,
			childA.getModelObject(),
			childB.getModelObject());
	    } catch (Exception e) {
		// This really shoudn't happen, since we know the contraints
		// of the connect link type.
		D.a("Failed to create connect link in ExamplePlugin macro.");
	    }

	    // It is customary to prompt the user to change the name of
	    // elements when they are created.
	  //  view.promptRename(childB);
            view.promptRename(childA);
	    // Finally, we need to return the method to a "dormant" state.
	    // (see cancelled)
	    cancelled();
	}

	/* This method may be cancelled by the user or the tool prior to
	 * invoke.  If this happens, we should return the method to its
	 * original state (i.e. forget about any parameters we have
	 * collected). */
	public void cancelled() {
	    where = null;
	}

	/* Methods can be context sensitive, this one is not. */
	public boolean isEnabled(ViewContext vc) {
	    return true;
	}
	
	/* When you want to create a hierarchy (menu) of methods, you use a
	 * special method that makes use of the getSubmenu routines.  We're
	 * not doing that here. */
	public Collection getSubmenu(ViewContext vc) {
	    return null;
	}

	public Collection getSubmenu() {
	    return null;
	}
    }


    // Analysis Methods
    //
    // The analysis that this plugin will do is to check that all ChildA
    // elements are connected to a ChildB element, and vice-versa (this check
    // will only be made within the bounds of Exandable elements).  For ease,
    // we call this property "well-formed".
    //
    // We will have two methods that do this check, one which checks for one
    // Expandable element, and one that does this check for ALL Expnadable
    // elements.
    
    /* This routine performs the analysis described above for a given
     * Expandable element.  The routine returns true if the element is
     * "well-formed", false otherwise. */
    private boolean isWellFormed(ModelElement e) {
	// If the element is not of type Expandable, we will say it is trivially
	// well-fromed.
	if (!model.getFramework().getName(e.getType()).equals("Expandable")) {
	    D.o("trivial");
	    return false;
	} // else

	// Get a list of the elements within the bounds of this (expandable)
	// element.
	Iterator i = e.getChildren().iterator();
	if (!i.hasNext()) 
	    return false;
        // For each child, if it is a ChildA make sure that it is connected to
	// a ChildB, if it is a ChildB, make sure there is a ChildA connected
	// to it.
	Object atype = model.getFramework().getType("Child A");
	Object btype = model.getFramework().getType("Child B");
	Object connecttype = model.getFramework().getType("Connect");
	
	
nextchild : while (i.hasNext()) {
	    ModelElement curr = (ModelElement)i.next();
	    if (curr.getType().equals(atype)) {
		// Make sure that there is an out going link connected to an
		// object of type b.
		Iterator links = curr.getLinks().iterator();
		while (links.hasNext()) {
		    ModelLink currlink = (ModelLink)links.next();
		    if (currlink.getType().equals(connecttype)) {
			// We are only interested in outbound links.  It
			// suffices to only check the destination of the link,
			// since if curr is the destination, it will fail
			// anyway.
			//
			// Operations on ModelObjects return other 
			// ModelObjects, (same with ViewObjects), so the case
			// below is safe.
			ModelObject dest = (ModelObject)currlink.getTo();
			
			if (dest.getType().equals(btype)) {
			    // Then this ChildA (curr) is connected to a
			    // ChildB.
			    continue nextchild;
			}
		    }
		}
		// If we get here, than we didn't find a ChildB that this
		// ChildA was attached to.  That means that element in
		// question is not "well-formed".
		return false;
	    } else if (curr.getType().equals(btype)) {
		// Pretty much the dual of the code above.
		Iterator links = curr.getLinks().iterator();
		while (links.hasNext()) {
		    ModelLink currlink = (ModelLink)links.next();
		    if (currlink.getType().equals(connecttype)) {
			ModelObject source = (ModelObject)currlink.getFrom();
			if (source.getType().equals(atype)) {
			    // Then this ChildB (curr) has a ChildA connecting
			    // to it.
			    continue nextchild;
			}
		    }
		}
		// If we get here, than we didn't find a ChildA connecting to
		// this ChildB. That means the element in question is not
		// "well-formed".
		return false;
	    }
	}
	// If we haven't found any evidence.getType()).equals("Expandable")e that it is NOT well-formed, then
	// it IS well-formed.
	return true;
    }
    
    //Blah works in a context sensitive way. It make judgement whether
    //the selected element is well-formed, if yes, get the element highlighted
    
        
    private class Blah extends ObjectMethod {
	public Blah(View v) {
	    super(v);
	    name = "Blah";
	    instruction = "check if selected Expandable object well-formed,Highlight if true ";
	}

	protected void operate(ViewObject vo) {
	    D.o("isWF: "+isWellFormed((ModelElement)vo.getModelObject()));
	    if(isWellFormed((ModelElement)vo.getModelObject()))
	       vo.setHighlighted(true);
            else vo.setHighlighted(false);//cai 12.12.2000
    	}

	protected boolean isSuitable(ViewObject vo) {
	    return true;
	}

    }

    //Blah2 works in a global way, if check all the elements in the model
    // and hightlight all the well-formed elements.
    
    private class Blah2 extends AbstractPluginMethod  {
	View view;			    // Remember our View

	/* Constructor.  Set up the internal state for a method that has not
	 * be activated in any way. */
	public Blah2(View v) {
        view = v;
 //    instruction = "check if all Expandable object well-formed,Highlight if true ";
	}

        public String getName(){
        return "Check Well-formedness of all Elements";
	}

	public Image getImage(){
	    return null;
	}
	
	public void invoke(){
	    Iterator i = view.getAllElements().iterator();
	    while (i.hasNext()) {
		ViewObject curr = (ViewObject)i.next();
		if(isWellFormed((ModelElement)curr.getModelObject())){
		    D.o("isWF: "+isWellFormed((ModelElement)curr.getModelObject()));
		    curr.setHighlighted(true);
		}
                else curr.setHighlighted(false);//cai 12.12.2000
	    }
	}
    }
 }

// The difference between Blah and Blah2 is:
// Blah takes effect on an model object, so it extends ObjectMethod;
// Blah2 need no parameter, it takes effect on all elements of an model, 
// so it extends AbstractPluginMethos.
