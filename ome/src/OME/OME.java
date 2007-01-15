package OME;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Iterator;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.UIManager;

/** Creates the main window, with the project manager.
 *  @author  Ying Shi
 *  @version Nov 1999
 */

class OME extends JFrame {
    
    static final int DEFAULT_WIDTH = 500;
    static final int DEFAULT_HEIGHT = 250; //cai

    // We should create a globals class.  Eventually we should be reading these
    // sorts of things from a config file.
    static final String projectdir = ".." + File.separator + "projects";
    private ProjectManager pm;
    static StartupWindow Swindow;

    /** Run the program. */
    public static void main(String[] args) {
	try {
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) { 
	    D.o(e); 
	}
	
	Swindow = new StartupWindow();
	
	new OME();
    }
    
    
    /** Constructs a new OME window */
    public OME() {		
	super("Organization Modelling Environment 3.12");
	
	Swindow.ProgressEntry();

	// position and size window:	
	setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);	
	Dimension d = getToolkit().getScreenSize();
	Rectangle b = getBounds();
	setLocation((d.width - b.width)/2, (d.height - b.height)/2);    
	
	Swindow.ProgressEntry();

	Container contentpane = getContentPane();
	contentpane.setLayout(new BorderLayout(0,0));
	
	Swindow.ProgressEntry();

	// create and add the project manager	
	pm = new ProjectManager(this);	
	
	Swindow.ProgressEntry();

	contentpane.add(pm, BorderLayout.CENTER);
	// create and add the menubar
	contentpane.add(createMenuBar(), BorderLayout.NORTH);
	
	Swindow.ProgressEntry();
	
	addWindowListener(new MyWindowAdapter());
	
	Swindow.ProgressEntry();

	setVisible(true);
	
	Swindow.setVisible(false);
    }

          
    /** Creates the menu for the main frame window. */
    protected JMenuBar createMenuBar() {
	
	JMenuBar menubar = new JMenuBar();

	JMenuPlus filemenu = new JMenuPlus("File");
	filemenu.setMnemonic('f');		
	filemenu.add(new ExitAction());		
	menubar.add(filemenu);	
	
	// add the menus from project manager
	Iterator i = pm.getAvailableMenus().iterator();
	while (i.hasNext()) {
	    JMenuPlus menu = (JMenuPlus)i.next();
	    menubar.add(menu);
	}
	
	return menubar;
    }

    
    /** The action to exit the program. */
    class ExitAction extends AbstractAction {
	
	public ExitAction() {
	    super("Exit");
	}    
	
	public void actionPerformed (ActionEvent event) {
  	    System.exit(0);
	}
    }    
 
    
    /** The windows event adapter for this frame window. */
    class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent e) { System.exit(0);}
    } 
    

}

