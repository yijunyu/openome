package edu.toronto.cs.ome.eclipse;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.model.WorkbenchContentProvider;

/**
 * Provides content for the Protege resource navigation view.
 *
 * @author <A HREF="mailto:johnson.thomas@mayo.edu">Thomas M Johnson</A>
 */
public class ResourceContentProvider extends WorkbenchContentProvider {
	public ResourceContentProvider() {
		super();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object element) {
		Object[] children = super.getChildren(element);
		List items = new ArrayList();
		for (int i = 0; i < children.length; i++) {
			Object child = children[i];
			if (child instanceof IResource
					&& ((((IResource) child).getType() != IResource.FILE
							|| "q7".equalsIgnoreCase(((IFile) child).getFileExtension())
							|| "tel".equalsIgnoreCase(((IFile) child).getFileExtension())
							|| "vdx".equalsIgnoreCase(((IFile) child).getFileExtension())
							|| "pprj".equalsIgnoreCase(((IFile) child).getFileExtension())
							)
							))
				items.add(child);
		}
		return items.toArray();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object element) {
		return super.getElements(element);
	}
}