package OME;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

class AttributeDialog extends JDialog implements TableModelListener {

static final int MAXATTNUM = 10;


    protected TableModel model;
    protected Object [][] olddata = {
   		{"", ""},
		{"", ""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""},
		{"",""}
    };
    protected ViewObject vo;

    public AttributeDialog(String objectname, Object [][] data, ViewObject vo) {
	    
	//assign the original data value to olddata:
	int i=0;
	while ((!data[i][0].equals(""))|| (!data[i][1].equals(""))) {
	    if (!data[i][0].equals("")) {
		olddata[i][0] = data[i][0];	
	    }
	    if (!data[i][1].equals("")) {
		olddata[i][1] = data[i][1];	
	    }
	    i++;
	}
	
//	olddata = data;


	
	this.vo = vo;
	
	setTitle(objectname);

	// Create the attrubute table.
        String[] columnNames = {"Attribute Name", 
                                "Attribute Value"};

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
	
        model = table.getModel();
        model.addTableModelListener(this);

	//Create the scroll pane and add the table to it. 
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this window.
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        Border padding = BorderFactory.createEmptyBorder(20,20,20,20);
	
	JPanel attpanel = new JPanel();
	attpanel.setLayout(new BoxLayout(attpanel,BoxLayout.Y_AXIS));
	    
   
	scrollPane.setBorder(padding);

	// Add all the panels.
	attpanel.add(scrollPane);
	attpanel.add(Box.createHorizontalGlue());

	setContentPane(attpanel);
	
	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
		dispose();
            }
        });

    }	

        public void tableChanged(TableModelEvent e) {
	    D.o("Table is changed!!!!!!!!!!!!!!!!");
                int row = e.getFirstRow();
                int column = e.getColumn();
		if (column == 1) {
		    D.o("The second column is changed!!!!!!!!!!!!!!!!!!!!!");
		    ModelValueAttribute oa = 
			vo.getModelObject().getValueAttribute((String)model.getValueAt(row,0));
		    if (oa!=null) {
			oa.setValue((String)model.getValueAt(row, column));
		    }
		}
		if (column == 0) {
		    D.o("To update: " + olddata[row][0] + " " + model.getValueAt(row,0));
		    ModelValueAttribute oa = 
			vo.getModelObject().updateValueAttribute((String)olddata[row][0],
				(String)model.getValueAt(row,0));
			
		    if (oa!=null) {
			oa.setValue((String)model.getValueAt(row, 1));
		    }
		}
		    
	}

}
