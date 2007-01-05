/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.PersonNameType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonNameTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonNameTypeImpl#getAlternativeName1 <em>Alternative Name1</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.PersonNameTypeImpl#getAlternativeName2 <em>Alternative Name2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonNameTypeImpl extends EObjectImpl implements PersonNameType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternativeName1() <em>Alternative Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName1()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_NAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeName1() <em>Alternative Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName1()
	 * @generated
	 * @ordered
	 */
	protected String alternativeName1 = ALTERNATIVE_NAME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternativeName2() <em>Alternative Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName2()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_NAME2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeName2() <em>Alternative Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeName2()
	 * @generated
	 * @ordered
	 */
	protected String alternativeName2 = ALTERNATIVE_NAME2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getPersonNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_NAME_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeName1() {
		return alternativeName1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeName1(String newAlternativeName1) {
		String oldAlternativeName1 = alternativeName1;
		alternativeName1 = newAlternativeName1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME1, oldAlternativeName1, alternativeName1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeName2() {
		return alternativeName2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeName2(String newAlternativeName2) {
		String oldAlternativeName2 = alternativeName2;
		alternativeName2 = newAlternativeName2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME2, oldAlternativeName2, alternativeName2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Schema1Package.PERSON_NAME_TYPE__NAME:
				return getName();
			case Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME1:
				return getAlternativeName1();
			case Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME2:
				return getAlternativeName2();
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
			case Schema1Package.PERSON_NAME_TYPE__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME1:
				setAlternativeName1((String)newValue);
				return;
			case Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME2:
				setAlternativeName2((String)newValue);
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
			case Schema1Package.PERSON_NAME_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME1:
				setAlternativeName1(ALTERNATIVE_NAME1_EDEFAULT);
				return;
			case Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME2:
				setAlternativeName2(ALTERNATIVE_NAME2_EDEFAULT);
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
			case Schema1Package.PERSON_NAME_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME1:
				return ALTERNATIVE_NAME1_EDEFAULT == null ? alternativeName1 != null : !ALTERNATIVE_NAME1_EDEFAULT.equals(alternativeName1);
			case Schema1Package.PERSON_NAME_TYPE__ALTERNATIVE_NAME2:
				return ALTERNATIVE_NAME2_EDEFAULT == null ? alternativeName2 != null : !ALTERNATIVE_NAME2_EDEFAULT.equals(alternativeName2);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", alternativeName1: ");
		result.append(alternativeName1);
		result.append(", alternativeName2: ");
		result.append(alternativeName2);
		result.append(')');
		return result.toString();
	}

} //PersonNameTypeImpl
