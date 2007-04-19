/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timer#getTimerSetting <em>Timer Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimer()
 * @model extendedMetaData="name='Timer' kind='elementOnly'"
 * @generated
 */
public interface Timer extends Task {
	/**
	 * Returns the value of the '<em><b>Timer Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer Setting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Setting</em>' containment reference.
	 * @see #setTimerSetting(TimerSettingType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimer_TimerSetting()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timerSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	TimerSettingType getTimerSetting();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Timer#getTimerSetting <em>Timer Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Setting</em>' containment reference.
	 * @see #getTimerSetting()
	 * @generated
	 */
	void setTimerSetting(TimerSettingType value);

} // Timer
