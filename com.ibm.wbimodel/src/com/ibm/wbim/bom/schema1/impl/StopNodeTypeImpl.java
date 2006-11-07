/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.StopNodeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.StopNodeTypeImpl#getAssociatedOutputCriterion <em>Associated Output Criterion</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.StopNodeTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StopNodeTypeImpl extends EObjectImpl implements StopNodeType {
	/**
	 * The default value of the '{@link #getAssociatedOutputCriterion() <em>Associated Output Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedOutputCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_OUTPUT_CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedOutputCriterion() <em>Associated Output Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedOutputCriterion()
	 * @generated
	 * @ordered
	 */
	protected String associatedOutputCriterion = ASSOCIATED_OUTPUT_CRITERION_EDEFAULT;

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
	protected StopNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.STOP_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatedOutputCriterion() {
		return associatedOutputCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedOutputCriterion(String newAssociatedOutputCriterion) {
		String oldAssociatedOutputCriterion = associatedOutputCriterion;
		associatedOutputCriterion = newAssociatedOutputCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.STOP_NODE_TYPE__ASSOCIATED_OUTPUT_CRITERION, oldAssociatedOutputCriterion, associatedOutputCriterion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.STOP_NODE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.STOP_NODE_TYPE__ASSOCIATED_OUTPUT_CRITERION:
				return getAssociatedOutputCriterion();
			case Schema1Package.STOP_NODE_TYPE__NAME:
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
			case Schema1Package.STOP_NODE_TYPE__ASSOCIATED_OUTPUT_CRITERION:
				setAssociatedOutputCriterion((String)newValue);
				return;
			case Schema1Package.STOP_NODE_TYPE__NAME:
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
			case Schema1Package.STOP_NODE_TYPE__ASSOCIATED_OUTPUT_CRITERION:
				setAssociatedOutputCriterion(ASSOCIATED_OUTPUT_CRITERION_EDEFAULT);
				return;
			case Schema1Package.STOP_NODE_TYPE__NAME:
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
			case Schema1Package.STOP_NODE_TYPE__ASSOCIATED_OUTPUT_CRITERION:
				return ASSOCIATED_OUTPUT_CRITERION_EDEFAULT == null ? associatedOutputCriterion != null : !ASSOCIATED_OUTPUT_CRITERION_EDEFAULT.equals(associatedOutputCriterion);
			case Schema1Package.STOP_NODE_TYPE__NAME:
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
		result.append(" (associatedOutputCriterion: ");
		result.append(associatedOutputCriterion);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StopNodeTypeImpl