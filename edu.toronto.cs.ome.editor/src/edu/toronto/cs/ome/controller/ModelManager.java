/*
 * ModelManager.java
 * 
 * created Sept 1998 by Joseph Makuch
 * 
 * copyright.
 */
package edu.toronto.cs.ome.controller;

import it.unitn.goal_analysis.graph_creation.ContinuousRelType;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.swing.JOptionPane;
import javax.swing.ProgressMonitor;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import jtelos.Attribute;
import jtelos.Individual;
import jtelos.KB;
import jtelos.Proposition;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.specs.ISolver;

import com.ibm.wbim.bom.schema1.ModelType;

import att.grappa.Graph;

import edu.toronto.cs.goalmodel.ContributionType;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.contribution;
import edu.toronto.cs.goalmodel.goal;
import edu.toronto.cs.goalmodel.impl.GoalmodelFactoryImpl;
import edu.toronto.cs.ome.OMETab;
import edu.toronto.cs.ome.model.KBManager;
import edu.toronto.cs.ome.model.OMEElement;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.model.TelosElement;
import edu.toronto.cs.ome.model.TelosFramework;
import edu.toronto.cs.ome.model.TelosModel;
import edu.toronto.cs.ome.model.TelosObject;
import edu.toronto.cs.ome.model.TelosViewSerializer;
import edu.toronto.cs.ome.view.GraphicView;
import edu.toronto.cs.ome.view.GraphicViewFrame;
import edu.toronto.cs.ome.view.GraphicViewObject;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewManager;
import edu.toronto.cs.ome.view.ViewObject;
import edu.toronto.cs.q7.codegen.FeatureCodeGenerator;
import edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator;
import edu.toronto.cs.q7.codegen.TelosCodeGenerator;
import edu.toronto.cs.q7.codegen.XMLCodeGenerator;
import edu.toronto.cs.q7.model.IStarElement;
import edu.toronto.cs.q7.model.IStarLink;
import edu.toronto.cs.q7.parser.Q7;
import edu.toronto.cs.telos.TelosAttribute;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.telos.TelosParserKB;
import edu.toronto.cs.telos.TelosReal;
import edu.toronto.cs.telos.TelosString;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;
import edu.toronto.cs.util.SortArrayList;
import edu.toronto.cs.wbimodel.test;

/**
 * ModelManager is used to create, load and save models and thier views. This
 * class should also act as a builder for Telos models. ModelManager also
 * maintains the KBmanager, and the mappings from models to ViewManagers and
 * KBmanagers.
 */
public class ModelManager {
//	private static final Logger LOG = Logger.getLogger("edu.toronto.cs.ome.controller.ModelManager");
	Map models2vms;

	Map models2kbs;

	Map models2plugins;

	KBManager kbm;

	Collection pluginclasses;

	// static final String FW_DIR = "frameworks";
	public static String FW_DIR = System.getProperty("java.library.path");

	static final String OME_DIR = "edu.toronto.cs.ome";

	static final String OME_DIR_SEPARATOR = "edu/toronto/cs/ome/";

	static final String PLUGIN_DIR = "edu.toronto.cs.ome.plugins";

	static final String PLUGIN_DIR_SEPARATOR = "edu/toronto/cs/ome/plugins/";

	static final String FW_SUFFIX = ".tel";

	static final String PLUGIN_SUFFIX = ".class";

	public static String OME_PLUGIN_JAR = System
			.getProperty("java.library.path")
			+ File.separator + "../../../ome4eclipse.jar";

	/** Creates a new, empty ModelManager. */
	public ModelManager(OMETab protege) {
		models2vms = new HashMap();
		models2kbs = new HashMap();
		models2plugins = new HashMap();
		kbm = new KBManager();
		this.protege = protege;
	}

	static Class LoadClassEntryFromJar(String classname, String dir_prefix,
			String dir_path) {
		Class c = null;
		File jarFile = new File(OME_PLUGIN_JAR);
		URL urlA;
		try {
			urlA = jarFile.toURL();
			URL[] urls = { urlA };
			URLClassLoader ulc = new URLClassLoader(urls);
			JarFile jar = new JarFile(jarFile);
			for (Enumeration entries = jar.entries(); entries.hasMoreElements();) {
				JarEntry entry = (JarEntry) entries.nextElement();
				String name = entry.getName();
				String subname = name.substring(dir_prefix.length() + 1, name
						.length()
						- PLUGIN_SUFFIX.length());
				String loadname = dir_prefix + "." + classname;
				D.o(loadname);
				if (classname.equals(subname)) {
					c = Class.forName(loadname, true, ulc);
				}
			}
		} catch (MalformedURLException e) {
			D.o("Malformed URL");
		} catch (IOException e) {
			D.o("IO error");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			D.o("Class not found");
		}
		return c;
	}

	/**
	 * We walk the plugin directory pulling all the classes that implement the
	 * OMEPlugin interface. Yijun Yu: I assume all plugin classes are in a JAR
	 * file
	 */
	private Iterator getAllPlugins() {
		if (pluginclasses == null) {
			pluginclasses = new Vector();
			try {
				// OME_PLUGIN_JAR must be in the classpath
				File jarFile;
				jarFile = new File(OME_PLUGIN_JAR);
				JarFile jar = null;
				try {
					jar = new JarFile(jarFile);
				} catch (java.util.zip.ZipException e) {
				}
				if (jar == null)
					D.o(jarFile.getAbsolutePath());
				else
					for (Enumeration entries = jar.entries(); entries
							.hasMoreElements();) {
						JarEntry entry = (JarEntry) entries.nextElement();
						String name = entry.getName();
						if (name.startsWith(PLUGIN_DIR_SEPARATOR)
								&& name.endsWith(PLUGIN_SUFFIX)) {
							// this don't work for inner classes, but they`ll
							// get
							// loaded fine when they're needed.
							String cn = null;
							cn = PLUGIN_DIR
									+ "."
									+ name.substring(PLUGIN_DIR.length() + 1,
											name.length()
													- PLUGIN_SUFFIX.length());
//							LOG.info(name);
							Class c = Class.forName(cn);
							Class interfaces[] = c.getInterfaces();
							for (int j = 0; j < interfaces.length; j++) {
								if (interfaces[j].equals(OMEPlugin.class)) {
									pluginclasses.add(c);
								}
							}
						}
					}
			} catch (Exception e) {
//				e.printStackTrace();
			}
		}
		return pluginclasses.iterator();
	}

	/** Adds an entry into our table of models to compatible plugins. */
	private void initializePlugins(View view) throws Exception {
		Iterator i = getAllPlugins();
		OMEModel model = view.getModel();
		Class omemodelclassparm[] = { OMEModel.class };
		Object modelinvokeparm[] = { model };
		Object modelconstructparm[] = { model };
		Collection ll = new LinkedList();
		// we always have this one.
		ll.add(new OMEDefaultPlugin(view));
		while (i.hasNext()) {
			// for each class, ask it if it is compatible with this model. If
			// so then make one for the model.
			Class pc = (Class) i.next();
			Method m = null;
			Constructor c = null;
			try {
				m = pc.getMethod("isCompatibleWith", omemodelclassparm);
				c = pc.getConstructor(omemodelclassparm);
			} catch (Exception e) {
				D.o("Exception querrying plugin, method \"isCompatibleWith\""
						+ " not found: " + e);
			}
			if (c != null) {
				// D.o("testing: " + pc.getName());
				Boolean b = (Boolean) m.invoke(null, modelinvokeparm);
				if (b.booleanValue()) {
					// D.o("Adding plugin: " + pc.getName());
					ll.add(c.newInstance(modelconstructparm));
				}
			}
		}
		models2plugins.put(model, ll);
		
	}

	/** Returns an iterator over the models extant. */
	public Iterator getModels() {
		return models2vms.keySet().iterator();
	}

	/**
	 * returns the plugins that consider themselves compatible with this model.
	 */
	public Collection getPlugins(OMEModel model) {
		return (Collection) models2plugins.get(model);
	}

	public KB kb = null;

