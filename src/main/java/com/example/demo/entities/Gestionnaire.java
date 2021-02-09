package com.example.demo.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "gestionnaire")
public class Gestionnaire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "numeroBureau")
    private int NumeroBureau;

    @Column(name = "clientId")
    private int clientId;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroBureau() {
        return NumeroBureau;
    }

    public void setNumeroBureau(int numeroBureau) {
        NumeroBureau = numeroBureau;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getAdresseId() {
        return AdresseId;
    }

    public void setAdresseId(int adresseId) {
        AdresseId = adresseId;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String sexe) {
        Sexe = sexe;
    }

    @Override
    public String toString() {
        return "Gestionnaire{" +
                "NumeroBureau=" + NumeroBureau +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                '}';
    }
}
