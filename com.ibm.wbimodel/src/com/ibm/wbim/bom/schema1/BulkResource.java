/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bulk Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResource#getBulkResourceCostType <em>Bulk Resource Cost Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResource#getOneTimeCost <em>One Time Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResource#getCostPerQuantity <em>Cost Per Quantity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResource#getCostPerQuantityAndTimeUnit <em>Cost Per Quantity And Time Unit</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResource#getAvailableQuantity <em>Available Quantity</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResource#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResource#getQualification <em>Qualification</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.BulkResource#isIsConsumable <em>Is Consumable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource()
 * @model extendedMetaData="name='BulkResource' kind='elementOnly'"
 * @generated
 */
public interface BulkResource extends ComplexDataTypeInstance {
	/**
	 * Returns the value of the '<em><b>Bulk Resource Cost Type</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk Resource Cost Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Resource Cost Type</em>' attribute list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource_BulkResourceCostType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BulkResourceCostType:5'"
	 * @generated
	 */
	FeatureMap getBulkResourceCostType();

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource_OneTimeCost()
	 * @model type="com.ibm.wbim.bom.schema1.OneTimeCost" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oneTimeCost' namespace='##targetNamespace' group='#BulkResourceCostType:5'"
	 * @generated
	 */
	EList getOneTimeCost();

	/**
	 * Returns the value of the '<em><b>Cost Per Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.CostPerQuantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Quantity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Quantity</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource_CostPerQuantity()
	 * @model type="com.ibm.wbim.bom.schema1.CostPerQuantity" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='costPerQuantity' namespace='##targetNamespace' group='#BulkResourceCostType:5'"
	 * @generated
	 */
	EList getCostPerQuantity();

	/**
	 * Returns the value of the '<em><b>Cost Per Quantity And Time Unit</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Quantity And Time Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Quantity And Time Unit</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource_CostPerQuantityAndTimeUnit()
	 * @model type="com.ibm.wbim.bom.schema1.CostPerQuantityAndTimeUnit" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='costPerQuantityAndTimeUnit' namespace='##targetNamespace' group='#BulkResourceCostType:5'"
	 * @generated
	 */
	EList getCostPerQuantityAndTimeUnit();

	/**
	 * Returns the value of the '<em><b>Available Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Quantity</em>' containment reference.
	 * @see #setAvailableQuantity(Quantity)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource_AvailableQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAvailableQuantity();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.BulkResource#getAvailableQuantity <em>Available Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Quantity</em>' containment reference.
	 * @see #getAvailableQuantity()
	 * @generated
	 */
	void setAvailableQuantity(Quantity value);

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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource_Availability()
	 * @model type="com.ibm.wbim.bom.schema1.Availability" containment="true"
	 *        extendedMetaData="kind='element' name='availability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAvailability();

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource_Qualification()
	 * @model type="com.ibm.wbim.bom.schema1.Qualification" containment="true"
	 *        extendedMetaData="kind='element' name='qualification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getQualification();

	/**
	 * Returns the value of the '<em><b>Is Consumable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Consumable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consumable</em>' attribute.
	 * @see #isSetIsConsumable()
	 * @see #unsetIsConsumable()
	 * @see #setIsConsumable(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getBulkResource_IsConsumable()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isConsumable'"
	 * @generated
	 */
	boolean isIsConsumable();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.BulkResource#isIsConsumable <em>Is Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consumable</em>' attribute.
	 * @see #isSetIsConsumable()
	 * @see #unsetIsConsumable()
	 * @see #isIsConsumable()
	 * @generated
	 */
	void setIsConsumable(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.BulkResource#isIsConsumable <em>Is Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConsumable()
	 * @see #isIsConsumable()
	 * @see #setIsConsumable(boolean)
	 * @generated
	 */
	void unsetIsConsumable();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.BulkResource#isIsConsumable <em>Is Consumable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Consumable</em>' attribute is set.
	 * @see #unsetIsConsumable()
	 * @see #isIsConsumable()
	 * @see #setIsConsumable(boolean)
	 * @generated
	 */
	boolean isSetIsConsumable();

} // BulkResource