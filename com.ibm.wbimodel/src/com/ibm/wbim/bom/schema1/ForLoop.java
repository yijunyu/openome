/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The For Loop must use the start node to connect the first element in the loop. The loop must not use the input to the loop to connect to this element. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ForLoop#getLoopCondition <em>Loop Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getForLoop()
 * @model extendedMetaData="name='ForLoop' kind='elementOnly'"
 * @generated
 */
public interface ForLoop extends com.ibm.wbim.bom.schema1.Process {
	/**
	 * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Condition</em>' containment reference.
	 * @see #setLoopCondition(LoopConditionType)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getForLoop_LoopCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loopCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	LoopConditionType getLoopCondition();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.ForLoop#getLoopCondition <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Condition</em>' containment reference.
	 * @see #getLoopCondition()
	 * @generated
	 */
	void setLoopCondition(LoopConditionType value);

} // ForLoop