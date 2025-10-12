public class Studio extends Appartement {
    private boolean mezzanine;
    private boolean cuisineEquipee;

    public Studio(String adresse, double superficie, double prix, int etage,
                  boolean ascenseur, double chargesMensuelles, boolean mezzanine,
                  boolean cuisineEquipee) {
        super(adresse, superficie, 1, prix, etage, ascenseur, chargesMensuelles);
        this.mezzanine = mezzanine;
        this.cuisineEquipee = cuisineEquipee;
    }

    @Override
    public String getType() {
        return "Studio";
    }

    @Override
    public double calculerTaxeFonciere() {
        double base = super.calculerTaxeFonciere();
        // Réduction pour les studios
        return base * 0.8;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Mezzanine: " + (mezzanine ? "Oui" : "Non"));
        System.out.println("Cuisine équipée: " + (cuisineEquipee ? "Oui" : "Non"));
    }

    public boolean hasMezzanine() { return mezzanine; }
    public boolean hasCuisineEquipee() { return cuisineEquipee; }
}
