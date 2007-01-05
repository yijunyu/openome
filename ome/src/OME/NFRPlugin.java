package OME;


import java.awt.Image;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.ImageIcon;

// old comment
/** The NFR plugin.  The plugin will eventually perform some analyses, but at
 *  the moment allows for hiding all objects below a certain node in the goal
 *  tree.
 */
 
// new comment 
/** This class serves as a plugin that adds all the functionality needed
  * for the IStar framework. It currently contains methods for creating 
  * IStar elements and links. It is hoped that in the future, this plugin
  * will contain the code for performing IStar analyses.
  */
public class NFRPlugin implements OMEPlugin {
    
    // We use these to determine what types of elements and links to provide
    // creation methods for.  It would be nice to be able to simply ask the
    // framework for all elements from the framework called NFR.  Maybe one
    // day this will be accomplished.
    static String[] contributionlinknames =
			{"NFR Break", "NFR Make", "NFR Or", "NFR And", 
			    "NFR Equal", "NFR Hurt", "NFR Help", 
			    "NFR Unknown", "NFR Some +", "NFR Some -"};
    static String[] correlationlinknames =
			{"NFR Break Correlation", "NFR Make Correlation",
			    "NFR Hurt Correlation",
			    "NFR Help Correlation", "NFR Unknown Correlation", 
			    "NFR Some + Correlation", "NFR Some - Correlation"};

    static String[] nfrelementnames =
			{"NFRSoftgoal", "Operationalization", "Claim"};

    private OMEModel model;
    private boolean autopropogate = true; 	
    private static String IMAGE_DIR = "images";
    
    /** Creates a NFRPlugin for the specified model. 
      *
      * @param m the model for which the NFRPlugin is constructed for.
      */
    public NFRPlugin(OMEModel m) {
	model = m;
    }
    
    /** Returns a collection of NFR specific <code>Method</code>s that 
      * are to be placed on the OME toolbar. 
      */
    public Collection getToolbarMethods(View view) {
	Vector v = new Vector();	

	MenuMethod em = new MenuMethod("Create NFR Element");
	em.setSubmenu(getElementMethods(view));
	v.add(em);
	
	MenuMethod mm = new MenuMethod("Create NFR Link");
	mm.addItem(new CreateLinkGroupMethod(view, "Contribution Link", 
		    contributionlinknames, false));
	mm.addItem(new CreateLinkGroupMethod(view, "Correlation Link", 
		    correlationlinknames, true));
	v.add(mm);
	return v;
    }
    
    /** Returns a collection of NFR specific <code>Method</code>s that 
      * are to be placed on the OME menubar. 
      */    
    public Collection getMenubarMethods(View v) {
	MenuMethod nfroptions = new MenuMethod("NFR Options");
	nfroptions.addItem(new TogglePropMethod());
	
	return Collections.singleton(nfroptions);
    }

   /** Returns a collection of NFR specific <code>Method</code>s that 
      * are to be placed in the OME popup-menu (when the user clicks the 
      * right mouse button). 
      */
    public Collection getPopupMethods(View v) {
	LinkedList ll = new LinkedList();
	
	ll.add(new PopupMenuSeparatorMethod(v));		
	ll.add(new HideSubtree(v));
	ll.add(new HideAllButSubtree(v));
	
	ll.add(new PopupMenuSeparatorMethod(v));		
	ll.add(new SetLabelSubmenu(v));
	ll.add(new TogglePriority(v));
	ll.add(new SetDeniedMethod(v));
	
	ll.add(new PopupMenuSeparatorMethod(v));		
	MenuMethod els = new MenuMethod("Create NFR Element");
	els.setSubmenu(getElementMethods(v));
	ll.add(els);
	
	MenuMethod nfrlinks = new MenuMethod("Create NFR Link");
	nfrlinks.addItem(new CreateLinkGroupMethod(v, "Contribution Link", 
		    contributionlinknames, false));
	nfrlinks.addItem(new CreateLinkGroupMethod(v, "Correlation Link", 
		    correlationlinknames, true));
	ll.add(nfrlinks);
	return ll;
    }

