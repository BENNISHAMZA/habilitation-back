package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {
    @Id
    private String Matricule;
    private String Nom;
    private String Prenom;
    private String Profil;
    private String Entite;
    private String Niveau;
    private String Parcours;

    public Agent() {
    }

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
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

    public String getProfil() {
        return Profil;
    }

    public void setProfil(String profil) {
        Profil = profil;
    }

    public String getEntite() {
        return Entite;
    }

    public void setEntite(String entite) {
        Entite = entite;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setNiveau(String niveau) {
        Niveau = niveau;
    }

    public String getParcours() {
        return Parcours;
    }

    public void setParcours(String parcours) {
        Parcours = parcours;
    }
}
