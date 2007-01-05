

/* GraphicViewObject 
 * Created Feb. 1999 by Joseph Makuch.
 *
 * copyright.
 */

package OME;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Vector;

/** Contains utility-type methods for objects in the graphic view. */
abstract class GraphicViewObject implements ViewObject {

    public static final int SELECTBOXMARGIN=2;
    private Collection linksiteratorbuilder;	//we keep the collection around
    /*pkg*/ ModelObject modelobject;
    protected GraphicView view;			// our host
    protected Image image=null;			// our unscaled image
    private Collection attributes;		// our GVAttributes
    protected GraphicViewTextAttribute nameattribute;// our name as a GVTA.

    

    // Inner classes.

    /** This class acts as a proxy for ModelAttributes, and can answer the questions
     *  necessary to be drawn by the Graphic View.  These GraphicViewAttributes
     *  are associated with one GraphicViewObject.*/
    public class GraphicViewAttribute {

	private ModelAttribute ma;

	/** Constructor for GraphicViewAttribute.  Creates a new
	 *  GraphicViewAttribute that proxies for ma, and associated with gvo.
	 */
	public GraphicViewAttribute(ModelAttribute ma) {
	    this.ma = ma;
	}


	/** Returns the image, scaled to the scale our GraphicViewObject,
	 * associated with the target of the ModelAttribute we are proxying for.
	 * If the target has no image, or if the attribute has no target, we
	 * return null. */
	Image getImage() {
	    if (ma.getTarget() != null) {
		double scale = getScale();
		Image im = view.getModel().getFramework().getImage(
			ma.getTarget());
		// return scaled image.
		return view.getImageTable().getScaling(im, scale);
	    }
	    return null;
	}

	/** Returns the bounds of the Image representing the target of this
	 *  attribute.  Again, this will return null if the attribute has no
	 *  target.  The bounds are absolute (or relative to the canvas). */
	Rectangle getBounds() {
	    if (ma.getTarget() != null) {
		// find the position relative to our objects centre and scaling.
		Point p = view.getModel().getFramework().getPosition(
			ma.getTarget());
		double scale = getScale();
		p.setLocation(p.getX()*scale, p.getY()*scale);
		Point c = getCentre();
		int x,y,width,height;
		Image im = getImage();
		width = view.getImageTable().getWidth(im);
		height = view.getImageTable().getHeight(im);
		x = p.x+c.x-width/2;
		y = p.y+c.y-height/2;
		return new Rectangle(x, y, width, height);
	    }
	    return null;
	}
    }

    /** A GraphicViewTextAttribute is used to provide easy access to to text
     *  attributes associated with the GVO.  It "renders" and caches text in
     *  TextLayouts and provides access to these layouts as well as
     *  information regarding where they should be drawn.  These objects do
     *  NOT proxy for ModelAttributes (yet). 
     *  This class might get ugly (but the objective is to put all the
     *  ugliness in one place...here.
     */
    public class GraphicViewTextAttribute {
    
	static final int LEFT_JUSTIFIED = 0;
	static final int RIGHT_JUSTIFIED = 1;
	static final int CENTRE_JUSTIFIED = 2;
	
	private String text;
	private Collection textlines;   // Collection of strings composing text
	private Collection layouts;	// Our cache of text layouts
	private int preferredmaxwidth;	// Assumes scaling of 1.
	private int justification;
	private int dx = 0;		// Distance from centre of GVO,
	private int dy = 0;		// assuming scaling of 1.

	private int width=0;		// Upper bounds on the extend of our
	private int height=0;		// text.

	private FontRenderContext fontrc;   // The frc used for our text cache
	private Collection textlayouts;	    // the cached rendering of our text
	private FontMetrics fontmetrics;    // info about our font.
	private Font font=null;		    // our font.

	public GraphicViewTextAttribute(int preferredmaxwidth, int
		justification, int dx, int dy) {
	    this.preferredmaxwidth = preferredmaxwidth;
	    this.justification = justification;
	    this.dx = dx;
	    this.dy = dy;
	}

