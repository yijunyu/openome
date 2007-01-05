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
 * A representation of the model object '<em><b>Time Estimation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.TimeEstimationType#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.TimeEstimationType#getMaxResourceWaitingTime <em>Max Resource Waiting Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimeEstimationType()
 * @model extendedMetaData="name='timeEstimation_._type' kind='elementOnly'"
 * @generated
 */
public interface TimeEstimationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Time</em>' containment reference.
	 * @see #setProcessingTime(TimeValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimeEstimationType_ProcessingTime()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='processingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValue getProcessingTime();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TimeEstimationType#getProcessingTime <em>Processing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Time</em>' containment reference.
	 * @see #getProcessingTime()
	 * @generated
	 */
	void setProcessingTime(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Max Resource Waiting Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Resource Waiting Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Resource Waiting Time</em>' containment reference.
	 * @see #setMaxResourceWaitingTime(TimeValue)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimeEstimationType_MaxResourceWaitingTime()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='maxResourceWaitingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValue getMaxResourceWaitingTime();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TimeEstimationType#getMaxResourceWaitingTime <em>Max Resource Waiting Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Resource Waiting Time</em>' containment reference.
	 * @see #getMaxResourceWaitingTime()
	 * @generated
	 */
	void setMaxResourceWaitingTime(TimeValue value);

} // TimeEstimationType
