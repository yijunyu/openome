/**
  * File Updated by LIN LIU SEP 15, 2001
  */

package OME;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/** This class implements the Project Manager which is used to create and
 * access projects. (A Project is a collection of models). The Project Manager
 * allows the user to create new projects, load existing projects, create new
 * models and load existing models. 
 * "Delete(project,model)" has been added by Zhiming (Dec.4,2000)
 */
class ProjectManager extends JPanel {

    private static final int PROJECT = 1;
    private static final int MODEL = 2;
    
    private OME ome;
    private ProjectNode rootnode;
    private DefaultTreeModel treemodel;
    private JTree projecttree;
    private String defaultprojectdir = ome.projectdir;
    private String projectdir;
    private Collection loadedprojects;
    private HashMap hashmap = new HashMap();

    private ModelManager modelmanager;

    // The toolbar used to store the buttons
    JToolBar toolbar;
    
    // The actions available
    AbstractAction refreshaction;	// refreshes the view
    AbstractAction setprojdiraction;	// sets the project directory
    AbstractAction newprojaction;	// open new project
    AbstractAction openprojaction;	// load one or more existing projects
    AbstractAction deleteprojaction;	// delete an existing projects
    AbstractAction closeprojaction;	// remove project from view
    AbstractAction newmodelaction;	// open a new model
    AbstractAction showmodelaction;	// show an existing model
    AbstractAction openmodelaction;	// open an existing model
    AbstractAction deletemodelaction;	// delete an existing model
    AbstractAction helpcontentsaction;  
    AbstractAction aboutOMEaction;
    AbstractAction releasenotesaction;
    AbstractAction selectkbaction;
    AbstractAction editkbaction;
    AbstractAction catalogkbaction;
    
    // A collection of the menus available
    Collection availablemenus = new Vector();
    
    /** The initialisation of the project tree (which is used to display loaded
     *  projects and models) and the appropiate menus and toolbars is done here.  */
    public ProjectManager(OME ome) {

	this.ome = ome;
	loadedprojects = new Vector();	
	modelmanager = new ModelManager(ome);

	setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
	
	//create a directory to store projects, if one doesn't already exist
	File f = new File(defaultprojectdir);
	if (!f.exists()) {
	    f.mkdir();
	}
	projectdir = f.getAbsolutePath();

	// construct the panel containing the project tree
	JPanel projectpanel = new JPanel(new BorderLayout());
	initProjectTree();
	projectpanel.add(new JScrollPane(projecttree));

	// create and add the toolbar
	toolbar = new JToolBar(JToolBar.VERTICAL);
	toolbar.setLayout(new GridLayout(0,1));
	toolbar.setFloatable(false);

	// create the menus and actions
	initMenusAndActions();


	add(toolbar,BorderLayout.WEST);	
	add(projectpanel,BorderLayout.CENTER);

    }

    
    /** Initializes the project tree (specifically the tree model on which 
     *  this project tree is based on.  Note the project tree is just a view 
     *  of the tree model. Thus additions and removals of nodes are done 
     *  directly to the tree model, which then updates the project tree. 
     */
    private void initProjectTree() {
	rootnode = new ProjectNode("Projects", projectdir, PROJECT);
  	treemodel = new DefaultTreeModel(rootnode);
	projecttree = new JTree(treemodel);
	projecttree.addMouseListener(new ProjectTreeMouseListener());  
    }

    
    /** Creates menus and actions. */
    private void initMenusAndActions() {

	// create the Project menu
	JMenuPlus projectmenu = new JMenuPlus("Project");
	projectmenu.setMnemonic('P');
	availablemenus.add(projectmenu);	
	// create the Model menu
	JMenuPlus modelmenu = new JMenuPlus("Model");
	modelmenu.setMnemonic('M');
	availablemenus.add(modelmenu);
	
	JMenuPlus kbmenu = new JMenuPlus("Knowledge Base");
	kbmenu.setMnemonic('K');
	availablemenus.add(kbmenu);	

	// create the View menu
	JMenuPlus viewmenu = new JMenuPlus("View");	
	viewmenu.setMnemonic('V');
//cai	availablemenus.add(viewmenu);	
	
	JMenuPlus helpmenu = new JMenuPlus("Help");
	helpmenu.setMnemonic('H');
	availablemenus.add(helpmenu);
	
	refreshaction = new RefreshViewAction();
	viewmenu.add(refreshaction);
//	addAction(refreshaction, viewmenu, "Refreshes the view");

	setprojdiraction = new SetProjectDirectoryAction();
	projectmenu.add(setprojdiraction);
	
	newprojaction = new NewProjectAction();
	addAction(newprojaction, projectmenu, "Creates a new project");
	
	openprojaction = new OpenProjectAction();
	addAction(openprojaction, projectmenu, "Opens project(s)");

	deleteprojaction = new DeleteProjectAction();
	deleteprojaction.setEnabled(false);
	addAction(deleteprojaction, projectmenu, "Deletes project");


	closeprojaction = new CloseProjectAction();
	closeprojaction.setEnabled(false);
	addAction(closeprojaction, projectmenu, "Removes project from view");

	newmodelaction = new NewModelAction();
	addAction(newmodelaction, modelmenu, "Creates a new model");
	
	showmodelaction = new ShowModelAction();
	showmodelaction.setEnabled(false);
	addAction(showmodelaction, modelmenu, "Shows a selected model");

	openmodelaction = new OpenModelAction();
	addAction(openmodelaction, modelmenu, "Opens an existing model");

	deletemodelaction = new DeleteModelAction();
	deletemodelaction.setEnabled(false);
	addAction(deletemodelaction, modelmenu, "Deletes a selected model");

	selectkbaction = new SelectKBAction();
	kbmenu.add(selectkbaction);
	
	editkbaction = new EditKBAction();
	kbmenu.add(editkbaction);
	kbmenu.addSeparator();
	
	catalogkbaction = new CatalogKBAction();
	kbmenu.add(catalogkbaction);
	
	helpcontentsaction = new HelpContentsAction();
	helpmenu.add(helpcontentsaction);

	aboutOMEaction = new AboutOMEAction();
	helpmenu.add(aboutOMEaction);
	
        releasenotesaction = new ReleaseNotesAction();
	helpmenu.add(releasenotesaction);
    
	updateActionStatus();
    }
    
    
    /** Adds the specified action to the toolbar and specified menu. */
    private void addAction(AbstractAction action, JMenuPlus menu, String tooltip) {
	menu.add(action);
	JButton button = toolbar.add(action);
	button.setToolTipText(tooltip);
    }


