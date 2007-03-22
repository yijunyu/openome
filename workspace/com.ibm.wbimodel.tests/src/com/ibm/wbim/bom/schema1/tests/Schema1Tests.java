/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>schema1</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Schema1Tests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Schema1Tests("schema1 Tests");
		suite.addTestSuite(AttributeValueTest.class);
		suite.addTestSuite(BulkResourceTest.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(ExtendedAttributeTypeTest.class);
		suite.addTestSuite(FlowContentTypeTest.class);
		suite.addTestSuite(IndividualResourceTest.class);
		suite.addTestSuite(RepositoryDataValueTest.class);
		suite.addTestSuite(RoleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema1Tests(String name) {
		super(name);
	}

} //Schema1Tests
