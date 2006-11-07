/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.ProcessesType#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcessesType()
 * @model extendedMetaData="name='processes_._type' kind='elementOnly'"
 * @generated
 */
public interface ProcessesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a global process, its inputs and outputs must have associated data. In inputs for global processes, the constantValue element is ignored. In inputs and outputs for global processes, the repositoryValue element is ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getProcessesType_Process()
	 * @model type="com.ibm.wbim.bom.schema1.Process" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getProcess();

} // ProcessesType