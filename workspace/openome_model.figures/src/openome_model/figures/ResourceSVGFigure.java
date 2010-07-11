package openome_model.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.StackLayout;

public class ResourceSVGFigure extends NodeSVGFigure {
	
	public String col = "green";
	
	public ResourceSVGFigure() {
		super("resource");
		setLayoutManager(new OpenOmeElementLayoutManager());
		setBackgroundColor(ColorConstants.red);
	}
	
	public ResourceSVGFigure(String color) {
		super("resource", color);
		col = color;
		if (col == "") col = "green";
		setLayoutManager(new OpenOmeElementLayoutManager());
		setBackgroundColor(ColorConstants.red);
	}
}
