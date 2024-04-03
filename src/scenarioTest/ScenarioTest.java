package scenarioTest;

import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
        IEtal<Produit>[] marche = new IEtal[3]; // Utilisation de la classe Etal de manière générique

        IEtal<Sanglier> etalSanglier = new Etal<>();
        IEtal<Poisson> etalPoisson = new Etal<>();

        marche[0] = etalSanglier;
        marche[1] = etalPoisson;
        
    }
}