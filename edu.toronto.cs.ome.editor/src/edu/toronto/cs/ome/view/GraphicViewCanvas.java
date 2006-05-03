/* Revised by Zhifeng Liu Jul-Aug 2004
  Please refer to the added comments for detail
*/
// Yijun: We use TextArea instead of TextField
// to allow multiple line editing:
// Close the editing with Escape instead of Enter
package edu.toronto.cs.ome.view;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Polygon;
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
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.CachedImageHandlerBase64Encoder;
import org.apache.batik.svggen.GenericImageHandler;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.svggen.SVGGraphics2DIOException;
import org.apache.batik.transcoder.Transcoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.fop.svg.PDFTranscoder;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import edu.toronto.cs.ome.controller.AbstractPluginMethod;
import edu.toronto.cs.ome.controller.JMenuPlus;
import edu.toronto.cs.ome.controller.JPopupMenuPlus;
import edu.toronto.cs.ome.controller.MenuMethod;
import edu.toronto.cs.ome.controller.OMEDefaultPlugin;
import edu.toronto.cs.ome.controller.OMEPlugin;
import edu.toronto.cs.ome.controller.PluginMethod;
import edu.toronto.cs.ome.controller.PluginParameter;
import edu.toronto.cs.ome.controller.PopupMenuSeparatorMethod;
import edu.toronto.cs.ome.model.KBManager;
import edu.toronto.cs.ome.model.OMEElement;
import edu.toronto.cs.ome.model.OMELink;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.model.OMEObject;
import edu.toronto.cs.ome.model.TelosElement;
import edu.toronto.cs.ome.model.TelosFramework;
import edu.toronto.cs.ome.view.GraphicViewObject.GraphicViewTextAttribute;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.undo.AbstractUndoableEdit;
import edu.toronto.cs.undo.CannotRedoException;
import edu.toronto.cs.undo.CannotUndoException;
import edu.toronto.cs.undo.Undo;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;
import edu.toronto.cs.util.Pair;
import edu.toronto.cs.ome.model.TelosModel;
import edu.toronto.cs.telos.TelosParserKB;

/**
 * This class provides an interface to display and edit a graphic view, 
 * as well as access other relevant functionalities. 
 * It then interacts directly with <code> GraphicView </code>, which is a class 
 * storing all graphic view related information, to realize user's requests.
 * 
 *  @see GraphicView
 *  @see ScrollingPanel
 */

