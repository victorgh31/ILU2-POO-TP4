package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal<T extends IProduit> {
    private Gaulois vendeur;
    private T[] produits;
    private int nbProduit;
    private double prixProduit;

    // Constructeur
    public Etal(Gaulois vendeur, T[] produits, int nbProduit, double prixProduit) {
        this.vendeur = vendeur;
        this.produits = produits;
        this.nbProduit = nbProduit;
        this.prixProduit = prixProduit;
    }

    // Getters et Setters
    public Gaulois getVendeur() {
        return vendeur;
    }

    public void setVendeur(Gaulois vendeur) {
        this.vendeur = vendeur;
    }

    public T[] getProduits() {
        return produits;
    }

    public void setProduits(T[] produits) {
        this.produits = produits;
    }

    public int getNbProduit() {
        return nbProduit;
    }

    public void setNbProduit(int nbProduit) {
        this.nbProduit = nbProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }
    
    
    public void installerVendeur(Gaulois vendeur, T[] produits, double prix) {
        this.vendeur = vendeur;
        this.produits = produits;
        this.nbProduit = produits.length;
        this.prixProduit = prix;
    }

}
