package edu.toronto.cs.openome_model.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Openome_modelCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected edu.toronto.cs.openome_model.diagram.part.Openome_modelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected edu.toronto.cs.openome_model.diagram.part.Openome_modelCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelCreationWizardTitle);
		setDefaultPageImageDescriptor(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/Newopenome_modelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new edu.toronto.cs.openome_model.diagram.part.Openome_modelCreationWizardPage(
				"DiagramModelFile", getSelection(), "ood"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new edu.toronto.cs.openome_model.diagram.part.Openome_modelCreationWizardPage(
				"DomainModelFile", getSelection(), "oom") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".ood".length()); //$NON-NLS-1$
					setFileName(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "oom")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
