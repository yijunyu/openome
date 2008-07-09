package edu.toronto.cs.openome_model.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class Openome_modelDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getActor()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getAgent()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getAndDecomposition()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContribution()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getDecomposition()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getDependency()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getGoal()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getIntention()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getModel()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getOrDecomposition()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getPosition()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getProperty()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getResource()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getRole()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getSoftgoal()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getTask()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getContainer()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getBelief()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getLink()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getCorrelation()) {
			return true;
		}
		if (eClass == edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getDependable()) {
			return true;
		}
		return false;
	}

}
