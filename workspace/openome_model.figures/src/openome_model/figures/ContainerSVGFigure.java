package openome_model.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

public class ContainerSVGFigure extends NodeSVGFigure {
	public ContainerSVGFigure(String name) {
		super(name);
		setMaintainAspectRatio(true);
	}	
	protected void paintFigure(Graphics graphics) {
		int r = (int) (Math.min(100, getParent().getBounds().width
				* (1 - 0.707f)));
		r = (int) (Math.min(r, getParent().getBounds().height
				* (1 - 0.707f)));
		int xoffset = (int) (getParent().getBounds().width * (1 - 0.707f) / 2);
		int yoffset = (int) (getParent().getBounds().height * (1 - 0.707f) / 2);
		int x = getParent().getBounds().x + xoffset - r / 2;
		int y = getParent().getBounds().y + yoffset - r / 2;
		setBounds(new Rectangle(x, y, r, r));
		super.paintFigure(graphics);
	}
}