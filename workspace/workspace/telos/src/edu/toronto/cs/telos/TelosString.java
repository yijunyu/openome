/*
 * Created on 2004-12-7
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package edu.toronto.cs.telos;

/**
 * @author aa
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class TelosString extends PrimitiveType {
	public String value;

	public TelosString(String arg) {
		value = arg;
	}

	public boolean equals(Object arg) {
		TelosString ts = (TelosString) arg;
		return ((this.value).equals(ts.value));
	}

	public String telosName() {
		if(value.equals("String")||value.equals("Integer")||value.equals("Token")||value.equals("SClass")){
			return value;
		}
		return "\"" + value + "\"";
	}

	public String stringValue() {
		return value;
	}

	public String toString() {
		return value;
	}
}