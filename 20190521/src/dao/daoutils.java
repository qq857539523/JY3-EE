package dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class daoutils implements userdao {
    private static final String URL = "jdbc:mysql:///20190517";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //注册
    @Override
    public void register(String user, String psw) {
        Connection conn = null;
        PreparedStatement prep = null;
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            String sql = "INSERT INTO myuser(UserName,Password) VALUES (?,?)";
            prep = conn.prepareStatement(sql);
            prep.setString(1,user);
            prep.setString(2,psw);
            prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            if (null != prep){
                try {
                    prep.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != conn){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    //查看所有
    @Override
    public List<All> alls() {
        List<All> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement prep = null;
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            String sql = "SELECT * FORM myuser";
            prep = conn.prepareStatement(sql);
            ResultSet res = prep.executeQuery();
            while (res.next()){
                All all = new All();
                int anInt = res.getInt(1);
                String string = res.getString(2);
                String string1 = res.getString(3);
                all.setId(anInt);
                all.setPassWord(string);
                all.setUserName(string1);
                list.add(all);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null != prep){
                prep.close();}
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (null != conn){
                    conn.close();}
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }


}
