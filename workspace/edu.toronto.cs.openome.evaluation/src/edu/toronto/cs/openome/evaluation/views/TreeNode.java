package edu.toronto.cs.openome.evaluation.views;

import java.util.ArrayList;

import edu.toronto.cs.openome_model.Alternative;

//TreeNode represents nodes with children
public class TreeNode extends TreeObject {
	private ArrayList<TreeObject> elements;
	private boolean status = false;
	private boolean conflict = false;
	
	public TreeNode(String name, Object obj, Object img) {
		super(name, obj, img);
		elements = new ArrayList<TreeObject>();
	}
	
	public void addChild(TreeObject child) {
		elements.add(child);
		child.setParent(this);
	}
	
	public void removeChild(TreeObject child) {
		elements.remove(child);
		child.setParent(null);
	}
	
	public TreeObject [] getChildren() {
		return (TreeObject[])elements.toArray(new TreeObject[elements.size()]);
	}
	
	public boolean hasChildren() {
		return elements.size()>0;
	}
	
	public int getNumOfChild() {
		return elements.size();
	}
	
	public Alternative getAlternative() {
		return (Alternative) this.obj;
	}
	
	public void setAlternateStatus(boolean b) {
		status = b;
	}
	
	public boolean isAlternative() {
		return status;
	}
	
	public void clear() {
		elements.clear();
	}
	
	public void setConflict(boolean conflict) {
		this.conflict = conflict;
	}
	
	public boolean getConflict() {
		return conflict;
	}
}
