package OME;


import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/** This class provides an interface to display and edit a graphic view, 

 *  as well as access other relevant functionalities. 

 *  It then interacts directly with <code> GraphicView </code>, which is a class 

 *  storing all graphic view related information, to realize user's requests.

 * 

 *  @author Ying Shi

 *  @version 28 Aug 1998 

 *

 *  @see GraphicView

 *  @see ScrollingPanel

 */

class GraphicViewCanvas extends JPanel implements Printable {



    static final int ICON_HEIGHT = 16;

    

    private JPopupMenuPlus popupmenu;

    private Map index2type;

    

    private JMenuBar menuBar;

//    private JToolBar toolBar;

    private GraphicView view;

    private GraphicViewFrame gframe;

    private OME ome;

    

    private String m_sCurrFile = "";

    private String m_sCurrDir = "";

    

    private Point clickedp;		    // Used only for mouse drags. 

    private boolean antialias = true;	    // How we draw our link lines.

    private boolean wasdragging = false;    // A module variable used in a

					    // optimization.

    private boolean boxclosed = false;

    private SelectionBox selectionbox;	    // If the user is in the midst of

    // a group selection using a 'selection box`, this variable will be

    // non-null.



    // The types of OMEFramework.Method.Parameter we support.

    static Class stringClass;

    static Class integerClass;

    static Class LocationClass;

    static Class GraphicLocationClass;

    static Class OMEObjectClass;

    static Class OMEElementClass;

    static Class OMELinkClass;

    static Class ViewContextClass;



    private Collection plugins;



    // MODES

    private static final int NORMAL_MODE = 0;

    private static final int GET_PARAMETER = 1;

    private static final int LINK_TYPE = 1;

    private static final int ELEMENT_TYPE = 0;

    private int mode;

    private GVCParameterCollector pcollector;

    

    /** Takes care of parameter collecting for methods.*/

    private class GVCParameterCollector {

    

	GraphicViewCanvas gvc;

	private PluginMethod method = null;

	private Class classType;

	private Vector v;

	private JToggleButton button = null;

	private ViewContext context;

	

	public GVCParameterCollector(GraphicViewCanvas gvc) {

	    this.gvc = gvc;

	}



	/** Initiates parameter collecting.

	 *  @param method   The method for whom we are collecting parameters.

	 */

	protected void startCollecting(PluginMethod method, ViewContext context,

		JToggleButton button) {

	    if (method == null) {

		D.a("Can't collect for a null method.");

	    }

	    

	    if (this.method != null) {

		// User has started a method while in the midst of another.

		// Cancel the one we were working on.

		cancelMethod();



		// Now we can start the new one.

	    }

	    

	    this.method = method;

	    this.context = context;

	    v = new Vector();



//	    D.o("Have toggle button: "+(button!=null));

	    this.button = button;



	    PluginParameter p = method.nextParameter();

	    if (p == null) {

//		D.o("No parameters wanted.");

		method.invoke();

		resetPC();

		view.updateView();

		repaint();

	    } else {

		getParameter(p);

	    }



	}

	

	/** Prepare the application to acquire the desired parameter. */

	private void getParameter(PluginParameter p) {

	    classType = p.getType();



//	    D.o("Getting a parameter.");

	    

	    if (classType == stringClass) {

		// Ignore cardinality (for now)

		String s = JOptionPane.showInputDialog(gvc, p.getMessage());

		v.add(s);

		reportParameter();

	    } else if (classType == integerClass) {

		String s;

		Integer i = null;

		while (i == null) {

		    try {

			s = JOptionPane.showInputDialog(gvc, p.getMessage());

			i = new Integer(s);

		    } catch (Exception e) {

			// User did not enter an integer.  Try again.

			// A beep might be nice.

		    }

		}

		v.add(i);

		reportParameter();

	    } else if (classType == ViewContextClass) {

//		D.o("Feeding a context.");

		//ViewContext con = view.generateContext(getRightClickedP());

		v.add(context);

		reportParameter();

	    } else {

		//enter GET_PARAMETER mode

//		D.o("Entering get parameter mode.");

		gvc.setMode(GET_PARAMETER, p.getMessage());

	    }

	}



	/** Feeds the parameter we've been collecting to our method, and

	 *  handles the next parameter asked for by our method. */

	private void reportParameter() {

	    method.passParameter(v);

	    PluginParameter p = method.nextParameter();



	    // We're done with v now, kill it. 

	    v = new Vector();

	    

	    if (p == null) {

		//We're done here, invoke the method

		method.invoke();

		resetPC();

	    } else {

		//Keep on truckin'.

		getParameter(p);

	    }

	    // The state of the model might have changed.  Better repaint.

	    view.updateView();

	    repaint();

	}



	/** Receive mousepressed events from the user (while in GET_PARAMETER

	 *  mode).

	 */

	protected void processMousePressed(MouseEvent me) {

	    Point p = view.toView(me.getPoint());

	    boolean foundone = false;



//	    D.o("Processing mouse click in parameter mode.");

	    

	    if (classType==LocationClass || classType==GraphicLocationClass) {

		D.o("Location parameter.");

		View.GraphicLocation gl = new View.GraphicLocation();

		gl.setPoint(p);

		v.add(gl);

		foundone = true;

	    } else if (classType == OMEObjectClass) {

		D.o("Object parameter");

		GraphicViewObject gvo = view.findObject(p);

		if (gvo != null) {

		    v.add(gvo);

		    foundone = true;

		}

	    } else if (classType == OMEElementClass) {

		GraphicViewElement gve = view.findElement(p);

		if (gve != null) {

		    v.add(gve);

		    foundone = true;

		}

	    } else if (classType == OMELinkClass) {

		GraphicViewLink gvl = view.findLink(p);

		if (gvl != null) {

		    v.add(gvl);

		    foundone = true;

		}

	    } else {

		// we don't support this type of parameter.

		D.o("Unsupported parameter.");

	    }

	    if (foundone) {

		// Do we stay in this mode or return to normal mode?

		// We should probably look at the CTRL_MASK etc., but at

		// the moment we simply go back to normal mode.

		gvc.setMode(NORMAL_MODE,null);



		// Again with the ignoring cardinality...

		reportParameter();

	    } // Else keeping waiting for the parameter.

	}



	/** The user has abandoned the method he was in the middle of.  Abort

	 *  abort!

	 */

	protected void cancelMethod() {

//	    D.o("cancelling method");

	    gvc.setMode(NORMAL_MODE,null);

	    method.cancelled();

	    resetPC();

	}



	/** Resets the parameter collector so that it is ready to start a new

	 *  method.

	 */

	private void resetPC() {

//	    D.o("Resetting parameter collector.");

	    //Untoggle our button if we had one.

	    if (button != null) {

		button.setSelected(false);

	    }

	    // Clear our fields. 

	    method = null;

	    button = null;

	}

    }

    

    /** Constructs the canvas.

     *

     *  @param menuBar 	the menu bar created by <code>GraphicViewFrame</code>.

     *  @param toolBar 	the tool bar created by <code>GraphicViewFrame</code>.

     *  @param gview 	the <code> GraphicView </code> object. It better not

     *			be null.

     *  @param ome 	the main window.

     *  @param gframe 	the main graphic view frame window.

     */

    public GraphicViewCanvas(JMenuBar menuBar, GraphicView gview, OME ome,

	GraphicViewFrame gframe /* multiple view,  int state*/) {



	//try {

	    stringClass = String.class;

	    integerClass = Integer.class;

	    LocationClass = View.Location.class;

	    GraphicLocationClass = View.GraphicLocation.class;

	    OMEObjectClass = OMEObject.class;

	    OMEElementClass = OMEElement.class;

	    OMELinkClass = OMELink.class;

	    ViewContextClass = ViewContext.class;

	/*} catch (Exception e) {

	    D.o(e);

	}*/

	

	D.o("Creating GraphicViewCanvas");



	this.gframe = gframe;

	this.ome = ome;

	this.menuBar = menuBar;

//	this.toolBar = toolBar;

	view = gview;

	pcollector = new GVCParameterCollector(this);

	

	// setup the GraphicView.

	view.setDisplayBounds(new Rectangle(new Point(0,0),gframe.getSize()));

	view.setGraphicViewCanvas(this);

	

	// Gui stui.

	setLayout(null);

	setBorder(BorderFactory.createEtchedBorder());

	addComponentListener( new GVCComponentAdapter() );

	addMouseListener( new GVCMouseAdapter() );

	addMouseMotionListener( new GVCMouseMotionAdapter());

	addKeyListener( new GVCKeyAdapter());

	requestFocus();



	//get the plugins.  

	plugins = view.getModel().getPlugins();

	// OMEDefaultPlugin is a special case, I'm wondering if we should have

	// individual access to it.  At any rate, we need to hook the save

	// method into the GVFrame.

	hookupSaveMethod();

	

	index2type = new HashMap();

	popupmenu = null; // setPopupMenu();

//	if ( state <= 1 ) {

	    setMenuBar();

	    setToolBar();

//	}



	D.o("Created GraphicViewCanvas");

    }



    /** Searches through our plugins for the OMEDefaultPlugin, gets the Save

     *  method, and hooks it in to the GraphicViewFrame (for window closing).*/

    public void hookupSaveMethod() {

	Iterator plugit = plugins.iterator();

	while (plugit.hasNext()) {

	    OMEPlugin p = (OMEPlugin)plugit.next();

	    if (p instanceof OMEDefaultPlugin) {

		gframe.setWindowListener(
			((OMEDefaultPlugin)p).getSaveMethod(view));

/*multiple_view
		gframe.setInternalFrameAdapter(
			((OMEDefaultPlugin)p).getSaveMethod(view));
*/
		return;

	    }

	}

    }



    /** Recursively populates the given Menu using the OMEPlugin/Method

     *  interfaces. 

     *

     *  @param menu	    The menu we are populating.

     *  @param menumethod   The PluginMethod we are using to populate the menu.

     *  @param p	    The point associated with initiation of methods

     *			    from this menu (used by makeMenuItem).

     */

    private void populateMenu(JMenuPlus menu, PluginMethod menumethod, Point p) {

	D.o("Populating Menu");

	ViewContext ovc = view.generateContext(p);

	Collection c = menumethod.getSubmenu(ovc);

	if (c != null) {

	    Iterator i = c.iterator();

	    while (i.hasNext()) {

		PluginMethod method = (PluginMethod)i.next();

		//method may be a normal method, or a submenu.
		Collection subcollection = method.getSubmenu(ovc);

		if (subcollection != null) {
		    		    
		    if (method instanceof MenuSeparatorMethod) {

			menu.addSeparator();

		    } else {


			JMenuPlus submenu = new JMenuPlus(method.getName());

			menu.add(submenu);

			submenu.setEnabled(method.isEnabled(ovc));

			populateMenu(submenu, method, p);
		    }

		} else {

		    // Normal case.  Hook up the button.

		    JMenuItem jmi = makeMenuItem(method, p, ovc);

		    menu.add(jmi);

	    
		}

	    }

	}

    }



    /** Returns a JMenuItem with the given PluginMethod "hooked up".

     *  @param method	A "non-submenu" PluginMethod.

     *  @param p	The point associated with the initiation of this

     *                  method (used by the ActionAdapter).

     */

    private JMenuItem makeMenuItem(PluginMethod method, Point p, ViewContext 

	    ovc) {

	

	//JMenuItem jmi = new JMenuItem(method.getName());

	JMenuItem jmi = new JMenuItem();

	jmi.setEnabled(method.isEnabled(ovc));

	jmi.setText(method.getName());

	Image im = method.getImage();

	if (im != null) {

	    ImageIcon ic = iconifyImage(im);

	    jmi.setIcon(ic);

	}

	jmi.addActionListener(new GVCActionAdapter(method, p, this));

	return jmi;

    }



    /** Scales image and converts ito an ImageIcon. */

    private ImageIcon iconifyImage(Image im) {

	if (im!=null) {

	    ImageTable it = view.getImageTable();

	    //im = it.getScaling(im,ICON_HEIGHT/it.getHeight(im));

	    im = it.getSizing(im,0,ICON_HEIGHT);

	    return new ImageIcon(im);

	} else {

	    return null;

	}

    }



    /** Creates and populates the popup menu.

     *  @return 	the newly created popup menu.

     */

    protected JPopupMenuPlus setPopupMenu (MouseEvent me) {

	Point p = view.toView(me.getPoint());

	

	D.o("Creating popup");

	

	JPopupMenuPlus popupmenu = new JPopupMenuPlus(me);        

	

	Iterator plugit = plugins.iterator();

	Collection c = new Vector();

	while (plugit.hasNext()) {

	    Collection methods = 

		    ((OMEPlugin)plugit.next()).getPopupMethods(view);

	    if (methods != null) {

		c.addAll(methods);

	    }

	}



	D.o("Got methods.");

	

	// Too bad JPopupMenus aren't JMenus.

	ViewContext ovc = view.generateContext(p);

	Iterator i = c.iterator();

	while (i.hasNext()) {

	    Object o = i.next();

	    if (o instanceof PluginMethod){

		if (o instanceof PopupMenuSeparatorMethod) {

		    popupmenu.addSeparator();

		} else {

		    PluginMethod method = (PluginMethod)o;

		    //method may be a normal method, or a submenu.

		    Collection subcollection = method.getSubmenu(ovc);

		    if (subcollection != null) {

			JMenuPlus submenu = new JMenuPlus(method.getName());

			populateMenu(submenu, method, p);

			popupmenu.add(submenu);

			submenu.setEnabled(method.isEnabled(ovc));

		    } else {

			// Normal case.  Hook up the button.

			JMenuItem jmi = makeMenuItem(method, p, ovc);

			popupmenu.add(jmi);

			//jmi.setEnabled(method.isEnabled(ovc));

		    }

		}

	    }

	}

	return popupmenu;

    }

    



    /** Populates the menu bar created by and passed from <code>

     * GraphicViewFrame</code>.

     */

    protected void setMenuBar() {

	

	Vector usedmnemonics = new Vector();

        Character mnemonic;

	LinkedList existing_menuitems = new LinkedList();

	    

	Iterator plugit = plugins.iterator();

	Collection c = new Vector();

	while (plugit.hasNext()) {

	    Collection methods = 

		    ((OMEPlugin)plugit.next()).getMenubarMethods(view);

	    if (methods != null) {

		c.addAll(methods);

	    }

	}

	Iterator i = c.iterator();

	while (i.hasNext()) {

	    MenuMethod menumethod = (MenuMethod)i.next();

	    if (!existing_menuitems.contains(menumethod)){

	    // We assume that all methods are menuMethods.	    

		String name = menumethod.getName();

		JMenuPlus menu = new JMenuPlus(name);

		menu.addMenuListener(new MenuBarMenuListener(menumethod));

		if (existing_menuitems.add(menumethod))

		    D.o("menumethod" + name + "added==================");

	    // set the mnemonic for this menu

		int j = 0;

		do {

		    mnemonic = new Character(name.charAt(j++));

		} while ((usedmnemonics.contains(mnemonic)) && (name.length()) > j);

		if (j < name.length()) {

		    usedmnemonics.add(mnemonic);

		    menu.setMnemonic(mnemonic.charValue());

		}

	    

	    //populateMenu(menu, menumethod, null);

		menuBar.add(menu);

	    }

	}

    }

    





    /** Populates the tool bar, which is created by and passed from <code>

     *  GraphicViewFrame </code>.

     */

    protected void setToolBar() {



	Iterator plugit = plugins.iterator();

	Collection c = new Vector();

	while (plugit.hasNext()) {

	    Collection methods = 

		    ((OMEPlugin)plugit.next()).getToolbarMethods(view);

	    if (methods != null) {

		c.addAll(methods);

	    }

	}

	Iterator i = c.iterator();



	while (i.hasNext()) {

	    //We're going to add a new toolbar...

	    PluginMethod barmethod = (PluginMethod)i.next();

	    JToolBar newbar = new JToolBar();

	    newbar.setName(barmethod.getName());

	    Iterator ii;

	    if (barmethod.getSubmenu() != null) {

		ii = barmethod.getSubmenu().iterator();

	    } else {

		// The method wasn't wrapped in a menu, just create a

		// singleton bar.

		ii = Collections.singleton(barmethod).iterator();

	    }

	    while (ii.hasNext()) {

		PluginMethod method = (PluginMethod)ii.next();

		// Do Image Stuff

		Image im = method.getImage();

		ImageIcon ic = iconifyImage(im);

		// Add button

		JToggleButton jb = new JToggleButton(method.getName(),ic);

		jb.setRequestFocusEnabled(false);

		jb.setMargin(new Insets(1,1,1,1));

		jb.setToolTipText(method.getName());

		jb.setFont(new Font("SansSerif",Font.PLAIN,9));

		jb.setVerticalTextPosition(jb.BOTTOM);

		jb.setHorizontalTextPosition(jb.CENTER);

		jb.addActionListener(new GVCActionAdapter(method, jb, this));

		newbar.add(jb);

//		toolBar.add(jb); // everything goes on the same bar, for now.

	    }



	    gframe.addToolBar(newbar);

//	    toolBar.addSeparator();

	}

}



