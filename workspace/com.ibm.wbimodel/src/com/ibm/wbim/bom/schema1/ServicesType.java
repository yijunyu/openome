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
 * A representation of the model object '<em><b>Services Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ServicesType#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getServicesType()
 * @model extendedMetaData="name='services_._type' kind='elementOnly'"
 * @generated
 */
public interface ServicesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a global service, its inputs and outputs must have associated data. In inputs for global services, the constantValue element is ignored. In inputs and outputs for global services, the repositoryValue element is ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getServicesType_Service()
	 * @model type="com.ibm.wbim.bom.schema1.Service" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getService();

} // ServicesType
