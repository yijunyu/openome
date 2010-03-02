/* TelosFrameWork.java
 * 
 * Created September 1998 by Joseph Makuch
 * 
 * copyright.
 */
package edu.toronto.cs.ome.model;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import jtelos.Attribute;
import jtelos.KB;
import jtelos.Proposition;
import util.D;
import edu.toronto.cs.ome.view.ImageTable;
import edu.toronto.cs.telos.TelosInteger;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.telos.TelosParserKB;
import edu.toronto.cs.telos.TelosReal;
import edu.toronto.cs.telos.TelosString;

/**
 * TelosFramework is a framework implemented in Telos. The types that it works * with are telos types. It is responsible for maintaining the types used by the * modelling system.
 */

public class TelosFramework implements OMEFramework, TelosFunctionality {

	//private TelosParserKB kb;
	private KB kb;

	/**
	 * 
	 * @uml.property name="imagetable"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	ImageTable imagetable;

	Map types2dimensions; // contains optional dimensions for images.
	/**
	 * Returns all the classes in the framework, both instantiable and not. This
	 * does not return objects from the meta level. These don't even exist in
	 * other modelling languages than telos.
	 */
	public Iterator getAllTypes() {
		Proposition omevisible = kb.individual(OME_VISIBLE_CLASS);
		Proposition visible[] = omevisible.directInstances();
		Proposition omeinstantiable = kb.individual(OME_INSTANTIABLE_CLASS);
		Proposition instantiable[] = omeinstantiable.directInstances();
		Proposition [] alltypes=new Proposition[visible.length+instantiable.length];
		for(int i=0;i<visible.length;i++){
			alltypes[i]=visible[i];
		}
		int duplicate=0;
		for(int j=0;j<instantiable.length;j++){
			boolean existing =false;
			for(int h=0;h<visible.length;h++){
				if((instantiable[j].telosName()).equals(visible[h].telosName())){
					existing=true;
					duplicate++;
				}
			}
			if(existing==false)
			alltypes[visible.length+j]=instantiable[j];
		}
		Proposition [] newalltypes=new Proposition[alltypes.length-duplicate];
		for(int i=0;i<newalltypes.length;i++){
			newalltypes[i]=alltypes[i];
		}
		//alltypes.length=alltypes.length-duplicate;
		return Arrays.asList(newalltypes).iterator();
	}

	/** Returns only those classes that can be directly instantiated. */
	public Iterator getAllInstantiable() {
		if (kb==null) return null;
		//Proposition omeinstantiable= kb.individual(OME_INSTANTIABLE_CLASS);
		TelosParserIndividual omeinstantiable =(TelosParserIndividual) (kb.individual(OME_INSTANTIABLE_CLASS));
		//D.o("omeinstantiable :\n "+JTelosUtil.telosDeclaration(omeinstantiable ));
	    omeinstantiable.telosKB=(TelosParserKB)kb;
		Proposition instantiable[] = omeinstantiable.directInstances();
		//for(int i=0;i<instantiable.length;i++){
			//D.o("omeinstantiable :\n "+JTelosUtil.telosDeclaration(instantiable[i]));
		//}
		return Arrays.asList(instantiable).iterator();
	}

	/**
	 * Returns the top level types for the framework. These will almost
	 * certainly not be implementable.
	 */
	public Iterator getTopLevelTypes() {
		return null;
	}

	/**
	 * Returns an the type as found by its name. Returns null if we found squat.
	 */
	public Object getType(String name) {
		Iterator i = getAllTypes();
		while (i.hasNext()) {
			Proposition type = (Proposition) i.next();
			if (getName(type).equals(name)) {
				return type;
			}
		}
		return null;
	}

	/** Returns any subtypes that this class has. */
	public Iterator getSubTypes(Object supertype) {
		return null;
	}

	/** Returns any instances that this class has. */
	public Iterator getInstances(Object metatype) {
		return null;
	}

	/** Returns all classes that this type is in. */
	public Iterator getClasses(Object instance) {
		return null;
	}

