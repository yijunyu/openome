package edu.toronto.cs.q7.model.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.How;

public class AdviceTest extends TestCase {

	public static void main(String[] args) {
		junit.textui.TestRunner.run(AdviceTest.class);
	}

	/*
	 * Test method for 'edu.toronto.cs.q7.model.Advice.Advice(String, String, String, String, String, ArrayList, How, ArrayList, String, String)'
	 */
	public void testAdvice() {
		String _when = null;
		String _who = null;
		String _why = null;
		String _what = null;
		String _alias = null;
		String _comment = null;
		ArrayList _where = null;
		How _how = null;
		ArrayList _how_much = null;
		String _label = null;		
		Advice a =null;
		a = new Advice(_when, _who, _why, _what, _alias, _where, _how, _how_much, _comment, _label);
//		System.out.println("" + a);
		_who = "a"; _why = "abc"; _what = "bcd"; _alias = "a";
		a = new Advice(_when, _who, _why, _what, _alias, _where, _how, _how_much, _comment, _label);
//		System.out.println("" + a);
		_who = null; _why = "a"; _what = null; _alias = null;
		a = new Advice(_when, _who, _why, _what, _alias, _where, _how, _how_much, _comment, _label);
//		System.out.println("" + a);
		junit.framework.Assert.assertTrue("alias is expanded", a.e.who.equals("a"));
		junit.framework.Assert.assertTrue("alias is expanded", a.e.why.equals("abc")); 
		junit.framework.Assert.assertTrue("alias is expanded", a.e.what.equals("bcd"));		
	}

	/*
	 * Test method for 'edu.toronto.cs.q7.model.Advice.getID()'
	 */
	public void testGetID() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.model.Advice.setID(int)'
	 */
	public void testSetID() {

	}

}
