/*
 * Created on Jan 30, 2005
 */
package edu.toronto.cs.q7.codegen.test;
import java.util.Iterator;

import org.eclipse.core.runtime.Path;

import junit.framework.Assert;
import edu.toronto.cs.q7.q7;
import edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator;
import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.Effect;
import edu.toronto.cs.q7.parser.Q7;
import edu.toronto.cs.q7.tests.Q7TestPlugin;
import edu.toronto.cs.util.FileBasedTest;

/**
 * @author Yijun Yu
 */
public class IStarCodeGeneratorTest extends FileBasedTest {
	
	/**
	 * @param output_file
	 * @param input_file
	 */
	public void transform(String input_file, String output_file) {
		q7.load_properties();
		Q7.main(new String[] {input_file, output_file});
	    IStarGraphCodeGenerator tcg = new IStarGraphCodeGenerator(Q7.a);
		System.setProperty("java.library.path", "" + Q7TestPlugin.getDefault().getFileInPlugin(
				new Path("lib/plugins/edu.toronto.cs.ome")));
	    tcg.generateGoalModel(output_file);
	    check_results(tcg);
	}
	public void testIStarCodeGenerator() {
		System.setProperty("java.library.path", "" + Q7TestPlugin.getDefault().getFileInPlugin(
				new Path("lib/plugins/edu.toronto.cs.ome")));
		Transform(this, "transform", 
				Q7TestPlugin.getDefault().getFileInPlugin(new Path(
						"test/edu.toronto.cs.q7.codegen.IStar")), 
				".q7", 
				".tel", 
				"-no-expected.tel");
	}
	private void check_results (IStarGraphCodeGenerator cg) {
		for (Iterator i = cg.advices.iterator(); i.hasNext();) {
			Advice a = (Advice) i.next();
			checkAdvice(null, a);
		}
	}	
	private void checkAdvice(Advice p, Advice a) {
		if (a == null) return;
		Assert.assertFalse("replaced", a.e.why.indexOf("..")>=0);
		if (a.how!=null && a.how.advices!=null)
		for (Iterator i = a.how.advices.iterator(); i.hasNext();) {
			Advice ad = (Advice) i.next();
			checkAdvice(a, ad);
		}		
		if (a.how_much!=null && a.how_much.size()>=0)
			for (Iterator i = a.how_much.iterator(); i.hasNext();) {
				Effect e = (Effect) i.next();
				checkAdvice(a, e);
			}		
	}
	private void checkAdvice(Advice p, Effect a) {
		if (a == null) return;
		Assert.assertFalse("replaced", a.e.why.indexOf("..")>=0);
	}
}
