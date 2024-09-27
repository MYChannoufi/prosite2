package tn.tuniprob.gestionmagasin;
import java.util.Date;

public class Produit {
    public int identifiant;
    public String libelle;
    public String marque;
    public double prix;
    public Date date_expiration; 
    public Produit(int identifiant, String libelle, String marque, double prix, Date date_expiration) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date_expiration = date_expiration; 
    }
    public void Afficher() {
        System.out.println("Identifiant: " + identifiant);
        System.out.println("Libellé: " + libelle);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
        System.out.println("Date d'expiration: " + date_expiration);
    }
    @Override
    public String toString() {
        return "Produit{" +
                "Identifiant=" + identifiant +
                ", Libellé='" + libelle + '\'' +
                ", Marque='" + marque + '\'' +
                ", Prix=" + prix +
                ", Date d'expiration=" + date_expiration + 
                '}';
    }
}
