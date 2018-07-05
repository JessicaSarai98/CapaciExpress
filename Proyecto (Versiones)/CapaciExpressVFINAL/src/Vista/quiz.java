package Vista;

import Controlador.CtrlEmpleado;
import Modelo.ConsultasUsuario;
import Modelo.usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class quiz extends javax.swing.JFrame {

    public quiz() {
        initComponents();
    }

    private ConsultasUsuario cons;
    private usuario usr;
    String doc = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuiz = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        p1opcC = new javax.swing.JRadioButton();
        p1opcB = new javax.swing.JRadioButton();
        p1opcA = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        p2opcA = new javax.swing.JRadioButton();
        p2opcB = new javax.swing.JRadioButton();
        p2opcC = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        p3opcA = new javax.swing.JRadioButton();
        p3opcB = new javax.swing.JRadioButton();
        p3opcC = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        p4opcA = new javax.swing.JRadioButton();
        p4opcB = new javax.swing.JRadioButton();
        p4opcC = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        p5opcB = new javax.swing.JRadioButton();
        p5opcA = new javax.swing.JRadioButton();
        p5opcC = new javax.swing.JRadioButton();
        btnIniciar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuiz1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        p1opcA1 = new javax.swing.JRadioButton();
        p1opcB1 = new javax.swing.JRadioButton();
        p1opcC1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        p4opcA1 = new javax.swing.JRadioButton();
        p4opcB1 = new javax.swing.JRadioButton();
        p4opcC1 = new javax.swing.JRadioButton();
        p5opcC1 = new javax.swing.JRadioButton();
        p5opcB1 = new javax.swing.JRadioButton();
        p5opcA1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        p2opcC1 = new javax.swing.JRadioButton();
        p2opcB1 = new javax.swing.JRadioButton();
        p2opcA1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        p3opcA1 = new javax.swing.JRadioButton();
        p3opcB1 = new javax.swing.JRadioButton();
        p3opcC1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtQuiz.setColumns(20);
        txtQuiz.setRows(5);
        txtQuiz.setEnabled(false);
        jScrollPane1.setViewportView(txtQuiz);

        jLabel1.setText("Pregunta 1:");

        buttonGroup1.add(p1opcC);
        p1opcC.setText("C");

        buttonGroup1.add(p1opcB);
        p1opcB.setText("B");
        p1opcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1opcBActionPerformed(evt);
            }
        });

        buttonGroup1.add(p1opcA);
        p1opcA.setText("A");
        p1opcA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1opcAActionPerformed(evt);
            }
        });

        jLabel2.setText("Pregunta 2:");

        buttonGroup2.add(p2opcA);
        p2opcA.setText("A");
        p2opcA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2opcAActionPerformed(evt);
            }
        });

        buttonGroup2.add(p2opcB);
        p2opcB.setText("B");
        p2opcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2opcBActionPerformed(evt);
            }
        });

        buttonGroup2.add(p2opcC);
        p2opcC.setText("C");

        jLabel3.setText("Pregunta 3:");

        buttonGroup3.add(p3opcA);
        p3opcA.setText("A");
        p3opcA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3opcAActionPerformed(evt);
            }
        });

        buttonGroup3.add(p3opcB);
        p3opcB.setText("B");
        p3opcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3opcBActionPerformed(evt);
            }
        });

        buttonGroup3.add(p3opcC);
        p3opcC.setText("C");

        jLabel4.setText("Pregunta 4:");

        buttonGroup4.add(p4opcA);
        p4opcA.setText("A");
        p4opcA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4opcAActionPerformed(evt);
            }
        });

        buttonGroup4.add(p4opcB);
        p4opcB.setText("B");
        p4opcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4opcBActionPerformed(evt);
            }
        });

        buttonGroup4.add(p4opcC);
        p4opcC.setText("C");

        jLabel5.setText("Pregunta 5:");

        buttonGroup5.add(p5opcB);
        p5opcB.setText("B");
        p5opcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5opcBActionPerformed(evt);
            }
        });

        buttonGroup5.add(p5opcA);
        p5opcA.setText("A");
        p5opcA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5opcAActionPerformed(evt);
            }
        });

        buttonGroup5.add(p5opcC);
        p5opcC.setText("C");

        btnIniciar.setText("Iniciar Quiz");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar a inicio");

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        txtQuiz1.setColumns(20);
        txtQuiz1.setRows(5);
        txtQuiz1.setEnabled(false);
        jScrollPane2.setViewportView(txtQuiz1);

        jLabel6.setText("Pregunta 1:");

        buttonGroup6.add(p1opcA1);
        p1opcA1.setText("A");
        p1opcA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1opcA1ActionPerformed(evt);
            }
        });

        buttonGroup6.add(p1opcB1);
        p1opcB1.setText("B");
        p1opcB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1opcB1ActionPerformed(evt);
            }
        });

        buttonGroup6.add(p1opcC1);
        p1opcC1.setText("C");

        jLabel7.setText("Pregunta 4:");

        buttonGroup9.add(p4opcA1);
        p4opcA1.setText("A");
        p4opcA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4opcA1ActionPerformed(evt);
            }
        });

        buttonGroup9.add(p4opcB1);
        p4opcB1.setText("B");
        p4opcB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4opcB1ActionPerformed(evt);
            }
        });

        buttonGroup9.add(p4opcC1);
        p4opcC1.setText("C");

        buttonGroup10.add(p5opcC1);
        p5opcC1.setText("C");

        buttonGroup10.add(p5opcB1);
        p5opcB1.setText("B");
        p5opcB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5opcB1ActionPerformed(evt);
            }
        });

        buttonGroup10.add(p5opcA1);
        p5opcA1.setText("A");
        p5opcA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5opcA1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Pregunta 5:");

        buttonGroup7.add(p2opcC1);
        p2opcC1.setText("C");

        buttonGroup7.add(p2opcB1);
        p2opcB1.setText("B");
        p2opcB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2opcB1ActionPerformed(evt);
            }
        });

        buttonGroup7.add(p2opcA1);
        p2opcA1.setText("A");
        p2opcA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2opcA1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Pregunta 2:");

        jLabel10.setText("Pregunta 3:");

        buttonGroup8.add(p3opcA1);
        p3opcA1.setText("A");
        p3opcA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3opcA1ActionPerformed(evt);
            }
        });

        buttonGroup8.add(p3opcB1);
        p3opcB1.setText("B");
        p3opcB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3opcB1ActionPerformed(evt);
            }
        });

        buttonGroup8.add(p3opcC1);
        p3opcC1.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(p1opcA)
                            .addComponent(p1opcC)
                            .addComponent(p1opcB)
                            .addComponent(p4opcA)
                            .addComponent(p4opcC)
                            .addComponent(p4opcB)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(p2opcA)
                                    .addComponent(p2opcC)
                                    .addComponent(p2opcB))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(p3opcA)
                                    .addComponent(p3opcC)
                                    .addComponent(p3opcB)
                                    .addComponent(jLabel10)
                                    .addComponent(p3opcA1)
                                    .addComponent(p3opcC1)
                                    .addComponent(p3opcB1)))
                            .addComponent(p5opcA)
                            .addComponent(p5opcC)
                            .addComponent(p5opcB)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(p1opcA1)
                            .addComponent(p1opcC1)
                            .addComponent(p1opcB1)
                            .addComponent(p4opcA1)
                            .addComponent(p4opcC1)
                            .addComponent(p4opcB1)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(p2opcA1)
                            .addComponent(p2opcC1)
                            .addComponent(p2opcB1)
                            .addComponent(p5opcA1)
                            .addComponent(p5opcC1)
                            .addComponent(p5opcB1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegresar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btnIniciar)))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTerminar)
                                .addGap(38, 38, 38))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTerminar)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p1opcA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p1opcB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p1opcC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p2opcA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p2opcB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p2opcC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p3opcA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p3opcB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p3opcC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p5opcA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p5opcB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p5opcC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p4opcA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p4opcB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p4opcC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p1opcA1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p1opcB1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p1opcC1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p2opcA1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p2opcB1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p2opcC1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p3opcA1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p3opcB1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p3opcC1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p4opcA1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p4opcB1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p4opcC1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p5opcA1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p5opcB1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p5opcC1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1opcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1opcBActionPerformed

    }//GEN-LAST:event_p1opcBActionPerformed

    private void p1opcAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1opcAActionPerformed

    }//GEN-LAST:event_p1opcAActionPerformed

    private void p2opcAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2opcAActionPerformed

    }//GEN-LAST:event_p2opcAActionPerformed

    private void p2opcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2opcBActionPerformed

    }//GEN-LAST:event_p2opcBActionPerformed

    private void p3opcAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3opcAActionPerformed

    }//GEN-LAST:event_p3opcAActionPerformed

    private void p3opcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3opcBActionPerformed

    }//GEN-LAST:event_p3opcBActionPerformed

    private void p4opcAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4opcAActionPerformed

    }//GEN-LAST:event_p4opcAActionPerformed

    private void p4opcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4opcBActionPerformed

    }//GEN-LAST:event_p4opcBActionPerformed

    private void p5opcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5opcBActionPerformed

    }//GEN-LAST:event_p5opcBActionPerformed

    private void p5opcAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5opcAActionPerformed

    }//GEN-LAST:event_p5opcAActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        File archivo = new File("QUIZ1.txt");

        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));

            String linea = leer.readLine();
            while (linea != null) {
                txtQuiz.append(linea + "\n");
                linea = leer.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        File archivo2 = new File("QUIZ2.txt");
        
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo2));

            String linea = leer.readLine();
            while (linea != null) {
                txtQuiz1.append(linea + "\n");
                linea = leer.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void p1opcA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1opcA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1opcA1ActionPerformed

    private void p1opcB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1opcB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1opcB1ActionPerformed

    private void p4opcA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4opcA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4opcA1ActionPerformed

    private void p4opcB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4opcB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4opcB1ActionPerformed

    private void p5opcB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5opcB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5opcB1ActionPerformed

    private void p5opcA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5opcA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5opcA1ActionPerformed

    private void p2opcB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2opcB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2opcB1ActionPerformed

    private void p2opcA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2opcA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2opcA1ActionPerformed

    private void p3opcA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3opcA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3opcA1ActionPerformed

    private void p3opcB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3opcB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3opcB1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIniciar;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnTerminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JRadioButton p1opcA;
    public javax.swing.JRadioButton p1opcA1;
    public javax.swing.JRadioButton p1opcB;
    public javax.swing.JRadioButton p1opcB1;
    public javax.swing.JRadioButton p1opcC;
    public javax.swing.JRadioButton p1opcC1;
    public javax.swing.JRadioButton p2opcA;
    public javax.swing.JRadioButton p2opcA1;
    public javax.swing.JRadioButton p2opcB;
    public javax.swing.JRadioButton p2opcB1;
    public javax.swing.JRadioButton p2opcC;
    public javax.swing.JRadioButton p2opcC1;
    public javax.swing.JRadioButton p3opcA;
    public javax.swing.JRadioButton p3opcA1;
    public javax.swing.JRadioButton p3opcB;
    public javax.swing.JRadioButton p3opcB1;
    public javax.swing.JRadioButton p3opcC;
    public javax.swing.JRadioButton p3opcC1;
    public javax.swing.JRadioButton p4opcA;
    public javax.swing.JRadioButton p4opcA1;
    public javax.swing.JRadioButton p4opcB;
    public javax.swing.JRadioButton p4opcB1;
    public javax.swing.JRadioButton p4opcC;
    public javax.swing.JRadioButton p4opcC1;
    public javax.swing.JRadioButton p5opcA;
    public javax.swing.JRadioButton p5opcA1;
    public javax.swing.JRadioButton p5opcB;
    public javax.swing.JRadioButton p5opcB1;
    public javax.swing.JRadioButton p5opcC;
    public javax.swing.JRadioButton p5opcC1;
    public javax.swing.JTextArea txtQuiz;
    public javax.swing.JTextArea txtQuiz1;
    // End of variables declaration//GEN-END:variables
}
