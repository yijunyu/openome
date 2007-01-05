/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Branch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputBranchType#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OutputBranchType#getOperationalData <em>Operational Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputBranchType()
 * @model extendedMetaData="name='outputBranch_._type' kind='elementOnly'"
 * @generated
 */
public interface OutputBranchType extends OutputBranch {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputBranchType_Condition()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OutputBranchType#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Data</em>' containment reference.
	 * @see #setOperationalData(OutputPathOperationalData)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOutputBranchType_OperationalData()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='operationalData' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputPathOperationalData getOperationalData();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OutputBranchType#getOperationalData <em>Operational Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Data</em>' containment reference.
	 * @see #getOperationalData()
	 * @generated
	 */
	void setOperationalData(OutputPathOperationalData value);

} // OutputBranchType
