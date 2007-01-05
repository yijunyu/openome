package edu.toronto.cs.ome.plugins;
import java.awt.Image;
import java.awt.Point;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ImageIcon;

import edu.toronto.cs.ome.controller.AbstractPluginMethod;
import edu.toronto.cs.ome.controller.Choice;
import edu.toronto.cs.ome.controller.CreateElementMethod;
import edu.toronto.cs.ome.controller.CreateLinkMethod;
import edu.toronto.cs.ome.controller.MenuMethod;
import edu.toronto.cs.ome.controller.OMEPlugin;
import edu.toronto.cs.ome.controller.PluginMethod;
import edu.toronto.cs.ome.controller.PluginParameter;
import edu.toronto.cs.ome.controller.PopupMenuSeparatorMethod;
import edu.toronto.cs.ome.controller.RadioButtonChooser;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewElement;
import edu.toronto.cs.ome.view.ViewObject;
import edu.toronto.cs.util.D;

/**
 * The IStar plugin.  This plugin will perform IStar analyses, and add *  modelling shortcuts to the toolbar.
 */


public class IStarPlugin implements OMEPlugin {

    // the names of the I-Star links
    static String[] linknames = {
      "i* Dependency link", 
      "i* Decomposition link", 
	  "i* Means-ends link",
	  /*
      "i* Prior-to", 
	  "i* T_OR", 
	  "i* T_And", 
	  "i* Failure", 
	  "i* Shared"
	  */
    };	

    static String[] elementnames = {
      "i* Actor", "i* Agent", "i* Role", "i* Position", "i* Aspect",
      "i* Resource", "i* Task", "i* Goal", "i* Softgoal", "i* Claim",
      //"i* use-case-starting-point", "i* use-case-ending-point"
    };
    static String[] contributionlinknames = {"i* Make", "i* Break",
    	"i* Help", "i* Hurt", "i* Some +", "i* Some -", "i* Unknown"};
    static String[] actorRelationNames = {	  
      "i* ISA",
	  "i* INS",
	  "i* Plays",
	  "i* Occupies", 
	  "i* Covers", 
      "i* Is-Part-of",
    };
	/**
	 * 
	 * @uml.property name="model"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	OMEModel model;
//	private boolean parameterize_value_attributes = false;
//	private boolean parameterize_non_intentionals = false;
    private boolean doallplausibleanalysis = true;
    private boolean dodependencyanalysis = false;
    private boolean dorationaleanalysis = false;    
    public IStarPlugin(OMEModel m) {
	model = m;
    }

    /** Tests for presence of basic IStar type.*/
    static public boolean isCompatibleWith(OMEModel model) {
	return (model.getFramework().getType("i* Position") != null);
    }
    
    /** Returns a collection  of our <code>Method</code>s that are to be
     *  placed on the OME toolbar. */
    public Collection getToolbarMethods(View view) {

		Vector v = new Vector();
		
		// Need to be able to create i* links and elements.
		MenuMethod em = new MenuMethod("Create Istar Element");
		em.setSubmenu(getElementMethods(view));
		v.add(em);
		
		MenuMethod lm = new MenuMethod("Create Istar Link");
		lm.setSubmenu(getLinkMethods(view));
		v.add(lm);
		
		MenuMethod mm=new MenuMethod("Create Istar Constribution Link");
		mm.addItem(new CreateLinkGroupMethod(view, "Contribution Link",
				contributionlinknames, false));
		mm.addItem(new CreateLinkGroupMethod(view, "Actor Relation Link",
				actorRelationNames, false));
		v.add(mm);
		// We need to find the dependency link type, and the resource type.
		Object dltype = model.getFramework().getType("Dependency link");
		Object rtype = model.getFramework().getType("Resource");
		Object pltype = model.getFramework().getType("Prior-to");
		Object stype = model.getFramework().getType("use-case-starting-point");
		Object etype = model.getFramework().getType("use-case-ending-point");
		
		// Now we can create the Resource-dependency shortcut.
		if (rtype!=null && dltype!=null) {
			PluginMethod m = new CreateDependency(view, rtype, dltype);
			PluginMethod m1 = new CreateUseCasePath(view, stype, etype, pltype);
			MenuMethod dm = new MenuMethod("Create Dependency Link");
			dm.addItem(m);
			dm.addItem(m1);
			v.add(dm);
		}
		return v;
    }

    /** Returns a collection  of our <code>Method</code>s that are to be
     *  placed on the OME menubar. 
     */
    public Collection getMenubarMethods (View v) {
	MenuMethod istaroptions = new MenuMethod("I* Options");
	istaroptions.addItem(new allPlausibleAnalysis());
	istaroptions.addItem(new dependencyAnalysis());
	istaroptions.addItem(new rationaleAnalysis());
	//istaroptions.addItem(new parameterize_value_attributes(v));
	//istaroptions.addItem(new parameterize_non_intentionals(v));

	return Collections.singleton(istaroptions);
    }

    /** Returns a collection  of our <code>Method</code>s that are to be
     *  placed in the OME popup-menu (when the user clicks the right mouse
     *  button). 
     */
    public Collection getPopupMethods(View view) {
//	D.o("Getting i* popup methods");
	Vector ll = new Vector();
	ll.add(new PopupMenuSeparatorMethod(view));
	MenuMethod em = new MenuMethod("Create Istar Element");
	em.setSubmenu(getElementMethods(view));
	ll.add(em);
	MenuMethod lm = new MenuMethod("Create Istar Link");
	lm.setSubmenu(getLinkMethods(view));
	ll.add(lm);
	MenuMethod nfrlinks = new MenuMethod("Create Istar Contribution Link");
	nfrlinks.addItem(new CreateLinkGroupMethod(view, "Contribution Link",
			contributionlinknames, false));
	ll.add(nfrlinks);
	//ll.add(new showAttributeMethod(view));
	//ll.add(new parameterizeValueMethod(view));
	//ll.add(new parameterizeNonIntentionalMethod(view));
	return ll;
    }


    /** Return a collection of element creation methods for the i* element
      * types. */
    private Collection getElementMethods(View view) {
	Vector elementmethods = new Vector(elementnames.length);
	for (int i=0; i<elementnames.length; i++) {
	    Object type = model.getFramework().getType(elementnames[i]);
	    PluginMethod method = new
		CreateElementMethod(type,elementnames[i],view);
	    elementmethods.add(method);
	}
	return elementmethods;
    }
    
    /** Return a collection of link creation methods for the i* link types. */
    private Collection getLinkMethods(View view) {
	Vector linkmethods = new Vector(linknames.length);
	for (int i=0; i<linknames.length; i++) {
	    Object type = model.getFramework().getType(linknames[i]);
	    if (type == null) {
	    	D.o("warning: " + linknames[i] + " is not found.");
	    	D.o("Please check your metamodel to see if there is an undefined class?");
	    } else {
		    D.a(type);
		    PluginMethod method = new
			CreateLinkMethod(type,linknames[i],view);
		    linkmethods.add(method);
	    }
	}
	return linkmethods;
    }

    private void setDoAllPlausibleAnalysis(boolean b){
	doallplausibleanalysis = b;
    }

    private boolean shouldDoAllPlausibleAnalysis(){
	return doallplausibleanalysis;
    }
    private void setDoDependencyAnalysis(boolean b){
	dodependencyanalysis = b;
    }

    private boolean shouldDoDependencyAnalysis(){
	return dodependencyanalysis;
    }

    private void setDoRationaleAnalysis(boolean b){
	dorationaleanalysis = b;
    }
    
    private boolean shouldDoRationaleAnalysis(){
	return dorationaleanalysis;
    }

	private class allPlausibleAnalysis extends AbstractPluginMethod{

	private Image isonimage;

	public allPlausibleAnalysis(){
		ImageIcon ii = new ImageIcon(this.getClass().getResource("/resources/Check.gif"));
	    isonimage = ii.getImage();
	}

	public String getName(){
	    return "Auto do All Plausible Analysis";
	}

