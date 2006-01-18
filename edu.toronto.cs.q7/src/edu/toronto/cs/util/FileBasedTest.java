/*
 * Created on Jan 30, 2005
 */
package edu.toronto.cs.util;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import junit.framework.TestCase;

/**
 * @author Yijun Yu
 */
public class FileBasedTest extends TestCase {	
	public FileBasedTest() {
		super();
	}	
	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}
	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	/**
	 * If a given Q7 input is also the expected output, 
	 * and it is parsed correctly and the output is correctly 
	 * generated, then it should be equal to the output.  
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public void Transform(Object o, String method_name, String testDir, 
			String inputExt, String outputExt, String expectedExt)  {	// roundtrip test
		ArrayList listed_files = new ArrayList(); 	
		listed_files = Computing.listContents(new File(testDir), expectedExt);
		if (listed_files !=null)
		for (int i=0; i<listed_files.size(); i++) {
			String n = (String ) listed_files.get(i);
			Method m;
			try {
				Method ms [] = o.getClass().getMethods();
				for (int j=0; j<ms.length; j++) {
					if (ms[j].getName().equals(method_name)) {
						m = ms[j];
						m.invoke(o, new String[] {
								n.replaceAll(expectedExt, inputExt), 
								n.replaceAll(expectedExt, outputExt)});						
					}
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			Computing.nodiff(n.replaceAll(expectedExt, outputExt), n);
		}
	}
}
