package produit;

public interface IProduit {

	String getNom();

	String description();

	String getUnite();
	
	double calculerPrix(int prix);
	
	void setUnite(String unite);

}