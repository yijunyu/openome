package goalmodel.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;

public class Dep2Decoration extends PolygonDecoration {
	public Dep2Decoration() {
		setBackgroundColor(ColorConstants.black);
		setFill(true);
		setFillXOR(false);
		setOutline(true);
		setOutlineXOR(false);
		setLineWidth(1);
		setLineStyle(Graphics.LINE_SOLID);
		setScale(6,6);
	}
}