    /** Updates the "enabled" status of the actions, depending on the last 
     *  selected node in the tree.
     */
    private void updateActionStatus() {
	TreePath tp = projecttree.getSelectionPath();
	if (tp != null) {
	    ProjectNode node = (ProjectNode)
		projecttree.getSelectionPath().getLastPathComponent();
	    if (node != rootnode) { 
		if (node.getType() == PROJECT){
		    closeprojaction.setEnabled(true);
		    showmodelaction.setEnabled(false);
		    deletemodelaction.setEnabled(false);
                    deleteprojaction.setEnabled(true);
		} else if (node.getType() == MODEL) {
		    closeprojaction.setEnabled(false);
		    deleteprojaction.setEnabled(false);
		    showmodelaction.setEnabled(true);
		    deletemodelaction.setEnabled(true);
		}
	    } else {
		closeprojaction.setEnabled(false);
                deleteprojaction.setEnabled(false);

	    }
	} 
    }

    
    /** Opens the model corresponding to the specified node. */
    public void openModel(String mpath) {
	try {
	    OMEModel model = modelmanager.openModel(mpath);
	    ViewManager vm = modelmanager.getViewManager(model);
	    
// single view
	    GraphicView gv = (GraphicView)vm.getViewByIndex(0);

	    new GraphicViewFrame(ome.DEFAULT_WIDTH, gv, ome, mpath);
//multiple view
//	    new GraphicViewFrame(ome.DEFAULT_WIDTH, vm, ome, mpath);

	} catch (Exception e) {
	    D.o(e);
	}   
    }        

    
    /** Displays the projects that can be loaded, and returns the names of all
     *  projects selected to be loaded.
     */
    public Collection displayAvailableProjects () {
	Collection c = new Vector();		
	Collection projs = new Vector();
	Collection availableprojects = getAvailableProjects();
	if (availableprojects.isEmpty()) {
	    JOptionPane.showMessageDialog( ome, 
		"No projects in the current project directory", 
		"No available projects", JOptionPane.ERROR_MESSAGE);	   	    
	    return projs;
	}

	// create a dialog of available projects to be loaded	
	JPanel mainpanel = new JPanel(new BorderLayout());
	mainpanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	JPanel labelpanel = new JPanel();
	labelpanel.add (new JLabel("Select projects to be loaded"));

	JPanel projectpanel = new JPanel(new GridLayout(0,1));
	Iterator i = availableprojects.iterator();
	while (i.hasNext()) {
	    JCheckBox cb = new JCheckBox((String)(i.next()));
	    projectpanel.add(cb);
	    c.add(cb);	    
	}
	mainpanel.add(labelpanel, BorderLayout.NORTH);
	mainpanel.add(projectpanel, BorderLayout.CENTER);
	ContinueCancelDialog dialog = new ContinueCancelDialog(ome, 
		"Select Project(s)", mainpanel);

	// display dialog and determine which projects were selected
	if (dialog.showDialog() == ContinueCancelDialog.CONTINUE) {
	    Iterator j = c.iterator();
	    while (j.hasNext()) {
		JCheckBox cb  = (JCheckBox)j.next();
		if (cb.isSelected()) {
		    projs.add(cb.getText());
		}
	    }
	}	
	// return a collection of the projects that were selected
	return projs;	
    }

    
    /** Gets all the projects in the current project directory. */
    public Collection getAvailableProjects () {
	Collection projs = new Vector();
	if (projectdir == null) { 
	    return projs;
	}
	try {
	    File projects[] = (new File(projectdir)).listFiles();
	    for (int j=0; j < projects.length; j++) {
		if (projects[j].isDirectory()) {
		    String pname = projects[j].getName();
		    projs.add(pname);		
		}
	    }		    
	} catch (Exception e) {
	    D.o(e);
	}
	return projs;
    }


