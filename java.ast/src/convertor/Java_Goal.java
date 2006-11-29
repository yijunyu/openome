package convertor;

import edu.toronto.cs.ast.parser;

public class Java_Goal implements IConvertor {
	public void convert(String input, String output) {
		parser p = new parser();
		System.setProperty("input", input);
		p.parse(System.getProperty("input"), output);
	}
}
