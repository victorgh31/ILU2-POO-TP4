package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal <P extends IProduit> implements IEtal{
    private Gaulois vendeur;
    private P[] produits;
    private int nbProduit;
    private int prixProduit;
    
    public void installerVendeur(Gaulois vendeur, P[] produits, int prixProduit) {
        this.vendeur = vendeur;
        this.produits = produits;
        nbProduit = produits.length;
        this.prixProduit = prixProduit;
    }
    

    public Gaulois getVendeur() {
        return vendeur;
    }
    
    @Override
	public double donnerPrix() {
		return prixProduit;
	}
    
	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		if (nbProduit != 0 && this.produits[0].getNom().equals(produit)) {
			if (nbProduit >= quantiteSouhaitee) {
				quantiteAVendre = quantiteSouhaitee;
			} else {
				quantiteAVendre = nbProduit;
			}
		}
		return quantiteAVendre;
	}
	
	@Override
	public double acheterProduit(int quantiteSouhaite) {
		double prixPaye = 0;
		for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaite - 1 || i > 1; i--) {
			prixPaye += produits[i].calculerPrix(prixProduit);
		}
		if (nbProduit >= quantiteSouhaite) {
			nbProduit -= quantiteSouhaite;
		} else {
			nbProduit = 0;
		}
		return prixPaye;
	}
	
	@Override
	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		if (nbProduit > 0) {
				chaine.append(" vend ");
				chaine.append(nbProduit + " produits :");
				for (int i = 0; i < nbProduit; i++) {
					chaine.append("\n- " + produits[i].description());
				}
		} else {
			chaine.append(" n'a plus rien à vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	}

}