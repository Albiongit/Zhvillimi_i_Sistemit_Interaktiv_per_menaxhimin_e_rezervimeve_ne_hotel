package Hoteli.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DbHelper {
    private static Connection conn= null;
    public static Connection getConnection () throws Exception{
        if (conn==null || conn.isClosed()){
            conn= DriverManager.getConnection(AppConfig.get().getConnectionString());
        }
        return conn;
    }

    public static void closeConnection () throws Exception{
        if(conn!=null && conn.isClosed()){
            conn.close();
        }
    }
    public static void migrate () throws Exception{
        String driverType= AppConfig.get().getDriverType();
        String autoIncFunc=driverType.equals("mysql")? "AUTO_INCREMENT" : "AUTOINCREMENT";

        ArrayList<String> queries = new ArrayList<>();

        Connection conn = getConnection();
        for(String sql: queries){
            conn.createStatement().executeUpdate(sql);

        }
    }
}
