package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.auxtxt;
import Modelo.usuario;
import Vista.administrador;
import Vista.empleado;
import Vista.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CtrlLogin implements ActionListener {

    private ConsultasUsuario cons;
    private usuario usr;
    private login log;

    public CtrlLogin(ConsultasUsuario cons, usuario usr, login log) {
        this.cons = cons;
        this.usr = usr;
        this.log = log;

        this.log.btnLogin.addActionListener(this);
    }

    public void iniciar() {
        log.setTitle("Login");
        log.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == log.btnLogin) {

            Date date = new Date();//Funcion para tiempo
            DateFormat fechaHora = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");//Formato del tiempo ha tomar

            String pass = new String(log.txtPassword.getPassword());
            String mat = log.txtMatricula.getText();

            if (mat.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Completa todos los campos para iniciar sesión.");
            } else {
                usr.setMatricula(mat);
                usr.setPassword(pass);
                usr.setLast_session(fechaHora.format(date));

                if (cons.login(usr)) {
                    auxtxt aux = new auxtxt();
                    aux.escribirtxt(mat);
                    //System.out.println(mat);

                    if (usr.getId_tipo() == 1) {
                        JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                        log.setVisible(false);
                        administrador admin = new administrador();
                        CtrlAdministrador ctrlA = new CtrlAdministrador(cons, usr, admin);
                        ctrlA.iniciar();
                        admin.setVisible(true);
                    } else if (usr.getId_tipo() == 2) {
                        JOptionPane.showMessageDialog(null, "Bienvenido Empleado");
                        log.setVisible(false);
                        empleado emp = new empleado();
                        CtrlEmpleado ctrlE = new CtrlEmpleado(cons, usr, emp);
                        ctrlE.iniciar();
                        emp.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                }
            } 
        }
    }
}
