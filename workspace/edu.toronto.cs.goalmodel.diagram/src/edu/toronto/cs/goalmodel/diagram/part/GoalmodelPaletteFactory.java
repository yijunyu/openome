package edu.toronto.cs.goalmodel.diagram.part;

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

import edu.toronto.cs.goalmodel.diagram.providers.GoalmodelElementTypes;

/**
 * @generated
 */
public class GoalmodelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGoalmodel1Group());
	}

	/**
	 * Creates "goalmodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createGoalmodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				GoalmodelDiagramEditorPlugin.getString("Goalmodel1Group.title")); //$NON-NLS-1$
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
		types.add(GoalmodelElementTypes.Actor_1001);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Actor1CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Actor1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/actor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/actor.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.Agent_1002);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Agent2CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Agent2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/agent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/agent.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPosition3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.Position_1003);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Position3CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Position3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/position.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/position.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.Role_1004);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Role4CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Role4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/role.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/role.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAspect5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.Aspect_1005);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Aspect5CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Aspect5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/aspect.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/aspect.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardgoal7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types.add(GoalmodelElementTypes.Goal_2001);
		types.add(GoalmodelElementTypes.Goal_2005);
		types.add(GoalmodelElementTypes.Goal_2009);
		types.add(GoalmodelElementTypes.Goal_2013);
		types.add(GoalmodelElementTypes.Goal_2017);
		types.add(GoalmodelElementTypes.Goal_1006);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Hardgoal7CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Hardgoal7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/hardgoal.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/hardgoal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftgoal8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types.add(GoalmodelElementTypes.Softgoal_2002);
		types.add(GoalmodelElementTypes.Softgoal_2006);
		types.add(GoalmodelElementTypes.Softgoal_2010);
		types.add(GoalmodelElementTypes.Softgoal_2014);
		types.add(GoalmodelElementTypes.Softgoal_2018);
		types.add(GoalmodelElementTypes.Softgoal_1007);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Softgoal8CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Softgoal8CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/softgoal.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/softgoal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTask9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types.add(GoalmodelElementTypes.Task_2004);
		types.add(GoalmodelElementTypes.Task_2008);
		types.add(GoalmodelElementTypes.Task_2012);
		types.add(GoalmodelElementTypes.Task_2016);
		types.add(GoalmodelElementTypes.Task_2020);
		types.add(GoalmodelElementTypes.Task_1008);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Task9CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Task9CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/task.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/task.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(6);
		types.add(GoalmodelElementTypes.Resource_2003);
		types.add(GoalmodelElementTypes.Resource_2007);
		types.add(GoalmodelElementTypes.Resource_2011);
		types.add(GoalmodelElementTypes.Resource_2015);
		types.add(GoalmodelElementTypes.Resource_2019);
		types.add(GoalmodelElementTypes.Resource_1009);
		NodeToolEntry entry = new NodeToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Resource10CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Resource10CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/resource.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/resource.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.Dependency_3001);
		LinkToolEntry entry = new LinkToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Dependency12CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Dependency12CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/dependency.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/dependency.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnd14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.AndDecomposition_3002);
		LinkToolEntry entry = new LinkToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("And14CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("And14CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/anddecomposition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/anddecomposition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOr15CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.OrDecomposition_3003);
		LinkToolEntry entry = new LinkToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Or15CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Or15CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/ordecomposition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/ordecomposition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMake17CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.MakeContribution_3004);
		LinkToolEntry entry = new LinkToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Make17CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Make17CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/makecontribution.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/makecontribution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHelp18CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.HelpContribution_3005);
		LinkToolEntry entry = new LinkToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Help18CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Help18CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/helpcontribution.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/helpcontribution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHurt19CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.HurtContribution_3006);
		LinkToolEntry entry = new LinkToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Hurt19CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Hurt19CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/hurtcontribution.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/hurtcontribution.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBreak20CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GoalmodelElementTypes.BreakContribution_3007);
		LinkToolEntry entry = new LinkToolEntry(
				GoalmodelDiagramEditorPlugin
						.getString("Break20CreationTool.title"), GoalmodelDiagramEditorPlugin.getString("Break20CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/breakcontribution.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GoalmodelDiagramEditorPlugin
				.findImageDescriptor("/goalmodel/icons/breakcontribution.gif")); //$NON-NLS-1$
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
