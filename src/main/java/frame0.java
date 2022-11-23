
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class frame0 extends javax.swing.JFrame {

    
    public frame0() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Invoices Table");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "22-11-2020 ", "Ali", "1"},
                {"2", "13-10-2021", "Saleh", "1"},
                {"", null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setRequestFocusEnabled(false);
        jTable1.setShowGrid(true);
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn1.setText("Create New Invoice");
        btn1.setActionCommand("");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 211, 213)));

        jLabel8.setText("Invoice Items");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        jTable4.setShowGrid(true);
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Invoice Number");

        jLabel3.setText("Invoice Date");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Invoice Total");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btn2.setText("Delete Invoice");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("Save");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("Cancel");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Load File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate)
                                    .addComponent(txtName))
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(73, 73, 73)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(57, 57, 57)
                                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 19, Short.MAX_VALUE))))
                    .addComponent(jLabel1)))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn1)
                .addGap(136, 136, 136)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312)
                .addComponent(btn3)
                .addGap(147, 147, 147)
                .addComponent(btn4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn2)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        JFileChooser fc =new JFileChooser();
        int result = fc.showOpenDialog(this );

        if (result==JFileChooser.APPROVE_OPTION){
            String path =fc.getSelectedFile().getPath();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(path);
                int size = fis.available();
                byte[] b = new byte[size];
                fis.read(b);
                ta.setText(new String(b));
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }finally{
                try{fis.close();}catch (IOException e){}

            }

        }
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fc = new JFileChooser();
        int result = fc.showSaveDialog(this);

        if(result== JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getPath();
            FileOutputStream fos =null;
            try {
                fos =new FileOutputStream(path);
                byte[] b = (byte[]) ta.getText();
                fos.write(b);
            } catch (FileNotFoundException e ) {
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    fos.close();
                }catch (IOException e){
                }

            }

        }
        
            
        
    }

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String tblNumber = tblModel.
        getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblDate = tblModel.
        getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblName = tblModel.
        getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblTotal = tblModel.
        getValueAt(jTable1.getSelectedRow(), 3).toString();

       txtDate.setText(tblDate);
        txtName.setText(tblName);
        txtNumber.setText(tblNumber);
        txtTotal.setText(tblTotal);
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

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        
        String data []={txtNumber.getText(),txtDate.getText(),txtName.getText(),
            txtTotal.getText()};
        
        DefaultTableModel tblModel=(DefaultTableModel) jTable1.getModel();
        
        tblModel.addRow(data);
        JOptionPane.showMessageDialog(this,"Invoice Created");


    }

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        DefaultTableModel tblModel=(DefaultTableModel) jTable1.getModel();
        txtDate.setText("");
        txtName.setText("");
        txtNumber.setText("");     
        txtTotal.setText("");
        
        if (jTable1.getSelectedRowCount()==1){
            tblModel.removeRow(jTable1.getSelectedRow());
            tblModel.addRow(new Object []{null, null, null, null, null});
            
        }else{
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,
                        "Table is Empty !");
                
            }else{JOptionPane.showMessageDialog(this,
                        "Please select Single Row For Delete.");}
        }
    }

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        
        
        

        
    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
           
            DefaultTableModel tblMode4=(DefaultTableModel) jTable4.getModel();
//         
            
             tblMode4 .removeRow(jTable4.getSelectedRow());
             tblMode4.addRow(new Object []{null, null, null, null, null});
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
            // TODO add your handling code here:
            JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Specify a file save");
        int us=fc.showSaveDialog(this);
        if (us==JFileChooser.APPROVE_OPTION){
            File fileToSave=fc.getSelectedFile();
            
            try{
                FileWriter fw =new FileWriter(fileToSave);
                BufferedWriter bw = new BufferedWriter(fw);
                for(int i=0;i<jTable4.getRowCount();i++){
                    for(int j =0;j<jTable4.getColumnCount();j++){
                    bw.write(jTable4.getValueAt(i, j).toString()+",");
                }
                    bw.newLine();
                     
                }
                JOptionPane.showMessageDialog(this,"SUCCESSFULLY LOADED","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                     
                bw.close();
                fw.close();
                
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(this,"ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
        }
            
            
    }

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame0().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    public javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtNumber;
    private javax.swing.JLabel txtTotal;
    
}
