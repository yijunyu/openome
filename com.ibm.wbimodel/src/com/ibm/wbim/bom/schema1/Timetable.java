/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timetable#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timetable#getRecurringTimeInterval <em>Recurring Time Interval</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timetable#getExemptionPeriod <em>Exemption Period</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timetable#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timetable#getBeginingOn <em>Begining On</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timetable#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timetable#getNumberOfTimesToRepeat <em>Number Of Times To Repeat</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Timetable#getRepetitionPeriod <em>Repetition Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable()
 * @model extendedMetaData="name='Timetable' kind='elementOnly'"
 * @generated
 */
public interface Timetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Timetable#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Recurring Time Interval</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.RecurringTimeIntervalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurring Time Interval</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurring Time Interval</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable_RecurringTimeInterval()
	 * @model type="com.ibm.wbim.bom.schema1.RecurringTimeIntervalType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='recurringTimeInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRecurringTimeInterval();

	/**
	 * Returns the value of the '<em><b>Exemption Period</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.ExemptionPeriodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exemption Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exemption Period</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable_ExemptionPeriod()
	 * @model type="com.ibm.wbim.bom.schema1.ExemptionPeriodType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='exemptionPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getExemptionPeriod();

	/**
	 * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is currently not processed. It can contain additional information about the element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #setExtendedAttributes(ExtendedAttributes)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable_ExtendedAttributes()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='extendedAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedAttributes getExtendedAttributes();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Timetable#getExtendedAttributes <em>Extended Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #getExtendedAttributes()
	 * @generated
	 */
	void setExtendedAttributes(ExtendedAttributes value);

	/**
	 * Returns the value of the '<em><b>Begining On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begining On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begining On</em>' attribute.
	 * @see #setBeginingOn(Object)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable_BeginingOn()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='beginingOn'"
	 * @generated
	 */
	Object getBeginingOn();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Timetable#getBeginingOn <em>Begining On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begining On</em>' attribute.
	 * @see #getBeginingOn()
	 * @generated
	 */
	void setBeginingOn(Object value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable_Name()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Timetable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Times To Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Times To Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Times To Repeat</em>' attribute.
	 * @see #setNumberOfTimesToRepeat(BigInteger)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable_NumberOfTimesToRepeat()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='numberOfTimesToRepeat'"
	 * @generated
	 */
	BigInteger getNumberOfTimesToRepeat();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Timetable#getNumberOfTimesToRepeat <em>Number Of Times To Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Times To Repeat</em>' attribute.
	 * @see #getNumberOfTimesToRepeat()
	 * @generated
	 */
	void setNumberOfTimesToRepeat(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Repetition Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition Period</em>' attribute.
	 * @see #setRepetitionPeriod(Object)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetable_RepetitionPeriod()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='repetitionPeriod'"
	 * @generated
	 */
	Object getRepetitionPeriod();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Timetable#getRepetitionPeriod <em>Repetition Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Period</em>' attribute.
	 * @see #getRepetitionPeriod()
	 * @generated
	 */
	void setRepetitionPeriod(Object value);

} // Timetable
