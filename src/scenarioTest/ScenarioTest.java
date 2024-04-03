package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;


public class ScenarioTest {
	public static void main(String[] args) {
		
		// Créer des gaulois :
			Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
			Gaulois obelix = new Gaulois("Obélix",20);
			Gaulois asterix = new Gaulois("Asterix", 6);
			
		// Créer les tableaux de produits :
			Sanglier sanglier1 = new Sanglier(2000, obelix);
			Sanglier sanglier2 = new Sanglier(1500, obelix);
			Sanglier sanglier3 = new Sanglier(1000, asterix);
			Sanglier sanglier4 = new Sanglier(500, asterix);
			Sanglier[] sangliersObelix = {sanglier1, sanglier2};
			Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
			Poisson poisson1 = new Poisson("lundi");
			Poisson[] poissons = {poisson1};
			
		// Créer le marché :
			Etal<Sanglier> etalSanglier1 = new Etal<>(null, sangliersObelix, sangliersObelix.length, 8.0);
		    Etal<Sanglier> etalSanglier2 = new Etal<>(null, sangliersAsterix, sangliersAsterix.length, 10.0);
		    Etal<Poisson> etalPoisson = new Etal<>(null, poissons, poissons.length, 7.0);

		// Installer les vendeurs sur le marché :
	        etalSanglier1.installerVendeur(obelix, sangliersObelix, 8.0);
	        etalSanglier2.installerVendeur(asterix, sangliersAsterix, 10.0);
	        etalPoisson.installerVendeur(ordralfabetix, poissons, 7.0);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Etal[] marche = new Etal[3];
// 		// Etal is a raw type. References to generic type Etal<P> should be parameterized
//		Etal<Sanglier> etalSanglier = new Etal<>();
//		Etal<Poisson> etalPoisson = new Etal<>();
//		marche[0] = etalSanglier;
//		marche[1] = etalPoisson; 
		
//		IEtal<Produit>[] marche = new IEtal[3]; 
//		//The expression of type IEtal[] needs unchecked conversion to conform to IEtal<Sanglier>[]
//		Etal<Sanglier> etalSanglier = new Etal<>();
//		Etal<Poisson> etalPoisson = new Etal<>();
//		marche[0] = etalSanglier;
//		marche[1] = etalPoisson;
		
//        Etal<Sanglier> etalSanglier = new Etal<>();
//        // Modifier la déclaration de la variable "marche" pour préciser que ses étals acceptent uniquement des sangliers
//        Etal<Sanglier>[] marche = new Etal[3];
//        // Placer l'étal de sanglier sur le marché
//        marche[0] = etalSanglier; // Cela est possible car la variable "marche" accepte uniquement des étals de sanglier

//		IEtal[] etals = new IEtal[3];
//		Etal etalSanglier = new Etal();
//		etals[0] = etalSanglier;
//		etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);
		
//		c. Au final il n’y a donc aucun contrôle de type et un poisson sera stocké là où un
//		sanglier était attendu. Ainsi on peut vendre du poisson sur un étal de sanglier.


	}
	
}