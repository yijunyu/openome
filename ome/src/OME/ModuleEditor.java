/**
  * File Updated by LIN LIU SEP 15, 2001
  */

package OME;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

// Main class - merely creates the frame
// The Frame Window, includes toolbar and statusbars
public class ModuleEditor extends JFrame {

	/* This begin the Program */
	public static void main(String[] args) {
		new ModuleEditor();
	}

	private final String ModuleDirectory = "./modules/";
	private final String ModuleFileType = "mod";
	
	private JPanel LEFTPanel;
	private JPanel TOPPanel;
	private JPanel BUTTOMPanel;
	
	private JList allModuleList;
	private JScrollPane allModulePane;
	private DefaultListModel allModuleListModel;

	private JSplitPane leftSplitPane;
	private JSplitPane middleSplitPane;
	
	private JScrollPane TreePane;
	private JTree tree;
	private DefaultTreeModel treeModel;
	private DefaultMutableTreeNode root;

	private JScrollPane conditionPane;
	private JTextArea conditionTextArea;
	


	private JTabbedPane tabbedPane;

	private JPanel ModulePanel;
	private JButton newModuleJButton;
	private JButton renameModuleJButton;
	private JButton openJButton;
	private JButton saveJButton;
	private JButton saveAllJButton;
	private JButton printJButton;


	private JPanel TreePanel;
	private JButton newConceptJButton;
	private JButton newMethodJButton;
	private JButton renameConceptJButton;
	private JButton changeTypeJButton;
	private JButton changeContriTypeJButton;
	private JButton deleteJButton;

	private JPanel EditPanel;
	private JButton cutJButton;
	private JButton copyTreeJButton;
	private JButton copyNodeJButton;
	private JButton pasteJButton;
	private JButton moveUpJButton;
	private JButton moveDownJButton;

	private JPanel CommandPanel;
	private JButton helpJButton;
	private JButton exitJButton;
	

	private Container FramePane;
	private JFrame ThisFrame;
	private OME ome = null;	
	
	
	public ModuleEditor() {
		startup();

		LoadModuleFromFile();

		setVisible(true);
	}
	
	public ModuleEditor(OME O) {
		ome = O;
		startup();

		LoadModuleFromOME();

		setVisible(true);
	}
	
	
	
	private void startup() {
		addNotify();
		D.o("OME Module Editor!!!!!! 1 !!!!!!!");	
		setTitle("OME Module Editor");
		setSize(getInsets().left + getInsets().right + 605,
				getInsets().top + getInsets().bottom + 500);
		setResizable(true);
		ThisFrame = this;
		
		FramePane = getContentPane();
		
		FramePane.setLayout(null);
	
	
		
		// create the tree.
		root = new DefaultMutableTreeNode("Root");
		treeModel = new DefaultTreeModel(root);
		tree = new JTree(treeModel);
//		tree.setCellRenderer(new ModuleTreeCellRenderer());
	
		TreePane = new JScrollPane();
		TreePane.getViewport().add(tree);
		TreePane.setMinimumSize(new Dimension(20,20));

		TOPPanel = new JPanel();
		TOPPanel.setBorder(BorderFactory.createTitledBorder("Module Tree"));
		TOPPanel.setLayout(new BorderLayout(0,0));
		TOPPanel.add(TreePane, BorderLayout.CENTER);
		
		D.o("OME Module Editor!!!!!! 2 !!!!!!!");			
		
		// create the condition text area.
		conditionTextArea = new JTextArea();
		conditionTextArea.setColumns(10);
		
		conditionPane = new JScrollPane();
		conditionPane.getViewport().add(conditionTextArea);
		conditionPane.setMinimumSize(new Dimension(20,20));
		
		BUTTOMPanel = new JPanel();
		BUTTOMPanel.setBorder(BorderFactory.createTitledBorder("Applicability conditions"));
		BUTTOMPanel.setLayout(new BorderLayout(0,0));
		BUTTOMPanel.add(conditionPane, BorderLayout.CENTER);
		
		
		// Create the middle Split Panel
		middleSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, TOPPanel, BUTTOMPanel);
		middleSplitPane.setContinuousLayout(true);
		middleSplitPane.setPreferredSize(new Dimension(100, 100));
		
		
		
		
		
		
		// create the Module list.		
		allModuleListModel = new DefaultListModel();
		
		allModuleList = new JList(allModuleListModel);
		allModuleList.setBackground(Color.white);
		allModuleList.setMinimumSize(new Dimension(20,20));
		
		allModulePane = new JScrollPane();
		allModulePane.getViewport().setView(allModuleList);
	
		LEFTPanel = new JPanel();
		LEFTPanel.setBorder(BorderFactory.createTitledBorder("Modules"));
		LEFTPanel.setLayout(new BorderLayout(0,0));
		LEFTPanel.add(allModuleList, BorderLayout.CENTER);
	

		// Create the main Split Panel
		leftSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, LEFTPanel, middleSplitPane);
		leftSplitPane.setContinuousLayout(true);
		leftSplitPane.setPreferredSize(new Dimension(200, 200));
		leftSplitPane.setBounds(5, 5, getSize().width - getInsets().left - getInsets().right - 155,
				getSize().height - getInsets().top - getInsets().bottom - 10);
				
		FramePane.add(leftSplitPane);



