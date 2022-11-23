package jtables;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class jtable1 {
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        JTable jTable1;
        jTable1 = null;
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String tblNumber = tblModel.
                getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblDate = tblModel.
                getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblName = tblModel.
                getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblTotal = tblModel.
                getValueAt(jTable1.getSelectedRow(), 3).toString();

        
        AbstractButton jTable4 = null;
        DefaultTableModel tblMode4 = (DefaultTableModel)jTable4.getModel();
        String e1[]={"", "", "", "", ""};
        Object x1[][]={{"1", "Mobile", "3200", "1", "3200"},
                {"2", "Cover", "20", "2", "40"},
                {"3", "Headphone", "130", "1", "130"}};
        if (jTable1.getSelectedRow()==0){
            String data1[]={"1", "Mobile", "3200", "1", "3200"};
            String data2[]={"2", "Cover", "20", "2", "40"};
            String data3[]={"3", "Headphone", "130", "1", "130"};
            tblMode4.removeRow(0);
            tblMode4.removeRow(1);











            tblMode4.insertRow(0, data1);
            tblMode4.insertRow(1, data2);
            tblMode4.insertRow(2, data3);













            tblMode4.removeRow(3);
            tblMode4.addRow(e1);
        }else if(jTable1.getSelectedRow()==1){
            String data1[]={"1", "Laptop", "4000", "1", "4000"};
            String data2[]={"2", "Mouse", "35", "1", "35"};

            tblMode4.removeRow(0);
            tblMode4.removeRow(1);
            tblMode4.removeRow(2);










            tblMode4.insertRow(0, data1);
            tblMode4.insertRow(1, data2);
//                   











            tblMode4.removeRow(2);
            tblMode4.addRow(e1);

        }else{if(jTable1.getSelectedRow()==(2)){
            tblMode4.removeRow(0);
            tblMode4.removeRow(1);
            tblMode4.removeRow(2);
            tblMode4.addRow(e1);
            tblMode4.removeRow(0);
            tblMode4.addRow(e1);
            tblMode4.addRow(e1);
            tblMode4.addRow(e1);
            tblMode4.addRow(e1);
            tblMode4.addRow(e1);
        }

        }
    }
}
