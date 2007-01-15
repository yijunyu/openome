/* ImageTable.java
 *
 * @author Ying Shi
 *
 */

package OME;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;

import javax.swing.JComponent;


/** This class serves to cache images and it also provides simple manipulations 
  * of those images such as scalings and rotations.
  */
public class ImageTable extends JComponent { 
	
    static final String imagepath="images"+File.separator;
  
    /** @serial This is a serializable field. */
    private Hashtable images; // a hashtable of types to arrays of images.
    /** @serial This is a serializable field. */
    private Hashtable scaletable;  // of pairs <Image, Float> to images
    /** @serial This is a serializable field. */
    private Hashtable rotationtable;  // of images to arrays of ROTATIONS images.
    /** @serial This is a serializable field. */
    private MediaTracker mediatracker;
    

    /** Constructs the image table. */
    public ImageTable() {
	    
	images = new Hashtable();
	scaletable = new Hashtable();
	rotationtable = new Hashtable();
	mediatracker = new MediaTracker(this);
	
//	D.o("Created ImageTable");
    }
    
    
    /** Return the specified image and size (loading it from the scaleTable, if it 
      * exists in scaleTable, otherwise creating it and adding it to the scaleTable). 
      * 
      * @param image	the image required
      * @param scale	the scale factor needed for the image
      */
    public Image getScaling(Image image, double scale) {
	return getScaling(image, scale, scale);
    }
    
