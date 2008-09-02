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
 * A representation of the model object '<em><b>Stop Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.StopNodeType#getAssociatedOutputCriterion <em>Associated Output Criterion</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.StopNodeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStopNodeType()
 * @model extendedMetaData="name='stopNode_._type' kind='empty'"
 * @generated
 */
public interface StopNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Associated Output Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Output Criterion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Output Criterion</em>' attribute.
	 * @see #setAssociatedOutputCriterion(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStopNodeType_AssociatedOutputCriterion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='associatedOutputCriterion'"
	 * @generated
	 */
	String getAssociatedOutputCriterion();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.StopNodeType#getAssociatedOutputCriterion <em>Associated Output Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Output Criterion</em>' attribute.
	 * @see #getAssociatedOutputCriterion()
	 * @generated
	 */
	void setAssociatedOutputCriterion(String value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStopNodeType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.StopNodeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StopNodeType
