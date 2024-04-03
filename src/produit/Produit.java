package produit;

public class Produit {
    private String nom;
    private Unite unite;

    public Produit(String nom, Unite unite) {
        this.nom = nom;
        this.unite = unite;
    }

    public String getNom() {
        return nom;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setDescription(String description) {
        // Méthode vide à remplir dans les sous-classes
    }

    public String decrireProduit() {
        // Méthode de description du produit
        return "Description du produit à définir dans les sous-classes.";
    }
}
