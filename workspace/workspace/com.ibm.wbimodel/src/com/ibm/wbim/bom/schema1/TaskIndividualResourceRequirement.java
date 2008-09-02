/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Individual Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTaskIndividualResourceRequirement()
 * @model extendedMetaData="name='TaskIndividualResourceRequirement' kind='elementOnly'"
 * @generated
 */
public interface TaskIndividualResourceRequirement extends
		IndividualResourceRequirement {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Criteria only applies when the resource is the predefined "Person" or "Staff" type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference.
	 * @see #setCriteria(CriteriaTemplate)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTaskIndividualResourceRequirement_Criteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='criteria' namespace='##targetNamespace'"
	 * @generated
	 */
	CriteriaTemplate getCriteria();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TaskIndividualResourceRequirement#getCriteria <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' containment reference.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(CriteriaTemplate value);

} // TaskIndividualResourceRequirement
