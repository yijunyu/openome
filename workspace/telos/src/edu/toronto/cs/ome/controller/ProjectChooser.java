package edu.toronto.cs.ome.controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


class ProjectChooser extends JDialog{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame owner;
    Collection c;
    JPanel toppanel;  
    JPanel buttonpanel;

    public ProjectChooser (JFrame owner, Collection c) {

	this.owner = owner;
	this.c = c;
	setSize(300,100);
	
	GridBagLayout gridbag = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	toppanel = new JPanel(gridbag);
	
	JPanel projectpanel = new JPanel(new GridLayout(0,1));
	projectpanel.add(new JLabel("Choose Projects"));
	JPanel modelpanel = new JPanel(new GridLayout(0,1));
	modelpanel.add(new JLabel("Choose Models"));
	
	Iterator i = c.iterator();
	while (i.hasNext()) {
	    String projectname = (String)i.next();
	    projectpanel.add(new JCheckBox(projectname));
	    //modelpanel.add(new JCheckBox(projectname));
	}
	
	buttonpanel = new JPanel();
	buttonpanel.setLayout(new BoxLayout(buttonpanel, BoxLayout.X_AXIS));	
	JButton continuebutton = new JButton("Continue");
	//continuebutton.addActionListener(new ButtonHandler(CONTINUE));
	JButton cancelbutton = new JButton("Cancel");
	//cancelbutton.addActionListener(new ButtonHandler(CANCEL));

	//buttonpanel.add(continuebutton);
	//buttonpanel.add(cancelbutton);

	gbc.insets = new Insets(1,1,1,1);
	gbc.fill = GridBagConstraints.BOTH;
	gbc.weightx = 1.0;
	toppanel.add(new JScrollPane(projectpanel),gbc);
	gbc.gridwidth = GridBagConstraints.REMAINDER;
	toppanel.add(new JScrollPane(modelpanel),gbc);
	gbc.weightx = 0.0;
	gbc.weighty = 0.0;
	gbc.gridwidth = 1;
	gbc.fill = GridBagConstraints.NONE;
	toppanel.add(continuebutton,gbc);
	toppanel.add(cancelbutton,gbc);

	Container contentpane = getContentPane();
	contentpane.add(toppanel,BorderLayout.NORTH);
	//contentpane.add(buttonpanel,BorderLayout.SOUTH);

	
	//pack();
	setLocationRelativeTo(owner);
	setVisible(true);
    }
    
} 
