/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.IndividualResourceDefinitionsType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.TypeDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Resource Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionsTypeImpl#getIndividualResourceDefinition <em>Individual Resource Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualResourceDefinitionsTypeImpl extends EObjectImpl implements IndividualResourceDefinitionsType {
	/**
	 * The cached value of the '{@link #getIndividualResourceDefinition() <em>Individual Resource Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList individualResourceDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualResourceDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIndividualResourceDefinition() {
		if (individualResourceDefinition == null) {
			individualResourceDefinition = new EObjectContainmentEList(TypeDeclaration.class, this, Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE__INDIVIDUAL_RESOURCE_DEFINITION);
		}
		return individualResourceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE__INDIVIDUAL_RESOURCE_DEFINITION:
				return ((InternalEList)getIndividualResourceDefinition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE__INDIVIDUAL_RESOURCE_DEFINITION:
				return getIndividualResourceDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE__INDIVIDUAL_RESOURCE_DEFINITION:
				getIndividualResourceDefinition().clear();
				getIndividualResourceDefinition().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE__INDIVIDUAL_RESOURCE_DEFINITION:
				getIndividualResourceDefinition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITIONS_TYPE__INDIVIDUAL_RESOURCE_DEFINITION:
				return individualResourceDefinition != null && !individualResourceDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualResourceDefinitionsTypeImpl
