/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.InputConstantValue;
import com.ibm.wbim.bom.schema1.PublicInstance;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Constant Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputConstantValueImpl#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputConstantValueImpl#getPublicInstance <em>Public Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputConstantValueImpl extends EObjectImpl implements InputConstantValue {
	/**
	 * The cached value of the '{@link #getLiteralValue() <em>Literal Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralValue()
	 * @generated
	 * @ordered
	 */
	protected EList literalValue = null;

	/**
	 * The cached value of the '{@link #getPublicInstance() <em>Public Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicInstance()
	 * @generated
	 * @ordered
	 */
	protected EList publicInstance = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputConstantValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getInputConstantValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLiteralValue() {
		if (literalValue == null) {
			literalValue = new EDataTypeEList(String.class, this, Schema1Package.INPUT_CONSTANT_VALUE__LITERAL_VALUE);
		}
		return literalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPublicInstance() {
		if (publicInstance == null) {
			publicInstance = new EObjectContainmentEList(PublicInstance.class, this, Schema1Package.INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE);
		}
		return publicInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE:
					return ((InternalEList)getPublicInstance()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.INPUT_CONSTANT_VALUE__LITERAL_VALUE:
				return getLiteralValue();
			case Schema1Package.INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE:
				return getPublicInstance();
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
			case Schema1Package.INPUT_CONSTANT_VALUE__LITERAL_VALUE:
				getLiteralValue().clear();
				getLiteralValue().addAll((Collection)newValue);
				return;
			case Schema1Package.INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE:
				getPublicInstance().clear();
				getPublicInstance().addAll((Collection)newValue);
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
			case Schema1Package.INPUT_CONSTANT_VALUE__LITERAL_VALUE:
				getLiteralValue().clear();
				return;
			case Schema1Package.INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE:
				getPublicInstance().clear();
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
			case Schema1Package.INPUT_CONSTANT_VALUE__LITERAL_VALUE:
				return literalValue != null && !literalValue.isEmpty();
			case Schema1Package.INPUT_CONSTANT_VALUE__PUBLIC_INSTANCE:
				return publicInstance != null && !publicInstance.isEmpty();
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
		result.append(" (literalValue: ");
		result.append(literalValue);
		result.append(')');
		return result.toString();
	}

} //InputConstantValueImpl
