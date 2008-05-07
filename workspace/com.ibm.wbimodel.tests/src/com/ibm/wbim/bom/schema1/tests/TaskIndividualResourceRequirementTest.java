/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.tests;

import com.ibm.wbim.bom.schema1.Schema1Factory;
import com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Individual Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskIndividualResourceRequirementTest extends
		IndividualResourceRequirementTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskIndividualResourceRequirementTest.class);
	}

	/**
	 * Constructs a new Task Individual Resource Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskIndividualResourceRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Individual Resource Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskIndividualResourceRequirement getFixture() {
		return (TaskIndividualResourceRequirement) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Schema1Factory.eINSTANCE
				.createTaskIndividualResourceRequirement());
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

} //TaskIndividualResourceRequirementTest
