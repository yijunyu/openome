package OME;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.tree.DefaultMutableTreeNode;

public class IntentTreeNode extends DefaultMutableTreeNode {
	private char Type = ' ';
	private String ContribType = "";

	public IntentTreeNode() {
		super();
	}

	public IntentTreeNode(String N) {
		super(N);
	}

	public IntentTreeNode(String N, char T) {
		super(N);
		setType(T);
	}

	public IntentTreeNode(String N, char T, String CT) {
		super(N);
		setType(T);
		setContribType(CT);
	}

	public Object clone() {
		return (new IntentTreeNode(super.toString(), Type, ContribType));
	}



	/** This save to file only the field of this class */
	public void save(ObjectOutputStream s) throws Exception {
		s.writeObject(super.toString());
		s.writeObject(new Character(Type));
		s.writeObject(ContribType);

		s.writeObject(new Integer(getChildCount()));

		for (int i=0; i<getChildCount(); i++) {
			((DecompTreeNode)getChildAt(i)).save(s);
		}	
	}

	/** This load from file all saved the field of this class */
	public void load(ObjectInputStream s) throws Exception {
		setUserObject((String)s.readObject());
		setType(((Character)s.readObject()).charValue());
		setContribType((String)s.readObject());
		
		Integer NumChild = (Integer)s.readObject();

		for (int i=0; i<NumChild.intValue(); i++) {
			DecompTreeNode DTN = new DecompTreeNode();
			DTN.load(s);
			add(DTN);
		}	
	}
    
	
	public void setType(char T) {
		Type = T;
//		if (Type != Intent.SOFTGOAL)
//			setContribType("");
	}

	public char getType() {
		return Type;
	}
	
	public String getName() {
		return super.toString();
	}

	public void setContribType(String CT) {
		ContribType = CT;
	}
	
	public String getContribType() {
		return ContribType;
	}

	public String toString() {
		if (ContribType.equals(""))
			return super.toString();
		else
			return (super.toString() + " (" + ContribType + ")");
	}
}
