package com.example.studysphere;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.scene.Parent;

public class studysphereREGISTER {

    @FXML private TextField emailField;
    @FXML private TextField courseField;

    @FXML private ComboBox<String> yearLevelCombo;
    @FXML private ComboBox<String> subjectNeedCombo;
    @FXML private ComboBox<String> subjectTutorCombo;

    @FXML private DatePicker availableDatePicker;

    // Runs automatically when FXML loads
    @FXML
    public void initialize() {

        yearLevelCombo.getItems().addAll(
                "1st year", "2nd year", "3rd year", "4th year", "5th year"
        );

        subjectNeedCombo.getItems().addAll(
                "Art Appreciation",
                "Purposive Communication",
                "Science, Technology, and Society",
                "Ethics"
        );

        subjectTutorCombo.getItems().addAll(
                "Art Appreciation",
                "Purposive Communication",
                "Science, Technology, and Society",
                "Ethics"
        );
    }

    // COMPLETE SETUP → Go to profile.fxml
    @FXML
    public void handleCompleteSetup(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("profile.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void handleBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("studysphereprofile.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
