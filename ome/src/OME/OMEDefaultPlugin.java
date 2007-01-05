package OME;
   
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/** This is the standard OME interface plugin.  It creates and populates the
  *  File and Edit menus, creates tool bars for basic editing, and simple
  *  creation of all instantiable links and elements.  It also populates the
  *  Popup (right mouse button) menu with similar methods.
  */
class OMEDefaultPlugin implements OMEPlugin {

    private OMEModel model;
    private boolean use_expandable;	    //Should we include methods
    private boolean straightenall = false;
    private boolean expandall = false;
    private boolean contractall = false;
    private static String IMAGE_DIR = "images";
					    //for expandable elements?

    public OMEDefaultPlugin(OMEModel m) {
	model = m;
	use_expandable = expandableElementsPresent();
    }

    /** We are compatable with everything (we hope). */
    static public boolean isCompatibleWith(OMEModel model) {
	return true;
    }
    
    /** Some objects may want special access to our save method. */
    protected PluginMethod getSaveMethod(View v) {
	return new SaveMethod(v);
    }
    
    public Collection getToolbarMethods(View v) {
	Vector toolbarMethods = new Vector();
	
	// Toolbar 1:  Has the convienient save button on it.
	MenuMethod file_edit_toolbar = new MenuMethod("File/Edit");
	file_edit_toolbar.addItem(new SaveMethod(v));
	file_edit_toolbar.addItem(new PrintMethod(v));
//	file_edit_toolbar.addItem(new CutMethod(v));
//	file_edit_toolbar.addItem(new CopyMethod(v));
//	file_edit_toolbar.addItem(new PasteMethod(v));

	// Toolbar 2:  Methods for those instantiable types that have
	// requested automatic interface generation.
	MenuMethod create_object_tb = new MenuMethod("Create Object");
	Iterator instantiables = getInstantiableTypes().iterator();
	OMEFramework fw = model.getFramework();
	boolean use_cot = false;    // Do we actually need this toolbar?
	while (instantiables.hasNext()) {
	    Object type = instantiables.next();
	    if (fw.autoGenInterface(type)) {
		if (fw.isLink(type)) {
		    use_cot = true;
		    create_object_tb.addItem(new CreateLinkMethod(type,
				fw.getName(type), v));
		} else if (fw.isElement(type)) {
		    use_cot = true;
		    create_object_tb.addItem(new CreateElementMethod(type,
				fw.getName(type), v));
		} else {
		    // Bizarre
		    D.a("Invalid instantiable type encountered.  Must be "+
			    "element or link.");
		}
	    }
	}
	
	
	// Return the toolbars.
	toolbarMethods.add(file_edit_toolbar);
	if (use_cot) {
	    toolbarMethods.add(create_object_tb);
	}
	return toolbarMethods;
    }
    
    private void setStraightenAll(boolean b) {
	straightenall = b;
    }

    private boolean straightenAll() {
	return straightenall;
    }
    
    private void setExpandAll(boolean b) {
	expandall = b;
    }

    private boolean expandAll() {
	return expandall;
    }
    
    private void setContractAll(boolean b) {
	contractall = b;
    }

    private boolean contractAll() {
	return contractall;
    }
    
    public Collection getMenubarMethods(View v) {
	Vector menubarMethods = new Vector();

	// Create File Menu
	MenuMethod filemenu = new MenuMethod("File");
	PluginMethod sm = new SaveMethod(v);
	filemenu.addItem(sm);
	filemenu.addItem(new SaveAsMethod(v));
//cai 1.29.2001
	filemenu.addItem(new SaveAsSmlMethod(v));
	filemenu.addItem(new SaveAsXmlMethod(v));

	filemenu.addItem(new ExportMethod(v));
	filemenu.addItem(new PrintMethod(v));
//      filemenu.addItem(new ExportMethod(v,"Export","CB",false));
//	filemenu.setSubmenu(new ExportMethod(v));
	filemenu.addItem(new CloseMethod(v,sm));
	
	// Create View Menu
	MenuMethod viewmenu = new MenuMethod("View");
	viewmenu.addItem(new SelectAllMethod(v));
	viewmenu.addItem(new MenuSeparatorMethod(v));		
	viewmenu.addItem(new SelectBackgroundColorMethod(v));
	viewmenu.addItem(new MenuSeparatorMethod(v));	
	viewmenu.addItem(new StraightenAllMethod(v));
	viewmenu.addItem(new ExpandAllMethod(v));
	viewmenu.addItem(new ContractAllMethod(v));
	viewmenu.addItem(new MenuSeparatorMethod(v));	
	viewmenu.addItem(new ResizeAllMethod(v));

	MenuMethod windowmenu = new MenuMethod("Window");
//	multiple view
//	windowmenu.addItem(new CreateNewViewMethod(v));
	windowmenu.addItem(new ArrangeAllMethod(v));
	windowmenu.addItem(new SplitMethod(v));
	windowmenu.addItem(new UnhideAllMethod(v));

	MenuMethod helpmenu = new MenuMethod("Help");
	helpmenu.addItem(new HelpContentMethod());
	
	// Add the created menus to the menubar
	menubarMethods.add(filemenu);
	menubarMethods.add(viewmenu);
	menubarMethods.add(windowmenu);
	menubarMethods.add(helpmenu);

	return menubarMethods;
    }
    
