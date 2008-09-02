package edu.toronto.cs.ome.controller;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/** This class provides a way of receiving a single line of input from the
  * user using a dialog. It displays a question (request) and returns an 
  * answer using a static method. In the future, other static methods 
  * capable of receiving more than a single line of input could be added. 
  */
public class InputDialog {

    /** All methods of this class are currently static and thus this class
      * should never be instantiated.
      */
     public InputDialog() {}

    /** This method provides a way of displaying a question (request) and	
      * receiving a single line of input from the user. It creates a 
      * dialog which displays the request and has an input text field
      * for the user to enter the input.
      * 
      * @param parent the parent frame over which this dialog should be 
      * displayed. This dialog will be centered over the parent JFrame.
      * @param title the title of the dialog diaplayed.
      * @param request the question (request) to be asked from the user
      * @param defaultanswer the default answer to above question. The 
      * user will usually ignore this default and enter some new answer.
      */
    public static String getInput(JFrame parent, String title, 
				    String request, String defaultanswer) {
	
	String answer = null;
	JPanel panel = new JPanel(new GridLayout(0,1));
	panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	panel.add(new JLabel(request));
	//JTextField namefield = new JTextField(defaultanswer,20);
	JTextArea namefield = new JTextArea(defaultanswer,20, 10);
	namefield.selectAll();
	panel.add(namefield);
	ContinueCancelDialog dialog = 
	    new ContinueCancelDialog (parent, title, panel);

	// display dialog and return name of new project
	if (dialog.showDialog() != ContinueCancelDialog.CANCEL) {
	    answer = namefield.getText();
	} 
	return answer;
    }
}
