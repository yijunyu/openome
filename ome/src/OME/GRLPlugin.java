package OME;
import java.awt.Image;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.ImageIcon;

/** @version Jul, 2003 */

/** The GRL plugin.  This plugin will perform GRL analyses, and add
 *  modelling shortcuts to the toolbar.
 */

public class GRLPlugin implements OMEPlugin {
    
    // the names of the GRL contribution links, revised on May, 2003
    static String[] contributionlinknames =
			{"GRL Or Contribution", "GRL And Contribution", 
			 "GRL Make Contribution", "GRL Help Contribution", 
			 "GRL SomePositive Contribution", "GRL Equal Contribution", 
			 "GRL Unknown Contribution", "GRL SomeNegative Contribution", 
			 "GRL Hurt Contribution", "GRL Break Contribution"};

    // the names of the GRL correlation links, added on May, 2003
    static String[] correlationlinknames =
			{"GRL Make Correlation", "GRL Help Correlation", 
			 "GRL SomePositive Correlation", "GRL Equal Correlation", 
			 "GRL Unknown Correlation", "GRL SomeNegative Correlation", 
			 "GRL Hurt Correlation", "GRL Break Correlation"};

    // GRL link names, revised on May, 2003
    static String[] linknames = {"GRL Dependency Link", "GRL Decomposition Link",
			  "GRL Means-ends Link", "GRL Contribution Link", 
			  "GRL Correlation Link","GRL ISA Link", "GRL INS Link",
			  "GRL Plays Link", "GRL Occupies Link", "GRL Covers Link",
			  "GRL PartOf Link", "GRL Attribute Link"};	

    static String[] elementnames = {"GRL Actor", "GRL Agent", "GRL Role", 
			    "GRL Position", "GRL Resource", "GRL Task", 
			    "GRL Goal", "GRL Softgoal", "GRL Belief",
			    "GRL Non-Intentional Element"};

    OMEModel model;
    private boolean autopropogate = true;
    private boolean parameterize_value_attributes = false; 
    private boolean parameterize_non_intentionals = false;
    
    private static String IMAGE_DIR = "images";
    
    /** Constructor */
    public GRLPlugin(OMEModel m) {
	model = m;
    }

    /** Tests for presence of basic GRL type.*/
    static public boolean isCompatibleWith(OMEModel model) {
	return (model.getFramework().getType("GRL Belief") != null);
    }
    
    /** Returns a collection  of our <code>PluginMethod</code>s that are to be
     *  placed on the OME toolbar. */
    public Collection getToolbarMethods(View view) {

	Vector v = new Vector();
	
	// Need to be able to create GRL links and elements.
	MenuMethod em = new MenuMethod("Create GRL Element");
	em.setSubmenu(getElementMethods(view));
	v.add(em);
	
	MenuMethod lm = new MenuMethod("Create GRL Link");
	lm.setSubmenu(getLinkMethods(view));
	v.add(lm);
	
	//MenuMethod mm = new MenuMethod("Create GRL Contribution Link"); 
	//mm.addItem(new CreateLinkGroupMethod(view, "Contribution Link", 
	//	    contributionlinknames, false));
	//v.add(mm);
	return v;
    }

    /** Returns a collection  of our <code>PluginMethod</code>s that are to be
     *  placed on the OME menubar. 
     */
    public Collection getMenubarMethods (View v) {
	MenuMethod grloptions = new MenuMethod("GRL Options");
	grloptions.addItem(new TogglePropMethod());
	grloptions.addItem(new parameterize_value_attributes(v));
	grloptions.addItem(new parameterize_non_intentionals(v));
    
	return Collections.singleton(grloptions);
    }

