package com.POO.classe;

public class Vehicule {

    private String type;
    private String nom;
    private int nbrRoue;
    private int vitesse;
    public Vehicule(){};
    public Vehicule(String nom,int nbrRoue,int vitesse){
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
        this.type = this.detect();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
    public void boost(){
        this.vitesse += 50;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String detect(){
        if(nbrRoue == 4){
             return "Voiture";
        }else if (nbrRoue == 2) {
            return "moto";
        }else {
            return "autre";
        }
    }

    public String plusRapide(Vehicule autreVehicule){
        if (this.vitesse > autreVehicule.getVitesse()){
            return this.nom;
        } else if (this.vitesse < autreVehicule.getVitesse()) {
            return autreVehicule.getNom();
        }else{
            return "Les vehicules ont la même vitesse";
        }

    }


}
