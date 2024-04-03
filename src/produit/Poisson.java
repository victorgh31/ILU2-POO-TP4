package produit;

public class Poisson extends Produit {
    private String datePeche;

    public Poisson(String datePeche) {
        super("poisson", Unite.PAR_PIECE);
        this.datePeche = datePeche;
    }
    
    @Override
    public void setDescription(String datePeche) {
        this.datePeche = datePeche;
    }

    @Override
    public String decrireProduit() {
        return this.getNom() + " pêché " + datePeche + ".";
    }
}
