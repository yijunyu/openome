package OME;

import java.awt.Image;
import java.util.Collection;

/** @version May, 2003 (clean up)
  *
  * This class is an adapter class that implements all the methods in the
  * <code>PluginMethod</code> interface as no-op's. 
  *
  * <P>This class exists as a convenience so that classes wishing to implement 
  * the PluginMethod interface can instead extend this class and override the 
  * methods of interest. (If one implements the PluginMethod interface, one has  
  * to define all of the methods in it. This adapter class defines no-op 
  * methods for them all, so that one need only define the methods one cares
  * about). 
  *
  * @see PluginMethod
  */
public abstract class AbstractPluginMethod implements PluginMethod {

    // Default implementation of methods as no-op's.
    /** Return Image associated with this PluginMethod. */
    public Image getImage() {return null;}
    
    /** Return name of this PluginMethod. */
    public String getName() {return null;}
    
    
    /** Return the collection of PluginMethods that will constitute the
      * submenu of this PluginMethod, depending on the view context. This is 
      * only valid if this PluginMethod is used to implement a submenu. 
      * Otherwise this should return null.  The <code>ViewContext</code> is 
      * provided so the submenu may be dynamically populated.
      *
      * @param ovc the view context for which we want the submenu     
      */
    public Collection getSubmenu(ViewContext ovc) {return getSubmenu();}
    
    
    /** Return the collection of PluginMethods that will constitute the
      * submenu of this PluginMethod. This is only valid if this PluginMethod 
      * is used to implement a submenu. Otherwise this should return null. 
      */
    public Collection getSubmenu() {return null;}
    
    
    /** Returns the next parameter to be used when this PluginMethod is 
      * invoked. 
      */
    public PluginParameter nextParameter() {return null;}
    
    
    /** Passes a parameter (as a singleton Collection) to this PluginMethod. 
      *
      * @param c a singleton <code>Collection</code> containing the parameter 
      * to be passed to this PluginMethod. 
      */
    public void passParameter(Collection c) {}
    
    
    /** Execute this PluginMethod. This is analogous to the 
      * <code>actionPerformed</code> method in <code>ActionListener</code>'s.
      */
    public void invoke() {

    }
    
    
    /** Cancel this PluginMethod. This method should do any neccessary clean 
      * up and exit the PluginMethod gracefully. 
      */
    public void cancelled() {}
    
    
    /** Returns whether this PluginMethod should be enabled given the
      * specified view context. 
      *
      * @param con the <code>ViewContext</code> for which this PluginMethod is
      * called.
      */
    public boolean isEnabled(ViewContext con) {return true;}
}

