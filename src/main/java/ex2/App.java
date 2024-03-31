package ex2;


import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MetierProduitImpl metierProduit = new MetierProduitImpl();

        // Menu
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nMenu :");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter ce programme");
            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    afficherListeProduits(metierProduit);
                    break;
                case 2:
                    rechercherProduitParId(metierProduit, scanner);
                    break;
                case 3:
                    ajouterProduit(metierProduit, scanner);
                    break;
                case 4:
                    supprimerProduitParId(metierProduit, scanner);
                    break;
                case 5:
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 5);
    }

    // Méthode pour afficher la liste des produits
    private static void afficherListeProduits(MetierProduitImpl metierProduit) {
        List<Produit> produits = metierProduit.getAll();
        System.out.println("Liste des produits :");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }

    // Méthode pour rechercher un produit par son id
    private static void rechercherProduitParId(MetierProduitImpl metierProduit, Scanner scanner) {
        System.out.print("Entrez l'ID du produit à rechercher : ");
        long id = scanner.nextLong();
        Produit product = (Produit) metierProduit.findById(id);
        if (product != null) {
            System.out.println("Produit trouvé : " + product);
        } else {
            System.out.println("Aucun produit trouvé avec l'ID " + id);
        }
    }

    // Méthode pour ajouter un nouveau produit
    private static void ajouterProduit(MetierProduitImpl metierProduit, Scanner scanner) {
        System.out.println("Ajout d'un nouveau produit :");
        System.out.print("ID : ");
        long id = scanner.nextLong();
        scanner.nextLine(); // Consommer le saut de ligne
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Marque : ");
        String marque = scanner.nextLine();
        System.out.print("Prix : ");
        double prix = scanner.nextDouble();
        scanner.nextLine(); // Consommer le saut de ligne
        System.out.print("Description : ");
        String description = scanner.nextLine();
        System.out.print("Nombre en stock : ");
        int nombreEnStock = scanner.nextInt();

        Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreEnStock);
        metierProduit.add(nouveauProduit);
        System.out.println("Nouveau produit ajouté : " + nouveauProduit);
    }

    // Méthode pour supprimer un produit par son id
    private static void supprimerProduitParId(MetierProduitImpl metierProduit, Scanner scanner) {
        System.out.print("Entrez l'ID du produit à supprimer : ");
        long id = scanner.nextLong();
        metierProduit.delete(id);
        System.out.println("Produit avec l'ID " + id + " supprimé.");
    }
}

