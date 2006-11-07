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

import convertor.IConvertor;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.goal;
import util.Computing;

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
}
