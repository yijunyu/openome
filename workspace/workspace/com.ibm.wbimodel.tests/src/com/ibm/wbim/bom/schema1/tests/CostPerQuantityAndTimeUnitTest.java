/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.tests;

import com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit;
import com.ibm.wbim.bom.schema1.Schema1Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cost Per Quantity And Time Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CostPerQuantityAndTimeUnitTest extends CostPerQuantityTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CostPerQuantityAndTimeUnitTest.class);
	}

	/**
	 * Constructs a new Cost Per Quantity And Time Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostPerQuantityAndTimeUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cost Per Quantity And Time Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CostPerQuantityAndTimeUnit getFixture() {
		return (CostPerQuantityAndTimeUnit) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Schema1Factory.eINSTANCE.createCostPerQuantityAndTimeUnit());
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

} //CostPerQuantityAndTimeUnitTest
