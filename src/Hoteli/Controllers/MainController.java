package Hoteli.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public static final String APP_VIEW="app";
    public static final String RESERVATION_VIEW="reservation";
    public static final String EMPLOYEES_VIEW="employees";
    public static final String ABOUTUS_VIEW="aboutus";

    private static final String VIEW_PATH="../views";

    @FXML
    private VBox contentPage;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setView(String view) throws Exception{

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource(this.ViewPath(view)));
        Pane pane =null;

        switch (view){
            case APP_VIEW:
                pane=loader.load();
                break;
            case RESERVATION_VIEW:
                pane=loader.load();
                break;
            case EMPLOYEES_VIEW:
                pane=loader.load();
                break;
            case ABOUTUS_VIEW:
                pane=loader.load();
                break;
            default:
                throw new Exception("ERR_VIEW_NOT_FOUND");
        }
        contentPage.getChildren().clear();
        contentPage.getChildren().add(pane);
        VBox.setVgrow(pane, Priority.ALWAYS);
    }
    private String ViewPath(String view){

        return VIEW_PATH +"/"+view+".fxml";
    }



//    private void onResButtonClick(ActionEvent e){
//        try {
//
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("../views/reservation.fxml"));
//            Parent parent = loader.load();
//            MainController controller = loader.getController();
//            controller.setView(MainController.RESERVATION_VIEW);
//
//            Stage primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
//            Scene scene = new Scene(parent);
//            primaryStage.setScene(scene);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
//
//
//    private void onInvoicesButtonClick(ActionEvent e){
//        try {
//
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("../views/Invoice.fxml"));
//            Parent parent = loader.load();
//            MainController controller = loader.getController();
//            controller.setView(MainController.RESERVATION_VIEW);
//
//            Stage primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
//            Scene scene = new Scene(parent);
//            primaryStage.setScene(scene);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
//
//
//    private void onAbtButtonClick(ActionEvent e){
//        try {
//
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("../views/aboutus.fxml"));
//            Parent parent = loader.load();
//            MainController controller = loader.getController();
//            controller.setView(MainController.RESERVATION_VIEW);
//
//            Stage primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
//            Scene scene = new Scene(parent);
//            primaryStage.setScene(scene);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
//
//
//    private void onEmployeesButtonClick(ActionEvent e){
//        try {
//
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("../views/employees.fxml"));
//            Parent parent = loader.load();
//            MainController controller = loader.getController();
//            controller.setView(MainController.RESERVATION_VIEW);
//
//            Stage primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
//            Scene scene = new Scene(parent);
//            primaryStage.setScene(scene);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
}
