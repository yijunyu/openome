package edu.toronto.cs.goalmodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import edu.toronto.cs.goalmodel.diagram.part.GoalmodelVisualIDRegistry;

/**
 * @generated
 */
public class GoalmodelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 5007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GoalmodelNavigatorItem) {
			GoalmodelNavigatorItem item = (GoalmodelNavigatorItem) element;
			return GoalmodelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
