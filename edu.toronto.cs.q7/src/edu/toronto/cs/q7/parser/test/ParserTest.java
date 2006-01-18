/*
 * Created on Jan 30, 2005
 */
package edu.toronto.cs.q7.parser.test;
import edu.toronto.cs.q7.codegen.CodeGenerator;
import edu.toronto.cs.q7.parser.Q7;
import edu.toronto.cs.util.FileBasedTest;

/**
 * @author Yijun Yu
 */
public class ParserTest extends FileBasedTest {
	
	/**
	 * @param output_file
	 * @param input_file
	 */
	public void transform(String input_file, String output_file) {
		Q7.main(new String[] {input_file, output_file});
	    CodeGenerator tcg = new CodeGenerator(Q7.a);
	    tcg.generateGoalModel(output_file);
	}
	
	public void testCodeGeneration() {
		Transform(this, "transform", "test/edu.toronto.cs.q7.parser", 
				".q7", 
				"-output.q7", 
				"-expected.q7");		
	}
}
