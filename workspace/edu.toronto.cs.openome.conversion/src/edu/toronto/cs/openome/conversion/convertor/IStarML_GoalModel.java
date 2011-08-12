package edu.toronto.cs.openome.conversion.convertor;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import edu.toronto.cs.openome.conversion.ccistarml.ERelement;
import edu.toronto.cs.openome.conversion.ccistarml.ERelementList;
import edu.toronto.cs.openome.conversion.ccistarml.ccistarmlFile;
import edu.toronto.cs.openome_model.*;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelInitDiagramFileAction;

/**
 * Coverts iStarML representation into OpenOME diagram.
 * 
 * @author showzeb
 * 
 */
public class IStarML_GoalModel implements IObjectActionDelegate {

	private Shell shell;

	private String sourceFile = "";
	private String targetFile = "";
	private openome_modelPackage e = openome_modelPackage.eINSTANCE;
	private openome_modelFactory f = e.getopenome_modelFactory();
	private Resource resource;
	private Model m;
	private ccistarmlFile source;
	private ERelementList erL;
	private ERelement erle;
	private StructuredSelection ts = null;
	private HashMap<ERelement, ERelement> parent;
	private HashMap<String, ERelement> map;
	private HashMap<String, Intention> intentions;
	private HashMap<String, Container> containers;
	private HashMap<String, Link> links;
	private IWorkbenchPart targetPart;

	public IStarML_GoalModel() {
	}

	/**
	 * Load the content of the iStarML file.
	 */
	private void initialize() {
		source = new ccistarmlFile();
		source.loadFile(sourceFile);
		generateGoalModelContent();
	}

	/**
	 * Parse the iStarML file content.
	 */
	private void generateGoalModelContent() {
		source.xmlParser();
		erL = new ERelementList(source.xmlStructure());

		// Store each element in the dictionary "map" with its ID as its k
		// { ID, ERelement}
		LinkedList<ERelement> it = erL.list();
		for (ERelement o : it) {
			map.put(o.ID, o);
			// is_in tag attributes is {parent=ID, child=ID}
			// It tells whose the parent of an element
			// Using a dictionary "parent" to store each element parent ID with
			// that element ID as the key
			if (o.name.equals("is_in")) {
				parent.put(map.get(o.attribute.get("child")), map
						.get(o.attribute.get("parent")));
			}
		}

		int n = 0;
		while (n < it.size()) {
			erle = it.get(n);
			// System.out.println(erle.diagram + "-" + erle.ID + ":" + erle.name
			// + "-->" + erle.attribute);
			if (erle.name.equals("actor")) {
				// method for actor links
				checkActors(erle);
			} else if (erle.name.equals("ielement")) {
				checkIntentions(erle);
				// method for intention links
			} else if (erle.name.equals("is_in")) {
				isIn(erle);
			} else if (erle.name.equals("ielementLink")) {
				checkIntentionLinks(erle);
			} else if (erle.name.equals("actorLink")) {
				checkActorLinks(erle);
			} else if (erle.name.equals("dependee")
					|| erle.name.equals("depender")) {
				checkDependencyLinks(erle);
			}
			n++;
		}
		
		
		// This loop takes care of the links with missing targets.
		// Key is the ID.
		for (String key : links.keySet()) {
			ERelement linkERelement = map.get(key);
			//System.out.println(source + " " + links.size() + " " + key);
			if (linkERelement.name.equals("ielementLink")) {
				//Intention links
				
				if (linkERelement.attribute.get("type").equals("contribution")) {
					ERelement targetERelement = map.get(linkERelement.attribute.get("iref"));
					Contribution link = (Contribution) links.get(linkERelement.ID);
					link.setTarget(intentions.get(targetERelement.ID));
				} else if (linkERelement.attribute.get("type").equals("means-end") || linkERelement.attribute
								.get("type").equals("decomposition")) {
					ERelement target = map.get(linkERelement.attribute.get("iref"));
					Decomposition link = (Decomposition) links.get(linkERelement.ID);
					link.setTarget(intentions.get(target.ID));
				} 
				
			} else if (linkERelement.name.equals("actorLink")) {
				//Association links.
				
				ERelement targetERelement = map.get(linkERelement.attribute.get("aref"));
				Association link = (Association) links.get(linkERelement.ID);
				link.setTarget(containers.get(targetERelement.ID));
			}
		}
	}

	/**
	 * Create the dependency link.
	 * @param link ERlement link tag.
	 */
	private void checkDependencyLinks(ERelement link) {
		Link cont = f.createDependency();
		links.put(link.ID, cont);
	}

	/**
	 * Create the actor link model depending upon its type and value
	 * and add it to the dictionary with link ID as key.
	 * @param link ERlement link tag.
	 */
	private void checkActorLinks(ERelement link) {
		Link cont = null;
		String value = (String) link.attribute.get("type");
		if (value.equalsIgnoreCase("is_a")) {
			cont = f.createIsAAssociation();
		} else if (value.equalsIgnoreCase("is_part_of")) {
			cont = f.createIsPartOfAssociation();
		} else if (value.equalsIgnoreCase("instance_of")) {
			cont = f.createINSAssociation();
		} else if (value.equalsIgnoreCase("plays")) {
			cont = f.createPlaysAssociation();
		} else if (value.equalsIgnoreCase("occupies")) {
			cont = f.createOccupiesAssociation();
		} else if (value.equalsIgnoreCase("covers")) {
			cont = f.createCoversAssociation();
			
		}
		links.put(link.ID, cont);
	}

