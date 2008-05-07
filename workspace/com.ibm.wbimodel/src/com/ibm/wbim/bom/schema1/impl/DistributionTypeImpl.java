/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.DistributionType;
import com.ibm.wbim.bom.schema1.ExponentialType;
import com.ibm.wbim.bom.schema1.GammaType;
import com.ibm.wbim.bom.schema1.LognormalType;
import com.ibm.wbim.bom.schema1.NormalType;
import com.ibm.wbim.bom.schema1.PoissonType;
import com.ibm.wbim.bom.schema1.RandomListType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.UniformType;
import com.ibm.wbim.bom.schema1.WeightedListType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl#getExponential <em>Exponential</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl#getGamma <em>Gamma</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl#getLognormal <em>Lognormal</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl#getNormal <em>Normal</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl#getPoisson <em>Poisson</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl#getRandomList <em>Random List</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl#getUniform <em>Uniform</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.DistributionTypeImpl#getWeightedList <em>Weighted List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributionTypeImpl extends EObjectImpl implements
		DistributionType {
	/**
	 * The cached value of the '{@link #getExponential() <em>Exponential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponential()
	 * @generated
	 * @ordered
	 */
	protected ExponentialType exponential;

	/**
	 * The cached value of the '{@link #getGamma() <em>Gamma</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma()
	 * @generated
	 * @ordered
	 */
	protected GammaType gamma;

	/**
	 * The cached value of the '{@link #getLognormal() <em>Lognormal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLognormal()
	 * @generated
	 * @ordered
	 */
	protected LognormalType lognormal;

	/**
	 * The cached value of the '{@link #getNormal() <em>Normal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal()
	 * @generated
	 * @ordered
	 */
	protected NormalType normal;

	/**
	 * The cached value of the '{@link #getPoisson() <em>Poisson</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoisson()
	 * @generated
	 * @ordered
	 */
	protected PoissonType poisson;

	/**
	 * The cached value of the '{@link #getRandomList() <em>Random List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomList()
	 * @generated
	 * @ordered
	 */
	protected RandomListType randomList;

	/**
	 * The cached value of the '{@link #getUniform() <em>Uniform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniform()
	 * @generated
	 * @ordered
	 */
	protected UniformType uniform;

	/**
	 * The cached value of the '{@link #getWeightedList() <em>Weighted List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightedList()
	 * @generated
	 * @ordered
	 */
	protected WeightedListType weightedList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Schema1Package.Literals.DISTRIBUTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialType getExponential() {
		return exponential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExponential(
			ExponentialType newExponential, NotificationChain msgs) {
		ExponentialType oldExponential = exponential;
		exponential = newExponential;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL,
					oldExponential, newExponential);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExponential(ExponentialType newExponential) {
		if (newExponential != exponential) {
			NotificationChain msgs = null;
			if (exponential != null)
				msgs = ((InternalEObject) exponential)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL,
								null, msgs);
			if (newExponential != null)
				msgs = ((InternalEObject) newExponential)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL,
								null, msgs);
			msgs = basicSetExponential(newExponential, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL,
					newExponential, newExponential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GammaType getGamma() {
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGamma(GammaType newGamma,
			NotificationChain msgs) {
		GammaType oldGamma = gamma;
		gamma = newGamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Schema1Package.DISTRIBUTION_TYPE__GAMMA,
					oldGamma, newGamma);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamma(GammaType newGamma) {
		if (newGamma != gamma) {
			NotificationChain msgs = null;
			if (gamma != null)
				msgs = ((InternalEObject) gamma).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__GAMMA,
						null, msgs);
			if (newGamma != null)
				msgs = ((InternalEObject) newGamma).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__GAMMA,
						null, msgs);
			msgs = basicSetGamma(newGamma, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__GAMMA, newGamma, newGamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LognormalType getLognormal() {
		return lognormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLognormal(LognormalType newLognormal,
			NotificationChain msgs) {
		LognormalType oldLognormal = lognormal;
		lognormal = newLognormal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL, oldLognormal,
					newLognormal);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLognormal(LognormalType newLognormal) {
		if (newLognormal != lognormal) {
			NotificationChain msgs = null;
			if (lognormal != null)
				msgs = ((InternalEObject) lognormal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL,
						null, msgs);
			if (newLognormal != null)
				msgs = ((InternalEObject) newLognormal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL,
						null, msgs);
			msgs = basicSetLognormal(newLognormal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL, newLognormal,
					newLognormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalType getNormal() {
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormal(NormalType newNormal,
			NotificationChain msgs) {
		NormalType oldNormal = normal;
		normal = newNormal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Schema1Package.DISTRIBUTION_TYPE__NORMAL,
					oldNormal, newNormal);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormal(NormalType newNormal) {
		if (newNormal != normal) {
			NotificationChain msgs = null;
			if (normal != null)
				msgs = ((InternalEObject) normal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__NORMAL,
						null, msgs);
			if (newNormal != null)
				msgs = ((InternalEObject) newNormal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__NORMAL,
						null, msgs);
			msgs = basicSetNormal(newNormal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__NORMAL, newNormal,
					newNormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoissonType getPoisson() {
		return poisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoisson(PoissonType newPoisson,
			NotificationChain msgs) {
		PoissonType oldPoisson = poisson;
		poisson = newPoisson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__POISSON, oldPoisson,
					newPoisson);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoisson(PoissonType newPoisson) {
		if (newPoisson != poisson) {
			NotificationChain msgs = null;
			if (poisson != null)
				msgs = ((InternalEObject) poisson).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__POISSON,
						null, msgs);
			if (newPoisson != null)
				msgs = ((InternalEObject) newPoisson).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__POISSON,
						null, msgs);
			msgs = basicSetPoisson(newPoisson, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__POISSON, newPoisson,
					newPoisson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomListType getRandomList() {
		return randomList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRandomList(RandomListType newRandomList,
			NotificationChain msgs) {
		RandomListType oldRandomList = randomList;
		randomList = newRandomList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST,
					oldRandomList, newRandomList);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomList(RandomListType newRandomList) {
		if (newRandomList != randomList) {
			NotificationChain msgs = null;
			if (randomList != null)
				msgs = ((InternalEObject) randomList)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST,
								null, msgs);
			if (newRandomList != null)
				msgs = ((InternalEObject) newRandomList)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST,
								null, msgs);
			msgs = basicSetRandomList(newRandomList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST,
					newRandomList, newRandomList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformType getUniform() {
		return uniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniform(UniformType newUniform,
			NotificationChain msgs) {
		UniformType oldUniform = uniform;
		uniform = newUniform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__UNIFORM, oldUniform,
					newUniform);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniform(UniformType newUniform) {
		if (newUniform != uniform) {
			NotificationChain msgs = null;
			if (uniform != null)
				msgs = ((InternalEObject) uniform).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__UNIFORM,
						null, msgs);
			if (newUniform != null)
				msgs = ((InternalEObject) newUniform).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Schema1Package.DISTRIBUTION_TYPE__UNIFORM,
						null, msgs);
			msgs = basicSetUniform(newUniform, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__UNIFORM, newUniform,
					newUniform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightedListType getWeightedList() {
		return weightedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeightedList(
			WeightedListType newWeightedList, NotificationChain msgs) {
		WeightedListType oldWeightedList = weightedList;
		weightedList = newWeightedList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST,
					oldWeightedList, newWeightedList);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightedList(WeightedListType newWeightedList) {
		if (newWeightedList != weightedList) {
			NotificationChain msgs = null;
			if (weightedList != null)
				msgs = ((InternalEObject) weightedList)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST,
								null, msgs);
			if (newWeightedList != null)
				msgs = ((InternalEObject) newWeightedList)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST,
								null, msgs);
			msgs = basicSetWeightedList(newWeightedList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST,
					newWeightedList, newWeightedList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL:
			return basicSetExponential(null, msgs);
		case Schema1Package.DISTRIBUTION_TYPE__GAMMA:
			return basicSetGamma(null, msgs);
		case Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL:
			return basicSetLognormal(null, msgs);
		case Schema1Package.DISTRIBUTION_TYPE__NORMAL:
			return basicSetNormal(null, msgs);
		case Schema1Package.DISTRIBUTION_TYPE__POISSON:
			return basicSetPoisson(null, msgs);
		case Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST:
			return basicSetRandomList(null, msgs);
		case Schema1Package.DISTRIBUTION_TYPE__UNIFORM:
			return basicSetUniform(null, msgs);
		case Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST:
			return basicSetWeightedList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL:
			return getExponential();
		case Schema1Package.DISTRIBUTION_TYPE__GAMMA:
			return getGamma();
		case Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL:
			return getLognormal();
		case Schema1Package.DISTRIBUTION_TYPE__NORMAL:
			return getNormal();
		case Schema1Package.DISTRIBUTION_TYPE__POISSON:
			return getPoisson();
		case Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST:
			return getRandomList();
		case Schema1Package.DISTRIBUTION_TYPE__UNIFORM:
			return getUniform();
		case Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST:
			return getWeightedList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL:
			setExponential((ExponentialType) newValue);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__GAMMA:
			setGamma((GammaType) newValue);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL:
			setLognormal((LognormalType) newValue);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__NORMAL:
			setNormal((NormalType) newValue);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__POISSON:
			setPoisson((PoissonType) newValue);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST:
			setRandomList((RandomListType) newValue);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__UNIFORM:
			setUniform((UniformType) newValue);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST:
			setWeightedList((WeightedListType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL:
			setExponential((ExponentialType) null);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__GAMMA:
			setGamma((GammaType) null);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL:
			setLognormal((LognormalType) null);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__NORMAL:
			setNormal((NormalType) null);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__POISSON:
			setPoisson((PoissonType) null);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST:
			setRandomList((RandomListType) null);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__UNIFORM:
			setUniform((UniformType) null);
			return;
		case Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST:
			setWeightedList((WeightedListType) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Schema1Package.DISTRIBUTION_TYPE__EXPONENTIAL:
			return exponential != null;
		case Schema1Package.DISTRIBUTION_TYPE__GAMMA:
			return gamma != null;
		case Schema1Package.DISTRIBUTION_TYPE__LOGNORMAL:
			return lognormal != null;
		case Schema1Package.DISTRIBUTION_TYPE__NORMAL:
			return normal != null;
		case Schema1Package.DISTRIBUTION_TYPE__POISSON:
			return poisson != null;
		case Schema1Package.DISTRIBUTION_TYPE__RANDOM_LIST:
			return randomList != null;
		case Schema1Package.DISTRIBUTION_TYPE__UNIFORM:
			return uniform != null;
		case Schema1Package.DISTRIBUTION_TYPE__WEIGHTED_LIST:
			return weightedList != null;
		}
		return super.eIsSet(featureID);
	}

} //DistributionTypeImpl