System.out.println(">>>"+FramePane.getSize().width);
System.out.println(">>>"+FramePane.getSize().height);
System.out.println(">>>"+getSize().width);
System.out.println(">>>"+getSize().height);


		// Create a tab pane
		tabbedPane = new JTabbedPane();
		tabbedPane.setBackground(FramePane.getBackground());
		tabbedPane.setBounds(getSize().width - getInsets().left - getInsets().right - 145,
				getSize().height - getInsets().top - getInsets().bottom - 400, 140, 300);
		FramePane.add(tabbedPane);



		// Create the Module Panel
		ModulePanel = new JPanel();
		ModulePanel.setBorder(BorderFactory.createTitledBorder(""));
		ModulePanel.setBackground(FramePane.getBackground());
		ModulePanel.setLayout(null);
		tabbedPane.addTab("Module", null, ModulePanel);

		newModuleJButton = new JButton("New Module");
		newModuleJButton.setFont(new Font("dialog", 0, 14));
		newModuleJButton.setBounds(8, 10, 120, 25);
		newModuleJButton.setToolTipText("Create a New Module");
		ModulePanel.add(newModuleJButton);

		renameModuleJButton = new JButton("Rename");
		renameModuleJButton.setFont(new Font("dialog", 0, 14));
		renameModuleJButton.setBounds(8, 40, 120, 25);
		renameModuleJButton.setToolTipText("Rename selected Module");
		ModulePanel.add(renameModuleJButton);

		openJButton = new JButton("Open");
		openJButton.setFont(new Font("dialog", 0, 14));
		openJButton.setBounds(8, 70, 120, 25);
		openJButton.setToolTipText("Open a Module from other directory");
		ModulePanel.add(openJButton);

		saveJButton = new JButton("Save");
		saveJButton.setFont(new Font("dialog", 0, 14));
		saveJButton.setBounds(8, 100, 120, 25);
		saveJButton.setToolTipText("Save selected Module");
		ModulePanel.add(saveJButton);

		saveAllJButton = new JButton("Save All");
		saveAllJButton.setFont(new Font("dialog", 0, 14));
		saveAllJButton.setBounds(8, 130, 120, 25);
		saveAllJButton.setToolTipText("Save all Module");
		ModulePanel.add(saveAllJButton);

		printJButton = new JButton("print");
		printJButton.setFont(new Font("dialog", 0, 14));
		printJButton.setBounds(8, 160, 120, 25);
		printJButton.setToolTipText("Print the selected Module");
		ModulePanel.add(printJButton);





		// Create the Tree Panel
		TreePanel = new JPanel();
		TreePanel.setBorder(BorderFactory.createTitledBorder(""));
		TreePanel.setBackground(FramePane.getBackground());
		TreePanel.setLayout(null);
		tabbedPane.addTab("Tree", null, TreePanel);

		newConceptJButton = new JButton("New Concept");
		newConceptJButton.setFont(new Font("dialog", 0, 14));
		newConceptJButton.setBounds(8, 10, 120, 25);
		newConceptJButton.setToolTipText("Create a New Concept");
		TreePanel.add(newConceptJButton);

		newMethodJButton = new JButton("New Method");
		newMethodJButton.setFont(new Font("dialog", 0, 14));
		newMethodJButton.setBounds(8, 40, 120, 25);
		newMethodJButton.setToolTipText("Create a New Method");
		TreePanel.add(newMethodJButton);

		renameConceptJButton = new JButton("Rename");
		renameConceptJButton.setFont(new Font("dialog", 0, 14));
		renameConceptJButton.setBounds(8, 70, 120, 25);
		renameConceptJButton.setToolTipText("Rename selected Concept");
		TreePanel.add(renameConceptJButton);

		changeTypeJButton = new JButton("Change Type");
		changeTypeJButton.setFont(new Font("dialog", 0, 14));
		changeTypeJButton.setBounds(8, 100, 120, 25);
		changeTypeJButton.setToolTipText("Change the type of a Concept or Method");
		TreePanel.add(changeTypeJButton);

		changeContriTypeJButton = new JButton("Set Contribution");
		changeContriTypeJButton.setFont(new Font("dialog", 0, 12));
		changeContriTypeJButton.setBounds(8, 130, 120, 25);
		changeContriTypeJButton.setToolTipText("Change the Contribution type of a softgoal Concept");
		TreePanel.add(changeContriTypeJButton);

		deleteJButton = new JButton("Delete");
		deleteJButton.setFont(new Font("dialog", 0, 14));
		deleteJButton.setBounds(8, 160, 120, 25);
		deleteJButton.setToolTipText("Delete any Sub-tree");
		TreePanel.add(deleteJButton);



		// Create the Command Panel
		EditPanel = new JPanel();
		EditPanel.setBorder(BorderFactory.createTitledBorder(""));
		EditPanel.setBackground(FramePane.getBackground());
		EditPanel.setLayout(null);
		tabbedPane.addTab("Edit", null, EditPanel);

		cutJButton = new JButton("Cut");
		cutJButton.setFont(new Font("dialog", 0, 14));
		cutJButton.setBounds(8, 10, 120, 25);
		cutJButton.setToolTipText("Cut Selected Sub Tree");
		EditPanel.add(cutJButton);

		copyTreeJButton = new JButton("Copy Tree");
		copyTreeJButton.setFont(new Font("dialog", 0, 14));
		copyTreeJButton.setBounds(8, 40, 120, 25);
		copyTreeJButton.setToolTipText("Copy Selected Sub Tree");
		EditPanel.add(copyTreeJButton);

		copyNodeJButton = new JButton("Copy Node");
		copyNodeJButton.setFont(new Font("dialog", 0, 14));
		copyNodeJButton.setBounds(8, 70, 120, 25);
		copyNodeJButton.setToolTipText("Copy Selected Tree Node");
		EditPanel.add(copyNodeJButton);

		pasteJButton = new JButton("Paste");
		pasteJButton.setFont(new Font("dialog", 0, 14));
		pasteJButton.setBounds(8, 100, 120, 25);
		pasteJButton.setToolTipText("Paste to Selected Tree Node");
		EditPanel.add(pasteJButton);

		moveUpJButton = new JButton("Move Up");
		moveUpJButton.setFont(new java.awt.Font("dialog", 0, 14));
		moveUpJButton.setBounds(8, 160, 120, 25);
		moveUpJButton.setToolTipText("Move Up the selected Tree Node");
		EditPanel.add(moveUpJButton);

		moveDownJButton = new JButton("Move Down");
		moveDownJButton.setFont(new java.awt.Font("dialog", 0, 14));
		moveDownJButton.setBounds(8, 190, 120, 25);
		moveDownJButton.setToolTipText("Move Down the selected Tree Node");
		EditPanel.add(moveDownJButton);


		// Create the Command Panel
		CommandPanel = new JPanel();
		CommandPanel.setBorder(BorderFactory.createTitledBorder("Main Command"));
		CommandPanel.setBackground(FramePane.getBackground());
		CommandPanel.setLayout(null);
		CommandPanel.setBounds(getSize().width - getInsets().left - getInsets().right - 145,
				getSize().height - getInsets().top - getInsets().bottom - 87, 140, 82);
		FramePane.add(CommandPanel);
		
		
		helpJButton = new JButton("Help");
		helpJButton.setFont(new java.awt.Font("dialog", 0, 14));
		helpJButton.setBounds(8, 20, 125, 25);
		helpJButton.setToolTipText("Help");
		CommandPanel.add(helpJButton);

		exitJButton = new JButton("Exit");
		exitJButton.setFont(new java.awt.Font("dialog", 0, 14));
		exitJButton.setBounds(8, 50, 125, 25);
		exitJButton.setToolTipText("Exit");
		CommandPanel.add(exitJButton);


		// Add Listener to components.

		ListSelectionHandler LH = new ListSelectionHandler();
		allModuleList.addListSelectionListener(LH);

		TreeSelectionHandler TH = new TreeSelectionHandler();
		tree.addTreeSelectionListener(TH);

		TreeCommandHandler TCH = new TreeCommandHandler();
		newConceptJButton.addActionListener(TCH);
		newMethodJButton.addActionListener(TCH);
		renameConceptJButton.addActionListener(TCH);
		changeTypeJButton.addActionListener(TCH);
		changeContriTypeJButton.addActionListener(TCH);
		deleteJButton.addActionListener(TCH);
		cutJButton.addActionListener(TCH);
		copyTreeJButton.addActionListener(TCH);
		copyNodeJButton.addActionListener(TCH);
		pasteJButton.addActionListener(TCH);
		moveUpJButton.addActionListener(TCH);
		moveDownJButton.addActionListener(TCH);

		MainCommandHandler MCH = new MainCommandHandler();
		exitJButton.addActionListener(MCH);
		helpJButton.addActionListener(MCH);
		newModuleJButton.addActionListener(MCH);
		openJButton.addActionListener(MCH);
		saveJButton.addActionListener(MCH);
		saveAllJButton.addActionListener(MCH);
		printJButton.addActionListener(MCH);
		renameModuleJButton.addActionListener(MCH);


		Window lWindow = new Window();
		addWindowListener(lWindow);
		
		
		createPopup();

	}
	
	
	
	private void ResetBound() {
		leftSplitPane.setBounds(5, 5, getSize().width - getInsets().left - getInsets().right - 155,
				getSize().height - getInsets().top - getInsets().bottom - 10);
		
		tabbedPane.setBounds(getSize().width - getInsets().left - getInsets().right - 145,
				getSize().height - getInsets().top - getInsets().bottom - 400, 140, 300);

		CommandPanel.setBounds(getSize().width - getInsets().left - getInsets().right - 145,
				getSize().height - getInsets().top - getInsets().bottom - 87, 140, 82);
	}


	public void update(Graphics g) {
		ResetBound();
		show();

		// Clear the Canvas.
		g.setColor(getBackground());
		g.fillRect(0, 0, getSize().width, getSize().height);

		paint(g);
	}
	
	
	
	private void LoadModuleFromOME() {
		for (int i=0; i<ome.getAvailableModule().size(); i++) 
			allModuleListModel.addElement (ome.getAvailableModule().elementAt(i));
			
		for (int i=0; i<ome.getSelectedModule().size(); i++) 
			allModuleListModel.addElement (ome.getSelectedModule().elementAt(i));
		
	}
		
	private void LoadModuleFromFile() {
		File f = new File(ModuleDirectory);
		String[] FileList = f.list();

		for (int i = 0; i < FileList.length; i++) {
			String filename = FileList[i];
			
			if (filename.length() > 4) {
				String Ext = filename.substring(filename.length()-ModuleFileType.length(),
						filename.length());
				
				// Check if it is a module files, if so open it.
				if (Ext.equals(ModuleFileType)) {
					
					try {
						FileInputStream in = new FileInputStream(ModuleDirectory+filename);
//						ObjectInputStream s = new ObjectInputStream(in);
						
						// create a Open a module.
						KbModule OpenedModule = new KbModule();
						OpenedModule.load(filename);

						// add to the List
						allModuleListModel.addElement(OpenedModule);

					} catch(Exception e) {
						e.printStackTrace();
						new MessageDlg(ThisFrame, "Loading Module Error",
								filename + " is not a valid OME Module");	
					}

				}
			}
		}
	}




	/* reload and totally expand the whole tree */
	private void TreeReloadExpand() {
		treeModel.reload(root);
		for (int i=0;i<tree.getRowCount();i++)
			tree.expandRow(i);
	}







	// Globle selection variables.
	private DefaultMutableTreeNode selectedTreeNode = null;
	private KbModule selectedModule = null;

	/* listen for selection in the list */
	class ListSelectionHandler implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent evt) {
			int selection = allModuleList.getSelectedIndex();

			// Check if a item is selected. If so display its tree.
			if (selection > -1) {
				selectedModule = (KbModule)allModuleListModel.getElementAt(selection);
				root = selectedModule.getTree();
				treeModel = new DefaultTreeModel(root);
				tree.setModel(treeModel);
				TreeReloadExpand();
			}
		}
	}



	private DefaultMutableTreeNode LastSelectedTreeNode = null;

	/* listen for selection in the tree */
	class TreeSelectionHandler implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent event) {
/*			DefaultMutableTreeNode selected = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
			
			// First write back the Text to the last Decomp treeNode.
			if (selected != LastSelectedTreeNode && LastSelectedTreeNode instanceof DecompTreeNode) {
				((DecompTreeNode)LastSelectedTreeNode).setCondition(conditionTextArea.getText());
			}
			LastSelectedTreeNode = selected;
			
			
			// clear the text area first.
			conditionTextArea.setText("");
			
			if (selected != null) {
				
				// if the tree node is a Decomp, display its conditions.
				if (selected instanceof DecompTreeNode) {
					String conditionStr = ((DecompTreeNode)selected).getCondition();
					conditionTextArea.append(conditionStr);
					conditionTextArea.setEditable(true);
					
				} else
					conditionTextArea.setEditable(false);
			}
*/		}
	}


	private void SetSelectedModuleModified() {
		if (selectedModule != null) {
			selectedModule.setModified(true);
			allModuleList.repaint();
		}
	}


	private void SelectThisTreeNode(DefaultMutableTreeNode ThisTreeNode) {
		TreePath FoundPath = new TreePath(ThisTreeNode.getPath());
		tree.setSelectionPath(FoundPath);
		tree.scrollPathToVisible(FoundPath);
	}




	/** This swap ThisTreeNode with its sibling above. */
	private void MoveUp_Action(DefaultMutableTreeNode ThisTreeNode) {
		DefaultMutableTreeNode ParentTreeNode = (DefaultMutableTreeNode)ThisTreeNode.getParent();
		
		int ThisIndex = ParentTreeNode.getIndex(ThisTreeNode);
		
		if (ThisIndex > 0)
			ParentTreeNode.insert(ThisTreeNode, ThisIndex-1);

		SetSelectedModuleModified();
		TreeReloadExpand();
		SelectThisTreeNode(ThisTreeNode);
	}

	/** This swap ThisTreeNode with its sibling below. */
	private void MoveDown_Action(DefaultMutableTreeNode ThisTreeNode) {
		DefaultMutableTreeNode ParentTreeNode = (DefaultMutableTreeNode)ThisTreeNode.getParent();
		
		int ThisIndex = ParentTreeNode.getIndex(ThisTreeNode);
		
		if (ThisIndex < ParentTreeNode.getChildCount()-1)
			ParentTreeNode.insert(ThisTreeNode, ThisIndex+1);

		SetSelectedModuleModified();
		TreeReloadExpand();
		SelectThisTreeNode(ThisTreeNode);
	}




	/** This variable is uses to store the return from RenameDlg. */
	private String ReturnString;

	/** this is used be RenameDlg for returning String */
	public void RenameDlgReturn(String NewName) {
		ReturnString = NewName;
	}


	/** This handle renaming the concept */
	private void RenameConcept_Action(DefaultMutableTreeNode ThisTreeNode) {

		// make sure a intent is selected
/*		if (ThisTreeNode instanceof IntentTreeNode) {
			new RenameDlg(ThisFrame, "Rename Concept", (String)ThisTreeNode.getUserObject());
			ThisTreeNode.setUserObject(ReturnString);
		} else {
			new MessageDlg(ThisFrame, "Tree Node Selection Error",
					"Must select a Intent Tree Node.");
			return;
		}	

		SetSelectedModuleModified();
		TreeReloadExpand();
		SelectThisTreeNode(ThisTreeNode);
*/	}




	/** variable to store the copied tree. */
	private DefaultMutableTreeNode CopiedTree = null;
	
	/** This recursively clone the Tree. */
	DefaultMutableTreeNode RecurCloneTree(DefaultMutableTreeNode OriTreeNode) {
		
		if (OriTreeNode == null)
			return null;
			
		DefaultMutableTreeNode NewTreeNode = (DefaultMutableTreeNode)OriTreeNode.clone();
		
		for(int i=0;i<OriTreeNode.getChildCount();i++) {
			DefaultMutableTreeNode TempTreeNode = null;
			TempTreeNode = RecurCloneTree((DefaultMutableTreeNode)OriTreeNode.getChildAt(i));
			if (TempTreeNode != null)
				NewTreeNode.add(TempTreeNode);
		}
		
		return NewTreeNode;
	}


	/** This handle the Cut Tree operation. */
	private void Delete_Action (DefaultMutableTreeNode DeleteAt) {
		// make sure not selected the root
		if (DeleteAt != root) {
			DeleteAt.removeFromParent();
		} else {
			new MessageDlg(ThisFrame, "Tree Node Selection Error",
					"Could not Cut at Root");	
			return;
		}

		SetSelectedModuleModified();
		TreeReloadExpand();
	}


	/** This handle the Cut Tree operation. */
	private void Cut_Action (DefaultMutableTreeNode CutAt) {
		// make sure not selected the root
		if (CutAt != root) {
			CopiedTree = CutAt;
			CutAt.removeFromParent();
		} else {
			new MessageDlg(ThisFrame, "Tree Node Selection Error",
					"Could not Cut at Root");	
			return;
		}

		SetSelectedModuleModified();
		TreeReloadExpand();
	}


	/** This handle the Paste Tree operation. */
	private void Paste_Action(DefaultMutableTreeNode PasteTo) {
		
		// Make sure to paste a Intent to a Decomp
/*		if (CopiedTree instanceof IntentTreeNode) {
			if (!(PasteTo instanceof DecompTreeNode || PasteTo == root)) {
				new MessageDlg(ThisFrame, "Tree Node Paste Error",
						"This time must select a Decomp to paste.");
				return;
			}
			
		// Make sure to paste a Decomp to a Intent
		} else if (CopiedTree instanceof DecompTreeNode) {
			if (!(PasteTo instanceof IntentTreeNode)) {
				new MessageDlg(ThisFrame, "Tree Node Paste Error",
						"This time must select a Intent to paste.");	
				return;
			}
		} else {
			new MessageDlg(ThisFrame, "Tree Node Paste Error",
					"Nothing to Paste");	
			return;

		}
					
		DefaultMutableTreeNode NewTreeNode = RecurCloneTree(CopiedTree);
		PasteTo.add(NewTreeNode);

		SetSelectedModuleModified();
		TreeReloadExpand();
		SelectThisTreeNode(NewTreeNode);
*/	}


	class TreeCommandHandler implements ActionListener {
		// Button actions.
		public void actionPerformed(ActionEvent evt) {

/*			selectedTreeNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

			if (selectedModule == null) {
				new MessageDlg(ThisFrame, "Error", "Must select or create a Module.");	
				return;	
			}

			if (selectedTreeNode != null) {
				Object object = evt.getSource();
	
				if (object == newConceptJButton) {
					
					// make sure a decomp is selected
					if (selectedTreeNode instanceof DecompTreeNode || selectedTreeNode == root)
						NewConceptPopup.show(TreePanel,8,35);
					else 
						new MessageDlg(ThisFrame, "Tree Node Selection Error",
								"Must select a Decomp Tree Node, Or the Root.");	

				} else if (object == newMethodJButton) {
					// make sure a intent is selected
					if (selectedTreeNode instanceof IntentTreeNode)
						NewMethodPopup.show(TreePanel,8,65);
					else 
						new MessageDlg(ThisFrame, "Tree Node Selection Error",
								"Must select a Intent Tree Node.");	
	
				} else if (object == renameConceptJButton) {
					
					RenameConcept_Action(selectedTreeNode);
					
				} else if (object == changeTypeJButton) {
					// Check weather a intent or a Decomp is selected
					if (selectedTreeNode instanceof IntentTreeNode)
						ChangeConceptTypePopup.show(TreePanel,8,125);
					else if (selectedTreeNode instanceof DecompTreeNode)
						ChangeMethodTypePopup.show(TreePanel,8,125);
					
				} else if (object == changeContriTypeJButton) {
					// make sure a intent is selected & is a softgoal
					if (selectedTreeNode instanceof IntentTreeNode && 
							((IntentTreeNode)selectedTreeNode).getType() == Intent.SOFTGOAL) {
						ChangeContriTypePopup.show(TreePanel,8,155);
					} else 
						new MessageDlg(ThisFrame, "Tree Node Selection Error",
								"Must select a Softgoal Intent Tree Node.");	
					
				} else if (object == deleteJButton)
					Delete_Action(selectedTreeNode);

				else if (object == cutJButton)
					Cut_Action(selectedTreeNode);
					
				else if (object == copyTreeJButton) {
					// make sure not selected the root
					if (selectedTreeNode != root)
						CopiedTree = RecurCloneTree(selectedTreeNode);
					else 
						new MessageDlg(ThisFrame, "Tree Node Selection Error",
								"Could not Copy at Root");	
					
				} else if (object == copyNodeJButton) {
					// make sure a intent is selected
					if (selectedTreeNode instanceof IntentTreeNode && selectedTreeNode != root)
						CopiedTree = (DefaultMutableTreeNode)selectedTreeNode.clone();
					else 
						new MessageDlg(ThisFrame, "Tree Node Selection Error",
								"Must select a Intent Tree Node.");	

				} else if (object == pasteJButton)
					Paste_Action(selectedTreeNode);
					
				else if (object == moveUpJButton)
					MoveUp_Action(selectedTreeNode);
					
				else if (object == moveDownJButton)
					MoveDown_Action(selectedTreeNode);
				

			} else // If no node is selected.
				new MessageDlg(ThisFrame, "Tree Node Selection Error", "Must select a Tree Node");	
				
*/		}
	}






	/** This handle renaming the module */
	private void RenameModule_Action(KbModule ThisModule) {

		// make sure a intent is selected
		if (ThisModule != null) {
//			new RenameDlg(ThisFrame, "Rename Module", ThisModule.getName());
//			ThisModule.setName(ReturnString);
		} else {
			new MessageDlg(ThisFrame, "Rename Module Error",
					"Must select a Module.");
			return;
		}	

		SetSelectedModuleModified();
	}

	/** This save the module ThisModule */
	private void Save_Action(KbModule ThisModule) {
		String filename	 = ThisModule.getName();
		filename = filename.trim();
		filename = filename.replace(' ', '_');
		filename = filename + "." + ModuleFileType;
		
		try {
			FileOutputStream f = new FileOutputStream(ModuleDirectory+filename);
			ObjectOutputStream s = new ObjectOutputStream(f);

			ThisModule.setModified(false);
			ThisModule.save(s);
		} catch(Exception e) {
			e.printStackTrace();
		}
		allModuleList.repaint();
	}

	/** This save the module ThisModule */
	private void SaveAll_Action() {
		
		for (int i = 0; i < allModuleListModel.size(); i++) {
			KbModule CurModule = (KbModule)allModuleListModel.elementAt(i);
			
			if (CurModule.isModified())
				Save_Action(CurModule);
		}
	}

	/** This save the module ThisModule */
	private void Exit_Action() {
		if (ome != null) {
			Vector AvailableModule = ome.getAvailableModule();
			Vector SelectedModule = ome.getSelectedModule();
			DefaultMutableTreeNode ConceptMethodTree = ome.getConceptMethodTree();
		
			// clear the Module Vector. in OME.
			AvailableModule.removeAllElements();
			SelectedModule.removeAllElements();
			ConceptMethodTree.removeAllChildren();
			
			// all back all module
			for (int i = 0; i < allModuleListModel.size(); i++) {
				KbModule CurModule = (KbModule)allModuleListModel.elementAt(i);
				
				AvailableModule.addElement(CurModule);
			}

		}		

		ModuleEditor_WindowClosing();
	}
	
	/** This is a attempt to print the module tree */
	private void Print_Action() {
		// to do:  code goes here.
		PrintJob pjob = getToolkit().getPrintJob(ThisFrame, "Tree view of module", null);

		if (pjob != null) {          
			// Graphics instance to be passed to the PAINT methods
			// or each object or canvas
			Graphics pg = pjob.getGraphics();
			if (pg != null) {
//				tree.paint(pg);
//				pg.dispose(); // flush page
			}
			pjob.end();
		}
	}


	class MainCommandHandler implements ActionListener {
		// Button actions.
		public void actionPerformed(ActionEvent evt) {
			Object object = evt.getSource();

			if (object == exitJButton) 
				Exit_Action();

			else if (object == helpJButton)
				System.out.println("Help pressed");

			else if (object == newModuleJButton) {
				// create a new module.
				KbModule NewModule = new KbModule("New Module");
				// add to the List
				allModuleListModel.addElement(NewModule);
				// set the new item to be selected.
				allModuleList.setSelectedIndex(allModuleListModel.indexOf(NewModule));
				
				selectedModule = NewModule;

			} else if (object == openJButton) {
				System.out.println("openJButton pressed");

			} else if (object == saveJButton) {
				KbModule selected = (KbModule)allModuleList.getSelectedValue();
				
				if (selected != null) {
					Save_Action(selected);
				} else
					new MessageDlg(ThisFrame, "Module Selection Error",
							"You need to select a Module to save");	
				
			} else if (object == saveAllJButton) {
				SaveAll_Action();

			} else if (object == renameModuleJButton)
				RenameModule_Action(selectedModule);
				
			else if (object == printJButton) {
				System.out.println("printJButton pressed");
				Print_Action();
			}
		}
	}












	// All Popup Menu.
	private JPopupMenu NewConceptPopup;
	private JMenuItem miNewGoal;
	private JMenuItem miNewTask;
	private JMenuItem miNewResource;
	private JMenuItem miNewSoftgoal;

	private JPopupMenu NewMethodPopup;
	private JMenuItem miNewTD;
	private JMenuItem miNewME;
	private JMenuItem miNewCS;

	private JPopupMenu ChangeConceptTypePopup;
	private JMenuItem miToGoal;
	private JMenuItem miToTask;
	private JMenuItem miToResource;
	private JMenuItem miToSoftgoal;

	private JPopupMenu ChangeMethodTypePopup;
	private JMenuItem miToTD;
	private JMenuItem miToME;
	private JMenuItem miToCS;

	private JPopupMenu ChangeContriTypePopup;
	private JMenuItem miToNONE;
	private JMenuItem miToPOS_SUB;
	private JMenuItem miToPOS_SUP;
	private JMenuItem miToPOSITIVE;
	private JMenuItem miToNEGATIVE;
	private JMenuItem miToNEG_SUP;
	private JMenuItem miToNEG_SUB;
	private JMenuItem miToAND;
	private JMenuItem miToOR;
	private JMenuItem miToEQUAL;
	private JMenuItem miToUNDETERMINED;

	private void createPopup() {
		// Create the New Concept Popup Menu.
/*		NewConceptPopup = new JPopupMenu();

		miNewGoal = NewConceptPopup.add(new JMenuItem("Goal"));
		miNewTask = NewConceptPopup.add(new JMenuItem("Task"));
		miNewResource = NewConceptPopup.add(new JMenuItem("Resource"));
		miNewSoftgoal = NewConceptPopup.add(new JMenuItem("Softgoal"));
		
		// Add menu item to listener
		NewConceptActionHandler NCAH = new NewConceptActionHandler();
		miNewGoal.addActionListener(NCAH);
		miNewTask.addActionListener(NCAH);
		miNewResource.addActionListener(NCAH);
		miNewSoftgoal.addActionListener(NCAH);
	
		TreePanel.add(NewConceptPopup);
		
		
		
		// Create the New Method Popup Menu.
		NewMethodPopup = new JPopupMenu();

		miNewTD = NewMethodPopup.add(new JMenuItem("Task Decomp"));
		miNewME = NewMethodPopup.add(new JMenuItem("Means-End"));
		miNewCS = NewMethodPopup.add(new JMenuItem("Softgoal Decomp"));
	
		// Add menu item to listener
		NewMethodActionHandler NMAH = new NewMethodActionHandler();
		miNewTD.addActionListener(NMAH);
		miNewME.addActionListener(NMAH);
		miNewCS.addActionListener(NMAH);
	
		TreePanel.add(NewMethodPopup);
		
		
		
		
		// Create the ChangeConceptTypePopup Menu.
		ChangeConceptTypePopup = new JPopupMenu();

		miToGoal = ChangeConceptTypePopup.add(new JMenuItem("To Goal"));
		miToTask = ChangeConceptTypePopup.add(new JMenuItem("To Task"));
		miToResource = ChangeConceptTypePopup.add(new JMenuItem("To Resource"));
		miToSoftgoal = ChangeConceptTypePopup.add(new JMenuItem("To Softgoal"));
		
		// Add menu item to listener
		ChangeConceptTypeActionHandler CCTAH = new ChangeConceptTypeActionHandler();
		miToGoal.addActionListener(CCTAH);
		miToTask.addActionListener(CCTAH);
		miToResource.addActionListener(CCTAH);
		miToSoftgoal.addActionListener(CCTAH);
	
		TreePanel.add(ChangeConceptTypePopup);
		
		

		
		// Create the ChangeMethodTypePopup Menu.
		ChangeMethodTypePopup = new JPopupMenu();

		miToTD = ChangeMethodTypePopup.add(new JMenuItem("To Task Decomp"));
		miToME = ChangeMethodTypePopup.add(new JMenuItem("To Means-End"));
		miToCS = ChangeMethodTypePopup.add(new JMenuItem("To Softgoal Decomp"));
	
		// Add menu item to listener
		ChangeMethodTypeActionHandler CMTAH = new ChangeMethodTypeActionHandler();
		miToTD.addActionListener(CMTAH);
		miToME.addActionListener(CMTAH);
		miToCS.addActionListener(CMTAH);
	
		TreePanel.add(ChangeMethodTypePopup);
		
		
		
		// Create the ChangeContriTypePopup Menu.
		ChangeContriTypePopup = new JPopupMenu();

		miToNONE = ChangeContriTypePopup.add(new JMenuItem("To None"));
		miToPOS_SUB = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.POS_SUB));
		miToPOS_SUP = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.POS_SUP));
		miToPOSITIVE = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.POSITIVE));
		miToNEGATIVE = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.NEGATIVE));
		miToNEG_SUP = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.NEG_SUP));
		miToNEG_SUB = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.NEG_SUB));
		miToAND = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.AND));
		miToOR = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.OR));
		miToEQUAL = ChangeContriTypePopup.add(new JMenuItem("To " + Intent.EQUAL));
		miToUNDETERMINED = ChangeContriTypePopup.add(new JMenuItem("To Unknow"));
	
		// Add menu item to listener
		ChangeContriTypeActionHandler CConTAH = new ChangeContriTypeActionHandler();
		miToNONE.addActionListener(CConTAH);
		miToPOS_SUB.addActionListener(CConTAH);
		miToPOS_SUP.addActionListener(CConTAH);
		miToPOSITIVE.addActionListener(CConTAH);
		miToNEGATIVE.addActionListener(CConTAH);
		miToNEG_SUP.addActionListener(CConTAH);
		miToNEG_SUB.addActionListener(CConTAH);
		miToAND.addActionListener(CConTAH);
		miToOR.addActionListener(CConTAH);
		miToEQUAL.addActionListener(CConTAH);
		miToUNDETERMINED.addActionListener(CConTAH);
	
		TreePanel.add(ChangeContriTypePopup);
*/	}

	
	// Action Listener for NewConceptPopup	
	class NewConceptActionHandler implements ActionListener {
		// Menu actions.
		public void actionPerformed(ActionEvent evt) {
			String ActionCommand = evt.getActionCommand();
/*			IntentTreeNode NewTreeNode;

			if (ActionCommand.equals("Goal"))
				NewTreeNode = new IntentTreeNode("New Goal", Intent.GOAL);
			else if (ActionCommand.equals("Task"))
				NewTreeNode = new IntentTreeNode("New Task", Intent.TASK);
			else if (ActionCommand.equals("Resource"))
				NewTreeNode = new IntentTreeNode("New Resource", Intent.RESOURCE);
			else if (ActionCommand.equals("Softgoal"))
				NewTreeNode = new IntentTreeNode("New Softgoal", Intent.SOFTGOAL);
			else
				return;
				
			SetSelectedModuleModified();
			selectedTreeNode.add(NewTreeNode);
			TreeReloadExpand();
			SelectThisTreeNode(NewTreeNode);
*/		}
	}


	// Action Listener for NewMethodPopup	
	class NewMethodActionHandler implements ActionListener {
		// Menu actions.
		public void actionPerformed(ActionEvent evt) {
			String ActionCommand = evt.getActionCommand();
/*			
			IntentTreeNode selected = (IntentTreeNode)selectedTreeNode;
			DecompTreeNode NewTreeNode;

			if (ActionCommand.equals("Task Decomp")) {
				if (selected.getType() == Intent.GOAL)
					NewTreeNode = new DecompTreeNode(DecompTreeNode.DECOMPGOAL);
				else if (selected.getType() == Intent.TASK)
					NewTreeNode = new DecompTreeNode(DecompTreeNode.DECOMPTASK);
				else if (selected.getType() == Intent.RESOURCE)
					NewTreeNode = new DecompTreeNode(DecompTreeNode.DECOMPRESOURCE);
				else if (selected.getType() == Intent.SOFTGOAL)
					NewTreeNode = new DecompTreeNode(DecompTreeNode.DECOMPSOFTGOAL);
				else
					return;
				
			} else if (ActionCommand.equals("Means-End")) {
				if (selected.getType() == Intent.GOAL)
					NewTreeNode = new DecompTreeNode(DecompTreeNode.MEANGOAL);
				else if (selected.getType() == Intent.TASK)
					NewTreeNode = new DecompTreeNode(DecompTreeNode.MEANTASK);
				else if (selected.getType() == Intent.RESOURCE)
					NewTreeNode = new DecompTreeNode(DecompTreeNode.MEANRESOURCE);
				else if (selected.getType() == Intent.SOFTGOAL)
					NewTreeNode = new DecompTreeNode(DecompTreeNode.MEANSOFTGOAL);
				else
					return;

			} else if (ActionCommand.equals("Softgoal Decomp")) {
				if (selected.getType() == Intent.SOFTGOAL) {
					NewTreeNode = new DecompTreeNode(DecompTreeNode.CONTRIBSOFTGOAL);
				} else {
					new MessageDlg(ThisFrame, "Tree Node Selection Error", "Must select a Softgoal");
					return;
				}
			} else
				return;
				
			
			SetSelectedModuleModified();
			selectedTreeNode.add(NewTreeNode);
			TreeReloadExpand();
			SelectThisTreeNode(NewTreeNode);
*/		}
	}
	
	


	// Action Listener for ChangeConceptTypePopup	
	class ChangeConceptTypeActionHandler implements ActionListener {
		// Menu actions.
		public void actionPerformed(ActionEvent evt) {
			String ActionCommand = evt.getActionCommand();
/*
			IntentTreeNode selected = (IntentTreeNode)selectedTreeNode;
			int DECOMPTYPE = 0, MEANTYPE = 0;

			if (ActionCommand.equals("To Goal")) {
				selected.setType(Intent.GOAL);
				DECOMPTYPE = DecompTreeNode.DECOMPGOAL;
				MEANTYPE = DecompTreeNode.MEANGOAL;
			} else if (ActionCommand.equals("To Task")) {
				selected.setType(Intent.TASK);
				DECOMPTYPE = DecompTreeNode.DECOMPTASK;
				MEANTYPE = DecompTreeNode.MEANTASK;
			} else if (ActionCommand.equals("To Resource")) {
				selected.setType(Intent.RESOURCE);
				DECOMPTYPE = DecompTreeNode.DECOMPRESOURCE;
				MEANTYPE = DecompTreeNode.MEANRESOURCE;
			} else if (ActionCommand.equals("To Softgoal")) {
				selected.setType(Intent.SOFTGOAL);
				DECOMPTYPE = DecompTreeNode.DECOMPSOFTGOAL;
				MEANTYPE = DecompTreeNode.MEANSOFTGOAL;
			}
				
			// Change the type of its decomp.				
			for (int i=0; i<selected.getChildCount(); i++) {
				DecompTreeNode DecompChild = (DecompTreeNode)selected.getChildAt(i);
				
				if (DecompChild.getType() >= DecompTreeNode.DECOMPGOAL &&
						DecompChild.getType() <= DecompTreeNode.DECOMPSOFTGOAL)
					DecompChild.setType(DECOMPTYPE);
					
				else if (DecompChild.getType() >= DecompTreeNode.MEANGOAL &&
						DecompChild.getType() <= DecompTreeNode.MEANSOFTGOAL)
					DecompChild.setType(MEANTYPE);
			}
			
			SetSelectedModuleModified();
			TreeReloadExpand();
			SelectThisTreeNode(selected);
*/		}
	}






	// Action Listener for ChangeMethodTypePopup	
	class ChangeMethodTypeActionHandler implements ActionListener {
		// Menu actions.
		public void actionPerformed(ActionEvent evt) {
/*			String ActionCommand = evt.getActionCommand();
			
			DecompTreeNode selected = (DecompTreeNode)selectedTreeNode;
			char ParentType = 	((IntentTreeNode)selected.getParent()).getType();

			if (ActionCommand.equals("To Task Decomp")) {
				if (ParentType == Intent.GOAL)
					selected.setType(DecompTreeNode.DECOMPGOAL);
				else if (ParentType == Intent.TASK)
					selected.setType(DecompTreeNode.DECOMPTASK);
				else if (ParentType == Intent.RESOURCE)
					selected.setType(DecompTreeNode.DECOMPRESOURCE);
				else if (ParentType == Intent.SOFTGOAL)
					selected.setType(DecompTreeNode.DECOMPSOFTGOAL);
									
			} else if (ActionCommand.equals("To Means-End")) {
				if (ParentType == Intent.GOAL)
					selected.setType(DecompTreeNode.MEANGOAL);
				else if (ParentType == Intent.TASK)
					selected.setType(DecompTreeNode.MEANTASK);
				else if (ParentType == Intent.RESOURCE)
					selected.setType(DecompTreeNode.MEANRESOURCE);
				else if (ParentType == Intent.SOFTGOAL)
					selected.setType(DecompTreeNode.MEANSOFTGOAL);

			} else if (ActionCommand.equals("To Softgoal Decomp")) {
				if (ParentType == Intent.SOFTGOAL) {
					selected.setType(DecompTreeNode.CONTRIBSOFTGOAL);
				} else 
					new MessageDlg(ThisFrame, "Tree Node Selection Error",
							"Parent Concept must be a Softgoal");	
			}
			
			SetSelectedModuleModified();
			TreeReloadExpand();
			SelectThisTreeNode(selected);
*/		}
	}


	// Action Listener for ChangeMethodTypePopup	
	class ChangeContriTypeActionHandler implements ActionListener {
		// Menu actions.
		public void actionPerformed(ActionEvent evt) {
/*			Object object = evt.getSource();

			IntentTreeNode selected = (IntentTreeNode)selectedTreeNode;
			
			if (object == miToNONE)
				selected.setContribType("");
			else if (object == miToPOS_SUB)
				selected.setContribType(Intent.POS_SUB);
			else if (object == miToPOS_SUP)
				selected.setContribType(Intent.POS_SUP);
			else if (object == miToPOSITIVE)
				selected.setContribType(Intent.POSITIVE);
			else if (object == miToNEGATIVE)
				selected.setContribType(Intent.NEGATIVE);
			else if (object == miToNEG_SUP)
				selected.setContribType(Intent.NEG_SUP);
			else if (object == miToNEG_SUB)
				selected.setContribType(Intent.NEG_SUB);
			else if (object == miToAND)
				selected.setContribType(Intent.AND);
			else if (object == miToOR)
				selected.setContribType(Intent.OR);
			else if (object == miToEQUAL)
				selected.setContribType(Intent.EQUAL);
			else if (object == miToUNDETERMINED)
				selected.setContribType(Intent.UNDETERMINED);
			
			SetSelectedModuleModified();
			TreeReloadExpand();
			SelectThisTreeNode(selected);
*/		}
	}






	private void ModuleEditor_WindowClosing() {
		// Hide the Dialog
		setVisible(false);
		dispose();
		
		if (ome == null)
			System.exit(0);
	}

	class Window extends WindowAdapter {
		public void windowClosing(WindowEvent event) {
			Object object = event.getSource();
			if (object == ModuleEditor.this)
				ModuleEditor_WindowClosing();
		}
	}
	
	
	
	private void DBW(String Line) {
			new MessageDlg(ThisFrame, "Debug Window", Line);	
	}
}
