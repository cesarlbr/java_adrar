import com.POO.classe.*;

public class Main {
    public static void main(String[] args) {

        //Habitation test = new Habitation("maison",50.56, 100.57, 5);
        //System.out.println("L'habitation: "+ test.nom + " mesure: " + test.surface() + " m2");
        //Vehicule voiture = new Vehicule("Audi", 4, 300);
        //Vehicule moto = new Vehicule("Kawasaki", 2, 300);
        //Vehicule tracteur = new Vehicule("Caterpillar", 6, 30);
        //Personnages nain = new Personnages("gérard", 20, 5, 2);
        //Personnages geant = new Personnages("toto", 30, 7, 4);

        Personnages joueur1 = new Assassin("joueur1",50,25,10,10);
        Personnages joueur2 = new Guerrier("joueur2",100,20,8,5);
        int nbrTour = 5;
        //nain.attaquer(geant);
        Partie partie = new Partie(joueur1,joueur2,nbrTour);
        String resultat = partie.lancerPartie();
        System.out.println(resultat);

        //voiture.detect();
        //voiture.getType();
        //System.out.println(voiture.getType());
        //System.out.println("Le véhicule : " + voiture.getNom() + " possede une vitesse de : " + voiture.getVitesse() + " nombre de roues : " + voiture.getNbrRoue());
        //String enginPlusRapide = voiture.plusRapide(moto);
        //System.out.println("Engin le plus rapide : " + enginPlusRapide + " et possede une vitesse de " + ((enginPlusRapide.equals(voiture.getNom())) ? voiture.getVitesse() : moto.getVitesse()) + " km/h.");
        //System.out.println(nain.attaquer(geant));

    }
}
