package com.example.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConstantUtil {
    static String jdbcURL = "jdbc:mysql://localhost:3306/demo_db";
    static String jdbcUsername = "linh";
    static String jdbcPassword = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
}
