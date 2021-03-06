/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.senai.view;

import br.com.senai.Controle.FuncaoDAO;
import br.com.senai.Controle.FuncionarioDAO;
import br.com.senai.Controle.PontoDAO;
import br.com.senai.Entidades.DiaCorrente;
import br.com.senai.Entidades.Funcao;
import br.com.senai.Entidades.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNICO
 */
public class TelaRegistraPonto extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaRegistraPonto
     */
    public TelaRegistraPonto() {
        
        initComponents();
        preencheComboBoxFuncionario();
    }
    private void preencheComboBoxFuncionario() {
        

        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> listaFuncionario = dao.selecionaFuncionario();

        for (Funcionario funcionario : listaFuncionario) {

            jComboBoxFuncionario.addItem(funcionario);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxFuncionario = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonCancelarPonto = new javax.swing.JButton();
        jButtonSalvarPonto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldHrEntrada = new javax.swing.JFormattedTextField();
        jTextFieldData1 = new javax.swing.JFormattedTextField();
        jTextFieldHrSaida = new javax.swing.JFormattedTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setClosable(true);
        setResizable(false);
        setTitle("Registro de Ponto");
        setMaximumSize(new java.awt.Dimension(360, 400));
        setMinimumSize(new java.awt.Dimension(360, 400));
        setPreferredSize(new java.awt.Dimension(360, 400));

        jPanel1.setBackground(new java.awt.Color(217, 191, 115));
        jPanel1.setMaximumSize(new java.awt.Dimension(360, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senai/imagens/RegPont.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N
        jLabel2.setText("Funcionário:");

        jComboBoxFuncionario.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N
        jLabel3.setText("Hora da Entrada:");

        jLabel4.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N
        jLabel4.setText("Hora da Saída:");

        jButtonCancelarPonto.setBackground(new java.awt.Color(102, 76, 0));
        jButtonCancelarPonto.setFont(new java.awt.Font("Sakkal Majalla", 0, 25)); // NOI18N
        jButtonCancelarPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senai/imagens/cancel.png"))); // NOI18N
        jButtonCancelarPonto.setText("Cancelar");
        jButtonCancelarPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarPontoActionPerformed(evt);
            }
        });

        jButtonSalvarPonto.setBackground(new java.awt.Color(102, 76, 0));
        jButtonSalvarPonto.setFont(new java.awt.Font("Sakkal Majalla", 0, 25)); // NOI18N
        jButtonSalvarPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senai/imagens/save.png"))); // NOI18N
        jButtonSalvarPonto.setText("Salvar");
        jButtonSalvarPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarPontoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N
        jLabel5.setText("Data:");

        jTextFieldHrEntrada.setBackground(new java.awt.Color(242, 233, 208));
        try {
            jTextFieldHrEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldHrEntrada.setToolTipText("");
        jTextFieldHrEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldHrEntrada.setPreferredSize(new java.awt.Dimension(6, 20));
        jTextFieldHrEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHrEntradaActionPerformed(evt);
            }
        });

        jTextFieldData1.setBackground(new java.awt.Color(242, 233, 208));
        try {
            jTextFieldData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldData1.setToolTipText("");
        jTextFieldData1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldData1.setPreferredSize(new java.awt.Dimension(6, 20));
        jTextFieldData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldData1ActionPerformed(evt);
            }
        });

        jTextFieldHrSaida.setBackground(new java.awt.Color(242, 233, 208));
        try {
            jTextFieldHrSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldHrSaida.setToolTipText("");
        jTextFieldHrSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldHrSaida.setPreferredSize(new java.awt.Dimension(6, 20));
        jTextFieldHrSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHrSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvarPonto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelarPonto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldData1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldHrEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldHrSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldHrEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldHrSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldData1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarPonto)
                    .addComponent(jButtonCancelarPonto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarPontoActionPerformed
        // TODO add your handling code here:
        Funcionario func = (Funcionario) jComboBoxFuncionario.getSelectedItem();
        FuncionarioDAO dao = new FuncionarioDAO();
        DiaCorrente dc = new DiaCorrente();
        PontoDAO daodc = new PontoDAO();
        
        dc.setData(jTextFieldHrEntrada.getText());
        dc.setFuncionario(func);
        dc.setHrEntrada(jTextFieldHrEntrada.getText());
        dc.setHrSaida(jTextFieldHrSaida.getText());
        dc.setMinContados(daodc.cauculaHoraAcumulada(jTextFieldHrEntrada.getText(), jTextFieldHrSaida.getText()));
        dc.setStatus(daodc.escolheStatus(daodc.cauculaHoraAcumulada(jTextFieldHrEntrada.getText(), jTextFieldHrSaida.getText())));
        dao.CalculoHoraExtra(dc.getMinContados(), func.getId());
        
        if(daodc.salvar(dc)){
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
            dc.setFuncionario(func);
            jTextFieldData1.setText("");
            jTextFieldHrEntrada.setText("");
           jTextFieldHrSaida.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"Falha ao salvar!");
        }
    }//GEN-LAST:event_jButtonSalvarPontoActionPerformed

    private void jButtonCancelarPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarPontoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelarPontoActionPerformed

    private void jTextFieldHrEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHrEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHrEntradaActionPerformed

    private void jTextFieldData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldData1ActionPerformed

    private void jTextFieldHrSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHrSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHrSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarPonto;
    private javax.swing.JButton jButtonSalvarPonto;
    private javax.swing.JComboBox jComboBoxFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField jTextFieldData1;
    private javax.swing.JFormattedTextField jTextFieldHrEntrada;
    private javax.swing.JFormattedTextField jTextFieldHrSaida;
    // End of variables declaration//GEN-END:variables
}
