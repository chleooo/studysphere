package com.example.studysphere;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class studyspherePROFILE {

    @FXML
    private AnchorPane contentArea;

    @FXML
    public void openStudyFeed() {
        loadPage("studyspherestudyfeed.fxml");
    }

    @FXML
    public void openPosts() {
        loadPage("studysphereposts.fxml");
    }

    @FXML
    public void openMessages() {
        loadPage("studyspheremessages.fxml");
    }

    @FXML
    public void openNotifications() {
        loadPage("studyspherenotifications.fxml");
    }

    @FXML
    public void openProfile() {
        loadPage("studysphereprofile.fxml");
    }

    @FXML
    public void openCreatePost() {
        loadPage("studyspherenewpost.fxml");
    }


    @FXML
    public void openEditProfile() {
        loadPage("studysphereregister.fxml");
    }

    @FXML
    public void handleSignOut(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("studyspheresignin.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadPage(String fxmlFile) {
        try {
            Parent page = FXMLLoader.load(getClass().getResource(fxmlFile));
            contentArea.getChildren().clear();
            contentArea.getChildren().add(page);

            AnchorPane.setTopAnchor(page, 0.0);
            AnchorPane.setBottomAnchor(page, 0.0);
            AnchorPane.setLeftAnchor(page, 0.0);
            AnchorPane.setRightAnchor(page, 0.0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
