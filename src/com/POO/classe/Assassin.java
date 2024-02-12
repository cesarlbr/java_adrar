package com.POO.classe;

public class Assassin extends Personnages{
    private int bonusAttaque;
    public Assassin(String nom, int vie, int attaque,int defence, int bonusAttaque){
        super(nom,vie,attaque,defence);
        this.bonusAttaque = bonusAttaque;
    }

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    public int attaquer(Personnages cible){
        double chanceCritque = Math.random();
        if(chanceCritque <= 0.25){
            int degats = this.getAttaque() + this.bonusAttaque - cible.getDefence();
            cible.setVie(cible.getVie() - degats);
            if(degats > 0){
                cible.setVie(cible.getVie() - degats);
                System.out.println("Coup critique ! Le personnage " + this.getNom() + " attaque la cible " + cible.getNom() + " et lui inflige " + degats + " points de dégâts.");
            }else{
                System.out.println("Coup critique ! Le personnage " + this.getNom() + " attaque la cible " + cible.getNom() + " mais ses attaques sont inefficaces.");
            }
        }else{
            super.attaquer(cible);
        }
        return 0;
    }
}
