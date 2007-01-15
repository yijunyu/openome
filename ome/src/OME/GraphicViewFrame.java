package OME;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;


// revise this comment.
/** The frame window for graph view.
 *  It creates the frame, with menubar, toolbar and scrolling panel. However,
 *  it doesn't populate the menubar and toolbar, nor does it processing their
 *  events. Those two components are eventually passed to GraphicViewCanvas,
 *  and dealt with there.
 *
 *  @author Ying Shi
 *
 *  @see ScrollingPanel
 *  @see OME
 */
class GraphicViewFrame extends JFrame {
 
// single view:
    protected ScrollingPanel scrollpanel;

    
//    JDesktopPane mainpanel = new JDesktopPane();
//    JPanel mainpanel1 = new JPanel();
    protected JMenuBar menuBar;
    protected JPanel toolbarpanel;
    protected Collection toolbars;
    protected GraphicViewCanvas gvc;
//    JInternalFrame [] upperpanel= new JInternalFrame[10];
//    JSplitPane splitPane, splitPane1;
//    int index = 0;
    GraphicViewStatusBar statusBar;
    // This stores the absolute path of the model opened up in this Frame.
    protected String path;
    //This stores the absolute path of the .png files.
    protected String exportpath;
//    private Collection plugins;
 
    
//    private JSplitPane splitPane;
    
    /** The status bar that sits at the bottom of the GraphicViewFrame.
     */
    protected class GraphicViewStatusBar extends JPanel {
	
	JLabel label;
	
	/** Constructor */
	public GraphicViewStatusBar() {
	    super();
	    this.setLayout(new BorderLayout());
	    label = new JLabel(" ");	//blank space to keep size constant
	    add(label, BorderLayout.WEST);
	    setBorder(BorderFactory.createLoweredBevelBorder());
	}

	/** Sets status bar message */
	public void setMessage (String s) {
	    if (s == null) {
		label.setText(" ");
	    }
	    else {
	    label.setText(s);
	    }
	}

	/** Clears status bar message */
	public void clearMessage () {
	    // Use a space, otherwise the status bar will shrink.
	    label.setText(" ");
	}

    }
    

    public GraphicViewFrame() {
	super();
    }


