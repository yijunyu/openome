/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.RepositoryDataValue;
import com.ibm.wbim.bom.schema1.Schema1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Data Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl#getExpressionValue <em>Expression Value</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl#getPublicInstance <em>Public Instance</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.RepositoryDataValueImpl#getPrivateInstance <em>Private Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryDataValueImpl extends EObjectImpl implements RepositoryDataValue {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryDataValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.REPOSITORY_DATA_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Schema1Package.REPOSITORY_DATA_VALUE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLiteralValue() {
		return getGroup().list(Schema1Package.Literals.REPOSITORY_DATA_VALUE__LITERAL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExpressionValue() {
		return getGroup().list(Schema1Package.Literals.REPOSITORY_DATA_VALUE__EXPRESSION_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPublicInstance() {
		return getGroup().list(Schema1Package.Literals.REPOSITORY_DATA_VALUE__PUBLIC_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPrivateInstance() {
		return getGroup().list(Schema1Package.Literals.REPOSITORY_DATA_VALUE__PRIVATE_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.REPOSITORY_DATA_VALUE__GROUP:
				return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
			case Schema1Package.REPOSITORY_DATA_VALUE__EXPRESSION_VALUE:
				return ((InternalEList)getExpressionValue()).basicRemove(otherEnd, msgs);
			case Schema1Package.REPOSITORY_DATA_VALUE__PUBLIC_INSTANCE:
				return ((InternalEList)getPublicInstance()).basicRemove(otherEnd, msgs);
			case Schema1Package.REPOSITORY_DATA_VALUE__PRIVATE_INSTANCE:
				return ((InternalEList)getPrivateInstance()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.REPOSITORY_DATA_VALUE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Schema1Package.REPOSITORY_DATA_VALUE__LITERAL_VALUE:
				return getLiteralValue();
			case Schema1Package.REPOSITORY_DATA_VALUE__EXPRESSION_VALUE:
				return getExpressionValue();
			case Schema1Package.REPOSITORY_DATA_VALUE__PUBLIC_INSTANCE:
				return getPublicInstance();
			case Schema1Package.REPOSITORY_DATA_VALUE__PRIVATE_INSTANCE:
				return getPrivateInstance();
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
			case Schema1Package.REPOSITORY_DATA_VALUE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Schema1Package.REPOSITORY_DATA_VALUE__LITERAL_VALUE:
				getLiteralValue().clear();
				getLiteralValue().addAll((Collection)newValue);
				return;
			case Schema1Package.REPOSITORY_DATA_VALUE__EXPRESSION_VALUE:
				getExpressionValue().clear();
				getExpressionValue().addAll((Collection)newValue);
				return;
			case Schema1Package.REPOSITORY_DATA_VALUE__PUBLIC_INSTANCE:
				getPublicInstance().clear();
				getPublicInstance().addAll((Collection)newValue);
				return;
			case Schema1Package.REPOSITORY_DATA_VALUE__PRIVATE_INSTANCE:
				getPrivateInstance().clear();
				getPrivateInstance().addAll((Collection)newValue);
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
			case Schema1Package.REPOSITORY_DATA_VALUE__GROUP:
				getGroup().clear();
				return;
			case Schema1Package.REPOSITORY_DATA_VALUE__LITERAL_VALUE:
				getLiteralValue().clear();
				return;
			case Schema1Package.REPOSITORY_DATA_VALUE__EXPRESSION_VALUE:
				getExpressionValue().clear();
				return;
			case Schema1Package.REPOSITORY_DATA_VALUE__PUBLIC_INSTANCE:
				getPublicInstance().clear();
				return;
			case Schema1Package.REPOSITORY_DATA_VALUE__PRIVATE_INSTANCE:
				getPrivateInstance().clear();
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
			case Schema1Package.REPOSITORY_DATA_VALUE__GROUP:
				return group != null && !group.isEmpty();
			case Schema1Package.REPOSITORY_DATA_VALUE__LITERAL_VALUE:
				return !getLiteralValue().isEmpty();
			case Schema1Package.REPOSITORY_DATA_VALUE__EXPRESSION_VALUE:
				return !getExpressionValue().isEmpty();
			case Schema1Package.REPOSITORY_DATA_VALUE__PUBLIC_INSTANCE:
				return !getPublicInstance().isEmpty();
			case Schema1Package.REPOSITORY_DATA_VALUE__PRIVATE_INSTANCE:
				return !getPrivateInstance().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //RepositoryDataValueImpl