public class GraphicViewCanvas extends JPanel implements Printable {
	private static final long serialVersionUID = 1L;
	Undo undo;
	static final int ICON_HEIGHT = 16;
	static final int DIMENSION_CONFLICT = 0;
	static final int DIMENSION_SAT = 1;
	static final int DIMENSION_DEN = 2;
	private JPopupMenuPlus popupmenu;
	private JMenuBar menuBar;
	private GraphicView view;
	public GraphicViewFrame gframe;
	private Point clickedp; // Used only for mouse drags. 
	private boolean antialias = true; // How we draw our link lines.
	private boolean wasdragging = false; // A module variable used in a
	// optimization.
	private boolean boxclosed = false;
	// zoom scale
	private double zoomscale = 1;
	private SelectionBox selectionbox; // If the user is in the midst of
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
	public final int TWOD_SCROLLING = 2;
	private static final int LINK_TYPE = 1;
	private static final int ELEMENT_TYPE = 0;
	public int mode;
	private GVCParameterCollector pcollector;
	Point offset = new Point();
	boolean dragging = false;
	//Map models2kbs;
	//KBManager kbm;
	//public TelosParserKB kb;
	/**
	 * Takes care of parameter collecting for methods.
	 */
	private class GVCParameterCollector {
		GraphicViewCanvas gvc;
		private PluginMethod method = null;
		private Class classType;
		private Vector v;
		private AbstractButton button = null;
		private ViewContext context;
		public GVCParameterCollector(GraphicViewCanvas gvc) {
			this.gvc = gvc;
		}
		/** 
		 * Initiates parameter collecting.
		 * @param method   The method for whom we are collecting parameters.
		 */
		protected void startCollecting(
			PluginMethod method,
			ViewContext context,
			AbstractButton button) {
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
			this.button = button;
			PluginParameter p = method.nextParameter();
			if (p == null) {
				view.gvc = gvc;
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
			if (classType == LocationClass
				|| classType == GraphicLocationClass) {
				
				View.GraphicLocation gl = new View.GraphicLocation();
				gl.setPoint(p);
				v.add(gl);
				foundone = true;
			} else if (classType == OMEObjectClass) {
				
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
				//D.o("Unsupported parameter.");
			}
			if (foundone) {
				// Do we stay in this mode or return to normal mode?
				// We should probably look at the CTRL_MASK etc., but at
				// the moment we simply go back to normal mode.
				gvc.setMode(NORMAL_MODE, null);
				// Again with the ignoring cardinality...
				
				reportParameter();
			} // Else keeping waiting for the parameter.
		}
		/** The user has abandoned the method he was in the middle of.  Abort
		 *  abort!
		 */
		protected void cancelMethod() {
			//D.o("cancelling method");
			gvc.setMode(NORMAL_MODE, null);
			method.cancelled();
			resetPC();
		}
		/** Resets the parameter collector so that it is ready to start a new
		 *  method.
		 */
		private void resetPC() {
			//D.o("Resetting parameter collector.");
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
	public GraphicViewCanvas(
		JMenuBar menuBar,
		GraphicView gview,
		GraphicViewFrame gframe /*, int state*/
	) {
		stringClass = String.class;
		integerClass = Integer.class;
		LocationClass = View.Location.class;
		GraphicLocationClass = View.GraphicLocation.class;
		OMEObjectClass = OMEObject.class;
		OMEElementClass = OMEElement.class;
		OMELinkClass = OMELink.class;
		ViewContextClass = ViewContext.class;
		this.gframe = gframe;
		this.menuBar = menuBar;
		view = gview;
		pcollector = new GVCParameterCollector(this);
		view.setDisplayBounds(new Rectangle(new Point(0, 0), gframe.getSize()));
		view.setGraphicViewCanvas(this);
		setLayout(null);
		setBorder(BorderFactory.createEtchedBorder());
		addComponentListener(new GVCComponentAdapter());
		addMouseListener(new GVCMouseAdapter());
		addMouseMotionListener(new GVCMouseMotionAdapter());
		addKeyListener(new GVCKeyAdapter());
		requestFocus();
		plugins = view.getModel().getPlugins();
		// OMEDefaultPlugin is a special case, I'm wondering if we should have
		// individual access to it.  At any rate, we need to hook the save
		// method into the GVFrame.
		hookupSaveMethod();
		popupmenu = null; // setPopupMenu();
		if (menuBar!=null) {
			setMenuBar();
			setToolBar();
		}
		undo = gview.getUndo();
		setPreferredSize(new Dimension(1024, 800));
		setBackground(Color.WHITE);
		//models2kbs = new HashMap();
		//kb=null;
		//kbm = new KBManager();
	}
	/** Searches through our plugins for the OMEDefaultPlugin, gets the Save
	 *  method, and hooks it in to the GraphicViewFrame (for window closing).*/
	public void hookupSaveMethod() {
		Iterator plugit = plugins.iterator();
		while (plugit.hasNext()) {
			OMEPlugin p = (OMEPlugin) plugit.next();
			if (p instanceof OMEDefaultPlugin) {
				gframe.setWindowListener(
					((OMEDefaultPlugin) p).getSaveMethod(view));
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
	private void populateMenu(
		JMenuPlus menu,
		PluginMethod menumethod,
		Point p) {
		//D.o("Populating Menu");
		ViewContext ovc = view.generateContext(p);
		Collection c = menumethod.getSubmenu(ovc);
		if (c != null) {
			Iterator i = c.iterator();
			while (i.hasNext()) {
				PluginMethod method = (PluginMethod) i.next();
				//method may be a normal method, or a submenu.
				Collection subcollection = method.getSubmenu(ovc);
				if (subcollection != null) {
					JMenuPlus submenu = new JMenuPlus(method.getName());
					menu.add(submenu);
					submenu.setEnabled(method.isEnabled(ovc));					
					populateMenu(submenu, method, p);
				} else {
					// Normal case.  Hook up the button.
					//D.o("before makeMenuItem");
					JMenuItem jmi = makeMenuItem(method, p, ovc);
					//D.o("after makeMenuItem");
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
	private JMenuItem makeMenuItem(
		PluginMethod method,
		Point p,
		ViewContext ovc) {
		//JMenuItem jmi = new JMenuItem(method.getName());
		JMenuItem jmi = new JMenuItem();		
		jmi.setEnabled(method.isEnabled(ovc));				
		// Added by Zhifeng Liu Jul 24 2004		
		String MenuName=method.getName();		
		jmi.setText(MenuName);    	        
		//Added by Zhifeng Liu Jul,2004
        //to support shortcut functionalities
		String accelString = method.getAcceleratorStr();
		String modifierStr;
		if (accelString != null) {
		  if (accelString.indexOf("+")>=0)
			modifierStr = accelString.substring(0, accelString.indexOf("+")).toUpperCase();
		  else
			modifierStr = accelString;
			int modifier = 0;
			if (modifierStr.indexOf("SHIFT")>0)
				modifier |= KeyEvent.SHIFT_MASK;
			if (modifierStr.equals("CTRL"))
				modifier |= KeyEvent.CTRL_MASK;
			if (modifierStr.equals("META"))
				modifier |= KeyEvent.META_MASK;
			if (modifierStr.equals("ALT"))
				modifier |= KeyEvent.ALT_MASK;
			if (accelString.indexOf("+")>=0) {
				String keyStr = accelString.substring(accelString.indexOf("+")+1);
				int keyChar = keyStr.charAt(0);
				jmi.setAccelerator(KeyStroke.getKeyStroke(keyChar, modifier, false));
			}
		}
       // to support Mnenomics        
       int mnemonicChar=-1;
	   int displayedMnemonicIndex=-1;
       mnemonicChar=method.getMnemonic();
       displayedMnemonicIndex=method.getDisplayedMnemonicIndex();
       if (-1!=mnemonicChar){          
         jmi.setMnemonic(mnemonicChar);
         if (-1!=displayedMnemonicIndex){
         	 jmi.setDisplayedMnemonicIndex(displayedMnemonicIndex);
         	}
        }
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
		if (im != null) {
			ImageTable it = view.getImageTable();
			//im = it.getScaling(im,ICON_HEIGHT/it.getHeight(im));
			im = it.getSizing(im, 0, ICON_HEIGHT);
			return new ImageIcon(im);
		} else {
			return null;
		}
	}
	/** Creates and populates the popup menu.
	 *  @return 	the newly created popup menu.
	 */
	protected JPopupMenuPlus setPopupMenu(MouseEvent me) {
		Point p = view.toView(me.getPoint());
		//D.o("Creating popup");
		JPopupMenuPlus popupmenu = new JPopupMenuPlus(me);
		Iterator plugit = plugins.iterator();
		Collection c = new Vector();
		while (plugit.hasNext()) {
			Collection methods =
				((OMEPlugin) plugit.next()).getPopupMethods(view);
			if (methods != null) {
				c.addAll(methods);
			}
		}
		//D.o("Got methods.");
		// Too bad JPopupMenus aren't JMenus.
		ViewContext ovc = view.generateContext(p);
		Iterator i = c.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof PluginMethod) {
				if (o instanceof PopupMenuSeparatorMethod) {
					popupmenu.addSeparator();
				} else {
					PluginMethod method = (PluginMethod) o;
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
		Vector existing_menuitems = new Vector(10, 10);
		Iterator plugit = plugins.iterator();
		Collection c = new Vector();
		while (plugit.hasNext()) {
			Collection methods =
				((OMEPlugin) plugit.next()).getMenubarMethods(view);
			if (methods != null) {
				c.addAll(methods);
			}
		}
		Iterator i = c.iterator();
		while (i.hasNext()) {
			MenuMethod menumethod = (MenuMethod) i.next();
			if (!existing_menuitems.contains(menumethod)) {
				// We assume that all methods are menuMethods.	    
				String name = menumethod.getName();
				JMenuPlus menu = new JMenuPlus(name);
				menu.addMenuListener(new MenuBarMenuListener(menumethod));
				//if (existing_menuitems.add(menumethod))
					//D.o("menumethod" + name + "added==================");
				// set the mnemonic for this menu
				int j = 0;
				do {
					mnemonic = new Character(name.charAt(j++));
				} while (
					(usedmnemonics.contains(mnemonic)) && (name.length()) > j);
				if (j < name.length()) {
					usedmnemonics.add(mnemonic);
					menu.setMnemonic(mnemonic.charValue());
				}
				//populateMenu(menu, menumethod, null);
				if (menuBar!=null)
					menuBar.add(menu);
			}
		}
	}
	/** Populates the tool bar, which is created by and passed from <code>
	 *  GraphicViewFrame </code>.
	 */
	public void setToolBar() {
		if (gframe.toolbarpanel!=null) {
			for (Iterator i = gframe.toolbars.iterator(); i.hasNext();) {
				JToolBar b = (JToolBar) i.next();
				gframe.toolbarpanel.remove(b);
			}
			gframe.toolbars.clear();
			gframe.toolbarpanel.removeAll();
		}		
		Iterator plugit = plugins.iterator();
		Collection c = new Vector();
		while (plugit.hasNext()) {
			OMEPlugin p = (OMEPlugin) plugit.next();
			Collection methods =
				p.getToolbarMethods(view);
			if (methods != null) {
				c.addAll(methods);
			}
		}
		Iterator i = c.iterator();
		while (i.hasNext()) {
			PluginMethod barmethod = (PluginMethod) i.next();
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
				PluginMethod method = (PluginMethod) ii.next();
				// Do Image Stuff
				Image im = method.getImage();
				ImageIcon ic = iconifyImage(im);
				// Add button
				// Yijun: a change to minimize the icon size by default
				JToggleButton jb = null;
				if (System.getProperty("openome.toolbar.tooltip")==null) {
					// default
					jb = new JToggleButton(ic);
					jb.setMargin(new Insets(1, 0, 1, 0));
					jb.setIconTextGap(1);
				} else {
				    jb = new JToggleButton(method.getName(), ic);	
					jb.setMargin(new Insets(1, 1, 1, 1));
					jb.setFont(new Font("SansSerif", Font.PLAIN, 9));
					jb.setVerticalTextPosition(SwingConstants.BOTTOM);
					jb.setHorizontalTextPosition(SwingConstants.CENTER);
				}
				jb.setToolTipText(method.getName());
				jb.setRequestFocusEnabled(false);
				jb.addActionListener(new GVCActionAdapter(method, jb, this));
				newbar.add(jb);
			}
			gframe.addToolBar(newbar);
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
		view.getDisplayBounds().y = value; 
		adjustScrollBar();
		view.refreshVisible();
	}
	/** Sets the view value in <code> GraphicView </code> according to the value 
	 *  of the horizontal scroll bar.
	 *  @param value 	the value of the horizontal scroll bar.
	 */
	protected void setSbhValue(int value) {
		view.getDisplayBounds().x = value;
		adjustScrollBar();
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
		if (sbh!=null && sbv!=null) {
			sbh.setValues(hvalue, hextent, hmin, hmax);
			sbh.setBlockIncrement(view.getDisplayBounds().width / 4);
			sbv.setValues(vvalue, vextent, vmin, vmax);
			sbv.setBlockIncrement(view.getDisplayBounds().height / 4);
		}
	}
	/** Passes the scroll bar objects to this class.
	 *
	 *  @param psbv  the vertical scroll bar object.
	 *  @param psbh  the horizonal scroll bar object.
	 */
	protected void SetScrollbars(JScrollBar psbv, JScrollBar psbh) {
		sbv = psbv;
		sbh = psbh;
	}
	/** Toggles selection.
	 *  @param p 	the last clicked point.
	 */
	protected void toggleSelect(Point p) {
		GraphicViewElement ge;
		GraphicViewLink gl;
		setClickedP(p);
		if ((ge = view.findElement(p)) != null) {
			ge.setSelected(!ge.isSelected());
			view.markDirty(ge.getSelectableBounds());
		} else if ((gl = view.findLink(p)) != null) {
			gl.setSelected(!gl.isSelected());
			view.markDirty(gl.getSelectableBounds());
		} else if ((gl = view.findLinkControlPoint1(p)) != null) {
			gl.setSelected(!gl.isSelected());
			view.markDirty(gl.getSelectableControlBounds1());
		} else if ((gl = view.findLinkControlPoint2(p)) != null) {
			gl.setSelected(!gl.isSelected());
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
		if ((ge = view.findElement(p)) != null) {
			ge.setSelected(true);
		} else if ((gl = view.findLink(p)) != null) {
			gl.setSelected(true);
		} else if ((gl = view.findLinkControlPoint1(p)) != null) {
			gl.setSelected(true);
		} else if ((gl = view.findLinkControlPoint2(p)) != null) {
			gl.setSelected(true);
		} else {
			view.deselectAll();			
		}
	}
	private static final float dash[] = { 10.0f, 5.0f, 5.0f, 5.0f };
	/** Returns a dashed stroke. */
	private Stroke getDashedStroke() {
		return new BasicStroke(
			3.0f,
			BasicStroke.CAP_BUTT,
			BasicStroke.JOIN_MITER,
			10.0f,
			dash,
			0.0f);
	}
	
	/** Draws an expanded element.
	 *  @param g	the <code> Graphics </code> to draw on.
	 *  @param ge	the expanded element to be drawn.
	 */
	public void drawExpandedElements(Graphics2D g, GraphicViewElement ge) {
		if (!ge.isDirty()) return;
		Rectangle rec = ge.getExpandedBounds();
		Color bgcolor = getBackground();
		if (!to_print)
			g.setColor(
				new Color(
					(int) (0.95 * bgcolor.getRed()),
					(int) (0.95 * bgcolor.getGreen()),
					(int) (0.95 * bgcolor.getBlue())));
		else
			g.setColor(bgcolor);
		fillCircle(g, rec);
		g.setColor(Color.black);
		Stroke strokeholder = g.getStroke();
		g.setStroke(getDashedStroke());
		drawCircle(g, rec);
		g.setStroke(strokeholder);
		// Draws the element image.
		drawElements(g, ge);
	}
	/** Draws an element.
	 *  @param g 	the <code> Graphics </code> to draw on.
	 *  @param ge	the element to be drawn.
	 */
	protected void drawElements(Graphics2D g, GraphicViewElement ge) {
		if (!ge.isDirty()) return;
		drawShape(g, ge);
		drawPriority(g, ge);		
		drawText(g, ge, ELEMENT_TYPE);
		drawDegree(g, ge);
		if (Computing.propertyHolds("ome.visualization.certainty.color")
		  || Computing.propertyHolds("ome.visualization.conflict.color")				)
			paintTemperature(DIMENSION_CONFLICT, g, ge);
		if (Computing.propertyHolds("ome.visualization.performance.color")
		  || Computing.propertyHolds("ome.visualization.satisfiability.color"))
			paintTemperature(DIMENSION_SAT, g, ge);
		if (Computing.propertyHolds("ome.visualization.feasibility.color")
			  || Computing.propertyHolds("ome.visualization.denial.color"))
			paintTemperature(DIMENSION_DEN, g, ge);
		if (Computing.propertyHolds("ome.visualization.label"))
			drawAttributes(g, ge);
	}
	final int skew = 15; 
	final int border = 5; 
	/**
	 * @param g
	 * @param ge
	 */
	private void drawShape(Graphics2D g, GraphicViewElement ge) {
		TelosParserIndividual t =(TelosParserIndividual)((TelosElement)ge.getModelElement()).getType(); 
		if (t.telosName().indexOf("Agent")>=0) { // IStarAgentElement
			// clear enough space
			Rectangle rec = calc_bounding_box(g, ge);
			Color bgcolor = getBackground();
			g.setColor(
				new Color(
					(int) (0.8 * bgcolor.getRed()),
					(int) (0.95 * bgcolor.getGreen()),
					(int) (0.8 * bgcolor.getBlue())));			
			fillCircle(g, rec);
			g.setColor(Color.black);
			Stroke strokeholder = g.getStroke();
			g.setStroke(new BasicStroke(2.0f));
			drawCircle(g, rec);
			g.drawLine((int)(rec.x + (1-Math.sqrt(3)/2) * rec.width/2) + 2, 
					(int)(rec.y + rec.height/4),
					(int)(rec.x + rec.width - (1-Math.sqrt(3)/2) * rec.width/2 - 4),
					(int)(rec.y + rec.height/4));
			g.setStroke(strokeholder);
		} 
		/* Xiaoxue Deng - Actor, Role, Position */
		else if (t.telosName().indexOf("Actor")>=0) {// IstarActorElement
			Rectangle rec = calc_bounding_box(g, ge);
			Color bgcolor = getBackground();
			g.setColor(
				new Color(
					(int) (0.8 * bgcolor.getRed()),
					(int) (0.95 * bgcolor.getGreen()),
					(int) (0.8 * bgcolor.getBlue())));			
			fillCircle(g, rec);
			g.setColor(Color.black);
			Stroke strokeholder = g.getStroke();
			g.setStroke(new BasicStroke(2.0f));
			drawCircle(g, rec);
			g.setStroke(strokeholder);
		}
		else if (t.telosName().indexOf("Position")>=0) { // IStarPositionElement
			// clear enough space
			Rectangle rec = calc_bounding_box(g, ge);
			Color bgcolor = getBackground();
			g.setColor(
				new Color(
					(int) (0.8 * bgcolor.getRed()),
					(int) (0.95 * bgcolor.getGreen()),
					(int) (0.8 * bgcolor.getBlue())));			
			fillCircle(g, rec);
			g.setColor(Color.black);
			Stroke strokeholder = g.getStroke();
			g.setStroke(new BasicStroke(2.0f));
			drawCircle(g, rec);
			g.drawLine((int)(rec.x + (1-Math.sqrt(3)/2) * rec.width/2) + 2, 
					(int)(rec.y - rec.height/4),
					(int)(rec.x + rec.width - (1-Math.sqrt(3)/2) * rec.width/2 - 4),
					(int)(rec.y - rec.height/4));
			g.setStroke(strokeholder);
		} 
		/*else if (t.telosName().indexOf("Position")>=0) { // IStarRoleElement
			// clear enough space
			Rectangle rec = calc_bounding_box(g, ge);
			Color bgcolor = getBackground();
			g.setColor(
				new Color(
					(int) (0.8 * bgcolor.getRed()),
					(int) (0.95 * bgcolor.getGreen()),
					(int) (0.8 * bgcolor.getBlue())));			
			fillCircle(g, rec);
			g.setColor(Color.black);
			Stroke strokeholder = g.getStroke();
			g.setStroke(new BasicStroke(2.0f));
			drawCircle(g, rec);
			g.drawLine((int)(rec.x + (1-Math.sqrt(3)/2) * rec.width/2) + 2, 
					(int)(rec.y + rec.height/4),
					(int)(rec.x + rec.width - (1-Math.sqrt(3)/2) * rec.width/2 - 4),
					(int)(rec.y + rec.height/4));
			g.drawLine((int)(rec.x + (1-Math.sqrt(3)/2) * rec.width/2) + 2, 
					(int)(rec.y - rec.height/4),
					(int)(rec.x + rec.width - (1-Math.sqrt(3)/2) * rec.width/2 - 4),
					(int)(rec.y - rec.height/4));
			g.setStroke(strokeholder);
		} */
		else if (t.telosName().indexOf("IStarGoal")>=0) { // IStarGoalElement
			Rectangle rec = calc_bounding_box(g, ge);
			g.setColor(getBackground());
			g.fillRect((int)(rec.x + rec.height/2 + 2),	(int)(rec.y + 2),
					rec.width - rec.height - 2, rec.height - 4);
			if (!to_print) {
				g.fillArc(rec.x + 2, rec.y + 2, rec.height - 4, rec.height - 4, 0, 360);
				g.fillArc(rec.x + 2 + rec.width- rec.height, rec.y + 2, rec.height - 4, rec.height - 4, 0, 360);
			} else {
				g.fillArc(rec.x + 2, rec.y + 2, rec.height - 4, rec.height - 4, 0, 359);
				g.fillArc(rec.x + 2 + rec.width- rec.height, rec.y + 2, rec.height - 4, rec.height - 4, 0, 359);				
			}
			g.setColor(Color.black);
			Stroke strokeholder = g.getStroke();
			g.setStroke(new BasicStroke(2.0f));
			g.drawArc(rec.x + 2, rec.y + 2, rec.height - 4, rec.height - 4, 90, 180);
			g.drawLine((int)(rec.x + rec.height/2 + 2), 
					(int)(rec.y + 2),
					(int)(rec.x + rec.width - rec.height/2),
					(int)(rec.y + 2));
			g.drawLine((int)(rec.x + rec.height/2 + 2), 
					(int)(rec.y + rec.height - 2),
					(int)(rec.x + rec.width - rec.height/2),
					(int)(rec.y + rec.height - 2));
			g.drawArc(rec.x + 2 + rec.width- rec.height, rec.y + 2, rec.height - 4, rec.height - 4, -90, 180);
			g.setStroke(strokeholder);		
		} else if (t.telosName().indexOf("Task")>=0) { // IStarTaskElement
			int s[] = drawText(g, ge, ELEMENT_TYPE);
			int w = s[0], h = s[1];
			Rectangle rec = ge.getImageBounds();
			w = Math.max(w, rec.width - rec.height/2);
			h = Math.max(h, rec.height);
			w += 2;
//			h += 6;
			if (w != h/2)
				w = w * (w - h/4) / (w - h /2);
			rec = new Rectangle(
					rec.x - (w - rec.width)/2, 
					rec.y - (h - rec.height)/2, 
					w, 
					h);
			g.setColor(getBackground());
			g.fillRect((int)(rec.x + rec.height/2 + 2),	(int)(rec.y + 2),
					rec.width - rec.height - 2, rec.height - 4);
			int x[] = new int[6];
			int y[] = new int[6];
			x[0] = rec.x + 2;
			y[0] = rec.y + rec.height/2;
			x[1] = rec.x + 1 + rec.height/4;
			y[1] = rec.y + 2;
			x[3] = rec.x + rec.width;
			y[3] = y[0];
			x[2] = x[3] - (x[1] -x[0]);
			y[2] = y[1];
			x[4] = x[2];
			y[4] = rec.y + rec.height - 2;
			x[5] = x[1];
			y[5] = y[4];
			g.fillPolygon(x, y, 6);
			g.setColor(Color.black);
			Stroke strokeholder = g.getStroke();
			g.setStroke(new BasicStroke(2.0f));
			g.drawPolygon(x, y, 6);
			g.setStroke(strokeholder);			
		} else if (t.telosName().indexOf("Soft")>=0) { // IStarSoftgoalElement
			Polygon p = calculateSoftBoundary(g, ge);
			g.setColor(getBackground());
			g.fillPolygon(p);
			g.setColor(Color.black);			
			Stroke strokeholder = g.getStroke();
			g.setStroke(new BasicStroke(2.0f));
			g.drawPolygon(p);
			g.setStroke(strokeholder);						
		} else if (t.telosName().indexOf("Claim")>=0) { // IStarSoftgoalElement
			Polygon p = calculateSoftBoundary(g, ge);
			g.setColor(getBackground());
			g.fillPolygon(p);
			g.setColor(Color.black);			
			Stroke strokeholder = g.getStroke();
			g.setStroke(getDashedStroke());
			g.drawPolygon(p);
			g.setStroke(strokeholder);						
		} else if (t.telosName().indexOf("Operationalization")>=0) { // NFROperationalization
			Polygon p = calculateSoftBoundary(g, ge);
			g.setColor(getBackground());
			g.fillPolygon(p);
			g.setColor(Color.black);			
			Stroke strokeholder = g.getStroke();
			g.setStroke(new BasicStroke(4.0f));
			g.drawPolygon(p);
			g.setStroke(strokeholder);						
		} else {
			g.drawImage(
					ge.getImage(),
					ge.getImageBounds().x,
					ge.getImageBounds().y,
					this);
		}
//		if (!to_print)
//			g.setColor(Color.blue);
//		else
			g.setColor(Color.black);
	}
	/**
	 * Calculate the SoftGoal shape boundary to draw
	 * @param g Graphics2D object
	 * @param ge GraphicsViewElement to calculate
	 * @return
	 */
	private Polygon calculateSoftBoundary(Graphics2D g, GraphicViewElement ge) {
		Rectangle rec = calc_bounding_box(g, ge);
		int x[] = new int[6];
		int y[] = new int[6];
		x[0] = rec.x + rec.width/skew;
		y[0] = rec.y + border;
		x[1] = rec.x + rec.width/2 - border;
		y[1] = rec.y + rec.height/skew + border;
		x[2] = rec.x + rec.width - border;
		y[2] = y[0];
		x[3] = rec.x + rec.width*(1-1/skew) - border;
		y[3] = rec.y + rec.height - border;
		x[4] = x[1];
		y[4] = rec.y + rec.height*(1-1/skew) - border;
		x[5] = rec.x;
		y[5] = rec.y + rec.height - border;
		Polygon p = calcCubicPolygon(g, x, y);
		return p;
	}
	
	/**
	 * @see http://www.cse.unsw.edu.au/~lambert/splines/NatCubicClosed.java
	 */
	public class Cubic {
	  float a,b,c,d;         /* a + b*u + c*u^2 +d*u^3 */
	  public Cubic(float a, float b, float c, float d){
	    this.a = a;
	    this.b = b;
	    this.c = c;
	    this.d = d;
	  }
	  /** evaluate cubic */
	  public float eval(float u) {
	    return (((d*u) + c)*u + b)*u + a;
	  }
	}
	Cubic[] calcNaturalCubic(int n, int[] x) {
		    float[] w = new float[n+1];
		    float[] v = new float[n+1];
		    float[] y = new float[n+1];
		    float[] D = new float[n+1];
		    float z, F, G, H;
		    int k;
		    /* We solve the equation
		       [4 1      1] [D[0]]   [3(x[1] - x[n])  ]
		       |1 4 1     | |D[1]|   |3(x[2] - x[0])  |
		       |  1 4 1   | | .  | = |      .         |
		       |    ..... | | .  |   |      .         |
		       |     1 4 1| | .  |   |3(x[n] - x[n-2])|
		       [1      1 4] [D[n]]   [3(x[0] - x[n-1])]
		       
		       by decomposing the matrix into upper triangular and lower matrices
		       and then back sustitution.  See Spath "Spline Algorithms for Curves
		       and Surfaces" pp 19--21. The D[i] are the derivatives at the knots.
		       */
		    w[1] = v[1] = z = 1.0f/4.0f;
		    y[0] = z * 3 * (x[1] - x[n]);
		    H = 4;
		    F = 3 * (x[0] - x[n-1]);
		    G = 1;
		    for ( k = 1; k < n; k++) {
		      v[k+1] = z = 1/(4 - v[k]);
		      w[k+1] = -z * w[k];
		      y[k] = z * (3*(x[k+1]-x[k-1]) - y[k-1]);
		      H = H - G * w[k];
		      F = F - G * y[k-1];
		      G = -v[k] * G;
		    }
		    H = H - (G+1)*(v[n]+w[n]);
		    y[n] = F - (G+1)*y[n-1];
		    
		    D[n] = y[n]/H;
		    D[n-1] = y[n-1] - (v[n]+w[n])*D[n]; /* This equation is WRONG! in my copy of Spath */
		    for ( k = n-2; k >= 0; k--) {
		      D[k] = y[k] - v[k+1]*D[k+1] - w[k+1]*D[n];
		    }
		    /* now compute the coefficients of the cubics */
		    Cubic[] C = new Cubic[n+1];
		    for ( k = 0; k < n; k++) {
		      C[k] = new Cubic((float)x[k], D[k], 3*(x[k+1] - x[k]) - 2*D[k] - D[k+1],
				       2*(x[k] - x[k+1]) + D[k] + D[k+1]);
		    }
		    C[n] = new Cubic((float)x[n], D[n], 3*(x[0] - x[n]) - 2*D[n] - D[0],
				     2*(x[n] - x[0]) + D[n] + D[0]);
		    return C;
	}	
	static int STEPS = 20;
	private Polygon calcCubicPolygon(Graphics2D g, int[] x, int[] y) {
		int n = x.length;
		if (n<2) return new Polygon();
	    Cubic[] X = calcNaturalCubic(n-1, x);
	    Cubic[] Y = calcNaturalCubic(n-1, y);
	    Polygon p = new Polygon();
	    p.addPoint((int) Math.round(X[0].eval(0)),(int) Math.round(Y[0].eval(0)));
	    for (int i = 0; i < X.length; i++) {
		  for (int j = 1; j <= STEPS; j++) {
		  float u = j / (float) STEPS;
		  p.addPoint(Math.round(X[i].eval(u)),
		             Math.round(Y[i].eval(u)));
    	  }
	    }
	    return p;
	}
	/**
	 * @param g
	 * @param ge
	 * @return
	 */
	private Rectangle calc_bounding_box(Graphics2D g, GraphicViewElement ge) {
		int s[] = drawText(g, ge, ELEMENT_TYPE);
		int w = s[0] + 2, h = s[1] + 2;
		Rectangle rec = ge.getImageBounds();
		rec = new Rectangle(
				rec.x - (Math.max(w, rec.width) - rec.width)/2, 
				rec.y - (Math.max(h, rec.height) - rec.height)/2, 
				Math.max(w, rec.width), 
				Math.max(h, rec.height));
		return rec;
	}
	/**
	 * @param g
	 * @param rec
	 */
	private void drawCircle(Graphics2D g, Rectangle rec) {
		if (!to_print)
			g.drawArc(rec.x + 2, rec.y + 2, rec.width - 4, rec.height - 4, 0, 360);
		else
			g.drawArc(rec.x + 2, rec.y + 2, rec.width - 4, rec.height - 4, 0, 359);
	}
	/**
	 * @param g
	 * @param rec
	 */
	private void fillCircle(Graphics2D g, Rectangle rec) {
		if (!to_print)
			g.fillArc(rec.x + 2, rec.y + 2, rec.width - 4, rec.height - 4, 0, 360);
		else {
			g.fillArc(rec.x + 2, rec.y + 2, rec.width - 4, rec.width - 4, 0, 359);
		}
	}
	/**
	 * Draw the priority annotation to the upper-right corner of the element
	 * @author Yijun Yu 
	 * @param g
	 * @param ge
	 */
	private void drawPriority(Graphics2D g, GraphicViewElement ge) {
		int p = ge.getPriority();
		if (p==0) return;		
		Iterator textattributes = ge.getTextAttributes();
		GraphicViewObject.GraphicViewTextAttribute gvta =
			(GraphicViewObject.GraphicViewTextAttribute) textattributes
				.next();		
		TextLayout tl = new TextLayout("!" + p, gvta.font, gvta.fontrc);
		tl.draw(g, ge.getImageBounds().x + 75, ge.getImageBounds().y);
	}

	/**
	 * Shade the element according to its sat score
	 * Currently using the 'conflicting' score (S+D > 1)
	 * @author Neil Ernst
	 * @param g - Graphics 2D object
	 * @param ge - the element to paint
	 */
	private void paintTemperature(int dimension, Graphics2D g, GraphicViewElement ge) {
		TelosParserIndividual t = (TelosParserIndividual)((TelosElement)ge.getModelElement()).getType(); 
		float s = ((TelosElement)ge.getModelElement()).getSat();
		float d = ((TelosElement)ge.getModelElement()).getDen();
		float perf = ((TelosElement)ge.getModelElement()).getPerf();
		Color bgcolor = getBackground();
		switch (dimension) {
		case DIMENSION_CONFLICT:
			if (s + d <= 1) return;	
			float conflict = s + d / 2; //normalized degree of conflict
			if (t.telosName().indexOf("IStarSoftGoalElement") >= 0) { // IStarSoftgoalElement
				Polygon p = calculateSoftBoundary(g, ge);
				//set the color to some shade of red depending on value of conflict
				g.setColor(new Color(
						(int) (conflict * bgcolor.getRed()) % 256,
						(int) (0 * bgcolor.getGreen()) % 256,
						(int) (0 * bgcolor.getBlue()) % 256));
				g.fillPolygon(p);
				g.setColor(Color.black);			
				Stroke strokeholder = g.getStroke();
				g.setStroke(new BasicStroke(2.0f));
				g.drawPolygon(p);
				g.setStroke(strokeholder);	
			} else {
				Rectangle rec = calc_bounding_box(g, ge);
				//need new way of determining actual shape dimensions.
				g.setColor(new Color(
						(int) (d * bgcolor.getRed()) % 256,
						(int) (perf * bgcolor.getGreen()) % 256,
						(int) (s * bgcolor.getBlue()) % 256));
				fillCircle(g, rec);
			}
			break;
		case DIMENSION_SAT:
			if (s <= 0) return;	
			if (t.telosName().indexOf("IStarSoftGoalElement") >= 0) { // IStarSoftgoalElement
				Polygon p = calculateSoftBoundary(g, ge);
				//set the color to some shade of red depending on value of conflict
				g.setColor(Color.getHSBColor(
									perf * 0.44f + 0.56f, //make sure it isn't too strange
									0.8f, 
									s * 0.8f + 0.2f)); //various hacks
				g.fillPolygon(p);
				g.setColor(Color.black);			
				Stroke strokeholder = g.getStroke();
				g.setStroke(new BasicStroke(2.0f));
				g.drawPolygon(p);
				g.setStroke(strokeholder);	
			} else {
				Rectangle rec = calc_bounding_box(g, ge);
				//need new way of determining actual shape dimensions.
				g.setColor(new Color(
						(float) (0.0 * bgcolor.getRed()/255),
						(float) (0.0 * bgcolor.getGreen()/255),
						(float) (1.0 * bgcolor.getBlue()/255),
						(float) s)); //alpha
				fillCircle(g, rec);
			}
			break;
		case DIMENSION_DEN:
			if (d <= 0) return;	
			if (t.telosName().indexOf("IStarSoftGoalElement") >= 0) { // IStarSoftgoalElement
				Polygon p = calculateSoftBoundary(g, ge);
				//set the color to some shade of red depending on value of conflict
				g.setColor(new Color(
						(float) (1.0 * bgcolor.getRed()/255),
						(float) (0.0 * bgcolor.getGreen()/255),
						(float) (0.0 * bgcolor.getBlue()/255),
						(float) d)); //alpha
				g.fillPolygon(p);
				g.setColor(Color.black);			
				Stroke strokeholder = g.getStroke();
				g.setStroke(new BasicStroke(2.0f));
				g.drawPolygon(p);
				g.setStroke(strokeholder);	
			} else {
				Rectangle rec = calc_bounding_box(g, ge);
				//need new way of determining actual shape dimensions.
				g.setColor(new Color(
						(int) (d * bgcolor.getRed()) % 256 ,
						(int) (perf * bgcolor.getGreen()) % 256 ,
						(int) (s * bgcolor.getBlue()) % 256 ));
				fillCircle(g, rec);
			}
			break;
		} //switch
		drawText(g, ge, ELEMENT_TYPE);
	}
		
	/**
	 * Draw the priority annotation to the upper-right corner of the element
	 * @author Yijun Yu 
	 * @param g
	 * @param ge
	 */
	private void drawDegree(Graphics2D g, GraphicViewElement ge) {
		float s = ((TelosElement)ge.getModelElement()).getSat();
		float d = ((TelosElement)ge.getModelElement()).getDen();
		float p = ((TelosElement)ge.getModelElement()).getPerf();
		if (s==0 && d==0 && p == 0) return;		
		Iterator textattributes = ge.getTextAttributes();
		GraphicViewObject.GraphicViewTextAttribute gvta =
			(GraphicViewObject.GraphicViewTextAttribute) textattributes
				.next();
		TextLayout t1 = null, t2=null, t3=null;
		int h1 = 0, h2 = 0, h3 = 0;
		if (Computing.propertyHolds("ome.visualization.certainty.label"))
			t1 = new TextLayout("c=" + Math.round(100*s)/100f, gvta.font, gvta.fontrc);
		else if (Computing.propertyHolds("ome.visualization.satisfiability.label"))
			t1 = new TextLayout("s=" + Math.round(100*s)/100f, gvta.font, gvta.fontrc);
		if (Computing.propertyHolds("ome.visualization.feasibility.label"))
			t2 = new TextLayout("f=" + Math.round(100*d)/100f, gvta.font, gvta.fontrc);
		else if (Computing.propertyHolds("ome.visualization.denial.label"))
			t2 = new TextLayout("d=" + Math.round(100*d)/100f, gvta.font, gvta.fontrc);
		if (Computing.propertyHolds("ome.visualization.performance.label"))
			t3 = new TextLayout("p=" + Math.round(100*p)/100f, gvta.font, gvta.fontrc);
		if (t2!=null) {
			h2 = t2.getBounds().getBounds().height;
			t2.draw(g, ge.getImageBounds().x + 80, ge.getImageBounds().y + ge.getImageBounds().height - h2);
		}
		if (t1!=null) {
			h1 = t1.getBounds().getBounds().height;
			t1.draw(g, ge.getImageBounds().x + 80, ge.getImageBounds().y + ge.getImageBounds().height - h1 - h2 - 2);
		}
		if (t3!=null) {
			h3 = t3.getBounds().getBounds().height;
			t3.draw(g, ge.getImageBounds().x + 80, ge.getImageBounds().y + ge.getImageBounds().height - h1 - h2 - h3 -2);
		}
	}
		
	private void drawAttributes(Graphics2D g, GraphicViewObject gvo) {
		Iterator i = gvo.getAttributes();
		while (i.hasNext()) {
			GraphicViewAttribute gva =
				(GraphicViewAttribute) i.next();
			if (gva.getImage() != null) {
				g.drawImage(
					gva.getImage(),
					gva.getBounds().x,
					gva.getBounds().y,
					this);
			}
		}
	}
	/** Draws an object's text, with each line centered over it's text bounds. */
	private int[] drawText(Graphics2D g, GraphicViewObject go, int type) {
		Iterator textattributes = go.getTextAttributes();
		int h = 0, w = 0;
		g.setRenderingHint(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_OFF);
		while (textattributes.hasNext()) {
			GraphicViewObject.GraphicViewTextAttribute gvta =
				(GraphicViewObject.GraphicViewTextAttribute) textattributes
					.next();
			Iterator i = gvta.getText(g.getFontRenderContext());
			while (i.hasNext()) {
				Pair pair = (Pair) i.next();
				TextLayout tl = (TextLayout) pair.first;
				Point p = (Point) pair.second;
				g.setFont(gvta.font);
				if (type == ELEMENT_TYPE) {
					tl.draw(g, p.x, p.y);
					w = Math.max(w, tl.getBounds().getBounds().width);
					h += tl.getBounds().getBounds().height + 1;
				} else if (type == LINK_TYPE) {
					//pass the text and set a width
					if(go instanceof GraphicViewLink) {
						GraphicViewLink gvl = (GraphicViewLink) go;
						float f = parseTextValue(gvta.getText());
						gvl.setWidth(f);
					}
					if (!gvta.getText().startsWith("Dep") 
							|| Computing.propertyHolds("ome.visualization.linklabel"))
						tl.draw(g, go.getImageBounds().x, go.getImageBounds().y + 25);
					w = Math.max(w, tl.getBounds().getBounds().width);
					h += tl.getBounds().getBounds().height + 1;
				}
			}
		}
		setAntialiasing(g);
		return new int[] { w, h};
	}
	/**
	 * Parse the string and extract the number, if any, on the link string
	 * Expected format is "Dep 0.7"
	 * Yijun: What about "Help 0.7"?
	 * This might have been easier with a regexp
	 * @author Neil Ernst
	 * @param text to parse
	 * @return a double with the value, 0 if nothing parsed
	 */
	private float parseTextValue(String text) {
		if(text == null 
			|| ! text.startsWith("Dep")) // Yijun
			return 0f;
//		double result = 0;
//		double divisor = 10;
//		boolean decimal = false;
//		
//		CharacterIterator it = new StringCharacterIterator(text);
//		//for ( Character ch : text) jdk1.5
//		for (char ch=it.first(); ch != CharacterIterator.DONE; ch=it.next()) {
//			//System.out.println("char is: " + ch);
//			if (ch == '.')
//				decimal = true;
//			if (Character.isDigit(ch)) {
//				double i = (double) ch - 48; //convert from unicode char set
//				if(!decimal) //ones column
//					result += i;
//				else {//after the decimal, divide by values of 10,100,etc
//					result += i / divisor;
//					divisor *= 10;
//				}
//			}
//		}
//		return (float) result;
		float result = Float.parseFloat(text.substring(text.indexOf(" ")+1));
		return result;
	}
	/** Draws a link.
	 *  @param 	the <code> Graphics </code> to draw on.
	 *  @param gl	the link to be drawn.
	 */
	private void drawLinks(Graphics2D g, GraphicViewLink gl) {
		if (!gl.isDirty()) return;
		GraphicViewObject from = (GraphicViewObject) gl.getFrom();
		GraphicViewObject to = (GraphicViewObject) gl.getTo();
		// images and lines are drawn by the system with a different bias,
		// however, we are using images for arrowheads...
		if (from==null || to==null) return;
		gl.getstart1().setLocation(
			from.getImageBounds().x + from.getImageBounds().getWidth() / 2,
			from.getImageBounds().y + from.getImageBounds().getHeight() / 2);
			gl.getend2().setLocation(
			to.getImageBounds().x + to.getImageBounds().getWidth() / 2,
			to.getImageBounds().y + to.getImageBounds().getHeight() / 2);
		if (gl.getend1().x == 0.0)
			gl.init();
		gl.getQuad1().setCurve(gl.getstart1(), gl.getcontrol1(), gl.getend1());
		gl.getQuad2().setCurve(gl.getstart2(), gl.getcontrol2(), gl.getend2());
		setAntialiasing(g);
		g.translate(-0.5, -0.5);
		
		//neil - do this earlier
		//FIXME: probably not the right place to set width
		if (gl.getName() != null)
			drawText(g, gl, LINK_TYPE); //also sets the width
		
		// And draw attributes.
		drawAttributes(g, gl);
		
		Stroke s = g.getStroke();
		if (Computing.propertyHolds("edu.toronto.cs.ome.editor.link.color.grey"))
			gl.setColor(Color.gray);
		else
			gl.setColor(Color.blue);
		gl.setStroke();
		g.setStroke(gl.getStroke());
		if (!to_print){
			g.setPaint(gl.getColor());
		}
		else
			g.setPaint(Color.black);
		g.draw((Shape) gl.getQuad1());
		g.draw((Shape) gl.getQuad2());
		//labels?
		if (!to_print)
			g.setPaint(gl.getColor());
		else
			g.setPaint(Color.black);
		g.setStroke(s);
		g.translate(.5, .5);
		/* Xiaoxue Deng - Dependency, means-ends, decomposition, contribution */
/*		TelosParserIndividual t =(TelosParserIndividual)((TelosLink)gl.getModelLink()).getType(); 
		if (t.telosName().indexOf("Dependency")>=0) { // IStarDependencyLink
			int w = (int)(gl.getImageBounds().width * getScale());
			int h = (int)(gl.getImageBounds().height*getScale());
			BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g1 = bi.createGraphics();			
			g1.rotate((double) gl.getRotation(), (double) w / 3.0 , (double) h / 3.0);
			g1.setColor(Color.black);
			g1.setStroke(new BasicStroke(2.0f));
			g1.drawLine(w/2, h/6, w/2, h*5/6);
			g1.drawArc(w/6, h/6, w*2/3, h*2/3, -90, 180);
			g.drawImage(bi, gl.getImageBounds().x, gl.getImageBounds().y, this);
		} else if (t.telosName().indexOf("Mean")>=0) { // IStarMeansEnds
			int w = (int)(gl.getImageBounds().width * getScale());
			int h = (int)(gl.getImageBounds().height*getScale());
			BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g1 = bi.createGraphics();			
			g1.rotate((double) gl.getRotation(), (double) w / 2.0, (double) h / 2.0);
			g1.setColor(Color.black);
			g1.setStroke(new BasicStroke(2.0f));
			g1.drawLine(w/2, h/6, w/2, h*5/6);
			g.drawImage(bi, gl.getImageBounds().x, gl.getImageBounds().y, this);
		} else {		*/	
			g.drawImage(
				gl.getImage(),
				gl.getImageBounds().x,
				gl.getImageBounds().y,
				this);
//		}

	}

	// caching stuff here.... sadly still used
//	BufferedImage im3;
//	Dimension im3s;
//	Graphics2D im3g;

	boolean to_print = false;

	/** Sets the antialiasing of the passed graphics context to that of our
	 * current `antialias' setting. Used to implement the drawing optimization
	 * of not antialiasing while moving. */
	private void setAntialiasing(Graphics2D g) {
		g.setRenderingHint(
			RenderingHints.KEY_ANTIALIASING,
			((antialias)
				? RenderingHints.VALUE_ANTIALIAS_ON
				: RenderingHints.VALUE_ANTIALIAS_OFF));
	}
	/** draws all expanded, visible and not hidden objects. Called by Paint,
	 * and Print to draw the elements and links, etc.. onto the canvas.
	 *  @param g Graphics2D to draw onto
	 */
	private void draw(Graphics2D g) {
		draw_expanded_elements(g);
		draw_highlighted_objects(g);
		drawlinks(g);
		drawelements(g);
		draw_selected_objects(g);
		draw_selection_box(g);
	}
	/**
	 * @param g
	 */
	private void draw_expanded_elements(Graphics2D g) {
		GraphicViewElement ge;
		Iterator e;
		e = view.getExpandedElements().iterator();
		while (e.hasNext()) {
			ge = (GraphicViewElement) e.next();
			if (!ge.isHidden()) {
				if (!ge.partially_hidden)
					drawExpandedElements(g, ge);
			}
		}
	}
	/**
	 * @param g
	 */
	private void draw_highlighted_objects(Graphics2D g) {
		GraphicViewObject go;
		Iterator e;
		// Highlighted objects.
		g.setColor(Color.magenta);
		e = view.getHighlightedObjects().iterator();
		while (e.hasNext()) {
			go = (GraphicViewObject) e.next();
			if (!go.isHidden() && !go.isIconified()) {
				g.fillRect(
					go.getSelectableBounds().x,
					go.getSelectableBounds().y,
					go.getSelectableBounds().width - 1,
					go.getSelectableBounds().height - 1);
			}
		}
	}
	/**
	 * @param g
	 */
	private void draw_selection_box(Graphics2D g) {
		// Draw the selection box, if it is active.
		if (selectionbox != null) {
			Rectangle boxbounds = selectionbox.getBounds();
			g.drawRect(
				boxbounds.x,
				boxbounds.y,
				boxbounds.width,
				boxbounds.height);
		}
	}
	/**
	 * @param g
	 */
	private void draw_selected_objects(Graphics2D g) {
		GraphicViewLink gl;
		GraphicViewElement ge;
		Iterator e;
		g.setColor(Color.red);
		g.setStroke(new BasicStroke((float) .8));
		e = view.getSelectedLinks().iterator();
		while (e.hasNext()) {
			gl = (GraphicViewLink) e.next();
			if (!gl.isHidden()) {
				g.drawRect(
					gl.getSelectableBounds().x,
					gl.getSelectableBounds().y,
					gl.getSelectableBounds().width - 1,
					gl.getSelectableBounds().height - 1);
				g.drawRect(
					gl.getSelectableControlBounds1().x,
					gl.getSelectableControlBounds1().y,
					gl.getSelectableControlBounds1().width - 1,
					gl.getSelectableControlBounds1().height - 1);
				g.drawRect(
					gl.getSelectableControlBounds2().x,
					gl.getSelectableControlBounds2().y,
					gl.getSelectableControlBounds2().width - 1,
					gl.getSelectableControlBounds2().height - 1);
			}
		}
		e = view.getSelectedElements().iterator();
		while (e.hasNext()) {
			ge = (GraphicViewElement) e.next();
			//D.o("Drawing selection box for: "+ge.getName());
			if (!ge.isHidden()) {
				g.drawRect(
					ge.getSelectableBounds().x,
					ge.getSelectableBounds().y,
					ge.getSelectableBounds().width - 1,
					ge.getSelectableBounds().height - 1);
			}
		}
	}
	/**
	 * @param g
	 */
	private void drawelements(Graphics2D g) {
		GraphicViewElement ge;
		Iterator e;
		if (!to_print) {
			e = ((GraphicView)view).getVisibleElements().iterator();
		} else {
			e = ((GraphicView)view).getAllElements().iterator();
		}
		while (e.hasNext()) {
			ge = (GraphicViewElement) e.next();
			//D.o("Considering drawing Element: "+ge.getName());
			if (!ge.isHidden() && !ge.partially_hidden && !ge.isIconified()) {
				if (System.getProperty("Zoom text")!=null)
					ge.setScale(zoomscale);
				drawElements(g, ge);
			}
		}
	}
	/**
	 * Draw links
	 * @param g
	 */
	private void drawlinks(Graphics2D g) {
		GraphicViewLink gl;
		Iterator e;
//		if (!to_print)
//			g.setPaint(Color.blue);
//		else
			g.setPaint(Color.black);
		if (!to_print)
			e = view.getVisibleLinks().iterator();
		else
			e = view.getAllLinks().iterator();
		while (e.hasNext()) {
			gl = (GraphicViewLink) e.next();
			if (!gl.isHidden()) {
				D.a(gl);
				drawLinks(g, gl);
			}
		}
	}
	
	/** Exports the whole graphic view into an image file.
	 *
	 *  @param file the <code> File </code> where the graphic view should be exported
	 */
	public synchronized Image print(Rectangle bounds) {
		try {
			//D.o("Start exporting...");
			Image im = createImage(bounds.width, bounds.height);
			Graphics2D g = (Graphics2D) im.getGraphics();
			antialias = true;
			setAntialiasing(g);
			g.setRenderingHint(
				RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
			g.setRenderingHint(
				RenderingHints.KEY_ALPHA_INTERPOLATION,
				RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
			g.setRenderingHint(
				RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			g.setColor(getBackground());
			g.fillRect(0, 0, bounds.width, bounds.height);
			g.setFont(getFont());
			g.setColor(Color.black);
			g.setStroke(new BasicStroke((float) 2.0));
			// Set display bounds for printing (save old ones)
			Rectangle r = view.getDisplayBounds();
			g.translate(-bounds.x, -bounds.y);
			view.setDisplayBounds(bounds);
			draw(g);
			//restore
			view.setDisplayBounds(r);
			//D.o("Finish Printing...");
			return im;
		} catch (Exception ex) {
			D.o(ex);
		}
		return null;
	}
	public void export2svg(File f) {
		D.o("save svg: " + f.getName());
        // Get a DOMImplementation
        DOMImplementation domImpl =
            GenericDOMImplementation.getDOMImplementation();

        // Create an instance of org.w3c.dom.Document
        Document document = domImpl.createDocument(null, "svg", null);

        // Create an instance of the SVG Generator
        SVGGeneratorContext ctx = SVGGeneratorContext.createDefault(document);
        ctx.setComment("Generated by OpenOME with Batik SVG Generator");
        ctx.setEmbeddedFontsOn(true);
        GenericImageHandler ihandler = new CachedImageHandlerBase64Encoder();
        ctx.setGenericImageHandler(ihandler);          
        SVGGraphics2D g2d = new SVGGraphics2D(ctx, true);
		try {
			to_print = true;
			draw(g2d);
			to_print = false;
	        // Finally, stream out SVG to using UTF-8
	        // character to byte encoding
	        boolean useCSS = true; // we want to use CSS style attribute
	        Writer out;
			out = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
	        g2d.stream(out, useCSS);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (SVGGraphics2DIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// And here too(!?)... 
	Image im2;
	Dimension im2s;
	public Graphics2D im2g;
	// Yijun: for bird's eye view
//    Ellipse2D.Double scope;
//    BufferedImage image;
//    Dimension targetSize;
//    double scale;

	private boolean to_draw = true;

	/** Draws visible elements and links on the screen.
	 *  It only draws the visible elements and links to save resource.
	 *
	 *  @param g	the <code> Graphics </code> of the screen
	 */
	public synchronized void paint(Graphics g) {
		//D.o("Start painting...");
		// The "im2" is the image buffer for the paint function.
		// It is only (re)created when necessary.
		Dimension d =
			new Dimension(
				view.getDisplayBounds().width,
				view.getDisplayBounds().height);
		// the createImage call below spits out an exception when 
		// the dimension's width or height is zero.  I`m not sure why it ever
		// is zero, and I haven't bothered to figure it out.  This is just a
		// hacky workaround.
		if (d.width == 0 || d.height == 0) {
			d = new Dimension(1, 1); // once again, sorry.
		}
		if ((im2 == null)
			|| (d.width != im2s.width)
			|| (d.height != im2s.height)) {
			im2 = createImage(d.width, d.height);
			im2s = new Dimension(d.width, d.height);
			im2g = (Graphics2D) im2.getGraphics();
		}
		// we disable antialiasing while we move stuff, but turn it back on to
		// display a still image.
		setAntialiasing(im2g);
		// save displaybounds.
		Rectangle db = view.getDisplayBounds();
		// we must set the clip for our image to be that of the passed
		// Graphics object. 
		Rectangle r = g.getClipBounds();
		im2g.setClip(r.x, r.y, r.width, r.height);
		// clear display
		im2g.setColor(getBackground());
		im2g.fillRect(r.x, r.y, r.width, r.height);
		// Translate from scrollbars using *fullscreen displaybounds*.
		im2g.translate(-db.x, -db.y);
		// set font
		im2g.setFont(getFont());
		im2g.setColor(Color.black);
		im2g.setStroke(new BasicStroke((float) 0.1));
		// set displaybounds to dirty area.
		view.setDisplayBounds(new Rectangle(r.x+db.x, r.y+db.y, r.width,
			    r.height));
		if (to_draw)
			draw(im2g);
		antialias = true;
		// restore displaybounds.
		view.setDisplayBounds(db);
		// Draws the image buffer onto the screen graphics.
		g.drawImage(im2, 0, 0, this);
//		if (System.getProperty("view.Bird's eye")!=null) {
//			BufferedImage bi = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
//			Graphics2D g1 = bi.createGraphics();
//		    AffineTransform at = AffineTransform.getScaleInstance(200f/d.width, 200f/d.height);			
//			g1.drawImage(im2, at, this);
//			g.drawImage(bi, 0, d.height - 200, this);
//		}
		// Translate the co-ordinate back since im2 might be reused.
		im2g.translate(view.getDisplayBounds().x, view.getDisplayBounds().y);
		paintChildren(g);
		view.setViewClean();
		//D.o("Finish Painting...");
	}
	
	public GraphicView getView() {
		return view;
	}
	public void setView(GraphicView view) {
		view.gvc = this;
		this.view = view;
	}
	/** Repaints the screen. repaint() and repaint(Rectangle) indirectly call
	 * this. 
	 *
	 *  @param g	the <code> Graphics </code> of the screen.
	 */
	public synchronized void update(Graphics g) {
        	paint(g) ;
	}
	/** Displays the rename box. 
	 *
	 *  @param gve	the graphic view object which we wish to rename 
	 */
	/*package*/
	void openRenameBox(GraphicViewObject gve) {
		int sizex = gve.getSelectableBounds().width / 2;
		int sizey = gve.getSelectableBounds().height / 2;
		JTextArea rb = new JTextArea(50, 10);
		add(rb);
		rb.setBorder(new LineBorder(Color.BLACK));
		rb.setBounds(
			gve.getSelectableBounds().x - view.getDisplayBounds().x,
			gve.getSelectableBounds().y
				- view.getDisplayBounds().y
				+ sizey
				- 12,
			10 * sizex,
			24 * 10);
		boxclosed = false;
		rb.addKeyListener(new RenameBoxKeyAdapter(gve, rb, this));
		rb.addFocusListener(new RenameBoxFocusAdapter(gve, rb, this));
		rb.setText(gve.getName());
		rb.selectAll();
		rb.repaint();
		rb.requestFocus();
//		D.o("creating Jtextfield at:" + rb.getBounds());
//		D.o("renamebox created.");
	}
	/** Closes the rename box. 
	 *
	 *  @param tf 	the text Field in the rename in rename box. It needs
	 *			to be removed so we don't see it anymore.
	 */
	private synchronized void closeBox(JTextArea tf) {
		try {
			remove(tf);
			repaint();
		} catch (Exception e) {
			D.o(e);
		}
	}
	/** Displays the resize box. 
	 *  @param gve	the graphic view element we wish to resize
	 */
	/*package*/
	void openResizeBox(GraphicViewObject gvo) {
		int sizex = gvo.getSelectableBounds().width / 2;
		int sizey = gvo.getSelectableBounds().height / 2;
		JTextField tf = new JTextField(15);
		tf.setBounds(
			gvo.getSelectableBounds().x - view.getDisplayBounds().x,
			gvo.getSelectableBounds().y
				- view.getDisplayBounds().y
				+ sizey
				- 12,
			2 * sizex,
			24);
		boxclosed = false;
		tf.addKeyListener(new ResizeBoxKeyAdapter(gvo, tf, this));
		tf.addFocusListener(new ResizeBoxFocusAdapter(gvo, tf, this));
		tf.setText("" + gvo.getScale());
		add(tf);
		tf.selectAll();
		tf.repaint();
		tf.requestFocus();
		D.o("resizebox created.");
	}
	/** Displays the Add Quantitive Attributes box. 
	 *  @param gve	the graphic view element we wish to assign values to
	 */
	/*package*/
	void openAddQuanBox(TelosModel m,GraphicViewElement e) {
		//String [] quan={"Satisficed=\n", "Denied=\n"};
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    //quan,
		                    "Satisficed=\n",
		                    "Add Quantitive Attribute",
		                    JOptionPane.PLAIN_MESSAGE
		                   );
		float sat=Float.parseFloat(s);
		String d =(String)JOptionPane.showInputDialog(
                null,
                "Denied=\n",
                null,
                JOptionPane.PLAIN_MESSAGE);  
		float den=Float.parseFloat(d);
		m.setSATDEN(e,sat,den);
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
	/** set zoom scale. */
	private void setScale(double scale) {
		if (scale >= 0.1 && scale <= 3) {
			zoomscale = scale;
		}
	}
	/** get zoom scale. */
	public double getScale() {
		return zoomscale;
	}
	/** zoom in */
	public void zoomin() {
		setScale(getScale() + 0.1);
		if (Computing.propertyHolds("Zoom.distance"))
			resetFontSize(true);		
		repaint();
	}
	/**
	 * 
	 */
	private void resetFontSize(boolean zoomin) {
		Collection allelements = view.getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			GraphicViewTextAttribute gvta = (GraphicViewTextAttribute) vo.getTextAttributes().next();
			gvta.setFont();
			double factor = zoomin? getScale()/(getScale()-0.1):  getScale()/(getScale()+0.1);
			vo.bounds.x = (int) (vo.bounds.x * factor);
			vo.bounds.y = (int) (vo.bounds.y * factor);
		}
		Collection alllinks = view.getAllLinks();
		for (Iterator i = alllinks.iterator(); i.hasNext();) {
			GraphicViewLink vo = (GraphicViewLink) i.next();
			GraphicViewTextAttribute gvta = (GraphicViewTextAttribute) vo.getTextAttributes().next();
			gvta.setFont();
		}
	}
	/** zoom out */
	public void zoomout() {
		setScale(getScale() - 0.1);
		if (Computing.propertyHolds("Zoom.distance"))
			resetFontSize(false);		
		repaint();
	}
	/** getfont */
	static Font font = null;
	public Font getFont() {
		if (font==null)
			font = new Font("SansSerif", Font.PLAIN, 12);
		return font;
	}
	/** Sets the input mode for the GVC */
	private void setMode(int mode, String message) {
		switch (mode) {
			case NORMAL_MODE :
				setNormalMode(message);
				break;
			case GET_PARAMETER :
				setGPMode(message);
				break;
			case TWOD_SCROLLING :
				setTwoDScrollingMode(message);
				break;
		}
	}
	/** Go into NORMAL_MODE */
	private void setNormalMode(String message) {
		mode = NORMAL_MODE;
		gframe.getStatusBar().setMessage(message);
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//		D.o("Deselecting due to mode change to NORMAL_MODE.");
		view.deselectAll();
	}
	/** Go into GET_PARAMETER mode */
	private void setGPMode(String message) {
//		D.o("Setting mode GET_PARAMTER mode.");
		mode = GET_PARAMETER;
		gframe.getStatusBar().setMessage(message);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	/** Go into TWOD_SCROLLING mode */
	private void setTwoDScrollingMode(String message) {
//		D.o("Setting mode TWOD_SCROLLING mode");
		mode = TWOD_SCROLLING;
		gframe.getStatusBar().setMessage(message);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	/**
	 * Returns our mode.
	 * 
	 * @uml.property name="mode"
	 */
	private int getMode() {
		return mode;
	}
	public void beginTwoDScrolling() {
		setMode(TWOD_SCROLLING, null);
	}
	public void endTwoDScrolling() {
		setMode(NORMAL_MODE, null);
		adjustScrollBar();		
	}
	public void makeScrolling(int x, int y) {
		view.getDisplayBounds().x -= x;
		view.getDisplayBounds().y -= y;
	}

	/** Returns our GVCParameterCollector */
	private GVCParameterCollector getParameterCollector() {
		return pcollector;
	}
	/** Sets the title of our frame. */
	/*package*/
	void setTitle(String s) {
		gframe.setTitle(s);
	}
	/** Returns the absolute pathname where this model should be saved. */
	/* package */
	String getSavePathname() {
		return gframe.getModelPath();
	}
	/**
	 * default getSaveFileAndDirectory (will filter to all "tel" files)
	 */
	File getSaveFileAndDirectory() {
		return getSaveFileAndDirectory("tel");
	}
	/** The keyboard listener for <code> GraphicViewCanvas </code>. */
	private class GVCKeyAdapter extends KeyAdapter {
		/** Processes keyboard input.
		 *
		 *  @param e	the keyboard event to be processed
		 */
		public void keyPressed(KeyEvent e) {
			int c = e.getKeyCode();
			switch (c) {
				case KeyEvent.VK_DELETE :
			      	 // Modified by Zhifeng Liu   July ,2004
                                 /*Add a prompt to ask the user to confirm if he/she really
                                   want to delete the SelectedObjects before physically take the "delete" action
                                  */
                                 Object options[] = {"Yes", "No", "Cancel"};
                                   int option = JOptionPane.showOptionDialog(null,
         	                 (Object)"Are you sure you want to delete SelectedObjects?", "Confirm SelectedObjects Delete",
		                   JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
		                    null, options, options[1]);
                                 //  Setting to the default option to options[1] doesn't work.
                                 // Rather frustrating...
                                   if (JOptionPane.YES_OPTION ==option)
		                     {
		                     	view.deleteSelectedElements();
		                     	view.deleteSelectedLinks();
		                     	repaint();
			             }					
					break;
				case KeyEvent.VK_ESCAPE :
					if (getMode() == GET_PARAMETER) {
						// User wants out of the current plugin method.
						getParameterCollector().cancelMethod();
					} else if (getMode() == NORMAL_MODE) { //normal mode
						view.deselectAll();
						repaint();
					} else if(getMode() == TWOD_SCROLLING) {
						gframe.gvc.endTwoDScrolling();						
					}
					break;
				case KeyEvent.VK_1:
					view.markSelectedElements("IStarSatisficedElementLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_2:
					view.markSelectedElements("IStarDeniedElementLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_3:
					view.markSelectedElements("IStarWeaklySatisficedElementLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_4:
					view.markSelectedElements("IStarWeaklyDeniedElementLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_5:
					view.markSelectedElements("IStarUndecidedElementLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_6:
					view.markSelectedElements("IStarConflictElementLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_SEMICOLON:
					view.markSelectedElements("IStarSequentialControlLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_P:
					view.markSelectedElements("IStarParallelControlLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_O:
					view.markSelectedElements("IStarOptionalFeatureLabel");
                 	repaint();
                 	break;
				case KeyEvent.VK_A:
					view.markSelectedElements("IStarAlternativeFeatureLabel");
                 	repaint();
                 	break;                 	
				case KeyEvent.VK_H:
					view.highlightSelectedElements();
                 	repaint();
                 	break;
				case KeyEvent.VK_S:
					view.selectHighlightElements();
                 	repaint();
                 	break;
				case KeyEvent.VK_C:
					view.clearSelectedElements();
                 	repaint();
                 	break;
				case KeyEvent.VK_R:
					view.incPriorityElements();
                 	repaint();
                 	break;
				case KeyEvent.VK_Q:
					view.decPriorityElements();
                 	repaint();
				case KeyEvent.VK_T: // top
					view.selectTopElements();
                 	repaint();
                 	break;
				case KeyEvent.VK_B: // bottom
					view.selectBottomElements();
                 	repaint();
                 	break;
				case KeyEvent.VK_PAGE_DOWN:
					view.getDisplayBounds().y += sbv.getBlockIncrement();
                 	adjustScrollBar();
                 	break;
				case KeyEvent.VK_PAGE_UP: 
					view.getDisplayBounds().y -= sbv.getBlockIncrement();
                 	adjustScrollBar();
                 	break;
				case KeyEvent.VK_DOWN:
					view.getDisplayBounds().y += 5;
                 	adjustScrollBar();
                 	break;
				case KeyEvent.VK_UP: 
					view.getDisplayBounds().y -= 5;
                 	adjustScrollBar();
                 	break;
				case KeyEvent.VK_RIGHT:
					view.getDisplayBounds().x += sbv.getBlockIncrement();
                 	adjustScrollBar();
                 	break;
				case KeyEvent.VK_LEFT: 
					view.getDisplayBounds().x -= sbv.getBlockIncrement();
                 	adjustScrollBar();
                 	break;
				case KeyEvent.VK_SLASH:
					view.findObject();
                 	break;
//				case KeyEvent.VK_PLUS:
//					zoomin();
//                 	break;
				case KeyEvent.VK_MINUS:
					zoomout();
                 	break;
			}
			switch (e.getKeyChar()) {
			case '+':
				zoomin();
				break;
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
		public void mousePressed(MouseEvent me) {
			//D.o("mousepressed");
			requestFocus();
			Point p = view.toView(me.getPoint());
			setClickedP(p);
			initialmode = getMode();
			if (initialmode == GET_PARAMETER) {
				
				getParameterCollector().processMousePressed(me);
			} else if (initialmode == NORMAL_MODE) {
				// on a left mouse down, try to select stuff.
				if ((me.getModifiers() & InputEvent.BUTTON3_MASK) == 0) {
					if ((me.getModifiers() & InputEvent.CTRL_MASK) == 0) {
						select(p);
					}
				}
			} else if (initialmode == TWOD_SCROLLING) {
				;
			}
		}
		/** we repaint the.. */
		public void mouseReleased(MouseEvent me) {
		    dragging = false;
			// Sneaky optimization stuff.
			if (wasdragging) {
				wasdragging = false;
				antialias = true;
				repaint();
			}
			// If we were doing the selection box thing, and the user let go,
			// we should finish up the selection box.
			if (selectionbox != null) {
				Point p = view.toView(me.getPoint());
				selectionbox.finish(p);
			}
			if (getMode() == TWOD_SCROLLING) {
//				gframe.gvc.endTwoDScrolling();
			}
		}
		/** Processes mouseClicked event.
		 *  @param me	the mouse event to be processed
		 *  I should throw actions!!
		 */
		public void mouseClicked(MouseEvent me) {
			if (initialmode == GET_PARAMETER) {
				// Ignore this event.
			} else if (initialmode == NORMAL_MODE) {
				requestFocus();
				//D.o("mouseclicked: " + me.getClickCount());
				Point p = view.toView(me.getPoint());
				setClickedP(p);
				if ((me.getModifiers() & InputEvent.BUTTON3_MASK) == 0) {
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
						if ((me.getModifiers() & InputEvent.CTRL_MASK) != 0) {
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
			} else if (initialmode == TWOD_SCROLLING) {
				gframe.gvc.endTwoDScrolling();
			}
		}
	}
	/** The mouse motion listener for <code> GraphicViewCanvas </code>. */
	private class GVCMouseMotionAdapter extends MouseMotionAdapter {
		Point selection_box_corner;
		int flag = 0;
		/** Processes mouseDragged event.
		 *
		 *  @param me	the mouse event to be processed
		 */
		public void mouseDragged(MouseEvent me) {
			if (getMode() == GET_PARAMETER) {
				// Ignore drags
			} else if (getMode() == TWOD_SCROLLING) {
				if ((me.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
					Point p = view.toView(me.getPoint());
					makeScrolling(p.x - getClickedP().x, p.y - getClickedP().y);
					wasdragging = true;
				}
			} else if ((me.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
				Point p = view.toView(me.getPoint());
				Rectangle sbox_old_bounds = null;
				// Mouse drags are used for two things, moving selected
				// objects, or drawing a selection box.
				if (wasdragging && selectionbox == null) {
					view.moveElements(
						p.x - getClickedP().x,
						p.y - getClickedP().y);
					view.moveLink(
						p.x - getClickedP().x,
						p.y - getClickedP().y,
						flag);
				} else if (!wasdragging && view.findObject(p) != null) {
					// we're in the middle of a move gesture or we should
					// start one.
					view.moveElements(
						p.x - getClickedP().x,
						p.y - getClickedP().y);
					int flag1 = flag;
					flag = 0;
					view.moveLink(
						p.x - getClickedP().x,
						p.y - getClickedP().y,
						flag);
					flag = flag1;
				} else if (
					!wasdragging && view.findLinkControlPoint1(p) != null) {
					flag = 1;
					view.moveLink(
						p.x - getClickedP().x,
						p.y - getClickedP().y,
						flag);
					flag = 0;
				} else if (
					!wasdragging && view.findLinkControlPoint2(p) != null) {
					flag = 2;
					view.moveLink(
						p.x - getClickedP().x,
						p.y - getClickedP().y,
						flag);
					flag = 0;
				} else {
					if (selectionbox == null && !wasdragging) {
						// We are just starting the box.
						// !wasdragging term is there to make sure we don't
						// take control from a movement gesture.
						selectionbox = new SelectionBox(p);
						sbox_old_bounds = selectionbox.getBounds();
					} else {
						// Update the box.
						sbox_old_bounds = selectionbox.getBounds();
						selectionbox.update(p);
						flag = 0;
					}
				}
				setClickedP(p);
				wasdragging = true;
				Rectangle db = view.getDisplayBounds();
				Rectangle dr = view.getDirtyRect();
				if (selectionbox != null) {
					if (dr != null) {
						dr.add(selectionbox.getBounds());
						dr.add(sbox_old_bounds);
					} else {
						dr = selectionbox.getBounds();
						dr.add(sbox_old_bounds);
						dr.grow(1, 1); // else we miss part of the box
					}
				}
				if (dr != null) {
					antialias = false;
					repaint(dr.x - db.x, dr.y - db.y, dr.width, dr.height);
					view.setViewClean();
				}
				adjustScrollBar();
			}
		}
	}

/**
 * This menu listener repopulates a menu when it is opened.
 */

	private class MenuBarMenuListener implements MenuListener {

		/**
		 * 
		 * @uml.property name="menumethod"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		PluginMethod menumethod;

		public MenuBarMenuListener(PluginMethod menumethod) {
			this.menumethod = menumethod;
			
		//Have a try- Zhifeng Liu
		// You know we cannot use ctrl+C(S) or something like
		//that unless we activate Menubar first.
		
		Iterator plugit = plugins.iterator();
		
		Collection c = new Vector();
		while (plugit.hasNext()) {
			Collection menubarMethods =
				((OMEPlugin) plugit.next()).getMenubarMethods(view);
			
			if (menubarMethods != null) {
			 c.addAll(menubarMethods);
                        } // if
                } //while
                
                Iterator i = c.iterator();
		while (i.hasNext()) {
			        
			        MenuMethod curMenuMethod = (MenuMethod) i.next();
			        // We assume that all methods are menuMethods.	    
				String name = curMenuMethod.getName();
				JMenuPlus menu = new JMenuPlus(name);
				menu.removeAll();
				//D.o("Before populateMenu("+name+")");
				populateMenu(menu, menumethod, null);
				menu.setEnabled(true);
				//D.o("After populateMenu("+name+")");
	       }
	       
			
			
			
			
			
			
		}
		public void menuSelected(MenuEvent e) {
			// Clear the menu
			JMenuPlus menu = (JMenuPlus) e.getSource();
			menu.removeAll();
			// Repopulate the menu
//			D.o("Menu listener will call populateMenu().");
			populateMenu(menu, menumethod, null);
//			D.o("Menu listener called populateMenu().");
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuCanceled(MenuEvent e) {
		}
	}

/**
 * The action listener used for Menu(bar) and Toolbar buttons.
 */

	private class GVCActionAdapter implements ActionListener {

		/**
		 * 
		 * @uml.property name="method"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private PluginMethod method;

		/**
		 * 
		 * @uml.property name="gvc"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private GraphicViewCanvas gvc;

		private Point p = null;
		private AbstractButton togglebutton = null;
		/**  Create a new GVCActionAdapter.
		 *   @param method	The associated method.
		 *   @param p		The Point associated with the firing of this
		 *			action (if any).
		 *   @param gvc		Our canvas
		 */
		GVCActionAdapter(PluginMethod method, Point p, GraphicViewCanvas gvc) {
			this.gvc = gvc;
			this.method = method;
			this.p = p;
		}
		/**  Create a new GVCACtionAdapter.
		 *   @param method	The associated method.
		 *   @param gvc		Our canvas
		 */
		GVCActionAdapter(PluginMethod method, GraphicViewCanvas gvc) {
			this.gvc = gvc;
			this.method = method;
		}
		/**  Create a new GVCACtionAdapter.
		 *   @param method	    The associated method.
		 *   @param togglebutton    The button to untoggle when done.
		 *   @param gvc		    Our canvas
		 */
		GVCActionAdapter(
			PluginMethod method,
			AbstractButton togglebutton,
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
				gvc.getParameterCollector().startCollecting(
					method,
					c,
					togglebutton);
			}
		}
	}

/**
 * The component listener for the <code> GraphicViewCanvas </code>.
 */

	private class GVCComponentAdapter extends ComponentAdapter {

		/** Processes the resized event.
		 *
		 *  @param e	the component event to be processed
		 */
		public void componentResized(ComponentEvent e) {
			view.getDisplayBounds().width = getSize().width;
			view.getDisplayBounds().height = getSize().height;
			// Adjusts the value in GraphicView.
			view.getDisplayBounds().x =
				Math.max(
					view.getViewBounds().x,
					Math.min(
						view.getViewBounds().width
							- view.getDisplayBounds().width
							+ view.getViewBounds().x,
						view.getDisplayBounds().x));
			view.getDisplayBounds().y =
				Math.max(
					view.getViewBounds().y,
					Math.min(
						view.getViewBounds().height
							- view.getDisplayBounds().height
							+ view.getViewBounds().y,
						view.getDisplayBounds().y));
			adjustScrollBar();
			// The lists of visible elements and links are changed.
			view.refreshVisibleLists();
			super.componentResized(e);
		}
	}
	/** The key listener for the rename box. so's we can close when someone
	 * hits enter. */
	class RenameEdit extends AbstractUndoableEdit {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String className;
		String _hidden;

		public String getPresentationName() {
			return "Rename the graphical element";
		}

		public RenameEdit(String h) {
			super();
			className = "Renaming";			
			this._hidden = h;
		}

		public RenameEdit(ObjectInputStream in) {
			super();
			className = "Renaming";
			try {
				readObject(in);
			} catch (Exception exp) {
				exp.printStackTrace();
			}
		}

		public void undo() throws CannotUndoException {
			super.undo();
			try {
				synchronized (GraphicViewCanvas.this) {
					String th = getName();
					setName(_hidden);
					_hidden = th;
				}
			} catch (Exception bl) {
				throw new CannotUndoException();
			}
		} // undo

		public void redo() throws CannotRedoException {
			super.redo();
			try {
				synchronized (GraphicViewCanvas.this) {
					String th = getName();
					setName(_hidden);
					_hidden = th;
				}
			} catch (Exception bl) {
				throw new CannotRedoException();
			}
		} // redo
		/**
		 * writeObject
		 */
		protected void writeObject(java.io.ObjectOutputStream out)
				throws IOException {
			super.writeObject(out);
			out.writeObject(_hidden);
		} // writeObject

		/**
		 * readObject
		 */
		public void readObject(java.io.ObjectInputStream in) throws IOException,
				ClassNotFoundException {
			try {
				_hidden = (String) in.readObject();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

private class RenameBoxKeyAdapter extends KeyAdapter {

		private GraphicViewObject gve;
		private GraphicViewCanvas gvc;
		private JTextArea tf;

		/** Creates a new RenameBoxKeyAdapter.
		     *  @param gve	The GraphicViewElement being resized.
		     *  @param tf 	The textfield in the Resize box.
		     *  @param gvc 	The GraphicViewCanvas to paint on.
		     */
		public RenameBoxKeyAdapter(
			GraphicViewObject gve,
			JTextArea tf,
			GraphicViewCanvas gvc) {
			super();
			this.gvc = gvc;
			this.gve = gve;
			this.tf = tf;
		}
		/** Processes keyPressed event.
		 *
		 *  @param e	the keyboard event to be processed
		 */
		public void keyPressed(KeyEvent e) {
			char c = e.getKeyChar();
			// if (c == KeyEvent.VK_ENTER) {
			if (c == KeyEvent.VK_ESCAPE) {
				if (boxclosed == false) {
					undo.addEdit(new RenameEdit(gve.getName()));
					gve.setName(tf.getText());
					boxclosed = true;
					gvc.requestFocus();
					closeBox(tf);
				}
			}
		}
	}

/**
 * RenameBox Focus Adapter. So's we can close when our rename box loses
 * focus.
 */

	private class RenameBoxFocusAdapter extends FocusAdapter {

		private GraphicViewObject gvo;
		private GraphicViewCanvas gvc;
		private JTextArea tf;

		/** Create a new RenameBoxFocusAdapter.
		 *  @param gve	The GraphicViewElement being resized.
		 *  @param tf 	The textfield in the Resize box.
		 *  @param gvc 	The GraphicViewCanvas to paint on.
		 */
		public RenameBoxFocusAdapter(
			GraphicViewObject gvo,
			JTextArea tf,
			GraphicViewCanvas gvc) {
			super();
			this.gvo = gvo;
			this.tf = tf;
			this.gvc = gvc;
			D.o("Created RenameBoxFocusAdapter");
		}
		/** Process the focusLost event.
		 *  @param e	The focus event we are processing.
		 */
		public void focusLost(FocusEvent e) {
			/* we want to die when we lose *internal* focus, but not when the
			
			 * app loses focus. */
			if ((e.getID() == FocusEvent.FOCUS_LOST) && !e.isTemporary()) {
				if (boxclosed == false) {
					gvo.setName(tf.getText());
					boxclosed = true;
					gvc.requestFocus();
					closeBox(tf);
				}
			}
		}
	}
	private class SearchBoxKeyAdapter extends KeyAdapter {
		private JTextArea tf;
		private GraphicViewCanvas gvc;
		public Dimension center = null;
		/** Creates a new RenameBoxKeyAdapter.
		     *  @param gve	The GraphicViewElement being resized.
		     *  @param tf 	The textfield in the Resize box.
		     *  @param gvc 	The GraphicViewCanvas to paint on.
		     */
		public SearchBoxKeyAdapter(
			JTextArea tf,
			GraphicViewCanvas gvc) {
			super();
			this.gvc = gvc;
			this.tf = tf;
		}
		/** Processes keyPressed event.
		 *
		 *  @param e	the keyboard event to be processed
		 */
		public void keyPressed(KeyEvent e) {
			char c = e.getKeyChar();
			if (c == KeyEvent.VK_ENTER) {
				if (boxclosed == false) {
					Dimension p = gvc.view.match(tf.getText());
					if (p!=null) {
						view.getDisplayBounds().x = p.width - view.getDisplayBounds().width/2;
						view.getDisplayBounds().y = p.height - view.getDisplayBounds().height/2;
	                 	adjustScrollBar();
					}
					boxclosed = true;
					gvc.requestFocus();
					closeBox(tf);
				}
			}
		}
	}

/**
 * RenameBox Focus Adapter. So's we can close when our rename box loses
 * focus.
 */

	private class SearchBoxFocusAdapter extends FocusAdapter {
		private JTextArea tf;
		private GraphicViewCanvas gvc;
		/** Create a new RenameBoxFocusAdapter.
		 *  @param gve	The GraphicViewElement being resized.
		 *  @param tf 	The textfield in the Resize box.
		 *  @param gvc 	The GraphicViewCanvas to paint on.
		 */
		public SearchBoxFocusAdapter(
			JTextArea tf,
			GraphicViewCanvas gvc) {
			super();
			this.gvc = gvc;
			this.tf = tf;
		}
		/** Process the focusLost event.
		 *  @param e	The focus event we are processing.
		 */
		public void focusLost(FocusEvent e) {
			if ((e.getID() == FocusEvent.FOCUS_LOST) && !e.isTemporary()) {
				if (boxclosed == false) {
					boxclosed = true;
					gvc.requestFocus();
					closeBox(tf);
				}
			}
		}
	}

	
/**
 * So's we can catch the Enter to close.
 */

	private class ResizeBoxKeyAdapter extends KeyAdapter {

		/**
		 * 
		 * @uml.property name="gve"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private GraphicViewObject gve;

		private JTextField tf;

		/**
		 * 
		 * @uml.property name="gvc"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private GraphicViewCanvas gvc;

		/** Creates a new ResizeBoxKeyAdapter
		 *  @param gve	The GraphicViewElement being resized.
		 *  @param tf 	The textfield in the Resize box.
		 *  @param gvc 	The GraphicViewCanvas to paint on.
		 */
		public ResizeBoxKeyAdapter(
			GraphicViewObject gve,
			JTextField tf,
			GraphicViewCanvas gvc) {
			super();
			this.gve = gve;
			this.tf = tf;
			this.gvc = gvc;
			D.o("Resize box key adapter created.");
		}
		/** Handle a key pressed event.
		 * 
		 *  @param e	the key-pressed event to be handled
		 */
		public void keyPressed(KeyEvent e) {
			char c = e.getKeyChar();
			if (c == KeyEvent.VK_ENTER) {
				try {
					if (boxclosed == false) {
						Double d = new Double(tf.getText());
						gve.setScale(d.doubleValue());
						boxclosed = true;
						gvc.remove(tf);
					}
				} catch (NumberFormatException nfe) {
					//beep!
					tf.setText("" + gve.getScale());
					tf.selectAll();
				} finally {
					gvc.repaint();
				}
			}
			D.o("voodoo");
		}
	}

/**
 * So we can close when we lose focus.
 */

	private class ResizeBoxFocusAdapter extends FocusAdapter {

		/**
		 * 
		 * @uml.property name="gve"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private GraphicViewObject gve;

		private JTextField tf;

		/**
		 * 
		 * @uml.property name="gvc"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private GraphicViewCanvas gvc;

		/** Creates a new ResizeBoxFocusAdapter.
		 *  @param gve	The GraphicViewElement being resized.
		 *  @param tf 	The textfield in the Resize box.
		 *  @param gvc 	The GraphicViewCanvas to paint on.
		 */
		public ResizeBoxFocusAdapter(
			GraphicViewObject gve,
			JTextField tf,
			GraphicViewCanvas gvc) {
			super();
			this.gve = gve;
			this.tf = tf;
			this.gvc = gvc;
			D.o("Created ResizeBoxFocusAdapter");
		}
		public void focusLost(FocusEvent e) {
			/* we want to die when we lose *internal* focus, but not when the
			
			 * app loses focus. */
			if ((e.getID() == FocusEvent.FOCUS_LOST) && !e.isTemporary()) {
				try {
					if (boxclosed == false) {
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
	/** The "selection box" is the rectangle a user can create by dragging the
	 *  mouse.  When the user releases the mouse button, all objects within
	 *  the rectangle will be selected.
	 *
	 *  The mouse motion adapter for GVC does the I/O work, and just tells the
	 *  selection box what to do.
	 */
	private class SelectionBox {
		private Point start_corner; // Where we started
		private Point active_corner; // Other corner (location of mouse 
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
			selectionbox = null; // Destroy the reference to the box.
			this.active_corner = active_corner;
			Iterator i = view.findObjects(getBounds()).iterator();
			while (i.hasNext()) {
				GraphicViewObject gvo = (GraphicViewObject) i.next();
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
	/**
	 * Use a file open dialog to get a filename
	 * @author Yijun Yu
	 * @return
	 */
	String cd = null;
	public static String get_user_dir(String filename) {
		String cd;
		try {			
			cd = new File(filename).getParentFile().getAbsolutePath();
			System.setProperty("user.dir", cd);
		} catch (Exception e) { 
			cd = System.getProperty("user.dir");			
		}
		return cd;
	}	
	public File getSaveFileAndDirectory(String ext) {
		File sFile;
		cd = get_user_dir(getSavePathname());
		JFileChooser fc = new JFileChooser(new File("*.tel"));
		fc.setCurrentDirectory(new File(cd));		
		// find file extension to use
		String extensions[] = ext.split(";");
		for (int i=extensions.length-1; i>=0; i--) {
			String extension = extensions[i];
			fc.addChoosableFileFilter(new MyFileFilter(extension, i==0));
		}
		// the only difference from getOpenFileAndDirectory
		fc.showSaveDialog(gframe.getParent()); 
		sFile = fc.getSelectedFile();
		if (sFile!=null) {
			boolean e = true;
			for (int i=0; i<extensions.length; i++) {
				if (sFile.getName().endsWith("." + extensions[i])) {
					e = false;
					break;
				}
			}
			if (extensions.length > 0)
				ext = extensions[0];
			if (e && extensions.length > 0)
				sFile = new File(sFile.getAbsolutePath() + "." + ((MyFileFilter)fc.getFileFilter()).extension);
			if (sFile!=null) {
				setTitle(sFile.getName());
				if (sFile.getParent()!=null) {
					cd = sFile.getParent();
				}
			}
		}
		return sFile;
	}
	/**
	 * @return Returns the gframe.
	 */
	public GraphicViewFrame getFrame() {
		return gframe;
	}
	/**
	 * @param gframe The gframe to set.
	 */
	public void setFrame(GraphicViewFrame gframe) {
		this.gframe = gframe;
	}
	public void updateToolbar(View view) {
		Iterator plugit = plugins.iterator();
		Collection c = new Vector();
		while (plugit.hasNext()) {
			OMEPlugin p = (OMEPlugin) plugit.next();
			p.setView(view);
			Collection methods =
				p.getToolbarMethods(view);
			if (methods != null) {
				c.addAll(methods);
			}
		}
		Iterator i = c.iterator();
		while (i.hasNext()) {
			//We're going to add a new toolbar...
			PluginMethod barmethod = (PluginMethod) i.next();
			Iterator ii;
			if (barmethod.getSubmenu() != null) {
				ii = barmethod.getSubmenu().iterator();
			} else {
				// The method wasn't wrapped in a menu, just create a
				// singleton bar.
				ii = Collections.singleton(barmethod).iterator();
			}
			while (ii.hasNext()) {
				PluginMethod method = (PluginMethod) ii.next();
				if (method instanceof AbstractPluginMethod) {
					AbstractPluginMethod m = (AbstractPluginMethod) method;
					m.setView(view);
				}
			}
		}
	}
	/**
	 * to print the component
	 * @see http://java.sun.com/docs/books/tutorial/2d/printing/component.html
	 */
	public int print(Graphics g, PageFormat f, int pi) throws PrinterException {
	    if (pi >= 1) {
	        return Printable.NO_SUCH_PAGE;
	    }		
	    draw((Graphics2D) g);
	    return Printable.PAGE_EXISTS;	    
	}
	public void export2pdf(File f) {
        // character to byte encoding
		export2svg(new File("t.svg"));
		Transcoder t = new PDFTranscoder();
		InputStream in;
		try {
			in = new FileInputStream("t.svg");
			TranscoderInput input = new TranscoderInput(in);
			OutputStream ostream = new FileOutputStream(f);
			TranscoderOutput output = new TranscoderOutput(ostream);
			t.transcode(input, output);
	        ostream.flush();
	        ostream.close();				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TranscoderException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void openSearchBox() {
		int sizex = 300;
		int sizey = 40;
		JTextArea rb = new JTextArea(sizex, sizey);
		rb.setBackground(Color.yellow);
		add(rb);
		rb.setBounds(1, this.getBounds().height - sizey, sizex, sizey);
		boxclosed = false;
		rb.addKeyListener(new SearchBoxKeyAdapter(rb, this));
		rb.addFocusListener(new SearchBoxFocusAdapter(rb, this));
		rb.setText("<type the search text here>");
		rb.selectAll();
		rb.repaint();
		rb.requestFocus();
	}
}

