package convertor;

import java.io.File;
import java.io.InputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Goal_Q7 implements IConvertor {
	public void convert(String input, String output) {		
		InputStream x = Goal_Q7.class.getResourceAsStream("xmi2q7.xsl");
		if (x!=null) {
			TransformerFactory factory = TransformerFactory.newInstance();
			try {
				Transformer transformer_info;
				transformer_info = factory.newTransformer(new StreamSource(x));
				transformer_info.transform(new StreamSource(new File(input)),
						new StreamResult(new File(output)));
			} catch (TransformerException e) {
					e.printStackTrace();
			}
		} else {
			System.out.println("xmi2q7.xsl not found");
		}
	}
}
