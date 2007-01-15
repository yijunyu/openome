/* GraphViewElement 
 * 
 * Created August 1998 by Joseph Makuch. 
 * 
 * copyright.
 */

package OME;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;


/** Contains the information needed to create and maintain a
 *  graphic view element.
 */
class GraphicViewElement extends GraphicViewObject implements ViewElement {

    /** The reasoning side element. */
    //private ModelElement element=null;

    //private boolean expandable=false;		// whether we bloat
    private boolean expanded=false;		// are we bloated.
    private int id=0;				// our unique id
    private ImageTable it=null;			// our cache of images
    private Rectangle bounds=null;		// our extents. and also, position
    private boolean hidden=false;		// whether we are hidden. 
    private GraphicViewObject icon=null;	// our iconification.
    private double scale;			// our size scale.
    
    private static int SELECTBOXOFFSET = 2;
    public static final double DEFAULTSCALE = 1.0;
    

    /** Contains information needed to create and maintain list of all
     *  the children of this Graphic View Element. Note only expandable
     *  elements can have children
     */
    class GraphicViewElementChildCollection extends PessimisticCollection {

	private Collection c; // our model's child-collection.
	
	/** Create a new graphic view child collection.
         *
	 *  @param c 	the child collection to be assigned
	 */
	public GraphicViewElementChildCollection(Collection c) {
	    this.c = c;
	}
  

	/** Add a new element to the child collection. 
         *
         *  @param o	the element to be added
         */
	public boolean add(Object o) {
	    return c.add(((GraphicViewElement)o).getModelElement() );   
	}


	/** Returns a iterator to a linked list of the view elements in the child
	 *  collection. 
	 */
	public Iterator iterator() {
	    LinkedList ll = new LinkedList();
	    Iterator i = c.iterator();
	    while(i.hasNext()) {
		ll.add( view.getViewElement((ModelElement)i.next()) );
	    }
	    return ll.iterator();
	}


	/** Removes a element from the child collection
         *
         *  @param o the element to be removed
         */
	public boolean remove(Object o) {
	    return c.remove(((GraphicViewElement)o).getModelElement());
	}	


	/** Returns whether this collection contains the specified element */
	public boolean contains(Object o){
	    return c.contains(((GraphicViewObject)o).getModelObject());
	}

	/** Returns the number of objects in this collection. */
	public int size() {
	    int answer;
	    Iterator i = iterator();
	    for (answer = 0 ; i.hasNext() ; i.next(),answer++) {}
	    return answer;
	}
    }
    
   
    /** Creates a new Graphic View Element. 
     *
     *  @param element 	the ModelElement which is being represented by this
     *			graphic view element
     *  @param view 	the graphic view where this graphic view element
     *			will reside
     */
    public GraphicViewElement(ModelElement element, GraphicView view) {
	super(element, view);
	D.o("Creating GraphicViewElement.");
	
	//this.type = ;
	//element.setType(type);
	it = view.getImageTable();		
		
	Object type = getType();
	image = view.getModel().getFramework().getImage(type);
	
	bounds = new Rectangle(0,0,(int)((it.getWidth(image)*getScale())),
				(int)((it.getHeight(image)*getScale())));

	setScale(DEFAULTSCALE);

	int INNER_TEXT_MARGIN = 5;
	nameattribute = new GraphicViewTextAttribute(getImageBounds().width - 
		INNER_TEXT_MARGIN, GraphicViewTextAttribute.CENTRE_JUSTIFIED,
		0,0);
	
	D.o("Created GraphicViewElement." + getModelElement().getName());	
    }
    

    /** Our preferred maximum text width is our image minus an inset. */
    /*
    protected int maxPrefTextWidth() {
	
	// ultimately this constant may be pulled from the model.
	int INNER_TEXT_MARGIN = 5;
	    
	return getImageBounds().width - INNER_TEXT_MARGIN;
    }*/

    /** Sets the Rectange that encompasses the bounds of our text, with
     *  position relative to our image bounds.  We centre our text over our
     *  image for now. */
    /*
    protected void setTextBounds(int width, int height) {
	int y,x;
	y = Math.max((getImageBounds().height - height)/2, -15);
	x = (getImageBounds().width - width)/2;
	textbounds = new Rectangle(x,y,width,height);	
    }*/


    /** Returns the model which this element is in. */
    public OMEModel getModel() {
	return getModelElement().getModel();
    }
     

    /** Returns the element's type. The type can be used to find additional
     * properties about the element within various contexts, eg, it's graphic,
     * */
    public Object getType() {
	return getModelElement().getType();
    }
    

    /** Sets the type of this graphic view element. Update type-specific stuff.
     *
     *  @param type	 the type to be assigned
     */
    public void setType(Object type) throws Exception {
	getModelElement().setType(type);
		
	// change our image, and bounds:
	image = view.getModel().getFramework().getImage(type);
	// to correctly set the bounds...
	setScale(scale);
	
    }
  
       
    /** Returns the unique (within the context) integer id of this graphic
     *  view element. Since the name of an element is not guaranteed to be 
     *  unique, we use this for serialization. */
    public int getID() {
	return getModelElement().getID();
    }

    
    /** Sets the integer ID of this graphic view element. This has not been implemented.
     *
     *  @param id	 the id to be assigned to this graphic view element
     */
    public void setID(int id) {
	//element.setID(id); // do *not* call this.
      //why not just "this.id = id;" ?
	D.a(false);
    }


      
    /** Returns the model-side element this graphic view element represents. */
    public ModelElement getModelElement() {
	return (ModelElement)getModelObject();
    }

      
    /** Returns the parent of this graphic view element, if a parent exists 
     *  and null otherwise.
     */    
    public OMEElement getParent() {
	if (getModelElement()!=null)
	   	return view.getViewElement((ModelElement)getModelElement().getParent());
	else 
	    return null;
    }

       
    /** Changes or sets the parent of this graphic view element. If this 
     *  graphic view element is expandable element an error will be thrown.
     *  Both this method, and the parent's addChild must be called to add 
     *  a child to a parent. 
     *
     *  @param ve	the OMEElement to be assigned as the parent of this
     *		graphic view element 
     */
    public void setParent(OMEElement ve) throws Exception {
	if (isExpandable()) {
	    throw new Exception("Expandable elements may not have parents");
	}
	if (ve == null) {
	    D.o("View Element is null.");
	    getModelElement().setParent(null);
	} else {
	    D.o("View Element is not null");
	    getModelElement().setParent(
		    ((GraphicViewElement)ve).getModelElement());
	}
    }

    
    /** Adds a child to this expandable graphic view element. If this graphic view
     *  element is not expandable, an error will be thrown. Both this method and
     *  the child's setparent method must be called to add a child to a parent.
     *
     *  @param ve	the OMEElement to be assigned as a child to this 
     *		graphic view element
     */
    public void addChild(OMEElement ve) throws Exception {
	if (!isExpandable()) 
	    throw new Exception("Non-expandable elements may not have" +
		    " children.");
	getModelElement().addChild(((GraphicViewElement)ve).getModelElement());
    }

    /** Removes a child from this (expandable) element.  If attempted on a
     * non-expandable element, or if the child is not in fact a child of the
     * parent, and exception is thrown.  A call must also be made to
     * child.setParent(null) to remove the child from its parent.
     */
    public void removeChild(OMEElement child) throws Exception {
	if (!isExpandable()) {
	    throw new Exception("Non-expandable elements may not have" +
		    " children.");
	}
	getModelElement().removeChild(
		((GraphicViewElement)child).getModelElement());
    }
    
    
    /** Returns whether element is expandable or not. */
    public boolean isExpandable() {
	return getModelElement().isExpandable();
    }


    /** Changes whether this graphic view element is expandable. If this is attempted 
     *  on an element with children, or a parent, then an error will be thrown if the
     *  new state does not allow children or a parent respectively. 
     *
     *  @param e	the (boolean) value to be assigned as the expandable status of
     *		this graphic view element
     */
    public void setExpandable(boolean e) throws Exception {
	if (e && (getParent() != null))
	    throw new Exception("Expandable elements may not have parents.");
	if (!e && !getModelElement().getChildren().isEmpty())
	    throw new Exception("Non-expandable elements may not have" +
		    " children.");
	getModelElement().setExpandable(e);
    }    

    /** Expands this element.  Throws exception if we are not expandable.
     *  Expanding deiconifies all our children.
     */
    public void expand() throws Exception {
	if (!isExpandable()) {
	    throw new Exception("Non-expandable elements may not expand");
	}
	expanded = true;
	Iterator i = getChildren().iterator();
	while (i.hasNext()) {
	    GraphicViewElement gve = (GraphicViewElement)i.next();
	    gve.setIconified(null);
	}
    }

