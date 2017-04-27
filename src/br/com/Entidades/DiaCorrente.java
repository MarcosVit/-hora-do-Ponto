package br.com.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DiaCorrente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String status;
    private long hrEntrada, hrSaida, minContados;
    
    //Falta a chave estrangeira pegando o id do funcionário  
    
}