    public Collection getPopupMethods(View v) {
	D.o("Getting OMEDefault popup methods.");
	
	LinkedList ll = new LinkedList();
	
	ll.add(new SelectMethod(v));
	ll.add(new DeselectMethod(v));
	ll.add(new PopupMenuSeparatorMethod(v));
	if (use_expandable) {
	    ll.add(new ExpandMethod(v));
	    ll.add(new UnexpandMethod(v));
	    ll.add(new PromoteChildMethod(v));
	    ll.add(new AddChildMethod(v));
	    ll.add(new PopupMenuSeparatorMethod(v));
	}
	ll.add(new DeleteMethod(v));
	ll.add(new HideMethod(v));
	ll.add(new UnhideAllMethod(v));
	ll.add(new PopupMenuSeparatorMethod(v));		
	ll.add(new RenameMethod(v));
	if (model.getFramework().isCommentSupported()) {
	    ll.add(new ModifyCommentMethod(v));
	}
	ll.add(new ResizeMethod(v));
	ll.add(new StraightenMethod(v));
	ll.add(new HighlightMethod(v));
	ll.add(new UnhighlightMethod(v));
	ll.add(new PopupMenuSeparatorMethod(v));
	ll.add(new ChangeLinkDirectionMethod(v));
	ll.add(new ChangeElementTypeMethod(v));	
	ll.add(new ChangeLinkTypeMethod(v));	
	ll.add(new PopupMenuSeparatorMethod(v));	
	ll.add(new RemoveAttributeSubmenu(v));
	ll.add(new AddAttributeSubmenu(v));
	ll.add(new PopupMenuSeparatorMethod(v));	
	return ll;
    }

    /** Returns a collection of Objects that represent the instantiable
     *  element types available in the framwork associated with the given view.
     */
    private Collection getInstantiableElementTypes() {
	LinkedList etypes = new LinkedList();
	
	// Iterate over Instantiable elements and links, and add the 
	// element.
	OMEFramework fw = model.getFramework();
	Iterator i = fw.getAllInstantiable();
	while (i.hasNext()) {
	    Object objecttype = (Object)i.next();
	    if (fw.isElement(objecttype)) {
		etypes.add(objecttype);
	    } 
	}
	return etypes;
    }


    /** Returns a collection of Objects that represent the instantiable
     *  link types available in the framwork associated with the given view.
     */
    private Collection getInstantiableLinkTypes() {
	LinkedList ltypes = new LinkedList();
	
	// Iterate over Instantiable elements and links, and add the 
	// links.
	OMEFramework fw = model.getFramework();
	Iterator i = fw.getAllInstantiable();
	while (i.hasNext()) {
	    Object objecttype = (Object)i.next();
	    if (fw.isLink(objecttype)) {
		ltypes.add(objecttype);
	    } 
	}
	return ltypes;
    }
    
    /** Returns a collection of Objects that represent all the instantiable
     *  types available in the framwork associated with the given view.
     */
    private Collection getInstantiableTypes() {
	Collection c = getInstantiableElementTypes();
	c.addAll(getInstantiableLinkTypes());
	return c;
    }


    /** Are there any expandable, instantiable elements in this framework? */
    private boolean expandableElementsPresent() {
	Iterator i = getInstantiableElementTypes().iterator();
	OMEFramework fw = model.getFramework();
	while (i.hasNext()) {
	    if (fw.isExpandable(i.next())) {
		return true;
	    }
	}
	return false;
    }


    ////////////////////////////////////////////////////////////////////////
    //									  //
    //	    METHODS							  //
    //									  //
    ////////////////////////////////////////////////////////////////////////
    
    
    /** The method to close the view
     */
    private class CloseMethod extends AbstractPluginMethod {
	View view;
	PluginMethod method;
	
	public CloseMethod(View view, PluginMethod method) {
	    this.view = view;
	    this.method = method;
	}

	public String getName() {
	    return "Close";
	}

	public void invoke() {
	    ((GraphicView)view).closeView(method);
	}
    }
    
    private class SelectAllMethod extends AbstractPluginMethod {
    
	private View view;
	
	public SelectAllMethod(View v){
	    view = v;	    
	}

	public String getName(){
	    return "Select All";
	}

	public void invoke(){
	    Collection allelements = view.getAllElements();
	    if (allelements != null) {
		selectVisible(allelements.iterator());
	    }

	    Collection alllinks = view.getAllLinks();
	    if (alllinks != null) {
		selectVisible(alllinks.iterator());
	    }

	}

	/** Selects all ViewObjects in the given Iterator (provided they are
	 *  not hidden). */
	private void selectVisible(Iterator i) {
	    while (i.hasNext()){
		ViewObject vo = (ViewObject)i.next();		    
		if (!vo.isHidden() && !vo.isIconified()) {
		    vo.setSelected(true);		
		}
	    }		    		
	}
    } 

