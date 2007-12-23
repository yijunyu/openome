package edu.toronto.cs.ome;

import java.io.File;

import javax.swing.JMenuBar;

import edu.toronto.cs.ome.view.GraphicView;
import edu.toronto.cs.ome.view.GraphicViewCanvas;
import edu.toronto.cs.ome.view.GraphicViewFrame;

public class Telos2SVG {

	public static void transform(String input, String output) {
		GraphicView view = GraphicView.loadViewFromFile(input);
		GraphicViewCanvas gvc = new GraphicViewCanvas(new JMenuBar(), view, 
				new GraphicViewFrame(1024, view, input));
		gvc.export2svg(new File(output));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		transform(args[0], args[1]);
	}

}
