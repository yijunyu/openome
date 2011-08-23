package edu.toronto.cs.openome.evaluation.views;

import java.util.ArrayList;

import edu.toronto.cs.openome_model.Alternative;
import edu.toronto.cs.openome_model.Intention;

//TreeNode represents nodes with children
public class TreeNode extends TreeObject {
	private ArrayList<TreeObject> elements;
	private String inconsistentWith; 
	
	//If the tree node is an inconsistency 
    public static final String MODEL = "model";
    public static final String JUDGMENT = "judgment";
	
	/* Differentiates between the different kinds of nodes (ie. Alternative or Intentions) */
	private boolean altStatus = false;
	private boolean hgStatus = false;
	private boolean sgStatus = false;
	private boolean tStatus = false; 
	private boolean rStatus = false; 
	
	private boolean conflict = false;
	
	public TreeNode(String name, Object obj, Object img, String inconsWith) {
		super(name, obj, img);
		elements = new ArrayList<TreeObject>();
		this.inconsistentWith = inconsWith; 
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
	
	public Intention getIntention() {
		return (Intention) this.obj;
	}
	
	public void setAlternateStatus(boolean b) {
		altStatus = b;
	}
	
	public void setHardgoalStatus(boolean b) {
		hgStatus = b;
	}
	
	public void setSoftgoalStatus(boolean b) {
		sgStatus = b;
	}
	
	public void setTaskStatus(boolean b) {
		tStatus = b;
	}
	
	public void setResourceStatus(boolean b) {
		rStatus = b;
	}
	
	public boolean isAlternative() {
		return altStatus;
	}
	
	public boolean isHardgoal() {
		return hgStatus;
	}
	
	public boolean isSoftgoal() {
		return sgStatus;
	}
	
	public boolean isTask() {
		return tStatus; 
	}
	
	public boolean isResource() {
		return rStatus; 
	}
	
	public void setInconsistentWith(String type) {
		this.inconsistentWith = type;
	}

	public String getInconsistentWith() {
		if (inconsistentWith == null) {
			return "";
		}
		return this.inconsistentWith;
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
