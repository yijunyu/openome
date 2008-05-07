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
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Aspect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectItemProvider aspectItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Aspect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAspectAdapter() {
		if (aspectItemProvider == null) {
			aspectItemProvider = new AspectItemProvider(this);
		}

		return aspectItemProvider;
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
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.ConflictLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictLabelItemProvider conflictLabelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.ConflictLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConflictLabelAdapter() {
		if (conflictLabelItemProvider == null) {
			conflictLabelItemProvider = new ConflictLabelItemProvider(this);
		}

		return conflictLabelItemProvider;
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
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.DeniedLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeniedLabelItemProvider deniedLabelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.DeniedLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeniedLabelAdapter() {
		if (deniedLabelItemProvider == null) {
			deniedLabelItemProvider = new DeniedLabelItemProvider(this);
		}

		return deniedLabelItemProvider;
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
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.PartiallyDeniedLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartiallyDeniedLabelItemProvider partiallyDeniedLabelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.PartiallyDeniedLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartiallyDeniedLabelAdapter() {
		if (partiallyDeniedLabelItemProvider == null) {
			partiallyDeniedLabelItemProvider = new PartiallyDeniedLabelItemProvider(this);
		}

		return partiallyDeniedLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.PartiallySatisfiedLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartiallySatisfiedLabelItemProvider partiallySatisfiedLabelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.PartiallySatisfiedLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartiallySatisfiedLabelAdapter() {
		if (partiallySatisfiedLabelItemProvider == null) {
			partiallySatisfiedLabelItemProvider = new PartiallySatisfiedLabelItemProvider(this);
		}

		return partiallySatisfiedLabelItemProvider;
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
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.SatisfiedLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfiedLabelItemProvider satisfiedLabelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.SatisfiedLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSatisfiedLabelAdapter() {
		if (satisfiedLabelItemProvider == null) {
			satisfiedLabelItemProvider = new SatisfiedLabelItemProvider(this);
		}

		return satisfiedLabelItemProvider;
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
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Topic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicItemProvider topicItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopicAdapter() {
		if (topicItemProvider == null) {
			topicItemProvider = new TopicItemProvider(this);
		}

		return topicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.UnknownLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownLabelItemProvider unknownLabelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.UnknownLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnknownLabelAdapter() {
		if (unknownLabelItemProvider == null) {
			unknownLabelItemProvider = new UnknownLabelItemProvider(this);
		}

		return unknownLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.TruthLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TruthLabelItemProvider truthLabelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.TruthLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTruthLabelAdapter() {
		if (truthLabelItemProvider == null) {
			truthLabelItemProvider = new TruthLabelItemProvider(this);
		}

		return truthLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.openome_model.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.openome_model.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
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
		if (aspectItemProvider != null) aspectItemProvider.dispose();
		if (breakContributionItemProvider != null) breakContributionItemProvider.dispose();
		if (conflictLabelItemProvider != null) conflictLabelItemProvider.dispose();
		if (contributionItemProvider != null) contributionItemProvider.dispose();
		if (decompositionItemProvider != null) decompositionItemProvider.dispose();
		if (deniedLabelItemProvider != null) deniedLabelItemProvider.dispose();
		if (dependencyItemProvider != null) dependencyItemProvider.dispose();
		if (goalItemProvider != null) goalItemProvider.dispose();
		if (helpContributionItemProvider != null) helpContributionItemProvider.dispose();
		if (hurtContributionItemProvider != null) hurtContributionItemProvider.dispose();
		if (intentionItemProvider != null) intentionItemProvider.dispose();
		if (makeContributionItemProvider != null) makeContributionItemProvider.dispose();
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (orDecompositionItemProvider != null) orDecompositionItemProvider.dispose();
		if (partiallyDeniedLabelItemProvider != null) partiallyDeniedLabelItemProvider.dispose();
		if (partiallySatisfiedLabelItemProvider != null) partiallySatisfiedLabelItemProvider.dispose();
		if (positionItemProvider != null) positionItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (satisfiedLabelItemProvider != null) satisfiedLabelItemProvider.dispose();
		if (softgoalItemProvider != null) softgoalItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (topicItemProvider != null) topicItemProvider.dispose();
		if (unknownLabelItemProvider != null) unknownLabelItemProvider.dispose();
		if (truthLabelItemProvider != null) truthLabelItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
	}

}
