package goalmodel.figures;

import org.eclipse.draw2d.StackLayout;

public class GoalSVGFigure extends NodeSVGFigure {

	public GoalSVGFigure() {
		super("goal");
		setLayoutManager(new StackLayout());
	}
	public GoalSVGFigure(String name) {
		super("goal");
		setLayoutManager(new StackLayout());
	}

}
