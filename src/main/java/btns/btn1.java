package btns;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class btn1 extends Component {
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed


        Label txtNumber;
        txtNumber = null;
        Label txtDate = null;
        Label txtName = null;
        Label txtTotal = null;
        String data []={txtNumber.getText(),txtDate.getText(),txtName.getText(),
                txtTotal.getText()};

        AbstractButton jTable1 = null;
        DefaultTableModel tblModel=(DefaultTableModel) jTable1.getModel();

        tblModel.addRow(data);
        JOptionPane.showMessageDialog(this,"Invoice Created");


    }
}
