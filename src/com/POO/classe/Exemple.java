package com.POO.classe;

public class Exemple {
    public String nom;
    public String prenom;
    public Exemple(){};
    public Exemple(String lastname,String firstname){
        this.nom = lastname;
        this.prenom = firstname;
    }
    public String toString(){
      return this.nom + " " + this.prenom;
    }
}
