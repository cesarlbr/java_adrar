package com.POO.classe;

public class Habitation {
    public String nom;
    public Double longueur;
    public Double largeur;

    public Habitation(){};
    public Habitation(String nom, Double longueur, Double largeur){
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }
    public double surface(){
        return this.largeur * this.longueur;
    }
}
