/* GraphViewElement 
 * 
 * Created August 1998 by Joseph Makuch. 
 * 
 * copyright.
 */

package edu.toronto.cs.ome.view;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import util.D;
import edu.toronto.cs.ome.model.ModelElement;
import edu.toronto.cs.ome.model.OMEElement;
import edu.toronto.cs.ome.model.OMELink;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.model.PessimisticCollection;
import edu.toronto.cs.ome.model.TelosElement;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.undo.AbstractUndoableEdit;
import edu.toronto.cs.undo.CannotRedoException;
import edu.toronto.cs.undo.CannotUndoException;
import edu.toronto.cs.undo.Undo;

/**
 * Contains the information needed to create and maintain a graphic view * element.
 */

public class GraphicViewElement extends GraphicViewObject
		implements
			ViewElement {
	/** The reasoning side element. */
	//private ModelElement element=null;
	//private boolean expandable=false; // whether we bloat
	private boolean expanded = false; // are we bloated.

	/**
	 * 
	 * @uml.property name="it"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private ImageTable it = null; // our cache of images

	public Rectangle bounds = null; // our extents. and also, position
	private boolean hidden = false; // whether we are hidden.

	/**
	 * 
	 * @uml.property name="icon"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private GraphicViewObject icon = null; // our iconification.

	private double scale; // our size scale.
	private int justification; // our justifcation
	//private double sat;
	//private double den;
	private static int SELECTBOXOFFSET = 2;
	public static final double DEFAULTSCALE = 1.0;

	/**
	 * Contains information needed to create and maintain list of all the
	 * children of this Graphic View Element. Note only expandable elements can
	 * have children
	 */
	class GraphicViewElementChildCollection extends PessimisticCollection {

		private Collection c; // our model's child-collection.

		/**
		 * Create a new graphic view child collection.
		 * 
		 * @param c
		 *            the child collection to be assigned
		 */
		public GraphicViewElementChildCollection(Collection c) {
			this.c = c;
		}

		/**
		 * Add a new element to the child collection.
		 * 
		 * @param o
		 *            the element to be added
		 */
		public boolean add(Object o) {
			Object obj = ((GraphicViewElement) o).getModelElement();
			return c.add(obj);
		}

		/**
		 * Returns a iterator to a linked list of the view elements in the child
		 * collection.
		 */
		public Iterator iterator() {
			Vector ll = new Vector();
			Iterator i = c.iterator();
			while (i.hasNext()) {
				ll.add(view.getViewElement((ModelElement) i.next()));
			}
			return ll.iterator();
		}

		/**
		 * Removes a element from the child collection
		 * 
		 * @param o
		 *            the element to be removed
		 */
		public boolean remove(Object o) {
			Object obj = ((GraphicViewElement) o).getModelElement();
			return c.remove(obj);
		}

		/** Returns whether this collection contains the specified element */
		public boolean contains(Object o) {
			return c.contains(((GraphicViewObject) o).getModelObject());
		}

		/** Returns the number of objects in this collection. */
		public int size() {
			int answer = 0;
			for (Iterator i = iterator(); i.hasNext(); i.next(), answer++);
			return answer;
		}
		
		public Object toArray() [] {			
			ArrayList a = new ArrayList();
			for (Iterator i = iterator(); i.hasNext(); a.add(i.next()));
			return a.toArray();
		}
	}

	/**
	 * 
	 * @uml.property name="undo"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	Undo undo;

	/**
	 * Creates a new Graphic View Element.
	 * 
	 * @param element
	 *            the ModelElement which is being represented by this graphic
	 *            view element
	 * @param view
	 *            the graphic view where this graphic view element will reside
	 */
	public GraphicViewElement(ModelElement element, GraphicView view) {
		super(element, view);
		//D.o("Creating GraphicViewElement.");
		undo = view.getUndo();
		//this.type = ;
		//element.setType(type);
		it = view.getImageTable();
        
		Object type = getType();
		//OMEFramework fwk=view.getModel().getFramework();
		image = view.getModel().getFramework().getImage(type);
		bounds = new Rectangle(0, 0, (int) ((it.getWidth(image) * getScale())),
				(int) ((it.getHeight(image) * getScale())));
		setScale(DEFAULTSCALE);
		int INNER_TEXT_MARGIN = 5;
		int justification = GraphicViewTextAttribute.CENTRE_JUSTIFIED;
		if (getType().toString().equals("Aspect"))
			justification = GraphicViewTextAttribute.LEFT_JUSTIFIED;
		nameattribute = new GraphicViewTextAttribute(getImageBounds().width
				- INNER_TEXT_MARGIN, justification, 0, 0, intention);
		if (getModelElement().getAttribute("sat")!=null) { 
			((TelosElement)getModelElement()).setSat(Float.parseFloat((String)getModelElement().getAttribute("sat").getTarget()));
		}
		if (getModelElement().getAttribute("den")!=null) 
			((TelosElement)getModelElement()).setDen(Float.parseFloat((String)getModelElement().getAttribute("den").getTarget()));
		//D.o("Created GraphicViewElement." + getModelElement().getName());
	}

	/** Our preferred maximum text width is our image minus an inset. */
	/*
	 * protected int maxPrefTextWidth() {
	 *  // ultimately this constant may be pulled from the model. int
	 * INNER_TEXT_MARGIN = 5;
	 * 
	 * return getImageBounds().width - INNER_TEXT_MARGIN; }
	 */

	/**
	 * Sets the Rectange that encompasses the bounds of our text, with position
	 * relative to our image bounds. We centre our text over our image for now.
	 */
	/*
	 * protected void setTextBounds(int width, int height) { int y,x; y =
	 * Math.max((getImageBounds().height - height)/2, -15); x =
	 * (getImageBounds().width - width)/2; textbounds = new
	 * Rectangle(x,y,width,height); }
	 */

	/** Returns the model which this element is in. */
	public OMEModel getModel() {
		return getModelElement().getModel();
	}

	/**
	 * Returns the element's type. The type can be used to find additional
	 * properties about the element within various contexts, eg, it's graphic,
	 */
	public Object getType() {
		if (getModelElement()==null)
			return null;
		return getModelElement().getType();
	}

	/**
	 * Sets the type of this graphic view element. Update type-specific stuff.
	 * 
	 * @param type
	 *            the type to be assigned
	 */
	public void setType(Object type) {
		try {
			if (getModelElement()!=null)
				getModelElement().setType(type);
			// change our image, and bounds:
			image = view.getModel().getFramework().getImage(type);
			// to correctly set the bounds...
			setScale(scale);
		} catch (Exception e) {
			D.a(e);
		}
	}

	/**
	 * Returns the unique (within the context) integer id of this graphic view
	 * element. Since the name of an element is not guaranteed to be unique, we
	 * use this for serialization.
	 */
	public int getID() {
		if (getModelElement()==null)
			return -1;
		return getModelElement().getID();
	}

	/**
	 * Sets the integer ID of this graphic view element. This has not been
	 * implemented.
	 * 
	 * @param id
	 *            the id to be assigned to this graphic view element
	 */
	public void setID(int id) {
		//element.setID(id); // do *not* call this.
		//why not just "this.id = id;" ?
		D.a(false);
	}

	/** Returns the model-side element this graphic view element represents. */
	public ModelElement getModelElement() {
		return (ModelElement) getModelObject();
	}

	/**
	 * Returns the parent of this graphic view element, if a parent exists and
	 * null otherwise.
	 */
	public OMEElement getParent() {
		if (getModelElement() != null)
			return view.getViewElement((ModelElement) getModelElement()
					.getParent());
		else
			return null;
	}

	/**
	 * Changes or sets the parent of this graphic view element. If this graphic
	 * view element is expandable element an error will be thrown. Both this
	 * method, and the parent's addChild must be called to add a child to a
	 * parent.
	 * 
	 * @param ve
	 *            the OMEElement to be assigned as the parent of this graphic
	 *            view element
	 */
	public void setParent(OMEElement ve) throws Exception {
		if (isExpandable()) {
			throw new Exception("Expandable elements may not have parents");
		}
		if (ve == null) {
			getModelElement().setParent(null);
		} else {
			getModelElement().setParent(
					((GraphicViewElement) ve).getModelElement());
		}
	}

	int getCollectionSize(Collection c) {
		int s = 0;		
		for (Iterator i = c.iterator(); i.hasNext(); i.next())
			s ++;
		return s;
	}
	/**
	 * Adds a child to this expandable graphic view element. If this graphic
	 * view element is not expandable, an error will be thrown. Both this method
	 * and the child's setparent method must be called to add a child to a
	 * parent.
	 * 
	 * @param ve
	 *            the OMEElement to be assigned as a child to this graphic view
	 *            element
	 */
	public void addChild(OMEElement ve) throws Exception {
		if (!isExpandable())
			throw new Exception("Non-expandable elements may not have"
					+ " children.");
//		D.o("to add a new child: " + ve.getName());
//		int s1 = getCollectionSize(getModelElement().getChildren());
		ModelElement me = ((GraphicViewElement) ve).getModelElement();
		getModelElement().addChild(me);
//		int s2 = getCollectionSize(getModelElement().getChildren());
//		if (s2 - s1 != 1)
//		D.o("error: before adding: " + s1 + " children, after adding: " + s2 + " children.");
	}

	/**
	 * Removes a child from this (expandable) element. If attempted on a
	 * non-expandable element, or if the child is not in fact a child of the
	 * parent, and exception is thrown. A call must also be made to
	 * child.setParent(null) to remove the child from its parent.
	 */
	public void removeChild(OMEElement child) throws Exception {
		if (!isExpandable()) {
			throw new Exception("Non-expandable elements may not have"
					+ " children.");
		}
		getModelElement().removeChild(
				((GraphicViewElement) child).getModelElement());
	}

	/** Returns whether element is expandable or not. */
	public boolean isExpandable() {
		return getModelElement().isExpandable();
	}

	/**
	 * Changes whether this graphic view element is expandable. If this is
	 * attempted on an element with children, or a parent, then an error will be
	 * thrown if the new state does not allow children or a parent respectively.
	 * 
	 * @param e
	 *            the (boolean) value to be assigned as the expandable status of
	 *            this graphic view element
	 */
	public void setExpandable(boolean e) throws Exception {
		if (e && (getParent() != null))
			throw new Exception("Expandable elements may not have parents.");
		if (!e && !getModelElement().getChildren().isEmpty())
			throw new Exception("Non-expandable elements may not have"
					+ " children.");
		getModelElement().setExpandable(e);
	}

	/**
	 * Expands this element. Throws exception if we are not expandable.
	 * Expanding deiconifies all our children.
	 */
	public void expand() throws Exception {
		if (!isExpandable()) {
			throw new Exception("Non-expandable elements may not expand");
		}
		expanded = true;
		Iterator i = getChildren().iterator();
		while (i.hasNext()) {
			GraphicViewElement gve = (GraphicViewElement) i.next();
			gve.setIconified(null);
		}
		partially_hidden = false;
	}

	/**
	 * Contracts this element. Iconifies all our children. What if we are not
	 * expanded? Throws is exception if not expandable.
	 */
	public void contract() throws Exception {
		if (!isExpandable()) {
			throw new Exception("Non-expandable elements may not contract");
		}
		expanded = false;
		Iterator i = getChildren().iterator();
		while (i.hasNext()) {
			GraphicViewElement gve = (GraphicViewElement) i.next();
			gve.setIconified(this);
		}
		Iterator j = getAllObjectsInExpandedBounds().iterator();
		while (j.hasNext()) {
			ViewObject vo = ((ViewObject) j.next());
			if (vo.isSelected()) {
				// Deselect.
				//D.o("Deselecting object in bounds.");
				vo.setSelected(false);
			}
		}
		partially_hidden = false;
	}

	/** Adds an OMELink to this element's link collection. */
	public void addLink(OMELink l) {
		getModelElement().addLink(l);
	}

	/**
	 * Returns a collection of the OMEElements which are correspond to children
	 * of this graphic view element. Any and all of the elements which are
	 * children are returned.
	 */
	public Collection getChildren() {
		// this returns a collection of *modelelements* which is incorrect.
		// but iterates over GVObjects. Weird, eh?
		return new GraphicViewElementChildCollection(getModelElement()
				.getChildren());
	}

	/**
	 * Returns a collection of all objects (elements and links) that are
	 * entirely within the expanded bounds of this element. If there are no such
	 * elements or if this element is not expandable, it returns an empty
	 * collection.
	 */
	private Collection getAllObjectsInExpandedBounds() {
		Collection allobjects = new ArrayList();
		Iterator i = getChildren().iterator();
		while (i.hasNext()) {
			addObjectToExpandedBounds((GraphicViewObject) i.next(), allobjects);
		}
		return allobjects;
	}

	/**
	 * Adds the given object to the expanded bounds and then recursively checks
	 * and adds all the object's links that are currently determined to be in
	 * the expanded bounds, to the expanded bounds. A link is said to be in the
	 * expanded bounds, if it's source and destination are in the expanded
	 * bounds.
	 */
	private void addObjectToExpandedBounds(GraphicViewObject gvo, Collection c) {
		if (!c.contains(gvo)) {
			c.add(gvo);
		}
		Iterator i = gvo.getLinks().iterator();
		while (i.hasNext()) {
			GraphicViewLink gvl = (GraphicViewLink) i.next();
			if (c.contains(gvl.getTo()) && c.contains(gvl.getFrom())) {
				addObjectToExpandedBounds(gvl, c);
			}
		}

	}

	/**
	 * Returns if this expandable graphic view element is expanded or not. If
	 * the element is not expandable, it will return false.
	 * 
	 * @uml.property name="expanded"
	 */
	public boolean isExpanded() {
		return expanded;
		//return view.getExpandedElements().contains(this);
	}



	/**
	 * Synchronize with the Protege/QueriesTab plugin
	 * to fetch the name of queried instances into a "queried_instances" collection
	 * -- Yijun Yu
	 */
	public static Collection queried_instances = null;

	/**
	 * Returns whether this graphic view element is hidden. An element is hidden
	 * if
	 * <ul>
	 * <li>the element itself is hidden
	 * <li>or, the element's parent is hidden
	 * </ul>
	 * 
	 * @uml.property name="hidden"
	 */
	public boolean isHidden() {
		GraphicViewElement parent = (GraphicViewElement) getParent();
		if (hidden) {
			return true;
		} else if (parent != null) {
			if (parent.isHidden()) {
				return true;
			}
		}
		if (queried_instances != null) {
			// Yijun Yu
			// New results?
			if (queried_instances.contains("Element_" + this.getID())) {
				return false;
			}
			if (queried_instances.contains("Link_" + this.getID())) {
				return false;
			}
			return true;
		}
		return false;
	}

	class HideEdit extends AbstractUndoableEdit {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String className;
		boolean _hidden;

		public String getPresentationName() {
			return "Hide the graphical element";
		}

		public HideEdit(boolean h) {
			super();
			className = "Hiding";			
			this._hidden = h;
		}

		public HideEdit(ObjectInputStream in) {
			super();
			className = "Hiding";
			try {
				readObject(in);
			} catch (Exception exp) {
				exp.printStackTrace();
			}
		}

		public void undo() throws CannotUndoException {
			super.undo();
			try {
				synchronized (GraphicViewElement.this) {
					boolean th = hidden;
					hidden = _hidden;
					_hidden = th;
				}
			} catch (Exception bl) {
				throw new CannotUndoException();
			}
		} // undo

		public void redo() throws CannotRedoException {
			super.redo();
			try {
				synchronized (GraphicViewElement.this) {
					boolean th = hidden;
					hidden = _hidden;
					_hidden = th;
				}
			} catch (Exception bl) {
				throw new CannotRedoException();
			}
		} // redo
		/**
		 * writeObject
		 */
		protected void writeObject(java.io.ObjectOutputStream out)
				throws IOException {
			super.writeObject(out);
			out.writeObject(new Boolean(_hidden));
		} // writeObject

		/**
		 * readObject
		 */
		public void readObject(java.io.ObjectInputStream in) throws IOException,
				ClassNotFoundException {
			try {
				_hidden = ((Boolean) in.readObject()).booleanValue();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Sets whether this graphic view element is hidden or not.
	 * 
	 * @param hide
	 *            the (boolean) value to be assigned the hidden-status of this
	 *            graphic view element
	 * 
	 * @uml.property name="hidden"
	 */
	public void setHidden(boolean hide) {
		undo.addEdit(new HideEdit(hidden));
		hidden = hide;
	}


	/**
	 * Returns whether this graphic view element is iconified. An element is
	 * iconified if
	 * <ul>
	 * <li>the element itself is iconified
	 * <li>the element's parent is iconified
	 * <li>or, the element's parent is not expanded.
	 * </ul>
	 */
	public boolean isIconified() {
		GraphicViewElement parent = (GraphicViewElement) getParent();
		if (icon != null) {
			return true;
		} else if (parent != null) {
			if (parent.isIconified()) {
				return true;
			} else if (!view.getExpandedElements().contains(parent)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Sets whether this graphic view element is iconified or not.
	 * 
	 * @param icon
	 *            The GVObject that is our iconification. Passing null
	 *            deiconfies us.
	 */
	public void setIconified(ViewObject icon) {
		//D.o("Iconifying " + getName());
		this.icon = (GraphicViewObject) icon;
	}

	/**
	 * Returns the GVO that is our icon.
	 * 
	 * @uml.property name="icon"
	 */
	public ViewObject getIcon() {
		return icon;
	}


	/* GraphicViewElement specific methods */
	/**
	 * Returns the bounding box of the graphic representing the element in its
	 * GraphicView.
	 */
	public Rectangle getImageBounds() {
		GraphicViewElement parent = (GraphicViewElement) getParent();
		if (isIconified()) {
			if (parent!=null)
				return parent.getImageBounds();
		} 
		return bounds;
	}

	/**
	 * The rectangle that that use can click to select an object. We will also
	 * use this rectangle to draw the "selected box".
	 */
	public Rectangle getSelectableBounds() {
		Rectangle r = new Rectangle(bounds);
		r.grow(SELECTBOXOFFSET, SELECTBOXOFFSET);
		return r;
	}

	/**
	 * The least upper rectangular bounds of the area dirtied by a change to
	 * this object.
	 */
	public Rectangle getDirtyBounds() {
		//Rectangle ib = getImageBounds();
		//Rectangle tb = getTextBounds();
		Rectangle r = new Rectangle(getSelectableBounds());
		r.add(nameattribute.getBounds());

		Rectangle ab = getAttributeBounds();
		if (ab != null) {
			r.add(ab);
		}

		// If highlighted, add highlight bounds.

		//	if (isHighlighted()) {
		//	    r.add(getHighlightBounds());
		//	}

		return r;
	}

	/**
	 * Returns the bounding box of the circle that encompasses all the children
	 * of this graphic view element. A small margin is also added.
	 * 
	 * Geometrically, this is done inductively as follows:
	 * 
	 * If the number of elements is 1, then the center of the boundary 
	 *     is the center of the element and the radius of the boundary 
	 *     is the radius of the element;  
	 * If the number of elements is k, and the center of the boundary is C_k 
	 *     and the radius is r_k  
	 * For the k+1-th element E_k+1, 
	 *   if the distance d = |E_k+1 - C_k| <= r_k, then C_k+1 = C_k, r_k+1 = r_k   
	 *   else the center will move towards the direction of E_k+1 by (d - r_k)/2 
	 *        and the radius r_k+1 = (d + r_k)/2              
	 * @author Yijun Yu	 
	 */
	public Rectangle getExpandedBounds() {
//		int border = Math.max(getImageBounds().width, getImageBounds().height);
		Point center = null;
		ArrayList kids = new ArrayList();
		for (Iterator i = getChildren().iterator(); i.hasNext(); ) {
			Object o = i.next();
			if (o instanceof GraphicViewElement && !((GraphicViewElement) o).isHidden())
				kids.add(o);
		}
		Object children [] = kids.toArray();
		double radius = 0;		
		//If there is no child
		if(children.length==0){
			int noChildBorder=25;
			Rectangle r = new Rectangle(bounds.x + bounds.width - noChildBorder, bounds.y
					+ bounds.height - noChildBorder, noChildBorder * 2, noChildBorder * 2);
			Point p = new Point(r.x, r.y);
			int diag = (int) p.distance(new Point(r.x + r.width, r.y + r.height));
			return new Rectangle(r.x + r.width / 2 - diag / 2, r.y + r.height / 2
					- diag / 2, diag + 1, diag + 1);
		}
		if (children.length>0) {
			for (int i = 0; i<children.length; i++) {
				GraphicViewElement e1 = (GraphicViewElement) children[i];
				Point p1 = e1.getCentre();
				if (i==0) {
					center = p1;
					radius = Math.max(e1.getImageBounds().width/2, e1.getImageBounds().height/2);
					continue;
				}
				double d = p1.distance(center);
				if (d > radius) {
					double ratio = ((d - radius) / 2) / d;
					center.x += (int)((p1.x - center.x) * ratio);   
					center.y += (int)((p1.y - center.y) * ratio);
					radius += (d - radius) / 2;
				}
			}
		}
		Point p1 = getCentre();
		double d = p1.distance(center);
		if (d > radius) {
			double ratio = ((d - radius) / 2) / d;
			center.x += (int)((p1.x - center.x) * ratio);   
			center.y += (int)((p1.y - center.y) * ratio);
			radius += (d - radius) / 2;
		}
		return new Rectangle(center.x - (int) radius, 
			center.y - (int) radius, 
			(int) (2*radius), (int) (2*radius));
	}

	/** Returns the image for this element. This image is scaled to the size. */
	public Image getImage() {
		return it.getScaling(image, getScale());
	}

	/**
	 * Returns the centre of this graphic view element. Used to connect links to
	 * the element.
	 */
	public Point getCentre() {
		if (icon != null) {
			return icon.getCentre();
		}
		return new Point(bounds.x + bounds.width / 2, bounds.y + bounds.height
				/ 2);
	}

	/** Returns the View.Location of this object. */
	public View.Location getLocation() {
		View.GraphicLocation l = new View.GraphicLocation();
		l.setPoint(getCentre());
		return l;
	}
	class MoveEdit extends AbstractUndoableEdit {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String className;
		Point _p;

		public String getPresentationName() {
			return "Move the graphical element";
		}

		public MoveEdit(Point p) {
			super();
			className = "Moving";			
			this._p = p;
		}

		public MoveEdit(ObjectInputStream in) {
			super();
			className = "Moving";
			try {
				readObject(in);
			} catch (Exception exp) {
				exp.printStackTrace();
			}
		}

		public void undo() throws CannotUndoException {
			super.undo();
			try {
				synchronized (GraphicViewElement.this) {
					moveTo(_p);
				}
			} catch (Exception bl) {
				throw new CannotUndoException();
			}
		} // undo

		public void redo() throws CannotRedoException {
			super.redo();
			try {
				synchronized (GraphicViewElement.this) {
					moveTo(_p);
				}
			} catch (Exception bl) {
				throw new CannotRedoException();
			}
		} // redo
		/**
		 * writeObject
		 */
		protected void writeObject(java.io.ObjectOutputStream out)
				throws IOException {
			super.writeObject(out);
			out.writeObject(_p);
		} // writeObject

		/**
		 * readObject
		 */
		public void readObject(java.io.ObjectInputStream in) throws IOException,
				ClassNotFoundException {
			try {
				_p = (Point)in.readObject();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Translates this graphic view element within the view.
	 * 
	 * @param dx
	 *            the distance in the x-direction to be translated
	 * @param dy
	 *            the distance in the y-direction to be translated
	 */
	public void move(int dx, int dy) {
		bounds.translate(dx, dy);

		// Movement of contracted, expandable elements should also move their
		// children.
		if (isExpandable()) {
			if (!isExpanded()) {
				Iterator i = getChildren().iterator();
				while (i.hasNext()) {
					GraphicViewElement gve = (GraphicViewElement) i.next();
					gve.move(dx, dy);
				}
				if (!view.getStraighten()) {
					Iterator l = view.getChildLinks(this).iterator();
					while (l.hasNext()) {
						GraphicViewLink gvl = (GraphicViewLink) l.next();
						gvl.move(dx, dy);
					}
				}
			}
		}
	}

	/**
	 * Move this graphic view element to a given point.
	 * 
	 * @param p
	 *            the point which this graphic view element should me moved to
	 */
	public void moveTo(Point p) {
		bounds.setLocation(p);
	}

	class ScaleEdit extends AbstractUndoableEdit {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String className;
		double _hidden;

		public String getPresentationName() {
			return "Change the scale";
		}

		public ScaleEdit(double h) {
			super();
			className = "Scaling";			
			this._hidden = h;
		}

		public ScaleEdit(ObjectInputStream in) {
			super();
			className = "Scaling";
			try {
				readObject(in);
			} catch (Exception exp) {
				exp.printStackTrace();
			}
		}

		public void undo() throws CannotUndoException {
			super.undo();
			try {
				synchronized (GraphicViewElement.this) {
					double th = scale ;
					scale = _hidden;
					_hidden = th;
				}
			} catch (Exception bl) {
				throw new CannotUndoException();
			}
		} // undo

		public void redo() throws CannotRedoException {
			super.redo();
			try {
				synchronized (GraphicViewElement.this) {
					double th = scale ;
					scale = _hidden;
					_hidden = th;
				}
			} catch (Exception bl) {
				throw new CannotRedoException();
			}
		} // redo
		/**
		 * writeObject
		 */
		protected void writeObject(java.io.ObjectOutputStream out)
				throws IOException {
			super.writeObject(out);
			out.writeObject(new Double(_hidden));
		} // writeObject

		/**
		 * readObject
		 */
		public void readObject(java.io.ObjectInputStream in) throws IOException,
				ClassNotFoundException {
			try {
				_hidden = ((Double) in.readObject()).doubleValue();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
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
		undo.addEdit(new ScaleEdit(this.scale));
		this.scale = scale;
		// refresh the bounds. getImage takes scale into account.
		bounds = new Rectangle(bounds.x, bounds.y, it.getWidth(getImage()), it
			.getHeight(getImage()));

		// Reset the text for our name based on the new image size.
		//nameattribute.setText(getName());
	}
/*	public void setSatDen(double satisficed, double denied){
		
		this.sat=satisficed;
		this.den=denied;
	}*/
	public void reset() {
		undo.addEdit(new ScaleEdit(this.scale));
		this.scale = 1.0;
	}

	/**
	 * Returns the size of this graphic view element.
	 * 
	 * @uml.property name="scale"
	 */
	public double getScale() {
		return scale;
	}


	/** Returns whether this element is selected. */
	public boolean isSelected() {
		Collection viewelements = view.getSelectedElements();
		if (viewelements.contains(this)) {
			return true;
		} else {
			return false;
		}
	}

	/** Sets whether this element is selected. */
	public void setSelected(boolean select) {
		//Collection selectedelements = view.getSelectedElements();
		if (select) {
			if (!isSelected()) {
				view.getSelectedElements().add(this);
			}
		} else {
			// if element is selected, we deselect it, otherwise we do nothing.
			if (isSelected()) {
				view.getSelectedElements().remove(this);
			}
		}
	}

	/**
	 * @return
	 * 
	 * @uml.property name="justification"
	 */
	public int getJustification() {
		return justification;
	}

	/**
	 * @param i
	 * 
	 * @uml.property name="justification"
	 */
	public void setJustification(int i) {
		justification = i;
	}

	boolean intention = true;
	String old_name = "";
	private boolean label;
	private TelosParserIndividual old_label;
	public boolean partially_hidden;
	/*
	 * (non-Javadoc)
	 * 
	 * @see OME.ViewObject#toggleIntention()
	 */
	public void toggleIntention() {
		intention = !intention;
		if (!intention) {
			String n = getName();
			if (n.indexOf("[") > 0) {
				String m = n.substring(n.indexOf("[") + 1);
				if (m.indexOf("]") > 0) {
					String l = m.substring(0, m.indexOf("]"));
					old_name = getName();
					setName(l);
				}
			}
		} else {
			if (!old_name.equals("")) {
				setName(old_name);
			}
		}
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.view.ViewObject#toggleLabel()
	 */
	public void toggleLabel() {
		label = !label;
		if (!label) {
			old_label = getLabel();
			setLabel(null);
		} else {
			if (old_label != null) {
				setLabel(old_label);
			}
		}
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.view.ViewElement#expand2()
	 */
	public void expand2() throws Exception {
		if (!isExpandable()) {
			throw new Exception("Non-expandable elements may not expand");
		}
		expanded = true;
		Iterator i = getChildren().iterator();
		while (i.hasNext()) {
			GraphicViewElement gve = (GraphicViewElement) i.next();
			gve.setIconified(null);
		}
		partially_hidden = true;
	}

	int priority;
	public int getPriority() {
		return priority;
	}
	public void setPriority(int p) {
		priority = p;
	}
}

