package edu.toronto.cs.goalmodel.diagram.part;

import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.transaction.NotificationFilter;

import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.StorageDiagramDocumentProvider;

import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.window.Window;

import org.eclipse.osgi.util.NLS;

import org.eclipse.swt.widgets.Shell;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.dialogs.SaveAsDialog;

import org.eclipse.ui.ide.IGotoMarker;

import org.eclipse.ui.part.FileEditorInput;

/**
 * @generated
 */
public class GoalmodelDiagramEditor extends DiagramDocumentEditor implements
		IGotoMarker {

	/**
	 * @generated
	 */
	public static final String ID = "edu.toronto.cs.goalmodel.diagram.part.GoalmodelDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public GoalmodelDiagramEditor() {
		super(true);
	}

	/**
	 * @generated
	 */
	protected String getEditingDomainID() {
		return "edu.toronto.cs.goalmodel.diagram.EditingDomain"; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	protected TransactionalEditingDomain createEditingDomain() {
		TransactionalEditingDomain domain = super.createEditingDomain();
		domain.setID(getEditingDomainID());
		final NotificationFilter diagramResourceModifiedFilter = NotificationFilter
				.createNotifierFilter(domain.getResourceSet()).and(
						NotificationFilter
								.createEventTypeFilter(Notification.ADD)).and(
						NotificationFilter.createFeatureFilter(
								ResourceSet.class,
								ResourceSet.RESOURCE_SET__RESOURCES));
		domain.getResourceSet().eAdapters().add(new Adapter() {

			private Notifier myTarger;

			public Notifier getTarget() {
				return myTarger;
			}

			public boolean isAdapterForType(Object type) {
				return false;
			}

			public void notifyChanged(Notification notification) {
				if (diagramResourceModifiedFilter.matches(notification)) {
					Object value = notification.getNewValue();
					if (value instanceof Resource) {
						((Resource) value).setTrackingModification(true);
					}
				}
			}

			public void setTarget(Notifier newTarget) {
				myTarger = newTarget;
			}

		});

		return domain;
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new GoalmodelPaletteFactory().fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	protected PreferencesHint getPreferencesHint() {
		return GoalmodelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return GoalmodelDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	private String contentObjectURI;

	/**
	 * @generated
	 */
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput) {
			setDocumentProvider(new GoalmodelDocumentProvider(contentObjectURI));
		} else {
			setDocumentProvider(new StorageDiagramDocumentProvider());
		}
	}

	/**
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	/**
	 * @generated
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * @generated
	 */
	public void doSaveAs() {
		performSaveAs(new NullProgressMonitor());
	}

	/**
	 * @generated
	 */
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		Shell shell = getSite().getShell();
		IEditorInput input = getEditorInput();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input)
				.getFile()
				: null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();
		IDocumentProvider provider = getDocumentProvider();
		if (provider == null) {
			// editor has been programmatically closed while the dialog was open
			return;
		}
		if (provider.isDeleted(input) && original != null) {
			String message = NLS.bind(
					"The original file ''{0}'' has been deleted.", original
							.getName());
			dialog.setErrorMessage(null);
			dialog.setMessage(message, IMessageProvider.WARNING);
		}
		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IPath filePath = dialog.getResult();
		if (filePath == null) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(filePath);
		final IEditorInput newInput = new FileEditorInput(file);
		// Check if the editor is already open
		IEditorMatchingStrategy matchingStrategy = getEditorDescriptor()
				.getEditorMatchingStrategy();
		IEditorReference[] editorRefs = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matchingStrategy.matches(editorRefs[i], newInput)) {
				MessageDialog
						.openWarning(shell, "Problem During Save As...",
								"Save could not be completed. Target file is already open in another editor.");
				return;
			}
		}
		boolean success = false;
		try {
			provider.aboutToChange(newInput);
			getDocumentProvider(newInput).saveDocument(progressMonitor,
					newInput,
					getDocumentProvider().getDocument(getEditorInput()), true);
			success = true;
		} catch (CoreException x) {
			IStatus status = x.getStatus();
			if (status == null || status.getSeverity() != IStatus.CANCEL) {
				ErrorDialog.openError(shell, "Save Problems",
						"Could not save file.", x.getStatus());
			}
		} finally {
			provider.changed(newInput);
			if (success) {
				setInput(newInput);
			}
		}
		if (progressMonitor != null) {
			progressMonitor.setCanceled(!success);
		}
	}

}