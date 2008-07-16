package openome_model.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.StackLayout;

public class ResourceSVGFigure extends NodeSVGFigure {
	
	public ResourceSVGFigure() {
		super("resource");
		setLayoutManager(new StackLayout());
		setBackgroundColor(ColorConstants.red);
	}
	public ResourceSVGFigure(String name) {
		super("resource");
		setLayoutManager(new StackLayout());
		setBackgroundColor(ColorConstants.red);
	}

}
