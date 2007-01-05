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
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getOperationalData <em>Operational Data</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getFlowContent <em>Flow Content</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Process#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess()
 * @model extendedMetaData="name='Process' kind='elementOnly'"
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Process#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(Inputs)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_Inputs()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	Inputs getInputs();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Process#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(Inputs value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference.
	 * @see #setOutputs(Outputs)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_Outputs()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
	 * @generated
	 */
	Outputs getOutputs();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Process#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(Outputs value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_Precondition()
	 * @model type="com.ibm.wbim.bom.schema1.Expression" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='precondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getPrecondition();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_Postcondition()
	 * @model type="com.ibm.wbim.bom.schema1.Expression" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='postcondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getPostcondition();

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference.
	 * @see #setOrganizations(Organizations)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_Organizations()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='organizations' namespace='##targetNamespace'"
	 * @generated
	 */
	Organizations getOrganizations();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Process#getOrganizations <em>Organizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizations</em>' containment reference.
	 * @see #getOrganizations()
	 * @generated
	 */
	void setOrganizations(Organizations value);

	/**
	 * Returns the value of the '<em><b>Operational Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Data</em>' containment reference.
	 * @see #setOperationalData(OperationalData)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_OperationalData()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='operationalData' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationalData getOperationalData();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Process#getOperationalData <em>Operational Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Data</em>' containment reference.
	 * @see #getOperationalData()
	 * @generated
	 */
	void setOperationalData(OperationalData value);

	/**
	 * Returns the value of the '<em><b>Flow Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Content</em>' containment reference.
	 * @see #setFlowContent(FlowContentType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_FlowContent()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='flowContent' namespace='##targetNamespace'"
	 * @generated
	 */
	FlowContentType getFlowContent();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Process#getFlowContent <em>Flow Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Content</em>' containment reference.
	 * @see #getFlowContent()
	 * @generated
	 */
	void setFlowContent(FlowContentType value);

	/**
	 * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is currently not processed. It can contain additional information about the element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #setExtendedAttributes(ExtendedAttributes)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_ExtendedAttributes()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='extendedAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedAttributes getExtendedAttributes();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Process#getExtendedAttributes <em>Extended Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #getExtendedAttributes()
	 * @generated
	 */
	void setExtendedAttributes(ExtendedAttributes value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a local process, the name type is xsd:string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcess_Name()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Process
