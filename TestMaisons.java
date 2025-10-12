import java.util.ArrayList;
import java.util.List;

public class TestMaisons {
    public static void main(String[] args) {
        List<Maison> maisons = new ArrayList<>();
        Maison[] proprietes = new Maison[4];

        proprietes[0] = new Studio("1 Rue A", 25, 150000, 2, true, 150, false, true);
        proprietes[1] = new Appartement("2 Rue B", 65, 3, 300000, 5, true, 200);
        proprietes[2] = new Penthouse("3 Rue C", 120, 4, 850000, 8, 500, 40, true, true);
        proprietes[3] = new MaisonIndividuelle("4 Rue D", 95, 5, 450000, 300, true, true, 2);

        // Le polymorphisme permet d'appeler les bonnes méthodes
        for (Maison maison : proprietes) {
            System.out.println("=== " + maison.getType() + " ===");
            System.out.println("Taxe: " + maison.calculerTaxeFonciere() + " €");
            // Chaque objet appelle SA propre implémentation de calculerTaxeFonciere()
        }
     /*   // Création de différentes maisons
        maisons.add(new Studio("123 Rue de Paris", 25.0, 150000, 2, true, 150, false, true));
        maisons.add(new Appartement("456 Avenue Victor Hugo", 65.0, 3, 300000, 5, true, 200));
        maisons.add(new Penthouse("789 Boulevard Saint-Germain", 120.0, 4, 850000, 8, 500, 40.0, true, true));
        maisons.add(new MaisonIndividuelle("321 Chemin des Roses", 95.0, 5, 450000, 300.0, true, true, 2));

        // Affichage des détails de toutes les maisons
        System.out.println("=== CATALOGUE DE MAISONS ===\n");

        for (Maison maison : maisons) {
            maison.afficherDetails();
            System.out.println("-----------------------------");
        }

        // Calcul du prix total
        double prixTotal = maisons.stream()
                .mapToDouble(Maison::getPrix)
                .sum();
        System.out.println("Prix total du catalogue: " + prixTotal + " €");*/
    }
}