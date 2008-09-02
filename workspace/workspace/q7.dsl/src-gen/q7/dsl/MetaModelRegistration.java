
package q7.dsl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openarchitectureware.workflow.util.ResourceLoaderFactory;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.EclipseResourceLoaderImpl;

public class MetaModelRegistration {
	
    static {
		register();
		loadXtextFile();
	}
	
	@SuppressWarnings("unchecked")
	public static void register() {
		String nsURI = "http://www.example.org/q7/dsl";
		if (EPackage.Registry.INSTANCE.get(nsURI) == null) {
			InputStream in = MetaModelRegistration.class.getResourceAsStream("q7dsl.ecore");
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.createResource(URI.createURI("q7/dsl/q7dsl.ecore"));
			try {
				r.load(in, null);
				EPackage pack = (EPackage) r.getContents().get(0);
				EPackage.Registry.INSTANCE.put(nsURI,pack);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static EPackage getEPackage() {
		return EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/q7/dsl");
	}
	
	public static XtextFile xtextfile;
	
	public static XtextFile getXtextFile() {
		return xtextfile;
	}
	
	private static void loadXtextFile(){
		if (xtextfile == null) {
			try {
			    //intialize xtext mm
			    org.openarchitectureware.xtext.XtextPackage.eINSTANCE.getEFactoryInstance();
				ResourceLoaderFactory
						.setCurrentThreadResourceLoader(new EclipseResourceLoaderImpl(
								MetaModelRegistration.class.getClassLoader()));

				final URL url = ResourceLoaderFactory.createResourceLoader()
						.getResource("q7/dsl/q7dsl.xmi");

				// Get the URI of the model file.
				URI fileURI = URI.createURI(url.toExternalForm());

				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());
				Resource resource = resourceSet.getResource(fileURI, true);

				resource.load(null);
				xtextfile = (XtextFile) resource.getContents().get(0);
			} catch (Exception e) {
				System.out.println("Couldn't load xmi file (q7/dsl/q7dsl.xmi)");
			}
		}
	}
}
