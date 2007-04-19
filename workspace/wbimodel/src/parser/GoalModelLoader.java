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
import edu.toronto.cs.goalmodel.ConflictLabel;
import edu.toronto.cs.goalmodel.Container;
import edu.toronto.cs.goalmodel.Decomposition;
import edu.toronto.cs.goalmodel.DeniedLabel;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Intention;
import edu.toronto.cs.goalmodel.PartiallyDeniedLabel;
import edu.toronto.cs.goalmodel.PartiallySatisfiedLabel;
import edu.toronto.cs.goalmodel.SatisfiedLabel;

public abstract class GoalModelLoader implements IConvertor {
	
	protected String getActorName(Intention g) {
		Container a = g.getContainer();
		String n = "";
		if (a!=null)
			n = "<" + Computing.quotation(a.getName()) + ">::" + n;
		else { // actor must be inherited from the ancestor Intentions
			Intention p = getParent(g);
			while (p!=null) {
				Container pa = p.getContainer();
	    		if (pa!=null) {
	    			n = "<" + Computing.quotation(pa.getName()) + ">::" + n;
	    			break;
	    		}
				p = getParent(p);
			}
		}
		return n;
	}

	protected EPackage pe;
	protected EFactory pf;
	protected Hashtable<Intention, Integer> Intention_ids = new Hashtable<Intention, Integer>();
	protected Vector<Intention> Intentions = new Vector<Intention>();
	Vector<Intention> FS_Intentions = new Vector<Intention>();
	Vector<Intention> FD_Intentions = new Vector<Intention>();
	Vector<Intention> PS_Intentions = new Vector<Intention>();
	Vector<Intention> PD_Intentions = new Vector<Intention>();
	Vector<Intention> CF_Intentions = new Vector<Intention>();
	Vector<Intention> UN_Intentions = new Vector<Intention>();
	Vector<Intention> VAR_Intentions = new Vector<Intention>();
	Hashtable<Intention, HashSet<Intention>> configurations = new Hashtable<Intention, HashSet<Intention> >();
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

	private void add_a_Intention(Intention root) {
		Intention_ids.put(root, Intentions.size());
		Intentions.add(root);
		if (root.getLabel() instanceof SatisfiedLabel ) {
			FS_Intentions.add(root);
		} else if (root.getLabel() instanceof DeniedLabel ) {
			FD_Intentions.add(root);
		} else if (root.getLabel() instanceof PartiallySatisfiedLabel) {
			PS_Intentions.add(root);
		} else if (root.getLabel() instanceof PartiallyDeniedLabel) {
			PD_Intentions.add(root);
		} else if (root.getLabel() instanceof ConflictLabel) {
			CF_Intentions.add(root);
		} else {
			UN_Intentions.add(root);
		}
	}

	protected Resource resource = null;
	protected void collect_Intentions() {
		init();
		for (Iterator i = resource.getResourceSet().getAllContents();
	       i.hasNext(); ) {
	    	Object o = i.next();
	    	if (o instanceof Intention) {
	    		Intention p = (Intention) o;
	    		collect_Intentions(p);
	    	} else if (o instanceof Container) {
	    		Container a = (Container) o;
				EList l = a.getIntentions();
	    		for (int j =0; j < l.size(); j++) {
	    			Intention root = (Intention) l.get(j);
	    			collect_Intentions(root);
	    		}	    		
	    	}	    	
		}
	}

	private void collect_Intentions(Intention root) {
		add_a_Intention(root); 
		EList subIntentions = root.getDecompositions();
		for (int j=0; j < subIntentions.size(); j++) {
			Intention s = ((Decomposition) subIntentions.get(j)).getTarget();
			collect_Intentions(s);
		}
	}

	private void init() {
		Intentions = new Vector<Intention>();
		Intention_ids = new Hashtable<Intention, Integer>();
		FS_Intentions = new Vector<Intention>();
		FD_Intentions = new Vector<Intention>();
		PS_Intentions = new Vector<Intention>();
		PD_Intentions = new Vector<Intention>();
		CF_Intentions = new Vector<Intention>();
		UN_Intentions = new Vector<Intention>();
	} 
	public static Intention getParent(Intention i) {
		if (i.getParentDecompositions().size()==0)
			return null;
		return ((Decomposition) i.getParentDecompositions().get(0)).getSource();
	} 
}
