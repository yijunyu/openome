package OME;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/** This class implements the Show Manager which is used to set up and play
  * a slide show. A show has to be set up under a specific project, and a 
  * slide is an individual model that has been created in the project. 
  *
  * @author: Yue Sun (July 2003)
  * @see GraphicViewFrame
  */
public class ShowManager {

    OME ome;
    ModelManager modelmanager;
    String showdir;
    LinkedList chosenModels;
    int slideIndex;
    boolean hideMenus;

    static final String defaultshowdir = ".." + File.separator + "shows";
    static final int ADD = 1;
    static final int REMOVE = -1;

    /* Constructor */
    public ShowManager(OME ome, ModelManager mm) {
	this.ome = ome;
	modelmanager = mm;
	
	File f = new File(defaultshowdir);
	if (!f.exists()) {
	    f.mkdir();
	}
	showdir = f.getAbsolutePath();
	chosenModels = new LinkedList();
	hideMenus = true;
    }


    /* Set up a show by selecting from models under dir */
    public void setupShow(String dir, Collection models) {
	
	chosenModels.clear();
	ShowSetupPanel mainpanel = new ShowSetupPanel(models.iterator(), dir);
 	ContinueCancelDialog dialog = new ContinueCancelDialog(ome, 
		"Setup Slide Show", mainpanel);
	mainpanel.setDialog(dialog);
		
	if (dialog.showDialog() == ContinueCancelDialog.CANCEL) {
	    chosenModels.clear();
	    D.o("chosen models cleared");
	} else {
	    String showname = InputDialog.getInput(ome, "Show Name",
				"Specify name of the slide show", "");
	    if (showname == null) {
   		return;
	    }

	    while (showname.equals("")) {
		JOptionPane.showMessageDialog( ome, 
			"No show name specified. " + "Please specify show name.",
                 	"Error setting up show", JOptionPane.ERROR_MESSAGE); 
        	showname = InputDialog.getInput(ome, "Show Name", 
				"Specify name of new show","");	    
	        if (showname == null) {
   		    return;
		}
            }

 	    // remove any whitespace at beginning or end of string.
	    showname = showname.trim();
	    File file = new File(showdir + File.separator + showname + ".txt");

	    // check if showname already exists
	    while (file.exists()) {
	    	JOptionPane.showMessageDialog( ome, 
		    "\"" + showname  + "\" already exists!\n", 
		    "Error setting up slide show", JOptionPane.ERROR_MESSAGE);
		showname = InputDialog.getInput(ome, "Show Name", 
				"Specify name of new show","");	    
	        if (showname == null) {
   		    return;
		}
		while (showname.equals("")) {
		    JOptionPane.showMessageDialog( ome, 
			"No show name specified. " + "Please specify show name.",
                 	"Error setting up show", JOptionPane.ERROR_MESSAGE); 
        	    showname = InputDialog.getInput(ome, "Show Name", 
				"Specify name of new show","");	    
	            if (showname == null) {
   		    	return;
		    }
            	}
		showname = showname.trim();
	        file = new File(showdir + File.separator + showname + ".txt");
	    } 
	    
	    // else create new show file
	    try {
		file.createNewFile();
		writeShowFile(file, chosenModels);		
 	    } catch (Exception e) {
	        D.o(e);
	    }   
	    
	    D.o("slide show " + showname + " is set up");
	}
    }


    /* Return an iterator of available show names that have been set up */
    public Iterator getAvailableShows() {
	Collection shows = new Vector();
	try {
	    File showfiles[] = (new File(showdir)).listFiles();
	    for (int j=0; j < showfiles.length; j++) {
		if (showfiles[j].isFile()) {
		    String showname = showfiles[j].getName();
		    shows.add(showname);		
		}
	    }		    
	} catch (Exception e) {
	    D.o(e);
	}
	return shows.iterator();
    }
    

