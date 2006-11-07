/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ControlActionOutputRef;
import com.ibm.wbim.bom.schema1.OutputRepositoryValue;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Action Output Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ControlActionOutputRefImpl#getRepositoryValue <em>Repository Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ControlActionOutputRefImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlActionOutputRefImpl extends EObjectImpl implements ControlActionOutputRef {
	/**
	 * The cached value of the '{@link #getRepositoryValue() <em>Repository Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryValue()
	 * @generated
	 * @ordered
	 */
	protected OutputRepositoryValue repositoryValue = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlActionOutputRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.CONTROL_ACTION_OUTPUT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRepositoryValue getRepositoryValue() {
		return repositoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepositoryValue(OutputRepositoryValue newRepositoryValue, NotificationChain msgs) {
		OutputRepositoryValue oldRepositoryValue = repositoryValue;
		repositoryValue = newRepositoryValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE, oldRepositoryValue, newRepositoryValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryValue(OutputRepositoryValue newRepositoryValue) {
		if (newRepositoryValue != repositoryValue) {
			NotificationChain msgs = null;
			if (repositoryValue != null)
				msgs = ((InternalEObject)repositoryValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE, null, msgs);
			if (newRepositoryValue != null)
				msgs = ((InternalEObject)newRepositoryValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE, null, msgs);
			msgs = basicSetRepositoryValue(newRepositoryValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE, newRepositoryValue, newRepositoryValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CONTROL_ACTION_OUTPUT_REF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE:
				return basicSetRepositoryValue(null, msgs);
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
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE:
				return getRepositoryValue();
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__NAME:
				return getName();
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
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE:
				setRepositoryValue((OutputRepositoryValue)newValue);
				return;
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__NAME:
				setName((String)newValue);
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
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE:
				setRepositoryValue((OutputRepositoryValue)null);
				return;
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__NAME:
				setName(NAME_EDEFAULT);
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
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__REPOSITORY_VALUE:
				return repositoryValue != null;
			case Schema1Package.CONTROL_ACTION_OUTPUT_REF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //ControlActionOutputRefImpl