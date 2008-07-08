package edu.toronto.cs.openome_model.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Openome_modelElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private Openome_modelElementTypes() {
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
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Model_1000 = getElementType("edu.toronto.cs.openome_model.diagram.Model_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Actor_2001 = getElementType("edu.toronto.cs.openome_model.diagram.Actor_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Agent_2002 = getElementType("edu.toronto.cs.openome_model.diagram.Agent_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Position_2003 = getElementType("edu.toronto.cs.openome_model.diagram.Position_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Role_2004 = getElementType("edu.toronto.cs.openome_model.diagram.Role_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_2005 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Softgoal_2006 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Task_2007 = getElementType("edu.toronto.cs.openome_model.diagram.Task_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_2008 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_3001 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_3002 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_3003 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_3004 = getElementType("edu.toronto.cs.openome_model.diagram.Task_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_3005 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_3006 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_3007 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_3008 = getElementType("edu.toronto.cs.openome_model.diagram.Task_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_3009 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_3010 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_3011 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_3012 = getElementType("edu.toronto.cs.openome_model.diagram.Task_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_3013 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_3014 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_3015 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Task_3016 = getElementType("edu.toronto.cs.openome_model.diagram.Task_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dependency_4001 = getElementType("edu.toronto.cs.openome_model.diagram.Dependency_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dependency_4002 = getElementType("edu.toronto.cs.openome_model.diagram.Dependency_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AndDecomposition_4003 = getElementType("edu.toronto.cs.openome_model.diagram.AndDecomposition_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OrDecomposition_4004 = getElementType("edu.toronto.cs.openome_model.diagram.OrDecomposition_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Contribution_4005 = getElementType("edu.toronto.cs.openome_model.diagram.Contribution_4005"); //$NON-NLS-1$

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
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
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

			elements.put(Model_1000,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getModel());

			elements.put(Actor_2001,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getActor());

			elements.put(Agent_2002,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getAgent());

			elements.put(Position_2003,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getPosition());

			elements.put(Role_2004,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getRole());

			elements.put(Goal_2005,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_2006,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Task_2007,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Resource_2008,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Goal_3001,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_3002,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Resource_3003,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Task_3004,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Goal_3005,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_3006,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Resource_3007,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Task_3008,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Goal_3009,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_3010,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Resource_3011,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Task_3012,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Goal_3013,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_3014,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Resource_3015,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Task_3016,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Dependency_4001,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getDependency());

			elements.put(Dependency_4002,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getDependency());

			elements.put(AndDecomposition_4003,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getAndDecomposition());

			elements.put(OrDecomposition_4004,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getOrDecomposition());

			elements.put(Contribution_4005,
					edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getContribution());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(Actor_2001);
			KNOWN_ELEMENT_TYPES.add(Agent_2002);
			KNOWN_ELEMENT_TYPES.add(Position_2003);
			KNOWN_ELEMENT_TYPES.add(Role_2004);
			KNOWN_ELEMENT_TYPES.add(Goal_2005);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2006);
			KNOWN_ELEMENT_TYPES.add(Task_2007);
			KNOWN_ELEMENT_TYPES.add(Resource_2008);
			KNOWN_ELEMENT_TYPES.add(Goal_3001);
			KNOWN_ELEMENT_TYPES.add(Softgoal_3002);
			KNOWN_ELEMENT_TYPES.add(Resource_3003);
			KNOWN_ELEMENT_TYPES.add(Task_3004);
			KNOWN_ELEMENT_TYPES.add(Goal_3005);
			KNOWN_ELEMENT_TYPES.add(Softgoal_3006);
			KNOWN_ELEMENT_TYPES.add(Resource_3007);
			KNOWN_ELEMENT_TYPES.add(Task_3008);
			KNOWN_ELEMENT_TYPES.add(Goal_3009);
			KNOWN_ELEMENT_TYPES.add(Softgoal_3010);
			KNOWN_ELEMENT_TYPES.add(Resource_3011);
			KNOWN_ELEMENT_TYPES.add(Task_3012);
			KNOWN_ELEMENT_TYPES.add(Goal_3013);
			KNOWN_ELEMENT_TYPES.add(Softgoal_3014);
			KNOWN_ELEMENT_TYPES.add(Resource_3015);
			KNOWN_ELEMENT_TYPES.add(Task_3016);
			KNOWN_ELEMENT_TYPES.add(Dependency_4001);
			KNOWN_ELEMENT_TYPES.add(Dependency_4002);
			KNOWN_ELEMENT_TYPES.add(AndDecomposition_4003);
			KNOWN_ELEMENT_TYPES.add(OrDecomposition_4004);
			KNOWN_ELEMENT_TYPES.add(Contribution_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
