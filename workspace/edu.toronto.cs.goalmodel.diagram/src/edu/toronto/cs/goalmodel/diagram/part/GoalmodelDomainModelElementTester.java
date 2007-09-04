package edu.toronto.cs.goalmodel.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import edu.toronto.cs.goalmodel.GoalmodelPackage;

/**
 * @generated
 */
public class GoalmodelDomainModelElementTester extends PropertyTester {

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
		if (eClass == GoalmodelPackage.eINSTANCE.getActor()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getAgent()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getAndDecomposition()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getAspect()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getBreakContribution()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getConflictLabel()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getContribution()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getDecomposition()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getDeniedLabel()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getDependency()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getGoal()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getHelpContribution()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getHurtContribution()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getIntention()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getMakeContribution()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getModel()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getOrDecomposition()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getPartiallyDeniedLabel()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getPartiallySatisfiedLabel()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getPosition()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getProperty()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getResource()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getRole()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getSatisfiedLabel()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getSoftgoal()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getTask()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getTopic()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getUnknownLabel()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getTruthLabel()) {
			return true;
		}
		if (eClass == GoalmodelPackage.eINSTANCE.getContainer()) {
			return true;
		}
		return false;
	}

}
