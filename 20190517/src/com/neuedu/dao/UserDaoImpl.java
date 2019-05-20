package com.neuedu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static final String URL ="jdbc:mysql://localhost:3306/20190517";
    private static final String USERNAME ="root";
    private static final String PASSWORD="123456";

    @Override
    public void regsiter(String usm, String psw) {
        Connection conn = null;
        PreparedStatement pre = null;
        try{
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            String sql ="INSERT INTO myuser(UserName,Password) VALUES (?,?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1,usm);
            pre.setString(2,psw);
            pre.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            if (null != pre){
                try{
                    pre.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != conn){
                try{
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }





    }
}
