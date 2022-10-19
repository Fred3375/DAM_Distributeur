module com.dam.dam_distributeur {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dam.dam_distributeur to javafx.fxml;
    exports com.dam.dam_distributeur;
}