    /** Returns a collection  of our <code>PluginMethod</code>s that are to be
     *  placed in the OME popup-menu (when the user clicks the right mouse
     *  button). 
     */
    public Collection getPopupMethods(View view) {
	D.o("Getting GRL popup methods");
	LinkedList ll = new LinkedList();

        //adjusted by Yue in summer 2003
	MenuMethod em = new MenuMethod("Create GRL Element");
	em.setSubmenu(getElementMethods(view));
	
	MenuMethod lm = new MenuMethod("Create GRL Link");
	lm.setSubmenu(getLinkMethods(view));
	
	//MenuMethod grllinks = new MenuMethod("Create GRL Link");
	//grllinks.addItem(new CreateLinkGroupMethod(view, "GRL Contribution Link", 
		//    contributionlinknames, false));
	//ll.add(grllinks);
	
	//ll.add(new RemoveGRLAttributeSubmenu(view));
	//ll.add(new AddGRLAttributeSubmenu(view));
	//ll.add(new SetLabelSubmenu(v));

	MenuMethod evaMethod = new MenuMethod("Evaluation Options");
	evaMethod.setSubmenu(getEvaMethods(view));
	ll.add(evaMethod);
	ll.add(new PopupMenuSeparatorMethod(view));

	ll.add(new hideAllSoftgoalsMethod(view));  // added on June, 2003
	ll.add(new hideSoftgoalChildrenMethod(view));  // added on June, 2003
	ll.add(new PopupMenuSeparatorMethod(view));

	ll.add(new showAttributeMethod(view));
	ll.add(new parameterizeValueMethod(view));
	ll.add(new parameterizeNonIntentionalMethod(view));
	
	ll.add(new PopupMenuSeparatorMethod(view));
	ll.add(em);
	ll.add(lm);
	return ll;
    }


    /** Return a collection of element creation methods for the GRL element
      * types. */
    private Collection getElementMethods(View view) {
	Vector elementmethods = new Vector(elementnames.length);
	for (int i=0; i<elementnames.length; i++) {
	    Object type = model.getFramework().getType(elementnames[i]);
	    PluginMethod method = new CreateElementMethod(type,elementnames[i],view);
            elementmethods.add(method);
	}
	return elementmethods;
    }
    
    /** Return a collection of link creation methods for the GRL link types. */
    private Collection getLinkMethods(View view) {
	Vector linkmethods = new Vector(linknames.length);
	for (int i=0; i<linknames.length; i++) {
	    Object type = model.getFramework().getType(linknames[i]);
	    PluginMethod method;
	    if (i == 3) { //"contribution link"
		method = new CreateLinkGroupMethod(view, "GRL Contribution Link", 
		    contributionlinknames, false);
            } else if (i == 4) { //correlation link
		method = new CreateLinkGroupMethod(view, "GRL Correlation Link", 
		    correlationlinknames, true);
            } else {
                method = new CreateLinkMethod(type,linknames[i],view);
            }
	    linkmethods.add(method);
	}
	return linkmethods;
    }
    

    /** Return a collection of evaluation option methods (Aug, 03)*/
    private Collection getEvaMethods(View view) {
	Vector evaMethods = new Vector();
	evaMethods.add(new SetLabelSubmenu(view));
	evaMethods.add(new SetEvaStarterMethod(view));      
	evaMethods.add(new RemoveStartingMethod(view));
	evaMethods.add(new HighlightEvaImporterMethod(view));      
	evaMethods.add(new UnhighlightEvaImporterMethod(view));
	
	return evaMethods;
    }

    private boolean shouldParameterize_value_attributes(){
	return parameterize_value_attributes;
    }
    
    private boolean shouldParameterize_non_intentionals(){
	return parameterize_non_intentionals;
    }

    private void setParameterize_value_attributes(boolean b){
	parameterize_value_attributes = b;
    }

    private void setParameterize_non_intentionals(boolean b){
	parameterize_non_intentionals = b;
    }

    private void setShouldAutoPropogate(boolean b) {
	autopropogate = b;
    }

    private boolean shouldAutoPropogate() {
	return autopropogate;
    }
    
