package edu.toronto.cs.openome.versioning.handlers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import sc.document.Configuration;
import sc.document.GoalModel;
import sc.document.SCDirectory;
import edu.toronto.cs.openome_model.presentation.openome_modelEditor;
import fluid.ir.IRNode;
import fluid.ir.IRPersistent;
import fluid.util.FileLocator;
import fluid.version.Version;

public class EditorCommitHandler extends MolhadoActionHandler implements IHandler {

	openome_modelEditor gme; //override
	
	public EditorCommitHandler() {
		super(); //gets the MolhadoActions instance
	}
	
	/**
	 * Commit the model to the repository
	 * Possible states of the model on call: 
	 * 1) not a valid OpenOME model (oom file)
	 * 2) new model, never committed
	 * 3) existing model, commmitted before, not dirty
	 * 4) existing model, committed before, dirty
	 * 
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Save the resources to the file system.
		// check in the changes
		try {
			gme = (openome_modelEditor) findEditor();
			editingDomain = gme.getEditingDomain();
			setResourceSet();
			setModelDetails();
			super.setGME(gme);

		    //warn of unsaved changes... but we don't force it.
		    //gme.doSave(new ProgressMonitorDialog(getSite().getShell()).run(); defined in openomeModelEditor
		    if(isDirty())
		    	MessageDialog.openWarning(null, "Versioning warning", "Current editor has unsaved changes that will be lost");
		    
		    Configuration.ensureLoaded();
		    SCDirectory project_root = new SCDirectory();
		    project_root.setName(model_name);
		    Configuration config = new Configuration(model_name, project_root);
		    IRNode rootnode = config.getRoot();
		    fluid.tree.Tree tree = Configuration.getTree();
		    
		    GoalModel gm = new GoalModel();
		      gm.setName(model_name);
		    IRNode gm_node = config.newComponent(gm);
		    tree.appendChild(rootnode,gm_node);
		    
		    ma.buildGoalModel(gm, resourceSet);
		    
		    Version v1 = Version.getVersion();
		      Version.setVersion(v1);
		                  
		      // Store the version v1
		      final FileLocator floc = IRPersistent.fluidFileLocator;
		      config.assignVersionName(v1,"v1");
		      System.out.println("SAVING VERSION \"v1\" ...");
		      config.saveVersionByDelta(v1,floc);
		      
		      // Store the configuration in ASCII
		      System.out.println("Store the configuration ...");
		      config.storeASCII(new PrintWriter(
		         new BufferedWriter(new FileWriter(
		        		 System.getProperty("fluid.ir.path") + "/drproject.cfg"))));
		    //NEIL: I am not sure why these three calls are necessary
		    // the molhado terminology: a config is assigned per folder (project). 
		    //Inside each config there is a set of files with each file holding a set of 'versions'. 
		    //So first we see what the latest version is, which  
		    //a) creates a new config with the project_name, and sets V=0 or; b) finds the latest version
		    
		    /*ma.checkLatestVersion(model_name, project_name, file_name, resourceSet);
			Configuration config = ma.configurations.get(project_name);  
			ma.checkout_last_version(config, model_name); 
			
			Version.bumpVersion(); // Tien: important after check out if one wants to modify the mirror 
			GoalModel the_gm = ma.find_the_gm(file_name, config);
			//null the_gm implies ... no existing version of this model
			if (the_gm != null) {
				ma.updateIndex(the_gm, the_gm.getRoot());
				ma.modify_edited_goal_model(the_gm, gme); //algorithm 4
			}
			ma.checkin_current_version(config, model_name); */
			//TODO why is this version 2 if there are no existing versions? because the above call is also made in 'checkout_last_version'
			//MessageDialog.openConfirm(null, "Versioning successful", "Current model was stored as version: " + ma.getVersion(project_name, model_name, config));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/** 
	 * get the current EMF i* model elements for commit<br>
	 * set the various properties, file name &c.
	 * 
	 */
	private void setModelDetails() {
		modelFile = (IFileEditorInput) gme.getEditorInput(); 
		//is the editor dirty, that is, modified?
		project_name = modelFile.getFile().getProject().getName(); //is empty?
		model_name = modelFile.getFile().getName().toString();
		model_name = model_name.substring(0, model_name.indexOf(".oom"));
		file_name = modelFile.getFile().getFullPath().toString();
	}

}