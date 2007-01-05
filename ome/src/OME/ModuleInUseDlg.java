/**
  * File Created by CONAN CHAN, VINCENT WU, OCT 16, 1997, Updated by LIN LIU
  * SEP 15, 2001
  */
package OME;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.tree.DefaultMutableTreeNode;

public class ModuleInUseDlg extends JDialog {

	private JPanel donePanel;

	private JButton selectAllJButton;
	private JButton selectJButton;
	private JButton deselectJButton;
	private JButton deselectAllJButton;
	private JButton doneJButton;
	private JButton helpJButton;
	private JButton cancelJButton;

	private JLabel availableLabel;
	private JLabel selectedLabel;

	private JList availableList;
	private JList selectedList;
	private JScrollPane availablePane;
	private JScrollPane selectedPane;
	protected DefaultListModel availableModel;
	protected DefaultListModel selectedModel;

	private Vector AvailableModule;
	private Vector SelectedModule;
	private DefaultMutableTreeNode ConceptMethodTree;


	public ModuleInUseDlg(JFrame parent, boolean modal, 
			Vector AM, Vector SM, DefaultMutableTreeNode CMT) {
			
		super(parent, modal);

		setTitle("Module In Use");
		setSize(getInsets().left + getInsets().right + 548,
				getInsets().top + getInsets().bottom + 260);
		setResizable(true);

		AvailableModule = AM;
		SelectedModule = SM;
		ConceptMethodTree = CMT;

		addNotify();

		Container contentPane = getContentPane();
		contentPane.setLayout(null);

	   	Dimension d = getToolkit().getScreenSize();
		Rectangle b = getBounds();
		contentPane.setLocation((d.width - b.width)/2, (d.height - b.height)/2);    
		contentPane.setBounds(getInsets().left + 5, getInsets().top + 35, 800, 600);

	
		availableLabel = new JLabel();
		
		availableLabel.setFont(new java.awt.Font("dialog", 0, 14));
		availableLabel.setText("Available Module");
		availableLabel.setBounds(getInsets().left + 15, getInsets().top + 5, 125, 30);
		contentPane.add(availableLabel);
		
		selectedLabel = new JLabel();
		selectedLabel.setFont(new java.awt.Font("dialog", 0, 14));
		selectedLabel.setText("Selected Module");
		selectedLabel.setBounds(getInsets().left + 245,
			getInsets().top + 5, 125, 30);
		contentPane.add(selectedLabel);
		
		availableModel = new DefaultListModel();
		// fill availableModel with elements in AM
		for (int i=0; i<AM.size(); i++) 
			availableModel.addElement (AM.elementAt(i));
		availableList = new JList(availableModel);
	
		availablePane = new JScrollPane();
		availablePane.setBackground(Color.white);
		availablePane.getViewport().setView(availableList);
		availablePane.setBounds(getInsets().left + 5, getInsets().top + 35, 160, 220);
		availablePane.setBorder(new BevelBorder(BevelBorder.LOWERED));
		contentPane.add(availablePane);
		
		selectedModel = new DefaultListModel();
		// fill selectedModel with elements in SM
		for (int i=0; i<SM.size(); i++) 
			selectedModel.addElement (SM.elementAt(i));
		selectedList = new JList(selectedModel);

		selectedPane = new JScrollPane();
		selectedPane.setBackground(Color.white);
		selectedPane.getViewport().setView(selectedList);
		selectedPane.setBounds(getInsets().left + 235, getInsets().top + 35, 160, 220);
		selectedPane.setBorder(new BevelBorder(BevelBorder.LOWERED));
		contentPane.add(selectedPane);
		selectAllJButton = new JButton("all >");
		selectAllJButton.setFont(new java.awt.Font("dialog", 0, 14));
		selectAllJButton.setBounds(getInsets().left + 170, getInsets().top + 60, 60, 30);
		selectAllJButton.setToolTipText("Select All Module");
		contentPane.add(selectAllJButton);

		selectJButton = new JButton(">>");
		selectJButton.setFont(new java.awt.Font("dialog", 0, 14));
		selectJButton.setBounds(getInsets().left + 170, getInsets().top + 100, 60, 30);
		selectJButton.setToolTipText("Select a Module");
		contentPane.add(selectJButton);

		deselectJButton = new JButton("<<");
		deselectJButton.setFont(new java.awt.Font("dialog", 0, 14));
		deselectJButton.setBounds(getInsets().left + 170, getInsets().top + 140, 60, 30);
		deselectJButton.setToolTipText("Deselect a Module");
		contentPane.add(deselectJButton);

		deselectAllJButton = new JButton("< all");
		deselectAllJButton.setFont(new java.awt.Font("dialog", 0, 14));
		deselectAllJButton.setBounds(getInsets().left + 170, getInsets().top + 180, 60, 30);
		deselectAllJButton.setToolTipText("Deselect All Module");
		contentPane.add(deselectAllJButton);

		// donePanel
		donePanel = new JPanel();
		donePanel.setBounds(getInsets().left + 405, getInsets().top + 125, 142, 130);
		donePanel.setBorder(BorderFactory.createTitledBorder("Main Command"));
		donePanel.setBackground(getBackground());
		donePanel.setLayout(null);
		contentPane.add(donePanel);
//		add(donePanel);

		doneJButton = new JButton("Done");
		doneJButton.setFont(new java.awt.Font("dialog", 0, 14));
		doneJButton.setBounds(getInsets().left + 5, getInsets().top +
			0, 125, 30);
		doneJButton.setToolTipText("Select");
		donePanel.add(doneJButton);

		helpJButton = new JButton("Help");
		helpJButton.setFont(new java.awt.Font("dialog", 0, 14));
		helpJButton.setBounds(getInsets().left + 5, getInsets().top +
			35, 125, 30);
		helpJButton.setToolTipText("Help");
		donePanel.add(helpJButton);

		cancelJButton = new JButton("Cancel");
		cancelJButton.setFont(new java.awt.Font("dialog", 0, 14));
		cancelJButton.setBounds(getInsets().left + 5, getInsets().top
			+ 70, 125, 30);
		cancelJButton.setToolTipText("Cancel");
		donePanel.add(cancelJButton);



		// REGISTER_LISTENERS
		Action lAction = new Action();
		selectAllJButton.addActionListener(lAction);
		selectJButton.addActionListener(lAction);
		deselectJButton.addActionListener(lAction);
		deselectAllJButton.addActionListener(lAction);

		cancelJButton.addActionListener(lAction);
		helpJButton.addActionListener(lAction);
		doneJButton.addActionListener(lAction);


		Window lWindow = new Window();
		addWindowListener(lWindow);

		pack();
		setVisible(true);
		
	}


