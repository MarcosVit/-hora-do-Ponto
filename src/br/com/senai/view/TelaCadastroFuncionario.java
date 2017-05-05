/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.senai.view;

import br.com.senai.Controle.FuncaoDAO;
import br.com.senai.Controle.FuncionarioDAO;
import br.com.senai.Entidades.Funcao;
import br.com.senai.Entidades.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNICO
 */
public class TelaCadastroFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFuncionario() {
        initComponents();
        preencheComboBoxFuncao();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSalvarFuncionario = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldCadNomeFuncionario = new javax.swing.JTextField();
        jTextFieldCadCPFFuncionario = new javax.swing.JTextField();
        jComboBoxCadFuncaoFuncionario = new javax.swing.JComboBox();

        setClosable(true);
        setResizable(false);
        setTitle("Cadastro de Funcionário");
        setMaximumSize(new java.awt.Dimension(360, 400));
        setMinimumSize(new java.awt.Dimension(360, 400));
        setPreferredSize(new java.awt.Dimension(360, 400));

        jPanel1.setBackground(new java.awt.Color(217, 191, 115));
        jPanel1.setMaximumSize(new java.awt.Dimension(360, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senai/imagens/CadastFunc.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N
        jLabel4.setText("Função:");

        jButtonSalvarFuncionario.setBackground(new java.awt.Color(102, 76, 0));
        jButtonSalvarFuncionario.setFont(new java.awt.Font("Sakkal Majalla", 0, 25)); // NOI18N
        jButtonSalvarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senai/imagens/save.png"))); // NOI18N
        jButtonSalvarFuncionario.setText("Salvar");
        jButtonSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFuncionarioActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(102, 76, 0));
        jButtonCancelar.setFont(new java.awt.Font("Sakkal Majalla", 0, 25)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senai/imagens/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldCadNomeFuncionario.setBackground(new java.awt.Color(242, 233, 208));
        jTextFieldCadNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadNomeFuncionarioActionPerformed(evt);
            }
        });

        jTextFieldCadCPFFuncionario.setBackground(new java.awt.Color(242, 233, 208));
        jTextFieldCadCPFFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadCPFFuncionarioActionPerformed(evt);
            }
        });

        jComboBoxCadFuncaoFuncionario.setBackground(new java.awt.Color(242, 233, 208));
        jComboBoxCadFuncaoFuncionario.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCadCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCadNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCadFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonSalvarFuncionario)
                        .addGap(38, 38, 38)
                        .addComponent(jButtonCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCadNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCadCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxCadFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarFuncionario)
                    .addComponent(jButtonCancelar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCadNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadNomeFuncionarioActionPerformed

    private void jTextFieldCadCPFFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadCPFFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadCPFFuncionarioActionPerformed

    private void jButtonSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFuncionarioActionPerformed
        // TODO add your handling code here:
        Funcionario func = new Funcionario();
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcao funcao = (Funcao) jComboBoxCadFuncaoFuncionario.getSelectedItem();
        
        func.setCpf(jTextFieldCadCPFFuncionario.getText());
        
        func.setNome(jTextFieldCadNomeFuncionario.getText());
        func.setIdFuncao(funcao);
        
        if(dao.salvar(func)){
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
            jTextFieldCadCPFFuncionario.setText("");
            jTextFieldCadNomeFuncionario.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"Falha ao salvar!");
        }
        
        
        
    }//GEN-LAST:event_jButtonSalvarFuncionarioActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed
private void preencheComboBoxFuncao() {

        FuncaoDAO dao = new FuncaoDAO();
        List<Funcao> listaFuncao = dao.selecionaFuncao();

        for (Funcao funcao : listaFuncao) {

            jComboBoxCadFuncaoFuncionario.addItem(funcao);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvarFuncionario;
    private javax.swing.JComboBox jComboBoxCadFuncaoFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCadCPFFuncionario;
    private javax.swing.JTextField jTextFieldCadNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}
