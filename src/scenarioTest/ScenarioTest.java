package scenarioTest;

import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;

public class ScenarioTest {
	public static void main(String[] args) {
        Etal<?>[] marche = new Etal<?>[3]; // Utilisation de la classe Etal de manière générique

        Etal<Sanglier> etalSanglier = new Etal<>();
        Etal<Poisson> etalPoisson = new Etal<>();

        marche[0] = etalSanglier;
        marche[1] = etalPoisson;
        
    }
}