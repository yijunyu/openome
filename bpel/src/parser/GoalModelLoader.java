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

public abstract class GoalModelLoader extends GoalModelReader implements IConvertor {
	
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
		Resource resource = read(filename);
		generateModel(resource, output_file);
	} 
}
