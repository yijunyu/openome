/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.tests;

import com.ibm.wbim.bom.schema1.CostPerTimeUnitValue;
import com.ibm.wbim.bom.schema1.Schema1Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cost Per Time Unit Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CostPerTimeUnitValueTest extends CostValueTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CostPerTimeUnitValueTest.class);
	}

	/**
	 * Constructs a new Cost Per Time Unit Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostPerTimeUnitValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cost Per Time Unit Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CostPerTimeUnitValue getFixture() {
		return (CostPerTimeUnitValue) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Schema1Factory.eINSTANCE.createCostPerTimeUnitValue());
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

} //CostPerTimeUnitValueTest
