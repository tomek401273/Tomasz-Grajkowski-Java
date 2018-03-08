package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbMenager {
    private Connection conn;
    private static DbMenager dbMenagerInstance;

    private DbMenager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "tomek");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_advanced?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);
    }

    public static DbMenager getInstance() throws SQLException {
        if (dbMenagerInstance == null) {
            dbMenagerInstance = new DbMenager();
        }
        return dbMenagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}