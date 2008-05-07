/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.tests;

import com.ibm.wbim.bom.schema1.CallToProcessType;
import com.ibm.wbim.bom.schema1.Schema1Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call To Process Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallToProcessTypeTest extends InvocationTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallToProcessTypeTest.class);
	}

	/**
	 * Constructs a new Call To Process Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallToProcessTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call To Process Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallToProcessType getFixture() {
		return (CallToProcessType) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Schema1Factory.eINSTANCE.createCallToProcessType());
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

} //CallToProcessTypeTest
