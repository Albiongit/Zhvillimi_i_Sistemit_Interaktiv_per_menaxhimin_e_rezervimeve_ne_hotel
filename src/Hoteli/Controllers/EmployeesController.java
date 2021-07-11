package Hoteli.Controllers;

import Hoteli.models.Employees;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class EmployeesController extends ChildController {


    @FXML
    private TableView<Employees> tableView;
    @FXML
    private TableColumn<Employees, Integer> idColumn;

    @FXML
    private TableColumn<Employees, String> nameColumn;

    @FXML
    private TableColumn<Employees, String> lastnameColumn;

    @FXML
    private TableColumn<Employees, String> phoneColumn;
    @FXML
    private TableColumn<Employees, Integer> jobtimeColumn;
    @FXML
    private TableColumn<Employees, Integer> salaryColumn;

    // @FXML
    //  private Button addButton;
    // @FXML
    // private Button editButton;
    // @FXML
    // private Button deleteButton;
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField lastnameField;
    @FXML
    private TextField salaryField;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        this.idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
//        this.nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//        this.lastnameColumn.setCellValueFactory(new PropertyValueFactory<>("lastname"));
//        this.phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
//        this.jobtimeColumn.setCellValueFactory(new PropertyValueFactory<>("jobtime"));
//        this.salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));
//        tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //tableView.getSelectionModel().selectedItemProperty().addListener((ov, old, _new) -> {
          // if (_new != null)
               // setEmployeesToUI(_new);
        //
        //});
        /*try {
            initDb();
          // tableView.setItems(getEmployees());
        } catch (Exception e) {
            printError(e);
        }

         */
}

    private void printError(Exception e) {
    }

  /*  private ObservableList<Employees> getEmployees() {
        String sql="Select * from employees";
        //Statement statement=conn.createStatement();
       // ResultSet resultSet =statement.executeQuery(sql);
        ArrayList<Employees> employees =new ArrayList<>();
       // while(resultSet.next())
        {
          Employees i=new Employees()(
              // resultSet.getInt("id"),
            // resultSet.getString("name"),
          // resultSet.getString("lastname")
         );
        employees.add(i);
        }
       // return ;
    }*/

   // private void initDb() {
       // conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1/knk_test","root","1234");
  //  }

   // private void setEmployeesToUI(Employees aNew) {
   // }
    //@FXML
    /*public void onCreateClick(ActionEvent ev) throws Exception {
        String name=nameField.getText();
        String lastname=lastnameField.getText();
        int salary=Integer.parseInt(salaryField.getText());

        String sql =String.format("Insert INTO employees(name,lastname,salary) VALUES ('%s','%s',%d');",name,lastname,salary);

       Statement statement=conn.createStatement();
        int affectedRows=statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
        if(affectedRows!=1) throw new Exception("ERR_MULTIPLE_ROWS_AFFECTED");
        ResultSet resultSet=statement.getGeneratedKeys();
        if(resultSet.next()){
          int id =resultSet.getInt(1);
        Employees s=new Employees(id,name,lastname,salary);
        tableView.getItems().add(s);
        tableView.refresh();

        //clearFields();
        tableView.getSelectionModel().clearSelection();
        }

    }

    @FXML
    public void onUpdateClick(ActionEvent ev) throws Exception {
        String name=nameField.getText();
        String lastname=lastnameField.getText();
        int salary=Integer.parseInt(salaryField.getText());

        String sql="UPDATE employees SET name=?,lastname=?,salary=? WHERE id=?";
        PreparedStatement statement=conn.prepareStatement(sql);
        statement.setString(1,name);
        statement.setString(2,lastname);
        statement.setInt(3,salary);
        statement.setInt(4,id);

        int affectedRows=statement.executeUpdate();
        if(affectedRows !=1) throw new Exception("ERR_MULTIPLE_ROWS_AFFECTED");

        Employees selected =tableView.getSelectionModel().getSelectedItem();
        selected.setName(name);
        selected.setsalary(salary);
        tableView.refresh();
        //clearFields();


    }

    @FXML
    public void onDeleteClick(ActionEvent ev) throws Exception{


        int id=Integer.parseInt(idField.getText());

        String sql="DELETE FROM employees WHERE id=?";
        PreparedStatement statement=conn.prepareStatement(sql);
        statement.setInt(1,id);
        if(statement.executeUpdate() !=1){
        throw new Exception("ERR_MULTIPLE_ROWS_AFFECTED");
        }

        Employees selected=tableView.getSelectionModel().getSelectedItem();
        tableView.getItems().remove(selected);
        //clearFields();

        tableView.refresh();


    }
    private void renderEmployees(Employees e ){
         idField.setText(Integer.toString(e.getid()));
         nameField.setText(e.getName());
        lastnameField.setText(e.getLastname());
        salaryField.setText(Integer.toString(e.getsalary()));
        }

       // private void clearFields(){
          //  idField.clear();
          //  nameField.clear();
           // lastnameField.clear();
          //  salaryField.clear();
           // tableView.getSelectionModel().clearSelection();
      //  }
*/
    }