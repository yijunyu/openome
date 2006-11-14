package edu.toronto.cs.ast;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jface.text.Document;

import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.Goal;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Property;

public class parser {
	//a vector that contains the parent-children relationships for the child to know 
	//which parent it should be added on to.  only implenmentation concerns. 
	public static Vector pcVec = new Vector();
	public static int nodeID=1, parentID=-1;
	public static YiqiaoGoal myGoal = new YiqiaoGoal();
	public String parentAnnotation = "";
	
	//get how many children the node's parent has
	public int getNumSiblings(ASTNode node) {
		
		ASTNode parent = node.getParent();
		StructuralPropertyDescriptor location = node.getLocationInParent();
		int size = 0;
		if ((location != null) && location.isChildListProperty()) {
		    size = ((List) parent.getStructuralProperty(location)).size();
		 }
		return size;
	}

	
	GoalmodelPackage e = GoalmodelPackage.eINSTANCE;
	GoalmodelFactory f = e.getGoalmodelFactory();
	Resource resource;
	String filename;
	public Resource initialize (String output) {	
		//create and add root goal which is a NOP always, it has goal id 0
		//Goal subGoal = createGoal ("" + nodeID, "AND", "", 0, -1);
		//myGoal.addGoal(subGoal);
		//add parent goal parentID=0 to the entire goal model
		pcVec.addElement(new Vector());
		
		//the first vector records its Id
		((Vector) pcVec.elementAt(0)).addElement(new Integer(0));
		
		//the second vector records how many children it has
		((Vector) pcVec.elementAt(0)).addElement(new Integer(-1));
		
		//the third vector records its children
		((Vector) pcVec.elementAt(0)).addElement(new Vector());
		ResourceSet resourceSet = new ResourceSetImpl();
		    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    		Resource.Factory.Registry.DEFAULT_EXTENSION, 
		    		new XMIResourceFactoryImpl());
		    // Get the URI of the model file.
		    URI fileURI = URI.createFileURI(new File(output).getAbsolutePath());
	    // Create a resource for this file.
		return resourceSet.createResource(fileURI);
	}

	HashMap hm = new HashMap();
	public YiqiaoGoal createGoal (String name, String cat, String annot, int nid, int pid) {
		Goal s = f.createGoal();
		resource.getContents().add(s);
		s.setName(name);
//		int type = DecompositionType.LEAF;
//		s.setType(DecompositionType.get(type));
		if (annot!=null && !annot.equals("")) {
			Property p = f.createProperty();
			p.setName("annotation"); p.setValue(annot);
			resource.getContents().add(p);
			s.getProperty().add(p);
		}
		Goal parent = (Goal) hm.get(new Integer(pid));
		if (parent!=null) {
			s.setParent(parent);
			parent.setType(DecompositionType.get(DecompositionType.AND));
		}
		hm.put(new Integer(nid), s);
		YiqiaoGoal sub = new YiqiaoGoal();
		sub.setName(name);
		sub.setAnnotation(annot);
		sub.setCategory(cat);
		sub.setNodeId(nid);
		sub.setParentId(pid);
		
		//System.out.println("goal created, with name: " + name + "id: " + nid + " pid: " + pid);
		return sub;
	}
	
	public void parseExpressionGoals(ExpressionStatement node) {
		String annotation="";
		parentID = lookForParent(node); 
		//stem.out.println("parent for node " + nodeID + " is: " + parentID);
		//set in pcVec this node belongs to its parent
		setChildForParent(nodeID, parentID);
		if (node.getLength()<node.toString().length()) {
			String goalName = node.toString().substring(0,node.getLength()-1);
			//System.out.println("<subGoal name = \"" + goalName + "\"/>");
			/*
			annotation that belongs to its parent which is a NOP, we eliminated that node in the goal graph
			but we want its annotation. example: if x then {A}. in AST, it creates two nodes, one for {A} with
			annotation, and its child A without annotation. in our goal model, we just want one goal A, with it's 
			parent's {A}'s annotation. 
			*/
			if (parentAnnotation.length()>0) {
				annotation = parentAnnotation;
				parentAnnotation="";
			}
			YiqiaoGoal subGoal = createGoal (goalName, "AND", annotation,nodeID, parentID);
			myGoal.addGoal(subGoal);
			//System.out.println("goal " + nodeID + " named: " + goalName + " added");
			//next processed node will have a new ID
			nodeID++;
		}
	}
	
	public void parseAssignGoals(Assignment node) {
		
		parentID = lookForParent(node); 
		//System.out.println("parent for node " + nodeID + " is: " + parentID);
		setChildForParent(nodeID, parentID);
//		if (node.getLength()>node.toString().length())
//			System.out.println(""+ node + node.getLength());
//		String goalName = node.toString().substring(0,node.getLength()-1);
		String goalName = node.toString();
		//System.out.println("<subGoal name = \"" + goalName + "\"/>");
		String annotation = "";
		if (parentAnnotation.length()>0) {
			annotation = parentAnnotation;
			parentAnnotation="";
		}
		YiqiaoGoal subGoal = createGoal (goalName, "AND", annotation,nodeID, parentID);
		myGoal.addGoal(subGoal);
		//System.out.println("goal " + nodeID + " named: " + goalName + " added");
		//next processed node will have a new ID
		nodeID++;
	}
	
	public void parseIfGoals (IfStatement node) {
		String annotation = "if (" +node.getExpression().toString() + ")";
		//System.out.println("annotation: " + annotation);
		
		parentID = lookForParent(node); 
		//System.out.println("parent for node " + nodeID + " is: " + parentID);
		//setChildForParent(nodeID, parentID);
	
		String body = (node.getThenStatement()).toString();	
		//System.out.println("body: " + body);
		int num = getNumStatements(body);
		YiqiaoGoal subGoal;
		//add a NOP goal
		if (num > 1) {
			setChildForParent(nodeID, parentID);
			subGoal = createGoal ("" + nodeID, "AND", annotation, nodeID, parentID);
			//System.out.println("goal " + nodeID + "name: NOP, annotation: " + annotation + " added");
			addParent(nodeID);
			myGoal.addGoal(subGoal);
			nodeID++;
		}
		//	else, there is only 1 statement, the goal should be a leaf goal. on the next visit statement
		//it will be made into an ExpressionStatement. so just leave it here. 
		else parentAnnotation = annotation; 
		
		
	}
	
	/* 
	 * In Java, Do While statement is similar to the
	 * REPEAT UNTIL statement in Fortran, except for
	 * the negation of the condition expression.
	 */
	public void parseRepeatGoals (DoStatement node) {
		String annotation = "REPEAT.. UNTIL ! (" + node.getExpression().toString() + ")";
		parentID = lookForParent(node); 
		//System.out.println("parent for node " + nodeID + " is: " + parentID);
		
		String body = (node.getBody()).toString();
		//System.out.println("body for repeat statemetn is : " + node.getBody());
		int num = getNumStatements(body);
		YiqiaoGoal subGoal = new YiqiaoGoal();
		//add a NOP goal
		if (num > 1) {
			setChildForParent(nodeID, parentID);
			subGoal = createGoal ("" + nodeID, "AND", annotation, nodeID, parentID);
			//System.out.println("goal " + nodeID + "name: NOP, annotation: " + annotation + " added");
			addParent(nodeID);
			myGoal.addGoal(subGoal);
			nodeID++;
		}
		//else it will become a leaf goal in the next visit
		else parentAnnotation = annotation; 
	}
	public void parseBlockGoals (Block node) {
		parentID = lookForParent(node); 
		YiqiaoGoal subGoal = new YiqiaoGoal();
		//add a NOP goal
		
		setChildForParent(nodeID, parentID);
		subGoal = createGoal ("" + nodeID, "OR", "", nodeID, parentID);
		//System.out.println("goal " + nodeID + "name: NOP, annotation: " + annotation + " added");
		addParent(nodeID);
		myGoal.addGoal(subGoal);
		nodeID++;
		
	}
	
	public void parseWhileGoals (WhileStatement node) {
		String annotation = "While (" + node.getExpression().toString() + ")";
		parentID = lookForParent(node); 
		//System.out.println("parent for node " + nodeID + " is: " + parentID);
	
		String body = (node.getBody()).toString();
		
		int num = getNumStatements(body);
		YiqiaoGoal subGoal;
		//add a NOP goal
		if (num > 1) {
			setChildForParent(nodeID, parentID);
			subGoal = createGoal ("" + nodeID, "AND", annotation, nodeID, parentID);
			System.out.println("goal " + nodeID + "name: NOP, annotation: " + annotation + " added");
			addParent(nodeID);
			myGoal.addGoal(subGoal);
			nodeID++;
		}
		else parentAnnotation = annotation; 
	}
	
	public void parseForGoals (ForStatement node) {
		String annotation = "for (" +node.getExpression().toString() + ")";
		parentID = lookForParent(node); 
		//System.out.println("parent for node " + nodeID + " is: " + parentID);
		String body = (node.getBody()).toString();
		int num = getNumStatements(body);
		YiqiaoGoal subGoal;
		//add a NOP goal
		if (num > 1) {
			setChildForParent(nodeID, parentID);
			subGoal = createGoal ("" + nodeID, "AND", annotation, nodeID, parentID);
			//System.out.println("goal " + nodeID + "name: NOP, annotation: " + annotation + " added");
			addParent(nodeID);
			myGoal.addGoal(subGoal);
			nodeID++;
		}
		//else it is a leaf node, the next visit will get there. 
		else parentAnnotation = annotation; 
	}
	
	//make node with nodeid a parent in pcVec, it is a NOP node
	public void addParent(int nodeid) {
		//System.out.println("adding node " + nodeid + " as a parent");
		pcVec.addElement(new Vector());
		
		//the first vector records its id
		int loc = pcVec.size() -1;
		((Vector) pcVec.elementAt(loc)).addElement(new Integer(nodeid));
		
		//the second vector records how many children this node has
		((Vector) pcVec.elementAt(loc)).addElement(new Integer(-1));
		
		//the third vector records its children
		((Vector) pcVec.elementAt(loc)).addElement(new Vector());
		
	}
	
	//search for the parent id of this node. 
	public int lookForParent(ASTNode node) {		
		int numSibs=0;
		int parentId= -1;
		int numParents = pcVec.size();
		//printPcVec();
		//this node should be added to the first available spot of the last available parent
		for (int i= numParents-1; i>=0; i--) {		
			Vector parentVec = (Vector) pcVec.elementAt(i);	
//			System.out.println("parent length = " + parentVec.size());
			if (parentVec.size()>2) {
			int numChildren = ((Integer) parentVec.elementAt(1)).intValue();
			
			//first child of this parent. find num of children the parent has and 
			//return this parent id as its parent id
			if (numChildren == -1) {
				numSibs = getNumSiblings(node);
				//System.out.println("numSibs for node: " + nodeID + " is: " + numSibs);
				((Vector) pcVec.elementAt(i)).setElementAt(new Integer(numSibs), 1);
				parentId= ((Integer) parentVec.elementAt(0)).intValue();
				break;
			}
			else {
				//there is space for this parent to take more children
				//this is the parent I am looking for
				
				//how many children have already been set for this parent
				int numChildrenSet = ((Vector) parentVec.elementAt(2)).size();
				//there is more space for this node
				if (numChildrenSet < numChildren) {
					parentId = ((Integer) parentVec.elementAt(0)).intValue();
					break;
				}
				//else this node is not its parent, go one parent back and check the next one.
			} //of else
			}
		} //of for
		if (parentId==-1) {
//			System.out.println("error, parent not found for node: " + nodeID);
//			System.out.println(node);
		}
		//System.out.println("parent for " + nodeID +", "+ node + " is : " + parentId);
		return parentId;
	} //of method
	
	public void printPcVec() {
		Vector vec, children;
		System.out.println("--------pcVec is: --------");
		int id, numChild;
		for (int i=0; i< pcVec.size(); i++) {
			vec = (Vector) pcVec.elementAt(i);
			id = ((Integer) vec.elementAt(0)).intValue();
			numChild = ((Integer) vec.elementAt(1)).intValue();
			System.out.println("goal " + id + " should have " + numChild + " children");
			children = (Vector)vec.elementAt(2);
			int childid;
			if (children.size() == 0)
				System.out.println(" has no children added");
			else System.out.println("it has " + children.size() + " children already");
			for (int j=0; j< children.size(); j++) {
				childid = ((Integer) children.elementAt(j)).intValue();
				System.out.println("has child: " + childid);
			}
			
		}
		System.out.println("-------- --------");
	}
    //get how many java program statements are in the str, dimed by ;
	public int getNumStatements (String str) {
		
		
		//strip off the parenthesis around the string first
		str.trim();
		
		if (str.charAt(0)== '{') {
			str = str.substring(1,str.length()-1);
			//System.out.println("str is now" + str);
		}
		
		StringTokenizer st = new StringTokenizer (str, ";");
	    int count = st.countTokens();
		//System.out.println (str + " has " + count + " tokents");
		return count;
	}

	//set in the pcVec Vector which parents have which children
	public void setChildForParent(int nid, int pid) {
		Vector tempVec;
		int tempPid;
		for (int i=0; i< pcVec.size(); i++) {
			tempVec = (Vector)pcVec.elementAt(i);
			if (tempVec.size()>0) {
				tempPid = ((Integer) tempVec.elementAt(0)).intValue();
				if (tempPid == pid) {
					((Vector) ((Vector) pcVec.elementAt(i)).elementAt(2)).addElement(new Integer(nid));
					//System.out.println("parent " + pid + "has added child " + nid);
					break;
				}
			}
		} //of for
	}
	
	public void parse(String filename, String output) {
		try {
			this.filename = filename;
			FileReader fr = new FileReader();
			Document doc = fr.readFile(filename);
			ASTParser parser = ASTParser.newParser(AST.JLS3);
			parser.setSource(doc.get().toCharArray());
			CompilationUnit mcu = (CompilationUnit) parser.createAST(null);
			resource = initialize(output);
			mcu.accept(new ASTVisitor() {
				
				public boolean visit(IfStatement node) {
					parseIfGoals(node);
					return true;
				}
				public boolean visit(DoStatement node) {
					
					parseRepeatGoals(node);
					return true;
				}
				public boolean visit(WhileStatement node) {
					parseWhileGoals(node);
					return true;
				}
				public boolean visit(Assignment node) {
					parseAssignGoals(node);
					return true;
				}
				public boolean visit (ForStatement node) {
					parseForGoals (node);
					return true; 
				}
				public boolean visit(ExpressionStatement node) {
					parseExpressionGoals(node);	
					return true;
				}
				public boolean visit (Block node) {
					parseBlockGoals (node);
					return true;
				}
				
			});
			  try
			  {
			    resource.save(Collections.EMPTY_MAP);
			  }
			  catch (IOException e) {}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
