package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.auxtxt;
import Modelo.usuario;
import Vista.empleado;
import Vista.login;
import Vista.quiz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlQuiz implements ActionListener {

    private ConsultasUsuario cons;
    private usuario usr;
    private quiz quiz;

    public CtrlQuiz(ConsultasUsuario cons, usuario usr, quiz quiz) {
        this.cons = cons;
        this.usr = usr;
        this.quiz = quiz;

        this.quiz.btnIniciar.addActionListener(this);
        this.quiz.btnRegresar.addActionListener(this);
        this.quiz.btnTerminar.addActionListener(this);
    }

    public void iniciar() {
        quiz.setTitle("Quiz");
        quiz.setLocationRelativeTo(null);

        quiz.btnTerminar.setVisible(false);
        quiz.txtQuiz.setVisible(false);
        quiz.p1opcA.setVisible(false);
        quiz.p1opcB.setVisible(false);
        quiz.p1opcC.setVisible(false);
        quiz.p2opcA.setVisible(false);
        quiz.p2opcC.setVisible(false);
        quiz.p2opcB.setVisible(false);
        quiz.p3opcA.setVisible(false);
        quiz.p3opcB.setVisible(false);
        quiz.p3opcC.setVisible(false);
        quiz.p4opcA.setVisible(false);
        quiz.p4opcB.setVisible(false);
        quiz.p4opcC.setVisible(false);
        quiz.p5opcA.setVisible(false);
        quiz.p5opcB.setVisible(false);
        quiz.p5opcC.setVisible(false);

        quiz.txtQuiz1.setVisible(false);
        quiz.p1opcA1.setVisible(false);
        quiz.p1opcB1.setVisible(false);
        quiz.p1opcC1.setVisible(false);
        quiz.p2opcA1.setVisible(false);
        quiz.p2opcC1.setVisible(false);
        quiz.p2opcB1.setVisible(false);
        quiz.p3opcA1.setVisible(false);
        quiz.p3opcB1.setVisible(false);
        quiz.p3opcC1.setVisible(false);
        quiz.p4opcA1.setVisible(false);
        quiz.p4opcB1.setVisible(false);
        quiz.p4opcC1.setVisible(false);
        quiz.p5opcA1.setVisible(false);
        quiz.p5opcB1.setVisible(false);
        quiz.p5opcC1.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mat = auxtxt.lecturatxt();

        if (e.getSource() == quiz.btnRegresar) {
            quiz.setVisible(false);
            empleado emp = new empleado();
            CtrlEmpleado ctrlE = new CtrlEmpleado(cons, usr, emp);
            ctrlE.iniciar();
            emp.setVisible(true);
        }

        if (e.getSource() == quiz.btnIniciar) {
            quiz.btnTerminar.setVisible(true);
            quiz.btnRegresar.setVisible(false);
            quiz.btnIniciar.setVisible(false);
            quiz.txtQuiz.setVisible(true);
            quiz.p1opcA.setVisible(true);
            quiz.p1opcB.setVisible(true);
            quiz.p1opcC.setVisible(true);
            quiz.p2opcA.setVisible(true);
            quiz.p2opcC.setVisible(true);
            quiz.p2opcB.setVisible(true);
            quiz.p3opcA.setVisible(true);
            quiz.p3opcB.setVisible(true);
            quiz.p3opcC.setVisible(true);
            quiz.p4opcA.setVisible(true);
            quiz.p4opcB.setVisible(true);
            quiz.p4opcC.setVisible(true);
            quiz.p5opcA.setVisible(true);
            quiz.p5opcB.setVisible(true);
            quiz.p5opcC.setVisible(true);

            quiz.txtQuiz1.setVisible(true);
            quiz.p1opcA1.setVisible(true);
            quiz.p1opcB1.setVisible(true);
            quiz.p1opcC1.setVisible(true);
            quiz.p2opcA1.setVisible(true);
            quiz.p2opcC1.setVisible(true);
            quiz.p2opcB1.setVisible(true);
            quiz.p3opcA1.setVisible(true);
            quiz.p3opcB1.setVisible(true);
            quiz.p3opcC1.setVisible(true);
            quiz.p4opcA1.setVisible(true);
            quiz.p4opcB1.setVisible(true);
            quiz.p4opcC1.setVisible(true);
            quiz.p5opcA1.setVisible(true);
            quiz.p5opcB1.setVisible(true);
            quiz.p5opcC1.setVisible(true);
        }

        usr.setMatricula(mat);

        if (cons.calificar(usr)) {
            if (usr.getKey() == 1) {
                int count = 0;
                JOptionPane.showMessageDialog(null, "Esta es tu primera oportunidad.");
                if (e.getSource() == quiz.btnTerminar) {

                    if (quiz.p1opcC.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p2opcA.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p3opcA.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p4opcB.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p5opcA.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p1opcC1.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p2opcA1.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p3opcA1.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p4opcB1.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p5opcA1.isSelected()) {
                        count = count + 20;
                    }

                    int prom = count / 2;

                    if (prom < 80) {
                        usr.setKey(2);
                        usr.setPrimer_puntuacion(prom);
                        usr.setMatricula(mat);

                        if (cons.segunda(usr)) {
                            JOptionPane.showMessageDialog(null, "Tu puntuacion es de: " + prom + ", por lo tanto no has pasado.");
                            JOptionPane.showMessageDialog(null, "Tienes una segunda oportunidad para pasar.");
                        }

                        quiz.setVisible(false);
                        empleado emp = new empleado();
                        CtrlEmpleado ctrlE = new CtrlEmpleado(cons, usr, emp);
                        ctrlE.iniciar();
                        emp.setVisible(true);

                    } else {
                        usr.setPrimer_puntuacion(prom);
                        usr.setMatricula(mat);

                        quiz.setVisible(false);

                        if (cons.segunda(usr)) {
                            JOptionPane.showMessageDialog(null, "Tu puntuacion es de: " + prom + ", has pasado.");
                            usr.setKey(2);
                            usr.setMatricula(mat);

                            if (cons.segunda(usr));
                        }

                    }

                }

            } else if (usr.getKey() == 2) {
                int count = 0;
                JOptionPane.showMessageDialog(null, "Esta es tu segunda oportunidad.");
                if (e.getSource() == quiz.btnTerminar) {

                    if (quiz.p1opcC.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p2opcA.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p3opcA.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p4opcB.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p5opcA.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p1opcC1.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p2opcA1.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p3opcA1.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p4opcB1.isSelected()) {
                        count = count + 20;
                    }
                    if (quiz.p5opcA1.isSelected()) {
                        count = count + 20;
                    }

                    int prom = count / 2;

                    if (prom < 80) {
                        usr.setKey(3);
                        usr.setSegunda_puntuacion(prom);
                        usr.setMatricula(mat);

                        if (cons.segunda(usr)) {
                            JOptionPane.showMessageDialog(null, "Tu puntuacion es de: " + prom + ", por lo tanto no has pasado.");
                            JOptionPane.showMessageDialog(null, "Ya no tienes mas oportunidades.");
                        }

                        quiz.setVisible(false);
                        empleado emp = new empleado();
                        CtrlEmpleado ctrlE = new CtrlEmpleado(cons, usr, emp);
                        ctrlE.iniciar();
                        emp.setVisible(true);

                    } else {
                        usr.setSegunda_puntuacion(prom);
                        usr.setMatricula(mat);

                        quiz.setVisible(false);

                        if (cons.segunda(usr)) {
                            JOptionPane.showMessageDialog(null, "Tu puntuacion es de: " + prom + ", has pasado.");
                            usr.setKey(3);
                            usr.setMatricula(mat);

                            if (cons.segunda(usr));
                        }
                    }
                }

            } else if (usr.getKey() == 3) {
                quiz.setVisible(false);
                empleado emp = new empleado();
                CtrlEmpleado ctrlE = new CtrlEmpleado(cons, usr, emp);
                ctrlE.iniciar();
                emp.setVisible(false);
                JOptionPane.showMessageDialog(null, "Acceso denegado.");

            }
        }
    }
}
