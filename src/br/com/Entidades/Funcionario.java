package br.com.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cpf, nome, funcao, login, senha;
    private double hrAcumulada;
    @ManyToOne(targetEntity = DiaCorrente.class)
    private DiaCorrente dc;

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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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

    public DiaCorrente getDc() {
        return dc;
    }

    public void setDc(DiaCorrente dc) {
        this.dc = dc;
    }
}