    /** Contracts this element.  Iconifies all our children.
      * What if we are not expanded?  Throws is exception if not expandable.
      */
    public void contract() throws Exception {
	if (!isExpandable()) {
	    throw new Exception("Non-expandable elements may not contract");
	}
	expanded = false;
	Iterator i = getChildren().iterator();
	while (i.hasNext()) {
	    GraphicViewElement gve = (GraphicViewElement)i.next();
	    gve.setIconified(this);
	}
	Iterator j = getAllObjectsInExpandedBounds().iterator();
	while(j.hasNext()) {	    
	    ViewObject vo = ((ViewObject)j.next());
	    if (vo.isSelected()) {
		// Deselect.
		D.o("Deselecting object in bounds.");
		vo.setSelected(false);
	    }
	}
    }

    /** Adds an OMELink to this element's link collection. */
    public void addLink(OMELink l) {
	getModelElement().addLink(l);
    }
    

    /** Returns a collection of the OMEElements which are correspond to children
     *  of this graphic view element. Any and all of the elements which are
     *  children are returned. 
     */
    public Collection getChildren() {
	// this returns a collection of *modelelements* which is incorrect.
	// but iterates over GVObjects.  Weird, eh?
	return new GraphicViewElementChildCollection(
		getModelElement().getChildren());
    }
    
    /** Returns a collection of all objects (elements and links) that are 
     *  entirely within the expanded bounds of this element. If there are 
     *  no such elements or if this element is not expandable, it returns 
     *  an empty collection.          
     */
    private Collection getAllObjectsInExpandedBounds() {
    	Collection allobjects = new ArrayList();
	Iterator i = getChildren().iterator();
	while (i.hasNext()) {
	    addObjectToExpandedBounds((GraphicViewObject)i.next(), allobjects);	
	}
	return allobjects;
    }

    /** Adds the given object to the expanded bounds and then recursively 
     *  checks and adds all the object's links that are currently determined 
     *  to be in the expanded bounds, to the expanded bounds. A link is said
     *  to be in the expanded bounds, if it's source and destination are in
     *  the expanded bounds.
     */
    private void addObjectToExpandedBounds(GraphicViewObject gvo, 
	                                   Collection c) {
	if (!c.contains(gvo)) {
	    c.add(gvo);    
	}
	Iterator i = gvo.getLinks().iterator();
	while (i.hasNext()) {
	    GraphicViewLink gvl = (GraphicViewLink)i.next();
	    if (c.contains(gvl.getTo()) && c.contains(gvl.getFrom())) {
		addObjectToExpandedBounds(gvl,c);	    	    
	    }
	}
    
    }

    /** Returns if this expandable graphic view element is expanded or not. 
     *  If the element is not expandable, it will return false. 
     */
    public boolean isExpanded() {
	return expanded;
	//return view.getExpandedElements().contains(this);
    }
      
    /** Returns whether this graphic view element is hidden. 
     *  An element is hidden if
     * <ul>
     * <li> the element itself is hidden
     * <li> or, the element's parent is hidden
     * </ul>
     */
    public boolean isHidden() {
	GraphicViewElement parent = (GraphicViewElement)getParent();
	if (hidden) {
	    return true;
	} else if (parent != null) {
	    if (parent.isHidden()) {
	       	return true;
	    } 
	}
	return false;	
    }

    /** Sets whether this graphic view element is hidden or not. 
     *  @param hide	the (boolean) value to be assigned the
     *			hidden-status of this graphic view element
     */
    public void setHidden(boolean hide) {
	hidden = hide;
    }
    
    /** Returns whether this graphic view element is iconified. 
     *  An element is iconified if
     * <ul><li> the element itself is iconified
     *     <li> the element's parent is iconified
     *     <li> or, the element's parent is not expanded.</ul>
     */
    public boolean isIconified() {
	GraphicViewElement parent = (GraphicViewElement)getParent();
	if (icon!=null) {
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

    /** Sets whether this graphic view element is iconified or not. 
     *  @param icon	The GVObject that is our iconification.  Passing null
     *			deiconfies us.
     */
    public void setIconified(ViewObject icon) {
	D.o("Iconifying "+getName());
	this.icon = (GraphicViewObject)icon;
    }

    /** Returns the GVO that is our icon. */
    public ViewObject getIcon() {
	return icon;
    }


    /* GraphicViewElement specific methods */
    /** Returns the bounding box of the graphic representing the element in
     * its GraphicView. */    
    public Rectangle getImageBounds() {
	GraphicViewElement parent = (GraphicViewElement)getParent();
	if (isIconified()) {
	   return parent.getImageBounds();
	} else 
	   return bounds;
    }
    
    /** The rectangle that that use can click to select an object.  We will
     *  also use this rectangle to draw the "selected box". */
    public Rectangle getSelectableBounds() { 
	Rectangle r = new Rectangle(bounds);
	r.grow(SELECTBOXOFFSET,SELECTBOXOFFSET);
	return r;
    }
    
    /** The least upper rectangular bounds of the area dirtied by a change to
     *  this object.*/
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
    
    /** Returns the bounding box of the circle that encompasses all the
     *  children of this graphic view element. A small margin is also added. 
     */
    public Rectangle getExpandedBounds() {
	//D.o("getting expanded bounds...");
	// this can be calculated each time we are called, else we can
	// re-calculate more rarely as an optimization.
	int border = 25;
	
	// start at lower right corner, and grow.
	Rectangle r = new Rectangle(
		bounds.x+bounds.width-border, bounds.y+bounds.height-border,
		border*2, border*2);

	Iterator i = getChildren().iterator();
	while(i.hasNext()) {
	    GraphicViewElement gve = (GraphicViewElement)i.next();
	    //D.o("FoundElement: "+gve.getName());
	    r=r.union(gve.getSelectableBounds());
	}
	// return the rectangle that contains the circle that contains r.
	Point p = new Point(r.x,r.y);	
	int diag = (int)p.distance(new Point(r.x+r.width,r.y+r.height));
	return new Rectangle(
		r.x+r.width/2-diag/2, r.y+r.height/2-diag/2, diag+1, diag+1);		
    }
   
    /** Returns the image for this element. This image is scaled to the size. */
    public Image getImage() {
	return it.getScaling(image, getScale());
    }
    
    /** Returns the centre of this graphic view element. Used to connect
      * links to the element. */
    public Point getCentre() {
	if (icon!=null) {
	    return icon.getCentre();
	}
	return new Point(bounds.x+bounds.width/2, bounds.y+bounds.height/2);
    }

    /** Returns the View.Location of this object. */
    public View.Location getLocation() {
	View.GraphicLocation l = new View.GraphicLocation();
	l.setPoint(getCentre());
	return l;
    }
    
    /** Translates this graphic view element within the view. 
     *
     *  @param dx	the distance in the x-direction to be translated
     *  @param dy	the distance in the y-direction to be translated
     */
    public void move(int dx, int dy) {
	bounds.translate(dx,dy);
	
	// Movement of contracted, expandable elements should also move their
	// children.
	if (isExpandable()) {
	    if (!isExpanded()) {
		Iterator i = getChildren().iterator();
		while (i.hasNext()) {
		    GraphicViewElement gve = (GraphicViewElement)i.next();
		    gve.move(dx,dy);
		}
		if (!view.getStraighten()) {
		    Iterator l = view.getChildLinks(this).iterator();
		    while (l.hasNext()) {
			GraphicViewLink gvl = (GraphicViewLink)l.next();
			gvl.move(dx,dy);
		    }
		}
	    }
	}
    }

    
    /** Move this graphic view element to a given point.
     * 
     *  @param p	the point which this graphic view element should me moved to
     */
    public void moveTo(Point p) {
	bounds.setLocation(p);
    }
    

    /** Change the size of this graphic view element.
     * 
     *  @param scale	the new size to be assigned to the graphic view element
     */
    public void setScale(double scale) {
	this.scale = scale; 
	// refresh the bounds. getImage takes scale into account.
	bounds = new Rectangle(bounds.x, bounds.y,it.getWidth(getImage()),
		it.getHeight(getImage()));

	// Reset the text for our name based on the new image size.
	//nameattribute.setText(getName());
    }
   
    public void reset () {
	this.scale = 1.0;
    }
    
    /** Returns the size of this graphic view element. */
    public double getScale() {
	return scale;
    }
   
    /** Returns whether this element is selected. */
    public boolean isSelected(){
	Collection viewelements = view.getSelectedElements();
	if (viewelements.contains(this)){
	    return true;
	}else{
	    return false;
	}	
    }

    /** Sets whether this element is selected. */
    public void setSelected(boolean select){
	//Collection selectedelements = view.getSelectedElements();
	if (select){
	    if (!isSelected()){
		view.getSelectedElements().add(this);
	    }
	}
	else{
	    // if element is selected, we deselect it, otherwise we do nothing. 
	    if (isSelected()) {		
		view.getSelectedElements().remove(this);
	    }
	}
    }

}

