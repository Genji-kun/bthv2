package com.mycompany.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        int a = 20;
        if (a % 2 == 0)
            App.setRoot("primary");
    }
}