    /** Sets the name of the directory where the projects are stored.
     *  By default, this is given by the value of <ome.projectdir>.
     */
    private void setProjectDirectory() {
	String newprojectdir = InputDialog.getInput(ome, "Project Directory", 
			"Specify the location of the \"Projects\" directory",
			projectdir);

	if (newprojectdir != null) {
	    projectdir = newprojectdir;
	}
	
	// create this directory if it doesn't already exist
	File f = new File(projectdir);
	if (!f.exists()) {
	    D.o("Succesful making directory:" + f.mkdir());
	}
	projectdir = f.getAbsolutePath();	
    }
    
    
    /** Adds the specified project to the project tree. */
    public void loadProject (String pname) {
	String ppath = projectdir + File.separator + pname;
	if (!ProjectLoaded(ppath)) {
	    // add the project to the collection of projects loaded
	    loadedprojects.add(ppath);
	    // create and add the project node to tree
	    ProjectNode pnode = new ProjectNode(pname,ppath,PROJECT);
	    int pposition = rootnode.getChildCount();
	    treemodel.insertNodeInto(pnode,rootnode,pposition);
	    // add the pnode/ppath to hashmap
	    hashmap.put(ppath,pnode);
	    // now add all the model nodes the project node contains 
	    loadModels(ppath);
	}
	// refresh the view
	refresh();
	// expand the root node
	projecttree.expandRow(0);
    }


    /** Adds all the models in the specified project node to the project tree*/
    public void loadModels(String ppath) {
	ProjectNode pnode = (ProjectNode)hashmap.get(ppath);	
	Collection loadedmodels = pnode.getModels();
	String models[] = (new File(ppath)).list();
	for (int j=0; j<models.length; j++) {
	    String mname = models[j];
	    if (mname.endsWith(".tel")) {
		String mpath = ppath + File.separator + mname;
		if (!loadedmodels.contains(mpath)) {
		    ProjectNode mnode = new ProjectNode(mname,mpath,MODEL);
		    int mposition = pnode.getChildCount();
		    treemodel.insertNodeInto(mnode,pnode,mposition);
		    pnode.addModel(mpath);
		}
	    }		
	}    
    }
 
    
    /** Checks if a project has already been loaded into the project tree. 
     *  We keep track of which projects have been loaded into the project tree
     *  by maintaining a collection of the relative paths of all projects added
     *  to the project tree.
     */
    public boolean ProjectLoaded(String ppath){	
	return (loadedprojects.contains(ppath));
    }


    /** Checks all the projects currently loaded and refreshes their views.*/
    public void refresh() {
	Iterator i = loadedprojects.iterator();
	while (i.hasNext()) {
	    String ppath = (String)i.next();
	    loadModels(ppath);
	}
    }
    
