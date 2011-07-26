package edu.toronto.cs.openome.evaluation.views;

import java.awt.Toolkit;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.openome.evaluation.gui.EvaluationElementTypeLabelProvider;
import edu.toronto.cs.openome_model.EvaluationLabel;

/**
 * Label provider class
 */
public class ViewLabelProvider extends EvaluationElementTypeLabelProvider implements ITableColorProvider {
	public String getText(Object obj) {
		return obj.toString();
	}
	
	public Image getImage(Object obj) {
		TreeNode node = (TreeNode)obj;

		if(node.getImg() != null) {
			return super.getEvalImage((EvaluationLabel)node.getImg());
		} else if(node.isAlternative()) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		} else if(node.isHardgoal()) {
			ImageDescriptor id = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
			.findImageDescriptor("/openome_model/icons/hardgoal.gif");
			Image image = new Image(null, id.createImage(), 0);
			return image;
		} else if(node.isSoftgoal()) {
			ImageDescriptor id = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
			.findImageDescriptor("/openome_model/icons/softgoal.gif");
			Image image = new Image(null, id.createImage(), 0);
			return image;
		} else if(node.isTask()) {
			ImageDescriptor id = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
			.findImageDescriptor("/openome_model/icons/task.gif");
			Image image = new Image(null, id.createImage(), 0);
			return image;
		} else if(node.isResource()) {
			ImageDescriptor id = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
			.findImageDescriptor("/openome_model/icons/resource.gif");
			Image image = new Image(null, id.createImage(), 0);
			return image;
		} else if(node.getConflict()) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		} else {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	@Override
	public Color getBackground(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getForeground(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
