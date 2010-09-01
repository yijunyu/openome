package edu.toronto.cs.openome.evaluation.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

import edu.toronto.cs.openome_model.Alternative;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class HumanJudgmentsView extends ViewPart
{
	public static final String ID = "edu.toronto.cs.openome.evaluation.views.HumanJudgmentsView";

	// need this to be a static to support the singleton model
	public static TreeViewer viewer;

	private DrillDownAdapter drillDownAdapter;
	
	// Action variables
	private Action refreshAction;
	private Action collapseAllAction;
	private Action expandAllAction;

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new ViewContentProvider(this));
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new ViewerSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "edu.toronto.cs.openome.evaluation.viewer");
		makeActions();
		hookContextMenu();
		contributeToActionBars();
		
		/* ISelectionListener will notify the view about every time the user changes/selects a model tab */
		ISelectionListener selectionChangeListener = new ISelectionListener() {
	        public void selectionChanged(IWorkbenchPart sourcepart, ISelection selection) {
	        	clearView();
	        	loadIntentions();
	        }
	    };
	    
	    final HumanJudgmentsView me = this;
	    
	    IPerspectiveListener perspectiveListener = new IPerspectiveListener() {
	    	@Override
			public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
				clearView();
				loadIntentions();
				refreshView();
			}

			@Override
			public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective, String changeId) {
				// This fixes the problem where Alternatives/Human Judgments
				// were shown even after all the editor tabs were closed.
				
				if(!changeId.equals("viewHide")) { // this check avoids a NullPointer when you close OpenOME
					// check that no editor tabs are open
					if(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage().getActiveEditor() == null) {
						// replace the contents with new empty ones
						viewer.setContentProvider(new ViewContentProvider(me));
					}
				}
			}
	    };
	    
	    // add listeners
	    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(selectionChangeListener);
	    PlatformUI.getWorkbench().getActiveWorkbenchWindow().addPerspectiveListener(perspectiveListener);

	    clearView();
    	loadIntentions();
    	refreshView();
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	/**
	 * Initialize the action buttons
	 * @param manager
	 */
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(collapseAllAction);
		manager.add(expandAllAction);
	}

	/**
	 *  Initialize the right-click drown down menu 
	 */
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				HumanJudgmentsView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(refreshAction);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	/** 
	 * Initialize the actions
	 */
	private void makeActions() {
		/**
		 *  Expand All Action - expands all nodes in the view
		 */
		expandAllAction = new Action() {
			public void run() {
				expandAll();
				
			}
		};
		expandAllAction.setText("Expand All");
		expandAllAction.setToolTipText("Expand All");
		expandAllAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_ELCL_COLLAPSEALL_DISABLED));
		
		
		/**
		 *  Collapse All Action - collapses all nodes in the view
		 */
		collapseAllAction = new Action() {
			public void run() {
				collapseAll();
				
			}
		};
		collapseAllAction.setText("Collapse All");
		collapseAllAction.setToolTipText("Collapse All");
		collapseAllAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_ELCL_COLLAPSEALL));
		
		/**
		 *  Refresh Action - refreshes the view
		 */
		refreshAction = new Action() {
			public void run() {								
				clearView();
				loadIntentions();
			}
		};
		
		refreshAction.setText("Refresh");
		refreshAction.setToolTipText("Refresh");
		refreshAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
	}

	/**
	 * Clears all content from the Alternatives view
	 */
	private void clearView() {
		/* Get the viewer's content provider */ 
		ViewContentProvider contentProvider = (ViewContentProvider) viewer
		.getContentProvider();
		
		/* Remove all nodes from the content provider */
		contentProvider.removeAllNodes();
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	/**
	 * Refresh the view
	 * @author aftabs
	 */
	public void refreshView() {
		viewer.refresh();
	}

	/**
	 * Collapses all nodes in the view
	 */
	private void collapseAll() {
		viewer.collapseAll();
	}
	
	/**
	 * Expands all nodes in the view
	 */
	private void expandAll() {
		viewer.expandAll();
	}
	
	/**
	 * Loads Intentions from the model into the view
	 */
	private void loadIntentions() {
		ModelImpl mi = ModelInstance.getModelImpl();
		
		if(mi != null) {
			/* Get a list of all the Intentions currently in the model */
			EList<Intention> ints = mi.getAllIntentions();
			EList<Alternative> alts = mi.getAlternatives();
			
			/* Add each Intention to the view */
			for(Intention i : ints) {
				addIntention(i, alts);
			}
		}
		
		refreshView();
	}
	
	/**
	 * Add the Intention to the View, and all its qualitative labels.
	 */
	public void addIntention(Intention i, EList<Alternative> alts) {
		// Get the content provider
		ViewContentProvider contentProvider = (ViewContentProvider)viewer.getContentProvider();
		
		// Add a node in the viewer tree structure
		TreeNode node = contentProvider.addNode(i);
		node.setAlternateStatus(false);
		
		contentProvider.addHumanJudgment(node, i, alts);
		
		refreshView();
	}
}
