/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Availability;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.IndividualResource;
import com.ibm.wbim.bom.schema1.Qualification;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl#getIndividualResourceCostType <em>Individual Resource Cost Type</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl#getOneTimeCost <em>One Time Cost</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl#getCostPerTimeUnit <em>Cost Per Time Unit</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceImpl#getQualification <em>Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualResourceImpl extends ComplexDataTypeInstanceImpl implements IndividualResource {
	/**
	 * The cached value of the '{@link #getIndividualResourceCostType() <em>Individual Resource Cost Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceCostType()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap individualResourceCostType = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList availability = null;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected EList qualification = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getIndividualResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIndividualResourceCostType() {
		if (individualResourceCostType == null) {
			individualResourceCostType = new BasicFeatureMap(this, Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE);
		}
		return individualResourceCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOneTimeCost() {
		return ((FeatureMap)getIndividualResourceCostType()).list(Schema1Package.eINSTANCE.getIndividualResource_OneTimeCost());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCostPerTimeUnit() {
		return ((FeatureMap)getIndividualResourceCostType()).list(Schema1Package.eINSTANCE.getIndividualResource_CostPerTimeUnit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAvailability() {
		if (availability == null) {
			availability = new EObjectContainmentEList(Availability.class, this, Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY);
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getQualification() {
		if (qualification == null) {
			qualification = new EObjectContainmentEList(Qualification.class, this, Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION);
		}
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.INDIVIDUAL_RESOURCE__ATTRIBUTE_VALUE:
					return ((InternalEList)getAttributeValue()).basicRemove(otherEnd, msgs);
				case Schema1Package.INDIVIDUAL_RESOURCE__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
				case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
					return ((InternalEList)getIndividualResourceCostType()).basicRemove(otherEnd, msgs);
				case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
					return ((InternalEList)getOneTimeCost()).basicRemove(otherEnd, msgs);
				case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
					return ((InternalEList)getCostPerTimeUnit()).basicRemove(otherEnd, msgs);
				case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
					return ((InternalEList)getAvailability()).basicRemove(otherEnd, msgs);
				case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
					return ((InternalEList)getQualification()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.INDIVIDUAL_RESOURCE__DOCUMENTATION:
				return getDocumentation();
			case Schema1Package.INDIVIDUAL_RESOURCE__ATTRIBUTE_VALUE:
				return getAttributeValue();
			case Schema1Package.INDIVIDUAL_RESOURCE__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.INDIVIDUAL_RESOURCE__INSTANCE_OF:
				return getInstanceOf();
			case Schema1Package.INDIVIDUAL_RESOURCE__NAME:
				return getName();
			case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
				return getIndividualResourceCostType();
			case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
				return getOneTimeCost();
			case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
				return getCostPerTimeUnit();
			case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
				return getAvailability();
			case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
				return getQualification();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.INDIVIDUAL_RESOURCE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__ATTRIBUTE_VALUE:
				getAttributeValue().clear();
				getAttributeValue().addAll((Collection)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__INSTANCE_OF:
				setInstanceOf((String)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
				getIndividualResourceCostType().clear();
				getIndividualResourceCostType().addAll((Collection)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
				getOneTimeCost().clear();
				getOneTimeCost().addAll((Collection)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
				getCostPerTimeUnit().clear();
				getCostPerTimeUnit().addAll((Collection)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
				getAvailability().clear();
				getAvailability().addAll((Collection)newValue);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
				getQualification().clear();
				getQualification().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.INDIVIDUAL_RESOURCE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__ATTRIBUTE_VALUE:
				getAttributeValue().clear();
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__INSTANCE_OF:
				setInstanceOf(INSTANCE_OF_EDEFAULT);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
				getIndividualResourceCostType().clear();
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
				getOneTimeCost().clear();
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
				getCostPerTimeUnit().clear();
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
				getAvailability().clear();
				return;
			case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
				getQualification().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.INDIVIDUAL_RESOURCE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case Schema1Package.INDIVIDUAL_RESOURCE__ATTRIBUTE_VALUE:
				return attributeValue != null && !attributeValue.isEmpty();
			case Schema1Package.INDIVIDUAL_RESOURCE__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.INDIVIDUAL_RESOURCE__INSTANCE_OF:
				return INSTANCE_OF_EDEFAULT == null ? instanceOf != null : !INSTANCE_OF_EDEFAULT.equals(instanceOf);
			case Schema1Package.INDIVIDUAL_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
				return individualResourceCostType != null && !individualResourceCostType.isEmpty();
			case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
				return !getOneTimeCost().isEmpty();
			case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
				return !getCostPerTimeUnit().isEmpty();
			case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
				return availability != null && !availability.isEmpty();
			case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
				return qualification != null && !qualification.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (individualResourceCostType: ");
		result.append(individualResourceCostType);
		result.append(')');
		return result.toString();
	}

} //IndividualResourceImpl
