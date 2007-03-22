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
 * A representation of the model object '<em><b>Organizations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Organizations#getOrganizationUnit <em>Organization Unit</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Organizations#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizations()
 * @model extendedMetaData="name='Organizations' kind='elementOnly'"
 * @generated
 */
public interface Organizations extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization Unit</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.OrganizationUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizations_OrganizationUnit()
	 * @model type="com.ibm.wbim.bom.schema1.OrganizationUnitType" containment="true"
	 *        extendedMetaData="kind='element' name='organizationUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOrganizationUnit();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.LocationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizations_Location()
	 * @model type="com.ibm.wbim.bom.schema1.LocationType" containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getLocation();

} // Organizations
