/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.tests;

import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.HelpContribution;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Help Contribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelpContributionTest extends ContributionTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HelpContributionTest.class);
	}

	/**
	 * Constructs a new Help Contribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpContributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Help Contribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HelpContribution getFixture() {
		return (HelpContribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(GoalmodelFactory.eINSTANCE.createHelpContribution());
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

} //HelpContributionTest