    /** Returns the private member, view.

     *  @return Private member view, the <code> GraphicView </code> object.

     */

    protected GraphicView getData() {

	return view;

    }



    protected GraphicViewFrame getGraphicViewFrame() {

	return gframe;

    }

 

    /** Displays the given JDialog to the user. */

    protected void showDialog(JDialog jd) {

	repaint();

	jd.setModal(true);

	jd.pack();

	jd.setLocationRelativeTo(this);

	jd.setVisible(true);

    }



    

    // Vertical and horizontal scrollbars

    //

    JScrollBar sbv; 

    JScrollBar sbh; 



    /** Sets the view value in <code> GraphicView </code> according to the value of the

     *  vertical scroll bar.

     *  @param value 	the value of the vertical scroll bar.

     */

    protected void setSbvValue(int value) {

	view.getDisplayBounds().y = value;//+view.getViewBounds().y;

	//adjustScrollBar();

	view.refreshVisible();

    }





    /** Sets the view value in <code> GraphicView </code> according to the value 

     *  of the horizontal scroll bar.

     *  @param value 	the value of the horizontal scroll bar.

     */

    protected void setSbhValue(int value) {

	view.getDisplayBounds().x = value;//+view.getViewBounds().x;

	//adjustScrollBar();

	view.refreshVisible();

    }





    /** Sets the value of the scroll bars according to the view in <code>

     *  GraphicView </code>.

     */

    protected void adjustScrollBar() {

	int hvalue = view.getDisplayBounds().x;

	int hextent = view.getDisplayBounds().width;

	int hmin = view.getViewBounds().x;

	int hmax = view.getViewBounds().x + view.getViewBounds().width;

	

	int vvalue = view.getDisplayBounds().y;

	int vextent = view.getDisplayBounds().height;

	int vmin = view.getViewBounds().y;

	int vmax = view.getViewBounds().y + view.getViewBounds().height;



	// The following two if statements are a work around needed because

	// when the extent is >= the viewbounds, the JScrollBar disappears.

	if (hextent >= hmax-hmin) {

	    hextent = hmax-hmin-1;

	}

	if (vextent >= vmax-vmin) {

	    vextent = vmax-vmin-1;

	}

	

	sbh.setValues(hvalue, hextent, hmin, hmax);

	sbv.setValues(vvalue, vextent, vmin, vmax);

	

	sbh.setBlockIncrement( view.getDisplayBounds().width/2 );

	sbv.setBlockIncrement( view.getDisplayBounds().height/2 );



	/*

	D.o("hvalue: "+hvalue+"\nhextent: "+hextent+"\nhmin: "+hmin

		+"\nhmax: "+hmax);

	D.o("vvalue: "+vvalue+"\nvextent: "+vextent+"\nvmin: "+vmin

		+"\nvmax: "+vmax);	    	

	*/

    }



    

    /** Passes the scroll bar objects to this class.

     *

     *  @param psbv  the vertical scroll bar object.

     *  @param psbh  the horizonal scroll bar object.

     */

    protected void SetScrollbars( JScrollBar psbv, JScrollBar psbh ) { 

	sbv = psbv;

	sbh = psbh;

    }





    /** Toggles selection.

     *  @param p 	the last clicked point.

     */

    protected void toggleSelect(Point p) {

	D.o("ToggleSelecting");

	GraphicViewElement ge;

	GraphicViewLink gl;



	setClickedP(p);

	

	if((ge=view.findElement(p))!=null) {

	    if(ge.isSelected()) {

		ge.setSelected(false);

		//D.o("Deselected: "+ge.getName());

	    } else {

		ge.setSelected(true);

		//D.o("Selecting: "+ge.getName());

	    }

	    view.markDirty(ge.getSelectableBounds());

	    

	} else if((gl=view.findLink(p)) != null) {

	    if(gl.isSelected()) {

		gl.setSelected(false);

		//D.o("Deselecting: " + gl.getName());

	    } else {

		gl.setSelected(true);

		//D.o("Selecting: "+gl.getName());

	    }

	    view.markDirty(gl.getSelectableBounds());

	} else if((gl=view.findLinkControlPoint1(p)) != null) {

	    if(gl.isSelected()) {

		gl.setSelected(false);

		//D.o("Deselecting: " + gl.getName());

	    } else {

		gl.setSelected(true);

		//D.o("Selecting: "+gl.getName());

	    }

	    view.markDirty(gl.getSelectableControlBounds1());

	}  else if((gl=view.findLinkControlPoint2(p)) != null) {

	    if(gl.isSelected()) {

		gl.setSelected(false);

		//D.o("Deselecting: " + gl.getName());

	    } else {

		gl.setSelected(true);

		//D.o("Selecting: "+gl.getName());

	    }

	    view.markDirty(gl.getSelectableControlBounds2());

	} 

    }





    /** Makes selection.

     *  @param p 	the last clicked point.

     */

    protected void select(Point p) {

	GraphicViewElement ge;

	GraphicViewLink gl;

	setClickedP(p);

	

	view.deselectAll();

	D.o("Deselecting all.");

	

	if((ge=view.findElement(p)) != null) {

	    ge.setSelected(true);

	} else if((gl=view.findLink(p)) != null) {

	    gl.setSelected(true);

	} else if ((gl=view.findLinkControlPoint1(p)) != null) {

	    gl.setSelected(true);

	} else if ((gl=view.findLinkControlPoint2(p)) != null) {

	    gl.setSelected(true);

	}

    }



    private static final float dash[] = {10.0f,5.0f,5.0f,5.0f};

    /** Returns a dashed stroke. */

    private Stroke getDashedStroke() {

	return new BasicStroke(3.0f, BasicStroke.CAP_BUTT,

		BasicStroke.JOIN_MITER,10.0f,dash,0.0f);

    }

    





    /** Draws an expanded element.

     *  @param g	the <code> Graphics </code> to draw on.

     *  @param ge	the expanded element to be drawn.

     */

    protected void drawExpandedElements(Graphics2D g, GraphicViewElement ge) {

	

	Rectangle rec = ge.getExpandedBounds();

	Color bgcolor = getBackground();

	g.setColor (new Color ((int)(0.9*bgcolor.getRed()),

		               (int)(0.9*bgcolor.getGreen()),

		               (int)(0.9*bgcolor.getBlue())));

	g.fillArc(rec.x+2, rec.y+2, rec.width-4, rec.height-4, 0, 360);

	g.setColor(Color.black);



	Stroke strokeholder = g.getStroke();

	g.setStroke(getDashedStroke());

	g.drawArc(rec.x+2, rec.y+2, rec.width-4, rec.height-4, 0, 360);

	g.setStroke(strokeholder);

	

	// Draws the element image.

	drawElements(g, ge); 

    }

    



    /** Draws an element.

     *  @param g 	the <code> Graphics </code> to draw on.

     *  @param ge	the element to be drawn.

     */

    protected void drawElements(Graphics2D g, GraphicViewElement ge) {

	

	//D.o("Drawing element: "+ge.getName());

	g.drawImage(ge.getImage(), ge.getImageBounds().x,

		ge.getImageBounds().y, this);

	

	drawText(g, ge, ELEMENT_TYPE);



	// Now draw attributes.

	drawAttributes(g,ge);

    }



    private void drawAttributes(Graphics2D g, GraphicViewObject gvo) {

	Iterator i = gvo.getAttributes();

	while (i.hasNext()) {

	    GraphicViewObject.GraphicViewAttribute gva = 

		(GraphicViewObject.GraphicViewAttribute)i.next();

	    if (gva.getImage() != null) {

		g.drawImage(gva.getImage(), gva.getBounds().x, 

			gva.getBounds().y, this);

	    }

	}

    }





    /** Draws an object's text, with each line cetnred over it's text bounds. */

    private void drawText(Graphics2D g, GraphicViewObject go, int type) {

    	//g.setFont(go.getFont());

	Iterator textattributes = go.getTextAttributes();

	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

		RenderingHints.VALUE_ANTIALIAS_OFF);