    /** Displays framework selection dialogue to user.  Returns true iff user
     *  indicated a desire to proceed. 
     */
    public boolean displayCheckboxChooser(JFrame frame, String title, 
					    Collection choices) {	
	CheckboxChooser cc = new CheckboxChooser(frame,title,true,choices);
	int result = cc.showDialog();
	return (result==CheckboxChooser.CONTINUE);	
    }

    //returns a collection of the menus
    public Collection getAvailableMenus() {
	return availablemenus;
    }
    
    /*************************** inner classes *****************************/
     
    /** The action to set the project directory. */
    class SetProjectDirectoryAction extends AbstractAction {
	
	public SetProjectDirectoryAction() {
	    super("Set Project Directory");
	}

	public void actionPerformed (ActionEvent e) {
	    setProjectDirectory();
	}
    }

    
    /** The action to refresh the project view. */
    class RefreshViewAction extends AbstractAction {
	
	public RefreshViewAction() {
	    super("Refresh");
	}

	public void actionPerformed (ActionEvent e) {
	    refresh();
	}
    }


    /** The action to open a new project. */
    public class NewProjectAction extends AbstractAction {
	public NewProjectAction() {
	    super ("New Project");
	}

	public void actionPerformed (ActionEvent e) {	    
	    // get name of new project
	    String projectname = InputDialog.getInput(ome, "Project Name", 
				"Specify name of new project","");	    
	    if (projectname == null) {
   		return;
	    }

//cai,dec.8,2000,if projectname="",dialog repeat

	    while (projectname.equals("")) {
		    JOptionPane.showMessageDialog( ome, 
			"No Project name specified. " +
		"Specify project name first.",
                 "Error creating Project", JOptionPane.ERROR_MESSAGE); 
             projectname = InputDialog.getInput(ome, "Project Name", 
				"Specify name of new project","");	    
	    if (projectname == null) {
   		return;
		}
            }
 	    // remove any whitespace at beginning or end of string.
	    projectname = projectname.trim();
	    String path = projectdir + File.separator + projectname;
	    File file = new File(path);

	    // check if project already exists
	    if (file.exists()) {
	    	JOptionPane.showMessageDialog( ome, 
		    "Project  \"" + projectname  + "\" already exists!\n", 
		    "Error creating Project", JOptionPane.ERROR_MESSAGE);
		return;
	    } 
	    
	    // else create new project
	    file.mkdir();
	    // add new project to project view
	    loadProject(projectname);
	}
    }

    
    /** The action to load project(s). */    
    private class OpenProjectAction extends AbstractAction {
	public OpenProjectAction() {
	    super ("Load Project(s)");
	}

	public void actionPerformed (ActionEvent e) {
	    // find which projects should be loaded
	    Collection c = displayAvailableProjects();
	    // and load each such project
	    Iterator i = c.iterator();		
	    while (i.hasNext()) { 
		loadProject((String)i.next());
	    }
	}
    }


    /** The action to delete project(s). */    
    private class DeleteProjectAction extends AbstractAction {
	public DeleteProjectAction() {
	    super ("Delete Project");
	}

	public void actionPerformed (ActionEvent e) {
 
	    TreePath tp = projecttree.getSelectionPath();
	    if (tp != null) {
		ProjectNode pnode = (ProjectNode)(tp.getLastPathComponent());
		if (pnode != rootnode){
	          File file = new File(pnode.getAbsolutePath());
                  if( file.delete() == false) {
		        JOptionPane.showMessageDialog(ome,
		    "Unable to delete the project which is not empty.Please check the project directory.",
			    "Error",
			    JOptionPane.ERROR_MESSAGE);
	          } 
                  else{ 
                    // remove project node from project tree
		    treemodel.removeNodeFromParent(pnode);
		    // and remove project from the collection of loaded projects
		    loadedprojects.remove(pnode.getAbsolutePath());
                  }
  	         D.o(pnode.getAbsolutePath());
	      }
           }
        }
    }

    
    /** The action to close a project. */
    private class CloseProjectAction extends AbstractAction {
	public CloseProjectAction() {
	    super("Close Project");
	}

