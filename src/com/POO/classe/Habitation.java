package com.POO.classe;

public class Habitation {
    public String nom;
    public Double longueur;
    public Double largeur;
    private int nbrEtage;


    public Habitation(){};
    public Habitation(String nom, Double longueur, Double largeur, int nbrEtage){
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nbrEtage = nbrEtage;
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
    public int getNbrEtage(){
        return nbrEtage;
    }
    public void setNbrEtage(int nbrEtage){
        this.nbrEtage = nbrEtage;
    }
    public double surface(){
        return this.largeur * this.longueur * this.nbrEtage;
    }
}
