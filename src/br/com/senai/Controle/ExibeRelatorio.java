/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.senai.Controle;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author TECNICO
 */
public class ExibeRelatorio {
    
     public void geraRelatorio() {

        try {
            //Pesquisa o que é HashMap
            HashMap filtro = new HashMap();
            
            //Pega o relatorio
            InputStream inputStream = getClass().getResourceAsStream("/Relatorios/RelatorioConstrutora.jasper");
            
            //Tranforma o relatorio em algo do tipo JasperReport
            JasperReport relatorio = (JasperReport)JRLoader.loadObject(inputStream);
            
            //Desenhar ou recriar o relatorio
            JasperPrint print = JasperFillManager.fillReport(relatorio, filtro, getConexao());
            
            //Cria uma janela para exibir um relatorio
            JasperViewer view = new JasperViewer(print, false);
            
            //Deixa a janela visivel
            view.setVisible(true);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public Connection getConexao() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/horaponto", "root", "admin");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExibeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