    /** Return the specified image and size (loading it from the scaleTable, if it 
      * exists in scaleTable, otherwise creating it and adding it to the scaleTable). 
      *
      * @param image	the image required
      * @param widthfactor width multiple desired
      * @param heightfactor height multiple desired
      */
    public Image getScaling( Image image, 
	    double widthfactor,
	    double heightfactor) {

	Image result = (Image)scaletable.get(new Pair(image, 
		new Pair(new Double(widthfactor), new Double(heightfactor))));
	if (result == null) {
	    result = new BufferedImage (
		    (int)Math.rint(image.getWidth(this)*(widthfactor)),
		    (int)Math.rint(image.getHeight(this)*(heightfactor)), 
		    BufferedImage.TYPE_INT_ARGB);
	    
	    Graphics2D g = ((BufferedImage)result).createGraphics();
	    
	    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		    RenderingHints.VALUE_ANTIALIAS_ON);
	    g.setRenderingHint(RenderingHints.KEY_RENDERING,
	    	    RenderingHints.VALUE_RENDER_QUALITY);
	    g.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,
		    RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
	    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
		    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g.scale(widthfactor, heightfactor);
	    
	    boolean rval = g.drawImage(image, 0,0, this);
	    D.a(rval);
	    g.dispose();
	    	    
	    scaletable.put( new Pair(image, new Pair(new Double(widthfactor), 
		    new Double(heightfactor))), result);	    	    
	}	    		
	return result;
    }

    /** Returns a rescaled version of the specified image to the specified 
      * height or width.  If the provided height is 0, the image will be sized 
      * to the specified width, and the image will retain its original 
      * height/width ratio.  Providing a width of 0 work similarly.  If both 
      * width and height are 0, the original image is returned.
      *
      *	@param im the image which should be rescaled
      * @param width the width of the rescaled image
      * @param height the height of the rescaled image
      */
    public Image getSizing(Image im, int width, int height) {
	double widthfactor = 1.0;
	double heightfactor = 1.0;

//	D.o("Come into getSizing!!!");
//	D.o("width of the icon is " +width+" / "+getWidth(im));
//	D.o("height of the icon is " +height+ " / "+getHeight(im));
	
	if (width!=0 && height!=0) {
	    widthfactor = width/(float)getWidth(im);
	    heightfactor = height/(float)getHeight(im);
	} else if (width!=0) {
	    widthfactor = width/(float)getWidth(im);
	    heightfactor = widthfactor;
	} else if (height!=0) {
	    heightfactor = height/(float)getHeight(im);
	    widthfactor = heightfactor;
	}
//	D.o("Width is "+widthfactor+" ; hight is " +heightfactor+" !!!!!!!");
	return getScaling(im, widthfactor, heightfactor);
    }


    /** Return the image with specified image and rotation (loading it from the scaleTable, 
      * if it exists in scaleTable, otherwise creating it and adding it to the scaleTable). 
      * 
      * @param image	the image to be scaled
      * @param rotation	the rotation needed for the image
      */
    public Image getRotation(Image image, float rotation) {
	
	Image result = (Image)rotationtable.get(
		new Pair(image, new Float(rotation)));

	if(result == null) { // we must fill in that entry
	    result = new BufferedImage( 
		    image.getWidth(this), image.getHeight(this),
		    BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g = ((BufferedImage)result).createGraphics();
	    
	    g.rotate((double)rotation,
		    (double)image.getWidth(this)/2.0,
		    (double)image.getHeight(this)/2.0);		    
	    
	    boolean rval = g.drawImage(image, 0, 0, this);
	    D.a(rval);	    
	    g.dispose();
	    
	    rotationtable.put(new Pair(image, new Float(rotation)), result);
		    
//	    D.o("created rotation: "+rotation*360.0/(2.0*Math.PI) + " degrees");
	}
	return result;
    }

    /** Returns the image with the handle. */
    public Image getImage(Object handle) {
	return (Image)images.get(handle);
    }

    /** Stores the image into the cache with the passed handle. The String
      * filename, *can* safely be used for this, but you will take a
      * performance hit, so if you have some other handle lying around, then
      * use it instead. This method will *immediately* load the image, ie: wait
      * to be done before returning.
      *
      *	@param filename a possible handle for the image
      * @param handle an alternative handle to be used, if one chooses not to
      * use the filanem as the handle.
      */
    public Image putImage(String filename, Object handle) {
//	D.o("ImageTable Adding: "+ filename);	
	Image image = Toolkit.getDefaultToolkit().getImage(filename);
	mediatracker.addImage(image,0);
	images.put(handle, image);
	
	try {
	    mediatracker.waitForAll(0);
	} catch (Exception e) {
	    D.a(e);
	}
	
	return image;
    }
    

    /** Gets the width of an image.
      *
      * @param image	the image whose width we want
      */
    public int getWidth(Image i) {
	if(i!=null) {
	    return i.getWidth(this);
	} else {
	    return 0;
	}
    }


    /** Gets the height of an image.
      *
      * @param image	the image whose height we want
      */
    public int getHeight(Image i) {
	if (i!=null) {
	    return i.getHeight(this);
	} else {
	    return 0;
	}
    }


    /** Draws a horizontal line through through an image, and returns the
      * result. Useful for images that represent links.
      *
      * @param im the image which the horizontal line should be drawn through
      */
    public Image drawHLine(Image im) {
	if (im!=null) {
	    BufferedImage bi = new BufferedImage(getWidth(im), getHeight(im),
		    BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g = (Graphics2D)bi.getGraphics();
	    g.drawImage(im,0,0,this);
	    g.setColor(Color.black);
	    g.setStroke(new BasicStroke(2.0f));
	    g.drawLine(0,getHeight(im)/2,getWidth(im),getHeight(im)/2);
	    return bi;
	} else {
	    return null;
	}
    }

    
    private final static float dash[] = {4.0f,2.0f};
    /** Draws a dashed horizontal line through through an image, and returns the
      * result. Useful for images that represent links.
      *
      * @param im the image which the dashed horizontal line should be drawn
      * through.
      */
    public Image drawDashedHLine(Image im) {
	if (im != null) {
	    BufferedImage bi = new BufferedImage(getWidth(im), getHeight(im),
		    BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g = (Graphics2D)bi.getGraphics();
	    g.drawImage(im,0,0,this);
	    g.setColor(Color.black);
	    Stroke s = new BasicStroke(2.0f, BasicStroke.CAP_BUTT,
		BasicStroke.JOIN_MITER,10.0f,dash,0.0f);
	    g.setStroke(s);
	    g.drawLine(0,getHeight(im)/2,getWidth(im),getHeight(im)/2);
	    return bi;
	} else {
	    return null;
	}
    }
}
