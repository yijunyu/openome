/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.tests;

import edu.toronto.cs.openome_model.PartiallySatisfiedLabel;
import edu.toronto.cs.openome_model.openome_modelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Partially Satisfied Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartiallySatisfiedLabelTest extends TruthLabelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PartiallySatisfiedLabelTest.class);
	}

	/**
	 * Constructs a new Partially Satisfied Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartiallySatisfiedLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Partially Satisfied Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PartiallySatisfiedLabel getFixture() {
		return (PartiallySatisfiedLabel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(openome_modelFactory.eINSTANCE.createPartiallySatisfiedLabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PartiallySatisfiedLabelTest
