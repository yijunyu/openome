package edu.toronto.cs.goalmodel.diagram.part;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Level;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.MultiRule;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.AbstractDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.DiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.StorageDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorStatusCodes;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.util.DiagramIOUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.part.FileEditorInput;

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
import fluid.ir.IRNode;
import fluid.ir.IRPersistent;
import fluid.version.Version;

/**
 * @generated
 */
public class GoalmodelDocumentProvider extends AbstractDocumentProvider
		implements IDiagramDocumentProvider {
	/**
	 * @generated
	 */
	protected ElementInfo createElementInfo(Object element)
			throws CoreException {
		if (false == element instanceof FileEditorInput
				&& false == element instanceof URIEditorInput) {
			throw new CoreException(
					new Status(
							IStatus.ERROR,
							GoalmodelDiagramEditorPlugin.ID,
							0,
							NLS
									.bind(
											Messages.GoalmodelDocumentProvider_IncorrectInputError,
											new Object[] {
													element,
													"org.eclipse.ui.part.FileEditorInput", "org.eclipse.emf.common.ui.URIEditorInput" }), //$NON-NLS-1$ //$NON-NLS-2$ 
							null));
		}
		IEditorInput editorInput = (IEditorInput) element;
		IDiagramDocument document = (IDiagramDocument) createDocument(editorInput);

		ResourceSetInfo info = new ResourceSetInfo(document, editorInput);
		info.setModificationStamp(computeModificationStamp(info));
		info.fStatus = null;
		return info;
	}

	/**
	 * @generated
	 */
	protected IDocument createDocument(Object element) throws CoreException {
		if (false == element instanceof FileEditorInput
				&& false == element instanceof URIEditorInput) {
			throw new CoreException(
					new Status(
							IStatus.ERROR,
							GoalmodelDiagramEditorPlugin.ID,
							0,
							NLS
									.bind(
											Messages.GoalmodelDocumentProvider_IncorrectInputError,
											new Object[] {
													element,
													"org.eclipse.ui.part.FileEditorInput", "org.eclipse.emf.common.ui.URIEditorInput" }), //$NON-NLS-1$ //$NON-NLS-2$ 
							null));
		}
		IDocument document = createEmptyDocument();
		setDocumentContent(document, (IEditorInput) element);
		setupDocument(element, document);
		return document;
	}

	/**
	 * Sets up the given document as it would be provided for the given element. The
	 * content of the document is not changed. This default implementation is empty.
	 * Subclasses may reimplement.
	 * 
	 * @param element the blue-print element
	 * @param document the document to set up
	 * @generated
	 */
	protected void setupDocument(Object element, IDocument document) {
		// for subclasses
	}

	/**
	 * @generated
	 */
	private long computeModificationStamp(ResourceSetInfo info) {
		int result = 0;
		for (Iterator it = info.getResourceSet().getResources().iterator(); it
				.hasNext();) {
			Resource nextResource = (Resource) it.next();
			IFile file = WorkspaceSynchronizer.getFile(nextResource);
			if (file != null) {
				if (file.getLocation() != null) {
					result += file.getLocation().toFile().lastModified();
				} else {
					result += file.getModificationStamp();
				}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected IDocument createEmptyDocument() {
		DiagramDocument document = new DiagramDocument();
		document.setEditingDomain(createEditingDomain());
		return document;
	}

	/**
	 * @generated
	 */
	private TransactionalEditingDomain createEditingDomain() {
		TransactionalEditingDomain editingDomain = DiagramEditingDomainFactory
				.getInstance().createEditingDomain();
		editingDomain.setID("edu.toronto.cs.goalmodel.diagram.EditingDomain"); //$NON-NLS-1$
		final NotificationFilter diagramResourceModifiedFilter = NotificationFilter
				.createNotifierFilter(editingDomain.getResourceSet()).and(
						NotificationFilter
								.createEventTypeFilter(Notification.ADD)).and(
						NotificationFilter.createFeatureFilter(
								ResourceSet.class,
								ResourceSet.RESOURCE_SET__RESOURCES));
		editingDomain.getResourceSet().eAdapters().add(new Adapter() {

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

		return editingDomain;
	}

	/**
	 * @generated
	 */
	protected void setDocumentContent(IDocument document, IEditorInput element)
			throws CoreException {
		IDiagramDocument diagramDocument = (IDiagramDocument) document;
		TransactionalEditingDomain domain = diagramDocument.getEditingDomain();
		if (element instanceof FileEditorInput) {
			IStorage storage = ((FileEditorInput) element).getStorage();
			Diagram diagram = DiagramIOUtil.load(domain, storage, true,
					getProgressMonitor());
			document.setContent(diagram);
		} else if (element instanceof URIEditorInput) {
			URI uri = ((URIEditorInput) element).getURI();
			Resource resource = null;
			try {
				resource = domain.getResourceSet().getResource(
						uri.trimFragment(), false);
				if (resource == null) {
					resource = domain.getResourceSet().createResource(
							uri.trimFragment());
				}
				if (!resource.isLoaded()) {
					try {
						Map options = new HashMap(GMFResourceFactory
								.getDefaultLoadOptions());
						// @see 171060 
						// options.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
						resource.load(options);
					} catch (IOException e) {
						resource.unload();
						throw e;
					}
				}
				if (uri.fragment() != null) {
					EObject rootElement = resource.getEObject(uri.fragment());
					if (rootElement instanceof Diagram) {
						document.setContent((Diagram) rootElement);
						return;
					}
				} else {
					for (Iterator it = resource.getContents().iterator(); it
							.hasNext();) {
						Object rootElement = it.next();
						if (rootElement instanceof Diagram) {
							document.setContent((Diagram) rootElement);
							return;
						}
					}
				}
				throw new RuntimeException(
						Messages.GoalmodelDocumentProvider_NoDiagramInResourceError);
			} catch (Exception e) {
				CoreException thrownExcp = null;
				if (e instanceof CoreException) {
					thrownExcp = (CoreException) e;
				} else {
					String msg = e.getLocalizedMessage();
					thrownExcp = new CoreException(
							new Status(
									IStatus.ERROR,
									GoalmodelDiagramEditorPlugin.ID,
									0,
									msg != null ? msg
											: Messages.GoalmodelDocumentProvider_DiagramLoadingError,
									e));
				}
				throw thrownExcp;
			}
		} else {
			throw new CoreException(
					new Status(
							IStatus.ERROR,
							GoalmodelDiagramEditorPlugin.ID,
							0,
							NLS
									.bind(
											Messages.GoalmodelDocumentProvider_IncorrectInputError,
											new Object[] {
													element,
													"org.eclipse.ui.part.FileEditorInput", "org.eclipse.emf.common.ui.URIEditorInput" }), //$NON-NLS-1$ //$NON-NLS-2$ 
							null));
		}
	}

	/**
	 * @generated
	 */
	public long getModificationStamp(Object element) {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			return computeModificationStamp(info);
		}
		return super.getModificationStamp(element);
	}

	/**
	 * @generated
	 */
	public boolean isDeleted(Object element) {
		IDiagramDocument document = getDiagramDocument(element);
		if (document != null) {
			Resource diagramResource = document.getDiagram().eResource();
			if (diagramResource != null) {
				IFile file = WorkspaceSynchronizer.getFile(diagramResource);
				return file == null || file.getLocation() == null
						|| !file.getLocation().toFile().exists();
			}
		}
		return super.isDeleted(element);
	}

	/**
	 * @generated
	 */
	public ResourceSetInfo getResourceSetInfo(Object editorInput) {
		return (ResourceSetInfo) super.getElementInfo(editorInput);
	}

	/**
	 * @generated
	 */
	protected void disposeElementInfo(Object element, ElementInfo info) {
		if (info instanceof ResourceSetInfo) {
			ResourceSetInfo resourceSetInfo = (ResourceSetInfo) info;
			resourceSetInfo.dispose();
		}
		super.disposeElementInfo(element, info);
	}

	/**
	 * @generated
	 */
	protected void doValidateState(Object element, Object computationContext)
			throws CoreException {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			Collection files2Validate = new ArrayList();
			for (Iterator it = info.getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource nextResource = (Resource) it.next();
				IFile file = WorkspaceSynchronizer.getFile(nextResource);
				if (file != null && file.isReadOnly()) {
					files2Validate.add(file);
				}
			}
			ResourcesPlugin.getWorkspace().validateEdit(
					(IFile[]) files2Validate.toArray(new IFile[files2Validate
							.size()]), computationContext);
		}

		super.doValidateState(element, computationContext);
	}

	/**
	 * @generated
	 */
	public boolean isReadOnly(Object element) {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			if (info.isUpdateCache()) {
				try {
					updateCache(element);
				} catch (CoreException ex) {
					GoalmodelDiagramEditorPlugin
							.getInstance()
							.logError(
									Messages.GoalmodelDocumentProvider_isModifiable,
									ex);
					// Error message to log was initially taken from org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.internal.l10n.EditorMessages.StorageDocumentProvider_isModifiable
				}
			}
			return info.isReadOnly();
		}
		return super.isReadOnly(element);
	}

	/**
	 * @generated
	 */
	public boolean isModifiable(Object element) {
		if (!isStateValidated(element)) {
			if (element instanceof FileEditorInput
					|| element instanceof URIEditorInput) {
				return true;
			}
		}
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			if (info.isUpdateCache()) {
				try {
					updateCache(element);
				} catch (CoreException ex) {
					GoalmodelDiagramEditorPlugin
							.getInstance()
							.logError(
									Messages.GoalmodelDocumentProvider_isModifiable,
									ex);
					// Error message to log was initially taken from org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.internal.l10n.EditorMessages.StorageDocumentProvider_isModifiable
				}
			}
			return info.isModifiable();
		}
		return super.isModifiable(element);
	}

	/**
	 * @generated
	 */
	protected void updateCache(Object element) throws CoreException {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			for (Iterator it = info.getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource nextResource = (Resource) it.next();
				IFile file = WorkspaceSynchronizer.getFile(nextResource);
				if (file != null && file.isReadOnly()) {
					info.setReadOnly(true);
					info.setModifiable(false);
					return;
				}
			}
			info.setReadOnly(false);
			info.setModifiable(true);
			return;
		}
	}

	/**
	 * @generated
	 */
	protected void doUpdateStateCache(Object element) throws CoreException {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			info.setUpdateCache(true);
		}
		super.doUpdateStateCache(element);
	}

	/**
	 * @generated
	 */
	public boolean isSynchronized(Object element) {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			return info.isSynchronized();
		}
		return super.isSynchronized(element);
	}

	/**
	 * @generated
	 */
	protected ISchedulingRule getResetRule(Object element) {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			Collection rules = new ArrayList();
			for (Iterator it = info.getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource nextResource = (Resource) it.next();
				IFile file = WorkspaceSynchronizer.getFile(nextResource);
				if (file != null) {
					rules.add(ResourcesPlugin.getWorkspace().getRuleFactory()
							.modifyRule(file));
				}
			}
			return new MultiRule((ISchedulingRule[]) rules
					.toArray(new ISchedulingRule[rules.size()]));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected ISchedulingRule getSaveRule(Object element) {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			Collection rules = new ArrayList();
			for (Iterator it = info.getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource nextResource = (Resource) it.next();
				IFile file = WorkspaceSynchronizer.getFile(nextResource);
				if (file != null) {
					rules.add(computeSchedulingRule(file));
				}
			}
			return new MultiRule((ISchedulingRule[]) rules
					.toArray(new ISchedulingRule[rules.size()]));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected ISchedulingRule getSynchronizeRule(Object element) {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			Collection rules = new ArrayList();
			for (Iterator it = info.getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource nextResource = (Resource) it.next();
				IFile file = WorkspaceSynchronizer.getFile(nextResource);
				if (file != null) {
					rules.add(ResourcesPlugin.getWorkspace().getRuleFactory()
							.refreshRule(file));
				}
			}
			return new MultiRule((ISchedulingRule[]) rules
					.toArray(new ISchedulingRule[rules.size()]));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected ISchedulingRule getValidateStateRule(Object element) {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			Collection files = new ArrayList();
			for (Iterator it = info.getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource nextResource = (Resource) it.next();
				IFile file = WorkspaceSynchronizer.getFile(nextResource);
				if (file != null) {
					files.add(file);
				}
			}
			return ResourcesPlugin.getWorkspace().getRuleFactory()
					.validateEditRule(
							(IFile[]) files.toArray(new IFile[files.size()]));
		}
		return null;
	}

	/**
	 * @generated
	 */
	private ISchedulingRule computeSchedulingRule(IResource toCreateOrModify) {
		if (toCreateOrModify.exists())
			return ResourcesPlugin.getWorkspace().getRuleFactory().modifyRule(
					toCreateOrModify);

		IResource parent = toCreateOrModify;
		do {
			/*
			 * XXX This is a workaround for
			 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=67601
			 * IResourceRuleFactory.createRule should iterate the hierarchy
			 * itself.
			 */
			toCreateOrModify = parent;
			parent = toCreateOrModify.getParent();
		} while (parent != null && !parent.exists());

		return ResourcesPlugin.getWorkspace().getRuleFactory().createRule(
				toCreateOrModify);
	}

	/**
	 * @generated
	 */
	protected void doSynchronize(Object element, IProgressMonitor monitor)
			throws CoreException {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			for (Iterator it = info.getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource nextResource = (Resource) it.next();
				handleElementChanged(info, nextResource, monitor);
			}
			return;
		}
		super.doSynchronize(element, monitor);
	}

	final static String MOLHADO_PLUGIN_NAME = "molhado";

	public static String getPluginInstallPath() {
		URL url = FileLocator.find(Platform.getBundle(MOLHADO_PLUGIN_NAME),
				new Path("repository"), null);
		try {
			url = FileLocator.resolve(url);
			return url.getPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void buildGoalModel(GoalModel gm, Resource resource) {
		Hashtable<Intention, IRNode> table = new Hashtable<Intention, IRNode>();
		tables.put(gm, table);
		IRNode root = gm.createAGoal("VIRTUAL_ROOT", true);
		gm.setRoot(root);
		// the first pass creates nodes
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Intention) {
				Intention i = (Intention) o;
				String name = i.getName();
				IRNode g = gm.createAGoal(name, o instanceof Goal);
				//				if (i.getParentDecompositions().size() == 0) {
				IRNode e = gm.createEdge("virtual");
				gm.connect(root, g, e);
				//				}
				// System.out.println(name + " " + g);
				table.put(i, g);
			}
		}
		// the second pass creates edges
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Contribution) {
				Contribution i = (Contribution) o;
				if (i.getSource() == null || i.getTarget() == null)
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
				if (i.getSource() == null || i.getTarget() == null)
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

	private void checkInGoalModel(Configuration config, Resource resource) {
		IRNode rootnode = config.getRoot();
		fluid.tree.Tree tree = Configuration.getTree();
		// Create a goal model
		String file_name = get_model_name(resource);
		GoalModel gm = new GoalModel();
		gm.setName(file_name);
		IRNode gm_node = config.newComponent(gm);
		tree.appendChild(rootnode, gm_node);
		buildGoalModel(gm, resource);
		checkin_current_version(config, resource);
		//		System.out.println(versions.get(file_name).intValue());
	}

	private SCDirectory connectToRepository(Resource resource) {
		Configuration.ensureLoaded();
		SCDirectory root = new SCDirectory();
		String model_name = get_model_name(resource);
		root.setName(model_name);
		return root;
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
	void checkLatestVersion(Resource resource) {
		org.apache.log4j.Logger.getLogger("IR").setLevel(Level.OFF);
		String model_name = get_model_name(resource);
		String project_name = model_name.substring(0, model_name
				.indexOf("/", 2));
		String property = System.getProperty("fluid.ir.path");
		if (property == null) {
			String toString = getPluginInstallPath();
			System.setProperty("fluid.ir.path", toString);
			property = System.getProperty("fluid.ir.path");
		}
		try {
			int versionNumber = 0;
			Configuration config = Configuration.loadASCII(new FileReader(
					property + project_name + ".cfg"),
					IRPersistent.fluidFileLocator);
			java.util.Enumeration vs = config.getAllVersionNames();
			while (vs.hasMoreElements()) {
				String v1_name = (String) vs.nextElement();
				//				System.out.println(v1_name.substring(0, v1_name.lastIndexOf("-")));				
				if (v1_name.substring(0, v1_name.lastIndexOf("-")).equals(
						model_name)) {
					versionNumber++;
				}
			}
			update_version(model_name, versionNumber);
			configurations.put(resource, config);
		} catch (Exception e) {
			//			e.printStackTrace();
			SCDirectory project_root = connectToRepository(resource);
			Configuration config = new Configuration(project_name, project_root);
			// create a new goal model and check it in
			//			checkInGoalModel(config, resource);
			configurations.put(resource, config);
			update_version(model_name, 0);
		}
	}

	private String get_model_name(Resource resource) {
		String name = resource.getURI().toString();
		name = name.substring(name.indexOf(":") + 10);
		name = name.substring(0, name.indexOf(".goalmodel"));
		return name;
	}

	/**
	 * @generated NOT FIXME
	 */
	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			if (!overwrite && !info.isSynchronized()) {
				throw new CoreException(new Status(IStatus.ERROR,
						GoalmodelDiagramEditorPlugin.ID,
						IResourceStatus.OUT_OF_SYNC_LOCAL,
						"The file has been changed on the file system", null));
			}
			info.stopResourceListening();
			fireElementStateChanging(element);
			try {
				monitor.beginTask("Saving diagram editor", info
						.getResourceSet().getResources().size());
				for (Iterator it = info.getResourceSet().getResources()
						.iterator(); it.hasNext();) {
					Resource nextResource = (Resource) it.next();
					monitor.setTaskName("Saving " + nextResource.getURI());
					if (nextResource.isLoaded()
							&& (!nextResource.isTrackingModification() || nextResource
									.isModified())) {
						if (!(nextResource instanceof GMFResource)) {
							// FIXME YY: Checkin/Checkout To Molhado
							CheckinCheckoutMolhado(nextResource);
							//							System.err.println(nextResource);							
						}
						nextResource.save(Collections.EMPTY_MAP);
					}
					monitor.worked(1);
				}
				monitor.done();
			} catch (IOException e) {
				fireElementStateChangeFailed(element);
				throw new CoreException(new Status(IStatus.ERROR,
						GoalmodelDiagramEditorPlugin.ID,
						EditorStatusCodes.RESOURCE_FAILURE, e
								.getLocalizedMessage(), null));
			} catch (RuntimeException x) {
				fireElementStateChangeFailed(element);
				throw x;
			} finally {
				info.startResourceListening();
			}

			if (info != null) {
				info.setModificationStamp(computeModificationStamp(info));
				info.setSynchronized();
			}
		}
		super.doSaveDocument(monitor, element, document, overwrite);
	}

	/**
	 * @generated
	 */
	protected void handleElementChanged(ResourceSetInfo info,
			Resource changedResource, IProgressMonitor monitor) {
		IFile file = WorkspaceSynchronizer.getFile(changedResource);
		if (file != null) {
			try {
				file.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException ex) {
				GoalmodelDiagramEditorPlugin
						.getInstance()
						.logError(
								Messages.GoalmodelDocumentProvider_handleElementContentChanged,
								ex);
				// Error message to log was initially taken from org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.internal.l10n.EditorMessages.FileDocumentProvider_handleElementContentChanged
			}
		}
		changedResource.unload();

		fireElementContentAboutToBeReplaced(info.getEditorInput());
		removeUnchangedElementListeners(info.getEditorInput(), info);
		info.fStatus = null;
		try {
			setDocumentContent(info.fDocument, info.getEditorInput());
		} catch (CoreException e) {
			info.fStatus = e.getStatus();
		}
		if (!info.fCanBeSaved) {
			info.setModificationStamp(computeModificationStamp(info));
		}
		addUnchangedElementListeners(info.getEditorInput(), info);
		fireElementContentReplaced(info.getEditorInput());
	}

	/**
	 * @generated
	 */
	protected void handleElementMoved(IEditorInput input, URI uri) {
		if (input instanceof FileEditorInput) {
			IFile newFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
					new Path(URI.decode(uri.path())).removeFirstSegments(1));
			fireElementMoved(input, newFile == null ? null
					: new FileEditorInput(newFile));
			return;
		}
		// TODO: append suffix to the URI! (use diagram as a parameter)
		fireElementMoved(input, new URIEditorInput(uri));
	}

	Hashtable<Resource, Configuration> configurations = new Hashtable<Resource, Configuration>();
	private Hashtable<String, Integer> versions = new Hashtable<String, Integer>();
	Hashtable<GoalModel, Hashtable<Intention, IRNode>> tables = new Hashtable<GoalModel, Hashtable<Intention, IRNode>>();
	Hashtable<String, Intention> nodes;

	//	Hashtable<Decomposition, IRNode> decompositions;
	//	Hashtable<Contribution, IRNode> contributions;

	private void checkout_version(Configuration config, String v1_name) {
		try {
			Version v1 = config.loadVersionByDelta(v1_name,
					IRPersistent.fluidFileLocator);
			Version.setVersion(v1);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void checkout_last_version(Configuration config, String model_name) {
		Integer last = versions.get(model_name);
		if (last != null && last.intValue() > 0) {
			String last_version = model_name + "-v" + last.intValue();
			checkout_version(config, last_version);
			Version.bumpVersion(); // Tien: important after check out if one wants to modify the mirror 
		}
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

	private void setGoalModel(GoalModel the_gm, Configuration config) {
		fluid.tree.Tree tree = Configuration.getTree();
		IRNode rootnode = config.getRoot();
		Enumeration en = tree.depthFirstSearch(rootnode);
		while (en.hasMoreElements()) {
			IRNode node = (IRNode) en.nextElement();
			Component comp = config.getComponent(node);
			if (comp instanceof GoalModel) {
				GoalModel gm = (GoalModel) comp;
				// System.out.println(gm.getName());
				if (gm.getName().equals(the_gm.getName())) {
					config.setComponent(node, the_gm);
					break;
				}
			}
		}
	}

	//	/**
	//	 * We need to make sure after checkout, the mapping table between goal names
	//	 * and goals in the GoalModel is updated
	//	 * 
	//	 * @param gm
	//	 */
	//	private void updateIndex(GoalModel gm, IRNode root) {
	//		if (root == null)
	//			return;
	//		String name = gm.getGMNodeName(root);
	//		name = name.substring(name.indexOf("_") + 1);
	//		Hashtable<Intention, IRNode> table = tables.get(gm);
	//		if (table == null) {
	//			table = new Hashtable<Intention, IRNode>();
	//			tables.put(gm, table);
	//		}
	//		table.put(name, root);
	//		int numChildren = gm.graph.numChildren(root);
	//		for (int i = 0; i < numChildren; i++) {
	//			IRNode childnode = gm.graph.getChild(root, i);
	//			updateIndex(gm, childnode);
	//		}
	//	}
	private void update_version(String model_name, int versionNumber) {
		versions.put(model_name, new Integer(versionNumber));
		// System.err.println(model_name + " = " + versionNumber);
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

	private void checkin_current_version(Configuration config, Resource resource) {
		Version v1 = Version.getVersion();
		Version.setVersion(v1);
		try {
			String model_name = get_model_name(resource);
			incrementVersion(config, v1, model_name);
			config.saveVersionByDelta(v1, IRPersistent.fluidFileLocator);
			config.storeASCII(new PrintWriter(new BufferedWriter(
					new FileWriter(System.getProperty("fluid.ir.path")
							+ config.getName() + ".cfg"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	GoalmodelPackage e = GoalmodelPackage.eINSTANCE;

	GoalmodelFactory f = e.getGoalmodelFactory();

	//	/*
	//	 * nodes will be populated
	//	 */
	//	private void traverseGMResourcesForNodes(GoalModel gm, GoalmodelFactory f,
	//			Model m, IRNode root, IRNode edgenode) {
	//		if (root == null)
	//			return;
	//		String name = gm.getGMNodeName(root);
	//		String prefix = name.substring(0, name.indexOf("_"));
	//		name = name.substring(name.indexOf("_") + 1);
	//		Intention g;
	//		if (!name.equals("VIRTUAL_ROOT")) {
	//			if (prefix.equals("HardGoal"))
	//				g = f.createGoal();
	//			else
	//				g = f.createSoftgoal();
	//			g.setName(name);
	//			m.getIntentions().add(g);
	//			nodes.put(name, g);
	//		}
	//		int numChildren = gm.graph.numChildren(root);
	//		for (int i = 0; i < numChildren; i++) {
	//			IRNode childedgenode = gm.graph.getChildEdge(root, i);
	//			IRNode childnode = gm.graph.getChild(root, i);
	//			traverseGMResourcesForNodes(gm, f, m, childnode, childedgenode);
	//		}
	//	}

	private void traverseGMResourcesForNodes(GoalModel gm, GoalmodelFactory f,
			Model m, IRNode root, IRNode edgenode) {
		if (root == null)
			return;
		String name = gm.getGMNodeName(root);
		String prefix = name.substring(0, name.indexOf("_"));
		name = name.substring(name.indexOf("_") + 1);
		Intention g;
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode childnode = gm.graph.getChild(root, i);
			name = gm.getGMNodeName(childnode);
			prefix = name.substring(0, name.indexOf("_"));
			name = name.substring(name.indexOf("_") + 1);
			if (prefix.equals("HardGoal"))
				g = f.createGoal();
			else
				g = f.createSoftgoal();
			g.setName(name);
			m.getIntentions().add(g);
			nodes.put(name, g);
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
	private int traverseGMResourcesForEdges(GoalModel gm, GoalmodelFactory f,
			Model m, IRNode root) {
		int count = 0;
		int nNode = gm.graph.numChildren(root);
		for (int i = 0; i < nNode; i++) {
			IRNode source = gm.graph.getChild(root, i);
			String sourceName = gm.getGMNodeName(source);
			sourceName = sourceName.substring(sourceName.indexOf("_") + 1);
			Intention sourceGoal = nodes.get(sourceName);
			if (sourceGoal == null)
				continue;
			int nC = gm.graph.numChildren(source);
			for (int j = 0; j < nC; j++) {
				IRNode edge = gm.graph.getChildEdge(source, j);
				IRNode target = gm.graph.getChild(source, j);
				String targetName = gm.getGMNodeName(target);
				targetName = targetName.substring(targetName.indexOf("_") + 1);
				Intention targetGoal = nodes.get(targetName);
				if (targetGoal != null && edge != null) {
					String edgetype = gm.getGMNodeName(edge);
					String pre = edgetype.substring(edgetype.indexOf("_") + 1);
					if (pre.equals("AND")) {
						AndDecomposition d = f.createAndDecomposition();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getDecompositions().add(d);
						count++;
					} else if (pre.equals("OR")) {
						OrDecomposition d = f.createOrDecomposition();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getDecompositions().add(d);
						count++;
					} else if (pre.equals("+")) {
						HelpContribution d = f.createHelpContribution();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getContributions().add(d);
						count++;
					} else if (pre.equals("++")) {
						MakeContribution d = f.createMakeContribution();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getContributions().add(d);
						count++;
					} else if (pre.equals("-")) {
						HurtContribution d = f.createHurtContribution();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getContributions().add(d);
						count++;
					} else if (pre.equals("--")) {
						BreakContribution d = f.createBreakContribution();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getContributions().add(d);
						count++;
					}
				}
			}
		}
		return count;
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
				v1_name = v1_name.substring(v1_name.lastIndexOf("-") + 1);
				String model_v1 = name + "-" + v1_name + ".goalmodel";
				URI uri = fetchURI(model_v1);
				Resource resource = resourceSet.createResource(uri);
				Model m = f.createModel();
				try {
					IRNode root = gm.getRoot();
					nodes = new Hashtable<String, Intention>();
					traverseGMResourcesForNodes(gm, f, m, root, null);
					traverseGMResourcesForEdges(gm, f, m, root);
					resource.getContents().add(m);
					resource.save(Collections.EMPTY_MAP);
					resource.unload();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// check out
	private void checkOutAllVersionsFromRepository(Configuration config,
			String model_name) {
		java.util.Enumeration vs = config.getAllVersionNames();
		while (vs.hasMoreElements()) {
			String v1_name = (String) vs.nextElement();
			if (v1_name.substring(0, v1_name.lastIndexOf("-")).equals(
					model_name)) {
				checkout_version(config, v1_name);
				// Tien: getTree should not be a static method
				fluid.tree.Tree project_tree = config.getTree();
				IRNode project_root = config.getRoot();
				unparse_checkout_into_emf(config, v1_name, project_tree,
						project_root);
			}
		}
	}

	/**
	 * We need to make sure after checkout, the mapping table between goal names
	 * and goals in the GoalModel is updated
	 * 
	 * @param gm
	 */
	private void updateIndex(GoalModel gm, Resource resource) {
		IRNode root = gm.getRoot();
		Hashtable<Intention, IRNode> table = tables.get(gm);
		if (table == null) {
			table = new Hashtable<Intention, IRNode>();
			tables.put(gm, table);
		}
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Intention) {
				Intention i = (Intention) o;
				String name = i.getName();
				IRNode g = gm.createAGoal(name, o instanceof Goal);
				if (i.getParentDecompositions().size() == 0) {
					IRNode e = gm.createEdge("virtual");
					gm.connect(root, g, e);
				}
				table.put(i, g);
			}
		}
	}

	private void CheckinCheckoutMolhado(Resource resource) {
		try {
			String model_name = get_model_name(resource);
			checkLatestVersion(resource); // Algorithm 3
			Configuration config = configurations.get(resource);
			checkout_last_version(config, model_name);
			GoalModel the_gm = find_the_gm(model_name, config);
			if (the_gm != null) {
				//				updateIndex(the_gm, the_gm.getRoot());
				//				print_the_gm(the_gm);
				modify_edited_goal_model(the_gm, resource);
				//				setGoalModel(gm, config);
				//				print_the_gm(the_gm);
				checkin_current_version(config, resource);
			} else {
				checkInGoalModel(config, resource);
				update_version(model_name, 1);
			}
			checkOutAllVersionsFromRepository(config, model_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void print_the_gm(GoalModel gm) {
		Hashtable<Intention, IRNode> table = tables.get(gm);
		IRNode root = gm.getRoot();
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			if (g != null) {
				String name = get_goal_name(gm, g);
				String type = get_goal_type(gm, g);
				System.err.println(type + ": " + name);
				print_the_gm(gm, g);
			}
		}
		System.out.println("----------------");
	}

	private void print_the_gm(GoalModel gm, IRNode root) {
		if (root == null)
			return;
		Hashtable<Intention, IRNode> table = tables.get(gm);
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			IRNode edge = (IRNode) gm.graph.getChildEdge(root, i);
			String name = get_goal_name(gm, g);
			String type = get_edge_type(gm, edge);
			System.err.println(get_goal_name(gm, root) + "-" + type + "-> "
					+ name);
			print_the_gm(gm, g);
		}
	}

	private void modify_edited_goal_model(GoalModel gm, Resource resource) {
		Hashtable<Intention, IRNode> table = get_mapping_table(gm);
		IRNode root = mirror_intention_nodes(gm, resource, table);
		mirror_links_to_edges(gm, resource, table, root);
	}

	private void mirror_links_to_edges(GoalModel gm, Resource resource,
			Hashtable<Intention, IRNode> table, IRNode root) {
		HashSet<IRNode> alledges = getAllEdges(gm, root);
		System.err.println("all edges = " + alledges.size());
		HashSet<IRNode> existing_edges = new HashSet<IRNode>();
		int count = 0;
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Contribution) {
				Contribution c = (Contribution) o;
				Intention s = c.getSource();
				Intention t = c.getTarget();
				IRNode n_s = table.get(s);
				IRNode n_t = table.get(t);
				if (n_s != null && n_t != null) {
					boolean found = false;
					int numChildren = gm.graph.numChildren(n_s);
					for (int j = 0; j < numChildren; j++) {
						IRNode node = (IRNode) gm.graph.getChild(n_s, j);
						IRNode edge = (IRNode) gm.graph.getChildEdge(n_s, j);
						String type = gm.getGMNodeName(edge);
						if (node == n_t
								&& (type.equals("+")
										&& c instanceof HelpContribution
										|| type.equals("++")
										&& c instanceof MakeContribution
										|| type.equals("-")
										&& c instanceof HurtContribution || type
										.equals("--")
										&& c instanceof BreakContribution)) { // existing edge
						//							System.out.println("FOUND!");
							found = true;
							existing_edges.add(edge);
							break;
						}
					}
					if (!found) {
						IRNode edge = insert_an_edge(gm, table, c, s, t);
						if (edge != null) {
							existing_edges.add(edge);
						} else {
							count++;
						}
					}
				} else {
					IRNode edge = insert_an_edge(gm, table, c, s, t);
					if (edge != null) {
						existing_edges.add(edge);
					} else {
						System.out.println("Not inserted edge: " + s.getName()
								+ " " + t.getName());
						count++;
					}
				}
			} else if (o instanceof Decomposition) {
				Decomposition c = (Decomposition) o;
				Intention s = c.getSource();
				Intention t = c.getTarget();
				IRNode n_s = table.get(s);
				IRNode n_t = table.get(t);
				if (n_s != null && n_t != null) {
					boolean found = false;
					int numChildren = gm.graph.numChildren(n_s);
					for (int j = 0; j < numChildren; j++) {
						IRNode node = (IRNode) gm.graph.getChild(n_s, j);
						IRNode edge = (IRNode) gm.graph.getChildEdge(n_s, j);
						String type = get_edge_type(gm, edge);
						if (node == n_t
								&& (type.equals("AND")
										&& c instanceof AndDecomposition || type
										.equals("OR")
										&& c instanceof OrDecomposition)) { // existing edge
							found = true;
							existing_edges.add(edge);
							break;
						}
					}
					if (!found) {
						IRNode edge = insert_an_edge(gm, table, c, s, t);
						if (edge != null) {
							existing_edges.add(edge);
						} else {
							count++;
						}
					}
				} else {
					IRNode edge = insert_an_edge(gm, table, c, s, t);
					if (edge != null) {
						existing_edges.add(edge);
					} else {
						count++;
					}
				}
			}
		}
		System.err.println("inserted edges = " + count);
		count = 0;
		for (IRNode e : alledges) {
			if (!existing_edges.contains(e)) {
				gm.graph.disconnect(e);
				count++;
			}
		}
		System.err.println("deleted edges = " + count);
	}

	private IRNode mirror_intention_nodes(GoalModel gm, Resource resource,
			Hashtable<Intention, IRNode> table) {
		HashSet<String> set = new HashSet<String>();
		IRNode root = gm.getRoot();
		// rename nodes
		HashSet<IRNode> renamed = new HashSet<IRNode>();
		HashSet<String> to_add = new HashSet<String>();
		Hashtable<String, Boolean> to_add_type = new Hashtable<String, Boolean>();
		rename_mirrored_nodes(gm, resource, table, set, root, renamed, to_add,
				to_add_type);
		add_mirrored_nodes(gm, root, to_add, to_add_type);
		delete_unmirrored_nodes(gm, table, set, root);
		return root;
	}

	private Hashtable<Intention, IRNode> get_mapping_table(GoalModel gm) {
		Hashtable<Intention, IRNode> table = tables.get(gm);
		if (table == null) {
			table = new Hashtable<Intention, IRNode>();
			tables.put(gm, table);
		}
		return table;
	}

	private void rename_mirrored_nodes(GoalModel gm, Resource resource,
			Hashtable<Intention, IRNode> table, HashSet<String> set,
			IRNode root, HashSet<IRNode> renamed, HashSet<String> to_add,
			Hashtable<String, Boolean> to_add_type) {
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Intention) {
				Intention i = (Intention) o;
				// origin analysis first for renaming operation:
				// YY: if the table is still inside memory, chances are the element is still live in memory
				//     thus can be found by it's object id
				boolean origin_found = false;
				IRNode g = table.get(i);
				if (g != null) {
					String name = get_goal_name(gm, g);
					set.add(name);
					if (!name.equals(i.getName())) {
						if (i instanceof Goal)
							gm.setHardGoalName(g, i.getName());
						else if (i instanceof Softgoal) {
							gm.setSoftGoalName(g, i.getName());
						}
						renamed.add(g);
						table.remove(name);
						table.put(i, g);
						continue;
					}
				} else {
					String name = i.getName();
					// fixing origin
					int numChildren = gm.graph.numChildren(root);
					Boolean found = false;
					for (int j = 0; j < numChildren; j++) {
						IRNode g1 = (IRNode) gm.graph.getChild(root, j);
						String name1 = get_goal_name(gm, g1);
						if (name.equals(name1)) {
							found = true;
							table.put(i, g1);
							break;
						}
					}
					if (!found) { // really new nodes 
						to_add.add(name);
						to_add_type.put(name, i instanceof Goal);
					}
					set.add(name);
				}
			}
		}
		System.err.println("renamed size= " + renamed.size());
	}

	private void add_mirrored_nodes(GoalModel gm, IRNode root,
			HashSet<String> to_add, Hashtable<String, Boolean> to_add_type) {
		System.err.println("added size= " + to_add.size());
		for (String name : to_add) {
			Boolean is_hardgoal = to_add_type.get(name);
			IRNode g = gm.createAGoal(name, is_hardgoal);
			IRNode vedge = gm.createEdge("virtual");
			gm.connect(root, g, vedge);
			System.out.println("add " + (is_hardgoal ? "Goal" : "Softgoal")
					+ ":" + name);
			//			System.err.println("added name: " + name);
		}
	}

	private void delete_unmirrored_nodes(GoalModel gm,
			Hashtable<Intention, IRNode> table, HashSet<String> set, IRNode root) {
		// really old nodes removed from table
		HashSet<IRNode> delete = new HashSet<IRNode>();
		//		System.err.println("renamed and added names: " + set.size());			
		//		for (String name: set) {
		//			System.err.println("name to compare: " + name);			
		//		}
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			String name = get_goal_name(gm, g);
			String type = get_goal_type(gm, g);
			//			System.err.println("compare name: " + name);
			if (!set.contains(name)) {
				System.out.println("delete " + (type + ":" + name));
				delete.add(g);
			}
		}
		System.err.println("deleted size= " + delete.size());
		for (IRNode g : delete) {
			gm.graph.removeNode(g);
			table.remove(g);
		}
	}

	private HashSet<IRNode> getAllEdges(GoalModel gm, IRNode root) {
		int numChildren;
		HashSet<IRNode> alledges = new HashSet<IRNode>();
		numChildren = gm.graph.numChildren(root);
		for (int j = 0; j < numChildren; j++) {
			IRNode g = gm.graph.getChild(root, j);
			alledges.addAll(allEdges(gm, g));
		}
		return alledges;
	}

	private HashSet<IRNode> allEdges(GoalModel gm, IRNode root) {
		HashSet<IRNode> set = new HashSet<IRNode>();
		int numChildren = gm.graph.numChildren(root);
		for (int j = 0; j < numChildren; j++) {
			IRNode e = gm.graph.getChildEdge(root, j);
			set.add(e);
			IRNode g = gm.graph.getChild(root, j);
			set.addAll(allEdges(gm, g));
		}
		return set;
	}

	private String get_goal_name(GoalModel gm, IRNode g) {
		if (g == null)
			return null;
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(0, name.indexOf("_"));
		name = name.substring(name.indexOf("_") + 1);
		return name;
	}

	private String get_goal_type(GoalModel gm, IRNode g) {
		if (g == null)
			return null;
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(0, name.indexOf("_"));
		return prefix;
	}

	private String get_edge_type(GoalModel gm, IRNode g) {
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(name.indexOf("_") + 1);
		return prefix;
	}

	//	private void insert_existing_edge(GoalModel gm, Hashtable<Intention, IRNode> table2, GoalModel gm2, Intention s, Intention t, String type) {
	//		IRNode new_s = table2.get(s);
	//		IRNode new_t = table2.get(t);
	//		IRNode new_e = gm.createEdge(type);
	//		gm2.graph.connect(new_e, new_s, new_t);
	//	}
	private IRNode insert_an_edge(GoalModel gm,
			Hashtable<Intention, IRNode> table, Contribution c, Intention s,
			Intention t) {
		String type = get_label_from_type(c);
		IRNode edge = find_an_edge(gm, table, type, s, t);
		if (edge == null) {
			IRNode new_e = gm.createEdge(type);
			if (table.get(s) != null && table.get(t) != null) {
				gm.graph.connect(new_e, table.get(s), table.get(t));
				edge = new_e;
			}
		}
		return edge;
	}

	private String get_label_from_type(Contribution c) {
		String type = "+";
		if (c instanceof MakeContribution)
			type = "++";
		else if (c instanceof HurtContribution)
			type = "-";
		else if (c instanceof BreakContribution)
			type = "--";
		return type;
	}

	private IRNode insert_an_edge(GoalModel gm,
			Hashtable<Intention, IRNode> table, Decomposition c, Intention s,
			Intention t) {
		String type = get_label_from_type(c);
		IRNode edge = find_an_edge(gm, table, type, s, t);
		if (edge == null) {
			IRNode new_e = gm.createEdge(type);
			if (table.get(s) != null && table.get(t) != null) {
				gm.graph.connect(new_e, table.get(s), table.get(t));
				//				System.out.println("+ edge: " + s.getName() + ", " + t.getName());
				edge = new_e;
			}
		}
		return edge;
	}

	private IRNode find_an_edge(GoalModel gm,
			Hashtable<Intention, IRNode> table, String type, Intention s,
			Intention t) {
		IRNode edge = null;
		IRNode new_s = table.get(s);
		IRNode new_t = table.get(t);
		if (new_s == null || new_t == null) {
			IRNode root = gm.getRoot();
			int n = gm.graph.numChildren(root);
			for (int i = 0; i < n; i++) {
				IRNode g = gm.graph.getChild(root, i);
				String name = get_goal_name(gm, g);
				if (name.equals(s.getName())) {
					table.put(s, g);
					new_s = g;
				}
				if (name.equals(t.getName())) {
					table.put(t, g);
					new_t = g;
				}
			}
		}
		if (new_s != null && new_t != null) {
			int n = gm.graph.numChildren(new_s);
			for (int i = 0; i < n; i++) {
				IRNode g = gm.graph.getChild(new_s, i);
				IRNode e = gm.graph.getChildEdge(new_s, i);
				String lbl = get_edge_type(gm, e);
				if (g == new_t && type.equals(lbl)) {
					edge = e;
					break;
				}
			}
		}
		return edge;
	}

	private String get_label_from_type(Decomposition c) {
		String type = "AND";
		if (c instanceof OrDecomposition)
			type = "OR";
		return type;
	}

	private IRNode add_mapping_if_not_in_table(GoalModel gm,
			Hashtable<Intention, IRNode> table, Intention s, IRNode new_s) {
		return new_s;
	}

	/**
	 * @generated
	 */
	public IEditorInput createInputWithEditingDomain(IEditorInput editorInput,
			TransactionalEditingDomain domain) {
		return editorInput;
	}

	/**
	 * @generated
	 */
	public IDiagramDocument getDiagramDocument(Object element) {
		IDocument doc = getDocument(element);
		if (doc instanceof IDiagramDocument) {
			return (IDiagramDocument) doc;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IRunnableContext getOperationRunner(IProgressMonitor monitor) {
		return null;
	}

	/**
	 * @generated
	 */
	protected class ResourceSetInfo extends ElementInfo {

		/**
		 * @generated
		 */
		private long myModificationStamp = IResource.NULL_STAMP;

		/**
		 * @generated
		 */
		private WorkspaceSynchronizer mySynchronizer;

		/**
		 * @generated
		 */
		private Collection myUnSynchronizedResources = new ArrayList();

		/**
		 * @generated
		 */
		private IDiagramDocument myDocument;

		/**
		 * @generated
		 */
		private IEditorInput myEditorInput;

		/**
		 * @generated
		 */
		private boolean myUpdateCache = true;

		/**
		 * @generated
		 */
		private boolean myModifiable = false;

		/**
		 * @generated
		 */
		private boolean myReadOnly = true;

		/**
		 * @generated
		 */
		private ResourceSetModificationListener myResourceSetListener;

		/**
		 * @generated
		 */
		public ResourceSetInfo(IDiagramDocument document,
				IEditorInput editorInput) {
			super(document);
			myDocument = document;
			myEditorInput = editorInput;
			startResourceListening();
			myResourceSetListener = new ResourceSetModificationListener(this);
			getResourceSet().eAdapters().add(myResourceSetListener);
		}

		/**
		 * @generated
		 */
		public long getModificationStamp() {
			return myModificationStamp;
		}

		/**
		 * @generated
		 */
		public void setModificationStamp(long modificationStamp) {
			myModificationStamp = modificationStamp;
		}

		/**
		 * @generated
		 */
		public TransactionalEditingDomain getEditingDomain() {
			return myDocument.getEditingDomain();
		}

		/**
		 * @generated
		 */
		public ResourceSet getResourceSet() {
			return getEditingDomain().getResourceSet();
		}

		/**
		 * @generated
		 */
		public IEditorInput getEditorInput() {
			return myEditorInput;
		}

		/**
		 * @generated
		 */
		public void dispose() {
			stopResourceListening();
			getResourceSet().eAdapters().remove(myResourceSetListener);
			for (Iterator it = getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource resource = (Resource) it.next();
				resource.unload();
			}
		}

		/**
		 * @generated
		 */
		public boolean isSynchronized() {
			return myUnSynchronizedResources.size() == 0;
		}

		/**
		 * @generated
		 */
		public void setUnSynchronized(Resource resource) {
			myUnSynchronizedResources.add(resource);
		}

		/**
		 * @generated
		 */
		public void setSynchronized(Resource resource) {
			myUnSynchronizedResources.remove(resource);
		}

		/**
		 * @generated
		 */
		public final void stopResourceListening() {
			mySynchronizer.dispose();
			mySynchronizer = null;
		}

		/**
		 * @generated
		 */
		public final void startResourceListening() {
			mySynchronizer = new WorkspaceSynchronizer(getEditingDomain(),
					new SynchronizerDelegate());
		}

		/**
		 * @generated
		 */
		public boolean isUpdateCache() {
			return myUpdateCache;
		}

		/**
		 * @generated
		 */
		public void setUpdateCache(boolean update) {
			myUpdateCache = update;
		}

		/**
		 * @generated
		 */
		public boolean isModifiable() {
			return myModifiable;
		}

		/**
		 * @generated
		 */
		public void setModifiable(boolean modifiable) {
			myModifiable = modifiable;
		}

		/**
		 * @generated
		 */
		public boolean isReadOnly() {
			return myReadOnly;
		}

		/**
		 * @generated
		 */
		public void setReadOnly(boolean readOnly) {
			myReadOnly = readOnly;
		}

		/**
		 * @generated
		 */
		private class SynchronizerDelegate implements
				WorkspaceSynchronizer.Delegate {

			/**
			 * @generated
			 */
			public void dispose() {
			}

			/**
			 * @generated
			 */
			public boolean handleResourceChanged(final Resource resource) {
				synchronized (ResourceSetInfo.this) {
					if (ResourceSetInfo.this.fCanBeSaved) {
						ResourceSetInfo.this.setUnSynchronized(resource);
						return true;
					}
				}
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						handleElementChanged(ResourceSetInfo.this, resource,
								null);
					}
				});
				return true;
			}

			/**
			 * @generated
			 */
			public boolean handleResourceDeleted(Resource resource) {
				synchronized (ResourceSetInfo.this) {
					if (ResourceSetInfo.this.fCanBeSaved) {
						ResourceSetInfo.this.setUnSynchronized(resource);
						return true;
					}
				}
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						fireElementDeleted(ResourceSetInfo.this
								.getEditorInput());
					}
				});
				return true;
			}

			/**
			 * @generated
			 */
			public boolean handleResourceMoved(Resource resource,
					final URI newURI) {
				synchronized (ResourceSetInfo.this) {
					if (ResourceSetInfo.this.fCanBeSaved) {
						ResourceSetInfo.this.setUnSynchronized(resource);
						return true;
					}
				}
				if (myDocument.getDiagram().eResource() == resource) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							handleElementMoved(ResourceSetInfo.this
									.getEditorInput(), newURI);
						}
					});
				} else {
					handleResourceDeleted(resource);
				}
				return true;
			}

		}

	}

	/**
	 * @generated
	 */
	private class ResourceSetModificationListener extends EContentAdapter {

		/**
		 * @generated
		 */
		private NotificationFilter myModifiedFilter;

		/**
		 * @generated
		 */
		private ResourceSetInfo myInfo;

		/**
		 * @generated
		 */
		public ResourceSetModificationListener(ResourceSetInfo info) {
			myInfo = info;
			myModifiedFilter = NotificationFilter.createEventTypeFilter(
					Notification.SET).or(
					NotificationFilter
							.createEventTypeFilter(Notification.UNSET)).and(
					NotificationFilter.createFeatureFilter(Resource.class,
							Resource.RESOURCE__IS_MODIFIED));
		}

		/**
		 * @generated
		 */
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof ResourceSet) {
				super.notifyChanged(notification);
			}
			if (!notification.isTouch()
					&& myModifiedFilter.matches(notification)) {
				if (notification.getNotifier() instanceof Resource) {
					Resource resource = (Resource) notification.getNotifier();
					if (resource.isLoaded()) {
						boolean modified = false;
						for (Iterator it = myInfo.getResourceSet()
								.getResources().iterator(); it.hasNext()
								&& !modified;) {
							Resource nextResource = (Resource) it.next();
							if (nextResource.isLoaded()) {
								modified = nextResource.isModified();
							}
						}
						boolean dirtyStateChanged = false;
						synchronized (myInfo) {
							if (modified != myInfo.fCanBeSaved) {
								myInfo.fCanBeSaved = modified;
								dirtyStateChanged = true;
							}
							if (!resource.isModified()) {
								myInfo.setSynchronized(resource);
							}
						}
						if (dirtyStateChanged) {
							fireElementDirtyStateChanged(myInfo
									.getEditorInput(), modified);

							if (!modified) {
								myInfo
										.setModificationStamp(computeModificationStamp(myInfo));
							}
						}
					}
				}
			}
		}
	}

}
