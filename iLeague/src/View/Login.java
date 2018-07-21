/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SysData;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static javafx.application.Platform.exit;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Gilit
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        jLabel1.setSize(800, 600);

        jButtonSignIn.setOpaque(false);
        jButtonSignIn.setContentAreaFilled(false);
        jButtonSignIn.setBorderPainted(false);

        jButtonForgotPass.setOpaque(false);
        jButtonForgotPass.setContentAreaFilled(false);
        jButtonForgotPass.setBorderPainted(false);

        jTextFieldUserEmail.setOpaque(false);
        jTextFieldUserEmail.setBackground(new Color(0, 0, 0, 0));

        jPasswordField1.setOpaque(false);
        jPasswordField1.setBackground(new Color(0, 0, 0, 0));

        jTextFieldUserEmail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldUserEmail.setText("");
            }
        });

        jPasswordField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPasswordField1.setText("");
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUserEmail = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonSignIn = new javax.swing.JButton();
        jButtonForgotPass = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jTextFieldUserEmail.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jTextFieldUserEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUserEmail.setText("Enter Your Email");
        jTextFieldUserEmail.setBorder(null);
        jTextFieldUserEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldUserEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldUserEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUserEmail);
        jTextFieldUserEmail.setBounds(230, 170, 340, 40);

        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField");
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(230, 270, 340, 30);

        jButtonSignIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignIn.setBorder(null);
        jButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignInActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSignIn);
        jButtonSignIn.setBounds(220, 349, 360, 40);

        jButtonForgotPass.setBorder(null);
        jButtonForgotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotPassActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonForgotPass);
        jButtonForgotPass.setBounds(220, 470, 360, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/JV-Login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonForgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotPassActionPerformed
        javax.swing.JOptionPane.showMessageDialog(jLabel1, "Please call Customer Support for help 1-700-654-932");
    }//GEN-LAST:event_jButtonForgotPassActionPerformed

    private void jTextFieldUserEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserEmailActionPerformed

    }//GEN-LAST:event_jTextFieldUserEmailActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignInActionPerformed
        

        //Check here what kind of user is logining in
        if (SysData.getInstance().getAdmins().containsKey(jTextFieldUserEmail.getText())) {
            if (SysData.getInstance().getAdmins().get(jTextFieldUserEmail.getText()).equals(jPasswordField1.getText())) {
                Admin test = new Admin();
                test.setSize(976, 732);
                test.setVisible(true);
                this.dispose();
                
            }

        } else {
            System.out.println("error!!");
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSignInActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonForgotPass;
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUserEmail;
    // End of variables declaration//GEN-END:variables

    

}
