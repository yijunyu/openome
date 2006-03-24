/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.GlobalRepositoryRef;
import com.ibm.wbim.bom.schema1.LocalRepositoryRef;
import com.ibm.wbim.bom.schema1.OutputRepositoryValueType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Repository Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueTypeImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputRepositoryValueTypeImpl extends OutputRepositoryValueImpl implements OutputRepositoryValueType {
	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected String output = OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputRepositoryValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getOutputRepositoryValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(String newOutput) {
		String oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
					return basicSetLocalRepository(null, msgs);
				case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
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
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
				return getLocalRepository();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
				return getGlobalRepository();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING:
				return isAtBeginning() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__IS_INSERT:
				return isIsInsert() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__OUTPUT:
				return getOutput();
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
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
				setLocalRepository((LocalRepositoryRef)newValue);
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
				setGlobalRepository((GlobalRepositoryRef)newValue);
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING:
				setAtBeginning(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__IS_INSERT:
				setIsInsert(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__OUTPUT:
				setOutput((String)newValue);
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
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
				setLocalRepository((LocalRepositoryRef)null);
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
				setGlobalRepository((GlobalRepositoryRef)null);
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING:
				unsetAtBeginning();
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__IS_INSERT:
				unsetIsInsert();
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
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
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__LOCAL_REPOSITORY:
				return localRepository != null;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__GLOBAL_REPOSITORY:
				return globalRepository != null;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__AT_BEGINNING:
				return isSetAtBeginning();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__IS_INSERT:
				return isSetIsInsert();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE_TYPE__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
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
		result.append(" (output: ");
		result.append(output);
		result.append(')');
		return result.toString();
	}

} //OutputRepositoryValueTypeImpl
