package openome_model.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;

public class HelpDecoration extends PolygonDecoration {

	public HelpDecoration() {
		setBackgroundColor(ColorConstants.lightGreen);		
		setFill(true);
		setFillXOR(false);
		setOutline(true);
		setOutlineXOR(false);
		setLineWidth(1);
		setLineStyle(Graphics.LINE_DASH);
	}
}
