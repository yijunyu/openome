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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage;
import org.xmlsoap.schemas.ws._2003._03.business.process.TActivityOrCompensateContainer;
import org.xmlsoap.schemas.ws._2003._03.business.process.TBoolean;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCatch;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCompensationHandler;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCorrelationsWithPattern;
import org.xmlsoap.schemas.ws._2003._03.business.process.TInvoke;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInvoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getCatchAll <em>Catch All</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getInputVariable <em>Input Variable</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getOutputVariable <em>Output Variable</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TInvokeImpl#getPortType <em>Port Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TInvokeImpl extends TActivityImpl implements TInvoke {
	/**
	 * The cached value of the '{@link #getCorrelations() <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelations()
	 * @generated
	 * @ordered
	 */
	protected TCorrelationsWithPattern correlations = null;

	/**
	 * The cached value of the '{@link #getCatch() <em>Catch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatch()
	 * @generated
	 * @ordered
	 */
	protected EList catch_ = null;

	/**
	 * The cached value of the '{@link #getCatchAll() <em>Catch All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchAll()
	 * @generated
	 * @ordered
	 */
	protected TActivityOrCompensateContainer catchAll = null;

	/**
	 * The cached value of the '{@link #getCompensationHandler() <em>Compensation Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationHandler()
	 * @generated
	 * @ordered
	 */
	protected TCompensationHandler compensationHandler = null;

	/**
	 * The default value of the '{@link #getInputVariable() <em>Input Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputVariable() <em>Input Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariable()
	 * @generated
	 * @ordered
	 */
	protected String inputVariable = INPUT_VARIABLE_EDEFAULT;

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
	 * The default value of the '{@link #getOutputVariable() <em>Output Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputVariable() <em>Output Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariable()
	 * @generated
	 * @ordered
	 */
	protected String outputVariable = OUTPUT_VARIABLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInvokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTInvoke();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCorrelationsWithPattern getCorrelations() {
		return correlations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelations(TCorrelationsWithPattern newCorrelations, NotificationChain msgs) {
		TCorrelationsWithPattern oldCorrelations = correlations;
		correlations = newCorrelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__CORRELATIONS, oldCorrelations, newCorrelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelations(TCorrelationsWithPattern newCorrelations) {
		if (newCorrelations != correlations) {
			NotificationChain msgs = null;
			if (correlations != null)
				msgs = ((InternalEObject)correlations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TINVOKE__CORRELATIONS, null, msgs);
			if (newCorrelations != null)
				msgs = ((InternalEObject)newCorrelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TINVOKE__CORRELATIONS, null, msgs);
			msgs = basicSetCorrelations(newCorrelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__CORRELATIONS, newCorrelations, newCorrelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCatch() {
		if (catch_ == null) {
			catch_ = new EObjectContainmentEList(TCatch.class, this, ProcessPackage.TINVOKE__CATCH);
		}
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TActivityOrCompensateContainer getCatchAll() {
		return catchAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchAll(TActivityOrCompensateContainer newCatchAll, NotificationChain msgs) {
		TActivityOrCompensateContainer oldCatchAll = catchAll;
		catchAll = newCatchAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__CATCH_ALL, oldCatchAll, newCatchAll);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchAll(TActivityOrCompensateContainer newCatchAll) {
		if (newCatchAll != catchAll) {
			NotificationChain msgs = null;
			if (catchAll != null)
				msgs = ((InternalEObject)catchAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TINVOKE__CATCH_ALL, null, msgs);
			if (newCatchAll != null)
				msgs = ((InternalEObject)newCatchAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TINVOKE__CATCH_ALL, null, msgs);
			msgs = basicSetCatchAll(newCatchAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__CATCH_ALL, newCatchAll, newCatchAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCompensationHandler getCompensationHandler() {
		return compensationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensationHandler(TCompensationHandler newCompensationHandler, NotificationChain msgs) {
		TCompensationHandler oldCompensationHandler = compensationHandler;
		compensationHandler = newCompensationHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__COMPENSATION_HANDLER, oldCompensationHandler, newCompensationHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationHandler(TCompensationHandler newCompensationHandler) {
		if (newCompensationHandler != compensationHandler) {
			NotificationChain msgs = null;
			if (compensationHandler != null)
				msgs = ((InternalEObject)compensationHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TINVOKE__COMPENSATION_HANDLER, null, msgs);
			if (newCompensationHandler != null)
				msgs = ((InternalEObject)newCompensationHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TINVOKE__COMPENSATION_HANDLER, null, msgs);
			msgs = basicSetCompensationHandler(newCompensationHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__COMPENSATION_HANDLER, newCompensationHandler, newCompensationHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputVariable() {
		return inputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVariable(String newInputVariable) {
		String oldInputVariable = inputVariable;
		inputVariable = newInputVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__INPUT_VARIABLE, oldInputVariable, inputVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputVariable() {
		return outputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputVariable(String newOutputVariable) {
		String oldOutputVariable = outputVariable;
		outputVariable = newOutputVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__OUTPUT_VARIABLE, oldOutputVariable, outputVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__PARTNER_LINK, oldPartnerLink, partnerLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TINVOKE__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TINVOKE__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TINVOKE__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TINVOKE__TARGET:
					return ((InternalEList)getTarget()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TINVOKE__SOURCE:
					return ((InternalEList)getSource()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TINVOKE__CORRELATIONS:
					return basicSetCorrelations(null, msgs);
				case ProcessPackage.TINVOKE__CATCH:
					return ((InternalEList)getCatch()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TINVOKE__CATCH_ALL:
					return basicSetCatchAll(null, msgs);
				case ProcessPackage.TINVOKE__COMPENSATION_HANDLER:
					return basicSetCompensationHandler(null, msgs);
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
			case ProcessPackage.TINVOKE__ANY:
				return getAny();
			case ProcessPackage.TINVOKE__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TINVOKE__TARGET:
				return getTarget();
			case ProcessPackage.TINVOKE__SOURCE:
				return getSource();
			case ProcessPackage.TINVOKE__JOIN_CONDITION:
				return getJoinCondition();
			case ProcessPackage.TINVOKE__NAME:
				return getName();
			case ProcessPackage.TINVOKE__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case ProcessPackage.TINVOKE__CORRELATIONS:
				return getCorrelations();
			case ProcessPackage.TINVOKE__CATCH:
				return getCatch();
			case ProcessPackage.TINVOKE__CATCH_ALL:
				return getCatchAll();
			case ProcessPackage.TINVOKE__COMPENSATION_HANDLER:
				return getCompensationHandler();
			case ProcessPackage.TINVOKE__INPUT_VARIABLE:
				return getInputVariable();
			case ProcessPackage.TINVOKE__OPERATION:
				return getOperation();
			case ProcessPackage.TINVOKE__OUTPUT_VARIABLE:
				return getOutputVariable();
			case ProcessPackage.TINVOKE__PARTNER_LINK:
				return getPartnerLink();
			case ProcessPackage.TINVOKE__PORT_TYPE:
				return getPortType();
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
			case ProcessPackage.TINVOKE__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TINVOKE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TINVOKE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case ProcessPackage.TINVOKE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection)newValue);
				return;
			case ProcessPackage.TINVOKE__JOIN_CONDITION:
				setJoinCondition((String)newValue);
				return;
			case ProcessPackage.TINVOKE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TINVOKE__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((TBoolean)newValue);
				return;
			case ProcessPackage.TINVOKE__CORRELATIONS:
				setCorrelations((TCorrelationsWithPattern)newValue);
				return;
			case ProcessPackage.TINVOKE__CATCH:
				getCatch().clear();
				getCatch().addAll((Collection)newValue);
				return;
			case ProcessPackage.TINVOKE__CATCH_ALL:
				setCatchAll((TActivityOrCompensateContainer)newValue);
				return;
			case ProcessPackage.TINVOKE__COMPENSATION_HANDLER:
				setCompensationHandler((TCompensationHandler)newValue);
				return;
			case ProcessPackage.TINVOKE__INPUT_VARIABLE:
				setInputVariable((String)newValue);
				return;
			case ProcessPackage.TINVOKE__OPERATION:
				setOperation((String)newValue);
				return;
			case ProcessPackage.TINVOKE__OUTPUT_VARIABLE:
				setOutputVariable((String)newValue);
				return;
			case ProcessPackage.TINVOKE__PARTNER_LINK:
				setPartnerLink((String)newValue);
				return;
			case ProcessPackage.TINVOKE__PORT_TYPE:
				setPortType((Object)newValue);
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
			case ProcessPackage.TINVOKE__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TINVOKE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TINVOKE__TARGET:
				getTarget().clear();
				return;
			case ProcessPackage.TINVOKE__SOURCE:
				getSource().clear();
				return;
			case ProcessPackage.TINVOKE__JOIN_CONDITION:
				setJoinCondition(JOIN_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.TINVOKE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TINVOKE__SUPPRESS_JOIN_FAILURE:
				unsetSuppressJoinFailure();
				return;
			case ProcessPackage.TINVOKE__CORRELATIONS:
				setCorrelations((TCorrelationsWithPattern)null);
				return;
			case ProcessPackage.TINVOKE__CATCH:
				getCatch().clear();
				return;
			case ProcessPackage.TINVOKE__CATCH_ALL:
				setCatchAll((TActivityOrCompensateContainer)null);
				return;
			case ProcessPackage.TINVOKE__COMPENSATION_HANDLER:
				setCompensationHandler((TCompensationHandler)null);
				return;
			case ProcessPackage.TINVOKE__INPUT_VARIABLE:
				setInputVariable(INPUT_VARIABLE_EDEFAULT);
				return;
			case ProcessPackage.TINVOKE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ProcessPackage.TINVOKE__OUTPUT_VARIABLE:
				setOutputVariable(OUTPUT_VARIABLE_EDEFAULT);
				return;
			case ProcessPackage.TINVOKE__PARTNER_LINK:
				setPartnerLink(PARTNER_LINK_EDEFAULT);
				return;
			case ProcessPackage.TINVOKE__PORT_TYPE:
				setPortType(PORT_TYPE_EDEFAULT);
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
			case ProcessPackage.TINVOKE__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TINVOKE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TINVOKE__TARGET:
				return target != null && !target.isEmpty();
			case ProcessPackage.TINVOKE__SOURCE:
				return source != null && !source.isEmpty();
			case ProcessPackage.TINVOKE__JOIN_CONDITION:
				return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
			case ProcessPackage.TINVOKE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TINVOKE__SUPPRESS_JOIN_FAILURE:
				return isSetSuppressJoinFailure();
			case ProcessPackage.TINVOKE__CORRELATIONS:
				return correlations != null;
			case ProcessPackage.TINVOKE__CATCH:
				return catch_ != null && !catch_.isEmpty();
			case ProcessPackage.TINVOKE__CATCH_ALL:
				return catchAll != null;
			case ProcessPackage.TINVOKE__COMPENSATION_HANDLER:
				return compensationHandler != null;
			case ProcessPackage.TINVOKE__INPUT_VARIABLE:
				return INPUT_VARIABLE_EDEFAULT == null ? inputVariable != null : !INPUT_VARIABLE_EDEFAULT.equals(inputVariable);
			case ProcessPackage.TINVOKE__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case ProcessPackage.TINVOKE__OUTPUT_VARIABLE:
				return OUTPUT_VARIABLE_EDEFAULT == null ? outputVariable != null : !OUTPUT_VARIABLE_EDEFAULT.equals(outputVariable);
			case ProcessPackage.TINVOKE__PARTNER_LINK:
				return PARTNER_LINK_EDEFAULT == null ? partnerLink != null : !PARTNER_LINK_EDEFAULT.equals(partnerLink);
			case ProcessPackage.TINVOKE__PORT_TYPE:
				return PORT_TYPE_EDEFAULT == null ? portType != null : !PORT_TYPE_EDEFAULT.equals(portType);
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
		result.append(" (inputVariable: ");
		result.append(inputVariable);
		result.append(", operation: ");
		result.append(operation);
		result.append(", outputVariable: ");
		result.append(outputVariable);
		result.append(", partnerLink: ");
		result.append(partnerLink);
		result.append(", portType: ");
		result.append(portType);
		result.append(')');
		return result.toString();
	}

} //TInvokeImpl
