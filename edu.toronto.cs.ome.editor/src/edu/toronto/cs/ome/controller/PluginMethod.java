/* Revised by Zhifeng Liu Jul-Aug 2004
  Please refer to the added comments for detail
*/
package edu.toronto.cs.ome.controller;

import java.awt.Image;
import java.util.Collection;

import edu.toronto.cs.ome.view.ViewContext;


/** This interface describes the methods that needed to be implemented by
  * any plugin method in OME. These methods provide insight as to how plugin
  * methods work in OME. When a user initiates a PluginMethod, the parameter 
  * collecting phase (see <code>PluginParameter</code>) begins.  Parameters 
  * will continue to be collected as long as <code>nextParameter()</code> 
  * returns non-null values.  Collected parameters will be supplied to the 
  * method via <code>passParameter()</code>. When the method indicates that 
  * no more parameters are desired, the invoke() method will generally be called 
  * to execute the method.
  *
  * <P>PluginMethods can also be used to implement sub-menus off the menu
  * structure to which they are hooked-up.  In this case, they should return a
  * Collection of PluginMethods which comprise the submenu for getSubmenu().
  *
  * <P> An adapter class <code>AbstractPluginMethod</code> implements all the 
  * methods in this interface as no-op's. Thus classes wishing to implement the
  * <code>PluginMethod</code> interface may find it more convenient to instead
  * extend this adapter class.
  *
  * @see PluginMethod
  */
public interface PluginMethod {
    
    /** This method is called by the view after it has been notified by
      *  nextParameter() that there are no more parameters to be collected.
      */
    public void invoke();

    // Added by Zhifeng Liu(Jul 25 2004)
    //to support Mnemonics such as (Alt+F to activate "File" Menu)
    /** The Mnemonics Index to be used for listing the Mnemonics...
     */
    public int getMnemonic ();
               
    // Added by Zhifeng Liu(Jul  2004)
    /*Provides a hint to the look and feel as to which character in 
      the text should be decorated to represent the mnemonic. 
      
      Only to call "javax.swing.AbstractButton.setDisplayedMnemonicIndex"() 
      if you do not wish the default character to be underlined. For example,
       if the text was 'Save As', with a mnemonic of 'a', and you wanted the 
       'A' to be decorated, as 'Save As', you would have to let 
      getDisplayedMnemonicIndex return 5, then invoke
      setDisplayedMnemonicIndex(5) after invoking setMnemonic(KeyEvent.VK_A).
      
     */
    public int getDisplayedMnemonicIndex ();
    
    // Added by Zhifeng Liu(Jul  2004)
    /*to support accelerator-based activation of menu.
      For example Ctrl+S to save, Ctrl+O to open */
    public String getAcceleratorStr();
    
    /** The name to be used for listing in menus and tooltips etc...*/
    public String getName();
    
    /** The image to be associated with this method. */
    public Image getImage();

    /** If the purpose of this method is to provide access to a set of
      * other methods (like a menu), return those other methods.  If
      * that is not the purpose of this method, it should return null.
      * The ViewContext is provided so the menu may be dynamically populated.
      * 
      * @param ovc the view context for which we want the submenu
      */
    public Collection getSubmenu(ViewContext ovc);

    /** If the purpose of this method is to provide access to a set of
      * other methods (like a menu), return those other methods.  If
      * that is not the purpose of this method, it should return null. The
      * toolbar is not aware of context when it is created so we must support
      * a context-less submenu query...
      */
    public Collection getSubmenu();

    /** Returns a <code>PluginParameter</code> that specifies the type of
      * parameter the method wants next <I>OR </I> if the method doesn't want 
      * any more parameters returns null. 
      *
      * <P>The parameter requesting a location will return the location
      * where the Popup Menu was opened if this method was attached to the
      * Popup Menu.
      */
    public PluginParameter nextParameter();

    /** The View will call this routine to pass the parameter requested by the
      *  return value of the last call to nextParameter().
      *
      * @param parameter the parameter to be passed to the <code>PluginMethod</code>.
      * <I>Note:</I> This parameter is passed as a singleton collection.
      */
    public void passParameter(Collection parameter);

    /** Indicates that user has aborted the method during the parameter
      *  collection phase (typically through the ESCAPE key).  The method
      *  should clean itself up at this point, as invoke will not be called.
      */
    public void cancelled();

    /** Returns whether this method should be enabled or not, given the view context.
      *  
      * @param con the view context to decide whether this method should be enabled or not.
      */  
    public boolean isEnabled(ViewContext con);
    
}

