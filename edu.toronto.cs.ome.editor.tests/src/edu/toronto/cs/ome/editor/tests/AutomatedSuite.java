package edu.toronto.cs.ome.editor.tests;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import junit.framework.Test;
import junit.framework.TestSuite;
import edu.toronto.cs.ome.controller.test.ModelManagerTest;
import edu.toronto.cs.ome.model.test.ModelTest;
import edu.toronto.cs.ome.model.test.TelosLinkTest;
import edu.toronto.cs.ome.view.test.GraphicViewCanvasTest;
import edu.toronto.cs.ome.view.test.GraphicViewElementTest;
import edu.toronto.cs.ome.view.test.ViewTest;
import edu.toronto.cs.telos.test.TelosParserKBTest;
import edu.toronto.cs.telos.test.TelosTest;


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
		addTest(new TestSuite(ModelTest.class));
		addTest(new TestSuite(TelosLinkTest.class));
		addTest(new TestSuite(GraphicViewCanvasTest.class));
		addTest(new TestSuite(GraphicViewElementTest.class));
		addTest(new TestSuite(ViewTest.class));
		addTest(new TestSuite(TelosParserKBTest.class));
		addTest(new TestSuite(TelosTest.class));
	}	
}

