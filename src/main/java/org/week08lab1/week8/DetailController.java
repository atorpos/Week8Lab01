package org.week08lab1.week8;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class DetailController {

    @FXML
    private String buttonId;

    @FXML
    private Label planeModel;

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
        // You can use the buttonId as needed in the detail view
        System.out.println("Received buttonId in detail view: " + buttonId);
        String imagePath = buttonId + ".png";

        URL imageURL = getClass().getResource(imagePath);
        System.out.println("Received buttonId in detail view: " + imageURL);
        try {
            Image image = new Image(imageURL.toExternalForm());
            detailImageView.setImage(image);
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
            // Handle the exception as needed
        }

        switch (buttonId) {
            case "A333":
                planeModel.setText("Airbus 330-300");
                break;
            case "B77L":
                planeModel.setText("Boeing 777-200");
                break;
            case "B77W":
                planeModel.setText("Boeing 777-300");
                break;
            case "B788":
                planeModel.setText("Boeing 787-8");
                break;
            case "B789":
                planeModel.setText("Boeing 787-9");
                break;
            default:
                planeModel.setText("Not found");
        }
//        Image image = new Image("org/week08lab1/week8/A333.png");
//        detailImageView.setImage(image);
    }
    @FXML
    private ImageView detailImageView;

    @FXML
    private Button backbutton;

    @FXML
    private void handleBackButtonClick(ActionEvent event) throws IOException {
        System.out.println("button press");
        Button clickedButton = (Button) event.getSource();
        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage)
                clickedButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        // Handle back button click, e.g., navigate back to the previous view
        // You can use a similar approach as in your previous code to switch scenes
    }



}
