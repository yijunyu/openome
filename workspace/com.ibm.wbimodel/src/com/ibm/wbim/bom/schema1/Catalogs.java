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
 * A representation of the model object '<em><b>Catalogs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.Catalogs#getCatalog <em>Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCatalogs()
 * @model extendedMetaData="name='Catalogs' kind='elementOnly'"
 * @generated
 */
public interface Catalogs extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.wbim.bom.schema1.Catalog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference list.
	 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCatalogs_Catalog()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Catalog> getCatalog();

} // Catalogs
