package edu.toronto.cs.goalmodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.diagram.part.GoalmodelDiagramEditorPlugin;

/**
 * @generated
 */
public class GoalmodelElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private GoalmodelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			element = ((EStructuralFeature) element).getEContainingClass();
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GoalmodelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Model_79, GoalmodelPackage.eINSTANCE.getModel());

			elements.put(Actor_1001, GoalmodelPackage.eINSTANCE.getActor());

			elements.put(Agent_1002, GoalmodelPackage.eINSTANCE.getAgent());

			elements.put(Position_1003, GoalmodelPackage.eINSTANCE
					.getPosition());

			elements.put(Role_1004, GoalmodelPackage.eINSTANCE.getRole());

			elements.put(Aspect_1005, GoalmodelPackage.eINSTANCE.getAspect());

			elements.put(Goal_1006, GoalmodelPackage.eINSTANCE.getGoal());

			elements.put(Softgoal_1007, GoalmodelPackage.eINSTANCE
					.getSoftgoal());

			elements.put(Task_1008, GoalmodelPackage.eINSTANCE.getTask());

			elements.put(Resource_1009, GoalmodelPackage.eINSTANCE
					.getResource());

			elements.put(Goal_2001, GoalmodelPackage.eINSTANCE.getGoal());

			elements.put(Softgoal_2002, GoalmodelPackage.eINSTANCE
					.getSoftgoal());

			elements.put(Resource_2003, GoalmodelPackage.eINSTANCE
					.getResource());

			elements.put(Task_2004, GoalmodelPackage.eINSTANCE.getTask());

			elements.put(Goal_2005, GoalmodelPackage.eINSTANCE.getGoal());

			elements.put(Softgoal_2006, GoalmodelPackage.eINSTANCE
					.getSoftgoal());

			elements.put(Resource_2007, GoalmodelPackage.eINSTANCE
					.getResource());

			elements.put(Task_2008, GoalmodelPackage.eINSTANCE.getTask());

			elements.put(Goal_2009, GoalmodelPackage.eINSTANCE.getGoal());

			elements.put(Softgoal_2010, GoalmodelPackage.eINSTANCE
					.getSoftgoal());

			elements.put(Resource_2011, GoalmodelPackage.eINSTANCE
					.getResource());

			elements.put(Task_2012, GoalmodelPackage.eINSTANCE.getTask());

			elements.put(Goal_2013, GoalmodelPackage.eINSTANCE.getGoal());

			elements.put(Softgoal_2014, GoalmodelPackage.eINSTANCE
					.getSoftgoal());

			elements.put(Resource_2015, GoalmodelPackage.eINSTANCE
					.getResource());

			elements.put(Task_2016, GoalmodelPackage.eINSTANCE.getTask());

			elements.put(Goal_2017, GoalmodelPackage.eINSTANCE.getGoal());

			elements.put(Softgoal_2018, GoalmodelPackage.eINSTANCE
					.getSoftgoal());

			elements.put(Resource_2019, GoalmodelPackage.eINSTANCE
					.getResource());

			elements.put(Task_2020, GoalmodelPackage.eINSTANCE.getTask());

			elements.put(Dependency_3001, GoalmodelPackage.eINSTANCE
					.getDependency());

			elements.put(AndDecomposition_3002, GoalmodelPackage.eINSTANCE
					.getAndDecomposition());

			elements.put(OrDecomposition_3003, GoalmodelPackage.eINSTANCE
					.getOrDecomposition());

			elements.put(MakeContribution_3004, GoalmodelPackage.eINSTANCE
					.getMakeContribution());

			elements.put(HelpContribution_3005, GoalmodelPackage.eINSTANCE
					.getHelpContribution());

			elements.put(HurtContribution_3006, GoalmodelPackage.eINSTANCE
					.getHurtContribution());

			elements.put(BreakContribution_3007, GoalmodelPackage.eINSTANCE
					.getBreakContribution());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType Model_79 = getElementType("edu.toronto.cs.goalmodel.diagram.Model_79"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Actor_1001 = getElementType("edu.toronto.cs.goalmodel.diagram.Actor_1001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Agent_1002 = getElementType("edu.toronto.cs.goalmodel.diagram.Agent_1002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Position_1003 = getElementType("edu.toronto.cs.goalmodel.diagram.Position_1003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Role_1004 = getElementType("edu.toronto.cs.goalmodel.diagram.Role_1004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Aspect_1005 = getElementType("edu.toronto.cs.goalmodel.diagram.Aspect_1005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_1006 = getElementType("edu.toronto.cs.goalmodel.diagram.Goal_1006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_1007 = getElementType("edu.toronto.cs.goalmodel.diagram.Softgoal_1007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_1008 = getElementType("edu.toronto.cs.goalmodel.diagram.Task_1008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_1009 = getElementType("edu.toronto.cs.goalmodel.diagram.Resource_1009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_2001 = getElementType("edu.toronto.cs.goalmodel.diagram.Goal_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_2002 = getElementType("edu.toronto.cs.goalmodel.diagram.Softgoal_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_2003 = getElementType("edu.toronto.cs.goalmodel.diagram.Resource_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_2004 = getElementType("edu.toronto.cs.goalmodel.diagram.Task_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_2005 = getElementType("edu.toronto.cs.goalmodel.diagram.Goal_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_2006 = getElementType("edu.toronto.cs.goalmodel.diagram.Softgoal_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_2007 = getElementType("edu.toronto.cs.goalmodel.diagram.Resource_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_2008 = getElementType("edu.toronto.cs.goalmodel.diagram.Task_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_2009 = getElementType("edu.toronto.cs.goalmodel.diagram.Goal_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_2010 = getElementType("edu.toronto.cs.goalmodel.diagram.Softgoal_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_2011 = getElementType("edu.toronto.cs.goalmodel.diagram.Resource_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_2012 = getElementType("edu.toronto.cs.goalmodel.diagram.Task_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_2013 = getElementType("edu.toronto.cs.goalmodel.diagram.Goal_2013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_2014 = getElementType("edu.toronto.cs.goalmodel.diagram.Softgoal_2014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_2015 = getElementType("edu.toronto.cs.goalmodel.diagram.Resource_2015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_2016 = getElementType("edu.toronto.cs.goalmodel.diagram.Task_2016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_2017 = getElementType("edu.toronto.cs.goalmodel.diagram.Goal_2017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_2018 = getElementType("edu.toronto.cs.goalmodel.diagram.Softgoal_2018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_2019 = getElementType("edu.toronto.cs.goalmodel.diagram.Resource_2019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_2020 = getElementType("edu.toronto.cs.goalmodel.diagram.Task_2020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dependency_3001 = getElementType("edu.toronto.cs.goalmodel.diagram.Dependency_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AndDecomposition_3002 = getElementType("edu.toronto.cs.goalmodel.diagram.AndDecomposition_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OrDecomposition_3003 = getElementType("edu.toronto.cs.goalmodel.diagram.OrDecomposition_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MakeContribution_3004 = getElementType("edu.toronto.cs.goalmodel.diagram.MakeContribution_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HelpContribution_3005 = getElementType("edu.toronto.cs.goalmodel.diagram.HelpContribution_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HurtContribution_3006 = getElementType("edu.toronto.cs.goalmodel.diagram.HurtContribution_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BreakContribution_3007 = getElementType("edu.toronto.cs.goalmodel.diagram.BreakContribution_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Model_79);
			KNOWN_ELEMENT_TYPES.add(Actor_1001);
			KNOWN_ELEMENT_TYPES.add(Agent_1002);
			KNOWN_ELEMENT_TYPES.add(Position_1003);
			KNOWN_ELEMENT_TYPES.add(Role_1004);
			KNOWN_ELEMENT_TYPES.add(Aspect_1005);
			KNOWN_ELEMENT_TYPES.add(Goal_1006);
			KNOWN_ELEMENT_TYPES.add(Softgoal_1007);
			KNOWN_ELEMENT_TYPES.add(Task_1008);
			KNOWN_ELEMENT_TYPES.add(Resource_1009);
			KNOWN_ELEMENT_TYPES.add(Goal_2001);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2002);
			KNOWN_ELEMENT_TYPES.add(Resource_2003);
			KNOWN_ELEMENT_TYPES.add(Task_2004);
			KNOWN_ELEMENT_TYPES.add(Goal_2005);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2006);
			KNOWN_ELEMENT_TYPES.add(Resource_2007);
			KNOWN_ELEMENT_TYPES.add(Task_2008);
			KNOWN_ELEMENT_TYPES.add(Goal_2009);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2010);
			KNOWN_ELEMENT_TYPES.add(Resource_2011);
			KNOWN_ELEMENT_TYPES.add(Task_2012);
			KNOWN_ELEMENT_TYPES.add(Goal_2013);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2014);
			KNOWN_ELEMENT_TYPES.add(Resource_2015);
			KNOWN_ELEMENT_TYPES.add(Task_2016);
			KNOWN_ELEMENT_TYPES.add(Goal_2017);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2018);
			KNOWN_ELEMENT_TYPES.add(Resource_2019);
			KNOWN_ELEMENT_TYPES.add(Task_2020);
			KNOWN_ELEMENT_TYPES.add(Dependency_3001);
			KNOWN_ELEMENT_TYPES.add(AndDecomposition_3002);
			KNOWN_ELEMENT_TYPES.add(OrDecomposition_3003);
			KNOWN_ELEMENT_TYPES.add(MakeContribution_3004);
			KNOWN_ELEMENT_TYPES.add(HelpContribution_3005);
			KNOWN_ELEMENT_TYPES.add(HurtContribution_3006);
			KNOWN_ELEMENT_TYPES.add(BreakContribution_3007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
