/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.provider;

import edu.toronto.cs.openome_model.util.openome_modelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class openome_modelItemProviderAdapterFactory extends openome_modelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public openome_modelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Actor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorItemProvider actorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorAdapter() {
		if (actorItemProvider == null) {
			actorItemProvider = new ActorItemProvider(this);
		}

		return actorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Agent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentItemProvider agentItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgentAdapter() {
		if (agentItemProvider == null) {
			agentItemProvider = new AgentItemProvider(this);
		}

		return agentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.AndDecomposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndDecompositionItemProvider andDecompositionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.AndDecomposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndDecompositionAdapter() {
		if (andDecompositionItemProvider == null) {
			andDecompositionItemProvider = new AndDecompositionItemProvider(this);
		}

		return andDecompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Contribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionItemProvider contributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Contribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContributionAdapter() {
		if (contributionItemProvider == null) {
			contributionItemProvider = new ContributionItemProvider(this);
		}

		return contributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Decomposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecompositionItemProvider decompositionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Decomposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecompositionAdapter() {
		if (decompositionItemProvider == null) {
			decompositionItemProvider = new DecompositionItemProvider(this);
		}

		return decompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Dependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyItemProvider dependencyItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Goal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalItemProvider goalItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalAdapter() {
		if (goalItemProvider == null) {
			goalItemProvider = new GoalItemProvider(this);
		}

		return goalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Intention} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentionItemProvider intentionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Intention}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntentionAdapter() {
		if (intentionItemProvider == null) {
			intentionItemProvider = new IntentionItemProvider(this);
		}

		return intentionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.OrDecomposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrDecompositionItemProvider orDecompositionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.OrDecomposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrDecompositionAdapter() {
		if (orDecompositionItemProvider == null) {
			orDecompositionItemProvider = new OrDecompositionItemProvider(this);
		}

		return orDecompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Position} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionItemProvider positionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPositionAdapter() {
		if (positionItemProvider == null) {
			positionItemProvider = new PositionItemProvider(this);
		}

		return positionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Softgoal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftgoalItemProvider softgoalItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Softgoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftgoalAdapter() {
		if (softgoalItemProvider == null) {
			softgoalItemProvider = new SoftgoalItemProvider(this);
		}

		return softgoalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Belief} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeliefItemProvider beliefItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Belief}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBeliefAdapter() {
		if (beliefItemProvider == null) {
			beliefItemProvider = new BeliefItemProvider(this);
		}

		return beliefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Correlation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationItemProvider correlationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Correlation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCorrelationAdapter() {
		if (correlationItemProvider == null) {
			correlationItemProvider = new CorrelationItemProvider(this);
		}

		return correlationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.HelpContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelpContributionItemProvider helpContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.HelpContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHelpContributionAdapter() {
		if (helpContributionItemProvider == null) {
			helpContributionItemProvider = new HelpContributionItemProvider(this);
		}

		return helpContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.HurtContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HurtContributionItemProvider hurtContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.HurtContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHurtContributionAdapter() {
		if (hurtContributionItemProvider == null) {
			hurtContributionItemProvider = new HurtContributionItemProvider(this);
		}

		return hurtContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.MakeContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakeContributionItemProvider makeContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.MakeContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMakeContributionAdapter() {
		if (makeContributionItemProvider == null) {
			makeContributionItemProvider = new MakeContributionItemProvider(this);
		}

		return makeContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.BreakContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakContributionItemProvider breakContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.BreakContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBreakContributionAdapter() {
		if (breakContributionItemProvider == null) {
			breakContributionItemProvider = new BreakContributionItemProvider(this);
		}

		return breakContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.SomePlusContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SomePlusContributionItemProvider somePlusContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.SomePlusContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSomePlusContributionAdapter() {
		if (somePlusContributionItemProvider == null) {
			somePlusContributionItemProvider = new SomePlusContributionItemProvider(this);
		}

		return somePlusContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.SomeMinusContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SomeMinusContributionItemProvider someMinusContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.SomeMinusContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSomeMinusContributionAdapter() {
		if (someMinusContributionItemProvider == null) {
			someMinusContributionItemProvider = new SomeMinusContributionItemProvider(this);
		}

		return someMinusContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.UnknownContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownContributionItemProvider unknownContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.UnknownContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnknownContributionAdapter() {
		if (unknownContributionItemProvider == null) {
			unknownContributionItemProvider = new UnknownContributionItemProvider(this);
		}

		return unknownContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.AndContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndContributionItemProvider andContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.AndContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndContributionAdapter() {
		if (andContributionItemProvider == null) {
			andContributionItemProvider = new AndContributionItemProvider(this);
		}

		return andContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.OrContribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrContributionItemProvider orContributionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.OrContribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrContributionAdapter() {
		if (orContributionItemProvider == null) {
			orContributionItemProvider = new OrContributionItemProvider(this);
		}

		return orContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.IsAAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsAAssociationItemProvider isAAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.IsAAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsAAssociationAdapter() {
		if (isAAssociationItemProvider == null) {
			isAAssociationItemProvider = new IsAAssociationItemProvider(this);
		}

		return isAAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.CoversAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoversAssociationItemProvider coversAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.CoversAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoversAssociationAdapter() {
		if (coversAssociationItemProvider == null) {
			coversAssociationItemProvider = new CoversAssociationItemProvider(this);
		}

		return coversAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.IsPartofAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsPartofAssociationItemProvider isPartofAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.IsPartofAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsPartofAssociationAdapter() {
		if (isPartofAssociationItemProvider == null) {
			isPartofAssociationItemProvider = new IsPartofAssociationItemProvider(this);
		}

		return isPartofAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.OccupiesAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccupiesAssociationItemProvider occupiesAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.OccupiesAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOccupiesAssociationAdapter() {
		if (occupiesAssociationItemProvider == null) {
			occupiesAssociationItemProvider = new OccupiesAssociationItemProvider(this);
		}

		return occupiesAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.PlaysAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaysAssociationItemProvider playsAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.PlaysAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlaysAssociationAdapter() {
		if (playsAssociationItemProvider == null) {
			playsAssociationItemProvider = new PlaysAssociationItemProvider(this);
		}

		return playsAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.INSAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INSAssociationItemProvider insAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.INSAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createINSAssociationAdapter() {
		if (insAssociationItemProvider == null) {
			insAssociationItemProvider = new INSAssociationItemProvider(this);
		}

		return insAssociationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (actorItemProvider != null) actorItemProvider.dispose();
		if (agentItemProvider != null) agentItemProvider.dispose();
		if (andDecompositionItemProvider != null) andDecompositionItemProvider.dispose();
		if (contributionItemProvider != null) contributionItemProvider.dispose();
		if (decompositionItemProvider != null) decompositionItemProvider.dispose();
		if (dependencyItemProvider != null) dependencyItemProvider.dispose();
		if (goalItemProvider != null) goalItemProvider.dispose();
		if (intentionItemProvider != null) intentionItemProvider.dispose();
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (orDecompositionItemProvider != null) orDecompositionItemProvider.dispose();
		if (positionItemProvider != null) positionItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (softgoalItemProvider != null) softgoalItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (beliefItemProvider != null) beliefItemProvider.dispose();
		if (correlationItemProvider != null) correlationItemProvider.dispose();
		if (helpContributionItemProvider != null) helpContributionItemProvider.dispose();
		if (hurtContributionItemProvider != null) hurtContributionItemProvider.dispose();
		if (makeContributionItemProvider != null) makeContributionItemProvider.dispose();
		if (breakContributionItemProvider != null) breakContributionItemProvider.dispose();
		if (somePlusContributionItemProvider != null) somePlusContributionItemProvider.dispose();
		if (someMinusContributionItemProvider != null) someMinusContributionItemProvider.dispose();
		if (unknownContributionItemProvider != null) unknownContributionItemProvider.dispose();
		if (andContributionItemProvider != null) andContributionItemProvider.dispose();
		if (orContributionItemProvider != null) orContributionItemProvider.dispose();
		if (associationItemProvider != null) associationItemProvider.dispose();
		if (isAAssociationItemProvider != null) isAAssociationItemProvider.dispose();
		if (coversAssociationItemProvider != null) coversAssociationItemProvider.dispose();
		if (isPartofAssociationItemProvider != null) isPartofAssociationItemProvider.dispose();
		if (occupiesAssociationItemProvider != null) occupiesAssociationItemProvider.dispose();
		if (playsAssociationItemProvider != null) playsAssociationItemProvider.dispose();
		if (insAssociationItemProvider != null) insAssociationItemProvider.dispose();
	}

}
