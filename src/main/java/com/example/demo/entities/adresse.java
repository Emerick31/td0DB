package com.example.demo.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "adresse")
public class adresse  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adresseId;

    @Column(name="numeroCivique")
    private  int NuméroCivique;

    @Column(name = "rue")
    private String Rue;

    @Column(name = "ville")
    private  String Ville;

    @Column(name = "codePostal")
    private  String CodePostal;

    public int getNuméroCivique() {
        return NuméroCivique;
    }

    public void setNuméroCivique(int numéroCivique) {
        NuméroCivique = numéroCivique;
    }

    public String getRue() {
        return Rue;
    }

    public void setRue(String rue) {
        Rue = rue;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String codePostal) {
        CodePostal = codePostal;
    }



}

