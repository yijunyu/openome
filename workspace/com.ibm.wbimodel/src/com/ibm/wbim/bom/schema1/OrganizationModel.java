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
 * A representation of the model object '<em><b>Organization Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationDefinitionTemplates <em>Organization Definition Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationDefinitions <em>Organization Definitions</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationUnits <em>Organization Units</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocationDefinitionTemplates <em>Location Definition Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocationDefinitions <em>Location Definitions</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationModel()
 * @model extendedMetaData="name='OrganizationModel' kind='elementOnly'"
 * @generated
 */
public interface OrganizationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization Definition Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Definition Templates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Definition Templates</em>' containment reference.
	 * @see #setOrganizationDefinitionTemplates(OrganizationDefinitionTemplatesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationModel_OrganizationDefinitionTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationDefinitionTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationDefinitionTemplatesType getOrganizationDefinitionTemplates();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationDefinitionTemplates <em>Organization Definition Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Definition Templates</em>' containment reference.
	 * @see #getOrganizationDefinitionTemplates()
	 * @generated
	 */
	void setOrganizationDefinitionTemplates(OrganizationDefinitionTemplatesType value);

	/**
	 * Returns the value of the '<em><b>Organization Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Definitions</em>' containment reference.
	 * @see #setOrganizationDefinitions(OrganizationDefinitionsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationModel_OrganizationDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationDefinitionsType getOrganizationDefinitions();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationDefinitions <em>Organization Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Definitions</em>' containment reference.
	 * @see #getOrganizationDefinitions()
	 * @generated
	 */
	void setOrganizationDefinitions(OrganizationDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Organization Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Units</em>' containment reference.
	 * @see #setOrganizationUnits(OrganizationUnitsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationModel_OrganizationUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationUnitsType getOrganizationUnits();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getOrganizationUnits <em>Organization Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Units</em>' containment reference.
	 * @see #getOrganizationUnits()
	 * @generated
	 */
	void setOrganizationUnits(OrganizationUnitsType value);

	/**
	 * Returns the value of the '<em><b>Location Definition Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Definition Templates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Definition Templates</em>' containment reference.
	 * @see #setLocationDefinitionTemplates(LocationDefinitionTemplatesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationModel_LocationDefinitionTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationDefinitionTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationDefinitionTemplatesType getLocationDefinitionTemplates();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocationDefinitionTemplates <em>Location Definition Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Definition Templates</em>' containment reference.
	 * @see #getLocationDefinitionTemplates()
	 * @generated
	 */
	void setLocationDefinitionTemplates(LocationDefinitionTemplatesType value);

	/**
	 * Returns the value of the '<em><b>Location Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Definitions</em>' containment reference.
	 * @see #setLocationDefinitions(LocationDefinitionsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationModel_LocationDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationDefinitionsType getLocationDefinitions();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocationDefinitions <em>Location Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Definitions</em>' containment reference.
	 * @see #getLocationDefinitions()
	 * @generated
	 */
	void setLocationDefinitions(LocationDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference.
	 * @see #setLocations(LocationsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getOrganizationModel_Locations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locations' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationsType getLocations();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.OrganizationModel#getLocations <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locations</em>' containment reference.
	 * @see #getLocations()
	 * @generated
	 */
	void setLocations(LocationsType value);

} // OrganizationModel
