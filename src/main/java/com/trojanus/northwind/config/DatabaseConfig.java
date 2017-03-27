package com.trojanus.northwind.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.Logger;

/**
 * Created by trojanus on 3/23/2017.
 */
public class DatabaseConfig {

    private Logger logger;

    private String user = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/northwind-example?useSSL=false";

    private Connection connection;

    public DatabaseConfig() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException cnfe) {
            logger.warn("Class not found::", cnfe);
            System.exit(1);
        }
    }

    public Connection getConnection() throws SQLException{
        if(connection == null) {
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }
}
