package com.dam.dam_distributeur;

import java.util.ArrayList;

public class CartModel {
    /** Classe qui contient une sous-liste de produits
     *
     */
    private ArrayList<String> cart = new ArrayList(); // TODO liste de ProductModel

    public void addProduct(String productModel){ // TODO ProductModel
        cart.add(productModel);
    }
    public void emptyCart(){
        cart.clear();
    }

    public CartModel() {
    }
}