	/**
	 * Create the intention link model depending upon its type and value
	 * and add it to the dictionary with link ID as key.
	 * @param link ERlement link tag.
	 */
	private void checkIntentionLinks(ERelement link) {
		Link cont = null;
		if (link.attribute.get("type").equals("contribution")) {
			String value = ((String) link.attribute.get("value"));
			if (value.equalsIgnoreCase("make")) {
				cont = f.createMakeContribution();
			} else if (value.equalsIgnoreCase("some+")) {
				cont = f.createSomePlusContribution();
			} else if (value.equalsIgnoreCase("help")) {
				cont = f.createHelpContribution();
			} else if (value.equalsIgnoreCase("unknown")) {
				cont = f.createUnknownContribution();
			} else if (value.equalsIgnoreCase("hurt")) {
				cont = f.createHurtContribution();
			} else if (value.equalsIgnoreCase("some-")) {
				cont = f.createSomeMinusContribution();
			} else if (value.equalsIgnoreCase("break")) {
				cont = f.createBreakContribution();
			}
		} else if (link.attribute.get("type").equals("means-end")) {
			cont = f.createOrDecomposition();
		} else if (link.attribute.get("type").equals("decomposition")) {
			cont = f.createAndDecomposition();
		}

		links.put(link.ID, cont);
	}

	/**
	 * This method takes care of parent-child relationship in the diagram.
	 * @param isin ERelement tag that contains parent and child id as its attribute i.e {parent=ID, child=ID}
	 */
	private void isIn(ERelement isin) {

		Hashtable table = isin.attribute;

		// Get ERelement parent and child
		ERelement parentElement = map.get(isin.attribute.get("parent"));
		ERelement childElement = map.get(isin.attribute.get("child"));

		// Check for intention inside actor. If parent is the boundary tag and child is ielement tag then
		// the intention is inside the actor. There must be an is_in tag before this with parent as actor and
		// child as boundary.
		if (parentElement.name.equals("boundary") && childElement.name.equals("ielement")) {

			// get grandParent (Actor)
			ERelement grandparent = ((ERelement) parent.get(parentElement));

			// Get the corresponding actor and intention
			Container container = containers.get(grandparent.ID);
			Intention intention = intentions.get(childElement.ID);
			intention.setContainer(container);
			container.getIntentions().add(intention);

		} else if (parentElement.name.equals("diagram")
				&& childElement.name.equals("ielement")) { // If intention is not inside an actor, its inside the model. 
			// This should be different if considering different diagram.
			Intention intention = intentions.get(childElement.ID);
			m.getIntentions().add(intention);

		} else if (parentElement.name.equals("ielement")
				&& childElement.name.equals("ielementLink")) { 
			
			// Intention and intention links relationship i.e connect the link with the source intention. 
			// This doesn't take care of the target intention because we might not have parsed the target
			// intention yet.
			Intention intention = intentions.get(parentElement.ID);
			if (childElement.attribute.get("type").equals("contribution")) {
				Contribution link = (Contribution) links.get(childElement.ID);
				link.setSource(intention);
				link.setModel(m);
				m.getContributions().add(link);
			} else if (childElement.attribute.get("type").equals("means-end")
					|| childElement.attribute.get("type").equals(
							"decomposition")) {
				Decomposition link = (Decomposition) links.get(childElement.ID);
				link.setSource(intention);
				link.setModel(m);
				m.getDecompositions().add(link);
			}
			
		} else if (parentElement.name.equals("actor")
				&& childElement.name.equals("actorLink")) { 
			
			// Actor and actor links (association) relationship i.e connect the link with the source actor. 
			// This doesn't take care of the target actor because we might not have parsed the target
			// actor yet.
			Container actor = containers.get(parentElement.ID);
			Association link = (Association) links.get(childElement.ID);
			link.setSource(actor);
			m.getAssociations().add(link);
			
		} else if (parentElement.name.equals("dependency")
				&& childElement.name.equals("dependee")) { 
			
			//With dependency relationship we have {dependency, dependee}, {dependency, depender} and {intention, dependency}
			
			// get grandParent (Intention)
			ERelement grandparent = ((ERelement) parent.get(parentElement));

			// Get the corresponding intention.
			Intention intention = intentions.get(grandparent.ID);
			Dependency dependee = (Dependency) links.get(childElement.ID);
			dependee.setDependencyTo(intention);
			dependee.setDependencyFrom(containers.get(childElement.attribute
					.get("aref")));
			dependee.setModel(m);
			m.getDependencies().add(dependee);

		} else if (parentElement.name.equals("dependency")
				&& childElement.name.equals("depender")) {

			// get grandParent (Intention)
			ERelement grandparent = ((ERelement) parent.get(parentElement));

			// Get the corresponding intention.
			Intention intention = intentions.get(grandparent.ID);
			Dependency depender = (Dependency) links.get(childElement.ID);
			depender.setDependencyFrom(intention);
			depender.setDependencyTo(containers.get(childElement.attribute
					.get("aref")));
			depender.setModel(m);
			m.getDependencies().add(depender);
		}

	}

