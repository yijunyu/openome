package MyEditor.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MyeditorVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "MyEditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MyEditor.diagram.edit.parts.MyCanvasEditPart.MODEL_ID
					.equals(view.getType())) {
				return MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return MyEditor.diagram.part.MyeditorVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MyEditor.diagram.part.MyeditorDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MyEditor.MyEditorPackage.eINSTANCE.getMyCanvas().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MyEditor.MyCanvas) domainElement)) {
			return MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = MyEditor.diagram.part.MyeditorVisualIDRegistry
				.getModelID(containerView);
		if (!MyEditor.diagram.edit.parts.MyCanvasEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MyEditor.diagram.edit.parts.MyCanvasEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = MyEditor.diagram.part.MyeditorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID:
			if (MyEditor.MyEditorPackage.eINSTANCE.getBox().isSuperTypeOf(
					domainElement.eClass())) {
				return MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = MyEditor.diagram.part.MyeditorVisualIDRegistry
				.getModelID(containerView);
		if (!MyEditor.diagram.edit.parts.MyCanvasEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MyEditor.diagram.edit.parts.MyCanvasEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = MyEditor.diagram.part.MyeditorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID:
			if (MyEditor.diagram.edit.parts.BoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID:
			if (MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MyEditor.MyEditorPackage.eINSTANCE.getLine().isSuperTypeOf(
				domainElement.eClass())) {
			return MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MyEditor.MyCanvas element) {
		return true;
	}

}
