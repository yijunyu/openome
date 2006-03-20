package edu.toronto.cs.q7.load;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xmlsoap.schemas.ws._2003._03.business.process.DocumentRoot;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessFactory;
import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TFlow;
import org.xmlsoap.schemas.ws._2003._03.business.process.TProcess;
import org.xmlsoap.schemas.ws._2003._03.business.process.TSequence;

import edu.toronto.cs.goalmodel.ContributionType;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.contribution;
import edu.toronto.cs.goalmodel.dependency;
import edu.toronto.cs.goalmodel.goal;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;

public class BPELConvertor {
	private String filename;
	private String output_file;
	
	public BPELConvertor(String file, String out) {
		filename = file;
		output_file = out;
	}
	
	public void outputGoal(ProcessFactory pf, 
			EObject r, goal root, int indent) {
		String n = root.getName();
		TProcess p = pf.createTProcess();
		if (indent==0) { // is root
			((DocumentRoot) r).setProcess(p);
			p.setName(n);
		}
		DecompositionType t = root.getType();
		if (!t.equals(DecompositionType.LEAF_LITERAL)) {
			if (t == DecompositionType.AND_LITERAL) {
				if (root.getSequential().booleanValue()) {
					TSequence ts = pf.createTSequence();
					if (indent==0) {
						((TProcess) p).setSequence(ts);
					}
				} else {
					TFlow tf = pf.createTFlow();
					if (indent==0) {
						((TProcess) p).setFlow(tf);
					}
				}
			} else {
//				output += " OR";
				if (root.getSystem().booleanValue())
//					output += " /";
					;
				if (root.getExclusive().booleanValue())
//					output += " |";
					;
			}
			EList subgoals = root.getGoal();
			for (int j=0; j < subgoals.size(); j++) {
				goal s = (goal) subgoals.get(j);
				outputGoal(pf, r, s, indent+1);
			}
		}
		EList contributions = root.getRule();
		EList dependencies = root.getDependencyTo();
		for (int j=0; j < contributions.size(); j++) {
			contribution c = (contribution) contributions.get(j);
//			output += shortContributionName(c.getType()) 
//				+ getActorName(c.getTarget()) + c.getTarget().getName() 
//				+ (j==contributions.size()-1? "":",");
		}
		for (int j=0; j < dependencies.size(); j++) {
			dependency d = (dependency) dependencies.get(j);
			goal to = d.getDependencyTo();
//			output += "~" 
//				+ getActorName(to)
//				+ Computing.quotation(to.getName()) 
//				+ (j==dependencies.size()-1? "":",");
		}
	}
	
	private String getActorName(goal g) {
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

	private String shortContributionName(ContributionType type) {
		switch (type.getValue()) {
		case ContributionType.HELP:
			return "+";
		case ContributionType.HURT:
			return "-";
		case ContributionType.BREAK:
			return "--";
		case ContributionType.MAKE:
			return "++";
		}
		return null;
	}
	

	public void generateProcessModel(Resource input) {
		ProcessPackage pe = ProcessPackage.eINSTANCE;
		ProcessFactory pf = pe.getProcessFactory();
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
			DocumentRoot r = pf.createDocumentRoot();
			resource.getContents().add(r);
		    for (Iterator i = input.getResourceSet().getAllContents();
	         i.hasNext(); ) {
		    	Object o = i.next();
		    	if (o instanceof goal) {
		    		goal g = (goal) o;
		    		String an = getActorName(g);
		    		if (an.equals("") && g.getParent() == null) { // is a root goal
		    			outputGoal(pf, r, g, 0);
		    		}
		    	} else if (o instanceof actor) {
		    		actor a = (actor) o;
	    			String an = "<" + Computing.quotation(a.getName()) + ">";
		    		EList l = a.getGoals();
		    		for (int j =0; j < l.size(); j++) {
		    			goal root = (goal) l.get(j);
		    			outputGoal(pf, r, root, 0);
		    		}
		    	}
		    }
		    resource.save(Collections.EMPTY_MAP);
		}
		catch (Exception exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}		
	}

	public void convert() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GoalmodelPackage.eNS_URI, GoalmodelPackage.eINSTANCE);
		File file = new File(filename);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(filename);		
		Resource resource = resourceSet.getResource(uri, true);
		generateProcessModel(resource);
	} 
}
