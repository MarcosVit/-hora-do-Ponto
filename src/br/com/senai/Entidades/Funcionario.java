package br.com.senai.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String cpf, nome, login, senha;

    private double hrAcumulada;

    
    @ManyToOne(targetEntity = Funcao.class)
    private Funcao idFuncao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getHrAcumulada() {
        return hrAcumulada;
    }

    public void setHrAcumulada(double hrAcumulada) {
        this.hrAcumulada = hrAcumulada;
    }

    public Funcao getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Funcao idFuncao) {
        this.idFuncao = idFuncao;
    }


    

   
    
}
