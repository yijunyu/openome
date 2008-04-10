package openome_model.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;

public class AndDecoration extends PolylineDecoration {

	public AndDecoration() {
		setFill(true);
		setFillXOR(false);
		setOutline(true);
		setOutlineXOR(false);
		setLineWidth(1);
		setLineStyle(Graphics.LINE_SOLID);
		PointList template = new PointList();
		template.addPoint(getStart().getTranslated(6, -5));
		template.addPoint(getStart().getTranslated(6, -1));
		setTemplate(template);
	}
}
