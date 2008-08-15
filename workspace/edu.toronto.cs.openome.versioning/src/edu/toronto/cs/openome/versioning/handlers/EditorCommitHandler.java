package edu.toronto.cs.openome.versioning.handlers;

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
import edu.toronto.cs.openome_model.presentation.openome_modelEditor;
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
		    
			//NEIL: I am not sure why these three calls are necessary
		    // the molhado terminology: a config is assigned per folder (project). 
		    //Inside each config there is a set of files with each file holding a set of 'versions'. 
		    //So first we see what the latest version is, which  
		    //a) creates a new config with the project_name, and sets V=0 or; b) finds the latest version
		    
		    ma.checkLatestVersion(model_name, project_name, file_name, resourceSet);
			Configuration config = ma.configurations.get(project_name);  
			ma.checkout_last_version(config, model_name); 
			
			//Version.bumpVersion(); // Tien: important after check out if one wants to modify the mirror 
			GoalModel the_gm = ma.find_the_gm(file_name, config);
			//null the_gm implies ... no existing version of this model
			if (the_gm != null) {
				ma.updateIndex(the_gm, the_gm.getRoot());
				ma.modify_edited_goal_model(the_gm, gme); //algorithm 4
			}
			ma.checkin_current_version(config, model_name);
			//TODO why is this version 2 if there are no existing versions?
			MessageDialog.openConfirm(null, "Versioning successful", "Current model was stored as version: " + ma.getVersion(project_name, model_name, config));
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