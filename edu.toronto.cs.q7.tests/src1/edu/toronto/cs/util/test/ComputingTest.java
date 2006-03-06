package edu.toronto.cs.util.test;

import junit.framework.TestCase;
import edu.toronto.cs.util.Computing;

public class ComputingTest extends TestCase {

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.getTempFilename(String)'
	 */
	public void testGetTempFilename() {
		// without the tmpDir property
		String s = Computing.getTempFilename("test.dot");
//		System.out.println(s);
//		junit.framework.Assert.assertTrue(s.equals("tmp\\test.dot"));
		// with the tmpDir property, existing directory
		System.setProperty("tmpDir", "test");
		s = Computing.getTempFilename("test.dot");
//		System.out.println(s);
		junit.framework.Assert.assertTrue(s.equals("test\\test.dot"));
		System.setProperty("tmpDir", "edu.toronto.cs.ome/.metadata");
		s = Computing.getTempFilename("test.dot");
//		System.out.println(s);
		junit.framework.Assert.assertTrue(s.equals("test.dot"));
	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.prepend(String, String)'
	 */
	public void testPrepend() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.createWriterWithExtension(File, String)'
	 */
	public void testCreateWriterWithExtension() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.changeFileExtension(File, String)'
	 */
	public void testChangeFileExtension() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.unique_goal_name(String, String, String)'
	 */
	public void testUnique_goal_name() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.quotation(String)'
	 */
	public void testQuotation() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.strip_quote(String)'
	 */
	public void testStrip_quote() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.listContents(File, String)'
	 */
	public void testListContents() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.strip_type_prefixes(String[], String)'
	 */
	public void testStrip_type_prefixes() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.nodiff(String, String)'
	 */
	public void testNodiff() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.copy_file(String, String)'
	 */
	public void testCopy_file() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.SDtoLabel(float, float)'
	 */
	public void testSDtoLabel() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.labelToSD(String)'
	 */
	public void testLabelToSD() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.printSystemProperties()'
	 */
	public void testPrintSystemProperties() {

	}

	/*
	 * Test method for 'edu.toronto.cs.util.Computing.createFileWithExtension(File, String)'
	 */
	public void testCreateFileWithExtension() {

	}

	/*
	 * Test method for 'java.lang.Object.Object()'
	 */
	public void testObject() {

	}

	/*
	 * Test method for 'java.lang.Object.getClass()'
	 */
	public void testGetClass() {

	}

	/*
	 * Test method for 'java.lang.Object.hashCode()'
	 */
	public void testHashCode() {

	}

	/*
	 * Test method for 'java.lang.Object.equals(Object)'
	 */
	public void testEquals() {

	}

	/*
	 * Test method for 'java.lang.Object.clone()'
	 */
	public void testClone() {

	}

	/*
	 * Test method for 'java.lang.Object.toString()'
	 */
	public void testToString() {

	}

	/*
	 * Test method for 'java.lang.Object.notify()'
	 */
	public void testNotify() {

	}

	/*
	 * Test method for 'java.lang.Object.notifyAll()'
	 */
	public void testNotifyAll() {

	}

	/*
	 * Test method for 'java.lang.Object.wait(long)'
	 */
	public void testWaitLong() {

	}

	/*
	 * Test method for 'java.lang.Object.wait(long, int)'
	 */
	public void testWaitLongInt() {

	}

	/*
	 * Test method for 'java.lang.Object.wait()'
	 */
	public void testWait() {

	}

	/*
	 * Test method for 'java.lang.Object.finalize()'
	 */
	public void testFinalize() {

	}

}
