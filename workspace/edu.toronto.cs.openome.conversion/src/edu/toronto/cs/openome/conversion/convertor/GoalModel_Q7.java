package edu.toronto.cs.openome.conversion.convertor;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.emf.common.util.URI;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import edu.toronto.cs.openome_model.Agent;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.Position;
import edu.toronto.cs.openome_model.Role;
import edu.toronto.cs.openome_model.Softgoal;
import edu.toronto.cs.openome_model.Task;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil;
import edu.toronto.cs.openome_model.impl.AndDecompositionImpl;
import edu.toronto.cs.openome_model.impl.BreakContributionImpl;
import edu.toronto.cs.openome_model.impl.ContributionImpl;
import edu.toronto.cs.openome_model.impl.DecompositionImpl;
import edu.toronto.cs.openome_model.impl.DependencyImpl;
import edu.toronto.cs.openome_model.impl.HelpContributionImpl;
import edu.toronto.cs.openome_model.impl.HurtContributionImpl;
import edu.toronto.cs.openome_model.impl.IntentionImpl;
import edu.toronto.cs.openome_model.impl.LinkImpl;
import edu.toronto.cs.openome_model.impl.MakeContributionImpl;
import edu.toronto.cs.openome_model.impl.OrDecompositionImpl;

/**
 * Class to convert Diagram Representation of the model to Q7 syntax.
 * @author showzeb
 *
 */

enum State {
	
	START,
	INSIDE_ACTOR,
	INTENTION,
	TASK,
	GOAL,
	SOFTGOAL,
	LINK,
	MAKE,
	CONTRIBUTION,
	HURT,
	BREAK,
	HELP,
	DEPENDENCY,
	OR,
	AND
}
public class GoalModel_Q7 {

	private Diagram diagram;
	private edu.toronto.cs.openome_model.Model model;
	private String sourceFile = "";
	private String targetFile = "";
	private BufferedWriter writer = null;
	private State currentState = State.START;
	private boolean bracketOpen = false;
	private URI uri;
	private ArrayList<Intention> alreadyVisited = new ArrayList<Intention>();
	private XPath xpath;
	
	public GoalModel_Q7 (String sourceFile, String targetFile) {
		this.sourceFile = sourceFile;
		this.targetFile = targetFile;
		initialize();
	}
	
