/* GraphicViewLink
 * 
 * Created August 1998 by Joseph Makuch.
 *
 * copyright.
 */

package edu.toronto.cs.ome.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.util.Collection;

import edu.toronto.cs.ome.model.ModelLink;
import edu.toronto.cs.ome.model.ModelObject;
import edu.toronto.cs.ome.model.OMELink;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.model.OMEObject;
import edu.toronto.cs.util.D;

/**
 * Contains all the information needed to maintain a Graphic View Link. A * GraphicViewLink is a link between two nodes in a GraphView. Links have an * annotation, a source, and destination, and a type which is used to find the * image out of the imagetable.
 */

public class GraphicViewLink extends GraphicViewObject implements ViewLink {

	private static final float WIDTH_MULTIPLIER = 7.0f;

	/**
	 * 
	 * @uml.property name="to"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private GraphicViewObject to = null;

	/**
	 * 
	 * @uml.property name="from"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private GraphicViewObject from = null; // for the canvas to draw...

	/**
	 * 
	 * @uml.property name="icon"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private GraphicViewObject icon = null; // our iconification

	/**
	 * 
	 * @uml.property name="it"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private ImageTable it = null; // our imagetable

	//private Rectangle bounds=null; // the extents of our image
	private boolean hidden = false; // whether we're hiddin
	///*pkg*/ ModelLink link=null; // Reasoning-side link.
	private double scale; // Our scaling size.

	private Stroke stroke; // How our line is drawn.

	private QuadCurve2D.Double Quad1;
	private QuadCurve2D.Double Quad2;
	Point2D.Double start1;
	Point2D.Double end1;
	Point2D.Double control1;
	Point2D.Double start2;
	Point2D.Double end2;
	Point2D.Double control2;
	Rectangle ctrl1;
	Rectangle ctrl2;
	private int init = 0;
	private Color color;
	private float width = 0f;

	static private final float dash[] = {10.0f, 5.0f, 10.0f, 5.0f};

	private static int ROTATIONS = 64;
	private static double DEFAULTSCALE = 1.0;

