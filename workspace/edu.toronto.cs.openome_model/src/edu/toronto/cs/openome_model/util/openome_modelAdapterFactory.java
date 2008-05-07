/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.util;

import edu.toronto.cs.openome_model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.openome_model.openome_modelPackage
 * @generated
 */
public class openome_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static openome_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public openome_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = openome_modelPackage.eINSTANCE;
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
	@Override
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
	protected openome_modelSwitch<Adapter> modelSwitch =
		new openome_modelSwitch<Adapter>() {
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseAndDecomposition(AndDecomposition object) {
				return createAndDecompositionAdapter();
			}
			@Override
			public Adapter caseAspect(Aspect object) {
				return createAspectAdapter();
			}
			@Override
			public Adapter caseBreakContribution(BreakContribution object) {
				return createBreakContributionAdapter();
			}
			@Override
			public Adapter caseConflictLabel(ConflictLabel object) {
				return createConflictLabelAdapter();
			}
			@Override
			public Adapter caseContribution(Contribution object) {
				return createContributionAdapter();
			}
			@Override
			public Adapter caseDecomposition(Decomposition object) {
				return createDecompositionAdapter();
			}
			@Override
			public Adapter caseDeniedLabel(DeniedLabel object) {
				return createDeniedLabelAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseHelpContribution(HelpContribution object) {
				return createHelpContributionAdapter();
			}
			@Override
			public Adapter caseHurtContribution(HurtContribution object) {
				return createHurtContributionAdapter();
			}
			@Override
			public Adapter caseIntention(Intention object) {
				return createIntentionAdapter();
			}
			@Override
			public Adapter caseMakeContribution(MakeContribution object) {
				return createMakeContributionAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseOrDecomposition(OrDecomposition object) {
				return createOrDecompositionAdapter();
			}
			@Override
			public Adapter casePartiallyDeniedLabel(PartiallyDeniedLabel object) {
				return createPartiallyDeniedLabelAdapter();
			}
			@Override
			public Adapter casePartiallySatisfiedLabel(PartiallySatisfiedLabel object) {
				return createPartiallySatisfiedLabelAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseSatisfiedLabel(SatisfiedLabel object) {
				return createSatisfiedLabelAdapter();
			}
			@Override
			public Adapter caseSoftgoal(Softgoal object) {
				return createSoftgoalAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTopic(Topic object) {
				return createTopicAdapter();
			}
			@Override
			public Adapter caseUnknownLabel(UnknownLabel object) {
				return createUnknownLabelAdapter();
			}
			@Override
			public Adapter caseTruthLabel(TruthLabel object) {
				return createTruthLabelAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.AndDecomposition <em>And Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.AndDecomposition
	 * @generated
	 */
	public Adapter createAndDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.BreakContribution <em>Break Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.BreakContribution
	 * @generated
	 */
	public Adapter createBreakContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.ConflictLabel <em>Conflict Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.ConflictLabel
	 * @generated
	 */
	public Adapter createConflictLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Decomposition
	 * @generated
	 */
	public Adapter createDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.DeniedLabel <em>Denied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.DeniedLabel
	 * @generated
	 */
	public Adapter createDeniedLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.HelpContribution <em>Help Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.HelpContribution
	 * @generated
	 */
	public Adapter createHelpContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.HurtContribution <em>Hurt Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.HurtContribution
	 * @generated
	 */
	public Adapter createHurtContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Intention <em>Intention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Intention
	 * @generated
	 */
	public Adapter createIntentionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.MakeContribution <em>Make Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.MakeContribution
	 * @generated
	 */
	public Adapter createMakeContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.OrDecomposition <em>Or Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.OrDecomposition
	 * @generated
	 */
	public Adapter createOrDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.PartiallyDeniedLabel <em>Partially Denied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.PartiallyDeniedLabel
	 * @generated
	 */
	public Adapter createPartiallyDeniedLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.PartiallySatisfiedLabel <em>Partially Satisfied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.PartiallySatisfiedLabel
	 * @generated
	 */
	public Adapter createPartiallySatisfiedLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.SatisfiedLabel <em>Satisfied Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.SatisfiedLabel
	 * @generated
	 */
	public Adapter createSatisfiedLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Softgoal
	 * @generated
	 */
	public Adapter createSoftgoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Topic
	 * @generated
	 */
	public Adapter createTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.UnknownLabel <em>Unknown Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.UnknownLabel
	 * @generated
	 */
	public Adapter createUnknownLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.TruthLabel <em>Truth Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.TruthLabel
	 * @generated
	 */
	public Adapter createTruthLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.toronto.cs.openome_model.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.toronto.cs.openome_model.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
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

} //openome_modelAdapterFactory
