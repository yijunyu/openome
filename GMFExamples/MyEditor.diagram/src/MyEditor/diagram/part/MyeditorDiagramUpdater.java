package MyEditor.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MyeditorDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (MyEditor.diagram.part.MyeditorVisualIDRegistry
				.getVisualID(view)) {
		case MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID:
			return getMyCanvas_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMyCanvas_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MyEditor.MyCanvas modelElement = (MyEditor.MyCanvas) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getBoxes().iterator(); it.hasNext();) {
			MyEditor.Box childElement = (MyEditor.Box) it.next();
			int visualID = MyEditor.diagram.part.MyeditorVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID) {
				result.add(new MyEditor.diagram.part.MyeditorNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (MyEditor.diagram.part.MyeditorVisualIDRegistry
				.getVisualID(view)) {
		case MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID:
			return getMyCanvas_79ContainedLinks(view);
		case MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID:
			return getBox_1001ContainedLinks(view);
		case MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_3001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (MyEditor.diagram.part.MyeditorVisualIDRegistry
				.getVisualID(view)) {
		case MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID:
			return getBox_1001IncomingLinks(view);
		case MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_3001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (MyEditor.diagram.part.MyeditorVisualIDRegistry
				.getVisualID(view)) {
		case MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID:
			return getBox_1001OutgoingLinks(view);
		case MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_3001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMyCanvas_79ContainedLinks(View view) {
		MyEditor.MyCanvas modelElement = (MyEditor.MyCanvas) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Line_3001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBox_1001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLine_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBox_1001IncomingLinks(View view) {
		MyEditor.Box modelElement = (MyEditor.Box) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Line_3001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLine_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBox_1001OutgoingLinks(View view) {
		MyEditor.Box modelElement = (MyEditor.Box) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Line_3001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLine_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Line_3001(
			MyEditor.MyCanvas container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getLines().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MyEditor.Line) {
				continue;
			}
			MyEditor.Line link = (MyEditor.Line) linkObject;
			if (MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID != MyEditor.diagram.part.MyeditorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MyEditor.Box dst = link.getTargetBox();
			MyEditor.Box src = link.getSourceBox();
			result.add(new MyEditor.diagram.part.MyeditorLinkDescriptor(src,
					dst, link,
					MyEditor.diagram.providers.MyeditorElementTypes.Line_3001,
					MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Line_3001(
			MyEditor.Box target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MyEditor.MyEditorPackage.eINSTANCE
					.getLine_TargetBox()
					|| false == setting.getEObject() instanceof MyEditor.Line) {
				continue;
			}
			MyEditor.Line link = (MyEditor.Line) setting.getEObject();
			if (MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID != MyEditor.diagram.part.MyeditorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MyEditor.Box src = link.getSourceBox();
			result.add(new MyEditor.diagram.part.MyeditorLinkDescriptor(src,
					target, link,
					MyEditor.diagram.providers.MyeditorElementTypes.Line_3001,
					MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Line_3001(
			MyEditor.Box source) {
		MyEditor.MyCanvas container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MyEditor.MyCanvas) {
				container = (MyEditor.MyCanvas) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getLines().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MyEditor.Line) {
				continue;
			}
			MyEditor.Line link = (MyEditor.Line) linkObject;
			if (MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID != MyEditor.diagram.part.MyeditorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MyEditor.Box dst = link.getTargetBox();
			MyEditor.Box src = link.getSourceBox();
			if (src != source) {
				continue;
			}
			result.add(new MyEditor.diagram.part.MyeditorLinkDescriptor(src,
					dst, link,
					MyEditor.diagram.providers.MyeditorElementTypes.Line_3001,
					MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID));
		}
		return result;
	}

}