	/**
	 * Creates a new Graphic View Link.
	 * 
	 * @param link
	 *            the ModelLink which is been represented by this graphic view
	 *            link
	 * @param view
	 *            the graphic view where this graphic view element will reside
	 */
	public GraphicViewLink(ModelLink link, GraphicView view) {
		super(link, view);
		try {
			//D.o("Creating GraphicViewLink");

			it = view.getImageTable();
			image = view.getModel().getFramework().getImage(getType());

			setScale(DEFAULTSCALE);

			nameattribute = new GraphicViewTextAttribute(50,
					GraphicViewTextAttribute.LEFT_JUSTIFIED, 25, -10, intention);
			setStroke();

			Quad1 = new QuadCurve2D.Double();
			Quad2 = new QuadCurve2D.Double();

			start1 = new Point2D.Double();
			control1 = new Point2D.Double();
			end1 = new Point2D.Double();

			start2 = new Point2D.Double();
			control2 = new Point2D.Double();
			end2 = new Point2D.Double();

			ctrl1 = new Rectangle(0, 0, 8, 8);
			ctrl2 = new Rectangle(0, 0, 8, 8);

			//D.o("Created GraphicViewLink");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** Returns which model this graphic view link is in. */
	public OMEModel getModel() {
		return getModelLink().getModel();
	}

	/** Add an OMELink to this link's collection of links. */
	public void addLink(OMELink l) {
		getModelLink().addLink(l);
	}

	/** Our preferred maximum text width is just a constant. */
	/*
	 * protected int maxPrefTextWidth() { return 80; }
	 */

	/**
	 * Sets the Rectange that encompasses the bounds of our text, with position
	 * relative to our image bounds. Our text is just some constants away from
	 * our image.
	 */
	/*
	 * protected void setTextBounds(int width, int height) { final int
	 * rightoffset = 10; final int topoffset = -15; textbounds = new
	 * Rectangle(getImageBounds().width + rightoffset, topoffset, width,
	 * height); }
	 */

	/** Returns the type of this graphic view link. */
	public Object getType() {
		return getModelLink().getType();
	}

	/**
	 * 
	 * @uml.property name="color"
	 */
	public Color getColor() {
		return color;
	}


	/**
	 * Set the type of this graphic view link.
	 * 
	 * @param type
	 *            the type to be assigned
	 */
	public void setType(Object type) throws Exception {
		if (getModelLink()!=null)
			getModelLink().setType(type);
		setImage(view.getModel().getFramework().getImage(type));
	}

	/**
	 * Returns the unique (within its view) integer ID of the link. The
	 * annotation/name of a link is optional, so this serves to identify the
	 * link when iterating.
	 */
	public int getID() {
		//	return id;
		return getModelLink().getID();
	}

	/**
	 * Set the id for this graphic view link.
	 * 
	 * @param id
	 *            the id to be assigned
	 */
	public void setID(int id) {
//		this.id = id;
	}

	/**
	 * Returns the destination of this graphic view link.
	 * 
	 * @uml.property name="to"
	 */
	public OMEObject getTo() {
		OMEObject o;
		ModelLink ml = getModelLink(); 
		if(ml!=null){
		ModelObject mo = (ModelObject) ml.getTo();
		o = view.getViewObject(mo);
		return o;
		}
		else
			return null;

	}


	/**
	 * Set the destination for this graphic view link.
	 * 
	 * @param vo
	 *            the destination to be be assigned
	 */
	public void setTo(OMEObject vo) throws Exception {
		// we cache the current value of "to" in case this update doesn't work
		// and we have to go back to the old value
		OMEObject oldto = getTo();
		to = (GraphicViewObject) vo;
		// call reasoning-side with vo's element
		try {
			getModelLink().setTo(to.getModelObject());
		} catch (Exception e) {
			if (oldto != null) {
				setTo(oldto);
			}
			throw e;
		}
	}

	/**
	 * Returns the source of this graphic view link.
	 * 
	 * @uml.property name="from"
	 */
	public OMEObject getFrom() {
		OMEObject o;
		o = view.getViewObject((ModelObject) getModelLink().getFrom());
		return o;
	}

	/**
	 * 
	 * @uml.property name="quad1"
	 */
	public QuadCurve2D.Double getQuad1() {
		return Quad1;
	}

	/**
	 * 
	 * @uml.property name="quad2"
	 */
	public QuadCurve2D.Double getQuad2() {
		return Quad2;
	}


	public Point2D.Double getstart1() {
		return start1;
	}

	public Point2D.Double getstart2() {
		return start2;
	}

	public Point2D.Double getend1() {
		return end1;
	}

	public Point2D.Double getend2() {
		return end2;
	}

	public Point2D.Double getcontrol1() {
		return control1;
	}

	public Point2D.Double getcontrol2() {
		return control2;
	}

	public Rectangle getctrl1() {
		return ctrl1;
	}

	public Rectangle getctrl2() {
		return ctrl2;
	}

	public int getinit() {
		return init;
	}

	public void setinit(int i) {
		init = i;
	}

	public void init() {
		GraphicViewObject from = (GraphicViewObject) getFrom();
		if (from==null)
			D.o("Wrong FROM" + getName());
		GraphicViewObject to = (GraphicViewObject) getTo();
		if (to==null)
			D.o("Wrong TO" + getName());
		// images and lines are drawn by the system with a different bias,
		// however, we are using images for arrowheads...
		getstart1()
				.setLocation(
						from.getImageBounds().x
								+ from.getImageBounds().getWidth() / 2,
						from.getImageBounds().y
								+ from.getImageBounds().getHeight() / 2);
		getend2().setLocation(to.getImageBounds().x +
				to.getImageBounds().getWidth() / 2,
				to.getImageBounds().y + to.getImageBounds().getHeight() / 2);
		Point2D.Double c;
		Point2D.Double src = new Point2D.Double(from.getImageBounds().x
				+ from.getImageBounds().getWidth() / 2,
		from.getImageBounds().y + from.getImageBounds().getHeight() / 2);
		Point2D.Double dst = new Point2D.Double(to.getImageBounds().x
				+ to.getImageBounds().getWidth() / 2,
		to.getImageBounds().y + to.getImageBounds().getHeight() / 2);
		double dx = dst.x - src.x;
		double dy = dst.y - src.y;
		c = new Point2D.Double(src.x + dx * 2.0 / 3.0, src.y + dy * 2.0 / 3.0);
		getend1().setLocation(c.x, c.y);
		getcontrol1().setLocation((src.x + c.x) / 2, (src.y + c.y) / 2);
		getctrl1().setLocation((int) ((getcontrol1().x) - 4),
		(int) ((getcontrol1().y) - 4));
		getstart2().setLocation(c.x, c.y);
		getcontrol2().setLocation((dst.x + c.x) / 2, (dst.y + c.y) / 2);
		getctrl2().setLocation((int) ((getcontrol2().x) - 4), (int) ((getcontrol2().y) - 4));

	}

	/** Set the source for this graphic view link. */
	public void setFrom(OMEObject vo) throws Exception {
		// we cache the current value of "from" in case this update doesn't work
		// and we have to go back to the old value
		OMEObject oldfrom = getFrom();
		from = (GraphicViewObject) vo;
		// call reasoning-side with vo's element
		try {
			getModelLink().setFrom(from.getModelObject());
		} catch (Exception e) {
			if (oldfrom != null) {
				setFrom(oldfrom);
			}
			throw e;
		}
	}

	/** Gets the model-side object we are proxying for */
	public ModelLink getModelLink() {
		return (ModelLink) getModelObject();
	}

	/**
	 * Returns a clone of this graphic view link. This is a reasonable clone,
	 * rather than a bitwise one. by default it will be hidden, and it's links
	 * nullified.
	 * 
	 * @uml.property name="hidden"
	 */
	public boolean isHidden() {
		return getTo() != null
			&& ((GraphicViewObject) getTo()).isHidden()
			|| getFrom() != null
			&& ((GraphicViewObject) getFrom()).isHidden()
			|| hidden
			|| GraphicViewElement.queried_instances != null
			&& GraphicViewElement.queried_instances.contains("Link_"
				+ this.getID());
	}

	/**
	 * Sets whether this graphic view link is hidden.
	 * 
	 * @uml.property name="hidden"
	 */
	public void setHidden(boolean hide) {
		hidden = hide;
	}


	/**
	 * Returns whether this graphic view link is iconified.
	 */
	public boolean isIconified() {
		if (icon != null) {
			// The normal case.
			return true;
		} else if (sourceIcon() != null && sourceIcon() == destIcon()) {
			// If the links source and destination are iconified to the same
			// object, the link is also iconified to that object.
			return true;
		}
		return false;

	}

	/** Returns the icon of our source. */
	private ViewObject sourceIcon() {
		if (getFrom()!=null)
			return ((GraphicViewObject) getFrom()).getIcon();
		else
			return null;
	}

	/** Returns the icon of our destination. */
	private ViewObject destIcon() {
		return ((GraphicViewObject) getTo()).getIcon();
	}

	/**
	 * Returns the GVO that is our icon.
	 * 
	 * @uml.property name="icon"
	 */
	public ViewObject getIcon() {
		if (icon != null) {
			// The normal case.
			return icon;
		} else if (sourceIcon() != null && sourceIcon() == destIcon()) {
			// If the links source and destination are iconified to the same
			// object, the link is also iconified to that object.
			return ((GraphicViewObject) getTo()).getIcon();
		}
		return null;
	}


	/**
	 * Sets the icon for the object. Passing <code>null</code> for icon
	 * de-iconifies this object. We had better get a GraphicViewObject that is
	 * in our view.
	 */
	public void setIconified(ViewObject icon) {
		this.icon = (GraphicViewObject) icon;
	}

	/* GraphViewLink specific stuff */

	/**
	 * Returns the bounding box for this link. This is just for the image in the
	 * centre of the link. Let's try moving to 2/3 of the way up the link.
	 */
	public Rectangle getImageBounds() {
		Point c;
		if (end1.x == 0.0) {
			c = getCentre();
			Point src = ((GraphicViewObject) getFrom()).getCentre();
			Point dst = ((GraphicViewObject) getTo()).getCentre();
			int dx = dst.x - src.x;
			int dy = dst.y - src.y;
			c = new Point(src.x + dx * 2 / 3, src.y + dy * 2 / 3);
		} else {
			c = new Point((int) start2.getX(), (int) start2.getY());
		}

		Rectangle bounds = new Rectangle(c.x
				- (int) (getScale() * it.getWidth(image) / 2), c.y
				- (int) (getScale() * it.getHeight(image) / 2),
				(int) (getScale() * it.getWidth(image)), (int) (getScale() * it
						.getHeight(image)));
		return bounds;
	}

	/** Returns the selected box bounds for this link. */
	public Rectangle getSelectableBounds() {
		Rectangle r = new Rectangle(getImageBounds());
		r.grow(SELECTBOXMARGIN, SELECTBOXMARGIN);
		return r;
	}

	public Rectangle getSelectableControlBounds1() {
		Rectangle r = new Rectangle(getctrl1());
		r.grow(SELECTBOXMARGIN, SELECTBOXMARGIN);
		return r;
	}

	public Rectangle getSelectableControlBounds2() {
		Rectangle r = new Rectangle(getctrl2());
		r.grow(SELECTBOXMARGIN, SELECTBOXMARGIN);
		return r;
	}
	/**
	 * Returns the least upper rectangular box encompassing the area dirtied by
	 * moving this link.
	 */
	public Rectangle getDirtyBounds() {
		GraphicViewObject gvoto = (GraphicViewObject) getTo();
		GraphicViewObject gvofrom = (GraphicViewObject) getFrom();
		Rectangle bounds = new Rectangle();
		if (gvoto==null || gvofrom==null)
			return bounds;
		bounds.setLocation(gvoto.getCentre());
		bounds.setSize(0, 0);
		bounds.add(getImageBounds());
		bounds.add(gvofrom.getCentre());
		bounds.add(nameattribute.getBounds());

		Rectangle ab = getAttributeBounds();
		if (ab != null) {
			bounds.add(ab);
		}
		// If it's highlighted, add the bounds of the highlight area.
		// Linda you should do this.
		return bounds;
	}

	/** Sets the image. */
	private void setImage(Image image) {
		this.image = image;
	}

	/** Returns the Image for the centre of this graphic view link. */
	public Image getImage() {
		double factor = getScale();
		Image j = it.getRotation(image, getRotation());
		Image i = it.getScaling(j, (float) factor);
		return i;
	}

	/**
	 * Returns the centre of this graphic view link. Used for attaching other
	 * links.
	 */
	public Point getCentre() {
		if (getIcon() != null) {
			return ((GraphicViewObject) getIcon()).getCentre();
		}
		Point a = ((GraphicViewObject) getTo()).getCentre();
		Point b = a;
		if (getFrom()!=null)
			b = ((GraphicViewObject) getFrom()).getCentre();
		return new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
	}

	/** Returns the View.Location of this object. */
	public View.Location getLocation() {
		View.GraphicLocation l = new View.GraphicLocation();
		l.setPoint(getCentre());
		return l;
	}

	/**
	 * Returns the angle between the ends of this link. The result is quantized
	 * onto ROTATIONS increments to allow caching of the result.
	 */
	public float getRotation() {
		GraphicViewObject gvo = (GraphicViewObject) getFrom();
		Rectangle r = gvo.getImageBounds();		
		Point a = new Point((int)r.x + (int) r.getWidth() / 2, 
		          (int) r.y + (int) r.getHeight() / 2);
		gvo = (GraphicViewObject) getTo();
		r = gvo.getImageBounds();
		Point b = new Point((int)r.x + (int) r.getWidth() / 2, 
			          (int) r.y + (int) r.getHeight() / 2);
		double angle = Math.atan2(-(b.y - a.y), b.x - a.x);
		double increment = Math.PI * 2.0 / (double) ROTATIONS;
		angle += increment / 2;

		int count = (int) (angle / increment + 3.0 * ROTATIONS) % ROTATIONS;
		return -count * (float) increment;
	}

	/**
	 * Change the size of this graphic view element.
	 * 
	 * @param scale
	 *            the new size to be assigned to the graphic view element
	 * 
	 * @uml.property name="scale"
	 */
	public void setScale(double scale) {
		this.scale = scale;
		//bounds = new Rectangle(bounds.x, bounds.y,
		//		(it.getWidth(getType())*scale)/10,
		//		(it.getHeight(getType())*scale)/10);
	}


	public void reset() {
		this.getend1().setLocation(0.0, 0.0);
	}

	/**
	 * Returns the size of this graphic view element.
	 * 
	 * @uml.property name="scale"
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * Returns the stroke to be used when drawing this link
	 * 
	 * @uml.property name="stroke"
	 */
	public Stroke getStroke() {
		return stroke;
	}

	/** Sets the Link's stroke 
	 * 
	 */
	public void setStroke() {
		if (width == 0) width = 1f;
		String strokestring = view.getModel().getFramework().getStrokeString(
				getType());
		if (strokestring.equals("dashed")) {
			stroke = new BasicStroke(2.0f, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f);
		} else if (strokestring.equals("widened")) {
			stroke = new BasicStroke(4.0f);
			color = Color.orange;
		} else {
			//normalize width to user space - a number between 0 and 1
			//define score of 1 to be a thin line... e.g smaller = wider
			width = 1 + ((1 - width) * WIDTH_MULTIPLIER);
			stroke = new BasicStroke(width); //only use width param on normal links
			//stroke = new BasicStroke(1.0f); // use for normal behaviour
		}
	}
	
	
	/** Returns whether this link is selected. */
	public boolean isSelected() {
		Collection viewlinks = view.getSelectedLinks();
		if (viewlinks.contains(this)) {
			return true;
		} else {
			return false;
		}
	}

	/** Sets whether this link is selected. */
	public void setSelected(boolean select) {
		Collection selectedlinks = view.getSelectedLinks();
		if (select) {
			if (!isSelected()) {
				selectedlinks.add(this);
			}
		} else {
			// if link is selected, we deselect it, otherwise we do nothing.
			if (isSelected()) {
				selectedlinks.remove(this);
			}
		}
	}

	/**
	 * Translates this graphic view link within the view.
	 * 
	 * @param dx
	 *            the distance in the x-direction to be translated
	 * @param dy
	 *            the distance in the y-direction to be translated
	 */
	public void move(int dx, int dy) {

		getend1().setLocation(getend1().x + dx, getend1().y + dy);
		getstart2().setLocation(getstart2().x + dx, getstart2().y + dy);
		getcontrol2().setLocation(getcontrol2().x + dx, getcontrol2().y + dy);
		getcontrol1().setLocation(getcontrol1().x + dx, getcontrol1().y + dy);
	}

	boolean intention = true;
	/*
	 * (non-Javadoc)
	 * 
	 * @see OME.ViewObject#toggleIntention()
	 */
	public void toggleIntention() {
		intention = !intention;
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.view.ViewObject#toggleLabel()
	 */
	public void toggleLabel() {
		// no need to do anything
	}

	public double getDegree() {
		String n = getName();
		int i =n.indexOf(":"); 
		if (i>=0) 
			n = n.substring(i);
		try {
			double d = Double.parseDouble(n);
			return d;
		} catch (Exception e) {
			if (n.equals("Make") || n.equals("Break") ||
					n.equals("++") || n.equals("--"))
				return 1.0;
			if (n.equals("Help") || n.equals("Hurt") ||
					n.equals("+") || n.equals("-") ||
					n.equals("Some +") || n.equals("Some -"))
				return 0.5;
			return 0;
		}
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}