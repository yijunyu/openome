/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.GlobalRepositoryRef;
import com.ibm.wbim.bom.schema1.InputRepositoryValueType;
import com.ibm.wbim.bom.schema1.LocalRepositoryRef;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Repository Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.InputRepositoryValueTypeImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputRepositoryValueTypeImpl extends InputRepositoryValueImpl implements InputRepositoryValueType {
	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputRepositoryValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getInputRepositoryValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
					return basicSetLocalRepository(null, msgs);
				case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
					return basicSetGlobalRepository(null, msgs);
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
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
				return getLocalRepository();
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
				return getGlobalRepository();
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING:
				return isAtBeginning() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__IS_REMOVE:
				return isIsRemove() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__INPUT:
				return getInput();
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
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
				setLocalRepository((LocalRepositoryRef)newValue);
				return;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
				setGlobalRepository((GlobalRepositoryRef)newValue);
				return;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING:
				setAtBeginning(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__IS_REMOVE:
				setIsRemove(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__INPUT:
				setInput((String)newValue);
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
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
				setLocalRepository((LocalRepositoryRef)null);
				return;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
				setGlobalRepository((GlobalRepositoryRef)null);
				return;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING:
				unsetAtBeginning();
				return;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__IS_REMOVE:
				unsetIsRemove();
				return;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__INPUT:
				setInput(INPUT_EDEFAULT);
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
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
				return localRepository != null;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
				return globalRepository != null;
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING:
				return isSetAtBeginning();
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__IS_REMOVE:
				return isSetIsRemove();
			case Schema1Package.INPUT_REPOSITORY_VALUE_TYPE__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
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
		result.append(" (input: ");
		result.append(input);
		result.append(')');
		return result.toString();
	}

} //InputRepositoryValueTypeImpl