	/** Returns an Iterator of Pairs, whose first member is a TextLayout,
	 *  and whose second member is the Point where it should be drawn.  
	 *  These TextLayouts are rendered using the given FontRenderContext.
	 */
	protected Iterator getText(FontRenderContext frc) {
	    if (font == null) {
		// If we didn't have a font when we set our text, better get
		// one and reset our text.  We may not have a font available
		// until drawing time.
		setFont();
	    }
	    Iterator i = RenderTextLayouts(frc);
	    Vector v = new Vector();
	    int x=0,y=0;
	    y = getCentre().y + (int)(dy*getScale()) - height/2
		    + fontmetrics.getAscent() -
		    fontmetrics.getDescent();  // since TLs draw at base
	    while (i.hasNext()) {
		TextLayout tl = (TextLayout)i.next();
		switch (justification) {
		    case LEFT_JUSTIFIED:
			x = getCentre().x + (int)(dx*getScale()) - width/2;
			break;
		    case CENTRE_JUSTIFIED:
			x = getCentre().x + (int)(dx*getScale()) -
			    tl.getBounds().getBounds().width/2;
			break;
		    case RIGHT_JUSTIFIED:
			x = getCentre().x + (int)(dx*getScale()) -
			    tl.getBounds().getBounds().width + width/2;
			break;
		}
		Point p = new Point(x,y);
		v.add(new Pair(tl,p));
		y = y+tl.getBounds().getBounds().height;
	    }
	    return v.iterator();
	}

	/** Returns a Collection of TextLayouts (one line per member) appropriate
	 *  for the given FontRenderContext. Uses our cache if appropriate, if
	 *  not creates new cache. */
	private Iterator RenderTextLayouts(FontRenderContext frc) {
	    boolean samefrc = false;
	    if (fontrc != null) {
		samefrc = ( (frc.getTransform().equals(fontrc.getTransform()))
			&& (frc.isAntiAliased() == fontrc.isAntiAliased()) 
			&& (frc.usesFractionalMetrics() ==
			    fontrc.usesFractionalMetrics()) );
	    }
	    if (samefrc && textlayouts!=null) {
		//D.o("Using cache for " + getName());
		// we have it cached.
	    } else {
		// Create new TextLayouts.
		//D.o("Caching TextLayouts for "+getName());
		int w=0,h=0;
		fontrc = frc;
		Collection c = textlines; 
		Vector v = new Vector();
		if (c != null) {
		   // D.o("Found textline cache");
		    Iterator lines = c.iterator();
		    while (lines.hasNext()) {
			String s = (String)lines.next();
			try {
			    TextLayout tl = new TextLayout(s, font, frc);
			    v.add(tl);
			    h = h + tl.getBounds().getBounds().height;
			    w = Math.max(w,tl.getBounds().getBounds().width);
			} catch (Exception e) {
			    D.o(e);
			}
		    }
		}
		textlayouts = v;
		h = h + fontmetrics.getDescent();

		// I think we should enlarge our bounds here if necessary.
		height = Math.max(height, h);
		width = Math.max(width, w);
	    }
	    return textlayouts.iterator();
	}

	/** Sets our display text.  Our text is broken into a sequence of lines,
	 *  hopefully no wider than our maxTextWidth().
	 */
	public void setText(String text) {
//	    D.o("Setting text:  " +text);
	    textlayouts = null;	// Our text cache will be invalid.
	    width = 0;
	    height = 0;
	    this.text = text;
	    if (text == null || text.compareTo("")==0 || font==null ||
		    textlines == null) {
		// Just clear everything.
		textlines = new Vector();
//		D.o("Clearing textlines");
		return;
	    }
	    
	    int bl = fontmetrics.getAscent();
	    int fh = bl + fontmetrics.getDescent();
	    int sp = fontmetrics.stringWidth(" ");

	    StringTokenizer st = new StringTokenizer(text);
	    int nextx, x = 0, y = 7;	// seven?
	    String word, space = " ";
	    String line = "";
	    Vector lines = new Vector();
	    int w=0;
	    
	    // Start off with the first word on the first line.
	    if (st.hasMoreTokens()) {
		line = st.nextToken();
		x = fontmetrics.stringWidth(line);
	    }
	    
	    // Add words to line if they are small enough, otherwise start new
	    // line.
	    while (st.hasMoreTokens()) {
		word = st.nextToken();	    		    
		w = fontmetrics.stringWidth(word);
		if(x + sp + w > preferredmaxwidth*getScale()) {
		    lines.addElement(line);
		    //longestline = Math.max(longestline, 
			//    fontmetrics.stringWidth(toWs(line)));
		    x= -sp;
		    line = word;
		} else {
		    line += space + word;
		}
		x += sp + w;
	    }
	    lines.addElement(line);
	    textlines = lines;
	}

	/** Returns a Rectangle that bounds our text */
	public Rectangle getBounds() {
	    return new Rectangle(getCentre().x + (int)(dx*getScale())
		    - width/2, getCentre().y + (int)(dy*getScale()) 
		    - height/2, width, height);
	}

	/** Sets our Font.  Currently just uses the default for the view */
	private void setFont() {
	    font = view.getDefaultFont();
	    fontmetrics = view.getFontMetrics(font);
	    setText(text);	// Need to recalculate the word wrapping.
	}

    }

    // Methods

