package OME;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

/** A panel contains a tree view and buttons on the right side.
 *
 
 This code is not used currently, but it represents an implementation of stuff
 that we will likely want to do again someday. We will surely want to rewrite
 it, but it will be useful to look at.
 
 *  @author Ying Shi
 *  @version 28 Aug 1998
 *
 *  @see TreeView
 *  @see TabbedView
 */
class TreeViewCanvas extends JPanel {
    private int newNodeSuffix = 1;
    private GraphicViewCanvas gvc;
    TreeView treePanel;
   
    /** Creates the panel.
     *
     *  @param gvc	the <code> GraphicViewCanvas </code> to which the tree
     *		    	view belongs.
     */
    public TreeViewCanvas (GraphicViewCanvas gvc) {
        this.gvc = gvc;
	//create the components
        treePanel = new TreeView(gvc);
        populateTree(treePanel);

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                treePanel.removeCurrentNode();
            }
        });

        //Lay everything out.
        setLayout(new BorderLayout());
        treePanel.setPreferredSize(new Dimension(300, 150));
        add(treePanel, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
	panel.add(removeButton);
        add(panel, BorderLayout.EAST);
    }
    

    /** Refresh the tree view according to the <code> GraphicViewCanvas
     *  </code>.
     */
    public void refresh() {
	treePanel.clear();
	populateTree(treePanel);
    }
    

    /** Populate the tree view.
     *
     *  @param treePanel	the tree view to be populated.
     */
    public void populateTree(TreeView treePanel) {
	DefaultMutableTreeNode p;
	ListIterator e = null; //gvc.getData().getAllElements();
	while (e.hasNext()) {
	    GraphicViewElement ge = (GraphicViewElement) e.next();
	    GraphicViewElement gep = (GraphicViewElement)ge.getParent();
	    if (gep != null) {
		p = treePanel.contain(gep);
		if (p == null) {
		    p = treePanel.addObject(null, gep);
		    treePanel.addObject(p, ge);
		}
		else {
		    treePanel.addObject(p, ge);
		}
	    }
	    else {
		treePanel.addObject(null, ge);
	    }
	}

    }

}
