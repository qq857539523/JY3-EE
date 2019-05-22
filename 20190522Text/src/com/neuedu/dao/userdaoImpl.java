package com.neuedu.dao;

import com.neuedu.dataSource.DruidDataSource;
import com.neuedu.pojo.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class userdaoImpl implements userdao {
    private QueryRunner qr = null;
    private DruidDataSource dds = DruidDataSource.getDataSource();
    public userdaoImpl(){
        qr = new QueryRunner();
    }
    //查询
    @Override
    public List<User> getAllUser() {
        String sql = "SELECT * FROM myuser";
        List<User> li = null;
        Connection conn = dds.getConnection();
        try {
            li = qr.query(conn, sql, new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return li;
    }
    //添加
    @Override
    public void addUser(String username, String password) {
        String sql = "INSERT INTO myuser(username,password) VALUES (?,?)";
        Connection conn = null;
        try {
            conn = dds.getConnection();
//            int update = qr.update(conn, sql, username, password);
            qr.update(conn,sql,username,username);
//            System.out.println(update);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //删除
    @Override
    public void deleteUser(Integer  id) {
        String sql = "DELETE FROM myuser WHERE  id = ? ";
        Connection conn = null;
        try {
            conn = dds.getConnection();
            int update = qr.update(conn, sql,id);
            System.out.println(update);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //修改
    @Override
    public void updataUser(Integer id, String password) {
        String sql = "UPDATE myuser SET password = ? WHERE id = ?";
        Connection conn = null;
        try {
            conn = dds.getConnection();
            int update = qr.update(conn, sql, password, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
