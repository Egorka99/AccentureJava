package com.AccentureJava.FilmsProject.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseTable {
    protected MoviesDB database = MoviesDB.getInstance();
    protected String tableName;

    protected BaseTable(String tableName) {
        this.tableName = tableName;
    }

    protected boolean execute(String sql) throws SQLException {
        Statement statement = database.getStatement();
        boolean isExecute = statement.execute(sql);
        return isExecute;
    };
}
