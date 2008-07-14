package openome_model.figures;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;

public class SoftGoalSVGFigure extends ScalableImageFigure {

	public SoftGoalSVGFigure() {
		super(RenderedImageFactory.getInstance(FileLocator.find(Platform.getBundle("openome_model"), new Path("images/" + "softgoal" + ".svg"), null)), 
				true, true, true);
		setMaintainAspectRatio(true);
		
		setLayoutManager(new StackLayout());
		setBackgroundColor(ColorConstants.red);
	}
	public SoftGoalSVGFigure(String name) {
		super(RenderedImageFactory.getInstance(FileLocator.find(Platform.getBundle("openome_model"), new Path("images/" + name + ".svg"), null)), 
				true, true, true);
		setMaintainAspectRatio(true);
		
		
		setLayoutManager(new StackLayout());
		setBackgroundColor(ColorConstants.red);
	}

}
