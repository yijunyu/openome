package MyEditor.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MyeditorNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MyEditor.diagram.part.MyeditorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MyEditor.diagram.part.MyeditorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MyEditor.diagram.navigator.MyeditorNavigatorItem
				&& !isOwnView(((MyEditor.diagram.navigator.MyeditorNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MyEditor.diagram.navigator.MyeditorNavigatorGroup) {
			MyEditor.diagram.navigator.MyeditorNavigatorGroup group = (MyEditor.diagram.navigator.MyeditorNavigatorGroup) element;
			return MyEditor.diagram.part.MyeditorDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MyEditor.diagram.navigator.MyeditorNavigatorItem) {
			MyEditor.diagram.navigator.MyeditorNavigatorItem navigatorItem = (MyEditor.diagram.navigator.MyeditorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MyEditor.diagram.part.MyeditorVisualIDRegistry
				.getVisualID(view)) {
		case MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?MyEditor?MyCanvas", MyEditor.diagram.providers.MyeditorElementTypes.MyCanvas_79); //$NON-NLS-1$
		case MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MyEditor?Box", MyEditor.diagram.providers.MyeditorElementTypes.Box_1001); //$NON-NLS-1$
		case MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?MyEditor?Line", MyEditor.diagram.providers.MyeditorElementTypes.Line_3001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MyEditor.diagram.part.MyeditorDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& MyEditor.diagram.providers.MyeditorElementTypes
						.isKnownElementType(elementType)) {
			image = MyEditor.diagram.providers.MyeditorElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MyEditor.diagram.navigator.MyeditorNavigatorGroup) {
			MyEditor.diagram.navigator.MyeditorNavigatorGroup group = (MyEditor.diagram.navigator.MyeditorNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MyEditor.diagram.navigator.MyeditorNavigatorItem) {
			MyEditor.diagram.navigator.MyeditorNavigatorItem navigatorItem = (MyEditor.diagram.navigator.MyeditorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MyEditor.diagram.part.MyeditorVisualIDRegistry
				.getVisualID(view)) {
		case MyEditor.diagram.edit.parts.MyCanvasEditPart.VISUAL_ID:
			return getMyCanvas_79Text(view);
		case MyEditor.diagram.edit.parts.BoxEditPart.VISUAL_ID:
			return getBox_1001Text(view);
		case MyEditor.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMyCanvas_79Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBox_1001Text(View view) {
		IAdaptable hintAdapter = new MyEditor.diagram.providers.MyeditorParserProvider.HintAdapter(
				MyEditor.diagram.providers.MyeditorElementTypes.Box_1001,
				(view.getElement() != null ? view.getElement() : view),
				MyEditor.diagram.part.MyeditorVisualIDRegistry
						.getType(MyEditor.diagram.edit.parts.BoxNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			MyEditor.diagram.part.MyeditorDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getLine_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MyEditor.diagram.edit.parts.MyCanvasEditPart.MODEL_ID
				.equals(MyEditor.diagram.part.MyeditorVisualIDRegistry
						.getModelID(view));
	}

}
