/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.tests;

import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.PartiallySatisfiedLabel;

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
	private PartiallySatisfiedLabel getFixture() {
		return (PartiallySatisfiedLabel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(GoalmodelFactory.eINSTANCE.createPartiallySatisfiedLabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PartiallySatisfiedLabelTest
