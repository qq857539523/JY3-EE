package neuedu.dao.dao;

import neuedu.dao.pojp.User;
import neuedu.dao.utils.DButils;

import java.sql.*;

public class UserDaoImpl implements UserDao{

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //实现注册
    @Override
    public void regsiter(String usm, String psw) {
        Connection conn = null;
        PreparedStatement pre = null;
        try{
            conn = DButils.getConnection();
            String sql ="INSERT INTO myuser(UserName,Password) VALUES (?,?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1,usm);
            pre.setString(2,psw);
            pre.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            DButils.closePreparedStatement(pre);
            DButils.closeConnection(conn);
        }





    }
    //实现登录
    @Override
    public User login(User user) {
        Connection connection = DButils.getConnection();
        ResultSet resultSet = null;
        PreparedStatement prep = null;
        String sql = "SELECT UserName,PassWprd FROM myuser WHERE username = ? AND password = ? ";
        try {
            prep = connection.prepareStatement(sql);
            prep.setString(1,user.getUsername());
            prep.setString(2,user.getPassword());
            resultSet = prep.executeQuery();
            if (null !=resultSet){
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButils.closeResultSet(resultSet);
            DButils.closePreparedStatement(prep);
            DButils.closeConnection(connection);
        }
        return null;
    }
}
