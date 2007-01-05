/*
 * Created on 2004-12-7
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package edu.toronto.cs.telos;

import jtelos.PropositionOrPrimitive;

/**
 * @author aa
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
abstract public class PrimitiveType extends java.lang.Object implements
		PropositionOrPrimitive {
	PrimitiveType() {
	}

	abstract public String telosName();

	abstract public String toString();

}