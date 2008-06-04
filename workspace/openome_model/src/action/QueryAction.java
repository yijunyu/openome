package action;
import org.eclipse.emf.ecore.resource.Resource;

import edu.toronto.cs.openome.core.action.ObjectAction;

import parser.GoalModelReader;
import service.QueryVariability;
public class QueryAction extends ObjectAction {
	public void performAction(String name) {
		GoalModelReader rdr = new GoalModelReader();
		Resource r = rdr.read(name);
		QueryVariability q = new QueryVariability(r);
		q.init();		
	}
}