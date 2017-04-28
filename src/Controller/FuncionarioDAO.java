/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import br.com.Util.HibernateUtil;
import br.com.Entidades.Funcionario;
import org.hibernate.Criteria;
import org.hibernate.Session;
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

    public boolean ValidarLogin(String login, String senha) {

        Funcionario listaFuncionario;

        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria criteria = sessao.createCriteria(Funcionario.class);

        criteria.add(Restrictions.eq("login", login)).add(Restrictions.eq("senha", senha));

        listaFuncionario = (Funcionario) criteria.uniqueResult();
        ID_LOGIN = listaFuncionario.getId();

        return listaFuncionario.getLogin().equals("");
    }

}
