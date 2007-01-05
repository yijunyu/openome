/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.OperationalData;
import com.ibm.wbim.bom.schema1.Organizations;
import com.ibm.wbim.bom.schema1.Outputs;
import com.ibm.wbim.bom.schema1.Resources;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends TaskImpl implements Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.SERVICE__INPUTS:
					return basicSetInputs(null, msgs);
				case Schema1Package.SERVICE__OUTPUTS:
					return basicSetOutputs(null, msgs);
				case Schema1Package.SERVICE__PRECONDITION:
					return ((InternalEList)getPrecondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.SERVICE__POSTCONDITION:
					return ((InternalEList)getPostcondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.SERVICE__RESOURCES:
					return basicSetResources(null, msgs);
				case Schema1Package.SERVICE__ORGANIZATIONS:
					return basicSetOrganizations(null, msgs);
				case Schema1Package.SERVICE__OPERATIONAL_DATA:
					return basicSetOperationalData(null, msgs);
				case Schema1Package.SERVICE__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
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
			case Schema1Package.SERVICE__DESCRIPTION:
				return getDescription();
			case Schema1Package.SERVICE__INPUTS:
				return getInputs();
			case Schema1Package.SERVICE__OUTPUTS:
				return getOutputs();
			case Schema1Package.SERVICE__PRECONDITION:
				return getPrecondition();
			case Schema1Package.SERVICE__POSTCONDITION:
				return getPostcondition();
			case Schema1Package.SERVICE__RESOURCES:
				return getResources();
			case Schema1Package.SERVICE__ORGANIZATIONS:
				return getOrganizations();
			case Schema1Package.SERVICE__OPERATIONAL_DATA:
				return getOperationalData();
			case Schema1Package.SERVICE__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.SERVICE__NAME:
				return getName();
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
			case Schema1Package.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.SERVICE__INPUTS:
				setInputs((Inputs)newValue);
				return;
			case Schema1Package.SERVICE__OUTPUTS:
				setOutputs((Outputs)newValue);
				return;
			case Schema1Package.SERVICE__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection)newValue);
				return;
			case Schema1Package.SERVICE__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection)newValue);
				return;
			case Schema1Package.SERVICE__RESOURCES:
				setResources((Resources)newValue);
				return;
			case Schema1Package.SERVICE__ORGANIZATIONS:
				setOrganizations((Organizations)newValue);
				return;
			case Schema1Package.SERVICE__OPERATIONAL_DATA:
				setOperationalData((OperationalData)newValue);
				return;
			case Schema1Package.SERVICE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.SERVICE__NAME:
				setName((String)newValue);
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
			case Schema1Package.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.SERVICE__INPUTS:
				setInputs((Inputs)null);
				return;
			case Schema1Package.SERVICE__OUTPUTS:
				setOutputs((Outputs)null);
				return;
			case Schema1Package.SERVICE__PRECONDITION:
				getPrecondition().clear();
				return;
			case Schema1Package.SERVICE__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Schema1Package.SERVICE__RESOURCES:
				setResources((Resources)null);
				return;
			case Schema1Package.SERVICE__ORGANIZATIONS:
				setOrganizations((Organizations)null);
				return;
			case Schema1Package.SERVICE__OPERATIONAL_DATA:
				setOperationalData((OperationalData)null);
				return;
			case Schema1Package.SERVICE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.SERVICE__NAME:
				setName(NAME_EDEFAULT);
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
			case Schema1Package.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.SERVICE__INPUTS:
				return inputs != null;
			case Schema1Package.SERVICE__OUTPUTS:
				return outputs != null;
			case Schema1Package.SERVICE__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Schema1Package.SERVICE__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Schema1Package.SERVICE__RESOURCES:
				return resources != null;
			case Schema1Package.SERVICE__ORGANIZATIONS:
				return organizations != null;
			case Schema1Package.SERVICE__OPERATIONAL_DATA:
				return operationalData != null;
			case Schema1Package.SERVICE__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return eDynamicIsSet(eFeature);
	}

} //ServiceImpl
