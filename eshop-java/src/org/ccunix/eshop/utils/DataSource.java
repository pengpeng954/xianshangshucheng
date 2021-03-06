package org.ccunix.eshop.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    /*
     配置信息  自动读取c3p0.properties文件
    */
    /*
    * 获取Connection连接
    * @return
    * */
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
