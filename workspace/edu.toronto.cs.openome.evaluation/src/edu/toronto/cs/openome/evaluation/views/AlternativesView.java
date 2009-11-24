package edu.toronto.cs.openome.evaluation.views;

import java.util.ArrayList;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.runtime.IAdaptable;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class AlternativesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "edu.toronto.cs.openome.evaluation.views.AlternativesView";

	// need this to be a static
	// to support the singleton model
	private TreeViewer viewer;
	private TreeNode currAlternative;
	
	private DrillDownAdapter drillDownAdapter;
	
	private Action action1;
	private Action action2;
	private Action doubleClickAction;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	// This class associates each node in the tree with an object
	// Possible objects: Alternative, Intention, EvaluationLabel 
	class TreeObject implements IAdaptable {
		private String name;
		private TreeNode parent;
		
		// the object this TreeObject represents
		private Object obj;
		
		public TreeObject(String name, Object obj) {
			this.name = name;
			this.obj = obj;
		}
		public String getName() {
			return name;
		}
		public void setParent(TreeNode parent) {
			this.parent = parent;
		}
		public TreeNode getParent() {
			return parent;
		}
		public String toString() {
			return getName();
		}
		public Object getAdapter(Class key) {
			return null;
		}
		public void setObject(Object obj){
			this.obj = obj;
		}
		public Object getObject(){
			return this.obj;
		}
		public boolean equals(TreeObject to){
			return ((this.name == to.getName()) 
						&& (this.obj).equals(to.getObject()));
		}
		public boolean equalObject(Object o){
			return ((this.obj).equals(o));
		}
	}
	
	// TreeNode represents nodes with children
	class TreeNode extends TreeObject {
		private ArrayList<TreeObject> elements;
		public TreeNode(String name, Object obj) {
			super(name, obj);
			elements = new ArrayList<TreeObject>();
		}
		public void addChild(TreeObject child) {
			elements.add(child);
			child.setParent(this);
		}
		public void removeChild(TreeObject child) {
			elements.remove(child);
			child.setParent(null);
		}
		public TreeObject [] getChildren() {
			return (TreeObject [])elements.toArray(new TreeObject[elements.size()]);
		}
		public boolean hasChildren() {
			return elements.size()>0;
		}
		public int getNumOfChild(){
			return elements.size();
		}
	}
	
	// Need this to be public in order to change the view content
	public class ViewContentProvider implements IStructuredContentProvider, 
										   ITreeContentProvider {
		private TreeNode invisibleRoot;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				if (invisibleRoot==null) initialize();
				return getChildren(invisibleRoot);
			}
			return getChildren(parent);
		}
		public Object getParent(Object child) {
			if (child instanceof TreeObject) {
				return ((TreeObject)child).getParent();
			}
			return null;
		}
		public Object [] getChildren(Object parent) {
			if (parent instanceof TreeNode) {
				return ((TreeNode)parent).getChildren();
			}
			return new Object[0];
		}
		public boolean hasChildren(Object parent) {
			if (parent instanceof TreeNode)
				return ((TreeNode)parent).hasChildren();
			return false;
		}
		
		public TreeNode addNode (String name, String description) {
			TreeNode node = createTreeNode(name, description);
			addTreeNode(node);
			return node;
		}
		
		private boolean addTreeNode(TreeNode child) {
			invisibleRoot.addChild(child);
			return true;
		}
		
		private TreeNode createTreeNode(String name, String description) {
			TreeNode node = new TreeNode(name, null);
			return node;
			
		}
