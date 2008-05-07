/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Availability;
import com.ibm.wbim.bom.schema1.CostPerTimeUnit;
import com.ibm.wbim.bom.schema1.IndividualResource;
import com.ibm.wbim.bom.schema1.OneTimeCost;
import com.ibm.wbim.bom.schema1.Qualification;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
public class IndividualResourceImpl extends ComplexDataTypeInstanceImpl
		implements IndividualResource {
	/**
	 * The cached value of the '{@link #getIndividualResourceCostType() <em>Individual Resource Cost Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceCostType()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap individualResourceCostType;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList<Availability> availability;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> qualification;

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
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.INDIVIDUAL_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIndividualResourceCostType() {
		if (individualResourceCostType == null) {
			individualResourceCostType = new BasicFeatureMap(
					this,
					Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE);
		}
		return individualResourceCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneTimeCost> getOneTimeCost() {
		return getIndividualResourceCostType().list(
				Schema1Package.Literals.INDIVIDUAL_RESOURCE__ONE_TIME_COST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CostPerTimeUnit> getCostPerTimeUnit() {
		return getIndividualResourceCostType()
				.list(
						Schema1Package.Literals.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Availability> getAvailability() {
		if (availability == null) {
			availability = new EObjectContainmentEList<Availability>(
					Availability.class, this,
					Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY);
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getQualification() {
		if (qualification == null) {
			qualification = new EObjectContainmentEList<Qualification>(
					Qualification.class, this,
					Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION);
		}
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
			return ((InternalEList<?>) getIndividualResourceCostType())
					.basicRemove(otherEnd, msgs);
		case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
			return ((InternalEList<?>) getOneTimeCost()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
			return ((InternalEList<?>) getCostPerTimeUnit()).basicRemove(
					otherEnd, msgs);
		case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
			return ((InternalEList<?>) getAvailability()).basicRemove(otherEnd,
					msgs);
		case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
			return ((InternalEList<?>) getQualification()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
			if (coreType)
				return getIndividualResourceCostType();
			return ((FeatureMap.Internal) getIndividualResourceCostType())
					.getWrapper();
		case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
			return getOneTimeCost();
		case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
			return getCostPerTimeUnit();
		case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
			return getAvailability();
		case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
			return getQualification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
			((FeatureMap.Internal) getIndividualResourceCostType())
					.set(newValue);
			return;
		case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
			getOneTimeCost().clear();
			getOneTimeCost().addAll(
					(Collection<? extends OneTimeCost>) newValue);
			return;
		case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
			getCostPerTimeUnit().clear();
			getCostPerTimeUnit().addAll(
					(Collection<? extends CostPerTimeUnit>) newValue);
			return;
		case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
			getAvailability().clear();
			getAvailability().addAll(
					(Collection<? extends Availability>) newValue);
			return;
		case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
			getQualification().clear();
			getQualification().addAll(
					(Collection<? extends Qualification>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
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
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Schema1Package.INDIVIDUAL_RESOURCE__INDIVIDUAL_RESOURCE_COST_TYPE:
			return individualResourceCostType != null
					&& !individualResourceCostType.isEmpty();
		case Schema1Package.INDIVIDUAL_RESOURCE__ONE_TIME_COST:
			return !getOneTimeCost().isEmpty();
		case Schema1Package.INDIVIDUAL_RESOURCE__COST_PER_TIME_UNIT:
			return !getCostPerTimeUnit().isEmpty();
		case Schema1Package.INDIVIDUAL_RESOURCE__AVAILABILITY:
			return availability != null && !availability.isEmpty();
		case Schema1Package.INDIVIDUAL_RESOURCE__QUALIFICATION:
			return qualification != null && !qualification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (individualResourceCostType: ");
		result.append(individualResourceCostType);
		result.append(')');
		return result.toString();
	}

} //IndividualResourceImpl
