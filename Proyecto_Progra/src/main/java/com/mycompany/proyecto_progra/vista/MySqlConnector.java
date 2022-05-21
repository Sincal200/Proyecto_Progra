
package com.mycompany.proyecto_progra.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MySqlConnector {
    Connection con = null;
    
    public Connection conectar(){
        String db = "jdbc:mysql://localhost/compras";
        String usuario = "root";
        String pass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(db,usuario,pass);
            JOptionPane.showMessageDialog(null, "Base de datos Conectada");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR Base de datos");
    }
    return con;
}
}
