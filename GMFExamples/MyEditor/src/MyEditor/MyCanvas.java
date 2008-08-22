/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MyEditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MyEditor.MyCanvas#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link MyEditor.MyCanvas#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see MyEditor.MyEditorPackage#getMyCanvas()
 * @model
 * @generated
 */
public interface MyCanvas extends EObject {
	/**
	 * Returns the value of the '<em><b>Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link MyEditor.Box}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boxes</em>' containment reference list.
	 * @see MyEditor.MyEditorPackage#getMyCanvas_Boxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Box> getBoxes();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link MyEditor.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see MyEditor.MyEditorPackage#getMyCanvas_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLines();

} // MyCanvas
