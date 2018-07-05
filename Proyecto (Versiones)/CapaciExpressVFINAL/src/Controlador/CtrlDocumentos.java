package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.usuario;
import Vista.documentos;
import Vista.empleado;
import Vista.quiz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class CtrlDocumentos implements ActionListener {

    private ConsultasUsuario cons;
    private usuario usr;
    private documentos doc;

    public CtrlDocumentos(ConsultasUsuario cons, usuario usr, documentos doc) {
        this.cons = cons;
        this.usr = usr;
        this.doc = doc;

        this.doc.cbxDocumentos.addActionListener(this);
        this.doc.btnQuiz.addActionListener(this);
        this.doc.btnRegresar.addActionListener(this);
    }

    public void iniciar() {
        doc.setTitle("Documentos");
        doc.setLocationRelativeTo(null);
    }

    String tex = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == doc.btnRegresar) {
            doc.setVisible(false);
            empleado emp = new empleado();
            CtrlEmpleado ctrlE = new CtrlEmpleado(cons, usr, emp);
            ctrlE.iniciar();
            emp.setVisible(true);
        }

        if (e.getSource() == doc.btnQuiz) {
            doc.setVisible(false);
            quiz quiz = new quiz();
            CtrlQuiz ctrlQ = new CtrlQuiz(cons, usr, quiz);
            ctrlQ.iniciar();
            quiz.setVisible(true);
            
        }
    }
}
