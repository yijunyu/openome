package MyEditor.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class MyeditorPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				MyEditor.diagram.part.Messages.Default1Group_title);
		paletteContainer
				.setDescription(MyEditor.diagram.part.Messages.Default1Group_desc);
		paletteContainer.add(createBox1CreationTool());
		paletteContainer.add(createLine2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBox1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MyEditor.diagram.providers.MyeditorElementTypes.Box_1001);
		NodeToolEntry entry = new NodeToolEntry(
				MyEditor.diagram.part.Messages.Box1CreationTool_title,
				MyEditor.diagram.part.Messages.Box1CreationTool_desc, types);
		entry
				.setSmallIcon(MyEditor.diagram.providers.MyeditorElementTypes
						.getImageDescriptor(MyEditor.diagram.providers.MyeditorElementTypes.Box_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MyEditor.diagram.providers.MyeditorElementTypes.Line_3001);
		LinkToolEntry entry = new LinkToolEntry(
				MyEditor.diagram.part.Messages.Line2CreationTool_title,
				MyEditor.diagram.part.Messages.Line2CreationTool_desc, types);
		entry
				.setSmallIcon(MyEditor.diagram.providers.MyeditorElementTypes
						.getImageDescriptor(MyEditor.diagram.providers.MyeditorElementTypes.Line_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
