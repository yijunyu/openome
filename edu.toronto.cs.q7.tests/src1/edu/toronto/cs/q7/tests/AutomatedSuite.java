package edu.toronto.cs.q7.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import edu.toronto.cs.q7.codegen.test.CodeGeneratorTest;
import edu.toronto.cs.q7.codegen.test.FeatureCodeGeneratorTest;
import edu.toronto.cs.q7.codegen.test.IStarCodeGeneratorTest;
import edu.toronto.cs.q7.codegen.test.IStarGraphCodeGeneratorTest;
import edu.toronto.cs.q7.codegen.test.XMLCodeGeneratorTest;
import edu.toronto.cs.q7.model.test.AdviceTest;
import edu.toronto.cs.q7.parser.test.ParserTest;
import edu.toronto.cs.util.test.ComputingTest;


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
		addTest(new TestSuite(CodeGeneratorTest.class));
		addTest(new TestSuite(FeatureCodeGeneratorTest.class));
		addTest(new TestSuite(IStarCodeGeneratorTest.class));
		addTest(new TestSuite(IStarGraphCodeGeneratorTest.class));
		addTest(new TestSuite(XMLCodeGeneratorTest.class));
		addTest(new TestSuite(AdviceTest.class));
		addTest(new TestSuite(ParserTest.class));
		addTest(new TestSuite(ComputingTest.class));
	}	
}

