package com.AccentureJava.FilmsProject.View;


import com.AccentureJava.FilmsProject.Database.FilmTable;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLException;
import java.util.function.DoubleToIntFunction;

public class DatabaseApplication {
    public static void main(String[] args) {
        FilmTable filmTable = new FilmTable();
        try {
            filmTable.createTable();
            System.out.println("Таблица успешно создана!");
        }
        catch (SQLException ex) {
            System.err.println("Не удалось создать таблицу. Возможно,неправильно сформирован SQL запрос");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось создать таблицу. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }

        try {
            filmTable.addTestData();
            System.out.println("Фильмы успешно добавлены!");
        }
        catch (SQLException ex) {
            System.err.println("Не удалось добавить фильмы. Данные фильмы возможно уже добавлены");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось добавить фильмы. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }

        try {
            filmTable.addTestData();
            System.out.println("Фильмы успешно добавлены!");
        }
        catch (SQLException ex) {
            System.err.println("Не удалось добавить фильмы. Данные фильмы возможно уже добавлены");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось добавить фильмы. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }


    }
}