    /** Tests if the specified model supports the NFR framework. 
      *
      * @param model the model which we check if it supports the 
      * NFR framework.
      */
    static public boolean isCompatibleWith(OMEModel model) {
	return (model.getFramework().getType("Operationalization") != null);
    }

    
    /** Return a collection of element creation methods for the NFR element
      * types. */
    private Collection getElementMethods(View view) {
	Vector elementmethods = new Vector(nfrelementnames.length);
	for (int i=0; i<nfrelementnames.length; i++) {
	    Object type = model.getFramework().getType(nfrelementnames[i]);
	    PluginMethod method = new
		CreateElementMethod(type,nfrelementnames[i],view);
	    elementmethods.add(method);
	}
	return elementmethods;
    }
   

    private void setShouldAutoPropogate(boolean b) {
	autopropogate = b;
    }

    private boolean shouldAutoPropogate() {
	return autopropogate;
    }

    //////////////////////////////////////////////////////////
    //
    // Plugin Methods
    //
    //////////////////////////////////////////////////////////

    /** This method prompts the user to select the type of link to create
     *  after being prompted for the source and destination fields.
     *  The choice made available to the user is based on the strings found in
     *  an array of Strings passed in at construction time.  Each string in
     *  the array should correspond to a valid link type in the framework.
     */
    private class CreateLinkGroupMethod extends CreateLinkMethod {

	String[] typenames;

	public CreateLinkGroupMethod (View v, String groupname, 
		String[] typenames, boolean dashed) {

	    super(v);

	    typename = groupname;
	    this.typenames = typenames;
	    
	    // We need some type to use for our picture.
	    Object picturetype =
		model.getFramework().getType(typenames[0]);

	    Image im = view.getImage(picturetype);
	    if (dashed) {
		image = view.getImageTable().drawDashedHLine(im);
	    } else {
		image = view.getImageTable().drawHLine(im);
	    }
	}

	// Everything is the same, except that invoke time we want to figure
	// out the type.
	public void invoke() {
	    // Create the choices
	    Vector v = new Vector(typenames.length);
	    for (int i=0; i<typenames.length; i++) {
		Choice c = new Choice();
		String name = typenames[i];
		c.setName(name);
		c.setChoiceObject(model.getFramework().getType(name));
		v.add(c);
	    }
	    // Show the dialogue to get the type.
	    RadioButtonChooser rbc = new RadioButtonChooser(null,
		    "Select " +typename+ " Type", true, v);
	    if (rbc.showDialog() == RadioButtonChooser.CONTINUE) {
		// set type
		Iterator i = v.iterator();
		while (i.hasNext()) {
		    Choice c = (Choice)i.next();
		    if (c.chosen()) {
			type = c.choiceObject();
		    }
		}
		// and go
		if (type != null) {
		    String strokename =
			model.getFramework().getStrokeString(type);
		    super.invoke();
		}
	    } else {
		// Users wants to bail out.
		// Do nothing.
	    }
	    resetMethod();
	}

	/** Set the type back to null, and do the rest of the method clean-up,
	 *  as required by our super-class. */
	protected void resetMethod() {
	    type = null;
	    super.resetMethod();
	}
    
    }
    
    /** Toggles the Auto-propogation property. */
    private class TogglePropMethod extends AbstractPluginMethod{
    
	private Image isonimage;

	public TogglePropMethod() {
	    // Get our little checkmark image
	    ImageIcon ii = new ImageIcon(IMAGE_DIR+File.separatorChar+
		    "check.gif");
	    
	    isonimage = ii.getImage();
	}
	
	public String getName() {
	    return "Auto-Propogation";
	}

