package edu.toronto.cs.ast;
import java.util.Vector;

/*
 * Created on Jan 18, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Yiqiao Wang
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class YiqiaoGoal {
	
	public String name = "", category="", annotation="";
	public int nodeId=0, parentId=0;
	//public Vector children = new Vector();
	public Vector allGoals = new Vector();
    
	public YiqiaoGoal() {		
	}
	
	//just add all the goals to allGoals vector remembering their id and their parent id
	public void addGoal (YiqiaoGoal sub) {
		
		allGoals.addElement(sub);
	}
	public void setName(String n) {
		name = n;
	}
	public void setCategory(String c) {
		category = c;
	}
	public void setAnnotation(String a) {
		annotation=a;
	}
	public void setNodeId(int i) {
		nodeId=i;
	}
	public void setParentId(int i) {
		parentId=i;
	}
	public Vector getAllGoals() {
		//System.out.println("all goals size: " + allGoals.size());
		return allGoals;
	}
	public String getName() {
		return name;
	}
	public String getCat() {
		return category;
	}
	public String getAnnotation() {
		return annotation;
	}
	public int getID() {
		
		return nodeId; 
	}
	
	public YiqiaoGoal findGoal (int id, Vector goals) {
		YiqiaoGoal g = new YiqiaoGoal(); 
		int tempid;
		for (int i=0; i < goals.size(); i++) {
			g = (YiqiaoGoal) goals.elementAt(i);
			tempid = g.getID();
			if (tempid == id) {
				return g;
			}
		}
		System.out.println("error, goal " + id + " not found");
		return g;
	}
	
}
