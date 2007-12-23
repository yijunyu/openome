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
 * A representation of the model object '<em><b>Individual Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResource#getIndividualResourceCostType <em>Individual Resource Cost Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResource#getOneTimeCost <em>One Time Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResource#getCostPerTimeUnit <em>Cost Per Time Unit</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResource#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.IndividualResource#getQualification <em>Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResource()
 * @model extendedMetaData="name='IndividualResource' kind='elementOnly'"
 * @generated
 */
public interface IndividualResource extends ComplexDataTypeInstance {
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResource_IndividualResourceCostType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IndividualResourceCostType:5'"
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResource_OneTimeCost()
	 * @model type="com.ibm.wbim.bom.schema1.OneTimeCost" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oneTimeCost' namespace='##targetNamespace' group='#IndividualResourceCostType:5'"
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResource_CostPerTimeUnit()
	 * @model type="com.ibm.wbim.bom.schema1.CostPerTimeUnit" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='costPerTimeUnit' namespace='##targetNamespace' group='#IndividualResourceCostType:5'"
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResource_Availability()
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
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getIndividualResource_Qualification()
	 * @model type="com.ibm.wbim.bom.schema1.Qualification" containment="true"
	 *        extendedMetaData="kind='element' name='qualification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getQualification();

} // IndividualResource
