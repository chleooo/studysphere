package com.example.studysphere;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.scene.Parent;

public class studysphereSIGNUP {

    @FXML private TextField fullNameField;
    @FXML private TextField emailField;
    @FXML private TextField courseField;

    @FXML private ComboBox<String> yearLevelCombo;
    @FXML private ComboBox<String> subjectNeedCombo;
    @FXML private ComboBox<String> subjectTutorCombo;

    @FXML private DatePicker availableDatePicker;

    @FXML private Hyperlink signInLink;


    // RUNS AUTOMATICALLY AFTER FXML LOADS
    @FXML
    public void initialize() {

        // Year Level Combo
        yearLevelCombo.getItems().addAll(
                "1st year", "2nd year", "3rd year", "4th year"
        );

        // Subjects Needed
        subjectNeedCombo.getItems().addAll(
                "Art Appreciation",
                "Purposive Communication",
                "Science, Technology, and Society",
                "Ethics"
        );

        // Subjects You Can Tutor
        subjectTutorCombo.getItems().addAll(
                "Art Appreciation",
                "Purposive Communication",
                "Science, Technology, and Society",
                "Ethics"
        );

    }

    // CREATE ACCOUNT → StudyFeed.fxml
    @FXML
    public void handleCreateAccount(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("studyspherestudyfeed.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SIGN IN LINK → studyspheresignin.fxml
    @FXML
    public void goToSignIn(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("studyspheresignin.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
