package edu.toronto.cs.ast;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class Java2GoalAction implements IWorkbenchWindowActionDelegate {

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				 new MyResourceChangeReporter());
	}
		
	class MyResourceChangeReporter implements IResourceChangeListener {
		class DeltaPrinter implements IResourceDeltaVisitor {
		    public boolean visit(IResourceDelta delta) {
		       IResource res = delta.getResource();
		       switch (delta.getKind()) {
		          case IResourceDelta.CHANGED:
		             String s = res.getLocation().toString();
		             if (s.endsWith(".java")) {
		            	 System.setProperty("input", s);
  	            	     System.out.println("input = " + System.getProperty("input"));
		             }
		             break;
		       }
		       return true; // visit the children
		    }
		 }
		public MyResourceChangeReporter () {
		}
		public void resourceChanged(IResourceChangeEvent event) {
	        switch (event.getType()) {
	           case IResourceChangeEvent.POST_CHANGE:
	              try {
						event.getDelta().accept(new DeltaPrinter());
					} catch (CoreException e) {
						e.printStackTrace();
					}
	              break;
	        }		
		}

	}

	public static void main(String args []) {
		Java2GoalAction j2g = new Java2GoalAction();
		j2g.run(null);
	}
	
	public void run(IAction action) {
		parser p = new parser();
		System.setProperty("input", "c:/work/columba/refactored/Main.java");
		p.parse(System.getProperty("input"), System.getProperty("input") + ".xmi");
		p = new parser();
		System.setProperty("input", "c:/work/columba/original/Main.java");
		p.parse(System.getProperty("input"), System.getProperty("input") + ".xmi");
		p = new parser();
		System.setProperty("input", "c:/work/columba/softgoal/Main.java");
		p.parse(System.getProperty("input"), System.getProperty("input") + ".xmi");
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}
}
