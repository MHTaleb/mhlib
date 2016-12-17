/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AuthentificationTools;

import AuthentificationTools.Authentificator;
import ExceptionLogging.MyLogger;
import FrameDecorator.MyDecorator;
import Properties.Properties_Bundel;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author polina
 */
public class Authentificate extends javax.swing.JFrame {

    private static Class doCall;
    public static void SetSuccessLoginCalledFrame(JFrame f){
        doCall=f.getClass();
    }
    public static void SetSuccessLoginCalledClass(Class f){
        doCall=f;
    }
    
    /**
     * Creates new form Authentificate
     */
    public Authentificate() {
        initComponents();
        Properties_Bundel.setPropertiesBundelRessource(Properties_Bundel.Strings);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        J_User = new javax.swing.JTextField();
        J_Connect = new javax.swing.JButton();
        J_Pass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        J_User_Sign = new javax.swing.JTextField();
        J_Pass_Sign = new javax.swing.JPasswordField();
        J_Pass_Confirm = new javax.swing.JPasswordField();
        J_Validate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(85, 51, 125));

        jTabbedPane1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel3.setText("Utilisateur :");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel4.setText("Mot de passe :");

        J_User.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        J_User.setToolTipText("Veuillez saisir votre nom d'utilisateur.");
        J_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_UserActionPerformed(evt);
            }
        });

        J_Connect.setBackground(new java.awt.Color(51, 51, 255));
        J_Connect.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        J_Connect.setText("Se Connecter");
        J_Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_ConnectActionPerformed(evt);
            }
        });

        J_Pass.setToolTipText("Veuillez introduire cotre mot de passe");
        J_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_PassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_User)
                    .addComponent(J_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(J_Connect)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(J_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(J_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(J_Connect)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        J_User.getAccessibleContext().setAccessibleName("J_User");

        jTabbedPane1.addTab("Connexion", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel5.setText("Utilisateur :");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel6.setText("Mot de passe :");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel7.setText("Confirmer mot de passe :");

        J_Validate.setText("Valider");
        J_Validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_ValidateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_User_Sign)
                            .addComponent(J_Pass_Sign)
                            .addComponent(J_Pass_Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(J_Validate)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(J_User_Sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(J_Pass_Sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(J_Pass_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(J_Validate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Enregistrement", jPanel4);

        jLabel1.setFont(new java.awt.Font("Taffy", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Icons/logout (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void J_ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_ConnectActionPerformed
        // TODO add your handling code here:
        try {

            if (J_User.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString("J_User"));
                J_User.requestFocus();
                return;
            }

            if (J_Pass.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString("J_Pass"));
                J_Pass.requestFocus();
                return;
            }
            this.setAlwaysOnTop(false);
            String state = Authentificator.DoAuthentificate(J_User.getText(), J_Pass.getText());

            if (state.equals("true")) {
                J_Pass.setText("");
                J_User.setText("");
                dispose();
                try {
                    MyDecorator.Decorate(doCall, this);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Authentificate.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Authentificate.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (state.equals("false")) {
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString(Properties_Bundel.Strings_Authentification_Failed));
            } else {
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString(Properties_Bundel.Strings_Inactive_Account));
            }
        } catch (Exception e) {
            MyLogger.Log_to_local(e);
        }
    }//GEN-LAST:event_J_ConnectActionPerformed

    private void J_ValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_ValidateActionPerformed
        // TODO add your handling code here:
        try {

            //<editor-fold defaultstate="collapsed" desc=" check data ">
            if (J_User_Sign.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString("J_User_Sign"));
                J_User_Sign.requestFocus();
                return;
            }

            if (J_Pass_Sign.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString("J_Pass_Sign"));
                J_Pass_Sign.requestFocus();
                return;
            }

            if (J_Pass_Confirm.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString("J_Pass_Confirm"));
                J_Pass_Confirm.requestFocus();
                return;
            }

            if (!J_Pass_Sign.getText().equals(J_Pass_Confirm.getText())) {
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString(Properties_Bundel.Strings_Confirm_Fail));
                J_Pass_Confirm.requestFocus();
                return;
            }

            //</editor-fold>
            if (Authentificator.DoRegister(J_User_Sign.getText(), J_Pass_Confirm.getText())) {
                Properties_Bundel.setPropertiesBundelRessource(Properties_Bundel.Strings);
                JOptionPane.showMessageDialog(this, Properties_Bundel.getString(Properties_Bundel.Strings_Register_Success));
                jTabbedPane1.setSelectedIndex(0);
                return;
            }
        } catch (Exception e) {
            MyLogger.Log_to_local(e);
        }

    }//GEN-LAST:event_J_ValidateActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    private void J_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_UserActionPerformed
        // TODO add your handling code here:
        J_Connect.doClick();
    }//GEN-LAST:event_J_UserActionPerformed

    private void J_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_PassActionPerformed
        // TODO add your handling code here:
        J_Connect.doClick();
    }//GEN-LAST:event_J_PassActionPerformed

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
                System.out.println(info.getName());
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Authentificate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentificate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentificate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentificate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentificate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J_Connect;
    private javax.swing.JPasswordField J_Pass;
    private javax.swing.JPasswordField J_Pass_Confirm;
    private javax.swing.JPasswordField J_Pass_Sign;
    private javax.swing.JTextField J_User;
    private javax.swing.JTextField J_User_Sign;
    private javax.swing.JButton J_Validate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}