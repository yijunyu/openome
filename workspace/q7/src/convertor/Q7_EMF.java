package convertor;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.example.dsl.parser.ParserComponent;
import org.openarchitectureware.type.emf.EmfMetaModel;
import org.osgi.framework.Bundle;

public class Q7_EMF implements IConvertor {
	public void convert(String input, String output) {
		String ecore = copy_ecore_model("q7/q7dsl.ecore");
		save_model(ecore, input, output);
	}
	
	public static void main(String args[]) {
		save_model("model/q7dsl.ecore", "samples/example.q7", "samples/example.q7.dsl");
	}
	
	public static void save_model(String metamodel, String model, String output) {
		ParserComponent pc = new ParserComponent();
		EmfMetaModel mm = new EmfMetaModel();
		mm.setMetaModelFile(metamodel);
		pc.addMetaModel(mm);
		Object o;
		try {
			o = pc.parse(new FileReader(new File(model)));
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
					Resource.Factory.Registry.DEFAULT_EXTENSION, 
					new XMIResourceFactoryImpl());
//			resourceSet.getPackageRegistry().put(Q7dslPackage.eNS_URI, Q7dslPackage.eINSTANCE);
			Resource resource = resourceSet.createResource(URI.createFileURI(output));
			resource.getContents().add(o);
			resource.save(Collections.EMPTY_MAP);
			resource.unload();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private static String copy_ecore_model(String output) {
		try {
		IWorkspace w = ResourcesPlugin.getWorkspace();
		IProject project = w.getRoot().getProject("Examples");
		if (project==null) return null;
		Bundle bundle = Platform.getBundle("q7.dsl");
		String filename = "/src-gen/org/example/dsl/q7dsl.ecore";
		String name = output;
		InputStream stream;
		try {
			stream = FileLocator.openStream(bundle, 
					new Path(filename), false);
			IFile file = project.getFile(name);
			if (!file.exists())
				file.create(stream, false, null);
			stream.close();		
			return file.getLocation().toOSString();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		} catch (Exception e) { e.printStackTrace();}
		return null;
	}
}