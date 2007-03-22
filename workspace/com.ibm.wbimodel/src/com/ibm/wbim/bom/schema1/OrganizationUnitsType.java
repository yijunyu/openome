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
 * A representation of the model object '<em><b>Organization Units Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationUnitsType#getOrganizationUnit <em>Organization Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationUnitsType()
 * @model extendedMetaData="name='organizationUnits_._type' kind='elementOnly'"
 * @generated
 */
public interface OrganizationUnitsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization Unit</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.ComplexDataTypeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationUnitsType_OrganizationUnit()
	 * @model type="com.ibm.wbim.bom.schema1.ComplexDataTypeInstance" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='organizationUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOrganizationUnit();

} // OrganizationUnitsType
