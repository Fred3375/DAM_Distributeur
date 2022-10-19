package com.dam.dam_distributeur;

import javafx.fxml.FXML;

import java.util.ArrayList;

public class ProductModel {

    // ATTRIBUTS
    private int id;
    private String name;
    private Integer price; // NB en centimes !

    // SET GET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    // Constructors

    public ProductModel(int id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductModel() {
    }

    @Override
    public String toString(){
        return this.name;
    }

/*
    public ArrayList<ProductModel> search(String filters){
        // TODO
    }
*/
}