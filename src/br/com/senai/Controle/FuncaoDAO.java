/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.Controle;

import br.com.Util.HibernateUtil;
import br.com.senai.Entidades.Funcao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

/**
 *
 * @author TECNICO NOITE
 */
public class FuncaoDAO {
    Session sessao;
    public boolean salvarFuncao(Funcao func) {

        try {

            sessao = HibernateUtil.getSessionFactory().openSession();

            sessao.beginTransaction();

            sessao.save(func);

            sessao.getTransaction().commit();

            System.out.println("Deu bom");
            return true;

        } catch (HibernateException ex) {

            System.out.println("Erro" + ex);
            return false;

        } finally {

            sessao.close();

        }
    }
    
    public List<Funcao> selecionaFuncao() {

        List<Funcao> listaFuncionario = new ArrayList<>();

        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        //Cria criterios ou filtros ou condições de seleção.
        Criteria criteria = sessao.createCriteria(Funcao.class);
        
        //Retorna os dados da consulta com o banco de dados.
        listaFuncionario = criteria.list();

        return listaFuncionario;

    }

}
