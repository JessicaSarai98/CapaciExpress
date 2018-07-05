package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.auxtxt;
import Modelo.usuario;
import Vista.documentos;
import Vista.empleado;
import Vista.quiz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlEmpleado implements ActionListener {

    private ConsultasUsuario cons;
    private usuario usr;
    private empleado emp;

    public CtrlEmpleado(ConsultasUsuario cons, usuario usr, empleado emp) {
        this.cons = cons;
        this.usr = usr;
        this.emp = emp;

        this.emp.btnDocumentos.addActionListener(this);
        this.emp.btnQuiz.addActionListener(this);
        this.emp.btnAceptar.addActionListener(this);
    }

    public void iniciar() {
        emp.setTitle("Empleado");
        emp.setLocationRelativeTo(null);

        emp.txtNomEmp.setVisible(false);
        emp.btnDocumentos.setVisible(false);
        emp.btnQuiz.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mat = auxtxt.lecturatxt();

        if (e.getSource() == emp.btnAceptar) {
            emp.txtNomEmp.setVisible(true);
            emp.btnDocumentos.setVisible(true);
            emp.btnQuiz.setVisible(true);
            emp.btnAceptar.setVisible(false);
            
            usr.setMatricula(mat);

            if (cons.buscarNombre(usr)) {
                emp.txtNomEmp.setText(usr.getNombre());
            } else {
                emp.txtNomEmp.setText("No identificado.");
            }
        }
        
        if (e.getSource() == emp.btnDocumentos) {
            emp.setVisible(false);
            documentos doc = new documentos();
            CtrlDocumentos ctrlD = new CtrlDocumentos(cons, usr, doc);
            ctrlD.iniciar();
            doc.setVisible(true);
        }
        
        if(e.getSource() == emp.btnQuiz) {
            emp.setVisible(false);
            quiz quiz = new quiz();
            CtrlQuiz ctrlQ = new CtrlQuiz(cons, usr, quiz);
            ctrlQ.iniciar();
            quiz.setVisible(true);
        }
    }
}
