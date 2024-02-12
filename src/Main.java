import com.POO.classe.Exemple;
import com.POO.classe.Habitation;
import com.POO.classe.Vehicule;
public class Main {
    public static void main(String[] args) {

        //Habitation test = new Habitation("maison",50.56, 100.57, 5);
        //System.out.println("L'habitation: "+ test.nom + " mesure: " + test.surface() + " m2");
        Vehicule voiture = new Vehicule("Audi",4,250 );
        Vehicule moto = new Vehicule("Kawasaki", 2 , 300);
        Vehicule tracteur = new Vehicule("Caterpillar",6,30);


        voiture.detect();
        voiture.getType();
        System.out.println(voiture.getType());
        System.out.println("Le véhicule : " + voiture.getNom() + " possede une vitesse de : " + voiture.getVitesse() + " nombre de roues : " + voiture.getNbrRoue());
    }
}
