package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    public static final String BASE = "ccepsssql";
    public static final String URL = "jdbc:mysql://LAPTOP-4T4LV7H9:3306/"+BASE;
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Rfmb5851";
    private Connection con = null;

    public Connection getConexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Conexion fallida");
        }
        return con;
    }

}