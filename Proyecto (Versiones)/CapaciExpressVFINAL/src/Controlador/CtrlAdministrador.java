package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.auxtxt;
import Modelo.usuario;
import Vista.administrador;
import Vista.avances;
import Vista.login;
import Vista.registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlAdministrador implements ActionListener {

    private ConsultasUsuario cons;
    private usuario usr;
    private administrador adm;

    public CtrlAdministrador(ConsultasUsuario cons, usuario usr, administrador adm) {
        this.cons = cons;
        this.usr = usr;
        this.adm = adm;

        this.adm.btnRegistro.addActionListener(this);
        this.adm.btnAvances.addActionListener(this);
        this.adm.btnAceptar.addActionListener(this);
        this.adm.btnNuevo.addActionListener(this);
    }

    public void iniciar() {
        adm.setTitle("Administrador");
        adm.setLocationRelativeTo(null);

        adm.txtNomAdm.setVisible(false);
        adm.btnAvances.setVisible(false);
        adm.btnRegistro.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mat = auxtxt.lecturatxt();
        //System.out.println(mat);
        if(e.getSource() == adm.btnAceptar) {
            adm.txtNomAdm.setVisible(true);
            adm.btnAvances.setVisible(true);
            adm.btnRegistro.setVisible(true);
            adm.btnAceptar.setVisible(false);
            
            usr.setMatricula(mat);

            if (cons.buscarNombre(usr)) {
                adm.txtNomAdm.setText(usr.getNombre());
            } else {
                adm.txtNomAdm.setText("No identificado.");
            }
        }
        
        if(e.getSource() == adm.btnRegistro) {
            adm.setVisible(false);
            registro reg = new registro();
            CtrlUsuario ctrlU = new CtrlUsuario(cons, usr, reg);
            ctrlU.iniciar();
            reg.setVisible(true);
        }
        
        if(e.getSource() == adm.btnAvances) {
            adm.setVisible(false);
            avances ava = new avances();
            CtrlAvances ctrlAv = new CtrlAvances(cons, usr, ava);
            ctrlAv.iniciar();
            ava.setVisible(true);
        }
        
        if(e.getSource() == adm.btnNuevo) {
            adm.setVisible(false);
            login log = new login();
            CtrlLogin ctrlL = new CtrlLogin(cons, usr, log);
            ctrlL.iniciar();
            log.setVisible(true);
        }
    }
}
