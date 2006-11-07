/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getIndividualResource <em>Individual Resource</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getTimeRequired <em>Time Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResourceRequirement()
 * @model extendedMetaData="name='IndividualResourceRequirement' kind='empty'"
 * @generated
 */
public interface IndividualResourceRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Individual Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Resource</em>' attribute.
	 * @see #setIndividualResource(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResourceRequirement_IndividualResource()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName"
	 *        extendedMetaData="kind='attribute' name='individualResource'"
	 * @generated
	 */
	String getIndividualResource();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getIndividualResource <em>Individual Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Resource</em>' attribute.
	 * @see #getIndividualResource()
	 * @generated
	 */
	void setIndividualResource(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResourceRequirement_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Required</em>' attribute.
	 * @see #setTimeRequired(Object)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResourceRequirement_TimeRequired()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='timeRequired'"
	 * @generated
	 */
	Object getTimeRequired();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.IndividualResourceRequirement#getTimeRequired <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Required</em>' attribute.
	 * @see #getTimeRequired()
	 * @generated
	 */
	void setTimeRequired(Object value);

} // IndividualResourceRequirement