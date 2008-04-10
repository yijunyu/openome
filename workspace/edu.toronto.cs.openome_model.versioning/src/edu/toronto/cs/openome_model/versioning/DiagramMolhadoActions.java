package edu.toronto.cs.openome_model.versioning;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import org.apache.log4j.Level;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.toronto.cs.openome_model.AndDecomposition;
import edu.toronto.cs.openome_model.BreakContribution;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Goal;
import edu.toronto.cs.openome_model.HelpContribution;
import edu.toronto.cs.openome_model.HurtContribution;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.MakeContribution;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.OrDecomposition;
import edu.toronto.cs.openome_model.Softgoal;
import edu.toronto.cs.openome_model.openome_modelFactory;
import edu.toronto.cs.openome_model.openome_modelPackage;
import edu.toronto.cs.openome_model.impl.ModelImpl;

import fluid.ir.IRNode;
import fluid.ir.IRPersistent;
import fluid.version.Version;
import sc.document.Component;
import sc.document.Configuration;
import sc.document.GoalModel;
import sc.document.SCDirectory;

/**
 * Groups common versioning actions and acts as interface to Molhado repository
 * @author Neil
 *
 */
public class DiagramMolhadoActions {

	
	Hashtable<Resource, Configuration> configurations = new Hashtable<Resource, Configuration>();
	private Hashtable<String, Integer> versions = new Hashtable<String, Integer>();
	
