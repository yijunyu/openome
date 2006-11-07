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
 * A representation of the model object '<em><b>Catalogs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.CatalogsType#getDataCatalogs <em>Data Catalogs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CatalogsType#getResourceCatalogs <em>Resource Catalogs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CatalogsType#getOrganizationCatalogs <em>Organization Catalogs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.CatalogsType#getProcessCatalogs <em>Process Catalogs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCatalogsType()
 * @model extendedMetaData="name='catalogs_._type' kind='elementOnly'"
 * @generated
 */
public interface CatalogsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Catalogs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Catalogs</em>' containment reference.
	 * @see #setDataCatalogs(Catalogs)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCatalogsType_DataCatalogs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataCatalogs' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalogs getDataCatalogs();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CatalogsType#getDataCatalogs <em>Data Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Catalogs</em>' containment reference.
	 * @see #getDataCatalogs()
	 * @generated
	 */
	void setDataCatalogs(Catalogs value);

	/**
	 * Returns the value of the '<em><b>Resource Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Catalogs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Catalogs</em>' containment reference.
	 * @see #setResourceCatalogs(Catalogs)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCatalogsType_ResourceCatalogs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceCatalogs' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalogs getResourceCatalogs();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CatalogsType#getResourceCatalogs <em>Resource Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Catalogs</em>' containment reference.
	 * @see #getResourceCatalogs()
	 * @generated
	 */
	void setResourceCatalogs(Catalogs value);

	/**
	 * Returns the value of the '<em><b>Organization Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Catalogs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Catalogs</em>' containment reference.
	 * @see #setOrganizationCatalogs(Catalogs)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCatalogsType_OrganizationCatalogs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationCatalogs' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalogs getOrganizationCatalogs();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CatalogsType#getOrganizationCatalogs <em>Organization Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Catalogs</em>' containment reference.
	 * @see #getOrganizationCatalogs()
	 * @generated
	 */
	void setOrganizationCatalogs(Catalogs value);

	/**
	 * Returns the value of the '<em><b>Process Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Catalogs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Catalogs</em>' containment reference.
	 * @see #setProcessCatalogs(Catalogs)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCatalogsType_ProcessCatalogs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processCatalogs' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalogs getProcessCatalogs();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.CatalogsType#getProcessCatalogs <em>Process Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Catalogs</em>' containment reference.
	 * @see #getProcessCatalogs()
	 * @generated
	 */
	void setProcessCatalogs(Catalogs value);

} // CatalogsType