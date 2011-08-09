package edu.toronto.cs.openome_model.diagram.views.tabular;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.swt.graphics.Image;

import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;

class Node implements IAdaptable {
	private String name = "";
	private String link = "";
	private Node parent;
	private ArrayList children;
	
	public Node(String name) {
		this.name = name;
		children = new ArrayList();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public String toString() {
		return getName();
	}
	
	public void addChild(Node child) {
		children.add(child);
		child.setParent(this);
	}
	
	public void removeChild(Node child) {
		children.remove(child);
		child.setParent(null);
	}
	
	public Node [] getChildren() {
		return (Node [])children.toArray(new Node[children.size()]);
	}
	
	public boolean hasChildren() {
		return children.size()>0;
	}
	
	public void clear() {
		children.clear();
	}
	
	public Object getAdapter(Class key) {
		return null;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLink() {
		if (link == null) {
			return "";
		}
		return link;
	}
	
	public Image getImage() {
		return null;
	}
	
	public String getUsages() {
		return "";
	}
	
	
}