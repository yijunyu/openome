/*
 * Created on Jun 16, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package edu.toronto.cs.ome.view.test;
import java.util.Collection;
import java.util.Iterator;

import edu.toronto.cs.ome.view.GraphicView;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewElement;
import edu.toronto.cs.ome.view.ViewObject;
import edu.toronto.cs.util.D;

/**
 * @author Yijun Yu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GraphicViewElementTest extends ViewTest {
	public GraphicViewElementTest() {
		super("test/edu.toronto.cs.ome.view.GraphViewElement", ".tel");
	}

	public void testGetImageBounds() {
	}

	public void testGetSelectableBounds() {
	}

	public void testGetDirtyBounds() {
	}

	public void testGetImage() {
	}

	public void testGetCentre() {
	}

	public void testSetHidden() {
	}

	public void testIsHidden() {
	}

	public void testGetScale() {
	}

	public void testSetScale() {
	}

	public void testReset() {
	}

	public void testGraphicViewElement() {
	}

	public void testGetModel() {
	}

	public void testGetType() {
	}

	public void testSetType() {
	}

	public void testGetID() {
	}

	public void testSetID() {
	}

	public void testGetModelElement() {
	}

	public void testGetParent() {
	}

	public void testSetParent() {
	}

	public void testGetCollectionSize() {
	}

	public void testAddChild() {
		for (int f=0; f<listed_files.size(); f++) {
			String n = (String ) listed_files.get(f);
			View view = GraphicView.loadViewFromFile(n);
			if (view==null) {
				D.o("Warning: view is null, probably the file" + n + "is not found");
				return;
			}
			Collection allelements = view.getAllElements();
			ViewElement parent = null;
			ViewElement child = null;
			for (Iterator i = allelements.iterator(); i.hasNext();) {
				ViewObject vo = (ViewObject) i.next();
					try {
						ViewElement ve = (ViewElement) vo;
						if (ve.isExpandable()) {
							parent = ve;
						} else {
							child = ve;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (parent != null && child !=null) 
						break;
			}
			if (parent==null || child ==null) {
				D.o("something wrong");
			}
			int s1 = parent.getChildren().size();
			try {
				parent.addChild(child);
			} catch (Exception e) {
				e.printStackTrace();
			}
			int s2 = parent.getChildren().size();
			junit.framework.Assert.assertFalse("new child not created", s2 - s1 != 1);
		}
	}

	public void testRemoveChild() {
	}

	public void testIsExpandable() {
	}

	public void testSetExpandable() {
	}

	public void testExpand() {
	}

	public void testContract() {
	}

	public void testAddLink() {
	}

	public void testGetChildren() {
	}

	public void testIsExpanded() {
	}

	public void testIsIconified() {
	}

	public void testSetIconified() {
	}

	public void testGetIcon() {
	}

	public void testGetExpandedBounds() {
	}

	public void testGetLocation() {
	}

	public void testMove() {
	}

	public void testMoveTo() {
	}

	public void testIsSelected() {
	}

	public void testSetSelected() {
	}

	public void testGetJustification() {
	}

	public void testSetJustification() {
	}

	public void testToggleIntention() {
	}

	public void testToggleLabel() {
	}

	public void testExpand2() {
	}

	public void testGraphicViewObject() {
	}

	public void testGetHighlightBounds() {
	}

	public void testIsHighlighted() {
	}

	public void testSetHighlighted() {
	}

	public void testGetAttributes() {
	}

	public void testGetAttributeBounds() {
	}

	public void testGetTextAttributes() {
	}

	public void testGetName() {
	}

	public void testGetLabel() {
	}

	public void testSetName() {
	}

	public void testSetLabel() {
	}

	public void testGetComment() {
	}

	public void testSetComment() {
	}

	public void testUpdateName() {
	}

	public void testGetModelObject() {
	}

	public void testGetLinks() {
	}

}
