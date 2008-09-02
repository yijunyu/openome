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
 * A representation of the model object '<em><b>Location Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.LocationDefinitionsType#getLocationDefinition <em>Location Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocationDefinitionsType()
 * @model extendedMetaData="name='locationDefinitions_._type' kind='elementOnly'"
 * @generated
 */
public interface LocationDefinitionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Location Definition</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Definition</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLocationDefinitionsType_LocationDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='locationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TypeDeclaration> getLocationDefinition();

} // LocationDefinitionsType
