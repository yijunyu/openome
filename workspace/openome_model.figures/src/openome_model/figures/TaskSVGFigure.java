package openome_model.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.StackLayout;

public class TaskSVGFigure extends NodeSVGFigure {
	
	public TaskSVGFigure() {
		super("task");
		setLayoutManager(new StackLayout());
		setBackgroundColor(ColorConstants.red);
	}
	public TaskSVGFigure(String name) {
		super("task");
		setLayoutManager(new StackLayout());
		setBackgroundColor(ColorConstants.red);
	}

}
