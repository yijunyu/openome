package openome_model.figures;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;

public class NodeSVGFigure extends ScalableImageFigure {
	// anti alias disabled to show svg diagrams
	// http://dev.eclipse.org/newslists/news.eclipse.modeling.gmf/msg09945.html
	public NodeSVGFigure(String name) {
			super(RenderedImageFactory.getInstance(FileLocator.find(Platform.getBundle("openome_model"), new Path("images/" + name + ".svg"), null)), 
					true, false, false);
			setMaintainAspectRatio(false);
	}	
}