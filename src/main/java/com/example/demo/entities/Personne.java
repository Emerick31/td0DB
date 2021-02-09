package com.example.demo.entities;


public abstract class Personne {
    public  String Nom;
    public String Prenom;
    public adresse Adresse;
    public  int Telephone;
    public String Email;
    public String Sexe;



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

    public adresse getAdresse() {
        return Adresse;
    }

    public void setAdresse(adresse adresse) {
        adresse = adresse;
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
        return "Personne{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                '}';
    }
}

