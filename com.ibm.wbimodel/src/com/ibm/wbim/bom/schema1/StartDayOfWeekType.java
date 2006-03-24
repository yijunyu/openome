/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Day Of Week Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getWeekNumber <em>Week Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStartDayOfWeekType()
 * @model extendedMetaData="name='startDayOfWeek_._type' kind='empty'"
 * @generated
 */
public interface StartDayOfWeekType extends EObject {
	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' attribute.
	 * The default value is <code>"Monday"</code>.
	 * The literals are from the enumeration {@link com.ibm.wbim.bom.schema1.DayOfWeek}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Week</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.DayOfWeek
	 * @see #isSetDayOfWeek()
	 * @see #unsetDayOfWeek()
	 * @see #setDayOfWeek(DayOfWeek)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStartDayOfWeekType_DayOfWeek()
	 * @model default="Monday" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dayOfWeek'"
	 * @generated
	 */
	DayOfWeek getDayOfWeek();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getDayOfWeek <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Week</em>' attribute.
	 * @see com.ibm.wbim.bom.schema1.DayOfWeek
	 * @see #isSetDayOfWeek()
	 * @see #unsetDayOfWeek()
	 * @see #getDayOfWeek()
	 * @generated
	 */
	void setDayOfWeek(DayOfWeek value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getDayOfWeek <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayOfWeek()
	 * @see #getDayOfWeek()
	 * @see #setDayOfWeek(DayOfWeek)
	 * @generated
	 */
	void unsetDayOfWeek();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getDayOfWeek <em>Day Of Week</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Of Week</em>' attribute is set.
	 * @see #unsetDayOfWeek()
	 * @see #getDayOfWeek()
	 * @see #setDayOfWeek(DayOfWeek)
	 * @generated
	 */
	boolean isSetDayOfWeek();

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Object)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStartDayOfWeekType_StartTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='attribute' name='startTime'"
	 * @generated
	 */
	Object getStartTime();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Object value);

	/**
	 * Returns the value of the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Week Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week Number</em>' attribute.
	 * @see #setWeekNumber(BigInteger)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getStartDayOfWeekType_WeekNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='weekNumber'"
	 * @generated
	 */
	BigInteger getWeekNumber();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.StartDayOfWeekType#getWeekNumber <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Number</em>' attribute.
	 * @see #getWeekNumber()
	 * @generated
	 */
	void setWeekNumber(BigInteger value);

} // StartDayOfWeekType
