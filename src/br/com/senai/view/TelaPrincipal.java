/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.senai.view;

import br.com.senai.Controle.ExibeRelatorio;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        //telaLogin();
        customizeMenuBar(jMenuBar1);
        teste();
    }
    
    // ----------- METODO PARA TROCAR A COR DA BARRA DE MENU ------------- //
    private void customizeMenuBar(JMenuBar menuBar) {

        menuBar.setUI(new BasicMenuBarUI() {

            Color myColor = new Color(192,149,23);

            @Override
            public void paint(Graphics g, JComponent c) {
                g.setColor(myColor);
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }

        });

        MenuElement[] menus = menuBar.getSubElements();

        for (MenuElement menuElement : menus) {

            JMenu menu = (JMenu) menuElement.getComponent();
            changeComponentColors(menu);
            menu.setOpaque(true);

            MenuElement[] menuElements = menu.getSubElements();

            for (MenuElement popupMenuElement : menuElements) {

                JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
                popupMenu.setBorder(null);

                MenuElement[] menuItens = popupMenuElement.getSubElements();

                for (MenuElement menuItemElement : menuItens) {

                    JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
                    changeComponentColors(menuItem);
                    menuItem.setOpaque(true);

                }
            }
        }
    }

    private void changeComponentColors(Component comp) {

        Color myCor = new Color(192,149,23);

        comp.setBackground(myCor);
        comp.setForeground(Color.BLACK);
    }
    
    private void teste(){
        setTitle("Sandslash Construtora");
        Frame frame = new Frame();
        frame.setResizable(false);
        boolean resizable = frame.isResizable();
    }
    
    /*private void telaLogin() {

        TelaLogin login = new TelaLogin();
        jLabel2.add(login);
        login.setVisible(true);
        login.setLocation(155,55);

    }*/
    
    private void telaAbout() {

        TelaAbout about = new TelaAbout();
        jLabel2.add(about);
        about.setVisible(true);
        about.setLocation(155,55);

    }
    
    private void telaCadastroFuncao() {

        TelaCadastroFuncao cadFuncao = new TelaCadastroFuncao();
        jLabel2.add(cadFuncao);
        cadFuncao.setVisible(true);
        cadFuncao.setLocation(155,5);

    }
    
    private void telaCadastroFuncionario() {

        TelaCadastroFuncionario cadFuncionario = new TelaCadastroFuncionario();
        jLabel2.add(cadFuncionario);
        cadFuncionario.setVisible(true);
        cadFuncionario.setLocation(155,5);

    }
    
    private void telaRegistrarPonto() {

        TelaRegistraPonto regPt = new TelaRegistraPonto();
        jLabel2.add(regPt);
        regPt.setVisible(true);
        regPt.setLocation(155,5);

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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadFuncionario = new javax.swing.JMenuItem();
        jMenuItemCadFuncao = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemRegPonto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemRelFuncio = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sandslash Construtora");
        setMaximumSize(new java.awt.Dimension(720, 450));
        setMinimumSize(new java.awt.Dimension(720, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 450));

        jPanel1.setBackground(new java.awt.Color(217, 191, 115));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 450));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senai/imagens/teste.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(192, 149, 23));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 76, 0), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jMenuBar1.setBackground(new java.awt.Color(217, 191, 115));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 76, 0), 3));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(50, 30));

        jMenu1.setText("Cadastro");
        jMenu1.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N
        jMenu1.setHideActionText(true);

        jMenuItemCadFuncionario.setFont(new java.awt.Font("Sakkal Majalla", 0, 15)); // NOI18N
        jMenuItemCadFuncionario.setText("Funcionário");
        jMenuItemCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadFuncionario);

        jMenuItemCadFuncao.setFont(new java.awt.Font("Sakkal Majalla", 0, 15)); // NOI18N
        jMenuItemCadFuncao.setText("Função");
        jMenuItemCadFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFuncaoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadFuncao);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Ponto");
        jMenu3.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N

        jMenuItemRegPonto.setFont(new java.awt.Font("Sakkal Majalla", 0, 15)); // NOI18N
        jMenuItemRegPonto.setText("Registrar");
        jMenuItemRegPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegPontoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemRegPonto);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Relatório");
        jMenu2.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N

        jMenuItemRelFuncio.setFont(new java.awt.Font("Sakkal Majalla", 0, 15)); // NOI18N
        jMenuItemRelFuncio.setText("Funcionário");
        jMenuItemRelFuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelFuncioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRelFuncio);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Opções");
        jMenu4.setFont(new java.awt.Font("Sakkal Majalla", 0, 20)); // NOI18N

        jMenuItemAbout.setFont(new java.awt.Font("Sakkal Majalla", 0, 15)); // NOI18N
        jMenuItemAbout.setText("About");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAbout);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRelFuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelFuncioActionPerformed
        /*Chamar Relatorio*/
        ExibeRelatorio exib = new ExibeRelatorio();
        
        exib.geraRelatorio();
    }//GEN-LAST:event_jMenuItemRelFuncioActionPerformed

    private void jMenuItemCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFuncionarioActionPerformed
        telaCadastroFuncionario();
    }//GEN-LAST:event_jMenuItemCadFuncionarioActionPerformed

    private void jMenuItemRegPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegPontoActionPerformed
        telaRegistrarPonto();
    }//GEN-LAST:event_jMenuItemRegPontoActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        telaAbout();
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    private void jMenuItemCadFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFuncaoActionPerformed
        telaCadastroFuncao();
    }//GEN-LAST:event_jMenuItemCadFuncaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemCadFuncao;
    private javax.swing.JMenuItem jMenuItemCadFuncionario;
    private javax.swing.JMenuItem jMenuItemRegPonto;
    private javax.swing.JMenuItem jMenuItemRelFuncio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
