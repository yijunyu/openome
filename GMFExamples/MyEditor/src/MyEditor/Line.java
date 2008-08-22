/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MyEditor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MyEditor.Line#getSourceBox <em>Source Box</em>}</li>
 *   <li>{@link MyEditor.Line#getTargetBox <em>Target Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see MyEditor.MyEditorPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Box</em>' reference.
	 * @see #setSourceBox(Box)
	 * @see MyEditor.MyEditorPackage#getLine_SourceBox()
	 * @model required="true"
	 * @generated
	 */
	Box getSourceBox();

	/**
	 * Sets the value of the '{@link MyEditor.Line#getSourceBox <em>Source Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Box</em>' reference.
	 * @see #getSourceBox()
	 * @generated
	 */
	void setSourceBox(Box value);

	/**
	 * Returns the value of the '<em><b>Target Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Box</em>' reference.
	 * @see #setTargetBox(Box)
	 * @see MyEditor.MyEditorPackage#getLine_TargetBox()
	 * @model required="true"
	 * @generated
	 */
	Box getTargetBox();

	/**
	 * Sets the value of the '{@link MyEditor.Line#getTargetBox <em>Target Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Box</em>' reference.
	 * @see #getTargetBox()
	 * @generated
	 */
	void setTargetBox(Box value);

} // Line
