package edu.toronto.cs.ome.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;

import edu.toronto.cs.ome.controller.PluginMethod;
import edu.toronto.cs.util.D;
// revise this comment.

/**
 * The frame window for graph view. It creates the frame, with menubar, toolbar
 * and scrolling panel. However, it doesn't populate the menubar and toolbar,
 * nor does it processing their events. Those two components are eventually
 * passed to GraphicViewCanvas, and dealt with there.
 * 
 * @author Ying Shi
 * 
 * @see ScrollingPanel
 * @see OME
 */

public class GraphicViewFrame extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @uml.property name="scrollpanel"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public ScrollingPanel scrollpanel;

	JMenuBar menuBar;
	public JPanel toolbarpanel;
	public Collection toolbars;

	/**
	 * 
	 * @uml.property name="gvc"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	GraphicViewCanvas gvc;
	public GraphicViewCanvas getCanvas() {
		return gvc;
	}

	/**
	 * 
	 * @uml.property name="statusBar"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	GraphicViewStatusBar statusBar;

	String path;

//	private GraphicView view;
	/**
	 * The status bar that sits at the bottom of the GraphicViewFrame.
	 */
	class GraphicViewStatusBar extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		JLabel label;
		/** Constructor */
		public GraphicViewStatusBar() {
			super();
			this.setLayout(new BorderLayout());
			label = new JLabel(" "); //blank space to keep size constant
			add(label, BorderLayout.WEST);
			setBorder(BorderFactory.createLoweredBevelBorder());
		}
		/** Sets status bar message */
		public void setMessage(String s) {
			if (s == null) {
				label.setText(" ");
			} else {
				label.setText(s);
			}
		}
		/** Clears status bar message */
		public void clearMessage() {
			// Use a space, otherwise the status bar will shrink.
			label.setText(" ");
		}
	}
	/**
	 * Constructs the frame window.
	 * 
	 * @param gv
	 *            in the case of opening an existing graph view, gv would be
	 *            graph view object; in the case of creating a blank graph view,
	 *            gv would be null.
	 * @param size
	 *            the size of gv. If gv is null, size should be 0.
	 * @param ome
	 *            the main window object.
	 */
	// GraphicViewFrame(int size, ViewManager gvm, OME ome, String path) {
	public GraphicViewFrame(int size, GraphicView gv, String title) {
		super();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			D.o(e);
		}
		this.path = title;
		setTitle(title);
		JPanel mainpanel = new JPanel();
		menuBar = createMenuBar();
		mainpanel.setLayout(new BorderLayout());
		mainpanel.add(menuBar, BorderLayout.NORTH);
		JPanel upperpanel = new JPanel();
		upperpanel.setLayout(new BorderLayout());
		// Set up the place for toolbars to go.
		toolbarpanel = new JPanel();
		toolbars = new Vector();
		toolbarpanel.setLayout(new BoxLayout(toolbarpanel, BoxLayout.Y_AXIS));
