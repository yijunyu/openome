package edu.toronto.cs.openome.evaluation.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.eclipse.emf.common.command.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.dialogs.SelectionDialog;

import edu.toronto.cs.openome.evaluation.gui.EvalLabelElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.gui.EvaluationDialog;
import edu.toronto.cs.openome.evaluation.gui.LabelBagElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;

import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;

public class BackwardHJWindowCommand extends HJWindowCommand {
	
	private boolean done;
	private boolean noCombinations;
	private LabelBag resultBag;
	private SoftgoalWrappers softgoalWrappers;
	
	public BackwardHJWindowCommand(Shell s, IntQualIntentionWrapper w, SoftgoalWrappers sws) {
		super(s, w);
		
		done = false;
		noCombinations = false;
		resultBag = new LabelBag();
		softgoalWrappers = sws;
	}

	public boolean canExecute() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	public Command chain(Command command) {
		// TODO Auto-generated method stub
		return null;
	}
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("restriction")
	public void execute() {
		Intention intention = wrapper.getIntention();
		
		Display display = PlatformUI.getWorkbench().getDisplay();
		
		final Shell shell = new Shell(display);
		
		shell.setText("Backward Evaluation Human Judgment");
		
		GridLayout gridLayout = new GridLayout(3, false);
        shell.setLayout(gridLayout);
		
		////FillLayout fillLayout = new FillLayout();
		//fillLayout.type = SWT.VERTICAL;
		//shell.setLayout(fillLayout);

		Text text = new Text(shell, SWT.READ_ONLY | SWT.WRAP);
		
		GridData gridData = new GridData();
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;

		text.setLayoutData(gridData);

		String name = intention.getName();
		String target = wrapper.getInitialEvaluationLable().toString();
		text.setText("Results indicate that " + name + " must have a value of " 
				+ target + ".\nEnter a combination of evaluation labels for intentions contributing to " 
				+ name + " which would result in " + target + " for " + name + ".");
		
		
		final Table table = new Table (shell, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		
		int numcol = 5;
		gridData = new GridData();
		gridData.horizontalSpan = numcol;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;

		table.setLayoutData(gridData);
		
		/*String [] titles = {"Contributing Intention", "Link", "Select Label", "Given Value", "From Judgement for"};
		
		for (int i=0; i<numcol; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			if (i==0) {	column.setWidth (250);}
			else {column.setWidth (150);}
			column.setText(titles[i]);
		}*/
		TableColumn column = new TableColumn(table, SWT.NONE);
		column.setWidth (250);
		column.setText("Contributing Intention");
		column = new TableColumn(table, SWT.NONE);
		column.setWidth (100);
		column.setText("Link Type");
		column = new TableColumn(table, SWT.NONE);
		column.setWidth (150);
		column.setText("Select Label");
		column = new TableColumn(table, SWT.NONE);
		column.setWidth (150);
		column.setText("Given Value");
		column = new TableColumn(table, SWT.NONE);
		column.setWidth (250);
		column.setText("From Judgement for");
		
		
		final HashMap<Intention, CCombo> combos = new HashMap<Intention, CCombo>();
		
		for (Intention i: intention.getChildren()) {
			TableItem item = new TableItem (table, 0);
			item.setText (0, i.getName());
			
			for (Contribution cont: i.getContributesTo()) {
				if (cont.getTarget().equals(intention))
					item.setText (1, cont.getContributionType());
			}
			
			for (Dependency dep: i.getDependencyTo()) {
				if (dep.getDependencyTo().equals(intention)) {
					item.setText(1, "Dependency on");
				}
			}
			
			TableEditor editor = new TableEditor (table);
			editor.grabHorizontal = true;
						
			CCombo combo = new CCombo (table, SWT.NONE);
			combos.put(i, combo);
			combo.setText("Label");
			combo.add("Satisfied");
			combo.add("Partially Satisfied");
			combo.add("Unknown");
			combo.add("Conflict");
			combo.add("Partially Denied");
			combo.add("Denied");
			combo.add("Don't care");
			
			editor.setEditor(combo, item, 2);
			
			IntQualIntentionWrapper w = softgoalWrappers.findIntention(i);
			if (w != null) {
				HashMap<Intention, EvaluationLabel> reverse = w.getReverseJudgments();
				String values = "";
				String sources = "";
				for (Intention revInt : reverse.keySet()) {
					values += reverse.get(revInt).toString() + ", ";
					sources += revInt.getName() + ", ";
				}
				item.setText(3, values);
				item.setText(4, sources);
			}					
		}
		
		text = new Text(shell, SWT.READ_ONLY | SWT.WRAP);
		
		gridData = new GridData();
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;

		text.setLayoutData(gridData);
		String previous = "Previous combinations: \n";
		Vector<HumanJudgement> hjs = wrapper.getHumanJudgements();
		if (hjs.size() == 0) {
			previous += "None";
		} else {
			for (HumanJudgement hj : hjs) {
				previous += hj.getLabelBag().toString();
				
				previous += "produced value: " + hj.getJudgement() + "\n";					
			}
		}
		text.setText(previous);
		
		
		final Button doneB = new Button (shell, SWT.PUSH);
		doneB.setText ("OK");
		
		doneB.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				//System.out.println("Done");
				done = true;
				done(combos);
				shell.dispose();
				return;
			}
		});

		
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		//gridData.grabExcessVerticalSpace = true;
		doneB.setLayoutData(gridData);
		
		Button cancel = new Button (shell, SWT.PUSH);
		
		cancel.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				//System.out.println("Cancel");
				cancelled = true;
				shell.dispose();
				return;
			}
		});
		
		cancel.setText ("Cancel");		
		cancel.setLayoutData(gridData);
		
		final Button noCombo = new Button (shell, SWT.PUSH);
		noCombo.setText ("No Combination");		
		noCombo.setLayoutData(gridData);
		
		noCombo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				//System.out.println("NoCombo");
				noCombinations = true;
				shell.dispose();
				return;
			}
		});
		
		
		shell.setSize(900, 400);
		
		shell.open();
		
		shell.forceActive();
		
		while (!shell.isDisposed ()) {
			//System.out.println("shell not disposed");
			if (!display.readAndDispatch ()) display.sleep ();
		}
		//System.out.println("shell is disposed");
		
		return;
		

		
	}

	protected void done(HashMap<Intention, CCombo> combos) {
		//System.out.println("in done");
		LabelBag lb = new LabelBag();
		for (Object obj : combos.keySet()) {
			Intention intention = (Intention) obj;
			//System.out.println("Intention in combos: " + intention.getName());
			
			CCombo combo = combos.get(obj);
			
			int index = combo.getSelectionIndex();
			
			//System.out.println("index: " + index);
			
			EvaluationLabel label = null;
			switch(index) {
				case(0): label = EvaluationLabel.SATISFIED; break;
				case(1): label = EvaluationLabel.WEAKLY_SATISFIED; break;
				case(2): label = EvaluationLabel.UNKNOWN; break;
				case(3): label = EvaluationLabel.CONFLICT; break;
				case(4): label = EvaluationLabel.WEAKLY_DENIED; break;
				case(5): label = EvaluationLabel.DENIED; break;
				//don't care option
				case(6): label = null; break;
			}
			
			//System.out.println(label.getName());
				
			if (label != null)  {
				//System.out.println("label not null");
				
				lb.addToBag(intention, label);
				
				IntQualIntentionWrapper w = softgoalWrappers.findIntention(intention);
				if (w == null) {
					w = new IntQualIntentionWrapper(intention);
					softgoalWrappers.add(w);
				}	
				w.addReverseJudgment(wrapper.getIntention(), label);
				
				//wrapper.addtoLabelBag(intention, label);
			}
		}
		resultBag = lb;
		HumanJudgement hj = new HumanJudgement(lb, wrapper.getInitialEvaluationLable());
		wrapper.addHumanJudgement(hj);
	}
	
	public LabelBag getBagResult() {
		return resultBag;
	}
	
	
	public boolean done() {
		return done;
	}
	
	public boolean noCombinations() {
		return noCombinations;
	}

}
