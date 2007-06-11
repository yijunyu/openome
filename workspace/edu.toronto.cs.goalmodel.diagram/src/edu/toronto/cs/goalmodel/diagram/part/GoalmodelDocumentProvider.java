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
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Level;
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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.MultiRule;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.DiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.StorageDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorStatusCodes;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.util.DiagramIOUtil;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.gmf.runtime.notation.Diagram;
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
public class GoalmodelDocumentProvider extends StorageDocumentProvider
		implements IDiagramDocumentProvider {
	/**
	 * @generated
	 */
	private final String myContentObjectURI;

	/**
	 * @generated
	 */
	public GoalmodelDocumentProvider() {
		this(null);
	}

	/**
	 * @generated
	 */
	public GoalmodelDocumentProvider(String rootObjectURI) {
		myContentObjectURI = rootObjectURI;
	}

	/**
	 * @generated
	 */
	protected ElementInfo createElementInfo(Object element)
			throws CoreException {
		if (false == element instanceof FileEditorInputProxy) {
			throw new CoreException(new Status(IStatus.ERROR,
					GoalmodelDiagramEditorPlugin.ID, 0,
					"Incorrect element used: " + element
							+ " instead of FileEditorInputProxy", null));
		}
		FileEditorInputProxy editorInput = (FileEditorInputProxy) element;
		IDiagramDocument document = (IDiagramDocument) createDocument(editorInput);

		ResourceSetInfo info = new ResourceSetInfo(document, editorInput);
		info.setModificationStamp(computeModificationStamp(info));
		info.fStatus = null;
		ResourceSetModificationListener modificationListener = new ResourceSetModificationListener(
				info);
		info.getResourceSet().eAdapters().add(modificationListener);
		return info;
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
		return new DiagramDocument();
	}

	/**
	 * @generated
	 */
	protected boolean setDocumentContent(IDocument document,
			IEditorInput editorInput) throws CoreException {
		if (editorInput instanceof FileEditorInputProxy
				&& document instanceof IDiagramDocument) {
			FileEditorInputProxy editorInputProxy = (FileEditorInputProxy) editorInput;
			IDiagramDocument diagramDocument = (IDiagramDocument) document;
			diagramDocument.setEditingDomain(editorInputProxy
					.getEditingDomain());
		}
		return super.setDocumentContent(document, editorInput);
	}

	/**
	 * @generated
	 */
	protected void setDocumentContentFromStorage(IDocument document,
			IStorage storage) throws CoreException {
		IDiagramDocument diagramDocument = (IDiagramDocument) document;
		Diagram diagram = diagramDocument.getDiagram();

		TransactionalEditingDomain domain = diagramDocument.getEditingDomain();
		diagram = DiagramIOUtil.load(domain, storage, true,
				getProgressMonitor());
		if (myContentObjectURI != null
				&& diagram != null
				&& diagram.eResource() != null
				&& !diagram.eResource().getURIFragment(diagram).equals(
						myContentObjectURI)) {
			EObject anotherContentObject = diagram.eResource().getEObject(
					myContentObjectURI);
			document.setContent(anotherContentObject);
		} else {
			document.setContent(diagram);
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
	public long getSynchronizationStamp(Object element) {
		if (element instanceof FileEditorInputProxy) {
			ResourceSetInfo info = getResourceSetInfo(element);
			if (info != null) {
				return info.getModificationStamp();
			}
		}
		return super.getSynchronizationStamp(element);
	}

	/**
	 * @generated
	 */
	public boolean isDeleted(Object element) {
		if (element instanceof IFileEditorInput) {
			IFileEditorInput input = (IFileEditorInput) element;
			IPath path = input.getFile().getLocation();
			if (path == null) {
				return true;
			}
			return !path.toFile().exists();
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
	public boolean isModifiable(Object element) {
		if (!isStateValidated(element)) {
			if (element instanceof FileEditorInputProxy) {
				return true;
			}
		}
		return super.isModifiable(element);
	}

	/**
	 * @generated
	 */
	protected void updateCache(IStorageEditorInput input) throws CoreException {
		ResourceSetInfo info = getResourceSetInfo(input);
		if (info != null) {
			for (Iterator it = info.getResourceSet().getResources().iterator(); it
					.hasNext();) {
				Resource nextResource = (Resource) it.next();
				IFile file = WorkspaceSynchronizer.getFile(nextResource);
				if (file != null && file.isReadOnly()) {
					info.fIsReadOnly = true;
					info.fIsModifiable = false;
					return;
				}
			}
			info.fIsReadOnly = false;
			info.fIsModifiable = true;
			return;
		}
		super.updateCache(input);
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
		if (info != null && element instanceof FileEditorInputProxy) {
			handleResourcesChanged(info, info.getResourceSet().getResources(),
					monitor);
			return;
		}
		super.doSynchronize(element, monitor);
	}

	/**
	 * @generated
	 */
	protected void handleResourcesMoved(Map movedPathToResource) {
		for (Iterator it = movedPathToResource.entrySet().iterator(); it
				.hasNext();) {
			Entry nextEntry = (Entry) it.next();
			IPath newPath = (IPath) nextEntry.getKey();
			Resource resource = (Resource) nextEntry.getValue();
			resource.setURI(URI.createURI(newPath.toString()));
		}
	}

	/**
	 * @generated
	 */
	protected void markWholeResourceSetAsDirty(ResourceSet resourceSet) {
		for (Iterator it = resourceSet.getResources().iterator(); it.hasNext();) {
			Resource nextResource = (Resource) it.next();
			nextResource.setModified(true);
		}
	}

	/**
	 * @generated
	 */
	protected void handleResourcesChanged(ResourceSetInfo info,
			Collection changedResources, IProgressMonitor monitor) {
		info.stopResourceListening();
		for (Iterator it = changedResources.iterator(); it.hasNext();) {
			Resource nextResource = (Resource) it.next();
			IFile file = WorkspaceSynchronizer.getFile(nextResource);
			if (file != null) {
				try {
					file.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				} catch (CoreException e) {
					handleCoreException(e,
							"FileDocumentProvider.handleElementContentChanged");
				}
			}
			nextResource.unload();
		}
		info.startResourceListening();

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
	final static String MOLHADO_PLUGIN_NAME = "molhado";
	public static String getPluginInstallPath() {		
		URL url = FileLocator.find(
				Platform.getBundle(MOLHADO_PLUGIN_NAME), 
				new Path("repository"), 
				null);
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
		for (TreeIterator r = resource.getAllContents(); r
				.hasNext();) {
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
		for (TreeIterator r = resource.getAllContents(); r
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
		System.out.println(versions.get(file_name).intValue());
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
	    String project_name = model_name.substring(0, model_name.indexOf("/", 2));
		String property = System.getProperty("fluid.ir.path");
		if (property==null) {
			String toString = getPluginInstallPath();
			System.setProperty("fluid.ir.path", 
					toString);
			property = System.getProperty("fluid.ir.path");			
		}		
		try {
			int versionNumber = 0;
			Configuration config = Configuration.loadASCII(new FileReader(
					property + project_name + ".cfg"), IRPersistent.fluidFileLocator);
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
		name = name.substring(name.indexOf(":")+10);
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
		if (name.equals("VIRTUAL_ROOT")) {
			int numChildren = gm.graph.numChildren(root);
			for (int i = 0; i < numChildren; i++) {
				IRNode childedgenode = gm.graph.getChildEdge(root, i);
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
		// FIXME
		String name = gm.getGMNodeName(root);
		String prefix = name.substring(0, name.indexOf("_"));
		name = name.substring(name.indexOf("_") + 1);
		Intention g = null;
		if (!name.equals("VIRTUAL_ROOT")) {
			g = nodes.get(name);
		}
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode childedgenode = gm.graph.getChildEdge(root, i);
			IRNode childnode = gm.graph.getChild(root, i);
			if (childnode==null) continue;
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
				} else /* VIRTUAL_EDGE */ {
					// do nothing
				}
			}
			traverseGMResourcesForEdges(gm, f, m, childnode, childedgenode);
		}
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
	
	// check out
	private void checkOutAllVersionsFromRepository(
			Configuration config, String model_name) {
		java.util.Enumeration vs = config.getAllVersionNames();
		while (vs.hasMoreElements()) {
			String v1_name = (String) vs.nextElement();
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
		for (int i= 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			if (g!=null) {
				String name = get_goal_name(gm, g);
				String type = get_goal_type(gm, g);
				System.err.println(type + ": " + name);
				print_the_gm(gm, g);
			}
		}
		System.out.println("----------------");
	}
	private void print_the_gm(GoalModel gm, IRNode root) {
		if (root == null) return;
		Hashtable<Intention, IRNode> table = tables.get(gm);
		int numChildren = gm.graph.numChildren(root);
		for (int i= 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			IRNode edge = (IRNode) gm.graph.getChildEdge(root, i);
			String name = get_goal_name(gm, g);
			String type = get_edge_type(gm, edge);
			System.err.println(get_goal_name(gm, root) + "-" + type + "-> " + name);
			print_the_gm(gm, g);
		}
	}
	
	

	private void modify_edited_goal_model(GoalModel gm, Resource resource) {
		Hashtable<Intention, IRNode> table = tables.get(gm);
		if (table==null) {
			table = new Hashtable<Intention, IRNode> ();
			tables.put(gm, table);
		}
		HashSet<String> set = new HashSet<String>();
		IRNode root = gm.getRoot();
		// rename nodes
		HashSet<IRNode> renamed = new HashSet<IRNode>();
		HashSet<String> to_add = new HashSet<String>();
		Hashtable<String, Boolean> to_add_type = new Hashtable<String, Boolean>();
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Intention) {
				Intention i = (Intention) o;
				// origin analysis first for renaming operation:
				// YY: if the table is still inside memory, chances are the element is still live in memory
				//     thus can be found by it's object id
				boolean origin_found = false;
				IRNode g = table.get(i);
				if (g!=null) {
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
					for (int j= 0; j < numChildren; j++) {
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
		System.err.println("added size= " + to_add.size());
		for (String name: to_add) {
			IRNode g = gm.createAGoal(name, to_add_type.get(name));
			IRNode vedge = gm.createEdge("virtual");
			gm.connect(root, g, vedge);
//			System.err.println("added name: " + name);
		}
		// really old nodes removed from table
		HashSet<IRNode> delete = new HashSet<IRNode>();
//		System.err.println("renamed and added names: " + set.size());			
//		for (String name: set) {
//			System.err.println("name to compare: " + name);			
//		}
		int numChildren = gm.graph.numChildren(root);
		for (int i= 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			String name = get_goal_name(gm, g);
//			System.err.println("compare name: " + name);
			if (!set.contains(name)) {
				delete.add(g);
			}
		}
		System.err.println("deleted size= " + delete.size());
		for (IRNode g: delete) {
			gm.graph.removeNode(g);
			table.remove(g);
		}
		// now add the edges
		HashSet<IRNode> alledges = getAllEdges(gm, root);
		System.err.println("all edges = " + alledges.size());
		HashSet<IRNode> existing_edges = new HashSet<IRNode> ();
		int count = 0;
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Contribution) {
				Contribution c= (Contribution) o;
				Intention s = c.getSource();
				Intention t = c.getTarget();
				IRNode n_s = table.get(s);
				IRNode n_t = table.get(t);
				if (n_s!=null && n_t!=null) {
					boolean found = false;
					numChildren = gm.graph.numChildren(n_s);
					for (int j = 0; j < numChildren; j++) {
						IRNode node = (IRNode) gm.graph.getChild(n_s, j);
						IRNode edge = (IRNode) gm.graph.getChildEdge(n_s, j);
						String type = gm.getGMNodeName(edge);
						if (node == n_t && 
						   (  type.equals("+") && c instanceof HelpContribution
						   || type.equals("++") && c instanceof MakeContribution
						   || type.equals("-") && c instanceof HurtContribution
						   || type.equals("--") && c instanceof BreakContribution)) 
						{ // existing edge
//							System.out.println("FOUND!");
							found = true;
							existing_edges.add(edge);
							break;
						}
					}
					if (!found) {
						IRNode edge = insert_an_edge(gm, table, c, s, t);
						if (edge!=null) {
							existing_edges.add(edge);							
						} else {
							count ++;
						}
					}
				} else {
					IRNode edge = insert_an_edge(gm, table, c, s, t);
					if (edge!=null) {
						existing_edges.add(edge);							
					} else {
						count ++;
					}
				}
			} else if (o instanceof Decomposition) {
				Decomposition c= (Decomposition) o;
				Intention s = c.getSource();
				Intention t = c.getTarget();
				IRNode n_s = table.get(s);
				IRNode n_t = table.get(t);
				if (n_s!=null && n_t!=null) {
					boolean found = false;
					numChildren = gm.graph.numChildren(n_s);
					for (int j = 0; j < numChildren; j++) {
						IRNode node = (IRNode) gm.graph.getChild(n_s, j);
						IRNode edge = (IRNode) gm.graph.getChildEdge(n_s, j);
						String type = get_edge_type(gm, edge);
						if (node == n_t && 
						   (  type.equals("AND") && c instanceof AndDecomposition
						   || type.equals("OR") && c instanceof OrDecomposition)) 
						{ // existing edge
							found = true;
							existing_edges.add(edge);
							break;
						}
					}
					if (!found) {
						IRNode edge = insert_an_edge(gm, table, c, s, t);
						if (edge!=null) {
							existing_edges.add(edge);							
						} else {
							count ++;
						}
					}
				} else {
					IRNode edge = insert_an_edge(gm, table, c, s, t);
					if (edge!=null) {
						existing_edges.add(edge);							
					} else {
						count ++;
					}
				}
			}
		}		
		System.err.println("inserted edges = " + count);
		count = 0;
		for (IRNode e: alledges) {
			if (!existing_edges.contains(e)) {
				gm.graph.disconnect(e);
				count++;
			}
		}
		System.err.println("deleted edges = " + count);
	}

	private HashSet<IRNode> getAllEdges(GoalModel gm, IRNode root) {
		int numChildren;
		HashSet<IRNode> alledges = new HashSet<IRNode>();
		numChildren = gm.graph.numChildren(root);
		for (int j=0; j<numChildren; j++) {
			IRNode g = gm.graph.getChild(root, j);
			alledges.addAll(allEdges(gm, g));
		}
		return alledges;
	}

	private HashSet<IRNode> allEdges(GoalModel gm, IRNode root) {
		HashSet<IRNode> set = new HashSet<IRNode>();
		int numChildren = gm.graph.numChildren(root);
		for (int j=0; j<numChildren; j++) {
			IRNode e = gm.graph.getChildEdge(root, j);
			set.add(e);
			IRNode g = gm.graph.getChild(root, j);
			set.addAll(allEdges(gm, g));
		}
		return set;
	}

	private String get_goal_name(GoalModel gm, IRNode g) {
		if (g==null)
			return null;
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(0, name.indexOf("_"));
		name = name.substring(name.indexOf("_") + 1);
		return name;
	}
	private String get_goal_type(GoalModel gm, IRNode g) {
		if (g==null)
			return null;
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(0, name.indexOf("_"));
		return prefix;
	}

	private String get_edge_type(GoalModel gm, IRNode g) {
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(name.indexOf("_")+1);
		return prefix;
	}
//	private void insert_existing_edge(GoalModel gm, Hashtable<Intention, IRNode> table2, GoalModel gm2, Intention s, Intention t, String type) {
//		IRNode new_s = table2.get(s);
//		IRNode new_t = table2.get(t);
//		IRNode new_e = gm.createEdge(type);
//		gm2.graph.connect(new_e, new_s, new_t);
//	}
	private IRNode insert_an_edge(GoalModel gm, Hashtable<Intention, IRNode> table, Contribution c, Intention s, Intention t) {
		String type = get_label_from_type(c);
		IRNode edge = find_an_edge(gm, table, type, s, t);
		if (edge==null) {
			IRNode new_e = gm.createEdge(type);
			if (table.get(s)!=null && table.get(t)!=null)
				gm.graph.connect(new_e, table.get(s), table.get(t));
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
			Hashtable<Intention, IRNode> table, 
			Decomposition c, 
			Intention s, Intention t) {
		String type = get_label_from_type(c);
		IRNode edge = find_an_edge(gm, table, type, s, t);
		if (edge==null) {
			IRNode new_e = gm.createEdge(type);
			if (table.get(s)!=null && table.get(t)!=null)
				gm.graph.connect(new_e, table.get(s), table.get(t));
		}
		return edge;
	}

	private IRNode find_an_edge(GoalModel gm, Hashtable<Intention, IRNode> table, 
			String type, Intention s, Intention t) {
		IRNode edge = null;
		IRNode new_s = table.get(s);
		IRNode new_t = table.get(t);
		if (new_s == null) {
			IRNode root = gm.getRoot();
			int n = gm.graph.numChildren(root);
			for (int i=0; i<n; i++) {
				IRNode g = gm.graph.getChild(root, i);
				String name = get_goal_name(gm, g);
				if (name.equals(s.getName())) {
					table.put(s, g);
					new_s = g;
					break;
				}
				if (name.equals(t.getName())) {
					table.put(t, g);
					new_t = g;
					break;
				}
			}			
		}
		if (new_s!=null && new_t!=null) {
			int n = gm.graph.numChildren(new_s);
			for (int i=0; i<n; i++) {
				IRNode g = gm.graph.getChild(new_s, i);
				IRNode e = gm.graph.getChildEdge(new_s, i);
				String lbl = get_edge_type(gm, e);
				if (g==new_t && type.equals(lbl)) {
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

	private IRNode add_mapping_if_not_in_table(GoalModel gm, Hashtable<Intention, IRNode> table, Intention s, IRNode new_s) {
		return new_s;
	}
	/**
	 * @generated
	 */
	protected void handleElementMoved(FileEditorInputProxy input, IPath path) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IFile newFile = workspace.getRoot().getFile(path);
		fireElementMoved(input, newFile == null ? null : new FileEditorInput(
				newFile));
	}

	/**
	 * @generated
	 */
	protected void handleElementDeleted(FileEditorInputProxy input) {
		fireElementDeleted(input);
	}

	/**
	 * @generated
	 */
	public IEditorInput createInputWithEditingDomain(IEditorInput editorInput,
			TransactionalEditingDomain domain) {
		if (editorInput instanceof IFileEditorInput) {
			return new FileEditorInputProxy((IFileEditorInput) editorInput,
					domain);
		}
		assert false;
		return null;
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
	protected class ResourceSetInfo extends StorageInfo {

		/**
		 * @generated
		 */
		private long myModificationStamp = IResource.NULL_STAMP;

		/**
		 * @generated
		 */
		private ResourceSetSynchronizer mySynchronizer;

		/**
		 * @generated
		 */
		private ResourceSet myResourceSet;

		/**
		 * @generated
		 */
		private Collection myUnSynchronizedResources = new ArrayList();

		/**
		 * @generated
		 */
		private FileEditorInputProxy myEditorInput;

		/**
		 * @generated
		 */
		public ResourceSetInfo(IDiagramDocument document,
				FileEditorInputProxy editorInput) {
			super(document);
			myResourceSet = document.getEditingDomain().getResourceSet();
			myEditorInput = editorInput;
			mySynchronizer = new ResourceSetSynchronizer(this);
			startResourceListening();
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
		public ResourceSetSynchronizer getSynchronizer() {
			return mySynchronizer;
		}

		/**
		 * @generated
		 */
		public ResourceSet getResourceSet() {
			return myResourceSet;
		}

		/**
		 * @generated
		 */
		public FileEditorInputProxy getEditorInput() {
			return myEditorInput;
		}

		/**
		 * @generated
		 */
		public void dispose() {
			stopResourceListening();
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
		public void setSynchronized() {
			myUnSynchronizedResources.clear();
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
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(
					mySynchronizer);
		}

		/**
		 * @generated
		 */
		public final void startResourceListening() {
			ResourcesPlugin.getWorkspace().addResourceChangeListener(
					mySynchronizer, IResourceChangeEvent.POST_CHANGE);
		}

	}

	/**
	 * @generated
	 */
	protected class ResourceSetSynchronizer implements IResourceChangeListener {

		/**
		 * @generated
		 */
		private ResourceSetInfo myInfo;

		/**
		 * @generated
		 */
		protected ResourceSetSynchronizer(ResourceSetInfo info) {
			myInfo = info;
		}

		/**
		 * @generated
		 */
		public void resourceChanged(IResourceChangeEvent event) {
			final ResourceDeltaVisitor deltaVisitor = new ResourceDeltaVisitor();
			try {
				event.getDelta().accept(deltaVisitor);
			} catch (CoreException e) {
				handleCoreException(e, "FileDocumentProvider.resourceChanged");
			}
			synchronized (myInfo) {
				if (!myInfo.isSynchronized()) {
					return;
				}
			}

			Display.getDefault().asyncExec(new Runnable() {

				public void run() {
					if (deltaVisitor.getDeletedResources().size() > 0) {
						// Just closing editor
						handleElementDeleted(myInfo.getEditorInput());
						return;
					}

					Entry diagramEntry = getDiagramResourceEntry(deltaVisitor
							.getMovedResourcesMap());
					if (diagramEntry != null) {
						deltaVisitor.getMovedResourcesMap().remove(
								diagramEntry.getKey());
						// Setting new editor input since diagram file was
						// renamed Could be processed together with the rest of
						// moved resources if FileEditorInputProxy will wupport
						// IFileEditorInput substitution
						handleElementMoved(myInfo.getEditorInput(),
								(IPath) diagramEntry.getKey());
					}
					if (deltaVisitor.getMovedResourcesMap().size() > 0) {
						handleResourcesMoved(deltaVisitor
								.getMovedResourcesMap());
					}
					if (deltaVisitor.getChangedResources().size() > 0
							|| deltaVisitor.getMovedResourcesMap().size() > 0) {
						// reloading changed resources + changing URIs for moved
						// resources
						handleResourcesChanged(myInfo, deltaVisitor
								.getChangedResources(), null);
					}
					if (deltaVisitor.getMovedResourcesMap().size() > 0) {
						// Marking whole ResourceSet as changed to preserve
						// changes in resource URIs made by
						// handleResourcesMoved() call
						markWholeResourceSetAsDirty(myInfo.getResourceSet());
					}
				}
			});
		}

		/**
		 * @generated
		 */
		private Entry getDiagramResourceEntry(Map movedResources) {
			for (Iterator it = movedResources.entrySet().iterator(); it
					.hasNext();) {
				Entry nextEntry = (Entry) it.next();
				Resource nextResource = (Resource) nextEntry.getValue();
				IFile file = WorkspaceSynchronizer.getFile(nextResource);
				if (file != null
						&& file.equals(myInfo.getEditorInput().getFile())) {
					return nextEntry;
				}
			}
			return null;
		}

		/**
		 * @generated
		 */
		private class ResourceDeltaVisitor implements IResourceDeltaVisitor {

			/**
			 * @generated
			 */
			private Collection myChangedResources = new ArrayList();

			/**
			 * @generated
			 */
			private Map myMovedResources = new HashMap();

			/**
			 * @generated
			 */
			private Collection myDeletedResources = new ArrayList();

			/**
			 * Can be called from any thread
			 * @generated
			 */
			public boolean visit(IResourceDelta delta) {
				if (delta.getFlags() != IResourceDelta.MARKERS
						&& delta.getResource().getType() == IResource.FILE) {
					if ((delta.getKind() & (IResourceDelta.CHANGED | IResourceDelta.REMOVED)) != 0) {
						Resource resource = myInfo.getResourceSet()
								.getResource(
										URI.createURI(delta.getFullPath()
												.toString()), false);
						if (resource != null && resource.isLoaded()) {
							synchronized (myInfo) {
								if (myInfo.fCanBeSaved) {
									myInfo.setUnSynchronized(resource);
									return false;
								}
							}
							if ((delta.getKind() & IResourceDelta.REMOVED) != 0) {
								// element could be either moved/deleted or
								// changed.
								if ((IResourceDelta.MOVED_TO & delta.getFlags()) != 0) {
									IPath destination = delta.getMovedToPath();
									myMovedResources.put(destination, resource);
								} else {
									myDeletedResources.add(resource);
								}
							} else {
								myChangedResources.add(resource);
							}
						}
					}
				}

				return true;
			}

			/**
			 * @generated
			 */
			public Collection getChangedResources() {
				return myChangedResources;
			}

			/**
			 * @generated
			 */
			public Collection getDeletedResources() {
				return myDeletedResources;
			}

			/**
			 * @generated
			 */
			public Map getMovedResourcesMap() {
				return myMovedResources;
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
			if (myModifiedFilter.matches(notification)) {
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
