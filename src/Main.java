import com.POO.classe.Exemple;
import com.POO.classe.Habitation;

public class Main {
    public static void main(String[] args) {

        Habitation test = new Habitation("maison",50.56, 100.57);
        System.out.println("L'habitation: "+ test.nom + " mesure: " + test.surface() + " m2");
    }
}
