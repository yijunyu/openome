/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.presentation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;

import sc.document.Component;
import sc.document.Configuration;
import sc.document.GoalModel;
import sc.document.SCDirectory;
import edu.toronto.cs.goalmodel.AndDecomposition;
import edu.toronto.cs.goalmodel.BreakContribution;
import edu.toronto.cs.goalmodel.Contribution;
import edu.toronto.cs.goalmodel.Decomposition;
import edu.toronto.cs.goalmodel.Goal;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.HelpContribution;
import edu.toronto.cs.goalmodel.HurtContribution;
import edu.toronto.cs.goalmodel.Intention;
import edu.toronto.cs.goalmodel.MakeContribution;
import edu.toronto.cs.goalmodel.Model;
import edu.toronto.cs.goalmodel.OrDecomposition;
import edu.toronto.cs.goalmodel.Softgoal;
import edu.toronto.cs.goalmodel.provider.GoalmodelItemProviderAdapterFactory;
import fluid.ir.IRNode;
import fluid.ir.IRPersistent;
import fluid.version.Version;

/**
 * This is an example of a Goalmodel model editor. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class GoalmodelEditor extends MultiPageEditorPart implements
		IEditingDomainProvider, ISelectionProvider, IMenuListener,
		IViewerProvider, IGotoMarker {
	/**
	 * This keeps track of the editing domain that is used to track all changes
	 * to the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AdapterFactoryEditingDomain editingDomain;

	/**
	 * This is the one adapter factory used for providing views of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory adapterFactory;

	/**
	 * This is the content outline page. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IContentOutlinePage contentOutlinePage;

	/**
	 * This is a kludge... <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStatusLineManager contentOutlineStatusLineManager;

	/**
	 * This is the content outline page's viewer. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer contentOutlineViewer;

	/**
	 * This is the property sheet page. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertySheetPage propertySheetPage;

	/**
	 * This is the viewer that shadows the selection in the content outline. The
	 * parent relation must be correctly defined for this to work. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer selectionViewer;

	/**
	 * This inverts the roll of parent and child in the content provider and
	 * show parents as a tree. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer parentViewer;

	/**
	 * This shows how a tree view works. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer treeViewer;

	/**
	 * This shows how a list view works. A list viewer doesn't support icons.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ListViewer listViewer;

	/**
	 * This shows how a table view works. A table can be used as a list with
	 * icons. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TableViewer tableViewer;

	/**
	 * This shows how a tree view with columns works. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer treeViewerWithColumns;

	/**
	 * This keeps track of the active viewer pane, in the book. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ViewerPane currentViewerPane;

	/**
	 * This keeps track of the active content viewer, which may be either one of
	 * the viewers in the pages or the content outline viewer. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Viewer currentViewer;

	/**
	 * This listens to which ever viewer is active. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ISelectionChangedListener selectionChangedListener;

	/**
	 * This keeps track of all the
	 * {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are
	 * listening to this editor. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection selectionChangedListeners = new ArrayList();

	/**
	 * This keeps track of the selection of the editor as a whole. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ISelection editorSelection = StructuredSelection.EMPTY;

	/**
	 * The MarkerHelper is responsible for creating workspace resource markers
	 * presented in Eclipse's Problems View. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected MarkerHelper markerHelper = new EditUIMarkerHelper();

	/**
	 * This listens for when the outline becomes active <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart p) {
			if (p instanceof ContentOutline) {
				if (((ContentOutline) p).getCurrentPage() == contentOutlinePage) {
					getActionBarContributor().setActiveEditor(
							GoalmodelEditor.this);

					setCurrentViewer(contentOutlineViewer);
				}
			} else if (p instanceof PropertySheet) {
				if (((PropertySheet) p).getCurrentPage() == propertySheetPage) {
					getActionBarContributor().setActiveEditor(
							GoalmodelEditor.this);
					handleActivate();
				}
			} else if (p == GoalmodelEditor.this) {
				handleActivate();
			}
		}

		public void partBroughtToTop(IWorkbenchPart p) {
		}

		public void partClosed(IWorkbenchPart p) {
		}

		public void partDeactivated(IWorkbenchPart p) {
		}

		public void partOpened(IWorkbenchPart p) {
		}
	};

	/**
	 * Resources that have been removed since last activation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection removedResources = new ArrayList();

	/**
	 * Resources that have been changed since last activation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection changedResources = new ArrayList();

	/**
	 * Resources that have been saved. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected Collection savedResources = new ArrayList();

	/**
	 * Map to store the diagnostic associated with a resource. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map resourceToDiagnosticMap = new LinkedHashMap();

	/**
	 * Controls whether the problem indication should be updated. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean updateProblemIndication = true;

	/**
	 * Adapter used to update the problem indication when resources are demanded
	 * loaded. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EContentAdapter problemIndicationAdapter = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof Resource) {
				switch (notification.getFeatureID(Resource.class)) {
				case Resource.RESOURCE__IS_LOADED:
				case Resource.RESOURCE__ERRORS:
				case Resource.RESOURCE__WARNINGS: {
					Resource resource = (Resource) notification.getNotifier();
					Diagnostic diagnostic = analyzeResourceProblems(
							(Resource) notification.getNotifier(), null);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						resourceToDiagnosticMap.put(resource, diagnostic);
					} else {
						resourceToDiagnosticMap.remove(resource);
					}

					if (updateProblemIndication) {
						getSite().getShell().getDisplay().asyncExec(
								new Runnable() {
									public void run() {
										updateProblemIndication();
									}
								});
					}
				}
				}
			} else {
				super.notifyChanged(notification);
			}
		}

		protected void setTarget(Resource target) {
			basicSetTarget(target);
		}

		protected void unsetTarget(Resource target) {
			basicUnsetTarget(target);
		}
	};

	/**
	 * This listens for workspace changes. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {
		public void resourceChanged(IResourceChangeEvent event) {
			// Only listening to these.
			// if (event.getType() == IResourceDelta.CHANGED)
			{
				IResourceDelta delta = event.getDelta();
				try {
					class ResourceDeltaVisitor implements IResourceDeltaVisitor {
						protected ResourceSet resourceSet = editingDomain
								.getResourceSet();

						protected Collection changedResources = new ArrayList();

						protected Collection removedResources = new ArrayList();

						public boolean visit(IResourceDelta delta) {
							if (delta.getFlags() != IResourceDelta.MARKERS
									&& delta.getResource().getType() == IResource.FILE) {
								if ((delta.getKind() & (IResourceDelta.CHANGED | IResourceDelta.REMOVED)) != 0) {
									String filename = ((IFileEditorInput) getEditorInput())
											.getFile().getFullPath().toString();
									Resource resource = resourceSet
											.getResource(URI
													.createURI(filename), false);
									if (resource != null) {
										if ((delta.getKind() & IResourceDelta.REMOVED) != 0) {
											removedResources.add(resource);
										} else if (!savedResources
												.remove(resource)) {
											changedResources.add(resource);
										}
									}
								}
							}

							return true;
						}

						public Collection getChangedResources() {
							return changedResources;
						}

						public Collection getRemovedResources() {
							return removedResources;
						}
					}

					ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
					delta.accept(visitor);

					if (!visitor.getRemovedResources().isEmpty()) {
						removedResources.addAll(visitor.getRemovedResources());
						if (!isDirty()) {
							getSite().getShell().getDisplay().asyncExec(
									new Runnable() {
										public void run() {
											getSite()
													.getPage()
													.closeEditor(
															GoalmodelEditor.this,
															false);
											GoalmodelEditor.this.dispose();
										}
									});
						}
					}

					if (!visitor.getChangedResources().isEmpty()) {
						changedResources.addAll(visitor.getChangedResources());
						if (getSite().getPage().getActiveEditor() == GoalmodelEditor.this) {
							getSite().getShell().getDisplay().asyncExec(
									new Runnable() {
										public void run() {
											handleActivate();
										}
									});
						}
					}
				} catch (CoreException exception) {
					GoalmodelEditorPlugin.INSTANCE.log(exception);
				}
			}
		}

	};

	private Hashtable<String, Integer> versions = new Hashtable<String, Integer>();

	/**
	 * Handles activation of the editor or it's associated views. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if (editingDomain.getResourceToReadOnlyMap() != null) {
			editingDomain.getResourceToReadOnlyMap().clear();

			// Refresh any actions that may become enabled or disabled.
			//
			setSelection(getSelection());
		}

		if (!removedResources.isEmpty()) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(GoalmodelEditor.this, false);
				GoalmodelEditor.this.dispose();
			} else {
				removedResources.clear();
				changedResources.clear();
				savedResources.clear();
			}
		} else if (!changedResources.isEmpty()) {
			changedResources.removeAll(savedResources);
			handleChangedResources();
			changedResources.clear();
			savedResources.clear();
		}
	}

	/**
	 * Handles what to do with changed resources on activation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void handleChangedResources() {
		if (!changedResources.isEmpty()
				&& (!isDirty() || handleDirtyConflict())) {
			editingDomain.getCommandStack().flush();

			updateProblemIndication = false;
			for (Iterator i = changedResources.iterator(); i.hasNext();) {
				Resource resource = (Resource) i.next();
				if (resource.isLoaded()) {
					resource.unload();
					try {
						resource.load(Collections.EMPTY_MAP);
					} catch (IOException exception) {
						if (!resourceToDiagnosticMap.containsKey(resource)) {
							resourceToDiagnosticMap
									.put(resource, analyzeResourceProblems(
											resource, exception));
						}
					}
				}
			}
			updateProblemIndication = true;
			updateProblemIndication();
		}
	}

	/**
	 * Updates the problems indication with the information described in the
	 * specified diagnostic. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void updateProblemIndication() {
		if (updateProblemIndication) {
			BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.OK,
					"edu.toronto.cs.goalmodel.editor", 0, null,
					new Object[] { editingDomain.getResourceSet() });
			for (Iterator i = resourceToDiagnosticMap.values().iterator(); i
					.hasNext();) {
				Diagnostic childDiagnostic = (Diagnostic) i.next();
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
				}
			}

			int lastEditorPage = getPageCount() - 1;
			if (lastEditorPage >= 0
					&& getEditor(lastEditorPage) instanceof ProblemEditorPart) {
				((ProblemEditorPart) getEditor(lastEditorPage))
						.setDiagnostic(diagnostic);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					setActivePage(lastEditorPage);
				}
			} else if (diagnostic.getSeverity() != Diagnostic.OK) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic(diagnostic);
				problemEditorPart.setMarkerHelper(markerHelper);
				try {
					addPage(++lastEditorPage, problemEditorPart,
							getEditorInput());
					setPageText(lastEditorPage, problemEditorPart.getPartName());
					setActivePage(lastEditorPage);
					showTabs();
				} catch (PartInitException exception) {
					GoalmodelEditorPlugin.INSTANCE.log(exception);
				}
			}

			if (markerHelper.hasMarkers(editingDomain.getResourceSet())) {
				markerHelper.deleteMarkers(editingDomain.getResourceSet());
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					try {
						markerHelper.createMarkers(diagnostic);
					} catch (CoreException exception) {
						GoalmodelEditorPlugin.INSTANCE.log(exception);
					}
				}
			}
		}
	}

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean handleDirtyConflict() {
		return MessageDialog.openQuestion(getSite().getShell(),
				getString("_UI_FileConflict_label"),
				getString("_WARN_FileConflict"));
	}

	/**
	 * This creates a model editor. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public GoalmodelEditor() {
		super();

		// Create an adapter factory that yields item providers.
		//
		List factories = new ArrayList();
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new GoalmodelItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());

		adapterFactory = new ComposedAdapterFactory(factories);

		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {
					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ((CommandStack) event
								.getSource()).getMostRecentCommand();
						if (mostRecentCommand != null) {
							setSelectionToViewer(mostRecentCommand
									.getAffectedObjects());
						}
						if (propertySheetPage != null
								&& !propertySheetPage.getControl().isDisposed()) {
							propertySheetPage.refresh();
						}
					}
				});
			}
		});

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, new HashMap());
	}

	/**
	 * This is here for the listener to be able to call it. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void firePropertyChange(int action) {
		super.firePropertyChange(action);
	}

	/**
	 * This sets the selection into whichever viewer is active. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSelectionToViewer(Collection collection) {
		final Collection theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			// I don't know if this should be run this deferred
			// because we might have to give the editor a chance to process the
			// viewer update events
			// and hence to update the views first.
			//
			//
			Runnable runnable = new Runnable() {
				public void run() {
					// Try to select the items in the current content viewer of
					// the editor.
					//
					if (currentViewer != null) {
						currentViewer.setSelection(new StructuredSelection(
								theSelection.toArray()), true);
					}
				}
			};
			runnable.run();
		}
	}

	/**
	 * This returns the editing domain as required by the
	 * {@link IEditingDomainProvider} interface. This is important for
	 * implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class ReverseAdapterFactoryContentProvider extends
			AdapterFactoryContentProvider {
		public ReverseAdapterFactoryContentProvider(
				AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		public Object[] getElements(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections
					.singleton(parent)).toArray();
		}

		public Object[] getChildren(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections
					.singleton(parent)).toArray();
		}

		public boolean hasChildren(Object object) {
			Object parent = super.getParent(object);
			return parent != null;
		}

		public Object getParent(Object object) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCurrentViewerPane(ViewerPane viewerPane) {
		if (currentViewerPane != viewerPane) {
			if (currentViewerPane != null) {
				currentViewerPane.showFocus(false);
			}
			currentViewerPane = viewerPane;
		}
		setCurrentViewer(currentViewerPane.getViewer());
	}

	/**
	 * This makes sure that one content viewer, either for the current page or
	 * the outline view, if it has focus, is the current one. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCurrentViewer(Viewer viewer) {
		// If it is changing...
		//
		if (currentViewer != viewer) {
			if (selectionChangedListener == null) {
				// Create the listener on demand.
				//
				selectionChangedListener = new ISelectionChangedListener() {
					// This just notifies those things that are affected by the
					// section.
					//
					public void selectionChanged(
							SelectionChangedEvent selectionChangedEvent) {
						setSelection(selectionChangedEvent.getSelection());
					}
				};
			}

			// Stop listening to the old one.
			//
			if (currentViewer != null) {
				currentViewer
						.removeSelectionChangedListener(selectionChangedListener);
			}

			// Start listening to the new one.
			//
			if (viewer != null) {
				viewer.addSelectionChangedListener(selectionChangedListener);
			}

			// Remember it.
			//
			currentViewer = viewer;

			// Set the editors selection based on the current viewer's
			// selection.
			//
			setSelection(currentViewer == null ? StructuredSelection.EMPTY
					: currentViewer.getSelection());
		}
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider}
	 * interface. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well
	 * registering the menu for extension. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, viewer);

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(
				viewer));
		viewer.addDropSupport(dndOperations, transfers,
				new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}

	/**
	 * This is the method called to load a resource into the editing domain's
	 * resource set based on the editor's input. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void createModel() {
		// Assumes that the input is a file object.
		//
		IFileEditorInput modelFile = (IFileEditorInput) getEditorInput();
		URI resourceURI = URI.createPlatformResourceURI(modelFile.getFile()
				.getFullPath().toString());
		;
		Exception exception = null;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					true);
		} catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource, analyzeResourceProblems(
					resource, exception));
		}
		editingDomain.getResourceSet().eAdapters()
				.add(problemIndicationAdapter);
		// Yijun Yu: The following are not generated:
		checkLatestVersion(modelFile);
	}

	/**
	 * If the model is opened for the first time, it will be assigned version 0
	 * and will be checked in and then checked out before the doSave operation.
	 * Otherwise, the model is assigned a newer version and will then checked
	 * out before the doSave operation.
	 * 
	 * Tien, I don't know if that's correct though: one must assume that the
	 * model can be changed outside the editor! ). Alternatively we may
	 * implement a checkout for an existing goal model Vn rather than parse it
	 * from the EMF file, and such a goal model will be saved to override the v0
	 * model, but it does not work yet :-(
	 * 
	 * @param model_name
	 */
	private void checkLatestVersion(IFileEditorInput modelFile) {
		String file_name = modelFile.getFile().getFullPath().toString();
		String project_name = modelFile.getFile().getProject().getName();
		String model_name = get_model_name(modelFile);
		try {
			int versionNumber = 0;
			Configuration config = Configuration.loadASCII(new FileReader(
					System.getProperty("fluid.ir.path") + "/" + project_name
							+ ".cfg"), IRPersistent.fluidFileLocator);
			java.util.Enumeration vs = config.getAllVersionNames();
			while (vs.hasMoreElements()) {
				String v1_name = (String) vs.nextElement();
				if (v1_name.substring(0, v1_name.lastIndexOf("-")).equals(
						model_name)) {
					versionNumber++;
				}
			}
			configurations.put(project_name, config);
			if (versionNumber == 0) {
				checkInGoalModel(modelFile, config);
				update_version(model_name, 1);
			} else
				update_version(model_name, versionNumber);
		} catch (Exception e) {
			SCDirectory project_root = connectToRepository(file_name);
			Configuration config = new Configuration(project_name, project_root);
			// create a new goal model and check it in
			checkInGoalModel(modelFile, config);
			configurations.put(project_name, config);
			update_version(model_name, 1);
		}
	}

	private void update_version(String model_name, int versionNumber) {
		versions.put(model_name, new Integer(versionNumber));
		// System.err.println(model_name + " = " + versionNumber);
	}

	private String get_model_name(IFileEditorInput modelFile) {
		String model_name = modelFile.getFile().getName().toString();
		model_name = model_name.substring(0, model_name.indexOf(".goalmodel"));
		return model_name;
	}

	private SCDirectory connectToRepository(String model_name) {
		Configuration.ensureLoaded();
		SCDirectory root = new SCDirectory();
		root.setName(model_name);
		return root;
	}

	private void checkInGoalModel(IFileEditorInput modelFile,
			Configuration config) {
		IRNode rootnode = config.getRoot();
		fluid.tree.Tree tree = Configuration.getTree();
		// Create a goal model
		String file_name = modelFile.getFile().getFullPath().toString();
		String model_name = modelFile.getFile().getName().toString();
		model_name = model_name.substring(0, model_name.indexOf(".goalmodel"));
		GoalModel gm = new GoalModel();
		gm.setName(file_name);
		IRNode gm_node = config.newComponent(gm);
		tree.appendChild(rootnode, gm_node);
		buildGoalModel(gm);
		checkin_current_version(config, model_name);
	}

	Hashtable<String, Intention> nodes;

	/*
	 * nodes will be populated
	 */
	private void traverseGMResourcesForNodes(GoalModel gm, GoalmodelFactory f,
			Model m, IRNode root, IRNode edgenode) {
		if (root == null)
			return;
		String name = gm.getGMNodeName(root);
		String prefix = name.substring(0, name.indexOf("_"));
		Intention g;
		if (prefix.equals("HardGoal"))
			g = f.createGoal();
		else
			g = f.createSoftgoal();
		name = name.substring(name.indexOf("_") + 1);
		g.setName(name);
		m.getIntentions().add(g);
		nodes.put(name, g);
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode childedgenode = gm.graph.getChildEdge(root, i);
			IRNode childnode = gm.graph.getChild(root, i);
			traverseGMResourcesForNodes(gm, f, m, childnode, childedgenode);
		}
	}

	/**
	 * nodes will be used
	 * 
	 * @param gm
	 * @param f
	 * @param m
	 * @param root
	 * @param edgenode
	 */
	private void traverseGMResourcesForEdges(GoalModel gm, GoalmodelFactory f,
			Model m, IRNode root, IRNode edgenode) {
		if (root == null)
			return;
		String name = gm.getGMNodeName(root);
		String prefix = name.substring(0, name.indexOf("_"));
		name = name.substring(name.indexOf("_") + 1);
		Intention g = nodes.get(name);
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode childedgenode = gm.graph.getChildEdge(root, i);
			IRNode childnode = gm.graph.getChild(root, i);
			String namec = gm.getGMNodeName(childnode);
			namec = namec.substring(namec.indexOf("_") + 1);
			Intention gc = nodes.get(namec);
			if (childedgenode != null) {
				String edgetype = gm.getGMNodeName(childedgenode);
				String pre = edgetype.substring(edgetype.indexOf("_") + 1);
				if (pre.equals("AND")) {
					AndDecomposition d = f.createAndDecomposition();
					d.setSource(g);
					d.setTarget(gc);
					m.getDecompositions().add(d);
				} else if (pre.equals("OR")) {
					OrDecomposition d = f.createOrDecomposition();
					d.setSource(g);
					d.setTarget(gc);
					m.getDecompositions().add(d);
				} else if (pre.equals("+")) {
					HelpContribution d = f.createHelpContribution();
					d.setSource(g);
					d.setTarget(gc);
					m.getContributions().add(d);
				} else if (pre.equals("++")) {
					MakeContribution d = f.createMakeContribution();
					d.setSource(g);
					d.setTarget(gc);
					m.getContributions().add(d);
				} else if (pre.equals("-")) {
					HurtContribution d = f.createHurtContribution();
					d.setSource(g);
					d.setTarget(gc);
					m.getContributions().add(d);
				} else if (pre.equals("--")) {
					BreakContribution d = f.createBreakContribution();
					d.setSource(g);
					d.setTarget(gc);
					m.getContributions().add(d);
				}
			}
			traverseGMResourcesForEdges(gm, f, m, childnode, childedgenode);
		}
	}

	private void checkout_last_version(Configuration config, String model_name) {
		Integer last = versions.get(model_name);
		if (last != null) {
			String last_version = model_name + "-v" + last.intValue();
			checkout_version(config, last_version);
		} else {
			System.err
					.println("expecting to have an initial version number for the configuration "
							+ config);
		}
	}

	private void checkout_version(Configuration config, String v1_name) {
		try {
			Version v1 = config.loadVersionByDelta(v1_name,
					IRPersistent.fluidFileLocator);
			Version.setVersion(v1);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void checkin_current_version(Configuration config, String model_name) {
		Version v1 = Version.getVersion();
		Version.setVersion(v1);
		try {
			incrementVersion(config, v1, model_name);
			config.saveVersionByDelta(v1, IRPersistent.fluidFileLocator);
			config.storeASCII(new PrintWriter(new BufferedWriter(
					new FileWriter(System.getProperty("fluid.ir.path") + "/"
							+ config.getName() + ".cfg"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void incrementVersion(Configuration config, Version v1,
			String model_name) {
		if (versions.get(model_name) == null) {
			update_version(model_name, 0);
		}
		int versionNumber = versions.get(model_name).intValue() + 1;
		update_version(model_name, versionNumber);
		String v1_name = model_name + "-v" + versionNumber;
		config.assignVersionName(v1, v1_name);
		// System.err.println("Saving " + v1_name);
	}

	private void unparse_checkout_into_emf(Configuration config,
			String v1_name, fluid.tree.Tree project_tree, IRNode project_root) {
		java.util.Enumeration en = project_tree.depthFirstSearch(project_root);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		while (en.hasMoreElements()) {
			IRNode node = (IRNode) en.nextElement();
			Component comp = config.getComponent(node);
			if (comp instanceof GoalModel) {
				GoalModel gm = (GoalModel) comp;
				String name = gm.getName();
				name = name.substring(0, name.indexOf(".goalmodel"));
				v1_name = v1_name.substring(v1_name.lastIndexOf("-") + 1);
				String model_v1 = name + "-" + v1_name + ".goalmodel";
				URI uri = fetchURI(model_v1);
				Resource resource = resourceSet.createResource(uri);
				Model m = f.createModel();
				try {
					IRNode root = gm.getRoot();
					nodes = new Hashtable<String, Intention>();
					traverseGMResourcesForNodes(gm, f, m, root, null);
					traverseGMResourcesForEdges(gm, f, m, root, null);
					resource.getContents().add(m);
					resource.save(Collections.EMPTY_MAP);
					resource.unload();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	Hashtable<GoalModel, Hashtable<String, IRNode>> tables = new Hashtable<GoalModel, Hashtable<String, IRNode>>();

	private void buildGoalModel(GoalModel gm) {
		Hashtable<String, IRNode> table = new Hashtable<String, IRNode>();
		tables.put(gm, table);
		// the first pass creates nodes
		for (TreeIterator r = editingDomain.getResourceSet().getAllContents(); r
				.hasNext();) {
			Object o = r.next();
			if (o instanceof Intention) {
				Intention i = (Intention) o;
				String name = i.getName();
				IRNode g = gm.createAGoal(name, o instanceof Goal);
				if (i.getParentDecompositions().size() == 0
						&& o instanceof Goal) {
					// root
					gm.setRoot(g);
				}
				// System.out.println(name + " " + g);
				table.put(name, g);
			}
		}
		// the second pass creates edges
		for (TreeIterator r = editingDomain.getResourceSet().getAllContents(); r
				.hasNext();) {
			Object o = r.next();
			if (o instanceof Contribution) {
				Contribution i = (Contribution) o;
				if (i.getSource()==null || i.getTarget()==null)
					continue;
				String source_name = i.getSource().getName();
				String target_name = i.getTarget().getName();
				String label = "";
				if (o instanceof HelpContribution)
					label = "+";
				if (o instanceof MakeContribution)
					label = "++";
				if (o instanceof HurtContribution)
					label = "-";
				if (o instanceof BreakContribution)
					label = "--";
				IRNode e = gm.createEdge(label);
				IRNode source = table.get(source_name);
				IRNode target = table.get(target_name);
				gm.connect(source, target, e);
				// System.out.println(label);
			}
			if (o instanceof Decomposition) {
				Decomposition i = (Decomposition) o;
				if (i.getSource()==null || i.getTarget()==null)
					continue;
				String source_name = i.getSource().getName();
				String target_name = i.getTarget().getName();
				String label = "";
				if (o instanceof AndDecomposition)
					label = "AND";
				if (o instanceof OrDecomposition)
					label = "OR";
				IRNode e = gm.createEdge(label);
				IRNode source = table.get(source_name);
				IRNode target = table.get(target_name);
				gm.connect(source, target, e);
				// System.out.println(label);
			}
		}
	}

	/**
	 * We need to make sure after checkout, the mapping table between goal names
	 * and goals in the GoalModel is updated
	 * 
	 * @param gm
	 */
	private void updateIndex(GoalModel gm, IRNode root) {
		if (root == null)
			return;
		String name = gm.getGMNodeName(root);
		name = name.substring(name.indexOf("_") + 1);
		Hashtable<String, IRNode> table = tables.get(gm);
		if (table == null) {
			table = new Hashtable<String, IRNode>();
			tables.put(gm, table);
		}
		table.put(name, root);
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode childnode = gm.graph.getChild(root, i);
			updateIndex(gm, childnode);
		}
	}

	/**
	 * Returns a dignostic describing the errors and warnings listed in the
	 * resource and the specified exception (if any). <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Diagnostic analyzeResourceProblems(Resource resource,
			Exception exception) {
		if (!resource.getErrors().isEmpty()
				|| !resource.getWarnings().isEmpty()) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(
					Diagnostic.ERROR,
					"edu.toronto.cs.goalmodel.editor",
					0,
					getString("_UI_CreateModelError_message", resource.getURI()),
					new Object[] { exception == null ? (Object) resource
							: exception });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		} else if (exception != null) {
			return new BasicDiagnostic(Diagnostic.ERROR,
					"edu.toronto.cs.goalmodel.editor", 0, getString(
							"_UI_CreateModelError_message", resource.getURI()),
					new Object[] { exception });
		} else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();

		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()
				&& !((Resource) getEditingDomain().getResourceSet()
						.getResources().get(0)).getContents().isEmpty()) {
			// Create a page for the selection tree view.
			//
			{
				ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
						GoalmodelEditor.this) {
					public Viewer createViewer(Composite composite) {
						Tree tree = new Tree(composite, SWT.MULTI);
						TreeViewer newTreeViewer = new TreeViewer(tree);
						return newTreeViewer;
					}

					public void requestActivation() {
						super.requestActivation();
						setCurrentViewerPane(this);
					}
				};
				viewerPane.createControl(getContainer());

				selectionViewer = (TreeViewer) viewerPane.getViewer();
				selectionViewer
						.setContentProvider(new AdapterFactoryContentProvider(
								adapterFactory));

				selectionViewer
						.setLabelProvider(new AdapterFactoryLabelProvider(
								adapterFactory));
				selectionViewer.setInput(editingDomain.getResourceSet());
				viewerPane.setTitle(editingDomain.getResourceSet());

				new AdapterFactoryTreeEditor(selectionViewer.getTree(),
						adapterFactory);

				createContextMenuFor(selectionViewer);
				int pageIndex = addPage(viewerPane.getControl());
				setPageText(pageIndex, getString("_UI_SelectionPage_label"));
			}

			// Create a page for the parent tree view.
			//
			{
				ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
						GoalmodelEditor.this) {
					public Viewer createViewer(Composite composite) {
						Tree tree = new Tree(composite, SWT.MULTI);
						TreeViewer newTreeViewer = new TreeViewer(tree);
						return newTreeViewer;
					}

					public void requestActivation() {
						super.requestActivation();
						setCurrentViewerPane(this);
					}
				};
				viewerPane.createControl(getContainer());

				parentViewer = (TreeViewer) viewerPane.getViewer();
				parentViewer.setAutoExpandLevel(30);
				parentViewer
						.setContentProvider(new ReverseAdapterFactoryContentProvider(
								adapterFactory));
				parentViewer.setLabelProvider(new AdapterFactoryLabelProvider(
						adapterFactory));

				createContextMenuFor(parentViewer);
				int pageIndex = addPage(viewerPane.getControl());
				setPageText(pageIndex, getString("_UI_ParentPage_label"));
			}

			// This is the page for the list viewer
			//
			{
				ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
						GoalmodelEditor.this) {
					public Viewer createViewer(Composite composite) {
						return new ListViewer(composite);
					}

					public void requestActivation() {
						super.requestActivation();
						setCurrentViewerPane(this);
					}
				};
				viewerPane.createControl(getContainer());
				listViewer = (ListViewer) viewerPane.getViewer();
				listViewer
						.setContentProvider(new AdapterFactoryContentProvider(
								adapterFactory));
				listViewer.setLabelProvider(new AdapterFactoryLabelProvider(
						adapterFactory));

				createContextMenuFor(listViewer);
				int pageIndex = addPage(viewerPane.getControl());
				setPageText(pageIndex, getString("_UI_ListPage_label"));
			}

			// This is the page for the tree viewer
			//
			{
				ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
						GoalmodelEditor.this) {
					public Viewer createViewer(Composite composite) {
						return new TreeViewer(composite);
					}

					public void requestActivation() {
						super.requestActivation();
						setCurrentViewerPane(this);
					}
				};
				viewerPane.createControl(getContainer());
				treeViewer = (TreeViewer) viewerPane.getViewer();
				treeViewer
						.setContentProvider(new AdapterFactoryContentProvider(
								adapterFactory));
				treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(
						adapterFactory));

				new AdapterFactoryTreeEditor(treeViewer.getTree(),
						adapterFactory);

				createContextMenuFor(treeViewer);
				int pageIndex = addPage(viewerPane.getControl());
				setPageText(pageIndex, getString("_UI_TreePage_label"));
			}

			// This is the page for the table viewer.
			//
			{
				ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
						GoalmodelEditor.this) {
					public Viewer createViewer(Composite composite) {
						return new TableViewer(composite);
					}

					public void requestActivation() {
						super.requestActivation();
						setCurrentViewerPane(this);
					}
				};
				viewerPane.createControl(getContainer());
				tableViewer = (TableViewer) viewerPane.getViewer();

				Table table = tableViewer.getTable();
				TableLayout layout = new TableLayout();
				table.setLayout(layout);
				table.setHeaderVisible(true);
				table.setLinesVisible(true);

				TableColumn objectColumn = new TableColumn(table, SWT.NONE);
				layout.addColumnData(new ColumnWeightData(3, 100, true));
				objectColumn.setText(getString("_UI_ObjectColumn_label"));
				objectColumn.setResizable(true);

				TableColumn selfColumn = new TableColumn(table, SWT.NONE);
				layout.addColumnData(new ColumnWeightData(2, 100, true));
				selfColumn.setText(getString("_UI_SelfColumn_label"));
				selfColumn.setResizable(true);

				tableViewer.setColumnProperties(new String[] { "a", "b" });
				tableViewer
						.setContentProvider(new AdapterFactoryContentProvider(
								adapterFactory));
				tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(
						adapterFactory));

				createContextMenuFor(tableViewer);
				int pageIndex = addPage(viewerPane.getControl());
				setPageText(pageIndex, getString("_UI_TablePage_label"));
			}

			// This is the page for the table tree viewer.
			//
			{
				ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
						GoalmodelEditor.this) {
					public Viewer createViewer(Composite composite) {
						return new TreeViewer(composite);
					}

					public void requestActivation() {
						super.requestActivation();
						setCurrentViewerPane(this);
					}
				};
				viewerPane.createControl(getContainer());

				treeViewerWithColumns = (TreeViewer) viewerPane.getViewer();

				Tree tree = treeViewerWithColumns.getTree();
				tree.setLayoutData(new FillLayout());
				tree.setHeaderVisible(true);
				tree.setLinesVisible(true);

				TreeColumn objectColumn = new TreeColumn(tree, SWT.NONE);
				objectColumn.setText(getString("_UI_ObjectColumn_label"));
				objectColumn.setResizable(true);
				objectColumn.setWidth(250);

				TreeColumn selfColumn = new TreeColumn(tree, SWT.NONE);
				selfColumn.setText(getString("_UI_SelfColumn_label"));
				selfColumn.setResizable(true);
				selfColumn.setWidth(200);

				treeViewerWithColumns.setColumnProperties(new String[] { "a",
						"b" });
				treeViewerWithColumns
						.setContentProvider(new AdapterFactoryContentProvider(
								adapterFactory));
				treeViewerWithColumns
						.setLabelProvider(new AdapterFactoryLabelProvider(
								adapterFactory));

				createContextMenuFor(treeViewerWithColumns);
				int pageIndex = addPage(viewerPane.getControl());
				setPageText(pageIndex,
						getString("_UI_TreeWithColumnsPage_label"));
			}

			setActivePage(0);
		}

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {
			boolean guard = false;

			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		updateProblemIndication();
	}

	/**
	 * If there is just one page in the multi-page editor part, this hides the
	 * single tab at the bottom. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void hideTabs() {
		if (getPageCount() <= 1) {
			setPageText(0, "");
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(1);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y + 6);
			}
		}
	}

	/**
	 * If there is more than one page in the multi-page editor part, this shows
	 * the tabs at the bottom. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void showTabs() {
		if (getPageCount() > 1) {
			setPageText(0, getString("_UI_SelectionPage_label"));
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(SWT.DEFAULT);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y - 6);
			}
		}
	}

	/**
	 * This is used to track the active viewer. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void pageChange(int pageIndex) {
		super.pageChange(pageIndex);

		if (contentOutlinePage != null) {
			handleContentOutlineSelection(contentOutlinePage.getSelection());
		}
	}

	/**
	 * This is how the framework determines which interfaces we implement. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object getAdapter(Class key) {
		if (key.equals(IContentOutlinePage.class)) {
			return showOutlineView() ? getContentOutlinePage() : null;
		} else if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		} else if (key.equals(IGotoMarker.class)) {
			return this;
		} else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This accesses a cached version of the content outliner. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					// Set up the tree viewer.
					//
					contentOutlineViewer
							.setContentProvider(new AdapterFactoryContentProvider(
									adapterFactory));
					contentOutlineViewer
							.setLabelProvider(new AdapterFactoryLabelProvider(
									adapterFactory));
					contentOutlineViewer.setInput(editingDomain
							.getResourceSet());

					// Make sure our popups work.
					//
					createContextMenuFor(contentOutlineViewer);

					if (!editingDomain.getResourceSet().getResources()
							.isEmpty()) {
						// Select the root object in the view.
						//
						ArrayList selection = new ArrayList();
						selection.add(editingDomain.getResourceSet()
								.getResources().get(0));
						contentOutlineViewer.setSelection(
								new StructuredSelection(selection), true);
					}
				}

				public void makeContributions(IMenuManager menuManager,
						IToolBarManager toolBarManager,
						IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager,
							statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this,
							actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage
					.addSelectionChangedListener(new ISelectionChangedListener() {
						// This ensures that we handle selections correctly.
						//
						public void selectionChanged(SelectionChangedEvent event) {
							handleContentOutlineSelection(event.getSelection());
						}
					});
		}

		return contentOutlinePage;
	}

	/**
	 * This accesses a cached version of the property sheet. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new ExtendedPropertySheetPage(editingDomain) {
				public void setSelectionToViewer(List selection) {
					GoalmodelEditor.this.setSelectionToViewer(selection);
					GoalmodelEditor.this.setFocus();
				}

				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this,
							actionBars);
				}
			};
			propertySheetPage
					.setPropertySourceProvider(new AdapterFactoryContentProvider(
							adapterFactory));
		}

		return propertySheetPage;
	}

	/**
	 * This deals with how we want selection in the outliner to affect the other
	 * views. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void handleContentOutlineSelection(ISelection selection) {
		if (currentViewerPane != null && !selection.isEmpty()
				&& selection instanceof IStructuredSelection) {
			Iterator selectedElements = ((IStructuredSelection) selection)
					.iterator();
			if (selectedElements.hasNext()) {
				// Get the first selected element.
				//
				Object selectedElement = selectedElements.next();

				// If it's the selection viewer, then we want it to select the
				// same selection as this selection.
				//
				if (currentViewerPane.getViewer() == selectionViewer) {
					ArrayList selectionList = new ArrayList();
					selectionList.add(selectedElement);
					while (selectedElements.hasNext()) {
						selectionList.add(selectedElements.next());
					}

					// Set the selection to the widget.
					//
					selectionViewer.setSelection(new StructuredSelection(
							selectionList));
				} else {
					// Set the input to the widget.
					//
					if (currentViewerPane.getViewer().getInput() != selectedElement) {
						currentViewerPane.getViewer().setInput(selectedElement);
						currentViewerPane.setTitle(selectedElement);
					}
				}
			}
		}
	}

	GoalmodelPackage e = GoalmodelPackage.eINSTANCE;

	GoalmodelFactory f = e.getGoalmodelFactory();

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command
	 * stack. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isDirty() {
		return ((BasicCommandStack) editingDomain.getCommandStack())
				.isSaveNeeded();
	}

	private static int versionNumber = 0;

	Hashtable<String, Configuration> configurations = new Hashtable<String, Configuration>();

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model
	 * file. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void doSave(IProgressMonitor progressMonitor) {
		// Do the work within an operation because this is a long running
		// activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			// This is the method that gets invoked when the operation runs.
			//
			public void execute(IProgressMonitor monitor) {
				// Save the resources to the file system.
				// check in the changes
				try {
					IFileEditorInput modelFile = (IFileEditorInput) getEditorInput();
					String project_name = modelFile.getFile().getProject()
							.getName();
					Configuration config = configurations.get(project_name);
					String model_name = modelFile.getFile().getName().toString();
					model_name = model_name.substring(0, model_name.indexOf(".goalmodel"));
					checkout_last_version(config, model_name);
					String file_name = modelFile.getFile().getFullPath()
							.toString();
					GoalModel the_gm = find_the_gm(file_name, config);
					if (the_gm != null) {
						updateIndex(the_gm, the_gm.getRoot());
						modify_edited_goal_model(the_gm);
					}
					checkin_current_version(config, model_name);
					checkOutAllVersionsFromRepository(config, modelFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
				old_do_save();
			}

			private GoalModel find_the_gm(String file_name, Configuration config) {
				GoalModel the_gm = null;
				fluid.tree.Tree tree = Configuration.getTree();
				IRNode rootnode = config.getRoot();
				Enumeration en = tree.depthFirstSearch(rootnode);
				while (en.hasMoreElements()) {
					IRNode node = (IRNode) en.nextElement();
					Component comp = config.getComponent(node);
					if (comp instanceof GoalModel) {
						GoalModel gm = (GoalModel) comp;
						// System.out.println(gm.getName());
						if (gm.getName().equals(file_name)) {
							the_gm = gm;
							break;
						}
					}
				}
				return the_gm;
			}

			private void modify_edited_goal_model(GoalModel gm) {
				Hashtable<String, IRNode> table = tables.get(gm);
				ArrayList list = new ArrayList();
				while (editingDomain.getCommandStack().canUndo()) {
					list.add(editingDomain.getCommandStack()
							.getMostRecentCommand());
					editingDomain.getCommandStack().undo();
				}
				for (int i = list.size(); i > 0; i--) {
					Command c = (Command) list.get(i - 1);
					System.err.println(c.toString());
					if (c instanceof SetCommand) {
						SetCommand sc = (SetCommand) c;
						EStructuralFeature feature = sc.getFeature();
						if (feature.getEType().getName().equals("EString")
								&& sc.getOwner() instanceof Intention) {
							Intention it = (Intention) sc.getOwner();
							String v = (String) sc.getValue();
							String old = (String) sc.getOldValue();
							IRNode root = table.get(old);
							if (root != null) {
								// we assume the hard goals and softgoals are
								// not using the same name
								if (it instanceof Goal) {
									gm.setHardGoalName(root, v);
								} else if (it instanceof Softgoal) {
									gm.setSoftGoalName(root, v);
								}
								table.put(v, root);
								table.remove(old);
							}
						}
					} else if (c instanceof DeleteCommand) {
						DeleteCommand dc = (DeleteCommand) c;
						Collection objs = dc.getCollection();
						for (Iterator it = objs.iterator(); it.hasNext(); ) {
							Object o = it.next();
							if (o instanceof Intention) {
								Intention in = (Intention) o;
								IRNode root = table.get(in.getName());
								if (root!=null)
									gm.getGraph().removeNode(root);
								// enforce the containment semantics
								Model model = get_model();
								if (model != null) {
									ArrayList nodes = remove_sub_tree_node(in, model);
									ArrayList edges = remove_sub_tree_edge(in, model);
									model.getDecompositions().removeAll(edges);
									EList l = model.getContributions();
									for (int j=0; j<l.size(); j++) {
										Contribution d = (Contribution) l.get(j);
										if (d.getSource()==in 
										 || d.getTarget()==in
										 || d.getSource()==null
										 || d.getTarget()==null
										 || d.getSource()!=null && nodes.contains(d.getSource())
										 ||	d.getTarget()!=null && nodes.contains(d.getTarget()))
											model.getContributions().remove(d);
									}
									model.getIntentions().removeAll(nodes);
								}
							} else if (o instanceof Decomposition) {
								Decomposition in = (Decomposition) o;
								if (in.getSource()==null || in.getTarget()==null) {
									System.err.println("Warning: the link you deleted has empty end(s).");
									continue;
								}
								String sname = in.getSource().getName();
								String tname = in.getTarget().getName();								
								IRNode source = table.get(sname);
								IRNode target = table.get(tname);
								IRNode edge = find_edge(gm, source, target);
						        if (edge!=null)
						        	gm.getGraph().disconnect(edge);
							} else if (o instanceof Contribution) {
								Contribution in = (Contribution) o;
								if (in.getSource()==null || in.getTarget()==null) {
									System.err.println("Warning: the link you deleted has empty end(s).");
									continue;
								}
								String sname = in.getSource().getName();
								String tname = in.getTarget().getName();								
								IRNode source = table.get(sname);
								IRNode target = table.get(tname);
								IRNode edge = find_edge(gm, source, target);
						        if (edge!=null)
						        	gm.getGraph().disconnect(edge);
							}
						}
					} else if (c instanceof AddCommand) {
						AddCommand dc = (AddCommand) c;
						Collection objs = dc.getCollection();
						for (Iterator it = objs.iterator(); it.hasNext(); ) {
							Object o = it.next();
							if (o instanceof Intention) {
								Intention owner = (Intention) dc.getOwner();
								Intention in = (Intention) o;								
								IRNode parent = table.get(owner.getName());
								IRNode root = table.get(in.getName());
								if (parent!=null && root!=null) {
									EList l = owner.getDecompositions();
									for (int j=0; j<l.size(); j++) {
										Decomposition decomp = (Decomposition) l.get(j);
										if (decomp instanceof AndDecomposition) {
											IRNode e;
											if (decomp.getTarget() == in) {
												e = gm.createEdge("AND");												
											} else {
												e = gm.createEdge("OR");
											}
											gm.connect(parent, root, e);
											break;
										}
									}
								}
							}
						}
					}
					if (editingDomain.getCommandStack().canRedo()) {
						editingDomain.getCommandStack().redo();						
					}
				}
				editingDomain.getCommandStack().flush();
			}

			/**
			 * Remove the subtree
			 * @param in, the root element
			 * @param model
			 */
			private ArrayList remove_sub_tree_node(Intention in, Model model) {
				ArrayList nodes = new ArrayList();
				nodes.add(in);
				EList l = model.getDecompositions();
				for (int j=0; j<l.size(); j++) {
					Decomposition d = (Decomposition) l.get(j);
					if (d.getSource()==in) {
						if (d.getTarget()!=null) {
							ArrayList sub = remove_sub_tree_node(d.getTarget(), model);
							nodes.addAll(sub);
						}
					}
				}
				return nodes;
			}
			private ArrayList remove_sub_tree_edge(Intention in, Model model) {
				ArrayList edges = new ArrayList();
				EList l = model.getDecompositions();
				for (int j=0; j<l.size(); j++) {
					Decomposition d = (Decomposition) l.get(j);
				    if (d.getTarget() == in) {
				    	edges.add(d);
				    }
				}
				for (int j=0; j<l.size(); j++) {
					Decomposition d = (Decomposition) l.get(j);
					if (d.getSource()==in) {
						if (d.getTarget()!=null) {
							ArrayList sub = remove_sub_tree_edge(d.getTarget(), model);
							edges.addAll(sub);
						}
					}
				}
				return edges;
			}

			private Model get_model() {
				Model model = null;
				for (TreeIterator ti = editingDomain.getResourceSet().getAllContents();
					ti.hasNext(); ) {
					Object b = ti.next();
					if (b instanceof Model) {
						model = (Model) b;
						break;
					}
				}
				return model;
			}

			private IRNode find_edge(GoalModel gm, IRNode source, IRNode target) {
				IRNode edge = null;
				if (source==null || target==null)
					return edge;
				int numChildren = gm.getGraph().numChildren(source);
				for (int j = 0; j < numChildren; j++) {   	
				  IRNode childnode = gm.getGraph().getChild(source, j);
				  if (childnode == target) {
					  edge = gm.getGraph().getChildEdge(source, j);
					  break;
				  }
				}
				return edge;
			}

			// check out
			private void checkOutAllVersionsFromRepository(
					Configuration config, IFileEditorInput modelFile) {
				java.util.Enumeration vs = config.getAllVersionNames();
				while (vs.hasMoreElements()) {
					String v1_name = (String) vs.nextElement();
					String model_name = get_model_name(modelFile);					
					if (v1_name.substring(0, v1_name.lastIndexOf("-")).equals(model_name)) {
						checkout_version(config, v1_name);
						// Tien: getTree should not be a static method
						fluid.tree.Tree project_tree = config.getTree();
						IRNode project_root = config.getRoot();
						unparse_checkout_into_emf(config, v1_name, project_tree,
								project_root);
					}
				}
			}

			private void old_do_save() {
				boolean first = true;
				for (Iterator i = editingDomain.getResourceSet().getResources()
						.iterator(); i.hasNext();) {
					Resource resource = (Resource) i.next();
					if ((first || !resource.getContents().isEmpty() || isPersisted(resource))
							&& !editingDomain.isReadOnly(resource)) {
						try {
							savedResources.add(resource);
							resource.save(Collections.EMPTY_MAP);
						} catch (Exception exception) {
							resourceToDiagnosticMap
									.put(resource, analyzeResourceProblems(
											resource, exception));
						}
						first = false;
					}
				}
			}
		};

		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false,
					operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			GoalmodelEditorPlugin.INSTANCE.log(exception);
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	/**
	 * Get the URI of the file.
	 */
	public static URI fetchURI(String name) {
		File file = new File(name);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath())
				: URI.createURI(name);
		return uri;
	}

	/**
	 * This returns wether something has been persisted to the URI of the
	 * specified resource. The implementation uses the URI converter from the
	 * editor's resource set to try to open an input stream. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet()
					.getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		} catch (IOException e) {
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath()
						.toString()), new FileEditorInput(file));
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		((Resource) editingDomain.getResourceSet().getResources().get(0))
				.setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor = getActionBars()
				.getStatusLineManager() != null ? getActionBars()
				.getStatusLineManager().getProgressMonitor()
				: new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		try {
			if (marker.getType().equals(EValidator.MARKER)) {
				String uriAttribute = marker.getAttribute(
						EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject eObject = editingDomain.getResourceSet()
							.getEObject(uri, true);
					if (eObject != null) {
						setSelectionToViewer(Collections
								.singleton(editingDomain.getWrapper(eObject)));
					}
				}
			}
		} catch (CoreException exception) {
			GoalmodelEditorPlugin.INSTANCE.log(exception);
		}
	}

	/**
	 * This is called during startup. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFocus() {
		if (currentViewerPane != null) {
			currentViewerPane.setFocus();
		} else {
			getControl(getActivePage()).setFocus();
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to
	 * return this editor's overall selection. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ISelection getSelection() {
		return editorSelection;
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to
	 * set this editor's overall selection. Calling this result will notify the
	 * listeners. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSelection(ISelection selection) {
		editorSelection = selection;

		for (Iterator listeners = selectionChangedListeners.iterator(); listeners
				.hasNext();) {
			ISelectionChangedListener listener = (ISelectionChangedListener) listeners
					.next();
			listener
					.selectionChanged(new SelectionChangedEvent(this, selection));
		}
		setStatusLineManager(selection);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = currentViewer != null
				&& currentViewer == contentOutlineViewer ? contentOutlineStatusLineManager
				: getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection collection = ((IStructuredSelection) selection)
						.toList();
				switch (collection.size()) {
				case 0: {
					statusLineManager
							.setMessage(getString("_UI_NoObjectSelected"));
					break;
				}
				case 1: {
					String text = new AdapterFactoryItemDelegator(
							adapterFactory).getText(collection.iterator()
							.next());
					statusLineManager.setMessage(getString(
							"_UI_SingleObjectSelected", text));
					break;
				}
				default: {
					statusLineManager.setMessage(getString(
							"_UI_MultiObjectSelected", Integer
									.toString(collection.size())));
					break;
				}
				}
			} else {
				statusLineManager.setMessage("");
			}
		}
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static String getString(String key) {
		return GoalmodelEditorPlugin.INSTANCE.getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static String getString(String key, Object s1) {
		return GoalmodelEditorPlugin.INSTANCE.getString(key,
				new Object[] { s1 });
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help
	 * fill the context menus with contributions from the Edit menu. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor())
				.menuAboutToShow(menuManager);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor) getEditorSite()
				.getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		updateProblemIndication = false;

		ResourcesPlugin.getWorkspace().removeResourceChangeListener(
				resourceChangeListener);

		getSite().getPage().removePartListener(partListener);

		adapterFactory.dispose();

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}

		if (propertySheetPage != null) {
			propertySheetPage.dispose();
		}

		if (contentOutlinePage != null) {
			contentOutlinePage.dispose();
		}

		super.dispose();
	}

	/**
	 * Returns whether the outline view should be presented to the user. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean showOutlineView() {
		return true;
	}
}