	/**
	 * Create the Actor model, set its name and add it to the parent model.
	 * 
	 * @param actor
	 *            ERelement type which contains all the required information
	 *            about the Actor actor.
	 */
	private void checkActors(ERelement actor) {
		if (actor.attribute.containsKey("aref")) {
			// Fill this afterwords
		}
		Container act = null;
		if (!actor.attribute.containsKey("type")) { // if it doesn't have the
													// attribute "type" => its
													// just an actor
			act = (Container) f.createActor();
		} else if (actor.attribute.get("type").equals("agent")) {
			act = (Container) f.createAgent();
		} else if (actor.attribute.get("type").equals("role")) {
			act = (Container) f.createRole();
		} else if (actor.attribute.get("type").equals("position")) {
			act = (Container) f.createPosition();
		}

		// Add inside the actor inside the dictionary so that it can be called afterward easily with key as
		// its corresponding ERelement tag ID.
		containers.put((String) actor.ID, act);
		act.setName((String) actor.attribute.get("name"));

		// /Following might change in future;
		act.setModel(m);
		m.getContainers().add(act);
	}

	/**
	 * Create the Intention model and set its name. In this method it's not
	 * added in any parent model i.e Actor or diagram. Method isIn takes care of
	 * that
	 * 
	 * @param intention
	 *            ERelement type which contains all the required information
	 *            about the Intention intention.
	 */
	private void checkIntentions(ERelement intention) {
		if (intention.attribute.containsKey("iref")) {
			// Fill this afterwords
		}

		Intention i = null;

		if (intention.attribute.get("type").equals("goal")) {
			i = (Intention) f.createGoal();
		} else if (intention.attribute.get("type").equals("task")) {
			i = (Intention) f.createTask();
		} else if (intention.attribute.get("type").equals("resource")) {
			i = (Intention) f.createResource();
		} else if (intention.attribute.get("type").equals("softgoal")) {
			i = (Intention) f.createSoftgoal();
		}

		// Add inside the intention inside the dictionary so that it can be called afterward easily with key as
		// its corresponding ERelement tag ID.
		intentions.put((String) intention.ID, i);
		i.setName((String) intention.attribute.get("name"));

	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		parent = new HashMap<ERelement, ERelement>();
		map = new HashMap<String, ERelement>();
		intentions = new HashMap<String, Intention>();
		containers = new HashMap<String, Container>();
		links = new HashMap<String, Link>();

		// System.out.println(((IFile)ts.getFirstElement()).getLocation());
		IFile file = (IFile) ts.getFirstElement();
		String fileLoc = ((IFile) ts.getFirstElement()).getLocation()
				.removeFileExtension().toOSString();
		// System.out.println(file);
		sourceFile = fileLoc + ".istarml";
		targetFile = fileLoc + ".oom";
		m = f.createModel();
		m.setName(targetFile);
		initialize();
		output_to_xmi(file);
		IFile f2 = file.getProject().getFile(
				file.getName().replaceFirst("istarml", "oom"));
		if (f2.exists()) {
			toModel(f2);
		}
	}

	/**
	 * Convert and output the iStarML representation in XMI format.
	 * 
	 * @param f
	 *            Target file IFile f.
	 */
	private void output_to_xmi(IFile f) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		URI uri = URI.createFileURI(targetFile);
		resource = resourceSet.createResource(uri);
		resource.getContents().add(m);
		try {
			resource.save(Collections.EMPTY_MAP);
			resource.unload();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			f.getProject().refreshLocal(2, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		ts = (StructuredSelection) selection;
	}

	/**
	 * Convert and output the XMI representation into diagram representation.
	 * 
	 * @param file
	 *            Target file IFile f.
	 */
	public void toModel(IFile file) {
		Openome_modelInitDiagramFileAction model = new Openome_modelInitDiagramFileAction();
		model.setActivePart(null, targetPart);
		model.setDomainModelURI(file);
		model.run(null);

	}
	
	/**
	 * Prompts the user to either continue with the conversion process or to stop it.
	 * @return true if the user click's yes otherwise false.
	 */
	public boolean messageDialog() {
		Shell shell = new Shell(Display.getCurrent());

		MessageBox messageBox = new MessageBox(shell, SWT.YES | SWT.NO);
		messageBox
				.setMessage("This iStarML file contains elements not supported by OpenOME "
						+ "and will be removed when converted to OpenOME diagram.\nDo you want to continue?");

		int rc = messageBox.open();

		switch (rc) {
		case SWT.YES:
			return true;
		case SWT.NO:
			return false;
		}

		return false;
	}

}
