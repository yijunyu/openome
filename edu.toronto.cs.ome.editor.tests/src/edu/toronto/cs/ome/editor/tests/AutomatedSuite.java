package edu.toronto.cs.ome.editor.tests;

import edu.toronto.cs.ome.controller.test.ModelManagerTest;
import junit.framework.Test;
import junit.framework.TestSuite;


/**
 * Test all areas of Ant.
 * 
 * To run this test suite:
 * <ol>
 * <li>Create a new JUnit plugin test launch configuration</li>
 * <li>Set the Test class to "org.eclipse.ant.tests.core.AutomatedSuite"</li>
 * <li>Set the Project to "org.eclipse.ant.tests.core"</li>
 * <li>Run the launch configuration. Output from the tests will be displayed in a JUnit view</li>
 * </ol>
 */
public class AutomatedSuite extends TestSuite {
	
	/**
	 * Flag that indicates test are in progress
	 */
	protected boolean testing = true;

	/**
	 * Returns the suite.  This is required to
	 * use the JUnit Launcher.
	 */
	public static Test suite() {
		return new AutomatedSuite();
	}

	/**
	 * Construct the test suite.
	 */
	public AutomatedSuite() {
		addTest(new TestSuite(ModelManagerTest.class));
	}
}

