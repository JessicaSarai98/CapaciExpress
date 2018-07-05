package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.usuario;
import Vista.registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlUsuario implements ActionListener {

    private ConsultasUsuario cons;
    private usuario usr;
    private registro reg;

    public CtrlUsuario(ConsultasUsuario cons, usuario usr, registro reg) {
        this.cons = cons;
        this.usr = usr;
        this.reg = reg;

        this.reg.btnRegistrar.addActionListener(this);
        this.reg.btnModificar.addActionListener(this);
        this.reg.btnEliminar.addActionListener(this);
        this.reg.btnBuscar.addActionListener(this);
        this.reg.btnLimpiar.addActionListener(this);
        this.reg.btnRegresar.addActionListener(this);
    }

    public void iniciar() {
        reg.setTitle("Registro");
        reg.setLocationRelativeTo(null);
        reg.txtId.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == reg.btnRegistrar) {

            if (reg.txtMatricula.getText().equals("") || reg.txtPassword.getText().equals("") || reg.txtNombre.getText().equals("")) { //hago comparacion para ver si alguno de los campos esta vacio.
                JOptionPane.showMessageDialog(null, "Completa todos los campos.");
            } else {

                if (cons.existeUsuario(reg.txtMatricula.getText()) == 0) {

                    usr.setMatricula(reg.txtMatricula.getText());
                    usr.setPassword(reg.txtPassword.getText());
                    usr.setNombre(reg.txtNombre.getText());
                    usr.setKey(1);
                    usr.setId_tipo(2);

                    if (cons.registrar(usr)) {
                        JOptionPane.showMessageDialog(null, "Empleado registrado.");
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo registrar al empleado.");
                        limpiar();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe.");
                }
            }
        }

        if (e.getSource() == reg.btnModificar) {

            if (reg.txtMatricula.getText().equals("") || reg.txtPassword.getText().equals("") || reg.txtNombre.getText().equals("")) { //hago comparacion para ver si alguno de los campos esta vacio.
                JOptionPane.showMessageDialog(null, "Completa todos los campos.");
            } else {

                usr.setId(Integer.parseInt(reg.txtId.getText()));
                usr.setMatricula(reg.txtMatricula.getText());
                usr.setPassword(reg.txtPassword.getText());
                usr.setNombre(reg.txtNombre.getText());

                if (cons.modificar(usr)) {
                    JOptionPane.showMessageDialog(null, "Registro del empleado modificado.");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro del empleado.");
                    limpiar();
                }
            }
        }

        if (e.getSource() == reg.btnEliminar) {

            if (reg.txtMatricula.getText().equals("")) { //hago comparacion para ver si alguno de los campos esta vacio.
                JOptionPane.showMessageDialog(null, "Necesita consultar la matricula.");
            } else {
                usr.setId(Integer.parseInt(reg.txtId.getText()));

                if (cons.eliminar(usr)) {
                    JOptionPane.showMessageDialog(null, "Registro del empleado eliminado.");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro del empleado.");
                    limpiar();
                }
            }
        }

        if (e.getSource() == reg.btnBuscar) {

            if (reg.txtMatricula.getText().equals("")) { //hago comparacion para ver si alguno de los campos esta vacio.
                JOptionPane.showMessageDialog(null, "Necesita consultar la matricula.");
            } else {
                usr.setMatricula(reg.txtMatricula.getText());

                if (cons.buscar(usr)) {

                    reg.txtStatus.setText(String.valueOf(usr.getKey()));
                    reg.txtId.setText(String.valueOf(usr.getId()));
                    reg.txtMatricula.setText(usr.getMatricula());
                    reg.txtPassword.setText(usr.getPassword());
                    reg.txtNombre.setText(usr.getNombre());
                    //JOptionPane.showMessageDialog(null, "Última conexión: \n"+usr.getLast_session());

                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo encontrar el registro del empleado.");
                    limpiar();
                }
            }
        }

        if (e.getSource() == reg.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        reg.txtId.setText(null);
        reg.txtMatricula.setText(null);
        reg.txtPassword.setText(null);
        reg.txtNombre.setText(null);
    }
}
