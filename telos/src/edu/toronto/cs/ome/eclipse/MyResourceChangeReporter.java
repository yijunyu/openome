package edu.toronto.cs.ome.eclipse;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;


public class MyResourceChangeReporter implements IResourceChangeListener {
	class DeltaPrinter implements IResourceDeltaVisitor {
	    public boolean visit(IResourceDelta delta) {
	       IResource res = delta.getResource();
	       switch (delta.getKind()) {
	          case IResourceDelta.CHANGED:
	             String s = res.getLocation().toString();
	             if (s.endsWith(".q7")) {
	            	 String m = (String) System.getProperty("model");
	            	 if (m!=null && m.equals(s)) {
	            		 editor.updateOpenOME(m);
	            	 }
	             }
	             break;
	       }
	       return true; // visit the children
	    }
	 }
	Editor editor;
	public MyResourceChangeReporter (Editor e ) {
		editor = e;
	}
	public void resourceChanged(IResourceChangeEvent event) {
//        IResource res = event.getResource();
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
