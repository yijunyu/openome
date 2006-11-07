package convertor;

import parser.Q7;
import codegen.IStar;
import convertor.IConvertor;

public class Q7_Telos implements IConvertor {
	public void convert(String input, String output) {
		Q7.main(new String[] {input});	
		IStar cg = new IStar(Q7.a);
		cg.generateGoalModel(output);
	}
}