/*
 * We will set up a dummy model to initialize tree heararchy.
 * In a real code, you will connect to a real model and
 * expose its hierarchy.
 */
		private void initialize() {
//			TreeObject to1 = new TreeObject("Leaf 1");
//			TreeObject to2 = new TreeObject("Leaf 2");
//			TreeObject to3 = new TreeObject("Leaf 3");
//			TreeNode p1 = new TreeNode("Parent 1");
//			p1.addChild(to1);
//			p1.addChild(to2);
//			p1.addChild(to3);
//			
//			TreeObject to4 = new TreeObject("Leaf 4");
//			TreeNode p2 = new TreeNode("Parent 2");
//			p2.addChild(to4);
//			
//			TreeNode root = new TreeNode("Root");
//			root.addChild(p1);
//			root.addChild(p2);
//			
//			invisibleRoot = new TreeNode("");
//			invisibleRoot.addChild(root);
			
			
			
			// DEBUG
			// add bogus Alternative
			invisibleRoot = new TreeNode("", null);
			currAlternative = new TreeNode("TestAlternative", null);
//			TreeObject to3 = new TreeObject("Leaf 3", null);
//			currAlternative.addChild(to3);
			
			invisibleRoot.addChild(currAlternative);
		}
		
	}
	class ViewLabelProvider extends LabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}
		public Image getImage(Object obj) {
			String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
			if (obj instanceof TreeNode)
			   imageKey = ISharedImages.IMG_OBJ_FOLDER;
			return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
		}
	}
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public AlternativesView() {

	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "edu.toronto.cs.openome.evaluation.viewer");
		makeActions();
		hookContextMenu();
		
		// add the listener for double clicking 
		hookDoubleClickAction();
		// add the listener for selection changed
		hookSelectionChangedAction();
		
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				AlternativesView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
			
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				// get the very first object selected from the top 
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				
				// check if user double clicked on a human judgment
				// if so, change the label of the intention to this judgment
				// and propagate the change
				if (obj instanceof TreeObject){
					TreeObject to = (TreeObject) obj;
					if (to.getObject() instanceof HumanJudgement){
						HumanJudgement judgement = (HumanJudgement) to.getObject();
						// get the parent, which is the Intention this label is associated with
						// and change the label
						if (to.getParent().getObject() instanceof Intention){
							Intention inten = (Intention) to.getParent().getObject();
							// TODO: How do you change the label???
							// TODO: How do you propagate the change??????
//							inten.setQualitativeReasoningCombinedLabel(label);
							// DEBUG
							showMessage("Humanjudgement: " + judgement 
									+ "\nIntention: " + inten.getName()
									+ "\nAlternative: " + to.getParent().getParent().getName());
							return;
						}
					}
				}
				
				if (obj instanceof TreeNode){
					// expand the node
					viewer.expandToLevel(obj, 1);
				}
				
				showMessage("Double-click detected on "+obj.toString());
			}
		};
		
	}
	
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void hookSelectionChangedAction() {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO: Selection changed do something!
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Alternatives",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	public void addAlternative(String name, String description) {
		ViewContentProvider contentProvider =  (ViewContentProvider) viewer.getContentProvider();
		
		TreeNode newAlt = contentProvider.addNode(name, description);
		
		if (newAlt != null)
			// update the current alternative to work with
			setCurrAlternative(newAlt);
		
		refreshView();
	}
	
	public void refreshView() {

		viewer.refresh();
	}
	
	public void setCurrAlternative(TreeNode alternative){
		this.currAlternative = alternative;
	}
	
	public void addHumanJudgement(Intention intension, HumanJudgement judgement){
		// TODO: get the intention node and add the judgement to it if it exists
		// otherwise create a new intention node and add the new judgement
		TreeNode newIntentionNode = null;
		for (TreeObject to : currAlternative.getChildren()){
			Object o = to.getObject();
			if (o instanceof Intention){ // safety check
				if (((Intention) o).getName() == intension.getName()){
					if (to instanceof TreeNode) { // safety check
						// intention found
						newIntentionNode = (TreeNode) to;
						break;
					}
				}
			}
		}
		if (newIntentionNode == null){
			// create the new intention in the tree
			newIntentionNode = new TreeNode(intension.getName(), intension);
			// add the new intension into the tree
			currAlternative.addChild(newIntentionNode);
		}
		// add the human judgement
		newIntentionNode.addChild(new TreeObject("[HUMAN JUDGEMENT] " + (newIntentionNode.getNumOfChild() + 1) + ": " + judgement.toString(), judgement));
	}
}