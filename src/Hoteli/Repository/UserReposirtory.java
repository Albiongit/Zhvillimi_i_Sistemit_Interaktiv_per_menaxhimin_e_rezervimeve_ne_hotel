package Hoteli.Repository;

import Hoteli.models.User;
import Hoteli.utils.DbHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

class UserRepository {
    private static Connection dbConnection;

    private final static String host = "localhost";
    private final static String dbName = "Hotel";
    private final static String username = "root";
    private final static String password = "db123";

    public static Connection getConnection() {
        if(dbConnection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                dbConnection =
                        DriverManager.getConnection("jdbc:mysql://" + host+ "/" + dbName, username, password);

            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        return dbConnection;
    }

    public  static int Count() throws Exception{

//        Connenction conn= DbHelper.getConnection();
//        ResultSet res = conn.createStatement().executeQuery("SELECT COUNT * FROM USERS");
//        res.next();
        return 0;
    }
    public static List<User> getAll() throws Exception{
        ArrayList<User> list = new ArrayList<>();
        Connection conn= DbHelper.getConnection();
        ResultSet res=conn.createStatement().executeQuery("SELECT * FROM USERS");
        while (res.next()){
            list.add(parseResult(res));
        }
        return list;
    }
    public static  User find(int id) throws Exception{
        Connection conn = DbHelper.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECET * FROM USERS WHERE id= ? LIMIT 1");
        stmt.setInt(1,id);

        ResultSet res= stmt.executeQuery();
        if(!res.next()) return  null;
        return parseResult(res);

    }
    public static  User find(String email) throws Exception{
        Connection conn = DbHelper.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECET * FROM USERS WHERE email= ? LIMIT 1");
        stmt.setString(1,email);

        ResultSet res= stmt.executeQuery();
        if(!res.next()) return  null;
        return parseResult(res);

    }
    ///////////////////////////////////////////////////////////////////
    //User Admin1 = new User(1,"admin1","admin@gmail.com","1234","1234");
    //String query = "INSERT INTO users (1,admin1,admin@gmail.com,1234,1234)";
    //String query1 = "INSERT INTO users (2,admin2,admin@gmail.com,1234,1234)";
    //PreparedStatement stmt=DbHelper.getConnection().prepareStatement(query);
    //PreparedStatement stmt1=DbHelper.getConnection().prepareStatement(query1);

    private static User parseResult(ResultSet res)throws Exception{
        int id = res.getInt("id");
        String name = res.getString("name");
        String email= res.getString("email");
        String password= res.getString("password");
        String salt=res.getString("salt");

        return  new User(id,name,email,password,salt);
    }
}
