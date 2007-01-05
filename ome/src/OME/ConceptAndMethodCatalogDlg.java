/**
  * File Created by CONAN CHAN, OCT 16, 1997, Updated by Lin Liu SEP 15,2001
  */
package OME;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Enumeration;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.BevelBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class ConceptAndMethodCatalogDlg extends Dialog {

	private JPanel leftPanel;
	private JPanel rightPanel;

	private JPanel modulePanel;
	private JPanel searchPanel;
	private JPanel selectPanel;

	private JScrollPane scrollPanel;
	private JButton selectModuleJButton;
	private JTextField searchField;
	private JButton findJButton;
	private JButton selectJButton;
	private JButton helpJButton;
	private JButton cancelJButton;
	
	private JFrame ParentFrame;
	private OME ome;
//	private ParameterizationDlg PD = null;

	/** Tree */
	protected JTree tree;
	/** Tree model. */
	protected DefaultTreeModel treeModel;
	private DefaultMutableTreeNode root;
	private DefaultMutableTreeNode searchedNode;

	private Enumeration TreeEnumeration = null;
	private String PreviousSearch = "";

	public ConceptAndMethodCatalogDlg(JFrame parent, boolean modal,
			OME O, DefaultMutableTreeNode CMT) {
				
		super(parent, modal);
		ParentFrame = parent;
		ome = O;
		root = CMT;

		setLayout(null);
		addNotify();
		setSize(getInsets().left + getInsets().right + 418,
				getInsets().top + getInsets().bottom + 395);

		setTitle("Concept & Method Catalog");
		setResizable(true);

		scrollPanel = new JScrollPane();
		scrollPanel.setBounds(getInsets().left + 5, getInsets().top + 5,
				getSize().width - getInsets().right - 157,
				getSize().height - getInsets().top - getInsets().bottom - 10);
		scrollPanel.setBackground(Color.lightGray);
		scrollPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		add(scrollPanel);

		// modulePanel
		modulePanel = new JPanel();
		modulePanel.setBounds(getSize().width - getInsets().right - 147, getInsets().top + 5, 142, 55);
		modulePanel.setBorder(BorderFactory.createTitledBorder("Module"));
		modulePanel.setBackground(getBackground());
		modulePanel.setLayout(null);
		add(modulePanel);

		selectModuleJButton = new JButton("Select Module");
		selectModuleJButton.setFont(new java.awt.Font("dialog", 0, 14));
		selectModuleJButton.setBounds(getInsets().left + 5,  getInsets().top + 0, 125, 25);
		selectModuleJButton.setToolTipText("Select Module");
		modulePanel.add(selectModuleJButton);


		// searchPanel
		searchPanel = new JPanel();
		searchPanel.setBounds(getSize().width - getInsets().right - 147, getInsets().top + 60, 142, 90);
		searchPanel.setBorder(BorderFactory.createTitledBorder("Search"));
		searchPanel.setToolTipText("Search for concept");
		searchPanel.setBackground(getBackground());
		searchPanel.setLayout(null);
		add(searchPanel);

		searchField = new JTextField();
		searchField.setBounds(getInsets().left + 5, getInsets().top + 0, 125, 30);
		searchField.setToolTipText("Enter search concept here");
		searchPanel.add(searchField);

		findJButton = new JButton("Find");
		findJButton.setFont(new java.awt.Font("dialog", 0, 14));
		findJButton.setBounds(getInsets().left + 5, getInsets().top + 35, 125, 25);
		findJButton.setToolTipText("Find Concept/Find Next");
		searchPanel.add(findJButton);


		// selectPanel
		selectPanel = new JPanel();
		selectPanel.setBounds(getSize().width - getInsets().right - 147,
				getSize().height - getInsets().bottom -120, 142, 115);
		selectPanel.setBorder(BorderFactory.createTitledBorder("Main Command"));
		selectPanel.setBackground(getBackground());
		selectPanel.setLayout(null);
		add(selectPanel);

		selectJButton = new JButton("Select");
		selectJButton.setFont(new java.awt.Font("dialog", 0, 14));
		selectJButton.setBounds(getInsets().left + 5, getInsets().top + 0, 125, 25);
		selectJButton.setToolTipText("Select");
		selectPanel.add(selectJButton);

		helpJButton = new JButton("Help");
		helpJButton.setFont(new java.awt.Font("dialog", 0, 14));
		helpJButton.setBounds(getInsets().left + 5, getInsets().top + 30, 125, 25);
		helpJButton.setToolTipText("Help");
		selectPanel.add(helpJButton);

		cancelJButton = new JButton("Cancel");
		cancelJButton.setFont(new java.awt.Font("dialog", 0, 14));
		cancelJButton.setBounds(getInsets().left + 5, getInsets().top + 60, 125, 25);
		cancelJButton.setToolTipText("Cancel");
		selectPanel.add(cancelJButton);


		LoadTree();

		// REGISTER_LISTENERS
		Action lAction = new Action();
		selectModuleJButton.addActionListener(lAction);
		findJButton.addActionListener(lAction);
		selectJButton.addActionListener(lAction);
		helpJButton.addActionListener(lAction);
		cancelJButton.addActionListener(lAction);

		Window lWindow = new Window();
		addWindowListener(lWindow);
	}

	private void ResetBound() {
		scrollPanel.setBounds(getInsets().left + 5, getInsets().top + 5,
				getSize().width - getInsets().right - 157,
				getSize().height - getInsets().top - getInsets().bottom - 10);

		modulePanel.setBounds(getSize().width - getInsets().right - 147, getInsets().top + 5, 142, 55);
		searchPanel.setBounds(getSize().width - getInsets().right - 147, getInsets().top + 60, 142, 90);
		selectPanel.setBounds(getSize().width - getInsets().right - 147,
				getSize().height - getInsets().bottom -120, 142, 115);
	}

	public void update(Graphics g) {
		ResetBound();
		show();

		// Clear the Canvas.
		g.setColor(getBackground());
		g.fillRect(0, 0, getSize().width, getSize().height);

		paint(g);
	}




	private void TreeReloadExpand() {
		treeModel.reload(root);
		for (int i=0;i<tree.getRowCount();i++)
			tree.expandRow(i);
	}


	public void setVisible(boolean b) {
		if (b) {
			treeModel.reload(root);
			TreeReloadExpand();
			System.out.println("Tree Reload");
		}
		super.setVisible(b);
	}


/*	public void Activate(ParameterizationDlg P) {
		PD = P;
		setVisible(true);
	}

*/
	// Load the Tree.
	private void LoadTree() {
		treeModel = new DefaultTreeModel(root);
		tree = new JTree(treeModel);
		tree.setShowsRootHandles(true);
		tree.setRootVisible(false);
//		tree.setCellRenderer(new ModuleTreeCellRenderer());
		scrollPanel.getViewport().add(tree);
		TreeReloadExpand();
	}


	class Action implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object object = event.getSource();
	
			// This Show the Module in use dialog and update the tree		
			if (object == selectModuleJButton) {
				System.out.println("selectModuleJButton pressed");
				
				new ModuleInUseDlg(ParentFrame, true, ome.getAvailableModule(), 
						ome.getSelectedModule(), ome.getConceptMethodTree());
				
				treeModel.reload(root);
				TreeReloadExpand();
				
				
				
			// This find in the tree the word typed in the Search field.
			} else if (object == findJButton) {
				System.out.println("Find pressed");
				
				String SearchText = searchField.getText();
				
				if (!SearchText.equals("")) {
					
					if (TreeEnumeration == null)
						TreeEnumeration = root.preorderEnumeration();
					else if (!PreviousSearch.equals(SearchText))
						TreeEnumeration = root.preorderEnumeration();
					else if (!TreeEnumeration.hasMoreElements()) {
						new MessageDlg(ParentFrame, "Search Error", "No more matches");	
						TreeEnumeration = root.preorderEnumeration();
						return;
					}

					PreviousSearch = SearchText;
						
					for (;TreeEnumeration.hasMoreElements();) {
						searchedNode = (DefaultMutableTreeNode)TreeEnumeration.nextElement();

						// Check the current Tree Node is the one searched for.
						if (searchedNode.toString().toLowerCase().
								indexOf(SearchText.toLowerCase()) != -1) {
							TreePath FoundPath = new TreePath(searchedNode.getPath());
							tree.setSelectionPath(FoundPath);
							tree. scrollPathToVisible(FoundPath);
							return;
						}
					}

					// None match give a error message.					
					new MessageDlg(ParentFrame, "Search Error", "No more matches");
					TreeEnumeration = root.preorderEnumeration();
				}
				
				
				
				
			// This get the selected node and return to Parameterization
			} else if (object == selectJButton) {
				System.out.println("select pressed");
/*				if (PD != null)
					if (tree.getLastSelectedPathComponent() instanceof IntentTreeNode)
						PD.setTreeNode(tree.getLastSelectedPathComponent().toString());
					else
						new MessageDlg(ParentFrame, "Selection Error",
								"You have to select a Concept");	
								
				else
					System.out.println(tree.getLastSelectedPathComponent());

				PD = null;
				
*/				setVisible(false);
				
			} else if (object == helpJButton) {
				System.out.println("Help pressed");
				
				File f = new File(".");
//				new OMEHelp("file:" + f.getAbsolutePath() + "/help/CMCHelp.htm");

			} else if (object == cancelJButton) {
				System.out.println("Cancel pressed");
//				PD = null;
				setVisible(false);
			}
		}
	}


	void ConceptAndMethodCatalogDlg_WindowClosing(WindowEvent event) {
		// Hide the Dialog
		setVisible(false);
		dispose();
	}

	class Window extends WindowAdapter {
		public void windowClosing(WindowEvent event) {
			Object object = event.getSource();
			if (object == ConceptAndMethodCatalogDlg.this)
				ConceptAndMethodCatalogDlg_WindowClosing(event);
		}
	}
}