	Hashtable<String, Intention> nodes;


	
	private void buildGoalModel(GoalModel gm, Resource resource) {
		Hashtable<Intention, IRNode> table = new Hashtable<Intention, IRNode>();
		tables.put(gm, table);
		IRNode root = gm.createAGoal("VIRTUAL_ROOT", true);
		gm.setRoot(root);
		// the first pass creates nodes
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Intention) {
				Intention i = (Intention) o;
				String name = i.getName();
				IRNode g = gm.createAGoal(name, o instanceof Goal);
				//				if (i.getParentDecompositions().size() == 0) {
				IRNode e = gm.createEdge("virtual");
				gm.connect(root, g, e);
				//				}
				// System.out.println(name + " " + g);
				table.put(i, g);
			}
		}
		// the second pass creates edges
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Contribution) {
				Contribution i = (Contribution) o;
				if (i.getSource() == null || i.getTarget() == null)
					continue;
				String source_name = i.getSource().getName();
				String target_name = i.getTarget().getName();
				String label = "";
				if (o instanceof HelpContribution)
					label = "+";
				if (o instanceof MakeContribution)
					label = "++";
				if (o instanceof HurtContribution)
					label = "-";
				if (o instanceof BreakContribution)
					label = "--";
				IRNode e = gm.createEdge(label);
				IRNode source = table.get(source_name);
				IRNode target = table.get(target_name);
				gm.connect(source, target, e);
				// System.out.println(label);
			}
			if (o instanceof Decomposition) {
				Decomposition i = (Decomposition) o;
				if (i.getSource() == null || i.getTarget() == null)
					continue;
				String source_name = i.getSource().getName();
				String target_name = i.getTarget().getName();
				String label = "";
				if (o instanceof AndDecomposition)
					label = "AND";
				if (o instanceof OrDecomposition)
					label = "OR";
				IRNode e = gm.createEdge(label);
				IRNode source = table.get(source_name);
				IRNode target = table.get(target_name);
				gm.connect(source, target, e);
				// System.out.println(label);
			}
		}
	}

	private void checkInGoalModel(Configuration config, Resource resource) {
		IRNode rootnode = config.getRoot();
		fluid.tree.Tree tree = Configuration.getTree();
		// Create a goal model
		String file_name = get_model_name(resource);
		GoalModel gm = new GoalModel();
		gm.setName(file_name);
		IRNode gm_node = config.newComponent(gm);
		tree.appendChild(rootnode, gm_node);
		buildGoalModel(gm, resource);
		checkin_current_version(config, resource);
		//		System.out.println(versions.get(file_name).intValue());
	}

	private SCDirectory connectToRepository(Resource resource) {
		Configuration.ensureLoaded();
		SCDirectory root = new SCDirectory();
		String model_name = get_model_name(resource);
		root.setName(model_name);
		return root;
	}

	/**
	 * If the model is opened for the first time, it will be assigned version 0
	 * and will be checked in and then checked out before the doSave operation.
	 * Otherwise, the model is assigned a newer version and will then checked
	 * out before the doSave operation.
	 * 
	 * Tien, I don't know if that's correct though: one must assume that the
	 * model can be changed outside the editor! ). Alternatively we may
	 * implement a checkout for an existing goal model Vn rather than parse it
	 * from the EMF file, and such a goal model will be saved to override the v0
	 * model, but it does not work yet :-(
	 * 
	 * @param model_name
	 */
	void checkLatestVersion(Resource resource) {
		org.apache.log4j.Logger.getLogger("IR").setLevel(Level.OFF);
		String model_name = get_model_name(resource);
		String project_name = model_name.substring(0, model_name.indexOf("/", 2));
		String property = System.getProperty("fluid.ir.path");
		if (property == null) {
			String toString = getPluginInstallPath();
			System.setProperty("fluid.ir.path", toString);
			property = System.getProperty("fluid.ir.path");
		}
		try {
			int versionNumber = 0;
			Configuration config = Configuration.loadASCII(new FileReader(
					property + project_name + ".cfg"),
					IRPersistent.fluidFileLocator);
			java.util.Enumeration vs = config.getAllVersionNames();
			while (vs.hasMoreElements()) {
				String v1_name = (String) vs.nextElement();
				//				System.out.println(v1_name.substring(0, v1_name.lastIndexOf("-")));				
				if (v1_name.substring(0, v1_name.lastIndexOf("-")).equals(
						model_name)) {
					versionNumber++;
				}
			}
			update_version(model_name, versionNumber);
			configurations.put(resource, config);
		} catch (Exception e) {
			//			e.printStackTrace();
			SCDirectory project_root = connectToRepository(resource);
			Configuration config = new Configuration(project_name, project_root);
			// create a new goal model and check it in
			//			checkInGoalModel(config, resource);
			configurations.put(resource, config);
			update_version(model_name, 0);
		}
	}

	private String get_model_name(Resource resource) {
		String name = resource.getURI().toString();
		name = name.substring(name.indexOf(":") + 10);
		name = name.substring(0, name.indexOf(".oom"));
		return name;
	}


	private void checkout_version(Configuration config, String v1_name) {
		try {
			Version v1 = config.loadVersionByDelta(v1_name,
					IRPersistent.fluidFileLocator);
			Version.setVersion(v1);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	void checkout_last_version(Configuration config, String model_name) {
		Integer last = versions.get(model_name);
		if (last != null && last.intValue() > 0) {
			String last_version = model_name + "-v" + last.intValue();
			checkout_version(config, last_version);
			Version.bumpVersion(); // Tien: important after check out if one wants to modify the mirror 
		}
	}

	GoalModel find_the_gm(String file_name, Configuration config) {
		GoalModel the_gm = null;
		fluid.tree.Tree tree = Configuration.getTree();
		IRNode rootnode = config.getRoot();
		Enumeration en = tree.depthFirstSearch(rootnode);
		while (en.hasMoreElements()) {
			IRNode node = (IRNode) en.nextElement();
			Component comp = config.getComponent(node);
			if (comp instanceof GoalModel) {
				GoalModel gm = (GoalModel) comp;
				// System.out.println(gm.getName());
				if (gm.getName().equals(file_name)) {
					the_gm = gm;
					break;
				}
			}
		}
		return the_gm;
	}

	private void setGoalModel(GoalModel the_gm, Configuration config) {
		fluid.tree.Tree tree = Configuration.getTree();
		IRNode rootnode = config.getRoot();
		Enumeration en = tree.depthFirstSearch(rootnode);
		while (en.hasMoreElements()) {
			IRNode node = (IRNode) en.nextElement();
			Component comp = config.getComponent(node);
			if (comp instanceof GoalModel) {
				GoalModel gm = (GoalModel) comp;
				// System.out.println(gm.getName());
				if (gm.getName().equals(the_gm.getName())) {
					config.setComponent(node, the_gm);
					break;
				}
			}
		}
	}

	//	/**
	//	 * We need to make sure after checkout, the mapping table between goal names
	//	 * and goals in the GoalModel is updated
	//	 * 
	//	 * @param gm
	//	 */
	//	private void updateIndex(GoalModel gm, IRNode root) {
	//		if (root == null)
	//			return;
	//		String name = gm.getGMNodeName(root);
	//		name = name.substring(name.indexOf("_") + 1);
	//		Hashtable<Intention, IRNode> table = tables.get(gm);
	//		if (table == null) {
	//			table = new Hashtable<Intention, IRNode>();
	//			tables.put(gm, table);
	//		}
	//		table.put(name, root);
	//		int numChildren = gm.graph.numChildren(root);
	//		for (int i = 0; i < numChildren; i++) {
	//			IRNode childnode = gm.graph.getChild(root, i);
	//			updateIndex(gm, childnode);
	//		}
	//	}
	private void update_version(String model_name, int versionNumber) {
		versions.put(model_name, new Integer(versionNumber));
		// System.err.println(model_name + " = " + versionNumber);
	}

	private void incrementVersion(Configuration config, Version v1,
			String model_name) {
		if (versions.get(model_name) == null) {
			update_version(model_name, 0);
		}
		int versionNumber = versions.get(model_name).intValue() + 1;
		update_version(model_name, versionNumber);
		String v1_name = model_name + "-v" + versionNumber;
		config.assignVersionName(v1, v1_name);
		// System.err.println("Saving " + v1_name);
	}

	private void checkin_current_version(Configuration config, Resource resource) {
		Version v1 = Version.getVersion();
		Version.setVersion(v1);
		try {
			String model_name = get_model_name(resource);
			incrementVersion(config, v1, model_name);
			config.saveVersionByDelta(v1, IRPersistent.fluidFileLocator);
			config.storeASCII(new PrintWriter(new BufferedWriter(
					new FileWriter(System.getProperty("fluid.ir.path")
							+ config.getName() + ".cfg"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Get the URI of the file.
	 */
	public static URI fetchURI(String name) {
		File file = new File(name);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath())
				: URI.createURI(name);
		return uri;
	}

	openome_modelPackage e = openome_modelPackage.eINSTANCE;

	openome_modelFactory f = e.getopenome_modelFactory();

	//	/*
	//	 * nodes will be populated
	//	 */
	//	private void traverseGMResourcesForNodes(GoalModel gm, GoalmodelFactory f,
	//			Model m, IRNode root, IRNode edgenode) {
	//		if (root == null)
	//			return;
	//		String name = gm.getGMNodeName(root);
	//		String prefix = name.substring(0, name.indexOf("_"));
	//		name = name.substring(name.indexOf("_") + 1);
	//		Intention g;
	//		if (!name.equals("VIRTUAL_ROOT")) {
	//			if (prefix.equals("HardGoal"))
	//				g = f.createGoal();
	//			else
	//				g = f.createSoftgoal();
	//			g.setName(name);
	//			m.getIntentions().add(g);
	//			nodes.put(name, g);
	//		}
	//		int numChildren = gm.graph.numChildren(root);
	//		for (int i = 0; i < numChildren; i++) {
	//			IRNode childedgenode = gm.graph.getChildEdge(root, i);
	//			IRNode childnode = gm.graph.getChild(root, i);
	//			traverseGMResourcesForNodes(gm, f, m, childnode, childedgenode);
	//		}
	//	}

	private void traverseGMResourcesForNodes(GoalModel gm, openome_modelFactory f,
			Model m, IRNode root, IRNode edgenode) {
		if (root == null)
			return;
		String name = gm.getGMNodeName(root);
		String prefix = name.substring(0, name.indexOf("_"));
		name = name.substring(name.indexOf("_") + 1);
		Intention g;
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode childnode = gm.graph.getChild(root, i);
			name = gm.getGMNodeName(childnode);
			prefix = name.substring(0, name.indexOf("_"));
			name = name.substring(name.indexOf("_") + 1);
			if (prefix.equals("HardGoal"))
				g = f.createGoal();
			else
				g = f.createSoftgoal();
			g.setName(name);
			m.getIntentions().add(g);
			nodes.put(name, g);
		}
	}

	/**
	 * nodes will be used
	 * 
	 * @param gm
	 * @param f
	 * @param m
	 * @param root
	 * @param edgenode
	 */
	private int traverseGMResourcesForEdges(GoalModel gm, openome_modelFactory f,
			Model m, IRNode root) {
		int count = 0;
		int nNode = gm.graph.numChildren(root);
		for (int i = 0; i < nNode; i++) {
			IRNode source = gm.graph.getChild(root, i);
			String sourceName = gm.getGMNodeName(source);
			sourceName = sourceName.substring(sourceName.indexOf("_") + 1);
			Intention sourceGoal = nodes.get(sourceName);
			if (sourceGoal == null)
				continue;
			int nC = gm.graph.numChildren(source);
			for (int j = 0; j < nC; j++) {
				IRNode edge = gm.graph.getChildEdge(source, j);
				IRNode target = gm.graph.getChild(source, j);
				String targetName = gm.getGMNodeName(target);
				targetName = targetName.substring(targetName.indexOf("_") + 1);
				Intention targetGoal = nodes.get(targetName);
				if (targetGoal != null && edge != null) {
					String edgetype = gm.getGMNodeName(edge);
					String pre = edgetype.substring(edgetype.indexOf("_") + 1);
					if (pre.equals("AND")) {
						AndDecomposition d = f.createAndDecomposition();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getDecompositions().add(d);
						count++;
					} else if (pre.equals("OR")) {
						OrDecomposition d = f.createOrDecomposition();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getDecompositions().add(d);
						count++;
					} else if (pre.equals("+")) {
						HelpContribution d = f.createHelpContribution();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getContributions().add(d);
						count++;
					} else if (pre.equals("++")) {
						MakeContribution d = f.createMakeContribution();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getContributions().add(d);
						count++;
					} else if (pre.equals("-")) {
						HurtContribution d = f.createHurtContribution();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getContributions().add(d);
						count++;
					} else if (pre.equals("--")) {
						BreakContribution d = f.createBreakContribution();
						d.setSource(sourceGoal);
						d.setTarget(targetGoal);
						m.getContributions().add(d);
						count++;
					}
				}
			}
		}
		return count;
	}

	private void unparse_checkout_into_emf(Configuration config,
			String v1_name, fluid.tree.Tree project_tree, IRNode project_root) {
		java.util.Enumeration en = project_tree.depthFirstSearch(project_root);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		while (en.hasMoreElements()) {
			IRNode node = (IRNode) en.nextElement();
			Component comp = config.getComponent(node);
			if (comp instanceof GoalModel) {
				GoalModel gm = (GoalModel) comp;
				String name = gm.getName();
				v1_name = v1_name.substring(v1_name.lastIndexOf("-") + 1);
				String model_v1 = name + "-" + v1_name + ".oom";
				URI uri = fetchURI(model_v1);
				Resource resource = resourceSet.createResource(uri);
				Model m = f.createModel();
				try {
					IRNode root = gm.getRoot();
					nodes = new Hashtable<String, Intention>();
					traverseGMResourcesForNodes(gm, f, m, root, null);
					traverseGMResourcesForEdges(gm, f, m, root);
					resource.getContents().add(m);
					resource.save(Collections.EMPTY_MAP);
					resource.unload();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// check out
	void checkOutAllVersionsFromRepository(Configuration config, String model_name) {
		java.util.Enumeration vs = config.getAllVersionNames();
		while (vs.hasMoreElements()) {
			String v1_name = (String) vs.nextElement();
			if (v1_name.substring(0, v1_name.lastIndexOf("-")).equals(model_name)) {
				checkout_version(config, v1_name);
				// Tien: getTree should not be a static method
				fluid.tree.Tree project_tree = config.getTree();
				IRNode project_root = config.getRoot();
				unparse_checkout_into_emf(config, v1_name, project_tree,
						project_root);
			}
		}
	}

	/**
	 * We need to make sure after checkout, the mapping table between goal names
	 * and goals in the GoalModel is updated
	 * 
	 * @param gm
	 */
	private void updateIndex(GoalModel gm, Resource resource) {
		IRNode root = gm.getRoot();
		Hashtable<Intention, IRNode> table = tables.get(gm);
		if (table == null) {
			table = new Hashtable<Intention, IRNode>();
			tables.put(gm, table);
		}
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Intention) {
				Intention i = (Intention) o;
				String name = i.getName();
				IRNode g = gm.createAGoal(name, o instanceof Goal);
				if (i.getParentDecompositions().size() == 0) {
					IRNode e = gm.createEdge("virtual");
					gm.connect(root, g, e);
				}
				table.put(i, g);
			}
		}
	}

	public void checkinCheckoutMolhado(Resource resource) {
		try {
			String model_name = get_model_name(resource);
			checkLatestVersion(resource); // Algorithm 3
			Configuration config = configurations.get(resource);
			checkout_last_version(config, model_name);
			GoalModel the_gm = find_the_gm(model_name, config);
			
			if (the_gm != null) {
				GoalModel.clearCount();
				//				updateIndex(the_gm, the_gm.getRoot());
				//				print_the_gm(the_gm);
				modify_edited_goal_model(the_gm, resource);
				//				setGoalModel(gm, config);
				//				print_the_gm(the_gm);
				checkin_current_version(config, resource);
				System.out.println("Stats for save: " + GoalModel.getCount());
			} else {
				GoalModel.clearCount();
				checkInGoalModel(config, resource);
				update_version(model_name, 1);
				System.out.println("Stats for save: " + GoalModel.getCount());
			}
			checkOutAllVersionsFromRepository(config, model_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void print_the_gm(GoalModel gm) {
		//Hashtable<Intention, IRNode> table = tables.get(gm);
		IRNode root = gm.getRoot();
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			if (g != null) {
				//String name = get_goal_name(gm, g);
				//String type = get_goal_type(gm, g);
				//System.err.println(type + ": " + name);
				print_the_gm(gm, g);
			}
		}
		System.out.println("----------------");
	}

	protected void print_the_gm(GoalModel gm, IRNode root) {
		if (root == null)
			return;
		//Hashtable<Intention, IRNode> table = tables.get(gm);
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			//IRNode edge = (IRNode) gm.graph.getChildEdge(root, i);
			//String name = get_goal_name(gm, g);
			//String type = get_edge_type(gm, edge);
			//System.err.println(get_goal_name(gm, root) + "-" + type + "-> "	+ name);
			print_the_gm(gm, g);
		}
	}

	protected void modify_edited_goal_model(GoalModel gm, Resource resource) {
		Hashtable<Intention, IRNode> table = get_mapping_table(gm);
		IRNode root = mirror_intention_nodes(gm, resource, table);
		mirror_links_to_edges(gm, resource, table, root);
	}

	private void mirror_links_to_edges(GoalModel gm, Resource resource, Hashtable<Intention, IRNode> table, IRNode root) {
		//HashSet<IRNode> alledges = getAllEdges(gm, root); //TODO too friggin recursive!
		
		HashSet<IRNode> existing_edges = new HashSet<IRNode>();
		List<Decomposition> decomps = null;
		List<Contribution> contribs = null; //list of possible relations pulled from the EMF representation
		int count = 0;
		try {
			ModelImpl modelimpl = (ModelImpl) resource.getContents().get(0); //should be instance of "ModelImpl" as top level element
			decomps = (List<Decomposition>) modelimpl.getDecompositions();
			contribs = modelimpl.getContributions();
			int numedges = decomps.size() + contribs.size(); //hacky for ICSE 
			System.err.println("all edges = " + numedges);
		} catch (Exception e) { 
			System.out.println("empty Resource contents");
		}
		for (Contribution c : contribs) { //TODO does the foreach iterator check for null lists?
				Intention s = c.getSource();
				Intention t = c.getTarget();
				if(s == null || t == null) continue;
				IRNode n_s = table.get(s); //source's representation in Molhado
				IRNode n_t = table.get(t);
				if (n_s != null && n_t != null) {
					boolean found = false;
					int numChildren = gm.graph.numChildren(n_s);
					for (int j = 0; j < numChildren; j++) {
						IRNode node = (IRNode) gm.graph.getChild(n_s, j);
						IRNode edge = (IRNode) gm.graph.getChildEdge(n_s, j);
						String type = gm.getGMNodeName(edge);
						if (node == n_t	&& (type.equals("+")&& c instanceof HelpContribution || type.equals("++")&& c instanceof MakeContribution || type.equals("-")
										&& c instanceof HurtContribution || type
										.equals("--")
										&& c instanceof BreakContribution)) { // existing edge
							//							System.out.println("FOUND!");
							found = true;
							existing_edges.add(edge);
							break;
						}
					}
					if (!found) {
						IRNode edge = insert_an_edge(gm, table, c, s, t);
						if (edge != null) existing_edges.add(edge);
						else	count++;
					}
				} else {
					IRNode edge = insert_an_edge(gm, table, c, s, t);
					if (edge != null) existing_edges.add(edge);
					else {
						System.out.println("Not inserted edge: " + s.getName() 	+ " " + t.getName());
						count++;
					}
				}
		}
		for( Decomposition c: decomps) {
			Intention s = c.getSource();
			Intention t = c.getTarget();
			if(s == null || t == null) continue;
			IRNode n_s = table.get(s);
			IRNode n_t = table.get(t);
			if (n_s != null && n_t != null) {
				boolean found = false;
				int numChildren = gm.graph.numChildren(n_s);
				for (int j = 0; j < numChildren; j++) {
					IRNode node = (IRNode) gm.graph.getChild(n_s, j);
					IRNode edge = (IRNode) gm.graph.getChildEdge(n_s, j);
					String type = get_edge_type(gm, edge);
					if (node == n_t
							&& (type.equals("AND")
									&& c instanceof AndDecomposition || type
									.equals("OR")
									&& c instanceof OrDecomposition)) { // existing edge
						found = true;
						existing_edges.add(edge);
						break;
					}
				}
				if (!found) {
					IRNode edge = insert_an_edge(gm, table, c, s, t);
					if (edge != null) {
						existing_edges.add(edge);
					} else {
						count++;
					}
				}
			} else {
				IRNode edge = insert_an_edge(gm, table, c, s, t);
				if (edge != null) {
					existing_edges.add(edge);
				} else {
					count++;
				}
			}
		}
		System.err.println("inserted edges = " + count);
		count = 0;
		/*for (IRNode e : alledges) {
			if (!existing_edges.contains(e)) {
				gm.graph.disconnect(e);
				count++;
			}
		}*/
		System.err.println("deleted edges = " + count);
	}

	protected IRNode mirror_intention_nodes(GoalModel gm, Resource resource,
			Hashtable<Intention, IRNode> table) {
		HashSet<String> set = new HashSet<String>();
		IRNode root = gm.getRoot();
		// rename nodes
		HashSet<IRNode> renamed = new HashSet<IRNode>();
		HashSet<String> to_add = new HashSet<String>();
		Hashtable<String, Boolean> to_add_type = new Hashtable<String, Boolean>();
		rename_mirrored_nodes(gm, resource, table, set, root, renamed, to_add,
				to_add_type);
		add_mirrored_nodes(gm, root, to_add, to_add_type);
		delete_unmirrored_nodes(gm, table, set, root);
		return root;
	}

	protected Hashtable<Intention, IRNode> get_mapping_table(GoalModel gm) {
		Hashtable<Intention, IRNode> table = tables.get(gm);
		if (table == null) {
			table = new Hashtable<Intention, IRNode>();
			tables.put(gm, table);
		}
		return table;
	}

	protected void rename_mirrored_nodes(GoalModel gm, Resource resource,
			Hashtable<Intention, IRNode> table, HashSet<String> set,
			IRNode root, HashSet<IRNode> renamed, HashSet<String> to_add,
			Hashtable<String, Boolean> to_add_type) {
		for (TreeIterator r = resource.getAllContents(); r.hasNext();) {
			Object o = r.next();
			if (o instanceof Intention) {
				Intention i = (Intention) o;
				// origin analysis first for renaming operation:
				// YY: if the table is still inside memory, chances are the element is still live in memory
				//     thus can be found by it's object id
				boolean origin_found = false;
				IRNode g = table.get(i);
				if (g != null) {
					String name = get_goal_name(gm, g);
					set.add(name);
					if (!name.equals(i.getName())) {
						if (i instanceof Goal)
							gm.setHardGoalName(g, i.getName());
						else if (i instanceof Softgoal) {
							gm.setSoftGoalName(g, i.getName());
						}
						renamed.add(g);
						table.remove(name);
						table.put(i, g);
						continue;
					}
				} else {
					String name = i.getName();
					// fixing origin
					int numChildren = gm.graph.numChildren(root);
					Boolean found = false;
					for (int j = 0; j < numChildren; j++) {
						IRNode g1 = (IRNode) gm.graph.getChild(root, j);
						String name1 = get_goal_name(gm, g1);
						if (name.equals(name1)) {
							found = true;
							table.put(i, g1);
							break;
						}
					}
					if (!found) { // really new nodes 
						to_add.add(name);
						to_add_type.put(name, i instanceof Goal);
					}
					set.add(name);
				}
			}
		}
		System.err.println("renamed size= " + renamed.size());
	}

	protected void add_mirrored_nodes(GoalModel gm, IRNode root,
			HashSet<String> to_add, Hashtable<String, Boolean> to_add_type) {
		System.err.println("added size= " + to_add.size());
		for (String name : to_add) {
			Boolean is_hardgoal = to_add_type.get(name);
			IRNode g = gm.createAGoal(name, is_hardgoal);
			IRNode vedge = gm.createEdge("virtual");
			gm.connect(root, g, vedge);
			//System.out.println("add " + (is_hardgoal ? "Goal" : "Softgoal") + ":" + name);
			//			System.err.println("added name: " + name);
		}
	}

	protected void delete_unmirrored_nodes(GoalModel gm,
			Hashtable<Intention, IRNode> table, HashSet<String> set, IRNode root) {
		// really old nodes removed from table
		HashSet<IRNode> delete = new HashSet<IRNode>();
		//		System.err.println("renamed and added names: " + set.size());			
		//		for (String name: set) {
		//			System.err.println("name to compare: " + name);			
		//		}
		int numChildren = gm.graph.numChildren(root);
		for (int i = 0; i < numChildren; i++) {
			IRNode g = (IRNode) gm.graph.getChild(root, i);
			String name = get_goal_name(gm, g);
			String type = get_goal_type(gm, g);
			//			System.err.println("compare name: " + name);
			if (!set.contains(name)) {
				//System.out.println("delete " + (type + ":" + name));
				delete.add(g);
			}
		}
		System.err.println("deleted size= " + delete.size());
		for (IRNode g : delete) {
			gm.graph.removeNode(g);
			table.remove(g);
		}
	}

	/**
	 * Causes stack overflow on large models
	 * due to recursive calls
	 * Neil moved outside loop
	 */	
	private HashSet<IRNode> getAllEdges(GoalModel gm, IRNode root) {
		HashSet<IRNode> alledges = new HashSet<IRNode>();
		set = new HashSet<IRNode>();
		int numChildren;
		numChildren = gm.graph.numChildren(root);
		for (int j = 0; j < numChildren; j++) {
			IRNode g = gm.graph.getChild(root, j);
			alledges.addAll(allEdges(gm, g));
			set.clear();
		}
		return alledges;
	}
	
	HashSet<IRNode> set;
	
	private HashSet<IRNode> allEdges(GoalModel gm, IRNode root) {
		int numChildren = gm.graph.numChildren(root);
		for (int j = 0; j < numChildren; j++) {
			IRNode e = gm.graph.getChildEdge(root, j);
			set.add(e);
			IRNode g = gm.graph.getChild(root, j);
			set.addAll(allEdges(gm, g));
		}
		return set;
	}

	/** 
	 * replaces old method that used recursion
	 * @param gm
	 * @param root
	 * @return
	 */
	/*TODO finish this 
	 * private HashSet<IRNode> getAllEdgesStack(GoalModel gm, IRNode root) {
		HashSet<IRNode> alledges = new HashSet<IRNode>();
		Stack<IRNode> st = new Stack<IRNode>(); //the stack
		int numChildren = gm.graph.numChildren(root);
		for(int i = 0; i < numChildren; i++ ){
			st.push(gm.graph.getChild(root,i)); //add all children to the stack
		}
		IRNode g = st.pop(); //get first child
		//this for loop is the non-base case operation ... collect this nodes child edges
		for (int j = 0; j < numChildren; j++) {
			alledges.add(gm.graph.getChildEdge(g, j));
		}
		while( g != null) {
			if(gm.graph.hasChildren(g)) {
				if(g has a next sibling)
					st.push(g's next sibling);
			} else {
				get next sibling
				if next sibling is null and stack is full
				g = st.pop(); 
			}
		}			
		return alledges;
	}*/

	protected String get_goal_name(GoalModel gm, IRNode g) {
		if (g == null)
			return null;
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(0, name.indexOf("_"));
		name = name.substring(name.indexOf("_") + 1);
		return name;
	}

	protected String get_goal_type(GoalModel gm, IRNode g) {
		if (g == null)
			return null;
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(0, name.indexOf("_"));
		return prefix;
	}

	protected String get_edge_type(GoalModel gm, IRNode g) {
		String name = gm.getGMNodeName(g);
		String prefix = name.substring(name.indexOf("_") + 1);
		return prefix;
	}

	//	private void insert_existing_edge(GoalModel gm, Hashtable<Intention, IRNode> table2, GoalModel gm2, Intention s, Intention t, String type) {
	//		IRNode new_s = table2.get(s);
	//		IRNode new_t = table2.get(t);
	//		IRNode new_e = gm.createEdge(type);
	//		gm2.graph.connect(new_e, new_s, new_t);
	//	}
	private IRNode insert_an_edge(GoalModel gm,
			Hashtable<Intention, IRNode> table, Contribution c, Intention s,
			Intention t) {
		String type = get_label_from_type(c);
		IRNode edge = find_an_edge(gm, table, type, s, t);
		if (edge == null) {
			IRNode new_e = gm.createEdge(type);
			if (table.get(s) != null && table.get(t) != null) {
				gm.graph.connect(new_e, table.get(s), table.get(t));
				edge = new_e;
			}
		}
		return edge;
	}

	private String get_label_from_type(Contribution c) {
		String type = "+";
		if (c instanceof MakeContribution)
			type = "++";
		else if (c instanceof HurtContribution)
			type = "-";
		else if (c instanceof BreakContribution)
			type = "--";
		return type;
	}

	private IRNode insert_an_edge(GoalModel gm,
			Hashtable<Intention, IRNode> table, Decomposition c, Intention s,
			Intention t) {
		String type = get_label_from_type(c);
		IRNode edge = find_an_edge(gm, table, type, s, t);
		if (edge == null) {
			IRNode new_e = gm.createEdge(type);
			if (table.get(s) != null && table.get(t) != null) {
				gm.graph.connect(new_e, table.get(s), table.get(t));
				//				System.out.println("+ edge: " + s.getName() + ", " + t.getName());
				edge = new_e;
			}
		}
		return edge;
	}

	private IRNode find_an_edge(GoalModel gm,
			Hashtable<Intention, IRNode> table, String type, Intention s,
			Intention t) {
		IRNode edge = null;
		IRNode new_s = table.get(s);
		IRNode new_t = table.get(t);
		if (new_s == null || new_t == null) {
			IRNode root = gm.getRoot();
			int n = gm.graph.numChildren(root);
			for (int i = 0; i < n; i++) {
				IRNode g = gm.graph.getChild(root, i);
				String name = get_goal_name(gm, g);
				if (name.equals(s.getName())) {
					table.put(s, g);
					new_s = g;
				}
				if (name.equals(t.getName())) {
					table.put(t, g);
					new_t = g;
				}
			}
		}
		if (new_s != null && new_t != null) {
			int n = gm.graph.numChildren(new_s);
			for (int i = 0; i < n; i++) {
				IRNode g = gm.graph.getChild(new_s, i);
				IRNode e = gm.graph.getChildEdge(new_s, i);
				String lbl = get_edge_type(gm, e);
				if (g == new_t && type.equals(lbl)) {
					edge = e;
					break;
				}
			}
		}
		return edge;
	}

	private String get_label_from_type(Decomposition c) {
		String type = "AND";
		if (c instanceof OrDecomposition)
			type = "OR";
		return type;
	}

//	private IRNode add_mapping_if_not_in_table(GoalModel gm,
//			Hashtable<Intention, IRNode> table, Intention s, IRNode new_s) {
//		return new_s;
//	}
}
