package org.week08lab1.week8;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button B77L;

    @FXML
    private Button B77W;

    @FXML
    private Button B788;

    @FXML
    private Button B789;

    @FXML
    private Button A333;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void detailview(ActionEvent event) throws IOException {
        Button clickedButton = (Button) event.getSource();

        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("detail-view.fxml"));
        Parent root = loader.load();

        DetailController detailController = loader.getController();
        detailController.setButtonId(clickedButton.getId());
        Scene scene = new Scene(root);
        Stage stage = (Stage)
                clickedButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}