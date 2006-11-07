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
 * A representation of the model object '<em><b>Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResourceDefinitionTemplates <em>Individual Resource Definition Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResourceDefinitions <em>Individual Resource Definitions</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResourceDefinitionTemplates <em>Bulk Resource Definition Templates</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResourceDefinitions <em>Bulk Resource Definitions</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResources <em>Individual Resources</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResources <em>Bulk Resources</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ResourceModel#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ResourceModel#getTimetables <em>Timetables</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel()
 * @model extendedMetaData="name='ResourceModel' kind='elementOnly'"
 * @generated
 */
public interface ResourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Individual Resource Definition Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Resource Definition Templates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Resource Definition Templates</em>' containment reference.
	 * @see #setIndividualResourceDefinitionTemplates(IndividualResourceDefinitionTemplatesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel_IndividualResourceDefinitionTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='individualResourceDefinitionTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	IndividualResourceDefinitionTemplatesType getIndividualResourceDefinitionTemplates();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResourceDefinitionTemplates <em>Individual Resource Definition Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Resource Definition Templates</em>' containment reference.
	 * @see #getIndividualResourceDefinitionTemplates()
	 * @generated
	 */
	void setIndividualResourceDefinitionTemplates(IndividualResourceDefinitionTemplatesType value);

	/**
	 * Returns the value of the '<em><b>Individual Resource Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Resource Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Resource Definitions</em>' containment reference.
	 * @see #setIndividualResourceDefinitions(IndividualResourceDefinitionsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel_IndividualResourceDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='individualResourceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	IndividualResourceDefinitionsType getIndividualResourceDefinitions();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResourceDefinitions <em>Individual Resource Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Resource Definitions</em>' containment reference.
	 * @see #getIndividualResourceDefinitions()
	 * @generated
	 */
	void setIndividualResourceDefinitions(IndividualResourceDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Bulk Resource Definition Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk Resource Definition Templates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Resource Definition Templates</em>' containment reference.
	 * @see #setBulkResourceDefinitionTemplates(BulkResourceDefinitionTemplatesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel_BulkResourceDefinitionTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bulkResourceDefinitionTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	BulkResourceDefinitionTemplatesType getBulkResourceDefinitionTemplates();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResourceDefinitionTemplates <em>Bulk Resource Definition Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulk Resource Definition Templates</em>' containment reference.
	 * @see #getBulkResourceDefinitionTemplates()
	 * @generated
	 */
	void setBulkResourceDefinitionTemplates(BulkResourceDefinitionTemplatesType value);

	/**
	 * Returns the value of the '<em><b>Bulk Resource Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk Resource Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Resource Definitions</em>' containment reference.
	 * @see #setBulkResourceDefinitions(BulkResourceDefinitionsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel_BulkResourceDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bulkResourceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	BulkResourceDefinitionsType getBulkResourceDefinitions();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResourceDefinitions <em>Bulk Resource Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulk Resource Definitions</em>' containment reference.
	 * @see #getBulkResourceDefinitions()
	 * @generated
	 */
	void setBulkResourceDefinitions(BulkResourceDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Individual Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Resources</em>' containment reference.
	 * @see #setIndividualResources(IndividualResourcesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel_IndividualResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='individualResources' namespace='##targetNamespace'"
	 * @generated
	 */
	IndividualResourcesType getIndividualResources();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ResourceModel#getIndividualResources <em>Individual Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Resources</em>' containment reference.
	 * @see #getIndividualResources()
	 * @generated
	 */
	void setIndividualResources(IndividualResourcesType value);

	/**
	 * Returns the value of the '<em><b>Bulk Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Resources</em>' containment reference.
	 * @see #setBulkResources(BulkResourcesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel_BulkResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bulkResources' namespace='##targetNamespace'"
	 * @generated
	 */
	BulkResourcesType getBulkResources();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ResourceModel#getBulkResources <em>Bulk Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulk Resources</em>' containment reference.
	 * @see #getBulkResources()
	 * @generated
	 */
	void setBulkResources(BulkResourcesType value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(RolesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel_Roles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='roles' namespace='##targetNamespace'"
	 * @generated
	 */
	RolesType getRoles();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ResourceModel#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(RolesType value);

	/**
	 * Returns the value of the '<em><b>Timetables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timetables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetables</em>' containment reference.
	 * @see #setTimetables(TimetablesType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getResourceModel_Timetables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timetables' namespace='##targetNamespace'"
	 * @generated
	 */
	TimetablesType getTimetables();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ResourceModel#getTimetables <em>Timetables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetables</em>' containment reference.
	 * @see #getTimetables()
	 * @generated
	 */
	void setTimetables(TimetablesType value);

} // ResourceModel