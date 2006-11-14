package parser;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import util.Computing;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.goal;

public class GoalModelReader {
	
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

	@SuppressWarnings("unchecked")
	public Resource read(String filename) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GoalmodelPackage.eNS_URI, GoalmodelPackage.eINSTANCE);
		File file = new File(filename);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(filename);		
		return resourceSet.getResource(uri, true);
	} 
}
