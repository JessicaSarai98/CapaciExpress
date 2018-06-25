package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultasUsuario extends Conexion {
    //**************************************************************************

    public boolean login(usuario usr) {

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
            Logger.getLogger(ConsultasUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ConsultasUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    //**************************************************************************
    public boolean registrar(usuario usr) {

        PreparedStatement ps = null;//Se prepara la consulta a la base de datos
        Connection con = getConexion();//se hace la conexion a la base de datos

        String sql = "INSERT INTO usuarios (status, matricula, password, nombre, id_tipo) VALUES (?,?,?,?,?) "; //Registro de los datos (Para Administrador)

        try {
            //Aqui se hacer inserción de los valores que solicité a la base de datos
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getKey());
            ps.setString(2, usr.getMatricula());
            ps.setString(3, usr.getPassword());
            ps.setString(4, usr.getNombre());
            ps.setInt(5, usr.getId_tipo());
            //Marco el final de la inserción de datos.
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultasUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //**************************************************************************
    public boolean modificar(usuario usr) {

        PreparedStatement ps = null;//Se prepara la consulta a la base de datos
        Connection con = getConexion();//se hace la conexion a la base de datos

        String sql = "UPDATE usuarios SET matricula=?, password=?, nombre=? WHERE id=?"; //Registro de los datos (Para Administrador)

        try {
            //Aqui se hacer inserción de los valores que solicité a la base de datos
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getMatricula());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setInt(4, usr.getId());
            //Marco el final de la inserción de datos.
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultasUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //**************************************************************************
    public boolean eliminar(usuario usr) {

        PreparedStatement ps = null;//Se prepara la consulta a la base de datos
        Connection con = getConexion();//se hace la conexion a la base de datos

        String sql = "DELETE FROM usuarios WHERE id=?"; //Registro de los datos (Para Administrador)

        try {
            //Aqui se hacer inserción de los valores que solicité a la base de datos
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getId());
            //Marco el final de la inserción de datos.
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultasUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //**************************************************************************
    public boolean buscar(usuario usr) {

        PreparedStatement ps = null;//Se prepara la consulta a la base de datos
        ResultSet rs = null;//Se prepara para insertar el resultado de la consulta a la base de datos
        Connection con = getConexion();//se hace la conexion a la base de datos

        String sql = "SELECT * FROM usuarios WHERE matricula=?"; //Registro de los datos (Para Administrador)

        try {
            //Aqui se hacer inserción de los valores que solicité a la base de datos
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getMatricula());
            //Marco el final de la inserción de datos.
            rs = ps.executeQuery();
            //Entrega el resultado de todo el Query en la ubicacion entregada

            if (rs.next()) {
                usr.setKey(Integer.parseInt(rs.getString("status")));
                usr.setId(Integer.parseInt(rs.getString("id")));
                usr.setMatricula(rs.getString("matricula"));
                usr.setPassword(rs.getString("password"));
                usr.setNombre(rs.getString("nombre"));
                //usr.setLast_session(rs.getString("last_session"));
                return true;
            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultasUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
