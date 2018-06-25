package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlUsuarios extends Conexion {

    public boolean registrar(usuarios usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuarios (matricula, password, nombre, id_tipo) VALUES (?,?,?,?) "; //Registro de los datos (Para Administrador)

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getMatricula());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setInt(4, usr.getId_tipo());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //**************************************************************************
    public boolean login(usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        //Control multitablas, por eso se debe el u. y el 
        String sql = "SELECT u.id, u.matricula, u.password, u.nombre, u.id_tipo, t.nombre FROM usuarios AS u "
                + "INNER JOIN tipo_usuario AS t ON u.id_tipo = t.id "
                + "WHERE matricula = ? "; //Selecciono los capos que voy a utilizar dependiendo si la matricula es igual a la que se va a poner

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getMatricula());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(3))) { //Validacion del Password

                    String sqlUpdate = "UPDATE usuarios SET last_session = ? WHERE id = ?";//Se va a actualizar la ultima hora de inicio de sesión

                    ps = con.prepareStatement(sqlUpdate);
                    ps.setString(1, usr.getLast_session());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();

                    //Usar validacion para poder llenar el campo de primera hora y segunda hora*******
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setId_tipo(rs.getInt(5));
                    usr.setNombre_tipo(rs.getString(6));
                    return true;

                } else {
                    return false;
                }

            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //**************************************************************************
    public int existeUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(id) FROM usuarios WHERE matricula = ? "; //compara cuantos usuarios hay con esa matricula (se valida toda la columna)

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    //**************************************************************************
    public boolean modificar(usuarios usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE usuarios SET matricula=?, password=?, nombre=? WHERE id=?"; //Registro de los datos (Para Administrador)

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getMatricula());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //**************************************************************************
    public boolean buscar(usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM usuarios WHERE matricula = ?"; //Registro de los datos (Para Administrador)

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getMatricula());
            rs = ps.executeQuery();

            if (rs.next()) {
                ps.setString(2, usr.getPassword());
                ps.setString(3, usr.getNombre());
                ps.execute();
                return true;
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
