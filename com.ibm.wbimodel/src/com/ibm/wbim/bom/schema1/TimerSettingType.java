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
 * A representation of the model object '<em><b>Timer Setting Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.TimerSettingType#getBasedOnTimetable <em>Based On Timetable</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.TimerSettingType#getConstantTime <em>Constant Time</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.TimerSettingType#getLastActivationTimePlus <em>Last Activation Time Plus</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.TimerSettingType#getTimerExpression <em>Timer Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimerSettingType()
 * @model extendedMetaData="name='timerSetting_._type' kind='elementOnly'"
 * @generated
 */
public interface TimerSettingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Based On Timetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On Timetable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On Timetable</em>' containment reference.
	 * @see #setBasedOnTimetable(BasedOnTimetableType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimerSettingType_BasedOnTimetable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOnTimetable' namespace='##targetNamespace'"
	 * @generated
	 */
	BasedOnTimetableType getBasedOnTimetable();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TimerSettingType#getBasedOnTimetable <em>Based On Timetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On Timetable</em>' containment reference.
	 * @see #getBasedOnTimetable()
	 * @generated
	 */
	void setBasedOnTimetable(BasedOnTimetableType value);

	/**
	 * Returns the value of the '<em><b>Constant Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Time</em>' containment reference.
	 * @see #setConstantTime(ConstantTimeType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimerSettingType_ConstantTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constantTime' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantTimeType getConstantTime();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TimerSettingType#getConstantTime <em>Constant Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Time</em>' containment reference.
	 * @see #getConstantTime()
	 * @generated
	 */
	void setConstantTime(ConstantTimeType value);

	/**
	 * Returns the value of the '<em><b>Last Activation Time Plus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Activation Time Plus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Activation Time Plus</em>' containment reference.
	 * @see #setLastActivationTimePlus(LastActivationTimePlusType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimerSettingType_LastActivationTimePlus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastActivationTimePlus' namespace='##targetNamespace'"
	 * @generated
	 */
	LastActivationTimePlusType getLastActivationTimePlus();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TimerSettingType#getLastActivationTimePlus <em>Last Activation Time Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Activation Time Plus</em>' containment reference.
	 * @see #getLastActivationTimePlus()
	 * @generated
	 */
	void setLastActivationTimePlus(LastActivationTimePlusType value);

	/**
	 * Returns the value of the '<em><b>Timer Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Expression</em>' containment reference.
	 * @see #setTimerExpression(Expression)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimerSettingType_TimerExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timerExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getTimerExpression();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.TimerSettingType#getTimerExpression <em>Timer Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Expression</em>' containment reference.
	 * @see #getTimerExpression()
	 * @generated
	 */
	void setTimerExpression(Expression value);

} // TimerSettingType