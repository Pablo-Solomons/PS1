public class Penthouse extends Appartement {
    private double superficieTerrasse;
    private boolean jacuzzi;
    private boolean vuePanoramique;

    public Penthouse(String adresse, double superficie, int nombrePieces,
                     double prix, int etage, double chargesMensuelles,
                     double superficieTerrasse, boolean jacuzzi, boolean vuePanoramique) {
        super(adresse, superficie, nombrePieces, prix, etage, true, chargesMensuelles);
        this.superficieTerrasse = superficieTerrasse;
        this.jacuzzi = jacuzzi;
        this.vuePanoramique = vuePanoramique;
    }

    @Override
    public String getType() {
        return "Penthouse";
    }

    @Override
    public double calculerTaxeFonciere() {
        double base = super.calculerTaxeFonciere();
        // Majoration pour penthouse
        base += superficieTerrasse * 15;
        if (jacuzzi) base += 500;
        if (vuePanoramique) base += 300;
        return base;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Superficie terrasse: " + superficieTerrasse + " m²");
        System.out.println("Jacuzzi: " + (jacuzzi ? "Oui" : "Non"));
        System.out.println("Vue panoramique: " + (vuePanoramique ? "Oui" : "Non"));
        System.out.println("Superficie totale: " + (superficie + superficieTerrasse) + " m²");
    }

    public double getSuperficieTotale() {
        return superficie + superficieTerrasse;
    }
}
