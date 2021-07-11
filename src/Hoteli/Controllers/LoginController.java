package Hoteli.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.Node;
import Hoteli.utils.SecurityHelper;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;
public class LoginController implements Initializable {
    @FXML
    private Button loginButton;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void onLoginButtonClick(ActionEvent e){
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../views/Home2.fxml"));
            Parent parent = loader.load();
            MainController controller = loader.getController();
            controller.setView(MainController.RESERVATION_VIEW);

            Stage primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene scene = new Scene(parent);
            primaryStage.setScene(scene);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
