package com.mycompany.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        int a = 10;
        if (a > 0)
            App.setRoot("primary");
    }
}