	public Image getImage() {
	    if (shouldAutoPropogate()) {
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke() {
	    // toggle the Autopropogate
	    setShouldAutoPropogate(!shouldAutoPropogate());
	}
    }

     

    /** Toggles the priority label of the softgoal. */
    private class TogglePriority extends AbstractPluginMethod {
	private View view;
	private ViewObject vo = null;

	public TogglePriority(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Toggle Priority";
	}

	/*
	public Image getImage() {
	    if (isPriority(vo)) {
		return model.getFramework.;
	    } else {
		return null;
	    }
	}*/

	public boolean isEnabled(ViewContext con) {
	    vo = con.associatedObject();
	    if (vo != null) {
		if (vo.getModelObject().getAttribute("priority")!=null) { 
		    return true;
		}
	    }
	    return false;
	}

	public void invoke() { 
	    if (vo != null) {
		ModelAttribute ma=vo.getModelObject().getAttribute("priority"); 
		if (ma != null) { 
		    Object target = ma.getTarget();
		    if (target == null) {
			Iterator i = ma.getPossibleTargets();
			// There is only one possible target.
			ma.setTarget(i.next());
		    } else {
			ma.clearTarget();
		    }
		}
	    }
	}
    }

    /** Sets an NFR contribution link as denied */
    private class SetDeniedMethod extends ObjectMethod {
	private Object target;
	
	public SetDeniedMethod(View v) {
	    super(v);
	    name = "Deny Contribution";
	    instruction = 
		"Select the contribution link that is being denied.";
	}

	protected boolean isSuitable(ViewObject vo) {
	    // Is it a contribution link?
	    if (!(vo instanceof ViewLink)) {
		return false;
	    } // else
	    ViewLink vl = (ViewLink)vo;
	    Object type = vl.getModelObject().getType();
	    //OMEFramework fw = view.getFramework();
	    String typename = view.getModel().getFramework().getName(type);
	    for(int i=0; i < contributionlinknames.length; i++) {
		if (typename.equals(contributionlinknames[i])) {
		    return true;
		}
	    }
	    return false;
	}

	protected void operate(ViewObject vo) {
	    ModelAttribute ma = vo.getModelObject().getAttribute("label");
	    Iterator i = ma.getPossibleTargets();
	    // There is only one possible target.
	    ma.setTarget(i.next());
	}
    }

    /** Displays a submenu of the possible labels for the softgoal.  */
    private class SetLabelSubmenu extends AbstractPluginMethod {
	private View view;
	//private ViewElement ve = null;

	public SetLabelSubmenu(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Set Label";
	}

	public boolean isEnabled(ViewContext con) {
	    ViewObject vo = con.associatedObject();
	    if (vo != null) {
		if (vo instanceof ViewElement) {
		    
		    if (vo.getModelObject().getAttribute("label") != null) {
			return true;
		    }
		}
	    }
	    return false;
	}

	public Collection getSubmenu(ViewContext ovc) {
	    ViewObject vo = ovc.associatedObject();
	    if (vo != null) {
		ModelObject mo = vo.getModelObject();

		LinkedList list = new LinkedList();
		ModelAttribute att = mo.getAttribute("label");
		D.o("label attribute is " + att);
		if (att != null) {
		    Iterator i = att.getPossibleTargets();
		    while (i.hasNext() ) {
			list.add(new SetLabel(view,vo,att,i.next()));
		    }
		}
		return list;
		
	    }
	    return null;
	}
    }

    /** Sets the Label of the Softgoal. We will generalize this as soon as we
     * have another example of the need. Perhaps I* dependencies will need
     * attributes.
     */
    private class SetLabel extends AbstractPluginMethod {
	private View view;
	private ViewObject vo;
	private PluginParameter nextp;
	private ModelAttribute att;
	private Object target;
	
	public SetLabel(View view, ViewObject vo, ModelAttribute att,
		Object target) {
	    this.view = view;	    
	    this.vo = vo;
	    this.att = att;
	    this.target = target;
	}

	public void invoke() {
	    // set the label.
	    att.setTarget(target);

	    // and initiate the analysis if autopropogate is switched on.
	    if (shouldAutoPropogate()) {
		NFRPropogator p = new NFRPropogator(vo.getModelObject(),view);
		p.evaluate();
	    }
	}
	
	public String getName() {
	    return model.getFramework().getName(target);
	}

	public Image getImage() {
	    return model.getFramework().getImage(target);
	}	
    }

    /** This method gets a ViewOjbect and hides all ViewObjects below it in
     *  the tree (and itself).  It assumed that all links go from
     *  lower object to higher objects.
     *	Currently we only perform this method on objects sepecified by the
     *	associatedObject() method of the ViewContext present at initiation
     *	time.
     */
    private class HideSubtree extends AbstractPluginMethod {
    
	private View view;
	private ViewObject vo = null;
	private PluginParameter nextp;
	
	public HideSubtree(View v) {
	    view = v;
	    nextp = contextParameter();
	}

	
	public String getName() {
	    return "Hide subtree";
	}

	public PluginParameter nextParameter() {
	    return nextp;
	}

	public void passParameter(Collection c) {
	    Iterator i = c.iterator();
	    ViewContext con = (ViewContext)i.next();
	    vo = con.associatedObject();
	    nextp = null;
	}

	public void invoke() {
	    if (!vo.isHidden()) {
		hideSubtree(vo);
	    }
	}

	public boolean isEnabled(ViewContext con) {
	    return con.associatedObject() != null;
	}

	public void cancelled() {
	    resetMethod();
	}

	/* This is where the work gets done.  Recursively walks subtree hiding
	 * all objects it finds.  If it finds an object already hidden, it
	 * stops the recursion (this is to safeguard against cycles, but may
	 * cause some unexpected behaviour). */
	private void hideSubtree(ViewObject vo) {
	    vo.setHidden(true);
	    D.o("Hiding subtree rooted at: "+ vo.getName() + vo.isHidden());
	    Iterator i = getIncomingLinks(vo);
	    while (i.hasNext()) {
		    // Recursively hide this link and its source.
		ViewLink vl = (ViewLink)i.next();
		ViewObject source = (ViewObject)vl.getFrom();
		if (!vl.isHidden()) {
		    hideSubtree(vl);
		}
		if (!source.isHidden()) {
		    hideSubtree(source);
		}
		//vl.setHidden(true);
		//source.setHidden(true);
	    }
	}

	/** Returns an iterator of all links whose destination is the given
	 *  ViewObject. */
	private Iterator getIncomingLinks(ViewObject vo) {
	    LinkedList ll = new LinkedList();

	    Iterator i = vo.getLinks().iterator();
	    while (i.hasNext()) {
		ViewLink vl = (ViewLink)i.next();
		if ((ViewObject)vl.getTo() == vo) {
		    ll.add(vl);
		}
	    }
	    return ll.iterator();
	}
	
	private void resetMethod() {
	    vo = null;
	    nextp = contextParameter();
	}
	
	private PluginParameter contextParameter() {
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE, "", 
		    PluginParameter.OMEContextType);
	}
	
    }

