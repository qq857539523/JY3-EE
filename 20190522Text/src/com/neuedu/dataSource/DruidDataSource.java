package com.neuedu.dataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;


/**
 * 配置连接池
 */
public class DruidDataSource {
    private static Properties prep = new Properties();
    private static DruidDataSource ds = null;
    private DruidDataSource(){

    }
    //拿连接池
    public static DruidDataSource getDataSource(){
        if (null == ds){
            ds = new DruidDataSource();
        }
        return ds;
    }

    public Connection getConnection(){
        try {
            prep.load(DruidDataSource.class.getResourceAsStream("/mysql.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(prep);
            Connection connection = dataSource.getConnection();
            return connection;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }

    public static void main(String[] args) {
        DruidDataSource dataSource = DruidDataSource.getDataSource();
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
