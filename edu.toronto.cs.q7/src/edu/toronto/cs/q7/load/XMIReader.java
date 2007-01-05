package edu.toronto.cs.q7.load;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.toronto.cs.goalmodel.ContributionType;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.contribution;
import edu.toronto.cs.goalmodel.dependency;
import edu.toronto.cs.goalmodel.goal;
import edu.toronto.cs.util.D;

public class XMIReader {
	private String filename;
	
	public XMIReader(String file) {
		filename = file;
	}
	
	public String outputGoal(goal root, int indent) {
		String output = "";
		String n = "\"" + root.getName() + "\"";
		output = indent(indent) + n;
		DecompositionType t = root.getType();
		if (!t.equals(DecompositionType.LEAF_LITERAL)) {
			output += "{" ;
			if (t == DecompositionType.AND_LITERAL) {
				output += " AND";
//				if (root.getSequential())
				if (root.getSequential().booleanValue())
					output += " ;";
				else
					output += " ||";
			} else {
				output += " OR";
//				if (root.getSystem())
				if (root.getSystem().booleanValue())
					output += " /";
//				if (root.getExclusive())
				if (root.getExclusive().booleanValue())
					output += " |";
			}
			output += "\n";
			EList subgoals = root.getGoal();
			for (int j=0; j < subgoals.size(); j++) {
				goal s = (goal) subgoals.get(j);
				output += outputGoal(s, indent+1) + "\n";
			}
			output += indent(indent) + "}"; 
		}
		EList contributions = root.getRule();
		EList dependencies = root.getDependencyTo();
		if (contributions.size() + dependencies.size() > 0)
			output += "=> ";
		for (int j=0; j < contributions.size(); j++) {
			contribution c = (contribution) contributions.get(j);
			output += shortContributionName(c.getType()) 
				+ getActorName(c.getTarget()) + c.getTarget().getName() 
				+ (j==contributions.size()-1? "":",");
		}
		if (contributions.size()>0 && dependencies.size() > 0)
			output += ",";
		for (int j=0; j < dependencies.size(); j++) {
			dependency d = (dependency) dependencies.get(j);
			goal to = d.getDependencyTo();
			output += "~" 
				+ getActorName(to)
				+ "\"" + to.getName() + "\"" 
				+ (j==dependencies.size()-1? "":",");
		}
		return output;
	}
	
	private String indent(int indent) {
		String s ="";
		for (int i=0; i<indent; i++)
			s+= " ";
		return s;
	}

	private String getActorName(goal g) {
		actor a = g.getActor();
		String n = "";
		if (a!=null)
			n = "<\"" + a.getName() + "\">::" + n;
		else { // actor must be inherited from the ancestor goals
			goal p = g.getParent();
			while (p!=null) {
				actor pa = p.getActor();
	    		if (pa!=null) {
	    			n = "<\"" + pa.getName() + "\">::" + n;
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

	public void read() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GoalmodelPackage.eNS_URI, GoalmodelPackage.eINSTANCE);
		File file = new File(filename);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(filename);		
		File q7_file = new File(filename + ".q7");
		PrintStream os;
		try {
			os = file.isFile() ? new PrintStream(q7_file)
					: System.out;
		} catch (FileNotFoundException e) {
			os = System.out;
		}
		try {
			Resource resource = resourceSet.getResource(uri, true);
		    for (Iterator i = resource.getResourceSet().getAllContents();
	         i.hasNext(); ) {
		    	Object o = i.next();
		    	if (o instanceof goal) {
		    		goal g = (goal) o;
		    		String an = getActorName(g);
		    		if (an.equals("")) { // is a root goal
		    			os.println(outputGoal(g, 0));
		    		}
		    	} else if (o instanceof actor) {
		    		actor a = (actor) o;
	    			String an = "<\"" + a.getName() + "\">";
		    		EList l = a.getGoals();
		    		for (int j =0; j < l.size(); j++) {
		    			goal root = (goal) l.get(j);
		    			String output = outputGoal(root, 0);
		    			os.println(an + "::" + output);
		    		}
		    	}
		    }
		}
		catch (Exception exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}		
	} 
}