	public void actionPerformed (ActionEvent e) {
	    TreePath tp = projecttree.getSelectionPath();
	    if (tp != null) {
		ProjectNode pnode = (ProjectNode)(tp.getLastPathComponent());
		if (pnode != rootnode){
		    // remove project node from project tree
		    treemodel.removeNodeFromParent(pnode);
		    // and remove project from the collection of loaded projects
		    loadedprojects.remove(pnode.getAbsolutePath());
		    D.o(pnode.getAbsolutePath());
		}
	    }	 
	}
    }

    
    /** The action to open a new model. */
    public class NewModelAction extends AbstractAction {
	public NewModelAction() {
	    super ("New Model");
	}

	public void actionPerformed(ActionEvent e) {
	    try {
		Collection c = modelmanager.getFrameworkChoices();
		// create a dialog requesting information about new model
		Collection projects = getAvailableProjects();
		if (projects.isEmpty()) {
		    JOptionPane.showMessageDialog( ome, 
			"No projects in current project directory. " +
			"Create Project first.", 
			"Error creating Model", JOptionPane.ERROR_MESSAGE);
		    return;		    
		}
		NewModelInfo modelinfo = new NewModelInfo(ome, 
			getAvailableProjects(), c);
		// display the dialog
		if (modelinfo.showDialog() == ContinueCancelDialog.CANCEL) {
		    return;
		}

		// get the name of the new model
		String mname = modelinfo.getModelName();

//cai,if mname="",dialog repeat
	
  		while (mname.equals("")) {
		    JOptionPane.showMessageDialog( ome, 
			"No Model name specified. " +
			"Specify Model name first.", 
			"Error creating Model", JOptionPane.ERROR_MESSAGE);		   	if (modelinfo.showDialog() == ContinueCancelDialog.CANCEL) {
		    return;
	           }
                mname = modelinfo.getModelName();
 
		}
		//currently all models must have a ".tel" extension
		if (!mname.endsWith(".tel")) {
		    mname += ".tel";
		}
		// get the name of the new project
		String pname = modelinfo.getProjectName();
		
		String ppath = projectdir + File.separator + pname;				
		String mpath = ppath + File.separator + mname;
    
		// check if this model already exists.
		File file = new File(mpath);

//cai, if this model already exist,dialog repeat

		while (file.exists()) {
		    JOptionPane.showMessageDialog( ome, 
			"Model  \"" + mname  + "\" already exists!\n", 
			"Error creating Model", JOptionPane.ERROR_MESSAGE);
	   	if (modelinfo.showDialog() == ContinueCancelDialog.CANCEL) {
		    return;
	           }
		 pname = modelinfo.getProjectName();
		 ppath = projectdir + File.separator + pname;				         mname = modelinfo.getModelName();
		 mpath = ppath + File.separator + mname;
		 file = new File(mpath);
		}
		
		// otherwise create the new model
		OMEModel model = modelmanager.newModel(c.iterator());
		ViewManager vm = modelmanager.getViewManager(model);

		GraphicView gv = (GraphicView)vm.getViewByIndex(0);
//single view
		new GraphicViewFrame(ome.DEFAULT_WIDTH,gv,ome,mpath);
//multiple view
//		new GraphicViewFrame(ome.DEFAULT_WIDTH, vm, ome, mpath);
		// save the newly created model
		model.save(mpath);
		
		// add the model (& the project it belongs to) to project tree
		loadProject(pname);

	    } catch (Exception ex){
		D.o(ex);
	    }	 	  
	}
    }


    /** The action to show a selected model. */
    public class ShowModelAction extends AbstractAction {
	public ShowModelAction() {
	    super("Show Model");
	}

	public void actionPerformed(ActionEvent e) {
	    ProjectNode node = (ProjectNode)
		projecttree.getLastSelectedPathComponent();
	    if (node.getType() == MODEL) {
		openModel(node.getAbsolutePath());
	    }  
	}
    }

 /** The action to delete a selected model. */
    public class DeleteModelAction extends AbstractAction {
	public DeleteModelAction() {
	    super("Delete Model");
	}

	public void actionPerformed(ActionEvent e) {
	    ProjectNode node = (ProjectNode)
		projecttree.getLastSelectedPathComponent();
	    if (node.getType() == MODEL) {
                 File file = new File(node.getAbsolutePath());
                 file.delete();
                 treemodel.removeNodeFromParent(node);
/*//refresh:
	    TreePath tp = projecttree.getSelectionPath();
	    if (tp != null) {
		ProjectNode pnode = (ProjectNode)(tp.getLastPathComponent());
			if (pnode != rootnode){
		    // remove project node from project tree
		    treemodel.removeNodeFromParent(pnode);
		    // and remove project from the collection of loaded projects
		    loadedprojects.remove(pnode.getAbsolutePath());
                 File file = new File(pnode.getAbsolutePath());
                 file.delete();
	
*/
            //     refresh();

	     }  
	}
    }




    /** The action to open an existing model. */
    private class OpenModelAction extends AbstractAction {
	public OpenModelAction() {
	    super ("Open Model");
	}

	public void actionPerformed(ActionEvent e) {
	    // display dialog allowing user to select model to open
	    FileDialog dialog = new FileDialog(ome,"Open File",FileDialog.LOAD);
	    dialog.setFile("*.tel");
	    dialog.setDirectory(projectdir);
	    dialog.show();
	    String filename = dialog.getFile();
	    String dirname = dialog.getDirectory();

	    // open the model
	    if (filename == null ) {
		// error message: we didn't find the file.
		return;
	    } else {
		String path = dirname + filename;
		D.o(path);
		openModel(path);
	    }	    	  
	}
    }

   private class HelpContentsAction extends AbstractAction {

       public HelpContentsAction(){
	    super ("Help Contents");
       }
       
       public void actionPerformed(ActionEvent e) {
       
       }
       
   }

    private class AboutOMEAction extends AbstractAction {
    
	public AboutOMEAction(){
	    super ("About OME");
	}

	public void actionPerformed(ActionEvent e){
	}
    }

    private class ReleaseNotesAction extends AbstractAction{
    
	public ReleaseNotesAction(){
	    super ("Release Notes");
	}

	public void actionPerformed(ActionEvent e){
	}
    }

    private class SelectKBAction extends AbstractAction{

	public SelectKBAction(){
	    super ("Select Domain Knowledge");
	}

	public void actionPerformed(ActionEvent e){
		new ModuleInUseDlg(ome, false, ome.getAvailableModule(), 
				ome.getSelectedModule(),
				ome.getConceptMethodTree());
	}
    }

    private class EditKBAction extends AbstractAction{

	public EditKBAction(){
	    super ("Update Knowldege Base");
	}

	public void actionPerformed(ActionEvent e){
		new ModuleEditor(ome);	
	}
    }	

    private class CatalogKBAction extends AbstractAction{

	public CatalogKBAction(){
	    super ("Concept Catalog");
	}

	public void actionPerformed(ActionEvent e){
	    (new ConceptAndMethodCatalogDlg(ome, false, ome, ome.getConceptMethodTree())).
		setVisible(true);
	}
    }		
	    
     /** Stores the neccessary information about a node in the project tree. 
     *  Currently we store the following information:
     *	    - the name of the node
     *	    - the absolute pathname of the corresponding file/directory
     *	    - the type of the node (ie whether it is a PROJECT or a MODEL).
     */
    private class ProjectNode extends DefaultMutableTreeNode{    
	private final String name;
	private final String path;
	private final int type;
	private Collection children; // only used for nodes of type PROJECT
	
	public ProjectNode (String name, String path, int type) {
	    super (name);
	    this.name = name;
	    this.path = path;	
	    this.type = type;
	    children = new Vector();
	}    

	public String getName() {
	    return name;
	}

	public String getAbsolutePath() {
	    return path;
	}

	public int getType() {
	    return type;
	}

	// only valid for nodes of type PROJECT
	public void addModel(String modelpath) {
	    if (type == PROJECT) {
		children.add(modelpath);
	    }
	}

	// only valid for nodes of type PROJECT
	public Collection getModels() {
	    return children;
	}
    }    

     
    /** A mouse listener for the project tree. Currently we are only looking
     *  out for mouse clicks over MODEL nodes. In this case a single-click
     *  "selects" the model and a double-click opens up the model.
     */
    private class ProjectTreeMouseListener extends MouseAdapter {
	
	public void mouseClicked(MouseEvent e) {
	    TreePath tp = projecttree.getPathForLocation(e.getX(),e.getY());	    	    
	    if (tp != null) {		    
		updateActionStatus();
		ProjectNode node = (ProjectNode)(tp.getLastPathComponent());
		if  (node.getType() == MODEL) {
		    if (e.getClickCount() == 2) {
			openModel(node.getAbsolutePath());
		    }		    
		} 
	    }
	}   
    }
    
}



