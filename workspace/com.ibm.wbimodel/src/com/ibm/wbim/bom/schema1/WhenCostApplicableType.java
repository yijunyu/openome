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
 * A representation of the model object '<em><b>When Cost Applicable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.WhenCostApplicableType#getTimetable <em>Timetable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getWhenCostApplicableType()
 * @model extendedMetaData="name='whenCostApplicable_._type' kind='empty'"
 * @generated
 */
public interface WhenCostApplicableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Timetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timetable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable</em>' attribute.
	 * @see #setTimetable(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getWhenCostApplicableType_Timetable()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='attribute' name='timetable'"
	 * @generated
	 */
	String getTimetable();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.WhenCostApplicableType#getTimetable <em>Timetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable</em>' attribute.
	 * @see #getTimetable()
	 * @generated
	 */
	void setTimetable(String value);

} // WhenCostApplicableType
