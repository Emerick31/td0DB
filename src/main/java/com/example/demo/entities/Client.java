package com.example.demo.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name = "nom")
    private  String Nom;

    @Column(name = "prenom")
    private String Prenom;

    @Column(name = "adresseId")
    private int AdresseId;

    @Column(name = "telephone")
    private  int Telephone;

    @Column(name = "email")
    private String Email;

    @Column(name = "sexe")
    private String Sexe;

    @Column(name = "compteId")
    private int comptId;

    @Column(name = "numeroDeCompte")
    private int Numero;

    @Column(name = "salaire")
    private float Salaire;

    @Column(name = "statut")
    private String Statut;

    @Column(name = "anneeNaissance")
    private int AnneeNaissance;

    @Column(name = "nip")
    private int Nip;


    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public float getSalaire() {
        return Salaire;
    }

    public void setSalaire(float salaire) {
        Salaire = salaire;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String statut) {
        Statut = statut;
    }

    public int getAnneeNaissance() {
        return AnneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        AnneeNaissance = anneeNaissance;
    }

    public int getNip() {
        return Nip;
    }

    public void setNip(int nip) {
        Nip = nip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Numero=" + Numero +
                ", Prenom='" + Prenom + '\'' +
                '}';
    }
}

