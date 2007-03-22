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
 * A representation of the model object '<em><b>Individual Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResourcesType#getIndividualResource <em>Individual Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResourcesType()
 * @model extendedMetaData="name='individualResources_._type' kind='elementOnly'"
 * @generated
 */
public interface IndividualResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Individual Resource</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.IndividualResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Resource</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResourcesType_IndividualResource()
	 * @model type="com.ibm.wbim.bom.schema1.IndividualResource" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='individualResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getIndividualResource();

} // IndividualResourcesType