	/**
	 * Creates a model and ViewManager from a path.
	 * 
	 * TODO open a model file from a network URL
	 * @param modelfile
	 *            the file to be loaded
	 */
	public OMEModel openModel(String modelfile) {
//		boolean is_file = true;
//		try {
//			java.net.URI u = new java.net.URI(modelfile);
//			if (u!=null)
//				is_file = false;
//		} catch (URISyntaxException e1) {
//			e1.printStackTrace();
//		}
//		D.o(modelfile + " is a file? " + is_file);
		File f = new File(modelfile);
		D.o(f.toURI());
		while (!modelfile.substring(modelfile.lastIndexOf(".") + 1)
				.equalsIgnoreCase("tel")) {
			f = ModelManager.apply_xslt(f);
			modelfile = f.getAbsolutePath();
		}
		try {
			kb = kbm.createKB();// this kb is now TelosParserKB
			kb.fileTELL(modelfile);
			TelosFramework tfw = new TelosFramework(kb);
			OMEModel model = new TelosModel(kb, tfw, this);
			ViewManager vm = model.getViewManager();
			models2vms.put(model, vm);
			models2kbs.put(model, kb);
			model.load(); // NOTE: loading the model does much of the work
			// restore the views:
			Iterator i = vm.getViews();
			while (i.hasNext()) {
				View view = (View) i.next();
				// involved in restoring the views work for all views.
				initializePlugins(view);
				TelosViewSerializer s = new TelosViewSerializer(view.getID(),
						kb);
				view.load(s);
				straighten_all_links(view);
			}
			return model;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * straighten all links
	 * 
	 * @param view
	 */
	private void straighten_all_links(View view) {
		view.setStraighten(true);
		Iterator j = view.getAllLinks().iterator();
		while (j.hasNext()) {
			ViewObject vo = (ViewObject) j.next();
			view.promptStraighten(vo);
		}
	}

	/**
	 * Yijun Yu: Refactored method from the saveModelTo
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	Individual[] loadIndividualsFromModel(OMEModel model) throws Exception {
		// KB kb = (KB) models2kbs.get(model); //HERE
		KB kb = (TelosParserKB) models2kbs.get(model);
		ViewManager vm = getViewManager(model);
		if (vm == null)
			return kb.individuals();
		Iterator i = vm.getViews();
		while (i.hasNext()) {
			View view = (View) i.next();
			TelosViewSerializer newvs = new TelosViewSerializer(view.getID(),
					kb);
			view.save(newvs);
		}
		return kb.individuals();
	}

	/**
	 * Commits a model and its serializable views to persistent storage.
	 * 
	 * @param model
	 *            the model to be saved
	 * @param filename
	 *            the name of the file the model should be saved to
	 * @param directory
	 *            the name of the directory where the file exists
	 */
	public void saveModelTo(OMEModel model, File f) throws Exception {
		Individual[] individuals = loadIndividualsFromModel(model);
		FileWriter writer = Computing.createWriterWithExtension(f, ".tel");
		int count = 0;
		for (int c = 0; c < individuals.length; c++) {
			try {
				if (!individuals[c].isBuiltin()) {
					writer.write(JTelosUtil.telosDeclaration(individuals[c])
							+ "\n\n");
					count++;

				}
			} catch (Exception e) {

				D.o("exception");
			}
		}
		writer.flush();
		writer.close();
	}

	// cai,Save model as sml file of ConceptBase.
	public void saveModelToSml(OMEModel model, File file) throws Exception {
		Individual[] individuals = loadIndividualsFromModel(model);
		FileWriter writer = Computing.createWriterWithExtension(file, ".sml");
		int Yes = JOptionPane
				.showConfirmDialog(
						null,
						".sml file is the Telos description of the model for ConceptBase.\nSome of atrributes from OME mayn't be accepted by ConceptBase.\n\nDo you want to create .sml file with attributes? ",
						"Select attributes", JOptionPane.YES_NO_OPTION);
		// save the kb by iterating over all non-builtins
		// tyronne remove comment sign from following line.
		for (int c = 0; c < individuals.length; c++) {
			// cai,want to reverse the order of save,but not works
			// for (int c=individuals.length;c>0;c--) {
			if (!individuals[c].isBuiltin()) {
				if (Yes == JOptionPane.YES_OPTION)
					writer.write(JTelosUtil.OtelosDeclaration(individuals[c])
							+ "\n\n");
				else
					writer.write(JTelosUtil
							.OtelosDeclarationNoattribute(individuals[c])
							+ "\n\n");
			}
		}
		writer.flush();
		writer.close();
	}

	OMETab protege;

	private ProgressMonitor progressMonitor = null;

	public final static int ONE_SECOND = 1000;

	/*
	 * Yijun: save into Protege project, instead of into a file
	 */
	public void saveModelToProtege(OMEModel model) throws Exception {
		Individual[] individuals = loadIndividualsFromModel(model);
		protege.clear();
		progressMonitor = new ProgressMonitor(OMETab.frame,
				"Saving Model To Protege", "", 0, individuals.length * 2);
		progressMonitor.setProgress(0);
		progressMonitor.setMillisToDecideToPopup(2 * ONE_SECOND);
		for (int c = individuals.length - 1; c >= 0; c--) {
			if (!individuals[c].isBuiltin()) {
				try {
					JTelosUtil.savePropositionToProtege(individuals[c],
							protege, true);
				} catch (Exception e) {
					e.printStackTrace();
					D.o("An error in saving the individual " + individuals[c]);
				}
			}
			progressMonitor.setProgress(individuals.length - c);
		}
		for (int c = individuals.length - 1; c >= 0; c--) {
			if (!individuals[c].isBuiltin()) {
				JTelosUtil.savePropositionToProtege(individuals[c], protege,
						false);
			}
			progressMonitor.setProgress(2 * individuals.length - c);
		}
		progressMonitor.close();
	}

	/**
	 * Layout model using dot.--Xiao Xue Deng
	 * 
	 * @param model
	 *            the model to layout
	 * @param file
	 *            the file to store temporary .dot file generated from model
	 */
	public void layOut(OMEModel model, File file) throws Exception {
		ViewManager vm = getViewManager(model);
		Iterator i = vm.getViews();
		GraphicView oldView = null;
		while (i.hasNext()) {
			oldView = (GraphicView) i.next();
		}
		saveModelToDot(model, oldView, file);
		Graph newGraph = JTelosUtil.doParse(file);
		if (newGraph !=null)
			JTelosUtil.backToOME(oldView, newGraph);
	}

	private static URL u = null;

	/**
	 * @param file
	 * @return the content of the file
	 */
	private static String get_file_contents() {
		String string = "";
		try {
			if (u == null)
				u = ModelManager.class
						.getResource("/edu/toronto/cs/ome/controller/IStarVDX.txt");
			else
				D.o("url is " + u);
			InputStream i = u.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(i));
			try {
				String s = null;
				do {
					if (s != null)
						string += "\n";
					s = br.readLine();
					if (s != null)
						string += s;
				} while (s != null);
				D.o(string.length());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return string;
	}

	/**
	 * Save file as .vdx so that we can open it in Visio--Xiao Xue Deng
	 * 
	 * @param model
	 *            the model to be saved
	 * @param file
	 *            the .vdx file generated from model
	 */
	public void saveModelToVdx(OMEModel model, File file) throws Exception {
		TelosParserKB kb = (TelosParserKB) models2kbs.get(model);
		Individual[] individuals = loadIndividualsFromModel(model);
		FileWriter writer = Computing.createWriterWithExtension(file, ".vdx");
		String vdx = get_file_contents() + "\n"
				+ JTelosUtil.saveToVdx(kb, individuals);
		// write elements and links specific to "model"
		D.o(vdx.length());
		writer.write(vdx);
		writer.flush();
		writer.close();
	}

	/**
	 * Removes a model and its views. This does not check whether either the
	 * models or their vms are dirty.
	 * 
	 * @param model
	 *            the model to be closed
	 */
	public void closeModel(OMEModel model) {
		models2vms.remove(model);
		models2kbs.remove(model);
		models2plugins.remove(model);
		model = null;
		System.gc();
	}

	/**
	 * Returns the Viewmanager for a model.
	 * 
	 * @param model
	 *            the model whose View Manager we want
	 */
	public ViewManager getViewManager(OMEModel model) {
		return (ViewManager) models2vms.get(model);
	}

	/**
	 * Yijun: This is an extensive way of treating XML-like inputs, such as
	 * Visio XML documents: one just provides an XSLT stylesheet to create a
	 * Telos model, no need to change the Java code
	 * 
	 * @param f --
	 *            the XML file
	 * @return -- the transformed Telos file
	 */
	public static ArrayList xslt_stylesheets = null;

	public static File apply_xslt(File f) {
		String n = f.getAbsolutePath();
		OMETab.init_layout = false;
		if (!n.endsWith(".tel") & !n.endsWith(".q7") & !n.endsWith(".goalmodel")) {
			// an XSLT is assumed to be used
			if (xslt_stylesheets == null)
				xslt_stylesheets = Computing.listContents(new File(System
						.getProperty("java.library.path")), ".xsl");
			String ext = n.substring(n.lastIndexOf(".") + 1);
			for (int i = 0; i < xslt_stylesheets.size(); i++) {
				String xslt = (String) xslt_stylesheets.get(i) + ".xsl";
				File x = new File(xslt);
				String nm = x.getName();
				if (x.exists() && nm.startsWith(ext)) {
					String type = nm.substring(ext.length(), nm
							.lastIndexOf("."));
					if (type.equals(""))
						type = "tel"; // default is Telos output
					// replace the file extension
					String tel = n.substring(0, n.lastIndexOf(".")) + "."
							+ type;
					TransformerFactory factory = TransformerFactory
							.newInstance();
					try {
						D.o("xsltproc " + xslt + " " + n + " > " + tel);
						Transformer transformer_info;
						transformer_info = factory
								.newTransformer(new StreamSource(x));
						transformer_info.transform(new StreamSource(x),
								new StreamResult(tel));
					} catch (TransformerException e) {
						e.printStackTrace();
					}
					f = new File(tel);
				}
			}
		} else if (n.endsWith(".q7")) { // Q7 processing
			String input_file = n;
			String tel = n.substring(0, n.lastIndexOf(".")) + ".tel";
			String xml = n.substring(0, n.lastIndexOf(".")) + ".xml";
			Q7.main(new String[] { input_file, tel });
			TelosCodeGenerator tcg = new IStarGraphCodeGenerator(Q7.a);
			tcg.generateGoalModel(tel);
			f = new File(tel);
			OMETab.init_layout = true;
			if (System.getProperty("feature") != null) { // generating
															// features
				tcg = new FeatureCodeGenerator(Q7.a);
				tcg.generateGoalModel(xml);
			} else {
				XMLCodeGenerator xcg = new XMLCodeGenerator(Q7.a);
				xcg.generateGoalModel(xml);
			}
		} else if (n.endsWith(".goalmodel")) { // goal model
//			loadGoalModel1(n);
//			loadGoalModel2(n);
			System.exit(0);
		}
		return f;
	}

	public static ResourceSet createResourceSet()
	  {
	    ResourceSet result = new ResourceSetImpl();
	    return result;
	  } 
	private static void loadGoalModel2(String n) {
//      Out of Memory problem 	
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new GoalmodelFactoryImpl());
		resourceSet.getPackageRegistry().put(GoalmodelPackage.eNS_URI, GoalmodelPackage.eINSTANCE);
		File file = new File(n);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(n);		
		try {
			Resource resource = resourceSet.getResource(uri, true);
		    for (Iterator i = resource.getResourceSet().getAllContents();
	         i.hasNext(); ) {
		    	Object o = i.next();
		    	if (o instanceof goal) {
		    		D.o(o);
		    	}
		    }
		}
		catch (RuntimeException exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}		
	}

	Hashtable istarelements = null;

	Hashtable istarlinks = null;

	/**
	 * @author Yijun Yu
	 * @date Feb 22, 2005
	 * @purpose to save the goal model into the Q7 language
	 * @limitation not any metamodel can be saved into Q7, only
	 *             goal/agent/aspect-oriented such as NFR, i*, GRL models can be
	 *             saved
	 * @more-limitation currently works only for the i* models generated from Q7
	 * @param model
	 * @param fws
	 *            Exception
	 * @throws IOException
	 */
	public void saveModelToQ7(TelosModel model, File f) throws Exception {
		prepare_the_goalmodel(model);
		FileWriter writer = Computing.createWriterWithExtension(f, ".q7");
		output_to_q7(f, writer);
	}

	/**
	 * @param model
	 * @throws Exception
	 */
	private void prepare_the_goalmodel(TelosModel model) throws Exception {
		id = 0;
		Individual[] individuals = loadIndividualsFromModel(model);
		istarelements = new Hashtable();
		istarindividuals = new HashMap();
		istarlinks = new Hashtable();
		obtain_a_list_of_elements(model, individuals);
		add_parent_child_relations(individuals);
		obtain_a_list_of_links(individuals);
		treat_dependencies();
	}

	/**
	 * @param individuals
	 */
	private void add_parent_child_relations(Individual[] individuals) {
		// add parent/child relations
		for (int c = 0; c < individuals.length; c++) {
			if (individuals[c].isBuiltin())
				continue;
			Proposition proposition = (Proposition) individuals[c];
			// only deal with Token level individuals
			if (proposition.level() > 0)
				continue;
			Proposition[] pros = proposition.directAncestors();
			Proposition[] directAncestors = JTelosUtil.removeBuiltIns(pros);
			if (directAncestors != null && directAncestors.length > 0) {
				for (int i = 0; i < directAncestors.length; i++) {
					String n = directAncestors[i].telosName();
					if (n.equalsIgnoreCase("IStarTaskElement") /* istar */
							|| n.equalsIgnoreCase("IStarGoalElement")
							|| n.equalsIgnoreCase("IStarResourceElement")
							|| n.equalsIgnoreCase("IStarSoftGoalElement")
							/* vgraph */|| n.equalsIgnoreCase("Goal")
							|| n.equalsIgnoreCase("Task")
							|| n.equalsIgnoreCase("NFROperationalization")
							|| n.equalsIgnoreCase("NFRSoftgoal")) {
						proposition2agentelement(n, proposition, false, false);
						break;
					}
				}
			}
		}
	}

	/**
	 * obtain the list of istarelements from the individuals
	 * 
	 * @param individuals
	 */
	private void obtain_a_list_of_elements(TelosModel model,
			Individual[] individuals) {
		for (int c = 0; c < individuals.length; c++) {
			if (individuals[c].isBuiltin())
				continue;
			Proposition proposition = (Proposition) individuals[c];
			// only deal with Token level individuals
			if (proposition.level() > 0)
				continue;
			only_deal_with_token_level_individuals(model, proposition);
		}
	}

	/**
	 * @param proposition
	 */
	private void only_deal_with_token_level_individuals(TelosModel model,
			Proposition proposition) {
		Proposition[] pros = proposition.directAncestors();
		Proposition[] directAncestors = JTelosUtil.removeBuiltIns(pros);
		if (directAncestors != null && directAncestors.length > 0) {
			proposition2istarelement(model, proposition, directAncestors);
		}
	}

	/**
	 * @param proposition
	 * @param directAncestors
	 */
	private void proposition2istarelement(TelosModel model,
			Proposition proposition, Proposition[] directAncestors) {
		for (int i = 0; i < directAncestors.length; i++) {
			String n = directAncestors[i].telosName();
			if (n.equalsIgnoreCase("IStarTaskElement") /* istar */
					|| n.equalsIgnoreCase("IStarGoalElement")
					|| n.equalsIgnoreCase("IStarResourceElement")
					/* vgraph */|| n.equalsIgnoreCase("Goal")
					|| n.equalsIgnoreCase("Task")
					|| n.equalsIgnoreCase("NFROperationalization")) {
				proposition2istarelement(model, n, proposition, true, false);
				break;
			}
			if (/* istar */n.equalsIgnoreCase("IStarSoftGoalElement")
					|| n.equalsIgnoreCase("IStarClaimElement")
					/* vgraph */|| n.equalsIgnoreCase("NFRSoftgoal")) {
				proposition2istarelement(model, n, proposition, false, false);
				break;
			}
			if (/* istar */
			n.equalsIgnoreCase("IStarActorElement")
					|| n.equalsIgnoreCase("IStarAgentElement")
					|| n.equalsIgnoreCase("IStarPositionElement")
					|| n.equalsIgnoreCase("IStarRoleElement")
					|| n.equalsIgnoreCase("IStarAspectElement")
			/* vgraph */
			) {
				proposition2istarelement(model, n, proposition, true, true);
				break;
			}
		}
	}

	/**
	 * obtain a list of istarlinks from the individuals
	 * 
	 * @param individuals
	 */
	private void obtain_a_list_of_links(Individual[] individuals) {
		for (int c = 0; c < individuals.length; c++) {
			if (individuals[c].isBuiltin())
				continue;
			Proposition proposition = (Proposition) individuals[c];
			// only deal with Token level individuals
			if (proposition.level() > 0)
				continue;
			Proposition[] pros = proposition.directAncestors();
			Proposition[] directAncestors = JTelosUtil.removeBuiltIns(pros);
			if (directAncestors != null && directAncestors.length > 0) {
				for (int i = 0; i < directAncestors.length; i++) {
					String n = directAncestors[i].telosName();
					if (/* istar */n.equalsIgnoreCase("IStarDecompositionLink")
					/* vgraph */
					|| n.indexOf("And") >= 0) {
						proposition2istarlink(proposition, true, false, true);
						break;
					}
					if (/* istar */n.equalsIgnoreCase("IStarMeansEndsLink")
					/* vgraph */
					|| n.indexOf("Or") >= 0) {
						proposition2istarlink(proposition, true, false, false);
						break;
					}
					if (/* istar vgraph */
					n.indexOf("Break") >= 0 || n.indexOf("Help") >= 0
							|| n.indexOf("Hurt") >= 0 || n.indexOf("Make") >= 0
							|| n.indexOf("SomePositive") >= 0
							|| n.indexOf("SomeNegative") >= 0
							|| n.indexOf("Equal") >= 0) {
						proposition2istarlink(proposition, false, false, false);
						break;
					}
					if (/* istar */n.equalsIgnoreCase("IStarDependencyLink")) {
						proposition2istarlink(proposition, false, true, false);
						break;
					}
				}
			}
		}
	}

	/**
	 * @author Yijun Yu
	 * @date Mar 8, 2005
	 * @purpose to save the goal model into the input language for the goal
	 *          reasoning tool (GRTool) of Trento
	 * @limitation not any metamodel can be saved into it, only
	 *             goal/agent/aspect-oriented such as NFR, i*, GRL models can be
	 *             saved
	 * @param model
	 */
	public void saveModelToDat(TelosModel model, File f) throws Exception {
		prepare_the_goalmodel(model);
		output_to_dat(model, f);
	}

	/**
	 * @param f
	 * @param writer
	 * @throws IOException
	 */
	private void output_to_q7(File f, FileWriter writer) throws IOException {
		// output sorted Q7 advices
		SortArrayList sorted_keys = new SortArrayList();
		for (Enumeration i = istarelements.elements(); i.hasMoreElements();) {
			IStarElement p = (IStarElement) i.nextElement();
			if (p.isAgent || p.isAspect)
				continue;
			if (Computing.strip_quote(p.name).startsWith("Claim:"))
				continue;
			boolean is_root = true;
			for (Enumeration j = istarlinks.elements(); j.hasMoreElements();) {
				IStarLink l = (IStarLink) j.nextElement();
				IStarElement from = l.from;
				if ((l.op.equals("&") || l.op.equals("|")) && from != null
						&& from.name.equalsIgnoreCase(p.name)
						&& from.parent == p.parent) {
					is_root = false;
					break;
				}
			}
			String q7 = toQ7(p, 0);
			if (is_root && !q7.equals("")) {
				sorted_keys.add(q7);
			}
		}
		for (int i = 0; i < sorted_keys.size(); i++) {
			String q7 = (String) sorted_keys.get(i);
			writer.write(q7 + "\n");
		}
		writer.flush();
		writer.close();
	}

	/**
	 * Talks to the Trento's Goal reasoning tool
	 * 
	 * @param f
	 * @param writer
	 * @throws IOException
	 */
	private void output_to_dat(TelosModel model, File f) throws Exception {
		it.unitn.goal_analysis.graph_creation.Graph graph = new it.unitn.goal_analysis.graph_creation.Graph();
		// directed graph
		// graph.graphType = "D";
		graph.graphType = "C";
		int numberOfNodes = 0;
		SortArrayList sorted_elements = new SortArrayList();
		Hashtable eid2gid = new Hashtable();
		Hashtable gid2eid = new Hashtable();
		numberOfNodes = count_nodes(numberOfNodes, sorted_elements, eid2gid,
				gid2eid);
		create_node_with_initial_label(numberOfNodes, sorted_elements, eid2gid,
				gid2eid, model, graph);
		int numberOfRelations = 0;
		create_links(graph, sorted_elements, eid2gid, gid2eid, numberOfNodes,
				numberOfRelations);
		// stupid long run, should check the termination condition
		// seems all right for small models
		long runs = 500;
		graph.writeToFile(new File(Computing.getTempFilename("input.dat")).getAbsolutePath());
		for (int i = 0; i < runs; ++i)
			graph.propagate(false); // stabilise
		datBackToOME(model, graph, numberOfNodes, sorted_elements, eid2gid,
				gid2eid);
		graph.writeToFile(f.getAbsolutePath());
	}

	/**
	 * @param numberOfNodes
	 * @param sorted_elements
	 * @param model
	 * @param graph
	 */
	private void create_node_with_initial_label(int numberOfNodes,
			SortArrayList sorted_elements, Hashtable eid2gid,
			Hashtable gid2eid, TelosModel model,
			it.unitn.goal_analysis.graph_creation.Graph graph) {
		for (Enumeration i = istarelements.keys(); i.hasMoreElements();) {
			String key = (String) i.nextElement();
			IStarElement p = (IStarElement) istarelements.get(key);
			p.key = key;
		}
		for (int i = 0; i < numberOfNodes; i++) {
			IStarElement p = (IStarElement) sorted_elements.get(i);
			// assume every goal is unsatisfied initially, one needs to use the
			// i* labels here
			String satLabel = "NO";
			String denLabel = "NO";
			String eleName = p.key;
			TelosParserKB kb = (TelosParserKB) models2kbs.get(model);
			TelosParserIndividual istarEle = (TelosParserIndividual) (kb
					.individual(eleName));
			Attribute[] currentAttrs = null;
			if (istarEle != null)
				currentAttrs = istarEle.directAttributes();
			String label = null;
			if (currentAttrs != null) {
				for (int k = 0; k < currentAttrs.length; k++) {
					String[] catLabels = currentAttrs[k].categories();
					if (catLabels.length == 2 && catLabels[1].equals("label")
							|| currentAttrs[k].label().startsWith("label")) {
						label = currentAttrs[k].to().telosName();
					}
				}
			}
			if (label != null) {
				satLabel = "" + p.s;
				denLabel = "" + p.d;
			}
			graph.addNode(new it.unitn.goal_analysis.graph_creation.Node(graph
					.getLabel(satLabel), graph.getLabel(denLabel), ""
					+ ((Integer) eid2gid.get(new Integer(p.id))).intValue()
					+ " " + (p.parent != null ? to_who(p.parent.name) : "")
					+ p.name));
		}
	}

	/**
	 * @param numberOfNodes
	 * @param sorted_elements
	 * @param eid2gid --
	 *            mapping element id to graph node id
	 * @param gid2eid --
	 *            mapping graph node id to element id
	 * @return
	 */
	private int count_nodes(int numberOfNodes, SortArrayList sorted_elements,
			Hashtable eid2gid, Hashtable gid2eid) {
		for (Enumeration i = istarelements.keys(); i.hasMoreElements();) {
			String k = (String) i.nextElement();
			IStarElement p = (IStarElement) istarelements.get(k);
			if (p.isAgent || p.isAspect)
				continue;
			sorted_elements.add(p);
			numberOfNodes++;
		}
		for (int i = 0; i < numberOfNodes; i++) {
			IStarElement p = (IStarElement) sorted_elements.get(i);
			eid2gid.put(new Integer(p.id), new Integer(i));
			gid2eid.put(new Integer(i), new Integer(p.id));
		}
		return numberOfNodes;
	}

	/**
	 * @param graph
	 * @param numberOfRelations
	 */
	private void create_links(
			it.unitn.goal_analysis.graph_creation.Graph graph,
			SortArrayList sorted_elements, Hashtable eid2gid,
			Hashtable gid2eid, int numberOfNodes, int numberOfRelations) {
		for (int i = 0; i < numberOfNodes; i++) {
			IStarElement p = (IStarElement) sorted_elements.get(i);
			String op = null;
			// AND/OR decompositions
			SortArrayList sorted_decomps = new SortArrayList();
			for (Enumeration j = istarlinks.elements(); j.hasMoreElements();) {
				IStarLink l = (IStarLink) j.nextElement();
				IStarElement from = l.from, to = l.to;
				if (from == null || to == null)
					continue;
				if ((l.op.equals("&") || l.op.equals("|")) && to.id == p.id
						|| l.op.equals("~") && from.id == p.id && to.id != p.id) {
					// decompositions: turn ~ into AND
					op = (l.op.equals("&") || l.op.equals("~")) ? "AND" : "OR";
					if (l.op.equals("~"))
						sorted_decomps.add(""
								+ ((Integer) eid2gid.get(new Integer(to.id)))
										.toString());
					else
						sorted_decomps.add(""
								+ ((Integer) eid2gid.get(new Integer(from.id)))
										.toString());
				}
			}
			if (op != null) {
				it.unitn.goal_analysis.graph_creation.RelType type = graph
						.getRelType(op);
				it.unitn.goal_analysis.graph_creation.Node parent = (it.unitn.goal_analysis.graph_creation.Node) graph.nodes
						.get(((Integer) eid2gid.get(new Integer(p.id)))
								.intValue());
				LinkedList children = new LinkedList();
				for (int j = 0; j < sorted_decomps.size(); j++) {
					int n = Integer.parseInt((String) sorted_decomps.get(j));
					children
							.add((it.unitn.goal_analysis.graph_creation.Node) graph.nodes
									.get(n));
				}
				graph
						.addRelation(new it.unitn.goal_analysis.graph_creation.Relation(
								type, parent, children));
				((it.unitn.goal_analysis.graph_creation.Relation) graph.relations
						.getLast()).informNodes();
				numberOfRelations++;
			}
			for (Enumeration j = istarlinks.elements(); j.hasMoreElements();) {
				IStarLink l = (IStarLink) j.nextElement();
				IStarElement from = l.from, to = l.to;
				if (from == null || to == null)
					continue;
				if (from.id != to.id
						&& from.id == p.id
						&& !(l.op.equals("&") || l.op.equals("|") || l.op
								.equals("~"))) {
					it.unitn.goal_analysis.graph_creation.RelType type, type2;
					it.unitn.goal_analysis.graph_creation.Node parent;
					LinkedList children = new LinkedList();
					int n;
					// one of "++", "--", "+", "-"
					String o = "+" + ContinuousRelType.magicToken + "0.5";
					if (l.op.equals("++"))
						o = "+" + ContinuousRelType.magicToken + "1.0";
					else if (l.op.equals("--"))
						o = "-" + ContinuousRelType.magicToken + "1.0";
					else if (l.op.equals("+"))
						o = "+" + ContinuousRelType.magicToken + l.getDegree();
					else if (l.op.equals("-"))
						o = "-" + ContinuousRelType.magicToken + l.getDegree();
					type = graph.getRelType(o);
					if (l.op.equals("++"))
						o = "*" + ContinuousRelType.magicToken + "1.0";
					else if (l.op.equals("--"))
						o = "/" + ContinuousRelType.magicToken + "1.0";
					else if (l.op.equals("+"))
						o = "*" + ContinuousRelType.magicToken + l.getDegree();
					else if (l.op.equals("-"))
						o = "/" + ContinuousRelType.magicToken + l.getDegree();
					type2 = graph.getRelType(o);
					parent = (it.unitn.goal_analysis.graph_creation.Node) graph.nodes
							.get(((Integer) eid2gid.get(new Integer(to.id)))
									.intValue());
					// singleton though
					n = ((Integer) eid2gid.get(new Integer(p.id))).intValue();
					children
							.add((it.unitn.goal_analysis.graph_creation.Node) graph.nodes
									.get(n));
					graph
							.addRelation(new it.unitn.goal_analysis.graph_creation.Relation(
									type, parent, children));
					((it.unitn.goal_analysis.graph_creation.Relation) graph.relations
							.getLast()).informNodes();
					numberOfRelations++;
					graph
							.addRelation(new it.unitn.goal_analysis.graph_creation.Relation(
									type2, parent, children));
					((it.unitn.goal_analysis.graph_creation.Relation) graph.relations
							.getLast()).informNodes();
					numberOfRelations++;
				}
			}
		}
	}

	/**
	 * @param model
	 * @param graph
	 * @param numberOfNodes
	 * @param sorted_elements
	 */
	private void datBackToOME(TelosModel model,
			it.unitn.goal_analysis.graph_creation.Graph graph,
			int numberOfNodes, SortArrayList sorted_elements,
			Hashtable eid2gid, Hashtable gid2eid) {
		// Feedback into OpenOME as labels -Xiaoxue Deng, March 13, 2005
		TelosParserKB kb = (TelosParserKB) models2kbs.get(model);
		for (int i = 0; i < numberOfNodes; i++) {
			IStarElement p = (IStarElement) sorted_elements.get(i);
			it.unitn.goal_analysis.graph_creation.Node node = (it.unitn.goal_analysis.graph_creation.Node) graph.nodes
					.get(((Integer) eid2gid.get(new Integer(p.id))).intValue());
			String eleName = p.key;
			TelosParserIndividual telosEle = (TelosParserIndividual) (kb
					.individual(eleName));
			if (telosEle != null) {
				String[] type = { "label" };
				String label = "";
				String den = ((it.unitn.goal_analysis.graph_creation.Label) node
						.getDenLabel()).getName();
				String sat = ((it.unitn.goal_analysis.graph_creation.Label) node
						.getSatLabel()).getName();
				TelosString newValue = new TelosString("");
				float s = 0;
				float d = 0;
				try {
					s = Float.parseFloat(sat);
					d = Float.parseFloat(den);
					newValue.value = Computing.SDtoLabel(s, d);
				} catch (Exception e) {
				}
				String satcat[] = { "sat" };
				String dencat[] = { "den" };
				kb.newAttribute(telosEle, type, label, newValue);
				kb.newAttribute(telosEle, satcat, "", new TelosReal(s));
				kb.newAttribute(telosEle, dencat, "", new TelosReal(d));
			}
		}
		try {
			model.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private void treat_dependencies() {
		Hashtable ilinks = new Hashtable(istarlinks);
		for (Enumeration i = ilinks.elements(); i.hasMoreElements();) {
			IStarLink l1 = (IStarLink) i.nextElement();
			if (!l1.op.equals("~"))
				continue;
			IStarElement e_f = l1.from;
			IStarElement e_t = l1.to;
			if (e_f.isAgent != e_t.isAgent) {
				if (e_f.isAgent && !e_t.isAgent && e_t.parent == null) {
					int m = istarelements.size();
					String gname = "<" + e_f.name + ">::" + e_t.name;
					IStarElement g = new IStarElement(m, gname, "");
					istarelements.put(gname, g);
					g.parent = e_f;
					e_f.children.add(g);
					IStarLink l = new IStarLink("~", g, e_t);
					l.id = l1.id;
					istarlinks.put("" + l1.id, l);
				} else if (!e_f.isAgent && e_t.isAgent && e_f.parent == null) {
					int m = istarelements.size();
					String gname = "<" + e_t.name + ">::" + e_f.name;
					IStarElement g = new IStarElement(m, gname, "");
					istarelements.put(gname, g);
					g.parent = e_t;
					e_t.children.add(g);
					IStarLink l = new IStarLink("~", e_f, g);
					l.id = l1.id;
					istarlinks.put("" + l1.id, l);
				} else {
				}
			}
		}
	}

	/**
	 * @param n
	 * @param proposition
	 * @param b
	 * @param c
	 */
	private void proposition2agentelement(String type, Proposition p,
			boolean isCompound, boolean isHard) {
		String linkAtt[] = { "parent" };
		IStarElement goal = (IStarElement) istarelements.get(p.telosName());
		TelosAttribute[] f = (TelosAttribute[]) p.attributes(linkAtt, "");
		if (f != null && f.length > 0) {
			IStarElement agent = (IStarElement) istarelements.get(f[0].value);
			if (agent != null) {
				goal.parent = agent;
				agent.children.add(goal);
			}
		}
	}

	/**
	 * @param p
	 * @return
	 */
	private String toQ7(IStarElement p, int lvl) {
		SortArrayList sorted_when = new SortArrayList();
		SortArrayList sorted_effects = new SortArrayList();
//		SortArrayList sorted_decomps = new SortArrayList();
		ArrayList sorted_decomps = new SortArrayList();
		SortArrayList depend_agents = new SortArrayList();
		SortArrayList depended_agents = new SortArrayList();
		if (Computing.strip_quote(p.name).startsWith("Claim:"))
			return "";
		String when = "";
		String depends = "";
		String op = "";
		String indent = "";
		for (int i = 0; i < lvl; i++)
			indent += "  ";
		String str = indent;
		String context = "";
		if (p.parent != null)
			context = p.parent.name.trim();
		if (!context.equals("") && p.name.indexOf("<") < 0 && lvl == 0
		/* && context.indexOf("Aspect ")<0 */)
			str += to_who(context);
		str += p.name;
		depends = str;
		Vector decomposition_list = new Vector();
		for (Enumeration j = istarlinks.elements(); j.hasMoreElements();) {
			IStarLink l = (IStarLink) j.nextElement();
			IStarElement from = l.from, to = l.to;
			if (from == null || to == null) {
				System.out.println("warning: the model has wrong links " + from
						+ "->" + to);
				continue;
			}
			if ((l.op.equals("&") || l.op.equals("|")) && to.id == p.id) { // contributions
				op = l.op;
				if (p.feature != null && l.op.equals("|")) {
					op += " " + p.feature;
				} else if (p.control != null && l.op.equals("&")) {
					op += " " + p.control;
				}
				decomposition_list.add(from);
			} else if (from.name.equalsIgnoreCase(p.name)
					&& from.parent == p.parent && l.op.equals("~")) {
				if (to.name.equalsIgnoreCase(from.name) /*
														 * && from.parent!=null &&
														 * to.parent == null
														 */)
					for (Enumeration k = istarlinks.elements(); k
							.hasMoreElements();) {
						IStarLink l2 = (IStarLink) k.nextElement();
						if (l2.from.name.equalsIgnoreCase(to.name)
								&& (l2.from.parent == null || l2.from.parent.name
										.indexOf("Aspect ") >= 0)
								&& (to.parent == null || to.parent.name
										.indexOf("Aspect ") >= 0)
								&& l2.to.name.equalsIgnoreCase(to.name)
								&& from.parent != null && l2.to.parent != null
								&& from.parent.name.indexOf("Aspect ") < 0) {
							depend_agents.add(to_who(l2.to.parent.name));
						}
						if (l2.to.id == from.id
								&& (from.parent == null || from.parent.name
										.indexOf("Aspect ") >= 0)
								&& l2.from.name.equalsIgnoreCase(from.name)
								&& l2.from.parent != null && to.parent != null
								&& to.parent.name.indexOf("Aspect ") < 0) {
							String m = to_who(l2.from.parent.name);
							depended_agents.add(m);
						}
					}
				if (from.parent != to.parent
						&& (l.op.equals("~") && depend_agents.size() == 0
								&& depended_agents.size() == 0 || !l.op
								.equals("~"))) {
					String name = "";
					if (to.name.indexOf(">::") >= 0)
						to.name = to.name.substring(to.name.indexOf(">::") + 3);
					if (to.parent != null && to.name.indexOf("<") < 0
					/* && to.parent.name.indexOf("Aspect ")<0 */) {
						name = to_who(to.parent.name);
					}
					sorted_effects.add(l.op + name + to.name);
				}
			} else if (from.id == p.id
					&& !(l.op.equals("&") || l.op.equals("|") || l.op
							.equals("~"))) {
				if (from.parent != null
						&& from.parent.name.indexOf("Aspect ") < 0
						&& (to.parent == null || to.parent.name
								.indexOf("Aspect ") >= 0)) {
					for (Enumeration k = istarlinks.elements(); k
							.hasMoreElements();) {
						IStarLink l2 = (IStarLink) k.nextElement();
						if (l2.from.name.equalsIgnoreCase(to.name)
								&& (l2.from.parent == null || l2.from.parent.name
										.indexOf("Aspect ") >= 0)
								&& l2.to.name.equalsIgnoreCase(to.name)
								&& l2.to.parent != null) {
							String name = "";
							if (to.parent != null && to.name.indexOf("<") < 0
							/* && to.parent.name.indexOf("Aspect ")<0 */) {
								name = to_who(l2.to.parent.name);
							}
							sorted_effects.add(l.op + name + to.name);
						}
					}
				} else if (from.parent != to.parent) {
					String name = "";
					if (to.parent != null && to.name.indexOf("<") < 0
					/* && to.parent.name.indexOf("Aspect ")<0 */) {
						name = to_who(to.parent.name);
					}
					sorted_effects.add(l.op + name + to.name);
				} else {
					sorted_effects.add(l.op + to.name);
				}
			} else if (from.id != p.id
					&& !(l.op.equals("&") || l.op.equals("|") || l.op
							.equals("~"))) {
				for (Enumeration k = istarlinks.elements(); k.hasMoreElements();) {
					IStarLink l2 = (IStarLink) k.nextElement();
					if (l2.to.name.equalsIgnoreCase(to.name)
							&& Computing.strip_quote(l2.from.name).startsWith(
									"Claim:")) {
						sorted_when.add(l2.op
								+ Computing.strip_quote(l2.from.name
										.substring(l2.from.name
												.indexOf("Claim:") + 6)));
					}
				}
			} else {
				continue;
			}
		}
		Vector v = sort_decomposition_list(decomposition_list);		
		for (Iterator i = v.iterator(); i.hasNext(); ) {
			IStarElement from = (IStarElement) i.next();
			sorted_decomps.add(toQ7(from, lvl + 1) + "\n");
		}
		boolean hasWhen = sorted_when.size() > 0;
		if (hasWhen) {
			when += "(";
			for (int i = 0; i < sorted_when.size(); i++) {
				when += (String) sorted_when.get(i);
				if (i == sorted_when.size() - 1) {
					when += ") => ";
				} else {
					when += ",";
				}
			}
			str = when + str;
		}
		boolean hasDecomp = sorted_decomps.size() > 0;
		if (hasDecomp) {
			str += " { " + op + "\n";
			for (int i = 0; i < sorted_decomps.size(); i++) {
				str += (String) sorted_decomps.get(i);
			}
			str += indent + "}";
		}
		str += p.getLabel();
		boolean hasEffect = sorted_effects.size() > 0;
		if (hasEffect) {
			for (int i = 0; i < sorted_effects.size(); i++) {
				if (i == 0)
					str += " => ";
				else
					str += ", ";
				str += (String) sorted_effects.get(i);
			}
		}
		boolean hasDepends = depend_agents.size() > 0;
		if (hasDepends) {
			for (int i = 0; i < depend_agents.size(); i++) {
				if (i == 0)
					depends += " ==> ";
				else
					depends += ", ";
				String nm = (String) depend_agents.get(i);
				depends += nm.indexOf("::") > 0 ? nm.substring(0, nm
						.indexOf("::")) : nm;
			}
			if (!hasEffect && !hasDecomp)
				str = depends;
			else
				str += depends;
		}
		if (!hasEffect && !hasDecomp && !hasWhen && !hasDepends && lvl == 0
				&& p.isSoftGoal) {
			return "";
		}
		return str;
	}

	/**
	 * Sort the decomposed goals by their horizontal geometry position: from left to right
	 * @param v -- a list of decomposed goals
	 * @return sorted list of the decomposed goals
	 */
	private Vector sort_decomposition_list(Vector v) {
		int n = v.size(); 
		if (n<2) return v;
		for (int i = 0; i < n - 1; i++) {
			IStarElement ei = (IStarElement) v.elementAt(i);
			Point pi = (Point) istargeometry.get(ei);
			for (int j= i + 1; j< n; j++ ) {
				IStarElement ej = (IStarElement) v.elementAt(j);
				Point pj = (Point) istargeometry.get(ej);
				if (pi.x > pj.x) {
					v.removeElementAt(j);
					v.removeElementAt(i);
					v.insertElementAt(ej, i);
					v.insertElementAt(ei, j);
					ei = ej;
					pi = pj;
				}
			}
		}
		return v;
	}

	/**
	 * @param context
	 * @return
	 */
	private static String to_who(String context) {
		context = Computing.strip_quote(context);
		if (context.startsWith("Agent "))
			return "<"
					+ Computing.quotation(context.substring("Agent ".length()))
					+ ">::";
		return "<" + Computing.quotation(context) + ">::";
	}

	/**
	 * @param proposition
	 * @return
	 */
	void proposition2istarlink(Proposition proposition,
			boolean isDecomposition, boolean isDependency, boolean isAnd) {
		String nameAtt[] = { "name" };
		String fromAtt[] = { "from" };
		String toAtt[] = { "to" };
		String op = ((TelosString) proposition.attributes(nameAtt, "")[0].to())
				.stringValue();
		TelosAttribute f = (TelosAttribute) proposition.attributes(fromAtt,
				"from")[0];
		TelosAttribute t = (TelosAttribute) proposition.attributes(toAtt, "to")[0];
		String from = f.value;
		String to = t.value;
		IStarElement e_f = (IStarElement) istarelements.get(from);
		if (e_f == null)
			System.out.println("warning: " + from + " not found.");
		IStarElement e_t = (IStarElement) istarelements.get(to);
		if (e_t == null)
			System.out.println("warning: " + to + " not found.");
		double d = 0;
		if (isDependency) {
			op = "~";
		} else if (isDecomposition) {
			if (isAnd)
				op = "&";
			else
				op = "|";
		} else {
			if (op.startsWith("Make") || op.startsWith("++")) {
				d = 1.0;
				if (op.startsWith("Make") && op.length() > 4) {
					try {
						d = Double.parseDouble(op.substring(4));
					} catch (Exception e) {
					}
				} else if (op.length() > 2) {
					try {
						d = Double.parseDouble(op.substring(2));
					} catch (Exception e) {
					}
				}
				op = "++";
			} else if (op.startsWith("Break") || op.startsWith("--")) {
				d = 1.0;
				if (op.startsWith("Break") && op.length() > 5) {
					try {
						d = Double.parseDouble(op.substring(5));
					} catch (Exception e) {
					}
				} else if (op.length() > 2) {
					try {
						d = Double.parseDouble(op.substring(2));
					} catch (Exception e) {
					}
				}
				op = "--";
			} else if (op.startsWith("Help") || op.startsWith("+")) {
				d = 0.5;
				if (op.startsWith("Help") && op.length() > 4) {
					try {
						d = Double.parseDouble(op.substring(4));
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (op.startsWith("+") && op.length() > 1) {
					try {
						d = Double.parseDouble(op.substring(1));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if (d != 0.5)
					op = "+ " + d + " ";
				else
					op = "+";
			} else if (op.startsWith("Hurt") || op.startsWith("-")) {
				d = 0.5;
				if (op.startsWith("Hurt") && op.length() > 4) {
					try {
						d = Double.parseDouble(op.substring(4));
					} catch (Exception e) {
					}
				} else if (op.startsWith("-") && op.length() > 1) {
					try {
						d = Double.parseDouble(op.substring(1));
					} catch (Exception e) {
					}
				}
				if (d != 0.5)
					op = "- " + d + " ";
				else
					op = "-";
			}
		}
		IStarLink l = new IStarLink(op, e_f, e_t);
		if (op.equals("++") || op.startsWith("+") || op.startsWith("-")
				|| op.equals("--")) {
			l.setDegree(d);
		}
		l.id = id++;
		istarlinks.put("" + id, l);
	}

	/**
	 * @param nameAtt
	 * @param p
	 * @return
	 */
	private String proposition2name(String[] nameAtt, Proposition p) {
		String name = ((TelosString) p.attributes(nameAtt, "")[0].to())
				.stringValue();
		return goal2name(name);
	}

	/**
	 * @param name
	 * @return
	 */
	private String goal2name(String name) {
		// treaing topics
		String type, topic;
		if (name.indexOf("[") >= 0 && name.lastIndexOf("]") >= 0) {
			type = name.substring(0, name.indexOf("["));
			topic = name
					.substring(name.indexOf("[") + 1, name.lastIndexOf("]"));
		} else {
			type = name;
			topic = "";
		}
		type = type.trim();
		topic = topic.trim();
		type = Computing.quotation(type);
		String token = topic;
		String subtopic = topic;
		topic = "";
		while (subtopic.indexOf(",") >= 0) {
			token = subtopic.substring(0, subtopic.indexOf(",")).trim();
			token = Computing.quotation(token) + ",";
			topic += token;
			subtopic = subtopic.substring(subtopic.indexOf(",") + 1).trim();
			token = subtopic;
		}
		token = Computing.quotation(token);
		topic += token;
		if (topic.equalsIgnoreCase(""))
			name = type;
		else
			name = type + " [" + topic + "]";
		return name;
	}

	static int id = 0;

	Hashtable agents = new Hashtable();

	private HashMap istarindividuals;
	private HashMap istargeometry = new HashMap();

	/**
	 * @param nameAtt
	 * @param p
	 * @return
	 */
	private void proposition2istarelement(TelosModel model, String type,
			Proposition p, boolean isHard, boolean isCompound) {
		String nameAtt[] = { "name" };
		String labelAtt[] = { "label" };
		String featureAtt[] = { "feature" };
		String controlAtt[] = { "control" };
		String satAtt[] = { "sat" };
		String denAtt[] = { "den" };
		String name = proposition2name(nameAtt, p).trim();
		if (type.equalsIgnoreCase("IStarClaimElement") && type.indexOf("[") < 0) // turn
																					// resources
																					// into
																					// goals
			name = Computing.prepend("Claim: ", name);
		if (type.equalsIgnoreCase("IStarResourceElement")
				&& type.indexOf("[") < 0) // turn resources into goals
			name = Computing.prepend("Provide: ", name);
		if (type.equalsIgnoreCase("IStarTaskElement"))
			name = Computing.prepend("Do ", name);
		if (type.equalsIgnoreCase("IStarSoftGoalElement")) // turn softgoal
															// into uncertain
															// goal
			name = Computing.prepend("May ", name);
		if (type.equalsIgnoreCase("IStarActorElement"))
			name = Computing.prepend("Actor ", name);
		// agent is the default type
		if (type.equalsIgnoreCase("IStarPositionElement"))
			name = Computing.prepend("Position ", name);
		if (type.equalsIgnoreCase("IStarRoleElement"))
			name = Computing.prepend("Role ", name);
		if (type.equalsIgnoreCase("IStarAspectElement"))
			name = Computing.prepend("Aspect ", name);
		IStarElement e = new IStarElement(id++, name, null);
		e.isAgent = isCompound;
		if (type.equalsIgnoreCase("IStarAspectElement"))
			e.isAspect = true;
		e.isSoftGoal = !isHard;
		Attribute[] attr = (Attribute[]) p.attributes(labelAtt, "");
		String label = null;
		if (attr != null && attr.length > 0)
			label = attr[0].to().telosName();
		if (label != null) {
			OMEElement x = model.getElement(p);
			if (x != null && x instanceof TelosElement) {
				TelosElement mo = (TelosElement) x;
				e.s = ((TelosElement) mo).getSat();
				e.d = ((TelosElement) mo).getDen();
			} else {
				if (p.attributes(satAtt, "").length > 0)
					e.s = ((TelosReal) p.attributes(satAtt, "")[0].to())
							.floatValue();
				if (p.attributes(denAtt, "").length > 0)
					e.d = ((TelosReal) p.attributes(denAtt, "")[0].to())
							.floatValue();
			}
			if (e.s != 0 || e.d != 0)
				e.label = e.s + ", " + e.d;
		}
		attr = (Attribute[]) p.attributes(featureAtt, "");
		String feature = null;
		if (attr != null && attr.length > 0)
			feature = attr[0].to().telosName();
		if (feature != null) {
			if (feature.indexOf("Alternative") > 0) {
				e.setFeature("|");
			} else if (feature.indexOf("Optional") > 0) {
				e.setFeature("/");
			}
		}
		attr = (Attribute[]) p.attributes(controlAtt, "");
		String control = null;
		if (attr != null && attr.length > 0)
			control = attr[0].to().telosName();
		if (control != null) {
			if (control.indexOf("Parallel") > 0) {
				e.setControl("||");
			} else if (control.indexOf("Sequential") > 0) {
				e.setControl(";");
			}
		}
		istarelements.put(p.telosName(), e);
		istarindividuals.put(p.telosName(), p);
		Point pnt = new Point();
		pnt = ((GraphicView)model.getViewManager().getViewByIndex(0)).getCentre(p.telosName());
		istargeometry.put(e, pnt);
	}

	/**
	 * 
	 */
	public void resetReasoning(OMEModel model) {
		try {
			prepare_the_goalmodel((TelosModel) model);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		TelosParserKB kb = (TelosParserKB) models2kbs.get(model);
		for (Enumeration i = istarelements.keys(); i.hasMoreElements();) {
			String k = (String) i.nextElement();
			IStarElement p = (IStarElement) istarelements.get(k);
			if (p.isAgent || p.isAspect)
				continue;
			TelosParserIndividual telosEle = (TelosParserIndividual) (kb
					.individual(k));
			if (telosEle != null) {
				String[] type = { "label" };
				String label = "";
				TelosString newValue = new TelosString("");
				newValue.value = "IStarUndecidedElementLabel";
				kb.newAttribute(telosEle, type, label, newValue);
				String satcat[] = { "sat" };
				String dencat[] = { "den" };
				kb.newAttribute(telosEle, type, label, newValue);
				kb.newAttribute(telosEle, satcat, "", new TelosReal(0));
				kb.newAttribute(telosEle, dencat, "", new TelosReal(0));
			}
		}
		try {
			model.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	public Collection getFrameworkChoices() {
		File dir = new File(System.getProperty("java.library.path"));
		String files[] = dir.list();
		Vector v = new Vector();
		// The problem here is that framework loading will happen in
		// the order that they appear in the directory listing.
		for (int j = 0; j < files.length; j++) {
			if (files[j].endsWith(FW_SUFFIX)) {
				Choice c = new Choice();
				c.setName(files[j].substring(0, files[j].length()
						- FW_SUFFIX.length()));
				c.setChoiceObject(FW_DIR + File.separatorChar + files[j]);
				v.add(c);
			}
		}
		return v;
	}

	/**
	 * Creates a new model and appropriate support structures. These include
	 * KBManager, ViewManager, a Framework... This is actually a
	 * TelosModelBuilder, as it is what creates the principle telos objects.
	 */
	public OMEModel newModel(File f, Iterator fws) throws Exception {
		D.o("Creating ModelManager.");
		// kbm = new KBManager();
		KB kb = kbm.createKB();

		// right now we just load all frameworks in the frameworks
		// directory. ome.tel better be in there :)
		while (fws.hasNext()) {
			Choice c = (Choice) fws.next();
			if (c.chosen()) {
				String s = (String) c.choiceObject();
				kb.fileTELL(s);
			}
		}

		TelosFramework tfw = new TelosFramework(kb);
		OMEModel model = new TelosModel(kb, tfw, this);
		ViewManager vm = model.getViewManager();
		// save the newly created model
		models2vms.put(model, vm);
		models2kbs.put(model, kb);
		model.load();
		// initializePlugins(model);
		// restore the views:
		Iterator i = vm.getViews();
		while (i.hasNext()) {
			View view = (View) i.next();
			TelosViewSerializer s = new TelosViewSerializer(view.getID(), kb);
			view.load(s);
			straighten_all_links(view);
		}
		model.save(f);
		return model;
	}

	public void updateOpenOME(File f) {
		if (OMETab.iframe != null) {
			updateOpenOME(f.getAbsolutePath(), (GraphicViewFrame) OMETab.iframe);
		}
	}

	public void updateOpenOME(String m, GraphicViewFrame old_gvf) {
		System.setProperty("model", m);
		if (OMETab.ot == null)
			OMETab.ot = new OMETab();
		OMETab.ot.initialize();
	}

	int FSID(int g) {
		return 4 * g + 1;
	}

	int PSID(int g) {
		return 4 * g + 2;
	}

	int FDID(int g) {
		return 4 * g + 3;
	}

	int PDID(int g) {
		return 4 * g + 4;
	}

	int FS(IStarElement p) {
		return FSID(p.id);
	}

	/**
	 * return 0 if no such literal for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int PS(IStarElement p) {
		if (p.isSoftGoal)
			return PSID(p.id);
		return 0;
	}

	/**
	 * return -FS for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int FD(IStarElement p) {
//		if (p.isSoftGoal)
		return FDID(p.id);
//		return -FSID(p.id);
	}

	/**
	 * return 0 if no such literal for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int PD(IStarElement p) {
		if (p.isSoftGoal)
			return PDID(p.id);
		return 0;
	}

	int numClauses = 0;

	/**
	 * The output is decoded as labels for the goals/softgoals
	 * 
	 * @param model
	 * @param file
	 * @throws Exception
	 */
	public void saveModelToSat(TelosModel model, File file) throws Exception {
		prepare_the_goalmodel(model);
		StringBuffer graphStr = encode();
		ISolver solver = SolverFactory.newMiniLearning();
		solver.setTimeout(3600); // 1 hour timeout
		DimacsReader reader = new DimacsReader(solver);
		PrintWriter p = new PrintWriter(new FileOutputStream(Computing.getTempFilename("file.txt")), true);
		p.println(graphStr.toString());
//		D.o("input=");
//		D.o(graphStr.toString());
		try {
		reader.parseInstance(Computing.getTempFilename("file.txt"));
		if (solver.isSatisfiable()) {
			System.out.println("satisfiable");
			String result = reader.decode(solver.model());
			decode(istarelements, model, result);
		}
		} catch (Exception e) {}
	}

	/**
	 * Create the suitabe input in the DiMacs format that SAT4J solver can read
	 * 
	 * A hard goal is encoded into FS for true, and FD for false A softgoal is
	 * encoded into FS, PS, PD, FD
	 * 
	 * Here the goal model is converted in 5 steps: 1. The rules to avoid
	 * conflicts: FS or PS => not PD and not FD 2. The axioms of the label
	 * lattice, i.e., FS => PS, FD => FD 3. The correlation rules, i.e., HELP,
	 * MAKE, BREAK, HURT 4. The AND/OR rules 5. The facts, i.e., the existing
	 * labels of the goals
	 * 
	 * @return a string in the DiMacs format
	 */
	private StringBuffer encode() {
		numClauses = 0;
		StringBuffer graphStr = new StringBuffer();
		StringBuffer step1 = new StringBuffer();
		StringBuffer step2 = new StringBuffer();
		StringBuffer step3 = new StringBuffer();
		StringBuffer step4 = new StringBuffer();
		StringBuffer step5 = new StringBuffer();
		int numVariables = 0;
		for (Enumeration i = istarelements.elements(); i.hasMoreElements();) {
			IStarElement p = (IStarElement) i.nextElement();
			if (p.isAgent || p.isAspect)
				continue;
			step1.append(encode_1(p));
			step2.append(encode_2(p));
			step3.append(encode_3(p));
			step4.append(encode_4(p));
			step5.append(encode_5(p));
			// Yijun: to make sure enough literals are created
			numVariables = Math.max(numVariables, 4 * p.id + 4);
		}
		graphStr.append(step1.toString());
		graphStr.append(step2.toString());
		graphStr.append(step3.toString());
		graphStr.append(step4.toString());
		graphStr.append(step5.toString());
		System.gc();
		StringBuffer gStr = new StringBuffer();
		gStr.append("p cnf ");
		gStr.append(numVariables);
		gStr.append(" ");
		numClauses = check_clause_count(graphStr);
		gStr.append(numClauses);
		gStr.append("\n");
		gStr.append(graphStr);
		return gStr;
	}

	/**
	 * @param graphStr
	 */
	private int check_clause_count(StringBuffer graphStr) {
		String a[] = graphStr.toString().split("\n");
		return a.length;
	}

	private String implies(int i, int j) {
		if (i == 0 || j == 0) // ignore these rules
			return "";
		numClauses++;
		return (i > 0 ? "-" + i : "" + (-i)) + " " + j + " 0\n";
	}

	private String implies(int i, String j) {
		if (i == 0) // ignore these rules
			return "";
		numClauses++;
		return (i > 0 ? "-" + i : "" + (-i)) + " " + j + " 0\n";
	}

	/**
	 * encode mutual exclusions to avoid conflicts
	 * 
	 * @param p
	 * @return
	 */
	private String encode_1(IStarElement p) {
		StringBuffer b = new StringBuffer();
		if (System.getProperty("Avoid Conflicts") != null
				|| System.getProperty("Avoid Conflicts Strictly") != null) {
			b.append(implies(FS(p), -FD(p)));
			if (System.getProperty("Avoid Conflicts Strictly") != null) {
				b.append(implies(FS(p), -PD(p)));
				b.append(implies(PS(p), -FD(p)));
				b.append(implies(PS(p), -PD(p)));
			}
		}
		return b.toString();
	}

	/**
	 * encode axiom FS => PS, FD => PD
	 */
	private String encode_2(IStarElement p) {
		StringBuffer b = new StringBuffer();
		b.append(implies(FS(p), PS(p)));
		b.append(implies(FD(p), PD(p)));
		return b.toString();
	}

	/**
	 * encode correlation links
	 * 
	 * @param p
	 * @return
	 */
	private String encode_3(IStarElement p) {
		StringBuffer b = new StringBuffer();
		for (Enumeration j = istarlinks.elements(); j.hasMoreElements();) {
			IStarLink l = (IStarLink) j.nextElement();
			IStarElement from = l.from, to = l.to;
			if (from == null || to == null) {
				System.out.println("warning: the model has wrong links " + from
						+ "->" + to);
				continue;
			}
			if (from.id == p.id
					&& !(l.op.equals("&") || l.op.equals("|") || l.op
							.equals("~"))) {
				if (l.op.startsWith("++")) { // make
					b.append(implies(FS(p), FS(to)));
					b.append(implies(PS(p), PS(to)));
					b.append(implies(FS(to), FS(p)));
					b.append(implies(PS(to), PS(p)));
					if (System.getProperty("Balanced contributions") != null) {
						b.append(implies(FD(p), FD(to)));
						b.append(implies(PD(p), PD(to)));
						b.append(implies(FD(to), FD(p)));
						b.append(implies(PD(to), PD(p)));
					}
				} else if (l.op.startsWith("--")) { // break
					b.append(implies(FS(p), FD(to)));
					b.append(implies(PS(p), PD(to)));
					b.append(implies(FS(to), FD(p)));
					b.append(implies(PS(to), PD(p)));
					if (System.getProperty("Balanced contributions") != null) {
						b.append(implies(PD(p), PS(to)));
						b.append(implies(FD(p), FS(to)));
						b.append(implies(PD(to), PS(p)));
						b.append(implies(FD(to), FS(p)));
					}
				} else if (l.op.startsWith("+")) { // help
					b.append(implies(FS(p), PS(to)));
					if (p.isSoftGoal) {
						b.append(implies(PS(to), "" + FS(p) + " " + PS(p)));
						b.append(implies(PS(p), PS(to)));
					}
					if (System.getProperty("Balanced contributions") != null) {
						b.append(implies(FD(p), PD(to)));
						if (p.isSoftGoal) {
							b.append(implies(PD(to), "" + FD(p) + " " + PD(p)));
							b.append(implies(PD(p), PD(to)));
						}
					}
				} else if (l.op.startsWith("-")) { // hurt
					b.append(implies(FS(p), PD(to)));
					b.append(implies(PS(p), PD(to)));
					if (p.isSoftGoal) {
						b.append(implies(PS(to), "" + FD(p) + " " + PD(p)));
					}
					if (System.getProperty("Balanced contributions") != null) {
						b.append(implies(FD(p), PS(to)));
						b.append(implies(PD(p), PS(to)));
						if (p.isSoftGoal) {
							b.append(implies(PD(to), "" + FS(p) + " " + PS(p)));
						}
					}
				}
			}
		}
		return b.toString();
	}

	/**
	 * encode AND/OR decompositions
	 * 
	 * Exception: when all OR-decomposed children do not contribute to any softgoal, 
	 * they are regarded as AND-decomposed children for the reasoning.
	 * This exception can be turned on through a property 
	 *     "ome.reasoning.topdown.runtime_or".
	 *  
	 * @param p
	 * @return
	 */
	private String encode_4(IStarElement p) {
		StringBuffer b = new StringBuffer();
		StringBuffer step4i = new StringBuffer();
		boolean is_and = false;
		boolean is_or = false;
		StringBuffer step4iii = new StringBuffer();
		StringBuffer step4iv = new StringBuffer();
		StringBuffer step4v = new StringBuffer();
		StringBuffer step4vi = new StringBuffer();
		for (Enumeration j = istarlinks.elements(); j.hasMoreElements();) {
			IStarLink l = (IStarLink) j.nextElement();
			IStarElement from = l.from, to = l.to;
			if (from == null || to == null) {
				System.out.println("warning: the model has wrong links " + from
						+ "->" + to);
				continue;
			}
			if ((l.op.equals("&") || l.op.equals("|")) && to.id == p.id
					|| l.op.equals("~") && from.id == p.id && to.id != p.id) {
				// contributions				
				if (l.op.equals("&") || Computing.propertyHolds("ome.reasoning.topdown.runtime_or") && is_runtime_or(l)) {
					if (p.isSoftGoal) {
						step4i.append(implies(PS(p), PS(from)));
					}
					step4i.append(implies(FS(p), FS(from)));
					step4iii.append(-FS(from) + " ");
					if (p.isSoftGoal) {
						step4iv.append(-PS(from) + " ");
					}
					if (System.getProperty("Balanced contributions") != null) {
						if (p.isSoftGoal) {
							step4i.append(implies(PD(from), PD(p)));
							step4i.append(implies(FD(from), FD(p)));
							step4v.append(PD(from) + " ");
							step4vi.append(FD(from) + " ");
						}
					}
					is_and = true;
				} else if (l.op.equals("~")) {
					// Treat ~ as AND
					if (p.isSoftGoal) {
						step4i.append(implies(PS(p), PS(to)));
					}
					step4i.append(implies(FS(p), FS(to)));
					step4iii.append(-FS(to) + " ");
					if (p.isSoftGoal && to.isSoftGoal) {
						step4iv.append(-PS(to) + " ");
					}
					if (System.getProperty("Balanced contributions") != null) {
						if (p.isSoftGoal) {
							step4i.append(implies(PD(to), PD(p)));
							step4i.append(implies(FD(to), FD(p)));
							if (to.isSoftGoal)
								step4v.append(PD(to) + " ");
							step4vi.append(FD(to) + " ");
						}
					}
					is_and = true;
				} else if (l.op.equals("|")) {
					step4i.append(implies(FS(from), FS(p)));
					if (p.isSoftGoal) {
						step4i.append(implies(PS(from), PS(p)));
					}
					step4v.append(FS(from) + " ");
					if (p.isSoftGoal && from.isSoftGoal) {
						step4vi.append(PS(from) + " ");
					}
					if (System.getProperty("Balanced contributions") != null) {
						if (p.isSoftGoal) {
							step4i.append(implies(PD(p), PD(from)));
							step4i.append(implies(FD(p), FD(from)));
						}
						if (p.isSoftGoal) {
							if (from.isSoftGoal)
								step4iii.append(-PD(from) + " ");
							step4iv.append(-FD(from) + " ");
						}
					}
					is_or = true;
				}
			}
		}
		if (is_and && is_or) {
			System.out
					.println("warning: the model has both AND and OR decompositions");
			return "";
		}
		if (is_and) {
			step4iii.append(FS(p) + " 0\n");
			numClauses++;
			if (p.isSoftGoal) {
				step4iv.append(PS(p) + " 0\n");
				numClauses++;
			}
			if (System.getProperty("Balanced contributions") != null) {
				if (p.isSoftGoal) {
					step4v.append("" + -PD(p) + " 0\n");
					step4vi.append("" + -FD(p) + " 0\n");
					numClauses += 2;
				}
			}
		} else if (is_or) {
			step4v.append("" + -FS(p) + " 0\n");
			numClauses++;
			if (p.isSoftGoal) {
				step4vi.append("" + -PS(p) + " 0\n");
				numClauses++;
			}
			if (System.getProperty("Balanced contributions") != null) {
				if (p.isSoftGoal) {
					step4iii.append(PD(p) + " 0\n");
					step4iv.append(FD(p) + " 0\n");
					numClauses += 2;
				}
			}
		}
		b.append(step4i.toString());
		b.append(step4iii.toString());
		b.append(step4iv.toString());
		b.append(step4v.toString());
		b.append(step4vi.toString());
		return b.toString();
	}

	private boolean is_runtime_or(IStarLink l) {
		if (!l.op.equals("|")) return false;
		if (System.getProperty("ome.reasoning.topdown.runtime_or")==null)
			return false;
		boolean isRuntimeOR = true;
		IStarElement g = l.to;
		for (Enumeration j = istarlinks.keys(); j.hasMoreElements();) {
			IStarLink s = (IStarLink) istarlinks.get(j.nextElement());
			if (g.id == s.to.id && s.op.equals("|")) {
				for (Enumeration k = istarlinks.keys(); k.hasMoreElements();) {
					IStarLink t = (IStarLink) istarlinks.get(k.nextElement());
					if (s.from.id == t.from.id && 
							(t.op.equals("+") || t.op.equals("-")
							|| t.op.equals("++") || t.op.equals("--"))) {
						if (t.to.isSoftGoal) {
							isRuntimeOR = false;
							break;
						}
					}							
				}
				if (!isRuntimeOR)
					break;
			}
		}
		return isRuntimeOR;
	}

	private String encode_5(IStarElement p) {
		StringBuffer b = new StringBuffer();
		if (p.isSoftGoal) {
			if (p.s == 1 && p.d == 0) { // FS
				b.append(FS(p) + " " + "0\n");
				numClauses++;
			} else if (p.s == 0 && p.d == 1) { // FD
				b.append(FD(p) + " " + "0\n");
				numClauses++;
			} else if (p.s == p.d && p.s == 1) { // CF
				b.append(FS(p) + " 0\n");
				b.append(FD(p) + " 0\n");
				numClauses += 2;
			} else if (p.s == p.d && p.d >= 0.5) { // CF
				b.append(PS(p) + " 0\n");
				b.append(PD(p) + " 0\n");
				numClauses += 2;
			} else if (p.s > p.d) { // PS
				b.append(PS(p) + " " + "0\n");
				b.append(-FS(p) + " " + "0\n");
				numClauses += 2;
			} else if (p.s < p.d) { // PD
				b.append(PD(p) + " " + "0\n");
				b.append(-FD(p) + " " + "0\n");
				numClauses += 2;
			} else { // either unknown or conflict
				// nothing
			}
		} else {
			if (p.s == 1 && p.d == 0) {
				b.append(FS(p) + " " + "0\n");
				numClauses++;
			} else if (p.s == 0 && p.d == 1) {
				b.append(FD(p) + " " + "0\n");
				numClauses++;
			} else if (p.s == 1 && p.d == 1) {
				b.append(FS(p) + " " + "0\n");
				b.append(FD(p) + " " + "0\n");
				numClauses+=2;
			}
		}
		return b.toString();
	}

	private void decode(Hashtable istarelements2, TelosModel model,
			String result) {
//		 D.o("result = " + result);
		TelosParserKB kb = (TelosParserKB) models2kbs.get(model);
		List values = Arrays.asList(result.split(" "));
		for (Enumeration i = istarelements.keys(); i.hasMoreElements();) {
			String key = (String) i.nextElement();
			IStarElement p = (IStarElement) istarelements.get(key);
			if (p.isAgent || p.isAspect)
				continue;
			p.s = p.d = 0;
			if (p.isSoftGoal && values.contains(String.valueOf(PS(p))))
				p.s = 0.5f;
			if (p.isSoftGoal && values.contains(String.valueOf(PD(p))))
				p.d = 0.5f;
			if (values.contains(String.valueOf(FS(p))))
				p.s = 1;
			if (values.contains(String.valueOf(FD(p))))
				p.d = 1;
			TelosParserIndividual telosEle = (TelosParserIndividual) istarindividuals
					.get(key);
			if (telosEle != null) {
				String[] type = { "label" };
				String label = "";
				TelosString newValue = new TelosString("");
				try {
					newValue.value = Computing.SDtoLabel(p.s, p.d);
				} catch (Exception e) {
				}
				String satcat[] = { "sat" };
				String dencat[] = { "den" };
				kb.newAttribute(telosEle, type, label, newValue);
				kb.newAttribute(telosEle, satcat, "", new TelosReal(p.s));
				kb.newAttribute(telosEle, dencat, "", new TelosReal(p.d));
			}
		}
		try {
			model.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveModelToDot(OMEModel model, GraphicView view, File f) {
		Individual[] individuals;
		try {
			ArrayList a = new ArrayList();
			if (System.getProperty("Only layout visible elements") != null) {
				for (Iterator i = ((GraphicView) view).getAllObjects(); i
						.hasNext();) {
					GraphicViewObject o = (GraphicViewObject) i.next();
					if (o.isVisible())
						a.add(((TelosObject) o.getModelObject())
								.getIndividual());
				}
				individuals = new Individual[a.size()];
				System.arraycopy(a.toArray(), 0, individuals, 0, a.size());
			} else {
				individuals = loadIndividualsFromModel(model);
			}
			FileWriter writer = Computing.createWriterWithExtension(f, ".dot");
			writer.write(JTelosUtil.saveToDot(individuals));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Save to the WBI process model
	 * @param model
	 * @param f
	 */
	public void saveModelToXML(TelosModel model, File f) {
		try {
			prepare_the_goalmodel(model);
			output_to_xml(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveModelToXMI(TelosModel model, File f) {
		try {
			prepare_the_goalmodel(model);
			String xmifile = Computing.createFileWithExtension(f, ".goalmodel");
			output_to_xmi(f, xmifile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	GoalmodelPackage e = GoalmodelPackage.eINSTANCE;

	GoalmodelFactory f = e.getGoalmodelFactory();

	Resource resource;

	private com.ibm.wbim.bom.schema1.Process myprocess;
	private void create_goal_model(Resource resource) {
		HashMap hm = new HashMap();
		for (Enumeration i = istarelements.keys(); i.hasMoreElements();) {
			IStarElement g = (IStarElement) istarelements.get(i.nextElement());
			if (/* g.isSoftGoal || */ g.isAgent || g.isAspect)
				continue;
			goal x = f.creategoal();
			x.setName(Computing.strip_quote(g.name));
			boolean isLeaf = true;
			for (Enumeration j = istarlinks.keys(); j.hasMoreElements();) {
				IStarLink s = (IStarLink) istarlinks.get(j.nextElement());
				D.o(s);
				if (g.id == s.from.id && (s.op.equals("&") || s.op.equals("|"))) {
					if (s.op.equals("&"))
						x.setType(DecompositionType.get(DecompositionType.AND));
					else
						x.setType(DecompositionType.get(DecompositionType.OR));
					isLeaf = false;
					break;
				}
			}
			if (isLeaf) {
				x.setType(DecompositionType.get(DecompositionType.LEAF));
			}
			hm.put(new Integer(g.id), x);
			resource.getContents().add(x);
		}
		for (Enumeration i = istarlinks.keys(); i.hasMoreElements();) {
			IStarLink s = (IStarLink) istarlinks.get(i.nextElement());
			goal x = (goal) hm.get(new Integer(s.from.id));
			goal y = (goal) hm.get(new Integer(s.to.id));
			if (s.op.equals("&") || s.op.equals("|")) {
				if (y!=null && y.getGoal()!=null)
					y.getGoal().add(x);
			} else {
				contribution c = f.createcontribution();
				resource.getContents().add(c);
				if (x!=null && x.getRule()!=null)
					x.getRule().add(c);
				if (s.op.equals("+"))
					c.setType(ContributionType.get(ContributionType.HELP));
				else if (s.op.equals("++"))
					c.setType(ContributionType.get(ContributionType.MAKE));
				else if (s.op.equals("-"))
					c.setType(ContributionType.get(ContributionType.HURT));
				else if (s.op.equals("--"))
					c.setType(ContributionType.get(ContributionType.BREAK));
				c.setTarget(y);
			}
		}
	}

	/**
	 * Traverse the goal model to output the WBI model
	 * There are five rules:
	 *   1. A leaf goal is converted into a task, the start/stop are the same
	 *   2. A sequentially decomposed AND goal is converted into a sequence of tasks, the start of the 
	 *       parent goal is the first child task's start, and the stop of the parent goal is the last child task's
	 *       stop. A child task's stop is connected with the next child task's start
	 *   3. A parallelly decomposed AND goal is converted into a fork of the child tasks and join them:
	 *       The start of the parent goal is the fork, the stop of the parent goal is the join;
	 *       The fork is connected with the start of each child task and the join is connected with the
	 *       stop of each child task
	 *   4. A runtime decomposed OR goal is converted into an decision task followed by a branch to 
	 *      the child tasks.
	 *      The start of the parent goal is the decision task, the stop of the parent goal is the join;
	 *      The decison task is connected with the branch; the branch is connected with each child task's start;
	 *      each child task's stop is connected with the join;
	 *   5. A singleton AND or OR decomposed goal is simply skipped:
	 *      The start/stop of the parent goal is simply that of its child task. 
	 * @param resource
	 */
	private void create_wbi_model(Resource resource) {
		HashMap hm = new HashMap(); // id => goal
		HashSet hs = new HashSet(); // processed goal
		HashSet sat = new HashSet(); // satisficed goal
		boolean converting;
		IStarElement root = null;
		do {
		converting = false;
		for (Enumeration i = istarelements.keys(); i.hasMoreElements();) {
			IStarElement g = (IStarElement) istarelements.get(i.nextElement());
			if (g.isSoftGoal || g.isAgent || g.isAspect) { // only deal with goals and tasks
				continue;
			}
			if(Computing.SDtoLabel(g.s, g.d).indexOf("Satisficed")<0) 
				// ignore all unsatisfied or unknown goals
				continue;
			hm.put(new Integer(g.id), g);
			sat.add(g);
		}
		for (Iterator i = sat.iterator(); i.hasNext();) {
			IStarElement g = (IStarElement) i.next();
			if (hs.contains(g)) // the goal has been processed
				continue;
			boolean isLeaf = true;
			boolean isAND = false;
			boolean isSeq = false;
			boolean isPar = false;
			boolean isOR = false;
			for (Enumeration j = istarlinks.keys(); j.hasMoreElements();) {
				IStarLink s = (IStarLink) istarlinks.get(j.nextElement());
				if (g.id == s.to.id && (s.op.equals("&") || s.op.equals("|"))) {
					if (s.op.equals("&"))
						isAND = true;
					else
						isOR = true;					
					IStarElement h = (IStarElement) hm.get(new Integer(s.from.id));
					if (h!=null && !hs.contains(h)) {
						isLeaf = false;
						break;
					}
				}
			}
			boolean isRuntimeOR = true;
			if (isOR && isLeaf) {
				for (Enumeration j = istarlinks.keys(); j.hasMoreElements();) {
					IStarLink s = (IStarLink) istarlinks.get(j.nextElement());
					if (g.id == s.to.id && s.op.equals("|")) {
						for (Enumeration k = istarlinks.keys(); k.hasMoreElements();) {
							IStarLink t = (IStarLink) istarlinks.get(k.nextElement());
							if (s.from.id == t.from.id && 
									(t.op.equals("+") || t.op.equals("-")
									|| t.op.equals("++") || t.op.equals("--"))) {
								IStarElement h = (IStarElement) hm.get(new Integer(t.to.id));
								if (h!=null && h.isSoftGoal) {
									isRuntimeOR = false;
									break;
								}
							}							
						}
						if (!isRuntimeOR)
							break;
					}
				}
			}
			// count the number of children
			Vector children = new Vector();
			Vector v = new Vector();
			if ((isAND || isOR) && isLeaf) {
				for (Enumeration j = istarlinks.keys(); j.hasMoreElements();) {
					IStarLink s = (IStarLink) istarlinks.get(j.nextElement());
					if (g.id == s.to.id && (s.op.equals("&") || s.op.equals("|"))) {
						IStarElement h = (IStarElement) hm.get(new Integer(s.from.id));
						if (sat.contains(h))
							children.add(h);
					}
				}
				v = sort_decomposition_list(children);		
			}
			if (isLeaf) {
				hs.add(g);
				isSeq = g.control!=null && g.control.equals(";");
				isPar = g.control!=null && g.control.equals("||");
				converting = true;
				String s = "";
				String childrenNames[] = new String[v.size()];
				for (int j=0; j<v.size(); j++) {
					IStarElement c = (IStarElement) v.elementAt(j);
					childrenNames[j] = Computing.strip_quote(c.name);
				}
				if (isAND && children.size() >1) {
					if (isSeq) { // AND-SEQ
						s += "AND-SEQ";
						test.sequentialComposition(myprocess, Computing.strip_quote(g.name), 
								childrenNames);
					} else if (isPar) { // AND-PAR
						s += "AND-PAR";
						test.parallelComposition(myprocess, Computing.strip_quote(g.name), 
								childrenNames);
					}
				} else if (isOR && children.size() > 1) {
					if (isRuntimeOR) { // RUNTIME-OR
						s += "OR-RUNTIME";
						test.runtimeORComposition(myprocess, Computing.strip_quote(g.name), 
								childrenNames, false);
					} else { // DESIGN-TIME OR
						s += "OR-DESIGNTIME";
					}
				} else if (children.size()==1) { // REFINEMENT
					s += "REFINEMENT";
					test.refinement(Computing.strip_quote(g.name), 
							Computing.strip_quote(((IStarElement)children.get(0)).name));
				} else { // LEAF
					s += "LEAF";
					test.addLeaf(myprocess, Computing.strip_quote(g.name));
				}
				root = g;
				D.o(s + " : " + Computing.strip_quote(g.name));
				if (isOR || isAND)
					for (int j=0; j<v.size(); j++) {
						IStarElement c = (IStarElement) v.elementAt(j);
						D.o(" -- " + Computing.strip_quote(c.name));
					}
			}
		}
		} while (converting);
		if (root!=null) {
			test.addStartNode(myprocess, Computing.strip_quote(root.name));
			test.addStopNode(myprocess, Computing.strip_quote(root.name));
		}
	}
	private void output_to_xmi(File file, String out_file) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(new File(out_file).getAbsolutePath());
		resource = resourceSet.createResource(fileURI);
		create_goal_model(resource);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		}
	}
	private void output_to_xml(File file) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		String n = file.getAbsolutePath();
		URI fileURI = URI.createFileURI(n + ".xmi");
		resource = resourceSet.createResource(fileURI);
		ModelType model = test.createModel();
		myprocess = test.init_process(model);		
		create_wbi_model(resource);
		test.output_model(resource, model);
		String xslt = System.getProperty("ome.wbim.postprocess");
		if (xslt==null)
			xslt = "WBIM.xsl";
		TransformerFactory factory = TransformerFactory
				.newInstance();
		try {
			D.o("xsltproc " + xslt + " " + n + ".xmi " + " > " + n);
			Transformer transformer_info;
			InputStream xs = OMETab.class.getResourceAsStream(xslt);
			if (xs==null)
				D.o(xslt + " not found");
			transformer_info = factory
				.newTransformer(new StreamSource(xs));
			transformer_info.transform(
					new StreamSource(new File(n + ".xmi")),
					new StreamResult(file));
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		}
	}