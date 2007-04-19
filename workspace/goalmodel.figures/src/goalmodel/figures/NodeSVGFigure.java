package goalmodel.figures;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;

public class NodeSVGFigure extends ScalableImageFigure {
	public NodeSVGFigure(String name) {
			super(RenderedImageFactory.getInstance(FileLocator.find(Platform.getBundle("goalmodel"), 
					new Path("images/" + name + ".svg"), null)), 
					true, false, true);
			setMaintainAspectRatio(false);
	}	
}