package Hoteli.Controllers;

import Hoteli.components.ErrorPopupComponent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public static final String APP_VIEW="Invoice";
    public static final String RESERVATION_VIEW="reservation";
    public static final String EMPLOYEES_VIEW="employees";
    public static final String ABOUTUS_VIEW="aboutus";
    public static final String ROOM_VIEW="Room";

    private static final String VIEW_PATH="../views";

    @FXML
    private VBox contentPage;

    @FXML
    private Label statusLabel;


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
                contentPage.setAlignment(Pos.TOP_CENTER);
                break;
            case RESERVATION_VIEW:
                pane=loader.load();
                contentPage.setAlignment(Pos.TOP_CENTER);
                break;
            case EMPLOYEES_VIEW:
                pane=loader.load();
                contentPage.setAlignment(Pos.TOP_CENTER);
                break;
            case ABOUTUS_VIEW:
                pane=loader.load();
                contentPage.setAlignment(Pos.TOP_CENTER);
                break;
            case ROOM_VIEW:
                pane=loader.load();
                contentPage.setAlignment(Pos.TOP_CENTER);
                break;
            default:
                throw new Exception("ERR_VIEW_NOT_FOUND");
        }

        ChildController controller = loader.getController();
        controller.setParentController(this);




        contentPage.getChildren().clear();
        contentPage.getChildren().add(pane);
        VBox.setVgrow(pane, Priority.ALWAYS);
    }
    private String ViewPath(String view){

        return VIEW_PATH +"/"+view+".fxml";
    }

    @FXML
    public void onAboutNavClick(ActionEvent ev){
        try{
            this.setView(ABOUTUS_VIEW);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void onInvoicesNavClick(ActionEvent ev){
        try{
            this.setView(APP_VIEW);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    @FXML
    public void onEmployeesNavClick(ActionEvent ev){
        try{
            this.setView(EMPLOYEES_VIEW);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void onReservationNavClick(ActionEvent ev){
        try{
            this.setView(RESERVATION_VIEW);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void onRoomNavClick(ActionEvent ev){
        try{
            this.setView(ROOM_VIEW);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void onLogoutMenuClick(ActionEvent ev){

        try {
            Parent parent = FXMLLoader.load(getClass().getResource(ViewPath("login1")));
            Scene scene = new Scene(parent);

            Stage primaryStage = (Stage) statusLabel.getScene().getWindow();
            primaryStage.setScene(scene);

        } catch (Exception ex) {
            ErrorPopupComponent.show(ex);
        }
    }

    @FXML
    public void onInvoiceMenuClick(ActionEvent ev){
        try{
            this.setView(APP_VIEW);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void onReservationMenuClick(ActionEvent ev){
        try{
            this.setView(RESERVATION_VIEW);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void onAboutMenuClick(ActionEvent ev){
        try{
            this.setView(ABOUTUS_VIEW);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void onExitMenuClick(ActionEvent ev) {
        try {
            Stage primaryStage = (Stage) statusLabel.getScene().getWindow();
            primaryStage.close();
        } catch (Exception ex) {
            ErrorPopupComponent.show(ex);
        }
    }




}
