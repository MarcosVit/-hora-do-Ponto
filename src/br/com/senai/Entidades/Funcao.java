package br.com.senai.Entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Funcao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomeFuncao, tipoFuncao;
    @OneToMany(targetEntity = Funcionario.class)
    private Funcionario idFuncionario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFuncao() {
        return nomeFuncao;
    }

    public void setNomeFuncao(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    public String getTipoFuncao() {
        return tipoFuncao;
    }

    public void setTipoFuncao(String tipoFuncao) {
        this.tipoFuncao = tipoFuncao;
    }

}
