package Hoteli.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import Hoteli.models.Invoice;
import Hoteli.Repository.InvoiceRepository;


import java.net.URL;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class InvoiceListController implements Initializable {
    //Connection conn

    @FXML
    private TableView<Invoice> tableView;

    @FXML
    private TableColumn<Invoice, Integer> invoiceColumn;

    @FXML
    private TableColumn<Invoice, Integer> reservationColumn;

    @FXML
    private TableColumn<Invoice, Double> amountColumn;

    @FXML
    private TableColumn<Invoice, Boolean> amount_paidColumn;

    @FXML
    private TableColumn<Invoice, Date> dateColumn;

    @FXML
    private TextField invoiceField;
    @FXML
    private TextField reservationField;
    @FXML
    private TextField amountField;
    @FXML
    private TextField amount_paidField;
    @FXML
    private DatePicker dateField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.invoiceColumn.setCellValueFactory(new PropertyValueFactory<>("InvoiceID"));
        this.reservationColumn.setCellValueFactory(new PropertyValueFactory<>("ReservationID"));
        this.amountColumn.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        this.amount_paidColumn.setCellValueFactory(new PropertyValueFactory<>("Amount_paid"));
        this.dateColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));

        //try{
          //  initDb();
        //ObservableList<Student> items=FXCollections.observableArrayList(getStudents());
        //tableView.setItems(items);
        //}catch(Exception ex){
            //ex.printStackTrace();
        //}

        //tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //tableView.getSelectionModel().selectedItemProperty().addListener((ov,old,_new) ->{
            //if(_new !=null ){
                //renderStudent(_new);
            //}
        //});
    }


    @FXML
    public void onCreateClick(ActionEvent ev) throws Exception {
        //String name=nameField.getText());
        //int year=Integer.parseInt(yearField.getText());

        //String sql =String.format("Insert INTO students(name,year) VALUES ('%s','%d');",name,year);

        //Statement statement=conn.createStatement();
        //int affectedRows=statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
        //if(affectedRows!=1) throw new Exception("ERR_MULTIPLE_ROWS_AFFECTED");
        //ResultSet resultSet=statement.getGeneratedKeys();
        //if(resultSet.next()){
          //  int id =resultSet.getInt(1);
            //Student s=new Student(id,name,year);
            //tableView.getItems().add(s);
            //tableView.refresh();

            //clearFields();
            //tableView.getSelectionModel().clearSelection();
        //}

    }

    @FXML
    public void onUpdateClick(ActionEvent ev) throws Exception {
        //String name=nameField.getText();
        //int year=Integer.parseInt(yearField.getText());

        //String sql="UPDATE students SET name=?,year=? WHERE id=?";
        //PreparedStatement statement=conn.prepareStatement(sql);
        //statement.setString(1,name);
        //statement.setInt(2,year);
        //statement.setInt(3,id);

        //int affectedRows=statement.executeUpdate();
        //if(affectedRows !=1) throw new Exception("ERR_MULTIPLE_ROWS_AFFECTED");

        //Student selected =tableView.getSelectionModel().getSelectedItem();
        //selected.setName(name);
        //selected.setYear(year);
        //tableView.refresh();
        //clearFields();


    }

    @FXML
    public void onDeleteClick(ActionEvent ev) throws Exception{


        //int id=Integer.parseInt(idField.getText());

        //String sql="DELETE FROM students WHERE id=?";
        //PreparedStatement statement=conn.prepareStatement(sql);
        //statement.setInt(1,id);
        //if(statement.executeUpdate() !=1){
            //throw new Exception("ERR_MULTIPLE_ROWS_AFFECTED");
        //}

        //Student selected=tableView.getSelectionModel().getSelectedItem();
        //tableView.getItems().remove(selected);
        //clearFields();

        //tableView.refresh();


    }

    //private void initDb() throws Exception{

    //conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/knk_test","root","1234");

    //}

    //private ArrayList<Student> getInvoices() throws  Exception{

      //  String sql="Select * from invoices";
        //Statement statement=conn.createStatement();

        //ResultSet resultSet =statement.executeQuery(sql);
        //ArrayList<Invoice> invoice =new ArrayList<>();
        //while(resultSet.next()){
          //  Invoice i=new Invoice()(
            //        resultSet.getInt("id"),
              //      resultSet.getString("name"),
                //    resultSet.getInt("year")
                  //  );
            //invoice.add(i);
        //}
        //return invoices;
 //   }

    //private void renderStudent(Student s ){
      //  idField.setText(Integer.toString(s.getId()));
       // nameField.setText(s.getName());
        //yearField.setText(Integer.toString(s.getYear()));
    //}

    private void clearFields(){
        //idField.clear();
        //nameField.clear();
        //yearField.clear();
        //tableView.getSelectionModel().clearSelection();
    }

}
