/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Expression;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.Observer;
import com.ibm.wbim.bom.schema1.OperationalData;
import com.ibm.wbim.bom.schema1.Organizations;
import com.ibm.wbim.bom.schema1.Outputs;
import com.ibm.wbim.bom.schema1.Resources;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ObserverImpl#getObservationExpression <em>Observation Expression</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.ObserverImpl#isIsObserveContinuously <em>Is Observe Continuously</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObserverImpl extends TaskImpl implements Observer {
	/**
	 * The cached value of the '{@link #getObservationExpression() <em>Observation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression observationExpression = null;

	/**
	 * The default value of the '{@link #isIsObserveContinuously() <em>Is Observe Continuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObserveContinuously()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OBSERVE_CONTINUOUSLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsObserveContinuously() <em>Is Observe Continuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObserveContinuously()
	 * @generated
	 * @ordered
	 */
	protected boolean isObserveContinuously = IS_OBSERVE_CONTINUOUSLY_EDEFAULT;

	/**
	 * This is true if the Is Observe Continuously attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isObserveContinuouslyESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.eINSTANCE.getObserver();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getObservationExpression() {
		return observationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservationExpression(Expression newObservationExpression, NotificationChain msgs) {
		Expression oldObservationExpression = observationExpression;
		observationExpression = newObservationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OBSERVER__OBSERVATION_EXPRESSION, oldObservationExpression, newObservationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservationExpression(Expression newObservationExpression) {
		if (newObservationExpression != observationExpression) {
			NotificationChain msgs = null;
			if (observationExpression != null)
				msgs = ((InternalEObject)observationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OBSERVER__OBSERVATION_EXPRESSION, null, msgs);
			if (newObservationExpression != null)
				msgs = ((InternalEObject)newObservationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OBSERVER__OBSERVATION_EXPRESSION, null, msgs);
			msgs = basicSetObservationExpression(newObservationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OBSERVER__OBSERVATION_EXPRESSION, newObservationExpression, newObservationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsObserveContinuously() {
		return isObserveContinuously;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsObserveContinuously(boolean newIsObserveContinuously) {
		boolean oldIsObserveContinuously = isObserveContinuously;
		isObserveContinuously = newIsObserveContinuously;
		boolean oldIsObserveContinuouslyESet = isObserveContinuouslyESet;
		isObserveContinuouslyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY, oldIsObserveContinuously, isObserveContinuously, !oldIsObserveContinuouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsObserveContinuously() {
		boolean oldIsObserveContinuously = isObserveContinuously;
		boolean oldIsObserveContinuouslyESet = isObserveContinuouslyESet;
		isObserveContinuously = IS_OBSERVE_CONTINUOUSLY_EDEFAULT;
		isObserveContinuouslyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY, oldIsObserveContinuously, IS_OBSERVE_CONTINUOUSLY_EDEFAULT, oldIsObserveContinuouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsObserveContinuously() {
		return isObserveContinuouslyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Schema1Package.OBSERVER__INPUTS:
					return basicSetInputs(null, msgs);
				case Schema1Package.OBSERVER__OUTPUTS:
					return basicSetOutputs(null, msgs);
				case Schema1Package.OBSERVER__PRECONDITION:
					return ((InternalEList)getPrecondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.OBSERVER__POSTCONDITION:
					return ((InternalEList)getPostcondition()).basicRemove(otherEnd, msgs);
				case Schema1Package.OBSERVER__RESOURCES:
					return basicSetResources(null, msgs);
				case Schema1Package.OBSERVER__ORGANIZATIONS:
					return basicSetOrganizations(null, msgs);
				case Schema1Package.OBSERVER__OPERATIONAL_DATA:
					return basicSetOperationalData(null, msgs);
				case Schema1Package.OBSERVER__EXTENDED_ATTRIBUTES:
					return basicSetExtendedAttributes(null, msgs);
				case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
					return basicSetObservationExpression(null, msgs);
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
			case Schema1Package.OBSERVER__DESCRIPTION:
				return getDescription();
			case Schema1Package.OBSERVER__INPUTS:
				return getInputs();
			case Schema1Package.OBSERVER__OUTPUTS:
				return getOutputs();
			case Schema1Package.OBSERVER__PRECONDITION:
				return getPrecondition();
			case Schema1Package.OBSERVER__POSTCONDITION:
				return getPostcondition();
			case Schema1Package.OBSERVER__RESOURCES:
				return getResources();
			case Schema1Package.OBSERVER__ORGANIZATIONS:
				return getOrganizations();
			case Schema1Package.OBSERVER__OPERATIONAL_DATA:
				return getOperationalData();
			case Schema1Package.OBSERVER__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.OBSERVER__NAME:
				return getName();
			case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
				return getObservationExpression();
			case Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY:
				return isIsObserveContinuously() ? Boolean.TRUE : Boolean.FALSE;
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
			case Schema1Package.OBSERVER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Schema1Package.OBSERVER__INPUTS:
				setInputs((Inputs)newValue);
				return;
			case Schema1Package.OBSERVER__OUTPUTS:
				setOutputs((Outputs)newValue);
				return;
			case Schema1Package.OBSERVER__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection)newValue);
				return;
			case Schema1Package.OBSERVER__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection)newValue);
				return;
			case Schema1Package.OBSERVER__RESOURCES:
				setResources((Resources)newValue);
				return;
			case Schema1Package.OBSERVER__ORGANIZATIONS:
				setOrganizations((Organizations)newValue);
				return;
			case Schema1Package.OBSERVER__OPERATIONAL_DATA:
				setOperationalData((OperationalData)newValue);
				return;
			case Schema1Package.OBSERVER__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.OBSERVER__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
				setObservationExpression((Expression)newValue);
				return;
			case Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY:
				setIsObserveContinuously(((Boolean)newValue).booleanValue());
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
			case Schema1Package.OBSERVER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Schema1Package.OBSERVER__INPUTS:
				setInputs((Inputs)null);
				return;
			case Schema1Package.OBSERVER__OUTPUTS:
				setOutputs((Outputs)null);
				return;
			case Schema1Package.OBSERVER__PRECONDITION:
				getPrecondition().clear();
				return;
			case Schema1Package.OBSERVER__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Schema1Package.OBSERVER__RESOURCES:
				setResources((Resources)null);
				return;
			case Schema1Package.OBSERVER__ORGANIZATIONS:
				setOrganizations((Organizations)null);
				return;
			case Schema1Package.OBSERVER__OPERATIONAL_DATA:
				setOperationalData((OperationalData)null);
				return;
			case Schema1Package.OBSERVER__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.OBSERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
				setObservationExpression((Expression)null);
				return;
			case Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY:
				unsetIsObserveContinuously();
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
			case Schema1Package.OBSERVER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Schema1Package.OBSERVER__INPUTS:
				return inputs != null;
			case Schema1Package.OBSERVER__OUTPUTS:
				return outputs != null;
			case Schema1Package.OBSERVER__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Schema1Package.OBSERVER__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Schema1Package.OBSERVER__RESOURCES:
				return resources != null;
			case Schema1Package.OBSERVER__ORGANIZATIONS:
				return organizations != null;
			case Schema1Package.OBSERVER__OPERATIONAL_DATA:
				return operationalData != null;
			case Schema1Package.OBSERVER__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.OBSERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.OBSERVER__OBSERVATION_EXPRESSION:
				return observationExpression != null;
			case Schema1Package.OBSERVER__IS_OBSERVE_CONTINUOUSLY:
				return isSetIsObserveContinuously();
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
		result.append(" (isObserveContinuously: ");
		if (isObserveContinuouslyESet) result.append(isObserveContinuously); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObserverImpl
