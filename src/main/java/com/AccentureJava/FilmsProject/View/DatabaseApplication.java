package com.AccentureJava.FilmsProject.View;


import com.AccentureJava.FilmsProject.Database.FilmTable;
import com.AccentureJava.FilmsProject.Database.UserTable;
import com.AccentureJava.FilmsProject.Model.Film;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.function.DoubleToIntFunction;

public class DatabaseApplication {
    public static void main(String[] args) {

        UserTable userTable = new UserTable();

        try {
            userTable.createTable();
            System.out.println("Таблица пользователь успешно создана!");
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
            if (userTable.signUp("Egor","egorka99","qwerty123")) {
                System.out.println("Пользователь успешно зарегистрирован!");
            }
            else {
                System.out.println("Пользователь с таким логином уже существует");
            }
        }
        catch (SQLException ex) {
            System.err.println("Не удалось создать пользователя");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось создать пользователя. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }

        try {
            userTable.signIn("egorka99","qwerty123");
            System.out.println("Пользователь успешно авторизировался!");
        }
        catch (SQLException ex) {
            System.err.println("Не удалось создать пользователя");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось создать пользователя. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }


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
           for (Film film : filmTable.searchFilmByIdentifier("77164")) {
               ConsoleInfo.getFullInfo(film);
           }
        }
        catch (SQLException ex) {
            System.err.println("Не удалось найти фильм.");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось найти фильм. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }

        try {
            for (Film film : filmTable.searchFilmByTitle("The Shawshank Redemption")) {
                ConsoleInfo.getFullInfo(film);
            }
        }
        catch (SQLException ex) {
            System.err.println("Не удалось найти фильм.");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось найти фильм. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }

        try {
            for (Film film : filmTable.searchFilmByTitle("The Shawshank Redemption")) {
                ConsoleInfo.getFullInfo(film);
            }
        }
        catch (SQLException ex) {
            System.err.println("Не удалось найти фильм.");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось найти фильм. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }

        LocalDate date = LocalDate.of(2011,10,3);

        try {
            for (Film film : filmTable.searchFilmByReleaseDate(date)) {
                ConsoleInfo.getFullInfo(film);
            }
        }
        catch (SQLException ex) {
            System.err.println("Не удалось найти фильм.");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Не удалось найти фильм. Не найден драйвер для подключения к БД");
            ex.printStackTrace();
        }

    }
}
