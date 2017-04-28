/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import br.com.Entidades.DiaCorrente;
import br.com.Entidades.Funcionario;
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
    
}
