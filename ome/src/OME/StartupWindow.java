package OME;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

// Main class - merely creates the frame
// The Frame Window, includes toolbar and statusbars
public class StartupWindow extends JFrame {

	private Label label1;
	private Label label2;
	private Label label3;
	private Label label4;
	private Label label5;
	private Label label6;

	private JProgressBar proBar;

	private int totalEntries = 5;
	private int currentProgress = 0;
	private Container FramePane;
	
	private Dimension WinDimension;

	public StartupWindow() {

		
		FramePane = getContentPane();
		
		FramePane.setLayout(null);

		addNotify();
		setTitle("Starting OME..");
		setResizable(false);
		setSize(getInsets().left + getInsets().right + 350,
				getInsets().top + getInsets().bottom + 190);
		FramePane.setBackground(Color.blue);
		
		label1 = new java.awt.Label("Organizational Modeling Environment",Label.CENTER);
		label1.setBounds(5,5,340,24);
		label1.setFont(new Font("TimesRoman", Font.BOLD, 20));
		label1.setForeground(Color.yellow);
		FramePane.add(label1);

		label2 = new java.awt.Label("Version 3.09",Label.CENTER);
		label2.setBounds(20,36,310,24);
		label2.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 14));
		label2.setForeground(Color.yellow);
		FramePane.add(label2);

		label3 = new java.awt.Label("(C) Copyright 2001, University of Toronto",Label.CENTER);
		label3.setBounds(20,60,310,24);
		label3.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 13));
		label3.setForeground(Color.yellow);
		FramePane.add(label3);

		label5 = new java.awt.Label("Loading, Please wait.");
		label5.setBounds(10,135,310,20);
		label5.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 14));
		label5.setForeground(Color.yellow);
		FramePane.add(label5);

		proBar = new JProgressBar();
		proBar.setMinimum(0);
		proBar.setMaximum(totalEntries);
		proBar.setValue(0);
		proBar.setBounds(10,155,330,20);
		FramePane.add(proBar);
		
		
		Window lWindow = new Window();
		addWindowListener(lWindow);
		
		WinDimension = getToolkit().getScreenSize();
		Rectangle abounds = getBounds();

		setLocation((WinDimension.width - abounds.width)/2,
			(WinDimension.height - abounds.height)/2);
		

		setVisible(true);
	}
	
	
	public void ProgressEntry() {
		currentProgress++;
		proBar.setValue(currentProgress);
	}
		
	
	void WindowClosing(WindowEvent event) {
		// Hide the Dialog
		setVisible(false);
		dispose();
	}

	class Window extends WindowAdapter {
		public void windowClosing(WindowEvent event) {
			Object object = event.getSource();
			if (object == StartupWindow.this)
				WindowClosing(event);
		}
	}
	
}
