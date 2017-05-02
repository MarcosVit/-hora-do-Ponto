package br.com.senai.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DiaCorrente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String status;
    private long hrEntrada, hrSaida, minContados;
    @OneToMany(targetEntity = Funcionario.class)
    private Funcionario funcionario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getHrEntrada() {
        return hrEntrada;
    }

    public void setHrEntrada(long hrEntrada) {
        this.hrEntrada = hrEntrada;
    }

    public long getHrSaida() {
        return hrSaida;
    }

    public void setHrSaida(long hrSaida) {
        this.hrSaida = hrSaida;
    }

    public long getMinContados() {
        return minContados;
    }

    public void setMinContados(long minContados) {
        this.minContados = minContados;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
