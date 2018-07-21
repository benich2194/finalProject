package Controller;

import View.Login;

class MainClass
{
    public static void main(String args[]){
        SysData.getInstance().addAdmin("admin@walla.com", "admin");
        System.out.println("checking");
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });    
    }
}