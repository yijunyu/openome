package edu.toronto.cs.openome.conversion.convertor;

import java.io.IOException;

import org.eclipse.gef.EditPart;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

/**
 * Mostly copied from org.bflow.toolbox.export.ExportWizard
 * @author showzeb
 *
 */
@SuppressWarnings("restriction")
public class ExportWizard extends Wizard implements IExportWizard {

	private ExportWizardPage exportWizardPage;
	
	private IStructuredSelection selection;
	private IWorkspace w;
	private IProject project;

	@Override
	public boolean performFinish() {
		String targetFile = exportWizardPage.getTextFieldTargetFile().getText();
		
		if (exportWizardPage.insideSelected()) {
			w = ResourcesPlugin.getWorkspace();
	    	project = w.getRoot().getProject(exportWizardPage.projectName().replaceFirst("/", ""));
	    	targetFile = project.getLocation() + "/" + exportWizardPage.targetFileName().getText();
	    	System.out.println(targetFile);
		}
		if (targetFile.isEmpty()) {
			exportWizardPage.setMessage("No export file selected", WizardPage.ERROR);
			return false;
		}
		
		try {
			GoalModel_Q7 q7 = new GoalModel_Q7(((IFile)selection.getFirstElement()).getLocation().toFile().getCanonicalPath(),targetFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (exportWizardPage.insideSelected()) {
			try {
				project.refreshLocal(2, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
		this.setWindowTitle("Q7 Export Wizard");
		
		if (selection != null && !selection.isEmpty()) {
			
			this.selection = selection;
	    	
	    	Object obj = selection.getFirstElement();
	    	
	    	if (!(obj instanceof IFile)) {
	    		if(obj instanceof EditPart) {
	    			EditPart part = (EditPart)obj;
	    			
	    			IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	    			
	    			if (activeEditor != null) 
		            {
						if(activeEditor.isDirty())
							if(MessageDialog.openQuestion(activeEditor.getSite().getShell(), 
									"Model hasn't been saved!",
									"The selected model hasn't been saved yet. Save it now?"))
								activeEditor.getSite().getPage().saveEditor(activeEditor, false);
							else
								return ;							
						
		                IEditorInput input = activeEditor.getEditorInput();
		                if (input instanceof IFileEditorInput) 
		                {
		                	final IFile resource = ((IFileEditorInput) input).getFile();
		                	
		                	this.selection = new StructuredSelection(resource);			                	
		                }
		            }
	    		} else {
	    			MessageDialog.openInformation(workbench.getDisplay().getActiveShell(), 
							"No file selected!",
							"You have to select one file from your workspace at least!");

	    			return ;
	    		}
	    	}
		}
		
		exportWizardPage = new ExportWizardPage(this.selection);
		this.addPage(exportWizardPage);

	}

}
