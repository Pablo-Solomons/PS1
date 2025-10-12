public class Appartement extends Maison {
    private int etage;
    private boolean ascenseur;
    private double chargesMensuelles;

    public Appartement(String adresse, double superficie, int nombrePieces,
                       double prix, int etage, boolean ascenseur, double chargesMensuelles) {
        super(adresse, superficie, nombrePieces, prix);
        this.etage = etage;
        this.ascenseur = ascenseur;
        this.chargesMensuelles = chargesMensuelles;
    }

    @Override
    public String getType() {
        return "Appartement";
    }

    @Override
    public double calculerTaxeFonciere() {
        double base = superficie * 10;
        if (ascenseur) {
            base += 200;
        }
        return base;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Étage: " + etage);
        System.out.println("Ascenseur: " + (ascenseur ? "Oui" : "Non"));
        System.out.println("Charges mensuelles: " + chargesMensuelles + " €");
    }

    // Getters spécifiques
    public int getEtage() { return etage; }
    public boolean hasAscenseur() { return ascenseur; }
    public double getChargesMensuelles() { return chargesMensuelles; }
}