package edu.toronto.cs.q7.codegen.test;

import edu.toronto.cs.q7.codegen.XMLCodeGenerator;
import edu.toronto.cs.q7.parser.Q7;
import edu.toronto.cs.util.FileBasedTest;

public class XMLCodeGeneratorTest extends FileBasedTest {

	public void transform(String input, String output) {
		Q7.main(new String[] {input, output});
	    XMLCodeGenerator xcg = new XMLCodeGenerator(Q7.a);
	    xcg.generateGoalModel(output);
	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.XMLCodeGenerator.generateGoalModel(String)'
	 */
	public void testGenerateGoalModelString() {
		Transform(this, "transform", "test/edu.toronto.cs.q7.codegen.XML", 
				".q7", 
				".xml", 
				"-expected.xml");
	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.XMLCodeGenerator.generateGoalModel(Advice)'
	 */
	public void testGenerateGoalModelAdvice() {
		// TODO Auto-generated method stub

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.XMLCodeGenerator.unique_goal_name_for_xml(String, String, String)'
	 */
	public void testUnique_goal_name_for_xml() {
		String n = "&lt;B&gt;::b";
		String attr = " name=" + (n.startsWith("\"")? n : "\"" + n) + (n.endsWith("\"")? "" : "\"");
		junit.framework.Assert.assertTrue("output matches input", attr.equals(" name=\"&lt;B&gt;::b\""));				
	}
}
