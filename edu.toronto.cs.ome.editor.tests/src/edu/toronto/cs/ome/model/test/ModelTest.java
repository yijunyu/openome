/*
 * Created on Jun 16, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package edu.toronto.cs.ome.model.test;
import java.io.File;
import java.util.ArrayList;

import junit.framework.TestCase;
import edu.toronto.cs.ome.controller.ModelManager;
import edu.toronto.cs.ome.model.TelosModel;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;

/**
 * @author Yijun Yu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ModelTest extends TestCase {

	protected static ArrayList listed_files = null;
	
	String testDir = "test/edu.toronto.cs.ome.model";
	String inputExt = ".tel";
	public ModelTest(String dir, String ext) {
		super();
		testDir = dir;
		inputExt = ext;
	}
	public ModelTest() { }	
	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		if (listed_files == null) { // just do it once
			listed_files = Computing.listContents(new File(testDir), inputExt);
		}		
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	/**
	 * @param modelfile
	 * @return
	 */
	public static TelosModel loadModelFromFile(String modelfile) {
		File file = new File(modelfile);
		TelosModel model = null;
		if (file != null && file.exists()) {
			String args[] = new String[1];
			args[0] = file.getAbsolutePath();
			//OMETab.main(args);
			ModelManager mm = new ModelManager(null);
			File f = ModelManager.apply_xslt(new File(modelfile));
			modelfile = f.getAbsolutePath();
			model = (TelosModel) mm.openModel(modelfile);
		}
		return model;
	}
	
	public void testAll() {
		if (listed_files!=null)
		for (int f=0; f<listed_files.size(); f++) {
			String n = (String ) listed_files.get(f);
			TelosModel model = loadModelFromFile(n);
			if (model==null) {
				D.o("Warning: model is null, probably the file" + n + "is not found");
				return;
			}
			testAll(model);
		}
	}

	public void testAll(TelosModel model) {
		// to be overridden by the concrete model test classes
	}	
}
