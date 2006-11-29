package edu.toronto.cs.ome.model;

import java.awt.Image;
import java.awt.Point;
import java.util.Iterator;

import edu.toronto.cs.ome.view.ImageTable;


/** A framework within which OME can generate models. 
 *  The framework is responsible for maintaining the types of 
 *  objects, and information and restrictions associated with those types.   
 *  Types may have names, Images, Image sizes and positions, as well these
 *  types may be a type of link or element.
 */
 
/** This interface describes all the methods that need to be implemented by
  * any framework that is to be supported by OME. These methods specifically
  * include methods for maintaining the types of objects, as well as information
  * restrictions associated with thos objects. Here types may have associated names, 
  * images, images sizes and positions. In addition, these types may be a type of 
  * link or element.
  */
public interface OMEFramework {
    
    
    /** Returns all the classes in the framework, both instantiable and not. */
    public Iterator getAllTypes();
    
    
    /** Returns only those classes that can be directly instantiated. */
    public Iterator getAllInstantiable();
    
    
    /** Returns the top level types for the framework. These will almost
     *  certainly not be implementable. 
     */
    //public Iterator getTopLevelTypes();


    /** Returns the type as found by its name.  Returns null if there is no
     * type with that name. */
    public Object getType(String name);

    
    /** Returns any supertyps that this class has. */
    // public Iterator getSuperTypes(Object subtype);


    /** Returns any subtypes that this class has. */
    //public Iterator getSubTypes(Object supertype);
    

    /** Returns any instances that this class has. */
    //public Iterator getInstances(Object metatype);
    

    /** Returns all classes that this type is in. */
    //public Iterator getClasses(Object instance);
    

    /** Returns the name of a type. 
      *
      * @param o the object (type) whose name we want. 
      */
    public String getName(Object o);
    

    /** Get the base type of object. Later we can change it to something
      * useful 
      */
    // public Object getDefaultType();
    
    /** Returns the STRING DESCRIPTION of the stroke associated with a link
      * type. If the link does not have a stroke explicitly described in the
      * framework (or if an element or attribute type is passed), the return
      * value will be "solid".
      */
    public String getStrokeString(Object type);

    /** Returns true iff the GUI should automatically generate widgets to
     * created instances of this type.  If the type is not-instantiable, the
     * answer is false.
     */
    public boolean autoGenInterface(Object type);

    
    /** Returns the possible imagenames for a specified type. This collection 
      * is not likely writeable. 
      *
      * @param type the type whose possible image names we want.
      * @return an <code>Iterator</code> of possible image names for the
      * specified type
      */
    public Iterator getImageNames(Object type);


    /** Returns the filename of an image for a specified type. 
      *
      * @param type the type whose image filename we want.
      */
    public String getImageFilename(Object type);


    /** Returns the principal image for a type. 
      *
      * @param type the type whose principal image we want.
      */
    public Image getImage(Object type);


    /** Returns the object's images' width. If the width returned is zero, then it
      * means don't scale but instead use the image's pixel width. 
      *
      * @param o the object whose width we want.
      */
    public int getImageWidth(Object o);


    /** Returns the object's images' height. If the height returned is zero, then it
      * means don't scale but instead use the image's pixel height. 
      */
    public int getImageHeight(Object o);


    /** Returns the position of the given object (if it has one). This object 
      * is most likely the target of an attribute, and in this case the
      * position is relative to the object that has the attribute.
      * <I>Note</I> This could return null, so always check before using it.
      */
    public Point getPosition(Object o);

    
    /** Returns the framework's ImageTable. */
    public ImageTable getImageTable();


    /** Returns whether type is an element or not.
      * 
      * @param type the type which we are checking is an element.
      * @return true if the specified type is an element and false otherwise.
      */
    public boolean isElement(Object type);
    

    /** Returns whether type is a link or not.
 	  *
 	  * @param type the type which we are checking is an link
 	  * @return true if the specified type is a link and false otherwise.
      */
    public boolean isLink(Object type);
    

    /** Returns whether type is expandeable. 
      *
      * @return true if specified type is expandable and false otherwise.
      */
    public boolean isExpandable(Object type);

    /** Is the "comment" feature supported for this framework.  The comment is
     *  simply a string attribute (sort of like name) that every object in the
     *  model has.  It allows us to associate arbitrary information with an
     *  object in the model, but not have it drawn on the screen (as it is with
     *  name).  This feature is really just a work around until we get
     *  arbitrary (value) attributes supported.
     */
    public boolean isCommentSupported();
    
}
