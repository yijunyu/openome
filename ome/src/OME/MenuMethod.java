package OME;

import java.util.Collection;
import java.util.Vector;

/** This class is a plugin method which is used to implement a submenu 
  * containing several other <code>PluginMethod</code>s (some of which 
  * could be MenuMethods themselves). This class is analogous to Java's
  * JMenu which contains several JMenuItem's some of which could be JMenu's
  * themselves.
  *
  * @see PluginMethod PluginMethod
  */
public class MenuMethod extends AbstractPluginMethod {
  
    private String name;
    private Collection submenu;
    //private KeyStroke ks;

    /** Constructs a menu method.
      * 
      * @param name the name to be associated with this
      * <code>MenuMethod</code>. This is the name that will be displayed in the
      * menubar (if this implements a top-level menu) or in the menu (if this 
      * implements a submenu).
      */
    public MenuMethod (String name) {
	this.name = name;
	submenu = new Vector();
    }

    /** Returns the name of the menu method. 
      *
      * @return the name of the submenu.
      * @see PluginMethod#getName() 
      */
    public String getName() {
	return name;
    }

    /** Returns a collection of <code>PluginMethod</code>s that are contained
      * in the submenu of this <code>Menu Method</code>.      
      *
      * @return the <code>Collection</code> of <code>PluginMethods</code> that 
      * are contained in this <code>MenuMethod</code>.
      *
      * @see PluginMethod#getSubmenu() getSubMenu()
      */
    public Collection getSubmenu() {
	return submenu;
    }

    /** Adds the specified plugin method to the submenu collection. 
      * 
      * @param m the <code>PluginMethod</code> to be added.
      */
    public void addItem(PluginMethod m) {
	submenu.add(m);
    }

    /** Adds all the plugin methods in the specified collection to the submenu
      * of this MenuMethod. Any and all plugin methods previously in the submenu 
      * will be replaced. 
      *
      * @param c the <code>Collection</code> of <code>PluginMethods</code>
      * that to be added to the submenu of this menu method. This collection of 
      * plugin methods will comprise the new submenu of this menu method.
      */
    public void setSubmenu(Collection c) {
	submenu = c;
    }    
}

