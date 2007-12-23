/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.Catalogs;
import com.ibm.wbim.bom.schema1.CatalogsType;
import com.ibm.wbim.bom.schema1.Schema1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalogs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CatalogsTypeImpl#getDataCatalogs <em>Data Catalogs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CatalogsTypeImpl#getResourceCatalogs <em>Resource Catalogs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CatalogsTypeImpl#getOrganizationCatalogs <em>Organization Catalogs</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.CatalogsTypeImpl#getProcessCatalogs <em>Process Catalogs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogsTypeImpl extends EObjectImpl implements CatalogsType {
	/**
	 * The cached value of the '{@link #getDataCatalogs() <em>Data Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCatalogs()
	 * @generated
	 * @ordered
	 */
	protected Catalogs dataCatalogs;

	/**
	 * The cached value of the '{@link #getResourceCatalogs() <em>Resource Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceCatalogs()
	 * @generated
	 * @ordered
	 */
	protected Catalogs resourceCatalogs;

	/**
	 * The cached value of the '{@link #getOrganizationCatalogs() <em>Organization Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationCatalogs()
	 * @generated
	 * @ordered
	 */
	protected Catalogs organizationCatalogs;

	/**
	 * The cached value of the '{@link #getProcessCatalogs() <em>Process Catalogs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessCatalogs()
	 * @generated
	 * @ordered
	 */
	protected Catalogs processCatalogs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.CATALOGS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogs getDataCatalogs() {
		return dataCatalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataCatalogs(Catalogs newDataCatalogs, NotificationChain msgs) {
		Catalogs oldDataCatalogs = dataCatalogs;
		dataCatalogs = newDataCatalogs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CATALOGS_TYPE__DATA_CATALOGS, oldDataCatalogs, newDataCatalogs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataCatalogs(Catalogs newDataCatalogs) {
		if (newDataCatalogs != dataCatalogs) {
			NotificationChain msgs = null;
			if (dataCatalogs != null)
				msgs = ((InternalEObject)dataCatalogs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CATALOGS_TYPE__DATA_CATALOGS, null, msgs);
			if (newDataCatalogs != null)
				msgs = ((InternalEObject)newDataCatalogs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CATALOGS_TYPE__DATA_CATALOGS, null, msgs);
			msgs = basicSetDataCatalogs(newDataCatalogs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CATALOGS_TYPE__DATA_CATALOGS, newDataCatalogs, newDataCatalogs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogs getResourceCatalogs() {
		return resourceCatalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceCatalogs(Catalogs newResourceCatalogs, NotificationChain msgs) {
		Catalogs oldResourceCatalogs = resourceCatalogs;
		resourceCatalogs = newResourceCatalogs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS, oldResourceCatalogs, newResourceCatalogs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceCatalogs(Catalogs newResourceCatalogs) {
		if (newResourceCatalogs != resourceCatalogs) {
			NotificationChain msgs = null;
			if (resourceCatalogs != null)
				msgs = ((InternalEObject)resourceCatalogs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS, null, msgs);
			if (newResourceCatalogs != null)
				msgs = ((InternalEObject)newResourceCatalogs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS, null, msgs);
			msgs = basicSetResourceCatalogs(newResourceCatalogs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS, newResourceCatalogs, newResourceCatalogs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogs getOrganizationCatalogs() {
		return organizationCatalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationCatalogs(Catalogs newOrganizationCatalogs, NotificationChain msgs) {
		Catalogs oldOrganizationCatalogs = organizationCatalogs;
		organizationCatalogs = newOrganizationCatalogs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS, oldOrganizationCatalogs, newOrganizationCatalogs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationCatalogs(Catalogs newOrganizationCatalogs) {
		if (newOrganizationCatalogs != organizationCatalogs) {
			NotificationChain msgs = null;
			if (organizationCatalogs != null)
				msgs = ((InternalEObject)organizationCatalogs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS, null, msgs);
			if (newOrganizationCatalogs != null)
				msgs = ((InternalEObject)newOrganizationCatalogs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS, null, msgs);
			msgs = basicSetOrganizationCatalogs(newOrganizationCatalogs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS, newOrganizationCatalogs, newOrganizationCatalogs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogs getProcessCatalogs() {
		return processCatalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessCatalogs(Catalogs newProcessCatalogs, NotificationChain msgs) {
		Catalogs oldProcessCatalogs = processCatalogs;
		processCatalogs = newProcessCatalogs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS, oldProcessCatalogs, newProcessCatalogs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessCatalogs(Catalogs newProcessCatalogs) {
		if (newProcessCatalogs != processCatalogs) {
			NotificationChain msgs = null;
			if (processCatalogs != null)
				msgs = ((InternalEObject)processCatalogs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS, null, msgs);
			if (newProcessCatalogs != null)
				msgs = ((InternalEObject)newProcessCatalogs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS, null, msgs);
			msgs = basicSetProcessCatalogs(newProcessCatalogs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS, newProcessCatalogs, newProcessCatalogs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.CATALOGS_TYPE__DATA_CATALOGS:
				return basicSetDataCatalogs(null, msgs);
			case Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS:
				return basicSetResourceCatalogs(null, msgs);
			case Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS:
				return basicSetOrganizationCatalogs(null, msgs);
			case Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS:
				return basicSetProcessCatalogs(null, msgs);
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
			case Schema1Package.CATALOGS_TYPE__DATA_CATALOGS:
				return getDataCatalogs();
			case Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS:
				return getResourceCatalogs();
			case Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS:
				return getOrganizationCatalogs();
			case Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS:
				return getProcessCatalogs();
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
			case Schema1Package.CATALOGS_TYPE__DATA_CATALOGS:
				setDataCatalogs((Catalogs)newValue);
				return;
			case Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS:
				setResourceCatalogs((Catalogs)newValue);
				return;
			case Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS:
				setOrganizationCatalogs((Catalogs)newValue);
				return;
			case Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS:
				setProcessCatalogs((Catalogs)newValue);
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
			case Schema1Package.CATALOGS_TYPE__DATA_CATALOGS:
				setDataCatalogs((Catalogs)null);
				return;
			case Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS:
				setResourceCatalogs((Catalogs)null);
				return;
			case Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS:
				setOrganizationCatalogs((Catalogs)null);
				return;
			case Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS:
				setProcessCatalogs((Catalogs)null);
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
			case Schema1Package.CATALOGS_TYPE__DATA_CATALOGS:
				return dataCatalogs != null;
			case Schema1Package.CATALOGS_TYPE__RESOURCE_CATALOGS:
				return resourceCatalogs != null;
			case Schema1Package.CATALOGS_TYPE__ORGANIZATION_CATALOGS:
				return organizationCatalogs != null;
			case Schema1Package.CATALOGS_TYPE__PROCESS_CATALOGS:
				return processCatalogs != null;
		}
		return super.eIsSet(featureID);
	}

} //CatalogsTypeImpl
