package edu.toronto.cs.openome.evaluation.convertor;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.toronto.cs.openome.conversion.parser.GoalModelReader;
import edu.toronto.cs.openome.core.convertor.IConvertor;
import edu.toronto.cs.openome.evaluation.action.Reasoning;

public class Reasoning_GoalModel implements IConvertor {

	public void convert(String input, String output) {
	    GoalModelReader reader = new GoalModelReader();
	    Resource resource = reader.read(input);
		Reasoning r = new Reasoning(resource);
		r.reasoning();
		ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    		Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	    // Get the URI of the model file.
		File result = new File(output);
		URI uri = URI.createFileURI(result.getAbsolutePath());		
		try {
		    resource.save(new FileOutputStream(result), Collections.EMPTY_MAP);
		} catch (Exception exception) {
			System.out.println("Problem saving " + uri);
			exception.printStackTrace();
		}		

	}
}