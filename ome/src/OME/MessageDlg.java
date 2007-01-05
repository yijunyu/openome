/*
    A basic extension of the java.awt.Dialog class
 */
package OME;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MessageDlg extends Dialog {

	private String message;
	private Label msgLabel;
	private Button okButton;

	public MessageDlg(Frame parent, String title, String message) {
		super(parent, true);
		setTitle(title);
		this.message = message;

		addNotify();

		setLayout(null);
		setSize(getInsets().left + getInsets().right + 280,getInsets().top + getInsets().bottom + 90);

		msgLabel = new Label("",Label.CENTER);
		msgLabel.setBounds(getInsets().left + 10,getInsets().top + 10,260,35);
		add(msgLabel);

		okButton = new Button("OK");
		okButton.setBounds(getInsets().left + 90,getInsets().top + 50,100,25);
		add(okButton);

		setResizable(false);
		//}}

		msgLabel.setText(message);

		//{{REGISTER_LISTENERS
		Window lWindow = new Window();
		addWindowListener(lWindow);
		Action lAction = new Action();
		okButton.addActionListener(lAction);


		Rectangle bounds = getParent().getBounds();
		Rectangle abounds = getBounds();

		setLocation(bounds.x + (bounds.width - abounds.width)/ 2,
			bounds.y + (bounds.height - abounds.height)/2);

		setVisible(true);
	}



	private void okButton_Clicked() {
		setVisible(false);
	}

	class Action implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent event) {
			Object object = event.getSource();
			if (object == okButton)
				okButton_Clicked();
		}
	}



	private void MessageDlg_WindowClosing(WindowEvent event) {
		setVisible(false);
		dispose();
	}

	class Window extends WindowAdapter {
		public void windowClosing(java.awt.event.WindowEvent event) {
			Object object = event.getSource();
			if (object == MessageDlg.this)
				MessageDlg_WindowClosing(event);
		}
	}
}
