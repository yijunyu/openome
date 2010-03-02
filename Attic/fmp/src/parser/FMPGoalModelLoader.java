package parser;

import java.io.File;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import util.Computing;
import convertor.IConvertor;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.openome_modelPackage;
import edu.toronto.cs.openome_model.Intention;

public abstract class FMPGoalModelLoader implements IConvertor {
	
	protected String getActorName(Intention g) {
		Container a = g.getContainer();
		String n = "";
		if (a!=null)
			n = "<" + Computing.quotation(a.getName()) + ">::" + n;
		else { // actor must be inherited from the ancestor goals
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
		resourceSet.getPackageRegistry().put(openome_modelPackage.eNS_URI, openome_modelPackage.eINSTANCE);
		File file = new File(filename);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(filename);		
		Resource resource = resourceSet.getResource(uri, true);
		generateModel(resource, output_file);
	}

	public static Intention getParent(Intention i) {
		if (i.getParentDecompositions().size()==0)
			return null;
		return ((Decomposition) i.getParentDecompositions().get(0)).getSource();
	} 
}
