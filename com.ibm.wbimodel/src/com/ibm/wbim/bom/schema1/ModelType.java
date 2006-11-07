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
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ModelType#getCatalogs <em>Catalogs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ModelType#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ModelType#getResourceModel <em>Resource Model</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ModelType#getOrganizationModel <em>Organization Model</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ModelType#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ModelType#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.ModelType#getSchemaVersion <em>Schema Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getModelType()
 * @model extendedMetaData="name='model_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalogs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalogs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogs</em>' containment reference.
	 * @see #setCatalogs(CatalogsType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getModelType_Catalogs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='catalogs' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogsType getCatalogs();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getCatalogs <em>Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogs</em>' containment reference.
	 * @see #getCatalogs()
	 * @generated
	 */
	void setCatalogs(CatalogsType value);

	/**
	 * Returns the value of the '<em><b>Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Model</em>' containment reference.
	 * @see #setDataModel(DataModel)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getModelType_DataModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataModel' namespace='##targetNamespace'"
	 * @generated
	 */
	DataModel getDataModel();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getDataModel <em>Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Model</em>' containment reference.
	 * @see #getDataModel()
	 * @generated
	 */
	void setDataModel(DataModel value);

	/**
	 * Returns the value of the '<em><b>Resource Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Model</em>' containment reference.
	 * @see #setResourceModel(ResourceModel)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getModelType_ResourceModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceModel' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceModel getResourceModel();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getResourceModel <em>Resource Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Model</em>' containment reference.
	 * @see #getResourceModel()
	 * @generated
	 */
	void setResourceModel(ResourceModel value);

	/**
	 * Returns the value of the '<em><b>Organization Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Model</em>' containment reference.
	 * @see #setOrganizationModel(OrganizationModel)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getModelType_OrganizationModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationModel' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationModel getOrganizationModel();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getOrganizationModel <em>Organization Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Model</em>' containment reference.
	 * @see #getOrganizationModel()
	 * @generated
	 */
	void setOrganizationModel(OrganizationModel value);

	/**
	 * Returns the value of the '<em><b>Process Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Model</em>' containment reference.
	 * @see #setProcessModel(ProcessModel)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getModelType_ProcessModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processModel' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessModel getProcessModel();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getProcessModel <em>Process Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Model</em>' containment reference.
	 * @see #getProcessModel()
	 * @generated
	 */
	void setProcessModel(ProcessModel value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getModelType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getModelType_SchemaVersion()
	 * @model default="1.0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='schemaVersion'"
	 * @generated
	 */
	String getSchemaVersion();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(String value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @generated
	 */
	void unsetSchemaVersion();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.ModelType#getSchemaVersion <em>Schema Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schema Version</em>' attribute is set.
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @generated
	 */
	boolean isSetSchemaVersion();

} // ModelType