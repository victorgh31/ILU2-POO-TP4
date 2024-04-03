package produit;

public class Sanglier extends Produit {
	private int poids;
	private String chasseur;

	public Sanglier(int poids, String chasseur) {
	   super("sanglier");
	   this.poids = poids;
	   this.chasseur = chasseur;
	}
	
	@Override
	public String description() {
	   return "Sanglier de " + poids + " kg chassé par " + chasseur + ".";
	}
}