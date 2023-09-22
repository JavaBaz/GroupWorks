package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("cw21-3/src/main/resources/jdbc.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");
        String driverClassName = properties.getProperty("jdbc.driverClassName");

        try {
            Class.forName(driverClassName);
            Connection connection = DriverManager.getConnection(url, username, password);

            // Now, you have a valid database connection (connection object)
            // You can perform database operations here

            // Remember to close the connection when done
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}