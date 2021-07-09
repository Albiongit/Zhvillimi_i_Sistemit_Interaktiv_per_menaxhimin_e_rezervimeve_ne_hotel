package Hoteli;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.*;

public class App extends Application {
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/login1.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Hoteli - FIEK Hotel");
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.sizeToScene();
        primaryStage.setMinWidth(scene.getWidth());
        primaryStage.setMinHeight(scene.getHeight());
    }


}

