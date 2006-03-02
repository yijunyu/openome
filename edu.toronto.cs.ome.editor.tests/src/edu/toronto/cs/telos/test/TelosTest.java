/*
 * Created on Jun 16, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package edu.toronto.cs.telos.test;
import java.io.File;
import java.util.ArrayList;

import jtelos.KB;
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
public class TelosTest extends TestCase {
	protected static ArrayList listed_files = null; 
	String testDir = "test/edu.toronto.cs.telos";
	String inputExt = ".tel";
	public TelosTest(String dir, String ext) {
		super();
		testDir = dir;
		inputExt = ext;
	}
	
	public TelosTest() { }
	
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
	public static KB loadKBFromFile(String modelfile) {
		File file = new File(modelfile);
		if (file != null && file.exists()) {
			String args[] = new String[1];
			args[0] = file.getAbsolutePath();
			//OMETab.main(args);
			ModelManager mm = new ModelManager(null);
			File f = ModelManager.apply_xslt(new File(modelfile));
			modelfile = f.getAbsolutePath();
			TelosModel model = (TelosModel) mm.openModel(modelfile);
			if (model != null) {
				return mm.kb;
			}
		}
		return null;
	}
	public void testAll() {
		if (listed_files!=null)
		for (int f=0; f<listed_files.size(); f++) {
			String n = (String ) listed_files.get(f) + ".tel";
			KB kb = loadKBFromFile(n);
			if (kb==null) {
				D.o("Warning: kb is null, probably the file" + n + "is not found");
				return;
			}
			testAll(kb);
		}
	}

	public void testAll(KB kb) {
		// to be overridden by the concrete model test classes
	}	
}
