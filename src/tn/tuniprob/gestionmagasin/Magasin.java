package tn.tuniprob.gestionmagasin;
public class Magasin {
    public int id;
    public String adresse;
    public int capaciteMax;
    public Produit[] produits;
    public int nombreProduits;
    public static int totalProduits = 0; 
    public Magasin(int id, String adresse, int capaciteMax) {
        this.id = id;
        this.adresse = adresse;
        this.capaciteMax = capaciteMax;
        this.produits = new Produit[50]; 
        this.nombreProduits = 0;         
    }

    public void ajouterProduit(Produit produit) {
        if (nombreProduits < 50) {  
            produits[nombreProduits] = produit;  
            nombreProduits++;  
            totalProduits++;   
        } else {
            System.out.println("Le magasin a atteint la capacité maximale de 50 produits.");
        }
    }

    public void afficherMagasin() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité maximale: " + capaciteMax);
        System.out.println("Produits dans le magasin:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println(produits[i]);  
        }
    }

    public static int getTotalProduits() {
        return totalProduits;
    }
}
