/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TBoolean;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCorrelations;
import org.xmlsoap.schemas.ws._2003._03.business.process.TReceive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TReceive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TReceiveImpl#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TReceiveImpl#getCreateInstance <em>Create Instance</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TReceiveImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TReceiveImpl#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TReceiveImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TReceiveImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TReceiveImpl extends TActivityImpl implements TReceive {
	/**
	 * The cached value of the '{@link #getCorrelations() <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelations()
	 * @generated
	 * @ordered
	 */
	protected TCorrelations correlations = null;

	/**
	 * The default value of the '{@link #getCreateInstance() <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateInstance()
	 * @generated
	 * @ordered
	 */
	protected static final TBoolean CREATE_INSTANCE_EDEFAULT = TBoolean.NO_LITERAL;

	/**
	 * The cached value of the '{@link #getCreateInstance() <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateInstance()
	 * @generated
	 * @ordered
	 */
	protected TBoolean createInstance = CREATE_INSTANCE_EDEFAULT;

	/**
	 * This is true if the Create Instance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createInstanceESet = false;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerLink() <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLink()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerLink() <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLink()
	 * @generated
	 * @ordered
	 */
	protected String partnerLink = PARTNER_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected static final Object PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected Object portType = PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TReceiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTReceive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCorrelations getCorrelations() {
		return correlations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelations(TCorrelations newCorrelations, NotificationChain msgs) {
		TCorrelations oldCorrelations = correlations;
		correlations = newCorrelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TRECEIVE__CORRELATIONS, oldCorrelations, newCorrelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelations(TCorrelations newCorrelations) {
		if (newCorrelations != correlations) {
			NotificationChain msgs = null;
			if (correlations != null)
				msgs = ((InternalEObject)correlations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TRECEIVE__CORRELATIONS, null, msgs);
			if (newCorrelations != null)
				msgs = ((InternalEObject)newCorrelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TRECEIVE__CORRELATIONS, null, msgs);
			msgs = basicSetCorrelations(newCorrelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TRECEIVE__CORRELATIONS, newCorrelations, newCorrelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean getCreateInstance() {
		return createInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateInstance(TBoolean newCreateInstance) {
		TBoolean oldCreateInstance = createInstance;
		createInstance = newCreateInstance == null ? CREATE_INSTANCE_EDEFAULT : newCreateInstance;
		boolean oldCreateInstanceESet = createInstanceESet;
		createInstanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TRECEIVE__CREATE_INSTANCE, oldCreateInstance, createInstance, !oldCreateInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateInstance() {
		TBoolean oldCreateInstance = createInstance;
		boolean oldCreateInstanceESet = createInstanceESet;
		createInstance = CREATE_INSTANCE_EDEFAULT;
		createInstanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.TRECEIVE__CREATE_INSTANCE, oldCreateInstance, CREATE_INSTANCE_EDEFAULT, oldCreateInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateInstance() {
		return createInstanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TRECEIVE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartnerLink() {
		return partnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerLink(String newPartnerLink) {
		String oldPartnerLink = partnerLink;
		partnerLink = newPartnerLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TRECEIVE__PARTNER_LINK, oldPartnerLink, partnerLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(Object newPortType) {
		Object oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TRECEIVE__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TRECEIVE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TRECEIVE__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TRECEIVE__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TRECEIVE__TARGET:
					return ((InternalEList)getTarget()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TRECEIVE__SOURCE:
					return ((InternalEList)getSource()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TRECEIVE__CORRELATIONS:
					return basicSetCorrelations(null, msgs);
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
			case ProcessPackage.TRECEIVE__ANY:
				return getAny();
			case ProcessPackage.TRECEIVE__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TRECEIVE__TARGET:
				return getTarget();
			case ProcessPackage.TRECEIVE__SOURCE:
				return getSource();
			case ProcessPackage.TRECEIVE__JOIN_CONDITION:
				return getJoinCondition();
			case ProcessPackage.TRECEIVE__NAME:
				return getName();
			case ProcessPackage.TRECEIVE__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case ProcessPackage.TRECEIVE__CORRELATIONS:
				return getCorrelations();
			case ProcessPackage.TRECEIVE__CREATE_INSTANCE:
				return getCreateInstance();
			case ProcessPackage.TRECEIVE__OPERATION:
				return getOperation();
			case ProcessPackage.TRECEIVE__PARTNER_LINK:
				return getPartnerLink();
			case ProcessPackage.TRECEIVE__PORT_TYPE:
				return getPortType();
			case ProcessPackage.TRECEIVE__VARIABLE:
				return getVariable();
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
			case ProcessPackage.TRECEIVE__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TRECEIVE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TRECEIVE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case ProcessPackage.TRECEIVE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection)newValue);
				return;
			case ProcessPackage.TRECEIVE__JOIN_CONDITION:
				setJoinCondition((String)newValue);
				return;
			case ProcessPackage.TRECEIVE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TRECEIVE__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((TBoolean)newValue);
				return;
			case ProcessPackage.TRECEIVE__CORRELATIONS:
				setCorrelations((TCorrelations)newValue);
				return;
			case ProcessPackage.TRECEIVE__CREATE_INSTANCE:
				setCreateInstance((TBoolean)newValue);
				return;
			case ProcessPackage.TRECEIVE__OPERATION:
				setOperation((String)newValue);
				return;
			case ProcessPackage.TRECEIVE__PARTNER_LINK:
				setPartnerLink((String)newValue);
				return;
			case ProcessPackage.TRECEIVE__PORT_TYPE:
				setPortType((Object)newValue);
				return;
			case ProcessPackage.TRECEIVE__VARIABLE:
				setVariable((String)newValue);
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
			case ProcessPackage.TRECEIVE__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TRECEIVE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TRECEIVE__TARGET:
				getTarget().clear();
				return;
			case ProcessPackage.TRECEIVE__SOURCE:
				getSource().clear();
				return;
			case ProcessPackage.TRECEIVE__JOIN_CONDITION:
				setJoinCondition(JOIN_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.TRECEIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TRECEIVE__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
				return;
			case ProcessPackage.TRECEIVE__CORRELATIONS:
				setCorrelations((TCorrelations)null);
				return;
			case ProcessPackage.TRECEIVE__CREATE_INSTANCE:
				unsetCreateInstance();
				return;
			case ProcessPackage.TRECEIVE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ProcessPackage.TRECEIVE__PARTNER_LINK:
				setPartnerLink(PARTNER_LINK_EDEFAULT);
				return;
			case ProcessPackage.TRECEIVE__PORT_TYPE:
				setPortType(PORT_TYPE_EDEFAULT);
				return;
			case ProcessPackage.TRECEIVE__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
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
			case ProcessPackage.TRECEIVE__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TRECEIVE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TRECEIVE__TARGET:
				return target != null && !target.isEmpty();
			case ProcessPackage.TRECEIVE__SOURCE:
				return source != null && !source.isEmpty();
			case ProcessPackage.TRECEIVE__JOIN_CONDITION:
				return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
			case ProcessPackage.TRECEIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TRECEIVE__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
			case ProcessPackage.TRECEIVE__CORRELATIONS:
				return correlations != null;
			case ProcessPackage.TRECEIVE__CREATE_INSTANCE:
				return isSetCreateInstance();
			case ProcessPackage.TRECEIVE__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case ProcessPackage.TRECEIVE__PARTNER_LINK:
				return PARTNER_LINK_EDEFAULT == null ? partnerLink != null : !PARTNER_LINK_EDEFAULT.equals(partnerLink);
			case ProcessPackage.TRECEIVE__PORT_TYPE:
				return PORT_TYPE_EDEFAULT == null ? portType != null : !PORT_TYPE_EDEFAULT.equals(portType);
			case ProcessPackage.TRECEIVE__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
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
		result.append(" (createInstance: ");
		if (createInstanceESet) result.append(createInstance); else result.append("<unset>");
		result.append(", operation: ");
		result.append(operation);
		result.append(", partnerLink: ");
		result.append(partnerLink);
		result.append(", portType: ");
		result.append(portType);
		result.append(", variable: ");
		result.append(variable);
		result.append(')');
		return result.toString();
	}

} //TReceiveImpl
