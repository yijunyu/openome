package OME;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.ImageIcon;

/** @version May, 2003 (clean-up comments)
  */
/** The IStar plugin.  This plugin will perform IStar analyses, and add
 *  modelling shortcuts to the toolbar.
 */

public class IStarPlugin implements OMEPlugin {
    
    // the names of the I-Star links
    static String[] contributionlinknames =
			{"i* Break", "i* Make", "i* Or", "i* And", "i* Equal", "i* Hurt",
			    "i* Help", "i* Unknown", "i* Some +", "i* Some -"};
    static String[] linknames = {"i* Dependency link", "i* Decomposition link",
			   "i* Means-ends link",
			  "i* ISA", "i* INS", "i* Plays","i* Occupies", "i* Covers", 
			  "i* Is-Part-of"};	

    static String[] elementnames = {"i* Actor", "i* Agent", "i* Role", "i* Position",
			"i* Resource", "i* Task", "i* Goal", "i* Softgoal"};

    OMEModel model;
    private boolean doallplausibleanalysis = true;
    private boolean dodependencyanalysis = false;
    private boolean dorationaleanalysis = false;
    private static String IMAGE_DIR = "images";
    
    public IStarPlugin(OMEModel m) {
	model = m;
    }

    /** Tests for presence of basic IStar type.*/
    static public boolean isCompatibleWith(OMEModel model) {
	return (model.getFramework().getType("i* Position") != null);
    }
    
    /** Returns a collection  of our <code>PluginMethod</code>s that are to be
     *  placed on the OME toolbar. */
    public Collection getToolbarMethods(View view) {

	Vector v = new Vector();
	
	// Need to be able to create i* links and elements.
	MenuMethod em = new MenuMethod("Create Istar Element");
	em.setSubmenu(getElementMethods(view));
	v.add(em);
	
	MenuMethod lm = new MenuMethod("Create Istar Link");
	lm.setSubmenu(getLinkMethods(view));
	lm.addItem(new CreateLinkGroupMethod(view, "i* Contribution Link", 
		    contributionlinknames, false));
	v.add(lm);
	
	// We need to find the dependency link type, and the resource type.
	Object dltype = model.getFramework().getType("i* Dependency link");
	Object rtype = model.getFramework().getType("i* Resource");
	
	// Now we can create the Resource-dependency shortcut.
	PluginMethod m = new CreateDependency(view, rtype, dltype);
	MenuMethod mm = new MenuMethod("Create Dependency Link");
	mm.addItem(m);
	
	v.add(mm);
	return v;
    }

    /** Returns a collection  of our <code>PluginMethod</code>s that are to be
     *  placed on the OME menubar. 
     */
    public Collection getMenubarMethods (View v) {
	MenuMethod istaroptions = new MenuMethod("I* Options");
	istaroptions.addItem(new allPlausibleAnalysis());
	istaroptions.addItem(new MenuSeparatorMethod(v));	
	istaroptions.addItem(new dependencyAnalysis());
	istaroptions.addItem(new MenuSeparatorMethod(v));	
	istaroptions.addItem(new rationaleAnalysis());
    
	return Collections.singleton(istaroptions);
    }

    /** Returns a collection  of our <code>PluginMethod</code>s that are to be
     *  placed in the OME popup-menu (when the user clicks the right mouse
     *  button). 
     */
    public Collection getPopupMethods(View view) {
	D.o("Getting i* popup methods");
	LinkedList ll = new LinkedList();
	
	ll.add(new SetLabelSubmenu(view));
	ll.add(new PopupMenuSeparatorMethod(view));

	MenuMethod em = new MenuMethod("Create Istar Element");
	em.setSubmenu(getElementMethods(view));
	
	MenuMethod lm = new MenuMethod("Create Istar Link");
	lm.setSubmenu(getLinkMethods(view));
	lm.addItem(new CreateLinkGroupMethod(view, "i* Contribution Link", 
		    contributionlinknames, false));
	
	ll.add(new PopupMenuSeparatorMethod(view));

	ll.add(em);
	ll.add(lm);
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
	    PluginMethod method = new
		CreateLinkMethod(type,linknames[i],view);
	    linkmethods.add(method);
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
    

    ////////////////////////////////////////////////////////////////////////
    //									  //
    //	    METHODS							  //
    //									  //
    ////////////////////////////////////////////////////////////////////////

    /** The method to create a group of link options. */
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

    /** Displays a submenu of the possible labels for the intentional element.  */
    private class SetLabelSubmenu extends AbstractPluginMethod {
	private View view;
	
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

    /** Sets the Label of the element. We will generalize this as soon as we
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
	    /*if (shouldAutoPropogate()) {
		IStarPropogator p = new IStarPropogator(vo.getModelObject(),view);
		p.evaluate();
	    }*/
	}
	
	public String getName() {
	    return model.getFramework().getName(target);
	}

	public Image getImage() {
	    return model.getFramework().getImage(target);
	}	
    }


    /** The method to do Plausible Analysis */
    // Not really implemented?
    private class allPlausibleAnalysis extends AbstractPluginMethod{

	private Image isonimage;

	public allPlausibleAnalysis(){
	    ImageIcon ii = new
		ImageIcon(IMAGE_DIR+File.separatorChar+"check.gif");
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
 
    /** The method to do dependency analysis. */
    // ?Not really implemented
    private class dependencyAnalysis extends AbstractPluginMethod{

	private Image isonimage;

	public dependencyAnalysis(){
	    ImageIcon ii = new
		ImageIcon(IMAGE_DIR+File.separatorChar+"check.gif");
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
    
     /** The method to do rationale analysis. */
     // ? Not really implemented
     private class rationaleAnalysis extends AbstractPluginMethod{

	private Image isonimage;

	public rationaleAnalysis(){
	    ImageIcon ii = new
		ImageIcon(IMAGE_DIR+File.separatorChar+"check.gif");
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
  
    
    /** The method to create dependum-dependency link. */
    private class CreateDependency extends AbstractPluginMethod {

	View view;
	Object dependumType;
	Object linkType;
	Image image;
	ViewElement depender;
	ViewElement dependee;
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

	public Image getImage() {
	    ImageIcon ic = new ImageIcon("images/link-el-link.gif");
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
	    ViewObject sourcelink = null;
	    ViewObject destlink = null;
	    
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
		sourcelink = view.createLink(linkType,
			depender.getModelObject(), newelement.getModelObject());
		destlink = view.createLink(linkType,
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
		ptype = Class.forName("OME.OMEElement");  // s/b ViewElement
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
		ptype = Class.forName("OME.OMEElement");
	    } catch (Exception e) {
		D.a(e);
	    }
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		    "Select the DEPENDEE of the " + dependumType +
		    ".", ptype);
	}

    }
  
}
