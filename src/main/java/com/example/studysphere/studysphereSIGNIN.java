package com.example.studysphere;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class studysphereSIGNIN {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signInBtn;

    @FXML
    private Hyperlink signUpLink;

    // SIGN IN
    @FXML
    private void handleSignIn(javafx.event.ActionEvent event) throws IOException {
        // TODO: Add your validation here (optional)

        // Load POST PAGE
        FXMLLoader loader = new FXMLLoader(getClass().getResource("studyspherestudyfeed.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Your Posts");
        stage.show();
    }

    // SWITCH TO SIGNUP PAGE
    @FXML
    private void handleSignUp(javafx.event.ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("studyspheresignup.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}
