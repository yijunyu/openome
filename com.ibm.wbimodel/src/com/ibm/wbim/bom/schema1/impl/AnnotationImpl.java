/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.AnnotatedNodeType;
import com.ibm.wbim.bom.schema1.Annotation;
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
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.AnnotationImpl#getAnnotationText <em>Annotation Text</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.AnnotationImpl#getAnnotatedNode <em>Annotated Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends EObjectImpl implements Annotation {
	/**
	 * The default value of the '{@link #getAnnotationText() <em>Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotationText() <em>Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected String annotationText = ANNOTATION_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotatedNode() <em>Annotated Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedNode()
	 * @generated
	 * @ordered
	 */
	protected EList annotatedNode = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotationText() {
		return annotationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationText(String newAnnotationText) {
		String oldAnnotationText = annotationText;
		annotationText = newAnnotationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.ANNOTATION__ANNOTATION_TEXT, oldAnnotationText, annotationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAnnotatedNode() {
		if (annotatedNode == null) {
			annotatedNode = new EObjectContainmentEList(AnnotatedNodeType.class, this, Schema1Package.ANNOTATION__ANNOTATED_NODE);
		}
		return annotatedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.ANNOTATION__ANNOTATED_NODE:
				return ((InternalEList)getAnnotatedNode()).basicRemove(otherEnd, msgs);
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
			case Schema1Package.ANNOTATION__ANNOTATION_TEXT:
				return getAnnotationText();
			case Schema1Package.ANNOTATION__ANNOTATED_NODE:
				return getAnnotatedNode();
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
			case Schema1Package.ANNOTATION__ANNOTATION_TEXT:
				setAnnotationText((String)newValue);
				return;
			case Schema1Package.ANNOTATION__ANNOTATED_NODE:
				getAnnotatedNode().clear();
				getAnnotatedNode().addAll((Collection)newValue);
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
			case Schema1Package.ANNOTATION__ANNOTATION_TEXT:
				setAnnotationText(ANNOTATION_TEXT_EDEFAULT);
				return;
			case Schema1Package.ANNOTATION__ANNOTATED_NODE:
				getAnnotatedNode().clear();
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
			case Schema1Package.ANNOTATION__ANNOTATION_TEXT:
				return ANNOTATION_TEXT_EDEFAULT == null ? annotationText != null : !ANNOTATION_TEXT_EDEFAULT.equals(annotationText);
			case Schema1Package.ANNOTATION__ANNOTATED_NODE:
				return annotatedNode != null && !annotatedNode.isEmpty();
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
		result.append(" (annotationText: ");
		result.append(annotationText);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl