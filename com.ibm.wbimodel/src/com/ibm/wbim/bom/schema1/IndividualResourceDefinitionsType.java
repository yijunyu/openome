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
 * A representation of the model object '<em><b>Individual Resource Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType#getIndividualResourceDefinition <em>Individual Resource Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResourceDefinitionsType()
 * @model extendedMetaData="name='individualResourceDefinitions_._type' kind='elementOnly'"
 * @generated
 */
public interface IndividualResourceDefinitionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Individual Resource Definition</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Resource Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Resource Definition</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResourceDefinitionsType_IndividualResourceDefinition()
	 * @model type="com.ibm.wbim.bom.schema1.TypeDeclaration" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='individualResourceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getIndividualResourceDefinition();

} // IndividualResourceDefinitionsType