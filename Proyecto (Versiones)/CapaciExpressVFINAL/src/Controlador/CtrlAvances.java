package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.usuario;
import Vista.administrador;
import Vista.avances;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlAvances implements ActionListener {

    private ConsultasUsuario cons;
    private usuario usr;
    private avances ava;

    public CtrlAvances(ConsultasUsuario cons, usuario usr, avances ava) {
        this.cons = cons;
        this.usr = usr;
        this.ava = ava;

        this.ava.btnBuscar.addActionListener(this);
        this.ava.btnRegresar.addActionListener(this);
    }

    public void iniciar() {
        ava.setTitle("Avances");
        ava.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ava.btnBuscar) {
            
            if (ava.txtMatricula.getText().equals("")) { //hago comparacion para ver si alguno de los campos esta vacio.
                JOptionPane.showMessageDialog(null, "Completa el campos de la matricula para poder hacer la busqueda.");
            } else {
                usr.setMatricula(ava.txtMatricula.getText());

                if (cons.buscarAva(usr)) {
                    ava.txtStatus.setText(String.valueOf(usr.getKey()));
                    ava.txtPuntosP.setText(String.valueOf(usr.getPrimer_puntuacion()));
                    ava.txtPuntosS.setText(String.valueOf(usr.getSegunda_puntuacion()));
                    ava.txtUltima.setText(usr.getLast_session());
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo encontrar el registro del empleado.");
                    ava.txtStatus.setText(null);
                    ava.txtPuntosP.setText(null);
                    ava.txtPuntosS.setText(null);
                    ava.txtUltima.setText(null);
                }
            }
        }
        
        if(e.getSource() == ava.btnRegresar) {
            ava.setVisible(false);
            administrador adm = new administrador();
            CtrlAdministrador ctrlA = new CtrlAdministrador(cons, usr, adm);
            ctrlA.iniciar();
            adm.setVisible(true);
        }
    }
}
