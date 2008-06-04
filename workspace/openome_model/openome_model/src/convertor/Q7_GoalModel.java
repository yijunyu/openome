package convertor;

import parser.Q7;
import codegen.GoalModel;

public class Q7_GoalModel implements IConvertor {
	public void convert(String input, String output) {
		Q7.main(new String[] {input});
		try {
			GoalModel cg = new GoalModel(Q7.a);
//			System.out.println("Intention model loaded");
			cg.generateGoalModel(output);
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}
}
