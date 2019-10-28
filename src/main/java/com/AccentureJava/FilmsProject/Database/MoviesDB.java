package com.AccentureJava.FilmsProject.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MoviesDB {

    private static MoviesDB instance = null;

    //Notebook path
    //public static final String DB_URL = "jdbc:h2:/home/egor/Документы/GitHub/AccentureJava/db/filmDB";
    //PC path
    public static final String DB_URL = "jdbc:h2:/D:/java/AccentureJava/db/filmDB";
    public static final String DB_Driver = "org.h2.Driver";

    private MoviesDB(){
    }

    public MoviesDB getInstance() {
       if (instance == null) {
           instance = new MoviesDB();
       }
        return instance;
    }

    public Connection getConnection() throws SQLException,ClassNotFoundException {
        Class.forName(DB_Driver);
        return DriverManager.getConnection(DB_URL);
    }

}
