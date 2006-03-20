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
import org.xmlsoap.schemas.ws._2003._03.business.process.TActivityOrCompensateContainer;
import org.xmlsoap.schemas.ws._2003._03.business.process.TAssign;
import org.xmlsoap.schemas.ws._2003._03.business.process.TCompensate;
import org.xmlsoap.schemas.ws._2003._03.business.process.TEmpty;
import org.xmlsoap.schemas.ws._2003._03.business.process.TFlow;
import org.xmlsoap.schemas.ws._2003._03.business.process.TInvoke;
import org.xmlsoap.schemas.ws._2003._03.business.process.TPick;
import org.xmlsoap.schemas.ws._2003._03.business.process.TReceive;
import org.xmlsoap.schemas.ws._2003._03.business.process.TReply;
import org.xmlsoap.schemas.ws._2003._03.business.process.TScope;
import org.xmlsoap.schemas.ws._2003._03.business.process.TSequence;
import org.xmlsoap.schemas.ws._2003._03.business.process.TSwitch;
import org.xmlsoap.schemas.ws._2003._03.business.process.TTerminate;
import org.xmlsoap.schemas.ws._2003._03.business.process.TThrow;
import org.xmlsoap.schemas.ws._2003._03.business.process.TWait;
import org.xmlsoap.schemas.ws._2003._03.business.process.TWhile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TActivity Or Compensate Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getTerminate <em>Terminate</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getWhile <em>While</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2003._03.business.process.impl.TActivityOrCompensateContainerImpl#getCompensate <em>Compensate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TActivityOrCompensateContainerImpl extends TExtensibleElementsImpl implements TActivityOrCompensateContainer {
	/**
	 * The cached value of the '{@link #getEmpty() <em>Empty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpty()
	 * @generated
	 * @ordered
	 */
	protected TEmpty empty = null;

	/**
	 * The cached value of the '{@link #getInvoke() <em>Invoke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoke()
	 * @generated
	 * @ordered
	 */
	protected TInvoke invoke = null;

	/**
	 * The cached value of the '{@link #getReceive() <em>Receive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive()
	 * @generated
	 * @ordered
	 */
	protected TReceive receive = null;

	/**
	 * The cached value of the '{@link #getReply() <em>Reply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply()
	 * @generated
	 * @ordered
	 */
	protected TReply reply = null;

	/**
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected TAssign assign = null;

	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected TWait wait = null;

	/**
	 * The cached value of the '{@link #getThrow() <em>Throw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrow()
	 * @generated
	 * @ordered
	 */
	protected TThrow throw_ = null;

	/**
	 * The cached value of the '{@link #getTerminate() <em>Terminate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminate()
	 * @generated
	 * @ordered
	 */
	protected TTerminate terminate = null;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected TFlow flow = null;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected TSwitch switch_ = null;

	/**
	 * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhile()
	 * @generated
	 * @ordered
	 */
	protected TWhile while_ = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected TSequence sequence = null;

	/**
	 * The cached value of the '{@link #getPick() <em>Pick</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPick()
	 * @generated
	 * @ordered
	 */
	protected TPick pick = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected TScope scope = null;

	/**
	 * The cached value of the '{@link #getCompensate() <em>Compensate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensate()
	 * @generated
	 * @ordered
	 */
	protected TCompensate compensate = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TActivityOrCompensateContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.eINSTANCE.getTActivityOrCompensateContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEmpty getEmpty() {
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpty(TEmpty newEmpty, NotificationChain msgs) {
		TEmpty oldEmpty = empty;
		empty = newEmpty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY, oldEmpty, newEmpty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpty(TEmpty newEmpty) {
		if (newEmpty != empty) {
			NotificationChain msgs = null;
			if (empty != null)
				msgs = ((InternalEObject)empty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY, null, msgs);
			if (newEmpty != null)
				msgs = ((InternalEObject)newEmpty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY, null, msgs);
			msgs = basicSetEmpty(newEmpty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY, newEmpty, newEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInvoke getInvoke() {
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoke(TInvoke newInvoke, NotificationChain msgs) {
		TInvoke oldInvoke = invoke;
		invoke = newInvoke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE, oldInvoke, newInvoke);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoke(TInvoke newInvoke) {
		if (newInvoke != invoke) {
			NotificationChain msgs = null;
			if (invoke != null)
				msgs = ((InternalEObject)invoke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE, null, msgs);
			if (newInvoke != null)
				msgs = ((InternalEObject)newInvoke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE, null, msgs);
			msgs = basicSetInvoke(newInvoke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE, newInvoke, newInvoke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TReceive getReceive() {
		return receive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceive(TReceive newReceive, NotificationChain msgs) {
		TReceive oldReceive = receive;
		receive = newReceive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE, oldReceive, newReceive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceive(TReceive newReceive) {
		if (newReceive != receive) {
			NotificationChain msgs = null;
			if (receive != null)
				msgs = ((InternalEObject)receive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE, null, msgs);
			if (newReceive != null)
				msgs = ((InternalEObject)newReceive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE, null, msgs);
			msgs = basicSetReceive(newReceive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE, newReceive, newReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TReply getReply() {
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReply(TReply newReply, NotificationChain msgs) {
		TReply oldReply = reply;
		reply = newReply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY, oldReply, newReply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReply(TReply newReply) {
		if (newReply != reply) {
			NotificationChain msgs = null;
			if (reply != null)
				msgs = ((InternalEObject)reply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY, null, msgs);
			if (newReply != null)
				msgs = ((InternalEObject)newReply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY, null, msgs);
			msgs = basicSetReply(newReply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY, newReply, newReply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssign getAssign() {
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssign(TAssign newAssign, NotificationChain msgs) {
		TAssign oldAssign = assign;
		assign = newAssign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN, oldAssign, newAssign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssign(TAssign newAssign) {
		if (newAssign != assign) {
			NotificationChain msgs = null;
			if (assign != null)
				msgs = ((InternalEObject)assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN, null, msgs);
			if (newAssign != null)
				msgs = ((InternalEObject)newAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN, null, msgs);
			msgs = basicSetAssign(newAssign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN, newAssign, newAssign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWait getWait() {
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWait(TWait newWait, NotificationChain msgs) {
		TWait oldWait = wait;
		wait = newWait;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT, oldWait, newWait);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(TWait newWait) {
		if (newWait != wait) {
			NotificationChain msgs = null;
			if (wait != null)
				msgs = ((InternalEObject)wait).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT, null, msgs);
			if (newWait != null)
				msgs = ((InternalEObject)newWait).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT, null, msgs);
			msgs = basicSetWait(newWait, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT, newWait, newWait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TThrow getThrow() {
		return throw_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrow(TThrow newThrow, NotificationChain msgs) {
		TThrow oldThrow = throw_;
		throw_ = newThrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW, oldThrow, newThrow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrow(TThrow newThrow) {
		if (newThrow != throw_) {
			NotificationChain msgs = null;
			if (throw_ != null)
				msgs = ((InternalEObject)throw_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW, null, msgs);
			if (newThrow != null)
				msgs = ((InternalEObject)newThrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW, null, msgs);
			msgs = basicSetThrow(newThrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW, newThrow, newThrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTerminate getTerminate() {
		return terminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminate(TTerminate newTerminate, NotificationChain msgs) {
		TTerminate oldTerminate = terminate;
		terminate = newTerminate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE, oldTerminate, newTerminate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminate(TTerminate newTerminate) {
		if (newTerminate != terminate) {
			NotificationChain msgs = null;
			if (terminate != null)
				msgs = ((InternalEObject)terminate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE, null, msgs);
			if (newTerminate != null)
				msgs = ((InternalEObject)newTerminate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE, null, msgs);
			msgs = basicSetTerminate(newTerminate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE, newTerminate, newTerminate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFlow getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlow(TFlow newFlow, NotificationChain msgs) {
		TFlow oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW, oldFlow, newFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(TFlow newFlow) {
		if (newFlow != flow) {
			NotificationChain msgs = null;
			if (flow != null)
				msgs = ((InternalEObject)flow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW, null, msgs);
			if (newFlow != null)
				msgs = ((InternalEObject)newFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW, null, msgs);
			msgs = basicSetFlow(newFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW, newFlow, newFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSwitch getSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitch(TSwitch newSwitch, NotificationChain msgs) {
		TSwitch oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH, oldSwitch, newSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitch(TSwitch newSwitch) {
		if (newSwitch != switch_) {
			NotificationChain msgs = null;
			if (switch_ != null)
				msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH, null, msgs);
			if (newSwitch != null)
				msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH, null, msgs);
			msgs = basicSetSwitch(newSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH, newSwitch, newSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWhile getWhile() {
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhile(TWhile newWhile, NotificationChain msgs) {
		TWhile oldWhile = while_;
		while_ = newWhile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE, oldWhile, newWhile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhile(TWhile newWhile) {
		if (newWhile != while_) {
			NotificationChain msgs = null;
			if (while_ != null)
				msgs = ((InternalEObject)while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE, null, msgs);
			if (newWhile != null)
				msgs = ((InternalEObject)newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE, null, msgs);
			msgs = basicSetWhile(newWhile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE, newWhile, newWhile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSequence getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(TSequence newSequence, NotificationChain msgs) {
		TSequence oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(TSequence newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPick getPick() {
		return pick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPick(TPick newPick, NotificationChain msgs) {
		TPick oldPick = pick;
		pick = newPick;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK, oldPick, newPick);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPick(TPick newPick) {
		if (newPick != pick) {
			NotificationChain msgs = null;
			if (pick != null)
				msgs = ((InternalEObject)pick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK, null, msgs);
			if (newPick != null)
				msgs = ((InternalEObject)newPick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK, null, msgs);
			msgs = basicSetPick(newPick, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK, newPick, newPick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TScope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(TScope newScope, NotificationChain msgs) {
		TScope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(TScope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCompensate getCompensate() {
		return compensate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensate(TCompensate newCompensate, NotificationChain msgs) {
		TCompensate oldCompensate = compensate;
		compensate = newCompensate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE, oldCompensate, newCompensate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensate(TCompensate newCompensate) {
		if (newCompensate != compensate) {
			NotificationChain msgs = null;
			if (compensate != null)
				msgs = ((InternalEObject)compensate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE, null, msgs);
			if (newCompensate != null)
				msgs = ((InternalEObject)newCompensate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE, null, msgs);
			msgs = basicSetCompensate(newCompensate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE, newCompensate, newCompensate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY_ATTRIBUTE:
					return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY:
					return basicSetEmpty(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE:
					return basicSetInvoke(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE:
					return basicSetReceive(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY:
					return basicSetReply(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN:
					return basicSetAssign(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT:
					return basicSetWait(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW:
					return basicSetThrow(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE:
					return basicSetTerminate(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW:
					return basicSetFlow(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH:
					return basicSetSwitch(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE:
					return basicSetWhile(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE:
					return basicSetSequence(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK:
					return basicSetPick(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE:
					return basicSetScope(null, msgs);
				case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE:
					return basicSetCompensate(null, msgs);
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
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY:
				return getAny();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY:
				return getEmpty();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE:
				return getInvoke();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE:
				return getReceive();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY:
				return getReply();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN:
				return getAssign();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT:
				return getWait();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW:
				return getThrow();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE:
				return getTerminate();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW:
				return getFlow();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH:
				return getSwitch();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE:
				return getWhile();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE:
				return getSequence();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK:
				return getPick();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE:
				return getScope();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE:
				return getCompensate();
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
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY:
				setEmpty((TEmpty)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE:
				setInvoke((TInvoke)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE:
				setReceive((TReceive)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY:
				setReply((TReply)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN:
				setAssign((TAssign)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT:
				setWait((TWait)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW:
				setThrow((TThrow)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE:
				setTerminate((TTerminate)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW:
				setFlow((TFlow)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH:
				setSwitch((TSwitch)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE:
				setWhile((TWhile)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE:
				setSequence((TSequence)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK:
				setPick((TPick)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE:
				setScope((TScope)newValue);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE:
				setCompensate((TCompensate)newValue);
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
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY:
				getAny().clear();
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY:
				setEmpty((TEmpty)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE:
				setInvoke((TInvoke)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE:
				setReceive((TReceive)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY:
				setReply((TReply)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN:
				setAssign((TAssign)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT:
				setWait((TWait)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW:
				setThrow((TThrow)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE:
				setTerminate((TTerminate)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW:
				setFlow((TFlow)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH:
				setSwitch((TSwitch)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE:
				setWhile((TWhile)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE:
				setSequence((TSequence)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK:
				setPick((TPick)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE:
				setScope((TScope)null);
				return;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE:
				setCompensate((TCompensate)null);
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
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY:
				return any != null && !any.isEmpty();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__EMPTY:
				return empty != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__INVOKE:
				return invoke != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__RECEIVE:
				return receive != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__REPLY:
				return reply != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__ASSIGN:
				return assign != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WAIT:
				return wait != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__THROW:
				return throw_ != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__TERMINATE:
				return terminate != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__FLOW:
				return flow != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SWITCH:
				return switch_ != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__WHILE:
				return while_ != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SEQUENCE:
				return sequence != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__PICK:
				return pick != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__SCOPE:
				return scope != null;
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER__COMPENSATE:
				return compensate != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TActivityOrCompensateContainerImpl
