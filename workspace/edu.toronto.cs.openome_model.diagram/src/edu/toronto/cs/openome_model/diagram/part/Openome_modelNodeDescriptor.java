package edu.toronto.cs.openome_model.diagram.part;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class Openome_modelNodeDescriptor {

	/**
	 * @generated
	 */
	private EObject myModelElement;

	/**
	 * @generated
	 */
	private int myVisualID;

	/**
	 * @generated
	 */
	private String myType;

	/**
	 * @generated
	 */
	public Openome_modelNodeDescriptor(EObject modelElement, int visualID) {
		myModelElement = modelElement;
		myVisualID = visualID;
	}

	/**
	 * @generated
	 */
	public EObject getModelElement() {
		return myModelElement;
	}

	/**
	 * @generated
	 */
	public int getVisualID() {
		return myVisualID;
	}

	/**
	 * @generated
	 */
	public String getType() {
		if (myType == null) {
			myType = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getType(getVisualID());
		}
		return myType;
	}

}
