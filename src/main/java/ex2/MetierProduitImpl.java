package ex2;

import java.util.List;
import java.util.ArrayList;

public class MetierProduitImpl implements IMetier {
    private List<Produit> products;

    public MetierProduitImpl() {
        this.products = new ArrayList<>();
    }

    public MetierProduitImpl(List<Produit> products) {
        this.products = products;
    }

    public void add(Object o) {
        this.products.add((Produit) o);
    }


    @Override
    public List getAll() {
        return this.products;
    }

    @Override
    public Object findById(long id) {
        for (Produit produit : this.products) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Produit produitToDelete = null;
        for (Produit produit : this.products) {
            if (produit.getId() == id) {
                produitToDelete = produit;
                break;
            }
        }
        if (produitToDelete != null) {
            this.products.remove(produitToDelete);
        }
    }
}