//		toolbarpanel.setLayout(new FlowLayout());
		upperpanel.add(toolbarpanel, BorderLayout.NORTH);
		gvc = new GraphicViewCanvas(menuBar, gv, this);
		gvc.setBounds(0, 0, 1200, 1024);
		scrollpanel = new ScrollingPanel(gv, this, gvc);
		scrollpanel.setAlignmentX(LEFT_ALIGNMENT);
		upperpanel.add(scrollpanel, BorderLayout.CENTER);
		mainpanel.add(upperpanel, BorderLayout.CENTER);
		// Create status bar.
		statusBar = new GraphicViewStatusBar();
		mainpanel.add(statusBar, BorderLayout.SOUTH);
		setContentPane(mainpanel);
		Dimension d = getToolkit().getScreenSize();
		Rectangle b = getBounds();
		setLocation((d.width - b.width) / 2, (d.height - b.height) / 2);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setToolbar();
		setVisible(true);
        gv.setFrame(this);
		pack();
	}
	/** Returns the absolute path of the model opened up in the frame. */
	public String getModelPath() {
		File f = new File(path);
		if (f.exists()) {
			String p;
			try {
				p = f.getAbsoluteFile().getCanonicalPath();
				return p;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "";
	}
	/** Set the path of the model opened up in the frame. Linda */
	public void setModelPath(String newpath) {
		path = newpath;
	}
	/**
	 * Creates a menu bar.
	 * 
	 * @return the newly created menu bar.
	 */
	protected JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		return menuBar;
	}

	/**
	 * Returns the status bar
	 * 
	 * @uml.property name="statusBar"
	 */
	public GraphicViewStatusBar getStatusBar() {
		return statusBar;
	}

	/** Adds the given toolbar to the toolbar panel */
	public void addToolBar(JToolBar tb) {
		toolbars.add(tb);
	}
	/** Updates the toolbar area. */
	public void setToolbar() {
		JPanel newtbpanel = new JPanel();
		newtbpanel.setLayout(new BoxLayout(newtbpanel, BoxLayout.X_AXIS));
		newtbpanel.setAlignmentX(LEFT_ALIGNMENT);
		Iterator i = getToolbarLayout();
		while (i.hasNext()) {
			JPanel jp = (JPanel) i.next();
			jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
			newtbpanel.add(jp);
		}
		toolbarpanel.add(newtbpanel);
	}
	/**
	 * Lays out the toolbars. Returns an Iterator of panels suitable to be rows
	 * of the toolbar panel.
	 */
	public Iterator getToolbarLayout() {
		Iterator i = toolbars.iterator();
		int maxwidth = getWidth() - 0; // minus for our border (this is bad)
		Vector v = new Vector();
		JPanel jp = new JPanel();
		int currwidth = 0;
		// Start off with the first bar on the first panel.
		if (i.hasNext()) {
			JToolBar jtb = (JToolBar) i.next();
			jp.add(jtb);
			currwidth = currwidth + jtb.getBounds().width;
		}
		// Add toolbars to panel if they are short enough, otherwise start a
		// new one.
		while (i.hasNext()) {
			JToolBar jtb = (JToolBar) i.next();
			jtb.setAlignmentX(LEFT_ALIGNMENT);
			int width = jtb.getPreferredSize().width + jtb.getInsets().left
					+ jtb.getInsets().right;
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
	public WindowListener wl = null;
	/**
	 * Sets up the window listener for this frame, attaching the given method
	 * (to be used to save the model before closing the window).
	 */
	protected void setWindowListener(PluginMethod m) {
		wl = (WindowListener) new GVFWindowListener(m);
	}
	/** 
	 * Closes the current frame: Check if changes have been made
		// If changes have been made, 	/Prompt User
	 *
	 */
	public void closeFrame(PluginMethod method, boolean cancellable) {
		if (cancellable) {
			Object options[] = {"Yes", "No", "Cancel"};
			int option = JOptionPane.showOptionDialog(this,
					"Do you want to save before exiting?", "Close View",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, options, options[1]);
			switch (option) {
				case JOptionPane.YES_OPTION :
					method.invoke();
					dispose();
					break;
				case JOptionPane.NO_OPTION :
					dispose();
					break;
				case JOptionPane.CANCEL_OPTION:
					D.o("nothing to do");
					break;
			}
		} else {
			Object options[] = {"Yes", "No"};
			int option = JOptionPane.showOptionDialog(this,
					"Do you want to save before exiting?", "Close View",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, options, options[1]);
			switch (option) {
				case JOptionPane.YES_OPTION :
					method.invoke();
					dispose();
					break;
				case JOptionPane.NO_OPTION :
					dispose();
					break;
			}			
		}
	}

	public JPanel createToolbar() {
		return toolbarpanel;
	}

/**
 * The windows event listener for <code> GraphicViewFrame </code>.
 */

	class GVFWindowListener extends WindowAdapter {

		/**
		 * 
		 * @uml.property name="method"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private PluginMethod method;

		// Check if changes have been made to the view (model?), and
		// prompt the user to save. Then close the window.
		/**
		 * Creates a Window Listener for GVF. Hooks up the given PluginMethod to
		 * be optionally invoked upon window closing. I can't imagine this being
		 * anything other than the save method.
		 */
		public GVFWindowListener(PluginMethod method) {
			this.method = method;
		}
		/**
		 * Process the window-closing event (Most of this is yet to be
		 * implemented).
		 * 
		 * @param e
		 *            the window event
		 */
		public void windowClosing(WindowEvent e) {
			closeFrame(method, false);
		}
	}
	
	public void setMessage (String message ) {
		if (statusBar != null)
			statusBar.setMessage(message);
	}
}