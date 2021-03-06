/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentManagement;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Zerina Taznin Nova
 */
public class PurchaseForm extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseForm
     */
    public PurchaseForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PurchaseQuantity = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        ItemID = new javax.swing.JTextField();
        PurQuan = new javax.swing.JTextField();
        ItemUploadBill = new javax.swing.JButton();
        PurchaseFormInputCancel = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Item Purchase Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Purchase Info: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Purchase ID: ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Item ID: ");

        PurchaseQuantity.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        PurchaseQuantity.setText("Purchase Quantity: ");

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTextField3.setText("jTextField1");

        ItemID.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        ItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemIDActionPerformed(evt);
            }
        });

        PurQuan.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        ItemUploadBill.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        ItemUploadBill.setText("Bill");
        ItemUploadBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ItemUploadBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUploadBillActionPerformed(evt);
            }
        });

        PurchaseFormInputCancel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        PurchaseFormInputCancel.setText("Cancel");
        PurchaseFormInputCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PurchaseFormInputCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurchaseFormInputCancelMouseClicked(evt);
            }
        });
        PurchaseFormInputCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseFormInputCancelActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton4.setText("Back");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ItemUploadBill)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PurchaseFormInputCancel))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(PurchaseQuantity)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PurQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(90, 90, 90)
                                        .addComponent(ItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(56, 56, 56)
                                        .addComponent(jTextField1)))))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(179, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PurQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PurchaseQuantity))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PurchaseFormInputCancel)
                    .addComponent(jButton4)
                    .addComponent(ItemUploadBill))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 560, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemUploadBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUploadBillActionPerformed
        // TODO add your handling code here:
        
        String itemID = ItemID.getText();
        String PurchaseQuantity = PurQuan.getText();
       
        PreparedStatement st;
        String query = " INSERT INTO `customer_item_purchase`(`itemID`, `purchaseQuantity`) VALUES (?,?) ";
        
        
        try {st = DatabaseConnection.getConnection().prepareStatement(query);
        st.setString(1, itemID);
        st.setString(2, PurchaseQuantity);
        
        if(st.executeUpdate() > 0)
        {
        JOptionPane.showMessageDialog(null, "Item purchase info has been uploaded");
        }
        
        } catch (SQLException ex) {
        System.Logger.getLogger(RentManagement.class.getName()).log(System.Logger.Level.SEVERE, null, ex);
        }
    
        
        TransactionReceiptForm trf = new TransactionReceiptForm();
        trf.setVisible(true);
        trf.pack();
        trf.setLocationRelativeTo(null);
        //trf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.dispose();
        
    }//GEN-LAST:event_ItemUploadBillActionPerformed

    private void PurchaseFormInputCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseFormInputCancelActionPerformed
        // TODO add your handling code here:
        
        JTextField cleartext = null;
        
        for (Component c:jPanel2.getComponents())
        {
        if (c.getClass().toString().contains("javax.swing.JTextField"))
        {
            cleartext= (JTextField)c;
            cleartext.setText("");
        }
    } 
        
    }//GEN-LAST:event_PurchaseFormInputCancelActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void PurchaseFormInputCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchaseFormInputCancelMouseClicked
        // TODO add your handling code here:
        
        JTextField cleartext = null;
        
        for (Component c:jPanel2.getComponents())
        {
        if (c.getClass().toString().contains("javax.swing.JTextField"))
        {
            cleartext= (JTextField)c;
            cleartext.setText("");
        }
    }  
        
    }//GEN-LAST:event_PurchaseFormInputCancelMouseClicked

    private void ItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PurchaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ItemID;
    private javax.swing.JButton ItemUploadBill;
    private javax.swing.JTextField PurQuan;
    private javax.swing.JButton PurchaseFormInputCancel;
    private javax.swing.JLabel PurchaseQuantity;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

