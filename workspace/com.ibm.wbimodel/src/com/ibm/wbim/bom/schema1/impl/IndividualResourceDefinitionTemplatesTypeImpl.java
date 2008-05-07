/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.IndividualResourceDefinitionTemplatesType;
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
 * An implementation of the model object '<em><b>Individual Resource Definition Templates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.IndividualResourceDefinitionTemplatesTypeImpl#getIndividualResourceDefinitionTemplate <em>Individual Resource Definition Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualResourceDefinitionTemplatesTypeImpl extends EObjectImpl
		implements IndividualResourceDefinitionTemplatesType {
	/**
	 * The cached value of the '{@link #getIndividualResourceDefinitionTemplate() <em>Individual Resource Definition Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualResourceDefinitionTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeclaration> individualResourceDefinitionTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualResourceDefinitionTemplatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeclaration> getIndividualResourceDefinitionTemplate() {
		if (individualResourceDefinitionTemplate == null) {
			individualResourceDefinitionTemplate = new EObjectContainmentEList<TypeDeclaration>(
					TypeDeclaration.class,
					this,
					Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATE);
		}
		return individualResourceDefinitionTemplate;
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
		case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATE:
			return ((InternalEList<?>) getIndividualResourceDefinitionTemplate())
					.basicRemove(otherEnd, msgs);
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
		case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATE:
			return getIndividualResourceDefinitionTemplate();
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
		case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATE:
			getIndividualResourceDefinitionTemplate().clear();
			getIndividualResourceDefinitionTemplate().addAll(
					(Collection<? extends TypeDeclaration>) newValue);
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
		case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATE:
			getIndividualResourceDefinitionTemplate().clear();
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
		case Schema1Package.INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATES_TYPE__INDIVIDUAL_RESOURCE_DEFINITION_TEMPLATE:
			return individualResourceDefinitionTemplate != null
					&& !individualResourceDefinitionTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualResourceDefinitionTemplatesTypeImpl
