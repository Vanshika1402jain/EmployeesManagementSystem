/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmngsys.gui;

import empmngsys.dbutil.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jain's
 */
public class OptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form OptionsFrame
     */
    public OptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnok = new javax.swing.JButton();
        jrbsearchemp = new javax.swing.JRadioButton();
        jrbaddemp = new javax.swing.JRadioButton();
        jrbshowallemp = new javax.swing.JRadioButton();
        jrbexit = new javax.swing.JRadioButton();
        jrbupdateemp = new javax.swing.JRadioButton();
        jrbdeleteemp = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Select Your Choice");
        jLabel1.setOpaque(true);

        btnok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        jrbsearchemp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbsearchemp);
        jrbsearchemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbsearchemp.setText("Search Employee");

        jrbaddemp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbaddemp);
        jrbaddemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbaddemp.setText("Add Employee");

        jrbshowallemp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbshowallemp);
        jrbshowallemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbshowallemp.setText("Show All Employee");

        jrbexit.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbexit);
        jrbexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbexit.setText("Quit");

        jrbupdateemp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbupdateemp);
        jrbupdateemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbupdateemp.setText("Update Employee");

        jrbdeleteemp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbdeleteemp);
        jrbdeleteemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbdeleteemp.setText("Delete Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbshowallemp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jrbupdateemp))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbaddemp)
                                .addGap(57, 57, 57)
                                .addComponent(jrbsearchemp)))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbdeleteemp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbexit)
                        .addGap(134, 134, 134))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbaddemp)
                    .addComponent(jrbsearchemp))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbshowallemp)
                    .addComponent(jrbupdateemp))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbdeleteemp)
                    .addComponent(jrbexit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnok)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        if(validateInput()==false){
            JOptionPane.showMessageDialog(null, "Please Make a Selection First","No Selection!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JFrame userChoiceFrame=null;
        if(jrbaddemp.isSelected()){
            userChoiceFrame=new AddEmployeeFrame();
            
        }
        else if(jrbsearchemp.isSelected()){
            userChoiceFrame=new SearchEmployeeFrame();
            
        }
        else if(jrbshowallemp.isSelected()){
            userChoiceFrame=new ViewAllEmployeeFrame();
            
        }
        else if(jrbupdateemp.isSelected()){
            userChoiceFrame=new UpdateEmployeeFrame();
            
        }
        else if(jrbdeleteemp.isSelected()){
            userChoiceFrame=new DeleteEmployeeFrame();
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Thank You for using app","Thanks!",JOptionPane.INFORMATION_MESSAGE);
            DBConnection.closeConnection();
            System.exit(0);
        }
        userChoiceFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnokActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbaddemp;
    private javax.swing.JRadioButton jrbdeleteemp;
    private javax.swing.JRadioButton jrbexit;
    private javax.swing.JRadioButton jrbsearchemp;
    private javax.swing.JRadioButton jrbshowallemp;
    private javax.swing.JRadioButton jrbupdateemp;
    // End of variables declaration//GEN-END:variables

    private boolean validateInput() {
        if(jrbaddemp.isSelected()==false && jrbsearchemp.isSelected()==false&& jrbshowallemp.isSelected()==false&&jrbexit.isSelected()==false && jrbupdateemp.isSelected()==false&&jrbdeleteemp.isSelected()==false){
            return false;
        }
        return true;
    }
}