    /** Constructs the frame window.
     *
     *  @param gv    in the case of opening an existing graph view, gv would be
     *		   graph view object; in the case of creating a blank graph
     *		   view, gv would be null.
     *  @param size  the size of gv. If gv is null, size should be 0.
     *  @param ome   the main window object.
     */

//    GraphicViewFrame(int size, ViewManager gvm, OME ome, String path) {
    GraphicViewFrame(int size, GraphicView gv, OME ome, String title) {
	super();
	
	D.o("Creating GraphicViewFrame");

	try {
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) { D.o(e); }

	
	this.path = title;
	this.exportpath = "C:/ome3/program/";

/*	Multiple view------------
	setTitle(path);
	
	setContentPane(mainpanel);
	
	menuBar = createMenuBar();
	setJMenuBar(menuBar);
	
	mainpanel.setLayout(new BorderLayout());
	mainpanel.putClientProperty("JDesktopPane.dragMode", "outline");

	// Set up the place for toolbars to go.
	
	toolbarpanel = new JPanel();
	toolbars = new Vector();
	toolbarpanel.setLayout(new BoxLayout(toolbarpanel,BoxLayout.Y_AXIS));
	mainpanel.add(toolbarpanel, BorderLayout.NORTH);

	// Create status bar.
	statusBar = new GraphicViewStatusBar();
	mainpanel.add(statusBar,BorderLayout.SOUTH);
	pack();

	Dimension d = getToolkit().getScreenSize();
	setSize(600,600);
	Rectangle b = getBounds();
	mainpanel.setLocation((d.width - b.width)/2, (d.height - b.height)/2);
	
	Color c = new Color(255);
	Color bg = new Color(c.getBlue());
	mainpanel.setBackground(bg);

//	D.o("The 0 view is to be created.");
	createNewGraphicViewFrame(gvm, ome, 0);
	Iterator i=gvm.getViews();
	int id = 0;
	i.next();
	while (i.hasNext()){
	    id++;
	    i.next();
	    D.o("The " + id + " view is to be created.");
	    createNewGraphicViewFrame(gvm, ome, id);
	    D.o("Created" + id);
	}
	
	plugins = gvm.getViewByIndex(0).getModel().getPlugins();
	
--------end of multiple view*/
    
    /*--------single view ------*/
	setTitle(title);

	JPanel mainpanel = new JPanel();

	menuBar = createMenuBar();
	mainpanel.setLayout(new BorderLayout());
	mainpanel.add(menuBar,BorderLayout.NORTH);
	JPanel upperpanel = new JPanel();
	upperpanel.setLayout(new BorderLayout());
	
	    // Set up the place for toolbars to go.
	toolbarpanel = new JPanel();
	toolbars = new Vector();
	toolbarpanel.setLayout(new BoxLayout(toolbarpanel,BoxLayout.Y_AXIS));
	upperpanel.add(toolbarpanel, BorderLayout.NORTH);
			
	
	gvc = new GraphicViewCanvas(menuBar, gv, ome, this);
    	scrollpanel = new ScrollingPanel(gv, this, gvc);
	scrollpanel.setAlignmentX(LEFT_ALIGNMENT);
	
	upperpanel.add(scrollpanel, BorderLayout.CENTER);
	mainpanel.add(upperpanel, BorderLayout.CENTER);
	
	// Create status bar.
	statusBar = new GraphicViewStatusBar();
	mainpanel.add(statusBar,BorderLayout.SOUTH);
	setContentPane(mainpanel);

	pack();
	//setSize(size,size);
	setSize(600,600);
	Dimension d = getToolkit().getScreenSize();
	Rectangle b = getBounds();
	setLocation((d.width - b.width)/2, (d.height - b.height)/2);
      
     /* -end of Single View--------*/
	
	addComponentListener(new GVFComponentAdapter());

	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

	setToolbar();
	
	setVisible(true);
	D.o("CreatedGraphicViewFrame");
	
    }
    
    /** Returns the absolute path of the model opened up in the frame. */
    public String getModelPath() {
	D.o("path is "+path);
	return path;
    }
    
    public String getExportPath() {
	D.o("path is "+path);
	return exportpath;
    }

    /** Set the path of the model opened up in the frame. Linda*/
    public void setModelPath(String newpath) {
        path = newpath;
    }

    public void setExportPath(String newpath){
	exportpath = newpath;
    }

    /** Creates a menu bar.
     *
     *  @return	the newly created menu bar.
     */
    protected JMenuBar createMenuBar() {
	JMenuBar menuBar = new JMenuBar();
	return menuBar;
    }
    
    /** Returns the status bar */
    public GraphicViewStatusBar getStatusBar() {
	return statusBar;
    }

    /** Adds the given toolbar to the toolbar panel */
    public void addToolBar(JToolBar tb) {
	D.o("Request to add toolbar");
	toolbars.add(tb);
	setToolbar();
    }

    /** Updates the toolbar area. */
    public void setToolbar() {
	JPanel newtbpanel = new JPanel();
	newtbpanel.setLayout(new BoxLayout(newtbpanel,BoxLayout.Y_AXIS));
	newtbpanel.setAlignmentX(LEFT_ALIGNMENT);
	Iterator i = getToolbarLayout();
	while (i.hasNext()) {
//	    D.o("Adding toolbar row");
	    JPanel jp = (JPanel)i.next();
	    jp.setLayout(new BoxLayout(jp,BoxLayout.X_AXIS));
	    jp.setAlignmentX(LEFT_ALIGNMENT);
	    jp.setMaximumSize(jp.getPreferredSize());
	    newtbpanel.add(jp);
	}
	toolbarpanel.removeAll();
	toolbarpanel.add(newtbpanel);

	setVisible(true);
    }

