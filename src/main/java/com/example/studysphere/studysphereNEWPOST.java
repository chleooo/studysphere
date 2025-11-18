package com.example.studysphere;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class studysphereNEWPOST {

    @FXML private CheckBox checkNeedHelp;
    @FXML private CheckBox checkOfferHelp;

    @FXML private ComboBox<String> subjectComboBox;
    @FXML private ComboBox<String> topicComboBox;

    @FXML private TextArea descriptionField;

    @FXML private DatePicker schedule1;
    @FXML private DatePicker schedule2;
    @FXML private DatePicker schedule3;

    @FXML private Button btnPost;
    @FXML private Button btnCancel;

    @FXML
    void handlePostRequest() {
        System.out.println("Post button clicked!");
        System.out.println("Subject: " + subjectComboBox.getValue());
        System.out.println("Topic: " + topicComboBox.getValue());
        System.out.println("Description: " + descriptionField.getText());
    }

    @FXML
    void handleBackToPosts(MouseEvent event) {
        try {
            Parent page = FXMLLoader.load(getClass().getResource("studysphereposts.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(page));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
