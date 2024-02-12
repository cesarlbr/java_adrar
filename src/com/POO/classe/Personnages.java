package com.POO.classe;

public class Personnages {
    private String nom;
    private int vie;
    private int attaque;
    private int defence;

    public Personnages() {}
    public Personnages(String nom, int vie, int attaque, int defence){
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defence = defence;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int attaquer(Personnages cible) {
        int degats = this.attaque - cible.getDefence();
        if (degats > 0) {
            cible.setVie(cible.getVie() - degats);
            System.out.println("Le personnage " + this.nom + " attaque la cible " + cible.getNom() + " et lui inflige " + degats + " points de dégâts.");
        } else {
            System.out.println("Le personnage " + this.nom + " attaque la cible " + cible.getNom() + " mais ses attaques sont inefficaces.");
        }
        return degats;
    }
}

