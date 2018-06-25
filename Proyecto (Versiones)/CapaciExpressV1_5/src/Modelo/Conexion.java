package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    public static final String BASE = "ccepsssql";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/" + BASE;
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Rfmb5851";
    private Connection con = null;

    public Connection getConexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch (Exception e) {
            
            System.err.println(e);       
            JOptionPane.showMessageDialog(null, "Conexion fallida");
            
        }
        return con;
    }

}
