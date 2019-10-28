package com.AccentureJava.FilmsProject.Interfaces;

import java.sql.SQLException;

public interface TableOperation {
    // Операции с таблицами
    public interface TableOperations {
        void createTable() throws SQLException; // создание таблицы
    }
}
