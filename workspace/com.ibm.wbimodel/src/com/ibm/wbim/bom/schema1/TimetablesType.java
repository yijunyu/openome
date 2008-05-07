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
 * A representation of the model object '<em><b>Timetables Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.TimetablesType#getTimetable <em>Timetable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetablesType()
 * @model extendedMetaData="name='timetables_._type' kind='elementOnly'"
 * @generated
 */
public interface TimetablesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Timetable</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Timetable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timetable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getTimetablesType_Timetable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timetable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Timetable> getTimetable();

} // TimetablesType
