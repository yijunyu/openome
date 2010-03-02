package edu.toronto.cs.ome.controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class is a dialog with CONTINUE and CANCEL buttons which can be used to
 * display a <code>Container</code>. This class provides the dialog window in
 * which the container can be displayed in. This is useful for displaying
 * dialogs that for example request input from the user. One can then just
 * concerntrate on creating the Container containing the input fields etc and
 * then just "wrap" this container in a ContinueCancelDialog.
 * <P>
 * The Container that will be displayed in the dialog should be passed in at
 * construction time of the ContinueCancelDialog.
 */
public class ContinueCancelDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Return value: the user pressed CONTINUE to close the dialog. */
	public final static int CONTINUE = 1;

	/** Return value: the user pressed CANCEL to close the dialog. */
	public final static int CANCEL = 2;

	/** @serial This is a serializable field. */
	private JFrame owner;

	/** @serial This is a serializable field. */
	private int returnvalue = CANCEL;

	/** @serial This is a serializable field. */
	private JPanel buttonpanel;

	/**
	 * Creates a ContinueCancelDialog with the specified owner and title, with
	 * the specified container contained in the center of the dialog.
	 * 
	 * @param owner
	 *            the <code>JFrame</code> that owns the dialog. This dialog
	 *            will be displayed centered relative to the <code>JFrame</code>.
	 * @param title
	 *            the title of this dialog
	 * @param container
	 *            the container to be displayed in this dialog.
	 */
	public ContinueCancelDialog(JFrame owner, String title, Container container) {

		// create a model dialog with the specified title.
		super(owner, title, true);
		this.owner = owner;
		buttonpanel = constructButtonPanel();

		Container contentpane = getContentPane();
		contentpane.add(container, BorderLayout.CENTER);
		contentpane.add(buttonpanel, BorderLayout.SOUTH);
	}

	/**
	 * Sets the location of the dialog and displays it.
	 * 
	 * @return the value corresponding to the button pressed to close the dialog
	 *         (which is either CONTINUE or CANCEL).
	 */
	public int showDialog() {
		pack();
		setLocationRelativeTo(owner);
		setVisible(true);
		return returnvalue;
	}

	/**
	 * Constructs the button panel containing the CONTINUE and CANCEL buttons.
	 */
	private JPanel constructButtonPanel() {
		JPanel panel = new JPanel();

		JButton continuebutton = new JButton("Continue");
		continuebutton.addActionListener(new ButtonListener(CONTINUE));
		panel.add(continuebutton);

		JButton cancelbutton = new JButton("Cancel");
		cancelbutton.addActionListener(new ButtonListener(CANCEL));
		panel.add(cancelbutton);

		return panel;
	}

	/**
	 * This class implements a listener for the CONTINUE and CANCEL buttons.
	 */
	private class ButtonListener implements ActionListener {

		private int buttontype;

		/**
		 * Creates a ButtonListener with the specified type (CONTINE or CANCEL).
		 * 
		 * @param type
		 *            the type of button (can be either CONTINUE or CANCEL).
		 */
		public ButtonListener(int buttontype) {
			this.buttontype = buttontype;
		}

		/**
		 * Performs the appropriate action depending on the button pressed.
		 * 
		 * @param e
		 *            the <code>ActionEvent</code> that triggered the
		 *            listener.
		 */
		public void actionPerformed(ActionEvent e) {
			returnvalue = buttontype;
			dispose();
		}
	}
}