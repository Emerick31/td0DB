package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "compte")
public class Compte  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int compteId;

    @Column(name = "numeroDeCompte")
    private int Numero;

    @Column(name = "type")
    private String Type;

    @Column(name = "soldeInitial")
    private float SoldeInitial;

    @Column(name = "soldeActuel")
    private float SoldeActuel;

    @Column(name = "clientId")
    private int ClientId;


    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public float getSoldeInitial() {
        return SoldeInitial;
    }

    public void setSoldeInitial(float soldeInitial) {
        SoldeInitial = soldeInitial;
    }

    public float getSoldeActuel() {
        return SoldeActuel;
    }

    public void setSoldeActuel(float soldeActuel) {
        SoldeActuel = soldeActuel;
    }

    public int getCompteId() {
        return compteId;
    }

    public void setCompteId(int compteId) {
        this.compteId = compteId;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "Numero=" + Numero +
                ", Type='" + Type + '\'' +
                ", SoldeActuel=" + SoldeActuel +
                '}';
    }
}