    /** The method used to select the background color of the graphic view
     *  canvas.
     */
    private class SelectBackgroundColorMethod extends AbstractPluginMethod {
    
	private View view;
	private GraphicViewCanvas gvc;
	private JColorChooser chooser = new JColorChooser();
	private JDialog dialog;
	
	public SelectBackgroundColorMethod(View view) {
	    this.view = view;	    
	}

	public String getName() {
	    return "Select Background Color";
	}

	public void invoke() {	
	     gvc = ((GraphicView)view).getGraphicViewCanvas();
	     dialog = JColorChooser.createDialog(gvc,"Select a Color",true,
			    chooser,new OKListener(),new CancelListener());
	     chooser.setColor(gvc.getBackground());
	     dialog.setVisible(true);
	}
	
	private class OKListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
		gvc.setBackground(chooser.getColor());
	    }	
	}

	private class CancelListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {	    
	    // just do nothing.
	    }
	}
    } 
/* multiple view
    private class CreateNewViewMethod extends AbstractPluginMethod {

	private View view;
	
	public CreateNewViewMethod(View view){
	    this.view = view;    
	}

	public String getName(){
	    return "New Window";
	}

	public void invoke(){
	    //this inplementation is only for graphic view
	    GraphicViewFrame gvf= ((GraphicView)view).getGraphicViewCanvas().getGraphicViewFrame();
	    Object[] options = {"Graphic View",
				"Tree View",
				"Textual Description"};
	    int n = JOptionPane.showOptionDialog(gvf,
                                "Which kind of view would you like to create"
				+ "in the new window?",
				"View Type Chooser",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]);
	    
	    ViewManager vm = view.getModel().getViewManager();
	    int id = vm.createView(n);
	    try {
		gvf.createNewViewFrame(vm, vm.getOME(), n, id);
	    } catch (Exception e) {
	    	D.o(e);
	    }
	}
 }
*/

    private class ArrangeAllMethod extends AbstractPluginMethod {
    
	public ArrangeAllMethod (View view){
	}
	
	public String getName(){
	    return "Arrange All";
	}
	
	public void invoke(){
	
	}
    }

    private class SplitMethod extends AbstractPluginMethod {
	public SplitMethod (View view) {
	}

	public String getName(){
	    return "Split";
	}
	
	public void invoke(){
	
	}
    }
	
    private class HelpContentMethod extends AbstractPluginMethod {
	public HelpContentMethod () {
	}

	public String getName(){
	    return "Help Contents";
	}

	public void invoke(){
	
	}
    }


    
    /** The method to "Save" the model and its views. */
    private class SaveMethod extends AbstractPluginMethod {

	private View view;

	public SaveMethod(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Save";
	}

	public Image getImage() {
	    // Plugins shouldn't know about directory images!
	    ImageIcon ic = new ImageIcon("images/save.gif");
	    return ic.getImage();	    
	}
	
	public void invoke() {
	    String pathname = view.getSavePathname();
	    D.o("Saving........"+pathname);
	    if (pathname == null) {
		// Do nothing, user must have changed her mind.
		return ;
	    } else {
		try {
		    model.save(pathname);
		} catch (Exception e) {
		    // Error saving model.
		    D.a(e);
    		}
	    }
        }
    }
 
    
    /** The method to "Save As" the model and its views. */
    private class SaveAsMethod extends AbstractPluginMethod {

	private View view;

	public SaveAsMethod(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Save As..";
	}

	public Image getImage() {
	    return null;
	}
	
	public void invoke() {
	    Collection c = view.getSaveFileAndDirectory();
	    if (c == null) {
		// Do nothing, user must have changed her mind.
	    } else {
		Iterator i = c.iterator();
		String filename = (String)i.next();
		String dirname = (String)i.next();
		String completepath = dirname + File.separator + filename;
		D.o("To be Saved File is Named as " + completepath);
		try {
		    model.save(completepath);
		} catch (Exception e) {
		    // Error saving model.
		    D.a(e);
		}
	    }
	}
    }
      /** The method to "Save As A .sml File" the model and its views. */
    private class SaveAsSmlMethod extends AbstractPluginMethod {

	private View view;

	public SaveAsSmlMethod(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Save As .sml...";
	}

	public Image getImage() {
	    return null;
	}
	
	public void invoke() {
	    Collection c = view.getSaveFileAndDirectory();
	    if (c == null) {
		// Do nothing, user must have changed her mind.
	    } else {
		Iterator i = c.iterator();
		String filename = (String)i.next();
		String dirname = (String)i.next();
		String completepath = dirname + File.separator + filename;
		D.o("To be Saved File is Named as " + completepath);
		try {
//Here is the place to insert a new method called saveassml....
		    model.saveassml(completepath); //cai
//		    model.save(completepath);
		} catch (Exception e) {
		    // Error saving model.
		    D.a(e);
		}
	    }
	}
    }
    
       /** The method to "Save As A .sml File" the model and its views. */
    private class SaveAsXmlMethod extends AbstractPluginMethod {

	private View view;

	public SaveAsXmlMethod(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Save As .xml...";
	}

	public Image getImage() {
	    return null;
	}
	
	public void invoke() {
	    Collection c = view.getSaveFileAndDirectory();
	    if (c == null) {
		// Do nothing, user must have changed her mind.
	    } else {
		Iterator i = c.iterator();
		String filename = (String)i.next();
		String dirname = (String)i.next();
		String completepath = dirname + File.separator + filename;
		D.o("To be Saved File is Named as " + completepath);
		try {
		    model.saveasxml(completepath); //cai,7.10,2001
//		    model.save(completepath);
		} catch (Exception e) {
		    // Error saving model.
		    D.a(e);
		}
	    }
	}
    }
    
   private class StraightenAllMethod extends AbstractPluginMethod{
    
	private Image isonimage;
	View view;

	public StraightenAllMethod(View v) {
	    // Get our little checkmark image
	    ImageIcon ii = new ImageIcon(IMAGE_DIR+File.separatorChar+
		    "check.gif");
	    view = v;
	    isonimage = ii.getImage();
	}
	
	public String getName() {
	    return "Straigten All Links";
	}

	public Image getImage() {
	    if (straightenAll()) {
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke() {
	    // toggle the Autopropogate
	    setStraightenAll(!straightenAll());
	    view.setStraighten(straightenAll());
	    if (straightenAll()) {
		Iterator i = view.getSelectedLinks().iterator();
		while (i.hasNext()) {
		    ViewObject vo = (ViewObject)i.next();
		    view.promptStraighten(vo);
		}
	    }
	}
    }

   private class ExpandAllMethod extends AbstractPluginMethod{
    
	private Image isonimage;
	View view;

	public ExpandAllMethod(View v) {
	    // Get our little checkmark image
	    ImageIcon ii = new ImageIcon(IMAGE_DIR+File.separatorChar+
		    "check.gif");
	    view = v;
	    isonimage = ii.getImage();
	}
	
	public String getName() {
	    return "Expand All Expandable Nodes";
	}

	public Image getImage() {
	    if (expandAll()) {
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke() {
	    // toggle the Autopropogate
	    setExpandAll(!expandAll());
	    if(contractAll() && expandAll()) 
		setContractAll(!contractAll());
	    view.setExpand(expandAll());
	    if (expandAll()) {
		Iterator i = view.getAllElements().iterator();
		while (i.hasNext()) {
		    ViewElement ve = (ViewElement)i.next();
		    view.promptExpand(ve);
		}
	    }
	}
    }
   private class ContractAllMethod extends AbstractPluginMethod{
    
	private Image isonimage;
	View view;

	public ContractAllMethod(View v) {
	    // Get our little checkmark image
	    ImageIcon ii = new ImageIcon(IMAGE_DIR+File.separatorChar+
		    "check.gif");
	    view = v;
	    isonimage = ii.getImage();
	}
	
	public String getName() {
	    return "Contract All Expanded Nodes";
	}

	public Image getImage() {
	    if (contractAll()) {
		return isonimage;
	    } else {
		return null;
	    }
	}

	public void invoke() {
	    // toggle the Autopropogate
	    setContractAll(!contractAll());
	    if(contractAll()&&expandAll()) 
		setExpandAll(!expandAll());
	    view.setContract(contractAll());
	    if (contractAll()) {
		Iterator i = view.getAllElements().iterator();
		while (i.hasNext()) {
		    ViewElement ve = (ViewElement)i.next();
		    view.promptContract(ve);
		}
	    }
	}
    }
   
   private class ResizeAllMethod extends AbstractPluginMethod{
    
	private View view;
	private GraphicViewFrame gvf;
	private JDialog dialog;
	
	public ResizeAllMethod(View v) {
	    this.view = v;
	}
	
	public String getName() {
	    return "Resize All Nodes";
	}

	public void invoke() {	
	     gvf = ((GraphicView)view).getGraphicViewCanvas().getGraphicViewFrame();
	     String s= InputDialog.getInput(gvf, "Elements Resize", 
			"Specify the expected size of the elements",
			"1.0");
	     
	     Double d = new Double(s);

	     Iterator i = view.getAllElements().iterator();
	     while (i.hasNext()) {
		    ViewObject vo = (ViewObject)i.next();
		    view.resize(vo, d);
	    }
	}
    }

    /** The method to select an object */
    private class SelectMethod extends ObjectMethod {
    
	public SelectMethod (View v) {
	    super(v);
	    name = "Select";
	    instruction = "Select the object";
	}

	protected void operate(ViewObject vo) {
	    view.selectObject(vo);
	}
	
	protected boolean isSuitable(ViewObject vo) {
	    return !vo.isSelected();
	}
    }


    
    /** The method to deselect an object */
    private class DeselectMethod extends ObjectMethod {

	public DeselectMethod (View v) {
	    super(v);
	    name = "Deselect";
	    instruction = "Choose the object to be deselected.";
	}

	protected void operate(ViewObject vo) {
	    view.deselectObject(vo);
	}

	protected boolean isSuitable(ViewObject vo) {
	    return vo.isSelected();
	}
    }

    
    /** The method to expand an object. 
     */
    private class ExpandMethod extends ObjectMethod {
	
	public ExpandMethod(View v) {
	    super(v);
	    name = "Expand";
	    instruction = "Choose the element to be exapnded";
	}

	protected void operate(ViewObject vo) {
	    try {
		((ViewElement)vo).expand();
	    } catch (Exception e) {
		// We really should never face this exception, since we
		// explicitly test to see of the element is expandable.
		D.o(e);
	    }
	}

	protected boolean isSuitable(ViewObject vo) {
	    if (vo instanceof ViewElement) {
		ViewElement ve = (ViewElement)vo;
		return (ve.isExpandable() && !ve.isExpanded());
	    } // else
	    return false;
	}
    }

   
    /** The method to unexpand an object. 
     */
    private class UnexpandMethod extends ObjectMethod {
    
	public UnexpandMethod(View v) {
	    super(v);
	    name = "Contract";
	    instruction = "Choose the element to be contracted";
	}

	protected void operate(ViewObject vo) {
	    try {
		((ViewElement)vo).contract();
	    } catch (Exception e) {
		// We really should never face this exception, since we
		// explicitly test to see of the element is expandable.
		D.o(e);
	    }
	}

	protected boolean isSuitable(ViewObject vo) {
	    if (vo instanceof ViewElement) {
		ViewElement ve = (ViewElement)vo;
		return (ve.isExpandable() && ve.isExpanded());
	    } // else
	    return false;
	}
    }


    /** This method removes a child from a parent.  That is, takes an object
     *  that is within an expandable element, and promotes it to be an
     *  independent element.  Links and attributes should be unaffected. */
    private class PromoteChildMethod extends ObjectMethod {
	
	private ViewElement parent = null;
	private String parent_name = "parent";
	
	public PromoteChildMethod(View v) {
	    super(v);
	    resetMethod();
	}

	protected void operate(ViewObject vo) {
	    ViewElement child = (ViewElement)vo;
	    try {
		parent.removeChild(child);
		child.setParent(null);
	    } catch (Exception e) {
		// Not sure why this would happen.
		D.o(e);
		try {
		    parent.addChild(child);
		    child.setParent(parent);
		} catch (Exception ee) {
		    // If things can't be set back the way they were, do
		    // nothing except spit error.
		    D.o(ee);
		}
	    }
	}

	protected boolean isSuitable(ViewObject vo) {
	    //parent = null; 
	    if (vo instanceof ViewElement) {
		parent = (ViewElement)((ViewElement)vo).getParent();
	    }
	    if (parent != null) {
		name = "Remove from "+parent.getName();
		return true;
	    } // else
	    return false;
	}

	protected void resetMethod() {
	    parent = null;
	    parent_name = "parent";
	    setNameAndInstruction();
	}

	/** Sets the name and instruction for the method, based on the
	 * parent_name field.*/
	private void setNameAndInstruction() {
	    name = "Remove from "+parent_name;
	    instruction = "Choose an element to be removed from "+parent_name;
	}
    }


    /** This method adds a child to an expandable element.  I'm not to sure
     * what the best interaction style is, for now we'll start with picking
     * the child, then the parent. */
    private class AddChildMethod extends ObjectMethod {
	// The order that we expect the child and parent paramters.
	private static final int CHILD = 0;
	private static final int PARENT = 1;
	
	public AddChildMethod(View v) {
	    super(v,2);  // We use two objects here.
	    name = "Push into other element.";
	    instructions[CHILD] = "Select child element.";
	    instructions[PARENT] = "Select parent element.";
	}

	protected boolean isSuitable(ViewObject vo, int n, ViewObject[]
		collected) {
	    D.o("TESTING ADDCHILDMETHOD!!!!!!!!!!!!!!");
	    ViewElement curr;
	    if (vo instanceof ViewElement) {
		curr = (ViewElement)vo;
	    } else return false;
	    if (n==CHILD) {
		// We are looking for a non-expandable element (re-enforcing
		// our commitment that there is only one level of expansion,
		// sigh), without a parent.
		D.o("TESTING CHILD");
		if (curr.isExpandable()) {D.o("EXPANDABLE");}
		return (curr.getParent()==null && !curr.isExpandable());
	    } else {
		// n == PARENT
		D.o("TESTING PARENT");
		return (curr.isExpandable());
	    }
	}

	protected void operate(ViewObject[] paramters) {
	    ViewElement parent = (ViewElement)paramters[PARENT];
	    ViewElement child = (ViewElement)paramters[CHILD];
	    try {
		child.setParent(parent);
		parent.addChild(child);
	    } catch (Exception e) {
		if (child.getParent() == parent) {
		    try { 
			child.setParent(null);
		    } catch (Exception ee) {
			// Could fix things, what can we do?  Barf.
			D.o(e);
		    }
		}
		D.o("Unable to add child to parent.");
		JOptionPane.showMessageDialog(null, 
		    "Unable to add into parent",
		"Semantic Error", JOptionPane.ERROR_MESSAGE);

	    }
	}
    }
    

    /** The method to delete an object. */
    private class DeleteMethod extends ObjectMethod {
    
	public DeleteMethod(View v) {
	    super(v);
	    name = "Delete";
	    instruction = "Choose the element to be deleted";
	}

	protected void operate(ViewObject vo) {
	    view.deleteObject(vo);
	}
    }


    /** Method to view/modify the "comment" associated with an object.  This
     *  is just a workaround while we wait for arbitrary value attribute
     *  support.
     */
    private class ModifyCommentMethod extends ObjectMethod {
	
	ViewObject vo;
	
	public ModifyCommentMethod(View v) {
	    super(v);
	    name = "View/Modify Comment";
	    instruction = "Choose the object whose comment you wish to" + 
			  "view/modify.";
	}

	protected void operate(ViewObject vo) {
	    this.vo = vo;
	    String current_comment = vo.getComment();

	    // Throw up a dialogue to view/modify the comment.
	    CommentDialog cd = new CommentDialog();
	    cd.pack();
	    //cd.setVisible(true);
	    view.showDialog(cd);
	}

	private class CommentDialog extends JDialog {
	    public CommentDialog() {
		D.o("Building comment dialogue");
		
		setTitle("Comment for " + vo.getName());

		// Text area.
		JPanel textpanel = new JPanel();
		JTextArea textarea = new JTextArea(10, 50);
		textarea.setText(vo.getComment());
		JScrollPane jsp = new JScrollPane(textarea); 
		textpanel.add(jsp);

		// Buttons
		JPanel buttonpanel = new JPanel();
		JButton ok_button = new JButton("Change");
		JButton cancel_button = new JButton("Cancel");
		ok_button.addActionListener(new OkButtonListener(textarea));
		cancel_button.addActionListener(new CancelButtonListener());
		buttonpanel.add(ok_button);
		buttonpanel.add(cancel_button);
		
		getContentPane().add(textpanel, BorderLayout.CENTER);
		getContentPane().add(buttonpanel, BorderLayout.SOUTH);
	    }

	    private class OkButtonListener implements ActionListener {
		JTextArea jta;

		public OkButtonListener (JTextArea jta) {
		    this.jta = jta;
		}
		
		public void actionPerformed (ActionEvent e) {
		    vo.setComment(jta.getText());
		    dispose();
		}
	    }

	    private class CancelButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
		    dispose();
		}
	    }
	}
    }
    
    /** The method to rename an object. 
     */
    private class RenameMethod extends ObjectMethod {
	
	public RenameMethod(View v) {
	    super(v);
	    name = "Rename";
	    instruction = "Choose the object to be renamed";
	}

	protected void operate(ViewObject vo) {
	    view.promptRename(vo);
	}
    }

    private class StraightenMethod extends ObjectMethod {
    
	public StraightenMethod(View v) {
	    super(v);
	    name = "Straighten curved link";
	    instruction = "Choose the link to be straightened";
	}

	protected void operate(ViewObject vo) {
	    view.promptStraighten(vo);
	}
    }
    
    private class HighlightMethod extends ObjectMethod {
    
	public HighlightMethod(View v) {
	    super(v);
	    name = "Highlight Selected Element";
	    instruction = "Choose the element to be highlighted";
	}

	protected void operate(ViewObject vo) {
	    vo.setHighlighted(true);
	}
	
    }

    private class UnhighlightMethod extends ObjectMethod {
	
	public UnhighlightMethod(View v) {
	    super(v);
	    name = "Unhighlight Element";
	    instruction = "Choose the element to be unhighlighted";
	}

	protected void operate(ViewObject vo) {
	    vo.setHighlighted(false);
	}
    
    }
    /** The method to resize an object. 
     */
    private class ResizeMethod extends ObjectMethod {
	
	public ResizeMethod(View v) {
	    super(v);
	    name = "Resize";
	    instruction = "Choose the object to be resized";
	}

	protected void operate(ViewObject vo) {
	    view.promptResize(vo);
	}
    }

 
    /** Swaps the direction of a link.  This is going to break the tool when
     *  we have things other than graphic views kicking around.
     */
    private class ChangeLinkDirectionMethod extends ObjectMethod {
	
	public ChangeLinkDirectionMethod(View v) {
	    super(v);
	    name = "Change Link Direction";
	    instruction = "Select the link whose direction is to be changed.";
	}

	protected boolean isSuitable(ViewObject vo) {
	    return (vo instanceof ViewLink);
	}
	
	public void operate(ViewObject vo) {
	    GraphicViewLink gvl = (GraphicViewLink)vo;
	    OMEObject to = gvl.getTo();
	    OMEObject from = gvl.getFrom();
	    try {
		gvl.setTo(from);
		gvl.setFrom(to);
		Point2D.Double ctrl1 = new Point2D.Double(gvl.getcontrol1().x,
			gvl.getcontrol1().y);
		gvl.getcontrol1().setLocation(gvl.getcontrol2().x,
			gvl.getcontrol2().y);
		gvl.getcontrol2().setLocation(ctrl1.x, ctrl1.y);
	    } catch (Exception e) {
		//set the old values
		try {
		    gvl.setTo(to);
		    gvl.setFrom(from);
		    OMEFramework fw = view.getModel().getFramework();
		    JOptionPane.showMessageDialog(null, 
			"Unable to change " + fw.getName(gvl.getType())  
			+ " from " + fw.getName(to.getType()) + " to " 
			+ fw.getName(from.getType()) + ".",
			"Semantic Error",
		    JOptionPane.ERROR_MESSAGE);
		} catch (Exception f) {
		    D.o(f);
		    // we should never get here as we are just setting
		    // the old values of "to" and "from" in the link
		}
	    }	    
	}
    }


    private class ChangeElementTypeMethod extends AbstractPluginMethod {
	
	private ViewObject linkobject;
	private View view;
	private Object type;	
	private Object oldtype;
	private final int CONTEXT = 1;
	private final int OBJECT = 4;
	private final int DONE = 367;
	private int nextp = CONTEXT;
	
	public ChangeElementTypeMethod(View view) {
	    this.view = view;
	}
	
	public String getName() {
	    return "Change Element Type";
	}

	public void passParameter(Collection c) {
	    if (nextp == CONTEXT) {
		ViewContext con = (ViewContext)c.iterator().next();
		if (con.associatedObject() != null) {
		    linkobject =con.associatedObject();
		    nextp = DONE;
		} else {
		    nextp = OBJECT;
		}
	    } else if (nextp == OBJECT) {
		linkobject = (ViewObject)c.iterator().next();
		nextp = DONE;
	    }
	}

	public PluginParameter nextParameter() {
	    if (linkobject != null || nextp == DONE) {
		return null;
	    } else if (nextp == CONTEXT) {
		return contextParameter();
	    } else if (nextp == OBJECT) {
		return objectParameter();
	    }
	    return null;  // be happy compiler.
	}

	public void invoke() {
	    
	    GraphicViewElement gve = (GraphicViewElement)linkobject;
//	    GraphicViewObject gvo = (GraphicViewObject)linkobject;
	    OMEFramework fw = view.getModel().getFramework();
	    // Create the choices
	    Iterator i = fw.getAllInstantiable();	    
	    Vector v = new Vector();	    
	    while (i.hasNext()) {
		Choice c = new Choice();		
		Object objecttype = (Object) i.next();
		if ( !fw.isLink(objecttype)) {
		    String name = fw.getName(objecttype);
		    c.setName(name);
		    c.setChoiceObject(fw.getType(name));
		    v.add(c);
		}
	    }
	    // Show the dialogue to get the type.
	    RadioButtonChooser rbc = new RadioButtonChooser(null,
		    "Change Element Type To:", true, v);
	    if (rbc.showDialog() == RadioButtonChooser.CONTINUE) {
		Iterator it = v.iterator();
		// get the choice
		while (it.hasNext()) {
		    Choice c = (Choice)it.next();
		    if (c.chosen()) {
			type = c.choiceObject();
		    }
		}
		// and go
		if (type != null) {
		    oldtype = linkobject.getType(); 
		    try {
			D.o("Old type is " + oldtype +" ; new type is " +type);
			linkobject.setType(type);
		    } catch (Exception e) {
			// we had a problem setting new type
			// so let's just go back to old type and quit.
			
			try {
			    linkobject.setType(oldtype);
			    JOptionPane.showMessageDialog(null, 
				"Unable to change " + oldtype  
				+ " to " + type + ".",
				"Semantic Error",
				JOptionPane.ERROR_MESSAGE);
			} catch (Exception f) {
			    D.o(f);
		    	}
		    }
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
	    //super.resetMethod();
	}

	public void cancelled() {
	    linkobject = null;
	    nextp = CONTEXT;
	}

	public boolean isEnabled(ViewContext con) {
	    ViewObject vo = con.associatedObject();
	    return ((vo !=null) && (vo instanceof ViewElement));
//	    return ((vo !=null));
	}

	private PluginParameter objectParameter() {
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		    "Select the link whose type should be changed", 
		     PluginParameter.OMEObjectType);
	}

	private PluginParameter contextParameter() {
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		    null, PluginParameter.OMEContextType);
	}
    }

    private class ChangeLinkTypeMethod extends AbstractPluginMethod {
	
	private ViewObject linkobject;
	private View view;
	private Object type;	
	private Object oldtype;
	private final int CONTEXT = 1;
	private final int OBJECT = 4;
	private final int DONE = 367;
	private int nextp = CONTEXT;
	
	public ChangeLinkTypeMethod(View view) {
	    this.view = view;
	}
	
	public String getName() {
	    return "Change Link Type";
	}

	public void passParameter(Collection c) {
	    if (nextp == CONTEXT) {
		ViewContext con = (ViewContext)c.iterator().next();
		if (con.associatedObject() != null) {
		    linkobject =con.associatedObject();
		    nextp = DONE;
		} else {
		    nextp = OBJECT;
		}
	    } else if (nextp == OBJECT) {
		linkobject = (ViewObject)c.iterator().next();
		nextp = DONE;
	    }
	}

	public PluginParameter nextParameter() {
	    if (linkobject != null || nextp == DONE) {
		return null;
	    } else if (nextp == CONTEXT) {
		return contextParameter();
	    } else if (nextp == OBJECT) {
		return objectParameter();
	    }
	    return null;  // be happy compiler.
	}

	public void invoke() {
	    
	    GraphicViewLink gvl = (GraphicViewLink)linkobject;
//	    GraphicViewObject gvo = (GraphicViewObject)linkobject;
	    OMEFramework fw = view.getModel().getFramework();
	    // Create the choices
	    Iterator i = fw.getAllInstantiable();	    
	    Vector v = new Vector();	    
	    while (i.hasNext()) {
		Choice c = new Choice();		
		Object objecttype = (Object) i.next();
		if (fw.isLink(objecttype)) {
		    String name = fw.getName(objecttype);
		    c.setName(name);
		    c.setChoiceObject(fw.getType(name));
		    v.add(c);
		}
	    }
	    // Show the dialogue to get the type.
	    RadioButtonChooser rbc = new RadioButtonChooser(null,
		    "Change Link Type To:", true, v);
	    if (rbc.showDialog() == RadioButtonChooser.CONTINUE) {
		Iterator it = v.iterator();
		// get the choice
		while (it.hasNext()) {
		    Choice c = (Choice)it.next();
		    if (c.chosen()) {
			type = c.choiceObject();
		    }
		}
		// and go
		if (type != null) {
		    oldtype = linkobject.getType(); 
		    try {
			D.o("Old type is " + oldtype +" ; new type is " +type);
			linkobject.setType(type);
		    } catch (Exception e) {
			// we had a problem setting new type
			// so let's just go back to old type and quit.
			
			try {
			    linkobject.setType(oldtype);
			    JOptionPane.showMessageDialog(null, 
				"Unable to change " + oldtype  
				+ " to " + type + ".",
				"Semantic Error",
				JOptionPane.ERROR_MESSAGE);
			} catch (Exception f) {
			    D.o(f);
		    	}
		    }
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
	    //super.resetMethod();
	}

	public void cancelled() {
	    linkobject = null;
	    nextp = CONTEXT;
	}

	public boolean isEnabled(ViewContext con) {
	    ViewObject vo = con.associatedObject();
	    return ((vo !=null) && (vo instanceof ViewLink ));
//	    return ((vo !=null));
	}

	private PluginParameter objectParameter() {
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		    "Select the link whose type should be changed", 
		     PluginParameter.OMEObjectType);
	}

	private PluginParameter contextParameter() {
	    return new PluginParameter(PluginParameter.CARDINALITY_ONE,
		    null, PluginParameter.OMEContextType);
	}
    }

    
    /** The method to export the view
     */
    private class ExportMethod extends AbstractPluginMethod {
	View view;

	public ExportMethod(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Export";
	}

	public void invoke() {
	    ((GraphicView)view).export();
	}
    }

   /** The method to print the view
     */
    private class PrintMethod extends AbstractPluginMethod {
	View view;

	public PrintMethod(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Print";
	}
	
	public Image getImage() {
	    // Plugins shouldn't know about directory images!
	    ImageIcon ic = new ImageIcon("images/print.gif");
	    return ic.getImage();	    
	}

	public void invoke() {
	    ((GraphicView)view).print();
	}
    }

    
    /** The method to hide an object. 
     */
    private class HideMethod extends ObjectMethod {

	public HideMethod(View v) {
	    super(v);
	    name = "Hide Object";
	    instruction = "Select the object to be hidden";
	}
	
	public void operate(ViewObject vo) {
	    vo.setHidden(true);
	}
    }


    /** This method unhides all objects */
    private class UnhideAllMethod extends AbstractPluginMethod {
	private View view;

	public UnhideAllMethod(View view) {
	    this.view = view;
	}

	public String getName() {
	    return "Unhide all";
	}

	// We don't need any paramters.

	public void invoke() {
	    Iterator i;
	    i = getAllObjects();
	    while (i.hasNext()) {
		((ViewObject)i.next()).setHidden(false);
	    }
	}

	public boolean isEnabled(ViewContext con) {
	    Iterator i;
	    i = getAllObjects();
	    while (i.hasNext()) {
		if (((ViewObject)i.next()).isHidden()) return true;
	    }
	    return false;
	}

	private Iterator getAllObjects() {
	    LinkedList ll = new LinkedList();
	    ll.addAll(view.getAllElements());
	    ll.addAll(view.getAllLinks());
	    return ll.iterator();
	}
    }

    private class RemoveAttributeSubmenu extends AbstractPluginMethod {
	View view;
	public RemoveAttributeSubmenu(View view) {
	    this.view = view;	    
	}

	public String getName() {
	    return "Remove a Symbolic Attribute";
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
			list.add(new RemoveAttribute(att));
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

    private class AddAttributeSubmenu extends AbstractPluginMethod {
	View view;
	public AddAttributeSubmenu(View view) {
	    this.view = view;	    
	}

	public String getName() {
	    return "Add a Symbolic Attribute";
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
//	    IStarPropogator p = new IStarPropogator(vo.getModelObject(),view);
//	    p.evaluate();
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
