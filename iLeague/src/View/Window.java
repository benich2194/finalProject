/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.util.List;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Gilit
 */
public class Window extends javax.swing.JFrame {
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

 

    /**
     * @return the jScrollPane2
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return WindowScroll;
    }

    /**
     * @param jScrollPane2 the jScrollPane2 to set
     */
    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.WindowScroll = jScrollPane2;
    }

    /**
     * @return the jScrollPane3
     */
 

    /**
     * @param jScrollPane3 the jScrollPane3 to set
     */
   

    /**
     * @return the jTextAreaMain
     */
    public javax.swing.JTextArea getjTextAreaMain() {
        return jTextAreaMain;
    }

    /**
     * @param jTextAreaMain the jTextAreaMain to set
     */
    public void setjTextAreaMain(javax.swing.JTextArea jTextAreaMain) {
        this.jTextAreaMain = jTextAreaMain;
    }
    public Window() {
        initComponents();
        
        jTextAreaMain.setOpaque(false);
        jTextAreaMain.setBackground(new Color(0,0,0,0));
        jTextAreaMain.setEditable(false);
        
        WindowScroll.getViewport().setBackground(new Color(0,0,0,0));
        
        
    }
    public void EmptyMenuSetter(JList list){
        EmptyMenu.setModel(list.getModel());
        EmptyMenu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WindowScroll = new javax.swing.JScrollPane();
        jTextAreaMain = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmptyMenu = new javax.swing.JList<>();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(976, 732));
        getContentPane().setLayout(null);

        jTextAreaMain.setEditable(false);
        jTextAreaMain.setColumns(20);
        jTextAreaMain.setRows(5);
        jTextAreaMain.setBorder(null);
        jTextAreaMain.setOpaque(false);
        WindowScroll.setViewportView(jTextAreaMain);

        getContentPane().add(WindowScroll);
        WindowScroll.setBounds(240, 50, 690, 580);

        EmptyMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(EmptyMenu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 180, 450);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/main.png"))); // NOI18N
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 990, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> EmptyMenu;
    private javax.swing.JScrollPane WindowScroll;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMain;
    // End of variables declaration//GEN-END:variables
}