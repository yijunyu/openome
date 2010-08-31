package edu.toronto.cs.openome.evaluation.views;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.openome.evaluation.gui.EvaluationElementTypeLabelProvider;
import edu.toronto.cs.openome_model.EvaluationLabel;

/**
 * Label provider class
 */
public class ViewLabelProvider extends EvaluationElementTypeLabelProvider {
	public String getText(Object obj) {
		return obj.toString();
	}
	
	public Image getImage(Object obj) {
		TreeNode node = (TreeNode)obj;
			
		if(node.getImg() != null) {
			return super.getEvalImage((EvaluationLabel)node.getImg());
		} else { 
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		}
	}
}