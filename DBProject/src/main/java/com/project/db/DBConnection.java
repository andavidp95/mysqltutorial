package main.java.com.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    static String serverName = "localhost";
    static String portNumber = "3306";
    static String userName = "root";
    static String password = "ASFDGEW2,d";
    static String dbName = "project";

    public static Connection getConnection() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", userName);
        connectionProps.put("password", password);
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://" + serverName + ":" + portNumber + "/"+ dbName,
                connectionProps);
        System.out.println("Connected to database");
        return conn;
    }
}

