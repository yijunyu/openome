/*
 * Created on Mar 14, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package edu.toronto.cs.ome.view;

import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import edu.toronto.cs.ome.model.ModelAttribute;


/**
 * This class acts as a proxy for ModelAttributes, and can answer the
 * questions necessary to be drawn by the Graphic View. These
 * GraphicViewAttributes are associated with one GraphicViewObject.
 */

	public class GraphicViewAttribute {

		private final GraphicViewObject object;
		/**
		 * 
		 * @uml.property name="ma"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ModelAttribute ma;

		/**
		 * Constructor for GraphicViewAttribute. Creates a new
		 * GraphicViewAttribute that proxies for ma, and associated with gvo.
		 */
		public GraphicViewAttribute(GraphicViewObject object, ModelAttribute ma) {
			this.ma = ma;
			this.object = object;
		}

		/**
		 * Returns the image, scaled to the scale our GraphicViewObject,
		 * associated with the target of the ModelAttribute we are proxying for.
		 * If the target has no image, or if the attribute has no target, we
		 * return null.
		 */
		Image getImage() {
			if (ma.getTarget() != null) {
				double scale = this.object.getScale();
				Image im = this.object.view.getModel().getFramework().getImage(ma.getTarget());
				return this.object.view.getImageTable().getScaling(im, scale);
			}
			return null;
		}

		/**
		 * Returns the bounds of the Image representing the target of this
		 * attribute. Again, this will return null if the attribute has no
		 * target. The bounds are absolute (or relative to the canvas).
		 */
		Rectangle getBounds() {
			if (ma.getTarget() != null) {
				// find the position relative to our objects centre and scaling.
				Point p = this.object.view.getModel().getFramework().getPosition(
						ma.getTarget());
				double scale = this.object.getScale();
				if (p!=null) {
					p.setLocation(p.getX() * scale, p.getY() * scale);
					Point c = this.object.getCentre();
					int x, y, width, height;
					Image im = getImage();
					width = this.object.view.getImageTable().getWidth(im);
					height = this.object.view.getImageTable().getHeight(im);
					x = p.x + c.x - width / 2;
					y = p.y + c.y - height / 2;
					return new Rectangle(x, y, width, height);
				}
			}
			return null;
		}
	}