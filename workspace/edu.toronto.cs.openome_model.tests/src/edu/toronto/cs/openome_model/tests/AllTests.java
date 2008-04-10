package edu.toronto.cs.openome_model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for edu.toronto.cs.openome_model.test");
		//$JUnit-BEGIN$
		//suite.addTest(new CreateEditorModelTest("testCheckout_version"));
		//$JUnit-END$
		return suite;
	}

}
