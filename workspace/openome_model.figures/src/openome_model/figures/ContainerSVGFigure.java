package openome_model.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

public class ContainerSVGFigure extends NodeSVGFigure {
	public ContainerSVGFigure(String name) {
		super(name);
		setMaintainAspectRatio(true);
	}	
	
	protected void paintFigure(Graphics graphics) {

		// We want to draw the actor symbol on the top left edge of the actor bubble.
		// It will also need to stay a constant size (100) unless the actor
		// bubble is too small.
		
		// radius of the actor symbol. We set this to a constant because we want 
		// the actor symbol to be a fixed size (continued explanation at (see_here))
		int r = 100;
		
		float offsetConstant = 0.707f;

		// determine the exact location of where the symbol should be placed
		int xoffset = (int) (getParent().getBounds().width * (1 - offsetConstant) / 2);
		int yoffset = (int) (getParent().getBounds().height * (1 - offsetConstant) / 2);
				
		// (see_here): unless the actor symbol is too small, causing the actor symbol
		// to look bigger than the actor bubble:
		// the actor bubble is too small, we will be forced to shrink the actor symbol
		if (xoffset <= 50 || yoffset <= 50) {
			r = (int) (Math.min(r, getParent().getBounds().height * (1 - offsetConstant)));
		}
		
		// finally, determine the exact position of where the actor symbol should be placed
		int x = getParent().getBounds().x + xoffset - r / 2;
		int y = getParent().getBounds().y + yoffset - r / 2;
		
		setBounds(new Rectangle(x, y, r, r));
		super.paintFigure(graphics);
	}
}