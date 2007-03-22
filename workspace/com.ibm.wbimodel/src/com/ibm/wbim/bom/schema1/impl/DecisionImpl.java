/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Decision;
import com.ibm.wbim.bom.schema1.InputBranch;
import com.ibm.wbim.bom.schema1.OutputBranchType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DecisionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DecisionImpl#getInputBranch <em>Input Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DecisionImpl#getOutputBranch <em>Output Branch</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DecisionImpl#isIsInclusive <em>Is Inclusive</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DecisionImpl#isIsSimpleDecision <em>Is Simple Decision</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DecisionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends EObjectImpl implements Decision {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputBranch() <em>Input Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBranch()
	 * @generated
	 * @ordered
	 */
	protected InputBranch inputBranch = null;

	/**
	 * The cached value of the '{@link #getOutputBranch() <em>Output Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputBranch()
	 * @generated
	 * @ordered
	 */
	protected EList outputBranch = null;

	/**
	 * The default value of the '{@link #isIsInclusive() <em>Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInclusive() <em>Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean isInclusive = IS_INCLUSIVE_EDEFAULT;

	/**
	 * This is true if the Is Inclusive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isInclusiveESet = false;

	/**
	 * The default value of the '{@link #isIsSimpleDecision() <em>Is Simple Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimpleDecision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_DECISION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSimpleDecision() <em>Is Simple Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimpleDecision()
	 * @generated
	 * @ordered
	 */
	protected boolean isSimpleDecision = IS_SIMPLE_DECISION_EDEFAULT;

	/**
	 * This is true if the Is Simple Decision attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSimpleDecisionESet = false;

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
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DECISION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBranch getInputBranch() {
		return inputBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputBranch(InputBranch newInputBranch, NotificationChain msgs) {
		InputBranch oldInputBranch = inputBranch;
		inputBranch = newInputBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.DECISION__INPUT_BRANCH, oldInputBranch, newInputBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputBranch(InputBranch newInputBranch) {
		if (newInputBranch != inputBranch) {
			NotificationChain msgs = null;
			if (inputBranch != null)
				msgs = ((InternalEObject)inputBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DECISION__INPUT_BRANCH, null, msgs);
			if (newInputBranch != null)
				msgs = ((InternalEObject)newInputBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.DECISION__INPUT_BRANCH, null, msgs);
			msgs = basicSetInputBranch(newInputBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DECISION__INPUT_BRANCH, newInputBranch, newInputBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputBranch() {
		if (outputBranch == null) {
			outputBranch = new EObjectContainmentEList(OutputBranchType.class, this, Schema1Package.DECISION__OUTPUT_BRANCH);
		}
		return outputBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInclusive() {
		return isInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInclusive(boolean newIsInclusive) {
		boolean oldIsInclusive = isInclusive;
		isInclusive = newIsInclusive;
		boolean oldIsInclusiveESet = isInclusiveESet;
		isInclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DECISION__IS_INCLUSIVE, oldIsInclusive, isInclusive, !oldIsInclusiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsInclusive() {
		boolean oldIsInclusive = isInclusive;
		boolean oldIsInclusiveESet = isInclusiveESet;
		isInclusive = IS_INCLUSIVE_EDEFAULT;
		isInclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.DECISION__IS_INCLUSIVE, oldIsInclusive, IS_INCLUSIVE_EDEFAULT, oldIsInclusiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsInclusive() {
		return isInclusiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSimpleDecision() {
		return isSimpleDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSimpleDecision(boolean newIsSimpleDecision) {
		boolean oldIsSimpleDecision = isSimpleDecision;
		isSimpleDecision = newIsSimpleDecision;
		boolean oldIsSimpleDecisionESet = isSimpleDecisionESet;
		isSimpleDecisionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DECISION__IS_SIMPLE_DECISION, oldIsSimpleDecision, isSimpleDecision, !oldIsSimpleDecisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSimpleDecision() {
		boolean oldIsSimpleDecision = isSimpleDecision;
		boolean oldIsSimpleDecisionESet = isSimpleDecisionESet;
		isSimpleDecision = IS_SIMPLE_DECISION_EDEFAULT;
		isSimpleDecisionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.DECISION__IS_SIMPLE_DECISION, oldIsSimpleDecision, IS_SIMPLE_DECISION_EDEFAULT, oldIsSimpleDecisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSimpleDecision() {
		return isSimpleDecisionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.DECISION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.DECISION__INPUT_BRANCH:
				return basicSetInputBranch(null, msgs);
			case Schema1Package.DECISION__OUTPUT_BRANCH:
				return ((InternalEList)getOutputBranch()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.DECISION__DESCRIPTION:
				return getDescription();
			case Schema1Package.DECISION__INPUT_BRANCH:
				return getInputBranch();
			case Schema1Package.DECISION__OUTPUT_BRANCH:
				return getOutputBranch();
			case Schema1Package.DECISION__IS_INCLUSIVE:
				return isIsInclusive() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.DECISION__IS_SIMPLE_DECISION:
				return isIsSimpleDecision() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.DECISION__NAME:
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
			case Schema1Package.DECISION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.DECISION__INPUT_BRANCH:
				setInputBranch((InputBranch)newValue);
				return;
			case Schema1Package.DECISION__OUTPUT_BRANCH:
				getOutputBranch().clear();
				getOutputBranch().addAll((Collection)newValue);
				return;
			case Schema1Package.DECISION__IS_INCLUSIVE:
				setIsInclusive(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.DECISION__IS_SIMPLE_DECISION:
				setIsSimpleDecision(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.DECISION__NAME:
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
			case Schema1Package.DECISION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.DECISION__INPUT_BRANCH:
				setInputBranch((InputBranch)null);
				return;
			case Schema1Package.DECISION__OUTPUT_BRANCH:
				getOutputBranch().clear();
				return;
			case Schema1Package.DECISION__IS_INCLUSIVE:
				unsetIsInclusive();
				return;
			case Schema1Package.DECISION__IS_SIMPLE_DECISION:
				unsetIsSimpleDecision();
				return;
			case Schema1Package.DECISION__NAME:
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
			case Schema1Package.DECISION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.DECISION__INPUT_BRANCH:
				return inputBranch != null;
			case Schema1Package.DECISION__OUTPUT_BRANCH:
				return outputBranch != null && !outputBranch.isEmpty();
			case Schema1Package.DECISION__IS_INCLUSIVE:
				return isSetIsInclusive();
			case Schema1Package.DECISION__IS_SIMPLE_DECISION:
				return isSetIsSimpleDecision();
			case Schema1Package.DECISION__NAME:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", isInclusive: ");
		if (isInclusiveESet) result.append(isInclusive); else result.append("<unset>");
		result.append(", isSimpleDecision: ");
		if (isSimpleDecisionESet) result.append(isSimpleDecision); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DecisionImpl
