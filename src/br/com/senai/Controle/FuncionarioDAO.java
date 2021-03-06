/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.Controle;

import br.com.Util.HibernateUtil;
import br.com.senai.Entidades.Funcao;
import br.com.senai.Entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author TECNICO NOITE
 */
public class FuncionarioDAO {

    public static int ID_LOGIN;

    Session sessao;

    public boolean salvar(Funcionario funcionario) {
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();

            sessao.beginTransaction();

            sessao.save(funcionario);

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

     public List<Funcionario> selecionaFuncionario() {

        List<Funcionario> listaFuncionario = new ArrayList<>();

        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        //Cria criterios ou filtros ou condições de seleção.
        Criteria criteria = sessao.createCriteria(Funcionario.class);
        
        //Retorna os dados da consulta com o banco de dados.
        listaFuncionario = criteria.list();

        return listaFuncionario;
//
    }
      public boolean alterar(Funcionario funcionario) {
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();

            sessao.beginTransaction();

            sessao.update(funcionario);

            sessao.getTransaction().commit();

            System.out.println("updatado com sucesso");
            return true;

        } catch (Exception ex) {

            System.out.println("Erro" + ex);
            return false;

        } finally {
            sessao.close();
        }
    }
     
     public void CalculoHoraExtra(Long HoraDia,int id){
         
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        //Cria criterios ou filtros ou condições de seleção.
        Criteria criteria = sessao.createCriteria(Funcionario.class);
        criteria.add(Restrictions.eq("id",id));
        
        Funcionario funcionario = (Funcionario) criteria.uniqueResult();
        
        long HoraExtra = HoraDia-540;
        
        if(HoraExtra>0){
            
            funcionario.setHrAcumulada(funcionario.getHrAcumulada()+ HoraExtra);
            
        }else if(HoraExtra<0){
            
            funcionario.setHrAcumulada(funcionario.getHrAcumulada()+ HoraExtra);
           
        } else{
            
            funcionario.setHrAcumulada(funcionario.getHrAcumulada());
            
        }
         
         alterar(funcionario);
     }
     
     

}
