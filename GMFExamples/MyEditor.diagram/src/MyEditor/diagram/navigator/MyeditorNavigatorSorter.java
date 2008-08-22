package MyEditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MyeditorNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 3003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MyEditor.diagram.navigator.MyeditorNavigatorItem) {
			MyEditor.diagram.navigator.MyeditorNavigatorItem item = (MyEditor.diagram.navigator.MyeditorNavigatorItem) element;
			return MyEditor.diagram.part.MyeditorVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