	/**
	 * Returns the STRING DESCRIPTION of the stroke associated with a link type.
	 * If the link does not have a stroke explicitly described in the framework
	 * (or if an element or attribute type is passed), the return value will be
	 * "solid".
	 */
	public String getStrokeString(Object type) {
		Proposition p = toProposition (type);
		try {
			Proposition a[] = p.attributes(STROKE, NOLABEL);
			// get the name out of the attribute.
			return ((TelosString) a[0].to()).stringValue();
		} catch (Exception e) {
			return "solid";
		}
	}

	/**
	 * Returns true iff the GUI should automatically generate widgets to created
	 * instances of this type. If the type is not-instantiable, the answer is
	 * false. Checks the "autogui" attribute in the type declaration. If the
	 * value of the attribute is greater than 0, returns true. Returns valse if
	 * the value is less than 1, or not set.
	 */
	public boolean autoGenInterface(Object type) {
		Proposition p = toProposition(type);
		try {
			Proposition a[] = p.attributes(AUTOGUI, NOLABEL);
			return ((TelosInteger) a[0].to()).intValue() >= 1;
		} catch (Exception e) {
			// Presumably the value isn't set. This is allowable.
			return false;
		}

	}

	/** Returns all imagenames for a type. It is possible for this to be empty. */
	public Iterator getImageNames(Object o) {
		Proposition p = toProposition(o);
		Proposition a[] = p.attributes(IMAGE_NAME, NOLABEL);
		// get the names out of the attributes.
		List l = new Vector(10,10);
		for (int i = 0; i < a.length; i++) {
			l.add(((TelosString) a[i].to()).stringValue());
		}
		return l.iterator();
	}

	/**
	 * Returns the filename of an image for a type.
	 */
	public String getImageFilename(Object type) {
		Proposition t = toProposition (type);
		Proposition a[] = t.attributes(IMAGE_NAME, NOLABEL);
		String filename = ((TelosString) a[0].to()).stringValue();
		return filename;
	}

