package openome_model.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;

public class DepDecoration extends PolygonDecoration {
	public DepDecoration() {
		setBackgroundColor(ColorConstants.black);
		setFill(true);
		setFillXOR(false);
		setOutline(true);
		setOutlineXOR(false);
		setLineWidth(1);
		setLineStyle(Graphics.LINE_SOLID);
		setTemplate(PolygonDecoration.INVERTED_TRIANGLE_TIP);
		setScale(6,6);
	}
}
