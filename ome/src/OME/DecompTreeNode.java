package OME;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.tree.DefaultMutableTreeNode;

public class DecompTreeNode extends DefaultMutableTreeNode {
	public static final int UNDEFINED = 0;
	
	public static final int DECOMPGOAL = 1;
	public static final int DECOMPTASK = 2;
	public static final int DECOMPRESOURCE = 3;
	public static final int DECOMPSOFTGOAL = 4;
	public static final int MEANGOAL = 5;
	public static final int MEANTASK = 6;
	public static final int MEANRESOURCE = 7;
	public static final int MEANSOFTGOAL = 8;
	public static final int CONTRIBSOFTGOAL = 9;
	public static final int PARENTTASK = 10;
	public static final int ENDGOAL = 11;
	public static final int ENDTASK = 12;
	public static final int ENDRESOURCE = 13;
	public static final int ENDSOFTGOAL = 14;


	private int type = 0;
	private String Condition = "";

	public DecompTreeNode() {
		super();
	}

	public DecompTreeNode(String N) {
		super(N);
	}
/*
	public DecompTreeNode(String N, int T) {
		super(N);
		type = T;
	}
*/
	public DecompTreeNode(int T) {
		type = T;
		setUserObject(getTypeName());
	}

	public DecompTreeNode(int T, String C) {
		this(T);
		setCondition(C);
	}

/*	public DecompTreeNode(String N, String C) {
		super(N);
		setCondition(C);
	}
*/
	public Object clone() {
		return (new DecompTreeNode(type, Condition));
	}


	/** This save to file only the field of this class */
	public void save(ObjectOutputStream s) throws Exception {
		s.writeObject(new Integer(type));
		s.writeObject(Condition);

		s.writeObject(new Integer(getChildCount()));

		for (int i=0; i<getChildCount(); i++) {
			((IntentTreeNode)getChildAt(i)).save(s);
		}	
	}

	/** This load from file all saved the field of this class */
	public void load(ObjectInputStream s) throws Exception {
		setType(((Integer)s.readObject()).intValue());
		setCondition((String)s.readObject());
		
		Integer NumChild = (Integer)s.readObject();

		for (int i=0; i<NumChild.intValue(); i++) {
			IntentTreeNode ITN = new IntentTreeNode();
			ITN.load(s);
			add(ITN);
		}	
	}
    



	public void setCondition(String C) {
		Condition = C;
	}
	
	public String getCondition() {
		return Condition;
	}

	public void setType(int T) {
		type = T;
		setUserObject(getTypeName());
	}

	public int getType() {
		return type;
	}

	public String getTypeName() {
		switch(type) {
			case DECOMPGOAL:
				return "Task Decomposition[Goal]";
			case DECOMPTASK:
				return "Task Decomposition[Task]";
			case DECOMPRESOURCE:
				return "Task Decomposition[Resource]";
			case DECOMPSOFTGOAL:
				return "Task Decomposition[Softgoal]";
			case MEANGOAL:
				return "Means-End[Goal]";
			case MEANTASK:
				return "Means-End[Task]";
			case MEANRESOURCE:
				return "Means-End[Resource]";
			case MEANSOFTGOAL:
				return "Softgoal Decomposition";
			case CONTRIBSOFTGOAL:
				return "Softgoal Decomposition";
			default:
				return "Undefined";
		}
	}
}
