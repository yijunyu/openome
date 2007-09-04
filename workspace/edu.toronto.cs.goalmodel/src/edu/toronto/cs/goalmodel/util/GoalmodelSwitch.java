/**
 * Copyright University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.goalmodel.util;

import edu.toronto.cs.goalmodel.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.goalmodel.GoalmodelPackage
 * @generated
 */
public class GoalmodelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GoalmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = GoalmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GoalmodelPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				Object result = caseActor(actor);
				if (result == null) result = caseContainer(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				Object result = caseAgent(agent);
				if (result == null) result = caseContainer(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.AND_DECOMPOSITION: {
				AndDecomposition andDecomposition = (AndDecomposition)theEObject;
				Object result = caseAndDecomposition(andDecomposition);
				if (result == null) result = caseDecomposition(andDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.ASPECT: {
				Aspect aspect = (Aspect)theEObject;
				Object result = caseAspect(aspect);
				if (result == null) result = caseContainer(aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.BREAK_CONTRIBUTION: {
				BreakContribution breakContribution = (BreakContribution)theEObject;
				Object result = caseBreakContribution(breakContribution);
				if (result == null) result = caseContribution(breakContribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.CONFLICT_LABEL: {
				ConflictLabel conflictLabel = (ConflictLabel)theEObject;
				Object result = caseConflictLabel(conflictLabel);
				if (result == null) result = caseTruthLabel(conflictLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				Object result = caseContribution(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.DECOMPOSITION: {
				Decomposition decomposition = (Decomposition)theEObject;
				Object result = caseDecomposition(decomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.DENIED_LABEL: {
				DeniedLabel deniedLabel = (DeniedLabel)theEObject;
				Object result = caseDeniedLabel(deniedLabel);
				if (result == null) result = caseTruthLabel(deniedLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				Object result = caseDependency(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				Object result = caseGoal(goal);
				if (result == null) result = caseIntention(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.HELP_CONTRIBUTION: {
				HelpContribution helpContribution = (HelpContribution)theEObject;
				Object result = caseHelpContribution(helpContribution);
				if (result == null) result = caseContribution(helpContribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.HURT_CONTRIBUTION: {
				HurtContribution hurtContribution = (HurtContribution)theEObject;
				Object result = caseHurtContribution(hurtContribution);
				if (result == null) result = caseContribution(hurtContribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.INTENTION: {
				Intention intention = (Intention)theEObject;
				Object result = caseIntention(intention);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.MAKE_CONTRIBUTION: {
				MakeContribution makeContribution = (MakeContribution)theEObject;
				Object result = caseMakeContribution(makeContribution);
				if (result == null) result = caseContribution(makeContribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.MODEL: {
				Model model = (Model)theEObject;
				Object result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.OR_DECOMPOSITION: {
				OrDecomposition orDecomposition = (OrDecomposition)theEObject;
				Object result = caseOrDecomposition(orDecomposition);
				if (result == null) result = caseDecomposition(orDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.PARTIALLY_DENIED_LABEL: {
				PartiallyDeniedLabel partiallyDeniedLabel = (PartiallyDeniedLabel)theEObject;
				Object result = casePartiallyDeniedLabel(partiallyDeniedLabel);
				if (result == null) result = caseTruthLabel(partiallyDeniedLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.PARTIALLY_SATISFIED_LABEL: {
				PartiallySatisfiedLabel partiallySatisfiedLabel = (PartiallySatisfiedLabel)theEObject;
				Object result = casePartiallySatisfiedLabel(partiallySatisfiedLabel);
				if (result == null) result = caseTruthLabel(partiallySatisfiedLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.POSITION: {
				Position position = (Position)theEObject;
				Object result = casePosition(position);
				if (result == null) result = caseContainer(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				Object result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				Object result = caseResource(resource);
				if (result == null) result = caseIntention(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.ROLE: {
				Role role = (Role)theEObject;
				Object result = caseRole(role);
				if (result == null) result = caseContainer(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.SATISFIED_LABEL: {
				SatisfiedLabel satisfiedLabel = (SatisfiedLabel)theEObject;
				Object result = caseSatisfiedLabel(satisfiedLabel);
				if (result == null) result = caseTruthLabel(satisfiedLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.SOFTGOAL: {
				Softgoal softgoal = (Softgoal)theEObject;
				Object result = caseSoftgoal(softgoal);
				if (result == null) result = caseIntention(softgoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.TASK: {
				Task task = (Task)theEObject;
				Object result = caseTask(task);
				if (result == null) result = caseIntention(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.TOPIC: {
				Topic topic = (Topic)theEObject;
				Object result = caseTopic(topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.UNKNOWN_LABEL: {
				UnknownLabel unknownLabel = (UnknownLabel)theEObject;
				Object result = caseUnknownLabel(unknownLabel);
				if (result == null) result = caseTruthLabel(unknownLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.TRUTH_LABEL: {
				TruthLabel truthLabel = (TruthLabel)theEObject;
				Object result = caseTruthLabel(truthLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GoalmodelPackage.CONTAINER: {
				Container container = (Container)theEObject;
				Object result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAndDecomposition(AndDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBreakContribution(BreakContribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConflictLabel(ConflictLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Denied Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Denied Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeniedLabel(DeniedLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Help Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Help Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHelpContribution(HelpContribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hurt Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hurt Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHurtContribution(HurtContribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntention(Intention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMakeContribution(MakeContribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrDecomposition(OrDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partially Denied Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partially Denied Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePartiallyDeniedLabel(PartiallyDeniedLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partially Satisfied Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partially Satisfied Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePartiallySatisfiedLabel(PartiallySatisfiedLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfied Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfied Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSatisfiedLabel(SatisfiedLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Softgoal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSoftgoal(Softgoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnknownLabel(UnknownLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truth Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truth Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTruthLabel(TruthLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //GoalmodelSwitch
