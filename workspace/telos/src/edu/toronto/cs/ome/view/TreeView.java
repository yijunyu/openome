
package edu.toronto.cs.ome.view;

import java.awt.GridLayout;
import java.util.Enumeration;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;


/**
 * A tree view is a self contained tree view class with creating,  *  displaying and editing funcitonalities. *  *  * This code is not used currently, but it represents an implementation of stuff * that we will likely want to do again someday. We will surely want to rewrite * it, but it will be useful to look at. *  *  * @author Ying Shi * @version 28 Aug 1998 *  * @see TreeViewCanvas
 */

class TreeView extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected DefaultMutableTreeNode rootNode;
    protected DefaultTreeModel treeModel;
    protected JTree tree;
    /**
	 * 
	 * @uml.property name="gvc"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private GraphicViewCanvas gvc;

    /**
     * Construct a tree view.
     *
     * @param gvc   the <code> GraphicViewCanvas </code> which the tree view
     *		  belongs to.
     */
    public TreeView(GraphicViewCanvas gvc) {
        this.gvc = gvc;
	
	rootNode = new DefaultMutableTreeNode("OME Root Node");
        treeModel = new DefaultTreeModel(rootNode);

        tree = new JTree(treeModel);
        tree.setEditable(true);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);
        tree.setShowsRootHandles(true);

        JScrollPane scrollPane = new JScrollPane(tree);
        setLayout(new GridLayout(1,0));
        add(scrollPane);
    }


    /**  Removes all nodes except the root node. */
    public void clear() {
        rootNode.removeAllChildren();
        treeModel.reload();
    }


    /** Removes the currently selected nodes. */
    public void removeCurrentNode() {
        TreePath[] currentSelection = tree.getSelectionPaths();
	int count = tree.getSelectionCount();
	for (int i=0; i<count; i++) {
	    DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)
                         (currentSelection[i].getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode)(currentNode.getParent());
            if (parent != null) {
		treeModel.removeNodeFromParent(currentNode);
            }
	    gvc.getData().deselectAll();
	    gvc.getData().getSelectedElements().add(
		    (GraphicViewElement)(currentNode.getUserObject()));
	    gvc.getData().deleteSelectedElements();
        }  
	gvc.repaint();
    }


    /** Add child to the currently selected node. 
     *
     *  @param child  the node to be added.
     */
    public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
	TreePath[] parentPath = tree.getSelectionPaths();
	int count = tree.getSelectionCount();
	
        if (count != 1) {
            parentNode = rootNode;
        } else {
            parentNode = (DefaultMutableTreeNode)
                         (parentPath[0].getLastPathComponent());
        }

	return addObject(parentNode, child, true);
    }


    /** Add child to the currently selected node. 
     *
     *  @param child  the node to be added.
     *  @param parent the node under which a child node is to be added.
     */
    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
    					    Object child) {
	return addObject(parent, child, false);
    }


    /** Add child to the currently selected node. 
     *
     * @param child		the node to be added.
     * @param parent		the node under which a child node is to be added.
     * @param shouldBeVisible	a flag indicating whether the node should be
     *				visible.
     */
    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
    					    Object child, 
                                            boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(child);

	if (parent == null) {
	    parent = rootNode;
	}

        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());

        // Make sure the user can see the lovely new node.
        if (shouldBeVisible) {
            tree.expandPath(new TreePath(parent.getPath()));
	    tree.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
	return childNode;
    }


    /** Tests whether a node is contained in the tree.
     *
     *  @param node  the node to be tested.
     */
    public DefaultMutableTreeNode contain(Object node) {
	Enumeration e = rootNode.children();
	while (e.hasMoreElements()) {
	    DefaultMutableTreeNode childNode = (DefaultMutableTreeNode)
		e.nextElement();
	    if (childNode.getUserObject() == node) {
		return childNode;
	    }
	}
	return null;
    }
    
}


