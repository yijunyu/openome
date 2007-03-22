/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Resources#getRoleRequirement <em>Role Requirement</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Resources#getIndividualResourceRequirement <em>Individual Resource Requirement</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Resources#getBulkResourceRequirement <em>Bulk Resource Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResources()
 * @model extendedMetaData="name='Resources' kind='elementOnly'"
 * @generated
 */
public interface Resources extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.RoleRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Requirement</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResources_RoleRequirement()
	 * @model type="com.ibm.wbim.bom.schema1.RoleRequirement" containment="true"
	 *        extendedMetaData="kind='element' name='roleRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRoleRequirement();

	/**
	 * Returns the value of the '<em><b>Individual Resource Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Resource Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Resource Requirement</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResources_IndividualResourceRequirement()
	 * @model type="com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement" containment="true"
	 *        extendedMetaData="kind='element' name='individualResourceRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getIndividualResourceRequirement();

	/**
	 * Returns the value of the '<em><b>Bulk Resource Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.BulkResourceRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk Resource Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Resource Requirement</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResources_BulkResourceRequirement()
	 * @model type="com.ibm.wbim.bom.schema1.BulkResourceRequirement" containment="true"
	 *        extendedMetaData="kind='element' name='bulkResourceRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getBulkResourceRequirement();

} // Resources
