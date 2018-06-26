package Vista;

import Modelo.SqlUsuarios;
import Modelo.hash;
import Modelo.usuarios;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class registro extends javax.swing.JFrame {

    public static final String BASE = "ccepsssql";
    public static final String URL = "jdbc:mysql://LAPTOP-4T4LV7H9:3306/" + BASE;
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Rfmb5851";

    PreparedStatement ps;
    ResultSet rs;

    public registro() {
        initComponents();
        txtId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro.");

        jLabel1.setText("Matricula:");

        jLabel2.setText("Password:");

        jLabel3.setText("Nombre:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMatricula)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtNombre))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnRegresar)
                    .addComponent(btnLimpiar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        setVisible(false);
        administrador admin = new administrador();
        admin.setVisible(true);

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        SqlUsuarios modSql = new SqlUsuarios();
        usuarios mod = new usuarios();

        if (txtMatricula.getText().equals("") || txtPassword.getText().equals("") || txtNombre.getText().equals("")) { //hago comparacion para ver si alguno de los campos esta vacio.
            JOptionPane.showMessageDialog(null, "Completa todos los campos.");
        } else {

            if (modSql.existeUsuario(txtMatricula.getText()) == 0) { //valido lo que tenga dentro de la caja de texto

                mod.setMatricula(txtMatricula.getText());
                mod.setPassword(txtPassword.getText());
                mod.setNombre(txtNombre.getText());
                mod.setId_tipo(2);

                if (modSql.registrar(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya existe.");
            }

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        SqlUsuarios modSql = new SqlUsuarios();

        Connection con = null;
        try {
            con = getConection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE usuarios SET matricula=?, password=?, nombre=? WHERE id=?");

            if (txtMatricula.getText().equals("") || txtPassword.getText().equals("") || txtNombre.getText().equals("")) { //hago comparacion para ver si alguno de los campos esta vacio.
                JOptionPane.showMessageDialog(null, "Completa todos los campos.");
            } else {

                if (modSql.existeUsuario(txtMatricula.getText()) == 1) {
                    ps.setString(1, txtMatricula.getText());
                    ps.setString(2, txtPassword.getText());
                    ps.setString(3, txtNombre.getText());
                    ps.setString(4, txtId.getText());

                    int res = ps.executeUpdate();

                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Usuario Modificada");
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar usuario");
                        limpiar();
                    }

                    con.close();

                } else {
                    JOptionPane.showMessageDialog(null, "Necesita introducir bien la matricula que desea modificar");
                }
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Connection con = null;
        try {
            con = getConection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM usuarios WHERE id=?");
            ps.setInt(1, Integer.parseInt(txtId.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar usuario");
                limpiar();
            }

            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Connection con = null;
        try {
            con = getConection();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM usuarios WHERE matricula = ?");

            if (txtMatricula.getText().equals("")) { //hago comparacion para ver si alguno de los campos esta vacio.
                JOptionPane.showMessageDialog(null, "Completa el campo de busqueda.");
            } else {
                ps.setString(1, txtMatricula.getText());

                rs = ps.executeQuery();

                if (rs.next()) {
                    txtId.setText(rs.getString("id"));
                    txtMatricula.setText(rs.getString("matricula"));
                    txtNombre.setText(rs.getString("nombre"));
                    txtPassword.setText(rs.getString("password"));
                } else {
                    JOptionPane.showMessageDialog(null, "No existe una persona esa clave.");
                }
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //**************************************************************************
    public static Connection getConection() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Conexion fallida");
        }
        return con;
    }

    private void limpiar() {
        txtMatricula.setText("");
        txtPassword.setText("");
        txtNombre.setText("");
        txtId.setText("");
    }

    //**************************************************************************
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
