package Controller;

import View.Login;

class MainClass
{
    public static void main(String args[]){
        SysData.getInstance().addAdmin("admin@walla.com", "admin");
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });    
    }
}