package edu.toronto.cs.q7.plugin.popup.actions;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import edu.toronto.cs.q7.q7;
import edu.toronto.cs.q7.plugin.Activator;

public class ConvertAction implements IObjectActionDelegate {

	String from;
	String to;
	/**
	 * Constructor for XMIAction.
	 */
	public ConvertAction(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
	}

	// deprecated in 3.1.0? 		
	private static String getPluginInstallPath() {		
		Plugin p = Platform.getPlugin("edu.toronto.cs.q7.plugin");
		if (p!=null && p.getDescriptor()!=null) {
			URL url = p.getDescriptor().getInstallURL();
			String plugin_name = url.getFile();
			try {
			URL u = Platform.asLocalURL(url);
			return u.getPath() +
			"lib/plugins/edu.toronto.cs.ome";
			} catch (IOException e) {
			return url.getPath() +
			plugin_name.replaceAll("/plugin","plugins") + "lib/plugins/edu.toronto.cs.ome";
			}
		}
		return "";
	}

//  // 3.2M5a
//	private static String getPluginInstallPath() {
//		AbstractUIPlugin plugin = Activator.getDefault();
//		URL url = FileLocator.find(plugin.getBundle(), 
//				new Path("lib/plugins/edu.toronto.cs.ome"), 
//				null);
//		String s;
//		try {
//			s = FileLocator.toFileURL(url).getPath();
//			return s;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return "";
//		}
//	}
	
	// 3.2M5a TreeSelection
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 * @FIXME
	 */
//	public void selectionChanged(IAction action, ISelection selection) {
//		TreeSelection ts = (TreeSelection) selection;
//		TreePath tp [] =  ts.getPaths();
//		for (int i=0; i< tp.length; i++) {
//			TreePath p = tp[i];
//	        for (int j = 0; j < p.getSegmentCount(); j++ ) {
//				Object o = p.getSegment(j);
//				if (o instanceof IFile) {
//					IFile f = (IFile) o;
//					String args [] = new String[2];
//					if (f.exists()) {
//						String path = getPluginInstallPath();
//						System.setProperty("java.library.path", path);
//						String stem = f.getLocation().removeFileExtension().toOSString();
//						args[0] = stem + from;
//						args[1] = stem + to;
//	 					q7.main(args);
//					}
//					try {
//						f.getProject().refreshLocal(1, null);
//					} catch (CoreException e) {
//						e.printStackTrace();
//					}
//					String stem1 = f.getName().substring(0, f.getName().lastIndexOf("."));
//					String new_name = stem1 + to;
//					IFile f2 = f.getProject().getFile(new_name);
//					if (f2.exists())
//						openTheEditor(f2);
//				}
//			}
//		}
//	}
	
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		StructuredSelection ts = (StructuredSelection) selection;
		Object tp [] = ts.toArray();
		for (int i=0; i< tp.length; i++) {
			IFile f = (IFile) tp[i];
			String args [] = new String[2];
			if (f.exists()) {
				String path = getPluginInstallPath();
				System.setProperty("java.library.path", path);
				String stem = f.getLocation().removeFileExtension().toOSString();
				args[0] = stem + from;
				args[1] = stem + to;
				q7.main(args);
			}
			try {
				f.getProject().refreshLocal(1, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
			String stem1 = f.getName().substring(0, f.getName().lastIndexOf("."));
			String new_name = stem1 + to;
			IFile f2 = f.getProject().getFile(new_name);
			if (f2.exists())
				openTheEditor(f2);
		}
	}

	/**
	 * Select the converted file resource in the current view.
	 */ 
	private void openTheEditor(IFile f2) {
		IWorkbenchWindow workbenchWindow = Workbench.getInstance().getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		final IWorkbenchPart activePart = page.getActivePart();
		if (activePart instanceof ISetSelectionTarget) {
			final ISelection targetSelection = new StructuredSelection(f2);
			workbenchWindow.getShell().getDisplay().asyncExec
				(new Runnable() {
					 public void run() {
						 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
					 }
				 });
			try {
				page.openEditor(new FileEditorInput(f2),
						Workbench.getInstance().getEditorRegistry().getDefaultEditor(f2.getFullPath().toString()).getId());
			} catch (Exception e) {
				System.out.println("No editor exists for the converted file" + f2.getFullPath());
			}
		}
	}
}