/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurring Time Interval Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getStartDayOfWeek <em>Start Day Of Week</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRecurringTimeIntervalType()
 * @model extendedMetaData="name='recurringTimeInterval_._type' kind='elementOnly'"
 * @generated
 */
public interface RecurringTimeIntervalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRecurringTimeIntervalType_StartTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='startTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Start Day Of Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Day Of Week</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Day Of Week</em>' containment reference.
	 * @see #setStartDayOfWeek(StartDayOfWeekType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRecurringTimeIntervalType_StartDayOfWeek()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startDayOfWeek' namespace='##targetNamespace'"
	 * @generated
	 */
	StartDayOfWeekType getStartDayOfWeek();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getStartDayOfWeek <em>Start Day Of Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Day Of Week</em>' containment reference.
	 * @see #getStartDayOfWeek()
	 * @generated
	 */
	void setStartDayOfWeek(StartDayOfWeekType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRecurringTimeIntervalType_Duration()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='duration'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRecurringTimeIntervalType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RecurringTimeIntervalType
