package edu.toronto.cs.ome.convertor;
import java.io.File;

import convertor.IConvertor;
import edu.toronto.cs.ome.controller.ModelManager;
import edu.toronto.cs.ome.model.TelosModel;

public class Telos_Q7 implements IConvertor {
	public void convert(String input, String output) {
		File file = new File(input);
		if (file != null && file.exists()) {
			String args[] = new String[1];
			args[0] = file.getAbsolutePath();
			ModelManager mm = new ModelManager(null);
			File f = new File(input);
			String modelfile = f.getAbsolutePath();
			TelosModel model = (TelosModel) mm.openModel(modelfile);
			try {
				mm.saveModelToQ7(model, new File(output));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}

}