    /** Lays out the toolbars.  Returns an Iterator of panels suitable to be
     *  rows of the toolbar panel. */
    public Iterator getToolbarLayout() {
//	D.o("Getting toolbar layout");
	Iterator i = toolbars.iterator();
	int maxwidth = getWidth()-0;	// minus for our border (this is bad)
//	D.o("Maxwidth for toolbar: "+maxwidth);
	Vector v = new Vector();
	JPanel jp = new JPanel(); 
	int currwidth = 0;

	// Start off with the first bar on the first panel.
	if (i.hasNext()) {
	    JToolBar jtb = (JToolBar)i.next();
	    jp.add(jtb);
	    currwidth = currwidth + jtb.getBounds().width;
	}
	
	// Add toolbars to panel if they are short enough, otherwise start a
	// new one.
	while (i.hasNext()) {
//	    D.o("currwidth "+ currwidth);
	    JToolBar jtb = (JToolBar)i.next();
	    jtb.setAlignmentX(LEFT_ALIGNMENT);
	    int width = jtb.getPreferredSize().width + jtb.getInsets().left +
		    jtb.getInsets().right;
//	    D.o("width of next bar: "+width);
	    if (width + currwidth > maxwidth) {
		v.add(jp);
		jp = new JPanel();
		currwidth = 0;
	    }
	    jp.add(jtb);
	    currwidth += width;
	}
	v.add(jp);
	// This can be optimized if we can add null to v.
	// We should add a seperator too.
	return v.iterator();
    }

    /** Sets up the window listener for this frame, attaching the given method
     *  (to be used to save the model before closing the window). */
    protected void setWindowListener(PluginMethod m) {
	GVFWindowListener wl = new GVFWindowListener(m);
	addWindowListener(wl);
    }
	
        /** Sets up the window listener for this frame, attaching the given method
     *  (to be used to save the model before closing the window). */
/*    protected void setInternalFrameAdapter(PluginMethod m) {
	GVFInternalFrameAdapter cl = new GVFInternalFrameAdapter(m);
	try{ 
	    ((JInternalFrame)upperpanel[index]).addInternalFrameListener(cl);
	} catch (Exception e) {
	    D.o(e);
	}
    }
*/
    
