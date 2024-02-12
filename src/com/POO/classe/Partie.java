package com.POO.classe;

public class Partie {
    public Personnages joueur1;
    public Personnages joueur2;
    public int nbrTour;
    public Partie(Personnages joueur1,Personnages joueurs2,int nbrTour){
        this.joueur1 = joueur1;
        this.joueur2 = joueurs2;
        this.nbrTour = nbrTour;
    }

    public Personnages getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnages joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnages getJoueurs2() {
        return joueur2;
    }

    public void setJoueurs2(Personnages joueurs2) {
        this.joueur2 = joueurs2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    public String lancerPartie(){
        while (nbrTour > 0) {
            joueur1.attaquer(joueur2);
            joueur2.attaquer(joueur1);
            nbrTour --;

            if(joueur1.getVie() <= 0){
                System.out.println("Le joueurs 1 " + joueur1.getNom() + " n'a plus de vie ");
            }else if(joueur2.getVie() <=0){
                System.out.println("Le joueurs 2 " + joueur2.getNom() + " n'a plus de vie ");
            }

        }
        return "";
    }
}
