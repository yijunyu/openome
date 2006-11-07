/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Role#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Role#getScopeDimension <em>Scope Dimension</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Role#getIndividualResourceCostType <em>Individual Resource Cost Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Role#getOneTimeCost <em>One Time Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Role#getCostPerTimeUnit <em>Cost Per Time Unit</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Role#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Role#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Role#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole()
 * @model extendedMetaData="name='Role' kind='elementOnly'"
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Role#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Scope Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.ScopeDimensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Dimension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Dimension</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole_ScopeDimension()
	 * @model type="com.ibm.wbim.bom.schema1.ScopeDimensionType" containment="true"
	 *        extendedMetaData="kind='element' name='scopeDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getScopeDimension();

	/**
	 * Returns the value of the '<em><b>Individual Resource Cost Type</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Resource Cost Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Resource Cost Type</em>' attribute list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole_IndividualResourceCostType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IndividualResourceCostType:2'"
	 * @generated
	 */
	FeatureMap getIndividualResourceCostType();

	/**
	 * Returns the value of the '<em><b>One Time Cost</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.OneTimeCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Time Cost</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Time Cost</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole_OneTimeCost()
	 * @model type="com.ibm.wbim.bom.schema1.OneTimeCost" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oneTimeCost' namespace='##targetNamespace' group='#IndividualResourceCostType:2'"
	 * @generated
	 */
	EList getOneTimeCost();

	/**
	 * Returns the value of the '<em><b>Cost Per Time Unit</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.CostPerTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Time Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Time Unit</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole_CostPerTimeUnit()
	 * @model type="com.ibm.wbim.bom.schema1.CostPerTimeUnit" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='costPerTimeUnit' namespace='##targetNamespace' group='#IndividualResourceCostType:2'"
	 * @generated
	 */
	EList getCostPerTimeUnit();

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Availability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole_Availability()
	 * @model type="com.ibm.wbim.bom.schema1.Availability" containment="true"
	 *        extendedMetaData="kind='element' name='availability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAvailability();

	/**
	 * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is currently not processed. It can contain additional information about the element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attributes</em>' containment reference.
	 * @see #setExtendedAttributes(ExtendedAttributes)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole_ExtendedAttributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extendedAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedAttributes getExtendedAttributes();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Role#getExtendedAttributes <em>Extended Attributes</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getRole_Name()
	 * @model unique="false" dataType="com.ibm.wbim.bom.schema1.ElementName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Role