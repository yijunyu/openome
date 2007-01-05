package OME;

import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.tree.DefaultMutableTreeNode;

public class KbModule implements Serializable {
	private String Name = "";
	private DefaultMutableTreeNode TreeRoot;
	private boolean Modified;

	/** constructor */
	public KbModule() {
	}

	
	public KbModule(String N) {
		Name = N;
		TreeRoot = new DefaultMutableTreeNode("Root");
		Modified = true;
	}


	/** This save to file only the field of this class */
	public void save(ObjectOutputStream s) throws Exception {
		s.writeObject(Name);

		s.writeObject(new Integer(TreeRoot.getChildCount()));

		for (int i=0; i<TreeRoot.getChildCount(); i++) {
//			((IntentTreeNode)TreeRoot.getChildAt(i)).save(s);
		}	
	}

	/** This load from file all saved the field of this class */
//	public void load(ObjectInputStream s) throws Exception {
	public void load(String filename) throws Exception {
	    D.o("loading Knowhow KB");
/*	    KB kb = kbm.createKB();
	    kb.fileTELL(dir+filename);

	    TelosFramework tfw = new TelosFramework(kb);
	    OMEModel model = new TelosModel(kb,tfw, this, ome);
	    ViewManager vm = model.getViewManager();;
	
	    models2vms.put(model,vm);
	    models2kbs.put(model,kb);
	    model.load();   // NOTE:  loading the model does much of the work
			// involved in restoring the views work for all views.
	    initializePlugins(model);

	    // restore the views:
	    Iterator i = vm.getViews();
	    while (i.hasNext()) {
		View view = (View)i.next();
		D.o("got View " + view + "=-=-=-==-=-=-=-=-=-=-=-=");
		view.load(new TelosViewSerializer(view.getID(),kb));
	    }		

	    D.o("loaded model");
	    return model;
*/		String ss=filename.substring(0,filename.length()-4);
		D.o("Object name is "+ss);		
		setName(ss);
//		setName((String)s.readObject());
		TreeRoot = new DefaultMutableTreeNode("Root");
/*		Integer NumChild = (Integer)s.readObject();
		D.o("Number of child is "+NumChild);
		for (int i=0; i<NumChild.intValue(); i++) {
			IntentTreeNode ITN = new IntentTreeNode();
			ITN.load(s);
			TreeRoot.add(ITN);
		}	
*/	}


	/** Set the Name of this module */
	public void setName(String N) {
		Name = N;
	}

	/** Get the name of this module */
	public String getName() {
		return Name;
	}

	/** Set the Modified of this module */
	public void setModified(boolean M) {
		Modified = M;
	}

	/** check if this module is Modified and not saved */
	public boolean isModified() {
		return Modified;
	}

	/** Print out the name of this module */
	public String toString() {
		if (Modified)
			return Name + " *";
		return Name;
	}

	/** This return the Module Tree */
	public DefaultMutableTreeNode getTree() {
		return TreeRoot;
	}

	/** This return the Clone of the Module Tree */
	public DefaultMutableTreeNode getCloneTree() {
		return RecurCloneTree(TreeRoot);
	}

	/** This recursively clone the Tree. */
	DefaultMutableTreeNode RecurCloneTree(DefaultMutableTreeNode OriTreeNode) {
		
		if (OriTreeNode == null)
			return null;
			
		DefaultMutableTreeNode NewTreeNode = (DefaultMutableTreeNode)OriTreeNode.clone();
		
		for(int i=0;i<OriTreeNode.getChildCount();i++) {
			DefaultMutableTreeNode TempTreeNode = null;
			TempTreeNode = RecurCloneTree((DefaultMutableTreeNode)OriTreeNode.getChildAt(i));
			if (TempTreeNode != null)
				NewTreeNode.add(TempTreeNode);
		}
		
		return NewTreeNode;
	}

}