	/**
	 * Initialize the setup, get the Model and Diagram from the source file.
	 */
	private void initialize() {
		
		uri = URI.createFileURI(sourceFile);
		
		Resource resource = new XMIResourceImpl();
		resource.unload();
		resource.setURI(uri);
		try {
			resource.load(null);
			for (Object o : resource.getContents()) {
				if (o instanceof Diagram) {
					diagram = (Diagram) o;
				} else if (o instanceof Model) {
					model = (Model) o;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//XPATH parsing
		parsing();
		
		//Creates target file
		createFile();
		
		for (Intention intention : model.getRoots()) {
			if (!alreadyVisited.contains(intention))
				startProcess(intention, "", false);
		}
		
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void parsing() {
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		try {
			DocumentBuilder builder = domFactory.newDocumentBuilder();
			Document doc = builder.parse(sourceFile);
			
			XPathFactory factory = XPathFactory.newInstance();
			xpath = factory.newXPath();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			
		}
	}
	/**
	 * Write the model to the file.
	 * @param intention
	 * @param fromDecomposition TODO
	 */
	private void startProcess(Intention intention, String recurse, boolean fromDecomposition) {

		//Seperate decomposition and means-end link of intention from the array
		ArrayList<OrDecompositionImpl> meansEnd = new ArrayList<OrDecompositionImpl>();
		ArrayList<AndDecompositionImpl> decompose = new ArrayList<AndDecompositionImpl>();
		for (Decomposition link :  intention.getDecompositionsTo()) {
			if (link instanceof OrDecompositionImpl) {
				meansEnd.add((OrDecompositionImpl) link);
			} else {
				decompose.add((AndDecompositionImpl) link);
			}
		}
		
		//Go through all the intentions that are connected through means-end link
		if (meansEnd.size() > 0) {
			write(recurse + printName(intention));
			write(" { |\n");
			bracketOpen = true;
			for (OrDecompositionImpl link : meansEnd) {
				startProcess(link.getSource(), recurse+"\t", true);
			}
			write(recurse + "}");
			bracketOpen = false;
		}
		
		//Go through all the intentions that are connected through decomposition link
		if (decompose.size() > 0) {
			write(recurse + printName(intention));
			write(" { &\n") ;
			bracketOpen = true;
			for (AndDecompositionImpl link : decompose) {
				startProcess(link.getSource(),recurse+"\t", true);
			}
			write(recurse + "}");
			bracketOpen = false;
		}
		
		//If it has no links then just print name
		if (meansEnd.size() == 0 && decompose.size() == 0 && !(intention instanceof Softgoal) && 
				(intention.getDependencyFrom().size() == 0 || intention.getContributesTo().size() > 0)) {
			write(recurse + printName(intention));
			if (intention.getContributesTo().size() == 0 && intention.getDependencyTo().size() == 0) {
				write("\n");
			}
		}
		
		/// DEpendendcy To => ~ Dependency From
		int size1 = -1;
		int size2 = -1;
		//Check if the intention is contributing to any goal and that goal is automatically assumed to be a softgoal.
		if (intention.getContributesTo().size() > 0) {
			size1 = 0;
			write(" => ");
			for ( Contribution  link : intention.getContributesTo()) {
				//System.out.println(link);
				if (link instanceof MakeContributionImpl) {
					write("++"  +  printName(link.getTarget()) );
				} else if (link instanceof HelpContributionImpl) {
					write("+"  +  printName(link.getTarget()) );
				} else if (link instanceof HurtContributionImpl) {
					write("-" +  printName(link.getTarget()) );
				} else if (link instanceof BreakContributionImpl) {
					write("--"  +  printName(link.getTarget()) );
				} 
				size1++;
				if (size1 < intention.getContributesTo().size())
					write(", ");
				
			}
		} 
		
		//Check for dependency link
		if (intention.getDependencyFrom().size() > 0) {
			size2 = 0;
			if (intention.getContributesTo().size() == 0)
				write(" => ");
			for ( Dependency  link : intention.getDependencyTo()) {
				if (link instanceof DependencyImpl) {
					write("~" + printName((Intention)link.getDependencyFrom()));
					//System.out.println(link);
				}
				size2++;
				if (size2 < intention.getDependencyFrom().size())
					write(", ");
			}
		}
		
		if (size1 >= 0 || size2 >= 0) {
			write("\n");
		}
		
		if ( !(intention.getContributesTo().size() > 0 || intention.getDependencyFrom().size() > 0) && 
				(meansEnd.size() != 0 || decompose.size() != 0)) {
			write("\n");
		}
		//If it is a softgoal then just recurse to its parent goal/task
		if (intention.getContributesFrom().size() > 0) {
			if (fromDecomposition) {
				write(recurse + printName(intention));
				write("\n");
			} else { 
				for (Contribution connectInt : intention.getContributesFrom()) {
					startProcess(connectInt.getSource(), recurse, false);
				}
			}
		}
		
		//If its a goal from dependency recurse to its parent.
		if (intention.getDependencyFrom().size() > 0) {
			if (fromDecomposition) {
				write(recurse + printName(intention));
				write("\n");
			} else { 
				for (Dependency connectInt : intention.getDependencyFrom()) {
					startProcess((Intention)connectInt.getDependencyFrom(), recurse, false);
				}
			}
		}
		
	}
	
	/**
	 * Write the name of the intention in Q7 syntax in the file.
	 * @param intention 
	 */
	private String printName(Intention intention) {
		//Checking for name
		alreadyVisited.add(intention);
		String start = "";
		if (intention.getContainer() != null && !intention.getContainer().getName().startsWith("Aspect"))
			start = "<\"" + actorType(intention) + " " +  intention.getContainer().getName() + "\">::";
		if (intention instanceof Task) {
			return "\"Do " + intention.getName() + "\"";
		} else {
			return start + "\"" + intention.getName() + "\"";
		}
	}
	/**
	 * Return the actor type that is the parent of the intention.
	 * @param intention Child of the actor
	 * @return Type of Actor i.e agent or actor or role
	 */
	private String actorType(Intention intention) {
		if (intention.getContainer() instanceof Agent) {
			return "Agent";
		} else if (intention.getContainer() instanceof Position) {
			return "Position";
		} else if (intention.getContainer() instanceof Role) {
			return "Role";
		} else {
			return "Actor";
		}
	}
	/**
	 * Write the text to the stream.
	 * @param text
	 */
	private void write(String text) {
		try {
			writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Create the targer file with the .q7 extension. Remember to close the buffered stream after writing is done.
	 */
	private void createFile() {
		try {
			FileWriter fstream = new FileWriter(targetFile + ".q7");
			writer = new BufferedWriter(fstream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void modelContents() {
		
		//System.out.println(diagram.getElement());
		System.out.println(model + " " + model.getAllIntentions());
		System.out.println("Roots :" + model.getRoots());
		System.out.println("Leaves :" + model.getLeaves());
	}
}
