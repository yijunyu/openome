package ui;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
/**
 * Defines available actions and layout for the OpenOME perspective.
 */
public class Perspective implements IPerspectiveFactory {
	public Perspective() {
		super();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	public void createInitialLayout(IPageLayout layout) {
		// Add "show views".
		layout.addShowViewShortcut(IPageLayout.ID_RES_NAV);
		layout.addShowViewShortcut("ui.ResourceView");
		layout.addView(IPageLayout.ID_RES_NAV, IPageLayout.LEFT, 0.2f, IPageLayout.ID_EDITOR_AREA);
	}
}