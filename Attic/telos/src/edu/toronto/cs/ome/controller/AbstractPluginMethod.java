/* Revised by Zhifeng Liu Jul-Aug 2004
  Please refer to the added comments for detail
*/
package edu.toronto.cs.ome.controller;

import java.awt.Image;
import java.util.Collection;

import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewContext;

/** 
  * This class is an adapter class that implements all the methods in the
  * <code>PluginMethod</code> interface as no-op's and that also includes a 
  * list of the supported parameter types as static fields. 
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

    public static View view;

	// Default implementation of methods as no-op's.
    /** Return Image associated with this PluginMethod. */
    public Image getImage() {return null;}
    
    // Added by Zhifeng Liu(Jul 25 2004)
    //to support Mnemonics such as (Alt+F to activate "File" Menu)
    /** The Mnemonics Index to be used for listing the Mnemonics...
     A value of -1 indicates either there is no mnemonic.
     */
    public int getMnemonic (){return -1;}
    
    // Added by Zhifeng Liu(Jul  2004)
    /*Provides a hint to the look and feel as to which character in 
      the text should be decorated to represent the mnemonic. 
      A value of -1 indicates either there is no mnemonic.
      Only to call "javax.swing.AbstractButton.setDisplayedMnemonicIndex"() 
      if you do not wish the default character to be underlined. For example,
       if the text was 'Save As', with a mnemonic of 'a', and you wanted the 
       'A' to be decorated, as 'Save As', you would have to let 
      getDisplayedMnemonicIndex return 5, then invoke
      setDisplayedMnemonicIndex(5) after invoking setMnemonic(KeyEvent.VK_A).
      
      
     */
    public int getDisplayedMnemonicIndex (){return -1;}
    
    // Added by Zhifeng Liu(Jul  2004)
    /*to support accelerator-based activation of menu.
      For example Ctrl+S to save, Ctrl+O to open */
    public String getAcceleratorStr() {return null;} 
    
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
    
    public void setView(View view) {
    	this.view = view;
    }
}

