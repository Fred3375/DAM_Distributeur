package com.dam.dam_distributeur;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class DistributorController {

    // Les modèles à manipuler
    private ArrayList<ProductModel> productModels;

    // Rem : le panier contient une liste de String ; TODO => Liste de Products
    private CartModel cartModel;

    // Les élément de la vue à manipuler
    @FXML
    private Label welcomeText;
    @FXML
    private VBox vbChart;
    @FXML
    private ComboBox cmbAddProduct;


    // CONSTRUCTEURS & CIE


    public DistributorController() {
    }

    @FXML
    public void initialize(){
        init();
    }

    // méthodes internes (privées)
    private void init(){
        // INIT MODELS
        // Simulation d'un select depuis une BDD
        String p[] = {"Badoit","Evian","Pepsi","Heineken","Jack Daniel's","Jus d'orange","Limonade"};

        productModels = initProducts(p);
        cartModel = new CartModel();

        // INIT VIEW
        cmbAddProduct.getItems().addAll(FXCollections.observableArrayList(productModels));
//        cmbAddProduct.getItems().addAll(productModels.search(""););
    }

    private ArrayList<ProductModel> initProducts(String productsList[]){
        ArrayList<ProductModel> productModelList = new ArrayList<>();

        int i = 0;
        for(String name:productsList){
            ProductModel p = new ProductModel(i++, name, 250);
            productModelList.add(p);
        }


        return productModelList;
    }
    // MÉTHODES PUBLIQUES


    // EVENT HANDLERS
    @FXML
    protected void cmbAddProductClick() {
        String s = cmbAddProduct.getValue().toString();

        // UPDATE MODEL
        cartModel.addProduct(s);

        // UPDATE VIEW
        Button btnToAdd = new Button();
        btnToAdd.setText(s);

        vbChart.getChildren().add(btnToAdd);
    }

    @FXML
    protected void btnPayClick() {

    }

    @FXML
    protected void btnEmptyCartClick() {
        // UPDATE MODEL
        cartModel.emptyCart();
        // UPDATE VIEW
        vbChart.getChildren().clear();
    }

}