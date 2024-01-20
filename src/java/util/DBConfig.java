package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

    private static Connection conn = null;
    private static final String url = "jdbc:mysql://localhost:3306/fastfood_db";
    private static final String username = "root";
    private static final String password = "truong322";

    public static Connection getConnection() {
        if (conn != null) {
            // If there is a connection already, return it
            return conn;
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Use try-with-resources to manage resources
                conn = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }
    }
}
