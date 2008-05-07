package openome_model.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;

public class HurtDecoration extends PolygonDecoration {

	public HurtDecoration() {
		setBackgroundColor(ColorConstants.orange);
		setFill(true);
		setFillXOR(false);
		setOutline(true);
		setOutlineXOR(false);
		setLineWidth(1);
		setLineStyle(Graphics.LINE_DASH);
	}
}
