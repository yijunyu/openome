package edu.toronto.cs.openome.evaluation.commands;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.ImageCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
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
import edu.toronto.cs.openome.evaluation.gui.EvaluationElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.gui.LabelBagElementTypeLabelProvider;

import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.HumanJudgment;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.LabelBag;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;
import edu.toronto.cs.openome_model.impl.HumanJudgmentImpl;
import edu.toronto.cs.openome_model.impl.LabelBagImpl;

public class BackwardHJWindowCommand extends HJWindowCommand {
	
	private boolean done;
	private boolean noCombinations;
	private HumanJudgment judgmentResult;	
	
	
	public BackwardHJWindowCommand(Shell s, CommandStack cs, Intention i) {
		super(s, cs, i);
		done = false;
		noCombinations = false;
		judgmentResult = null;
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
		System.out.println("executing backward window");
		Display display = PlatformUI.getWorkbench().getDisplay();
		
		final Shell shell = new Shell(display);
		
		//allows for easy access to evaluation images
		EvalLabelElementTypeLabelProvider eletlp  = new EvalLabelElementTypeLabelProvider();
		
		//window title
		shell.setText("Backward Evaluation Human Judgment");
		
		//set layout to be a 3-column grid with non-fixed column size
		GridLayout gridLayout = new GridLayout(3, false);
        shell.setLayout(gridLayout);
        
        // grid behaviour for each cell. currently set for a cell to to take up 3 columns.
		GridData gridData = new GridData();
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		
		// This outputs first bit of text in the window, and gives the value of the root 
		// of this backward eval judgement that must be satisfied by judgement
		// this widget takes up 3/3 columns in the grid layout
		Label text1 = new Label(shell, SWT.READ_ONLY | SWT.WRAP);
		String name = intention.getName();
		String target = intention.getInitialEvalLabel().toString();
		text1.setText(" Results indicate that \"" + name + "\" must have a value of " 
				+ target + ".");
		text1.setLayoutData(gridData);
		
		// output some more text
		// takes up 3/3 columns in the grid layout
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 3;
		Text text3 = new Text(shell, SWT.READ_ONLY | SWT.WRAP);
		text3.setText("Enter a combination of evaluation labels for intentions contributing to \""
				+ name + "\" which would result in:");
		text3.setLayoutData(gridData);
		
		// eval label image and text, 1/3 columns in this row
		Image evalImage = eletlp.getEvalImage(intention.getInitialEvalLabel());				
		Image scaledImage = resizeImage(evalImage, 14, 14);
		CLabel text4 = new CLabel(shell, SWT.SHADOW_NONE | SWT.READ_ONLY | SWT.WRAP);
		text4.setImage(scaledImage);
		text4.setText(target);
		
		// filler takes up remaining 2/3 columns in this row.
		// this is necessary because the CLabel class has a bevel that can't be
		// turned off, which looks bad if it extends across 3 columns.
		Label filler = new Label(shell, SWT.READ_ONLY | SWT.WRAP);
		filler.setText("");
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;
		filler.setLayoutData(gridData);
		
		// text, takes up 3/3 columns in the grid layout for this row
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 3;
		Text text5 = new Text(shell, SWT.READ_ONLY | SWT.WRAP);
		text5.setText("for \"" + name + "\"");
		text5.setLayoutData(gridData);
		
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
		
		
		final HashMap<Intention, ImageCombo> combos = new HashMap<Intention, ImageCombo>();
		
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
						
			ImageCombo combo = new ImageCombo (table, SWT.NONE);
			combos.put(i, combo);
			combo.setText("Label");
			
			// The following code adds the appropriate evaluation images 
			// to the dropdown menu alongside the text.
			
			combo.add("Satisfied", eletlp.getImage(EvaluationLabel.SATISFIED));
			combo.add("Partially Satisfied", eletlp.getImage(EvaluationLabel.WEAKLY_SATISFIED));
			combo.add("Unknown", eletlp.getImage(EvaluationLabel.UNKNOWN));
			combo.add("Conflict", eletlp.getImage(EvaluationLabel.CONFLICT));
			combo.add("Partially Denied", eletlp.getImage(EvaluationLabel.WEAKLY_DENIED));
			combo.add("Denied", eletlp.getImage(EvaluationLabel.DENIED));
			combo.add("Don't care", null);
			
			editor.setEditor(combo, item, 2);
			
			if (i != null) {				
				
				if (i.getReverseLabelBag() != null) {
					String values = "";
					String sources = "";
					for (Intention intn : i.getReverseLabelBag().getLabelBagIntentions()) {
						values += i.getReverseLabelBag().getLabelBagEvalLabels().get(i.getReverseLabelBag().getLabelBagIntentions().indexOf(intn)).toString() + ", ";
						sources += intn.getName() + ", ";
					}
					item.setText(3, values);
					item.setText(4, sources);
				}
			}				
		}
		
		Label text = new Label(shell, SWT.READ_ONLY | SWT.WRAP | SWT.BORDER);		
		gridData = new GridData();
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		text.setLayoutData(gridData);
		String previous = "Previous combinations: \n";		
		EList<HumanJudgment> hjs = intention.getHumanJudgments();
		if (hjs.size() == 0) {
			previous += "None";
		} else {
			for (HumanJudgment hj : hjs) {				
				// if images are desired alongside text for eval labels, 
				// create Label or CLabel objects for each, and use their
				// setImage method to set the label's image to the
				// evaluation label image. Each would be a separate
				// SWT component/control.
				previous += hj.getLabelBag().toUIString();
				previous += "produced value: " + hj.getResultLabel() + "\n";
			}
		}
		text.setText(previous);
				
		System.out.println("set previous info");
		
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

		System.out.println("made buttons");
		
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
	
	/**
	 * Resize an Image object using SWT's GC class's draw function's
	 * native ability to resize a source image.
	 * @author Chris Aniszczyk, arupghose
	 * @param image the image that you wish to resize
	 * @param width width to resize to
	 * @param height height to resize to
	 * @return the resized image
	 */
	private Image resizeImage(Image image, int width, int height) {
		Image scaled = new Image(Display.getDefault(), width, height);
		GC gc = new GC(scaled);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(image, 0, 0, 
		image.getBounds().width, image.getBounds().height, 
		0, 0, width, height);
		gc.dispose();
		image.dispose();
		return scaled;
		}

	protected void done(HashMap<Intention, ImageCombo> combos) {
		//System.out.println("in done");
		
		for (Object obj : combos.keySet()) {
			Intention i = (Intention) obj;
			//System.out.println("Intention in combos: " + intention.getName());
			
			ImageCombo combo = combos.get(obj);
			
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
				
				Command addtoLB = new AddToLabelBagCommand(intention, i, label);
				commandStack.execute(addtoLB);
												
				//intention.addReverseJudgment(intention, label);
				
				//wrapper.addtoLabelBag(intention, label);
			}
		}
		AddHumanJudgmentCommand addHJ = new AddHumanJudgmentCommand(intention, intention.getInitialEvalLabel(), commandStack);
		commandStack.execute(addHJ);
		judgmentResult = addHJ.getHumanJudgmentResult();
	}	
	
	public boolean done() {
		return done;
	}
	
	public HumanJudgment getJudgmentResult() {
		return judgmentResult;
	}
	
	public boolean noCombinations() {
		return noCombinations;
	}

}
