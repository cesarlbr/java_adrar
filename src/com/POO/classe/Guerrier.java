package com.POO.classe;

public class Guerrier extends Personnages{
    private int bonusDefence;
    public Guerrier(String nom, int vie, int attaque,int defence, int bonusDefence){
        super(nom,vie,attaque,defence);
        this.bonusDefence = bonusDefence;
    }

    public int getBonusDefence() {
        return bonusDefence;
    }

    public void setBonusDefence(int bonusDefence) {
        this.bonusDefence = bonusDefence;
    }
    public int attaquer(Personnages cible){
        double chanceDefence = Math.random();
        if(chanceDefence <= 0.25){
            int degats = this.getAttaque() - (this.bonusDefence + cible.getDefence());
            cible.setVie(cible.getVie() - degats);
            if(degats > 0){
                cible.setVie(cible.getVie() - degats);
                System.out.println("Bonus defence ! Le personnage " + this.getNom() + " attaque la cible " + cible.getNom() + " et lui inflige " + degats + " points de dégâts.");
            }else{
                System.out.println("Bonus defence ! Le personnage " + this.getNom() + " attaque la cible " + cible.getNom() + " mais ses attaques sont inefficaces.");
            }
        }else{
            super.attaquer(cible);
        }
        return 0;
    }
}
