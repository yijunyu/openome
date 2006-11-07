/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.GlobalRepositoryRef;
import com.ibm.wbim.bom.schema1.LocalRepositoryRef;
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
 * An implementation of the model object '<em><b>Output Repository Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueImpl#getLocalRepository <em>Local Repository</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueImpl#getGlobalRepository <em>Global Repository</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueImpl#isAtBeginning <em>At Beginning</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.OutputRepositoryValueImpl#isIsInsert <em>Is Insert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputRepositoryValueImpl extends EObjectImpl implements OutputRepositoryValue {
	/**
	 * The cached value of the '{@link #getLocalRepository() <em>Local Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalRepository()
	 * @generated
	 * @ordered
	 */
	protected LocalRepositoryRef localRepository = null;

	/**
	 * The cached value of the '{@link #getGlobalRepository() <em>Global Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalRepository()
	 * @generated
	 * @ordered
	 */
	protected GlobalRepositoryRef globalRepository = null;

	/**
	 * The default value of the '{@link #isAtBeginning() <em>At Beginning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtBeginning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AT_BEGINNING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAtBeginning() <em>At Beginning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtBeginning()
	 * @generated
	 * @ordered
	 */
	protected boolean atBeginning = AT_BEGINNING_EDEFAULT;

	/**
	 * This is true if the At Beginning attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean atBeginningESet = false;

	/**
	 * The default value of the '{@link #isIsInsert() <em>Is Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInsert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INSERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInsert() <em>Is Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInsert()
	 * @generated
	 * @ordered
	 */
	protected boolean isInsert = IS_INSERT_EDEFAULT;

	/**
	 * This is true if the Is Insert attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isInsertESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputRepositoryValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.OUTPUT_REPOSITORY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalRepositoryRef getLocalRepository() {
		return localRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalRepository(LocalRepositoryRef newLocalRepository, NotificationChain msgs) {
		LocalRepositoryRef oldLocalRepository = localRepository;
		localRepository = newLocalRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY, oldLocalRepository, newLocalRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalRepository(LocalRepositoryRef newLocalRepository) {
		if (newLocalRepository != localRepository) {
			NotificationChain msgs = null;
			if (localRepository != null)
				msgs = ((InternalEObject)localRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY, null, msgs);
			if (newLocalRepository != null)
				msgs = ((InternalEObject)newLocalRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY, null, msgs);
			msgs = basicSetLocalRepository(newLocalRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY, newLocalRepository, newLocalRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalRepositoryRef getGlobalRepository() {
		return globalRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalRepository(GlobalRepositoryRef newGlobalRepository, NotificationChain msgs) {
		GlobalRepositoryRef oldGlobalRepository = globalRepository;
		globalRepository = newGlobalRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY, oldGlobalRepository, newGlobalRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalRepository(GlobalRepositoryRef newGlobalRepository) {
		if (newGlobalRepository != globalRepository) {
			NotificationChain msgs = null;
			if (globalRepository != null)
				msgs = ((InternalEObject)globalRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY, null, msgs);
			if (newGlobalRepository != null)
				msgs = ((InternalEObject)newGlobalRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY, null, msgs);
			msgs = basicSetGlobalRepository(newGlobalRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY, newGlobalRepository, newGlobalRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAtBeginning() {
		return atBeginning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtBeginning(boolean newAtBeginning) {
		boolean oldAtBeginning = atBeginning;
		atBeginning = newAtBeginning;
		boolean oldAtBeginningESet = atBeginningESet;
		atBeginningESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_REPOSITORY_VALUE__AT_BEGINNING, oldAtBeginning, atBeginning, !oldAtBeginningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAtBeginning() {
		boolean oldAtBeginning = atBeginning;
		boolean oldAtBeginningESet = atBeginningESet;
		atBeginning = AT_BEGINNING_EDEFAULT;
		atBeginningESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.OUTPUT_REPOSITORY_VALUE__AT_BEGINNING, oldAtBeginning, AT_BEGINNING_EDEFAULT, oldAtBeginningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAtBeginning() {
		return atBeginningESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInsert() {
		return isInsert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInsert(boolean newIsInsert) {
		boolean oldIsInsert = isInsert;
		isInsert = newIsInsert;
		boolean oldIsInsertESet = isInsertESet;
		isInsertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.OUTPUT_REPOSITORY_VALUE__IS_INSERT, oldIsInsert, isInsert, !oldIsInsertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsInsert() {
		boolean oldIsInsert = isInsert;
		boolean oldIsInsertESet = isInsertESet;
		isInsert = IS_INSERT_EDEFAULT;
		isInsertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Schema1Package.OUTPUT_REPOSITORY_VALUE__IS_INSERT, oldIsInsert, IS_INSERT_EDEFAULT, oldIsInsertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsInsert() {
		return isInsertESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY:
				return basicSetLocalRepository(null, msgs);
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY:
				return basicSetGlobalRepository(null, msgs);
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
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY:
				return getLocalRepository();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY:
				return getGlobalRepository();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__AT_BEGINNING:
				return isAtBeginning() ? Boolean.TRUE : Boolean.FALSE;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__IS_INSERT:
				return isIsInsert() ? Boolean.TRUE : Boolean.FALSE;
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
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY:
				setLocalRepository((LocalRepositoryRef)newValue);
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY:
				setGlobalRepository((GlobalRepositoryRef)newValue);
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__AT_BEGINNING:
				setAtBeginning(((Boolean)newValue).booleanValue());
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__IS_INSERT:
				setIsInsert(((Boolean)newValue).booleanValue());
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
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY:
				setLocalRepository((LocalRepositoryRef)null);
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY:
				setGlobalRepository((GlobalRepositoryRef)null);
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__AT_BEGINNING:
				unsetAtBeginning();
				return;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__IS_INSERT:
				unsetIsInsert();
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
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__LOCAL_REPOSITORY:
				return localRepository != null;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__GLOBAL_REPOSITORY:
				return globalRepository != null;
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__AT_BEGINNING:
				return isSetAtBeginning();
			case Schema1Package.OUTPUT_REPOSITORY_VALUE__IS_INSERT:
				return isSetIsInsert();
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
		result.append(" (atBeginning: ");
		if (atBeginningESet) result.append(atBeginning); else result.append("<unset>");
		result.append(", isInsert: ");
		if (isInsertESet) result.append(isInsert); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutputRepositoryValueImpl