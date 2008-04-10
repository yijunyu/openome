package edu.toronto.cs.openome_model.versioning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import sc.document.Component;
import sc.document.Configuration;
import sc.document.GoalModel;
import edu.toronto.cs.openome_model.*;
import edu.toronto.cs.openome_model.presentation.openome_modelEditor;
import fluid.ir.IRNode;
import fluid.version.Version;

/**
 * 
 */

/**
 * @author Neil
 *
 */
public class MolhadoWorkspaceModifyOperation extends WorkspaceModifyOperation {

	private AdapterFactoryEditingDomain editingDomain;
	private MolhadoActions ma;
	private openome_modelEditor gme; //reference to caller

	//private Hashtable<String, Integer> versions = new Hashtable<String, Integer>();
	
	public MolhadoWorkspaceModifyOperation(openome_modelEditor gm, MolhadoActions ma, AdapterFactoryEditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		this.gme = gm;
		this.ma = ma;
		ma.setActionClass(gm);
	}

	protected MolhadoWorkspaceModifyOperation() {
		//default to give access for tests to various functions
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.actions.WorkspaceModifyOperation#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	// This is the method that gets invoked when the operation runs.
	//
	public void execute(IProgressMonitor monitor) {
		// Save the resources to the file system.
		// check in the changes
		try {
			IFileEditorInput modelFile = (IFileEditorInput) gme.getEditorInput();
			ma.setModelFile(modelFile);
			String project_name = modelFile.getFile().getProject().getName();
			Configuration config = ma.configurations.get(project_name);
			String model_name = modelFile.getFile().getName().toString();
			model_name = model_name.substring(0, model_name.indexOf(".oom"));
			ma.checkout_last_version(config, model_name); 
			Version.bumpVersion(); // Tien: important after check out if one wants to modify the mirror 
			String file_name = modelFile.getFile().getFullPath().toString();
			GoalModel the_gm = ma.find_the_gm(file_name, config);
			if (the_gm != null) {
				ma.updateIndex(the_gm, the_gm.getRoot());
				ma.modify_edited_goal_model(the_gm); 
			}
			ma.checkin_current_version(config, model_name);
			ma.checkOutAllVersionsFromRepository(config, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		old_do_save();
	}

	private void old_do_save() {
		boolean first = true;
		for(Resource resource: gme.getEditingDomain().getResourceSet().getResources()) {
			if ((first || !resource.getContents().isEmpty() || gme.isPersisted(resource))
					&& !gme.getEditingDomain().isReadOnly(resource)) {
				try {
					gme.savedResources.add(resource);
					resource.save(Collections.EMPTY_MAP);
				} catch (Exception exception) {
					gme.resourceToDiagnosticMap.put(resource, gme.analyzeResourceProblems(resource, exception));
				}
				first = false;
			}
		}
	}
}