    /** The method to create group of links */
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
	    Vector choices = new Vector(typenames.length);
            for (int i=0; i<typenames.length; i++) {
		Choice c = new Choice();
		String name = typenames[i];
		c.setName(name);
		c.setChoiceObject(model.getFramework().getType(name));
		choices.add(c);
	    }
	    // Show the dialogue to get the type.
	    RadioButtonChooser rbc = new RadioButtonChooser(null,
		    "Select " +typename+ " Type", true, choices);
	    if (rbc.showDialog() == RadioButtonChooser.CONTINUE) {
		// set type
		Iterator i = choices.iterator();
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

    /** The method to set an element as a starting node for evaluation */
    private class SetEvaStarterMethod extends ObjectMethod {
	public SetEvaStarterMethod(View v) {
	    super(v);
	    name = "Set as a Starting Node for Evaluation";
	    instruction = "Choose the element to be set as a starting node";
	}

	protected void operate(ViewObject vo) {
	    vo.setEvaStarter(true);
	}	
    }

    /** The method to remove a starting notation for evaluation */
    private class RemoveStartingMethod extends ObjectMethod {
	
	public RemoveStartingMethod(View v) {
	    super(v);
	    name = "Remove a Starting Notation";
	    instruction = "Choose the element to remove its starting notation";
	}

	protected void operate(ViewObject vo) {
	    vo.setEvaStarter(false);
	}
    
	protected boolean isSuitable(ViewObject vo) {
	    if (vo.isEvaStarter()) return true;
	    return false;
	}
    }


    /** The method to highlight an evaluated element that is imported from 
      * other diagram(s) */
    private class HighlightEvaImporterMethod extends ObjectMethod {
	public HighlightEvaImporterMethod(View v) {
	    super(v);
	    name = "Highlight an Element with Imported Eva-value";
	    instruction = "Choose the element to be highlighted";
	}

	protected void operate(ViewObject vo) {
	    vo.setEvaImporter(true);
	}
	
    }

    /** The method to unhighlight an element with imported eva-value */
    private class UnhighlightEvaImporterMethod extends ObjectMethod {
	
	public UnhighlightEvaImporterMethod(View v) {
	    super(v);
	    name = "Remove Imported Eva-value Notation";
	    instruction = "Choose the element";
	}

	protected void operate(ViewObject vo) {
	    vo.setEvaImporter(false);
	}
    
	protected boolean isSuitable(ViewObject vo) {
	    if (vo.isEvaImporter()) return true;
	    return false;
	}
    }


    /** Displays a submenu of the possible evaluation labels for the element.  */
    private class SetLabelSubmenu extends AbstractPluginMethod {
	private View view;
	//private ViewElement ve = null;

	public SetLabelSubmenu(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Set Evaluation Label";
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
	    if (shouldAutoPropogate()) {
		GRLPropogator p = new GRLPropogator(vo.getModelObject(),view);
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

   /** The method to hide all the softgoals. (June, 2003) */
   private class hideAllSoftgoalsMethod extends AbstractPluginMethod {
	private View view;

	public hideAllSoftgoalsMethod(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Hide All Softgoals";
	}

	// We don't need any parameters.
	    
	public void invoke() {
	    Iterator i = getAllSoftgoals();
	    while (i.hasNext()) {
		((ViewObject)i.next()).setHidden(true);
	    }
	}

	public boolean isEnabled(ViewContext con) {
	    Iterator i;
	    i = getAllSoftgoals();
	    while (i.hasNext()) {
		if (!((ViewObject)i.next()).isHidden()) return true;
	    }
	    return false;
	}

	private Iterator getAllSoftgoals() {
	    LinkedList softgoals = new LinkedList();
	    Iterator elements = view.getAllElements().iterator();
	    ModelObject mo;

	    while (elements.hasNext()) {
		ViewObject vo = (ViewObject)elements.next();
		Object type = vo.getModelObject().getType();
		if ((model.getFramework().getName(type)).equals("GRL Softgoal")) {
		    softgoals.add(vo);
		}
	    }
	    return softgoals.iterator();
	}
   }
	    

   /** The method to hide all the softgoal children for a selected Actor parent. 
     * (on June, 2003) */
   private class hideSoftgoalChildrenMethod extends ObjectMethod {

	public hideSoftgoalChildrenMethod(View view) {
	    super(view);
	    name = "Hide Softgoals for an Actor";
	    instruction = "Select an actor";
	}

	protected boolean isSuitable(ViewObject vo) {
	    if (vo instanceof ViewElement) {
		Object type = vo.getModelObject().getType();
		Iterator softgoals = getSoftgoalChildren((ViewElement)vo);
	        if ((model.getFramework().getName(type)).equals("GRL Actor")) { 
		    while (softgoals.hasNext()) {
			if (!((ViewObject)softgoals.next()).isHidden()) {
		    	    return true;
			}
		    }
		}
	    }
	    return false;
	}

	protected void operate(ViewObject vo) {
	    Iterator softgoals = getSoftgoalChildren((ViewElement)vo);
	    while (softgoals.hasNext()) {
		((ViewObject)softgoals.next()).setHidden(true);
	    }
	}

	
	private Iterator getSoftgoalChildren(ViewElement ve) {
	    LinkedList softgoals = new LinkedList();
	    if (ve.isExpanded()) {
		Iterator i = ve.getChildren().iterator();
		while (i.hasNext()) {
		    ViewObject child = (ViewObject)i.next();
		    Object type = child.getModelObject().getType();
		    if ((model.getFramework().getName(type)).equals("GRL Softgoal")) {
		        softgoals.add(child);
		    }
		}
	    }
	    return softgoals.iterator();
	}
   }


   private class showAttributeMethod extends ObjectMethod {

        public showAttributeMethod(View v) {
	    super(v);
	    name = "Show Value Attribute";
	    instruction = "Properties of object";
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
	    D.o("Showing value attributes!!!!!!!!");
    	    Iterator mvas =  
		vo.getModelObject().getValueAttributes();
	    
	    while (mvas.hasNext()) {
	    D.o("Value Attributes are not empty!");
		ModelValueAttribute oa = (ModelValueAttribute)mvas.next();
		if ((oa!=null)&& ((oa.getLabel()!=null)||(oa.getValue()!=null))) {
		    data[i][0] = oa.getLabel();
		    D.o("label is " + data[i][0]);
		    data[i][1] = oa.getValue();
		    D.o("value is " + data[i][1]);
		    i++;
		}
	    }
	    
	    
	    String objectname = vo.getName();
	    D.o("View object name is " + objectname);
	    AttributeDialog attributeDialog =
		new AttributeDialog(objectname, data, vo);
	    view.showDialog(attributeDialog);
	}
    }

    private class parameterizeValueMethod extends ObjectMethod {
	
	public parameterizeValueMethod(View v) {
	    super(v);
	    name = "Parameterize with Value Attributes";
	    instruction = "Show Value Attributes Behind Name";
	}
	
	protected boolean isSuitable(ViewObject vo) {
	    return true;
	}

	protected void operate(ViewObject vo) {
	    promptUnparameterization(vo);
	    promptParameterization(vo,1);
	}
    }
    
    private class parameterizeNonIntentionalMethod extends ObjectMethod {
	
	public parameterizeNonIntentionalMethod(View v) {
	    super(v);
	    name = "Parameterize with Non-Intentionals";
	    instruction = "Show Non-Intentionals Behind Name";
	}
	
	protected boolean isSuitable(ViewObject vo) {
	    return true;
	}

	protected void operate(ViewObject vo) {
	    promptUnparameterization(vo);
	    promptParameterization(vo,2);
	}
    }	

   //Show the value attributes of intentional elements.
    private class parameterize_value_attributes extends AbstractPluginMethod{

	private Image isonimage;
	private View view;

	public parameterize_value_attributes(View view){
	    this.view = view;
	    ImageIcon ii = new
		ImageIcon(IMAGE_DIR+File.separatorChar+"check.gif");
	    isonimage = ii.getImage();
	}

	public String getName(){
	    return "Parameterize Value Attributes";
	}

	public Image getImage(){
	    if (shouldParameterize_value_attributes()){
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke(){
	    setParameterize_value_attributes(!shouldParameterize_value_attributes());
	    if (shouldParameterize_value_attributes()) {
//		Iterator i = view.getSelectedElements().iterator();
		setParameterize_non_intentionals(false);
		Iterator i = view.getAllElements().iterator();
		while (i.hasNext()) {
		    ViewObject vo = (ViewObject)i.next();
		    promptUnparameterization(vo);
		    promptParameterization(vo,1);
		}
	    } else {
		Iterator i = view.getAllElements().iterator();
		while (i.hasNext()) {
		    ViewObject vo = (ViewObject)i.next();
		    promptUnparameterization(vo);
		}
	    }
	}
    }
    
      private class parameterize_non_intentionals extends AbstractPluginMethod{

	private Image isonimage;
	private View view;

	public parameterize_non_intentionals(View view){
	    this.view = view;
	    ImageIcon ii = new
		ImageIcon(IMAGE_DIR+File.separatorChar+"check.gif");
	    isonimage = ii.getImage();
	}

	public String getName(){
	    return "Parameterize Non-Intentionals";
	}

	public Image getImage(){
	    if (shouldParameterize_non_intentionals()){
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke(){
	    setParameterize_non_intentionals(!shouldParameterize_non_intentionals());
	    if (shouldParameterize_non_intentionals()) {
//		Iterator i = view.getSelectedElements().iterator();
		setParameterize_value_attributes(false);
		Iterator i = view.getAllElements().iterator();
		while (i.hasNext()) {
		    Object non_intentional_type =
			model.getFramework().getType("GRL Non-Intentional Element");
		    ViewObject vo = (ViewObject)i.next();
		    ModelElement curr = (ModelElement)vo.getModelObject();
		    promptUnparameterization(vo);
		    if (! curr.getType().equals(non_intentional_type)) {
			promptParameterization(vo,2);
		    }
		}
	    } else {
		Iterator i = view.getAllElements().iterator();
		while (i.hasNext()) {
		    ViewObject vo = (ViewObject)i.next();
		    promptUnparameterization(vo);
		}
	    }
	}
    }
    /** Prompts user to parameterize the elements.
     *  We had better receive a GraphicViewElement.
     *  There is not constrain on the name of the element.
     *  It is possible that two elements have an identical name.
     */
    public void promptParameterization(ViewObject vo, int source) {
	D.o("Prompting Parameterization!!!!!!!!!");
	String name = vo.getModelObject().getName();
	D.o("element name is"+name);
	String [] parameters = {"", "", "", "", "", "", "", "", "", ""};
	
	int i=0;

	if (source == 1) {
	    Iterator mvas =  
		    vo.getModelObject().getValueAttributes();
	    while (mvas.hasNext()) {
		ModelValueAttribute oa = (ModelValueAttribute)mvas.next();
		if ((oa!=null)&& ((oa.getLabel()!=null)||(oa.getValue()!=null))) {
		    parameters[i] = oa.getValue();
		    D.o("parameter value is " + parameters[i]);
		    i++;
		}
	    }
	} else if (source == 2) {
	    Object non_intentional_type = model.getFramework().getType("GRL Non-Intentional Element");
	    Object attributetype = model.getFramework().getType("GRL Attribute link");
	    ModelElement curr = (ModelElement)vo.getModelObject();
	    Iterator links = curr.getLinks().iterator();
	    while (links.hasNext()) {
		ModelLink currlink = (ModelLink)links.next();
		if (currlink.getType().equals(attributetype)) {
		    parameters[i] =  currlink.getFrom().getName();
		}
		i++;
	    }
	    
	    try {
		Iterator ii = vo.getLinks().iterator();
		while (ii.hasNext()) {
		    ViewLink vl = (ViewLink)ii.next();
		    if(((ViewObject)vl.getTo() == vo) && (vl.getType().equals(attributetype))) {
			ViewObject sourceobj = (ViewObject)vl.getFrom();		    
			if (!vl.isHidden()) {
			    vl.setHidden(true);
			}
			if (!sourceobj.isHidden()) {
			    sourceobj.setHidden(true);
			}
		    }
		}
	    } catch (Exception e) {
		D.o(e);
	    }
	}
	
	String newname = new String(name);
	D.o("Newname is "+newname);
	i=0;
	while(!parameters[i].equals("")) {
	    if(i==0) {
	        newname = newname.concat(" [");
	    }else {
	        newname = newname.concat(", ");
	    }
	    newname = newname.concat(parameters[i]);
	    i++;
	}
	if (i!=0) {
	    newname = newname.concat("]");
	}
	try {    
	   	vo.setName(newname);
	} catch (Exception e) {
	    D.o(e);
	}
    }
    
    public void promptUnparameterization(ViewObject vo) {
	D.o("Prompting Unparameterization!!!!!!!!!");
	String name = vo.getModelObject().getName();
	int index = name.indexOf("[");
	
	if( index>0 ) {
	    String newname = new String(name.substring(0, index-1));
	    D.o("newname is "+newname);    
	    try {    
	   	vo.setName(newname);
	    } catch (Exception e) {
		D.o(e);
	    }
	}
	
	try {
	    Iterator ii = vo.getLinks().iterator();
	    Object attributetype = model.getFramework().getType("GRL Attribute link");
	    while (ii.hasNext()) {
	        ViewLink vl = (ViewLink)ii.next();
	        if(((ViewObject)vl.getTo() == vo) && (vl.getType().equals(attributetype))) {
		    ViewObject sourceobj = (ViewObject)vl.getFrom();		    
		    if (vl.isHidden()) {
		        vl.setHidden(false);
		    }
		    if (sourceobj.isHidden()) {
		        sourceobj.setHidden(false);
		    }
		}
	    }
	} catch (Exception e) {
	    D.o(e);
	}
    }

    private class RemoveGRLAttributeSubmenu extends AbstractPluginMethod {
	View view;
	public RemoveGRLAttributeSubmenu(View view) {
	    this.view = view;	    
	}

	public String getName() {
	    return "Remove a GRL Symbolic Attribute";
	}

	public boolean isEnabled(ViewContext ovc) {
	    ViewObject vo = ovc.associatedObject();
	    if (vo != null) {
		ModelObject mo = vo.getModelObject();
		Iterator i = mo.getAttributes();
		while (i.hasNext()) {
		    ModelAttribute att = (ModelAttribute)i.next();
		    if(att.getTarget() != null) {
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
		Iterator i = mo.getAttributes();
		while (i.hasNext()) {
		    ModelAttribute att = (ModelAttribute)i.next();
		    if(att.getTarget() != null) {
			list.add(new  RemoveAttribute(att));
		    }
		}
		return list;		    
	    }
	    return null;
	}
    }
    
    private class RemoveAttribute extends AbstractPluginMethod {
	ModelAttribute att;
	
	public RemoveAttribute(ModelAttribute att) {
	    this.att = att;	    
	}
	
	public void invoke() {
	    att.clearTarget();
	}
	
	public String getName() {
	    return model.getFramework().getName(att.getTarget());
	}
	
	public Image getImage() {
	    return model.getFramework().getImage(att.getTarget());
	}
    }

    private class AddGRLAttributeSubmenu extends AbstractPluginMethod {
	View view;
	public AddGRLAttributeSubmenu(View view) {
	    this.view = view;	    
	}

	public String getName() {
	    return "Add a GRL Symbolic Attribute";
	}

	public boolean isEnabled(ViewContext ovc) {
	    ViewObject vo = ovc.associatedObject();
	    if (vo != null) {
		ModelObject mo = vo.getModelObject();
		if (mo.getAttributes().hasNext()) return true;
	    }	    
	    return false;
	}

	public Collection getSubmenu(ViewContext ovc) {
	    ViewObject vo = ovc.associatedObject();
	    if (vo != null) {
		ModelObject mo = vo.getModelObject();
		LinkedList list = new LinkedList();
		Iterator i = mo.getAttributes();
		while (i.hasNext()) {
		    D.o(" Are we finding any attributes? yes...");
		    ModelAttribute att = (ModelAttribute)i.next();		    
		    list.add(new AddAttributeSubsubmenu(att, view));		    
		    //list.add(new
		//	    AddAttribute(att,att.getPossibleTargets().next()));
		}
		return list;		    
	    }
	    return null;
	}
    }

    private class AddAttributeSubsubmenu extends AbstractPluginMethod {
	ModelAttribute att;
	View view;
	
	public AddAttributeSubsubmenu(ModelAttribute att, View
		view) {
	    this.att = att;
	    this.view = view;
	}

	public String getName() {
	    D.o(att.getName());
	    return att.getName();
	}

	public boolean isEnabled(ViewContext ovc) {
	    return true;
	}

	public Collection getSubmenu(ViewContext ovc) {
	    ViewObject vo = ovc.associatedObject();
	    if (vo != null) { // how couldit be if we got created?
		LinkedList list = new LinkedList();
		Iterator i = att.getPossibleTargets();
		while (i.hasNext()) {
		    list.add(new AddAttribute(att, i.next(), vo, view));
		}
		return list;
	    }
	    return null;
	}
    }

    private class AddAttribute extends AbstractPluginMethod {
	ModelAttribute att;
	Object target;
	ViewObject vo;
	View view;
	
	public AddAttribute(ModelAttribute att, Object target, ViewObject vo,
		View view) {	    
	    this.att = att;
	    this.target = target;
	    this.vo = vo;
	    this.view = view;
	}
	
	public void invoke() {
	    att.setTarget(target);
// Added by Lin Liu to implement model evaluation 	    
	    GRLPropogator p = new GRLPropogator(vo.getModelObject(),view);
	    p.evaluate();
// End of code added to implement model evaluation 	    
	}
	
	public String getName() {
	    return model.getFramework().getName(target);
	}
	
	public Image getImage() {
	    return model.getFramework().getImage(target);
	}
	
    }

}  


