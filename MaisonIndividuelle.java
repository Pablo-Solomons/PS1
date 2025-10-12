public class MaisonIndividuelle extends Maison {
    private double superficieTerrain;
    private boolean garage;
    private boolean jardin;
    private int nombreEtages;

    public MaisonIndividuelle(String adresse, double superficie, int nombrePieces,
                              double prix, double superficieTerrain, boolean garage,
                              boolean jardin, int nombreEtages) {
        super(adresse, superficie, nombrePieces, prix);
        this.superficieTerrain = superficieTerrain;
        this.garage = garage;
        this.jardin = jardin;
        this.nombreEtages = nombreEtages;
    }

    @Override
    public String getType() {
        return "Maison Individuelle";
    }

    @Override
    public double calculerTaxeFonciere() {
        double base = superficie * 12;
        base += superficieTerrain * 5;
        if (garage) base += 300;
        if (jardin) base += 200;
        return base;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Superficie terrain: " + superficieTerrain + " m²");
        System.out.println("Garage: " + (garage ? "Oui" : "Non"));
        System.out.println("Jardin: " + (jardin ? "Oui" : "Non"));
        System.out.println("Nombre d'étages: " + nombreEtages);
    }
}
