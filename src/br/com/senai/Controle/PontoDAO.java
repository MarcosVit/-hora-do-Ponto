/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.Controle;

import br.com.senai.Entidades.DiaCorrente;
import br.com.senai.Entidades.Funcionario;
import br.com.Util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author TECNICO NOITE
 */
public class PontoDAO {
     Session sessao;

    public boolean salvar(DiaCorrente Dc) {
        try {
            //Abre a sessao      
            sessao = HibernateUtil.getSessionFactory().openSession();
            //Inicia uma transação com o banco de dados
            sessao.beginTransaction();
            //Insere no banco de dados o registro
            sessao.save(Dc);
            //Pega a transição corrente e confirma a seção(nesse caso o insert)
            sessao.getTransaction().commit();

            System.out.println("Salvo com sucesso");
            return true;

        } catch (Exception ex) {

            System.out.println("Erro" + ex);
            return false;

        } finally {
            sessao.close();
        }
}
    public long cauculaHoraAcumulada(String horaEntrada, String horaSaida){
         //13:59
        
         
       Long num1E= Long.parseLong(horaEntrada.substring(0,2));
       Long num2E= Long.parseLong(horaEntrada.substring(3,5));
       
       Long caulculoE = num1E*60;
       Long resultadoEntrada = caulculoE +num2E;
       
       Long num1S= Long.parseLong(horaSaida.substring(0,2));
       Long num2S= Long.parseLong(horaSaida.substring(3,5));
       
       Long caulculoS = num1S*60;
       Long resultadoSaida = caulculoS +num2S;
       
Long resultado = resultadoSaida-resultadoEntrada;
        return resultado; 
     }
     
     public String escolheStatus(double horaAcumulada){
         String statusAtraso=null;
         if (horaAcumulada == 540) {
            statusAtraso = "Tempo correto";
        } else if (horaAcumulada > 540) {
            statusAtraso = "Hora extra";
        } else if (horaAcumulada < 540) {
            statusAtraso = "Atrasado";
        }
        return statusAtraso;
     }
    
}
