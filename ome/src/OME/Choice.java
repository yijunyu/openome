package OME;

/** This class contains the information necessary to present a particular 
  * option to a user and to record thier response to that option (ie whether 
  * the option should be selected or not).  This class is used by 
  * CheckboxChooser and could be used by other classes in the future
  * (maybe a RadiobuttonChooser etc).
  *
  * @author:  Michael Higginson
  * Date:    June 1999
  */


public class Choice {

    private boolean enabled = true;
    boolean mandatory = false;
    boolean chosen = false;
    String name;
    String description;
    Object choiceobject;
  

    /** Creates a Choice.*/
    public Choice() {}

    /** Creates a Choice with the specified name. 
      *
      * @param name the name of this <code>Choice</code>. 
      */
    public Choice (String name) {
	this.name = name;    
    }
    
    /** Returns whether this Choice is mandatory or not. 
      * Mandatory choices are shown but are not modifiable. 
      */
    public boolean mandatory() {
	return mandatory;
    }

    /** Returns the (user-friendly) name of this Choice. */
    public String name() {
	return name;
    }

    /** Returns the (user-friendly) description for this Choice. 
      * (CheckboxChooser does not currently use this).
      * 
      * @return the desciption of the <code>Choice</code>.
      */
    public String description() {
	return description;
    }

    /** Returns whether this Choice has been chosen. */
    public boolean chosen() {
	return chosen;
    }

    /** This method returns the object associated with this Choice.  
      * This allows us to associate things we might actually use with this 
      * choice (instead of having to deal with user-friendly strings all the 
      * time).
      */
    public Object choiceObject() {
	return choiceobject;
    }

    /** Sets whether this choice is mandatory or not. Mandatory choices are 
      * shown but are not modifiable. 
      *
      * @param m the boolean value indicating whether this <code>Choice</code> 
      * is mandatory or not.
      */
    public void setMandatory(boolean m) {
	mandatory = m;
	// Something that is mandatory cannot be changed.
	setEnabled(false);
	// Something that is mandatory is chosen.
	if (mandatory) {
	    chosen = true;
	}
    }

    /** Sets the name of this Choice.
      *
      * @param s the name of the <code>Choice</code>.
      */
    public void setName(String s) {
	name = s;
    }

    /** Returns the name of this Choice.
      *
      *	@return the name of the <code>Choice</code>.
      */
    public String getName() {
	return name;
    }
    
    

    /** Sets the description of this Choice. (checkboxChooser does not currently
      * use this).
      *
      * @param s the description of this <code>Choice</code>.
      */
    public void setDescription(String s) {
	description = s;
    }

    /** Sets whether this Choice is chosen.       
      * 
      * @param b a boolean value indicating whether this <code>Choice</code> is 
      * chosen or not. 
      */
    public void setChosen(boolean b) {
	chosen = b;
    }

    /** Sets the Object associated with this Choice. 
      *
      * @param o the <code>object</code> associated with this 
      * <code>Choice</code>.
      */
    public void setChoiceObject(Object o) {
	choiceobject = o;
    }

    /** sets whether the Choice should be enabled. 
      * 
      * @param b a boolean value indicating whether this <code>Choice</code> is
      * enabled or not.
      */
    public void setEnabled(boolean b) {
	enabled = b;
    }

    /** returns whether this Choice is enabled. 
      *
      * @return whether this <code>Choice</code> is enabled or not.
      */
    public boolean isEnabled() {
	return enabled;
    }
}
