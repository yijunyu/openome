/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.wsdl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xmlsoap.schemas.wsdl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xmlsoap.schemas.wsdl.WsdlPackage
 * @generated
 */
public class WsdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WsdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WsdlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlSwitch modelSwitch =
		new WsdlSwitch() {
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseTBinding(TBinding object) {
				return createTBindingAdapter();
			}
			public Object caseTBindingOperation(TBindingOperation object) {
				return createTBindingOperationAdapter();
			}
			public Object caseTBindingOperationFault(TBindingOperationFault object) {
				return createTBindingOperationFaultAdapter();
			}
			public Object caseTBindingOperationMessage(TBindingOperationMessage object) {
				return createTBindingOperationMessageAdapter();
			}
			public Object caseTDefinitions(TDefinitions object) {
				return createTDefinitionsAdapter();
			}
			public Object caseTDocumentation(TDocumentation object) {
				return createTDocumentationAdapter();
			}
			public Object caseTDocumented(TDocumented object) {
				return createTDocumentedAdapter();
			}
			public Object caseTExtensibilityElement(TExtensibilityElement object) {
				return createTExtensibilityElementAdapter();
			}
			public Object caseTExtensibleAttributesDocumented(TExtensibleAttributesDocumented object) {
				return createTExtensibleAttributesDocumentedAdapter();
			}
			public Object caseTExtensibleDocumented(TExtensibleDocumented object) {
				return createTExtensibleDocumentedAdapter();
			}
			public Object caseTFault(TFault object) {
				return createTFaultAdapter();
			}
			public Object caseTImport(TImport object) {
				return createTImportAdapter();
			}
			public Object caseTMessage(TMessage object) {
				return createTMessageAdapter();
			}
			public Object caseTOperation(TOperation object) {
				return createTOperationAdapter();
			}
			public Object caseTParam(TParam object) {
				return createTParamAdapter();
			}
			public Object caseTPart(TPart object) {
				return createTPartAdapter();
			}
			public Object caseTPort(TPort object) {
				return createTPortAdapter();
			}
			public Object caseTPortType(TPortType object) {
				return createTPortTypeAdapter();
			}
			public Object caseTService(TService object) {
				return createTServiceAdapter();
			}
			public Object caseTTypes(TTypes object) {
				return createTTypesAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TBinding <em>TBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TBinding
	 * @generated
	 */
	public Adapter createTBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TBindingOperation <em>TBinding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TBindingOperation
	 * @generated
	 */
	public Adapter createTBindingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TBindingOperationFault <em>TBinding Operation Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TBindingOperationFault
	 * @generated
	 */
	public Adapter createTBindingOperationFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TBindingOperationMessage <em>TBinding Operation Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TBindingOperationMessage
	 * @generated
	 */
	public Adapter createTBindingOperationMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TDefinitions
	 * @generated
	 */
	public Adapter createTDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TDocumentation
	 * @generated
	 */
	public Adapter createTDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TDocumented <em>TDocumented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TDocumented
	 * @generated
	 */
	public Adapter createTDocumentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TExtensibilityElement <em>TExtensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TExtensibilityElement
	 * @generated
	 */
	public Adapter createTExtensibilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TExtensibleAttributesDocumented <em>TExtensible Attributes Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TExtensibleAttributesDocumented
	 * @generated
	 */
	public Adapter createTExtensibleAttributesDocumentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TExtensibleDocumented <em>TExtensible Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TExtensibleDocumented
	 * @generated
	 */
	public Adapter createTExtensibleDocumentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TFault <em>TFault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TFault
	 * @generated
	 */
	public Adapter createTFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TImport
	 * @generated
	 */
	public Adapter createTImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TMessage <em>TMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TMessage
	 * @generated
	 */
	public Adapter createTMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TOperation <em>TOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TOperation
	 * @generated
	 */
	public Adapter createTOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TParam <em>TParam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TParam
	 * @generated
	 */
	public Adapter createTParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TPart <em>TPart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TPart
	 * @generated
	 */
	public Adapter createTPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TPort <em>TPort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TPort
	 * @generated
	 */
	public Adapter createTPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TPortType <em>TPort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TPortType
	 * @generated
	 */
	public Adapter createTPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TService <em>TService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TService
	 * @generated
	 */
	public Adapter createTServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmlsoap.schemas.wsdl.TTypes <em>TTypes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmlsoap.schemas.wsdl.TTypes
	 * @generated
	 */
	public Adapter createTTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WsdlAdapterFactory
