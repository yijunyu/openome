package openome_model.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;

public class MakeDecoration extends PolygonDecoration {

	public MakeDecoration() {
		setBackgroundColor(ColorConstants.green);
		setFill(true);
		setFillXOR(false);
		setOutline(true);
		setOutlineXOR(false);
		setLineWidth(1);
		setLineStyle(Graphics.LINE_SOLID);
		setScale(7, 3);
	}
}
