package edu.toronto.cs.openome_model.versioning.test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.IFileEditorInput;
import org.junit.BeforeClass;
import org.junit.Test;

import sc.document.Configuration;
import sc.document.GoalModel;
import sc.document.SCDirectory;
import edu.toronto.cs.openome_model.presentation.openome_modelEditor;
import edu.toronto.cs.openome_model.versioning.MolhadoActions;
import fluid.version.Version;

/**
 * 	copied from MolhadoWorkspaceModifyOperation overriding the doSave command
 * @author nernst
 *
 */
public class CreateEditorModelTest {

	private static final int NOT_VERSIONED = 0;
	private static final int INITIAL_VERSION = 1;
	static MolhadoActions ma = MolhadoActions.getInstance();
	static String model_name, project_name, file_name, location, property, testFile;
	static Configuration config;
	static Hashtable<String, Configuration> configurations = new Hashtable<String, Configuration>();
	static Resource resource;
	static openome_modelEditor gme;
	static IFileEditorInput modelFile = null;
	static ResourceSet resourceSet;
	
	/**
	 * @throws java.lang.Exception
	 * @author nernst
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try { 
			setNames();
			loadModel();
			//createModel();
			//simpleSave();
			//realisticSetup(); //use a loaded EMF model to manipulate the versions
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 
	 * utility method to automate setting the various file names needed
	 * We need two things: a package (e.g. openome), a model name (e.g. trac)
	 * <br>These will uniquely identify this set of elements in Molhado
	 * caveat: renaming the file really screws this system up!
	 *
	 */
	private static void setNames() throws Exception {
		property = System.getProperty("fluid.ir.path");
		location = System.getProperty("test.data.dir");
		testFile = System.getProperty("test.filename");
		if(location == null || property == null || testFile == null) throw new Exception("One of the file names was not on the arg path");
		project_name  = "test"; //I believe this is just a way to keep configurations separate.
		file_name = testFile;
		//model_name = file_name.substring(0, file_name.indexOf(".oom"));
		setModelDetails();
		//ma.setFile_name(file_name); ma.setModel_name(model_name); ma.setProject_name(project_name);
	}
	
	/** 
	 * @author nernst
	 * Load the goalmodel resource into memory
	 */
	static void loadModel() {
		// Create a resource set.
		resourceSet = new ResourceSetImpl();
		// Register the default resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(location + testFile);
		resource = resourceSet.getResource(fileURI,true);
		//ma.setResourceSet(resourceSet);
	}
	
	/** 
	 * get the current EMF i* model elements for commit
	 * set the various properties, file name &c.
	 * 
	 */
	protected static void setModelDetails() {
		modelFile = (IFileEditorInput) gme.getEditorInput(); 
		//is the editor dirty, that is, modified?
		project_name = modelFile.getFile().getProject().getName(); //is empty?
		model_name = modelFile.getFile().getName().toString();
		model_name = model_name.substring(0, model_name.indexOf(".oom"));
		file_name = modelFile.getFile().getFullPath().toString();
	}
	
	/**
	 * @author nernst
	 * Create a simple EMF model by linking to a file in the file system
	 */
	//@Test
	public void testSimpleSave() throws Exception {
		config = ma.configurations.get(project_name);
		if(config == null) throw new Exception("no configuration specified"); //this exception only happens if we don't create the model first
		Version.bumpVersion(); // Tien: important after check out if one wants to modify the mirror 

		GoalModel the_gm = ma.find_the_gm(file_name, config);
		if (the_gm != null) {
			ma.updateIndex(the_gm, the_gm.getRoot());
			ma.modify_edited_goal_model(the_gm, gme);  //here is where the new edit operations are stored...
		} else throw new Exception("no goal model found with name: " + file_name);
		ma.checkin_current_version(config, model_name);
		ma.checkOutAllVersionsFromRepository(config, "");
	}
	
	//@Test
	public void testCreateModelFromFile() {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the default resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(location + testFile);
		resource = resourceSet.getResource(fileURI,true);
		//ma.setResourceSet(resourceSet);
		assert(resource != null);
	}
	
	@Test
	public void testCheckout_last_version() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckout_version() {
		//ma.checkout_last_version(config, model_name); 
	}

	@Test
	public void testCheckin_current_version() {
		fail("Not yet implemented");
	}

	@Test
	public void testIncrementVersion() {
		fail("Not yet implemented");
	}

	@Test
	public void testUnparse_checkout_into_emf() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckLatestVersion() {
		
	}

	@Test
	public void testGet_model_name() {
		fail("Not yet implemented");
	}

	@Test
	public void testTraverseGMResourcesForNodes() {
		fail("Not yet implemented");
	}

	@Test
	public void testTraverseGMResourcesForEdges() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnectToRepository() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckInGoalModel() {
		int versionNumber = ma.getVersion(project_name, model_name,config);
		configurations.put(project_name, config);
		if(config != null) {
			if (versionNumber == NOT_VERSIONED) {
				ma.checkInGoalModel(model_name, config, resourceSet);
				ma.update_version(model_name, INITIAL_VERSION);
			} else
				ma.update_version(model_name, versionNumber);
		} else { //this means there is no previous version.
			SCDirectory project_root = ma.connectToRepository(file_name);
			Configuration config = new Configuration(project_name, project_root);
			// create a new goal model and check it in
			ma.checkInGoalModel(model_name, config, resourceSet);
			configurations.put(project_name, config);
			ma.update_version(model_name, INITIAL_VERSION);
			assertThat(3, equalTo(4));
		}
	}
	
	@BeforeClass
	public static void deleteOld() throws Exception {
		//clear the repository 
	      Runtime run = Runtime.getRuntime();
	      try {
	    	  Process pp=run.exec("/home/nernst/workspace/molhado/clean.sh");
	    	  BufferedReader in =new BufferedReader(new InputStreamReader(pp.getErrorStream()));
	    	  String line;
	    	  while ((line = in.readLine()) != null)
	    		  System.out.println(line);
	         int exitVal = pp.waitFor();
	         System.out.println("Process exitValue: " + exitVal);
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.out.println(e.getMessage());
	      }
	}
}
