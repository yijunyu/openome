package edu.toronto.cs.openome_model.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class Openome_modelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOpenome_model1Group());
	}

	/**
	 * Creates "openome_model" palette tool group
	 * @generated
	 */
	private PaletteContainer createOpenome_model1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				edu.toronto.cs.openome_model.diagram.part.Messages.Openome_model1Group_title);
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createAgent2CreationTool());
		paletteContainer.add(createPosition3CreationTool());
		paletteContainer.add(createRole4CreationTool());
		paletteContainer.add(createAspect5CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createHardgoal7CreationTool());
		paletteContainer.add(createSoftgoal8CreationTool());
		paletteContainer.add(createTask9CreationTool());
		paletteContainer.add(createResource10CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createDependency12CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAnd14CreationTool());
		paletteContainer.add(createOr15CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createMake17CreationTool());
		paletteContainer.add(createHelp18CreationTool());
		paletteContainer.add(createHurt19CreationTool());
		paletteContainer.add(createBreak20CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Actor1CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Actor1CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/actor.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/goalmodel/icons/actor.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Agent2CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Agent2CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/goalmodel/icons/agent.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/agent.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPosition3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Position3CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Position3CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/position.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/position.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Role4CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Role4CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/role.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/role.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAspect5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Aspect_1005);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Aspect5CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Aspect5CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/aspect.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/aspect.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardgoal7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2017);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1006);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Hardgoal7CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Hardgoal7CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/hardgoal.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/hardgoal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftgoal8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2018);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1007);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Softgoal8CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Softgoal8CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/softgoal.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/softgoal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTask9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2020);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1008);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Task9CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Task9CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/task.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/task.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2019);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1009);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Resource10CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Resource10CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/resource.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/resource.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Dependency12CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Dependency12CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/dependency.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/dependency.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnd14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.And14CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.And14CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/anddecomposition.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/anddecomposition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOr15CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Or15CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Or15CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/ordecomposition.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/ordecomposition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMake17CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3004);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Make17CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Make17CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/makecontribution.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/makecontribution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHelp18CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3005);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Help18CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Help18CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/helpcontribution.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/helpcontribution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHurt19CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3006);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Hurt19CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Hurt19CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/hurtcontribution.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/hurtcontribution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBreak20CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Break20CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Break20CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/breakcontribution.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/breakcontribution.gif")); //$NON-NLS-1$
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
