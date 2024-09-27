package tn.tuniprob.gestionmagasin;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dateExpiration1 = new Date(2024 - 1900, 9 - 1, 20); 
        Date dateExpiration2 = new Date(2024 - 1900, 10 - 1, 15);
        Date dateExpiration3 = new Date(2024 - 1900, 11 - 1, 5); 
        Produit produit1 = new Produit(1021, "Lait", "Delice", 0, dateExpiration1);
        Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0, dateExpiration2);
        Produit produit3 = new Produit(3250, "Tomate", "Sicam", 0, dateExpiration3);
        produit1.prix = 0.700;
        produit2.prix = 0.900;
        produit3.prix = 0.800;
        produit1.Afficher();
        produit2.Afficher();
        produit3.Afficher();
        System.out.println(produit1);
        System.out.println(produit2);
        System.out.println(produit3);
    }
}
