package edu.toronto.cs.openome.evaluation.views;

import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.part.ViewPart;

import edu.toronto.cs.openome_model.Alternative;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.HumanJudgment;
import edu.toronto.cs.openome_model.Intention;

/*
 * The content provider class is responsible for
 * providing objects to the view. It can wrap
 * existing objects in adapters or simply return
 * objects as-is. These objects may be sensitive
 * to the current input of the view, or ignore
 * it and always show the same content 
 * (like Task List, for example).
 */

// Need this to be public in order to change the view content
public class ViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	private TreeNode invisibleRoot;
	private ViewPart viewPart;
	
	public ViewContentProvider(ViewPart viewPart) {
		this.viewPart = viewPart;
	}

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		//
	}
	
	public void dispose() {
		//
	}
	
	public Object[] getRoot() {
		return getChildren(invisibleRoot);
	}
	
	public Object[] getElements(Object parent) {
		if(parent.equals(viewPart.getViewSite())) {
			if(invisibleRoot == null) {
				initialize();
			}
			
			return getChildren(invisibleRoot);
		}
		
		return getChildren(parent);
	}
	
	public Object getParent(Object child) {
		if(child instanceof TreeObject) {
			return ((TreeObject)child).getParent();
		}
		
		return null;
	}
	
	public Object [] getChildren(Object parent) {
		if(parent instanceof TreeNode) {
			return ((TreeNode)parent).getChildren();
		}
		
		return new Object[0];
	}
	
	public boolean hasChildren(Object parent) {
		if(parent instanceof TreeNode) {
			return ((TreeNode)parent).hasChildren();
		}
		
		return false;
	}
	
	public TreeNode addNode(Alternative alt) {
		TreeNode node = createTreeNode(alt);
		addTreeNode(node);
		
		return node;
	}
	
	public TreeNode addNode(Intention i) {
		TreeNode node = createTreeNode(i);
		addTreeNode(node);
		
		return node;
	}
	
	private boolean addTreeNode(TreeNode child) {
		invisibleRoot.addChild(child);
		
		return true;
	}
	
	private TreeNode createTreeNode(Alternative alt) {
		String name = alt.getName();
		
		if(!alt.getDescription().isEmpty()) {
			name += " (" + alt.getDescription() + ")";
		}
		
		if(alt.getDirection().equals("forward")) {
			name += "\n[Forward Evaluation]";
		} else if(alt.getDirection().equals("backward")) {
			name += "\n[Backward Evaluation]";
		}
		
		TreeNode node = new TreeNode(name, alt, null);
		System.out.println("creating alternative called " + alt.getName());
		return node;
	}
	
	private TreeNode createTreeNode(Intention i) {
		String name = i.getName();
		TreeNode node = new TreeNode(name, i, null);
		
		return node;
	}
	
	/**
	 * Code left in to demonstrate a dummy tree structure
	 */
	private void initialize() {
		invisibleRoot = new TreeNode("", null, null);
	}
	
	/**
	 * Adds child nodes to the specified node by iterating over each given intention
	 * and creating a new TreeObject for each. 
	 * @author aftabs
	 * @param map
	 * @param node
	 */
	public void addChildren(HashMap<Intention, EvaluationLabel> map, TreeNode node) {		
		TreeNode to;
		String actorName;
		Container con;
		
		Set<Intention> intentions = (Set<Intention>)map.keySet();
		
		for(Intention i : intentions) {			
			// Add each intention as a new TreeObject as a child
			
			con = i.getContainer();
			
			if(con != null)	{
				actorName = con.getName();
			} else {
				actorName = "";
			}
			
			to = new TreeNode(i.getName() + " {" + actorName + "}" , i, map.get(i));
			node.addChild(to);
			
			//Add the human judgements for this intention to the view
			EList<HumanJudgment> humanJudgements = i.getHumanJudgments();
			int j = 1;
			
			for (HumanJudgment judgement : humanJudgements) {
				to.addChild(new TreeNode("Judgement " + j++ + ": " + judgement.getResultLabel().toString(), judgement, judgement.getResultLabel()));
			}
		}
	}
	
	public void addHumanJudgment(TreeNode node, Intention i, EList<Alternative> alts)
	{
		// if both of these will be true after the for loop, then we have a conflict
		boolean denied = false;
		boolean satisfied = false;
		
		// get the intention's label from each alternative
		for(Alternative a : alts) {
			HashMap<Intention, EvaluationLabel> map = a.getIntentionLabels();
			EvaluationLabel label = map.get(i);
			
			String name = label.getName() + " (" + a.getName() + ") ";
			
			if(a.getDirection().equals("forward")) {
				name += "[Forward Evaluation]";
			} else if(a.getDirection().equals("backward")) {
				name += "[Backward Evaluation]";
			}
			
			TreeNode subnode = new TreeNode(name, null, label);
			node.addChild(subnode);
			
			if(label == EvaluationLabel.DENIED || label == EvaluationLabel.PARTIALLY_DENIED) {
				denied = true;
			} else if(label == EvaluationLabel.SATISFIED || label == EvaluationLabel.PARTIALLY_SATISFIED) {
				satisfied = true;
			}
		}
		
		// set the conflict flag
		node.setConflict(denied && satisfied);
	}
	
	public void removeAllNodes() {
		invisibleRoot.clear();
	}
}