    /* Play the show by loading model names from file "showFile" */
    public void playShow(String showfile) {
	String modelname = "";
	String showpath = showdir + File.separator + showfile;
	chosenModels.clear();
	try {
	    FileInputStream inStream =
                        new FileInputStream(new File(showpath));
            InputStreamReader inReader = new InputStreamReader(inStream);
            BufferedReader inBuf = new BufferedReader(inReader);
            modelname = inBuf.readLine(); 
	    while (modelname!=null) {
		chosenModels.add(modelname);
		modelname = inBuf.readLine(); 
	    }
	    inBuf.close();
	} catch (Exception e) {
	        D.o(e);
	}   

	//initialize the first slide index for showing
	slideIndex = 0;
	showSlide(showfile.substring(0, showfile.length()-4), slideIndex);
    }  

   
    /* write list of model names "models" to file */
    private void writeShowFile(File file, LinkedList models) 
		throws IOException {
	FileOutputStream outStream =
                        new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(outStream);
        BufferedWriter outBuf = new BufferedWriter(writer);
	Iterator modelnames = models.iterator();
	while (modelnames.hasNext()) {
	    String model = (String)modelnames.next();
	    outBuf.write(model);
	    outBuf.newLine();
	}
	outBuf.close();
    }


    
    /* Show the slide with index "index" in showfile */
    private void showSlide(String showfile, int index) {
	String mpath = (String)chosenModels.get(index);
	
	try {
	    OMEModel model = modelmanager.openModel(mpath);
	    ViewManager vm = modelmanager.getViewManager(model);
	    GraphicView gv = (GraphicView)vm.getViewByIndex(0);
	    new SlideViewFrame(gv, ome, showfile, mpath);
	} catch (Exception e) {
	    D.o(e);
	}   
    }

    
    /* A panel for setting up a show */
    private class ShowSetupPanel extends JPanel {

	JPanel orderpanel;
	JDialog jd;
	String path;

	public ShowSetupPanel(Iterator models, String dir) {
	    super();
	    path = dir;
	    
	    setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
	    setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

	    JPanel choicePanel = makeModelChoicePanel(models);
	    JPanel showOrderPanel = makeShowOrderPanel(models);
	    showOrderPanel.setPreferredSize(choicePanel.getMinimumSize());
	    showOrderPanel.setMinimumSize(choicePanel.getMinimumSize());

	    add(choicePanel);
	    add(Box.createRigidArea(new Dimension(5,0)));
	    add(showOrderPanel);
	}

	public void setDialog(JDialog dialog) {
	    jd = dialog;
	}

	// create a panel of available models to be chosen
	private JPanel makeModelChoicePanel(Iterator models) {
	    
	    JPanel jp = new JPanel();
	    jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
	    jp.setBorder(BorderFactory.createEtchedBorder());
	    jp.add(Box.createRigidArea(new Dimension(0,5)));
	    
	    JPanel title = new JPanel();
	    title.setLayout(new BoxLayout(title, BoxLayout.Y_AXIS));   
	    JLabel title1 = new JLabel("As the desired showing order,");
	    JLabel title2 = new JLabel("select models to be shown:");
	    title1.setFont(jp.getFont().deriveFont(Font.BOLD));
	    title2.setFont(jp.getFont().deriveFont(Font.BOLD));
	    title.add(title1); 
	    title.add(title2);

	    JPanel labelpanel = new JPanel();
	    labelpanel.setLayout(new BoxLayout(labelpanel, BoxLayout.X_AXIS));
	    labelpanel.add(Box.createRigidArea(new Dimension(3, 0)));
	    labelpanel.add(title);
	    
	    JPanel modelpanel = new JPanel(new GridLayout(0,1));

	    Vector choices = new Vector();
	    String modelname;
	    while (models.hasNext()) {
	    	String filename = (String)models.next();
	    	modelname = filename.substring(filename.lastIndexOf(File.separatorChar)+1);
	    	
	    	JCheckBox cb = new JCheckBox(modelname);
		cb.addItemListener(new ChoiceListener(modelname));
	    	modelpanel.add(cb);
	    	choices.add(cb);	    
	    }
	    jp.add(labelpanel);
	    jp.add(Box.createRigidArea(new Dimension(0, 5)));
	    jp.add(modelpanel);
	    
	    return jp;
	}

