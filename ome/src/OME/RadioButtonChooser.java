package OME;

import java.awt.Frame;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/** This class is an extension of the CheckboxChooser which allows at most one 
  * <code>Choice</code> to be selected. Also as the name suggests, radio
  * buttons are used instead of checkboxes to select the choice.
  */
public class RadioButtonChooser extends CheckboxChooser {

	/** Creates a RadioButtonChooser. 
	  *
	  * @see CheckboxChooser#CheckboxChooser(Frame owner, String title, 
	  *	    boolean modal)  CheckboxChooser()
	  *
	  * @param owner the <code>JFrame</code> over which this RadioButtonChooser 
	  * should be displayed. The RadioButtonChooser will be displayed 
	  * centered over the owner.
	  * @param title the title to be shown in the RadioButtonChooser
	  * @param modal the boolean value specifying whether this dialog should 
	  * be modal (hog focus) or not.
	  * @param choices the collection of choices to be displayed in the 
	  * RadioButtonChooser.	  
	  */
    public RadioButtonChooser(JFrame owner, String title, boolean modal,
	    Collection choices) {
	super(owner, title, modal);
	constructDialogue(getChoicePanel(choices));
    }
    
	/** Creates and returns a choice panel to be displayed in the chooser. */
    private JPanel getChoicePanel(Collection choices) {
	JPanel choicepanel = new JPanel();
	choicepanel.setLayout(new BoxLayout(choicepanel, BoxLayout.Y_AXIS));
	ButtonGroup bg = new ButtonGroup();

	Iterator i = choices.iterator();
	while (i.hasNext()) {
	    Choice c = (Choice)i.next();
	    D.o("Adding choice: "+c.name());
	    JRadioButton rb = new JRadioButton(c.name(), c.chosen());
	    bg.add(rb);
	    rb.setEnabled(!c.mandatory());
	    rb.addItemListener(new CheckboxChoiceListener(c));
	    choicepanel.add(rb);
	}
	return choicepanel;
    
    }
    
}
