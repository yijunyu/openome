package OME;

/** This class is used as an indicator that a separator should now be
  * inserted. This is only used when creating <code>MenuMethod</code>s that
  * consists of several <code>PluginMethod</code>s and one wishes to insert a
  * separator between the menu items in the resulting submenu.
  */
public class MenuSeparatorMethod extends AbstractPluginMethod {

	/** This does nothing. 
	  *
	  * @param v the view is not used and is just included here for 
	  * consistency with the constructors of other <code>PluginMethod</code>s.
	  */
    public MenuSeparatorMethod (View v) {
    }

}
