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
public class TelosReal extends PrimitiveType {
	private float value;

	public TelosReal(float arg) {
		value = arg;
	}

	public TelosReal(java.lang.Float arg) {
		value = arg.floatValue();

	}

	public TelosReal(String arg) {
		Float fl = Float.valueOf(arg);
		value = fl.floatValue();
	}

	public float floatValue() {
		return value;
	}

	public boolean equals(Object arg) {
		TelosReal ti = (TelosReal) (arg);
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

