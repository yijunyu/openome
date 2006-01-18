/*
 * Created on Jan 30, 2005
 */
package edu.toronto.cs.q7.codegen.test;
import edu.toronto.cs.q7.codegen.FeatureCodeGenerator;
import edu.toronto.cs.q7.codegen.TelosCodeGenerator;
import edu.toronto.cs.q7.parser.Q7;
import edu.toronto.cs.util.FileBasedTest;

/**
 * @author Yijun Yu
 */
public class FeatureCodeGeneratorTest extends FileBasedTest {
	
	public void testFeatureCodeGenerator() {
		Transform(this, "transform", "test/edu.toronto.cs.q7.codegen", 
				".q7", 
				"-output.xml", 
				"-expected.xml");
	}
	/**
	 * Captain Feature output
	 * @param output_file
	 * @param input_file
	 */
	protected void transform(String input_file, String output_file) {
		Q7.main(new String[] {input_file, output_file});
	    TelosCodeGenerator tcg = new FeatureCodeGenerator(Q7.a);
	    tcg.generateGoalModel(output_file);
	}
}