	/** Returns the principal image for the type. */
	public Image getImage(Object type) {
		try {
			Image image = null;
			if (type != null) {
				D.a(type);
				image = imagetable.getImage(type);

				int width = 0, height = 0;

				if (image == null) {
					// if it ain't loaded yet: we get it, then set it up.
					//D.o("framework initializing image for "+getName(type));
					Proposition t = toProposition(type);
					Proposition a[] = t.attributes(IMAGE_NAME, NOLABEL);
					if(a.length==0){
						a = t.attributes(ATTRIBUTE,"imagename");
					}
					if (a.length > 0) {
						String filename = ((TelosString) a[0].to())
								.stringValue();
						//D.o("image filename = " + filename);
						image = imagetable.putImage(filename, type);
						//D.o("image put.");
						if (image == null)
							System.out.println("image file not found: " + filename);
					}
					// set up the scaling for the image. If we have any default
					// sizes to
					// work with, then store it in types2dimensions.
					width = 0;
					height = 0;
					Proposition w[] = t.attributes(IMAGE_SIZE,
							IMAGE_WIDTH_LABEL);
					Proposition h[] = t.attributes(IMAGE_SIZE,
							IMAGE_HEIGHT_LABEL);
					if (w.length != 0) {
						
						width = ((TelosInteger) w[0].to()).intValue();
						//		    D.o("found width of: " + width + " for " +
						// getName(type));
					}
					if (h.length != 0) {
						
						height = ((TelosInteger) h[0].to()).intValue();
						//		    D.o("found height of: " + height + " for " +
						// getName(type));

					}

					if (width != 0 || height != 0) {
						if (width == 0) {
							width = imagetable.getWidth(image);
						}
						if (height == 0) {
							height = imagetable.getHeight(image);
						}
						types2dimensions
								.put(type, new Dimension(width, height));
					}
				} else {
					//D.o("framework has already got image for
					// "+getName(type));
				}
				// if we are to scale it then do so else use it as it is:
				Dimension dim = (Dimension) types2dimensions.get(type);
				if (dim != null) {
					//D.o("imagetable get scaling: ");
					if (image!=null)
						return imagetable.getScaling(image, (double) dim.width
							/ imagetable.getWidth(image), (double) dim.height
							/ imagetable.getHeight(image));
					System.out.println("Wrong image");
					return null;
				} else {
					return image;
				}
			} else {
				return image;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * @param type
	 * @return
	 */
	private Proposition toProposition(Object type) {
		Proposition t=null;
		if(type instanceof TelosString) 
		{  t=(Proposition) kb.individual(type.toString());
		}	
		
		else if(type instanceof TelosInteger){
			t=(Proposition) kb.individual(type.toString());
		}
		else if(type instanceof TelosReal){
			t=(Proposition) kb.individual(type.toString());
		}
		else
		{ t = (Proposition) type;}
		return t;
	}

	/**
	 * Returns the object's images' width. It is not clear why this would be
	 * called at this point.
	 */
	public int getImageWidth(Object type) {
		return imagetable.getWidth(getImage(type));
	}

	/** Returns the object's images' height. */
	public int getImageHeight(Object type) {
		return imagetable.getHeight(getImage(type));
	}

	/** Returns the framework's ImageTable. */
	public ImageTable getImageTable() {
		return imagetable;
	}

	/** Returns the position of the given object. See OMEFramework. */
	public Point getPosition(Object o) {
		Proposition p = toProposition(o);
		if (p!=null) {
			Proposition px[] = p.attributes(IMAGE_POSITION, IMAGE_X_LABEL);
			Proposition py[] = p.attributes(IMAGE_POSITION, IMAGE_Y_LABEL);
			int x, y;
			if (px.length != 0 && py.length != 0) {
				x = (((TelosInteger) px[0].to()).intValue());
				y = (((TelosInteger) py[0].to()).intValue());
				return new Point(x, y);
			}
		}
		return null;
	}

	/**
	 * Returns a basic type with which can later be changed to something more
	 * useful.
	 */
	public Object getDefaultType() {
		// we return the first instantiable element.
		Iterator i = getAllInstantiable();
		Proposition element = kb.individual(OME_ELEMENT);
		while (i.hasNext()) {
			Proposition p = (Proposition) i.next();
			if (p.isChildOf(element)) {
				return p;
			}

		}
		D.o("Ack! No instantiable elements in framework!"
				+ " \nGetDefaultFramework returning null!");
		return null;
	}

	/** Whether instantiable type is a type of element. */
	public boolean isElement(Object o) {
		return ((Proposition) o).isChildOf(kb.individual(OME_ELEMENT));
	}

	/** Whether instantiable type is a type oflink. */
	public boolean isLink(Object o) {
		return ((Proposition) o).isChildOf(kb.individual(OME_LINK));
	}

	/** Whether instantiable type is expandable. */
	public boolean isExpandable(Object o) {
		return ((Proposition) o).isChildOf(kb.individual(OME_GROWABLE_ELEMENT));
	}

	// Telos specific methods.

	/** This is a constructor */
	public TelosFramework(KB kb) {
		//D.o("Creating Framework");
		this.kb = kb;
		this.imagetable = new ImageTable();
		this.types2dimensions = new HashMap();

		//D.o("Created Framework");
	}

	/**
	 * Returns the name of a type. This returns the type's name, which is
	 * different from the telos-propositions's label.
	 */
	public String getName(Object o) {
		Proposition p = toProposition(o);
		if (p != null) {
			TelosString s = null;
			Attribute a[] = p.attributes(NAME, NOLABEL);
			if (a.length != 0)
				s = (TelosString) a[FIRST].to();
			else {
				return "";
			}
			return s.stringValue();
		} else {
			//D.o("Asked for name of null type.");
			return ""; // Empty string is somewhat reasonable...
		}
	}

	/** Returns true iff the "comment" feature is supported by the framework. */
	public boolean isCommentSupported() {
		Proposition omeelement = kb.individual(OME_ELEMENT);
		try {
			Attribute atts[] = omeelement.attributes(ATTRIBUTE, COMMENT[0]);
			if (atts.length != 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