	/* clone the tree nodes */
	private DefaultMutableTreeNode cloneTree(DefaultMutableTreeNode OriTreeNode) {
		
		if (OriTreeNode == null)
			return null;
			
		DefaultMutableTreeNode NewTreeNode = (DefaultMutableTreeNode)OriTreeNode.clone();
		
		for(int i=0;i<OriTreeNode.getChildCount();i++) {
			DefaultMutableTreeNode TempTreeNode = null;
			TempTreeNode = cloneTree((DefaultMutableTreeNode)OriTreeNode.getChildAt(i));
			if (TempTreeNode != null)
				NewTreeNode.add(TempTreeNode);
		}
		
		return NewTreeNode;
	}


	// This is a method that is not used.
	// This will split the Module tree when they extended to more then 3 level deep.
	private void CheckForSubTree(DefaultMutableTreeNode root) {
		
		for (int i=0; i<root.getChildCount(); i++) {
			DefaultMutableTreeNode MethodChild = (DefaultMutableTreeNode)root.getChildAt(i);
			
			for (int j=0; j<MethodChild.getChildCount(); j++) {
				DefaultMutableTreeNode SubCompChild = (DefaultMutableTreeNode)MethodChild.getChildAt(j);
				
				if (SubCompChild.getChildCount() > 0) {
					DefaultMutableTreeNode CloneChild = (DefaultMutableTreeNode)SubCompChild.clone();
					
					MethodChild.insert(CloneChild,j);
					ConceptMethodTree.add(SubCompChild);
					
					// Make sure it is a IntentTreenode
/*					if (SubCompChild instanceof IntentTreeNode) {
						((IntentTreeNode)SubCompChild).setContribType("");
					}
*/					
					CheckForSubTree(SubCompChild);
				}
			}
		}
	}


