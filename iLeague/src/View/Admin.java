/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.util.List;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

public class Admin extends javax.swing.JFrame {

    /**
     * @return the jLabelBG
     */
    public javax.swing.JLabel getjLabelBG() {
        return jLabelBG;
    }

    /**
     * @param jLabelBG the jLabelBG to set
     */
    public void setjLabelBG(javax.swing.JLabel jLabelBG) {
        this.jLabelBG = jLabelBG;
    }

    public Admin() {
        initComponents();
        AdminMenu.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        AdminMenu.setListData(adminMenu);

        Administration.setVisible(false);
        CoachPanel.setVisible(false);
        TeamPanel.setVisible(false);
        PlayerPanel.setVisible(false);
        ReceptionistPanel.setVisible(false);
        CustomerPanel.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Administration = new javax.swing.JPanel();
        deleteUsers = new javax.swing.JButton();
        pendingButton = new javax.swing.JButton();
        addUsers = new javax.swing.JButton();
        TeamPanel = new javax.swing.JPanel();
        CoachPanel = new javax.swing.JPanel();
        PlayerPanel = new javax.swing.JPanel();
        ReceptionistPanel = new javax.swing.JPanel();
        CustomerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminMenu = new javax.swing.JList<>();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(976, 732));
        getContentPane().setLayout(null);

        deleteUsers.setText("Delete Users");

        pendingButton.setText("Pending For Aprroval");

        addUsers.setText("Add Users");

        javax.swing.GroupLayout AdministrationLayout = new javax.swing.GroupLayout(Administration);
        Administration.setLayout(AdministrationLayout);
        AdministrationLayout.setHorizontalGroup(
            AdministrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdministrationLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addGroup(AdministrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pendingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        AdministrationLayout.setVerticalGroup(
            AdministrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdministrationLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(addUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(pendingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(deleteUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        getContentPane().add(Administration);
        Administration.setBounds(240, 50, 700, 580);
        getContentPane().add(TeamPanel);
        TeamPanel.setBounds(240, 50, 700, 580);
        getContentPane().add(CoachPanel);
        CoachPanel.setBounds(240, 50, 700, 580);
        getContentPane().add(PlayerPanel);
        PlayerPanel.setBounds(240, 50, 700, 580);
        getContentPane().add(ReceptionistPanel);
        ReceptionistPanel.setBounds(240, 50, 700, 580);
        getContentPane().add(CustomerPanel);
        CustomerPanel.setBounds(240, 50, 700, 580);

        AdminMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Administration", "Coach", "Team", "Player", "Receptionist", "Customer" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        AdminMenu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AdminMenuValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(AdminMenu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 180, 450);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/main.png"))); // NOI18N
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 990, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminMenuValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AdminMenuValueChanged
        String selected = AdminMenu.getSelectedValue();
        switch (selected) {
            case "Administration":
                CoachPanel.setVisible(false);
                TeamPanel.setVisible(false);
                PlayerPanel.setVisible(false);
                ReceptionistPanel.setVisible(false);
                CustomerPanel.setVisible(false);
                Administration.setVisible(true);
                
            case "Coach":
                Administration.setVisible(false);
                TeamPanel.setVisible(false);
                PlayerPanel.setVisible(false);
                ReceptionistPanel.setVisible(false);
                CustomerPanel.setVisible(false);
                CoachPanel.setVisible(true);
            case "Team":
                Administration.setVisible(false);
                CoachPanel.setVisible(false);
                PlayerPanel.setVisible(false);
                ReceptionistPanel.setVisible(false);
                CustomerPanel.setVisible(false);
                TeamPanel.setVisible(true);
            case "Player":
                Administration.setVisible(false);
                CoachPanel.setVisible(false);
                TeamPanel.setVisible(false);
                ReceptionistPanel.setVisible(false);
                CustomerPanel.setVisible(false);
                PlayerPanel.setVisible(true);
            case "Receptionist":
                Administration.setVisible(false);
                CoachPanel.setVisible(false);
                TeamPanel.setVisible(false);
                PlayerPanel.setVisible(false);
                CustomerPanel.setVisible(false);
                ReceptionistPanel.setVisible(true);
            case "Customer":
                Administration.setVisible(false);
                CoachPanel.setVisible(false);
                TeamPanel.setVisible(false);
                PlayerPanel.setVisible(false);
                ReceptionistPanel.setVisible(false);
                CustomerPanel.setVisible(true);

        }
    }//GEN-LAST:event_AdminMenuValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> AdminMenu;
    private javax.swing.JPanel Administration;
    private javax.swing.JPanel CoachPanel;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JPanel PlayerPanel;
    private javax.swing.JPanel ReceptionistPanel;
    private javax.swing.JPanel TeamPanel;
    private javax.swing.JButton addUsers;
    private javax.swing.JButton deleteUsers;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pendingButton;
    // End of variables declaration//GEN-END:variables

    private final String adminMenu[] = {"Administration", "Coach", "Team", "Player", "Receptionist", "Customer"};
}
