package parser;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import util.Computing;
import convertor.IConvertor;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.LabelType;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.goal;

public abstract class GoalModelLoader implements IConvertor {
	
	protected String getActorName(goal g) {
		actor a = g.getActor();
		String n = "";
		if (a!=null)
			n = "<" + Computing.quotation(a.getName()) + ">::" + n;
		else { // actor must be inherited from the ancestor goals
			goal p = g.getParent();
			while (p!=null) {
				actor pa = p.getActor();
	    		if (pa!=null) {
	    			n = "<" + Computing.quotation(pa.getName()) + ">::" + n;
	    			break;
	    		}
				p = p.getParent();
			}
		}
		return n;
	}

	protected EPackage pe;
	protected EFactory pf;
	protected Hashtable<goal, Integer> goal_ids = new Hashtable<goal, Integer>();
	protected Vector<goal> goals = new Vector<goal>();
	Vector<goal> FS_goals = new Vector<goal>();
	Vector<goal> FD_goals = new Vector<goal>();
	Vector<goal> PS_goals = new Vector<goal>();
	Vector<goal> PD_goals = new Vector<goal>();
	Vector<goal> CF_goals = new Vector<goal>();
	Vector<goal> UN_goals = new Vector<goal>();
	Vector<goal> VAR_goals = new Vector<goal>();
	Hashtable<goal, HashSet<goal>> configurations = new Hashtable<goal, HashSet<goal> >();
	public GoalmodelPackage e = null;
	public GoalmodelFactory f = null;
	
	@SuppressWarnings("unchecked")
	public void generateModel(Resource input, String output_file) {
		ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    		Resource.Factory.Registry.DEFAULT_EXTENSION, 
	    		new XMIResourceFactoryImpl());
	    // Get the URI of the model file.
		File bpel_file = new File(output_file);
		URI uri = URI.createFileURI(bpel_file.getAbsolutePath());		
	    // Create a resource for this file.
	    Resource resource = resourceSet.createResource(uri);
		try {
		    createDocument(pf, input, resource);
		    resource.save(Collections.EMPTY_MAP);
		}
		catch (Exception exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}		
	}

	protected void createDocument(EFactory pf, Resource input, Resource resource) {
	}

	@SuppressWarnings("unchecked")
	public void convert(String filename, String output_file) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GoalmodelPackage.eNS_URI, GoalmodelPackage.eINSTANCE);
		File file = new File(filename);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(filename);		
		Resource resource = resourceSet.getResource(uri, true);
		generateModel(resource, output_file);
	}

	private void add_a_goal(goal root) {
		goal_ids.put(root, goals.size());
		goals.add(root);
		if (root.getLabel() == LabelType.SATISFIED_LITERAL) {
			FS_goals.add(root);
		} else if (root.getLabel() == LabelType.DENIED_LITERAL) {
			FD_goals.add(root);
		} else if (root.getLabel() == LabelType.PARTIALLY_SATISFIED_LITERAL) {
			PS_goals.add(root);
		} else if (root.getLabel() == LabelType.PARTIALLY_DENIED_LITERAL) {
			PD_goals.add(root);
		} else if (root.getLabel() == LabelType.CONFLICT_LITERAL) {
			CF_goals.add(root);
		} else {
			UN_goals.add(root);
		}
	}

	protected Resource resource = null;
	protected void collect_goals() {
		init();
		for (Iterator i = resource.getResourceSet().getAllContents();
	       i.hasNext(); ) {
	    	Object o = i.next();
	    	if (o instanceof goal) {
	    		goal p = (goal) o;
	    		collect_goals(p);
	    	} else if (o instanceof actor) {
	    		actor a = (actor) o;
				EList l = a.getGoals();
	    		for (int j =0; j < l.size(); j++) {
	    			goal root = (goal) l.get(j);
	    			collect_goals(root);
	    		}	    		
	    	}	    	
		}
	}

	private void collect_goals(goal root) {
		add_a_goal(root); 
		EList subgoals = root.getGoal();
		for (int j=0; j < subgoals.size(); j++) {
			goal s = (goal) subgoals.get(j);
			collect_goals(s);
		}
	}

	private void init() {
		goals = new Vector<goal>();
		goal_ids = new Hashtable<goal, Integer>();
		FS_goals = new Vector<goal>();
		FD_goals = new Vector<goal>();
		PS_goals = new Vector<goal>();
		PD_goals = new Vector<goal>();
		CF_goals = new Vector<goal>();
		UN_goals = new Vector<goal>();
	} 
}