     /** Constructor */
    public GraphicViewObject(ModelObject object, GraphicView view) {
	
	this.view = view;	    
	this.modelobject= object;		

	// Create our GVAttributes.
	Iterator i = getModelObject().getAttributes();
	attributes = new Vector();
	while (i.hasNext()) {
	    ModelAttribute ma = (ModelAttribute)i.next();
	    D.o("Creating GVAtt for "+ma.getName());
	    attributes.add(new GraphicViewAttribute(ma));
	}
	
	linksiteratorbuilder = new LinkedList();
    }
   
    /** The rectangle wrapping our image. Perhaps later we cna have a polygon
     *  for this, so we can have more exciting shapes. */
    abstract public Rectangle getImageBounds();

    /** The rectangle that the user can click to select an object.  We will
     *  also use this rectangle to draw the "selected box". */
    abstract public Rectangle getSelectableBounds();

    /** The least upper rectangular bounds of the area dirtied by a change to
     *  this object.*/
    abstract public Rectangle getDirtyBounds();    

    /** The bounds of the area that is highlighted when this object is
     * highlighted. */
    Rectangle getHighlightBounds() {
	// Linda do this.
	// getSelectableBounds + 5 in every direction.
	return null;
    }
    
    /** To draw this object. This may return null. */
    abstract public Image getImage();

    /** To link to this object we frequently need to know this. */
    abstract public Point getCentre();   

    /** To set whether the object is hidden. */
    abstract public void setHidden(boolean hidden);

    /** Returns whether the object is hidden. */
    abstract public boolean isHidden();

    /** Returns the scale (size) of the object. */
    abstract public double getScale();

    /** Sets the scale of the object. */
    abstract public void setScale(double scale);

    abstract public void reset();


    /** Returns true iff this object is currently highlighted */
    public boolean isHighlighted() {
	return view.getHighlightedObjects().contains(this);
    }
    
    /** Sets whether this object is highlighted */
    public void setHighlighted(boolean highlight) {
	if (highlight) {
	    if (!isHighlighted()){
		view.getHighlightedObjects().add(this);
	    }
	}
	else{
	    // if element is selected, we deselect it, otherwise we do nothing. 
	    if (isHighlighted()) {		
		view.getHighlightedObjects().remove(this);
	    }
	}
    }
    
    /** Returns an iterator of our attributes */
    protected Iterator getAttributes() {
	return attributes.iterator();
    }

    /** Returns a bounding rectangle for all of our attributes*/
    protected Rectangle getAttributeBounds() {
	Iterator i = getAttributes();
	Rectangle totalbounds = null;
	while (i.hasNext()) {
	    Rectangle attbounds = ((GraphicViewAttribute)i.next()).getBounds();
	    if (attbounds != null) {
		if (totalbounds == null) {
		    totalbounds = attbounds;
		} else {
		    totalbounds.add(attbounds);
		}
	    }
	}
	return totalbounds;
    }

    /** Returns an iterator of our text attributes */
    protected Iterator getTextAttributes() {
	// Eventually we'll keep a collection of these, but for the moment we
	// only have one, our name.
	return Collections.singleton(nameattribute).iterator();
    }

    /** Returns the name or annotation of this graphic view object. 
     *  This may return null if the name has not been set. 
     */
    public String getName() {
	return getModelObject().getName();
    }
    

    /** Sets the name of this graphic view object. 
     *  @param name	the name to be assigned
     */
    public void setName(String newname) {
	D.o("Setting name "+newname);
	try {
	    getModelObject().setName(newname);
	} catch (Exception e) {
	    D.a(e);
	}
	updateName();	    // Update the cache.
    }


    /** Returns the comment of the object. This may return null. */
    public String getComment() {
	return getModelObject().getComment();
    }

    /** Set the comment for the object. */
    public void setComment(String newcomment) {
	D.o("Setting comment");
	try {
	    getModelObject().setComment(newcomment);
	} catch (Exception e) {
	    D.a(e);
	}
    }
   

    /** Updates our name without changing the name of the model object. */
    public void updateName() {
	nameattribute.setText(getName());
    }

    /** Returns the model-side object this graphic view element represents. */
    public ModelObject getModelObject() {
	return modelobject;
    }


    /** Returns an collection of GraphicViewLinks which correspond to links of
     *  this graphic view element. Any and all of the elements links
     *  are returned. 
     */
    public Collection getLinks() {
	Iterator i = getModelObject().getLinks().iterator();
	linksiteratorbuilder.clear();
	
	while (i.hasNext()) {
	    linksiteratorbuilder.add(view.getViewLink((ModelLink)i.next()));
	}
	return linksiteratorbuilder;
    }
 
}

