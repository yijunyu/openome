package edu.toronto.cs.openome_model.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.PaletteStack;
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
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createHardgoal6CreationTool());
		paletteContainer.add(createSoftgoal7CreationTool());
		paletteContainer.add(createTask8CreationTool());
		paletteContainer.add(createResource9CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createDependency11CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAnd13CreationTool());
		paletteContainer.add(createOr14CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createContributions16Group());
		return paletteContainer;
	}

	/**
	 * Creates "Contributions" palette tool group
	 * @generated
	 */
	private PaletteContainer createContributions16Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				edu.toronto.cs.openome_model.diagram.part.Messages.Contributions16Group_title);
		paletteContainer
				.setDescription(edu.toronto.cs.openome_model.diagram.part.Messages.Contributions16Group_desc);
		paletteContainer.add(createHelp1CreationTool());
		paletteContainer.add(createHurt2CreationTool());
		paletteContainer.add(createMake3CreationTool());
		paletteContainer.add(createBreak4CreationTool());
		paletteContainer.add(createSomePlus5CreationTool());
		paletteContainer.add(createSomeMinus6CreationTool());
		paletteContainer.add(createUnknown7CreationTool());
		paletteContainer.add(createAnd8CreationTool());
		paletteContainer.add(createOr9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_2001);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Actor1CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Actor1CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/actor.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/actor.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_2002);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Agent2CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Agent2CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/agent.gif")); //$NON-NLS-1$
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
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_2003);
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
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_2004);
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
	private ToolEntry createHardgoal6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_3001);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_3005);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_3009);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_3013);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Hardgoal6CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Hardgoal6CreationTool_desc,
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
	private ToolEntry createSoftgoal7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_3002);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_3006);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_3010);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_3014);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Softgoal7CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Softgoal7CreationTool_desc,
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
	private ToolEntry createTask8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_3004);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_3008);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_3012);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_3016);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2007);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Task8CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Task8CreationTool_desc,
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
	private ToolEntry createResource9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_3003);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_3007);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_3011);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_3015);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2008);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Resource9CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Resource9CreationTool_desc,
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
	private ToolEntry createDependency11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_4001);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Dependency11CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Dependency11CreationTool_desc,
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
	private ToolEntry createAnd13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_4002);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.And13CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.And13CreationTool_desc,
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
	private ToolEntry createOr14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_4003);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Or14CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Or14CreationTool_desc,
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
	private ToolEntry createHelp1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_4005);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Help1CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Help1CreationTool_desc,
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
	private ToolEntry createHurt2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_4006);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Hurt2CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Hurt2CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.getImageDescriptor(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMake3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_4007);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Make3CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Make3CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.getImageDescriptor(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBreak4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_4008);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Break4CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Break4CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.getImageDescriptor(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSomePlus5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_4009);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.SomePlus5CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.SomePlus5CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.getImageDescriptor(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSomeMinus6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_4010);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.SomeMinus6CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.SomeMinus6CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.getImageDescriptor(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnknown7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_4011);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Unknown7CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Unknown7CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.getImageDescriptor(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnd8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_4012);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.And8CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.And8CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.getImageDescriptor(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOr9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_4013);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Or9CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Or9CreationTool_desc,
				types);
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.getImageDescriptor(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_4013));
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
