package edu.toronto.cs.ome.eclipse;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

/**
 * Contributes eclipse-based actions to OpenOME editors.
 */
public class EditActionContributor extends EditorActionBarContributor {
	protected Editor activeEditor = null;
	protected IMenuManager viewMenu = null;
	protected IToolBarManager toolbar = null;
	protected Action detachTabAction = null;

	public EditActionContributor() {
		super();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToMenu(org.eclipse.jface.action.IMenuManager)
	 */
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);
		// Note: The following attempts to help alleviate the fact that the 'Save' menu
		// choice is not always kept synchronized with the editor state. Here we ensure
		// that the action is enabled propertly on drop-down of the file menu. When an
		// alternative/better method is discovered, this code should be removed.
		IMenuManager fileMgr = menuManager.findMenuUsingPath(IWorkbenchActionConstants.M_FILE);
		if (fileMgr != null)
			fileMgr.addMenuListener(new IMenuListener() {
				public void menuAboutToShow(IMenuManager manager) {
					if (activeEditor != null) {
						IContributionItem[] items = manager.getItems();
						for (int i = 0; i < items.length; i++) {
							if (items[i] instanceof ActionContributionItem
								&& ((ActionContributionItem) items[i]).getAction().getId().equals(ITextEditorActionConstants.SAVE))
							{
								(((ActionContributionItem) items[i]).getAction()).setEnabled(activeEditor.isDirty());
								break;
							}
						}
					}
				}
			});
		
		// Contribute menu items to the 'View' drop-down ...
		IMenuManager editMgr = menuManager.findMenuUsingPath(IWorkbenchActionConstants.M_EDIT);
		try {
			menuManager.remove(ActionProviderIF.M_Viewer);
		} catch (IllegalArgumentException e) {
			// Ignore ... ID not found
		}
		if (viewMenu == null || viewMenu.isDirty() || viewMenu.isEmpty()) {
			viewMenu = new MenuManager(I18n.getI18nString("_UI_Action_Viewer_menu_label"), ActionProviderIF.M_Viewer);
			viewMenu.add(new Separator(ActionProviderIF.S_Viewer_start));

			populateViewerMenu(viewMenu);

			viewMenu.add(new Separator(ActionProviderIF.S_Viewer_additions));
			viewMenu.add(new Separator(ActionProviderIF.S_Viewer_end));
		}
		menuManager.insertAfter(editMgr.getId(), viewMenu);
		menuManager.updateAll(true);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToToolBar(org.eclipse.jface.action.IToolBarManager)
	 */
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager);
		toolbar = toolBarManager;
		IContributionItem[] items = toolBarManager.getItems();
		for (int i = 0; i < items.length; i++)
			toolBarManager.remove(items[i]);

		toolBarManager.add(new Separator(ActionProviderIF.S_Viewer_start));

		populateToolBar(toolBarManager);

		toolBarManager.add(new Separator(ActionProviderIF.S_Viewer_additions));
		toolBarManager.add(new Separator(ActionProviderIF.S_Viewer_end));
		toolBarManager.update(true);
	}
	protected Action getDetachTabAction() {
		if (detachTabAction == null) {
			detachTabAction = new Action("Detach Current Tab") {
				public void run() {
					if (activeEditor != null)
						activeEditor.detachCurrentProjectTab();
				}
			};
			detachTabAction.setAccelerator(SWT.CTRL | 'T');
			detachTabAction.setImageDescriptor(I18n.getImageDescriptor("action_detach.gif"));
			detachTabAction.setToolTipText("Displays the current Protege project tab in a new window.");
		}
		return detachTabAction;
	}
	/**
	 * Invoked during toolbar creation to populate the main grouping
	 * for the viewer (prior to the "additions" section).
	 * @param toolbar
	 */
	protected void populateToolBar(IToolBarManager toolbar) {
		toolbar.add(getDetachTabAction());
	}

	/**
	 * Invoked during menu creation to populate the main grouping
	 * of the viewer menu (prior to the "additions" section).
	 * @param viewerMenu
	 */
	protected void populateViewerMenu(IMenuManager viewerMenu) {
		viewerMenu.add(getDetachTabAction());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorActionBarContributor#setActiveEditor(org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IEditorPart part) {
		if ((activeEditor = (part instanceof Editor) ? (Editor) part : null)
				!= null)
			contributeToMenu(((IEditorSite) part.getSite()).getActionBars().getMenuManager());
		super.setActiveEditor(part);
	}
}