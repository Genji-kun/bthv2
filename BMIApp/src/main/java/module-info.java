module com.mycompany.bmiapp2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bmiapp2 to javafx.fxml;
    exports com.mycompany.bmiapp2;
}
