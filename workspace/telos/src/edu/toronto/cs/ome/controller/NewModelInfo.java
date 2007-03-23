package edu.toronto.cs.ome.controller;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** This class creates a dialog requesting the user for the neccessary input, 
  * whenever a new model is created. Currently the input requested includes the
  * the name of the new model, the project which the model should belong to,
  * the frameworks which the model will implement.
  */
class NewModelInfo {
    private ContinueCancelDialog dialog;
    public NewModelInfo(JPanel ome, Collection frameworks) {

	JPanel panel= new JPanel(new GridLayout(0,1));
	panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	// get frameworks which model will implement
	panel.add(Box.createVerticalStrut(3));
	panel.add(new JLabel("Select frameworks which new model will " +
		    " implement"));
	Iterator i = frameworks.iterator();
	while (i.hasNext()) {
	    Choice c = (Choice)i.next();
	    JCheckBox cb = new JCheckBox(c.name(), c.chosen());
	    cb.setEnabled(c.isEnabled());
	    cb.addItemListener(new CheckboxChoiceListener(c));
	    panel.add(cb);
	}
	dialog = new ContinueCancelDialog(new JFrame(), "Model Information", panel);	
    }

    
    /** Displays the dialog requesting information about new model. 
     *  Returns a value specifying whether user wished to continue or cancel
     *  the creation of new model.
     */
    public int showDialog() {
	return dialog.showDialog();
    }

    /** The checkbox listener.  Toggles the state of the Choice associated
     *  with the checkbox when its state is toggled.*/
    protected class CheckboxChoiceListener implements ItemListener {
	Choice c;

	public CheckboxChoiceListener (Choice c) {
	    super();
	    this.c = c;
	}

	public void itemStateChanged(ItemEvent e) {
	    if (e.getStateChange() == ItemEvent.SELECTED) {
	    	c.setChosen(true);
	    } else if (e.getStateChange() == ItemEvent.DESELECTED) {
			c.setChosen(false);
	    }
	}
    }


    
}
