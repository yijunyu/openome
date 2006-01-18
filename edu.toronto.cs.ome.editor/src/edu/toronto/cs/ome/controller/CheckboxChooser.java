package edu.toronto.cs.ome.controller;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

import edu.toronto.cs.util.D;

/** This class is a dialog which displays a ChoicePanel containing a list of 
  * <code>Choice</code>s that can be presented to a user who can then choose
  * which choices should be chosen.
  *
  * <p>If one wishes to use the default Choice Panel in this class, one should
  * pass in a <code>Collection</code> of <code>Choices</code> upon 
  * instatiation of this class. Alternatively if one wishes to provide thier own
  * Choice Panel, then one should instead extend this class and override the
  * <code>getChoicePanel</code> method in order to provide the new choice panel.
  *
  * @see Choice Choice
  *
  * @author:  Michael Higginson 
  * Date:    July 1999
  */
public class CheckboxChooser extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Return value: the user pressed CANCEL to close the dialog. */
    public final static int CANCEL = 1;
    /** Return value: the user pressed CONTINUE to close the dialog. */
    public final static int CONTINUE = 2;

    /** @serial This is a serializable field. */
    private int returnvalue = CANCEL;
    /** @serial This is a serializable field. */
    private Frame owner;

    /** This constructor should be used when using the default choice panel.
      *
      *	@param owner the Frame the dialogue is associated with.
      * @param title the title of the dialogue.
      * @param modal whether the dialogue should be modal (hog focus).
      * @param choices the collection of Choices to be presented to the user.
      */
    public CheckboxChooser (Frame owner, String title, boolean modal,
	    Collection choices) {
	
	super(owner, modal);
	setTitle(title);
	this.owner = owner;
	
	JPanel choicepanel = getChoicePanel(choices);
	constructDialogue(choicepanel);
    }


    /** This constructor should be used when extending this class in order to
      * provide a new choice panel.
      *
      *	@param owner the Frame the dialogue is associated with.
      * @param title the title of the dialogue.
      * @param modal whether the dialogue should be modal (hog focus).
      */
    public CheckboxChooser (Frame owner, String title, boolean modal) {	
	super(owner, modal);
	setTitle(title);
	this.owner = owner;
    }

    /** This method creates the dialog given the choice panel.
      *      
      * @param choicepanel the choice panel containing the choices to be
      * displayed. 
      */
    protected void constructDialogue(JPanel choicepanel) {
	JPanel mainpanel = new JPanel();

	// The mysterious gui code to display everything and make it look
	// reasonable.
	JPanel buttonpanel = new JPanel();
	buttonpanel.setLayout(new BoxLayout(buttonpanel, BoxLayout.Y_AXIS));
	
	JButton continuebutton = new JButton("Continue");
	continuebutton.addActionListener(new ButtonHandler(CONTINUE));
	JButton cancelbutton = new JButton("Cancel");
	cancelbutton.addActionListener(new ButtonHandler(CANCEL));
	cancelbutton.setMaximumSize(new Dimension(
		    continuebutton.getPreferredSize()));

	buttonpanel.add(Box.createVerticalGlue());
	buttonpanel.add(continuebutton);
	buttonpanel.add(Box.createRigidArea(new Dimension(0,10)));
	buttonpanel.add(cancelbutton);
	buttonpanel.add(Box.createRigidArea(new Dimension(0,5)));
	
	mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.X_AXIS));
	mainpanel.add(Box.createRigidArea(new Dimension(10,0)));
	mainpanel.add(choicepanel);
	mainpanel.add(Box.createRigidArea(new Dimension(20,0)));
	mainpanel.add(buttonpanel);
	mainpanel.add(Box.createRigidArea(new Dimension(5,0)));
	setContentPane(mainpanel);
    }
    

    /** Shows the dialogue.  The users selection of checkboxes will be
      *  reflected in the Collection of Choices passed in at construction time.
      *
      *  @return CANCEL or CONTINUE depending on which button the user pressed
      *  to close the dialogue.  (Returns CANCEL if user closed the dialogue by
      *  other means).
      */
    public int showDialog() {
	pack();
	setLocationRelativeTo(owner);
	setVisible(true);
	return returnvalue;
    }


    /** Creates the choice panel based on the collection of choices passed to it.
      * 
      * @param choices the <code>Collection</code> of choices to be displayed
      * in the choice panel.
      */
    private JPanel getChoicePanel(Collection choices) {
	JPanel choicepanel = new JPanel();
	choicepanel.setLayout(new BoxLayout(choicepanel, BoxLayout.Y_AXIS));

	Iterator i = choices.iterator();
	while (i.hasNext()) {
	    Choice c = (Choice)i.next();
	    //D.o("Adding choice: "+c.name());
	    JCheckBox cb = new JCheckBox(c.name(), c.chosen());
	    cb.setEnabled(!c.mandatory());
	    cb.addItemListener(new CheckboxChoiceListener(c));
	    choicepanel.add(cb);
	}
	return choicepanel;
    }
    

    /** This class acts as a button listener which sets the return value, and 
      * disposes of the dialog window. 
      */
    private class ButtonHandler implements ActionListener {
	private int rv;

	/** 
	  * Creates a ButtonHandler initialised with the specified returnvalue.
	  * 
	  * @param returnvalue the value associated with this button (This
	  * value can be either CONTINUE or CANCEL).
	  */
	public ButtonHandler(int returnvalue) {
	    this.rv = returnvalue;
	}

	/** 
	  * Sets the returnvalue and disposes of the dialog window.
	  *
	  * @param e the <code>ActionEvent</code> that triggered this action.
	  */
	public void actionPerformed(ActionEvent e) {
	    returnvalue = rv;
	    dispose();
	}
    }

/**
 * This class acts as a checkbox listener which toggles the state of the 
 * <code>Choice</code> associated with the checkbox when its state is 
 * toggled.
 */

    protected class CheckboxChoiceListener implements ItemListener {

	/**
	 * 
	 * @uml.property name="c"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	Choice c;

	/** 
	  * Creates a CheckboxChoiceListener with the specified choice.
	  *
	  * @param Choice the choice associated with this Checkbox.
	 */
	public CheckboxChoiceListener (Choice c) {
	    super();
	    this.c = c;
	}

	/**
	  * Acts as a listener which toggles the state of the choice associated
	  * with the checkbox, when it's state is toggled.
	  */
	public void itemStateChanged(ItemEvent e) {
	    if (e.getStateChange() == ItemEvent.SELECTED) {
		c.setChosen(true);
	    } else if (e.getStateChange() == ItemEvent.DESELECTED) {
		c.setChosen(false);
		D.o("Setting choice: "+c.name()+ " " + false);
	    }
	}
    }
}
