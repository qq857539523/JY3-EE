package neuedu.dao.utils;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DButils {
    private static Properties prop;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            prop = new Properties();
            prop.load(DButils.class.getResourceAsStream("/mysql.properties"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String URL = prop.getProperty("URL");
    private static final String USERNAME =prop.getProperty("USERNAME");
    private static final String PASSWORD=prop.getProperty("PASSWORD");



    public static Connection getConnection(){
        Connection conn = null;
        try {
            if (null == conn)  conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //关流
    public static void closeConnection(Connection conn){
        if (null != conn){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closePreparedStatement(PreparedStatement pst){
        if (null != pst){
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closeResultSet(ResultSet rst){
        if (null != rst){
            try {
                rst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
