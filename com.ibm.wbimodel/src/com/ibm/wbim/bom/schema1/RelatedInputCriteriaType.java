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
 * A representation of the model object '<em><b>Related Input Criteria Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.RelatedInputCriteriaType#getInputCriterion <em>Input Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRelatedInputCriteriaType()
 * @model extendedMetaData="name='relatedInputCriteria_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedInputCriteriaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.InputCriterionRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Criterion</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRelatedInputCriteriaType_InputCriterion()
	 * @model type="com.ibm.wbim.bom.schema1.InputCriterionRef" containment="true"
	 *        extendedMetaData="kind='element' name='inputCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInputCriterion();

} // RelatedInputCriteriaType