    /** This method does the opposite of hiding the subtree.  It hides
     *  everything BUT the subtree.
     */
    private class HideAllButSubtree extends AbstractPluginMethod {
    
	private View view;
	private ViewObject vo = null;
	private PluginParameter nextp;
	
	public HideAllButSubtree(View v) {
	    view = v;
	    nextp = contextParameter();
	}

	
	public String getName() {
	    return "Only show subtree";
	}

	public PluginParameter nextParameter() {
	    return nextp;
	}

	public void passParameter(Collection c) {
	    Iterator i = c.iterator();
	    ViewContext con = (ViewContext)i.next();
	    vo = con.associatedObject();
	    nextp = null;
	}

	public void invoke() {
	    // First we hide everything, and then unhide the subtree.
	    Iterator i;
	    i = view.getAllElements().iterator();
	    while (i.hasNext()) {
		((ViewObject)i.next()).setHidden(true);
	    }
	    i = view.getAllLinks().iterator();
	    while (i.hasNext()) {
		((ViewObject)i.next()).setHidden(true);
	    }
	    unhideSubtree(vo);
	}

	public boolean isEnabled(ViewContext con) {
	    return con.associatedObject() != null;
	}

	public void cancelled() {
	    resetMethod();
	}

	/* This is where the work gets done.  Recursively walks subtree hiding
	 * all objects it finds.  If it finds an object already hidden, it
	 * stops the recursion (this is to safeguard against cycles, but may
	 * cause some unexpected behaviour). */
	private void unhideSubtree(ViewObject vo) {
	    D.o("Only showing subtree rooted at: "+ vo.getName());
	    if (vo.isHidden()) {
		Iterator i = getIncomingLinks(vo);
		while (i.hasNext()) {
		    // Recursively hide this link and its source.
		    ViewLink vl = (ViewLink)i.next();
		    ViewObject source = (ViewObject)vl.getFrom();
		    unhideSubtree(vl);
		    unhideSubtree(source);
		    //vl.setHidden(true);
		    //source.setHidden(true);
		}
		vo.setHidden(false);
	    }
	}

	/** Returns an iterator of all links whose destination is the given
	 *  ViewObject. */
	private Iterator getIncomingLinks(ViewObject vo) {
	    LinkedList ll = new LinkedList();

	    Iterator i = vo.getLinks().iterator();
	    while (i.hasNext()) {
		ViewLink vl = (ViewLink)i.next();
		if ((ViewObject)vl.getTo() == vo) {
		    ll.add(vl);
		}
	    }
	    return ll.iterator();
	}
	
	private void resetMethod() {
	    vo = null;
	    nextp = contextParameter();
	}
	
	private PluginParameter contextParameter() {
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE, "", 
		    PluginParameter.OMEContextType);
	}
	
    }
}
