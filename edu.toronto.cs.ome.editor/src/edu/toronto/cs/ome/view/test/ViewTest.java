/*
 * Created on Jun 16, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package edu.toronto.cs.ome.view.test;
import java.io.File;
import java.util.ArrayList;

import junit.framework.TestCase;
import edu.toronto.cs.util.Computing;

/**
 * @author Yijun Yu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ViewTest extends TestCase {
	protected static ArrayList listed_files = null; 
	String testDir = "test/edu.toronto.cs.ome.view";
	String inputExt = ".tel";
	public ViewTest(String dir, String ext) {
		super();
		testDir = dir;
		inputExt = ext;
	}
	
	public ViewTest() { }
	
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

	public void testAll () {
		
	}	
}