	//create a panel of ordered model names that were selected for slide show.
	private JPanel makeShowOrderPanel(Iterator models) {
	        
	    JPanel jp = new JPanel();
	    jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
	    jp.setBorder(BorderFactory.createEtchedBorder());
	    jp.add(Box.createRigidArea(new Dimension(0,5)));
	    
	    JPanel title = new JPanel();
	    title.setLayout(new BoxLayout(title, BoxLayout.Y_AXIS));   
	    JLabel title1 = new JLabel("Showing order:");
	    JLabel title2 = new JLabel("    ");  //to be consistant with left panel
	    title1.setFont(jp.getFont().deriveFont(Font.BOLD));
	    title2.setFont(jp.getFont().deriveFont(Font.BOLD));
	    title.add(title1); 
	    title.add(title2);

	    JPanel labelpanel = new JPanel();
	    labelpanel.setLayout(new BoxLayout(labelpanel, BoxLayout.X_AXIS));
	    labelpanel.add(Box.createRigidArea(new Dimension(3, 0)));
	    labelpanel.add(title);
	    //labelpanel.add(emptyLabel);
	    labelpanel.add(Box.createHorizontalGlue());
	    
	    JPanel listpanel = new JPanel(new GridLayout(0,1));
	       
	    jp.add(labelpanel, BorderLayout.NORTH);
	    jp.add(Box.createRigidArea(new Dimension(0, 5)));
	    jp.add(listpanel);

	    orderpanel = new JPanel();
	    listpanel.add(orderpanel);
	    orderpanel.setLayout(new BoxLayout(orderpanel, BoxLayout.Y_AXIS));
	    	    
	    return jp;
	}
   
	//update "modelname" at show order panel according to "status"
	private void updateOrderPanel(String modelname, int status) {
	    //D.o("updating order panel");

	    if (status == ADD) {  //add a modelname 
	    	JPanel itempanel = new JPanel();
	    	itempanel.setLayout(new BoxLayout(itempanel,BoxLayout.X_AXIS));
	    	itempanel.setAlignmentX(LEFT_ALIGNMENT);

	    	int order = chosenModels.size() +1;
	    	JLabel orderlabel = new JLabel("" + order);
	    	JLabel modellabel = new JLabel(modelname);
	    	itempanel.add(orderlabel);
	    	itempanel.add(Box.createRigidArea(new Dimension(5, 0)));
	    	itempanel.add(modellabel);
	    	orderpanel.add(itempanel);
	    	chosenModels.add(path+File.separator+modelname);

	    } else if (status == REMOVE) {   //remove a modelname
		Component components[] = orderpanel.getComponents();
		int i = 0;
		while (i<components.length) {
		    JPanel panel = (JPanel)components[i];
		    Component labels[] = panel.getComponents();
		    		    
		    //we know labels has three elements: orderNo, rigidArea, and 
		    //modelname
		    
                    if (((JLabel)labels[2]).getText().equals(modelname)) {
		    	try {    
			    int orderNo = Integer.parseInt(((JLabel)labels[0]).getText()); 	
			    D.o("panel with " + orderNo + " "+ modelname + " to be removed");
			    orderpanel.remove(panel);
			    orderpanel.updateUI();
			    chosenModels.remove(path+File.separator+modelname);
			    break;
			} catch (Exception e) {
			    D.o(e);
			}
		    }
		    i++;
		}
		//update the new order numbers
		i++;
		while (i<components.length) {
		    JPanel panel = (JPanel)components[i];
		    Component labels[] = panel.getComponents();
		    if (labels[0] instanceof JLabel) {
			int newOrder = Integer.parseInt(((JLabel)labels[0]).getText()) - 1;
			((JLabel)labels[0]).setText(""+newOrder);
		    }
		    i++;
		}
	    }
	}

	protected class ChoiceListener implements ItemListener {
	    
	    String modelname;

	    /** 
	      * Creates a CheckboxChoiceListener with the specified choice.
	      *
	      * @param Choice the choice associated with this Checkbox.
	     */
	    public ChoiceListener (String filename) {
	    	super();
	    	modelname = filename;
	    }

