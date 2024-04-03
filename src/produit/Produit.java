package produit;

public class Produit implements IProduit {
    private String nom;
    private Unite unite;

    public Produit(String nom, Unite unite) {
        this.nom = nom;
        this.unite = unite;
    }

    @Override
	public String getNom() {
        return nom;
    }

    @Override
	public Unite getUnite() {
        return unite;
    }

    @Override
	public void setDescription(String description) {
        // Méthode vide à remplir dans les sous-classes
    }

    @Override
	public String decrireProduit() {
        // Méthode de description du produit
        return "Description du produit à définir dans les sous-classes.";
    }
}
