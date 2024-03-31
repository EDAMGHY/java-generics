package ex2;

public class Produit {
    private long id;
    private String nom;
    private double prix;
    private String description;
    private int nb_stock;
    private String marque;

    public Produit(long id, String nom, String marque, double prix, String description, int nb_stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nb_stock = nb_stock;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNb_stock() {
        return nb_stock;
    }

    public void setNb_stock(int nb_stock) {
        this.nb_stock = nb_stock;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "id " + id +
                ", nom=" + nom +
                ", prix=" + prix +
                ", description=" + description +
                ", nb_stock=" + nb_stock +
                ", marque=" + marque;
    }
}
