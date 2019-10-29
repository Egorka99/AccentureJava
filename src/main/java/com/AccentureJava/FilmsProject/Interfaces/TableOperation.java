package com.AccentureJava.FilmsProject.Interfaces;

import java.sql.SQLException;

public interface TableOperation {
    // Операции с таблицами
    boolean createTable() throws SQLException, ClassNotFoundException; // создание таблицы
}