	while (textattributes.hasNext()) {

	    GraphicViewObject.GraphicViewTextAttribute gvta =

		(GraphicViewObject.GraphicViewTextAttribute)textattributes

		.next();

	    Iterator i = gvta.getText(g.getFontRenderContext());

	    while (i.hasNext()) {

		Pair pair = (Pair)i.next();

		TextLayout tl = (TextLayout)pair.first;

		Point p = (Point)pair.second;

		if (type == ELEMENT_TYPE ) {

		    tl.draw(g, p.x, p.y);

		} else if (type == LINK_TYPE) {

		    tl.draw(g, go.getImageBounds().x, go.getImageBounds().y);

		}

	    }

	    

	}



	setAntialiasing(g);

    }

    



    /** Draws a link.

     *  @param 	the <code> Graphics </code> to draw on.

     *  @param gl	the link to be drawn.

     */

    private void drawLinks(Graphics2D g, GraphicViewLink gl) {

	GraphicViewObject from = (GraphicViewObject)gl.getFrom();

	GraphicViewObject to = (GraphicViewObject)gl.getTo();



	// images and lines are drawn by the system with a different bias,

	// however, we are using images for arrowheads...



	gl.getstart1().setLocation(from.getImageBounds().x+from.getImageBounds().getWidth()/2,

		from.getImageBounds().y+from.getImageBounds().getHeight()/2);

	gl.getend2().setLocation(to.getImageBounds().x +

		to.getImageBounds().getWidth()/2,

		to.getImageBounds().y + to.getImageBounds().getHeight()/2);

	    

	if (gl.getend1().x == 0.0) {

	    gl.init();

	}

	gl.getQuad1().setCurve(gl.getstart1(), gl.getcontrol1(), gl.getend1());

	gl.getQuad2().setCurve(gl.getstart2(), gl.getcontrol2(), gl.getend2());

	

	setAntialiasing(g);

	g.translate(-0.5,-0.5);

	Stroke s = g.getStroke();

	g.setStroke(gl.getStroke());

/*	g.drawLine(from.getCentre().x, from.getCentre().y,

			to.getCentre().x, to.getCentre().y);

*/

	g.setPaint(gl.getColor());

	

	g.draw((Shape) gl.getQuad1());

	g.draw((Shape) gl.getQuad2());

//	g.draw((Shape) gl.getctrl1());

//	g.draw((Shape) gl.getctrl2());

//	g.setPaint(Color.magenta);

//		g.fill(gl.getctrl1());

//		g.fill(gl.getctrl2());

	

	g.setPaint(Color.blue);

	g.setStroke(s);

	g.translate(.5,.5);

	

	g.drawImage(gl.getImage(), gl.getImageBounds().x, 

		gl.getImageBounds().y, this);

	

	if (gl.getName() != null) {

	    drawText(g, gl, LINK_TYPE);

	}



	// And draw attributes.

	drawAttributes(g,gl);

    }



    // caching stuff here.... sadly still used

    BufferedImage im3;

    Dimension im3s;

    Graphics2D im3g;



    /** Sets the antialiasing of the passed graphics context to that of our

     * current `antialias' setting. Used to implement the drawing optimization

     * of not antialiasing while moving. */

    private void setAntialiasing(Graphics2D g) {

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

	       ((antialias)?RenderingHints.VALUE_ANTIALIAS_ON :

		RenderingHints.VALUE_ANTIALIAS_OFF));

    }

  

    /** draws all expanded, visible and not hidden objects. Called by Paint,

     * and Print to draw the elements and links, etc.. onto the canvas.

     *  @param g Graphics2D to draw onto

     */

    private void draw(Graphics2D g) {

	

	GraphicViewLink gl;

	GraphicViewElement ge;

	GraphicViewObject go;

	

	Iterator e;

	

	e = view.getExpandedElements().iterator();

	while(e.hasNext()) {

	    ge = (GraphicViewElement)e.next();

	    if (!ge.isHidden()) {

		drawExpandedElements(g, ge);

	    }	

	}   



	

	// Highlighted objects.

	g.setColor(Color.magenta);

	e = view.getHighlightedObjects().iterator();

	while (e.hasNext()) {

	    go = (GraphicViewObject)e.next();

	    if (! go.isHidden() ) {

		g.fillRect(go.getSelectableBounds().x,

			go.getSelectableBounds().y,

			go.getSelectableBounds().width-1,

			go.getSelectableBounds().height-1);

		 //g.setColour(go.getHighlightColor());

		 //g.fillRect(go.getHighlightBounds());

	    }

	}

	g.setColor(Color.blue);

	

	// Draw links

	e = view.getVisibleLinks().iterator();

	while(e.hasNext()) {

	    

	    gl = (GraphicViewLink)e.next();

	    //D.o("From: " + gl.getFrom().getName() + "To: " + gl.getTo().getName());

	    if (! gl.isHidden() ) {

		drawLinks(g, gl);

	    }

	}



	e = view.getVisibleElements().iterator();

	while(e.hasNext()){

	    ge = (GraphicViewElement)e.next();

	    //D.o("Considering drawing Element: "+ge.getName());

	    if (! ge.isHidden() ) {

		drawElements(g,ge);

	    }

	}

	

	g.setColor(Color.red);

	g.setStroke(new BasicStroke((float).8));



	e = view.getSelectedLinks().iterator();

	while(e.hasNext()) {

	    gl = (GraphicViewLink)e.next();

	    if (! gl.isHidden() ) {

		g.drawRect(gl.getSelectableBounds().x,

			gl.getSelectableBounds().y,

			gl.getSelectableBounds().width-1,

			gl.getSelectableBounds().height-1);

		g.drawRect(gl.getSelectableControlBounds1().x,

			gl.getSelectableControlBounds1().y,

			gl.getSelectableControlBounds1().width-1,

			gl.getSelectableControlBounds1().height-1);

		g.drawRect(gl.getSelectableControlBounds2().x,

			gl.getSelectableControlBounds2().y,

			gl.getSelectableControlBounds2().width-1,

			gl.getSelectableControlBounds2().height-1);

	    }

	}

	

	

	e = view.getSelectedElements().iterator();

	while(e.hasNext()) {

	    ge = (GraphicViewElement)e.next();

	    //D.o("Drawing selection box for: "+ge.getName());

	    if( !ge.isHidden() ) {

		g.drawRect(ge.getSelectableBounds().x,

			ge.getSelectableBounds().y,

			ge.getSelectableBounds().width-1,

			ge.getSelectableBounds().height-1);

	    }

	}



	// Draw the selection box, if it is active.

	if (selectionbox != null) {

	    Rectangle boxbounds = selectionbox.getBounds();

	    g.drawRect(boxbounds.x, boxbounds.y, boxbounds.width,

		    boxbounds.height);

	}

	

    }



    

    /** Exports the whole graphic view into an image file.

     *

     *  @param file the <code> File </code> where the graphic view should be exported

     */

    private synchronized Image printing(Rectangle bounds) {

	try {		    

	    D.o("Start exporting...");

	    

	    Dimension d = new Dimension(view.getViewBounds().width,

		view.getViewBounds().height);

	    D.o("bounds is "+bounds.width +" "+bounds.height);

	    Image im = createImage(bounds.width, bounds.height);

	    Graphics2D g = (Graphics2D)im.getGraphics();



	    antialias = true;

	    setAntialiasing(g);

	    

	    g.setRenderingHint(RenderingHints.KEY_RENDERING,

		    RenderingHints.VALUE_RENDER_QUALITY);

	    g.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,

		    RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);

	    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,

		    RenderingHints.VALUE_INTERPOLATION_BICUBIC);

	    

	    g.setColor(getBackground());

	    g.fillRect(0, 0, bounds.width, bounds.height);

	    g.setFont(getFont());

	    g.setColor(Color.black);

	    g.setStroke(new BasicStroke((float)2.0));

