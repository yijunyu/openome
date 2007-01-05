/*
 * Created on Mar 22, 2005
 */
package edu.toronto.cs.q7.codegen;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//import captainfeature.CaptainFeature;
//import captainfeature.command.Cmd_addDiagramWorkbench;
//import captainfeature.command.Cmd_addFeatureAndNode;
//import captainfeature.command.Cmd_addFeatureSpace;
//import captainfeature.command.Cmd_addRepositorySpace;
//import captainfeature.command.Cmd_connectFeatureNodes;
//import captainfeature.datamodel.DiagramWorkbench;
//import captainfeature.datamodel.FeatureNode;
//import captainfeature.datamodel.FeatureSpace;
//import captainfeature.datamodel.Group;
//import captainfeature.datamodel.Limit;
//import captainfeature.datamodel.NodeManager;
//import captainfeature.datamodel.RepositorySpace;
import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.IStarElement;
import edu.toronto.cs.q7.model.IStarLink;
import edu.toronto.cs.util.D;

public class FeatureCodeGenerator extends IStarGraphCodeGenerator {

	/**
	 * @param a
	 */
	public FeatureCodeGenerator(ArrayList a) {
		super(a);
	}
	public void generateGoalModel(String out_file) {
		if (advices == null) {
			System.out.println("No model parsed?");
			return;
		}		
		create_elements_and_links(out_file);		
		mark_parent_goal_of_softgoal_as_softgoal();
		create_aspect();
		mark_subgoal_of_task_as_task();
		create_dependencies();
		
		generate_features(out_file);
	}
	/**
	 * Generate features through the captainfeature tool
	 * We shortcut the save operations
	 */
	private void generate_features(String out_file) {
		// find root goals
		Vector root_goals = find_root_goals();
		if (root_goals.size()==0) return;
//		CaptainFeature captain = initialize_captain_feature(out_file);
//		if (captain==null) {
//			D.o("Can't initialize captain feature");
//			return;
//		}
        // map root goals into features
//		for (Iterator i = root_goals.iterator(); i.hasNext(); ) {
//			IStarElement g = (IStarElement) i.next();
//			FeatureNode r = generateFeature(g, captain._root, 0);
			// auto format
//	        DiagramChecker checker = new DiagramChecker();
//	        DiagramChecker.DummyNode dummy = checker.checkNode(r);
//	        if (checker!=null)
//	        	checker.reorderNode(dummy,5,0);
//		}
        // save it through the captain feature
//        RepositorySpace rep = ((RepositorySpace)captain._root.getChild(0));
//        captain._persistence.save(rep, out_file);
	}
	/**
	 * @param root_goals
	 */
	private Vector find_root_goals() {
		Vector root_goals = new Vector();
		for (Enumeration i = goals.keys(); i.hasMoreElements();) {
			String k = (String) i.nextElement();
		    Advice a = (Advice) goals.get(k);
		    if (a!=null) {
		    	IStarElement g = (IStarElement) elements.get(a);
			    if (g!=null && !g.isSoftGoal) {
//					D.o(g.name);
			    	if (g.parent!=null && g.parent.name.indexOf("NOP")<0) {// is system goal
				    	boolean root = true;
						for (Enumeration j = links.keys(); j.hasMoreElements();) {
							IStarLink s = (IStarLink) links.get(j.nextElement());
							if (s.to.id == g.id && s.isDecomposition()) {
								root = false;
								break;
							}
						}
						if (root) {
							root_goals.add(g);
						}
			    	}
			    }
		    }
		}
		return root_goals;
	}
	/**
	 * @param out_file
	 * @param captain
	 * @return
	 */
//	private CaptainFeature initialize_captain_feature(String out_file) {
//		CaptainFeature captain = null;
//		try {
//	        captain = new CaptainFeature();
//	        captain.setExtendedState(Frame.MAXIMIZED_BOTH);
//	        captain.setVisible(true);
//	        Cmd_addRepositorySpace cmdNew = new Cmd_addRepositorySpace(captain._root);
//	        cmdNew.createNewRepository(out_file);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return captain;
//	}
	/**
	 * @param g
	 * @param space
	 * @param i
	 */
//	private FeatureNode generateFeature(IStarElement g, NodeManager root, int lvl) {
//		try {
//        NodeManager parent = root;
//        String name = g.parent!=null?
//        		g.name.substring(g.name.indexOf("::")+2):
//					g.name;
//		if (lvl == 0) { // a new feature model is created for each root goal	
//			// MODEL
//			FeatureSpace fs = (FeatureSpace) root.getChild(0).getChild(0).getChild(1);
//			if (g.parent!=null) { // belong to agent
//				Cmd_addFeatureSpace addFeature = new Cmd_addFeatureSpace((FeatureSpace)fs);
//	            addFeature.addFeatureSpace(g.parent.name);
//	            fs = addFeature._newFeatureSpace;
//			}
//	        Cmd_addDiagramWorkbench addDiagram = new Cmd_addDiagramWorkbench((FeatureSpace)fs);
//	        addDiagram.addDiagram(name);
//	        parent = addDiagram._newDiagramWorkbench;
//		}
//		Cmd_addFeatureAndNode addFeature = new Cmd_addFeatureAndNode((DiagramWorkbench)parent);		
//        addFeature.addFeatureNode(name);        
//        FeatureNode pFeature = addFeature._newFeatureNode;        
//		// treating subgoals
//    	Vector children = new Vector();
//    	String rule = "|";
//		for (Enumeration i = links.keys(); i.hasMoreElements();) {
//			IStarLink s = (IStarLink) links.get(i.nextElement());
//			if (s.isDecomposition()) {
//				if (s.from.id == g.id) {
//					children.add(s.to);
//					rule = s.op;
//				}
//			}
//		}		
//        if (g.feature!=null && g.feature.equals("/")) { // optional
//        	pFeature.setSystemElement(true);
//        } else { // mandatory
//        	
//        }
//        if (children.size()>1 && g.feature!=null && g.feature.equals("|") && rule.equals("Or")) { // alternative XOR 
//        	Vector featureChildren = new Vector();
//        	for (Iterator v = children.iterator(); v.hasNext(); ) {
//	    		IStarElement c = (IStarElement) v.next();
//				FeatureNode cFeature = generateFeature(c, parent, lvl + 1);
//				featureChildren.add(cFeature);
//	        	((DiagramWorkbench)parent).removeFeatureNode(cFeature);
//        	}
//    		Group grp = new Group(featureChildren, new Limit(1,1));
//    		pFeature.addChild(grp);
//        } else if (children.size()>1 && rule.equalsIgnoreCase("Or")) { // inclusive OR 
//        	Vector featureChildren = new Vector();
//        	for (Iterator v = children.iterator(); v.hasNext(); ) {
//	    		IStarElement c = (IStarElement) v.next();
//				FeatureNode cFeature = generateFeature(c, parent, lvl + 1);
//				featureChildren.add(cFeature);
//	        	((DiagramWorkbench)parent).removeFeatureNode(cFeature);
//        	}
//    		Group grp = new Group(featureChildren, new Limit(1,Integer.MAX_VALUE));
//    		pFeature.addChild(grp);
//        } else if (children.size()>0 ){ // mandatory
//        	for (Iterator v = children.iterator(); v.hasNext(); ) {
//        		IStarElement c = (IStarElement) v.next();
//				FeatureNode cFeature = generateFeature(c, parent, lvl + 1);
//				Cmd_connectFeatureNodes conn = new Cmd_connectFeatureNodes((DiagramWorkbench) parent);
//				conn._parentNode = pFeature;
//				conn.setChild(cFeature); // connect them        		
//        	}
//        } 
//		return pFeature;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}	
}
