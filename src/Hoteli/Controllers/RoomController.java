package Hoteli.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import Hoteli.models.Reservation;
import Hoteli.models.Room;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class RoomController extends ChildController {



    @FXML
    private TableView<Room> tableView;

    @FXML
    private TableColumn<Room,Integer> roomIDColumn;

    @FXML
    private TableColumn<Room, Integer> room_nrColumn;

    @FXML
    private TableColumn<Room, Integer> room_floorColumn;

    @FXML
    private TableColumn<Room, String> room_categoryColumn;

    @FXML
    private TableColumn<Room, Date> room_StatusColumn;

    @FXML
    private TextField roomIDField;
    @FXML
    private TextField room_nrField;
    @FXML
    private TextField room_floorField;
    @FXML
    private TextField room_categoryField;
    @FXML
    private TextField room_StatusField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        this.roomIDColumn.setCellValueFactory(new PropertyValueFactory<>("RoomID"));
//        this.room_nrColumn.setCellValueFactory(new PropertyValueFactory<>("Room_nr"));
//        this.room_floorColumn.setCellValueFactory(new PropertyValueFactory<>("Room_floor"));
//        this.room_categoryColumn.setCellValueFactory(new PropertyValueFactory<>("Room_category"));
//        this.room_StatusColumn.setCellValueFactory(new PropertyValueFactory<>("Room_Status"));

    }

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
