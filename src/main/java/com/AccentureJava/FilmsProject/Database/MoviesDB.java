package com.AccentureJava.FilmsProject.Database;

import javax.management.MBeanParameterInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MoviesDB {

    private static MoviesDB instance = null;

    //Notebook path
    //public static final String DB_URL = "jdbc:h2:/home/egor/Документы/GitHub/AccentureJava/db/filmDB";
    //PC path
    public static final String DB_URL = "jdbc:h2:/D:/java/AccentureJava/db/filmDB";
    public static final String DB_Driver = "org.h2.Driver";

    private Connection connection;

    private MoviesDB(){
    }

    public static MoviesDB getInstance() {
       if (instance == null) {
           instance = new MoviesDB();
       }
        return instance;
    }

    public void openConnection() throws SQLException,ClassNotFoundException {
        Class.forName(DB_Driver);
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(DB_URL);
        }
    }

    public Statement getStatement() throws SQLException {
        return connection.createStatement();
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