//	    g.scale((double)5.0/8.0, (double)5.0/8.0);
	    

	    // Set display bounds for printing (save old ones)

	    Rectangle r = view.getDisplayBounds();

	    g.translate(-bounds.x,-bounds.y);

	    view.setDisplayBounds(bounds);

	    

	    

	    draw(g);



	    //restore

	    view.setDisplayBounds(r);



	    D.o("Finish Printing...");

	    

	    return im;

	}catch (Exception ex) {

	    D.o(ex);

	}

	return null;

    }

    public int m_maxNumPage = 1;
    Image m_bi = null; 
    int printmode = 1;

    public void print_data(Rectangle bounds) {
	    
		    
	m_bi= printing(bounds); 
	
	Object options[] = { "Single Page", "Multiple Pages" };
	int option = JOptionPane.showOptionDialog(null, 
              "Which mode do you want to use as printing the graph?", "Input",
              JOptionPane.YES_NO_OPTION,
	      JOptionPane.QUESTION_MESSAGE, null,
              options, options[1]);
 


	switch (option) {
	    case JOptionPane.YES_OPTION:
	    {
		printmode = 0;
	    } break;
	    case JOptionPane.NO_OPTION:
	    {
		printmode = 1;
/*		int w = m_bi.getWidth(this);
		int h = m_bi.getHeight(this);
		m_bi = m_bi.getScaledInstance(w*5/9, h*5/9, Image.SCALE_AREA_AVERAGING);		
*/	    }
	}
	
	try {
	    PrinterJob prnJob = PrinterJob.getPrinterJob();
	    PageFormat pf = prnJob.defaultPage();
	    pf = prnJob.pageDialog(pf);
	    pf.setOrientation(pf.getOrientation());
	    prnJob.setPrintable(this,pf);
	    if (!prnJob.printDialog())
		return;
	    setCursor( Cursor.getPredefinedCursor(
		Cursor.WAIT_CURSOR));
	    prnJob.print();
	    setCursor( Cursor.getPredefinedCursor(
		Cursor.DEFAULT_CURSOR));
	    JOptionPane.showMessageDialog(this, 
		"Printing completed successfully", "Print OME diagrams",
		JOptionPane.INFORMATION_MESSAGE);
	}
	catch (PrinterException e) {
	    e.printStackTrace();
	    System.err.println("Printing error: "+e.toString());
	}
    }

    public int print(Graphics pg, PageFormat pageFormat,
	int pageIndex) throws PrinterException {
		 
	if (printmode==0) {

	    if (pageIndex >= m_maxNumPage || m_bi == null)
		return NO_SUCH_PAGE;

	    pg.translate((int)pageFormat.getImageableX(), 
		(int)pageFormat.getImageableY());
	    int wPage = (int)pageFormat.getImageableWidth();
	    int hPage = (int)pageFormat.getImageableHeight();
	
	    
	    int w = m_bi.getWidth(this);
	    int h = m_bi.getHeight(this);
	    if (w == 0 || h == 0)
		return NO_SUCH_PAGE;

	    double k1 = (double)w/(double)wPage;
	    double k2 = (double)h/(double)hPage;

	    double k = Math.max(k1,k2);
	    
	    
	    int wImage = (int)(w/k);
	    int hImage = (int)(h/k);

	    pg.drawImage(m_bi, 0, 0, wImage, hImage, 
		0, 0, w, h, this);

	} 
	else if (printmode==1) {

	    if (pageIndex >= m_maxNumPage || m_bi == null)
		return NO_SUCH_PAGE;

	    pg.translate((int)pageFormat.getImageableX(), 
		(int)pageFormat.getImageableY());
	    int wPage = (int)pageFormat.getImageableWidth();
	    int hPage = (int)pageFormat.getImageableHeight();

	    int wImPage = (int)Math.ceil((double)wPage);
	    int hImPage = (int)Math.ceil((double)hPage);
	    
	    int w = m_bi.getWidth(this);
	    int h = m_bi.getHeight(this);
	    if (w == 0 || h == 0)
		return NO_SUCH_PAGE;
	    int nCol = Math.max((int)Math.ceil((double)w/wImPage), 1);
	    int nRow = Math.max((int)Math.ceil((double)h/hImPage), 1);
	    m_maxNumPage = nCol*nRow;
	
	    int iCol = pageIndex % nCol;
	    int iRow = pageIndex / nCol;
	    int x = iCol*wImPage;
	    int y = iRow*hImPage;
//	    int wImage = Math.min(wPage, (int)Math.ceil((double)(w-x)));
//	    int hImage = Math.min(hPage, (int)Math.ceil((double)(h-y)));
	    int wImage1 = Math.min(wImPage, w-x);
	    int hImage1 = Math.min(hImPage, h-y);
	    int wImage = (int)Math.ceil((double)wImage1);
	    int hImage = (int)Math.ceil((double)hImage1);
	    
	    D.o(pageIndex+". "+m_bi+" .");
	    D.o("Printable Image is "+wImage+", "+hImage);
	    D.o("Source Image is ("+x+", "+y+")  ("+ (x+wImage1)+","
		    +(y+hImage1)+").");
	    D.o("This is "+this);
	    pg.drawImage(m_bi, 0, 0, wImage, hImage, 
		x, y, x+wImage1, y+hImage1, this);
	 
	}
	
	System.gc();
        
	return PAGE_EXISTS;
    }


    /** Prompts the user for a filename, then exports the view to that file. */

    public void export(Rectangle bounds) {

	String eFileName;

	try {

//  I changed FileDialog to JFileChooser in order to add a file filter of .png files.
//  getExportPath & setExportPath are defined in GraphicViewFrame to keep
//  record of the path user has chosen.   Lin 08/17/2001
 
//	    FileDialog exportDlg = new FileDialog(gframe, 
//		    "Export File", FileDialog.SAVE);

	    JFileChooser chooser = new JFileChooser();
	    
	    javax.swing.filechooser.FileFilter pngFilter =new SimpleFilter(".png", 
			"Portable Network Graphics (*.png)");

	    chooser.setFileFilter(pngFilter);

	    String exportpath = gframe.getExportPath();
	    D.o("exportpath is "+exportpath);
	    chooser.setCurrentDirectory(new File(exportpath));

	    WarningPanel warningPanel = new WarningPanel();
	    chooser.setAccessory(warningPanel);
	    
//	    exportDlg.setFilenameFilter(new PngFilenameFilter());
//	    exportDlg.setFile(exportpath);
//	    exportDlg.setFile("*.png");
//	    exportDlg.show();
//	    eFileName = exportDlg.getFile();
//	    D.o("Filename is " + eFileName);

//	    String eDirectory = exportDlg.getDirectory();
//	    D.o("Directory is " + eDirectory);
//	    if(eFileName == null) return;
	    
	    int n = chooser.showSaveDialog(gframe);
	    if (n != chooser.APPROVE_OPTION) return;
	    
	    eFileName = chooser.getSelectedFile().getName();
	    String eDirectory = chooser.getSelectedFile().getPath();


	    setTitle(eDirectory);	     

	    gframe.setExportPath(eDirectory);
	    D.o("new exportpath is "+eDirectory);	    
	    File cd = new File(".");

	    File tempfile = File.createTempFile("tmp",".bmp",cd);

	    

	    Image im = printing(bounds); 

	    BMPWriter.writeUncompressedBMP(

		    im, tempfile, im.getWidth(this), im.getHeight(this));



	    String cmd[] = new String[3];

	    cmd[0] = "..\\iview\\i_view32.exe";

	    cmd[1] = tempfile.getName();

	    cmd[2] = "/c=" + eDirectory;

	    D.o("converting to: " +cmd[2] );
	    D.o("command line is "+cmd[0] +" "+cmd[1]+" "+cmd[2]);

	    Process p = Runtime.getRuntime().exec(cmd);

	    p.waitFor();

	    tempfile.delete();

	} catch (Exception ex) {

	    D.o(ex);

	}

    }

	



    // And here too(!?)... 

    Image im2;

    Dimension im2s;

    Graphics2D im2g;

    



    /** Draws visible elements and links on the screen.

     *  It only draws the visible elements and links to save resource.

     *

     *  @param g	the <code> Graphics </code> of the screen

     */

    public synchronized void paint(Graphics g) {



	//adjustScrollBar();



//	D.o("Start painting...");



	// The "im2" is the image buffer for the paint function.

	// It is only (re)created when necessary.

	Dimension d = new Dimension(view.getDisplayBounds().width,

	    view.getDisplayBounds().height);

	// the createImage call below spits out an exception when 

	// the dimension's width or height is zero.  I`m not sure why it ever

	// is zero, and I haven't bothered to figure it out.  This is just a

	// hacky workaround.

	if (d.width==0 || d.height==0) {

	  d = new Dimension(1,1);   // once again, sorry.

	}

	if ((im2 == null) || (d.width != im2s.width) || (d.height != im2s.height)) {

//	    D.o("Create images...");
	    
	    im2 = createImage(d.width, d.height);

	    im2s = new Dimension(d.width, d.height);

	    im2g = (Graphics2D)im2.getGraphics();

	}

	

	// we disable antialiasing while we move stuff, but turn it back on to

	// display a still image.

	setAntialiasing(im2g);

//	D.o("Is image2g is Null? " +im2g);	

	// save displaybounds.

	Rectangle db = view.getDisplayBounds();


	// we must set the clip for our image to be that of the passed

	// Graphics object. interesting artifacts result if we are careless.

	Rectangle r = g.getClipBounds();
//	D.o("Is rectangle null? " + r.x +" " +r.y +" "+r.width+" "+r.height);

	im2g.setClip(r.x ,r.y , r.width, r.height);

	

	// clear display

	im2g.setColor(getBackground());

	im2g.fillRect(r.x,r.y,r.width,r.height);



	// Translate from scrollbars using *fullscreen displaybounds*.

	im2g.translate( -db.x, -db.y);

	

	// set font

	im2g.setFont(getFont());

	im2g.setColor(Color.black);

	im2g.setStroke(new BasicStroke((float)2.0));

	

	// set displaybounds to dirty area.

	//view.setDisplayBounds(new Rectangle(r.x+db.x, r.y+db.y, r.width,

	//	    r.height));

	

	draw(im2g);

	antialias = true;

	    

	// Draws the image buffer onto the screen graphics.

	g.drawImage(im2, 0, 0, this);

	

	// restore displaybounds.

	view.setDisplayBounds(db);

	

	// Translate the co-ordinate back since im2 might be reused.

	im2g.translate(view.getDisplayBounds().x, view.getDisplayBounds().y);



	paintChildren(g);

	view.setViewClean();

	

	//D.o("Finish Painting...");

    }





    /** Repaints the screen. repaint() and repaint(Rectangle) indirectly call

     * this. The rectangle'd version will have caused the clipping bounds of

     * the Graphics object to be set to the passed rectangle. This is the

     * mysterious way that dirty rectangles work their way to the drawing

     * code.

     *

     *  @param g	the <code> Graphics </code> of the screen.

     */

    public synchronized void update(Graphics g) {

	paint(g); 

    }

   

    /** Displays the rename box. 

     *

     *  @param gve	the graphic view object which we wish to rename 

     */

    /*package*/ void openRenameBox(GraphicViewObject gve) {

	int sizex = gve.getSelectableBounds().width/2;

	int sizey = gve.getSelectableBounds().height/2;



	JTextField rb = new JTextField(15);

	add(rb);

	rb.setBounds(gve.getSelectableBounds().x - view.getDisplayBounds().x, 

		gve.getSelectableBounds().y - view.getDisplayBounds().y 

		+ sizey - 12, 2*sizex, 24);

	boxclosed = false;

	rb.addKeyListener(new RenameBoxKeyAdapter(gve, rb, this));

	rb.addFocusListener(new RenameBoxFocusAdapter(gve,rb,this));



	rb.setText(gve.getName());

	rb.selectAll();

	rb.repaint();

	rb.requestFocus();

	D.o("creating Jtextfield at:" + rb.getBounds());

	D.o("renamebox created.");

    }

   



    /** Closes the rename box. 

     *

     *  @param tf 	the text Field in the rename in rename box. It needs

     *			to be removed so we don't see it anymore.

     */

    private synchronized void closeRenameBox(JTextField tf) {

	try{

		remove(tf);

		repaint();

	} catch (Exception e) {

	    D.o(e);

	}

    }

 

    /** Displays the resize box. 

     *  @param gve	the graphic view element we wish to resize

     */

    /*package*/ void openResizeBox(GraphicViewObject gvo) {

	int sizex = gvo.getSelectableBounds().width/2;

	int sizey = gvo.getSelectableBounds().height/2;



	JTextField tf = new JTextField(15);

	tf.setBounds(gvo.getSelectableBounds().x - view.getDisplayBounds().x, 

		gvo.getSelectableBounds().y - view.getDisplayBounds().y + sizey - 12,

		2*sizex, 24);

	boxclosed = false;

	tf.addKeyListener(new ResizeBoxKeyAdapter(gvo, tf, this));

	tf.addFocusListener(new ResizeBoxFocusAdapter(gvo,tf,this));



	tf.setText(""+gvo.getScale());

	add(tf);

	tf.selectAll();

	tf.repaint();

	tf.requestFocus();

	D.o("resizebox created.");

    }

    /*package*/ void resize(GraphicViewObject gve, Double d) {

	gve.setScale(d.doubleValue()); 		    

	repaint();
    }
  



    /** Closes the resize box. 

     *  @param tf	the text field in the resize box.  It needs to be

     *			

     removed so we don't see it anymore.

     */

    private synchronized void closeResizeBox(JTextField tf) {

	if (boxclosed==false) {

	    remove(tf);

	    boxclosed = true;

	}

	repaint();

    }

    



    /** Saves the clicked point. 

     *  @param p	the clicked point

     */

    private void setClickedP(Point p) {

	clickedp = p;

    }

    

       

    /** Recovers the clicked point. */

    private Point getClickedP() {

	return clickedp;

    }



    /** Sets the input mode for the GVC */

    private void setMode(int mode, String message) {

	switch (mode) {

	    case NORMAL_MODE:

		setNormalMode(message);

		break;

	    case GET_PARAMETER:

		setGPMode(message);

		break;

	}

    }



    /** Go into NORMAL_MODE */

    private void setNormalMode(String message) {

	mode = NORMAL_MODE;

	gframe.getStatusBar().setMessage(message);

	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

	D.o("Deselecting due to mode change to NORMAL_MODE.");

	view.deselectAll();

    }



    /** Go into GET_PARAMETER mode */

    private void setGPMode(String message) {	

	D.o("Setting mode GET_PARAMTER mode.");

	mode = GET_PARAMETER;

	gframe.getStatusBar().setMessage(message);

	setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

	



    /** Returns our mode. */

    private int getMode() {

	return mode;

    }



    /** Returns our GVCParameterCollector */

    private GVCParameterCollector getParameterCollector() {

	return pcollector;

    }

    

    /** Sets the title of our frame. */

    /*package*/ void setTitle(String s) {

	gframe.setTitle(s);

    }



    /** Returns the absolute pathname where this model should be saved. */

    /* package */ String getSavePathname() {

	return gframe.getModelPath();

    }

    

    /** Throws up a save dialogue and returns a collection whose first

      * member is the file name and whose second member is the directory name

      * (both of which a Strings).  Returns a null vector if no file was

      * selected by the user.

      *	

      * Side effect:  Sets m_sCurrFile and m_sCurrDir to names supplied by user.

      * Also sets the title of our frame to the pathname of the file.

      */

    /*package*/ Collection getSaveFileAndDirectory() {

	String sFileName;

	Vector v = null;

	

	FileDialog saveDlg = new FileDialog(gframe,"Save File",FileDialog.SAVE);

	
//	saveDlg.setFilenameFilter(new TelosFilenameFilter());

	String modelpath = gframe.getModelPath();

	saveDlg.setFile(modelpath);

	saveDlg.show();



	sFileName = saveDlg.getFile();

	if(sFileName == null) { 

	    return v;

	}

	m_sCurrFile = sFileName;

	m_sCurrDir = saveDlg.getDirectory();

	setTitle(m_sCurrDir + m_sCurrFile);

	gframe.setModelPath(m_sCurrDir + m_sCurrFile);



	D.o("The saved file is !!!!!!!! " + m_sCurrFile);

	

	v = new Vector(2);

	v.add(m_sCurrFile);

	v.add(m_sCurrDir);

	return v;

    }

    

    /** The keyboard listener for <code> GraphicViewCanvas </code>. */

    private class GVCKeyAdapter extends KeyAdapter {



	/** Processes keyboard input.

	 *

	 *  @param e	the keyboard event to be processed

	 */

	public void keyPressed (KeyEvent e) {

	    char c = e.getKeyChar();

	    

	    switch (c) {

		case KeyEvent.VK_DELETE:

		    view.deleteSelectedElements();

		    view.deleteSelectedLinks();

		    repaint();

		    break;



		case KeyEvent.VK_ESCAPE:

		    if (getMode() == GET_PARAMETER) {

			// User wants out of the current plugin method.

			getParameterCollector().cancelMethod();

		    } else  { //normal mode

			view.deselectAll();

			repaint();

		    }



	    }

	}

    }



    /** The mouse event listener for <code> GraphicViewCanvas </code>. */

    private class GVCMouseAdapter extends MouseAdapter {



	private int initialmode;

	

	/** Processes mousePressed event. This is the mouse button coming down,

	 *  on which we select things

	 *

	 *  @param e	the mouse event to be processed

	 */

	public void mousePressed( MouseEvent me ) {

	    D.o("mousepressed");

	    requestFocus();



	    Point p = view.toView(me.getPoint());

	    setClickedP (p);



	    initialmode = getMode();



	    if (initialmode == GET_PARAMETER) {

		getParameterCollector().processMousePressed(me);	

	    }

	    else { // on a left mouse down, try to select stuff.

		if ((me.getModifiers() &InputEvent.BUTTON3_MASK) == 0 ) {

		    if((me.getModifiers() & InputEvent.CTRL_MASK) == 0) {

			select(p);

		    }

		} 

	    }

	}



	/** we repaint the.. */

	public void mouseReleased(MouseEvent me) {

	    D.o("mousereleased");

	    // Sneaky optimization stuff.

	    if (wasdragging) {

		wasdragging=false;

		antialias=true;

		repaint();

	    }

	    // If we were doing the selection box thing, and the user let go,

	    // we should finish up the selection box.

	    if (selectionbox!=null) {

		Point p = view.toView(me.getPoint());

		selectionbox.finish(p);

	    }

	}

	



	/** Processes mouseClicked event.

	 *  @param me	the mouse event to be processed

	 *  I should throw actions!!

	 */

	public void mouseClicked( MouseEvent me ) {

	    if (initialmode == GET_PARAMETER) {

		// Ignore this event.

	    } else {

	    

		requestFocus();

		

		D.o("mouseclicked: " + me.getClickCount());

		Point p = view.toView(me.getPoint());

		setClickedP(p);

		

		if((me.getModifiers() & InputEvent.BUTTON3_MASK) == 0) {

		    // regular button has been hit.

		    if (me.getClickCount() == 2) { 

			// on double click:

			GraphicViewElement gve = view.findElement(p);

			if (gve != null) {

			    if (gve.isExpandable()) {

				try {

				    if (gve.isExpanded()) {

					    gve.contract();

				    } else {

					gve.expand();

				    }

				} catch (Exception e) {

				    D.o(e);

				}

			    }

			}

			//if (view.isViewDirty()) adjustScrollBar();

			view.refreshVisible();

			repaint();

		    } else {

			// on single (triple. quadruple?) click

		      

			if((me.getModifiers() & InputEvent.CTRL_MASK) != 0) {

			    toggleSelect(p);

			} else {

			    select(p);

			}

			repaint();

		    }

		} else {

		    // Alternate button has been hit. Show the context menu.

		    popupmenu = setPopupMenu(me);

		    popupmenu.openup();

		    //popupmenu.show(me.getComponent(), me.getX(), me.getY());

		    

		}

	    }

	}

    }





    /** The mouse motion listener for <code> GraphicViewCanvas </code>. */

    private class GVCMouseMotionAdapter extends MouseMotionAdapter {



	Point selection_box_corner;

	int flag=0;



	/** Processes mouseDragged event.

	 *

	 *  @param me	the mouse event to be processed

	 */

	public void mouseDragged( MouseEvent me ) {



	    if (getMode() == GET_PARAMETER) {

		// Ignore drags

	    } else if ((me.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {

		

		Point p = view.toView(me.getPoint());

		Rectangle sbox_old_bounds = null;

		

		// Mouse drags are used for two things, moving selected

		// objects, or drawing a selection box.

		if (wasdragging && selectionbox == null) {

		    view.moveElements(p.x - getClickedP().x, p.y -

			    getClickedP().y);

		    view.moveLink(p.x - getClickedP().x, p.y -

			    getClickedP().y, flag);

		}

		else if(!wasdragging && view.findObject(p)!=null) {

		    // we're in the middle of a move gesture or we should

		    // start one.

		    view.moveElements(p.x - getClickedP().x, p.y -

			    getClickedP().y);

		    int flag1=flag;

		    flag =0;

		    view.moveLink(p.x - getClickedP().x, p.y -

			    getClickedP().y, flag);

		    flag=flag1;

		} 

		else if (!wasdragging && view.findLinkControlPoint1(p)!=null) {

		    flag=1;

		    view.moveLink(p.x - getClickedP().x, p.y -

			    getClickedP().y,flag);

		    flag=0;

		}

		else if  (!wasdragging && view.findLinkControlPoint2(p)!=null) {

		    flag=2;

		    view.moveLink(p.x - getClickedP().x, p.y -

			    getClickedP().y,flag);

		    flag=0;

		}

		else {

		    if (selectionbox == null && !wasdragging) {

			// We are just starting the box.

			// !wasdragging term is there to make sure we don't

			// take control from a movement gesture.

			selectionbox = new SelectionBox(p);

			sbox_old_bounds = selectionbox.getBounds();

		    } else{

			// Update the box.

			sbox_old_bounds = selectionbox.getBounds();

			selectionbox.update(p);

			flag = 0;

		    }

		

		}

		setClickedP(p);

		wasdragging=true;

		Rectangle dr = view.getDirtyRect();

		if (selectionbox!=null) {

		    if (dr != null) {

			dr.add(selectionbox.getBounds());

			dr.add(sbox_old_bounds);

		    } else {

			dr = selectionbox.getBounds();

			dr.add(sbox_old_bounds);

			dr.grow(1,1);	// else we miss part of the box

		    }

		}

		Rectangle db = view.getDisplayBounds();

		if (dr !=null) {

		    antialias = false;

		    repaint(dr.x-db.x, dr.y-db.y, dr.width, dr.height);

		}

		adjustScrollBar();		

	    }

	}

    }

	   

    /** This menu listener repopulates a menu when it is opened. */

    private class MenuBarMenuListener implements MenuListener {

	

	PluginMethod menumethod;

	

	public MenuBarMenuListener(PluginMethod menumethod) {

	    this.menumethod = menumethod;

	}

	

	public void menuSelected (MenuEvent e) {

	    // Clear the menu

	    JMenuPlus menu = (JMenuPlus)e.getSource();

	    menu.removeAll();

	    // Repopulate the menu

	    populateMenu(menu, menumethod, null);

	    D.o("Menu listener called populateMenu().");

	}

	public void menuDeselected (MenuEvent e) {}

	public void menuCanceled (MenuEvent e) {}

    }



    /** The action listener used for Menu(bar) and Toolbar buttons. */

    private class GVCActionAdapter implements ActionListener {

	private PluginMethod method;

	private GraphicViewCanvas gvc;

	private Point p = null;

	private JToggleButton togglebutton = null;



	/**  Create a new GVCActionAdapter.

	 *   @param method	The associated method.

	 *   @param p		The Point associated with the firing of this

	 *			action (if any).

	 *   @param gvc		Our canvas

	 */

	GVCActionAdapter(PluginMethod method, Point p, 

		GraphicViewCanvas gvc) {

	    this.gvc = gvc;

	    this.method = method;

	    this.p = p;

	}

	

	/**  Create a new GVCACtionAdapter.

	 *   @param method	The associated method.

	 *   @param gvc		Our canvas

	 */

	GVCActionAdapter(PluginMethod method, 

		GraphicViewCanvas gvc) {

	    this.gvc = gvc;

	    this.method = method;

	}

	

	/**  Create a new GVCACtionAdapter.

	 *   @param method	    The associated method.

	 *   @param togglebutton    The button to untoggle when done.

	 *   @param gvc		    Our canvas

	 */

	GVCActionAdapter(PluginMethod method, JToggleButton togglebutton, 

		GraphicViewCanvas gvc) {

	    this.gvc = gvc;

	    this.method = method;

	    this.togglebutton = togglebutton;

	}



	/** Process the menu and tool bar events.

	 *  @param e	the action event to be processed

	 */

	public void actionPerformed(ActionEvent e) {

	    // If we have a toggle button, and the button is currently NOT

	    // selected, then the user has UNSELECTED it, and we should

	    // cancel the method.

	    if (togglebutton != null && !togglebutton.isSelected()) {

		D.o("Cancelling method for togglebutton.");

		getParameterCollector().cancelMethod();

	    } else {

		ViewContext c = view.generateContext(p);

		gvc.getParameterCollector().startCollecting(method, c,

			togglebutton);

	    }

	}	    

    }



    /** The component listener for the <code> GraphicViewCanvas </code>. */

    private class GVCComponentAdapter extends ComponentAdapter {

	private PluginMethod method;



	/** Processes the resized event.

	 *

	 *  @param e	the component event to be processed

	 */

	

	public void componentResized( ComponentEvent e) {

	    view.getDisplayBounds().width = getSize().width;

	    view.getDisplayBounds().height = getSize().height;

	   

	    // Adjusts the value in GraphicView.

	    view.getDisplayBounds().x =

		Math.max(view.getViewBounds().x,

		    Math.min(

		    view.getViewBounds().width-view.getDisplayBounds().width+view.getViewBounds().x,

		    view.getDisplayBounds().x));

	    

	    view.getDisplayBounds().y =

		Math.max(view.getViewBounds().y,

		    Math.min(

		    view.getViewBounds().height-view.getDisplayBounds().height+view.getViewBounds().y,

		    view.getDisplayBounds().y));

	   

	    adjustScrollBar();

	    // The lists of visible elements and links are changed.

	    view.refreshVisibleLists();

	    super.componentResized( e );

	}



    }



    /** The key listener for the rename box. so's we can close when someone

     * hits enter. */

    private class RenameBoxKeyAdapter extends KeyAdapter {



	private GraphicViewObject gve;

	private JTextField tf;

	private GraphicViewCanvas gvc;

	

	/** Creates a new RenameBoxKeyAdapter.

         *  @param gve	The GraphicViewElement being resized.

         *  @param tf 	The textfield in the Resize box.

         *  @param gvc 	The GraphicViewCanvas to paint on.

         */

	public RenameBoxKeyAdapter(GraphicViewObject gve, JTextField tf,

			GraphicViewCanvas gvc) {

	    super();

	    this.gve=gve;

	    this.tf=tf;

	    this.gvc=gvc;

	}	    	    

	    

	/** Processes keyPressed event.

	 *

	 *  @param e	the keyboard event to be processed

	 */

	public void keyPressed (KeyEvent e) {

	    char c = e.getKeyChar();

	    if (c == KeyEvent.VK_ENTER) {

		 if (boxclosed == false) {

		     gve.setName(tf.getText());

		     boxclosed = true;

		     closeRenameBox(tf);

		 }

	    }

	}

    }

    

    

    /** RenameBox Focus Adapter. So's we can close when our rename box loses

     * focus. */

    private class RenameBoxFocusAdapter extends FocusAdapter {



	private GraphicViewObject gvo;

	private JTextField tf;

	private GraphicViewCanvas gvc;

	 

      /** Create a new RenameBoxFocusAdapter.

       *  @param gve	The GraphicViewElement being resized.

       *  @param tf 	The textfield in the Resize box.

       *  @param gvc 	The GraphicViewCanvas to paint on.

       */

	public RenameBoxFocusAdapter(GraphicViewObject gvo, JTextField tf,

			GraphicViewCanvas gvc) {

	    super();

	    this.gvo=gvo;

	    this.tf=tf;	    

	    this.gvc=gvc;

	    D.o("Created RenameBoxFocusAdapter");

	}





      /** Process the focusLost event.

       *  @param e	The focus event we are processing.

       */

	public void focusLost(FocusEvent e) {

	    /* we want to die when we lose *internal* focus, but not when the

	     * app loses focus. */

	    if ((e.getID() == FocusEvent.FOCUS_LOST) && !e.isTemporary()) {

		if (boxclosed == false ) { 

		    gvo.setName(tf.getText());

		    boxclosed = true;

		    closeRenameBox(tf);

		}

	    }

	}

    }

		



    /** So's we can catch the Enter to close. */

    private class ResizeBoxKeyAdapter extends KeyAdapter {

	

      private GraphicViewObject gve;

	private JTextField tf;

	private GraphicViewCanvas gvc;



      /** Creates a new ResizeBoxKeyAdapter

       *  @param gve	The GraphicViewElement being resized.

       *  @param tf 	The textfield in the Resize box.

       *  @param gvc 	The GraphicViewCanvas to paint on.

       */

	public ResizeBoxKeyAdapter(GraphicViewObject gve, JTextField tf,

		GraphicViewCanvas gvc) {

	    super ();

	    this.gve=gve;

	    this.tf=tf;	    

	    this.gvc=gvc;

	    D.o("Resize box key adapter created.");

	}





      /** Handle a key pressed event.

       * 

       *  @param e	the key-pressed event to be handled

       */

	public void keyPressed(KeyEvent e) {

	    char c = e.getKeyChar();

	    if(c == KeyEvent.VK_ENTER) {

		try {

		    if (boxclosed== false) {

			Double d = new Double(tf.getText());

			gve.setScale(d.doubleValue());

			boxclosed = true;

			gvc.remove(tf);

		    }

		} catch (NumberFormatException nfe) {

		    //beep!

		    tf.setText(""+gve.getScale());

		    tf.selectAll();

		} finally {

		    gvc.repaint();

		}

	    }

	    D.o("voodoo");

	}

    }



    

    /** So we can close when we lose focus. */

    private class ResizeBoxFocusAdapter extends FocusAdapter {

	private GraphicViewObject gve;

	private JTextField tf;

	private GraphicViewCanvas gvc;

	 

      /** Creates a new ResizeBoxFocusAdapter.

       *  @param gve	The GraphicViewElement being resized.

       *  @param tf 	The textfield in the Resize box.

       *  @param gvc 	The GraphicViewCanvas to paint on.

       */

	public ResizeBoxFocusAdapter(GraphicViewObject gve, JTextField tf,

			GraphicViewCanvas gvc) {

	    super();

	    this.gve=gve;

	    this.tf=tf;	    

	    this.gvc=gvc;

	    D.o("Created ResizeBoxFocusAdapter");

	}



	public void focusLost(FocusEvent e) {

	    /* we want to die when we lose *internal* focus, but not when the

	     * app loses focus. */

	    if ((e.getID() == FocusEvent.FOCUS_LOST) && !e.isTemporary()) {

		try {

		    if (boxclosed==false) {

			Double d = new Double(tf.getText());

			gve.setScale(d.doubleValue()); 		    

			boxclosed = true;

			gvc.remove(tf);

		    }

		} catch (NumberFormatException nfe) { // we throw it away.

		} finally {

			D.o("We are repainting");

			gvc.repaint();

		}

	    }

	}

    }

/*
    public class TelosFilenameFilter implements FilenameFilter {  
      
     public boolean accept(File dir, String name) 
       { 
         return name.endsWith(".tel"); 
       } 
    }  
     
    public class PngFilenameFilter implements FilenameFilter {  
      
     public boolean accept(File dir, String name) 
       { 
         return name.endsWith(".png"); 
       } 
    } 
*/

	protected class SimpleFilter extends javax.swing.filechooser.FileFilter
        {
                String type,des;
                public SimpleFilter(String type, String des)
                {
                        this.des=des;
                        this.type=type;
                }
                public boolean accept(File f){
                        if(f.isDirectory())return true;
                        else{
                                if(f.getName().toLowerCase().endsWith(type)) return true;
                                else return false;
                        }
                }
                public String getDescription(){
                        return des;
                }
        }

	class WarningPanel extends JPanel {
	    public WarningPanel() {
		JLabel label1 = new JLabel("Attention Please:",
			SwingConstants.CENTER);
		JTextArea textArea = new JTextArea(
		    "Directory names with space are not supported.\n" +
		    "e.g. \n \"My Documents\",\n \"Program Files\"."
		    );
		textArea.setFont(new Font("Serif", Font.ITALIC, 12));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
//		setPreferredSize(new Dimension(150,0));
		setBorder(BorderFactory.createEtchedBorder());
		setLayout(new BorderLayout());
		label1.setBorder(BorderFactory.createEtchedBorder());
		add(label1, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
	    }
	}
    
    /** The "selection box" is the rectangle a user can create by dragging the

     *  mouse.  When the user releases the mouse button, all objects within

     *  the rectangle will be selected.

     *

     *  The mouse motion adapter for GVC does the I/O work, and just tells the

     *  selection box what to do.

     */

    private class SelectionBox {

	private Point start_corner;	    // Where we started

	private Point active_corner;	    // Other corner (location of mouse 

					    // pointer)

	

	/** Start a new box. */

	public SelectionBox(Point start_point) {

	    start_corner = start_point;

	    active_corner = start_point;

	}



	/** What are the bounds of the box? */

	public Rectangle getBounds() {

	    Rectangle r = new Rectangle(start_corner);

	    r.add(active_corner);

	    return r;

	}



	/** Selects the objects within the bounds of the box, and (lazily)

	 * schedules the instance for garbage collection.

	 */

	public void finish(Point active_corner) {

	    selectionbox = null;    // Destroy the reference to the box.

	    this.active_corner = active_corner;

	    Iterator i = view.findObjects(getBounds()).iterator();

	    while (i.hasNext()) {

		GraphicViewObject gvo = (GraphicViewObject)i.next();

		gvo.setSelected(true);

		//view.selectObject((GraphicViewObject)i.next());

	    }

	}



	/** Updates the "active corner" of the box.  i.e., the corner

	 *  corresponding to the mouse pointer. */

	public void update(Point active_corner) {

	    this.active_corner = active_corner;

	} 

    }

}

