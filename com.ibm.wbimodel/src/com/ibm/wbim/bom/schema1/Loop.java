/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Do While Loops and While Loops must use the start node to connect the first element in the loop. The loop must not use the input to the loop to connect to this element. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Loop#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.Loop#isIsConditionTestedFirst <em>Is Condition Tested First</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLoop()
 * @model extendedMetaData="name='Loop' kind='elementOnly'"
 * @generated
 */
public interface Loop extends com.ibm.wbim.bom.schema1.Process {
	/**
	 * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Condition</em>' containment reference.
	 * @see #setLoopCondition(Expression)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLoop_LoopCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loopCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getLoopCondition();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Loop#getLoopCondition <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Condition</em>' containment reference.
	 * @see #getLoopCondition()
	 * @generated
	 */
	void setLoopCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Condition Tested First</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Condition Tested First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Condition Tested First</em>' attribute.
	 * @see #isSetIsConditionTestedFirst()
	 * @see #unsetIsConditionTestedFirst()
	 * @see #setIsConditionTestedFirst(boolean)
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getLoop_IsConditionTestedFirst()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isConditionTestedFirst'"
	 * @generated
	 */
	boolean isIsConditionTestedFirst();

	/**
	 * Sets the value of the '{@link com.ibm.wbim.bom.schema1.Loop#isIsConditionTestedFirst <em>Is Condition Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Condition Tested First</em>' attribute.
	 * @see #isSetIsConditionTestedFirst()
	 * @see #unsetIsConditionTestedFirst()
	 * @see #isIsConditionTestedFirst()
	 * @generated
	 */
	void setIsConditionTestedFirst(boolean value);

	/**
	 * Unsets the value of the '{@link com.ibm.wbim.bom.schema1.Loop#isIsConditionTestedFirst <em>Is Condition Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConditionTestedFirst()
	 * @see #isIsConditionTestedFirst()
	 * @see #setIsConditionTestedFirst(boolean)
	 * @generated
	 */
	void unsetIsConditionTestedFirst();

	/**
	 * Returns whether the value of the '{@link com.ibm.wbim.bom.schema1.Loop#isIsConditionTestedFirst <em>Is Condition Tested First</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Condition Tested First</em>' attribute is set.
	 * @see #unsetIsConditionTestedFirst()
	 * @see #isIsConditionTestedFirst()
	 * @see #setIsConditionTestedFirst(boolean)
	 * @generated
	 */
	boolean isSetIsConditionTestedFirst();

} // Loop