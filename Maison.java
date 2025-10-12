public abstract class Maison {
    protected String adresse;
    protected double superficie;
    protected int nombrePieces;
    protected double prix;

    // Constructeur
    public Maison(String adresse, double superficie, int nombrePieces, double prix) {
        this.adresse = adresse;
        this.superficie = superficie;
        this.nombrePieces = nombrePieces;
        this.prix = prix;
    }

    // Méthodes abstraites
    public abstract String getType();
    public abstract double calculerTaxeFonciere();

    // Méthodes concrètes
    public void afficherDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Adresse: " + adresse);
        System.out.println("Superficie: " + superficie + " m²");
        System.out.println("Nombre de pièces: " + nombrePieces);
        System.out.println("Prix: " + prix + " €");
        System.out.println("Taxe foncière: " + calculerTaxeFonciere() + " €");
    }

    // Getters et Setters
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public double getSuperficie() { return superficie; }
    public void setSuperficie(double superficie) { this.superficie = superficie; }

    public int getNombrePieces() { return nombrePieces; }
    public void setNombrePieces(int nombrePieces) { this.nombrePieces = nombrePieces; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
}