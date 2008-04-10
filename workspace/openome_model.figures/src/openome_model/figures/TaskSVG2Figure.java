package openome_model.figures;

import org.eclipse.draw2d.StackLayout;

public class TaskSVG2Figure extends NodeSVGFigure {

	public TaskSVG2Figure() {
		super("task");
		setLayoutManager(new StackLayout());
	}
	public TaskSVG2Figure(String name) {
		super("task");
		setLayoutManager(new StackLayout());
	}

}
