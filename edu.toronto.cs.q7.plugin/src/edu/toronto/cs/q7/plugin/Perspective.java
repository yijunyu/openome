package edu.toronto.cs.q7.plugin;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {
	public Perspective() {
		super();
	} 
	
	public void createInitialLayout(IPageLayout layout) {
		layout.addShowViewShortcut(IPageLayout.ID_RES_NAV);
		layout.addShowViewShortcut("edu.toronto.cs.q7.eclipse.perspective"); 
		layout.addView(IPageLayout.ID_RES_NAV, IPageLayout.LEFT, 0.2f, IPageLayout.ID_EDITOR_AREA); 	
	}
}