	    /**
	      * Acts as a listener which toggles the state of the choice associated
	      * with the checkbox, when it's state is toggled.
	      */
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
		    updateOrderPanel(modelname, ADD);
	            jd.pack();
	    	} else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    updateOrderPanel(modelname, REMOVE);
	            jd.pack();
		    D.o("jd packed");
	    	}
	    }
    	}
    }


    private class SlideViewFrame extends GraphicViewFrame {
 
	public final static int FIRST = 1;
	public final static int PREV = 2;
    	public final static int NEXT = 3;
	public final static int END = 4;
	String showname;
    	PluginMethod saveMethod;
           
   	/** The status bar that sits at the bottom of the SlideViewFrame.
     	  */
    	class SlideViewStatusBar extends GraphicViewStatusBar {
		
	    /** Constructor */
	    public SlideViewStatusBar() {
	    	super();
	    	JPanel pointer = new JPanel();
	    	pointer.setLayout(new BoxLayout(pointer, BoxLayout.X_AXIS));
	    	pointer.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
		JButton first = new JButton("First");
	    	JButton end = new JButton("End");
	    	JButton next = new JButton("Next");
	    	JButton prev = new JButton("Previous");
		first.addActionListener(new SlideButtonListener(FIRST));
	    	end.addActionListener(new SlideButtonListener(END));
	    	next.addActionListener(new SlideButtonListener(NEXT));
	    	prev.addActionListener(new SlideButtonListener(PREV));

		pointer.add(first);
	    	pointer.add(Box.createRigidArea(new Dimension(5,0)));
	    	pointer.add(prev);
	    	pointer.add(Box.createRigidArea(new Dimension(5,0)));
	    	pointer.add(next);
		pointer.add(Box.createRigidArea(new Dimension(5,0)));
		pointer.add(end);
	    	
	    	add(pointer, BorderLayout.EAST);
		setBorder(BorderFactory.createLoweredBevelBorder());
		
		if (slideIndex == 0) {
		    first.setEnabled(false);
		    prev.setEnabled(false);
		}
		if (slideIndex == chosenModels.size()-1) {
		    next.setEnabled(false);
		    end.setEnabled(false);
		}
	    }
    	}
		
    	class SlideButtonListener implements ActionListener{
	    int pointer;
	    
	    public SlideButtonListener (int p) {
	    	pointer = p;
	    }

            public void actionPerformed(ActionEvent e) {
		if (pointer == FIRST) {
		    D.o("play the first slide");
		    slideIndex=0;
	    	} else if (pointer == NEXT) {
		    D.o("play the next slide");
		    slideIndex++;
	        } else if (pointer==PREV) {
	            D.o("play the previous slide");
		    slideIndex--;
		} else if (pointer == END) {
		    D.o("play the last slide");
		    slideIndex = chosenModels.size()-1;
		}
	    	closeFrame(saveMethod);
		showSlide(showname, slideIndex);
	    }
    	}
    
    	/** Constructs the frame window.*/
    	public SlideViewFrame(GraphicView gv, OME ome, String showfile, String title) {
	    super();
	
	    D.o("Creating slideViewFrame");

	    try {
	    	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (Exception e) { D.o(e); }

	    showname = showfile;
	    this.path = title;
	    this.exportpath = "C:/ome3/program/";

      	    setTitle("Slide Show - " + showname + " " + title);

	    JPanel mainpanel = new JPanel();

	    this.menuBar = createMenuBar();
	    mainpanel.setLayout(new BorderLayout());
	    mainpanel.add(this.menuBar,BorderLayout.NORTH);

	    JPanel upperpanel = new JPanel();
	    upperpanel.setLayout(new BorderLayout());
	
	    // Set up the place for toolbars to go.
	    this.toolbarpanel = new JPanel();
	    this.toolbars = new Vector();
	    this.toolbarpanel.setLayout(new BoxLayout(this.toolbarpanel,BoxLayout.Y_AXIS));
	    upperpanel.add(this.toolbarpanel, BorderLayout.NORTH);
			
	
	    this.gvc = new SlideViewCanvas(this.menuBar, gv, ome, this);
    	    this.scrollpanel = new ScrollingPanel(gv, this, this.gvc);
	    this.scrollpanel.setAlignmentX(LEFT_ALIGNMENT);
	
	    upperpanel.add(this.scrollpanel, BorderLayout.CENTER);
	    mainpanel.add(upperpanel, BorderLayout.CENTER);
	   
	    //initialize saveMethod
	    Collection plugins = gv.getModel().getPlugins();
	    Iterator plugit = plugins.iterator();
	    while (plugit.hasNext()) {
	        OMEPlugin p = (OMEPlugin)plugit.next();
	        if (p instanceof OMEDefaultPlugin) {
		    saveMethod = ((OMEDefaultPlugin)p).getSaveMethod(gv);
		}
	    }

	    // Create status bar.	    
	    statusBar = new SlideViewStatusBar();
	    mainpanel.add(statusBar,BorderLayout.SOUTH);
	    setContentPane(mainpanel);
	    
	    pack();
	    //setSize(size,size);
	    //setSize(600,600);
	    Dimension d = getToolkit().getScreenSize();
	    setSize(d.width, d.height-15);
	    Rectangle b = getBounds();
	    setLocation((d.width - b.width)/2, 0);

	      
            addComponentListener(new GVFComponentAdapter());

	    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

	    setToolbar();
	
	    setVisible(true);
    	}

	    
        private class SlideViewCanvas extends GraphicViewCanvas {

	    public SlideViewCanvas(JMenuBar menuBar, GraphicView gview, OME ome,
		SlideViewFrame gframe) {
	    
		super();
	    	this.stringClass = String.class;
	    	this.integerClass = Integer.class;
	    	this.LocationClass = View.Location.class;
	    	this.GraphicLocationClass = View.GraphicLocation.class;
	    	this.OMEObjectClass = OMEObject.class;
	    	this.OMEElementClass = OMEElement.class;
	    	this.OMELinkClass = OMELink.class;
	    	this.ViewContextClass = ViewContext.class;
	
	    	this.gframe = gframe;
            	this.ome = ome;
            	this.menuBar = menuBar;
           	this.view = gview;

	    	this.pcollector = new GVCParameterCollector(this);

	    	// setup the SlideView.
	    	this.view.setDisplayBounds(new Rectangle(new Point(0,0),gframe.getSize()));
	    	this.view.setGraphicViewCanvas(this);
	
	    	// Gui stui.

	    	setLayout(null);
	    	setBorder(BorderFactory.createEtchedBorder());
	    	addComponentListener( new GVCComponentAdapter() );
	    	addMouseListener( new GVCMouseAdapter() );
	    	addMouseMotionListener( new GVCMouseMotionAdapter());
	    	addKeyListener( new GVCKeyAdapter());
	    	requestFocus();
	    
	    	//get the plugins.  
	    	this.plugins = view.getModel().getPlugins();

	    	hookupSaveMethod();
	    	this.index2type = new HashMap();
	    	this.popupmenu = null; // setPopupMenu();

		setMenuBar();
	    	setToolBar();

		//the default status for a slide show is not to show the menu
		//bar and tool bar
		hideMenus = true;
		menuBar.setVisible(false);
	    	toolbarpanel.setVisible(false);
		
		D.o("Created SlideViewCanvas");

	    }

	    protected void setMenuBar() {

		Vector usedmnemonics = new Vector();
        	Character mnemonic;
		LinkedList existing_menuitems = new LinkedList();	    

		Iterator plugit = plugins.iterator();
		Collection c = new Vector();
		MenuMethod slideoptions = new MenuMethod("Slide Options");
		slideoptions.addItem(new HideMenuMethod(view));
		//slideoptions.addItem(new UnhideMenuMethod(view));

		while (plugit.hasNext()) {
	    	    Collection methods = 
		    	((OMEPlugin)plugit.next()).getMenubarMethods(view);

	       	    if (methods != null) {
		    	c.addAll(methods);
	    	    }	    
		}
		c.add(slideoptions);

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

	    protected JPopupMenuPlus setPopupMenu (MouseEvent me) {

		Point p = view.toView(me.getPoint());
		D.o("Creating popup");
		JPopupMenuPlus popupmenu = new JPopupMenuPlus(me);	

		Iterator plugit = plugins.iterator();
		Collection c = new Vector();
		//MenuMethod slideoptions = new MenuMethod("Slide Options");
		//slideoptions.addItem(new HideMenuMethod(view));
		//slideoptions.addItem(new ShowMenuMethod(view));
		//c.add(slideoptions);
		c.add(new HideMenuMethod(view));
		c.add(new ShowMenuMethod(view));

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
				if (jmi!=null) popupmenu.add(jmi);
				//jmi.setEnabled(method.isEnabled(ovc));
		    	    }
			}
	    	    }
		}
		return popupmenu;
    	    }


	    private class HideMenuMethod extends AbstractPluginMethod{
    
		//private Image isonimage;
		View view;
		public HideMenuMethod(View view) {
	    	    this.view = view;   
		}
	
		public String getName() {
	    	    return "Hide Menus";
		}
	
		public void invoke() {
	    	    hideMenus = true;
	    	    menuBar.setVisible(false);
	    	    toolbarpanel.setVisible(false);
		}

		public boolean isEnabled(ViewContext con) {
		    if (hideMenus == true) {
			return false;
		    }
		    return true;
		}
	    }

	    private class ShowMenuMethod extends AbstractPluginMethod{
    
		//private Image isonimage;
		View view;
		public ShowMenuMethod(View view) {
	    	    this.view = view;   
		}
	
		public String getName() {
	    	    return "Show Menus";
		}
	
		public void invoke() {
	    	    hideMenus = false;
	    	    menuBar.setVisible(true);
	    	    toolbarpanel.setVisible(true);
		}

		public boolean isEnabled(ViewContext con) {
		    if (hideMenus == true) {
			return true;
		    }
		    return false;
		}
	    }
    	}
    }
}
