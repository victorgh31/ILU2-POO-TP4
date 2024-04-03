package produit;

public class Produit {
	 private String nom;
	 //manque unité

	 public Produit(String nom) {
	     this.nom = nom;
	 }

	 public String getNom() {
	     return nom;
	 }

	 public String description() {
	     throw new UnsupportedOperationException("La méthode description doit être implémentée dans les sous-classes.");
	 }


 	public static void main(String[] args) {
 		Poisson poisson = new Poisson("mardi");
 		System.out.println(poisson.getNom()); // Sortie : poisson
 		System.out.println(poisson.description()); // Sortie : Poisson pêché mardi.

 		Sanglier sanglier = new Sanglier(15, "Obélix");
 		System.out.println(sanglier.getNom()); // Sortie : sanglier
 		System.out.println(sanglier.description()); // Sortie : Sanglier de 15.0 kg chassé par Obélix.
 	}
}
