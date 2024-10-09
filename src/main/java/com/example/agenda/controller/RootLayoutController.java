package com.example.agenda.controller;

import javafx.fxml.FXML;
import com.example.agenda.MainApp;

public class RootLayoutController {
    /**
     * Opens the birthday statistics.
     */
    @FXML
    private void handleShowBirthdayStatistics() {
        MainApp.showBirthdayStatistics();
    }
}
