package com.example.ban_hai_san.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnector {
    public Connection getConnection() throws Exception {
        String url = "jdbc:mysql://" + DBProperties.getDbHost() + ":" + DBProperties.getDbPort() + "/" + DBProperties.getDbName();
        String username = DBProperties.getUsername();
        String password = DBProperties.getPassword();

        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
}

