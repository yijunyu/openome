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
public class TelosInteger extends PrimitiveType {
	private int value;

	public TelosInteger(int arg) {
		value = arg;
	}

	public TelosInteger(Integer arg) {
		value = arg.intValue();

	}

	public TelosInteger(String arg) {
		value = Integer.parseInt(arg);
	}

	public int intValue() {
		return value;
	}

	public boolean equals(Object arg) {
		TelosInteger ti = (TelosInteger) (arg);
		return (this.value == ti.value);

	}

	public String telosName() {
		String tn = String.valueOf(value);
		return tn;
	}

	public String toString() {
		return "" + value;
	}

}