	/*  This read in each Module in the selectedModule and merge their tree
	    And store the final tree to ConceptMethodTree */
	private void MergeModuleToTreeView() {
		DefaultMutableTreeNode temp;

		ConceptMethodTree.removeAllChildren();
		
		// Take each selected Module
		for (int i=0; i<SelectedModule.size(); i++) {
			temp = ((KbModule) SelectedModule.elementAt(i)).getCloneTree();
			
			// Add each Subtree below Root to the ConceptMethodTree
			for (int j=0; j<temp.getChildCount(); j++) {
				ConceptMethodTree.add((DefaultMutableTreeNode)temp.getChildAt(j));
				
				// Check and resolve Tree that expends to 2 or more level of Method.
				// CheckForSubTree((DefaultMutableTreeNode)ConceptMethodTree.getLastChild());
			}			
		}
	}


	class Action implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object object = event.getSource();
			if (object == selectAllJButton) {
				System.out.println("selectAllJButton pressed");
				while (availableModel.getSize() != 0) {
					Object selected = availableModel.getElementAt (0);
					availableModel.removeElementAt (0);
					selectedModel.addElement (selected);
					AvailableModule.removeElementAt (0);
					SelectedModule.addElement (selected);
				}
			}
			else if (object == selectJButton) {
				System.out.println("selectJButton pressed");
				int selection = availableList.getSelectedIndex();
				if (selection != -1 && selection < availableModel.getSize()) {
					Object selected = availableModel.getElementAt (selection);
					availableModel.removeElementAt (selection);
					selectedModel.addElement (selected);
					AvailableModule.removeElementAt (selection);
					SelectedModule.addElement (selected);
				}
			}
			else if (object == deselectJButton) {
				System.out.println("deselectJButton pressed");
				int selection = selectedList.getSelectedIndex();
				if (selection != -1 && selection < selectedModel.getSize()) {
					Object selected = selectedModel.getElementAt (selection);
					selectedModel.removeElementAt (selection);
					availableModel.addElement (selected);
					SelectedModule.removeElementAt (selection);
					AvailableModule.addElement (selected);
				}
			}
			else if (object == deselectAllJButton) {
				System.out.println("deselectAllJButton pressed");
				while (selectedModel.getSize() != 0) {
					Object selected = selectedModel.getElementAt (0);
					selectedModel.removeElementAt (0);
					availableModel.addElement (selected);
					SelectedModule.removeElementAt (0);
					AvailableModule.addElement (selected);
				}
			}
			else if (object == doneJButton) {
				System.out.println("Done pressed");
				MergeModuleToTreeView();

				setVisible(false);
			}
			else if (object == helpJButton) {
				System.out.println("Help pressed");
				
				File f = new File(".");
//				new OMEHelp("file:" + f.getAbsolutePath() + "/help/MIUHelp.htm");

				
			} else if (object == cancelJButton) {
				System.out.println("Cancel pressed");
				setVisible(false);
			}
		}
	}



	void ModuleInUseDlg_WindowClosing(WindowEvent event) {
		// Hide the Dialog
		setVisible(false);
//		dispose();
	}

	class Window extends WindowAdapter {
		public void windowClosing(WindowEvent event) {
			Object object = event.getSource();
			if (object == ModuleInUseDlg.this)
				ModuleInUseDlg_WindowClosing(event);
		}
	}
}
