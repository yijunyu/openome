/*
 * Created on Jan 28, 2005
 *
 */
package edu.toronto.cs.ome.model.test;
import java.util.Iterator;

import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.model.OMEObject;
import edu.toronto.cs.ome.model.TelosLink;
import edu.toronto.cs.ome.model.TelosModel;

/**
 * @author Yijun
 */
public class TelosLinkTest extends ModelTest {

	public TelosLinkTest() {
		super("test/edu.toronto.cs.ome.model.TelosLink", ".tel");
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(TelosLinkTest.class);
	}
	
	public final void testAll() {
		super.testAll();
	}
	
	public final void testAll(TelosModel model) {
		testGetModel(model);
		testGetType(model);
		testGetTo(model);
		testGetFrom(model);
		testSetType(model);
		testGetLinks(model);
		testAddLink(model);
		testGetID(model);
		testSetID(model);
		testSetTo(model);
		testSetFrom(model);
		testTelosLinkKBTelosFrameworkTelosModelintObject(model);
		testTelosLinkKBTelosFrameworkTelosModelintProposition(model);
	}
	
	public final void testGetModel(TelosModel model) {
		for (Iterator i = model.getLinks().iterator(); i.hasNext();) {
			junit.framework.Assert.assertTrue("teloslink found", i instanceof TelosLink);			
			TelosLink l = (TelosLink) i.next();
			OMEModel m = l.getModel();
			junit.framework.Assert.assertTrue("model found", m == null);	
		}		
	}
	
	public final void testGetType(TelosModel model) {
		for (Iterator i = model.getLinks().iterator(); i.hasNext();) {
			junit.framework.Assert.assertTrue("teloslink found", i instanceof TelosLink);			
			TelosLink l = (TelosLink) i.next();
			Object m = l.getType();
			junit.framework.Assert.assertTrue("type found", m == null);	
		}
	}
	public final void testGetTo(TelosModel model) {
		for (Iterator i = model.getLinks().iterator(); i.hasNext();) {
			junit.framework.Assert.assertTrue("teloslink found", i instanceof TelosLink);			
			TelosLink l = (TelosLink) i.next();
			OMEObject o = l.getTo();
			junit.framework.Assert.assertTrue("to found", o != null);	
			junit.framework.Assert.assertTrue("the to object has this link", o.getLinks().contains(l));
		}
	}
	public final void testGetFrom(TelosModel model) {
		for (Iterator i = model.getLinks().iterator(); i.hasNext();) {
			junit.framework.Assert.assertTrue("teloslink found", i instanceof TelosLink);			
			TelosLink l = (TelosLink) i.next();
			OMEObject o = l.getFrom();
			junit.framework.Assert.assertTrue("from found", o != null);	
			junit.framework.Assert.assertTrue("the from object has this link", o.getLinks().contains(l));
		}
	}

	public final void testSetType(TelosModel model) {
	}

	public final void testGetLinks(TelosModel model) {
	}

	public final void testAddLink(TelosModel model) {
	}

	public final void testGetID(TelosModel model) {
	}

	public final void testSetID(TelosModel model) {
	}

	public final void testSetTo(TelosModel model) {
	}

	public final void testSetFrom(TelosModel model) {
	}

	public final void testTelosLinkKBTelosFrameworkTelosModelintObject(TelosModel model) {
	}

	public final void testTelosLinkKBTelosFrameworkTelosModelintProposition(TelosModel model) {
	}

}