    /** Closes the current frame */
    public void closeFrame (PluginMethod method) {

	// Check if changes have been made

	// If changes have been made...
	    
	// Prompt User
	Object options[] = {
	    "Yes",
	    "No",
	    "Cancel"
	};
	int option = JOptionPane.showOptionDialog(this,
		//(Frame)e.getSource(), 
		"Do you want to save before exiting?",
		"Close View",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, options,
		options[1]);

		    
	// Setting to the default option to options[1] doesn't work.
	// Rather frustrating...
    	
	switch (option) {
	    case JOptionPane.YES_OPTION: 
	    {
		//gvc.save();
		D.o("method name is " + method);
		method.invoke();
		
		// Close the GVF (and free the resources), if the save was
		// successful.
		    D.o("Disposing GVF");
		    dispose();
					    
	    } break;
	    case JOptionPane.NO_OPTION:
	    {
		// Close the GVF (and free the resources).
		D.o("Disposing GVF");
		dispose();
		//show();
	    } break;
	    case JOptionPane.CANCEL_OPTION:
	    {
		// we don't dispose, so the window remains alive and well.
	    }						
	}
    }
    
/*    public void closeInternalFrame (PluginMethod method) {

	// Check if changes have been made

	// If changes have been made...
	    
	// Prompt User
	Object options[] = {
	    "Yes",
	    "No",
	    "Cancel"
	};
	int option = JOptionPane.showOptionDialog(this,
		//(Frame)e.getSource(), 
		"Do you want to save before exiting?",
		"Close View",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, options,
		options[1]);
	// Setting to the default option to options[1] doesn't work.
	// Rather frustrating...
    
	switch (option) {
	    case JOptionPane.YES_OPTION: 
	    {
		//gvc.save();
		D.o("method name is " + method);
		method.invoke();
		
		// Close the GVF (and free the resources), if the save was
		// successful.
		//    D.o("Disposing GVF");
		//    dispose();
					    
	    } break;
	    case JOptionPane.NO_OPTION:
	    {
		// Close the GVF (and free the resources).
		D.o("Disposing GVF");
		//dispose();
		//show();
	    } break;
	    case JOptionPane.CANCEL_OPTION:
	    {
		// we don't dispose, so the window remains alive and well.
	    }						
	}
    }
*/
/*    public void createNewViewFrame(ViewManager vm, OME ome, int viewtype, int viewID){

	switch  (viewtype) {
	    case 0:
	    {
		try {
		    createNewGraphicViewFrame(vm, ome, viewID);
		} catch (Exception e) {
		    D.o(e);
		}
	    } break;
	    case 1:
	    {
		
	    } break;
	    case 2:
	    {
		
	    } 
		
	}
    }
  
    private void createNewGraphicViewFrame(ViewManager gvm, OME ome,int viewID) {
	
	GraphicView gv = (GraphicView)gvm.getViewByIndex(viewID);
	int is = gvm.getExistingViewtype();
	int i=is-is/10;
	gvc = new GraphicViewCanvas(menuBar, gv, ome, this, is-is/10);
	
	ScrollingPanel scrollpanel;
    	scrollpanel = new ScrollingPanel(gv, this, gvc);
	scrollpanel.setAlignmentX(LEFT_ALIGNMENT);

	upperpanel[viewID] = new JInternalFrame("Graphic View" + viewID,
							true,
							true,
							true,
							true);

	
	upperpanel[viewID].setSize(400,400);
	upperpanel[viewID].setLocation(40*(viewID+1), 40*(viewID+1));
	upperpanel[viewID].getContentPane().setLayout(new BorderLayout());
	upperpanel[viewID].getContentPane().add(scrollpanel, BorderLayout.CENTER);
	mainpanel.add(upperpanel[viewID]);
//	gvc.setBackground(Color.white);
	upperpanel[viewID].setVisible(true);
	upperpanel[viewID].moveToFront();
        try {
            upperpanel[viewID].setSelected(true);
        } catch (Exception e) {
	    D.o(e);
	}
	index = viewID;
	gvc.hookupSaveMethod();
	upperpanel[viewID].setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//	upperpanel.pack(); // pack() will unable the setSize() method.
//	upperpanel.show();
    }
  */
      
    /** The windows event listener for <code> GraphicViewFrame </code>. */
    protected class GVFWindowListener extends WindowAdapter {

	private PluginMethod method;
	
	// Check if changes have been made to the view (model?), and
	// prompt the user to save.  Then close the window.

	/** Creates a Window Listener for GVF.  Hooks up the given PluginMethod
	 *  to be optionally invoked upon window closing.  I can't imagine
	 *  this being anything other than the save method. */
	public GVFWindowListener(PluginMethod method) {
	    this.method = method;
	}
	
      /** Process the window-closing event (Most of this is yet to be implemented).
       *
       *  @param e	the window event
       */
	public void windowClosing(WindowEvent e) { 
	    D.o("Catching windowClosing event.");
	    closeFrame(method);
	}
    }

    /** The component listener ensures that the toolbars are reset when the
     *  window is resized. */
    protected class GVFComponentAdapter extends ComponentAdapter {
	
	// Check if changes have been made to the view (model?), and
	// prompt the user to save.  Then close the window.

	public void componentResized(ComponentEvent e) {
	    setToolbar();
	}
    }

 /*   private class GVFInternalFrameAdapter extends InternalFrameAdapter {

	private PluginMethod method;

*/	/** Creates an Internal Frame Listener for GVF.  
	 *  Hooks up the given PluginMethod
	 *  to be optionally invoked upon window closing.  I can't imagine
	 *  this being anything other than the save method. */
/*	public GVFInternalFrameAdapter(PluginMethod method) {
	    this.method = method;
	}
	
	public void internalFrameClosing(InternalFrameEvent e) { 
	    D.o("Catching internalframe Closing event.");
	    closeInternalFrame(method);
	}
    }
*/
}