	public Image getImage(){
	    if (shouldDoAllPlausibleAnalysis()){
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke(){
	    setDoAllPlausibleAnalysis(!shouldDoAllPlausibleAnalysis());
	    if (shouldDoAllPlausibleAnalysis()){
	    setDoDependencyAnalysis(false);
	    setDoRationaleAnalysis(false);
	    }
	}
    }
 
    private class dependencyAnalysis extends AbstractPluginMethod{

	private Image isonimage;

	public dependencyAnalysis(){
		ImageIcon ii = new ImageIcon(this.getClass().getResource("/resources/Check.gif"));
	    isonimage = ii.getImage();
	}

	public String getName(){
	    return "Inter-agent Dependency Analysis";
	}

	public Image getImage(){
	    if (shouldDoDependencyAnalysis()){
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke(){
	    setDoDependencyAnalysis(!shouldDoDependencyAnalysis());
	    if (shouldDoDependencyAnalysis()){
		setDoAllPlausibleAnalysis(false);
	    }
	}
    }

    
   private class rationaleAnalysis extends AbstractPluginMethod{

	private Image isonimage;

	public rationaleAnalysis(){
		ImageIcon ii = new ImageIcon(this.getClass().getResource("/resources/Check.gif"));
	    isonimage = ii.getImage();
	}

	public String getName(){
	    return "Agent Rationales Analysis";
	}

	public Image getImage(){
	    if (shouldDoRationaleAnalysis()){
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke(){
	    setDoRationaleAnalysis(!shouldDoRationaleAnalysis());
	    if (shouldDoRationaleAnalysis()){
		setDoAllPlausibleAnalysis(false);
	    }
	}
    }

////////////////////////////////////////////////////////////////////////
    //									  //
    //	    METHODS							  //
    //									  //
    ////////////////////////////////////////////////////////////////////////
      private class CreateLinkGroupMethod extends CreateLinkMethod {
      	String[] typenames;

  		public CreateLinkGroupMethod(View v, String groupname,
  				String[] typenames, boolean dashed) {

  			super(v);

  			typename = groupname;
  			this.typenames = typenames;

  			// We need some type to use for our picture.
  			Object picturetype = model.getFramework().getType(typenames[0]);

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
  			for (int i = 0; i < typenames.length; i++) {
  				Choice c = new Choice();
  				String name = typenames[i];
  				c.setName(name);
  				if (model.getFramework().getType(name)==null) {
  					// for compatiability: some token does not have the right
  					// type name in i*, e.g., "Some +" maps to NFRSomePositive 
  					// rather than IStarSomePositive
  	  				if (name.indexOf("i* ")>=0) {
  	  					name = "NFR " + name.substring(3);
  	  				} 
//  					System.out.println(name);
//  					System.out.println(model.getFramework().getType(name));
  				}
  				c.setChoiceObject(model.getFramework().getType(name));
  				v.add(c);
  			}
  			// Show the dialogue to get the type.
  			RadioButtonChooser rbc = new RadioButtonChooser(null, "Select "
  					+ typename + " Type", true, v);
  			if (rbc.showDialog() == RadioButtonChooser.CONTINUE) {
  				// set type
  				Iterator i = v.iterator();
  				while (i.hasNext()) {
  					Choice c = (Choice) i.next();
  					if (c.chosen()) {
  						System.out.println("chosen " + c.getName());
  						type = c.choiceObject();
  					}
  				}
  				// and go
  				if (type != null) {
  					super.invoke();
  				} else {
  					System.out.println("type is null");
  				}
  			} else {
  				// Users wants to bail out.
  				// Do nothing.
  			}
  			resetMethod();
  		}
		/**
		 * Set the type back to null, and do the rest of the method clean-up, as
		 * required by our super-class.
		 */
		protected void resetMethod() {
			type = null;
			super.resetMethod();
		}
    }
    
    private class CreateDependency extends AbstractPluginMethod {

	Object dependumType;
	Object linkType;
	Image image;

	/**
	 * 
	 * @uml.property name="depender"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	ViewElement depender;

	/**
	 * 
	 * @uml.property name="dependee"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	ViewElement dependee;

	/**
	 * 
	 * @uml.property name="nextp"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	PluginParameter nextp;

	
	public CreateDependency(View v, Object dependumType, Object linkType) {
	    view = v;
	    this.dependumType = dependumType;
	    this.linkType = linkType;

	    nextp = sourceParameter();
	}

	public String getName() {
	    return model.getFramework().getName(dependumType)+" dependency";
	}

	/**
	 * 
	 * @uml.property name="image"
	 */
	public Image getImage() {
		ImageIcon ic = new ImageIcon(this.getClass().getResource(
			"/resources/link-el-link.gif"));
		return ic.getImage();
	}

	public Collection getSubmenu() {
	    return null;
	}
	
	public PluginParameter nextParameter() {
	    return nextp;
	}

	public void passParameter(Collection c) {	
	    if (!c.iterator().hasNext()) {
		// There is nothing there.  We weren't expecting that.
	    } else if (depender == null) {
		
		// We have received the source object.
		depender = (ViewElement)c.iterator().next();

		// And we now want the destination object.
		nextp = destinationParameter();
		
	    } else {
	    
		// We have received the destination object.
		dependee = (ViewElement)c.iterator().next();

		// And we are done getting parameters
		nextp = null;
	    }
	}

	public void invoke() {
		
	    // I am tired when I write this.

	    View.Location froml = depender.getLocation();
	    View.Location tol = dependee.getLocation();
	    ViewObject newelement = null;
	    
	    try {
		View.GraphicLocation fromgl = (View.GraphicLocation)froml;
		View.GraphicLocation togl = (View.GraphicLocation)tol;
		View.GraphicLocation newgl = new View.GraphicLocation();
		Point p = new Point(
			(int)(togl.getPoint().getX() + 
			      fromgl.getPoint().getX())/2,
			(int)(togl.getPoint().getY() + 
			      fromgl.getPoint().getY())/2);
		newgl.setPoint(p);

		// And create the guys involved.
		newelement = view.createElement(dependumType, newgl);
		view.createLink(linkType,
			depender.getModelObject(), newelement.getModelObject());
		view.createLink(linkType,
			newelement.getModelObject(), dependee.getModelObject());
		view.promptRename(newelement);
	    } catch (Exception e) {
	    	// Do something!!!
	    	D.o(e);
	    }
	    
	    resetMethod();
	}
	
	public void cancelled() {
	    resetMethod();
	}

	private void resetMethod() {
	    nextp = sourceParameter();
	    depender = null;
	    dependee = null;
	}

	private PluginParameter sourceParameter() {
	    // We want a ViewObject for one end of the link.
	    Class ptype = null;
	    try {
		ptype = Class.forName("edu.toronto.cs.ome.model.OMEElement");  // s/b ViewElement
	    } catch (Exception e) {
		D.a(e);
	    }
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		    "Select the DEPENDER of the " + dependumType +
		    ".", ptype);
	}

	private PluginParameter destinationParameter() {
	    // We want a ViewObject for the other end of the link.
	    Class ptype = null;
	    try {
		ptype = Class.forName("edu.toronto.cs.ome.model.OMEElement");
	    } catch (Exception e) {
		D.a(e);
	    }
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		    "Select the DEPENDEE of the " + dependumType +
		    ".", ptype);
	}

    }

///////////////////////////////////////////////////////////
    //
    // This is a method to create use case path.
    //
    //
    /////////////////////////////////////////////////////////
    
      private class CreateUseCasePath extends AbstractPluginMethod {

	Image image;
	Object stype;
	Object etype;
	Object pltype;

	/**
	 * 
	 * @uml.property name="startpoint"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	View.Location startpoint;

	/**
	 * 
	 * @uml.property name="endpoint"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	View.Location endpoint;

	/**
	 * 
	 * @uml.property name="nextp"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	PluginParameter nextp;


	public CreateUseCasePath(View v, Object stype, Object etype, Object
		pltype) {
	    view = v;
	    this.stype = stype;
	    this.etype = etype;
	    this.pltype = pltype;
	    nextp = sourceParameter();
	}

	public String getName() {
	    return "Use Case Path";
	}

	/**
	 * 
	 * @uml.property name="image"
	 */
	public Image getImage() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(
			"/resources/Check.gif"));
		return ii.getImage();
	}

	public Collection getSubmenu() {
	    return null;
	}
	
	public PluginParameter nextParameter() {
	    return nextp;
	}

	public void passParameter(Collection c) {	
	
	    if (!c.iterator().hasNext()) {
	    // There is nothing there.  We weren't expecting that.
	
	    } else if (startpoint == null) {
		
//		ViewContext context = (ViewContext)c.iterator().next();
//		if (context.associatedLocation() != null) {
//		    startpoint = context.associatedLocation();
		startpoint = (View.Location)c.iterator().next();
		nextp = destinationParameter();
//		}
	    
	    }else if (endpoint == null) {
		// We have received the destination object.
		endpoint = (View.Location)c.iterator().next();

		// And we are done getting parameters
		nextp = null;
	
	    } else {
	    // We should never get here.
		D.a("Invalid state in Create Use Case Path.");
	    }
    	}

	public void invoke() {

	    // I am tired when I write this.

	    ViewObject newstart = null;
	    ViewObject newend = null;
	    
	    try {

		// And create the guys involved.
		//newelement = view.createElement(dependumType, newgl);
		newstart = view.createElement(stype, startpoint);
		view.promptRename(newstart);
		newend = view.createElement(etype, endpoint);
		view.promptRename(newend);
		view.createLink(pltype,
			newstart.getModelObject(),newend.getModelObject());
	    } catch (Exception e) {
		// Do something!!!
		D.o(e);
	    }
	    
	    resetMethod();
	}
	
	public void cancelled() {
	    resetMethod();
	}

	private void resetMethod() {
	    nextp = sourceParameter();
	    startpoint = null;
	    endpoint = null;
	}

	private PluginParameter sourceParameter() {
	    // We want a ViewObject for one end of the link.
	return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		"Please select where to put the new use case path starting point.", 
		PluginParameter.LocationType);
	}

	private PluginParameter destinationParameter() {
	    // We want a ViewObject for the other end of the link.
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		"Please select where to put the new use case path ending point.", 
		PluginParameter.LocationType);	
	}
    }
  	public void setView(View view) {
		model = view.getModel();
	}
  
}
