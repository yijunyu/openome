/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MyEditor.impl;

import MyEditor.Box;
import MyEditor.Line;
import MyEditor.MyEditorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MyEditor.impl.LineImpl#getSourceBox <em>Source Box</em>}</li>
 *   <li>{@link MyEditor.impl.LineImpl#getTargetBox <em>Target Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends EObjectImpl implements Line {
	/**
	 * The cached value of the '{@link #getSourceBox() <em>Source Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBox()
	 * @generated
	 * @ordered
	 */
	protected Box sourceBox;

	/**
	 * The cached value of the '{@link #getTargetBox() <em>Target Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBox()
	 * @generated
	 * @ordered
	 */
	protected Box targetBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEditorPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getSourceBox() {
		if (sourceBox != null && sourceBox.eIsProxy()) {
			InternalEObject oldSourceBox = (InternalEObject)sourceBox;
			sourceBox = (Box)eResolveProxy(oldSourceBox);
			if (sourceBox != oldSourceBox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyEditorPackage.LINE__SOURCE_BOX, oldSourceBox, sourceBox));
			}
		}
		return sourceBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box basicGetSourceBox() {
		return sourceBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceBox(Box newSourceBox) {
		Box oldSourceBox = sourceBox;
		sourceBox = newSourceBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEditorPackage.LINE__SOURCE_BOX, oldSourceBox, sourceBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getTargetBox() {
		if (targetBox != null && targetBox.eIsProxy()) {
			InternalEObject oldTargetBox = (InternalEObject)targetBox;
			targetBox = (Box)eResolveProxy(oldTargetBox);
			if (targetBox != oldTargetBox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyEditorPackage.LINE__TARGET_BOX, oldTargetBox, targetBox));
			}
		}
		return targetBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box basicGetTargetBox() {
		return targetBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBox(Box newTargetBox) {
		Box oldTargetBox = targetBox;
		targetBox = newTargetBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEditorPackage.LINE__TARGET_BOX, oldTargetBox, targetBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyEditorPackage.LINE__SOURCE_BOX:
				if (resolve) return getSourceBox();
				return basicGetSourceBox();
			case MyEditorPackage.LINE__TARGET_BOX:
				if (resolve) return getTargetBox();
				return basicGetTargetBox();
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
			case MyEditorPackage.LINE__SOURCE_BOX:
				setSourceBox((Box)newValue);
				return;
			case MyEditorPackage.LINE__TARGET_BOX:
				setTargetBox((Box)newValue);
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
			case MyEditorPackage.LINE__SOURCE_BOX:
				setSourceBox((Box)null);
				return;
			case MyEditorPackage.LINE__TARGET_BOX:
				setTargetBox((Box)null);
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
			case MyEditorPackage.LINE__SOURCE_BOX:
				return sourceBox != null;
			case MyEditorPackage.LINE__TARGET_BOX:
				return targetBox != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl
